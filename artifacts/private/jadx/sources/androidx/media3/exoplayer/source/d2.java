package androidx.media3.exoplayer.source;

import androidx.media3.common.z3;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class d2 extends b0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.media3.common.k0 f64962f;

    public d2(z3 z3Var, androidx.media3.common.k0 k0Var) {
        super(z3Var);
        this.f64962f = k0Var;
    }

    @Override // androidx.media3.exoplayer.source.b0, androidx.media3.common.z3
    public z3.d u(int i10, z3.d dVar, long j10) {
        super.u(i10, dVar, j10);
        androidx.media3.common.k0 k0Var = this.f64962f;
        dVar.f61990c = k0Var;
        androidx.media3.common.k0.h hVar = k0Var.f60822b;
        dVar.f61989b = hVar != null ? hVar.f60928i : null;
        return dVar;
    }
}
