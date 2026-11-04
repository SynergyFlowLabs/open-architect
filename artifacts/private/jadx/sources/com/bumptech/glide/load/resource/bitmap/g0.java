package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f96983a = "TransformationUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f96984b = 6;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f96986d = 7;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Paint f96988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Set<String> f96989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Lock f96990h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Paint f96985c = new Paint(6);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Paint f96987e = new Paint(7);

    class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f96991a;

        a(int i10) {
            this.f96991a = i10;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.g0.c
        public void a(Canvas canvas, Paint paint, RectF rectF) {
            int i10 = this.f96991a;
            canvas.drawRoundRect(rectF, i10, i10, paint);
        }
    }

    class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f96992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f96993b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f96994c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f96995d;

        b(float f10, float f11, float f12, float f13) {
            this.f96992a = f10;
            this.f96993b = f11;
            this.f96994c = f12;
            this.f96995d = f13;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.g0.c
        public void a(Canvas canvas, Paint paint, RectF rectF) {
            Path path = new Path();
            float f10 = this.f96992a;
            float f11 = this.f96993b;
            float f12 = this.f96994c;
            float f13 = this.f96995d;
            path.addRoundRect(rectF, new float[]{f10, f10, f11, f11, f12, f12, f13, f13}, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }
    }

    private interface c {
        void a(Canvas canvas, Paint paint, RectF rectF);
    }

    private static final class d implements Lock {
        d() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
        }

        @Override // java.util.concurrent.locks.Lock
        @NonNull
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j10, @NonNull TimeUnit timeUnit) throws InterruptedException {
            return true;
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        f96989g = hashSet;
        f96990h = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new d();
        Paint paint = new Paint(7);
        f96988f = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    private g0() {
    }

    private static void a(@NonNull Bitmap bitmap, @NonNull Bitmap bitmap2, Matrix matrix) {
        f96990h.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f96985c);
            e(canvas);
        } finally {
            f96990h.unlock();
        }
    }

    public static Bitmap b(@NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @NonNull Bitmap bitmap, int i10, int i11) {
        float width;
        float height;
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i11 > bitmap.getHeight() * i10) {
            width = i11 / bitmap.getHeight();
            width2 = (i10 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i10 / bitmap.getWidth();
            height = (i11 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapF = eVar.f(i10, i11, k(bitmap));
        t(bitmap, bitmapF);
        a(bitmap, bitmapF, matrix);
        return bitmapF;
    }

    public static Bitmap c(@NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @NonNull Bitmap bitmap, int i10, int i11) {
        return (bitmap.getWidth() > i10 || bitmap.getHeight() > i11) ? f(eVar, bitmap, i10, i11) : bitmap;
    }

    public static Bitmap d(@NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @NonNull Bitmap bitmap, int i10, int i11) {
        int iMin = Math.min(i10, i11);
        float f10 = iMin;
        float f11 = f10 / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f10 / width, f10 / height);
        float f12 = width * fMax;
        float f13 = fMax * height;
        float f14 = (f10 - f12) / 2.0f;
        float f15 = (f10 - f13) / 2.0f;
        RectF rectF = new RectF(f14, f15, f12 + f14, f13 + f15);
        Bitmap bitmapG = g(eVar, bitmap);
        Bitmap bitmapF = eVar.f(iMin, iMin, h(bitmap));
        bitmapF.setHasAlpha(true);
        Lock lock = f96990h;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapF);
            canvas.drawCircle(f11, f11, f11, f96987e);
            int i12 = 3 >> 0;
            canvas.drawBitmap(bitmapG, (Rect) null, rectF, f96988f);
            e(canvas);
            lock.unlock();
            if (!bitmapG.equals(bitmap)) {
                eVar.e(bitmapG);
            }
            return bitmapF;
        } catch (Throwable th2) {
            f96990h.unlock();
            throw th2;
        }
    }

    private static void e(Canvas canvas) {
        canvas.setBitmap(null);
    }

    public static Bitmap f(@NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @NonNull Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        float fMin = Math.min(i10 / bitmap.getWidth(), i11 / bitmap.getHeight());
        int iRound = Math.round(bitmap.getWidth() * fMin);
        int iRound2 = Math.round(bitmap.getHeight() * fMin);
        if (bitmap.getWidth() == iRound && bitmap.getHeight() == iRound2) {
            return bitmap;
        }
        Bitmap bitmapF = eVar.f((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), k(bitmap));
        t(bitmap, bitmapF);
        if (Log.isLoggable(f96983a, 2)) {
            bitmap.getWidth();
            bitmap.getHeight();
            bitmapF.getWidth();
            bitmapF.getHeight();
        }
        Matrix matrix = new Matrix();
        matrix.setScale(fMin, fMin);
        a(bitmap, bitmapF, matrix);
        return bitmapF;
    }

    private static Bitmap g(@NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @NonNull Bitmap bitmap) {
        Bitmap.Config configH = h(bitmap);
        if (configH.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap bitmapF = eVar.f(bitmap.getWidth(), bitmap.getHeight(), configH);
        new Canvas(bitmapF).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmapF;
    }

    @NonNull
    private static Bitmap.Config h(@NonNull Bitmap bitmap) {
        Bitmap.Config config = Bitmap.Config.RGBA_F16;
        return config.equals(bitmap.getConfig()) ? config : Bitmap.Config.ARGB_8888;
    }

    public static Lock i() {
        return f96990h;
    }

    public static int j(int i10) {
        switch (i10) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    @NonNull
    private static Bitmap.Config k(@NonNull Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    @l1
    static void l(int i10, Matrix matrix) {
        switch (i10) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
    }

    public static boolean m(int i10) {
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static Bitmap n(@NonNull Bitmap bitmap, int i10) {
        if (i10 == 0) {
            return bitmap;
        }
        try {
            Matrix matrix = new Matrix();
            matrix.setRotate(i10);
            try {
                return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            } catch (Exception unused) {
                return bitmap;
            }
        } catch (Exception unused2) {
            return bitmap;
        }
    }

    public static Bitmap o(@NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @NonNull Bitmap bitmap, int i10) {
        if (!m(i10)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        l(i10, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap bitmapF = eVar.f(Math.round(rectF.width()), Math.round(rectF.height()), k(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        bitmapF.setHasAlpha(bitmap.hasAlpha());
        a(bitmap, bitmapF, matrix);
        return bitmapF;
    }

    public static Bitmap p(@NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @NonNull Bitmap bitmap, float f10, float f11, float f12, float f13) {
        return s(eVar, bitmap, new b(f10, f11, f12, f13));
    }

    public static Bitmap q(@NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @NonNull Bitmap bitmap, int i10) {
        com.bumptech.glide.util.k.a(i10 > 0, "roundingRadius must be greater than 0.");
        return s(eVar, bitmap, new a(i10));
    }

    @Deprecated
    public static Bitmap r(@NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @NonNull Bitmap bitmap, int i10, int i11, int i12) {
        return q(eVar, bitmap, i12);
    }

    private static Bitmap s(@NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @NonNull Bitmap bitmap, c cVar) {
        Bitmap.Config configH = h(bitmap);
        Bitmap bitmapG = g(eVar, bitmap);
        Bitmap bitmapF = eVar.f(bitmapG.getWidth(), bitmapG.getHeight(), configH);
        bitmapF.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapG, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        int i10 = 6 >> 0;
        RectF rectF = new RectF(0.0f, 0.0f, bitmapF.getWidth(), bitmapF.getHeight());
        Lock lock = f96990h;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapF);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            cVar.a(canvas, paint, rectF);
            e(canvas);
            lock.unlock();
            if (!bitmapG.equals(bitmap)) {
                eVar.e(bitmapG);
            }
            return bitmapF;
        } catch (Throwable th2) {
            f96990h.unlock();
            throw th2;
        }
    }

    public static void t(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
