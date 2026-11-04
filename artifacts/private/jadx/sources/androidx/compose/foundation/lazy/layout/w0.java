package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.k7;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@k7
public interface w0 extends androidx.compose.ui.layout.c1 {
    @NotNull
    List<androidx.compose.ui.layout.z0> g8(@androidx.annotation.g0(from = 0) int i10);

    @kotlin.l(message = "Please use compose and call Measurable.measure", replaceWith = @kotlin.b1(expression = "compose(index).map { it.measure(constraints) }", imports = {}))
    @androidx.compose.foundation.b2
    @NotNull
    List<androidx.compose.ui.layout.i2> t1(int i10, long j10);
}
