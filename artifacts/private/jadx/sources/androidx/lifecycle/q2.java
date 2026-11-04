package androidx.lifecycle;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.a3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nWithLifecycleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,175:1\n127#1,8:176\n127#1,8:184\n127#1,8:192\n127#1,8:200\n43#1,5:208\n127#1,8:213\n43#1,5:221\n127#1,8:226\n127#1,8:234\n127#1,8:242\n127#1,8:250\n318#2,11:258\n*S KotlinDebug\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt\n*L\n47#1:176,8\n57#1:184,8\n66#1:192,8\n75#1:200,8\n86#1:208,5\n86#1:213,8\n86#1:221,5\n86#1:226,8\n95#1:234,8\n104#1:242,8\n113#1:250,8\n148#1:258,11\n*E\n"})
public final class q2 {

    static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c0 f52479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f52480b;

        a(c0 c0Var, c cVar) {
            this.f52479a = c0Var;
            this.f52480b = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f52479a.c(this.f52480b);
        }
    }

    static final class b implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.n0 f52481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c0 f52482b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f52483c;

        static final class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c0 f52484a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f52485b;

            a(c0 c0Var, c cVar) {
                this.f52484a = c0Var;
                this.f52485b = cVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f52484a.g(this.f52485b);
            }
        }

        b(kotlinx.coroutines.n0 n0Var, c0 c0Var, c cVar) {
            this.f52481a = n0Var;
            this.f52482b = c0Var;
            this.f52483c = cVar;
        }

        public final void c(Throwable th2) {
            kotlinx.coroutines.n0 n0Var = this.f52481a;
            kotlin.coroutines.h hVar = kotlin.coroutines.h.f312451a;
            if (n0Var.N(hVar)) {
                this.f52481a.h(hVar, new a(this.f52482b, this.f52483c));
            } else {
                this.f52482b.g(this.f52483c);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            c(th2);
            return Unit.f312394a;
        }
    }

    public static final class c implements j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c0.b f52486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c0 f52487b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.n<R> f52488c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<R> f52489d;

        /* JADX WARN: Multi-variable type inference failed */
        c(c0.b bVar, c0 c0Var, kotlinx.coroutines.n<? super R> nVar, Function0<? extends R> function0) {
            this.f52486a = bVar;
            this.f52487b = c0Var;
            this.f52488c = nVar;
            this.f52489d = function0;
        }

        @Override // androidx.lifecycle.j0
        public void e(o0 source, c0.a event) {
            Object objM785constructorimpl;
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event != c0.a.Companion.d(this.f52486a)) {
                if (event == c0.a.ON_DESTROY) {
                    this.f52487b.g(this);
                    kotlin.coroutines.d dVar = this.f52488c;
                    Result.a aVar = Result.Companion;
                    dVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(new h0())));
                }
                return;
            }
            this.f52487b.g(this);
            kotlin.coroutines.d dVar2 = this.f52488c;
            Function0<R> function0 = this.f52489d;
            try {
                Result.a aVar2 = Result.Companion;
                objM785constructorimpl = Result.m785constructorimpl(function0.invoke());
            } catch (Throwable th2) {
                Result.a aVar3 = Result.Companion;
                objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
            }
            dVar2.resumeWith(objM785constructorimpl);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    public static final class d<R> implements Function0<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<R> f52490a;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Function0<? extends R> function0) {
            this.f52490a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final R invoke() {
            return this.f52490a.invoke();
        }
    }

    @kotlin.a1
    @Nullable
    public static final <R> Object a(@NotNull c0 c0Var, @NotNull c0.b bVar, boolean z10, @NotNull kotlinx.coroutines.n0 n0Var, @NotNull Function0<? extends R> function0, @NotNull kotlin.coroutines.d<? super R> dVar) {
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        c cVar = new c(bVar, c0Var, pVar, function0);
        if (z10) {
            n0Var.h(kotlin.coroutines.h.f312451a, new a(c0Var, cVar));
        } else {
            c0Var.c(cVar);
        }
        pVar.e0(new b(n0Var, c0Var, cVar));
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU;
    }

    @Nullable
    public static final <R> Object b(@NotNull c0 c0Var, @NotNull Function0<? extends R> function0, @NotNull kotlin.coroutines.d<? super R> dVar) {
        c0.b bVar = c0.b.CREATED;
        a3 a3VarR0 = kotlinx.coroutines.l1.e().R0();
        boolean zN = a3VarR0.N(dVar.getContext());
        if (!zN) {
            if (c0Var.d() == c0.b.DESTROYED) {
                throw new h0();
            }
            if (c0Var.d().compareTo(bVar) >= 0) {
                return function0.invoke();
            }
        }
        return a(c0Var, bVar, zN, a3VarR0, new d(function0), dVar);
    }

    @Nullable
    public static final <R> Object c(@NotNull o0 o0Var, @NotNull Function0<? extends R> function0, @NotNull kotlin.coroutines.d<? super R> dVar) {
        c0 lifecycle = o0Var.getLifecycle();
        c0.b bVar = c0.b.CREATED;
        a3 a3VarR0 = kotlinx.coroutines.l1.e().R0();
        boolean zN = a3VarR0.N(dVar.getContext());
        if (!zN) {
            if (lifecycle.d() == c0.b.DESTROYED) {
                throw new h0();
            }
            if (lifecycle.d().compareTo(bVar) >= 0) {
                return function0.invoke();
            }
        }
        return a(lifecycle, bVar, zN, a3VarR0, new d(function0), dVar);
    }

    private static final <R> Object d(c0 c0Var, Function0<? extends R> function0, kotlin.coroutines.d<? super R> dVar) {
        c0.b bVar = c0.b.CREATED;
        kotlinx.coroutines.l1.e().R0();
        kotlin.jvm.internal.h0.e(3);
        throw null;
    }

    private static final <R> Object e(o0 o0Var, Function0<? extends R> function0, kotlin.coroutines.d<? super R> dVar) {
        o0Var.getLifecycle();
        c0.b bVar = c0.b.CREATED;
        kotlinx.coroutines.l1.e().R0();
        kotlin.jvm.internal.h0.e(3);
        throw null;
    }

    @Nullable
    public static final <R> Object f(@NotNull c0 c0Var, @NotNull Function0<? extends R> function0, @NotNull kotlin.coroutines.d<? super R> dVar) {
        c0.b bVar = c0.b.RESUMED;
        a3 a3VarR0 = kotlinx.coroutines.l1.e().R0();
        boolean zN = a3VarR0.N(dVar.getContext());
        if (!zN) {
            if (c0Var.d() == c0.b.DESTROYED) {
                throw new h0();
            }
            if (c0Var.d().compareTo(bVar) >= 0) {
                return function0.invoke();
            }
        }
        return a(c0Var, bVar, zN, a3VarR0, new d(function0), dVar);
    }

    @Nullable
    public static final <R> Object g(@NotNull o0 o0Var, @NotNull Function0<? extends R> function0, @NotNull kotlin.coroutines.d<? super R> dVar) {
        c0 lifecycle = o0Var.getLifecycle();
        c0.b bVar = c0.b.RESUMED;
        a3 a3VarR0 = kotlinx.coroutines.l1.e().R0();
        boolean zN = a3VarR0.N(dVar.getContext());
        if (!zN) {
            if (lifecycle.d() == c0.b.DESTROYED) {
                throw new h0();
            }
            if (lifecycle.d().compareTo(bVar) >= 0) {
                return function0.invoke();
            }
        }
        return a(lifecycle, bVar, zN, a3VarR0, new d(function0), dVar);
    }

    private static final <R> Object h(c0 c0Var, Function0<? extends R> function0, kotlin.coroutines.d<? super R> dVar) {
        c0.b bVar = c0.b.RESUMED;
        kotlinx.coroutines.l1.e().R0();
        kotlin.jvm.internal.h0.e(3);
        throw null;
    }

    private static final <R> Object i(o0 o0Var, Function0<? extends R> function0, kotlin.coroutines.d<? super R> dVar) {
        o0Var.getLifecycle();
        c0.b bVar = c0.b.RESUMED;
        kotlinx.coroutines.l1.e().R0();
        kotlin.jvm.internal.h0.e(3);
        throw null;
    }

    @Nullable
    public static final <R> Object j(@NotNull c0 c0Var, @NotNull Function0<? extends R> function0, @NotNull kotlin.coroutines.d<? super R> dVar) {
        c0.b bVar = c0.b.STARTED;
        a3 a3VarR0 = kotlinx.coroutines.l1.e().R0();
        boolean zN = a3VarR0.N(dVar.getContext());
        if (!zN) {
            if (c0Var.d() == c0.b.DESTROYED) {
                throw new h0();
            }
            if (c0Var.d().compareTo(bVar) >= 0) {
                return function0.invoke();
            }
        }
        return a(c0Var, bVar, zN, a3VarR0, new d(function0), dVar);
    }

    @Nullable
    public static final <R> Object k(@NotNull o0 o0Var, @NotNull Function0<? extends R> function0, @NotNull kotlin.coroutines.d<? super R> dVar) {
        c0 lifecycle = o0Var.getLifecycle();
        c0.b bVar = c0.b.STARTED;
        a3 a3VarR0 = kotlinx.coroutines.l1.e().R0();
        boolean zN = a3VarR0.N(dVar.getContext());
        if (!zN) {
            if (lifecycle.d() == c0.b.DESTROYED) {
                throw new h0();
            }
            if (lifecycle.d().compareTo(bVar) >= 0) {
                return function0.invoke();
            }
        }
        return a(lifecycle, bVar, zN, a3VarR0, new d(function0), dVar);
    }

    private static final <R> Object l(c0 c0Var, Function0<? extends R> function0, kotlin.coroutines.d<? super R> dVar) {
        c0.b bVar = c0.b.STARTED;
        kotlinx.coroutines.l1.e().R0();
        kotlin.jvm.internal.h0.e(3);
        throw null;
    }

    private static final <R> Object m(o0 o0Var, Function0<? extends R> function0, kotlin.coroutines.d<? super R> dVar) {
        o0Var.getLifecycle();
        c0.b bVar = c0.b.STARTED;
        kotlinx.coroutines.l1.e().R0();
        kotlin.jvm.internal.h0.e(3);
        throw null;
    }

    @Nullable
    public static final <R> Object n(@NotNull c0 c0Var, @NotNull c0.b bVar, @NotNull Function0<? extends R> function0, @NotNull kotlin.coroutines.d<? super R> dVar) {
        if (bVar.compareTo(c0.b.CREATED) < 0) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + bVar).toString());
        }
        a3 a3VarR0 = kotlinx.coroutines.l1.e().R0();
        boolean zN = a3VarR0.N(dVar.getContext());
        if (!zN) {
            if (c0Var.d() == c0.b.DESTROYED) {
                throw new h0();
            }
            if (c0Var.d().compareTo(bVar) >= 0) {
                return function0.invoke();
            }
        }
        return a(c0Var, bVar, zN, a3VarR0, new d(function0), dVar);
    }

    @Nullable
    public static final <R> Object o(@NotNull o0 o0Var, @NotNull c0.b bVar, @NotNull Function0<? extends R> function0, @NotNull kotlin.coroutines.d<? super R> dVar) {
        c0 lifecycle = o0Var.getLifecycle();
        if (bVar.compareTo(c0.b.CREATED) < 0) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + bVar).toString());
        }
        a3 a3VarR0 = kotlinx.coroutines.l1.e().R0();
        boolean zN = a3VarR0.N(dVar.getContext());
        if (!zN) {
            if (lifecycle.d() == c0.b.DESTROYED) {
                throw new h0();
            }
            if (lifecycle.d().compareTo(bVar) >= 0) {
                return function0.invoke();
            }
        }
        return a(lifecycle, bVar, zN, a3VarR0, new d(function0), dVar);
    }

    private static final <R> Object p(c0 c0Var, c0.b bVar, Function0<? extends R> function0, kotlin.coroutines.d<? super R> dVar) {
        if (bVar.compareTo(c0.b.CREATED) >= 0) {
            kotlinx.coroutines.l1.e().R0();
            kotlin.jvm.internal.h0.e(3);
            throw null;
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + bVar).toString());
    }

    private static final <R> Object q(o0 o0Var, c0.b bVar, Function0<? extends R> function0, kotlin.coroutines.d<? super R> dVar) {
        o0Var.getLifecycle();
        if (bVar.compareTo(c0.b.CREATED) >= 0) {
            kotlinx.coroutines.l1.e().R0();
            int i10 = 0 >> 3;
            kotlin.jvm.internal.h0.e(3);
            throw null;
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + bVar).toString());
    }

    @kotlin.a1
    @Nullable
    public static final <R> Object r(@NotNull c0 c0Var, @NotNull c0.b bVar, @NotNull Function0<? extends R> function0, @NotNull kotlin.coroutines.d<? super R> dVar) {
        a3 a3VarR0 = kotlinx.coroutines.l1.e().R0();
        boolean zN = a3VarR0.N(dVar.getContext());
        if (!zN) {
            if (c0Var.d() == c0.b.DESTROYED) {
                throw new h0();
            }
            if (c0Var.d().compareTo(bVar) >= 0) {
                return function0.invoke();
            }
        }
        return a(c0Var, bVar, zN, a3VarR0, new d(function0), dVar);
    }

    @kotlin.a1
    private static final <R> Object s(c0 c0Var, c0.b bVar, Function0<? extends R> function0, kotlin.coroutines.d<? super R> dVar) {
        kotlinx.coroutines.l1.e().R0();
        kotlin.jvm.internal.h0.e(3);
        throw null;
    }
}
