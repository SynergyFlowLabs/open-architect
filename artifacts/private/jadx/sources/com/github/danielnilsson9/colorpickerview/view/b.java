package com.github.danielnilsson9.colorpickerview.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.text.util.j;
import com.planner5d.library.widget.c1;

/* JADX INFO: loaded from: classes4.dex */
public class b extends View {
    private static final int H1 = -4342339;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final int f102922p1 = -9539986;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f102923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f102924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Shader f102925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Shader f102926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f102927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f102928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f102929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f102930h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f102931i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f102932j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f102933k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Rect f102934l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Rect f102935m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Rect f102936n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Rect f102937o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final c f102938p0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Rect f102939s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Point f102940t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private InterfaceC0931b f102941v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Paint f102942w;

    private class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Canvas f102943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Bitmap f102944b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f102945c;

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.github.danielnilsson9.colorpickerview.view.b$b, reason: collision with other inner class name */
    public interface InterfaceC0931b {
        void a(int i10);
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f102947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f102948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f102949c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f102950d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f102951e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f102952f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f102953g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f102954h;

        public c(Context context) {
            Resources resources = context.getResources();
            this.f102947a = d.a(context, 10.0f);
            this.f102948b = d.a(context, 3.0f);
            this.f102949c = resources.getDimensionPixelSize(c1.f.Oc);
            this.f102950d = d.a(context, 26.0f);
            this.f102951e = resources.getDimensionPixelSize(c1.f.Nd);
            this.f102952f = resources.getDimensionPixelSize(c1.f.Uc);
            this.f102953g = resources.getDimensionPixelSize(c1.f.Id);
            this.f102954h = d.a(context, 34.0f);
        }
    }

    public b(Context context) {
        this(context, null);
    }

    private void a(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.textColorSecondary});
        if (this.f102933k == f102922p1) {
            this.f102933k = typedArrayObtainStyledAttributes.getColor(0, f102922p1);
        }
        if (this.f102932j == H1) {
            this.f102932j = typedArrayObtainStyledAttributes.getColor(0, H1);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void b(Canvas canvas) {
        Rect rect = this.f102937o;
        if (this.f102928f == null) {
            a aVar = new a();
            this.f102928f = aVar;
            aVar.f102944b = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
            this.f102928f.f102943a = new Canvas(this.f102928f.f102944b);
            int iWidth = (int) (rect.width() + 0.5f);
            int[] iArr = new int[iWidth];
            float f10 = 360.0f;
            for (int i10 = 0; i10 < iWidth; i10++) {
                iArr[i10] = Color.HSVToColor(new float[]{f10, 1.0f, 1.0f});
                f10 -= 360.0f / iWidth;
            }
            Paint paint = new Paint();
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            paint.setStrokeWidth(0.0f);
            Canvas canvas2 = this.f102928f.f102943a;
            RectF rectF = new RectF(0.0f, 0.0f, rect.width(), rect.height());
            int i11 = this.f102938p0.f102949c;
            canvas2.drawRoundRect(rectF, i11, i11, this.f102942w);
            for (int i12 = 0; i12 < iWidth; i12++) {
                paint.setColor(iArr[i12]);
                a aVar2 = this.f102928f;
                float f11 = i12;
                aVar2.f102943a.drawLine(f11, 0.0f, f11, aVar2.f102944b.getHeight(), paint);
            }
        }
        canvas.drawBitmap(this.f102928f.f102944b, (Rect) null, rect, (Paint) null);
        Point pointE = e(this.f102929g);
        pointE.y = rect.centerY();
        d(canvas, pointE, Color.HSVToColor(new float[]{this.f102929g, 1.0f, 1.0f}), androidx.core.content.d.g(getContext(), c1.e.f250778tf));
    }

    private void c(Canvas canvas) {
        Rect rect = this.f102935m;
        if (this.f102925c == null) {
            int i10 = rect.left;
            this.f102925c = new LinearGradient(i10, rect.top, i10, rect.bottom, -1, -16777216, Shader.TileMode.CLAMP);
        }
        a aVar = this.f102927e;
        if (aVar == null || aVar.f102945c != this.f102929g) {
            if (aVar == null) {
                this.f102927e = new a();
            }
            a aVar2 = this.f102927e;
            if (aVar2.f102944b == null) {
                aVar2.f102944b = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
            }
            a aVar3 = this.f102927e;
            if (aVar3.f102943a == null) {
                aVar3.f102943a = new Canvas(this.f102927e.f102944b);
            }
            int i11 = 7 ^ 0;
            int iHSVToColor = Color.HSVToColor(new float[]{this.f102929g, 1.0f, 1.0f});
            float f10 = rect.left;
            int i12 = rect.top;
            this.f102926d = new LinearGradient(f10, i12, rect.right, i12, -1, iHSVToColor, Shader.TileMode.CLAMP);
            this.f102923a.setShader(new ComposeShader(this.f102925c, this.f102926d, PorterDuff.Mode.MULTIPLY));
            RectF rectF = new RectF(0.0f, 0.0f, this.f102927e.f102944b.getWidth(), this.f102927e.f102944b.getHeight());
            Canvas canvas2 = this.f102927e.f102943a;
            int i13 = this.f102938p0.f102949c;
            canvas2.drawRoundRect(rectF, i13, i13, this.f102942w);
            this.f102927e.f102943a.drawRect(rectF, this.f102923a);
            this.f102927e.f102945c = this.f102929g;
        }
        int color = getColor();
        canvas.drawBitmap(this.f102927e.f102944b, (Rect) null, rect, (Paint) null);
        d(canvas, j(this.f102930h, this.f102931i), color, -1);
    }

    private void d(Canvas canvas, Point point, int i10, int i11) {
        this.f102924b.setColor(i11);
        Paint paint = this.f102924b;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        canvas.drawCircle(point.x, point.y, this.f102938p0.f102947a, this.f102924b);
        this.f102924b.setColor(i10);
        this.f102924b.setStyle(style);
        float f10 = point.x;
        float f11 = point.y;
        c cVar = this.f102938p0;
        canvas.drawCircle(f10, f11, cVar.f102947a - cVar.f102948b, this.f102924b);
    }

    private Point e(float f10) {
        Rect rect = this.f102937o;
        float fWidth = rect.width();
        Point point = new Point();
        point.x = (int) ((fWidth - ((f10 * fWidth) / 360.0f)) + rect.left);
        point.y = rect.top;
        return point;
    }

    private void f() {
        this.f102942w.setColor(-16777216);
        Paint paint = new Paint();
        this.f102923a = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Paint paint2 = new Paint(1);
        this.f102924b = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f102924b.setStrokeWidth(this.f102938p0.f102948b);
    }

    private boolean g(MotionEvent motionEvent) {
        Point point = this.f102940t;
        if (point == null) {
            return false;
        }
        int i10 = point.x;
        int i11 = point.y;
        if (this.f102939s.contains(i10, i11)) {
            this.f102929g = h(motionEvent.getX());
            return true;
        }
        if (!this.f102936n.contains(i10, i11)) {
            return false;
        }
        float[] fArrI = i(motionEvent.getX(), motionEvent.getY());
        this.f102930h = fArrI[0];
        this.f102931i = fArrI[1];
        return true;
    }

    private float h(float f10) {
        float f11;
        Rect rect = this.f102937o;
        float fWidth = rect.width();
        int i10 = rect.left;
        if (f10 < i10) {
            f11 = 0.0f;
        } else {
            f11 = f10 > ((float) rect.right) ? fWidth : f10 - i10;
        }
        return 360.0f - ((f11 * 360.0f) / fWidth);
    }

    private float[] i(float f10, float f11) {
        float f12;
        Rect rect = this.f102935m;
        float fWidth = rect.width();
        float fHeight = rect.height();
        int i10 = rect.left;
        float f13 = 0.0f;
        if (f10 < i10) {
            f12 = 0.0f;
        } else {
            f12 = f10 > ((float) rect.right) ? fWidth : f10 - i10;
        }
        int i11 = rect.top;
        if (f11 >= i11) {
            f13 = f11 > ((float) rect.bottom) ? fHeight : f11 - i11;
        }
        return new float[]{(1.0f / fWidth) * f12, 1.0f - ((1.0f / fHeight) * f13)};
    }

    private Point j(float f10, float f11) {
        Rect rect = this.f102935m;
        float fHeight = rect.height();
        float fWidth = rect.width();
        Point point = new Point();
        point.x = (int) ((f10 * fWidth) + rect.left);
        point.y = (int) (((1.0f - f11) * fHeight) + rect.top);
        return point;
    }

    private void l() {
        Rect rect = new Rect(this.f102934l);
        this.f102937o = rect;
        Rect rect2 = this.f102934l;
        int i10 = rect2.bottom;
        c cVar = this.f102938p0;
        rect.top = i10 - cVar.f102951e;
        int i11 = rect2.left;
        int i12 = cVar.f102947a;
        rect.left = i11 + i12;
        rect.right = rect2.right - i12;
        Rect rect3 = new Rect(this.f102937o);
        this.f102939s = rect3;
        rect3.inset(0, -this.f102938p0.f102950d);
    }

    private void m() {
        Rect rect = this.f102934l;
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.bottom;
        c cVar = this.f102938p0;
        this.f102935m = new Rect(i10, i11, rect.right, (i12 - cVar.f102950d) - cVar.f102951e);
        Rect rect2 = new Rect(this.f102935m);
        this.f102936n = rect2;
        int i13 = this.f102938p0.f102950d;
        rect2.inset(-i13, -i13);
    }

    public int getBorderColor() {
        return this.f102933k;
    }

    public int getColor() {
        return Color.HSVToColor(255, new float[]{this.f102929g, this.f102930h, this.f102931i});
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return Math.max(super.getPaddingBottom(), this.f102938p0.f102950d);
    }

    public void k(int i10, boolean z10) {
        InterfaceC0931b interfaceC0931b;
        float[] fArr = new float[3];
        Color.RGBToHSV(Color.red(i10), Color.green(i10), Color.blue(i10), fArr);
        float f10 = fArr[0];
        this.f102929g = f10;
        float f11 = fArr[1];
        this.f102930h = f11;
        float f12 = fArr[2];
        this.f102931i = f12;
        if (z10 && (interfaceC0931b = this.f102941v) != null) {
            interfaceC0931b.a(Color.HSVToColor(255, new float[]{f10, f11, f12}));
        }
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f102934l.width() <= 0 || this.f102934l.height() <= 0) {
            return;
        }
        c(canvas);
        b(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i11) - getPaddingBottom()) - getPaddingTop();
        if (mode != 1073741824 && mode2 != 1073741824) {
            c cVar = this.f102938p0;
            int i13 = cVar.f102950d;
            int i14 = cVar.f102951e;
            int i15 = size2 + i13 + i14;
            i12 = (size - i13) - i14;
            boolean z10 = i15 <= size;
            boolean z11 = i12 <= size2;
            if (!z11 || !z10) {
                if (!z11 && z10) {
                    size = i15;
                } else if (!z10 && z11) {
                }
            }
            size2 = i12;
        } else if (mode == 1073741824 && mode2 != 1073741824) {
            c cVar2 = this.f102938p0;
            i12 = (size - cVar2.f102950d) - cVar2.f102951e;
            if (i12 <= size2) {
                size2 = i12;
            }
        } else if (mode2 == 1073741824 && mode != 1073741824) {
            c cVar3 = this.f102938p0;
            int i16 = cVar3.f102950d + size2 + cVar3.f102951e;
            if (i16 <= size) {
                size = i16;
            }
        }
        setMeasuredDimension(size + getPaddingLeft() + getPaddingRight(), size2 + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f102929g = bundle.getFloat("hue");
            this.f102930h = bundle.getFloat(j.e.f48337h);
            this.f102931i = bundle.getFloat("val");
            parcelable = bundle.getParcelable("instanceState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putFloat("hue", this.f102929g);
        bundle.putFloat(j.e.f48337h, this.f102930h);
        bundle.putFloat("val", this.f102931i);
        return bundle;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Rect rect = new Rect();
        this.f102934l = rect;
        rect.left = getPaddingLeft();
        this.f102934l.right = i10 - getPaddingRight();
        this.f102934l.top = getPaddingTop();
        this.f102934l.bottom = i11 - getPaddingBottom();
        this.f102925c = null;
        this.f102926d = null;
        this.f102927e = null;
        this.f102928f = null;
        m();
        l();
    }

    @Override // android.view.View
    @e.a({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zG;
        int action = motionEvent.getAction();
        boolean z10 = false & false;
        if (action == 0) {
            this.f102940t = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            zG = g(motionEvent);
        } else if (action != 1) {
            zG = action != 2 ? false : g(motionEvent);
        } else {
            this.f102940t = null;
            zG = g(motionEvent);
        }
        if (!zG) {
            return super.onTouchEvent(motionEvent);
        }
        InterfaceC0931b interfaceC0931b = this.f102941v;
        if (interfaceC0931b != null) {
            interfaceC0931b.a(Color.HSVToColor(255, new float[]{this.f102929g, this.f102930h, this.f102931i}));
        }
        invalidate();
        return true;
    }

    public void setBorderColor(int i10) {
        this.f102933k = i10;
        invalidate();
    }

    public void setColor(int i10) {
        k(i10, false);
    }

    public void setOnColorChangedListener(InterfaceC0931b interfaceC0931b) {
        this.f102941v = interfaceC0931b;
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f102929g = 360.0f;
        this.f102930h = 0.0f;
        this.f102931i = 0.0f;
        this.f102932j = H1;
        this.f102933k = f102922p1;
        this.f102940t = null;
        this.f102942w = new Paint(1);
        this.f102938p0 = new c(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c1.s.f253879o8);
        this.f102932j = typedArrayObtainStyledAttributes.getColor(c1.s.f253927q8, H1);
        this.f102933k = typedArrayObtainStyledAttributes.getColor(c1.s.f253903p8, f102922p1);
        typedArrayObtainStyledAttributes.recycle();
        a(context);
        f();
        setFocusable(true);
        setFocusableInTouchMode(true);
    }
}
