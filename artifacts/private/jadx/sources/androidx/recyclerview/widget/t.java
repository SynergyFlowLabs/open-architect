package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public class t extends e0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f74560g = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private z f74561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private z f74562f;

    private float m(RecyclerView.p pVar, z zVar) {
        int iV = pVar.V();
        if (iV == 0) {
            return 1.0f;
        }
        View view = null;
        int i10 = 5 >> 0;
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MAX_VALUE;
        View view2 = null;
        for (int i13 = 0; i13 < iV; i13++) {
            View viewU = pVar.U(i13);
            int iW0 = pVar.w0(viewU);
            if (iW0 != -1) {
                if (iW0 < i12) {
                    view = viewU;
                    i12 = iW0;
                }
                if (iW0 > i11) {
                    view2 = viewU;
                    i11 = iW0;
                }
            }
        }
        if (view != null && view2 != null) {
            int iMax = Math.max(zVar.d(view), zVar.d(view2)) - Math.min(zVar.g(view), zVar.g(view2));
            if (iMax == 0) {
                return 1.0f;
            }
            return (iMax * 1.0f) / ((i11 - i12) + 1);
        }
        return 1.0f;
    }

    private int n(@NonNull View view, z zVar) {
        return (zVar.g(view) + (zVar.e(view) / 2)) - (zVar.n() + (zVar.o() / 2));
    }

    private int o(RecyclerView.p pVar, z zVar, int i10, int i11) {
        int[] iArrD = d(i10, i11);
        float fM = m(pVar, zVar);
        if (fM <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArrD[0]) > Math.abs(iArrD[1]) ? iArrD[0] : iArrD[1]) / fM);
    }

    @p0
    private View p(RecyclerView.p pVar, z zVar) {
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
    private z q(@NonNull RecyclerView.p pVar) {
        z zVar = this.f74562f;
        if (zVar == null || zVar.f74609a != pVar) {
            this.f74562f = z.a(pVar);
        }
        return this.f74562f;
    }

    @NonNull
    private z r(@NonNull RecyclerView.p pVar) {
        z zVar = this.f74561e;
        if (zVar == null || zVar.f74609a != pVar) {
            this.f74561e = z.c(pVar);
        }
        return this.f74561e;
    }

    @Override // androidx.recyclerview.widget.e0
    public int[] c(@NonNull RecyclerView.p pVar, @NonNull View view) {
        int[] iArr = new int[2];
        if (pVar.s()) {
            iArr[0] = n(view, q(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.t()) {
            iArr[1] = n(view, r(pVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.e0
    public View h(RecyclerView.p pVar) {
        if (pVar.t()) {
            return p(pVar, r(pVar));
        }
        if (pVar.s()) {
            return p(pVar, q(pVar));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.e0
    public int i(RecyclerView.p pVar, int i10, int i11) {
        int iA;
        View viewH;
        int iW0;
        int i12;
        PointF pointFC;
        int iO;
        int iO2;
        if (!(pVar instanceof RecyclerView.b0.b) || (iA = pVar.a()) == 0 || (viewH = h(pVar)) == null || (iW0 = pVar.w0(viewH)) == -1 || (pointFC = ((RecyclerView.b0.b) pVar).c((i12 = iA - 1))) == null) {
            return -1;
        }
        if (pVar.s()) {
            iO = o(pVar, q(pVar), i10, 0);
            if (pointFC.x < 0.0f) {
                iO = -iO;
            }
        } else {
            iO = 0;
        }
        if (pVar.t()) {
            iO2 = o(pVar, r(pVar), 0, i11);
            if (pointFC.y < 0.0f) {
                iO2 = -iO2;
            }
        } else {
            iO2 = 0;
        }
        if (pVar.t()) {
            iO = iO2;
        }
        if (iO == 0) {
            return -1;
        }
        int i13 = iW0 + iO;
        int i14 = i13 >= 0 ? i13 : 0;
        return i14 >= iA ? i12 : i14;
    }
}
