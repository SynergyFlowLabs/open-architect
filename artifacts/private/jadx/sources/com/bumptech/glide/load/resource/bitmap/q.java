package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final String f97058f = "Downsampler";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.bumptech.glide.load.i<com.bumptech.glide.load.b> f97059g = com.bumptech.glide.load.i.g("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", com.bumptech.glide.load.b.f96299c);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.bumptech.glide.load.i<com.bumptech.glide.load.k> f97060h = com.bumptech.glide.load.i.g("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", com.bumptech.glide.load.k.SRGB);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final com.bumptech.glide.load.i<p> f97061i = p.f97053h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final com.bumptech.glide.load.i<Boolean> f97062j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final com.bumptech.glide.load.i<Boolean> f97063k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f97064l = "image/vnd.wap.wbmp";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f97065m = "image/x-ico";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Set<String> f97066n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final b f97067o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Set<ImageHeaderParser.ImageType> f97068p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Queue<BitmapFactory.Options> f97069q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f97070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DisplayMetrics f97071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f97072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<ImageHeaderParser> f97073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w f97074e = w.a();

    class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q.b
        public void a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q.b
        public void b(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, Bitmap bitmap) {
        }
    }

    public interface b {
        void a();

        void b(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, Bitmap bitmap) throws IOException;
    }

    static {
        Boolean bool = Boolean.FALSE;
        f97062j = com.bumptech.glide.load.i.g("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f97063k = com.bumptech.glide.load.i.g("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f97066n = Collections.unmodifiableSet(new HashSet(Arrays.asList(f97064l, f97065m)));
        f97067o = new a();
        f97068p = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f97069q = com.bumptech.glide.util.m.f(0);
    }

    public q(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f97073d = list;
        this.f97071b = (DisplayMetrics) com.bumptech.glide.util.k.d(displayMetrics);
        this.f97070a = (com.bumptech.glide.load.engine.bitmap_recycle.e) com.bumptech.glide.util.k.d(eVar);
        this.f97072c = (com.bumptech.glide.load.engine.bitmap_recycle.b) com.bumptech.glide.util.k.d(bVar);
    }

    private static int a(double d10) {
        int iL = l(d10);
        int iX = x(((double) iL) * d10);
        return x((d10 / ((double) (iX / iL))) * ((double) iX));
    }

    private void b(x xVar, com.bumptech.glide.load.b bVar, boolean z10, boolean z11, BitmapFactory.Options options, int i10, int i11) {
        boolean zHasAlpha;
        if (this.f97074e.e(i10, i11, options, z10, z11)) {
            return;
        }
        if (bVar == com.bumptech.glide.load.b.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            zHasAlpha = xVar.d().hasAlpha();
        } catch (IOException unused) {
            if (Log.isLoggable(f97058f, 3)) {
                Objects.toString(bVar);
            }
            zHasAlpha = false;
        }
        Bitmap.Config config = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    private static void c(ImageHeaderParser.ImageType imageType, x xVar, b bVar, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, p pVar, int i10, int i11, int i12, int i13, int i14, BitmapFactory.Options options) throws IOException {
        int i15;
        int i16;
        int iFloor;
        int iFloor2;
        if (i11 <= 0 || i12 <= 0) {
            if (Log.isLoggable(f97058f, 3)) {
                Objects.toString(imageType);
                return;
            }
            return;
        }
        if (r(i10)) {
            i16 = i11;
            i15 = i12;
        } else {
            i15 = i11;
            i16 = i12;
        }
        float fB = pVar.b(i15, i16, i13, i14);
        if (fB <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + fB + " from: " + pVar + ", source: [" + i11 + "x" + i12 + "], target: [" + i13 + "x" + i14 + "]");
        }
        p.g gVarA = pVar.a(i15, i16, i13, i14);
        if (gVarA == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f10 = i15;
        float f11 = i16;
        int iX = i15 / x(fB * f10);
        int iX2 = i16 / x(fB * f11);
        p.g gVar = p.g.MEMORY;
        int iMax = Math.max(1, Integer.highestOneBit(gVarA == gVar ? Math.max(iX, iX2) : Math.min(iX, iX2)));
        if (gVarA == gVar && iMax < 1.0f / fB) {
            iMax <<= 1;
        }
        options.inSampleSize = iMax;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float fMin = Math.min(iMax, 8);
            iFloor = (int) Math.ceil(f10 / fMin);
            iFloor2 = (int) Math.ceil(f11 / fMin);
            int i17 = iMax / 8;
            if (i17 > 0) {
                iFloor /= i17;
                iFloor2 /= i17;
            }
        } else if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
            float f12 = iMax;
            iFloor = (int) Math.floor(f10 / f12);
            iFloor2 = (int) Math.floor(f11 / f12);
        } else if (imageType == ImageHeaderParser.ImageType.WEBP || imageType == ImageHeaderParser.ImageType.WEBP_A) {
            float f13 = iMax;
            iFloor = Math.round(f10 / f13);
            iFloor2 = Math.round(f11 / f13);
        } else if (i15 % iMax == 0 && i16 % iMax == 0) {
            iFloor = i15 / iMax;
            iFloor2 = i16 / iMax;
        } else {
            int[] iArrM = m(xVar, options, bVar, eVar);
            iFloor = iArrM[0];
            iFloor2 = iArrM[1];
        }
        double dB = pVar.b(iFloor, iFloor2, i13, i14);
        options.inTargetDensity = a(dB);
        options.inDensity = l(dB);
        if (s(options)) {
            options.inScaled = true;
        } else {
            options.inTargetDensity = 0;
            options.inDensity = 0;
        }
    }

    private com.bumptech.glide.load.engine.v<Bitmap> e(x xVar, int i10, int i11, com.bumptech.glide.load.j jVar, b bVar) throws IOException {
        byte[] bArr = (byte[]) this.f97072c.a(65536, byte[].class);
        BitmapFactory.Options optionsK = k();
        optionsK.inTempStorage = bArr;
        com.bumptech.glide.load.b bVar2 = (com.bumptech.glide.load.b) jVar.c(f97059g);
        com.bumptech.glide.load.k kVar = (com.bumptech.glide.load.k) jVar.c(f97060h);
        p pVar = (p) jVar.c(p.f97053h);
        boolean zBooleanValue = ((Boolean) jVar.c(f97062j)).booleanValue();
        com.bumptech.glide.load.i<Boolean> iVar = f97063k;
        try {
            return g.d(h(xVar, optionsK, pVar, bVar2, kVar, jVar.c(iVar) != null && ((Boolean) jVar.c(iVar)).booleanValue(), i10, i11, zBooleanValue, bVar), this.f97070a);
        } finally {
            v(optionsK);
            this.f97072c.put(bArr);
        }
    }

    private Bitmap h(x xVar, BitmapFactory.Options options, p pVar, com.bumptech.glide.load.b bVar, com.bumptech.glide.load.k kVar, boolean z10, int i10, int i11, boolean z11, b bVar2) throws IOException {
        ColorSpace colorSpace;
        long jB = com.bumptech.glide.util.g.b();
        int[] iArrM = m(xVar, options, bVar2, this.f97070a);
        int i12 = iArrM[0];
        int i13 = iArrM[1];
        String str = options.outMimeType;
        boolean z12 = (i12 == -1 || i13 == -1) ? false : z10;
        int iB = xVar.b();
        int iJ = g0.j(iB);
        boolean zM = g0.m(iB);
        int i14 = i10;
        if (i14 == Integer.MIN_VALUE) {
            i14 = r(iJ) ? i13 : i12;
        }
        if (i11 == -2147483648) {
            i11 = r(iJ) ? i12 : i13;
        }
        ImageHeaderParser.ImageType imageTypeD = xVar.d();
        c(imageTypeD, xVar, bVar2, this.f97070a, pVar, iJ, i12, i13, i14, i11, options);
        int i15 = i14;
        int iRound = i11;
        b(xVar, bVar, z12, zM, options, i15, iRound);
        if (z(imageTypeD)) {
            if (i12 < 0 || i13 < 0 || !z11) {
                float f10 = s(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                float f11 = options.inSampleSize;
                int iCeil = (int) Math.ceil(i12 / f11);
                int iCeil2 = (int) Math.ceil(i13 / f11);
                int iRound2 = Math.round(iCeil * f10);
                iRound = Math.round(iCeil2 * f10);
                i15 = iRound2;
            }
            if (i15 > 0 && iRound > 0) {
                y(options, this.f97070a, i15, iRound);
            }
        }
        options.inPreferredColorSpace = ColorSpace.get((kVar == com.bumptech.glide.load.k.DISPLAY_P3 && (colorSpace = options.outColorSpace) != null && colorSpace.isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
        Bitmap bitmapI = i(xVar, options, bVar2, this.f97070a);
        bVar2.b(this.f97070a, bitmapI);
        if (Log.isLoggable(f97058f, 2)) {
            t(i12, i13, str, options, bitmapI, i10, i11, jB);
        }
        if (bitmapI == null) {
            return null;
        }
        bitmapI.setDensity(this.f97071b.densityDpi);
        Bitmap bitmapO = g0.o(this.f97070a, bitmapI, iB);
        if (!bitmapI.equals(bitmapO)) {
            this.f97070a.e(bitmapI);
        }
        return bitmapO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap i(com.bumptech.glide.load.resource.bitmap.x r5, android.graphics.BitmapFactory.Options r6, com.bumptech.glide.load.resource.bitmap.q.b r7, com.bumptech.glide.load.engine.bitmap_recycle.e r8) throws java.io.IOException {
        /*
            boolean r0 = r6.inJustDecodeBounds
            r4 = 0
            if (r0 != 0) goto Lc
            r7.a()
            r4 = 2
            r5.a()
        Lc:
            int r0 = r6.outWidth
            r4 = 2
            int r1 = r6.outHeight
            java.lang.String r2 = r6.outMimeType
            java.util.concurrent.locks.Lock r3 = com.bumptech.glide.load.resource.bitmap.g0.i()
            r4 = 1
            r3.lock()
            android.graphics.Bitmap r5 = r5.c(r6)     // Catch: java.lang.IllegalArgumentException -> L29 java.lang.Throwable -> L41
        L1f:
            r4 = 6
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.g0.i()
            r4 = 4
            r6.unlock()
            return r5
        L29:
            r3 = move-exception
            r4 = 6
            java.io.IOException r0 = u(r3, r0, r1, r2, r6)     // Catch: java.lang.Throwable -> L41
            android.graphics.Bitmap r1 = r6.inBitmap     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L40
            r8.e(r1)     // Catch: java.io.IOException -> L3f java.lang.Throwable -> L41
            r1 = 0
            r4 = 2
            r6.inBitmap = r1     // Catch: java.io.IOException -> L3f java.lang.Throwable -> L41
            android.graphics.Bitmap r5 = i(r5, r6, r7, r8)     // Catch: java.io.IOException -> L3f java.lang.Throwable -> L41
            goto L1f
        L3f:
            throw r0     // Catch: java.lang.Throwable -> L41
        L40:
            throw r0     // Catch: java.lang.Throwable -> L41
        L41:
            r5 = move-exception
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.g0.i()
            r4 = 0
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.q.i(com.bumptech.glide.load.resource.bitmap.x, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.q$b, com.bumptech.glide.load.engine.bitmap_recycle.e):android.graphics.Bitmap");
    }

    @e.b(19)
    @p0
    private static String j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    private static synchronized BitmapFactory.Options k() {
        BitmapFactory.Options optionsPoll;
        try {
            Queue<BitmapFactory.Options> queue = f97069q;
            synchronized (queue) {
                optionsPoll = queue.poll();
            }
            if (optionsPoll == null) {
                optionsPoll = new BitmapFactory.Options();
                w(optionsPoll);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return optionsPoll;
    }

    private static int l(double d10) {
        if (d10 > 1.0d) {
            d10 = 1.0d / d10;
        }
        return (int) Math.round(d10 * 2.147483647E9d);
    }

    private static int[] m(x xVar, BitmapFactory.Options options, b bVar, com.bumptech.glide.load.engine.bitmap_recycle.e eVar) throws IOException {
        options.inJustDecodeBounds = true;
        i(xVar, options, bVar, eVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static String n(BitmapFactory.Options options) {
        return j(options.inBitmap);
    }

    private static boolean r(int i10) {
        return i10 == 90 || i10 == 270;
    }

    private static boolean s(BitmapFactory.Options options) {
        int i10;
        int i11 = options.inTargetDensity;
        return i11 > 0 && (i10 = options.inDensity) > 0 && i11 != i10;
    }

    private static void t(int i10, int i11, String str, BitmapFactory.Options options, Bitmap bitmap, int i12, int i13, long j10) {
        j(bitmap);
        n(options);
        int i14 = options.inSampleSize;
        Thread.currentThread().getName();
        com.bumptech.glide.util.g.a(j10);
    }

    private static IOException u(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i10 + ", outHeight: " + i11 + ", outMimeType: " + str + ", inBitmap: " + n(options), illegalArgumentException);
    }

    private static void v(BitmapFactory.Options options) {
        w(options);
        Queue<BitmapFactory.Options> queue = f97069q;
        synchronized (queue) {
            try {
                queue.offer(options);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static int x(double d10) {
        return (int) (d10 + 0.5d);
    }

    @e.b(26)
    private static void y(BitmapFactory.Options options, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, int i10, int i11) {
        Bitmap.Config config = options.inPreferredConfig;
        if (config == Bitmap.Config.HARDWARE) {
            return;
        }
        Bitmap.Config config2 = options.outConfig;
        if (config2 != null) {
            config = config2;
        }
        options.inBitmap = eVar.g(i10, i11, config);
    }

    private boolean z(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    @w0(21)
    public com.bumptech.glide.load.engine.v<Bitmap> d(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, com.bumptech.glide.load.j jVar) throws IOException {
        return e(new x.b(parcelFileDescriptor, this.f97073d, this.f97072c), i10, i11, jVar, f97067o);
    }

    public com.bumptech.glide.load.engine.v<Bitmap> f(InputStream inputStream, int i10, int i11, com.bumptech.glide.load.j jVar) throws IOException {
        return g(inputStream, i10, i11, jVar, f97067o);
    }

    public com.bumptech.glide.load.engine.v<Bitmap> g(InputStream inputStream, int i10, int i11, com.bumptech.glide.load.j jVar, b bVar) throws IOException {
        return e(new x.a(inputStream, this.f97073d, this.f97072c), i10, i11, jVar, bVar);
    }

    public boolean o(ParcelFileDescriptor parcelFileDescriptor) {
        return com.bumptech.glide.load.data.m.c();
    }

    public boolean p(InputStream inputStream) {
        return true;
    }

    public boolean q(ByteBuffer byteBuffer) {
        return true;
    }
}
