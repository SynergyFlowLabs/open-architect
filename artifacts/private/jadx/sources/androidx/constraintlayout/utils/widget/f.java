package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.j;

/* JADX INFO: loaded from: classes2.dex */
public class f extends c {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f45652w = "MotionTelltales";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Paint f45653l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    MotionLayout f45654m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float[] f45655n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Matrix f45656o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f45657s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f45658t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    float f45659v;

    public f(Context context) {
        super(context);
        this.f45653l = new Paint();
        this.f45655n = new float[2];
        this.f45656o = new Matrix();
        this.f45657s = 0;
        this.f45658t = -65281;
        this.f45659v = 0.25f;
        a(context, null);
    }

    private void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.c.Qd);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == j.c.Rd) {
                    this.f45658t = typedArrayObtainStyledAttributes.getColor(index, this.f45658t);
                } else if (index == j.c.Td) {
                    this.f45657s = typedArrayObtainStyledAttributes.getInt(index, this.f45657s);
                } else if (index == j.c.Sd) {
                    this.f45659v = typedArrayObtainStyledAttributes.getFloat(index, this.f45659v);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f45653l.setColor(this.f45658t);
        this.f45653l.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.constraintlayout.utils.widget.c, android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(this.f45656o);
        if (this.f45654m == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.f45654m = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i10 = 0; i10 < 5; i10++) {
            float f10 = fArr[i10];
            for (int i11 = 0; i11 < 5; i11++) {
                float f11 = fArr[i11];
                this.f45654m.u0(this, f11, f10, this.f45655n, this.f45657s);
                this.f45656o.mapVectors(this.f45655n);
                float f12 = width * f11;
                float f13 = height * f10;
                float[] fArr2 = this.f45655n;
                float f14 = fArr2[0];
                float f15 = this.f45659v;
                float f16 = f13 - (fArr2[1] * f15);
                this.f45656o.mapVectors(fArr2);
                canvas.drawLine(f12, f13, f12 - (f14 * f15), f16, this.f45653l);
            }
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        this.f45595f = charSequence.toString();
        requestLayout();
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45653l = new Paint();
        this.f45655n = new float[2];
        this.f45656o = new Matrix();
        this.f45657s = 0;
        this.f45658t = -65281;
        this.f45659v = 0.25f;
        a(context, attributeSet);
    }

    public f(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f45653l = new Paint();
        this.f45655n = new float[2];
        this.f45656o = new Matrix();
        this.f45657s = 0;
        this.f45658t = -65281;
        this.f45659v = 0.25f;
        a(context, attributeSet);
    }
}
