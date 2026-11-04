package kotlinx.serialization;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface a extends x {
    @NotNull
    <T> byte[] a(@NotNull d0<? super T> d0Var, T t10);

    <T> T b(@NotNull e<? extends T> eVar, @NotNull byte[] bArr);
}
