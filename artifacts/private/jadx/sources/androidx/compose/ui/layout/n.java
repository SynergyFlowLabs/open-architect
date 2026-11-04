package androidx.compose.ui.layout;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class n implements z0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f39422d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final y f39423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final a0 f39424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final b0 f39425c;

    public n(@NotNull y yVar, @NotNull a0 a0Var, @NotNull b0 b0Var) {
        this.f39423a = yVar;
        this.f39424b = a0Var;
        this.f39425c = b0Var;
    }

    @Override // androidx.compose.ui.layout.y
    public int D0(int i10) {
        return this.f39423a.D0(i10);
    }

    @Override // androidx.compose.ui.layout.y
    public int L0(int i10) {
        return this.f39423a.L0(i10);
    }

    @Override // androidx.compose.ui.layout.y
    public int M0(int i10) {
        return this.f39423a.M0(i10);
    }

    @Override // androidx.compose.ui.layout.z0
    @NotNull
    public i2 P0(long j10) {
        if (this.f39425c == b0.Width) {
            return new q(this.f39424b == a0.Max ? this.f39423a.M0(androidx.compose.ui.unit.b.o(j10)) : this.f39423a.L0(androidx.compose.ui.unit.b.o(j10)), androidx.compose.ui.unit.b.i(j10) ? androidx.compose.ui.unit.b.o(j10) : 32767);
        }
        return new q(androidx.compose.ui.unit.b.j(j10) ? androidx.compose.ui.unit.b.p(j10) : 32767, this.f39424b == a0.Max ? this.f39423a.p0(androidx.compose.ui.unit.b.p(j10)) : this.f39423a.D0(androidx.compose.ui.unit.b.p(j10)));
    }

    @NotNull
    public final y a() {
        return this.f39423a;
    }

    @Override // androidx.compose.ui.layout.y
    @Nullable
    public Object c() {
        return this.f39423a.c();
    }

    @Override // androidx.compose.ui.layout.y
    public int p0(int i10) {
        return this.f39423a.p0(i10);
    }
}
