package td;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import androidx.annotation.m1;
import androidx.annotation.u0;
import com.facebook.appevents.p;
import com.planner5d.library.services.e;
import com.planner5d.library.services.utility.o3;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import org.apache.commons.io.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Image.kt\ncom/planner5d/library/services/image/Image\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,320:1\n72#2:321\n72#2:323\n1#3:322\n*S KotlinDebug\n*F\n+ 1 Image.kt\ncom/planner5d/library/services/image/Image\n*L\n53#1:321\n190#1:323\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f380845a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Paint f380846b = new Paint(2);

    /* JADX INFO: renamed from: td.a$a, reason: collision with other inner class name */
    public interface InterfaceC2511a {
        @NotNull
        InputStream a() throws IOException;
    }

    public enum b {
        CenterInside,
        CenterFit,
        CenterInsideKeepOriginalAspect;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f380851e = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f380851e;
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f380852a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.CenterInside.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.CenterFit.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.CenterInsideKeepOriginalAspect.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f380852a = iArr;
        }
    }

    private a() {
    }

    public static /* synthetic */ Bitmap d(a aVar, Bitmap bitmap, int i10, int i11, int i12, int i13, Matrix matrix, int i14, Object obj) throws OutOfMemoryError {
        if ((i14 & 32) != 0) {
            matrix = null;
        }
        return aVar.c(bitmap, i10, i11, i12, i13, matrix);
    }

    private final Bitmap f(Bitmap bitmap, float f10) {
        Bitmap bitmapCopy = bitmap.copy(i(bitmap.getConfig()), true);
        Canvas canvas = new Canvas(bitmapCopy);
        Paint paint = new Paint();
        int i10 = 6 & 3;
        paint.setColorFilter(new ColorMatrixColorFilter(new float[]{f10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
        Unit unit = Unit.f312394a;
        canvas.drawBitmap(bitmapCopy, 0.0f, 0.0f, paint);
        return bitmapCopy;
    }

    private final void g(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect2);
        int iHeight = (rect.height() * rect2.width()) / rect.width();
        rect3.bottom = iHeight;
        if (iHeight > rect2.height()) {
            rect3.bottom = rect2.height();
            rect3.right = (rect.width() * rect2.height()) / rect.height();
        }
        rect3.offset((rect2.width() - rect3.width()) / 2, (rect2.height() - rect3.height()) / 2);
        rect2.set(rect3);
    }

    @m1
    private final Point h(InterfaceC2511a interfaceC2511a) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            InputStream inputStreamA = interfaceC2511a.a();
            try {
                BitmapFactory.decodeStream(inputStreamA, null, options);
                kotlin.io.c.a(inputStreamA, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.c.a(inputStreamA, th2);
                    throw th3;
                }
            }
        } catch (FileNotFoundException unused) {
            timber.log.b.f381052a.x("File not found", new Object[0]);
        } catch (IOException e10) {
            timber.log.b.f381052a.e(e10);
        }
        return new Point(options.outWidth, options.outHeight);
    }

    @m1
    private final File j(Context context, String str) {
        File fileE = e.f224295d.a(context).e();
        if (fileE != null && !fileE.isDirectory()) {
            fileE.mkdirs();
        }
        return new File(fileE, "temporary_bitmap" + str);
    }

    @m1
    private final Bitmap m(Point point, int i10, int i11, InterfaceC2511a interfaceC2511a) throws IOException, OutOfMemoryError {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 1;
        while (true) {
            int i12 = options.inSampleSize * 2;
            if (point.x / i12 < i10 || point.y / i12 < i11 || i12 >= 16) {
                break;
            }
            options.inSampleSize = i12;
        }
        InputStream inputStreamA = interfaceC2511a.a();
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamA, null, options);
            kotlin.io.c.a(inputStreamA, null);
            return bitmapDecodeStream;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(inputStreamA, th2);
                throw th3;
            }
        }
    }

    private final Bitmap p(Bitmap bitmap, int i10, int i11, b bVar) throws OutOfMemoryError {
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        Rect rect2 = new Rect(0, 0, i10, i11);
        int i12 = c.f380852a[bVar.ordinal()];
        if (i12 == 1) {
            g(rect, rect2);
        } else if (i12 == 2) {
            g(rect2, rect);
        } else {
            if (i12 != 3) {
                throw new k0();
            }
            double dMin = Math.min(((double) i10) / ((double) bitmap.getWidth()), ((double) i11) / ((double) bitmap.getHeight()));
            int iK0 = kotlin.math.b.K0(((double) bitmap.getWidth()) * dMin);
            i11 = kotlin.math.b.K0(((double) bitmap.getHeight()) * dMin);
            rect2.set(0, 0, iK0, i11);
            i10 = iK0;
        }
        Bitmap bitmapB = b(i10, i11, i(bitmap.getConfig()));
        if (!bitmapB.hasAlpha()) {
            bitmapB.eraseColor(-1);
        }
        new Canvas(bitmapB).drawBitmap(bitmap, rect, rect2, f380846b);
        return bitmapB;
    }

    private final Bitmap q(Bitmap bitmap, int i10, int i11) {
        return Bitmap.createScaledBitmap(bitmap, i10, i11, true);
    }

    @Nullable
    public final Bitmap a(@NotNull Context context, int i10, int i11, @NotNull Bitmap bitmap) throws OutOfMemoryError {
        int i12;
        int width;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        int height = (bitmap.getHeight() * i10) / bitmap.getWidth();
        if (height < i11) {
            width = (bitmap.getWidth() * i11) / bitmap.getHeight();
            i12 = i11;
        } else {
            i12 = height;
            width = i10;
        }
        td.b bVar = td.b.f380853a;
        Bitmap bitmapA = bVar.a(context, 5.0f, 1, bitmap, null, null);
        if (bitmapA == null) {
            return null;
        }
        try {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapA, width, i12, false);
            bitmapA.recycle();
            Bitmap bitmapB = b(i10, i11, i(bitmapCreateScaledBitmap.getConfig()));
            new Canvas(bitmapB).drawBitmap(bitmapCreateScaledBitmap, (i10 / 2) - (width / 2), (i11 / 2) - (i12 / 2), (Paint) null);
            bitmapCreateScaledBitmap.recycle();
            Bitmap bitmapA2 = bVar.a(context, 20.0f, 2, bitmapB, null, null);
            if (bitmapA2 == null) {
                return bitmapB;
            }
            if (!Intrinsics.areEqual(bitmapA2, bitmapB)) {
                bitmapB.recycle();
            }
            Bitmap bitmapF = f380845a.f(bitmapA2, 0.4f);
            bitmapA2.recycle();
            return bitmapF;
        } catch (Throwable th2) {
            bitmapA.recycle();
            throw th2;
        }
    }

    @NotNull
    public final Bitmap b(int i10, int i11, @NotNull Bitmap.Config config) throws OutOfMemoryError {
        Intrinsics.checkNotNullParameter(config, "config");
        for (int i12 = 0; i12 < 20; i12++) {
            Bitmap bitmapE = e(i10, i11, config);
            if (bitmapE != null) {
                return bitmapE;
            }
            o3.c(1000L);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, config);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    @NotNull
    public final Bitmap c(@NotNull Bitmap source, int i10, int i11, int i12, int i13, @Nullable Matrix matrix) throws OutOfMemoryError {
        Bitmap bitmap;
        int i14;
        int i15;
        int i16;
        int i17;
        Matrix matrix2;
        Bitmap bitmapCreateBitmap;
        Intrinsics.checkNotNullParameter(source, "source");
        int i18 = 0;
        while (i18 < 20) {
            if (matrix == null) {
                try {
                    bitmapCreateBitmap = Bitmap.createBitmap(source, i10, i11, i12, i13);
                    Intrinsics.checkNotNull(bitmapCreateBitmap);
                } catch (OutOfMemoryError e10) {
                    e = e10;
                    bitmap = source;
                    i14 = i10;
                    i15 = i11;
                    i16 = i12;
                    i17 = i13;
                    matrix2 = matrix;
                    timber.log.b.f381052a.e(e);
                    o3.c(1000L);
                    i18++;
                    source = bitmap;
                    i10 = i14;
                    i11 = i15;
                    i12 = i16;
                    i13 = i17;
                    matrix = matrix2;
                }
            } else {
                bitmap = source;
                i14 = i10;
                i15 = i11;
                i16 = i12;
                i17 = i13;
                matrix2 = matrix;
                try {
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmap, i14, i15, i16, i17, matrix2, true);
                    Intrinsics.checkNotNull(bitmapCreateBitmap);
                } catch (OutOfMemoryError e11) {
                    e = e11;
                    timber.log.b.f381052a.e(e);
                    o3.c(1000L);
                    i18++;
                    source = bitmap;
                    i10 = i14;
                    i11 = i15;
                    i12 = i16;
                    i13 = i17;
                    matrix = matrix2;
                }
            }
            return bitmapCreateBitmap;
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(source, i10, i11, i12, i13);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap2, "createBitmap(...)");
        return bitmapCreateBitmap2;
    }

    @Nullable
    public final Bitmap e(int i10, int i11, @NotNull Bitmap.Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        try {
            return Bitmap.createBitmap(i10, i11, config);
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    @NotNull
    public final Bitmap.Config i(@Nullable Bitmap.Config config) {
        return config == null ? Bitmap.Config.ARGB_8888 : config;
    }

    @m1
    @Nullable
    public final Bitmap k(@Nullable File file) {
        if (file == null) {
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream, null, null);
                kotlin.io.c.a(fileInputStream, null);
                return bitmapDecodeStream;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.c.a(fileInputStream, th2);
                    throw th3;
                }
            }
        } catch (IOException | OutOfMemoryError unused) {
            return null;
        }
    }

    @Nullable
    public final Bitmap l(@NotNull Context context, @u0 int i10) throws IOException {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i10);
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenRawResource, null, null);
                kotlin.io.c.a(inputStreamOpenRawResource, null);
                return bitmapDecodeStream;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.c.a(inputStreamOpenRawResource, th2);
                    throw th3;
                }
            }
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    @m1
    @Nullable
    public final Bitmap n(@Nullable Context context, @Nullable String str) {
        if (context != null && str != null) {
            return k(j(context, str));
        }
        return null;
    }

    @Nullable
    public final Bitmap o(@Nullable Bitmap bitmap, int i10, int i11, @NotNull b type) throws OutOfMemoryError {
        Intrinsics.checkNotNullParameter(type, "type");
        if (bitmap == null || i10 <= 0 || i11 <= 0 || (bitmap.getWidth() == i10 && bitmap.getHeight() == i11)) {
            return bitmap;
        }
        return ((float) i10) / ((float) i11) == ((float) bitmap.getWidth()) / ((float) bitmap.getHeight()) ? q(bitmap, i10, i11) : p(bitmap, i10, i11, type);
    }

    @m1
    @Nullable
    public final Bitmap r(@NotNull Bitmap bitmap, @NotNull InterfaceC2511a provider) throws OutOfMemoryError {
        int i10;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(provider, "provider");
        try {
            InputStream inputStreamA = provider.a();
            try {
                androidx.exifinterface.media.a aVar = new androidx.exifinterface.media.a(inputStreamA);
                kotlin.io.c.a(inputStreamA, null);
                int iP = aVar.p(androidx.exifinterface.media.a.D, 1);
                if (iP == 3) {
                    i10 = 180;
                } else if (iP == 6) {
                    i10 = 90;
                } else {
                    if (iP != 8) {
                        return bitmap;
                    }
                    i10 = 270;
                }
                Matrix matrix = new Matrix();
                matrix.setRotate(i10);
                return c(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.c.a(inputStreamA, th2);
                    throw th3;
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }

    @m1
    @NotNull
    public final String s(@NotNull Context context, @NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return t(context, bitmap, p.f99189d0);
    }

    @m1
    @NotNull
    public final String t(@NotNull Context context, @NotNull Bitmap bitmap, @NotNull String key) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(key, "key");
        File fileJ = j(context, key);
        k.C(fileJ);
        u(bitmap, fileJ);
        return key;
    }

    @m1
    public final boolean u(@NotNull Bitmap bitmap, @Nullable File file) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        if (file == null) {
            return false;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                bitmap.compress(bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.WEBP, 96, fileOutputStream);
                kotlin.io.c.a(fileOutputStream, null);
                return true;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.c.a(fileOutputStream, th2);
                    throw th3;
                }
            }
        } catch (IOException unused) {
            return false;
        }
    }

    @Nullable
    public final Bitmap v(int i10, int i11, @NotNull InterfaceC2511a provider) throws OutOfMemoryError {
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (i10 > 0 && i11 > 0) {
            try {
                return m(h(provider), i10, i11, provider);
            } catch (IOException e10) {
                timber.log.b.f381052a.e(e10);
            }
        }
        return null;
    }

    @Nullable
    public final Bitmap w(int i10, int i11, @NotNull InterfaceC2511a provider) throws OutOfMemoryError {
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(provider, "provider");
        Bitmap bitmapM = null;
        try {
            Point pointH = h(provider);
            if (i10 <= 0 || i11 <= 0 || i10 == (i12 = pointH.x) || i11 == (i13 = pointH.y) || i10 / i11 != i12 / i13) {
                return null;
            }
            bitmapM = m(pointH, i10, i11, provider);
        } catch (IOException e10) {
            timber.log.b.f381052a.e(e10);
        }
        if (bitmapM != null) {
            return (bitmapM.getWidth() == i10 && bitmapM.getHeight() == i11) ? bitmapM : q(bitmapM, i10, i11);
        }
        return bitmapM;
    }
}
