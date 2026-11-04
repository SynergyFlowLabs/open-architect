package io.sentry.util;

import io.sentry.ILogger;
import io.sentry.ja;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class n {

    @FunctionalInterface
    public interface a<T> {
        void accept(@NotNull T t10);
    }

    @FunctionalInterface
    public interface b {
        void a(@Nullable Object obj, @NotNull Class<?> cls);
    }

    @FunctionalInterface
    public interface c<T> {
        void accept(@Nullable T t10);
    }

    private n() {
    }

    public static /* synthetic */ void c(Object obj, Class cls) {
    }

    public static /* synthetic */ void d(Object obj) {
    }

    public static io.sentry.n0 e(Object obj) {
        io.sentry.n0 n0Var = new io.sentry.n0();
        p(n0Var, obj);
        return n0Var;
    }

    @Nullable
    public static io.sentry.hints.h f(@NotNull io.sentry.n0 n0Var) {
        return (io.sentry.hints.h) n0Var.f(ja.f305659c, io.sentry.hints.h.class);
    }

    @Nullable
    public static Object g(@NotNull io.sentry.n0 n0Var) {
        return n0Var.e(ja.f305657a);
    }

    public static boolean h(@NotNull io.sentry.n0 n0Var, @NotNull Class<?> cls) {
        return cls.isInstance(g(n0Var));
    }

    public static boolean i(@NotNull io.sentry.n0 n0Var) {
        return Boolean.TRUE.equals(n0Var.f(ja.f305658b, Boolean.class));
    }

    public static <T> void j(@NotNull io.sentry.n0 n0Var, @NotNull Class<T> cls, final c<Object> cVar) {
        l(n0Var, cls, new a() { // from class: io.sentry.util.l
            @Override // io.sentry.util.n.a
            public final void accept(Object obj) {
                n.d(obj);
            }
        }, new b() { // from class: io.sentry.util.m
            @Override // io.sentry.util.n.b
            public final void a(Object obj, Class cls2) {
                cVar.accept(obj);
            }
        });
    }

    public static <T> void k(@NotNull io.sentry.n0 n0Var, @NotNull Class<T> cls, a<T> aVar) {
        l(n0Var, cls, aVar, new b() { // from class: io.sentry.util.j
            @Override // io.sentry.util.n.b
            public final void a(Object obj, Class cls2) {
                n.c(obj, cls2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void l(@NotNull io.sentry.n0 n0Var, @NotNull Class<T> cls, a<T> aVar, b bVar) {
        Object objG = g(n0Var);
        if (!h(n0Var, cls) || objG == null) {
            bVar.a(objG, cls);
        } else {
            aVar.accept(objG);
        }
    }

    public static <T> void m(@NotNull io.sentry.n0 n0Var, @NotNull Class<T> cls, final ILogger iLogger, a<T> aVar) {
        l(n0Var, cls, aVar, new b() { // from class: io.sentry.util.k
            @Override // io.sentry.util.n.b
            public final void a(Object obj, Class cls2) {
                v.a(cls2, obj, iLogger);
            }
        });
    }

    public static void n(@NotNull io.sentry.n0 n0Var, @NotNull io.sentry.hints.h hVar) {
        n0Var.o(ja.f305659c, hVar);
    }

    public static void o(@NotNull io.sentry.n0 n0Var, @NotNull String str) {
        if (!str.startsWith(ja.f305660d) && !str.startsWith(ja.f305662f) && !str.startsWith(ja.f305661e)) {
            return;
        }
        n0Var.o(ja.f305658b, Boolean.TRUE);
    }

    public static void p(@NotNull io.sentry.n0 n0Var, Object obj) {
        n0Var.o(ja.f305657a, obj);
    }

    public static boolean q(@NotNull io.sentry.n0 n0Var) {
        return !(h(n0Var, io.sentry.hints.e.class) || h(n0Var, io.sentry.hints.c.class)) || h(n0Var, io.sentry.hints.b.class);
    }
}
