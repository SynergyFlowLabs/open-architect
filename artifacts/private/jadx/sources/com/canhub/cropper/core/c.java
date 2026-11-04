package com.canhub.cropper.core;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Environment;
import android.util.Pair;
import androidx.annotation.m1;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBitmapUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapUtils.kt\ncom/canhub/cropper/core/BitmapUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,993:1\n1#2:994\n*E\n"})
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f97740d = 2048;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f97741e = "wt";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f97745i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private static Pair<String, WeakReference<Bitmap>> f97746j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f97737a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Rect f97738b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final RectF f97739c = new RectF();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final RectF f97742f = new RectF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final float[] f97743g = new float[6];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final float[] f97744h = new float[6];

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final Bitmap f97747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f97748b;

        public a(@Nullable Bitmap bitmap, int i10) {
            this.f97747a = bitmap;
            this.f97748b = i10;
        }

        @Nullable
        public final Bitmap a() {
            return this.f97747a;
        }

        public final int b() {
            return this.f97748b;
        }
    }

    /* JADX INFO: renamed from: com.canhub.cropper.core.c$c, reason: collision with other inner class name */
    public /* synthetic */ class C0879c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f97753a;

        static {
            int[] iArr = new int[Bitmap.CompressFormat.values().length];
            try {
                iArr[Bitmap.CompressFormat.JPEG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.CompressFormat.PNG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f97753a = iArr;
        }
    }

    private c() {
    }

    private final Bitmap I(Bitmap bitmap, int i10, boolean z10, boolean z11) {
        if (i10 <= 0 && !z10 && !z11) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i10);
        matrix.postScale(z10 ? -1 : 1, z11 ? -1 : 1);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        if (!Intrinsics.areEqual(bitmapCreateBitmap, bitmap)) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    @m1
    private final Uri a(Context context, Bitmap.CompressFormat compressFormat) {
        String str;
        try {
            int i10 = C0879c.f97753a[compressFormat.ordinal()];
            if (i10 != 1) {
                str = i10 != 2 ? ".webp" : ".png";
            } else {
                str = ".jpg";
            }
            try {
                File fileCreateTempFile = File.createTempFile("cropped", str, context.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
                Intrinsics.checkNotNull(fileCreateTempFile);
                return a5.b.a(context, fileCreateTempFile);
            } catch (Exception e10) {
                e10.getMessage();
                File fileCreateTempFile2 = File.createTempFile("cropped", str, context.getCacheDir());
                Intrinsics.checkNotNull(fileCreateTempFile2);
                return a5.b.a(context, fileCreateTempFile2);
            }
        } catch (IOException e11) {
            throw new RuntimeException("Failed to create temp file for output image", e11);
        }
    }

    private final int b(int i10, int i11) {
        if (f97745i == 0) {
            f97745i = s();
        }
        int i12 = 1;
        if (f97745i <= 0) {
            return 1;
        }
        while (true) {
            int i13 = i11 / i12;
            int i14 = f97745i;
            if (i13 <= i14 && i10 / i12 <= i14) {
                return i12;
            }
            i12 *= 2;
        }
    }

    private final int c(int i10, int i11, int i12, int i13) {
        int i14 = 1;
        if (i11 <= i13 && i10 <= i12) {
            return 1;
        }
        while ((i11 / 2) / i14 > i13 && (i10 / 2) / i14 > i12) {
            i14 *= 2;
        }
        return i14;
    }

    private final void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private final a f(Context context, Uri uri, float[] fArr, int i10, int i11, int i12, boolean z10, int i13, int i14, int i15, int i16, boolean z11, boolean z12, int i17) {
        int iB;
        Rect rectZ = z(fArr, i11, i12, z10, i13, i14);
        int iWidth = i15 > 0 ? i15 : rectZ.width();
        int iHeight = i16 > 0 ? i16 : rectZ.height();
        Bitmap bitmapA = null;
        try {
            a aVarN = n(context, uri, rectZ, iWidth, iHeight, i17);
            try {
                bitmapA = aVarN.a();
                iB = aVarN.b();
            } catch (Exception unused) {
                iB = 1;
            }
        } catch (Exception unused2) {
            rectZ = rectZ;
        }
        int i18 = iB;
        Bitmap bitmap = bitmapA;
        if (bitmap == null) {
            return g(context, uri, fArr, i10, z10, i13, i14, i17, rectZ, iWidth, iHeight, z11, z12);
        }
        try {
            Bitmap bitmapI = I(bitmap, i10, z11, z12);
            if (i10 % 90 != 0) {
                bitmapI = j(bitmapI, fArr, rectZ, i10, z10, i13, i14);
            }
            return new a(bitmapI, i18);
        } catch (OutOfMemoryError e10) {
            if (bitmap == null) {
                throw e10;
            }
            bitmap.recycle();
            throw e10;
        }
    }

    private final a g(Context context, Uri uri, float[] fArr, int i10, boolean z10, int i11, int i12, int i13, Rect rect, int i14, int i15, boolean z11, boolean z12) throws Throwable {
        Bitmap bitmap;
        Bitmap bitmapI = null;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int iC = i13 * c(rect.width(), rect.height(), i14, i15);
            options.inSampleSize = iC;
            ContentResolver contentResolver = context.getContentResolver();
            Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
            Bitmap bitmapK = k(contentResolver, uri, options);
            if (bitmapK != null) {
                try {
                    int length = fArr.length;
                    float[] fArr2 = new float[length];
                    System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                    for (int i16 = 0; i16 < length; i16++) {
                        fArr2[i16] = fArr2[i16] / options.inSampleSize;
                    }
                    bitmap = bitmapK;
                    try {
                        bitmapI = i(bitmap, fArr2, i10, z10, i11, i12, 1.0f, z11, z12);
                        if (!Intrinsics.areEqual(bitmapI, bitmap)) {
                            bitmap.recycle();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (!Intrinsics.areEqual((Object) null, bitmap)) {
                            bitmap.recycle();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bitmap = bitmapK;
                }
            }
            return new a(bitmapI, iC);
        } catch (Exception e10) {
            throw new d.C0880d(uri, e10.getMessage());
        } catch (OutOfMemoryError e11) {
            if (0 != 0) {
                bitmapI.recycle();
            }
            throw e11;
        }
    }

    private final Bitmap i(Bitmap bitmap, float[] fArr, int i10, boolean z10, int i11, int i12, float f10, boolean z11, boolean z12) {
        float f11 = f10;
        Rect rectZ = z(fArr, bitmap.getWidth(), bitmap.getHeight(), z10, i11, i12);
        Matrix matrix = new Matrix();
        matrix.setRotate(i10, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        float f12 = z11 ? -f11 : f11;
        if (z12) {
            f11 = -f11;
        }
        matrix.postScale(f12, f11);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, rectZ.left, rectZ.top, rectZ.width(), rectZ.height(), matrix, true);
        if (Intrinsics.areEqual(bitmapCreateBitmap, bitmap)) {
            bitmapCreateBitmap = bitmap.copy(td.a.f380845a.i(bitmap.getConfig()), false);
        }
        return i10 % 90 != 0 ? j(bitmapCreateBitmap, fArr, rectZ, i10, z10, i11, i12) : bitmapCreateBitmap;
    }

    private final Bitmap j(Bitmap bitmap, float[] fArr, Rect rect, int i10, boolean z10, int i11, int i12) {
        int iAbs;
        int iAbs2;
        int iAbs3;
        if (i10 % 90 == 0) {
            return bitmap;
        }
        double radians = Math.toRadians(i10);
        int i13 = (i10 < 90 || (181 <= i10 && i10 < 270)) ? rect.left : rect.right;
        int iAbs4 = 0;
        int i14 = 0;
        while (true) {
            if (i14 >= fArr.length) {
                iAbs = 0;
                iAbs2 = 0;
                iAbs3 = 0;
                break;
            }
            float f10 = fArr[i14];
            if (f10 >= i13 - 1 && f10 <= i13 + 1) {
                int i15 = i14 + 1;
                iAbs4 = (int) Math.abs(Math.sin(radians) * ((double) (rect.bottom - fArr[i15])));
                iAbs2 = (int) Math.abs(Math.cos(radians) * ((double) (fArr[i15] - rect.top)));
                iAbs3 = (int) Math.abs(((double) (fArr[i15] - rect.top)) / Math.sin(radians));
                iAbs = (int) Math.abs(((double) (rect.bottom - fArr[i15])) / Math.cos(radians));
                break;
            }
            i14 += 2;
        }
        rect.set(iAbs4, iAbs2, iAbs3 + iAbs4, iAbs + iAbs2);
        if (z10) {
            o(rect, i11, i12);
        }
        Intrinsics.checkNotNull(bitmap);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
        if (!Intrinsics.areEqual(bitmap, bitmapCreateBitmap) && bitmap != null) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    private final Bitmap k(ContentResolver contentResolver, Uri uri, BitmapFactory.Options options) throws d.c, FileNotFoundException {
        do {
            InputStream inputStreamOpenInputStream = null;
            try {
                try {
                    inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, f97738b, options);
                    d(inputStreamOpenInputStream);
                    return bitmapDecodeStream;
                } catch (OutOfMemoryError unused) {
                    options.inSampleSize *= 2;
                    d(inputStreamOpenInputStream);
                }
            } catch (Throwable th2) {
                d(inputStreamOpenInputStream);
                throw th2;
            }
        } while (options.inSampleSize <= 512);
        throw new d.c(uri);
    }

    private final BitmapFactory.Options l(ContentResolver contentResolver, Uri uri) throws Throwable {
        InputStream inputStreamOpenInputStream;
        try {
            inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(inputStreamOpenInputStream, f97738b, options);
                options.inJustDecodeBounds = false;
                d(inputStreamOpenInputStream);
                return options;
            } catch (Throwable th2) {
                th = th2;
                d(inputStreamOpenInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamOpenInputStream = null;
        }
    }

    private final a n(Context context, Uri uri, Rect rect, int i10, int i11, int i12) throws d.C0880d {
        int i13;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = i12 * c(rect.width(), rect.height(), i10, i11);
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            Intrinsics.checkNotNull(inputStreamOpenInputStream);
            BitmapRegionDecoder bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStreamOpenInputStream, false);
            do {
                try {
                    Intrinsics.checkNotNull(bitmapRegionDecoderNewInstance);
                    return new a(bitmapRegionDecoderNewInstance.decodeRegion(rect, options), options.inSampleSize);
                } catch (OutOfMemoryError unused) {
                    i13 = options.inSampleSize * 2;
                    options.inSampleSize = i13;
                }
            } while (i13 <= 512);
            d(inputStreamOpenInputStream);
            if (bitmapRegionDecoderNewInstance != null) {
                bitmapRegionDecoderNewInstance.recycle();
            }
            return new a(null, 1);
        } catch (Exception e10) {
            throw new d.C0880d(uri, e10.getMessage());
        }
    }

    private final void o(Rect rect, int i10, int i11) {
        if (i10 == i11 && rect.width() != rect.height()) {
            if (rect.height() > rect.width()) {
                rect.bottom -= rect.height() - rect.width();
                return;
            }
            rect.right -= rect.width() - rect.height();
        }
    }

    private final int s() {
        try {
            EGL egl = EGLContext.getEGL();
            Intrinsics.checkNotNull(egl, "null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10");
            EGL10 egl10 = (EGL10) egl;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            egl10.eglInitialize(eGLDisplayEglGetDisplay, new int[2]);
            int[] iArr = new int[1];
            egl10.eglGetConfigs(eGLDisplayEglGetDisplay, null, 0, iArr);
            int i10 = iArr[0];
            EGLConfig[] eGLConfigArr = new EGLConfig[i10];
            egl10.eglGetConfigs(eGLDisplayEglGetDisplay, eGLConfigArr, i10, iArr);
            int[] iArr2 = new int[1];
            int i11 = iArr[0];
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                egl10.eglGetConfigAttrib(eGLDisplayEglGetDisplay, eGLConfigArr[i13], 12332, iArr2);
                int i14 = iArr2[0];
                if (i12 < i14) {
                    i12 = i14;
                }
            }
            egl10.eglTerminate(eGLDisplayEglGetDisplay);
            return Math.max(i12, 2048);
        } catch (Exception unused) {
            return 2048;
        }
    }

    public final float A(@NotNull float[] points) {
        Intrinsics.checkNotNullParameter(points, "points");
        return w(points) - D(points);
    }

    public final float B(@NotNull float[] points) {
        Intrinsics.checkNotNullParameter(points, "points");
        int i10 = 0 & 6;
        return Math.min(Math.min(Math.min(points[0], points[2]), points[4]), points[6]);
    }

    public final float C(@NotNull float[] points) {
        Intrinsics.checkNotNullParameter(points, "points");
        return Math.max(Math.max(Math.max(points[0], points[2]), points[4]), points[6]);
    }

    public final float D(@NotNull float[] points) {
        Intrinsics.checkNotNullParameter(points, "points");
        return Math.min(Math.min(Math.min(points[1], points[3]), points[5]), points[7]);
    }

    public final float E(@NotNull float[] points) {
        Intrinsics.checkNotNullParameter(points, "points");
        return C(points) - B(points);
    }

    @NotNull
    public final b F(@Nullable Bitmap bitmap, @NotNull Context context, @Nullable Uri uri) {
        b bVar;
        Intrinsics.checkNotNullParameter(context, "context");
        androidx.exifinterface.media.a aVar = null;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            Intrinsics.checkNotNull(uri);
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                androidx.exifinterface.media.a aVar2 = new androidx.exifinterface.media.a(inputStreamOpenInputStream);
                try {
                    inputStreamOpenInputStream.close();
                } catch (Exception unused) {
                }
                aVar = aVar2;
            }
        } catch (Exception unused2) {
        }
        if (aVar != null) {
            bVar = G(bitmap, aVar);
        } else {
            int i10 = 6 ^ 0;
            bVar = new b(bitmap, 0, false, false, 12, null);
        }
        return bVar;
    }

    @NotNull
    public final b G(@Nullable Bitmap bitmap, @NotNull androidx.exifinterface.media.a exif) {
        int i10;
        Intrinsics.checkNotNullParameter(exif, "exif");
        boolean z10 = true;
        int iP = exif.p(androidx.exifinterface.media.a.D, 1);
        if (iP == 3) {
            i10 = 180;
        } else if (iP == 5 || iP == 6 || iP == 7) {
            i10 = 90;
        } else {
            i10 = iP != 8 ? 0 : 270;
        }
        boolean z11 = iP == 2 || iP == 5;
        if (iP != 4 && iP != 7) {
            z10 = false;
        }
        return new b(bitmap, i10, z11, z10);
    }

    @NotNull
    public final Bitmap H(@Nullable Bitmap bitmap, int i10, int i11, @NotNull CropImageView.k options) {
        Bitmap bitmapCreateScaledBitmap;
        Intrinsics.checkNotNullParameter(options, "options");
        if (i10 > 0 && i11 > 0) {
            try {
                CropImageView.k kVar = CropImageView.k.RESIZE_FIT;
                if (options == kVar || options == CropImageView.k.RESIZE_INSIDE || options == CropImageView.k.RESIZE_EXACT) {
                    if (options == CropImageView.k.RESIZE_EXACT) {
                        Intrinsics.checkNotNull(bitmap);
                        bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i10, i11, false);
                    } else {
                        Intrinsics.checkNotNull(bitmap);
                        float width = bitmap.getWidth();
                        float height = bitmap.getHeight();
                        float fMax = Math.max(width / i10, height / i11);
                        bitmapCreateScaledBitmap = (fMax > 1.0f || options == kVar) ? Bitmap.createScaledBitmap(bitmap, (int) (width / fMax), (int) (height / fMax), false) : null;
                    }
                    if (bitmapCreateScaledBitmap != null) {
                        if (!Intrinsics.areEqual(bitmapCreateScaledBitmap, bitmap)) {
                            bitmap.recycle();
                        }
                        return bitmapCreateScaledBitmap;
                    }
                }
            } catch (Exception unused) {
            }
        }
        Intrinsics.checkNotNull(bitmap);
        return bitmap;
    }

    public final void J(@Nullable Pair<String, WeakReference<Bitmap>> pair) {
        f97746j = pair;
    }

    @m1
    @Nullable
    public final Uri K(@NotNull Context context, @NotNull Bitmap bitmap, @NotNull Bitmap.CompressFormat compressFormat, int i10, @Nullable Uri uri) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(compressFormat, "compressFormat");
        if (uri == null) {
            uri = a(context, compressFormat);
        }
        OutputStream outputStreamOpenOutputStream = null;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            Intrinsics.checkNotNull(uri);
            outputStreamOpenOutputStream = contentResolver.openOutputStream(uri, f97741e);
            if (outputStreamOpenOutputStream != null) {
                bitmap.compress(compressFormat, i10, outputStreamOpenOutputStream);
            }
            d(outputStreamOpenOutputStream);
            return uri;
        } catch (Throwable th2) {
            d(outputStreamOpenOutputStream);
            throw th2;
        }
    }

    @m1
    @Nullable
    public final Uri L(@NotNull Context context, @Nullable Bitmap bitmap, @Nullable Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Intrinsics.checkNotNull(bitmap);
            return K(context, bitmap, Bitmap.CompressFormat.JPEG, 95, uri);
        } catch (Exception unused) {
            return null;
        }
    }

    @NotNull
    public final a e(@NotNull Context context, @Nullable Uri uri, @NotNull float[] fArr, int i10, int i11, int i12, boolean z10, int i13, int i14, int i15, int i16, boolean z11, boolean z12) {
        Context context2 = context;
        Intrinsics.checkNotNullParameter(context2, "context");
        float[] points = fArr;
        Intrinsics.checkNotNullParameter(points, "points");
        int i17 = 1;
        while (true) {
            try {
                Intrinsics.checkNotNull(uri);
                return f(context2, uri, points, i10, i11, i12, z10, i13, i14, i15, i16, z11, z12, i17);
            } catch (OutOfMemoryError e10) {
                i17 *= 2;
                if (i17 > 16) {
                    throw new RuntimeException("Failed to handle OOM by sampling (" + i17 + "): " + uri + "\r\n" + e10.getMessage(), e10);
                }
                context2 = context;
                points = fArr;
            }
        }
    }

    @NotNull
    public final a h(@Nullable Bitmap bitmap, @NotNull float[] points, int i10, boolean z10, int i11, int i12, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(points, "points");
        int i13 = 1;
        do {
            try {
                Intrinsics.checkNotNull(bitmap);
                return new a(i(bitmap, points, i10, z10, i11, i12, 1 / i13, z11, z12), i13);
            } catch (OutOfMemoryError e10) {
                i13 *= 2;
            }
        } while (i13 <= 8);
        throw e10;
    }

    @NotNull
    public final a m(@NotNull Context context, @NotNull Uri uri, int i10, int i11) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            ContentResolver contentResolver = context.getContentResolver();
            Intrinsics.checkNotNull(contentResolver);
            BitmapFactory.Options optionsL = l(contentResolver, uri);
            int i12 = optionsL.outWidth;
            if (i12 == -1 && optionsL.outHeight == -1) {
                throw new RuntimeException("File is not a picture");
            }
            optionsL.inSampleSize = Math.max(c(i12, optionsL.outHeight, i10, i11), b(optionsL.outWidth, optionsL.outHeight));
            return new a(k(contentResolver, uri, optionsL), optionsL.inSampleSize);
        } catch (Exception e10) {
            throw new d.C0880d(uri, e10.getMessage());
        }
    }

    @NotNull
    public final Rect p() {
        return f97738b;
    }

    @NotNull
    public final RectF q() {
        return f97739c;
    }

    @Nullable
    public final Pair<String, WeakReference<Bitmap>> r() {
        return f97746j;
    }

    @NotNull
    public final float[] t() {
        return f97743g;
    }

    @NotNull
    public final float[] u() {
        return f97744h;
    }

    @NotNull
    public final RectF v() {
        return f97742f;
    }

    public final float w(@NotNull float[] points) {
        Intrinsics.checkNotNullParameter(points, "points");
        return Math.max(Math.max(Math.max(points[1], points[3]), points[5]), points[7]);
    }

    public final float x(@NotNull float[] points) {
        Intrinsics.checkNotNullParameter(points, "points");
        return (C(points) + B(points)) / 2.0f;
    }

    public final float y(@NotNull float[] points) {
        Intrinsics.checkNotNullParameter(points, "points");
        return (w(points) + D(points)) / 2.0f;
    }

    @NotNull
    public final Rect z(@NotNull float[] points, int i10, int i11, boolean z10, int i12, int i13) {
        Intrinsics.checkNotNullParameter(points, "points");
        Rect rect = new Rect(kotlin.math.b.L0(Math.max(0.0f, B(points))), kotlin.math.b.L0(Math.max(0.0f, D(points))), kotlin.math.b.L0(Math.min(i10, C(points))), kotlin.math.b.L0(Math.min(i11, w(points))));
        if (z10) {
            o(rect, i12, i13);
        }
        return rect;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final Bitmap f97749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f97750b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f97751c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f97752d;

        public b(@Nullable Bitmap bitmap, int i10, boolean z10, boolean z11) {
            this.f97749a = bitmap;
            this.f97750b = i10;
            this.f97751c = z10;
            this.f97752d = z11;
        }

        @Nullable
        public final Bitmap a() {
            return this.f97749a;
        }

        public final int b() {
            return this.f97750b;
        }

        public final boolean c() {
            return this.f97751c;
        }

        public final boolean d() {
            return this.f97752d;
        }

        public /* synthetic */ b(Bitmap bitmap, int i10, boolean z10, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(bitmap, i10, (i11 & 4) != 0 ? false : z10, (i11 & 8) != 0 ? false : z11);
        }
    }
}
