package kotlinx.serialization;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface r0 extends x {
    <T> T decodeFromString(@NotNull e<? extends T> eVar, @NotNull String str);

    @NotNull
    <T> String encodeToString(@NotNull d0<? super T> d0Var, T t10);
}
