package com.segment.analytics.kotlin.core;

import com.devtodev.core.data.metrics.MetricConsts;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.b1;
import kotlin.coroutines.CoroutineContext;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.q0;
import kotlinx.coroutines.b2;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.q3;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.z1;
import kotlinx.serialization.d0;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nAnalytics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Analytics.kt\ncom/segment/analytics/kotlin/core/Analytics\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,777:1\n651#1,2:779\n1#2:778\n*S KotlinDebug\n*F\n+ 1 Analytics.kt\ncom/segment/analytics/kotlin/core/Analytics\n*L\n664#1:779,2\n*E\n"})
public class a implements sovran.kotlin.g, com.segment.analytics.kotlin.core.j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f266712g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.segment.analytics.kotlin.core.f f266714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ com.segment.analytics.kotlin.core.j f266715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final f0 f266716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final f0 f266717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private y f266718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f266719f;

    @NotNull
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static vf.d f266713h = new vf.a();

    /* JADX INFO: renamed from: com.segment.analytics.kotlin.core.a$a, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nAnalytics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Analytics.kt\ncom/segment/analytics/kotlin/core/Analytics$2\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,777:1\n48#2,4:778\n*S KotlinDebug\n*F\n+ 1 Analytics.kt\ncom/segment/analytics/kotlin/core/Analytics$2\n*L\n90#1:778,4\n*E\n"})
    public static final class C1857a implements com.segment.analytics.kotlin.core.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final sovran.kotlin.e f266720a = new sovran.kotlin.e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final o0 f266721b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final s0 f266722c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final z1 f266723d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final z1 f266724e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private final z1 f266725f;

        /* JADX INFO: renamed from: com.segment.analytics.kotlin.core.a$a$a, reason: collision with other inner class name */
        static final class C1858a extends l0 implements Function1<Map<String, String>, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Throwable f266726a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1858a(Throwable th2) {
                super(1);
                this.f266726a = th2;
            }

            public final void c(@NotNull Map<String, String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.put("error", this.f266726a.toString());
                it.put("message", "Exception in Analytics Scope");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Map<String, String> map) {
                c(map);
                return Unit.f312394a;
            }
        }

        /* JADX INFO: renamed from: com.segment.analytics.kotlin.core.a$a$b */
        @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 Analytics.kt\ncom/segment/analytics/kotlin/core/Analytics$2\n*L\n1#1,110:1\n91#2,6:111\n*E\n"})
        public static final class b extends kotlin.coroutines.a implements o0 {
            public b(o0.b bVar) {
                super(bVar);
            }

            @Override // kotlinx.coroutines.o0
            public void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
                com.segment.analytics.kotlin.core.k.a(null, th2, "Caught Exception in Analytics Scope", w.f267065d, kotlin.p.i(th2), new C1858a(th2));
            }
        }

        C1857a() {
            b bVar = new b(o0.L2);
            this.f266721b = bVar;
            this.f266722c = t0.a(q3.c(null, 1, null).plus(bVar));
            ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
            Intrinsics.checkNotNullExpressionValue(executorServiceNewCachedThreadPool, "newCachedThreadPool()");
            this.f266723d = b2.d(executorServiceNewCachedThreadPool);
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor()");
            this.f266724e = b2.d(executorServiceNewSingleThreadExecutor);
            ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2);
            Intrinsics.checkNotNullExpressionValue(executorServiceNewFixedThreadPool, "newFixedThreadPool(2)");
            this.f266725f = b2.d(executorServiceNewFixedThreadPool);
        }

        @Override // com.segment.analytics.kotlin.core.j
        @NotNull
        public sovran.kotlin.e a() {
            return this.f266720a;
        }

        @Override // com.segment.analytics.kotlin.core.j
        @NotNull
        public s0 c() {
            return this.f266722c;
        }

        @Override // com.segment.analytics.kotlin.core.j
        @NotNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public z1 d() {
            return this.f266723d;
        }

        @NotNull
        public final o0 g() {
            return this.f266721b;
        }

        @Override // com.segment.analytics.kotlin.core.j
        @NotNull
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public z1 e() {
            return this.f266725f;
        }

        @Override // com.segment.analytics.kotlin.core.j
        @NotNull
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public z1 b() {
            return this.f266724e;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return a.f266712g;
        }

        @NotNull
        public final vf.d b() {
            return a.f266713h;
        }

        public final void c(boolean z10) {
            a.f266712g = z10;
        }

        public final void d(@NotNull vf.d logger) {
            Intrinsics.checkNotNullParameter(logger, "logger");
            a.Companion.e(logger);
        }

        public final void e(@NotNull vf.d dVar) {
            Intrinsics.checkNotNullParameter(dVar, "<set-?>");
            a.f266713h = dVar;
        }

        @NotNull
        public final String f() {
            return "1.19.2";
        }

        private b() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.core.Analytics$alias$1", f = "Analytics.kt", i = {0}, l = {com.facebook.internal.p.f100033q}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f266727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f266728b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f266730d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<BaseEvent, BaseEvent> f266731e;

        /* JADX INFO: renamed from: com.segment.analytics.kotlin.core.a$c$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.core.Analytics$alias$1$1", f = "Analytics.kt", i = {}, l = {500}, m = "invokeSuspend", n = {}, s = {})
        static final class C1859a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f266732a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f266733b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f266734c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1859a(a aVar, String str, kotlin.coroutines.d<? super C1859a> dVar) {
                super(2, dVar);
                this.f266733b = aVar;
                this.f266734c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new C1859a(this.f266733b, this.f266734c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f266732a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    sovran.kotlin.e eVarA = this.f266733b.a();
                    y.e eVar = new y.e(this.f266734c);
                    kotlin.reflect.d dVarD = j1.d(y.class);
                    this.f266732a = 1;
                    if (eVarA.g(eVar, dVarD, this) == objL) {
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
            @Nullable
            public final Object invoke(@NotNull s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1859a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(String str, Function1<? super BaseEvent, ? extends BaseEvent> function1, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f266730d = str;
            this.f266731e = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            c cVar = a.this.new c(this.f266730d, this.f266731e, dVar);
            cVar.f266728b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            s0 s0Var;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f266727a;
            if (i10 == 0) {
                ResultKt.m(obj);
                s0 s0Var2 = (s0) this.f266728b;
                sovran.kotlin.e eVarA = a.this.a();
                kotlin.reflect.d dVarD = j1.d(y.class);
                this.f266728b = s0Var2;
                this.f266727a = 1;
                Object objF = eVarA.f(dVarD, this);
                if (objF == objL) {
                    return objL;
                }
                s0Var = s0Var2;
                obj = objF;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s0Var = (s0) this.f266728b;
                ResultKt.m(obj);
            }
            y yVar = (y) obj;
            if (yVar != null) {
                String str = this.f266730d;
                String strH = yVar.h();
                if (strH == null) {
                    strH = yVar.f();
                }
                AliasEvent aliasEvent = new AliasEvent(str, strH);
                kotlinx.coroutines.k.f(s0Var, null, null, new C1859a(a.this, this.f266730d, null), 3, null);
                a.this.Y(aliasEvent, this.f266731e);
            } else {
                vf.e.c(a.this, "failed to fetch current UserInfo state", null, 2, null);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class d extends l0 implements Function1<Map<String, String>, Unit> {
        d() {
            super(1);
        }

        public final void c(@NotNull Map<String, String> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.put("message", "configured");
            it.put("apihost", a.this.u().s());
            it.put("cdnhost", a.this.u().v());
            it.put("flush", "at:" + a.this.u().z() + " int:" + a.this.u().A() + " pol:" + a.this.u().B().size());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("seg:");
            sb2.append(a.this.u().u());
            it.put("config", sb2.toString());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Map<String, String> map) {
            c(map);
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.core.Analytics$build$2", f = "Analytics.kt", i = {0}, l = {127, 128, 131, 132, 139}, m = "invokeSuspend", n = {MetricConsts.Install}, s = {"L$2"})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f266736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f266737b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f266738c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f266739d;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return a.this.new e(dVar);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x00be  */
        /* JADX WARN: Code duplicated, block: B:28:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:32:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:34:0x00e5  */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00fc, code lost:
        
            if (com.segment.analytics.kotlin.core.r.a(r13, r12) == r0) goto L37;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 260
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.segment.analytics.kotlin.core.a.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.core.Analytics$enabled$1", f = "Analytics.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160729t0}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f266741a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f266743c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(boolean z10, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f266743c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return a.this.new f(this.f266743c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f266741a;
            if (i10 == 0) {
                ResultKt.m(obj);
                sovran.kotlin.e eVarA = a.this.a();
                v.d dVar = new v.d(this.f266743c);
                kotlin.reflect.d dVarD = j1.d(v.class);
                this.f266741a = 1;
                if (eVarA.g(dVar, dVarD, this) == objL) {
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
        @Nullable
        public final Object invoke(@NotNull s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class g extends l0 implements Function1<com.segment.analytics.kotlin.core.platform.e, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f266744a = new g();

        g() {
            super(1);
        }

        public final void c(@NotNull com.segment.analytics.kotlin.core.platform.e it) {
            Intrinsics.checkNotNullParameter(it, "it");
            com.segment.analytics.kotlin.core.platform.c cVar = it instanceof com.segment.analytics.kotlin.core.platform.c ? (com.segment.analytics.kotlin.core.platform.c) it : null;
            if (cVar != null) {
                cVar.flush();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(com.segment.analytics.kotlin.core.platform.e eVar) {
            c(eVar);
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.core.Analytics$identify$1", f = "Analytics.kt", i = {}, l = {219}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f266745a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f266747c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ JsonObject f266748d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, JsonObject jsonObject, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f266747c = str;
            this.f266748d = jsonObject;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return a.this.new h(this.f266747c, this.f266748d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f266745a;
            if (i10 == 0) {
                ResultKt.m(obj);
                sovran.kotlin.e eVarA = a.this.a();
                y.f fVar = new y.f(this.f266747c, this.f266748d);
                kotlin.reflect.d dVarD = j1.d(y.class);
                this.f266745a = 1;
                if (eVarA.g(fVar, dVarD, this) == objL) {
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
        @Nullable
        public final Object invoke(@NotNull s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.core.Analytics$identify$2", f = "Analytics.kt", i = {}, l = {293}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f266749a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ JsonObject f266751c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(JsonObject jsonObject, kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
            this.f266751c = jsonObject;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return a.this.new i(this.f266751c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f266749a;
            if (i10 == 0) {
                ResultKt.m(obj);
                sovran.kotlin.e eVarA = a.this.a();
                y.d dVar = new y.d(this.f266751c);
                kotlin.reflect.d dVarD = j1.d(y.class);
                this.f266749a = 1;
                if (eVarA.g(dVar, dVarD, this) == objL) {
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
        @Nullable
        public final Object invoke(@NotNull s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((i) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.core.Analytics$process$1", f = "Analytics.kt", i = {}, l = {516}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f266752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BaseEvent f266753b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f266754c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(BaseEvent baseEvent, a aVar, kotlin.coroutines.d<? super j> dVar) {
            super(2, dVar);
            this.f266753b = baseEvent;
            this.f266754c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new j(this.f266753b, this.f266754c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f266752a;
            if (i10 == 0) {
                ResultKt.m(obj);
                BaseEvent baseEvent = this.f266753b;
                sovran.kotlin.e eVarA = this.f266754c.a();
                this.f266752a = 1;
                if (baseEvent.b(eVarA, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            vf.e.c(this.f266754c, "processing event on " + Thread.currentThread().getName(), null, 2, null);
            this.f266754c.x().j(this.f266753b);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((j) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.core.Analytics$purgeStorage$1", f = "Analytics.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f266755a;

        k(kotlin.coroutines.d<? super k> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return a.this.new k(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f266755a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            Iterator<String> it = a.this.X().iterator();
            while (it.hasNext()) {
                try {
                    a.this.w().h(it.next());
                } catch (Exception unused) {
                }
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((k) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.core.Analytics$purgeStorage$2", f = "Analytics.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class l extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f266757a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f266759c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, kotlin.coroutines.d<? super l> dVar) {
            super(2, dVar);
            this.f266759c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return a.this.new l(this.f266759c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f266757a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            try {
                a.this.w().h(this.f266759c);
            } catch (Exception unused) {
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((l) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.core.Analytics$reset$1", f = "Analytics.kt", i = {}, l = {586}, m = "invokeSuspend", n = {}, s = {})
    static final class m extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f266760a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f266762c;

        /* JADX INFO: renamed from: com.segment.analytics.kotlin.core.a$m$a, reason: collision with other inner class name */
        static final class C1860a extends l0 implements Function1<com.segment.analytics.kotlin.core.platform.e, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1860a f266763a = new C1860a();

            C1860a() {
                super(1);
            }

            public final void c(@NotNull com.segment.analytics.kotlin.core.platform.e it) {
                Intrinsics.checkNotNullParameter(it, "it");
                com.segment.analytics.kotlin.core.platform.c cVar = it instanceof com.segment.analytics.kotlin.core.platform.c ? (com.segment.analytics.kotlin.core.platform.c) it : null;
                if (cVar != null) {
                    cVar.reset();
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(com.segment.analytics.kotlin.core.platform.e eVar) {
                c(eVar);
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, kotlin.coroutines.d<? super m> dVar) {
            super(2, dVar);
            this.f266762c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return a.this.new m(this.f266762c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f266760a;
            if (i10 == 0) {
                ResultKt.m(obj);
                sovran.kotlin.e eVarA = a.this.a();
                y.b bVar = new y.b(this.f266762c);
                kotlin.reflect.d dVarD = j1.d(y.class);
                this.f266760a = 1;
                if (eVarA.g(bVar, dVarD, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            a.this.x().b(C1860a.f266763a);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((m) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.core.Analytics$settings$1", f = "Analytics.kt", i = {}, l = {674}, m = "invokeSuspend", n = {}, s = {})
    static final class n extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Settings>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f266764a;

        n(kotlin.coroutines.d<? super n> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return a.this.new n(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f266764a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            a aVar = a.this;
            this.f266764a = 1;
            Object objQ0 = aVar.q0(this);
            return objQ0 == objL ? objL : objQ0;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull s0 s0Var, @Nullable kotlin.coroutines.d<? super Settings> dVar) {
            return ((n) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.core.Analytics", f = "Analytics.kt", i = {}, l = {681}, m = "settingsAsync", n = {}, s = {})
    static final class o extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f266766a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f266768c;

        o(kotlin.coroutines.d<? super o> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f266766a = obj;
            this.f266768c |= Integer.MIN_VALUE;
            return a.this.q0(this);
        }
    }

    static final class p extends l0 implements Function0<s> {
        p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final s invoke() {
            u uVarD = a.this.u().D();
            a aVar = a.this;
            Object objT = aVar.u().t();
            Intrinsics.checkNotNull(objT);
            return uVarD.b(aVar, objT);
        }
    }

    @SourceDebugExtension({"SMAP\nAnalytics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Analytics.kt\ncom/segment/analytics/kotlin/core/Analytics$timeline$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,777:1\n1#2:778\n*E\n"})
    static final class q extends l0 implements Function0<com.segment.analytics.kotlin.core.platform.g> {
        q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final com.segment.analytics.kotlin.core.platform.g invoke() {
            com.segment.analytics.kotlin.core.platform.g gVar = new com.segment.analytics.kotlin.core.platform.g();
            gVar.l(a.this);
            return gVar;
        }
    }

    protected a(@NotNull com.segment.analytics.kotlin.core.f configuration, @NotNull com.segment.analytics.kotlin.core.j coroutineConfig) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(coroutineConfig, "coroutineConfig");
        this.f266714a = configuration;
        this.f266715b = coroutineConfig;
        this.f266716c = g0.c(new q());
        this.f266717d = g0.c(new p());
        this.f266718e = y.Companion.a(w());
        this.f266719f = true;
        if (!configuration.I()) {
            throw new IllegalArgumentException("invalid configuration");
        }
        p();
    }

    public static /* synthetic */ Object C0(a aVar, kotlinx.serialization.e deserializationStrategy, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: traits");
        }
        if ((i10 & 1) != 0) {
            kotlinx.serialization.modules.f serializersModule = Json.Default.getSerializersModule();
            Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
            q0.n("kotlinx.serialization.serializer.withModule");
            deserializationStrategy = m0.o(serializersModule, null);
        }
        Intrinsics.checkNotNullParameter(deserializationStrategy, "deserializationStrategy");
        JsonObject jsonObjectB0 = aVar.B0();
        if (jsonObjectB0 != null) {
            return Json.Default.decodeFromJsonElement(deserializationStrategy, jsonObjectB0);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void E(a aVar, String groupId, Object obj, Function1 function1, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: group");
        }
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        kotlinx.serialization.modules.f serializersModule = com.segment.analytics.kotlin.core.utilities.b.a().getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        aVar.B(groupId, obj, m0.o(serializersModule, null), function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void F(a aVar, String str, Object obj, d0 d0Var, Function1 function1, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: group");
        }
        if ((i10 & 8) != 0) {
            function1 = null;
        }
        aVar.B(str, obj, d0Var, function1);
    }

    public static /* synthetic */ Object F0(a aVar, kotlinx.serialization.e deserializationStrategy, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: traitsAsync");
        }
        if ((i10 & 1) != 0) {
            kotlinx.serialization.modules.f serializersModule = Json.Default.getSerializersModule();
            Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
            q0.n("kotlinx.serialization.serializer.withModule");
            deserializationStrategy = m0.o(serializersModule, null);
        }
        Intrinsics.checkNotNullParameter(deserializationStrategy, "deserializationStrategy");
        JsonObject jsonObjectB0 = aVar.B0();
        if (jsonObjectB0 != null) {
            return Json.Default.decodeFromJsonElement(deserializationStrategy, jsonObjectB0);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void G(a aVar, String str, JsonObject jsonObject, Function1 function1, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: group");
        }
        if ((i10 & 2) != 0) {
            jsonObject = com.segment.analytics.kotlin.core.l.b();
        }
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        aVar.D(str, jsonObject, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void R(a aVar, Object obj, Function1 function1, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: identify");
        }
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        kotlinx.serialization.modules.f serializersModule = com.segment.analytics.kotlin.core.utilities.b.a().getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        aVar.J(obj, m0.o(serializersModule, null), function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void S(a aVar, Object obj, d0 d0Var, Function1 function1, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: identify");
        }
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        aVar.J(obj, d0Var, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void T(a aVar, String userId, Object obj, Function1 function1, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: identify");
        }
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(userId, "userId");
        kotlinx.serialization.modules.f serializersModule = com.segment.analytics.kotlin.core.utilities.b.a().getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        aVar.M(userId, obj, m0.o(serializersModule, null), function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void U(a aVar, String str, Object obj, d0 d0Var, Function1 function1, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: identify");
        }
        if ((i10 & 8) != 0) {
            function1 = null;
        }
        aVar.M(str, obj, d0Var, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void V(a aVar, String str, JsonObject jsonObject, Function1 function1, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: identify");
        }
        if ((i10 & 2) != 0) {
            jsonObject = com.segment.analytics.kotlin.core.l.b();
        }
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        aVar.O(str, jsonObject, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void W(a aVar, JsonObject jsonObject, Function1 function1, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: identify");
        }
        if ((i10 & 1) != 0) {
            jsonObject = com.segment.analytics.kotlin.core.l.b();
        }
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        aVar.Q(jsonObject, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void Z(a aVar, BaseEvent baseEvent, Function1 function1, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: process");
        }
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        aVar.Y(baseEvent, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void k0(a aVar, String title, Object obj, String str, Function1 function1, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: screen");
        }
        if ((i10 & 4) != 0) {
            str = "";
        }
        String category = str;
        Function1 function2 = (i10 & 8) != 0 ? null : function1;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(category, "category");
        kotlinx.serialization.modules.f serializersModule = com.segment.analytics.kotlin.core.utilities.b.a().getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        aVar.g0(title, obj, m0.o(serializersModule, null), category, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void l(a aVar, String str, Function1 function1, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: alias");
        }
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        aVar.k(str, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void l0(a aVar, String str, Object obj, d0 d0Var, String str2, Function1 function1, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: screen");
        }
        if ((i10 & 8) != 0) {
            str2 = "";
        }
        String str3 = str2;
        if ((i10 & 16) != 0) {
            function1 = null;
        }
        aVar.g0(str, obj, d0Var, str3, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m0(a aVar, String str, JsonObject jsonObject, String str2, Function1 function1, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: screen");
        }
        if ((i10 & 2) != 0) {
            jsonObject = com.segment.analytics.kotlin.core.l.b();
        }
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        if ((i10 & 8) != 0) {
            function1 = null;
        }
        aVar.j0(str, jsonObject, str2, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void x0(a aVar, String name, Object obj, Function1 function1, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: track");
        }
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(name, "name");
        kotlinx.serialization.modules.f serializersModule = com.segment.analytics.kotlin.core.utilities.b.a().getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        aVar.u0(name, obj, m0.o(serializersModule, null), function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void y0(a aVar, String str, Object obj, d0 d0Var, Function1 function1, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: track");
        }
        if ((i10 & 8) != 0) {
            function1 = null;
        }
        aVar.u0(str, obj, d0Var, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void z0(a aVar, String str, JsonObject jsonObject, Function1 function1, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: track");
        }
        if ((i10 & 2) != 0) {
            jsonObject = com.segment.analytics.kotlin.core.l.b();
        }
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        aVar.w0(str, jsonObject, function1);
    }

    public final /* synthetic */ <T> void A(String groupId, T t10, Function1<? super BaseEvent, ? extends BaseEvent> function1) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        kotlinx.serialization.modules.f serializersModule = com.segment.analytics.kotlin.core.utilities.b.a().getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        B(groupId, t10, m0.o(serializersModule, null), function1);
    }

    public final /* synthetic */ <T> T A0(kotlinx.serialization.e<? extends T> deserializationStrategy) {
        Intrinsics.checkNotNullParameter(deserializationStrategy, "deserializationStrategy");
        JsonObject jsonObjectB0 = B0();
        if (jsonObjectB0 != null) {
            return (T) Json.Default.decodeFromJsonElement(deserializationStrategy, jsonObjectB0);
        }
        return null;
    }

    public final <T> void B(@NotNull String groupId, T t10, @NotNull d0<? super T> serializationStrategy, @Nullable Function1<? super BaseEvent, ? extends BaseEvent> function1) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(serializationStrategy, "serializationStrategy");
        D(groupId, JsonElementKt.getJsonObject(Json.Default.encodeToJsonElement(serializationStrategy, t10)), function1);
    }

    @Nullable
    public final JsonObject B0() {
        return this.f266718e.g();
    }

    @oj.j
    public final void C(@NotNull String groupId, @NotNull JsonObject traits) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(traits, "traits");
        G(this, groupId, traits, null, 4, null);
    }

    @oj.j
    public final void D(@NotNull String groupId, @NotNull JsonObject traits, @Nullable Function1<? super BaseEvent, ? extends BaseEvent> function1) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(traits, "traits");
        Y(new GroupEvent(groupId, traits), function1);
    }

    @kotlin.l(message = "This function no longer serves a purpose and internally calls `traits(deserializationStrategy: DeserializationStrategy<T>)`.", replaceWith = @b1(expression = "traits(deserializationStrategy: DeserializationStrategy<T>)", imports = {}))
    public final /* synthetic */ <T> T D0(kotlinx.serialization.e<? extends T> deserializationStrategy) {
        Intrinsics.checkNotNullParameter(deserializationStrategy, "deserializationStrategy");
        JsonObject jsonObjectB0 = B0();
        if (jsonObjectB0 != null) {
            return (T) Json.Default.decodeFromJsonElement(deserializationStrategy, jsonObjectB0);
        }
        return null;
    }

    @kotlin.l(message = "This function no longer serves a purpose and internally calls `traits()`.", replaceWith = @b1(expression = "traits()", imports = {}))
    @Nullable
    public final JsonObject E0() {
        return B0();
    }

    @Nullable
    public final String G0() {
        return this.f266718e.h();
    }

    @oj.j
    public final void H() {
        W(this, null, null, 3, null);
    }

    @kotlin.l(message = "This function no longer serves a purpose and internally calls `userId()`.", replaceWith = @b1(expression = "userId()", imports = {}))
    @Nullable
    public final String H0() {
        return G0();
    }

    public final /* synthetic */ <T> void I(T t10, Function1<? super BaseEvent, ? extends BaseEvent> function1) {
        kotlinx.serialization.modules.f serializersModule = com.segment.analytics.kotlin.core.utilities.b.a().getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        J(t10, m0.o(serializersModule, null), function1);
    }

    @NotNull
    public final String I0() {
        return Companion.f();
    }

    public final <T> void J(T t10, @NotNull d0<? super T> serializationStrategy, @Nullable Function1<? super BaseEvent, ? extends BaseEvent> function1) {
        Intrinsics.checkNotNullParameter(serializationStrategy, "serializationStrategy");
        Q(JsonElementKt.getJsonObject(Json.Default.encodeToJsonElement(serializationStrategy, t10)), function1);
    }

    @oj.j
    public final void K(@NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        V(this, userId, null, null, 6, null);
    }

    public final /* synthetic */ <T> void L(String userId, T t10, Function1<? super BaseEvent, ? extends BaseEvent> function1) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        kotlinx.serialization.modules.f serializersModule = com.segment.analytics.kotlin.core.utilities.b.a().getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        M(userId, t10, m0.o(serializersModule, null), function1);
    }

    public final <T> void M(@NotNull String userId, T t10, @NotNull d0<? super T> serializationStrategy, @Nullable Function1<? super BaseEvent, ? extends BaseEvent> function1) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(serializationStrategy, "serializationStrategy");
        O(userId, JsonElementKt.getJsonObject(Json.Default.encodeToJsonElement(serializationStrategy, t10)), function1);
    }

    @oj.j
    public final void N(@NotNull String userId, @NotNull JsonObject traits) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(traits, "traits");
        V(this, userId, traits, null, 4, null);
    }

    @oj.j
    public final void O(@NotNull String userId, @NotNull JsonObject traits, @Nullable Function1<? super BaseEvent, ? extends BaseEvent> function1) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(traits, "traits");
        int i10 = 6 | 0;
        kotlinx.coroutines.k.f(c(), d(), null, new h(userId, traits, null), 2, null);
        Y(new IdentifyEvent(userId, traits), function1);
    }

    @oj.j
    public final void P(@NotNull JsonObject traits) {
        Intrinsics.checkNotNullParameter(traits, "traits");
        W(this, traits, null, 2, null);
    }

    @oj.j
    public final void Q(@NotNull JsonObject traits, @Nullable Function1<? super BaseEvent, ? extends BaseEvent> function1) {
        Intrinsics.checkNotNullParameter(traits, "traits");
        kotlinx.coroutines.k.f(c(), d(), null, new i(traits, null), 2, null);
        Y(new IdentifyEvent("", traits), function1);
    }

    @NotNull
    public final List<String> X() {
        return t.a(w().d(s.b.Events));
    }

    public final void Y(@NotNull BaseEvent event, @Nullable Function1<? super BaseEvent, ? extends BaseEvent> function1) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f266719f) {
            event.a(function1);
            vf.e.c(this, "applying base attributes on " + Thread.currentThread().getName(), null, 2, null);
            kotlinx.coroutines.k.f(c(), d(), null, new j(event, this, null), 2, null);
        }
    }

    @Override // com.segment.analytics.kotlin.core.j
    @NotNull
    public sovran.kotlin.e a() {
        return this.f266715b.a();
    }

    public final void a0() {
        kotlinx.coroutines.k.f(c(), e(), null, new k(null), 2, null);
    }

    @Override // com.segment.analytics.kotlin.core.j
    @NotNull
    public n0 b() {
        return this.f266715b.b();
    }

    public final void b0(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        kotlinx.coroutines.k.f(c(), e(), null, new l(filePath, null), 2, null);
    }

    @Override // com.segment.analytics.kotlin.core.j
    @NotNull
    public s0 c() {
        return this.f266715b.c();
    }

    @NotNull
    public final a c0(@NotNull com.segment.analytics.kotlin.core.platform.e plugin) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        x().k(plugin);
        return this;
    }

    @Override // com.segment.analytics.kotlin.core.j
    @NotNull
    public n0 d() {
        return this.f266715b.d();
    }

    public final void d0() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        this.f266718e = new y(string, null, null);
        kotlinx.coroutines.k.f(c(), d(), null, new m(string, null), 2, null);
    }

    @Override // com.segment.analytics.kotlin.core.j
    @NotNull
    public n0 e() {
        return this.f266715b.e();
    }

    @oj.j
    public final void e0(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        m0(this, title, null, null, null, 14, null);
    }

    public final /* synthetic */ <T> void f0(String title, T t10, String category, Function1<? super BaseEvent, ? extends BaseEvent> function1) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(category, "category");
        kotlinx.serialization.modules.f serializersModule = com.segment.analytics.kotlin.core.utilities.b.a().getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        int i10 = 1 >> 0;
        g0(title, t10, m0.o(serializersModule, null), category, function1);
    }

    public final <T> void g0(@NotNull String title, T t10, @NotNull d0<? super T> serializationStrategy, @NotNull String category, @Nullable Function1<? super BaseEvent, ? extends BaseEvent> function1) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(serializationStrategy, "serializationStrategy");
        Intrinsics.checkNotNullParameter(category, "category");
        j0(title, JsonElementKt.getJsonObject(Json.Default.encodeToJsonElement(serializationStrategy, t10)), category, function1);
    }

    @oj.j
    public final void h0(@NotNull String title, @NotNull JsonObject properties) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(properties, "properties");
        m0(this, title, properties, null, null, 12, null);
    }

    @oj.j
    public final void i0(@NotNull String title, @NotNull JsonObject properties, @NotNull String category) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(category, "category");
        m0(this, title, properties, category, null, 8, null);
    }

    @NotNull
    public final a j(@NotNull com.segment.analytics.kotlin.core.platform.e plugin) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        x().a(plugin);
        return this;
    }

    @oj.j
    public final void j0(@NotNull String title, @NotNull JsonObject properties, @NotNull String category, @Nullable Function1<? super BaseEvent, ? extends BaseEvent> function1) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(category, "category");
        Y(new ScreenEvent(title, category, properties), function1);
    }

    public final void k(@NotNull String newId, @Nullable Function1<? super BaseEvent, ? extends BaseEvent> function1) {
        Intrinsics.checkNotNullParameter(newId, "newId");
        int i10 = 2 ^ 0;
        kotlinx.coroutines.k.f(c(), d(), null, new c(newId, function1, null), 2, null);
    }

    @NotNull
    public final String m() {
        return this.f266718e.f();
    }

    @kotlin.l(message = "This function no longer serves a purpose and internally calls `anonymousId()`.", replaceWith = @b1(expression = "anonymousId()", imports = {}))
    @NotNull
    public final String n() {
        return m();
    }

    public final void n0(boolean z10) {
        this.f266719f = z10;
        kotlinx.coroutines.k.f(c(), d(), null, new f(z10, null), 2, null);
    }

    public final void o(@NotNull Function1<? super com.segment.analytics.kotlin.core.platform.e, Unit> closure) {
        Intrinsics.checkNotNullParameter(closure, "closure");
        x().b(closure);
    }

    public final void o0(@NotNull y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<set-?>");
        this.f266718e = yVar;
    }

    public final void p() {
        j(new com.segment.analytics.kotlin.core.platform.plugins.f());
        j(new com.segment.analytics.kotlin.core.platform.plugins.a());
        j(new com.segment.analytics.kotlin.core.platform.plugins.g());
        w.f267062a.t(w.f267064c, new d());
        kotlinx.coroutines.k.f(c(), d(), null, new e(null), 2, null);
    }

    @com.segment.analytics.kotlin.core.e
    @Nullable
    public final Settings p0() {
        return (Settings) kotlinx.coroutines.j.b(null, new n(null), 1, null);
    }

    @Nullable
    public final com.segment.analytics.kotlin.core.platform.a q(@NotNull String destinationKey) {
        Intrinsics.checkNotNullParameter(destinationKey, "destinationKey");
        return x().e(destinationKey);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object q0(@NotNull kotlin.coroutines.d<? super Settings> dVar) {
        o oVar;
        if (dVar instanceof o) {
            oVar = (o) dVar;
            int i10 = oVar.f266768c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                oVar.f266768c = i10 - Integer.MIN_VALUE;
            } else {
                oVar = new o(dVar);
            }
        } else {
            oVar = new o(dVar);
        }
        Object objF = oVar.f266766a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = oVar.f266768c;
        if (i11 == 0) {
            ResultKt.m(objF);
            sovran.kotlin.e eVarA = a();
            kotlin.reflect.d dVarD = j1.d(v.class);
            oVar.f266768c = 1;
            objF = eVarA.f(dVarD, oVar);
            if (objF == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objF);
        }
        v vVar = (v) objF;
        if (vVar != null) {
            return vVar.l();
        }
        return null;
    }

    @Nullable
    public final <T extends com.segment.analytics.kotlin.core.platform.e> T r(@NotNull kotlin.reflect.d<T> plugin) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        return (T) x().f(plugin);
    }

    public final void r0() {
        n0 n0VarD = d();
        Intrinsics.checkNotNull(n0VarD, "null cannot be cast to non-null type kotlinx.coroutines.ExecutorCoroutineDispatcher{ kotlinx.coroutines.ExecutorsKt.CloseableCoroutineDispatcher }");
        ((z1) n0VarD).close();
        n0 n0VarB = b();
        Intrinsics.checkNotNull(n0VarB, "null cannot be cast to non-null type kotlinx.coroutines.ExecutorCoroutineDispatcher{ kotlinx.coroutines.ExecutorsKt.CloseableCoroutineDispatcher }");
        ((z1) n0VarB).close();
        n0 n0VarE = e();
        Intrinsics.checkNotNull(n0VarE, "null cannot be cast to non-null type kotlinx.coroutines.ExecutorCoroutineDispatcher{ kotlinx.coroutines.ExecutorsKt.CloseableCoroutineDispatcher }");
        ((z1) n0VarE).close();
        a().p();
    }

    @NotNull
    public final <T extends com.segment.analytics.kotlin.core.platform.e> List<T> s(@NotNull kotlin.reflect.d<T> plugin) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        return x().g(plugin);
    }

    @oj.j
    public final void s0(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        z0(this, name, null, null, 6, null);
    }

    public final void t() {
        x().b(g.f266744a);
    }

    public final /* synthetic */ <T> void t0(String name, T t10, Function1<? super BaseEvent, ? extends BaseEvent> function1) {
        Intrinsics.checkNotNullParameter(name, "name");
        kotlinx.serialization.modules.f serializersModule = com.segment.analytics.kotlin.core.utilities.b.a().getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        u0(name, t10, m0.o(serializersModule, null), function1);
    }

    @NotNull
    public final com.segment.analytics.kotlin.core.f u() {
        return this.f266714a;
    }

    public final <T> void u0(@NotNull String name, T t10, @NotNull d0<? super T> serializationStrategy, @Nullable Function1<? super BaseEvent, ? extends BaseEvent> function1) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serializationStrategy, "serializationStrategy");
        w0(name, JsonElementKt.getJsonObject(Json.Default.encodeToJsonElement(serializationStrategy, t10)), function1);
    }

    public final boolean v() {
        return this.f266719f;
    }

    @oj.j
    public final void v0(@NotNull String name, @NotNull JsonObject properties) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(properties, "properties");
        int i10 = 2 ^ 0;
        z0(this, name, properties, null, 4, null);
    }

    @NotNull
    public s w() {
        return (s) this.f266717d.getValue();
    }

    @oj.j
    public final void w0(@NotNull String name, @NotNull JsonObject properties, @Nullable Function1<? super BaseEvent, ? extends BaseEvent> function1) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Y(new TrackEvent(properties, name), function1);
    }

    @NotNull
    public final com.segment.analytics.kotlin.core.platform.g x() {
        return (com.segment.analytics.kotlin.core.platform.g) this.f266716c.getValue();
    }

    @NotNull
    public final y y() {
        return this.f266718e;
    }

    @oj.j
    public final void z(@NotNull String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        int i10 = 2 >> 0;
        G(this, groupId, null, null, 6, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull com.segment.analytics.kotlin.core.f configuration) {
        this(configuration, new C1857a());
        Intrinsics.checkNotNullParameter(configuration, "configuration");
    }
}
