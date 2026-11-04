package androidx.compose.foundation.lazy;

import androidx.compose.foundation.b2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@b2
public interface s0 {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ androidx.compose.foundation.lazy.layout.i1.b b(s0 s0Var, int i10, Function1 function1, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: schedulePrefetch");
        }
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        return s0Var.a(i10, function1);
    }

    @NotNull
    androidx.compose.foundation.lazy.layout.i1.b a(int i10, @Nullable Function1<? super q0, Unit> function1);
}
