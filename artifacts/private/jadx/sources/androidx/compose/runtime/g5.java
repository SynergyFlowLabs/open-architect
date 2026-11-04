package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface g5 {
    long a();

    @d2
    @Nullable
    default androidx.compose.runtime.tooling.p b(@NotNull androidx.compose.runtime.tooling.r rVar) {
        return null;
    }

    boolean c();

    @NotNull
    kotlinx.coroutines.flow.i<c5.e> getState();
}
