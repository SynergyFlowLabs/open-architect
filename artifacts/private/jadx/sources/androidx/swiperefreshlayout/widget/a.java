package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.u1;

/* JADX INFO: loaded from: classes3.dex */
class a extends ImageView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f75416d = -328966;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f75417e = 1023410176;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f75418f = 503316480;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f75419g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f75420h = 1.75f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f75421i = 3.5f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f75422j = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Animation.AnimationListener f75423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f75424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f75425c;

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.a$a, reason: collision with other inner class name */
    private static class C0759a extends OvalShape {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Paint f75426a = new Paint();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f75427b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a f75428c;

        C0759a(a aVar, int i10) {
            this.f75428c = aVar;
            this.f75427b = i10;
            a((int) rect().width());
        }

        private void a(int i10) {
            float f10 = i10 / 2;
            this.f75426a.setShader(new RadialGradient(f10, f10, this.f75427b, new int[]{a.f75417e, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            int width = this.f75428c.getWidth() / 2;
            float f10 = width;
            float height = this.f75428c.getHeight() / 2;
            canvas.drawCircle(f10, height, f10, this.f75426a);
            canvas.drawCircle(f10, height, width - this.f75427b, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f10, float f11) {
            super.onResize(f10, f11);
            a((int) f10);
        }
    }

    a(Context context) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f10 = getContext().getResources().getDisplayMetrics().density;
        int i10 = (int) (f75420h * f10);
        int i11 = (int) (0.0f * f10);
        this.f75424b = (int) (f75421i * f10);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(y3.a.j.Q);
        this.f75425c = typedArrayObtainStyledAttributes.getColor(y3.a.j.R, f75416d);
        typedArrayObtainStyledAttributes.recycle();
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            u1.U1(this, f10 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0759a(this, this.f75424b));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f75424b, i11, i10, f75418f);
            int i12 = this.f75424b;
            setPadding(i12, i12, i12, i12);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.f75425c);
        u1.O1(this, shapeDrawable);
    }

    private boolean a() {
        return true;
    }

    public int b() {
        return this.f75425c;
    }

    public void c(Animation.AnimationListener animationListener) {
        this.f75423a = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f75423a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f75423a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f75424b * 2), getMeasuredHeight() + (this.f75424b * 2));
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i10);
            this.f75425c = i10;
        }
    }
}
