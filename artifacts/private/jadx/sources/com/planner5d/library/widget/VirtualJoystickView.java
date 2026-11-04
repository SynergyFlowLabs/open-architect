package com.planner5d.library.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.collection.b3;
import com.canhub.cropper.core.CropImageOptions;

/* JADX INFO: loaded from: classes12.dex */
public class VirtualJoystickView extends View {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f249553n = 200;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final float f249554o = 0.62f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f249555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f249556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f249557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f249558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f249559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f249560f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Drawable f249561g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Drawable f249562h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f249563i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f249564j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f249565k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f249566l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Rect f249567m;

    public interface a {
        void onMove(int i10, int i11);
    }

    private static class b extends Drawable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Paint f249568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Paint f249569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Paint f249570c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Paint f249571d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Pair<Shader, Point> f249572e;

        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        private Shader a(Rect rect) {
            Pair<Shader, Point> pair = this.f249572e;
            if (pair != null) {
                Object obj = pair.second;
                if (((Point) obj).x != rect.bottom || ((Point) obj).y != rect.top) {
                    this.f249572e = new Pair<>(new LinearGradient(0.0f, rect.bottom, 0.0f, rect.top, -16673474, -16520092, Shader.TileMode.CLAMP), new Point(rect.bottom, rect.top));
                }
            } else {
                this.f249572e = new Pair<>(new LinearGradient(0.0f, rect.bottom, 0.0f, rect.top, -16673474, -16520092, Shader.TileMode.CLAMP), new Point(rect.bottom, rect.top));
            }
            return (Shader) this.f249572e.first;
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@NonNull Canvas canvas) {
            Rect bounds = getBounds();
            float fWidth = bounds.width() / 2.0f;
            float f10 = 0.79f * fWidth;
            float f11 = fWidth - f10;
            this.f249571d.setShadowLayer(f11, 0.0f, f11 / 2.0f, 1712394513);
            this.f249568a.setShader(a(bounds));
            canvas.drawCircle(bounds.centerX(), bounds.centerY(), f10 - 1.0f, this.f249571d);
            canvas.drawCircle(bounds.centerX(), bounds.centerY(), f10, this.f249568a);
            canvas.drawCircle(bounds.centerX(), bounds.centerY(), 0.87f * f10, this.f249569b);
            canvas.drawCircle(bounds.centerX(), bounds.centerY(), f10 * 0.1f, this.f249570c);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(@androidx.annotation.g0(from = 0, to = b3.f12144d) int i10) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@androidx.annotation.p0 ColorFilter colorFilter) {
        }

        private b() {
            Paint paint = new Paint(1);
            this.f249568a = paint;
            Paint paint2 = new Paint(1);
            this.f249569b = paint2;
            Paint paint3 = new Paint(1);
            this.f249570c = paint3;
            Paint paint4 = new Paint(1);
            this.f249571d = paint4;
            this.f249572e = null;
            Paint.Style style = Paint.Style.FILL;
            paint4.setStyle(style);
            paint4.setColor(-16777216);
            paint.setStyle(style);
            paint2.setColor(-16725933);
            paint2.setStyle(style);
            paint3.setColor(-1);
            paint3.setStyle(style);
        }
    }

    public VirtualJoystickView(Context context) {
        this(context, null);
    }

    private void a() {
        a aVar = this.f249566l;
        if (aVar != null) {
            aVar.onMove(getAngle(), getStrength());
        }
    }

    private int b(int i10) {
        if (View.MeasureSpec.getMode(i10) == 0) {
            return 200;
        }
        return View.MeasureSpec.getSize(i10);
    }

    private Rect d(int i10, int i11, int i12) {
        this.f249567m.set(i10 - i12, i11 - i12, i10 + i12, i11 + i12);
        return this.f249567m;
    }

    private int getAngle() {
        int degrees = (int) Math.toDegrees(Math.atan2(this.f249558d - this.f249556b, this.f249555a - this.f249557c));
        return degrees < 0 ? degrees + CropImageOptions.S3 : degrees;
    }

    private int getStrength() {
        int i10 = this.f249555a;
        int i11 = this.f249557c;
        int i12 = (i10 - i11) * (i10 - i11);
        int i13 = this.f249556b;
        int i14 = this.f249558d;
        return (int) ((Math.sqrt(i12 + ((i13 - i14) * (i13 - i14))) * 100.0d) / ((double) this.f249565k));
    }

    public void c() {
        this.f249555a = this.f249557c;
        this.f249556b = this.f249558d;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        this.f249562h.setBounds(d(this.f249559e, this.f249560f, this.f249565k));
        this.f249562h.draw(canvas);
        this.f249561g.setBounds(d((this.f249555a + this.f249559e) - this.f249557c, (this.f249556b + this.f249560f) - this.f249558d, this.f249564j));
        this.f249561g.draw(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int iMin = Math.min(b(i10), b(i11));
        setMeasuredDimension(iMin, iMin);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int iMin = Math.min(i10, i11) / 2;
        this.f249555a = iMin;
        this.f249557c = iMin;
        this.f249559e = iMin;
        this.f249556b = iMin;
        this.f249558d = iMin;
        this.f249560f = iMin;
        int i14 = (int) (iMin / 1.62f);
        this.f249565k = i14;
        this.f249564j = (int) (i14 * f249554o);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f249555a = (int) motionEvent.getX();
        this.f249556b = (int) motionEvent.getY();
        int i10 = 6 ^ 1;
        if (motionEvent.getAction() == 1) {
            c();
            a();
        }
        motionEvent.getActionMasked();
        int i11 = this.f249555a;
        int i12 = this.f249557c;
        int i13 = (i11 - i12) * (i11 - i12);
        int i14 = this.f249556b;
        int i15 = this.f249558d;
        double dSqrt = Math.sqrt(i13 + ((i14 - i15) * (i14 - i15)));
        int i16 = this.f249565k;
        if (dSqrt > i16) {
            int i17 = this.f249555a;
            int i18 = this.f249557c;
            this.f249555a = (int) ((((double) ((i17 - i18) * i16)) / dSqrt) + ((double) i18));
            int i19 = this.f249556b;
            int i20 = this.f249558d;
            this.f249556b = (int) ((((double) ((i19 - i20) * i16)) / dSqrt) + ((double) i20));
        }
        invalidate();
        a();
        return true;
    }

    public void setOnMoveListener(a aVar) {
        this.f249566l = aVar;
    }

    public VirtualJoystickView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet);
    }

    public VirtualJoystickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f249555a = 0;
        this.f249556b = 0;
        this.f249557c = 0;
        this.f249558d = 0;
        this.f249559e = 0;
        this.f249560f = 0;
        this.f249563i = true;
        this.f249567m = new Rect();
        this.f249562h = com.planner5d.library.widget.drawable.c.f254258a.a(context, c1.g.f251486gd, null);
        this.f249561g = new b();
        setLayerType(1, null);
    }
}
