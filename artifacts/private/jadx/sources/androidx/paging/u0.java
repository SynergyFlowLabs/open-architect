package androidx.paging;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class u0<Key, Value> extends androidx.lifecycle.w0<q1<Value>> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f72644m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final q1.e f72645n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private final q1.a<Value> f72646o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final Function0<h2<Key, Value>> f72647p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.n0 f72648q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.n0 f72649r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private q1<Value> f72650s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private kotlinx.coroutines.p2 f72651t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f72652u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final Runnable f72653v;

    static final class a extends kotlin.jvm.internal.l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u0<Key, Value> f72654a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(u0<Key, Value> u0Var) {
            super(0);
            this.f72654a = u0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f72654a.F(true);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.LivePagedList$invalidate$1", f = "LivePagedList.kt", i = {0, 1, 1}, l = {com.planner5d.library.engine.input.f.b.f160705l0, 90}, m = "invokeSuspend", n = {"pagingSource", "pagingSource", "lastKey"}, s = {"L$0", "L$0", "L$1"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f72655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f72656b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f72657c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ u0<Key, Value> f72658d;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.LivePagedList$invalidate$1$1", f = "LivePagedList.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f72659a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u0<Key, Value> f72660b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u0<Key, Value> u0Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f72660b = u0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new a(this.f72660b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f72659a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                ((u0) this.f72660b).f72650s.i0(a1.REFRESH, x0.b.f72692b);
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(u0<Key, Value> u0Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f72658d = u0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new b(this.f72658d, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:26:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:28:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:29:0x00fd  */
        /* JADX WARN: Code duplicated, block: B:31:0x0101  */
        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            h2 h2Var;
            Object obj2;
            h2.b bVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f72657c;
            if (i10 == 0) {
                ResultKt.m(obj);
                ((u0) this.f72658d).f72650s.L().unregisterInvalidatedCallback(((u0) this.f72658d).f72652u);
                h2 h2Var2 = (h2) ((u0) this.f72658d).f72647p.invoke();
                h2Var2.registerInvalidatedCallback(((u0) this.f72658d).f72652u);
                if (h2Var2 instanceof s0) {
                    ((s0) h2Var2).a(((u0) this.f72658d).f72645n.f72466a);
                }
                kotlinx.coroutines.n0 n0Var = ((u0) this.f72658d).f72648q;
                a aVar = new a(this.f72658d, null);
                this.f72655a = h2Var2;
                this.f72657c = 1;
                if (kotlinx.coroutines.i.h(n0Var, aVar, this) != objL) {
                    h2Var = h2Var2;
                }
                return objL;
            }
            if (i10 == 1) {
                h2Var = (h2) this.f72655a;
                ResultKt.m(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj3 = this.f72656b;
                h2Var = (h2) this.f72655a;
                ResultKt.m(obj);
                obj2 = obj3;
            }
            bVar = (h2.b) obj;
            if (bVar instanceof h2.b.C0663b) {
                ((u0) this.f72658d).f72650s.i0(a1.REFRESH, new x0.c(false));
                h2Var.invalidate();
            } else if (bVar instanceof h2.b.a) {
                ((u0) this.f72658d).f72650s.i0(a1.REFRESH, new x0.a(((h2.b.a) bVar).k()));
            } else if (bVar instanceof h2.b.c) {
                q1 q1VarA = q1.f72442j.a(h2Var, (h2.b.c) bVar, ((u0) this.f72658d).f72644m, ((u0) this.f72658d).f72648q, ((u0) this.f72658d).f72649r, ((u0) this.f72658d).f72646o, ((u0) this.f72658d).f72645n, obj2);
                u0<Key, Value> u0Var = this.f72658d;
                u0Var.G(((u0) u0Var).f72650s, q1VarA);
                ((u0) this.f72658d).f72650s = q1VarA;
                this.f72658d.o(q1VarA);
            }
            return Unit.f312394a;
            Object objG = ((u0) this.f72658d).f72650s.G();
            h2.a<Key> aVarC = t1.c(((u0) this.f72658d).f72645n, objG);
            this.f72655a = h2Var;
            this.f72656b = objG;
            this.f72657c = 2;
            Object objLoad = h2Var.load(aVarC, this);
            if (objLoad != objL) {
                obj2 = objG;
                obj = objLoad;
                bVar = (h2.b) obj;
                if (bVar instanceof h2.b.C0663b) {
                    ((u0) this.f72658d).f72650s.i0(a1.REFRESH, new x0.c(false));
                    h2Var.invalidate();
                } else if (bVar instanceof h2.b.a) {
                    ((u0) this.f72658d).f72650s.i0(a1.REFRESH, new x0.a(((h2.b.a) bVar).k()));
                } else if (bVar instanceof h2.b.c) {
                    q1 q1VarA2 = q1.f72442j.a(h2Var, (h2.b.c) bVar, ((u0) this.f72658d).f72644m, ((u0) this.f72658d).f72648q, ((u0) this.f72658d).f72649r, ((u0) this.f72658d).f72646o, ((u0) this.f72658d).f72645n, obj2);
                    u0<Key, Value> u0Var2 = this.f72658d;
                    u0Var2.G(((u0) u0Var2).f72650s, q1VarA2);
                    ((u0) this.f72658d).f72650s = q1VarA2;
                    this.f72658d.o(q1VarA2);
                }
                return Unit.f312394a;
            }
            return objL;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u0(@NotNull kotlinx.coroutines.s0 coroutineScope, @Nullable Key key, @NotNull q1.e config, @Nullable q1.a<Value> aVar, @NotNull Function0<? extends h2<Key, Value>> pagingSourceFactory, @NotNull kotlinx.coroutines.n0 notifyDispatcher, @NotNull kotlinx.coroutines.n0 fetchDispatcher) {
        super(new j0(coroutineScope, notifyDispatcher, fetchDispatcher, config, key));
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(notifyDispatcher, "notifyDispatcher");
        Intrinsics.checkNotNullParameter(fetchDispatcher, "fetchDispatcher");
        this.f72644m = coroutineScope;
        this.f72645n = config;
        this.f72646o = aVar;
        this.f72647p = pagingSourceFactory;
        this.f72648q = notifyDispatcher;
        this.f72649r = fetchDispatcher;
        this.f72652u = new a(this);
        Runnable runnable = new Runnable() { // from class: androidx.paging.t0
            @Override // java.lang.Runnable
            public final void run() {
                u0.H(this.f72576a);
            }
        };
        this.f72653v = runnable;
        q1<Value> q1VarF = f();
        Intrinsics.checkNotNull(q1VarF);
        q1<Value> q1Var = q1VarF;
        this.f72650s = q1Var;
        q1Var.m0(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(boolean z10) {
        kotlinx.coroutines.p2 p2Var = this.f72651t;
        if (p2Var == null || z10) {
            if (p2Var != null) {
                kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
            }
            this.f72651t = kotlinx.coroutines.k.f(this.f72644m, this.f72649r, null, new b(this, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(q1<Value> q1Var, q1<Value> q1Var2) {
        q1Var.m0(null);
        q1Var2.m0(this.f72653v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(u0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.F(true);
    }

    @Override // androidx.lifecycle.w0
    protected void m() {
        super.m();
        F(false);
    }
}
