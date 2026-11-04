package androidx.media2.exoplayer.external.text.dvb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.annotation.b1;
import androidx.media2.exoplayer.external.util.p;
import androidx.media2.exoplayer.external.util.q0;
import androidx.media2.exoplayer.external.util.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f56699h = "DvbParser";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f56700i = 16;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f56701j = 17;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f56702k = 18;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f56703l = 19;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f56704m = 20;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f56705n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f56706o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f56707p = 3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f56708q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f56709r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f56710s = 16;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f56711t = 17;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f56712u = 18;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f56713v = 32;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f56714w = 33;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f56715x = 34;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f56716y = 240;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f56718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f56719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Canvas f56720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0525b f56721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f56722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h f56723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Bitmap f56724g;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final byte[] f56717z = {0, 7, 8, com.google.common.base.c.f116464q};
    private static final byte[] A = {0, 119, -120, -1};
    private static final byte[] B = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, com.fasterxml.jackson.core.json.a.f102488j, org.msgpack.core.h.a.f339281q, org.msgpack.core.h.a.H, -18, -1};

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f56725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f56726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f56727c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f56728d;

        public a(int id2, int[] clutEntries2Bit, int[] clutEntries4Bit, int[] clutEntries8bit) {
            this.f56725a = id2;
            this.f56726b = clutEntries2Bit;
            this.f56727c = clutEntries4Bit;
            this.f56728d = clutEntries8bit;
        }
    }

    /* JADX INFO: renamed from: androidx.media2.exoplayer.external.text.dvb.b$b, reason: collision with other inner class name */
    private static final class C0525b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f56729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f56730b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f56731c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f56732d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f56733e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f56734f;

        public C0525b(int width, int height, int horizontalPositionMinimum, int horizontalPositionMaximum, int verticalPositionMinimum, int verticalPositionMaximum) {
            this.f56729a = width;
            this.f56730b = height;
            this.f56731c = horizontalPositionMinimum;
            this.f56732d = horizontalPositionMaximum;
            this.f56733e = verticalPositionMinimum;
            this.f56734f = verticalPositionMaximum;
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f56735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f56736b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f56737c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f56738d;

        public c(int id2, boolean nonModifyingColorFlag, byte[] topFieldData, byte[] bottomFieldData) {
            this.f56735a = id2;
            this.f56736b = nonModifyingColorFlag;
            this.f56737c = topFieldData;
            this.f56738d = bottomFieldData;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f56739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f56740b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f56741c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray<e> f56742d;

        public d(int timeoutSecs, int version, int state, SparseArray<e> regions) {
            this.f56739a = timeoutSecs;
            this.f56740b = version;
            this.f56741c = state;
            this.f56742d = regions;
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f56743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f56744b;

        public e(int horizontalAddress, int verticalAddress) {
            this.f56743a = horizontalAddress;
            this.f56744b = verticalAddress;
        }
    }

    private static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f56745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f56746b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f56747c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f56748d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f56749e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f56750f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f56751g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f56752h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f56753i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f56754j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final SparseArray<g> f56755k;

        public f(int id2, boolean fillFlag, int width, int height, int levelOfCompatibility, int depth, int clutId, int pixelCode8Bit, int pixelCode4Bit, int pixelCode2Bit, SparseArray<g> regionObjects) {
            this.f56745a = id2;
            this.f56746b = fillFlag;
            this.f56747c = width;
            this.f56748d = height;
            this.f56749e = levelOfCompatibility;
            this.f56750f = depth;
            this.f56751g = clutId;
            this.f56752h = pixelCode8Bit;
            this.f56753i = pixelCode4Bit;
            this.f56754j = pixelCode2Bit;
            this.f56755k = regionObjects;
        }

        public void a(f otherRegionComposition) {
            if (otherRegionComposition == null) {
                return;
            }
            SparseArray<g> sparseArray = otherRegionComposition.f56755k;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                this.f56755k.put(sparseArray.keyAt(i10), sparseArray.valueAt(i10));
            }
        }
    }

    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f56756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f56757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f56758c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f56759d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f56760e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f56761f;

        public g(int type, int provider, int horizontalPosition, int verticalPosition, int foregroundPixelCode, int backgroundPixelCode) {
            this.f56756a = type;
            this.f56757b = provider;
            this.f56758c = horizontalPosition;
            this.f56759d = verticalPosition;
            this.f56760e = foregroundPixelCode;
            this.f56761f = backgroundPixelCode;
        }
    }

    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f56762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f56763b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseArray<f> f56764c = new SparseArray<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray<a> f56765d = new SparseArray<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SparseArray<c> f56766e = new SparseArray<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final SparseArray<a> f56767f = new SparseArray<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final SparseArray<c> f56768g = new SparseArray<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public C0525b f56769h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public d f56770i;

        public h(int subtitlePageId, int ancillaryPageId) {
            this.f56762a = subtitlePageId;
            this.f56763b = ancillaryPageId;
        }

        public void a() {
            this.f56764c.clear();
            this.f56765d.clear();
            this.f56766e.clear();
            this.f56767f.clear();
            this.f56768g.clear();
            this.f56769h = null;
            this.f56770i = null;
        }
    }

    public b(int subtitlePageId, int ancillaryPageId) {
        Paint paint = new Paint();
        this.f56718a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f56719b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f56720c = new Canvas();
        this.f56721d = new C0525b(androidx.media3.exoplayer.trackselection.a.F, 575, 0, androidx.media3.exoplayer.trackselection.a.F, 0, 575);
        this.f56722e = new a(0, c(), d(), e());
        this.f56723f = new h(subtitlePageId, ancillaryPageId);
    }

    private static byte[] a(int length, int bitsPerEntry, w data) {
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = (byte) data.h(bitsPerEntry);
        }
        return bArr;
    }

    private static int[] c() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = f(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = f(255, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] e() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = f(63, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
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
                    iArr[i10] = f(255, i14, i15, i13 + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 != 8) {
                    int i16 = 43;
                    if (i11 == 128) {
                        int i17 = ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0);
                        int i18 = ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0);
                        if ((i10 & 4) == 0) {
                            i16 = 0;
                        }
                        iArr[i10] = f(255, i17, i18, i16 + 127 + ((i10 & 64) == 0 ? 0 : 85));
                    } else if (i11 == 136) {
                        int i19 = ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0);
                        int i20 = ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0);
                        if ((i10 & 4) == 0) {
                            i16 = 0;
                        }
                        iArr[i10] = f(255, i19, i20, i16 + ((i10 & 64) == 0 ? 0 : 85));
                    }
                } else {
                    int i21 = ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0);
                    int i22 = ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0);
                    i13 = (i10 & 4) == 0 ? 0 : 85;
                    if ((i10 & 64) == 0) {
                        i12 = 0;
                    }
                    iArr[i10] = f(127, i21, i22, i13 + i12);
                }
            }
        }
        return iArr;
    }

    private static int f(int a10, int r10, int g10, int b10) {
        return (a10 << 24) | (r10 << 16) | (g10 << 8) | b10;
    }

    private static int g(w data, int[] clutEntries, byte[] clutMapTable, int column, int line, Paint paint, Canvas canvas) {
        int i10;
        int iH;
        int iH2;
        boolean z10 = false;
        while (true) {
            int iH3 = data.h(2);
            if (iH3 != 0) {
                z10 = z10;
                i10 = 1;
            } else {
                if (data.g()) {
                    iH = data.h(3) + 3;
                    iH2 = data.h(2);
                } else {
                    if (data.g()) {
                        i10 = 1;
                    } else {
                        int iH4 = data.h(2);
                        if (iH4 == 0) {
                            z10 = true;
                        } else if (iH4 == 1) {
                            i10 = 2;
                        } else if (iH4 == 2) {
                            iH = data.h(4) + 12;
                            iH2 = data.h(2);
                        } else if (iH4 != 3) {
                            z10 = z10;
                        } else {
                            iH = data.h(8) + 29;
                            iH2 = data.h(2);
                        }
                        iH3 = 0;
                        i10 = 0;
                    }
                    iH3 = 0;
                }
                z10 = z10;
                i10 = iH;
                iH3 = iH2;
            }
            if (i10 != 0 && paint != null) {
                if (clutMapTable != null) {
                    iH3 = clutMapTable[iH3];
                }
                paint.setColor(clutEntries[iH3]);
                canvas.drawRect(column, line, column + i10, 1 + line, paint);
            }
            column += i10;
            if (z10) {
                return column;
            }
            z10 = z10;
        }
    }

    private static int h(w data, int[] clutEntries, byte[] clutMapTable, int column, int line, Paint paint, Canvas canvas) {
        int i10;
        int iH;
        int iH2;
        boolean z10 = false;
        while (true) {
            int iH3 = data.h(4);
            if (iH3 != 0) {
                z10 = z10;
                i10 = 1;
            } else if (data.g()) {
                if (data.g()) {
                    int iH4 = data.h(2);
                    if (iH4 == 0) {
                        i10 = 1;
                        iH3 = 0;
                    } else if (iH4 == 1) {
                        iH3 = 0;
                        i10 = 2;
                        z10 = z10;
                    } else if (iH4 == 2) {
                        iH = data.h(4) + 9;
                        iH2 = data.h(4);
                    } else if (iH4 != 3) {
                        z10 = z10;
                        iH3 = 0;
                        i10 = 0;
                    } else {
                        iH = data.h(8) + 25;
                        iH2 = data.h(4);
                    }
                } else {
                    iH = data.h(2) + 4;
                    iH2 = data.h(4);
                }
                z10 = z10;
                i10 = iH;
                iH3 = iH2;
            } else {
                int iH5 = data.h(3);
                if (iH5 != 0) {
                    i10 = iH5 + 2;
                    iH3 = 0;
                } else {
                    z10 = true;
                    iH3 = 0;
                    i10 = 0;
                }
            }
            if (i10 != 0 && paint != null) {
                if (clutMapTable != null) {
                    iH3 = clutMapTable[iH3];
                }
                paint.setColor(clutEntries[iH3]);
                canvas.drawRect(column, line, column + i10, 1 + line, paint);
            }
            column += i10;
            if (z10) {
                return column;
            }
            z10 = z10;
        }
    }

    private static int i(w data, int[] clutEntries, byte[] clutMapTable, int column, int line, Paint paint, Canvas canvas) {
        boolean z10;
        int iH;
        boolean z11 = false;
        while (true) {
            int iH2 = data.h(8);
            if (iH2 != 0) {
                z10 = z11;
                iH = 1;
            } else if (data.g()) {
                z10 = z11;
                iH = data.h(7);
                iH2 = data.h(8);
            } else {
                int iH3 = data.h(7);
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
                if (clutMapTable != null) {
                    iH2 = clutMapTable[iH2];
                }
                paint.setColor(clutEntries[iH2]);
                canvas.drawRect(column, line, column + iH, 1 + line, paint);
            }
            column += iH;
            if (z10) {
                return column;
            }
            z11 = z10;
        }
    }

    private static void j(byte[] pixelData, int[] clutEntries, int regionDepth, int horizontalAddress, int verticalAddress, Paint paint, Canvas canvas) {
        int[] iArr;
        Paint paint2;
        Canvas canvas2;
        byte[] bArr;
        byte[] bArr2;
        w wVar = new w(pixelData);
        byte[] bArrA = null;
        int iG = horizontalAddress;
        int i10 = verticalAddress;
        byte[] bArrA2 = null;
        while (wVar.b() != 0) {
            int iH = wVar.h(8);
            if (iH != 240) {
                switch (iH) {
                    case 16:
                        iArr = clutEntries;
                        paint2 = paint;
                        canvas2 = canvas;
                        if (regionDepth != 3) {
                            if (regionDepth == 2) {
                                bArr2 = bArrA == null ? f56717z : bArrA;
                            } else {
                                bArr = null;
                            }
                            iG = g(wVar, iArr, bArr, iG, i10, paint2, canvas2);
                            wVar.c();
                        } else {
                            bArr2 = bArrA2 == null ? A : bArrA2;
                        }
                        bArr = bArr2;
                        iG = g(wVar, iArr, bArr, iG, i10, paint2, canvas2);
                        wVar.c();
                        break;
                    case 17:
                        iArr = clutEntries;
                        canvas2 = canvas;
                        paint2 = paint;
                        iG = h(wVar, iArr, regionDepth == 3 ? B : null, iG, i10, paint2, canvas2);
                        wVar.c();
                        break;
                    case 18:
                        iArr = clutEntries;
                        paint2 = paint;
                        canvas2 = canvas;
                        iG = i(wVar, iArr, null, iG, i10, paint2, canvas2);
                        break;
                    default:
                        switch (iH) {
                            case 32:
                                bArrA = a(4, 4, wVar);
                                break;
                            case 33:
                                bArrA2 = a(4, 8, wVar);
                                break;
                            case 34:
                                bArrA2 = a(16, 8, wVar);
                                break;
                        }
                        iArr = clutEntries;
                        paint2 = paint;
                        canvas2 = canvas;
                        break;
                }
            } else {
                iArr = clutEntries;
                paint2 = paint;
                canvas2 = canvas;
                i10 += 2;
                iG = horizontalAddress;
            }
            clutEntries = iArr;
            paint = paint2;
            canvas = canvas2;
        }
    }

    private static void k(c objectData, a clutDefinition, int regionDepth, int horizontalAddress, int verticalAddress, Paint paint, Canvas canvas) {
        int[] iArr;
        if (regionDepth == 3) {
            iArr = clutDefinition.f56728d;
        } else {
            iArr = regionDepth == 2 ? clutDefinition.f56727c : clutDefinition.f56726b;
        }
        int[] iArr2 = iArr;
        j(objectData.f56737c, iArr2, regionDepth, horizontalAddress, verticalAddress, paint, canvas);
        j(objectData.f56738d, iArr2, regionDepth, horizontalAddress, verticalAddress + 1, paint, canvas);
    }

    private static a l(w data, int length) {
        int[] iArr;
        int iH;
        int i10;
        int iH2;
        int iH3;
        int iH4;
        int i11 = 8;
        int iH5 = data.h(8);
        data.p(8);
        int i12 = 2;
        int i13 = length - 2;
        int[] iArrC = c();
        int[] iArrD = d();
        int[] iArrE = e();
        while (i13 > 0) {
            int iH6 = data.h(i11);
            int iH7 = data.h(i11);
            if ((iH7 & 128) != 0) {
                iArr = iArrC;
            } else {
                iArr = (iH7 & 64) != 0 ? iArrD : iArrE;
            }
            if ((iH7 & 1) != 0) {
                iH3 = data.h(i11);
                iH4 = data.h(i11);
                iH = data.h(i11);
                iH2 = data.h(i11);
                i10 = i13 - 6;
            } else {
                int iH8 = data.h(6) << i12;
                int iH9 = data.h(4) << 4;
                iH = data.h(4) << 4;
                i10 = i13 - 4;
                iH2 = data.h(i12) << 6;
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
            iArr[iH6] = f((byte) (255 - (iH2 & 255)), q0.r((int) (d10 + (1.402d * d11)), 0, 255), q0.r((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255), q0.r((int) (d10 + (d12 * 1.772d)), 0, 255));
            i13 = i10;
            iH5 = iH5;
            i11 = 8;
            i12 = 2;
        }
        return new a(iH5, iArrC, iArrD, iArrE);
    }

    private static C0525b m(w data) {
        int i10;
        int i11;
        int i12;
        int iH;
        data.p(4);
        boolean zG = data.g();
        data.p(3);
        int iH2 = data.h(16);
        int iH3 = data.h(16);
        if (zG) {
            int iH4 = data.h(16);
            int iH5 = data.h(16);
            int iH6 = data.h(16);
            iH = data.h(16);
            i12 = iH5;
            i11 = iH6;
            i10 = iH4;
        } else {
            i10 = 0;
            i11 = 0;
            i12 = iH2;
            iH = iH3;
        }
        return new C0525b(iH2, iH3, i10, i12, i11, iH);
    }

    private static c n(w data) {
        byte[] bArr;
        int iH = data.h(16);
        data.p(4);
        int iH2 = data.h(2);
        boolean zG = data.g();
        data.p(1);
        byte[] bArr2 = null;
        if (iH2 != 1) {
            if (iH2 == 0) {
                int iH3 = data.h(16);
                int iH4 = data.h(16);
                if (iH3 > 0) {
                    bArr2 = new byte[iH3];
                    data.j(bArr2, 0, iH3);
                }
                if (iH4 > 0) {
                    bArr = new byte[iH4];
                    data.j(bArr, 0, iH4);
                }
            }
            return new c(iH, zG, bArr2, bArr);
        }
        data.p(data.h(8) * 16);
        bArr = bArr2;
        return new c(iH, zG, bArr2, bArr);
    }

    private static d o(w data, int length) {
        int iH = data.h(8);
        int iH2 = data.h(4);
        int iH3 = data.h(2);
        data.p(2);
        int i10 = length - 2;
        SparseArray sparseArray = new SparseArray();
        while (i10 > 0) {
            int iH4 = data.h(8);
            data.p(8);
            i10 -= 6;
            sparseArray.put(iH4, new e(data.h(16), data.h(16)));
        }
        return new d(iH, iH2, iH3, sparseArray);
    }

    private static f p(w data, int length) {
        int i10;
        int iH;
        int iH2;
        char c10;
        int iH3 = data.h(8);
        int i11 = 4;
        data.p(4);
        boolean zG = data.g();
        data.p(3);
        int i12 = 16;
        int iH4 = data.h(16);
        int iH5 = data.h(16);
        int iH6 = data.h(3);
        int iH7 = data.h(3);
        int i13 = 2;
        data.p(2);
        int iH8 = data.h(8);
        int iH9 = data.h(8);
        int iH10 = data.h(4);
        int iH11 = data.h(2);
        data.p(2);
        int i14 = length - 10;
        SparseArray sparseArray = new SparseArray();
        while (i14 > 0) {
            int iH12 = data.h(i12);
            int iH13 = data.h(i13);
            int iH14 = data.h(i13);
            int iH15 = data.h(12);
            data.p(i11);
            int iH16 = data.h(12);
            int i15 = i14 - 6;
            if (iH13 != 1) {
                i10 = 2;
                if (iH13 != 2) {
                    iH2 = 0;
                    iH = 0;
                    i14 = i15;
                    c10 = '\b';
                }
                sparseArray.put(iH12, new g(iH13, iH14, iH15, iH16, iH2, iH));
                i12 = 16;
                i13 = i10;
                i11 = 4;
            } else {
                i10 = 2;
            }
            c10 = '\b';
            i14 -= 8;
            iH2 = data.h(8);
            iH = data.h(8);
            sparseArray.put(iH12, new g(iH13, iH14, iH15, iH16, iH2, iH));
            i12 = 16;
            i13 = i10;
            i11 = 4;
        }
        return new f(iH3, zG, iH4, iH5, iH6, iH7, iH8, iH9, iH10, iH11, sparseArray);
    }

    private static void q(w data, h service) {
        int iH = data.h(8);
        int iH2 = data.h(16);
        int iH3 = data.h(16);
        int iD = data.d() + iH3;
        if (iH3 * 8 > data.b()) {
            p.l(f56699h, "Data field length exceeds limit");
            data.p(data.b());
            return;
        }
        switch (iH) {
            case 16:
                if (iH2 == service.f56762a) {
                    d dVar = service.f56770i;
                    d dVarO = o(data, iH3);
                    if (dVarO.f56741c != 0) {
                        service.f56770i = dVarO;
                        service.f56764c.clear();
                        service.f56765d.clear();
                        service.f56766e.clear();
                    } else if (dVar != null && dVar.f56740b != dVarO.f56740b) {
                        service.f56770i = dVarO;
                    }
                }
                break;
            case 17:
                d dVar2 = service.f56770i;
                if (iH2 == service.f56762a && dVar2 != null) {
                    f fVarP = p(data, iH3);
                    if (dVar2.f56741c == 0) {
                        fVarP.a(service.f56764c.get(fVarP.f56745a));
                    }
                    service.f56764c.put(fVarP.f56745a, fVarP);
                }
                break;
            case 18:
                if (iH2 == service.f56762a) {
                    a aVarL = l(data, iH3);
                    service.f56765d.put(aVarL.f56725a, aVarL);
                } else if (iH2 == service.f56763b) {
                    a aVarL2 = l(data, iH3);
                    service.f56767f.put(aVarL2.f56725a, aVarL2);
                }
                break;
            case 19:
                if (iH2 == service.f56762a) {
                    c cVarN = n(data);
                    service.f56766e.put(cVarN.f56735a, cVarN);
                } else if (iH2 == service.f56763b) {
                    c cVarN2 = n(data);
                    service.f56768g.put(cVarN2.f56735a, cVarN2);
                }
                break;
            case 20:
                if (iH2 == service.f56762a) {
                    service.f56769h = m(data);
                }
                break;
        }
        data.q(iD - data.d());
    }

    public List<androidx.media2.exoplayer.external.text.b> b(byte[] data, int limit) {
        int i10;
        w wVar = new w(data, limit);
        while (wVar.b() >= 48 && wVar.h(8) == 15) {
            q(wVar, this.f56723f);
        }
        h hVar = this.f56723f;
        if (hVar.f56770i == null) {
            return Collections.EMPTY_LIST;
        }
        C0525b c0525b = hVar.f56769h;
        if (c0525b == null) {
            c0525b = this.f56721d;
        }
        Bitmap bitmap = this.f56724g;
        if (bitmap == null || c0525b.f56729a + 1 != bitmap.getWidth() || c0525b.f56730b + 1 != this.f56724g.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c0525b.f56729a + 1, c0525b.f56730b + 1, Bitmap.Config.ARGB_8888);
            this.f56724g = bitmapCreateBitmap;
            this.f56720c.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray = this.f56723f.f56770i.f56742d;
        int i11 = 0;
        while (i11 < sparseArray.size()) {
            this.f56720c.save();
            e eVarValueAt = sparseArray.valueAt(i11);
            f fVar = this.f56723f.f56764c.get(sparseArray.keyAt(i11));
            int i12 = eVarValueAt.f56743a + c0525b.f56731c;
            int i13 = eVarValueAt.f56744b + c0525b.f56733e;
            this.f56720c.clipRect(i12, i13, Math.min(fVar.f56747c + i12, c0525b.f56732d), Math.min(fVar.f56748d + i13, c0525b.f56734f));
            a aVar = this.f56723f.f56765d.get(fVar.f56751g);
            if (aVar == null && (aVar = this.f56723f.f56767f.get(fVar.f56751g)) == null) {
                aVar = this.f56722e;
            }
            a aVar2 = aVar;
            SparseArray<g> sparseArray2 = fVar.f56755k;
            int i14 = 0;
            while (i14 < sparseArray2.size()) {
                int iKeyAt = sparseArray2.keyAt(i14);
                g gVarValueAt = sparseArray2.valueAt(i14);
                c cVar = this.f56723f.f56766e.get(iKeyAt);
                if (cVar == null) {
                    cVar = this.f56723f.f56768g.get(iKeyAt);
                }
                if (cVar != null) {
                    k(cVar, aVar2, fVar.f56750f, gVarValueAt.f56758c + i12, gVarValueAt.f56759d + i13, cVar.f56736b ? null : this.f56718a, this.f56720c);
                }
                i14++;
                sparseArray = sparseArray;
            }
            SparseArray<e> sparseArray3 = sparseArray;
            if (fVar.f56746b) {
                int i15 = fVar.f56750f;
                if (i15 == 3) {
                    i10 = aVar2.f56728d[fVar.f56752h];
                } else {
                    i10 = i15 == 2 ? aVar2.f56727c[fVar.f56753i] : aVar2.f56726b[fVar.f56754j];
                }
                this.f56719b.setColor(i10);
                this.f56720c.drawRect(i12, i13, fVar.f56747c + i12, fVar.f56748d + i13, this.f56719b);
            }
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f56724g, i12, i13, fVar.f56747c, fVar.f56748d);
            int i16 = c0525b.f56729a;
            float f10 = i13;
            int i17 = c0525b.f56730b;
            arrayList.add(new androidx.media2.exoplayer.external.text.b(bitmapCreateBitmap2, i12 / i16, 0, f10 / i17, 0, fVar.f56747c / i16, fVar.f56748d / i17));
            this.f56720c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f56720c.restore();
            i11++;
            sparseArray = sparseArray3;
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void r() {
        this.f56723f.a();
    }
}
