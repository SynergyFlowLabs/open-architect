package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public class a0 extends e0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f74134g = 100;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private z f74135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private z f74136f;

    class a extends s {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.s, androidx.recyclerview.widget.RecyclerView.b0
        protected void p(@NonNull View view, @NonNull RecyclerView.c0 c0Var, @NonNull RecyclerView.b0.a aVar) {
            a0 a0Var = a0.this;
            int[] iArrC = a0Var.c(a0Var.f74203a.getLayoutManager(), view);
            int i10 = iArrC[0];
            int i11 = iArrC[1];
            int iX = x(Math.max(Math.abs(i10), Math.abs(i11)));
            if (iX > 0) {
                aVar.l(i10, i11, iX, this.f74553j);
            }
        }

        @Override // androidx.recyclerview.widget.s
        protected float w(@NonNull DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.s
        protected int y(int i10) {
            return Math.min(100, super.y(i10));
        }
    }

    private int m(@NonNull View view, z zVar) {
        return (zVar.g(view) + (zVar.e(view) / 2)) - (zVar.n() + (zVar.o() / 2));
    }

    @p0
    private View n(RecyclerView.p pVar, z zVar) {
        int iV = pVar.V();
        View view = null;
        if (iV == 0) {
            return null;
        }
        int iN = zVar.n() + (zVar.o() / 2);
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < iV; i11++) {
            View viewU = pVar.U(i11);
            int iAbs = Math.abs((zVar.g(viewU) + (zVar.e(viewU) / 2)) - iN);
            if (iAbs < i10) {
                view = viewU;
                i10 = iAbs;
            }
        }
        return view;
    }

    @NonNull
    private z o(@NonNull RecyclerView.p pVar) {
        z zVar = this.f74136f;
        if (zVar == null || zVar.f74609a != pVar) {
            this.f74136f = z.a(pVar);
        }
        return this.f74136f;
    }

    @p0
    private z p(RecyclerView.p pVar) {
        if (pVar.t()) {
            return q(pVar);
        }
        if (pVar.s()) {
            return o(pVar);
        }
        return null;
    }

    @NonNull
    private z q(@NonNull RecyclerView.p pVar) {
        z zVar = this.f74135e;
        if (zVar == null || zVar.f74609a != pVar) {
            this.f74135e = z.c(pVar);
        }
        return this.f74135e;
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
    @p0
    public int[] c(@NonNull RecyclerView.p pVar, @NonNull View view) {
        int[] iArr = new int[2];
        if (pVar.s()) {
            iArr[0] = m(view, o(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.t()) {
            iArr[1] = m(view, q(pVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.e0
    @p0
    protected RecyclerView.b0 e(@NonNull RecyclerView.p pVar) {
        if (pVar instanceof RecyclerView.b0.b) {
            return new a(this.f74203a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.e0
    @e.a({"UnknownNullness"})
    @p0
    public View h(RecyclerView.p pVar) {
        if (pVar.t()) {
            return n(pVar, q(pVar));
        }
        if (pVar.s()) {
            return n(pVar, o(pVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.e0
    @e.a({"UnknownNullness"})
    public int i(RecyclerView.p pVar, int i10, int i11) {
        z zVarP;
        int iA = pVar.a();
        if (iA == 0 || (zVarP = p(pVar)) == null) {
            return -1;
        }
        int iV = pVar.V();
        View view = null;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i14 = 0; i14 < iV; i14++) {
            View viewU = pVar.U(i14);
            if (viewU != null) {
                int iM = m(viewU, zVarP);
                if (iM <= 0 && iM > i13) {
                    view2 = viewU;
                    i13 = iM;
                }
                if (iM >= 0 && iM < i12) {
                    view = viewU;
                    i12 = iM;
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
        if (iW0 >= 0 && iW0 < iA) {
            return iW0;
        }
        return -1;
    }
}
