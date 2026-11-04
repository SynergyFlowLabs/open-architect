package com.planner5d.library.api.requests;

import com.planner5d.library.services.utility.c0;
import com.planner5d.library.services.utility.p2;
import com.planner5d.library.services.utility.s;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.j1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pj.n;
import rx.Observable;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final a f142311c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final Object f142312d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.requests.a f142313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.b f142314b;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.api.requests.UserApiRequester", f = "UserApiRequester.kt", i = {0, 0, 0, 0}, l = {65, 66, com.planner5d.library.engine.input.f.b.V}, m = "request", n = {"this", "user", "permits", "apiRequest"}, s = {"L$0", "L$1", "L$2", "L$3"})
    static final class b<R> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f142315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f142316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f142317c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f142318d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f142319e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f142321g;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f142319e = obj;
            this.f142321g |= Integer.MIN_VALUE;
            return c.this.f(null, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: com.planner5d.library.api.requests.c$c, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.api.requests.UserApiRequester$request$2", f = "UserApiRequester.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
    static final class C1511c<R> extends o implements Function2<s0, kotlin.coroutines.d<? super R>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f142322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super R>, Object> f142323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f142324c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ id.a f142325d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C1511c(n<? super com.planner5d.library.api.b, ? super id.a, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar, c cVar, id.a aVar, kotlin.coroutines.d<? super C1511c> dVar) {
            super(2, dVar);
            this.f142323b = nVar;
            this.f142324c = cVar;
            this.f142325d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C1511c(this.f142323b, this.f142324c, this.f142325d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f142322a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super R>, Object> nVar = this.f142323b;
            com.planner5d.library.api.b bVar = this.f142324c.f142314b;
            id.a aVar = this.f142325d;
            this.f142322a = 1;
            Object objInvoke = nVar.invoke(bVar, aVar, this);
            return objInvoke == objL ? objL : objInvoke;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super R> dVar) {
            return ((C1511c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.api.requests.UserApiRequester$request$3", f = "UserApiRequester.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160708m0, com.planner5d.library.engine.input.f.b.f160708m0}, m = "invokeSuspend", n = {}, s = {})
    static final class d<R> extends o implements Function1<kotlin.coroutines.d<? super R>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f142326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f142327b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super R>, Object> f142329d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ id.a f142330e;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.api.requests.UserApiRequester$request$3$1", f = "UserApiRequester.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super R>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f142331a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super R>, Object> f142332b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ c f142333c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ id.a f142334d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(n<? super com.planner5d.library.api.b, ? super id.a, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar, c cVar, id.a aVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f142332b = nVar;
                this.f142333c = cVar;
                this.f142334d = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f142332b, this.f142333c, this.f142334d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f142331a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                ResultKt.m(obj);
                n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super R>, Object> nVar = this.f142332b;
                com.planner5d.library.api.b bVar = this.f142333c.f142314b;
                id.a aVar = this.f142334d;
                this.f142331a = 1;
                Object objInvoke = nVar.invoke(bVar, aVar, this);
                return objInvoke == objL ? objL : objInvoke;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super R> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(n<? super com.planner5d.library.api.b, ? super id.a, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar, id.a aVar, kotlin.coroutines.d<? super d> dVar) {
            super(1, dVar);
            this.f142329d = nVar;
            this.f142330e = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new d(this.f142329d, this.f142330e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            n0 n0VarD;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f142327b;
            if (i10 == 0) {
                ResultKt.m(obj);
                n0VarD = c.this.d();
                p2.a aVar = p2.f229701c;
                Object obj2 = c.f142312d;
                this.f142326a = n0VarD;
                this.f142327b = 1;
                obj = aVar.a(obj2, this);
                if (obj != objL) {
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            n0VarD = (n0) this.f142326a;
            ResultKt.m(obj);
            CoroutineContext coroutineContextPlus = n0VarD.plus((CoroutineContext) obj);
            a aVar2 = new a(this.f142329d, c.this, this.f142330e, null);
            this.f142326a = null;
            this.f142327b = 2;
            Object objH = i.h(coroutineContextPlus, aVar2, this);
            return objH == objL ? objL : objH;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super R> dVar) {
            return ((d) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.api.requests.UserApiRequester$requestAsObservable$1", f = "UserApiRequester.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160690g0}, m = "invokeSuspend", n = {}, s = {})
    static final class e<R> extends o implements Function1<kotlin.coroutines.d<? super R>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f142335a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ id.a f142337c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.api.queue.a f142338d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<com.planner5d.library.api.b, id.a, R> f142339e;

        /* synthetic */ class a extends g0 implements n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super R>, Object>, kotlin.coroutines.jvm.internal.n {
            a(Object obj) {
                super(3, obj, Intrinsics.a.class, "suspendConversion0", "invokeSuspend$suspendConversion0(Lkotlin/jvm/functions/Function2;Lcom/planner5d/library/api/Planner5D;Lcom/planner5d/library/modules/user/model/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            @Override // pj.n
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super R> dVar) {
                return e.m((Function2) this.receiver, bVar, aVar, dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(id.a aVar, com.planner5d.library.api.queue.a aVar2, Function2<? super com.planner5d.library.api.b, ? super id.a, ? extends R> function2, kotlin.coroutines.d<? super e> dVar) {
            super(1, dVar);
            this.f142337c = aVar;
            this.f142338d = aVar2;
            this.f142339e = function2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object m(Function2 function2, com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d dVar) {
            return function2.invoke(bVar, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new e(this.f142337c, this.f142338d, this.f142339e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws com.planner5d.library.api.queue.b.a {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f142335a;
            int i11 = 5 ^ 1;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            c cVar = c.this;
            id.a aVar = this.f142337c;
            com.planner5d.library.api.queue.a aVar2 = this.f142338d;
            a aVar3 = new a(this.f142339e);
            this.f142335a = 1;
            Object objF = cVar.f(aVar, aVar2, aVar3, this);
            return objF == objL ? objL : objF;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super R> dVar) {
            return ((e) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.api.requests.UserApiRequester$requestBlocking$1", f = "UserApiRequester.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160732u0}, m = "invokeSuspend", n = {}, s = {})
    static final class f<R> extends o implements Function2<s0, kotlin.coroutines.d<? super R>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f142340a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ id.a f142342c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<com.planner5d.library.api.b, id.a, R> f142343d;

        /* synthetic */ class a extends g0 implements n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super R>, Object>, kotlin.coroutines.jvm.internal.n {
            a(Object obj) {
                super(3, obj, Intrinsics.a.class, "suspendConversion0", "invokeSuspend$suspendConversion0(Lkotlin/jvm/functions/Function2;Lcom/planner5d/library/api/Planner5D;Lcom/planner5d/library/modules/user/model/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            @Override // pj.n
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super R> dVar) {
                return f.m((Function2) this.receiver, bVar, aVar, dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(id.a aVar, Function2<? super com.planner5d.library.api.b, ? super id.a, ? extends R> function2, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f142342c = aVar;
            this.f142343d = function2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object m(Function2 function2, com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d dVar) {
            return function2.invoke(bVar, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new f(this.f142342c, this.f142343d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws com.planner5d.library.api.queue.b.a {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f142340a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            c cVar = c.this;
            id.a aVar = this.f142342c;
            com.planner5d.library.api.queue.a aVar2 = com.planner5d.library.api.queue.a.SINGLE;
            a aVar3 = new a(this.f142343d);
            this.f142340a = 1;
            Object objF = cVar.f(aVar, aVar2, aVar3, this);
            return objF == objL ? objL : objF;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super R> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public c(@NotNull com.planner5d.library.api.requests.a executor, @NotNull com.planner5d.library.api.b api) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(api, "api");
        this.f142313a = executor;
        this.f142314b = api;
        s sVar = s.f229729a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n0 d() {
        return s.f229729a.b();
    }

    private static Object e(c cVar) {
        return j1.t(new c1(s.f229729a, s.class, "DispatcherNetwork", "getDispatcherNetwork()Lkotlinx/coroutines/CoroutineDispatcher;", 0));
    }

    public static /* synthetic */ Object g(c cVar, id.a aVar, com.planner5d.library.api.queue.a aVar2, n nVar, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar2 = com.planner5d.library.api.queue.a.SINGLE;
        }
        return cVar.f(aVar, aVar2, nVar, dVar);
    }

    public static /* synthetic */ Observable i(c cVar, id.a aVar, com.planner5d.library.api.queue.a aVar2, Function2 function2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar2 = com.planner5d.library.api.queue.a.SINGLE;
        }
        return cVar.h(aVar, aVar2, function2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Nullable
    public final <R> Object f(@Nullable id.a aVar, @NotNull com.planner5d.library.api.queue.a aVar2, @NotNull n<? super com.planner5d.library.api.b, ? super id.a, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar, @NotNull kotlin.coroutines.d<? super R> dVar) throws com.planner5d.library.api.queue.b.a {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f142321g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f142321g = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objB = bVar.f142319e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f142321g;
        if (i11 == 0) {
            ResultKt.m(objB);
            p2.a aVar3 = p2.f229701c;
            Object obj = f142312d;
            bVar.f142315a = this;
            bVar.f142316b = aVar;
            bVar.f142317c = aVar2;
            bVar.f142318d = nVar;
            bVar.f142321g = 1;
            objB = aVar3.b(obj, bVar);
            if (objB != objL) {
            }
            return objL;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                ResultKt.m(objB);
                return objB;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objB);
            return objB;
        }
        nVar = (n) bVar.f142318d;
        aVar2 = (com.planner5d.library.api.queue.a) bVar.f142317c;
        aVar = (id.a) bVar.f142316b;
        this = (c) bVar.f142315a;
        ResultKt.m(objB);
        if (((Boolean) objB).booleanValue()) {
            n0 n0VarD = this.d();
            C1511c c1511c = new C1511c(nVar, this, aVar, null);
            bVar.f142315a = null;
            bVar.f142316b = null;
            bVar.f142317c = null;
            bVar.f142318d = null;
            bVar.f142321g = 2;
            Object objH = i.h(n0VarD, c1511c, bVar);
            if (objH != objL) {
                return objH;
            }
        } else {
            com.planner5d.library.api.requests.a aVar4 = this.f142313a;
            d dVar2 = this.new d(nVar, aVar, null);
            bVar.f142315a = null;
            bVar.f142316b = null;
            bVar.f142317c = null;
            bVar.f142318d = null;
            bVar.f142321g = 3;
            Object objB2 = aVar4.b(aVar2, dVar2, bVar);
            if (objB2 != objL) {
                return objB2;
            }
        }
        return objL;
    }

    @NotNull
    public final <R> Observable<R> h(@Nullable id.a aVar, @NotNull com.planner5d.library.api.queue.a permits, @NotNull Function2<? super com.planner5d.library.api.b, ? super id.a, ? extends R> apiRequest) {
        Intrinsics.checkNotNullParameter(permits, "permits");
        Intrinsics.checkNotNullParameter(apiRequest, "apiRequest");
        return c0.F(c0.f225068a, null, new e(aVar, permits, apiRequest, null), 1, null);
    }

    public final <R> R j(@Nullable id.a aVar, @NotNull Function2<? super com.planner5d.library.api.b, ? super id.a, ? extends R> apiRequest) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(apiRequest, "apiRequest");
        return (R) c0.t(c0.f225068a, null, true, new f(aVar, apiRequest, null), 1, null);
    }
}
