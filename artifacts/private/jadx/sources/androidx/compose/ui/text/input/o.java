package androidx.compose.ui.text.input;

import androidx.compose.ui.text.w3;
import androidx.compose.ui.text.x3;

/* JADX INFO: loaded from: classes2.dex */
public final class o {
    public static final long a(long j10, long j11) {
        int iJ;
        int iL = w3.l(j10);
        int iK = w3.k(j10);
        if (w3.p(j11, j10)) {
            if (w3.d(j11, j10)) {
                iL = w3.l(j11);
                iK = iL;
            } else {
                if (w3.d(j10, j11)) {
                    iJ = w3.j(j11);
                } else if (w3.e(j11, iL)) {
                    iL = w3.l(j11);
                    iJ = w3.j(j11);
                } else {
                    iK = w3.l(j11);
                }
                iK -= iJ;
            }
        } else if (iK > w3.l(j11)) {
            iL -= w3.j(j11);
            iJ = w3.j(j11);
            iK -= iJ;
        }
        return x3.b(iL, iK);
    }
}
