package io.sentry;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface p1 {
    @lm.a.b
    @Nullable
    da A();

    void B(@Nullable String str, @Nullable Object obj);

    @lm.a.c
    boolean C(@NotNull e6 e6Var);

    void D(@Nullable Throwable th2);

    void E(@Nullable x9 x9Var);

    @NotNull
    String E6();

    @lm.a.b
    @Nullable
    e F(@Nullable List<String> list);

    void G(@NotNull String str, @NotNull Number number, @NotNull p2 p2Var);

    @lm.a.c
    @NotNull
    p1 I(@NotNull String str, @Nullable String str2, @Nullable e6 e6Var, @NotNull w1 w1Var, @NotNull w9 w9Var);

    @Nullable
    Object J(@Nullable String str);

    void K(@Nullable String str, @Nullable Object obj);

    @lm.a.c
    @NotNull
    p1 M(@NotNull p9 p9Var, @NotNull w9 w9Var);

    @lm.a.c
    @Nullable
    e6 N();

    @NotNull
    p1 P(@NotNull String str, @Nullable String str2);

    @lm.a.c
    @NotNull
    e6 Q();

    void a(@Nullable String str, @Nullable String str2);

    @Nullable
    Throwable b();

    void c(@Nullable x9 x9Var);

    @NotNull
    w8 d();

    @Nullable
    Boolean f();

    @Nullable
    String getDescription();

    @NotNull
    p1 h(@NotNull String str);

    @lm.a.c
    @NotNull
    p1 i(@NotNull String str, @Nullable String str2, @Nullable e6 e6Var, @NotNull w1 w1Var);

    boolean isFinished();

    @lm.a.c
    @NotNull
    p1 k(@NotNull String str, @Nullable String str2, @NotNull w9 w9Var);

    @NotNull
    p9 m();

    void n(@Nullable x9 x9Var, @Nullable e6 e6Var);

    @lm.a.c
    boolean n0();

    @Nullable
    fa o();

    void p(@NotNull String str);

    @NotNull
    io.sentry.protocol.c q();

    @lm.a.c
    @NotNull
    m1 q0();

    @Nullable
    x9 t();

    void u();

    @Nullable
    String v(@Nullable String str);

    void w(@Nullable String str);

    void y(@NotNull String str, @NotNull Number number);
}
