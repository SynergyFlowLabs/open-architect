package androidx.compose.foundation.gestures;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface u3 {
    default boolean a() {
        return true;
    }

    default boolean b(@NotNull androidx.compose.ui.input.pointer.q qVar) {
        return false;
    }

    long c(@NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.input.pointer.q qVar, long j10);
}
