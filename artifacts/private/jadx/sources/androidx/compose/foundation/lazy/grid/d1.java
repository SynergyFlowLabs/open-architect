package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.m2;
import androidx.compose.foundation.lazy.layout.u2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.foundation.b2
public interface d1 {
    @kotlin.l(message = "Customization of PrefetchScheduler is no longer supported. LazyLayout will attach an appropriate scheduler internally.")
    static /* synthetic */ void b() {
    }

    void a(@NotNull m2 m2Var, int i10);

    @Nullable
    default u2 c() {
        return null;
    }

    void d(@NotNull c1 c1Var, float f10, @NotNull n0 n0Var);

    void f(@NotNull c1 c1Var, @NotNull n0 n0Var);
}
