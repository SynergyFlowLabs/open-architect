package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.k0;
import androidx.compose.ui.unit.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface d {
    default void b(@NotNull w wVar) {
    }

    long d();

    default void e(@NotNull androidx.compose.ui.unit.d dVar) {
    }

    @NotNull
    default k0 f() {
        return l.f37743a;
    }

    void g(long j10);

    @NotNull
    default androidx.compose.ui.unit.d getDensity() {
        return e.a();
    }

    @NotNull
    default w getLayoutDirection() {
        return w.Ltr;
    }

    @Nullable
    default androidx.compose.ui.graphics.layer.c h() {
        return null;
    }

    @NotNull
    j i();

    default void j(@Nullable androidx.compose.ui.graphics.layer.c cVar) {
    }

    default void k(@NotNull k0 k0Var) {
    }
}
