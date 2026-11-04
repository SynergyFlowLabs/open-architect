package androidx.media3.container;

import androidx.annotation.p0;
import androidx.media3.common.s0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.z;
import androidx.media3.common.w;
import com.google.common.collect.l6;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class f {
    public static final int A = 40;
    public static final int B = 48;
    public static final int D = 255;
    private static final int F = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f62108a = "NalUnitUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f62109b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f62110c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f62111d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f62112e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f62113f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final int f62114g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f62115h = 6;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final int f62116i = 6;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f62117j = 7;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final int f62118k = 7;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f62119l = 8;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final int f62120m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f62121n = 9;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final int f62122o = 9;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f62123p = 14;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Deprecated
    public static final int f62124q = 14;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f62125r = 24;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f62126s = 9;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f62127t = 16;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f62128u = 21;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f62129v = 32;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f62130w = 33;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f62131x = 34;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f62132y = 35;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f62133z = 39;
    public static final byte[] C = {0, 0, 0, 1};
    public static final float[] E = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object G = new Object();
    private static int[] H = new int[10];

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f62134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f62135b;

        public a(int i10, int i11) {
            this.f62134a = i10;
            this.f62135b = i11;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f62136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f62137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f62138c;

        public b(int i10, int i11, int i12) {
            this.f62136a = i10;
            this.f62137b = i11;
            this.f62138c = i12;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f62139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f62140b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f62141c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f62142d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f62143e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f62144f;

        public c(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
            this.f62139a = i10;
            this.f62140b = z10;
            this.f62141c = i11;
            this.f62142d = i12;
            this.f62143e = iArr;
            this.f62144f = i13;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l6<c> f62145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f62146b;

        public d(List<c> list, int[] iArr) {
            this.f62145a = l6.w(list);
            this.f62146b = iArr;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f62147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f62148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f62149c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f62150d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f62151e;

        public e(int i10, int i11, int i12, int i13, int i14) {
            this.f62147a = i10;
            this.f62148b = i11;
            this.f62149c = i12;
            this.f62150d = i13;
            this.f62151e = i14;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.container.f$f, reason: collision with other inner class name */
    public static final class C0573f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l6<e> f62152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f62153b;

        public C0573f(List<e> list, int[] iArr) {
            this.f62152a = l6.w(list);
            this.f62153b = iArr;
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f62154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f62155b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f62156c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f62157d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f62158e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f62159f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f62160g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f62161h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f62162i;

        public g(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            this.f62154a = i10;
            this.f62155b = i11;
            this.f62156c = i12;
            this.f62157d = i13;
            this.f62158e = i14;
            this.f62159f = i15;
            this.f62160g = i16;
            this.f62161h = i17;
            this.f62162i = i18;
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f62163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f62164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        public final c f62165c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f62166d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f62167e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f62168f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f62169g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f62170h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f62171i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final float f62172j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f62173k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f62174l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f62175m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f62176n;

        public h(b bVar, int i10, @p0 c cVar, int i11, int i12, int i13, int i14, int i15, int i16, float f10, int i17, int i18, int i19, int i20) {
            this.f62163a = bVar;
            this.f62164b = i10;
            this.f62165c = cVar;
            this.f62166d = i11;
            this.f62167e = i12;
            this.f62168f = i13;
            this.f62169g = i14;
            this.f62170h = i15;
            this.f62171i = i16;
            this.f62172j = f10;
            this.f62173k = i17;
            this.f62174l = i18;
            this.f62175m = i19;
            this.f62176n = i20;
        }
    }

    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f62177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f62178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f62179c;

        public i(int i10, int i11, int i12) {
            this.f62177a = i10;
            this.f62178b = i11;
            this.f62179c = i12;
        }
    }

    public static final class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l6<i> f62180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f62181b;

        public j(List<i> list, int[] iArr) {
            this.f62180a = l6.w(list);
            this.f62181b = iArr;
        }
    }

    public static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f62182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l6<a> f62183b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f62184c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        public final C0573f f62185d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        public final j f62186e;

        public k(b bVar, @p0 List<a> list, d dVar, @p0 C0573f c0573f, @p0 j jVar) {
            this.f62182a = bVar;
            this.f62183b = list != null ? l6.w(list) : l6.F();
            this.f62184c = dVar;
            this.f62185d = c0573f;
            this.f62186e = jVar;
        }
    }

    public static final class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f62187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f62188b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f62189c;

        public l(int i10, int i11, boolean z10) {
            this.f62187a = i10;
            this.f62188b = i11;
            this.f62189c = z10;
        }
    }

    public static final class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f62190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f62191b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f62192c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f62193d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f62194e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f62195f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f62196g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f62197h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f62198i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f62199j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f62200k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f62201l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f62202m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f62203n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f62204o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f62205p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f62206q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f62207r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f62208s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f62209t;

        public m(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10, int i17, int i18, boolean z10, boolean z11, int i19, int i20, int i21, boolean z12, int i22, int i23, int i24, int i25) {
            this.f62190a = i10;
            this.f62191b = i11;
            this.f62192c = i12;
            this.f62193d = i13;
            this.f62194e = i14;
            this.f62195f = i15;
            this.f62196g = i16;
            this.f62197h = f10;
            this.f62198i = i17;
            this.f62199j = i18;
            this.f62200k = z10;
            this.f62201l = z11;
            this.f62202m = i19;
            this.f62203n = i20;
            this.f62204o = i21;
            this.f62205p = z12;
            this.f62206q = i22;
            this.f62207r = i23;
            this.f62208s = i24;
            this.f62209t = i25;
        }
    }

    private f() {
    }

    public static k A(byte[] bArr, int i10, int i11) {
        androidx.media3.container.h hVar = new androidx.media3.container.h(bArr, i10, i11);
        return B(hVar, r(hVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static k B(androidx.media3.container.h hVar, b bVar) {
        int[] iArr;
        int i10;
        int i11;
        j jVarZ;
        int i12;
        int i13;
        int i14;
        int[] iArr2;
        l6 l6Var;
        int i15;
        boolean[][] zArr;
        int[] iArr3;
        int i16;
        hVar.m(4);
        boolean zE = hVar.e();
        boolean zE2 = hVar.e();
        int iF = hVar.f(6);
        int i17 = iF + 1;
        int iF2 = hVar.f(3);
        hVar.m(17);
        c cVarS = s(hVar, true, iF2, null);
        boolean z10 = false;
        for (int i18 = hVar.e() ? 0 : iF2; i18 <= iF2; i18++) {
            hVar.i();
            hVar.i();
            hVar.i();
        }
        int iF3 = hVar.f(6);
        int i19 = hVar.i() + 1;
        d dVar = new d(l6.G(cVarS), new int[1]);
        Object[] objArr = i17 >= 2 && i19 >= 2;
        Object[] objArr2 = zE && zE2;
        int i20 = iF3 + 1;
        Object[] objArr3 = i20 >= i17;
        if (objArr != true || objArr2 != true || objArr3 != true) {
            return new k(bVar, null, dVar, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) cls, i19, i20);
        int i21 = 1;
        int[] iArr5 = new int[i19];
        int[] iArr6 = new int[i19];
        iArr4[0][0] = 0;
        iArr5[0] = 1;
        iArr6[0] = 0;
        for (int i22 = 1; i22 < i19; i22++) {
            int i23 = 0;
            for (int i24 = 0; i24 <= iF3; i24++) {
                if (hVar.e()) {
                    iArr4[i22][i23] = i24;
                    iArr6[i22] = i24;
                    i23++;
                }
                iArr5[i22] = i23;
            }
        }
        if (hVar.e()) {
            hVar.m(64);
            if (hVar.e()) {
                hVar.i();
            }
            int i25 = hVar.i();
            int i26 = 0;
            while (i26 < i25) {
                hVar.i();
                if (i26 == 0 || hVar.e()) {
                    z10 = true;
                }
                H(hVar, z10, iF2);
                i26++;
                z10 = false;
            }
        }
        if (!hVar.e()) {
            return new k(bVar, null, dVar, null, null);
        }
        hVar.b();
        c cVarS2 = s(hVar, false, iF2, cVarS);
        boolean zE3 = hVar.e();
        int i27 = 6;
        boolean[] zArr2 = new boolean[16];
        int i28 = 0;
        for (int i29 = 0; i29 < 16; i29++) {
            boolean zE4 = hVar.e();
            zArr2[i29] = zE4;
            if (zE4) {
                i28++;
            }
        }
        if (i28 == 0 || !zArr2[1]) {
            return new k(bVar, null, dVar, null, null);
        }
        int[] iArr7 = new int[i28];
        for (int i30 = 0; i30 < i28 - (zE3 ? 1 : 0); i30++) {
            iArr7[i30] = hVar.f(3);
        }
        int[] iArr8 = new int[i28 + 1];
        if (zE3) {
            int i31 = 1;
            while (i31 < i28) {
                int[] iArr9 = iArr8;
                for (int i32 = 0; i32 < i31; i32++) {
                    iArr9[i31] = iArr9[i31] + iArr7[i32] + 1;
                }
                i31++;
                iArr8 = iArr9;
            }
            iArr = iArr8;
            iArr[i28] = 6;
        } else {
            iArr = iArr8;
        }
        int[][] iArr10 = (int[][]) Array.newInstance((Class<?>) cls, i17, i28);
        int[] iArr11 = new int[i17];
        iArr11[0] = 0;
        boolean zE5 = hVar.e();
        int i33 = 1;
        while (i33 < i17) {
            if (zE5) {
                i16 = i33;
                iArr11[i16] = hVar.f(i27);
            } else {
                i16 = i33;
                iArr11[i16] = i16;
            }
            if (zE3) {
                int i34 = 0;
                while (i34 < i28) {
                    int i35 = i34 + 1;
                    iArr10[i16][i34] = (iArr11[i16] & ((1 << iArr[i35]) - 1)) >> iArr[i34];
                    i34 = i35;
                }
            } else {
                int i36 = 0;
                while (i36 < i28) {
                    int i37 = i36;
                    iArr10[i16][i37] = hVar.f(iArr7[i36] + 1);
                    i36 = i37 + 1;
                }
            }
            i33 = i16 + 1;
            i27 = 6;
        }
        int[] iArr12 = new int[i20];
        int i38 = 1;
        int i39 = 0;
        while (i39 < i17) {
            iArr12[iArr11[i39]] = -1;
            int[] iArr13 = iArr12;
            int i40 = 0;
            int i41 = 0;
            while (i40 < 16) {
                if (zArr2[i40]) {
                    if (i40 == i21) {
                        iArr13[iArr11[i39]] = iArr10[i39][i41];
                    }
                    i41++;
                }
                i40++;
                i21 = 1;
            }
            if (i39 > 0) {
                int i42 = 0;
                while (true) {
                    if (i42 >= i39) {
                        i38++;
                        break;
                    }
                    int i43 = i42;
                    if (iArr13[iArr11[i39]] == iArr13[iArr11[i42]]) {
                        break;
                    }
                    i42 = i43 + 1;
                }
            }
            i39++;
            iArr12 = iArr13;
            i21 = 1;
        }
        int[] iArr14 = iArr12;
        int iF4 = hVar.f(4);
        if (i38 < 2 || iF4 == 0) {
            return new k(bVar, null, dVar, null, null);
        }
        int[] iArr15 = new int[i38];
        for (int i44 = 0; i44 < i38; i44++) {
            iArr15[i44] = hVar.f(iF4);
        }
        int[] iArr16 = new int[i20];
        int i45 = 0;
        while (i45 < i17) {
            int[] iArr17 = iArr16;
            iArr17[Math.min(iArr11[i45], iF3)] = i45;
            i45++;
            iArr16 = iArr17;
        }
        int[] iArr18 = iArr16;
        l6.a aVarS = l6.s();
        int i46 = 0;
        while (i46 <= iF3) {
            int i47 = i38;
            int[] iArr19 = iArr6;
            int iMin = Math.min(iArr14[i46], i47 - 1);
            aVarS.a(new a(iArr18[i46], iMin >= 0 ? iArr15[iMin] : -1));
            i46++;
            i38 = i47;
            iArr6 = iArr19;
            iArr15 = iArr15;
        }
        int[] iArr20 = iArr6;
        l6 l6VarE = aVarS.e();
        if (((a) l6VarE.get(0)).f62135b == -1) {
            return new k(bVar, null, dVar, null, null);
        }
        int i48 = 1;
        while (true) {
            if (i48 > iF3) {
                i10 = -1;
                i11 = -1;
                break;
            }
            i10 = -1;
            if (((a) l6VarE.get(i48)).f62135b != -1) {
                i11 = i48;
                break;
            }
            i48++;
        }
        if (i11 == i10) {
            return new k(bVar, null, dVar, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr3 = (boolean[][]) Array.newInstance((Class<?>) cls2, i17, i17);
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i17, i17);
        int i49 = 1;
        while (i49 < i17) {
            boolean[][] zArr5 = zArr4;
            for (int i50 = 0; i50 < i49; i50++) {
                boolean[] zArr6 = zArr3[i49];
                boolean[] zArr7 = zArr5[i49];
                boolean zE6 = hVar.e();
                zArr7[i50] = zE6;
                zArr6[i50] = zE6;
            }
            i49++;
            zArr4 = zArr5;
        }
        boolean[][] zArr8 = zArr4;
        for (int i51 = 1; i51 < i17; i51++) {
            int i52 = 0;
            while (i52 < iF) {
                int[] iArr21 = iArr11;
                for (int i53 = 0; i53 < i51; i53++) {
                    boolean[] zArr9 = zArr8[i51];
                    if (zArr9[i53] && zArr8[i53][i52]) {
                        zArr9[i52] = true;
                        break;
                    }
                }
                i52++;
                iArr11 = iArr21;
            }
        }
        int[] iArr22 = iArr11;
        int[] iArr23 = new int[i20];
        for (int i54 = 0; i54 < i17; i54++) {
            int i55 = 0;
            for (int i56 = 0; i56 < i54; i56++) {
                i55 += zArr3[i54][i56] ? 1 : 0;
            }
            iArr23[iArr22[i54]] = i55;
        }
        int i57 = 0;
        for (int i58 = 0; i58 < i17; i58++) {
            if (iArr23[iArr22[i58]] == 0) {
                i57++;
            }
        }
        if (i57 > 1) {
            return new k(bVar, null, dVar, null, null);
        }
        int[] iArr24 = new int[i17];
        int[] iArr25 = new int[i19];
        if (hVar.e()) {
            int i59 = 0;
            while (i59 < i17) {
                int i60 = i59;
                iArr24[i60] = hVar.f(3);
                i59 = i60 + 1;
            }
        } else {
            Arrays.fill(iArr24, 0, i17, iF2);
        }
        int i61 = 0;
        while (i61 < i19) {
            int i62 = i61;
            boolean[][] zArr10 = zArr3;
            int[] iArr26 = iArr24;
            int iMax = 0;
            for (int i63 = 0; i63 < iArr5[i62]; i63++) {
                iMax = Math.max(iMax, iArr26[((a) l6VarE.get(iArr4[i62][i63])).f62134a]);
            }
            iArr25[i62] = iMax + 1;
            i61 = i62 + 1;
            iArr24 = iArr26;
            zArr3 = zArr10;
        }
        boolean[][] zArr11 = zArr3;
        if (hVar.e()) {
            int i64 = 0;
            while (i64 < iF) {
                int i65 = i64 + 1;
                int i66 = i65;
                while (i66 < i17) {
                    if (zArr11[i66][i64]) {
                        hVar.m(3);
                    }
                    i66++;
                    i64 = i64;
                }
                i64 = i65;
            }
        }
        hVar.l();
        int i67 = hVar.i() + 1;
        l6.a aVarS2 = l6.s();
        aVarS2.a(cVarS);
        if (i67 > 1) {
            aVarS2.a(cVarS2);
            for (int i68 = 2; i68 < i67; i68++) {
                cVarS2 = s(hVar, hVar.e(), iF2, cVarS2);
                aVarS2.a(cVarS2);
            }
        }
        l6 l6VarE2 = aVarS2.e();
        int i69 = hVar.i() + i19;
        if (i69 > i19) {
            return new k(bVar, null, dVar, null, null);
        }
        int iF5 = hVar.f(2);
        boolean[][] zArr12 = (boolean[][]) Array.newInstance((Class<?>) cls2, i69, i20);
        int[] iArr27 = new int[i69];
        int i70 = 0;
        int[] iArr28 = new int[i69];
        int i71 = 0;
        while (i71 < i19) {
            iArr27[i71] = i70;
            iArr28[i71] = iArr20[i71];
            if (iF5 == 0) {
                i15 = i71;
                zArr = zArr12;
                l6Var = l6VarE2;
                iArr3 = iArr27;
                Arrays.fill(zArr12[i15], i70, iArr5[i15], true);
                iArr3[i15] = iArr5[i15];
            } else {
                l6Var = l6VarE2;
                i15 = i71;
                zArr = zArr12;
                iArr3 = iArr27;
                if (iF5 == 1) {
                    int i72 = iArr20[i15];
                    for (int i73 = 0; i73 < iArr5[i15]; i73++) {
                        zArr[i15][i73] = iArr4[i15][i73] == i72;
                    }
                    iArr3[i15] = 1;
                } else {
                    i70 = 0;
                    zArr[0][0] = true;
                    iArr3[0] = 1;
                }
                i71 = i15 + 1;
                zArr12 = zArr;
                iArr27 = iArr3;
                l6VarE2 = l6Var;
            }
            i70 = 0;
            i71 = i15 + 1;
            zArr12 = zArr;
            iArr27 = iArr3;
            l6VarE2 = l6Var;
        }
        l6 l6Var2 = l6VarE2;
        boolean[][] zArr13 = zArr12;
        int[] iArr29 = iArr27;
        int[] iArr30 = new int[i20];
        int i74 = 2;
        int[] iArr31 = new int[2];
        iArr31[1] = i20;
        iArr31[i70] = i69;
        boolean[][] zArr14 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr31);
        int i75 = 1;
        int i76 = 0;
        while (i75 < i69) {
            if (iF5 == i74) {
                for (int i77 = 0; i77 < iArr5[i75]; i77++) {
                    zArr13[i75][i77] = hVar.e();
                    int i78 = iArr29[i75];
                    boolean z11 = zArr13[i75][i77];
                    iArr29[i75] = i78 + (z11 ? 1 : 0);
                    if (z11) {
                        iArr28[i75] = iArr4[i75][i77];
                    }
                }
            }
            if (i76 == 0) {
                i12 = 0;
                if (iArr4[i75][0] == 0 && zArr13[i75][0]) {
                    for (int i79 = 1; i79 < iArr5[i75]; i79++) {
                        if (iArr4[i75][i79] == i11 && zArr13[i75][i11]) {
                            i76 = i75;
                        }
                    }
                }
            } else {
                i12 = 0;
            }
            int i80 = i12;
            while (i80 < iArr5[i75]) {
                if (i67 > 1) {
                    zArr14[i75][i80] = zArr13[i75][i80];
                    i14 = i11;
                    iArr2 = iArr30;
                    i13 = i67;
                    int iH = com.google.common.math.c.h(i67, RoundingMode.CEILING);
                    if (!zArr14[i75][i80]) {
                        int i81 = ((a) l6VarE.get(iArr4[i75][i80])).f62134a;
                        int i82 = i12;
                        while (i82 < i80) {
                            int i83 = i81;
                            if (zArr8[i83][((a) l6VarE.get(iArr4[i75][i82])).f62134a]) {
                                zArr14[i75][i80] = true;
                                break;
                            }
                            i82++;
                            i81 = i83;
                        }
                    }
                    if (zArr14[i75][i80]) {
                        if (i76 <= 0 || i75 != i76) {
                            hVar.m(iH);
                        } else {
                            iArr2[i80] = hVar.f(iH);
                        }
                    }
                } else {
                    i13 = i67;
                    i14 = i11;
                    iArr2 = iArr30;
                }
                i80++;
                i11 = i14;
                iArr30 = iArr2;
                i67 = i13;
            }
            int i84 = i67;
            int i85 = i11;
            int[] iArr32 = iArr30;
            if (iArr29[i75] == 1 && iArr23[iArr28[i75]] > 0) {
                hVar.l();
            }
            i75++;
            i11 = i85;
            iArr30 = iArr32;
            i67 = i84;
            i74 = 2;
        }
        int[] iArr33 = iArr30;
        if (i76 == 0) {
            return new k(bVar, null, dVar, null, null);
        }
        C0573f c0573fU = u(hVar, i17);
        hVar.m(2);
        for (int i86 = 1; i86 < i17; i86++) {
            if (iArr23[iArr22[i86]] == 0) {
                hVar.l();
            }
        }
        G(hVar, i69, iArr25, iArr5, zArr14);
        M(hVar, i17, zArr11);
        if (hVar.e()) {
            hVar.b();
            jVarZ = z(hVar, i17, i19, iArr25);
        } else {
            jVarZ = null;
        }
        return new k(bVar, l6VarE, new d(l6Var2, iArr33), c0573fU, jVarZ);
    }

    public static l C(byte[] bArr, int i10, int i11) {
        return D(bArr, i10 + 1, i11);
    }

    public static l D(byte[] bArr, int i10, int i11) {
        androidx.media3.container.h hVar = new androidx.media3.container.h(bArr, i10, i11);
        int i12 = hVar.i();
        int i13 = hVar.i();
        hVar.l();
        return new l(i12, i13, hVar.e());
    }

    public static m E(byte[] bArr, int i10, int i11) {
        return F(bArr, i10 + 1, i11);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:116:0x0204  */
    /* JADX WARN: Code duplicated, block: B:119:0x020f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0218  */
    /* JADX WARN: Code duplicated, block: B:125:0x021f  */
    /* JADX WARN: Code duplicated, block: B:128:0x022b  */
    public static m F(byte[] bArr, int i10, int i11) {
        int i12;
        boolean zE;
        int i13;
        int i14;
        int i15;
        boolean z10;
        int i16;
        int i17;
        float f10;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean zE2;
        boolean zE3;
        int i24;
        int i25;
        androidx.media3.container.h hVar = new androidx.media3.container.h(bArr, i10, i11);
        int iF = hVar.f(8);
        int iF2 = hVar.f(8);
        int iF3 = hVar.f(8);
        int i26 = hVar.i();
        if (iF == 100 || iF == 110 || iF == 122 || iF == 244 || iF == 44 || iF == 83 || iF == 86 || iF == 118 || iF == 128 || iF == 138) {
            i12 = hVar.i();
            zE = i12 == 3 ? hVar.e() : false;
            i13 = hVar.i();
            int i27 = hVar.i();
            hVar.l();
            if (hVar.e()) {
                int i28 = i12 != 3 ? 8 : 12;
                i14 = 16;
                int i29 = 0;
                while (i29 < i28) {
                    if (hVar.e()) {
                        L(hVar, i29 < 6 ? 16 : 64);
                    }
                    i29++;
                }
            } else {
                i14 = 16;
            }
            i15 = i27;
        } else {
            i12 = 1;
            i14 = 16;
            i15 = 0;
            zE = false;
            i13 = 0;
        }
        int i30 = hVar.i() + 4;
        int i31 = hVar.i();
        if (i31 == 0) {
            i16 = hVar.i() + 4;
            iF = iF;
            i31 = i31;
            z10 = false;
        } else {
            if (i31 == 1) {
                boolean zE4 = hVar.e();
                hVar.h();
                hVar.h();
                long jI = hVar.i();
                for (int i32 = 0; i32 < jI; i32++) {
                    hVar.i();
                }
                z10 = zE4;
            } else {
                z10 = false;
            }
            i16 = 0;
        }
        int i33 = hVar.i();
        hVar.l();
        int i34 = hVar.i() + 1;
        int i35 = hVar.i() + 1;
        boolean zE5 = hVar.e();
        int i36 = (2 - (zE5 ? 1 : 0)) * i35;
        if (!zE5) {
            hVar.l();
        }
        hVar.l();
        int i37 = i34 * 16;
        int i38 = i36 * 16;
        if (hVar.e()) {
            int i39 = hVar.i();
            int i40 = hVar.i();
            int i41 = hVar.i();
            int i42 = hVar.i();
            if (i12 == 0) {
                i25 = 2 - (zE5 ? 1 : 0);
                i24 = 1;
            } else {
                i24 = i12 == 3 ? 1 : 2;
                i25 = (i12 == 1 ? 2 : 1) * (2 - (zE5 ? 1 : 0));
            }
            i37 -= (i39 + i40) * i24;
            i38 -= (i41 + i42) * i25;
        }
        int i43 = i37;
        int i44 = iF;
        int i45 = ((i44 == 44 || i44 == 86 || i44 == 100 || i44 == 110 || i44 == 122 || i44 == 244) && (iF2 & 16) != 0) ? 0 : i14;
        float f11 = 1.0f;
        if (hVar.e()) {
            if (hVar.e()) {
                int iF4 = hVar.f(8);
                if (iF4 == 255) {
                    int i46 = i14;
                    int iF5 = hVar.f(i46);
                    int iF6 = hVar.f(i46);
                    if (iF5 != 0 && iF6 != 0) {
                        f11 = iF5 / iF6;
                    }
                } else {
                    float[] fArr = E;
                    if (iF4 < fArr.length) {
                        f11 = fArr[iF4];
                    } else {
                        z.n(f62108a, "Unexpected aspect_ratio_idc value: " + iF4);
                    }
                }
            }
            if (hVar.e()) {
                hVar.l();
            }
            if (hVar.e()) {
                hVar.m(3);
                i22 = hVar.e() ? 1 : 2;
                if (hVar.e()) {
                    int iF7 = hVar.f(8);
                    int iF8 = hVar.f(8);
                    hVar.m(8);
                    int iO = androidx.media3.common.k.o(iF7);
                    int iP = androidx.media3.common.k.p(iF8);
                    i23 = iO;
                    i21 = iP;
                } else {
                    i21 = -1;
                }
                if (hVar.e()) {
                    hVar.i();
                    hVar.i();
                }
                if (hVar.e()) {
                    hVar.m(65);
                }
                zE2 = hVar.e();
                if (zE2) {
                    K(hVar);
                }
                zE3 = hVar.e();
                if (zE3) {
                    K(hVar);
                }
                if (zE2 || zE3) {
                    hVar.l();
                }
                hVar.l();
                if (hVar.e()) {
                    hVar.l();
                    hVar.i();
                    hVar.i();
                    hVar.i();
                    hVar.i();
                    i45 = hVar.i();
                    hVar.i();
                }
                i20 = i21;
                i19 = i22;
                i17 = i45;
                f10 = f11;
                i18 = i23;
            } else {
                i21 = -1;
                i22 = -1;
            }
            i23 = -1;
            if (hVar.e()) {
                hVar.i();
                hVar.i();
            }
            if (hVar.e()) {
                hVar.m(65);
            }
            zE2 = hVar.e();
            if (zE2) {
                K(hVar);
            }
            zE3 = hVar.e();
            if (zE3) {
                K(hVar);
            }
            if (zE2) {
                hVar.l();
            } else {
                hVar.l();
            }
            hVar.l();
            if (hVar.e()) {
                hVar.l();
                hVar.i();
                hVar.i();
                hVar.i();
                hVar.i();
                i45 = hVar.i();
                hVar.i();
            }
            i20 = i21;
            i19 = i22;
            i17 = i45;
            f10 = f11;
            i18 = i23;
        } else {
            i17 = i45;
            f10 = 1.0f;
            i18 = -1;
            i19 = -1;
            i20 = -1;
        }
        return new m(i44, iF2, iF3, i26, i33, i43, i38, f10, i13, i15, zE, zE5, i30, i31, i16, z10, i18, i19, i20, i17);
    }

    private static void G(androidx.media3.container.h hVar, int i10, int[] iArr, int[] iArr2, boolean[][] zArr) {
        for (int i11 = 1; i11 < i10; i11++) {
            boolean zE = hVar.e();
            int i12 = 0;
            while (i12 < iArr[i11]) {
                if ((i12 <= 0 || !zE) ? i12 == 0 : hVar.e()) {
                    for (int i13 = 0; i13 < iArr2[i11]; i13++) {
                        if (zArr[i11][i13]) {
                            hVar.i();
                        }
                    }
                    hVar.i();
                    hVar.i();
                }
                i12++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [int] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    private static void H(androidx.media3.container.h hVar, boolean z10, int i10) {
        ?? r10;
        ?? r11;
        boolean zE;
        boolean zE2;
        if (z10) {
            boolean zE3 = hVar.e();
            boolean zE4 = hVar.e();
            if (zE3 || zE4) {
                zE = hVar.e();
                if (zE) {
                    hVar.m(19);
                }
                hVar.m(8);
                if (zE) {
                    hVar.m(4);
                }
                hVar.m(15);
                r11 = zE4;
                r10 = zE3;
            } else {
                zE = false;
                r11 = zE4;
                r10 = zE3;
            }
        } else {
            r10 = 0;
            r11 = 0;
            zE = false;
        }
        for (int i11 = 0; i11 <= i10; i11++) {
            boolean zE5 = hVar.e();
            if (!zE5) {
                zE5 = hVar.e();
            }
            if (zE5) {
                hVar.i();
                zE2 = false;
            } else {
                zE2 = hVar.e();
            }
            int i12 = !zE2 ? hVar.i() : 0;
            int i13 = r10 + r11;
            for (int i14 = 0; i14 < i13; i14++) {
                for (int i15 = 0; i15 <= i12; i15++) {
                    hVar.i();
                    hVar.i();
                    if (zE) {
                        hVar.i();
                        hVar.i();
                    }
                    hVar.l();
                }
            }
        }
    }

    private static void I(androidx.media3.container.h hVar) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (hVar.e()) {
                    int iMin = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        hVar.h();
                    }
                    for (int i13 = 0; i13 < iMin; i13++) {
                        hVar.h();
                    }
                } else {
                    hVar.i();
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    private static void J(androidx.media3.container.h hVar) {
        int i10 = hVar.i();
        int[] iArr = new int[0];
        int[] iArrCopyOf = new int[0];
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            if (i13 == 0 || !hVar.e()) {
                int i14 = hVar.i();
                int i15 = hVar.i();
                int[] iArr2 = new int[i14];
                int i16 = 0;
                while (i16 < i14) {
                    iArr2[i16] = (i16 > 0 ? iArr2[i16 - 1] : 0) - (hVar.i() + 1);
                    hVar.l();
                    i16++;
                }
                int[] iArr3 = new int[i15];
                int i17 = 0;
                while (i17 < i15) {
                    iArr3[i17] = (i17 > 0 ? iArr3[i17 - 1] : 0) + hVar.i() + 1;
                    hVar.l();
                    i17++;
                }
                i11 = i14;
                iArr = iArr2;
                i12 = i15;
                iArrCopyOf = iArr3;
            } else {
                int i18 = i11 + i12;
                int i19 = (1 - ((hVar.e() ? 1 : 0) * 2)) * (hVar.i() + 1);
                int i20 = i18 + 1;
                boolean[] zArr = new boolean[i20];
                for (int i21 = 0; i21 <= i18; i21++) {
                    if (hVar.e()) {
                        zArr[i21] = true;
                    } else {
                        zArr[i21] = hVar.e();
                    }
                }
                int[] iArr4 = new int[i20];
                int[] iArr5 = new int[i20];
                int i22 = 0;
                for (int i23 = i12 - 1; i23 >= 0; i23--) {
                    int i24 = iArrCopyOf[i23] + i19;
                    if (i24 < 0 && zArr[i11 + i23]) {
                        iArr4[i22] = i24;
                        i22++;
                    }
                }
                if (i19 < 0 && zArr[i18]) {
                    iArr4[i22] = i19;
                    i22++;
                }
                for (int i25 = 0; i25 < i11; i25++) {
                    int i26 = iArr[i25] + i19;
                    if (i26 < 0 && zArr[i25]) {
                        iArr4[i22] = i26;
                        i22++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i22);
                int i27 = 0;
                for (int i28 = i11 - 1; i28 >= 0; i28--) {
                    int i29 = iArr[i28] + i19;
                    if (i29 > 0 && zArr[i28]) {
                        iArr5[i27] = i29;
                        i27++;
                    }
                }
                if (i19 > 0 && zArr[i18]) {
                    iArr5[i27] = i19;
                    i27++;
                }
                for (int i30 = 0; i30 < i12; i30++) {
                    int i31 = iArrCopyOf[i30] + i19;
                    if (i31 > 0 && zArr[i11 + i30]) {
                        iArr5[i27] = i31;
                        i27++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr5, i27);
                iArr = iArrCopyOf2;
                i11 = i22;
                i12 = i27;
            }
        }
    }

    private static void K(androidx.media3.container.h hVar) {
        int i10 = hVar.i() + 1;
        hVar.m(8);
        for (int i11 = 0; i11 < i10; i11++) {
            hVar.i();
            hVar.i();
            hVar.l();
        }
        hVar.m(20);
    }

    private static void L(androidx.media3.container.h hVar, int i10) {
        int iH = 8;
        int i11 = 8;
        for (int i12 = 0; i12 < i10; i12++) {
            if (iH != 0) {
                iH = ((hVar.h() + i11) + 256) % 256;
            }
            if (iH != 0) {
                i11 = iH;
            }
        }
    }

    private static void M(androidx.media3.container.h hVar, int i10, boolean[][] zArr) {
        int i11 = hVar.i() + 2;
        if (hVar.e()) {
            hVar.m(i11);
        } else {
            for (int i12 = 1; i12 < i10; i12++) {
                for (int i13 = 0; i13 < i12; i13++) {
                    if (zArr[i12][i13]) {
                        hVar.m(i11);
                    }
                }
            }
        }
        int i14 = hVar.i();
        for (int i15 = 1; i15 <= i14; i15++) {
            hVar.m(8);
        }
    }

    public static int N(byte[] bArr, int i10) {
        int i11;
        synchronized (G) {
            int iH = 0;
            int i12 = 0;
            while (iH < i10) {
                try {
                    iH = h(bArr, iH, i10);
                    if (iH < i10) {
                        int[] iArr = H;
                        if (iArr.length <= i12) {
                            H = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        H[i12] = iH;
                        iH += 3;
                        i12++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            i11 = i10 - i12;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = H[i15] - i14;
                System.arraycopy(bArr, i14, bArr, i13, i16);
                int i17 = i13 + i16;
                int i18 = i17 + 1;
                bArr[i17] = 0;
                i13 = i17 + 2;
                bArr[i18] = 0;
                i14 += i16 + 3;
            }
            System.arraycopy(bArr, i14, bArr, i13, i11 - i13);
        }
        return i11;
    }

    private static int a(int i10, int i11, int i12, int i13) {
        return i10 - ((i11 == 1 ? 2 : 1) * (i12 + i13));
    }

    private static int b(int i10, int i11, int i12, int i13) {
        int i14 = 2;
        if (i11 != 1 && i11 != 2) {
            i14 = 1;
        }
        return i10 - (i14 * (i12 + i13));
    }

    public static void c(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    @p0
    private static String d(androidx.media3.container.h hVar) {
        hVar.m(4);
        int iF = hVar.f(3);
        hVar.l();
        c cVarS = s(hVar, true, iF, null);
        return androidx.media3.common.util.k.g(cVarS.f62139a, cVarS.f62140b, cVarS.f62141c, cVarS.f62142d, cVarS.f62143e, cVarS.f62144f);
    }

    public static void e(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i10 + 1;
            if (i12 >= iPosition) {
                byteBuffer.clear();
                return;
            }
            int i13 = byteBuffer.get(i10) & 255;
            int i14 = 5 << 3;
            if (i11 == 3) {
                if (i13 == 1 && (byteBuffer.get(i12) & com.google.common.base.c.I) == 7) {
                    ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                    byteBufferDuplicate.position(i10 - 3);
                    byteBufferDuplicate.limit(iPosition);
                    byteBuffer.position(0);
                    byteBuffer.put(byteBufferDuplicate);
                    return;
                }
            } else if (i13 == 0) {
                i11++;
            }
            if (i13 != 0) {
                i11 = 0;
            }
            i10 = i12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0088  */
    public static int f(byte[] bArr, int i10, int i11, boolean[] zArr) {
        boolean z10;
        int i12 = i11 - i10;
        androidx.media3.common.util.a.i(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            c(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            c(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            c(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    c(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        if (i12 > 2) {
            if (bArr[i11 - 3] == 0 && bArr[i11 - 2] == 0 && bArr[i13] == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else if (i12 == 2) {
            if (zArr[2] && bArr[i11 - 2] == 0 && bArr[i13] == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else if (zArr[1] && bArr[i13] == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[0] = z10;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    private static l6<Integer> g(byte[] bArr) {
        boolean[] zArr = new boolean[3];
        l6.a aVarS = l6.s();
        int i10 = 0;
        while (i10 < bArr.length) {
            int iF = f(bArr, i10, bArr.length, zArr);
            if (iF != bArr.length) {
                aVarS.a(Integer.valueOf(iF));
            }
            i10 = iF + 3;
        }
        return aVarS.e();
    }

    private static int h(byte[] bArr, int i10, int i11) {
        while (i10 < i11 - 2) {
            if (bArr[i10] == 0 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 3) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    @p0
    public static String i(List<byte[]> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            byte[] bArr = list.get(i10);
            int length = bArr.length;
            if (length > 3) {
                l6<Integer> l6VarG = g(bArr);
                for (int i11 = 0; i11 < l6VarG.size(); i11++) {
                    if (l6VarG.get(i11).intValue() + 3 < length) {
                        androidx.media3.container.h hVar = new androidx.media3.container.h(bArr, l6VarG.get(i11).intValue() + 3, length);
                        b bVarR = r(hVar);
                        if (bVarR.f62136a == 33 && bVarR.f62137b == 0) {
                            return d(hVar);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static int j(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 126) >> 1;
    }

    public static int k(byte[] bArr, int i10) {
        return bArr[i10 + 3] & com.google.common.base.c.I;
    }

    public static boolean l(byte[] bArr, int i10, int i11, w wVar) {
        if (Objects.equals(wVar.f61761o, "video/avc")) {
            return m(bArr[i10]);
        }
        if (Objects.equals(wVar.f61761o, "video/hevc")) {
            return n(bArr, i10, i11, wVar);
        }
        return true;
    }

    public static boolean m(byte b10) {
        if (((b10 & 96) >> 5) != 0) {
            return true;
        }
        int i10 = b10 & com.google.common.base.c.I;
        return (i10 == 1 || i10 == 9 || i10 == 14) ? false : true;
    }

    private static boolean n(byte[] bArr, int i10, int i11, w wVar) {
        b bVarR = r(new androidx.media3.container.h(bArr, i10, i11 + i10));
        int i12 = bVarR.f62136a;
        if (i12 == 35) {
            return false;
        }
        return (i12 <= 14 && i12 % 2 == 0 && bVarR.f62138c == wVar.D - 1) ? false : true;
    }

    public static boolean o(w wVar, byte b10) {
        if (((!Objects.equals(wVar.f61761o, "video/avc") && !s0.b(wVar.f61757k, "video/avc")) || (b10 & com.google.common.base.c.I) != 6) && ((!Objects.equals(wVar.f61761o, "video/hevc") && !s0.b(wVar.f61757k, "video/hevc")) || ((b10 & 126) >> 1) != 39)) {
            return false;
        }
        return true;
    }

    @Deprecated
    public static boolean p(@p0 String str, byte b10) {
        return ("video/avc".equals(str) && (b10 & com.google.common.base.c.I) == 6) || ("video/hevc".equals(str) && ((b10 & 126) >> 1) == 39);
    }

    public static int q(w wVar) {
        if (Objects.equals(wVar.f61761o, "video/avc")) {
            return 1;
        }
        return (Objects.equals(wVar.f61761o, "video/hevc") || s0.b(wVar.f61757k, "video/hevc")) ? 2 : 0;
    }

    private static b r(androidx.media3.container.h hVar) {
        hVar.l();
        return new b(hVar.f(6), hVar.f(6), hVar.f(3) - 1);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0067  */
    /* JADX WARN: Code duplicated, block: B:23:0x006d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077 A[SYNTHETIC] */
    private static c s(androidx.media3.container.h hVar, boolean z10, int i10, @p0 c cVar) {
        int[] iArr;
        int i11;
        boolean z11;
        int i12;
        int i13;
        boolean zE;
        int iF;
        int i14;
        int i15;
        int[] iArr2 = new int[6];
        if (!z10) {
            if (cVar != null) {
                int i16 = cVar.f62139a;
                zE = cVar.f62140b;
                iF = cVar.f62141c;
                i14 = cVar.f62142d;
                iArr2 = cVar.f62143e;
                i11 = i16;
            } else {
                iArr = iArr2;
                i11 = 0;
                z11 = false;
                i12 = 0;
                i13 = 0;
            }
            int iF2 = hVar.f(8);
            i15 = 0;
            for (int i17 = 0; i17 < i10; i17++) {
                if (hVar.e()) {
                    i15 += 88;
                }
                if (hVar.e()) {
                    i15 += 8;
                }
            }
            hVar.m(i15);
            if (i10 > 0) {
                hVar.m((8 - i10) * 2);
            }
            return new c(i11, z11, i12, i13, iArr, iF2);
        }
        int iF3 = hVar.f(2);
        zE = hVar.e();
        iF = hVar.f(5);
        i14 = 0;
        for (int i18 = 0; i18 < 32; i18++) {
            if (hVar.e()) {
                i14 |= 1 << i18;
            }
        }
        for (int i19 = 0; i19 < 6; i19++) {
            iArr2[i19] = hVar.f(8);
        }
        i11 = iF3;
        iArr = iArr2;
        z11 = zE;
        i12 = iF;
        i13 = i14;
        int iF4 = hVar.f(8);
        i15 = 0;
        while (i17 < i10) {
            if (hVar.e()) {
                i15 += 88;
            }
            if (hVar.e()) {
                i15 += 8;
            }
        }
        hVar.m(i15);
        if (i10 > 0) {
            hVar.m((8 - i10) * 2);
        }
        return new c(i11, z11, i12, i13, iArr, iF4);
    }

    private static e t(androidx.media3.container.h hVar) {
        int i10;
        int i11;
        int iF;
        int iF2 = hVar.f(16);
        int iF3 = hVar.f(16);
        if (hVar.e()) {
            int i12 = 3 ^ 2;
            int iF4 = hVar.f(2);
            if (iF4 == 3) {
                hVar.l();
            }
            int iF5 = hVar.f(4);
            iF = hVar.f(4);
            i11 = iF5;
            i10 = iF4;
        } else {
            i10 = 0;
            i11 = 0;
            iF = 0;
        }
        if (hVar.e()) {
            int i13 = hVar.i();
            int i14 = hVar.i();
            int i15 = hVar.i();
            int i16 = hVar.i();
            iF2 = b(iF2, i10, i13, i14);
            iF3 = a(iF3, i10, i15, i16);
        }
        return new e(i10, i11, iF, iF2, iF3);
    }

    private static C0573f u(androidx.media3.container.h hVar, int i10) {
        int i11 = hVar.i();
        int i12 = i11 + 1;
        l6.a aVarT = l6.t(i12);
        int[] iArr = new int[i10];
        for (int i13 = 0; i13 < i12; i13++) {
            aVarT.a(t(hVar));
        }
        int i14 = 1;
        if (i12 <= 1 || !hVar.e()) {
            while (i14 < i10) {
                iArr[i14] = Math.min(i14, i11);
                i14++;
            }
        } else {
            int iH = com.google.common.math.c.h(i12, RoundingMode.CEILING);
            while (i14 < i10) {
                iArr[i14] = hVar.f(iH);
                i14++;
            }
        }
        return new C0573f(aVarT.e(), iArr);
    }

    @p0
    public static g v(byte[] bArr, int i10, int i11) {
        byte b10;
        int i12 = i10 + 2;
        do {
            i11--;
            b10 = bArr[i11];
            if (b10 != 0) {
                break;
            }
        } while (i11 > i12);
        if (b10 != 0 && i11 > i12) {
            androidx.media3.container.h hVar = new androidx.media3.container.h(bArr, i12, i11 + 1);
            while (hVar.c(16)) {
                int iF = hVar.f(8);
                int i13 = 0;
                while (iF == 255) {
                    i13 += 255;
                    iF = hVar.f(8);
                }
                int i14 = i13 + iF;
                int iF2 = hVar.f(8);
                int i15 = 0;
                while (iF2 == 255) {
                    i15 += 255;
                    iF2 = hVar.f(8);
                }
                int i16 = i15 + iF2;
                if (i16 == 0 || !hVar.c(i16)) {
                    break;
                }
                if (i14 == 176) {
                    int i17 = hVar.i();
                    boolean zE = hVar.e();
                    int i18 = zE ? hVar.i() : 0;
                    int i19 = hVar.i();
                    int i20 = -1;
                    int i21 = -1;
                    int iF3 = -1;
                    int iF4 = -1;
                    int i22 = -1;
                    int iF5 = -1;
                    for (int i23 = 0; i23 <= i19; i23++) {
                        i20 = hVar.i();
                        i21 = hVar.i();
                        iF3 = hVar.f(6);
                        if (iF3 == 63) {
                            return null;
                        }
                        iF4 = hVar.f(iF3 == 0 ? Math.max(0, i17 - 30) : Math.max(0, (iF3 + i17) - 31));
                        if (zE) {
                            int iF6 = hVar.f(6);
                            if (iF6 == 63) {
                                return null;
                            }
                            i22 = iF6;
                            iF5 = hVar.f(iF6 == 0 ? Math.max(0, i18 - 30) : Math.max(0, (iF6 + i18) - 31));
                        }
                        if (hVar.e()) {
                            hVar.m(10);
                        }
                    }
                    return new g(i17, i18, i19 + 1, i20, i21, iF3, iF4, i22, iF5);
                }
            }
        }
        return null;
    }

    public static h w(byte[] bArr, int i10, int i11, @p0 k kVar) {
        return x(bArr, i10 + 2, i11, r(new androidx.media3.container.h(bArr, i10, i11)), kVar);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b2  */
    public static h x(byte[] bArr, int i10, int i11, b bVar, @p0 k kVar) {
        int i12;
        int iB;
        int iA;
        int i13;
        int i14;
        int iMax;
        int i15;
        int iO;
        int i16;
        int i17;
        int i18;
        j jVar;
        int i19;
        int iP;
        C0573f c0573f;
        androidx.media3.container.h hVar = new androidx.media3.container.h(bArr, i10, i11);
        hVar.m(4);
        int iF = hVar.f(3);
        boolean z10 = bVar.f62137b != 0 && iF == 7;
        int i20 = (kVar == null || kVar.f62183b.isEmpty()) ? 0 : kVar.f62183b.get(Math.min(bVar.f62137b, kVar.f62183b.size() - 1)).f62134a;
        c cVarS = null;
        if (!z10) {
            hVar.l();
            cVarS = s(hVar, true, iF, null);
        } else if (kVar != null) {
            d dVar = kVar.f62184c;
            int i21 = dVar.f62146b[i20];
            if (dVar.f62145a.size() > i21) {
                cVarS = kVar.f62184c.f62145a.get(i21);
            }
        }
        int i22 = hVar.i();
        if (z10) {
            int iF2 = hVar.e() ? hVar.f(8) : -1;
            if (kVar == null || (c0573f = kVar.f62185d) == null) {
                iA = 0;
                i13 = 0;
                i14 = 0;
                i12 = 0;
                iB = 0;
            } else {
                if (iF2 == -1) {
                    iF2 = c0573f.f62153b[i20];
                }
                if (iF2 == -1 || c0573f.f62152a.size() <= iF2) {
                    iA = 0;
                    i13 = 0;
                    i14 = 0;
                    i12 = 0;
                    iB = 0;
                } else {
                    e eVar = kVar.f62185d.f62152a.get(iF2);
                    i12 = eVar.f62147a;
                    iB = eVar.f62150d;
                    iA = eVar.f62151e;
                    i13 = eVar.f62148b;
                    i14 = eVar.f62149c;
                }
            }
        } else {
            i12 = hVar.i();
            if (i12 == 3) {
                hVar.l();
            }
            int i23 = hVar.i();
            int i24 = hVar.i();
            if (hVar.e()) {
                int i25 = hVar.i();
                int i26 = hVar.i();
                int i27 = hVar.i();
                int i28 = hVar.i();
                iB = b(i23, i12, i25, i26);
                iA = a(i24, i12, i27, i28);
            } else {
                iB = i23;
                iA = i24;
            }
            i13 = hVar.i();
            i14 = hVar.i();
        }
        int i29 = hVar.i();
        if (z10) {
            iMax = -1;
        } else {
            iMax = -1;
            for (int i30 = hVar.e() ? 0 : iF; i30 <= iF; i30++) {
                hVar.i();
                iMax = Math.max(hVar.i(), iMax);
                hVar.i();
            }
        }
        hVar.i();
        hVar.i();
        hVar.i();
        hVar.i();
        hVar.i();
        hVar.i();
        if (hVar.e()) {
            if (z10 ? hVar.e() : false) {
                hVar.m(6);
            } else if (hVar.e()) {
                I(hVar);
            }
        }
        int i31 = 2;
        hVar.m(2);
        if (hVar.e()) {
            hVar.m(8);
            hVar.i();
            hVar.i();
            hVar.l();
        }
        J(hVar);
        if (hVar.e()) {
            int i32 = hVar.i();
            int i33 = 0;
            while (i33 < i32) {
                hVar.m(i29 + 5);
                i33++;
                i31 = 2;
            }
        }
        hVar.m(i31);
        float f10 = 1.0f;
        if (hVar.e()) {
            if (hVar.e()) {
                int iF3 = hVar.f(8);
                if (iF3 == 255) {
                    int iF4 = hVar.f(16);
                    int iF5 = hVar.f(16);
                    if (iF4 != 0 && iF5 != 0) {
                        f10 = iF4 / iF5;
                    }
                } else {
                    float[] fArr = E;
                    if (iF3 < fArr.length) {
                        f10 = fArr[iF3];
                    } else {
                        z.n(f62108a, "Unexpected aspect_ratio_idc value: " + iF3);
                    }
                }
            }
            if (hVar.e()) {
                hVar.l();
            }
            if (hVar.e()) {
                hVar.m(3);
                i18 = hVar.e() ? 1 : 2;
                if (hVar.e()) {
                    int iF6 = hVar.f(8);
                    int iF7 = hVar.f(8);
                    hVar.m(8);
                    iO = androidx.media3.common.k.o(iF6);
                    iP = androidx.media3.common.k.p(iF7);
                } else {
                    iP = -1;
                    iO = -1;
                }
            } else if (kVar == null || (jVar = kVar.f62186e) == null || jVar.f62180a.size() <= (i19 = jVar.f62181b[i20])) {
                i18 = -1;
                iP = -1;
                iO = -1;
            } else {
                i iVar = kVar.f62186e.f62180a.get(i19);
                iO = iVar.f62177a;
                int i34 = iVar.f62178b;
                iP = iVar.f62179c;
                i18 = i34;
            }
            if (hVar.e()) {
                hVar.i();
                hVar.i();
            }
            hVar.l();
            if (hVar.e()) {
                iA *= 2;
            }
            int i35 = i14;
            i16 = i18;
            i15 = i35;
            i17 = iP;
        } else {
            i15 = i14;
            iO = -1;
            i16 = -1;
            i17 = -1;
        }
        return new h(bVar, iF, cVarS, i12, i13, i15, i22, iB, iA, f10, iMax, iO, i16, i17);
    }

    private static i y(androidx.media3.container.h hVar) {
        hVar.m(3);
        int i10 = hVar.e() ? 1 : 2;
        int iO = androidx.media3.common.k.o(hVar.f(8));
        int iP = androidx.media3.common.k.p(hVar.f(8));
        hVar.m(8);
        return new i(iO, i10, iP);
    }

    private static j z(androidx.media3.container.h hVar, int i10, int i11, int[] iArr) {
        if (!hVar.e() ? hVar.e() : true) {
            hVar.l();
        }
        boolean zE = hVar.e();
        boolean zE2 = hVar.e();
        if (zE || zE2) {
            for (int i12 = 0; i12 < i11; i12++) {
                for (int i13 = 0; i13 < iArr[i12]; i13++) {
                    boolean zE3 = zE ? hVar.e() : false;
                    boolean zE4 = zE2 ? hVar.e() : false;
                    if (zE3) {
                        hVar.m(32);
                    }
                    if (zE4) {
                        hVar.m(18);
                    }
                }
            }
        }
        boolean zE5 = hVar.e();
        int iF = zE5 ? hVar.f(4) + 1 : i10;
        l6.a aVarT = l6.t(iF);
        int[] iArr2 = new int[i10];
        for (int i14 = 0; i14 < iF; i14++) {
            aVarT.a(y(hVar));
        }
        if (zE5 && iF > 1) {
            for (int i15 = 0; i15 < i10; i15++) {
                iArr2[i15] = hVar.f(4);
            }
        }
        return new j(aVarT.e(), iArr2);
    }
}
