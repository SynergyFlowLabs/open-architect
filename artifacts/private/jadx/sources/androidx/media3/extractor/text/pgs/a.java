package androidx.media3.extractor.text.pgs;

import android.graphics.Bitmap;
import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.o;
import androidx.media3.common.util.o0;
import androidx.media3.extractor.text.d;
import androidx.media3.extractor.text.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class a implements r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f68551e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f68552f = 20;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f68553g = 21;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f68554h = 22;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f68555i = 128;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o0 f68556a = new o0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o0 f68557b = new o0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0615a f68558c = new C0615a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private Inflater f68559d;

    /* JADX INFO: renamed from: androidx.media3.extractor.text.pgs.a$a, reason: collision with other inner class name */
    private static final class C0615a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o0 f68560a = new o0();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f68561b = new int[256];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f68562c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f68563d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f68564e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f68565f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f68566g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f68567h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f68568i;

        /* JADX INFO: Access modifiers changed from: private */
        public void e(o0 o0Var, int i10) {
            int iF;
            int iG;
            int iO;
            if (i10 >= 4) {
                o0Var.b0(3);
                int i11 = i10 - 4;
                if (!((o0Var.L() & 128) != 0)) {
                    iF = this.f68560a.f();
                    iG = this.f68560a.g();
                    if (iF < iG && i11 > 0) {
                        int iMin = Math.min(i11, iG - iF);
                        o0Var.n(this.f68560a.e(), iF, iMin);
                        this.f68560a.a0(iF + iMin);
                    }
                } else if (i11 >= 7 && (iO = o0Var.O()) >= 4) {
                    this.f68567h = o0Var.T();
                    this.f68568i = o0Var.T();
                    this.f68560a.W(iO - 4);
                    i11 = i10 - 11;
                    iF = this.f68560a.f();
                    iG = this.f68560a.g();
                    if (iF < iG) {
                        int iMin2 = Math.min(i11, iG - iF);
                        o0Var.n(this.f68560a.e(), iF, iMin2);
                        this.f68560a.a0(iF + iMin2);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(o0 o0Var, int i10) {
            if (i10 < 19) {
                return;
            }
            this.f68563d = o0Var.T();
            this.f68564e = o0Var.T();
            o0Var.b0(11);
            this.f68565f = o0Var.T();
            this.f68566g = o0Var.T();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(o0 o0Var, int i10) {
            if (i10 % 5 != 2) {
                return;
            }
            o0Var.b0(2);
            Arrays.fill(this.f68561b, 0);
            int i11 = i10 / 5;
            for (int i12 = 0; i12 < i11; i12++) {
                int iL = o0Var.L();
                int iL2 = o0Var.L();
                int iL3 = o0Var.L();
                int iL4 = o0Var.L();
                double d10 = iL2;
                double d11 = iL3 - 128;
                double d12 = iL4 - 128;
                this.f68561b[iL] = (k1.w((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255) << 8) | (o0Var.L() << 24) | (k1.w((int) ((1.402d * d11) + d10), 0, 255) << 16) | k1.w((int) (d10 + (d12 * 1.772d)), 0, 255);
            }
            this.f68562c = true;
        }

        @p0
        public androidx.media3.common.text.a d() {
            int iL;
            if (this.f68563d == 0 || this.f68564e == 0 || this.f68567h == 0 || this.f68568i == 0 || this.f68560a.g() == 0 || this.f68560a.f() != this.f68560a.g() || !this.f68562c) {
                return null;
            }
            this.f68560a.a0(0);
            int i10 = this.f68567h * this.f68568i;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int iL2 = this.f68560a.L();
                if (iL2 != 0) {
                    iL = i11 + 1;
                    iArr[i11] = this.f68561b[iL2];
                } else {
                    int iL3 = this.f68560a.L();
                    if (iL3 != 0) {
                        iL = ((iL3 & 64) == 0 ? iL3 & 63 : ((iL3 & 63) << 8) | this.f68560a.L()) + i11;
                        Arrays.fill(iArr, i11, iL, (iL3 & 128) == 0 ? this.f68561b[0] : this.f68561b[this.f68560a.L()]);
                    }
                }
                i11 = iL;
            }
            return new androidx.media3.common.text.a.c().r(Bitmap.createBitmap(iArr, this.f68567h, this.f68568i, Bitmap.Config.ARGB_8888)).w(this.f68565f / this.f68563d).x(0).t(this.f68566g / this.f68564e, 0).u(0).z(this.f68567h / this.f68563d).s(this.f68568i / this.f68564e).a();
        }

        public void h() {
            this.f68563d = 0;
            this.f68564e = 0;
            this.f68565f = 0;
            this.f68566g = 0;
            this.f68567h = 0;
            this.f68568i = 0;
            this.f68560a.W(0);
            this.f68562c = false;
        }
    }

    @p0
    private static androidx.media3.common.text.a e(o0 o0Var, C0615a c0615a) {
        int iG = o0Var.g();
        int iL = o0Var.L();
        int iT = o0Var.T();
        int iF = o0Var.f() + iT;
        androidx.media3.common.text.a aVarD = null;
        if (iF > iG) {
            o0Var.a0(iG);
            return null;
        }
        if (iL != 128) {
            switch (iL) {
                case 20:
                    c0615a.g(o0Var, iT);
                    break;
                case 21:
                    c0615a.e(o0Var, iT);
                    break;
                case 22:
                    c0615a.f(o0Var, iT);
                    break;
            }
        } else {
            aVarD = c0615a.d();
            c0615a.h();
        }
        o0Var.a0(iF);
        return aVarD;
    }

    @Override // androidx.media3.extractor.text.r
    public void a(byte[] bArr, int i10, int i11, r.b bVar, o<d> oVar) {
        this.f68556a.Y(bArr, i11 + i10);
        this.f68556a.a0(i10);
        if (this.f68559d == null) {
            this.f68559d = new Inflater();
        }
        if (k1.v1(this.f68556a, this.f68557b, this.f68559d)) {
            this.f68556a.Y(this.f68557b.e(), this.f68557b.g());
        }
        this.f68558c.h();
        ArrayList arrayList = new ArrayList();
        while (this.f68556a.a() >= 3) {
            androidx.media3.common.text.a aVarE = e(this.f68556a, this.f68558c);
            if (aVarE != null) {
                arrayList.add(aVarE);
            }
        }
        oVar.accept(new d(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // androidx.media3.extractor.text.r
    public int b() {
        return 2;
    }
}
