package androidx.media2.exoplayer.external.source;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public class i implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final w0[] f56226a;

    public i(w0[] loaders) {
        this.f56226a = loaders;
    }

    @Override // androidx.media2.exoplayer.external.source.w0
    public final long b() {
        long jMin = Long.MAX_VALUE;
        for (w0 w0Var : this.f56226a) {
            long jB = w0Var.b();
            if (jB != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jB);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // androidx.media2.exoplayer.external.source.w0
    public final void c(long positionUs) {
        for (w0 w0Var : this.f56226a) {
            w0Var.c(positionUs);
        }
    }

    @Override // androidx.media2.exoplayer.external.source.w0
    public final long e() {
        long jMin = Long.MAX_VALUE;
        for (w0 w0Var : this.f56226a) {
            long jE = w0Var.e();
            if (jE != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jE);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // androidx.media2.exoplayer.external.source.w0
    public boolean k(long positionUs) {
        boolean zK;
        boolean z10 = false;
        do {
            long jE = e();
            if (jE == Long.MIN_VALUE) {
                return z10;
            }
            zK = false;
            for (w0 w0Var : this.f56226a) {
                long jE2 = w0Var.e();
                boolean z11 = jE2 != Long.MIN_VALUE && jE2 <= positionUs;
                if (jE2 == jE || z11) {
                    zK |= w0Var.k(positionUs);
                }
            }
            z10 |= zK;
        } while (zK);
        return z10;
    }
}
