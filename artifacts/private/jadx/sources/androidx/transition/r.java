package androidx.transition;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
@e.a({"ViewConstructor"})
class r extends ViewGroup implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ViewGroup f75755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    View f75756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final View f75757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f75758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private Matrix f75759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f75760f;

    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            View view;
            r.this.postInvalidateOnAnimation();
            r rVar = r.this;
            ViewGroup viewGroup = rVar.f75755a;
            if (viewGroup != null && (view = rVar.f75756b) != null) {
                viewGroup.endViewTransition(view);
                r.this.f75755a.postInvalidateOnAnimation();
                r rVar2 = r.this;
                rVar2.f75755a = null;
                rVar2.f75756b = null;
            }
            return true;
        }
    }

    r(View view) {
        super(view.getContext());
        this.f75760f = new a();
        this.f75757c = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    static r b(View view, ViewGroup viewGroup, Matrix matrix) {
        int i10;
        p pVar;
        if (!(view.getParent() instanceof ViewGroup)) {
            throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
        }
        p pVarB = p.b(viewGroup);
        r rVarE = e(view);
        if (rVarE == null || (pVar = (p) rVarE.getParent()) == pVarB) {
            i10 = 0;
        } else {
            i10 = rVarE.f75758d;
            pVar.removeView(rVarE);
            rVarE = null;
        }
        if (rVarE == null) {
            if (matrix == null) {
                matrix = new Matrix();
                c(view, viewGroup, matrix);
            }
            rVarE = new r(view);
            rVarE.h(matrix);
            if (pVarB == null) {
                pVarB = new p(viewGroup);
            } else {
                pVarB.g();
            }
            d(viewGroup, pVarB);
            d(viewGroup, rVarE);
            pVarB.a(rVarE);
            rVarE.f75758d = i10;
        } else if (matrix != null) {
            rVarE.h(matrix);
        }
        rVarE.f75758d++;
        return rVarE;
    }

    static void c(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        z0.h(viewGroup2, matrix);
        matrix.preTranslate(-viewGroup2.getScrollX(), -viewGroup2.getScrollY());
        z0.i(viewGroup, matrix);
    }

    static void d(View view, View view2) {
        z0.e(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    static r e(View view) {
        return (r) view.getTag(a0.a.f75493a);
    }

    static void f(View view) {
        r rVarE = e(view);
        if (rVarE != null) {
            int i10 = rVarE.f75758d - 1;
            rVarE.f75758d = i10;
            if (i10 <= 0) {
                ((p) rVarE.getParent()).removeView(rVarE);
            }
        }
    }

    static void g(@NonNull View view, @androidx.annotation.p0 r rVar) {
        view.setTag(a0.a.f75493a, rVar);
    }

    @Override // androidx.transition.o
    public void a(ViewGroup viewGroup, View view) {
        this.f75755a = viewGroup;
        this.f75756b = view;
    }

    void h(@NonNull Matrix matrix) {
        this.f75759e = matrix;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        g(this.f75757c, this);
        this.f75757c.getViewTreeObserver().addOnPreDrawListener(this.f75760f);
        z0.g(this.f75757c, 4);
        if (this.f75757c.getParent() != null) {
            ((View) this.f75757c.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f75757c.getViewTreeObserver().removeOnPreDrawListener(this.f75760f);
        z0.g(this.f75757c, 0);
        g(this.f75757c, null);
        if (this.f75757c.getParent() != null) {
            ((View) this.f75757c.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(@NonNull Canvas canvas) {
        c.a(canvas, true);
        canvas.setMatrix(this.f75759e);
        z0.g(this.f75757c, 0);
        this.f75757c.invalidate();
        z0.g(this.f75757c, 4);
        drawChild(canvas, this.f75757c, getDrawingTime());
        c.a(canvas, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View, androidx.transition.o
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (e(this.f75757c) == this) {
            z0.g(this.f75757c, i10 == 0 ? 4 : 0);
        }
    }
}
