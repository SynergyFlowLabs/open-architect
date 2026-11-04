package io.ktor.util;

import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public interface p1 {
    void a(@NotNull String str, @NotNull String str2);

    @Nullable
    List<String> b(@NotNull String str);

    @NotNull
    o1 build();

    boolean c();

    void clear();

    boolean contains(@NotNull String str);

    boolean d(@NotNull String str, @NotNull String str2);

    void e(@NotNull o1 o1Var);

    boolean f(@NotNull String str, @NotNull String str2);

    void g(@NotNull String str, @NotNull Iterable<String> iterable);

    @Nullable
    String get(@NotNull String str);

    void h();

    void i(@NotNull String str, @NotNull Iterable<String> iterable);

    boolean isEmpty();

    void j(@NotNull o1 o1Var);

    @NotNull
    Set<Map.Entry<String, List<String>>> k();

    void l(@NotNull String str, @NotNull String str2);

    @NotNull
    Set<String> names();

    void remove(@NotNull String str);
}
