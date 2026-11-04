package androidx.compose.ui.focus;

/* JADX INFO: loaded from: classes.dex */
public interface q {

    public static final class a {
    }

    static /* synthetic */ void o(q qVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearFocus");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        qVar.A(z10);
    }

    void A(boolean z10);

    boolean t(int i10);
}
