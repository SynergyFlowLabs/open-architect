package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.foundation.b2
public interface c1 {
    @NotNull
    default List<androidx.compose.foundation.lazy.layout.i1.b> a(int i10, @Nullable Function1<? super a1, Unit> function1) {
        return b(i10);
    }

    @NotNull
    List<androidx.compose.foundation.lazy.layout.i1.b> b(int i10);
}
