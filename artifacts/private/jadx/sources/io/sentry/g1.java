package io.sentry;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface g1 {
    @lm.a.c
    void A(@NotNull io.sentry.protocol.v vVar);

    void B(@Nullable String str, @Nullable Collection<?> collection);

    @lm.a.c
    @NotNull
    Queue<f> C();

    @Nullable
    k9 D(@NotNull t4.b bVar);

    @lm.a.c
    @NotNull
    Map<String, String> E();

    void F(@Nullable r1 r1Var);

    @Nullable
    io.sentry.protocol.g0 G();

    void H(@Nullable String str, @Nullable Boolean bool);

    void I();

    void J();

    void K(@Nullable String str, @Nullable Character ch2);

    @lm.a.c
    @Nullable
    k9 L();

    void M(@Nullable String str, @Nullable Object[] objArr);

    @lm.a.c
    void N(@Nullable String str);

    @NotNull
    k1 O();

    void P(@NotNull i0 i0Var);

    @lm.a.c
    void Q(@NotNull o7 o7Var);

    @lm.a.c
    @NotNull
    List<i0> R();

    void S(@Nullable String str, @Nullable Number number);

    @lm.a.c
    void T(@NotNull m4 m4Var);

    @lm.a.c
    void U(@NotNull n8 n8Var);

    void V(@Nullable String str, @Nullable String str2);

    @lm.a.c
    @NotNull
    List<io.sentry.internal.eventprocessor.a> W();

    void X(@Nullable String str, @Nullable Object obj);

    @lm.a.c
    @Nullable
    String Y();

    @lm.a.c
    @NotNull
    List<String> Z();

    void a(@Nullable String str, @Nullable String str2);

    @Nullable
    String a0();

    @NotNull
    n8 b();

    void b0(@Nullable String str);

    void c(@Nullable String str);

    @lm.a.c
    @NotNull
    m4 c0();

    void clear();

    @NotNull
    /* JADX INFO: renamed from: clone */
    g1 m784clone();

    void d(@Nullable String str, @Nullable String str2);

    void d0(@NotNull b bVar);

    @Nullable
    p1 e();

    @NotNull
    List<b> e0();

    void f(@Nullable String str);

    @lm.a.c
    void f0();

    @Nullable
    y7 g();

    @lm.a.c
    @NotNull
    m4 g0(@NotNull t4.a aVar);

    @lm.a.c
    @NotNull
    Map<String, Object> getExtras();

    @Nullable
    io.sentry.protocol.m getRequest();

    void h(@Nullable y7 y7Var);

    @lm.a.c
    void h0(@NotNull t4.c cVar);

    void i0(@NotNull io.sentry.protocol.v vVar);

    void j(@Nullable io.sentry.protocol.g0 g0Var);

    void k(@NotNull f fVar);

    void l(@NotNull String str);

    void m(@NotNull f fVar, @Nullable n0 n0Var);

    @lm.a.c
    void n(@NotNull Throwable th2, @NotNull p1 p1Var, @NotNull String str);

    void o();

    @Nullable
    r1 p();

    @NotNull
    io.sentry.protocol.c q();

    void r(@Nullable io.sentry.protocol.m mVar);

    void s(@NotNull k1 k1Var);

    @lm.a.c
    @NotNull
    io.sentry.protocol.v t();

    @Nullable
    t4.d u();

    void v(@NotNull List<String> list);

    @lm.a.c
    void x(@Nullable p1 p1Var);

    @Nullable
    k9 y();

    @NotNull
    io.sentry.protocol.v z();
}
