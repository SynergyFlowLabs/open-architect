package androidx.compose.foundation;

import androidx.compose.runtime.k7;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
public interface t2 {
    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.ERROR, message = "rememberUpdatedInstance has been deprecated - implementers should instead implement IndicationNodeFactory#create for improved performance and efficiency. Callers should check if the Indication is an IndicationNodeFactory, and call that API instead. For a migration guide and background information, please visit developer.android.com")
    @NotNull
    default u2 b(@NotNull androidx.compose.foundation.interaction.h hVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.E(1257603829);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1257603829, i10, -1, "androidx.compose.foundation.Indication.rememberUpdatedInstance (Indication.kt:74)");
        }
        t3 t3Var = t3.f18751a;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        return t3Var;
    }
}
