.class public Lorg/pornaway/ui/TcpdumpLogFragment;
.super Lcom/actionbarsherlock/app/SherlockListFragment;
.source "TcpdumpLogFragment.java"

# interfaces
.implements Landroid/support/v4/app/LoaderManager$LoaderCallbacks;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/actionbarsherlock/app/SherlockListFragment;",
        "Landroid/support/v4/app/LoaderManager$LoaderCallbacks",
        "<",
        "Ljava/util/ArrayList",
        "<",
        "Ljava/lang/String;",
        ">;>;"
    }
.end annotation


# instance fields
.field private mActivity:Landroid/app/Activity;

.field private mAdapter:Landroid/widget/ArrayAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/widget/ArrayAdapter",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 1

    .prologue
    .line 47
    invoke-direct {p0}, Lcom/actionbarsherlock/app/SherlockListFragment;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/os/Bundle;)V
    .registers 7
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    const/4 v4, 0x0

    .line 108
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockListFragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 110
    invoke-virtual {p0}, Lorg/pornaway/ui/TcpdumpLogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iput-object v1, p0, Lorg/pornaway/ui/TcpdumpLogFragment;->mActivity:Landroid/app/Activity;

    .line 113
    invoke-virtual {p0}, Lorg/pornaway/ui/TcpdumpLogFragment;->getListView()Landroid/widget/ListView;

    move-result-object v1

    invoke-virtual {p0, v1}, Lorg/pornaway/ui/TcpdumpLogFragment;->registerForContextMenu(Landroid/view/View;)V

    .line 117
    iget-object v1, p0, Lorg/pornaway/ui/TcpdumpLogFragment;->mActivity:Landroid/app/Activity;

    const v2, 0x7f08009c

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lorg/pornaway/ui/TcpdumpLogFragment;->setEmptyText(Ljava/lang/CharSequence;)V

    .line 120
    new-array v0, v4, [Ljava/lang/String;

    .line 121
    .local v0, "values":[Ljava/lang/String;
    new-instance v1, Landroid/widget/ArrayAdapter;

    iget-object v2, p0, Lorg/pornaway/ui/TcpdumpLogFragment;->mActivity:Landroid/app/Activity;

    const v3, 0x1090003

    invoke-direct {v1, v2, v3, v0}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    iput-object v1, p0, Lorg/pornaway/ui/TcpdumpLogFragment;->mAdapter:Landroid/widget/ArrayAdapter;

    .line 122
    iget-object v1, p0, Lorg/pornaway/ui/TcpdumpLogFragment;->mAdapter:Landroid/widget/ArrayAdapter;

    invoke-virtual {p0, v1}, Lorg/pornaway/ui/TcpdumpLogFragment;->setListAdapter(Landroid/widget/ListAdapter;)V

    .line 125
    invoke-virtual {p0, v4}, Lorg/pornaway/ui/TcpdumpLogFragment;->setListShown(Z)V

    .line 129
    invoke-virtual {p0}, Lorg/pornaway/ui/TcpdumpLogFragment;->getLoaderManager()Landroid/support/v4/app/LoaderManager;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v4, v2, p0}, Landroid/support/v4/app/LoaderManager;->initLoader(ILandroid/os/Bundle;Landroid/support/v4/app/LoaderManager$LoaderCallbacks;)Landroid/support/v4/content/Loader;

    .line 130
    return-void
.end method

.method public onContextItemSelected(Landroid/view/MenuItem;)Z
    .registers 11
    .param p1, "item"    # Landroid/view/MenuItem;

    .prologue
    const/4 v8, 0x0

    const/4 v5, 0x1

    .line 76
    invoke-interface {p1}, Landroid/view/MenuItem;->getMenuInfo()Landroid/view/ContextMenu$ContextMenuInfo;

    move-result-object v2

    check-cast v2, Landroid/widget/AdapterView$AdapterContextMenuInfo;

    .line 78
    .local v2, "info":Landroid/widget/AdapterView$AdapterContextMenuInfo;
    iget-object v6, p0, Lorg/pornaway/ui/TcpdumpLogFragment;->mAdapter:Landroid/widget/ArrayAdapter;

    iget v7, v2, Landroid/widget/AdapterView$AdapterContextMenuInfo;->position:I

    invoke-virtual {v6, v7}, Landroid/widget/ArrayAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 80
    .local v0, "hostname":Ljava/lang/String;
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v6

    packed-switch v6, :pswitch_data_68

    .line 99
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockListFragment;->onContextItemSelected(Landroid/view/MenuItem;)Z

    move-result v5

    :goto_1d
    return v5

    .line 82
    :pswitch_1e
    iget-object v6, p0, Lorg/pornaway/ui/TcpdumpLogFragment;->mActivity:Landroid/app/Activity;

    invoke-static {v6, v0}, Lorg/pornaway/provider/ProviderHelper;->insertBlacklistItem(Landroid/content/Context;Ljava/lang/String;)V

    .line 83
    iget-object v6, p0, Lorg/pornaway/ui/TcpdumpLogFragment;->mActivity:Landroid/app/Activity;

    const v7, 0x7f08009e

    invoke-static {v6, v7, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v3

    .line 85
    .local v3, "toastBlacklist":Landroid/widget/Toast;
    invoke-virtual {v3}, Landroid/widget/Toast;->show()V

    goto :goto_1d

    .line 88
    .end local v3    # "toastBlacklist":Landroid/widget/Toast;
    :pswitch_30
    iget-object v6, p0, Lorg/pornaway/ui/TcpdumpLogFragment;->mActivity:Landroid/app/Activity;

    invoke-static {v6, v0}, Lorg/pornaway/provider/ProviderHelper;->insertWhitelistItem(Landroid/content/Context;Ljava/lang/String;)V

    .line 89
    iget-object v6, p0, Lorg/pornaway/ui/TcpdumpLogFragment;->mActivity:Landroid/app/Activity;

    const v7, 0x7f08009f

    invoke-static {v6, v7, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v4

    .line 91
    .local v4, "toastWhitelist":Landroid/widget/Toast;
    invoke-virtual {v4}, Landroid/widget/Toast;->show()V

    goto :goto_1d

    .line 94
    .end local v4    # "toastWhitelist":Landroid/widget/Toast;
    :pswitch_42
    new-instance v1, Landroid/content/Intent;

    const-string v6, "android.intent.action.VIEW"

    invoke-direct {v1, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 95
    .local v1, "i":Landroid/content/Intent;
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "http://"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 96
    invoke-virtual {p0, v1}, Lorg/pornaway/ui/TcpdumpLogFragment;->startActivity(Landroid/content/Intent;)V

    goto :goto_1d

    .line 80
    nop

    :pswitch_data_68
    .packed-switch 0x7f0e0071
        :pswitch_1e
        :pswitch_30
        :pswitch_42
    .end packed-switch
.end method

.method public onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .registers 9
    .param p1, "menu"    # Landroid/view/ContextMenu;
    .param p2, "v"    # Landroid/view/View;
    .param p3, "menuInfo"    # Landroid/view/ContextMenu$ContextMenuInfo;

    .prologue
    .line 57
    invoke-super {p0, p1, p2, p3}, Lcom/actionbarsherlock/app/SherlockListFragment;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    move-object v2, p3

    .line 60
    check-cast v2, Landroid/widget/AdapterView$AdapterContextMenuInfo;

    .line 63
    .local v2, "info":Landroid/widget/AdapterView$AdapterContextMenuInfo;
    iget-object v3, p0, Lorg/pornaway/ui/TcpdumpLogFragment;->mAdapter:Landroid/widget/ArrayAdapter;

    iget v4, v2, Landroid/widget/AdapterView$AdapterContextMenuInfo;->position:I

    invoke-virtual {v3, v4}, Landroid/widget/ArrayAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 65
    .local v0, "hostname":Ljava/lang/String;
    iget-object v3, p0, Lorg/pornaway/ui/TcpdumpLogFragment;->mActivity:Landroid/app/Activity;

    .line 66
    invoke-virtual {v3}, Landroid/app/Activity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v1

    .line 67
    .local v1, "inflater":Landroid/view/MenuInflater;
    invoke-interface {p1, v0}, Landroid/view/ContextMenu;->setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/ContextMenu;

    .line 68
    const v3, 0x7f0f0005

    invoke-virtual {v1, v3, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 69
    return-void
.end method

.method public onCreateLoader(ILandroid/os/Bundle;)Landroid/support/v4/content/Loader;
    .registers 5
    .param p1, "id"    # I
    .param p2, "args"    # Landroid/os/Bundle;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroid/os/Bundle;",
            ")",
            "Landroid/support/v4/content/Loader",
            "<",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 134
    new-instance v0, Lorg/pornaway/util/TcpdumpLogLoader;

    iget-object v1, p0, Lorg/pornaway/ui/TcpdumpLogFragment;->mActivity:Landroid/app/Activity;

    invoke-direct {v0, v1}, Lorg/pornaway/util/TcpdumpLogLoader;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public bridge synthetic onLoadFinished(Landroid/support/v4/content/Loader;Ljava/lang/Object;)V
    .registers 3

    .prologue
    .line 47
    check-cast p2, Ljava/util/ArrayList;

    invoke-virtual {p0, p1, p2}, Lorg/pornaway/ui/TcpdumpLogFragment;->onLoadFinished(Landroid/support/v4/content/Loader;Ljava/util/ArrayList;)V

    return-void
.end method

.method public onLoadFinished(Landroid/support/v4/content/Loader;Ljava/util/ArrayList;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/content/Loader",
            "<",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;>;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p1, "loader":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<Ljava/util/ArrayList<Ljava/lang/String;>;>;"
    .local p2, "data":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    const/4 v3, 0x1

    .line 143
    const-string v0, "PornAway"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "data: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/pornaway/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    new-instance v0, Landroid/widget/ArrayAdapter;

    iget-object v1, p0, Lorg/pornaway/ui/TcpdumpLogFragment;->mActivity:Landroid/app/Activity;

    const v2, 0x1090003

    invoke-direct {v0, v1, v2, p2}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    iput-object v0, p0, Lorg/pornaway/ui/TcpdumpLogFragment;->mAdapter:Landroid/widget/ArrayAdapter;

    .line 148
    iget-object v0, p0, Lorg/pornaway/ui/TcpdumpLogFragment;->mAdapter:Landroid/widget/ArrayAdapter;

    invoke-virtual {v0}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V

    .line 149
    iget-object v0, p0, Lorg/pornaway/ui/TcpdumpLogFragment;->mAdapter:Landroid/widget/ArrayAdapter;

    invoke-virtual {p0, v0}, Lorg/pornaway/ui/TcpdumpLogFragment;->setListAdapter(Landroid/widget/ListAdapter;)V

    .line 152
    invoke-virtual {p0}, Lorg/pornaway/ui/TcpdumpLogFragment;->isResumed()Z

    move-result v0

    if-eqz v0, :cond_39

    .line 153
    invoke-virtual {p0, v3}, Lorg/pornaway/ui/TcpdumpLogFragment;->setListShown(Z)V

    .line 157
    :goto_38
    return-void

    .line 155
    :cond_39
    invoke-virtual {p0, v3}, Lorg/pornaway/ui/TcpdumpLogFragment;->setListShownNoAnimation(Z)V

    goto :goto_38
.end method

.method public onLoaderReset(Landroid/support/v4/content/Loader;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/content/Loader",
            "<",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    .prologue
    .line 162
    .local p1, "loader":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<Ljava/util/ArrayList<Ljava/lang/String;>;>;"
    iget-object v0, p0, Lorg/pornaway/ui/TcpdumpLogFragment;->mAdapter:Landroid/widget/ArrayAdapter;

    invoke-virtual {v0}, Landroid/widget/ArrayAdapter;->clear()V

    .line 163
    return-void
.end method
