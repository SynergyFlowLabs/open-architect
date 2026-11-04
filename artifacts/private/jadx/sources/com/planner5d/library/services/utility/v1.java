package com.planner5d.library.services.utility;

import android.os.SystemClock;
import androidx.lifecycle.DefaultLifecycleObserver;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final v1 f229769a = new v1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static a2 f229770b = new a2() { // from class: com.planner5d.library.services.utility.t1
        @Override // com.planner5d.library.services.utility.a2
        public final long a() {
            return v1.i();
        }
    };

    public static class a<T> extends androidx.lifecycle.w0<T> {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        private final AtomicInteger f229771m;

        /* JADX INFO: renamed from: com.planner5d.library.services.utility.v1$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.LiveDataUtils$LiveDataEvent$postValue$1", f = "LiveDataUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C1691a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f229772a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a<T> f229773b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f229774c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1691a(a<T> aVar, T t10, kotlin.coroutines.d<? super C1691a> dVar) {
                super(2, dVar);
                this.f229773b = aVar;
                this.f229774c = t10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1691a(this.f229773b, this.f229774c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f229772a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                this.f229773b.r(this.f229774c);
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1691a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        public a(@Nullable T t10) {
            super(t10);
            this.f229771m = new AtomicInteger(0);
        }

        @Override // androidx.lifecycle.w0
        public void k(@NotNull androidx.lifecycle.o0 owner, @NotNull androidx.lifecycle.d1<? super T> observer) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(observer, "observer");
            super.k(owner, new c(this, observer));
        }

        @Override // androidx.lifecycle.w0
        public void l(@NotNull androidx.lifecycle.d1<? super T> observer) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            super.l(new c(this, observer));
        }

        @Override // androidx.lifecycle.w0
        public void o(@Nullable T t10) {
            kotlinx.coroutines.k.f(kotlinx.coroutines.f2.f314023a, s.f229729a.a(), null, new C1691a(this, t10, null), 2, null);
        }

        @Override // androidx.lifecycle.w0
        public void r(@Nullable T t10) {
            this.f229771m.incrementAndGet();
            super.r(t10);
        }

        @NotNull
        public final AtomicInteger s() {
            return this.f229771m;
        }
    }

    public static final class b extends a<Integer> {
        public b() {
            super(0);
        }

        @e.a({"NullSafeMutableLiveData"})
        public final void t() {
            o(null);
        }

        @e.a({"NullSafeMutableLiveData"})
        public final void u() {
            r(null);
        }
    }

    private static final class c<T> implements androidx.lifecycle.d1<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final a<T> f229775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final androidx.lifecycle.d1<? super T> f229776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f229777c;

        public c(@NotNull a<T> data, @NotNull androidx.lifecycle.d1<? super T> observer) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(observer, "observer");
            this.f229775a = data;
            this.f229776b = observer;
            this.f229777c = data.s().get();
        }

        @Override // androidx.lifecycle.d1
        public void c(@Nullable T t10) {
            int i10 = this.f229775a.s().get();
            if (this.f229777c != i10) {
                this.f229777c = i10;
                this.f229776b.c(t10);
            }
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.LiveDataUtils$map$1$1$1", f = "LiveDataUtils.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nLiveDataUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveDataUtils.kt\ncom/planner5d/library/services/utility/LiveDataUtils$map$1$1$1\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,190:1\n326#2:191\n*S KotlinDebug\n*F\n+ 1 LiveDataUtils.kt\ncom/planner5d/library/services/utility/LiveDataUtils$map$1$1$1\n*L\n86#1:191\n*E\n"})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f229778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<T, kotlin.coroutines.d<? super R>, Object> f229779b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f229780c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.a1<R> f229781d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function2<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2, T t10, androidx.lifecycle.a1<R> a1Var, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f229779b = function2;
            this.f229780c = t10;
            this.f229781d = a1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new d(this.f229779b, this.f229780c, this.f229781d, dVar);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f229778a;
            if (i10 == 0) {
                ResultKt.m(obj);
                Function2<T, kotlin.coroutines.d<? super R>, Object> function2 = this.f229779b;
                T t10 = this.f229780c;
                this.f229778a = 1;
                obj = function2.invoke(t10, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            if (kotlinx.coroutines.s2.D(getContext())) {
                v1.f229769a.v(this.f229781d, obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class e implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.w0<T> f229782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.d1<T> f229783b;

        e(androidx.lifecycle.w0<T> w0Var, androidx.lifecycle.d1<T> d1Var) {
            this.f229782a = w0Var;
            this.f229783b = d1Var;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(androidx.lifecycle.o0 owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            owner.getLifecycle().g(this);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onPause(androidx.lifecycle.o0 owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            this.f229782a.p(this.f229783b);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(androidx.lifecycle.o0 owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            this.f229782a.l(this.f229783b);
        }
    }

    static final class f implements androidx.lifecycle.d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f229784a;

        f(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f229784a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f229784a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f229784a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof androidx.lifecycle.d1) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.LiveDataUtils$throttle$2$1", f = "LiveDataUtils.kt", i = {}, l = {181}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f229785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.g f229786b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f229787c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.a1<T> f229788d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.w0<T> f229789e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.g f229790f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(kotlin.jvm.internal.i1.g gVar, long j10, androidx.lifecycle.a1<T> a1Var, androidx.lifecycle.w0<T> w0Var, kotlin.jvm.internal.i1.g gVar2, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f229786b = gVar;
            this.f229787c = j10;
            this.f229788d = a1Var;
            this.f229789e = w0Var;
            this.f229790f = gVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new g(this.f229786b, this.f229787c, this.f229788d, this.f229789e, this.f229790f, dVar);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f229785a;
            if (i10 == 0) {
                ResultKt.m(obj);
                long j10 = this.f229786b.f312750a;
                long j11 = this.f229787c;
                if (j10 < j11) {
                    this.f229785a = 1;
                    if (kotlinx.coroutines.d1.b(j11 - j10, this) == objL) {
                        return objL;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            this.f229788d.r((T) this.f229789e.f());
            this.f229790f.f312750a = v1.f229769a.m().a();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    private v1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(androidx.lifecycle.a1 a1Var, Function2 function2, androidx.lifecycle.w0 w0Var, androidx.lifecycle.w0 w0Var2, Object obj) {
        a1Var.r(function2.invoke(w0Var.f(), w0Var2.f()));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long i() {
        return SystemClock.elapsedRealtime();
    }

    public static /* synthetic */ a l(v1 v1Var, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = null;
            int i11 = 0 << 0;
        }
        return v1Var.j(obj);
    }

    @androidx.annotation.l1
    public static /* synthetic */ void n() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r11v1, types: [T, kotlinx.coroutines.p2] */
    public static final Unit q(kotlin.jvm.internal.i1.h hVar, kotlinx.coroutines.s0 s0Var, Function2 function2, androidx.lifecycle.a1 a1Var, Object obj) {
        kotlinx.coroutines.p2 p2Var = (kotlinx.coroutines.p2) hVar.f312751a;
        if (p2Var != null) {
            kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
        }
        hVar.f312751a = kotlinx.coroutines.k.f(s0Var, null, null, new d(function2, obj, a1Var, null), 3, null);
        return Unit.f312394a;
    }

    @oj.n
    public static final <T> void r(@NotNull androidx.lifecycle.w0<T> w0Var, @NotNull androidx.lifecycle.o0 owner, @NotNull final androidx.lifecycle.d1<T> observer) {
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        w0Var.k(owner, new f(new Function1() { // from class: com.planner5d.library.services.utility.u1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v1.s(observer, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(androidx.lifecycle.d1 d1Var, Object obj) {
        if (obj != null) {
            d1Var.c(obj);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long y(long j10, Object obj, Object obj2) {
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r11v8, types: [T, kotlinx.coroutines.p2] */
    public static final Unit z(Function2 function2, androidx.lifecycle.a1 a1Var, androidx.lifecycle.w0 w0Var, kotlin.jvm.internal.i1.g gVar, kotlin.jvm.internal.i1.g gVar2, kotlin.jvm.internal.i1.h hVar, androidx.lifecycle.w0 w0Var2, Object obj) {
        long jLongValue = ((Number) function2.invoke(a1Var.f(), w0Var.f())).longValue();
        gVar.f312750a = f229770b.a() - gVar2.f312750a;
        kotlinx.coroutines.p2 p2Var = (kotlinx.coroutines.p2) hVar.f312751a;
        if (p2Var != null) {
            kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
        }
        hVar.f312751a = kotlinx.coroutines.k.f(kotlinx.coroutines.t0.a(kotlinx.coroutines.l1.e()), null, null, new g(gVar, jLongValue, a1Var, w0Var2, gVar2, null), 3, null);
        return Unit.f312394a;
    }

    @androidx.annotation.l0
    public final <T> void A(@NotNull androidx.lifecycle.c1<T> c1Var, @NotNull Function1<? super T, ? extends T> transform) {
        Intrinsics.checkNotNullParameter(c1Var, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        c1Var.r(transform.invoke(c1Var.f()));
    }

    @NotNull
    public final <T1, T2, R> androidx.lifecycle.w0<R> g(@NotNull final androidx.lifecycle.w0<T1> w0Var, @NotNull final androidx.lifecycle.w0<T2> liveData, @NotNull final Function2<? super T1, ? super T2, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        Intrinsics.checkNotNullParameter(liveData, "liveData");
        Intrinsics.checkNotNullParameter(transform, "transform");
        final androidx.lifecycle.a1 a1Var = new androidx.lifecycle.a1();
        Function1 function1 = new Function1() { // from class: com.planner5d.library.services.utility.r1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v1.h(a1Var, transform, w0Var, liveData, obj);
            }
        };
        a1Var.s(w0Var, new f(function1));
        a1Var.s(liveData, new f(function1));
        return a1Var;
    }

    @NotNull
    public final <T> a<T> j(@Nullable T t10) {
        return new a<>(t10);
    }

    @NotNull
    public final b k() {
        return new b();
    }

    @NotNull
    public final a2 m() {
        return f229770b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void o(@NotNull androidx.lifecycle.o0 owner, @NotNull androidx.lifecycle.w0<T> data, @NotNull androidx.lifecycle.d1<T> observer) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(observer, "observer");
        data.q(owner);
        data.k(owner, observer);
    }

    @NotNull
    public final <T, R> androidx.lifecycle.a1<R> p(@NotNull final kotlinx.coroutines.s0 coroutineScope, @NotNull androidx.lifecycle.w0<T> source, @NotNull final Function2<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> mapFunction) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(mapFunction, "mapFunction");
        final kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
        final androidx.lifecycle.a1<R> a1Var = new androidx.lifecycle.a1<>();
        a1Var.s(source, new f(new Function1() { // from class: com.planner5d.library.services.utility.s1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v1.q(hVar, coroutineScope, mapFunction, a1Var, obj);
            }
        }));
        return a1Var;
    }

    public final <T> void t(@NotNull androidx.lifecycle.w0<T> w0Var, @NotNull androidx.lifecycle.o0 owner, @NotNull androidx.lifecycle.d1<T> observer) {
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        owner.getLifecycle().c(new e(w0Var, observer));
    }

    public final void u(@NotNull a2 a2Var) {
        Intrinsics.checkNotNullParameter(a2Var, "<set-?>");
        f229770b = a2Var;
    }

    @androidx.annotation.d
    @e.a({"WrongThread"})
    public final <T> void v(@NotNull androidx.lifecycle.c1<T> c1Var, @Nullable T t10) {
        Intrinsics.checkNotNullParameter(c1Var, "<this>");
        if (o3.b()) {
            c1Var.r(t10);
        } else {
            c1Var.o(t10);
        }
    }

    @NotNull
    public final <T> androidx.lifecycle.w0<T> w(@NotNull androidx.lifecycle.w0<T> w0Var, final long j10) {
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        return x(w0Var, new Function2() { // from class: com.planner5d.library.services.utility.p1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Long.valueOf(v1.y(j10, obj, obj2));
            }
        });
    }

    @NotNull
    public final <T> androidx.lifecycle.w0<T> x(@NotNull final androidx.lifecycle.w0<T> w0Var, @NotNull final Function2<? super T, ? super T, Long> waitMillisByValues) {
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        Intrinsics.checkNotNullParameter(waitMillisByValues, "waitMillisByValues");
        final androidx.lifecycle.a1 a1Var = new androidx.lifecycle.a1(w0Var.f());
        final kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
        final kotlin.jvm.internal.i1.g gVar = new kotlin.jvm.internal.i1.g();
        final kotlin.jvm.internal.i1.g gVar2 = new kotlin.jvm.internal.i1.g();
        gVar2.f312750a = f229770b.a();
        a1Var.s(w0Var, new f(new Function1() { // from class: com.planner5d.library.services.utility.q1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v1.z(waitMillisByValues, a1Var, w0Var, gVar, gVar2, hVar, w0Var, obj);
            }
        }));
        return a1Var;
    }
}
