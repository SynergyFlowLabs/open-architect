package androidx.compose.runtime.tooling;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface f {
    @Nullable
    default m c(@NotNull Object obj) {
        return null;
    }

    @NotNull
    Iterable<m> i();

    boolean isEmpty();
}
