package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g extends Drawable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f47769n = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Bitmap f47770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f47771b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BitmapShader f47774e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f47776g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f47780k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f47781l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f47782m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f47772c = 119;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Paint f47773d = new Paint(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Matrix f47775f = new Matrix();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Rect f47777h = new Rect();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final RectF f47778i = new RectF();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f47779j = true;

    g(Resources resources, Bitmap bitmap) {
        this.f47771b = 160;
        if (resources != null) {
            this.f47771b = resources.getDisplayMetrics().densityDpi;
        }
        this.f47770a = bitmap;
        if (bitmap != null) {
            a();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f47774e = new BitmapShader(bitmap, tileMode, tileMode);
        } else {
            this.f47782m = -1;
            this.f47781l = -1;
            this.f47774e = null;
        }
    }

    private void a() {
        this.f47781l = this.f47770a.getScaledWidth(this.f47771b);
        this.f47782m = this.f47770a.getScaledHeight(this.f47771b);
    }

    private static boolean j(float f10) {
        return f10 > 0.05f;
    }

    private void s() {
        this.f47776g = Math.min(this.f47782m, this.f47781l) / 2;
    }

    @p0
    public final Bitmap b() {
        return this.f47770a;
    }

    public float c() {
        return this.f47776g;
    }

    public int d() {
        return this.f47772c;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Bitmap bitmap = this.f47770a;
        if (bitmap == null) {
            return;
        }
        t();
        if (this.f47773d.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.f47777h, this.f47773d);
            return;
        }
        RectF rectF = this.f47778i;
        float f10 = this.f47776g;
        canvas.drawRoundRect(rectF, f10, f10, this.f47773d);
    }

    @NonNull
    public final Paint e() {
        return this.f47773d;
    }

    void f(int i10, int i11, int i12, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }

    public boolean g() {
        return this.f47773d.isAntiAlias();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f47773d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f47773d.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f47782m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f47781l;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap;
        return (this.f47772c != 119 || this.f47780k || (bitmap = this.f47770a) == null || bitmap.hasAlpha() || this.f47773d.getAlpha() < 255 || j(this.f47776g)) ? -3 : -1;
    }

    public boolean h() {
        throw new UnsupportedOperationException();
    }

    public boolean i() {
        return this.f47780k;
    }

    public void k(boolean z10) {
        this.f47773d.setAntiAlias(z10);
        invalidateSelf();
    }

    public void l(boolean z10) {
        this.f47780k = z10;
        this.f47779j = true;
        if (!z10) {
            m(0.0f);
            return;
        }
        s();
        this.f47773d.setShader(this.f47774e);
        invalidateSelf();
    }

    public void m(float f10) {
        if (this.f47776g == f10) {
            return;
        }
        this.f47780k = false;
        if (j(f10)) {
            this.f47773d.setShader(this.f47774e);
        } else {
            this.f47773d.setShader(null);
        }
        this.f47776g = f10;
        invalidateSelf();
    }

    public void n(int i10) {
        if (this.f47772c != i10) {
            this.f47772c = i10;
            this.f47779j = true;
            invalidateSelf();
        }
    }

    public void o(boolean z10) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@NonNull Rect rect) {
        super.onBoundsChange(rect);
        if (this.f47780k) {
            s();
        }
        this.f47779j = true;
    }

    public void p(int i10) {
        if (this.f47771b != i10) {
            if (i10 == 0) {
                i10 = 160;
            }
            this.f47771b = i10;
            if (this.f47770a != null) {
                a();
            }
            invalidateSelf();
        }
    }

    public void q(@NonNull Canvas canvas) {
        p(canvas.getDensity());
    }

    public void r(@NonNull DisplayMetrics displayMetrics) {
        p(displayMetrics.densityDpi);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (i10 != this.f47773d.getAlpha()) {
            this.f47773d.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f47773d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f47773d.setDither(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f47773d.setFilterBitmap(z10);
        invalidateSelf();
    }

    void t() {
        g gVar;
        if (this.f47779j) {
            if (this.f47780k) {
                int iMin = Math.min(this.f47781l, this.f47782m);
                gVar = this;
                gVar.f(this.f47772c, iMin, iMin, getBounds(), this.f47777h);
                int iMin2 = Math.min(gVar.f47777h.width(), gVar.f47777h.height());
                gVar.f47777h.inset(Math.max(0, (gVar.f47777h.width() - iMin2) / 2), Math.max(0, (gVar.f47777h.height() - iMin2) / 2));
                gVar.f47776g = iMin2 * 0.5f;
            } else {
                gVar = this;
                gVar.f(gVar.f47772c, gVar.f47781l, gVar.f47782m, gVar.getBounds(), gVar.f47777h);
            }
            gVar.f47778i.set(gVar.f47777h);
            if (gVar.f47774e != null) {
                Matrix matrix = gVar.f47775f;
                RectF rectF = gVar.f47778i;
                matrix.setTranslate(rectF.left, rectF.top);
                gVar.f47775f.preScale(gVar.f47778i.width() / gVar.f47770a.getWidth(), gVar.f47778i.height() / gVar.f47770a.getHeight());
                gVar.f47774e.setLocalMatrix(gVar.f47775f);
                gVar.f47773d.setShader(gVar.f47774e);
            }
            gVar.f47779j = false;
        }
    }
}
