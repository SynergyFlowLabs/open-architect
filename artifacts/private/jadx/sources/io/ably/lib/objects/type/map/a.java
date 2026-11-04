package io.ably.lib.objects.type.map;

import java.util.Map;
import lm.e;
import lm.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface a extends b, io.ably.lib.objects.type.a {
    @i
    void e(@NotNull String str, @NotNull mg.d<Void> dVar);

    @i
    void g(@NotNull String str, @NotNull d dVar, @NotNull mg.d<Void> dVar2);

    @Nullable
    d get(@NotNull String str);

    @lm.c
    void j(@NotNull String str, @NotNull d dVar);

    @NotNull
    Iterable<Map.Entry<String, d>> k();

    @NotNull
    Iterable<String> keys();

    @lm.c
    void remove(@NotNull String str);

    @e(pure = true)
    @NotNull
    Long size();

    @NotNull
    Iterable<d> values();
}
