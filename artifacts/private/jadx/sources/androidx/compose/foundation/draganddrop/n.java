package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.input.pointer.l0;

/* JADX INFO: loaded from: classes.dex */
public interface n extends l0 {
    static /* synthetic */ void I8(n nVar, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestDragAndDropTransfer-k-4lQ0M");
        }
        if ((i10 & 1) != 0) {
            j10 = n0.g.f332700b.c();
        }
        nVar.G(j10);
    }

    void G(long j10);
}
