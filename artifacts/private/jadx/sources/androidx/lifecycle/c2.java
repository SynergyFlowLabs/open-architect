package androidx.lifecycle;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@oj.i(name = "Transformations")
public final class c2 {

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a implements d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f52179a;

        a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f52179a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f52179a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f52179a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof d1) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    public static final class b implements d1<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private w0<Object> f52180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n.a<Object, w0<Object>> f52181b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a1<Object> f52182c;

        b(n.a<Object, w0<Object>> aVar, a1<Object> a1Var) {
            this.f52181b = aVar;
            this.f52182c = a1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(a1 a1Var, Object obj) {
            a1Var.r(obj);
            return Unit.f312394a;
        }

        public final w0<Object> b() {
            return this.f52180a;
        }

        @Override // androidx.lifecycle.d1
        public void c(Object obj) {
            w0<Object> w0VarApply = this.f52181b.apply(obj);
            w0<Object> w0Var = this.f52180a;
            if (w0Var == w0VarApply) {
                return;
            }
            if (w0Var != null) {
                a1<Object> a1Var = this.f52182c;
                Intrinsics.checkNotNull(w0Var);
                a1Var.t(w0Var);
            }
            this.f52180a = w0VarApply;
            if (w0VarApply != null) {
                a1<Object> a1Var2 = this.f52182c;
                Intrinsics.checkNotNull(w0VarApply);
                final a1<Object> a1Var3 = this.f52182c;
                a1Var2.s(w0VarApply, new a(new Function1() { // from class: androidx.lifecycle.d2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return c2.b.d(a1Var3, obj2);
                    }
                }));
            }
        }

        public final void e(w0<Object> w0Var) {
            this.f52180a = w0Var;
        }
    }

    @androidx.annotation.l0
    @NotNull
    @androidx.annotation.j
    @oj.i(name = "distinctUntilChanged")
    public static final <X> w0<X> f(@NotNull w0<X> w0Var) {
        final a1 a1Var;
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        final kotlin.jvm.internal.i1.a aVar = new kotlin.jvm.internal.i1.a();
        aVar.f312744a = true;
        if (w0Var.j()) {
            aVar.f312744a = false;
            a1Var = new a1(w0Var.f());
        } else {
            a1Var = new a1();
        }
        a1Var.s(w0Var, new a(new Function1() { // from class: androidx.lifecycle.z1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c2.g(a1Var, aVar, obj);
            }
        }));
        return a1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(a1 a1Var, kotlin.jvm.internal.i1.a aVar, Object obj) {
        T tF = a1Var.f();
        if (aVar.f312744a || ((tF == 0 && obj != null) || (tF != 0 && !Intrinsics.areEqual(tF, obj)))) {
            aVar.f312744a = false;
            a1Var.r(obj);
        }
        return Unit.f312394a;
    }

    @androidx.annotation.l0
    @NotNull
    @androidx.annotation.j
    @oj.i(name = "map")
    public static final <X, Y> w0<Y> h(@NotNull w0<X> w0Var, @NotNull final Function1<X, Y> transform) {
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        final a1 a1Var = w0Var.j() ? new a1(transform.invoke(w0Var.f())) : new a1();
        a1Var.s(w0Var, new a(new Function1() { // from class: androidx.lifecycle.y1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c2.j(a1Var, transform, obj);
            }
        }));
        return a1Var;
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Use kotlin functions, instead of outdated arch core Functions")
    @androidx.annotation.l0
    @androidx.annotation.j
    @oj.i(name = "map")
    public static final /* synthetic */ w0 i(w0 w0Var, final n.a mapFunction) {
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        Intrinsics.checkNotNullParameter(mapFunction, "mapFunction");
        final a1 a1Var = new a1();
        a1Var.s(w0Var, new a(new Function1() { // from class: androidx.lifecycle.a2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c2.k(a1Var, mapFunction, obj);
            }
        }));
        return a1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(a1 a1Var, Function1 function1, Object obj) {
        a1Var.r(function1.invoke(obj));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(a1 a1Var, n.a aVar, Object obj) {
        a1Var.r(aVar.apply(obj));
        return Unit.f312394a;
    }

    @androidx.annotation.l0
    @NotNull
    @androidx.annotation.j
    @oj.i(name = "switchMap")
    public static final <X, Y> w0<Y> l(@NotNull w0<X> w0Var, @NotNull final Function1<X, w0<Y>> transform) {
        w0<Y> w0VarInvoke;
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        final kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
        final a1 a1Var = (w0Var.j() && (w0VarInvoke = transform.invoke(w0Var.f())) != null && w0VarInvoke.j()) ? new a1(w0VarInvoke.f()) : new a1();
        a1Var.s(w0Var, new a(new Function1() { // from class: androidx.lifecycle.x1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c2.n(transform, hVar, a1Var, obj);
            }
        }));
        return a1Var;
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Use kotlin functions, instead of outdated arch core Functions")
    @androidx.annotation.l0
    @androidx.annotation.j
    @oj.i(name = "switchMap")
    public static final /* synthetic */ w0 m(w0 w0Var, n.a switchMapFunction) {
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        Intrinsics.checkNotNullParameter(switchMapFunction, "switchMapFunction");
        a1 a1Var = new a1();
        a1Var.s(w0Var, new b(switchMapFunction, a1Var));
        return a1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, androidx.lifecycle.w0, java.lang.Object] */
    public static final Unit n(Function1 function1, kotlin.jvm.internal.i1.h hVar, final a1 a1Var, Object obj) {
        ?? r10 = (w0) function1.invoke(obj);
        T t10 = hVar.f312751a;
        if (t10 != r10) {
            if (t10 != 0) {
                Intrinsics.checkNotNull(t10);
                a1Var.t((w0) t10);
            }
            hVar.f312751a = r10;
            if (r10 != 0) {
                Intrinsics.checkNotNull(r10);
                a1Var.s(r10, new a(new Function1() { // from class: androidx.lifecycle.b2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return c2.o(a1Var, obj2);
                    }
                }));
            }
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(a1 a1Var, Object obj) {
        a1Var.r(obj);
        return Unit.f312394a;
    }
}
