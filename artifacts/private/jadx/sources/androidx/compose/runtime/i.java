package androidx.compose.runtime;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface i<N> {

    public static final class a {
        @Deprecated
        public static <N> void a(@NotNull i<N> iVar, @NotNull Function2<? super N, Object, Unit> function2, @Nullable Object obj) {
            i.super.k(function2, obj);
        }

        @Deprecated
        public static <N> void b(@NotNull i<N> iVar) {
            i.super.f();
        }

        @Deprecated
        public static <N> void c(@NotNull i<N> iVar) {
            i.super.c();
        }

        @Deprecated
        public static <N> void d(@NotNull i<N> iVar) {
            i.super.e();
        }
    }

    N a();

    void b(int i10, int i11);

    default void c() {
    }

    void clear();

    default void e() {
        N nA = a();
        x xVar = nA instanceof x ? (x) nA : null;
        if (xVar != null) {
            xVar.r();
        }
    }

    default void f() {
    }

    void i(int i10, int i11, int i12);

    default void k(@NotNull Function2<? super N, Object, Unit> function2, @Nullable Object obj) {
        function2.invoke(a(), obj);
    }

    void l(int i10, N n10);

    void m(int i10, N n10);

    void n(N n10);

    void o();
}
