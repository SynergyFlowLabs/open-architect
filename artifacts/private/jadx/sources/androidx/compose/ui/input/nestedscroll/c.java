package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.a0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class c {
    @NotNull
    public static final a0 a(@NotNull a0 a0Var, @NotNull a aVar, @Nullable b bVar) {
        return a0Var.B2(new NestedScrollElement(aVar, bVar));
    }

    public static /* synthetic */ a0 b(a0 a0Var, a aVar, b bVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        return a(a0Var, aVar, bVar);
    }
}
