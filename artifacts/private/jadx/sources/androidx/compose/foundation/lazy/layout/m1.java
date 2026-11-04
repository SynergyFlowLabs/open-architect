package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.z3;

/* JADX INFO: loaded from: classes.dex */
public interface m1 extends z3 {
    static /* synthetic */ int b(m1 m1Var, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateDistanceTo");
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return m1Var.g(i10, i11);
    }

    static /* synthetic */ void h(m1 m1Var, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: snapToItem");
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        m1Var.e(i10, i11);
    }

    int a();

    int c();

    int d();

    void e(int i10, int i11);

    int g(int i10, int i11);

    int i();
}
