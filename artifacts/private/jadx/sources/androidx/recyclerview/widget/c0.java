package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
class c0 {
    private c0() {
    }

    static int a(RecyclerView.c0 c0Var, z zVar, View view, View view2, RecyclerView.p pVar, boolean z10) {
        if (pVar.V() == 0 || c0Var.d() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(pVar.w0(view) - pVar.w0(view2)) + 1;
        }
        return Math.min(zVar.o(), zVar.d(view2) - zVar.g(view));
    }

    static int b(RecyclerView.c0 c0Var, z zVar, View view, View view2, RecyclerView.p pVar, boolean z10, boolean z11) {
        if (pVar.V() == 0 || c0Var.d() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z11 ? Math.max(0, (c0Var.d() - Math.max(pVar.w0(view), pVar.w0(view2))) - 1) : Math.max(0, Math.min(pVar.w0(view), pVar.w0(view2)));
        if (z10) {
            return Math.round((iMax * (Math.abs(zVar.d(view2) - zVar.g(view)) / (Math.abs(pVar.w0(view) - pVar.w0(view2)) + 1))) + (zVar.n() - zVar.g(view)));
        }
        return iMax;
    }

    static int c(RecyclerView.c0 c0Var, z zVar, View view, View view2, RecyclerView.p pVar, boolean z10) {
        if (pVar.V() != 0 && c0Var.d() != 0 && view != null && view2 != null) {
            if (!z10) {
                return c0Var.d();
            }
            return (int) (((zVar.d(view2) - zVar.g(view)) / (Math.abs(pVar.w0(view) - pVar.w0(view2)) + 1)) * c0Var.d());
        }
        return 0;
    }
}
