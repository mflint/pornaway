.class Lorg/pornaway/ui/HostsSourcesFragment$5;
.super Ljava/lang/Object;
.source "HostsSourcesFragment.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/pornaway/ui/HostsSourcesFragment;->addEntry(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/pornaway/ui/HostsSourcesFragment;


# direct methods
.method constructor <init>(Lorg/pornaway/ui/HostsSourcesFragment;)V
    .registers 2
    .param p1, "this$0"    # Lorg/pornaway/ui/HostsSourcesFragment;

    .prologue
    .line 288
    iput-object p1, p0, Lorg/pornaway/ui/HostsSourcesFragment$5;->this$0:Lorg/pornaway/ui/HostsSourcesFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .registers 3
    .param p1, "dlg"    # Landroid/content/DialogInterface;
    .param p2, "sum"    # I

    .prologue
    .line 290
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 291
    return-void
.end method
