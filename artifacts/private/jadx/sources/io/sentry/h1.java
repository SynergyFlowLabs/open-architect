package io.sentry;

import java.util.Collection;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface h1 {
    void A(@NotNull io.sentry.protocol.v vVar);

    void a(@NotNull String str, @NotNull String str2);

    void b(@NotNull Map<String, String> map);

    void c(@NotNull String str);

    void d(@NotNull String str, @NotNull String str2);

    void e(@NotNull Collection<f> collection);

    void f(@NotNull String str);

    void g(@NotNull io.sentry.protocol.c cVar);

    void h(@Nullable y7 y7Var);

    void i(@NotNull Map<String, Object> map);

    void j(@Nullable io.sentry.protocol.g0 g0Var);

    void k(@NotNull f fVar);

    void l(@Nullable String str);

    void m(@NotNull Collection<String> collection);

    void n(@Nullable p9 p9Var, @NotNull g1 g1Var);

    void r(@Nullable io.sentry.protocol.m mVar);
}
