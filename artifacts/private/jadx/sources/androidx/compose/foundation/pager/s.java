package androidx.compose.foundation.pager;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class s implements androidx.compose.foundation.gestures.m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final i1 f18427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.gestures.m0 f18428c;

    public s(@NotNull i1 i1Var, @NotNull androidx.compose.foundation.gestures.m0 m0Var) {
        this.f18427b = i1Var;
        this.f18428c = m0Var;
    }

    private final float f(float f10) {
        float fI = this.f18427b.I() * (-1);
        while (f10 > 0.0f && fI < f10) {
            fI += this.f18427b.X();
        }
        while (f10 < 0.0f && fI > f10) {
            fI -= this.f18427b.X();
        }
        return fI;
    }

    @Override // androidx.compose.foundation.gestures.m0
    public float b(float f10, float f11, float f12) {
        float fB = this.f18428c.b(f10, f11, f12);
        int i10 = 4 << 0;
        boolean z10 = false;
        if (f10 > 0.0f) {
            if (f10 + f11 > f12) {
                z10 = true;
            }
        } else if (f10 + f11 <= 0.0f) {
            z10 = true;
        }
        if (Math.abs(fB) != 0.0f && z10) {
            return f(fB);
        }
        if (Math.abs(this.f18427b.I()) < 1.0E-6d) {
            return 0.0f;
        }
        float fI = this.f18427b.I() * (-1.0f);
        if (this.f18427b.j()) {
            fI += this.f18427b.X();
        }
        return kotlin.ranges.r.H(fI, -f12, f12);
    }

    @NotNull
    public final androidx.compose.foundation.gestures.m0 d() {
        return this.f18428c;
    }

    @NotNull
    public final i1 e() {
        return this.f18427b;
    }
}
