package androidx.lifecycle;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.a3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class j1 {

    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160717p0}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f52370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f52371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c0 f52372c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c0.b f52373d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> f52374e;

        /* JADX INFO: renamed from: androidx.lifecycle.j1$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", i = {0, 0}, l = {161}, m = "invokeSuspend", n = {"launchedJob", "observer"}, s = {"L$0", "L$1"})
        @SourceDebugExtension({"SMAP\nRepeatOnLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n318#2,11:161\n1#3:172\n*S KotlinDebug\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1\n*L\n96#1:161,11\n*E\n"})
        static final class C0476a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f52375a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f52376b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f52377c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f52378d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f52379e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f52380f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f52381g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ c0 f52382h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ c0.b f52383i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.s0 f52384j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> f52385k;

            /* JADX INFO: renamed from: androidx.lifecycle.j1$a$a$a, reason: collision with other inner class name */
            static final class C0477a implements j0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ c0.a f52386a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlin.jvm.internal.i1.h<kotlinx.coroutines.p2> f52387b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.s0 f52388c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ c0.a f52389d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.n<Unit> f52390e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.sync.a f52391f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> f52392g;

                /* JADX INFO: renamed from: androidx.lifecycle.j1$a$a$a$a, reason: collision with other inner class name */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", i = {0, 1}, l = {165, 110}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
                @SourceDebugExtension({"SMAP\nRepeatOnLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,160:1\n116#2,10:161\n*S KotlinDebug\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1\n*L\n110#1:161,10\n*E\n"})
                static final class C0478a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    Object f52393a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    Object f52394b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f52395c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final /* synthetic */ kotlinx.coroutines.sync.a f52396d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> f52397e;

                    /* JADX INFO: renamed from: androidx.lifecycle.j1$a$a$a$a$a, reason: collision with other inner class name */
                    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1", f = "RepeatOnLifecycle.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
                    static final class C0479a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        int f52398a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        private /* synthetic */ Object f52399b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        final /* synthetic */ Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> f52400c;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        C0479a(Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super C0479a> dVar) {
                            super(2, dVar);
                            this.f52400c = function2;
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                            C0479a c0479a = new C0479a(this.f52400c, dVar);
                            c0479a.f52399b = obj;
                            return c0479a;
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            Object objL = kotlin.coroutines.intrinsics.b.l();
                            int i10 = this.f52398a;
                            if (i10 == 0) {
                                ResultKt.m(obj);
                                kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f52399b;
                                Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f52400c;
                                this.f52398a = 1;
                                if (function2.invoke(s0Var, this) == objL) {
                                    return objL;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.m(obj);
                            }
                            return Unit.f312394a;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                            return ((C0479a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0478a(kotlinx.coroutines.sync.a aVar, Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super C0478a> dVar) {
                        super(2, dVar);
                        this.f52396d = aVar;
                        this.f52397e = function2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                        return new C0478a(this.f52396d, this.f52397e, dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        kotlinx.coroutines.sync.a aVar;
                        Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> function2;
                        Throwable th2;
                        kotlinx.coroutines.sync.a aVar2;
                        Object objL = kotlin.coroutines.intrinsics.b.l();
                        int i10 = this.f52395c;
                        try {
                            if (i10 == 0) {
                                ResultKt.m(obj);
                                aVar = this.f52396d;
                                function2 = this.f52397e;
                                this.f52393a = aVar;
                                this.f52394b = function2;
                                this.f52395c = 1;
                                if (aVar.h(null, this) != objL) {
                                }
                                return objL;
                            }
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                aVar2 = (kotlinx.coroutines.sync.a) this.f52393a;
                                try {
                                    ResultKt.m(obj);
                                    Unit unit = Unit.f312394a;
                                    aVar2.i(null);
                                    return unit;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    aVar2.i(null);
                                    throw th2;
                                }
                            }
                            function2 = (Function2) this.f52394b;
                            kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) this.f52393a;
                            ResultKt.m(obj);
                            aVar = aVar3;
                            C0479a c0479a = new C0479a(function2, null);
                            this.f52393a = aVar;
                            this.f52394b = null;
                            this.f52395c = 2;
                            if (kotlinx.coroutines.t0.g(c0479a, this) != objL) {
                                aVar2 = aVar;
                                Unit unit2 = Unit.f312394a;
                                aVar2.i(null);
                                return unit2;
                            }
                            return objL;
                        } catch (Throwable th4) {
                            kotlinx.coroutines.sync.a aVar4 = aVar;
                            th2 = th4;
                            aVar2 = aVar4;
                            aVar2.i(null);
                            throw th2;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                        return ((C0478a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                C0477a(c0.a aVar, kotlin.jvm.internal.i1.h<kotlinx.coroutines.p2> hVar, kotlinx.coroutines.s0 s0Var, c0.a aVar2, kotlinx.coroutines.n<? super Unit> nVar, kotlinx.coroutines.sync.a aVar3, Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
                    this.f52386a = aVar;
                    this.f52387b = hVar;
                    this.f52388c = s0Var;
                    this.f52389d = aVar2;
                    this.f52390e = nVar;
                    this.f52391f = aVar3;
                    this.f52392g = function2;
                }

                /* JADX WARN: Type inference failed for: r8v3, types: [T, kotlinx.coroutines.p2] */
                @Override // androidx.lifecycle.j0
                public final void e(o0 o0Var, c0.a event) {
                    Intrinsics.checkNotNullParameter(o0Var, "<unused var>");
                    Intrinsics.checkNotNullParameter(event, "event");
                    if (event == this.f52386a) {
                        this.f52387b.f312751a = kotlinx.coroutines.k.f(this.f52388c, null, null, new C0478a(this.f52391f, this.f52392g, null), 3, null);
                        return;
                    }
                    if (event == this.f52389d) {
                        kotlinx.coroutines.p2 p2Var = this.f52387b.f312751a;
                        if (p2Var != null) {
                            kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
                        }
                        this.f52387b.f312751a = null;
                    }
                    if (event == c0.a.ON_DESTROY) {
                        kotlinx.coroutines.n<Unit> nVar = this.f52390e;
                        Result.a aVar = Result.Companion;
                        nVar.resumeWith(Result.m785constructorimpl(Unit.f312394a));
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0476a(c0 c0Var, c0.b bVar, kotlinx.coroutines.s0 s0Var, Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super C0476a> dVar) {
                super(2, dVar);
                this.f52382h = c0Var;
                this.f52383i = bVar;
                this.f52384j = s0Var;
                this.f52385k = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0476a(this.f52382h, this.f52383i, this.f52384j, this.f52385k, dVar);
            }

            /* JADX WARN: Code duplicated, block: B:30:0x00ce  */
            /* JADX WARN: Code duplicated, block: B:33:0x00d8  */
            /* JADX WARN: Code duplicated, block: B:38:0x00e8  */
            /* JADX WARN: Code duplicated, block: B:41:0x00f2  */
            /* JADX WARN: Type inference failed for: r4v3, types: [T, androidx.lifecycle.j1$a$a$a, java.lang.Object] */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                kotlin.jvm.internal.i1.h hVar;
                Throwable th2;
                kotlin.jvm.internal.i1.h hVar2;
                kotlinx.coroutines.p2 p2Var;
                j0 j0Var;
                kotlinx.coroutines.p2 p2Var2;
                j0 j0Var2;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f52381g;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hVar = (kotlin.jvm.internal.i1.h) this.f52376b;
                    hVar2 = (kotlin.jvm.internal.i1.h) this.f52375a;
                    try {
                        ResultKt.m(obj);
                        p2Var2 = (kotlinx.coroutines.p2) hVar2.f312751a;
                        if (p2Var2 != null) {
                            kotlinx.coroutines.p2.a.b(p2Var2, null, 1, null);
                        }
                        j0Var2 = (j0) hVar.f312751a;
                        if (j0Var2 != null) {
                            this.f52382h.g(j0Var2);
                        }
                        return Unit.f312394a;
                    } catch (Throwable th3) {
                        th2 = th3;
                        p2Var = (kotlinx.coroutines.p2) hVar2.f312751a;
                        if (p2Var != null) {
                            kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
                        }
                        j0Var = (j0) hVar.f312751a;
                        if (j0Var != null) {
                            this.f52382h.g(j0Var);
                        }
                        throw th2;
                    }
                }
                ResultKt.m(obj);
                if (this.f52382h.d() == c0.b.DESTROYED) {
                    return Unit.f312394a;
                }
                kotlin.jvm.internal.i1.h hVar3 = new kotlin.jvm.internal.i1.h();
                hVar = new kotlin.jvm.internal.i1.h();
                try {
                    c0.b bVar = this.f52383i;
                    c0 c0Var = this.f52382h;
                    kotlinx.coroutines.s0 s0Var = this.f52384j;
                    Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f52385k;
                    this.f52375a = hVar3;
                    this.f52376b = hVar;
                    this.f52377c = bVar;
                    this.f52378d = c0Var;
                    this.f52379e = s0Var;
                    this.f52380f = function2;
                    this.f52381g = 1;
                    kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(this), 1);
                    pVar.p0();
                    c0.a.C0471a c0471a = c0.a.Companion;
                    int i11 = 0 << 0;
                    ?? c0477a = new C0477a(c0471a.d(bVar), hVar3, s0Var, c0471a.a(bVar), pVar, kotlinx.coroutines.sync.g.b(false, 1, null), function2);
                    hVar.f312751a = c0477a;
                    Intrinsics.checkNotNull(c0477a, "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver");
                    c0Var.c((j0) c0477a);
                    Object objU = pVar.u();
                    if (objU == kotlin.coroutines.intrinsics.b.l()) {
                        kotlin.coroutines.jvm.internal.h.c(this);
                    }
                    if (objU == objL) {
                        return objL;
                    }
                    hVar2 = hVar3;
                    p2Var2 = (kotlinx.coroutines.p2) hVar2.f312751a;
                    if (p2Var2 != null) {
                        kotlinx.coroutines.p2.a.b(p2Var2, null, 1, null);
                    }
                    j0Var2 = (j0) hVar.f312751a;
                    if (j0Var2 != null) {
                        this.f52382h.g(j0Var2);
                    }
                    return Unit.f312394a;
                } catch (Throwable th4) {
                    th2 = th4;
                    hVar2 = hVar3;
                    p2Var = (kotlinx.coroutines.p2) hVar2.f312751a;
                    if (p2Var != null) {
                        kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
                    }
                    j0Var = (j0) hVar.f312751a;
                    if (j0Var != null) {
                        this.f52382h.g(j0Var);
                    }
                    throw th2;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0476a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(c0 c0Var, c0.b bVar, Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f52372c = c0Var;
            this.f52373d = bVar;
            this.f52374e = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f52372c, this.f52373d, this.f52374e, dVar);
            aVar.f52371b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f52370a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f52371b;
                a3 a3VarM0 = kotlinx.coroutines.l1.e().R0();
                C0476a c0476a = new C0476a(this.f52372c, this.f52373d, s0Var, this.f52374e, null);
                this.f52370a = 1;
                if (kotlinx.coroutines.i.h(a3VarM0, c0476a, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @Nullable
    public static final Object a(@NotNull c0 c0Var, @NotNull c0.b bVar, @NotNull Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objG;
        if (bVar != c0.b.INITIALIZED) {
            return (c0Var.d() != c0.b.DESTROYED && (objG = kotlinx.coroutines.t0.g(new a(c0Var, bVar, function2, null), dVar)) == kotlin.coroutines.intrinsics.b.l()) ? objG : Unit.f312394a;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
    }

    @Nullable
    public static final Object b(@NotNull o0 o0Var, @NotNull c0.b bVar, @NotNull Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objA = a(o0Var.getLifecycle(), bVar, function2, dVar);
        return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
    }
}
