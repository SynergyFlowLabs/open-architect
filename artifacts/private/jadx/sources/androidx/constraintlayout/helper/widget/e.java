package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.j;

/* JADX INFO: loaded from: classes2.dex */
public class e extends androidx.constraintlayout.widget.b {

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private static final String f44917l3 = "Layer";
    protected float H1;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    View[] f44918g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private float f44919h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private float f44920i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private boolean f44921j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f44922k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private boolean f44923k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f44924l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f44925m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ConstraintLayout f44926n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f44927o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    protected float f44928p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    protected float f44929p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    boolean f44930p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f44931s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected float f44932t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected float f44933v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected float f44934w;

    public e(Context context) {
        super(context);
        this.f44922k = Float.NaN;
        this.f44924l = Float.NaN;
        this.f44925m = Float.NaN;
        this.f44927o = 1.0f;
        this.f44931s = 1.0f;
        this.f44932t = Float.NaN;
        this.f44933v = Float.NaN;
        this.f44934w = Float.NaN;
        this.f44928p0 = Float.NaN;
        this.f44929p1 = Float.NaN;
        this.H1 = Float.NaN;
        this.f44930p2 = true;
        this.f44918g3 = null;
        this.f44919h3 = 0.0f;
        this.f44920i3 = 0.0f;
    }

    private void M() {
        int i10;
        if (this.f44926n == null || (i10 = this.f45787b) == 0) {
            return;
        }
        View[] viewArr = this.f44918g3;
        if (viewArr == null || viewArr.length != i10) {
            this.f44918g3 = new View[i10];
        }
        for (int i11 = 0; i11 < this.f45787b; i11++) {
            this.f44918g3[i11] = this.f44926n.getViewById(this.f45786a[i11]);
        }
    }

    private void N() {
        if (this.f44926n == null) {
            return;
        }
        if (this.f44918g3 == null) {
            M();
        }
        L();
        double radians = Float.isNaN(this.f44925m) ? 0.0d : Math.toRadians(this.f44925m);
        float fSin = (float) Math.sin(radians);
        float fCos = (float) Math.cos(radians);
        float f10 = this.f44927o;
        float f11 = f10 * fCos;
        float f12 = this.f44931s;
        float f13 = (-f12) * fSin;
        float f14 = f10 * fSin;
        float f15 = f12 * fCos;
        for (int i10 = 0; i10 < this.f45787b; i10++) {
            View view = this.f44918g3[i10];
            int left = (view.getLeft() + view.getRight()) / 2;
            int top = (view.getTop() + view.getBottom()) / 2;
            float f16 = left - this.f44932t;
            float f17 = top - this.f44933v;
            float f18 = (((f11 * f16) + (f13 * f17)) - f16) + this.f44919h3;
            float f19 = (((f16 * f14) + (f15 * f17)) - f17) + this.f44920i3;
            view.setTranslationX(f18);
            view.setTranslationY(f19);
            view.setScaleY(this.f44931s);
            view.setScaleX(this.f44927o);
            if (!Float.isNaN(this.f44925m)) {
                view.setRotation(this.f44925m);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.b
    public void F(ConstraintLayout constraintLayout) {
        M();
        this.f44932t = Float.NaN;
        this.f44933v = Float.NaN;
        androidx.constraintlayout.core.widgets.e eVarB = ((ConstraintLayout.b) getLayoutParams()).b();
        eVarB.d2(0);
        eVarB.z1(0);
        L();
        layout(((int) this.f44929p1) - getPaddingLeft(), ((int) this.H1) - getPaddingTop(), ((int) this.f44934w) + getPaddingRight(), ((int) this.f44928p0) + getPaddingBottom());
        N();
    }

    @Override // androidx.constraintlayout.widget.b
    public void H(ConstraintLayout constraintLayout) {
        this.f44926n = constraintLayout;
        float rotation = getRotation();
        if (rotation != 0.0f) {
            this.f44925m = rotation;
        } else {
            if (Float.isNaN(this.f44925m)) {
                return;
            }
            this.f44925m = rotation;
        }
    }

    protected void L() {
        if (this.f44926n != null && (this.f44930p2 || Float.isNaN(this.f44932t) || Float.isNaN(this.f44933v))) {
            if (!Float.isNaN(this.f44922k) && !Float.isNaN(this.f44924l)) {
                this.f44933v = this.f44924l;
                this.f44932t = this.f44922k;
                return;
            }
            View[] viewArrX = x(this.f44926n);
            int left = viewArrX[0].getLeft();
            int top = viewArrX[0].getTop();
            int right = viewArrX[0].getRight();
            int bottom = viewArrX[0].getBottom();
            for (int i10 = 0; i10 < this.f45787b; i10++) {
                View view = viewArrX[i10];
                left = Math.min(left, view.getLeft());
                top = Math.min(top, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.f44934w = right;
            this.f44928p0 = bottom;
            this.f44929p1 = left;
            this.H1 = top;
            if (Float.isNaN(this.f44922k)) {
                this.f44932t = (left + right) / 2;
            } else {
                this.f44932t = this.f44922k;
            }
            if (Float.isNaN(this.f44924l)) {
                this.f44933v = (top + bottom) / 2;
            } else {
                this.f44933v = this.f44924l;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f44926n = (ConstraintLayout) getParent();
        if (this.f44921j3 || this.f44923k3) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i10 = 0; i10 < this.f45787b; i10++) {
                View viewById = this.f44926n.getViewById(this.f45786a[i10]);
                if (viewById != null) {
                    if (this.f44921j3) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.f44923k3) {
                        int i11 = 2 & 0;
                        if (elevation > 0.0f) {
                            viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.b
    protected void s(ConstraintLayout constraintLayout) {
        r(constraintLayout);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        q();
    }

    @Override // android.view.View
    public void setPivotX(float f10) {
        this.f44922k = f10;
        N();
    }

    @Override // android.view.View
    public void setPivotY(float f10) {
        this.f44924l = f10;
        N();
    }

    @Override // android.view.View
    public void setRotation(float f10) {
        this.f44925m = f10;
        N();
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        this.f44927o = f10;
        N();
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        this.f44931s = f10;
        N();
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        this.f44919h3 = f10;
        N();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        this.f44920i3 = f10;
        N();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        q();
    }

    @Override // androidx.constraintlayout.widget.b
    protected void z(AttributeSet attributeSet) {
        super.z(attributeSet);
        this.f45790e = false;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.c.H1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == j.c.O1) {
                    this.f44921j3 = true;
                } else if (index == j.c.f46418e2) {
                    this.f44923k3 = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44922k = Float.NaN;
        this.f44924l = Float.NaN;
        this.f44925m = Float.NaN;
        this.f44927o = 1.0f;
        this.f44931s = 1.0f;
        this.f44932t = Float.NaN;
        this.f44933v = Float.NaN;
        this.f44934w = Float.NaN;
        this.f44928p0 = Float.NaN;
        this.f44929p1 = Float.NaN;
        this.H1 = Float.NaN;
        this.f44930p2 = true;
        this.f44918g3 = null;
        this.f44919h3 = 0.0f;
        this.f44920i3 = 0.0f;
    }

    public e(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f44922k = Float.NaN;
        this.f44924l = Float.NaN;
        this.f44925m = Float.NaN;
        this.f44927o = 1.0f;
        this.f44931s = 1.0f;
        this.f44932t = Float.NaN;
        this.f44933v = Float.NaN;
        this.f44934w = Float.NaN;
        this.f44928p0 = Float.NaN;
        this.f44929p1 = Float.NaN;
        this.H1 = Float.NaN;
        this.f44930p2 = true;
        this.f44918g3 = null;
        this.f44919h3 = 0.0f;
        this.f44920i3 = 0.0f;
    }
}
