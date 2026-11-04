package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.graphics.q3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface k {
    default void a() {
    }

    @NotNull
    default DropShadowPainter c(@NotNull q3 q3Var, @NotNull j jVar) {
        return new DropShadowPainter(q3Var, jVar);
    }

    @NotNull
    default InnerShadowPainter e(@NotNull q3 q3Var, @NotNull j jVar) {
        return new InnerShadowPainter(q3Var, jVar);
    }
}
