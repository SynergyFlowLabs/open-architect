package com.google.android.material.carousel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.annotation.p0;
import com.google.android.material.shape.t;
import com.google.android.material.shape.u;

/* JADX INFO: loaded from: classes4.dex */
public class p extends FrameLayout implements m, t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f111792g = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f111793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RectF f111794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private r f111795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private com.google.android.material.shape.p f111796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final u f111797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private Boolean f111798f;

    public p(@NonNull Context context) {
        this(context, null);
    }

    public static /* synthetic */ com.google.android.material.shape.e a(com.google.android.material.shape.e eVar) {
        if (eVar instanceof com.google.android.material.shape.a) {
            eVar = com.google.android.material.shape.c.b((com.google.android.material.shape.a) eVar);
        }
        return eVar;
    }

    private void c() {
        this.f111797e.f(this, this.f111794b);
        r rVar = this.f111795c;
        if (rVar != null) {
            rVar.a(this.f111794b);
        }
    }

    private void d() {
        if (this.f111793a != -1.0f) {
            float fB = com.google.android.material.animation.b.b(0.0f, getWidth() / 2.0f, 0.0f, 1.0f, this.f111793a);
            setMaskRectF(new RectF(fB, 0.0f, getWidth() - fB, getHeight()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        this.f111797e.e(canvas, new s6.a.InterfaceC2504a() { // from class: com.google.android.material.carousel.o
            @Override // s6.a.InterfaceC2504a
            public final void a(Canvas canvas2) {
                super/*android.view.View*/.dispatchDraw(canvas2);
            }
        });
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        RectF rectF = this.f111794b;
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    @Override // com.google.android.material.carousel.m
    @NonNull
    public RectF getMaskRectF() {
        return this.f111794b;
    }

    @Override // com.google.android.material.carousel.m
    @Deprecated
    public float getMaskXPercentage() {
        return this.f111793a;
    }

    @Override // com.google.android.material.shape.t
    @NonNull
    public com.google.android.material.shape.p getShapeAppearanceModel() {
        return this.f111796d;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Boolean bool = this.f111798f;
        if (bool != null) {
            this.f111797e.h(this, bool.booleanValue());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f111798f = Boolean.valueOf(this.f111797e.c());
        this.f111797e.h(this, true);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f111793a != -1.0f) {
            d();
        }
    }

    @Override // android.view.View
    @e.a({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f111794b.isEmpty() && motionEvent.getAction() == 0) {
            if (!this.f111794b.contains(motionEvent.getX(), motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @l1
    @b1({b1.a.LIBRARY_GROUP})
    public void setForceCompatClipping(boolean z10) {
        this.f111797e.h(this, z10);
    }

    @Override // com.google.android.material.carousel.m
    public void setMaskRectF(@NonNull RectF rectF) {
        this.f111794b.set(rectF);
        c();
    }

    @Override // com.google.android.material.carousel.m
    @Deprecated
    public void setMaskXPercentage(float f10) {
        float fD = n1.a.d(f10, 0.0f, 1.0f);
        if (this.f111793a != fD) {
            this.f111793a = fD;
            d();
        }
    }

    @Override // com.google.android.material.carousel.m
    public void setOnMaskChangedListener(@p0 r rVar) {
        this.f111795c = rVar;
    }

    @Override // com.google.android.material.shape.t
    public void setShapeAppearanceModel(@NonNull com.google.android.material.shape.p pVar) {
        com.google.android.material.shape.p pVarY = pVar.y(new com.google.android.material.shape.p.c() { // from class: com.google.android.material.carousel.n
            @Override // com.google.android.material.shape.p.c
            public final com.google.android.material.shape.e a(com.google.android.material.shape.e eVar) {
                return p.a(eVar);
            }
        });
        this.f111796d = pVarY;
        this.f111797e.g(this, pVarY);
    }

    public p(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public p(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f111793a = -1.0f;
        this.f111794b = new RectF();
        this.f111797e = u.a(this);
        this.f111798f = null;
        setShapeAppearanceModel(com.google.android.material.shape.p.f(context, attributeSet, i10, 0, 0).m());
    }
}
