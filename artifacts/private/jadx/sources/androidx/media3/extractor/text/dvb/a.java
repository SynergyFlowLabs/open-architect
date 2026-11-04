package androidx.media3.extractor.text.dvb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.n0;
import androidx.media3.common.util.o;
import androidx.media3.common.util.o0;
import androidx.media3.common.util.z;
import androidx.media3.extractor.text.r;
import com.google.common.collect.l6;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class a implements r {
    private static final byte[] A = {0, 7, 8, com.google.common.base.c.f116464q};
    private static final byte[] B = {0, 119, -120, -1};
    private static final byte[] C = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, com.fasterxml.jackson.core.json.a.f102488j, org.msgpack.core.h.a.f339281q, org.msgpack.core.h.a.H, -18, -1};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f68448h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f68449i = "DvbParser";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f68450j = 16;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f68451k = 17;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f68452l = 18;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f68453m = 19;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f68454n = 20;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f68455o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f68456p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f68457q = 3;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f68458r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f68459s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f68460t = 16;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f68461u = 17;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f68462v = 18;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f68463w = 32;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f68464x = 33;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f68465y = 34;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f68466z = 240;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f68467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f68468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Canvas f68469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f68470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C0614a f68471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h f68472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Bitmap f68473g;

    /* JADX INFO: renamed from: androidx.media3.extractor.text.dvb.a$a, reason: collision with other inner class name */
    private static final class C0614a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f68474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f68475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f68476c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f68477d;

        public C0614a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f68474a = i10;
            this.f68475b = iArr;
            this.f68476c = iArr2;
            this.f68477d = iArr3;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f68478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f68479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f68480c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f68481d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f68482e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f68483f;

        public b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f68478a = i10;
            this.f68479b = i11;
            this.f68480c = i12;
            this.f68481d = i13;
            this.f68482e = i14;
            this.f68483f = i15;
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f68484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f68485b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f68486c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f68487d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f68484a = i10;
            this.f68485b = z10;
            this.f68486c = bArr;
            this.f68487d = bArr2;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f68488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f68489b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f68490c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray<e> f68491d;

        public d(int i10, int i11, int i12, SparseArray<e> sparseArray) {
            this.f68488a = i10;
            this.f68489b = i11;
            this.f68490c = i12;
            this.f68491d = sparseArray;
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f68492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f68493b;

        public e(int i10, int i11) {
            this.f68492a = i10;
            this.f68493b = i11;
        }
    }

    private static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f68494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f68495b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f68496c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f68497d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f68498e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f68499f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f68500g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f68501h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f68502i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f68503j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final SparseArray<g> f68504k;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray<g> sparseArray) {
            this.f68494a = i10;
            this.f68495b = z10;
            this.f68496c = i11;
            this.f68497d = i12;
            this.f68498e = i13;
            this.f68499f = i14;
            this.f68500g = i15;
            this.f68501h = i16;
            this.f68502i = i17;
            this.f68503j = i18;
            this.f68504k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray<g> sparseArray = fVar.f68504k;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                this.f68504k.put(sparseArray.keyAt(i10), sparseArray.valueAt(i10));
            }
        }
    }

    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f68505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f68506b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f68507c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f68508d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f68509e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f68510f;

        public g(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f68505a = i10;
            this.f68506b = i11;
            this.f68507c = i12;
            this.f68508d = i13;
            this.f68509e = i14;
            this.f68510f = i15;
        }
    }

    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f68511a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f68512b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseArray<f> f68513c = new SparseArray<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray<C0614a> f68514d = new SparseArray<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SparseArray<c> f68515e = new SparseArray<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final SparseArray<C0614a> f68516f = new SparseArray<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final SparseArray<c> f68517g = new SparseArray<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @p0
        public b f68518h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @p0
        public d f68519i;

        public h(int i10, int i11) {
            this.f68511a = i10;
            this.f68512b = i11;
        }

        public void a() {
            this.f68513c.clear();
            this.f68514d.clear();
            this.f68515e.clear();
            this.f68516f.clear();
            this.f68517g.clear();
            this.f68518h = null;
            this.f68519i = null;
        }
    }

    public a(List<byte[]> list) {
        o0 o0Var = new o0(list.get(0));
        int iT = o0Var.T();
        int iT2 = o0Var.T();
        Paint paint = new Paint();
        this.f68467a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f68468b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f68469c = new Canvas();
        this.f68470d = new b(androidx.media3.exoplayer.trackselection.a.F, 575, 0, androidx.media3.exoplayer.trackselection.a.F, 0, 575);
        this.f68471e = new C0614a(0, f(), g(), h());
        this.f68472f = new h(iT, iT2);
    }

    private static byte[] e(int i10, int i11, n0 n0Var) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) n0Var.h(i11);
        }
        return bArr;
    }

    private static int[] f() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] g() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = i(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = i(255, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] h() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = i(63, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & 136;
                int i12 = 170;
                int i13 = 85;
                if (i11 == 0) {
                    int i14 = ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0);
                    int i15 = ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0);
                    if ((i10 & 4) == 0) {
                        i13 = 0;
                    }
                    iArr[i10] = i(255, i14, i15, i13 + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 != 8) {
                    int i16 = 43;
                    if (i11 == 128) {
                        iArr[i10] = i(255, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                    } else if (i11 == 136) {
                        int i17 = ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0);
                        int i18 = ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0);
                        if ((i10 & 4) == 0) {
                            i16 = 0;
                        }
                        if ((i10 & 64) == 0) {
                            i13 = 0;
                        }
                        iArr[i10] = i(255, i17, i18, i16 + i13);
                    }
                } else {
                    int i19 = ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0);
                    int i20 = ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0);
                    i13 = (i10 & 4) == 0 ? 0 : 85;
                    if ((i10 & 64) == 0) {
                        i12 = 0;
                    }
                    iArr[i10] = i(127, i19, i20, i13 + i12);
                }
            }
        }
        return iArr;
    }

    private static int i(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    private static int j(n0 n0Var, int[] iArr, @p0 byte[] bArr, int i10, int i11, @p0 Paint paint, Canvas canvas) {
        int i12;
        int iH;
        int iH2;
        boolean z10 = false;
        while (true) {
            int iH3 = n0Var.h(2);
            if (iH3 != 0) {
                z10 = z10;
                i12 = 1;
            } else {
                if (n0Var.g()) {
                    iH = n0Var.h(3) + 3;
                    iH2 = n0Var.h(2);
                } else {
                    if (n0Var.g()) {
                        i12 = 1;
                    } else {
                        int iH4 = n0Var.h(2);
                        if (iH4 == 0) {
                            z10 = true;
                        } else if (iH4 == 1) {
                            i12 = 2;
                        } else if (iH4 == 2) {
                            iH = n0Var.h(4) + 12;
                            iH2 = n0Var.h(2);
                        } else if (iH4 != 3) {
                            z10 = z10;
                        } else {
                            iH = n0Var.h(8) + 29;
                            iH2 = n0Var.h(2);
                        }
                        iH3 = 0;
                        i12 = 0;
                    }
                    iH3 = 0;
                }
                z10 = z10;
                i12 = iH;
                iH3 = iH2;
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    iH3 = bArr[iH3];
                }
                paint.setColor(iArr[iH3]);
                canvas.drawRect(i10, i11, i10 + i12, 1 + i11, paint);
            }
            i10 += i12;
            if (z10) {
                return i10;
            }
            z10 = z10;
        }
    }

    private static int k(n0 n0Var, int[] iArr, @p0 byte[] bArr, int i10, int i11, @p0 Paint paint, Canvas canvas) {
        int i12;
        int iH;
        int iH2;
        boolean z10 = false;
        while (true) {
            int iH3 = n0Var.h(4);
            if (iH3 != 0) {
                z10 = z10;
                i12 = 1;
            } else if (n0Var.g()) {
                if (n0Var.g()) {
                    int iH4 = n0Var.h(2);
                    if (iH4 == 0) {
                        i12 = 1;
                        iH3 = 0;
                    } else if (iH4 == 1) {
                        iH3 = 0;
                        i12 = 2;
                        z10 = z10;
                    } else if (iH4 == 2) {
                        iH = n0Var.h(4) + 9;
                        iH2 = n0Var.h(4);
                    } else if (iH4 != 3) {
                        z10 = z10;
                        iH3 = 0;
                        i12 = 0;
                    } else {
                        iH = n0Var.h(8) + 25;
                        iH2 = n0Var.h(4);
                    }
                } else {
                    iH = n0Var.h(2) + 4;
                    iH2 = n0Var.h(4);
                }
                z10 = z10;
                i12 = iH;
                iH3 = iH2;
            } else {
                int iH5 = n0Var.h(3);
                if (iH5 != 0) {
                    i12 = iH5 + 2;
                    iH3 = 0;
                } else {
                    z10 = true;
                    iH3 = 0;
                    i12 = 0;
                }
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    iH3 = bArr[iH3];
                }
                paint.setColor(iArr[iH3]);
                canvas.drawRect(i10, i11, i10 + i12, 1 + i11, paint);
            }
            i10 += i12;
            if (z10) {
                return i10;
            }
            z10 = z10;
        }
    }

    private static int l(n0 n0Var, int[] iArr, @p0 byte[] bArr, int i10, int i11, @p0 Paint paint, Canvas canvas) {
        boolean z10;
        int iH;
        boolean z11 = false;
        while (true) {
            int iH2 = n0Var.h(8);
            if (iH2 != 0) {
                z10 = z11;
                iH = 1;
            } else if (n0Var.g()) {
                z10 = z11;
                iH = n0Var.h(7);
                iH2 = n0Var.h(8);
            } else {
                int iH3 = n0Var.h(7);
                if (iH3 != 0) {
                    z10 = z11;
                    iH = iH3;
                    iH2 = 0;
                } else {
                    z10 = true;
                    iH2 = 0;
                    iH = 0;
                }
            }
            if (iH != 0 && paint != null) {
                if (bArr != null) {
                    iH2 = bArr[iH2];
                }
                paint.setColor(iArr[iH2]);
                canvas.drawRect(i10, i11, i10 + iH, 1 + i11, paint);
            }
            i10 += iH;
            if (z10) {
                return i10;
            }
            z11 = z10;
        }
    }

    private static void m(byte[] bArr, int[] iArr, int i10, int i11, int i12, @p0 Paint paint, Canvas canvas) {
        int[] iArr2;
        Paint paint2;
        Canvas canvas2;
        byte[] bArr2;
        byte[] bArr3;
        n0 n0Var = new n0(bArr);
        byte[] bArrE = null;
        byte[] bArrE2 = null;
        int iJ = i11;
        int i13 = i12;
        byte[] bArrE3 = null;
        while (n0Var.b() != 0) {
            int iH = n0Var.h(8);
            if (iH != 240) {
                switch (iH) {
                    case 16:
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        if (i10 != 3) {
                            if (i10 == 2) {
                                bArr3 = bArrE2 == null ? A : bArrE2;
                            } else {
                                bArr2 = null;
                            }
                            iJ = j(n0Var, iArr2, bArr2, iJ, i13, paint2, canvas2);
                            n0Var.c();
                        } else {
                            bArr3 = bArrE3 == null ? B : bArrE3;
                        }
                        bArr2 = bArr3;
                        iJ = j(n0Var, iArr2, bArr2, iJ, i13, paint2, canvas2);
                        n0Var.c();
                        break;
                    case 17:
                        iArr2 = iArr;
                        Paint paint3 = paint;
                        canvas2 = canvas;
                        paint2 = paint3;
                        iJ = k(n0Var, iArr2, i10 == 3 ? bArrE == null ? C : bArrE : null, iJ, i13, paint2, canvas2);
                        n0Var.c();
                        break;
                    case 18:
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        iJ = l(n0Var, iArr2, null, iJ, i13, paint2, canvas2);
                        break;
                    default:
                        switch (iH) {
                            case 32:
                                bArrE2 = e(4, 4, n0Var);
                                break;
                            case 33:
                                bArrE3 = e(4, 8, n0Var);
                                break;
                            case 34:
                                bArrE = e(16, 8, n0Var);
                                break;
                        }
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        break;
                }
            } else {
                iArr2 = iArr;
                paint2 = paint;
                canvas2 = canvas;
                i13 += 2;
                iJ = i11;
            }
            iArr = iArr2;
            paint = paint2;
            canvas = canvas2;
        }
    }

    private static void n(c cVar, C0614a c0614a, int i10, int i11, int i12, @p0 Paint paint, Canvas canvas) {
        int[] iArr;
        if (i10 == 3) {
            iArr = c0614a.f68477d;
        } else {
            iArr = i10 == 2 ? c0614a.f68476c : c0614a.f68475b;
        }
        int[] iArr2 = iArr;
        m(cVar.f68486c, iArr2, i10, i11, i12, paint, canvas);
        m(cVar.f68487d, iArr2, i10, i11, i12 + 1, paint, canvas);
    }

    private androidx.media3.extractor.text.d o(n0 n0Var) {
        int i10;
        while (n0Var.b() >= 48 && n0Var.h(8) == 15) {
            u(n0Var, this.f68472f);
        }
        h hVar = this.f68472f;
        d dVar = hVar.f68519i;
        if (dVar == null) {
            return new androidx.media3.extractor.text.d(l6.F(), -9223372036854775807L, -9223372036854775807L);
        }
        b bVar = hVar.f68518h;
        if (bVar == null) {
            bVar = this.f68470d;
        }
        Bitmap bitmap = this.f68473g;
        if (bitmap == null || bVar.f68478a + 1 != bitmap.getWidth() || bVar.f68479b + 1 != this.f68473g.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bVar.f68478a + 1, bVar.f68479b + 1, Bitmap.Config.ARGB_8888);
            this.f68473g = bitmapCreateBitmap;
            this.f68469c.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray = dVar.f68491d;
        int i11 = 0;
        while (i11 < sparseArray.size()) {
            this.f68469c.save();
            e eVarValueAt = sparseArray.valueAt(i11);
            f fVar = this.f68472f.f68513c.get(sparseArray.keyAt(i11));
            int i12 = eVarValueAt.f68492a + bVar.f68480c;
            int i13 = eVarValueAt.f68493b + bVar.f68482e;
            this.f68469c.clipRect(i12, i13, Math.min(fVar.f68496c + i12, bVar.f68481d), Math.min(fVar.f68497d + i13, bVar.f68483f));
            C0614a c0614a = this.f68472f.f68514d.get(fVar.f68500g);
            if (c0614a == null && (c0614a = this.f68472f.f68516f.get(fVar.f68500g)) == null) {
                c0614a = this.f68471e;
            }
            C0614a c0614a2 = c0614a;
            SparseArray<g> sparseArray2 = fVar.f68504k;
            int i14 = 0;
            while (i14 < sparseArray2.size()) {
                int iKeyAt = sparseArray2.keyAt(i14);
                g gVarValueAt = sparseArray2.valueAt(i14);
                c cVar = this.f68472f.f68515e.get(iKeyAt);
                if (cVar == null) {
                    cVar = this.f68472f.f68517g.get(iKeyAt);
                }
                if (cVar != null) {
                    n(cVar, c0614a2, fVar.f68499f, gVarValueAt.f68507c + i12, gVarValueAt.f68508d + i13, cVar.f68485b ? null : this.f68467a, this.f68469c);
                }
                i14++;
                sparseArray = sparseArray;
            }
            SparseArray<e> sparseArray3 = sparseArray;
            if (fVar.f68495b) {
                int i15 = fVar.f68499f;
                if (i15 == 3) {
                    i10 = c0614a2.f68477d[fVar.f68501h];
                } else {
                    i10 = i15 == 2 ? c0614a2.f68476c[fVar.f68502i] : c0614a2.f68475b[fVar.f68503j];
                }
                this.f68468b.setColor(i10);
                this.f68469c.drawRect(i12, i13, fVar.f68496c + i12, fVar.f68497d + i13, this.f68468b);
            }
            arrayList.add(new androidx.media3.common.text.a.c().r(Bitmap.createBitmap(this.f68473g, i12, i13, fVar.f68496c, fVar.f68497d)).w(i12 / bVar.f68478a).x(0).t(i13 / bVar.f68479b, 0).u(0).z(fVar.f68496c / bVar.f68478a).s(fVar.f68497d / bVar.f68479b).a());
            this.f68469c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f68469c.restore();
            i11++;
            sparseArray = sparseArray3;
        }
        return new androidx.media3.extractor.text.d(arrayList, -9223372036854775807L, -9223372036854775807L);
    }

    private static C0614a p(n0 n0Var, int i10) {
        int[] iArr;
        int iH;
        int i11;
        int iH2;
        int iH3;
        int iH4;
        int i12 = 8;
        int iH5 = n0Var.h(8);
        n0Var.s(8);
        int i13 = 2;
        int i14 = i10 - 2;
        int[] iArrF = f();
        int[] iArrG = g();
        int[] iArrH = h();
        while (i14 > 0) {
            int iH6 = n0Var.h(i12);
            int iH7 = n0Var.h(i12);
            if ((iH7 & 128) != 0) {
                iArr = iArrF;
            } else {
                iArr = (iH7 & 64) != 0 ? iArrG : iArrH;
            }
            if ((iH7 & 1) != 0) {
                iH3 = n0Var.h(i12);
                iH4 = n0Var.h(i12);
                iH = n0Var.h(i12);
                iH2 = n0Var.h(i12);
                i11 = i14 - 6;
            } else {
                int iH8 = n0Var.h(6) << i13;
                int iH9 = n0Var.h(4) << 4;
                iH = n0Var.h(4) << 4;
                i11 = i14 - 4;
                iH2 = n0Var.h(i13) << 6;
                iH3 = iH8;
                iH4 = iH9;
            }
            if (iH3 == 0) {
                iH2 = 255;
                iH4 = 0;
                iH = 0;
            }
            double d10 = iH3;
            double d11 = iH4 - 128;
            double d12 = iH - 128;
            iArr[iH6] = i((byte) (255 - (iH2 & 255)), k1.w((int) (d10 + (1.402d * d11)), 0, 255), k1.w((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255), k1.w((int) (d10 + (d12 * 1.772d)), 0, 255));
            i14 = i11;
            iH5 = iH5;
            i12 = 8;
            i13 = 2;
        }
        return new C0614a(iH5, iArrF, iArrG, iArrH);
    }

    private static b q(n0 n0Var) {
        int i10;
        int i11;
        int i12;
        int iH;
        n0Var.s(4);
        boolean zG = n0Var.g();
        n0Var.s(3);
        int iH2 = n0Var.h(16);
        int iH3 = n0Var.h(16);
        if (zG) {
            int iH4 = n0Var.h(16);
            int iH5 = n0Var.h(16);
            int iH6 = n0Var.h(16);
            iH = n0Var.h(16);
            i12 = iH5;
            i11 = iH6;
            i10 = iH4;
        } else {
            i10 = 0;
            i11 = 0;
            i12 = iH2;
            iH = iH3;
        }
        return new b(iH2, iH3, i10, i12, i11, iH);
    }

    private static c r(n0 n0Var) {
        byte[] bArr;
        int iH = n0Var.h(16);
        n0Var.s(4);
        int iH2 = n0Var.h(2);
        boolean zG = n0Var.g();
        n0Var.s(1);
        byte[] bArr2 = k1.f61545f;
        if (iH2 != 1) {
            if (iH2 == 0) {
                int iH3 = n0Var.h(16);
                int iH4 = n0Var.h(16);
                if (iH3 > 0) {
                    bArr2 = new byte[iH3];
                    n0Var.k(bArr2, 0, iH3);
                }
                if (iH4 > 0) {
                    bArr = new byte[iH4];
                    n0Var.k(bArr, 0, iH4);
                }
            }
            return new c(iH, zG, bArr2, bArr);
        }
        n0Var.s(n0Var.h(8) * 16);
        bArr = bArr2;
        return new c(iH, zG, bArr2, bArr);
    }

    private static d s(n0 n0Var, int i10) {
        int iH = n0Var.h(8);
        int iH2 = n0Var.h(4);
        int iH3 = n0Var.h(2);
        n0Var.s(2);
        int i11 = i10 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int iH4 = n0Var.h(8);
            n0Var.s(8);
            i11 -= 6;
            sparseArray.put(iH4, new e(n0Var.h(16), n0Var.h(16)));
        }
        return new d(iH, iH2, iH3, sparseArray);
    }

    private static f t(n0 n0Var, int i10) {
        int i11;
        int iH;
        int iH2;
        char c10;
        int iH3 = n0Var.h(8);
        int i12 = 4;
        n0Var.s(4);
        boolean zG = n0Var.g();
        n0Var.s(3);
        int i13 = 16;
        int iH4 = n0Var.h(16);
        int iH5 = n0Var.h(16);
        int iH6 = n0Var.h(3);
        int iH7 = n0Var.h(3);
        int i14 = 2;
        n0Var.s(2);
        int iH8 = n0Var.h(8);
        int iH9 = n0Var.h(8);
        int iH10 = n0Var.h(4);
        int iH11 = n0Var.h(2);
        n0Var.s(2);
        int i15 = i10 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i15 > 0) {
            int iH12 = n0Var.h(i13);
            int iH13 = n0Var.h(i14);
            int iH14 = n0Var.h(i14);
            int iH15 = n0Var.h(12);
            n0Var.s(i12);
            int iH16 = n0Var.h(12);
            int i16 = i15 - 6;
            if (iH13 != 1) {
                i11 = 2;
                if (iH13 != 2) {
                    iH2 = 0;
                    iH = 0;
                    i15 = i16;
                    c10 = '\b';
                }
                sparseArray.put(iH12, new g(iH13, iH14, iH15, iH16, iH2, iH));
                i13 = 16;
                i14 = i11;
                i12 = 4;
            } else {
                i11 = 2;
            }
            c10 = '\b';
            i15 -= 8;
            iH2 = n0Var.h(8);
            iH = n0Var.h(8);
            sparseArray.put(iH12, new g(iH13, iH14, iH15, iH16, iH2, iH));
            i13 = 16;
            i14 = i11;
            i12 = 4;
        }
        return new f(iH3, zG, iH4, iH5, iH6, iH7, iH8, iH9, iH10, iH11, sparseArray);
    }

    private static void u(n0 n0Var, h hVar) {
        f fVar;
        int iH = n0Var.h(8);
        int iH2 = n0Var.h(16);
        int iH3 = n0Var.h(16);
        int iD = n0Var.d() + iH3;
        if (iH3 * 8 > n0Var.b()) {
            z.n(f68449i, "Data field length exceeds limit");
            n0Var.s(n0Var.b());
            return;
        }
        switch (iH) {
            case 16:
                if (iH2 == hVar.f68511a) {
                    d dVar = hVar.f68519i;
                    d dVarS = s(n0Var, iH3);
                    if (dVarS.f68490c != 0) {
                        hVar.f68519i = dVarS;
                        hVar.f68513c.clear();
                        hVar.f68514d.clear();
                        hVar.f68515e.clear();
                    } else if (dVar != null && dVar.f68489b != dVarS.f68489b) {
                        hVar.f68519i = dVarS;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f68519i;
                if (iH2 == hVar.f68511a && dVar2 != null) {
                    f fVarT = t(n0Var, iH3);
                    if (dVar2.f68490c == 0 && (fVar = hVar.f68513c.get(fVarT.f68494a)) != null) {
                        fVarT.a(fVar);
                    }
                    hVar.f68513c.put(fVarT.f68494a, fVarT);
                }
                break;
            case 18:
                if (iH2 == hVar.f68511a) {
                    C0614a c0614aP = p(n0Var, iH3);
                    hVar.f68514d.put(c0614aP.f68474a, c0614aP);
                } else if (iH2 == hVar.f68512b) {
                    C0614a c0614aP2 = p(n0Var, iH3);
                    hVar.f68516f.put(c0614aP2.f68474a, c0614aP2);
                }
                break;
            case 19:
                if (iH2 == hVar.f68511a) {
                    c cVarR = r(n0Var);
                    hVar.f68515e.put(cVarR.f68484a, cVarR);
                } else if (iH2 == hVar.f68512b) {
                    c cVarR2 = r(n0Var);
                    hVar.f68517g.put(cVarR2.f68484a, cVarR2);
                }
                break;
            case 20:
                if (iH2 == hVar.f68511a) {
                    hVar.f68518h = q(n0Var);
                }
                break;
        }
        n0Var.t(iD - n0Var.d());
    }

    @Override // androidx.media3.extractor.text.r
    public void a(byte[] bArr, int i10, int i11, r.b bVar, o<androidx.media3.extractor.text.d> oVar) {
        n0 n0Var = new n0(bArr, i11 + i10);
        n0Var.q(i10);
        oVar.accept(o(n0Var));
    }

    @Override // androidx.media3.extractor.text.r
    public int b() {
        return 2;
    }

    @Override // androidx.media3.extractor.text.r
    public void reset() {
        this.f68472f.a();
    }
}
