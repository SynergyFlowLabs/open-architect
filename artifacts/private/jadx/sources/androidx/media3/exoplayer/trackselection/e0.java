package androidx.media3.exoplayer.trackselection;

import android.util.Pair;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.media3.common.b4;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.z3;
import androidx.media3.exoplayer.a5;
import androidx.media3.exoplayer.c5;
import androidx.media3.exoplayer.s0;
import androidx.media3.exoplayer.source.h2;
import androidx.media3.exoplayer.source.t0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@b1
public abstract class e0 extends k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private a f65682c;

    public static final class a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f65683h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f65684i = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f65685j = 2;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f65686k = 3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f65687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String[] f65688b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f65689c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final h2[] f65690d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f65691e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int[][][] f65692f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final h2 f65693g;

        /* JADX INFO: renamed from: androidx.media3.exoplayer.trackselection.e0$a$a, reason: collision with other inner class name */
        @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC0594a {
        }

        @l1
        a(String[] strArr, int[] iArr, h2[] h2VarArr, int[] iArr2, int[][][] iArr3, h2 h2Var) {
            this.f65688b = strArr;
            this.f65689c = iArr;
            this.f65690d = h2VarArr;
            this.f65692f = iArr3;
            this.f65691e = iArr2;
            this.f65693g = h2Var;
            this.f65687a = iArr.length;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0025  */
        public int a(int i10, int i11, boolean z10) {
            int i12 = this.f65690d[i10].c(i11).f60459a;
            int[] iArr = new int[i12];
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                int i15 = i(i10, i11, i14);
                if (i15 == 4) {
                    iArr[i13] = i14;
                    i13++;
                } else if (z10) {
                    int i16 = 4 ^ 3;
                    if (i15 == 3) {
                        iArr[i13] = i14;
                        i13++;
                    }
                }
            }
            return b(i10, i11, Arrays.copyOf(iArr, i13));
        }

        public int b(int i10, int i11, int[] iArr) {
            int i12 = 0;
            int iMin = 16;
            String str = null;
            boolean z10 = false;
            int i13 = 0;
            while (i12 < iArr.length) {
                String str2 = this.f65690d[i10].c(i11).c(iArr[i12]).f61761o;
                int i14 = i13 + 1;
                if (i13 == 0) {
                    str = str2;
                } else {
                    z10 |= !Objects.equals(str, str2);
                }
                iMin = Math.min(iMin, a5.o(this.f65692f[i10][i11][i12]));
                i12++;
                i13 = i14;
            }
            return z10 ? Math.min(iMin, this.f65691e[i10]) : iMin;
        }

        public int c(int i10, int i11, int i12) {
            return this.f65692f[i10][i11][i12];
        }

        public int d() {
            return this.f65687a;
        }

        public String e(int i10) {
            return this.f65688b[i10];
        }

        public int f(int i10) {
            int iMax = 0;
            for (int[] iArr : this.f65692f[i10]) {
                for (int i11 : iArr) {
                    int iF = a5.F(i11);
                    int i12 = 1;
                    if (iF != 0 && iF != 1 && iF != 2) {
                        if (iF != 3) {
                            if (iF == 4) {
                                return 3;
                            }
                            throw new IllegalStateException();
                        }
                        i12 = 2;
                    }
                    iMax = Math.max(iMax, i12);
                }
            }
            return iMax;
        }

        public int g(int i10) {
            return this.f65689c[i10];
        }

        public h2 h(int i10) {
            return this.f65690d[i10];
        }

        public int i(int i10, int i11, int i12) {
            return a5.F(c(i10, i11, i12));
        }

        public int j(int i10) {
            int iMax = 0;
            for (int i11 = 0; i11 < this.f65687a; i11++) {
                if (this.f65689c[i11] == i10) {
                    iMax = Math.max(iMax, f(i11));
                }
            }
            return iMax;
        }

        public h2 k() {
            return this.f65693g;
        }
    }

    private static int n(a5[] a5VarArr, b4 b4Var, int[] iArr, boolean z10) throws s0 {
        int length = a5VarArr.length;
        int i10 = 0;
        boolean z11 = true;
        for (int i11 = 0; i11 < a5VarArr.length; i11++) {
            a5 a5Var = a5VarArr[i11];
            int iMax = 0;
            for (int i12 = 0; i12 < b4Var.f60459a; i12++) {
                iMax = Math.max(iMax, a5.F(a5Var.b(b4Var.c(i12))));
            }
            boolean z12 = iArr[i11] == 0;
            if (iMax > i10 || (iMax == i10 && z10 && !z11 && z12)) {
                length = i11;
                z11 = z12;
                i10 = iMax;
            }
        }
        return length;
    }

    private static int[] p(a5 a5Var, b4 b4Var) throws s0 {
        int[] iArr = new int[b4Var.f60459a];
        for (int i10 = 0; i10 < b4Var.f60459a; i10++) {
            iArr[i10] = a5Var.b(b4Var.c(i10));
        }
        return iArr;
    }

    private static int[] q(a5[] a5VarArr) throws s0 {
        int length = a5VarArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = a5VarArr[i10].l();
        }
        return iArr;
    }

    @Override // androidx.media3.exoplayer.trackselection.k0
    public final void i(@p0 Object obj) {
        this.f65682c = (a) obj;
    }

    @Override // androidx.media3.exoplayer.trackselection.k0
    public final l0 k(a5[] a5VarArr, h2 h2Var, t0.b bVar, z3 z3Var) throws s0 {
        int[] iArr = new int[a5VarArr.length + 1];
        int length = a5VarArr.length + 1;
        b4[][] b4VarArr = new b4[length][];
        int[][][] iArr2 = new int[a5VarArr.length + 1][][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = h2Var.f65076a;
            b4VarArr[i10] = new b4[i11];
            iArr2[i10] = new int[i11][];
        }
        int[] iArrQ = q(a5VarArr);
        for (int i12 = 0; i12 < h2Var.f65076a; i12++) {
            b4 b4VarC = h2Var.c(i12);
            int iN = n(a5VarArr, b4VarC, iArr, b4VarC.f60461c == 5);
            int[] iArrP = iN == a5VarArr.length ? new int[b4VarC.f60459a] : p(a5VarArr[iN], b4VarC);
            int i13 = iArr[iN];
            b4VarArr[iN][i13] = b4VarC;
            iArr2[iN][i13] = iArrP;
            iArr[iN] = i13 + 1;
        }
        h2[] h2VarArr = new h2[a5VarArr.length];
        String[] strArr = new String[a5VarArr.length];
        int[] iArr3 = new int[a5VarArr.length];
        for (int i14 = 0; i14 < a5VarArr.length; i14++) {
            int i15 = iArr[i14];
            h2VarArr[i14] = new h2((b4[]) k1.J1(b4VarArr[i14], i15));
            iArr2[i14] = (int[][]) k1.J1(iArr2[i14], i15);
            strArr[i14] = a5VarArr[i14].getName();
            iArr3[i14] = a5VarArr[i14].f();
        }
        a aVar = new a(strArr, iArr3, h2VarArr, iArrQ, iArr2, new h2((b4[]) k1.J1(b4VarArr[a5VarArr.length], iArr[a5VarArr.length])));
        Pair<c5[], c0[]> pairR = r(aVar, iArr2, iArrQ, bVar, z3Var);
        return new l0((c5[]) pairR.first, (c0[]) pairR.second, j0.a(aVar, (h0[]) pairR.second), aVar);
    }

    @p0
    public final a o() {
        return this.f65682c;
    }

    protected abstract Pair<c5[], c0[]> r(a aVar, int[][][] iArr, int[] iArr2, t0.b bVar, z3 z3Var) throws s0;
}
