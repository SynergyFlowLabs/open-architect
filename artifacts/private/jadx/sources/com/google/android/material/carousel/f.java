package com.google.android.material.carousel;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e0;

/* JADX INFO: loaded from: classes4.dex */
public class f extends e0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f111749g = 100.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f111750h = 50.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f111751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private RecyclerView f111752f;

    class a extends androidx.recyclerview.widget.s {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ RecyclerView.p f111753x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, RecyclerView.p pVar) {
            super(context);
            this.f111753x = pVar;
        }

        @Override // androidx.recyclerview.widget.s, androidx.recyclerview.widget.RecyclerView.b0
        protected void p(View view, RecyclerView.c0 c0Var, RecyclerView.b0.a aVar) {
            if (f.this.f111752f != null) {
                f fVar = f.this;
                int[] iArrO = fVar.o(fVar.f111752f.getLayoutManager(), view, true);
                int i10 = iArrO[0];
                int i11 = iArrO[1];
                int iX = x(Math.max(Math.abs(i10), Math.abs(i11)));
                if (iX > 0) {
                    aVar.l(i10, i11, iX, this.f74553j);
                }
            }
        }

        @Override // androidx.recyclerview.widget.s
        protected float w(DisplayMetrics displayMetrics) {
            float f10;
            float f11;
            if (this.f111753x.t()) {
                f10 = displayMetrics.densityDpi;
                f11 = 50.0f;
            } else {
                f10 = displayMetrics.densityDpi;
                f11 = f.f111749g;
            }
            return f11 / f10;
        }
    }

    public f() {
        this(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] o(@NonNull RecyclerView.p pVar, @NonNull View view, boolean z10) {
        if (!(pVar instanceof CarouselLayoutManager)) {
            return new int[]{0, 0};
        }
        int iP = p(view, (CarouselLayoutManager) pVar, z10);
        if (pVar.s()) {
            return new int[]{iP, 0};
        }
        return pVar.t() ? new int[]{0, iP} : new int[]{0, 0};
    }

    private int p(@NonNull View view, CarouselLayoutManager carouselLayoutManager, boolean z10) {
        return carouselLayoutManager.S2(carouselLayoutManager.w0(view), z10);
    }

    @p0
    private View q(RecyclerView.p pVar) {
        int iV = pVar.V();
        View view = null;
        if (iV != 0 && (pVar instanceof CarouselLayoutManager)) {
            CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) pVar;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < iV; i11++) {
                View viewU = pVar.U(i11);
                int iAbs = Math.abs(carouselLayoutManager.S2(pVar.w0(viewU), false));
                if (iAbs < i10) {
                    view = viewU;
                    i10 = iAbs;
                }
            }
        }
        return view;
    }

    private boolean r(RecyclerView.p pVar, int i10, int i11) {
        if (pVar.s()) {
            return i10 > 0;
        }
        return i11 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean s(RecyclerView.p pVar) {
        PointF pointFC;
        int iA = pVar.a();
        if (!(pVar instanceof RecyclerView.b0.b) || (pointFC = ((RecyclerView.b0.b) pVar).c(iA - 1)) == null) {
            return false;
        }
        return pointFC.x < 0.0f || pointFC.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.e0
    public void b(@p0 RecyclerView recyclerView) {
        super.b(recyclerView);
        this.f111752f = recyclerView;
    }

    @Override // androidx.recyclerview.widget.e0
    @p0
    public int[] c(@NonNull RecyclerView.p pVar, @NonNull View view) {
        return o(pVar, view, false);
    }

    @Override // androidx.recyclerview.widget.e0
    @p0
    protected RecyclerView.b0 e(@NonNull RecyclerView.p pVar) {
        if (pVar instanceof RecyclerView.b0.b) {
            return new a(this.f111752f.getContext(), pVar);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.e0
    @p0
    public View h(RecyclerView.p pVar) {
        return q(pVar);
    }

    @Override // androidx.recyclerview.widget.e0
    public int i(RecyclerView.p pVar, int i10, int i11) {
        int iA;
        if (this.f111751e && (iA = pVar.a()) != 0) {
            int iV = pVar.V();
            View view = null;
            int i12 = Integer.MAX_VALUE;
            int i13 = Integer.MIN_VALUE;
            View view2 = null;
            for (int i14 = 0; i14 < iV; i14++) {
                View viewU = pVar.U(i14);
                if (viewU != null) {
                    int iP = p(viewU, (CarouselLayoutManager) pVar, false);
                    if (iP <= 0 && iP > i13) {
                        view2 = viewU;
                        i13 = iP;
                    }
                    if (iP >= 0 && iP < i12) {
                        view = viewU;
                        i12 = iP;
                    }
                }
            }
            boolean zR = r(pVar, i10, i11);
            if (zR && view != null) {
                return pVar.w0(view);
            }
            if (!zR && view2 != null) {
                return pVar.w0(view2);
            }
            if (zR) {
                view = view2;
            }
            if (view == null) {
                return -1;
            }
            int iW0 = pVar.w0(view) + (s(pVar) == zR ? -1 : 1);
            if (iW0 < 0 || iW0 >= iA) {
                return -1;
            }
            return iW0;
        }
        return -1;
    }

    public f(boolean z10) {
        this.f111751e = z10;
    }
}
