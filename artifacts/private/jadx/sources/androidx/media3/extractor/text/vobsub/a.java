package androidx.media3.extractor.text.vobsub;

import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.n0;
import androidx.media3.common.util.o;
import androidx.media3.common.util.o0;
import androidx.media3.common.util.z;
import androidx.media3.extractor.text.d;
import androidx.media3.extractor.text.r;
import com.google.common.collect.l6;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class a implements r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f68830e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f68831f = "VobsubParser";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f68832g = 5000000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o0 f68833a = new o0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o0 f68834b = new o0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f68835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private Inflater f68836d;

    private static final class b {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f68837j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f68838k = 1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f68839l = 2;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int f68840m = 3;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int f68841n = 4;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final int f68842o = 5;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final int f68843p = 6;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final int f68844q = 255;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f68846b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f68847c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int[] f68848d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f68849e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f68850f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @p0
        private Rect f68851g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f68845a = new int[4];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f68852h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f68853i = -1;

        /* JADX INFO: renamed from: androidx.media3.extractor.text.vobsub.a$b$a, reason: collision with other inner class name */
        private static final class C0619a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f68854a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f68855b;

            private C0619a() {
            }
        }

        public b() {
            int i10 = 4 | (-1);
        }

        private static int b(int[] iArr, int i10) {
            return (i10 < 0 || i10 >= iArr.length) ? iArr[0] : iArr[i10];
        }

        private static int c(String str) {
            try {
                return Integer.parseInt(str, 16);
            } catch (RuntimeException unused) {
                return 0;
            }
        }

        private void d(int[] iArr, o0 o0Var, int i10) {
            while (o0Var.f() < i10 && o0Var.a() > 0) {
                switch (o0Var.L()) {
                    case 0:
                    case 1:
                    case 2:
                        continue;
                    case 3:
                        if (!g(iArr, o0Var)) {
                        }
                        break;
                    case 4:
                        if (!e(o0Var)) {
                        }
                        break;
                    case 5:
                        if (!f(o0Var)) {
                        }
                        break;
                    case 6:
                        if (!h(o0Var)) {
                        }
                        break;
                }
            }
        }

        private boolean e(o0 o0Var) {
            if (o0Var.a() >= 2 && this.f68847c) {
                int iL = o0Var.L();
                int iL2 = o0Var.L();
                int[] iArr = this.f68845a;
                iArr[3] = n(iArr[3], iL >> 4);
                int[] iArr2 = this.f68845a;
                iArr2[2] = n(iArr2[2], iL & 15);
                int[] iArr3 = this.f68845a;
                iArr3[1] = n(iArr3[1], iL2 >> 4);
                int[] iArr4 = this.f68845a;
                iArr4[0] = n(iArr4[0], iL2 & 15);
                return true;
            }
            return false;
        }

        private boolean f(o0 o0Var) {
            if (o0Var.a() < 6) {
                return false;
            }
            int iL = o0Var.L();
            int iL2 = o0Var.L();
            int i10 = (iL << 4) | (iL2 >> 4);
            int iL3 = ((iL2 & 15) << 8) | o0Var.L();
            int iL4 = o0Var.L();
            int iL5 = o0Var.L();
            this.f68851g = new Rect(i10, (iL4 << 4) | (iL5 >> 4), iL3 + 1, (o0Var.L() | ((iL5 & 15) << 8)) + 1);
            return true;
        }

        private boolean g(int[] iArr, o0 o0Var) {
            if (o0Var.a() < 2) {
                return false;
            }
            int iL = o0Var.L();
            int iL2 = o0Var.L();
            this.f68845a[3] = b(iArr, iL >> 4);
            this.f68845a[2] = b(iArr, iL & 15);
            int i10 = 7 | 1;
            this.f68845a[1] = b(iArr, iL2 >> 4);
            this.f68845a[0] = b(iArr, iL2 & 15);
            this.f68847c = true;
            return true;
        }

        private boolean h(o0 o0Var) {
            if (o0Var.a() < 4) {
                return false;
            }
            this.f68852h = o0Var.T();
            this.f68853i = o0Var.T();
            return true;
        }

        private void j(n0 n0Var, boolean z10, Rect rect, int[] iArr) {
            int iWidth = rect.width();
            int iHeight = rect.height();
            int i10 = !z10 ? 1 : 0;
            int i11 = i10 * iWidth;
            C0619a c0619a = new C0619a();
            while (true) {
                int i12 = 0;
                do {
                    k(n0Var, iWidth, c0619a);
                    int iMin = Math.min(c0619a.f68855b, iWidth - i12);
                    if (iMin > 0) {
                        int i13 = i11 + iMin;
                        Arrays.fill(iArr, i11, i13, this.f68845a[c0619a.f68854a]);
                        i12 += iMin;
                        i11 = i13;
                    }
                } while (i12 < iWidth);
                i10 += 2;
                if (i10 >= iHeight) {
                    return;
                }
                i11 = i10 * iWidth;
                n0Var.c();
            }
        }

        private static void k(n0 n0Var, int i10, C0619a c0619a) {
            int iH = 0;
            for (int i11 = 1; iH < i11 && i11 <= 64; i11 <<= 2) {
                if (n0Var.b() < 4) {
                    c0619a.f68854a = -1;
                    c0619a.f68855b = 0;
                    return;
                }
                iH = (iH << 4) | n0Var.h(4);
            }
            c0619a.f68854a = iH & 3;
            if (iH >= 4) {
                i10 = iH >> 2;
            }
            c0619a.f68855b = i10;
        }

        private static int n(int i10, int i11) {
            return (i10 & 16777215) | ((i11 * 17) << 24);
        }

        @p0
        public androidx.media3.common.text.a a(o0 o0Var) {
            Rect rect;
            if (this.f68848d != null && this.f68846b && this.f68847c && (rect = this.f68851g) != null && this.f68852h != -1 && this.f68853i != -1 && rect.width() >= 2 && this.f68851g.height() >= 2) {
                Rect rect2 = this.f68851g;
                int[] iArr = new int[rect2.width() * rect2.height()];
                n0 n0Var = new n0();
                o0Var.a0(this.f68852h);
                n0Var.n(o0Var);
                j(n0Var, true, rect2, iArr);
                o0Var.a0(this.f68853i);
                n0Var.n(o0Var);
                int i10 = 6 | 0;
                j(n0Var, false, rect2, iArr);
                return new androidx.media3.common.text.a.c().r(Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888)).w(rect2.left / this.f68849e).x(0).t(rect2.top / this.f68850f, 0).u(0).z(rect2.width() / this.f68849e).s(rect2.height() / this.f68850f).a();
            }
            return null;
        }

        public void i(String str) {
            for (String str2 : k1.l2(str.trim(), "\\r?\\n")) {
                if (str2.startsWith("palette: ")) {
                    String[] strArrL2 = k1.l2(str2.substring(9), ",");
                    this.f68848d = new int[strArrL2.length];
                    for (int i10 = 0; i10 < strArrL2.length; i10++) {
                        this.f68848d[i10] = c(strArrL2[i10].trim());
                    }
                } else if (str2.startsWith("size: ")) {
                    String[] strArrL3 = k1.l2(str2.substring(6).trim(), "x");
                    if (strArrL3.length == 2) {
                        try {
                            this.f68849e = Integer.parseInt(strArrL3[0]);
                            this.f68850f = Integer.parseInt(strArrL3[1]);
                            this.f68846b = true;
                        } catch (RuntimeException e10) {
                            z.o(a.f68831f, "Parsing IDX failed", e10);
                        }
                    }
                }
            }
        }

        public void l(o0 o0Var) {
            int[] iArr = this.f68848d;
            if (iArr == null || !this.f68846b) {
                return;
            }
            o0Var.b0(o0Var.T() - 2);
            d(iArr, o0Var, o0Var.T());
        }

        public void m() {
            this.f68847c = false;
            this.f68851g = null;
            this.f68852h = -1;
            this.f68853i = -1;
        }
    }

    public a(List<byte[]> list) {
        b bVar = new b();
        this.f68835c = bVar;
        bVar.i(new String(list.get(0), StandardCharsets.UTF_8));
    }

    @p0
    private androidx.media3.common.text.a e() {
        if (this.f68836d == null) {
            this.f68836d = new Inflater();
        }
        if (k1.v1(this.f68833a, this.f68834b, this.f68836d)) {
            this.f68833a.Y(this.f68834b.e(), this.f68834b.g());
        }
        this.f68835c.m();
        int iA = this.f68833a.a();
        if (iA < 2 || this.f68833a.T() != iA) {
            return null;
        }
        this.f68835c.l(this.f68833a);
        return this.f68835c.a(this.f68833a);
    }

    @Override // androidx.media3.extractor.text.r
    public void a(byte[] bArr, int i10, int i11, r.b bVar, o<d> oVar) {
        this.f68833a.Y(bArr, i11 + i10);
        this.f68833a.a0(i10);
        androidx.media3.common.text.a aVarE = e();
        oVar.accept(new d(aVarE != null ? l6.G(aVarE) : l6.F(), -9223372036854775807L, 5000000L));
    }

    @Override // androidx.media3.extractor.text.r
    public int b() {
        return 2;
    }
}
