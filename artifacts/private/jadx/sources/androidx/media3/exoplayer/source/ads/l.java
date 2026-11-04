package androidx.media3.exoplayer.source.ads;

import androidx.annotation.l1;
import androidx.media3.common.util.b1;
import androidx.media3.common.z3;
import androidx.media3.exoplayer.source.b0;

/* JADX INFO: loaded from: classes3.dex */
@b1
@l1(otherwise = 3)
public final class l extends b0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.media3.common.b f64828f;

    public l(z3 z3Var, androidx.media3.common.b bVar) {
        super(z3Var);
        androidx.media3.common.util.a.i(z3Var.m() == 1);
        androidx.media3.common.util.a.i(z3Var.v() == 1);
        this.f64828f = bVar;
    }

    @Override // androidx.media3.exoplayer.source.b0, androidx.media3.common.z3
    public z3.b k(int i10, z3.b bVar, boolean z10) {
        this.f64829e.k(i10, bVar, z10);
        long j10 = bVar.f61970d;
        if (j10 == -9223372036854775807L) {
            j10 = this.f64828f.f60425d;
        }
        bVar.w(bVar.f61967a, bVar.f61968b, bVar.f61969c, j10, bVar.q(), this.f64828f, bVar.f61972f);
        return bVar;
    }
}
