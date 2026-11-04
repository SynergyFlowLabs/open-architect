package androidx.compose.ui.layout;

import androidx.compose.ui.platform.o4;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface l0 {
    boolean I();

    boolean J();

    int K();

    @NotNull
    List<g1> L();

    default boolean M() {
        return false;
    }

    @NotNull
    androidx.compose.ui.unit.d getDensity();

    int getHeight();

    @NotNull
    androidx.compose.ui.unit.w getLayoutDirection();

    @NotNull
    o4 getViewConfiguration();

    int getWidth();

    @NotNull
    g0 n();

    @Nullable
    l0 o();
}
