package androidx.paging;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class h {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T d(l2<T> l2Var, @androidx.annotation.g0(from = 0) int i10) {
        if (i10 >= 0 && i10 < l2Var.getSize()) {
            int i11 = i10 - l2Var.i();
            if (i11 < 0 || i11 >= l2Var.c()) {
                return null;
            }
            return l2Var.getItem(i11);
        }
        throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + l2Var.getSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T e(l2<T> l2Var, @androidx.annotation.g0(from = 0) int i10) {
        return (T) d(l2Var, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> q0<T> f(l2<T> l2Var) {
        int iC = l2Var.c() - 1;
        ArrayList arrayList = new ArrayList();
        if (iC >= 0) {
            int i10 = 0;
            while (true) {
                arrayList.add(l2Var.getItem(i10));
                if (i10 == iC) {
                    break;
                }
                i10++;
            }
        }
        return new q0<>(l2Var.i(), l2Var.k(), arrayList);
    }
}
