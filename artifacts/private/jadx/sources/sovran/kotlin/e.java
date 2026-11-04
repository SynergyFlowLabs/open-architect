package sovran.kotlin;

import com.facebook.internal.w0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.i1;
import kotlin.jvm.internal.j1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.b2;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.q3;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<a> f376080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<b<? extends sovran.kotlin.c>> f376081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s0 f376082c = t0.a(q3.c(null, 1, null));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z1 f376083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CoroutineContext f376084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final z1 f376085f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final CoroutineContext f376086g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private sovran.kotlin.c f376087a;

        public a(@NotNull sovran.kotlin.c state) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.f376087a = state;
        }

        public static /* synthetic */ a c(a aVar, sovran.kotlin.c cVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cVar = aVar.f376087a;
            }
            return aVar.b(cVar);
        }

        @NotNull
        public final sovran.kotlin.c a() {
            return this.f376087a;
        }

        @NotNull
        public final a b(@NotNull sovran.kotlin.c state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new a(state);
        }

        @NotNull
        public final sovran.kotlin.c d() {
            return this.f376087a;
        }

        public final void e(@NotNull sovran.kotlin.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f376087a = cVar;
        }

        public boolean equals(@Nullable Object obj) {
            if (this != obj && (!(obj instanceof a) || !Intrinsics.areEqual(this.f376087a, ((a) obj).f376087a))) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            sovran.kotlin.c cVar = this.f376087a;
            if (cVar != null) {
                return cVar.hashCode();
            }
            return 0;
        }

        @NotNull
        public String toString() {
            return "Container(state=" + this.f376087a + ")";
        }
    }

    public static final class b<StateT extends sovran.kotlin.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f376090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final WeakReference<Object> f376091b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final Function2<StateT, kotlin.coroutines.d<? super Unit>, Object> f376092c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final kotlin.reflect.d<StateT> f376093d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final n0 f376094e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final a f376089g = new a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f376088f = 1;

        public static final class a {
            private a() {
            }

            public final int a() {
                int i10 = b.f376088f;
                b.f376088f++;
                return i10;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull sovran.kotlin.g obj, @NotNull Function2<? super StateT, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> handler, @NotNull kotlin.reflect.d<StateT> key, @NotNull n0 queue) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(queue, "queue");
            this.f376092c = handler;
            this.f376093d = key;
            this.f376094e = queue;
            this.f376090a = f376089g.a();
            this.f376091b = new WeakReference<>(obj);
        }

        @NotNull
        public final Function2<StateT, kotlin.coroutines.d<? super Unit>, Object> c() {
            return this.f376092c;
        }

        @NotNull
        public final kotlin.reflect.d<StateT> d() {
            return this.f376093d;
        }

        @NotNull
        public final WeakReference<Object> e() {
            return this.f376091b;
        }

        @NotNull
        public final n0 f() {
            return this.f376094e;
        }

        public final int g() {
            return this.f376090a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "sovran.kotlin.Store$clean$2", f = "Store.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f376095a;

        static final class a extends l0 implements Function1<b<? extends sovran.kotlin.c>, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f376097a = new a();

            a() {
                super(1);
            }

            public final boolean c(@NotNull b<? extends sovran.kotlin.c> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.e().get() == null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(b<? extends sovran.kotlin.c> bVar) {
                return Boolean.valueOf(c(bVar));
            }
        }

        c(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object value, @NotNull kotlin.coroutines.d<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            return e.this.new c(completion);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object $result) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f376095a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m($result);
            CollectionsKt.removeAll((List) e.this.k(), (Function1) a.f376097a);
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "sovran.kotlin.Store", f = "Store.kt", i = {}, l = {188}, m = "currentState", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f376098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f376099b;

        d(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object $result) {
            this.f376098a = $result;
            this.f376099b |= Integer.MIN_VALUE;
            return e.this.f(null, this);
        }
    }

    /* JADX INFO: renamed from: sovran.kotlin.e$e, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "sovran.kotlin.Store", f = "Store.kt", i = {0, 0, 0, 1, 1, 1, 2, 2}, l = {134, 138, 146, com.planner5d.library.engine.input.f.b.F1}, m = "dispatch", n = {"this", w0.f100156c1, "stateClazz", "this", "stateClazz", "state", "this", "state"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1"})
    static final class C2508e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f376101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f376102b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f376104d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f376105e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f376106f;

        C2508e(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object $result) {
            this.f376101a = $result;
            this.f376102b |= Integer.MIN_VALUE;
            return e.this.g(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "sovran.kotlin.Store$dispatch$2", f = "Store.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f376107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i1.h f376108b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ sovran.kotlin.a f376109c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f376110d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(i1.h hVar, sovran.kotlin.a aVar, a aVar2, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f376108b = hVar;
            this.f376109c = aVar;
            this.f376110d = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object value, @NotNull kotlin.coroutines.d<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            return new f(this.f376108b, this.f376109c, this.f376110d, completion);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [T, sovran.kotlin.c] */
        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object $result) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f376107a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m($result);
            i1.h hVar = this.f376108b;
            hVar.f312751a = this.f376109c.a((sovran.kotlin.c) hVar.f312751a);
            this.f376110d.e((sovran.kotlin.c) this.f376108b.f312751a);
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "sovran.kotlin.Store", f = "Store.kt", i = {0, 0, 0}, l = {160}, m = "dispatch", n = {"this", w0.f100156c1, "stateClazz"}, s = {"L$0", "L$1", "L$2"})
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f376111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f376112b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f376114d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f376115e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f376116f;

        g(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object $result) {
            this.f376111a = $result;
            this.f376112b |= Integer.MIN_VALUE;
            return e.this.h(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [ResultT] */
    @kotlin.coroutines.jvm.internal.f(c = "sovran.kotlin.Store$dispatch$4", f = "Store.kt", i = {}, l = {166, 174, 175}, m = "invokeSuspend", n = {}, s = {})
    static final class h<ResultT> extends kotlin.coroutines.jvm.internal.o implements Function2<ResultT, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ Object f376117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f376118b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ i1.h f376120d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ sovran.kotlin.b f376121e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ a f376122f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.d f376123g;

        @kotlin.coroutines.jvm.internal.f(c = "sovran.kotlin.Store$dispatch$4$1", f = "Store.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f376124a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f376126c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f376126c = obj;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object value, @NotNull kotlin.coroutines.d<?> completion) {
                Intrinsics.checkNotNullParameter(completion, "completion");
                return new a(this.f376126c, completion);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v5, types: [T, sovran.kotlin.c] */
            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object $result) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f376124a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m($result);
                h hVar = h.this;
                i1.h hVar2 = hVar.f376120d;
                hVar2.f312751a = hVar.f376121e.a((sovran.kotlin.c) hVar2.f312751a, this.f376126c);
                h hVar3 = h.this;
                hVar3.f376122f.e((sovran.kotlin.c) hVar3.f376120d.f312751a);
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(i1.h hVar, sovran.kotlin.b bVar, a aVar, kotlin.reflect.d dVar, kotlin.coroutines.d dVar2) {
            super(2, dVar2);
            this.f376120d = hVar;
            this.f376121e = bVar;
            this.f376122f = aVar;
            this.f376123g = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object value, @NotNull kotlin.coroutines.d<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            h hVar = e.this.new h(this.f376120d, this.f376121e, this.f376122f, this.f376123g, completion);
            hVar.f376117a = value;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(obj, dVar)).invokeSuspend(Unit.f312394a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
        
            if (r1.n((java.util.List) r13, r3, r12) == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
            /*
                r12 = this;
                r11 = 6
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r12.f376118b
                r2 = 3
                r3 = 2
                r11 = 1
                r4 = 1
                if (r1 == 0) goto L29
                r11 = 6
                if (r1 == r4) goto L25
                r11 = 0
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                kotlin.ResultKt.m(r13)
                goto L7c
            L19:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L21:
                kotlin.ResultKt.m(r13)
                goto L66
            L25:
                kotlin.ResultKt.m(r13)
                goto L57
            L29:
                kotlin.ResultKt.m(r13)
                r11 = 7
                java.lang.Object r13 = r12.f376117a
                sovran.kotlin.e r1 = sovran.kotlin.e.this
                kotlinx.coroutines.s0 r5 = sovran.kotlin.e.a(r1)
                sovran.kotlin.e r1 = sovran.kotlin.e.this
                kotlin.coroutines.CoroutineContext r6 = sovran.kotlin.e.b(r1)
                r11 = 5
                sovran.kotlin.e$h$a r8 = new sovran.kotlin.e$h$a
                r11 = 0
                r1 = 0
                r8.<init>(r13, r1)
                r9 = 2
                r10 = 0
                int r11 = r11 << r10
                r7 = 0
                kotlinx.coroutines.p2 r13 = kotlinx.coroutines.i.e(r5, r6, r7, r8, r9, r10)
                r11 = 7
                r12.f376118b = r4
                r11 = 5
                java.lang.Object r13 = r13.d1(r12)
                r11 = 4
                if (r13 != r0) goto L57
                goto L7b
            L57:
                sovran.kotlin.e r13 = sovran.kotlin.e.this
                kotlin.reflect.d r1 = r12.f376123g
                r11 = 1
                r12.f376118b = r3
                java.lang.Object r13 = sovran.kotlin.e.d(r13, r1, r12)
                r11 = 3
                if (r13 != r0) goto L66
                goto L7b
            L66:
                r11 = 0
                java.util.List r13 = (java.util.List) r13
                sovran.kotlin.e r1 = sovran.kotlin.e.this
                kotlin.jvm.internal.i1$h r3 = r12.f376120d
                r11 = 0
                T r3 = r3.f312751a
                sovran.kotlin.c r3 = (sovran.kotlin.c) r3
                r12.f376118b = r2
                r11 = 7
                java.lang.Object r12 = sovran.kotlin.e.c(r1, r13, r3, r12)
                if (r12 != r0) goto L7c
            L7b:
                return r0
            L7c:
                kotlin.Unit r12 = kotlin.Unit.f312394a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: sovran.kotlin.e.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "sovran.kotlin.Store$notify$2", f = "Store.kt", i = {}, l = {237}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f376127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f376128b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ sovran.kotlin.c f376129c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Function2 function2, sovran.kotlin.c cVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f376128b = function2;
            this.f376129c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object value, @NotNull kotlin.coroutines.d<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            return new i(this.f376128b, this.f376129c, completion);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((i) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object $result) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f376127a;
            if (i10 == 0) {
                ResultKt.m($result);
                Function2 function2 = this.f376128b;
                sovran.kotlin.c cVar = this.f376129c;
                this.f376127a = 1;
                if (function2.invoke(cVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m($result);
            }
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "sovran.kotlin.Store", f = "Store.kt", i = {0, 0}, l = {115, 120}, m = "provide", n = {"this", "state"}, s = {"L$0", "L$1"})
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f376130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f376131b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f376133d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f376134e;

        j(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object $result) {
            this.f376130a = $result;
            this.f376131b |= Integer.MIN_VALUE;
            return e.this.o(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "sovran.kotlin.Store$provide$2", f = "Store.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f376135a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f376137c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(a aVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f376137c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object value, @NotNull kotlin.coroutines.d<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            return e.this.new k(this.f376137c, completion);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((k) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object $result) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f376135a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m($result);
            e.this.j().add(this.f376137c);
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "sovran.kotlin.Store$statesMatching$result$1", f = "Store.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class l extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super List<? extends a>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f376138a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.d f376140c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(kotlin.reflect.d dVar, kotlin.coroutines.d dVar2) {
            super(2, dVar2);
            this.f376140c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object value, @NotNull kotlin.coroutines.d<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            return e.this.new l(this.f376140c, completion);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super List<? extends a>> dVar) {
            return ((l) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object $result) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f376138a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m($result);
            List<a> listJ = e.this.j();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listJ) {
                if (Intrinsics.areEqual(j1.d(((a) obj).d().getClass()), this.f376140c)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "sovran.kotlin.Store", f = "Store.kt", i = {0, 0, 0, 0, 1, 1, 2}, l = {com.planner5d.library.engine.input.f.b.f160717p0, com.planner5d.library.engine.input.f.b.f160690g0, com.planner5d.library.engine.input.f.b.f160696i0}, m = "subscribe", n = {"this", "stateClazz", "subscription", "initialState", "this", "subscription", "subscription"}, s = {"L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$0"})
    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f376141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f376142b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f376144d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f376145e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f376146f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f376147g;

        m(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object $result) {
            this.f376141a = $result;
            this.f376142b |= Integer.MIN_VALUE;
            return e.this.r(null, null, false, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "sovran.kotlin.Store$subscribe$2", f = "Store.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class n extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f376148a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f376150c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(b bVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f376150c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object value, @NotNull kotlin.coroutines.d<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            return e.this.new n(this.f376150c, completion);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((n) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object $result) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f376148a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m($result);
            e.this.k().add(this.f376150c);
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "sovran.kotlin.Store$subscribersForState$result$1", f = "Store.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class o extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super List<? extends b<? extends sovran.kotlin.c>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f376151a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.d f376153c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(kotlin.reflect.d dVar, kotlin.coroutines.d dVar2) {
            super(2, dVar2);
            this.f376153c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object value, @NotNull kotlin.coroutines.d<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            return e.this.new o(this.f376153c, completion);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super List<? extends b<? extends sovran.kotlin.c>>> dVar) {
            return ((o) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object $result) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f376151a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m($result);
            List<b<? extends sovran.kotlin.c>> listK = e.this.k();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listK) {
                if (Intrinsics.areEqual(((b) obj).d(), this.f376153c)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "sovran.kotlin.Store$unsubscribe$2", f = "Store.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class p extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f376154a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f376156c;

        static final class a extends l0 implements Function1<b<? extends sovran.kotlin.c>, Boolean> {
            a() {
                super(1);
            }

            public final boolean c(@NotNull b<? extends sovran.kotlin.c> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.g() != p.this.f376156c) {
                    return false;
                }
                int i10 = 4 >> 1;
                return true;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(b<? extends sovran.kotlin.c> bVar) {
                return Boolean.valueOf(c(bVar));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(int i10, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f376156c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object value, @NotNull kotlin.coroutines.d<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            return e.this.new p(this.f376156c, completion);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((p) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object $result) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f376154a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m($result);
            CollectionsKt.removeAll((List) e.this.k(), (Function1) new a());
            return Unit.f312394a;
        }
    }

    public e() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "Executors.newSingleThreadExecutor()");
        z1 z1VarD = b2.d(executorServiceNewSingleThreadExecutor);
        this.f376083d = z1VarD;
        this.f376084e = z1VarD.plus(new r0("state.sync.sovran.com"));
        ExecutorService executorServiceNewSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor2, "Executors.newSingleThreadExecutor()");
        z1 z1VarD2 = b2.d(executorServiceNewSingleThreadExecutor2);
        this.f376085f = z1VarD2;
        this.f376086g = z1VarD2.plus(new r0("state.update.sovran.com"));
        this.f376080a = new ArrayList();
        this.f376081b = new ArrayList();
    }

    private final Object e(kotlin.coroutines.d<? super Unit> continuation) {
        Object objD1 = kotlinx.coroutines.k.f(i(), l(), null, new c(null), 2, null).d1(continuation);
        return objD1 == kotlin.coroutines.intrinsics.b.l() ? objD1 : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s0 i() {
        return this.f376082c;
    }

    private final CoroutineContext l() {
        return this.f376084e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CoroutineContext m() {
        return this.f376086g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <StateT extends sovran.kotlin.c> Object n(List<? extends b<? extends StateT>> subscribers, StateT state, kotlin.coroutines.d<? super Unit> continuation) {
        for (b<? extends StateT> bVar : subscribers) {
            Function2<StateT, kotlin.coroutines.d<? super Unit>, Object> function2C = bVar.c();
            if (!(function2C instanceof kotlin.coroutines.jvm.internal.n ? r1.B(function2C, 2) : false)) {
                function2C = null;
            }
            if (function2C != null && bVar.e().get() != null) {
                kotlinx.coroutines.k.f(i(), bVar.f(), null, new i(function2C, state, null), 2, null);
            }
        }
        Object objE = e(continuation);
        return objE == kotlin.coroutines.intrinsics.b.l() ? objE : Unit.f312394a;
    }

    private final <T extends sovran.kotlin.c> Object q(kotlin.reflect.d<T> clazz, kotlin.coroutines.d<? super List<a>> continuation) {
        return kotlinx.coroutines.k.b(i(), m(), null, new l(clazz, null), 2, null).q(continuation);
    }

    public static /* synthetic */ Object s(e eVar, sovran.kotlin.g gVar, kotlin.reflect.d dVar, boolean z10, n0 n0Var, Function2 function2, kotlin.coroutines.d dVar2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            n0Var = l1.a();
        }
        return eVar.r(gVar, dVar, z11, n0Var, function2, dVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <StateT extends sovran.kotlin.c> Object t(kotlin.reflect.d<StateT> stateClazz, kotlin.coroutines.d<? super List<? extends b<? extends sovran.kotlin.c>>> continuation) {
        return kotlinx.coroutines.k.b(i(), l(), null, new o(stateClazz, null), 2, null).q(continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Nullable
    public final <StateT extends sovran.kotlin.c> Object f(@NotNull kotlin.reflect.d<StateT> clazz, @NotNull kotlin.coroutines.d<? super StateT> continuation) {
        d dVar;
        sovran.kotlin.c cVarD;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i10 = dVar.f376099b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f376099b = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objQ = dVar.f376098a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar.f376099b;
        if (i11 == 0) {
            ResultKt.m(objQ);
            dVar.f376099b = 1;
            objQ = q(clazz, dVar);
            if (objQ == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objQ);
        }
        List list = (List) objQ;
        if (list.isEmpty() || (cVarD = ((a) list.get(0)).d()) == null) {
            return null;
        }
        return cVarD;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ed A[PHI: r0 r1 r2
      0x00ed: PHI (r0v7 kotlin.jvm.internal.i1$h) = (r0v6 kotlin.jvm.internal.i1$h), (r0v18 kotlin.jvm.internal.i1$h) binds: [B:36:0x00ea, B:17:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x00ed: PHI (r1v8 ??) = (r1v16 ??), (r1v17 ??) binds: [B:36:0x00ea, B:17:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x00ed: PHI (r2v9 java.lang.Object) = (r2v8 java.lang.Object), (r2v2 java.lang.Object) binds: [B:36:0x00ea, B:17:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fd, code lost:
    
        if (r1.n((java.util.List) r2, r0, r3) == r4) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [T] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v8, types: [sovran.kotlin.e] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <ActionT extends sovran.kotlin.a<StateT>, StateT extends sovran.kotlin.c> java.lang.Object g(@org.jetbrains.annotations.NotNull ActionT r20, @org.jetbrains.annotations.NotNull kotlin.reflect.d<StateT> r21, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r22) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sovran.kotlin.e.g(sovran.kotlin.a, kotlin.reflect.d, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final <ActionT extends sovran.kotlin.b<StateT, ResultT>, StateT extends sovran.kotlin.c, ResultT> Object h(@NotNull ActionT action, @NotNull kotlin.reflect.d<StateT> stateClazz, @NotNull kotlin.coroutines.d<? super Unit> continuation) {
        g gVar;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i10 = gVar.f376112b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f376112b = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object objQ = gVar.f376111a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = gVar.f376112b;
        if (i11 == 0) {
            ResultKt.m(objQ);
            gVar.f376114d = this;
            gVar.f376115e = action;
            gVar.f376116f = stateClazz;
            gVar.f376112b = 1;
            objQ = q(stateClazz, gVar);
            if (objQ == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateClazz = (kotlin.reflect.d) gVar.f376116f;
            action = (ActionT) gVar.f376115e;
            this = (e) gVar.f376114d;
            ResultKt.m(objQ);
        }
        e eVar = this;
        sovran.kotlin.b bVar = action;
        kotlin.reflect.d<StateT> dVar = stateClazz;
        a aVar = (a) CollectionsKt.firstOrNull((List) objQ);
        i1.h hVar = new i1.h();
        sovran.kotlin.c cVarD = aVar != null ? aVar.d() : null;
        T t10 = cVarD != null ? cVarD : 0;
        if (t10 == 0) {
            return Unit.f312394a;
        }
        hVar.f312751a = t10;
        bVar.b((sovran.kotlin.c) t10, eVar.new h(hVar, bVar, aVar, dVar, null));
        return Unit.f312394a;
    }

    @NotNull
    public final List<a> j() {
        return this.f376080a;
    }

    @NotNull
    public final List<b<? extends sovran.kotlin.c>> k() {
        return this.f376081b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009f, code lost:
    
        if (r11.d1(r0) == r1) goto L25;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <StateT extends sovran.kotlin.c> java.lang.Object o(@org.jetbrains.annotations.NotNull StateT r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r13) {
        /*
            r11 = this;
            r10 = 6
            boolean r0 = r13 instanceof sovran.kotlin.e.j
            if (r0 == 0) goto L16
            r0 = r13
            r0 = r13
            sovran.kotlin.e$j r0 = (sovran.kotlin.e.j) r0
            int r1 = r0.f376131b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            r10 = 5
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f376131b = r1
            goto L1b
        L16:
            sovran.kotlin.e$j r0 = new sovran.kotlin.e$j
            r0.<init>(r13)
        L1b:
            r10 = 2
            java.lang.Object r13 = r0.f376130a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r10 = 3
            int r2 = r0.f376131b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L31
            kotlin.ResultKt.m(r13)
            goto La2
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "cfaiobrnres/tmbceeoire lnt/ueho/e//o/iu twolv   / k"
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3b:
            r10 = 3
            java.lang.Object r11 = r0.f376134e
            r12 = r11
            r12 = r11
            sovran.kotlin.c r12 = (sovran.kotlin.c) r12
            java.lang.Object r11 = r0.f376133d
            sovran.kotlin.e r11 = (sovran.kotlin.e) r11
            kotlin.ResultKt.m(r13)
            goto L67
        L4a:
            kotlin.ResultKt.m(r13)
            java.lang.Class r13 = r12.getClass()
            kotlin.reflect.d r13 = kotlin.jvm.internal.j1.d(r13)
            r10 = 5
            r0.f376133d = r11
            r10 = 0
            r0.f376134e = r12
            r10 = 0
            r0.f376131b = r4
            r10 = 7
            java.lang.Object r13 = r11.q(r13, r0)
            if (r13 != r1) goto L67
            r10 = 5
            goto La1
        L67:
            java.util.List r13 = (java.util.List) r13
            java.util.Collection r13 = (java.util.Collection) r13
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto L75
            r10 = 0
            kotlin.Unit r11 = kotlin.Unit.f312394a
            return r11
        L75:
            sovran.kotlin.e$a r13 = new sovran.kotlin.e$a
            r13.<init>(r12)
            r10 = 3
            kotlinx.coroutines.s0 r4 = r11.i()
            kotlin.coroutines.CoroutineContext r5 = r11.m()
            sovran.kotlin.e$k r7 = new sovran.kotlin.e$k
            r12 = 0
            r7.<init>(r13, r12)
            r10 = 6
            r8 = 2
            r9 = 0
            int r10 = r10 << r9
            r6 = 0
            kotlinx.coroutines.p2 r11 = kotlinx.coroutines.i.e(r4, r5, r6, r7, r8, r9)
            r10 = 2
            r0.f376133d = r12
            r0.f376134e = r12
            r0.f376131b = r3
            r10 = 6
            java.lang.Object r11 = r11.d1(r0)
            r10 = 7
            if (r11 != r1) goto La2
        La1:
            return r1
        La2:
            kotlin.Unit r11 = kotlin.Unit.f312394a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: sovran.kotlin.e.o(sovran.kotlin.c, kotlin.coroutines.d):java.lang.Object");
    }

    public final void p() {
        this.f376083d.close();
        this.f376085f.close();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cb, code lost:
    
        if (r1.n(r5, r2, r3) == r4) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <StateT extends sovran.kotlin.c> java.lang.Object r(@org.jetbrains.annotations.NotNull sovran.kotlin.g r18, @org.jetbrains.annotations.NotNull kotlin.reflect.d<StateT> r19, boolean r20, @org.jetbrains.annotations.NotNull kotlinx.coroutines.n0 r21, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super StateT, ? super kotlin.coroutines.d<? super kotlin.Unit>, ? extends java.lang.Object> r22, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super java.lang.Integer> r23) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sovran.kotlin.e.r(sovran.kotlin.g, kotlin.reflect.d, boolean, kotlinx.coroutines.n0, kotlin.jvm.functions.Function2, kotlin.coroutines.d):java.lang.Object");
    }

    @Nullable
    public final Object u(int subscriptionID, @NotNull kotlin.coroutines.d<? super Unit> continuation) {
        Object objD1 = kotlinx.coroutines.k.f(i(), l(), null, new p(subscriptionID, null), 2, null).d1(continuation);
        return objD1 == kotlin.coroutines.intrinsics.b.l() ? objD1 : Unit.f312394a;
    }
}
