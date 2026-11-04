package androidx.compose.foundation.lazy;

import androidx.compose.foundation.b2;
import androidx.compose.foundation.lazy.layout.m2;
import androidx.compose.foundation.lazy.layout.u2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@b2
public interface t0 {
    @kotlin.l(message = "Customization of PrefetchScheduler is no longer supported. LazyLayout will attach an appropriate scheduler internally.")
    static /* synthetic */ void b() {
    }

    void a(@NotNull m2 m2Var, int i10);

    @Nullable
    default u2 c() {
        return null;
    }

    void e(@NotNull s0 s0Var, float f10, @NotNull f0 f0Var);

    void g(@NotNull s0 s0Var, @NotNull f0 f0Var);
}
