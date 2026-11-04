package androidx.media2.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes.dex */
class s extends View {

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final float f60236p1 = 0.125f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f60237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f60238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f60239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f60240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f60241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final RectF f60242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SpannableStringBuilder f60243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Layout.Alignment f60244h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private TextPaint f60245i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Paint f60246j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f60247k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f60248l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f60249m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f60250n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f60251o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f60252p0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f60253s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private StaticLayout f60254t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f60255v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f60256w;

    @w0(23)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static StaticLayout a(StaticLayout.Builder builder) {
            return builder.build();
        }

        @androidx.annotation.u
        static StaticLayout.Builder b(CharSequence charSequence, int i10, int i11, TextPaint textPaint, int i12) {
            return StaticLayout.Builder.obtain(charSequence, i10, i11, textPaint, i12);
        }

        @androidx.annotation.u
        static void c(StaticLayout.Builder builder, Layout.Alignment alignment) {
            builder.setAlignment(alignment);
        }

        @androidx.annotation.u
        static void d(StaticLayout.Builder builder, float f10, float f11) {
            builder.setLineSpacing(f10, f11);
        }
    }

    @w0(28)
    static class b {
        private b() {
        }

        @androidx.annotation.u
        static void a(StaticLayout.Builder builder, boolean z10) {
            builder.setUseLineSpacingFromFallbacks(z10);
        }
    }

    s(Context context) {
        this(context, null);
    }

    private boolean a(int i10) {
        if (this.f60251o && i10 == this.f60253s) {
            return true;
        }
        int paddingLeft = i10 - ((getPaddingLeft() + getPaddingRight()) + (this.f60252p0 * 2));
        if (paddingLeft <= 0) {
            return false;
        }
        this.f60251o = true;
        this.f60253s = paddingLeft;
        SpannableStringBuilder spannableStringBuilder = this.f60243g;
        StaticLayout.Builder builderB = a.b(spannableStringBuilder, 0, spannableStringBuilder.length(), this.f60245i, paddingLeft);
        a.c(builderB, this.f60244h);
        a.d(builderB, this.f60256w, this.f60255v);
        b.a(builderB, true);
        this.f60254t = a.a(builderB);
        return true;
    }

    public void b(Layout.Alignment alignment) {
        if (this.f60244h != alignment) {
            this.f60244h = alignment;
            this.f60251o = false;
            requestLayout();
            invalidate();
        }
    }

    public void c(int i10) {
        this.f60249m = i10;
        invalidate();
    }

    public void d(int i10) {
        this.f60250n = i10;
        invalidate();
    }

    public void e(int i10) {
        this.f60247k = i10;
        invalidate();
    }

    public void f(int i10) {
        g(getContext().getText(i10));
    }

    public void g(CharSequence charSequence) {
        this.f60243g.clear();
        this.f60243g.append(charSequence);
        this.f60251o = false;
        requestLayout();
        invalidate();
    }

    public void h(float f10) {
        if (this.f60245i.getTextSize() != f10) {
            this.f60245i.setTextSize(f10);
            this.f60252p0 = (int) ((f10 * f60236p1) + 0.5f);
            this.f60251o = false;
            requestLayout();
            invalidate();
        }
    }

    public void i(Typeface typeface) {
        if (typeface == null || typeface.equals(this.f60245i.getTypeface())) {
            return;
        }
        this.f60245i.setTypeface(typeface);
        this.f60251o = false;
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        StaticLayout staticLayout = this.f60254t;
        if (staticLayout == null) {
            return;
        }
        int iSave = canvas.save();
        int i10 = this.f60252p0;
        canvas.translate(getPaddingLeft() + i10, getPaddingTop());
        int lineCount = staticLayout.getLineCount();
        TextPaint textPaint = this.f60245i;
        Paint paint = this.f60246j;
        RectF rectF = this.f60242f;
        if (Color.alpha(this.f60248l) > 0) {
            float f10 = this.f60237a;
            float lineTop = staticLayout.getLineTop(0);
            paint.setColor(this.f60248l);
            paint.setStyle(Paint.Style.FILL);
            for (int i11 = 0; i11 < lineCount; i11++) {
                float f11 = i10;
                rectF.left = staticLayout.getLineLeft(i11) - f11;
                rectF.right = staticLayout.getLineRight(i11) + f11;
                rectF.top = lineTop;
                lineTop = staticLayout.getLineBottom(i11);
                rectF.bottom = lineTop;
                canvas.drawRoundRect(rectF, f10, f10, paint);
            }
        }
        int i12 = this.f60250n;
        if (i12 == 1) {
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStrokeWidth(this.f60238b);
            textPaint.setColor(this.f60249m);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout.draw(canvas);
        } else if (i12 == 2) {
            textPaint.setShadowLayer(this.f60239c, this.f60240d, this.f60241e, this.f60249m);
        } else if (i12 == 3 || i12 == 4) {
            boolean z10 = i12 == 3;
            int i13 = z10 ? -1 : this.f60249m;
            int i14 = z10 ? this.f60249m : -1;
            float f12 = this.f60239c / 2.0f;
            textPaint.setColor(this.f60247k);
            textPaint.setStyle(Paint.Style.FILL);
            float f13 = -f12;
            textPaint.setShadowLayer(this.f60239c, f13, f13, i13);
            staticLayout.draw(canvas);
            textPaint.setShadowLayer(this.f60239c, f12, f12, i14);
        }
        textPaint.setColor(this.f60247k);
        textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        a(i12 - i10);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (!a(View.MeasureSpec.getSize(i10))) {
            setMeasuredDimension(16777216, 16777216);
            return;
        }
        StaticLayout staticLayout = this.f60254t;
        setMeasuredDimension(staticLayout.getWidth() + getPaddingLeft() + getPaddingRight() + (this.f60252p0 * 2), staticLayout.getHeight() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f60248l = i10;
        invalidate();
    }

    s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    s(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f60242f = new RectF();
        this.f60243g = new SpannableStringBuilder();
        this.f60255v = 1.0f;
        int i11 = 2 << 0;
        this.f60256w = 0.0f;
        this.f60252p0 = 0;
        Resources resources = getContext().getResources();
        this.f60237a = resources.getDimensionPixelSize(n.d.f60054x);
        this.f60238b = resources.getDimensionPixelSize(n.d.f60055y);
        this.f60239c = resources.getDimensionPixelSize(n.d.A);
        float dimensionPixelSize = resources.getDimensionPixelSize(n.d.f60056z);
        this.f60240d = dimensionPixelSize;
        this.f60241e = dimensionPixelSize;
        TextPaint textPaint = new TextPaint();
        this.f60245i = textPaint;
        textPaint.setAntiAlias(true);
        this.f60245i.setSubpixelText(true);
        Paint paint = new Paint();
        this.f60246j = paint;
        paint.setAntiAlias(true);
    }
}
