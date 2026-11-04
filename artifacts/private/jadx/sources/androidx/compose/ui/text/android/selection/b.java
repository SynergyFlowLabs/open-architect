package androidx.compose.ui.text.android.selection;

import androidx.compose.runtime.internal.w0;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 1)
public abstract class b implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f41419c = 0;

    @Override // androidx.compose.ui.text.android.selection.e
    public int a(int i10) {
        int iF = f(i10);
        if (iF == -1 || f(iF) == -1) {
            return -1;
        }
        return iF;
    }

    @Override // androidx.compose.ui.text.android.selection.e
    public int b(int i10) {
        int iE = e(i10);
        if (iE != -1 && e(iE) != -1) {
            return iE;
        }
        return -1;
    }

    @Override // androidx.compose.ui.text.android.selection.e
    public int c(int i10) {
        return f(i10);
    }

    @Override // androidx.compose.ui.text.android.selection.e
    public int d(int i10) {
        return e(i10);
    }

    public abstract int e(int i10);

    public abstract int f(int i10);
}
