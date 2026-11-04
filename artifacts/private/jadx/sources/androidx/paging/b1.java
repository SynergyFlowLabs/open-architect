package androidx.paging;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.l(message = "Logger interface is no longer supported.")
public interface b1 {
    static /* synthetic */ void a(b1 b1Var, int i10, String str, Throwable th2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i11 & 4) != 0) {
            th2 = null;
        }
        b1Var.b(i10, str, th2);
    }

    void b(int i10, @NotNull String str, @Nullable Throwable th2);

    boolean c(int i10);
}
