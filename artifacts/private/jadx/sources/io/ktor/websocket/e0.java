package io.ktor.websocket;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface e0<ConfigType> {
    @NotNull
    f0<ConfigType, ? extends e0<ConfigType>> a();

    @NotNull
    List<h0> b();

    @NotNull
    e c(@NotNull e eVar);

    @NotNull
    e d(@NotNull e eVar);

    @NotNull
    List<h0> e(@NotNull List<h0> list);

    boolean f(@NotNull List<h0> list);
}
