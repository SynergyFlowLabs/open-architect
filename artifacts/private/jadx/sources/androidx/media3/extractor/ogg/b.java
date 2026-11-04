package androidx.media3.extractor.ogg;

import androidx.annotation.p0;
import androidx.media3.common.s0;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.o0;
import androidx.media3.extractor.a0;
import androidx.media3.extractor.s;
import androidx.media3.extractor.x;
import androidx.media3.extractor.y;
import androidx.media3.extractor.z;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class b extends i {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final byte f68213t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f68214u = 4;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @p0
    private a0 f68215r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @p0
    private a f68216s;

    private static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private a0 f68217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private a0.a f68218b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f68219c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f68220d = -1;

        public a(a0 a0Var, a0.a aVar) {
            this.f68217a = a0Var;
            this.f68218b = aVar;
        }

        @Override // androidx.media3.extractor.ogg.g
        public androidx.media3.extractor.p0 a() {
            androidx.media3.common.util.a.i(this.f68219c != -1);
            return new z(this.f68217a, this.f68219c);
        }

        @Override // androidx.media3.extractor.ogg.g
        public long b(s sVar) {
            long j10 = this.f68220d;
            if (j10 < 0) {
                return -1L;
            }
            long j11 = -(j10 + 2);
            this.f68220d = -1L;
            return j11;
        }

        @Override // androidx.media3.extractor.ogg.g
        public void c(long j10) {
            long[] jArr = this.f68218b.f67024a;
            this.f68220d = jArr[k1.n(jArr, j10, true, true)];
        }

        public void d(long j10) {
            this.f68219c = j10;
        }
    }

    b() {
    }

    private int n(o0 o0Var) {
        int i10 = (o0Var.e()[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            o0Var.b0(4);
            o0Var.U();
        }
        int iJ = x.j(o0Var, i10);
        o0Var.a0(0);
        return iJ;
    }

    private static boolean o(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean p(o0 o0Var) {
        return o0Var.a() >= 5 && o0Var.L() == 127 && o0Var.N() == 1179402563;
    }

    @Override // androidx.media3.extractor.ogg.i
    protected long f(o0 o0Var) {
        if (o(o0Var.e())) {
            return n(o0Var);
        }
        return -1L;
    }

    @Override // androidx.media3.extractor.ogg.i
    @il.e(expression = {"#3.format"}, result = false)
    protected boolean h(o0 o0Var, long j10, i.b bVar) {
        byte[] bArrE = o0Var.e();
        a0 a0Var = this.f68215r;
        if (a0Var == null) {
            a0 a0Var2 = new a0(bArrE, 17);
            this.f68215r = a0Var2;
            bVar.f68268a = a0Var2.i(Arrays.copyOfRange(bArrE, 9, o0Var.g()), null).b().U(s0.f61318j0).N();
            return true;
        }
        if ((bArrE[0] & 127) == 3) {
            a0.a aVarF = y.f(o0Var);
            a0 a0VarC = a0Var.c(aVarF);
            this.f68215r = a0VarC;
            this.f68216s = new a(a0VarC, aVarF);
            return true;
        }
        if (!o(bArrE)) {
            return true;
        }
        a aVar = this.f68216s;
        if (aVar != null) {
            aVar.d(j10);
            bVar.f68269b = this.f68216s;
        }
        androidx.media3.common.util.a.g(bVar.f68268a);
        return false;
    }

    @Override // androidx.media3.extractor.ogg.i
    protected void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f68215r = null;
            this.f68216s = null;
        }
    }
}
