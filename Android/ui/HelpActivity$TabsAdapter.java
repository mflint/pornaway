.class public Lorg/pornaway/ui/HelpActivity$TabsAdapter;
.super Landroid/support/v4/app/FragmentPagerAdapter;
.source "HelpActivity.java"

# interfaces
.implements Lcom/actionbarsherlock/app/ActionBar$TabListener;
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/pornaway/ui/HelpActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "TabsAdapter"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/pornaway/ui/HelpActivity$TabsAdapter$TabInfo;
    }
.end annotation


# instance fields
.field private final mActionBar:Lcom/actionbarsherlock/app/ActionBar;

.field private final mContext:Landroid/content/Context;

.field private final mTabs:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lorg/pornaway/ui/HelpActivity$TabsAdapter$TabInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final mViewPager:Landroid/support/v4/view/ViewPager;


# direct methods
.method public constructor <init>(Lcom/actionbarsherlock/app/SherlockFragmentActivity;Landroid/support/v4/view/ViewPager;)V
    .registers 4
    .param p1, "activity"    # Lcom/actionbarsherlock/app/SherlockFragmentActivity;
    .param p2, "pager"    # Landroid/support/v4/view/ViewPager;

    .prologue
    .line 160
    invoke-virtual {p1}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/support/v4/app/FragmentPagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;)V

    .line 147
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/pornaway/ui/HelpActivity$TabsAdapter;->mTabs:Ljava/util/ArrayList;

    .line 161
    iput-object p1, p0, Lorg/pornaway/ui/HelpActivity$TabsAdapter;->mContext:Landroid/content/Context;

    .line 162
    invoke-virtual {p1}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;->getSupportActionBar()Lcom/actionbarsherlock/app/ActionBar;

    move-result-object v0

    iput-object v0, p0, Lorg/pornaway/ui/HelpActivity$TabsAdapter;->mActionBar:Lcom/actionbarsherlock/app/ActionBar;

    .line 163
    iput-object p2, p0, Lorg/pornaway/ui/HelpActivity$TabsAdapter;->mViewPager:Landroid/support/v4/view/ViewPager;

    .line 164
    iget-object v0, p0, Lorg/pornaway/ui/HelpActivity$TabsAdapter;->mViewPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, p0}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 165
    iget-object v0, p0, Lorg/pornaway/ui/HelpActivity$TabsAdapter;->mViewPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, p0}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 166
    return-void
.end method


# virtual methods
.method public addTab(Lcom/actionbarsherlock/app/ActionBar$Tab;Ljava/lang/Class;Landroid/os/Bundle;)V
    .registers 6
    .param p1, "tab"    # Lcom/actionbarsherlock/app/ActionBar$Tab;
    .param p3, "args"    # Landroid/os/Bundle;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/actionbarsherlock/app/ActionBar$Tab;",
            "Ljava/lang/Class",
            "<*>;",
            "Landroid/os/Bundle;",
            ")V"
        }
    .end annotation

    .prologue
    .line 169
    .local p2, "clss":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    new-instance v0, Lorg/pornaway/ui/HelpActivity$TabsAdapter$TabInfo;

    invoke-direct {v0, p2, p3}, Lorg/pornaway/ui/HelpActivity$TabsAdapter$TabInfo;-><init>(Ljava/lang/Class;Landroid/os/Bundle;)V

    .line 170
    .local v0, "info":Lorg/pornaway/ui/HelpActivity$TabsAdapter$TabInfo;
    invoke-virtual {p1, v0}, Lcom/actionbarsherlock/app/ActionBar$Tab;->setTag(Ljava/lang/Object;)Lcom/actionbarsherlock/app/ActionBar$Tab;

    .line 171
    invoke-virtual {p1, p0}, Lcom/actionbarsherlock/app/ActionBar$Tab;->setTabListener(Lcom/actionbarsherlock/app/ActionBar$TabListener;)Lcom/actionbarsherlock/app/ActionBar$Tab;

    .line 172
    iget-object v1, p0, Lorg/pornaway/ui/HelpActivity$TabsAdapter;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 173
    iget-object v1, p0, Lorg/pornaway/ui/HelpActivity$TabsAdapter;->mActionBar:Lcom/actionbarsherlock/app/ActionBar;

    invoke-virtual {v1, p1}, Lcom/actionbarsherlock/app/ActionBar;->addTab(Lcom/actionbarsherlock/app/ActionBar$Tab;)V

    .line 174
    invoke-virtual {p0}, Lorg/pornaway/ui/HelpActivity$TabsAdapter;->notifyDataSetChanged()V

    .line 175
    return-void
.end method

.method public getCount()I
    .registers 2

    .prologue
    .line 179
    iget-object v0, p0, Lorg/pornaway/ui/HelpActivity$TabsAdapter;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Landroid/support/v4/app/Fragment;
    .registers 6
    .param p1, "position"    # I

    .prologue
    .line 184
    iget-object v1, p0, Lorg/pornaway/ui/HelpActivity$TabsAdapter;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/pornaway/ui/HelpActivity$TabsAdapter$TabInfo;

    .line 185
    .local v0, "info":Lorg/pornaway/ui/HelpActivity$TabsAdapter$TabInfo;
    iget-object v1, p0, Lorg/pornaway/ui/HelpActivity$TabsAdapter;->mContext:Landroid/content/Context;

    # getter for: Lorg/pornaway/ui/HelpActivity$TabsAdapter$TabInfo;->clss:Ljava/lang/Class;
    invoke-static {v0}, Lorg/pornaway/ui/HelpActivity$TabsAdapter$TabInfo;->access$000(Lorg/pornaway/ui/HelpActivity$TabsAdapter$TabInfo;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    # getter for: Lorg/pornaway/ui/HelpActivity$TabsAdapter$TabInfo;->args:Landroid/os/Bundle;
    invoke-static {v0}, Lorg/pornaway/ui/HelpActivity$TabsAdapter$TabInfo;->access$100(Lorg/pornaway/ui/HelpActivity$TabsAdapter$TabInfo;)Landroid/os/Bundle;

    move-result-object v3

    invoke-static {v1, v2, v3}, Landroid/support/v4/app/Fragment;->instantiate(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/support/v4/app/Fragment;

    move-result-object v1

    return-object v1
.end method

.method public onPageScrollStateChanged(I)V
    .registers 2
    .param p1, "state"    # I

    .prologue
    .line 196
    return-void
.end method

.method public onPageScrolled(IFI)V
    .registers 4
    .param p1, "position"    # I
    .param p2, "positionOffset"    # F
    .param p3, "positionOffsetPixels"    # I

    .prologue
    .line 189
    return-void
.end method

.method public onPageSelected(I)V
    .registers 3
    .param p1, "position"    # I

    .prologue
    .line 192
    iget-object v0, p0, Lorg/pornaway/ui/HelpActivity$TabsAdapter;->mActionBar:Lcom/actionbarsherlock/app/ActionBar;

    invoke-virtual {v0, p1}, Lcom/actionbarsherlock/app/ActionBar;->setSelectedNavigationItem(I)V

    .line 193
    return-void
.end method

.method public onTabReselected(Lcom/actionbarsherlock/app/ActionBar$Tab;Landroid/support/v4/app/FragmentTransaction;)V
    .registers 3
    .param p1, "tab"    # Lcom/actionbarsherlock/app/ActionBar$Tab;
    .param p2, "ft"    # Landroid/support/v4/app/FragmentTransaction;

    .prologue
    .line 211
    return-void
.end method

.method public onTabSelected(Lcom/actionbarsherlock/app/ActionBar$Tab;Landroid/support/v4/app/FragmentTransaction;)V
    .registers 6
    .param p1, "tab"    # Lcom/actionbarsherlock/app/ActionBar$Tab;
    .param p2, "ft"    # Landroid/support/v4/app/FragmentTransaction;

    .prologue
    .line 199
    invoke-virtual {p1}, Lcom/actionbarsherlock/app/ActionBar$Tab;->getTag()Ljava/lang/Object;

    move-result-object v1

    .line 200
    .local v1, "tag":Ljava/lang/Object;
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_5
    iget-object v2, p0, Lorg/pornaway/ui/HelpActivity$TabsAdapter;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_1d

    .line 201
    iget-object v2, p0, Lorg/pornaway/ui/HelpActivity$TabsAdapter;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_1a

    .line 202
    iget-object v2, p0, Lorg/pornaway/ui/HelpActivity$TabsAdapter;->mViewPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v2, v0}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 200
    :cond_1a
    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    .line 205
    :cond_1d
    return-void
.end method

.method public onTabUnselected(Lcom/actionbarsherlock/app/ActionBar$Tab;Landroid/support/v4/app/FragmentTransaction;)V
    .registers 3
    .param p1, "tab"    # Lcom/actionbarsherlock/app/ActionBar$Tab;
    .param p2, "ft"    # Landroid/support/v4/app/FragmentTransaction;

    .prologue
    .line 208
    return-void
.end method
