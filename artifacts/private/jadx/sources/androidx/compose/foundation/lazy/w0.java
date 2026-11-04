package androidx.compose.foundation.lazy;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@q1
public interface w0 {

    public static final class a {
        @Deprecated
        public static void a(@NotNull w0 w0Var, @Nullable Object obj, @Nullable Object obj2, @NotNull pj.n<? super i, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
            w0.super.j(obj, obj2, nVar);
        }

        @Deprecated
        public static void e(@NotNull w0 w0Var, int i10, @Nullable Function1<? super Integer, ? extends Object> function1, @NotNull Function1<? super Integer, ? extends Object> function2, @NotNull pj.o<? super i, ? super Integer, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar) {
            w0.super.A(i10, function1, function2, oVar);
        }

        @Deprecated
        public static void j(@NotNull w0 w0Var, @Nullable Object obj, @Nullable Object obj2, @NotNull pj.o<? super i, ? super Integer, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar) {
            w0.super.a(obj, obj2, oVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f18050a = new b();

        b() {
        }

        public final Void c(int i10) {
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return c(((Number) obj).intValue());
        }
    }

    static final class c implements pj.o<i, Integer, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.n<i, androidx.compose.runtime.c0, Integer, Unit> f18051a;

        /* JADX WARN: Multi-variable type inference failed */
        c(pj.n<? super i, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
            this.f18051a = nVar;
        }

        @androidx.compose.runtime.o
        public final void c(i iVar, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
            if ((i11 & 6) == 0) {
                i11 |= c0Var.D(iVar) ? 4 : 2;
            }
            if (!c0Var.h((i11 & 131) != 130, i11 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-764088514, i11, -1, "androidx.compose.foundation.lazy.LazyListScope.stickyHeader.<anonymous> (LazyDsl.kt:122)");
            }
            this.f18051a.invoke(iVar, c0Var, Integer.valueOf(i11 & 14));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.o
        public /* bridge */ /* synthetic */ Unit invoke(i iVar, Integer num, androidx.compose.runtime.c0 c0Var, Integer num2) {
            c(iVar, num.intValue(), c0Var, num2.intValue());
            return Unit.f312394a;
        }
    }

    static final class d implements pj.n<i, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.o<i, Integer, androidx.compose.runtime.c0, Integer, Unit> f18052a;

        /* JADX WARN: Multi-variable type inference failed */
        d(pj.o<? super i, ? super Integer, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar) {
            this.f18052a = oVar;
        }

        @androidx.compose.runtime.o
        public final void c(i iVar, androidx.compose.runtime.c0 c0Var, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= c0Var.D(iVar) ? 4 : 2;
            }
            if (!c0Var.h((i10 & 19) != 18, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1691919627, i10, -1, "androidx.compose.foundation.lazy.LazyListScope.stickyHeader.<anonymous> (LazyDsl.kt:148)");
            }
            this.f18052a.invoke(iVar, 0, c0Var, Integer.valueOf((i10 & 14) | 48));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(i iVar, androidx.compose.runtime.c0 c0Var, Integer num) {
            c(iVar, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static /* synthetic */ void B(w0 w0Var, Object obj, Object obj2, pj.n nVar, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            obj2 = null;
        }
        w0Var.e(obj, obj2, nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static Object c(int i10) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void g(w0 w0Var, int i10, Function1 function1, Function1 function2, pj.o oVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        if ((i11 & 4) != 0) {
            function2 = b.f18050a;
        }
        w0Var.A(i10, function1, function2, oVar);
    }

    static /* synthetic */ void l(w0 w0Var, int i10, Function1 function1, pj.o oVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        w0Var.d(i10, function1, oVar);
    }

    static /* synthetic */ void p(w0 w0Var, Object obj, Object obj2, pj.n nVar, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            obj2 = null;
        }
        w0Var.j(obj, obj2, nVar);
    }

    static /* synthetic */ void v(w0 w0Var, Object obj, Object obj2, pj.o oVar, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            obj2 = null;
        }
        w0Var.a(obj, obj2, oVar);
    }

    static /* synthetic */ void x(w0 w0Var, Object obj, pj.n nVar, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        w0Var.b(obj, nVar);
    }

    default void A(int i10, @Nullable Function1<? super Integer, ? extends Object> function1, @NotNull Function1<? super Integer, ? extends Object> function2, @NotNull pj.o<? super i, ? super Integer, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar) {
        throw new IllegalStateException("The method is not implemented");
    }

    default void a(@Nullable Object obj, @Nullable Object obj2, @NotNull pj.o<? super i, ? super Integer, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar) {
        j(obj, obj2, androidx.compose.runtime.internal.w.c(1691919627, true, new d(oVar)));
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Use the non deprecated overload")
    /* synthetic */ default void b(Object obj, pj.n nVar) {
        j(obj, null, nVar);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Use the non deprecated overload")
    /* synthetic */ default void d(int i10, Function1 function1, pj.o oVar) {
        A(i10, function1, new Function1() { // from class: androidx.compose.foundation.lazy.v0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w0.c(((Integer) obj).intValue());
            }
        }, oVar);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Please use the overload with indexing capabilities.", replaceWith = @kotlin.b1(expression = "stickyHeader(key, contentType, { _ -> content() })", imports = {}))
    /* synthetic */ default void e(Object obj, Object obj2, pj.n nVar) {
        a(obj, obj2, androidx.compose.runtime.internal.w.c(-764088514, true, new c(nVar)));
    }

    default void j(@Nullable Object obj, @Nullable Object obj2, @NotNull pj.n<? super i, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
        throw new IllegalStateException("The method is not implemented");
    }
}
