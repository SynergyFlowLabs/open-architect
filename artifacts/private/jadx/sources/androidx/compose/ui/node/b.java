package androidx.compose.ui.node;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface b extends androidx.compose.ui.layout.z0 {
    void B0();

    boolean J();

    @NotNull
    k1 J0();

    @NotNull
    Map<androidx.compose.ui.layout.a, Integer> P();

    void T0(@NotNull Function1<? super b, Unit> function1);

    void n0();

    void requestLayout();

    @Nullable
    b t0();

    @NotNull
    a x();
}
