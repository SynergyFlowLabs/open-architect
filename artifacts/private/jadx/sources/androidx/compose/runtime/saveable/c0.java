package androidx.compose.runtime.saveable;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface c0<Original, Saveable> {
    @Nullable
    Saveable a(@NotNull g0 g0Var, Original original);

    @Nullable
    Original b(@NotNull Saveable saveable);
}
