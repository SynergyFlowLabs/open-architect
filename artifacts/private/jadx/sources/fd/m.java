package fd;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public enum m {
    AnonymousPurchase("anonymous_purchase"),
    AnonymousPurchaseRenders("anonymous_purchase_snapshot");


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f275191e = kotlin.enums.c.c(k());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f275192a;

    m(String str) {
        this.f275192a = str;
    }

    @NotNull
    public static kotlin.enums.a<m> l() {
        return f275191e;
    }

    @NotNull
    public final String n() {
        return this.f275192a;
    }
}
