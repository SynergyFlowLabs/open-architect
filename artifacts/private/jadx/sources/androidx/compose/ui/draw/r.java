package androidx.compose.ui.draw;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class r implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final r f37307a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f37308b = n0.n.f332724b.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.unit.w f37309c = androidx.compose.ui.unit.w.Ltr;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.unit.d f37310d = androidx.compose.ui.unit.f.a(1.0f, 1.0f);

    private r() {
    }

    @Override // androidx.compose.ui.draw.f
    public long d() {
        return f37308b;
    }

    @Override // androidx.compose.ui.draw.f
    @NotNull
    public androidx.compose.ui.unit.d getDensity() {
        return f37310d;
    }

    @Override // androidx.compose.ui.draw.f
    @NotNull
    public androidx.compose.ui.unit.w getLayoutDirection() {
        return f37309c;
    }
}
