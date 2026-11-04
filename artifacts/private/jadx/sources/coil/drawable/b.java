package coil.drawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import coil.decode.g;
import coil.size.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.l;
import kotlin.ranges.r;
import oj.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nMovieDrawable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MovieDrawable.kt\ncoil/drawable/MovieDrawable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Canvas.kt\nandroidx/core/graphics/CanvasKt\n+ 4 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n+ 5 Utils.kt\ncoil/util/-GifUtils\n*L\n1#1,288:1\n1#2:289\n30#3,7:290\n30#3,7:297\n30#3,7:304\n95#4:311\n50#5,4:312\n50#5,4:316\n*S KotlinDebug\n*F\n+ 1 MovieDrawable.kt\ncoil/drawable/MovieDrawable\n*L\n78#1:290,7\n130#1:297,7\n137#1:304,7\n229#1:311\n260#1:312,4\n268#1:316,4\n*E\n"})
public final class b extends Drawable implements androidx.vectordrawable.graphics.drawable.b {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public static final a f87316p0 = new a(null);

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f87317p1 = -1;

    @Nullable
    private Picture X;

    @NotNull
    private q4.c Y;
    private boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Movie f87318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Bitmap.Config f87319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final h f87320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Paint f87321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<androidx.vectordrawable.graphics.drawable.b.a> f87322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Rect f87323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Rect f87324g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private Canvas f87325h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private Bitmap f87326i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f87327j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f87328k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f87329l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f87330m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f87331n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f87332o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f87333s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f87334t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f87335v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private q4.a f87336w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @j
    public b(@NotNull Movie movie) {
        this(movie, null, null, 6, null);
    }

    private final void a(Canvas canvas) {
        Canvas canvas2 = this.f87325h;
        Bitmap bitmap = this.f87326i;
        if (canvas2 == null || bitmap == null) {
            return;
        }
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        int iSave = canvas2.save();
        try {
            float f10 = this.f87327j;
            canvas2.scale(f10, f10);
            this.f87318a.draw(canvas2, 0.0f, 0.0f, this.f87321d);
            Picture picture = this.X;
            if (picture != null) {
                picture.draw(canvas2);
            }
            canvas2.restoreToCount(iSave);
            int iSave2 = canvas.save();
            try {
                canvas.translate(this.f87329l, this.f87330m);
                float f11 = this.f87328k;
                canvas.scale(f11, f11);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f87321d);
                canvas.restoreToCount(iSave2);
            } catch (Throwable th2) {
                canvas.restoreToCount(iSave2);
                throw th2;
            }
        } catch (Throwable th3) {
            canvas2.restoreToCount(iSave);
            throw th3;
        }
    }

    private final Rect e(Canvas canvas) {
        Rect rect = this.f87324g;
        rect.set(0, 0, canvas.getWidth(), canvas.getHeight());
        return rect;
    }

    private final void k(Rect rect) {
        if (Intrinsics.areEqual(this.f87323f, rect)) {
            return;
        }
        this.f87323f.set(rect);
        int iWidth = rect.width();
        int iHeight = rect.height();
        int iWidth2 = this.f87318a.width();
        int iHeight2 = this.f87318a.height();
        if (iWidth2 > 0 && iHeight2 > 0) {
            double dC = g.c(iWidth2, iHeight2, iWidth, iHeight, this.f87320c);
            if (!this.Z) {
                dC = r.z(dC, 1.0d);
            }
            float f10 = (float) dC;
            this.f87327j = f10;
            int i10 = (int) (iWidth2 * f10);
            int i11 = (int) (f10 * iHeight2);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, this.f87319b);
            Bitmap bitmap = this.f87326i;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f87326i = bitmapCreateBitmap;
            this.f87325h = new Canvas(bitmapCreateBitmap);
            if (this.Z) {
                this.f87328k = 1.0f;
                this.f87329l = 0.0f;
                this.f87330m = 0.0f;
            } else {
                float fC = (float) g.c(i10, i11, iWidth, iHeight, this.f87320c);
                this.f87328k = fC;
                float f11 = iWidth - (i10 * fC);
                float f12 = 2;
                this.f87329l = rect.left + (f11 / f12);
                this.f87330m = rect.top + ((iHeight - (fC * i11)) / f12);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean l() {
        boolean z10;
        int iDuration = this.f87318a.duration();
        int i10 = 0;
        if (iDuration == 0) {
            z10 = 0;
        } else {
            if (this.f87331n) {
                this.f87333s = SystemClock.uptimeMillis();
            }
            int i11 = (int) (this.f87333s - this.f87332o);
            int i12 = i11 / iDuration;
            this.f87335v = i12;
            int i13 = this.f87334t;
            i10 = (i13 == -1 || i12 <= i13) ? 1 : 0;
            if (i10 != 0) {
                iDuration = i11 - (i12 * iDuration);
            }
            int i14 = i10;
            i10 = iDuration;
            z10 = i14;
        }
        this.f87318a.setTime(i10);
        return z10;
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public boolean b(@NotNull androidx.vectordrawable.graphics.drawable.b.a aVar) {
        return this.f87322e.remove(aVar);
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public void c(@NotNull androidx.vectordrawable.graphics.drawable.b.a aVar) {
        this.f87322e.add(aVar);
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public void clearAnimationCallbacks() {
        this.f87322e.clear();
    }

    @Nullable
    public final q4.a d() {
        return this.f87336w;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        boolean zL = l();
        if (this.Z) {
            k(e(canvas));
            int iSave = canvas.save();
            try {
                float f10 = 1 / this.f87327j;
                canvas.scale(f10, f10);
                a(canvas);
                canvas.restoreToCount(iSave);
            } catch (Throwable th2) {
                canvas.restoreToCount(iSave);
                throw th2;
            }
        } else {
            k(getBounds());
            a(canvas);
        }
        if (this.f87331n && zL) {
            invalidateSelf();
        } else {
            stop();
        }
    }

    @NotNull
    public final Bitmap.Config f() {
        return this.f87319b;
    }

    public final int g() {
        return this.f87334t;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f87318a.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f87318a.width();
    }

    @Override // android.graphics.drawable.Drawable
    @l(message = "Deprecated in Java")
    public int getOpacity() {
        if (this.f87321d.getAlpha() == 255) {
            q4.c cVar = this.Y;
            if (cVar == q4.c.OPAQUE) {
                return -1;
            }
            if (cVar == q4.c.UNCHANGED && this.f87318a.isOpaque()) {
                return -1;
            }
        }
        return -3;
    }

    @NotNull
    public final h h() {
        return this.f87320c;
    }

    public final void i(@Nullable q4.a aVar) {
        this.f87336w = aVar;
        if (aVar == null || this.f87318a.width() <= 0 || this.f87318a.height() <= 0) {
            this.X = null;
            this.Y = q4.c.UNCHANGED;
            this.Z = false;
        } else {
            Picture picture = new Picture();
            this.Y = aVar.transform(picture.beginRecording(this.f87318a.width(), this.f87318a.height()));
            picture.endRecording();
            this.X = picture;
            this.Z = true;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f87331n;
    }

    public final void j(int i10) {
        if (i10 >= -1) {
            this.f87334t = i10;
            return;
        }
        throw new IllegalArgumentException(("Invalid repeatCount: " + i10).toString());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (i10 >= 0 && i10 < 256) {
            this.f87321d.setAlpha(i10);
            return;
        }
        throw new IllegalArgumentException(("Invalid alpha: " + i10).toString());
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f87321d.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.f87331n) {
            return;
        }
        this.f87331n = true;
        this.f87335v = 0;
        this.f87332o = SystemClock.uptimeMillis();
        List<androidx.vectordrawable.graphics.drawable.b.a> list = this.f87322e;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).c(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.f87331n) {
            this.f87331n = false;
            List<androidx.vectordrawable.graphics.drawable.b.a> list = this.f87322e;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                list.get(i10).b(this);
            }
        }
    }

    @j
    public b(@NotNull Movie movie, @NotNull Bitmap.Config config) {
        this(movie, config, null, 4, null);
    }

    public /* synthetic */ b(Movie movie, Bitmap.Config config, h hVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(movie, (i10 & 2) != 0 ? Bitmap.Config.ARGB_8888 : config, (i10 & 4) != 0 ? h.FIT : hVar);
    }

    @j
    public b(@NotNull Movie movie, @NotNull Bitmap.Config config, @NotNull h hVar) {
        this.f87318a = movie;
        this.f87319b = config;
        this.f87320c = hVar;
        this.f87321d = new Paint(3);
        this.f87322e = new ArrayList();
        this.f87323f = new Rect();
        this.f87324g = new Rect();
        this.f87327j = 1.0f;
        this.f87328k = 1.0f;
        this.f87334t = -1;
        this.Y = q4.c.UNCHANGED;
        if (coil.util.g.i(config)) {
            throw new IllegalArgumentException("Bitmap config must not be hardware.");
        }
    }
}
