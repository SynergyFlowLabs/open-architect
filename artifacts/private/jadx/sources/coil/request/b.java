package coil.request;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public enum b {
    ENABLED(true, true),
    READ_ONLY(true, false),
    WRITE_ONLY(false, true),
    DISABLED(false, false);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f87613h = kotlin.enums.c.c(k());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f87614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f87615b;

    b(boolean z10, boolean z11) {
        this.f87614a = z10;
        this.f87615b = z11;
    }

    @NotNull
    public static kotlin.enums.a<b> l() {
        return f87613h;
    }

    public final boolean n() {
        return this.f87614a;
    }

    public final boolean o() {
        return this.f87615b;
    }
}
