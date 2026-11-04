package androidx.media2.exoplayer.external.text.pgs;

import android.graphics.Bitmap;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.text.c;
import androidx.media2.exoplayer.external.text.e;
import androidx.media2.exoplayer.external.text.g;
import androidx.media2.exoplayer.external.util.q0;
import androidx.media2.exoplayer.external.util.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class a extends c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f56789s = 20;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f56790t = 21;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f56791u = 22;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f56792v = 128;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final byte f56793w = 120;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final x f56794o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final x f56795p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final C0526a f56796q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @p0
    private Inflater f56797r;

    /* JADX INFO: renamed from: androidx.media2.exoplayer.external.text.pgs.a$a, reason: collision with other inner class name */
    private static final class C0526a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x f56798a = new x();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f56799b = new int[256];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f56800c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f56801d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f56802e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f56803f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f56804g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f56805h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f56806i;

        /* JADX INFO: Access modifiers changed from: private */
        public void e(x buffer, int sectionLength) {
            int iC;
            int iD;
            int iG;
            if (sectionLength >= 4) {
                buffer.R(3);
                int i10 = sectionLength - 4;
                if (!((buffer.D() & 128) != 0)) {
                    iC = this.f56798a.c();
                    iD = this.f56798a.d();
                    if (iC < iD && i10 > 0) {
                        int iMin = Math.min(i10, iD - iC);
                        buffer.i(this.f56798a.f57720a, iC, iMin);
                        this.f56798a.Q(iC + iMin);
                    }
                } else if (i10 >= 7 && (iG = buffer.G()) >= 4) {
                    this.f56805h = buffer.J();
                    this.f56806i = buffer.J();
                    this.f56798a.M(iG - 4);
                    i10 = sectionLength - 11;
                    iC = this.f56798a.c();
                    iD = this.f56798a.d();
                    if (iC < iD) {
                        int iMin2 = Math.min(i10, iD - iC);
                        buffer.i(this.f56798a.f57720a, iC, iMin2);
                        this.f56798a.Q(iC + iMin2);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(x buffer, int sectionLength) {
            if (sectionLength < 19) {
                return;
            }
            this.f56801d = buffer.J();
            this.f56802e = buffer.J();
            buffer.R(11);
            this.f56803f = buffer.J();
            this.f56804g = buffer.J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(x buffer, int sectionLength) {
            if (sectionLength % 5 != 2) {
                return;
            }
            buffer.R(2);
            Arrays.fill(this.f56799b, 0);
            int i10 = sectionLength / 5;
            for (int i11 = 0; i11 < i10; i11++) {
                int iD = buffer.D();
                int iD2 = buffer.D();
                int iD3 = buffer.D();
                int iD4 = buffer.D();
                double d10 = iD2;
                double d11 = iD3 - 128;
                double d12 = iD4 - 128;
                this.f56799b[iD] = (q0.r((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255) << 8) | (buffer.D() << 24) | (q0.r((int) ((1.402d * d11) + d10), 0, 255) << 16) | q0.r((int) (d10 + (d12 * 1.772d)), 0, 255);
            }
            this.f56800c = true;
        }

        @p0
        public androidx.media2.exoplayer.external.text.b d() {
            int iD;
            if (this.f56801d == 0 || this.f56802e == 0 || this.f56805h == 0 || this.f56806i == 0 || this.f56798a.d() == 0 || this.f56798a.c() != this.f56798a.d() || !this.f56800c) {
                return null;
            }
            this.f56798a.Q(0);
            int i10 = this.f56805h * this.f56806i;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int iD2 = this.f56798a.D();
                if (iD2 != 0) {
                    iD = i11 + 1;
                    iArr[i11] = this.f56799b[iD2];
                } else {
                    int iD3 = this.f56798a.D();
                    if (iD3 != 0) {
                        iD = ((iD3 & 64) == 0 ? iD3 & 63 : ((iD3 & 63) << 8) | this.f56798a.D()) + i11;
                        Arrays.fill(iArr, i11, iD, (iD3 & 128) == 0 ? 0 : this.f56799b[this.f56798a.D()]);
                    }
                }
                i11 = iD;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, this.f56805h, this.f56806i, Bitmap.Config.ARGB_8888);
            float f10 = this.f56803f;
            int i12 = this.f56801d;
            float f11 = f10 / i12;
            float f12 = this.f56804g;
            int i13 = this.f56802e;
            return new androidx.media2.exoplayer.external.text.b(bitmapCreateBitmap, f11, 0, f12 / i13, 0, this.f56805h / i12, this.f56806i / i13);
        }

        public void h() {
            this.f56801d = 0;
            this.f56802e = 0;
            this.f56803f = 0;
            this.f56804g = 0;
            this.f56805h = 0;
            this.f56806i = 0;
            this.f56798a.M(0);
            this.f56800c = false;
        }
    }

    public a() {
        super("PgsDecoder");
        this.f56794o = new x();
        this.f56795p = new x();
        this.f56796q = new C0526a();
    }

    private void B(x buffer) {
        if (buffer.a() <= 0 || buffer.f() != 120) {
            return;
        }
        if (this.f56797r == null) {
            this.f56797r = new Inflater();
        }
        if (q0.m0(buffer, this.f56795p, this.f56797r)) {
            x xVar = this.f56795p;
            buffer.O(xVar.f57720a, xVar.d());
        }
    }

    @p0
    private static androidx.media2.exoplayer.external.text.b C(x buffer, C0526a cueBuilder) {
        int iD = buffer.d();
        int iD2 = buffer.D();
        int iJ = buffer.J();
        int iC = buffer.c() + iJ;
        androidx.media2.exoplayer.external.text.b bVarD = null;
        if (iC > iD) {
            buffer.Q(iD);
            return null;
        }
        if (iD2 != 128) {
            switch (iD2) {
                case 20:
                    cueBuilder.g(buffer, iJ);
                    break;
                case 21:
                    cueBuilder.e(buffer, iJ);
                    break;
                case 22:
                    cueBuilder.f(buffer, iJ);
                    break;
            }
        } else {
            bVarD = cueBuilder.d();
            cueBuilder.h();
        }
        buffer.Q(iC);
        return bVarD;
    }

    @Override // androidx.media2.exoplayer.external.text.c
    protected e y(byte[] data, int size, boolean reset) throws g {
        this.f56794o.O(data, size);
        B(this.f56794o);
        this.f56796q.h();
        ArrayList arrayList = new ArrayList();
        while (this.f56794o.a() >= 3) {
            androidx.media2.exoplayer.external.text.b bVarC = C(this.f56794o, this.f56796q);
            if (bVarC != null) {
                arrayList.add(bVarC);
            }
        }
        return new b(Collections.unmodifiableList(arrayList));
    }
}
