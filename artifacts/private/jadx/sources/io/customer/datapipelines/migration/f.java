package io.customer.datapipelines.migration;

import com.segment.analytics.kotlin.core.BaseEvent;
import com.segment.analytics.kotlin.core.IdentifyEvent;
import com.segment.analytics.kotlin.core.ScreenEvent;
import com.segment.analytics.kotlin.core.TrackEvent;
import com.segment.analytics.kotlin.core.v;
import io.customer.sdk.data.store.j;
import io.customer.sdk.l;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.n;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.j1;
import kotlin.k0;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.s0;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObjectBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sovran.kotlin.g;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nTrackingMigrationProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackingMigrationProcessor.kt\nio/customer/datapipelines/migration/TrackingMigrationProcessor\n+ 2 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n+ 3 EventManipulationFunctions.kt\ncom/segment/analytics/kotlin/core/utilities/EventTransformer\n*L\n1#1,261:1\n29#2,2:262\n29#2,3:264\n31#2:267\n29#2,3:268\n29#2,3:271\n29#2,2:274\n29#2,3:276\n31#2:279\n29#2,2:280\n29#2,3:282\n31#2:285\n111#3:286\n111#3:287\n111#3:288\n111#3:289\n111#3:290\n111#3:291\n*S KotlinDebug\n*F\n+ 1 TrackingMigrationProcessor.kt\nio/customer/datapipelines/migration/TrackingMigrationProcessor\n*L\n111#1:262,2\n114#1:264,3\n111#1:267\n169#1:268,3\n180#1:271,3\n191#1:274,2\n195#1:276,3\n191#1:279\n219#1:280,2\n222#1:282,3\n219#1:285\n122#1:286\n127#1:287\n203#1:288\n208#1:289\n230#1:290\n235#1:291\n*E\n"})
public final class f implements io.customer.tracking.migration.b, g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final b f288294f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final String f288295g = "device";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final String f288296h = "token";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final String f288297i = "type";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final String f288298j = "android";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.segment.analytics.kotlin.core.a f288299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f288300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ih.e f288301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final j f288302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Integer f288303e;

    @kotlin.coroutines.jvm.internal.f(c = "io.customer.datapipelines.migration.TrackingMigrationProcessor$1$1", f = "TrackingMigrationProcessor.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f288304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.segment.analytics.kotlin.core.a f288305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f288306c;

        /* JADX INFO: renamed from: io.customer.datapipelines.migration.f$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "io.customer.datapipelines.migration.TrackingMigrationProcessor$1$1$1", f = "TrackingMigrationProcessor.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
        static final class C1950a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f288307a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ f f288308b;

            /* JADX INFO: renamed from: io.customer.datapipelines.migration.f$a$a$a, reason: collision with other inner class name */
            /* synthetic */ class C1951a extends g0 implements Function2<v, kotlin.coroutines.d<? super Unit>, Object>, n {
                C1951a(Object obj) {
                    super(2, obj, f.class, "start", "start(Lcom/segment/analytics/kotlin/core/System;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
                public final Object invoke(v vVar, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((f) this.receiver).p(vVar, dVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1950a(f fVar, kotlin.coroutines.d<? super C1950a> dVar) {
                super(2, dVar);
                this.f288308b = fVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1950a(this.f288308b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f288307a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    sovran.kotlin.e eVarA = this.f288308b.f288299a.a();
                    f fVar = this.f288308b;
                    kotlin.reflect.d dVarD = j1.d(v.class);
                    C1951a c1951a = new C1951a(this.f288308b);
                    this.f288307a = 1;
                    if (sovran.kotlin.e.s(eVarA, fVar, dVarD, true, null, c1951a, this, 8, null) == objL) {
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
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1950a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.segment.analytics.kotlin.core.a aVar, f fVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f288305b = aVar;
            this.f288306c = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f288305b, this.f288306c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f288304a;
            if (i10 == 0) {
                ResultKt.m(obj);
                n0 n0VarD = this.f288305b.d();
                C1950a c1950a = new C1950a(this.f288306c, null);
                this.f288304a = 1;
                if (i.h(n0VarD, c1950a, this) == objL) {
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
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.customer.datapipelines.migration.TrackingMigrationProcessor", f = "TrackingMigrationProcessor.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160732u0}, m = "start", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f288311a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f288313c;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f288311a = obj;
            this.f288313c |= Integer.MIN_VALUE;
            return f.this.p(null, this);
        }
    }

    public f(@NotNull com.segment.analytics.kotlin.core.a analytics, @NotNull String migrationSiteId) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(migrationSiteId, "migrationSiteId");
        this.f288299a = analytics;
        this.f288300b = migrationSiteId;
        eh.d dVar = eh.d.f274883c;
        this.f288301c = dVar.w();
        this.f288302d = dVar.q().w();
        int i10 = 7 >> 0;
        k.f(analytics.c(), null, null, new a(analytics, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseEvent k(String str, BaseEvent baseEvent) {
        if (baseEvent != null) {
            Json.Default.getSerializersModule();
            com.segment.analytics.kotlin.core.utilities.g.n(baseEvent, "device", "token", str, b3.f315897a);
        }
        if (baseEvent == null) {
            return null;
        }
        Json.Default.getSerializersModule();
        return com.segment.analytics.kotlin.core.utilities.g.n(baseEvent, "device", "type", "android", b3.f315897a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseEvent l(qh.a aVar, BaseEvent baseEvent) {
        if (baseEvent != null) {
            String strM = ((qh.a.c) aVar).m();
            Json.Default.getSerializersModule();
            com.segment.analytics.kotlin.core.utilities.g.n(baseEvent, "device", "token", strM, b3.f315897a);
        }
        if (baseEvent == null) {
            return null;
        }
        Json.Default.getSerializersModule();
        return com.segment.analytics.kotlin.core.utilities.g.n(baseEvent, "device", "type", "android", b3.f315897a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseEvent m(qh.a aVar, BaseEvent baseEvent) {
        if (baseEvent != null) {
            String strG = ((qh.a.C2468a) aVar).g();
            Json.Default.getSerializersModule();
            com.segment.analytics.kotlin.core.utilities.g.n(baseEvent, "device", "token", strG, b3.f315897a);
        }
        if (baseEvent == null) {
            return null;
        }
        Json.Default.getSerializersModule();
        return com.segment.analytics.kotlin.core.utilities.g.n(baseEvent, "device", "type", "android", b3.f315897a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(c cVar, qh.a aVar, f fVar, BaseEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Function1<BaseEvent, BaseEvent> function1E = cVar.e();
        if (function1E != null) {
            function1E.invoke(event);
        }
        event.t(aVar.a());
        String strA = io.customer.datapipelines.util.a.f288344a.a(aVar.S1());
        if (strA != null) {
            event.r(strA);
        }
        ih.e.a.a(fVar.f288301c, "forwarding migrated event: " + event, null, 2, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseEvent o(Function1 function1, BaseEvent baseEvent) {
        if (baseEvent == null) {
            return null;
        }
        function1.invoke(baseEvent);
        return baseEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final Object p(v vVar, kotlin.coroutines.d<? super Unit> dVar) {
        d dVar2;
        Object objM785constructorimpl;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f288313c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f288313c = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        d dVar3 = dVar2;
        Object obj = dVar3.f288311a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar3.f288313c;
        if (i11 == 0) {
            ResultKt.m(obj);
            if (!vVar.k()) {
                return Unit.f312394a;
            }
            synchronized (this) {
                try {
                    Result.a aVar = Result.Companion;
                    objM785constructorimpl = Result.m785constructorimpl(io.customer.tracking.migration.a.f288633f.a(this, this.f288300b));
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
                }
                Throwable thD = Result.d(objM785constructorimpl);
                if (thD != null) {
                    ih.e.a.b(this.f288301c, "Migration failed with exception: " + thD, null, null, 6, null);
                }
            }
            Integer num = this.f288303e;
            if (num != null) {
                int iIntValue = num.intValue();
                sovran.kotlin.e eVarA = this.f288299a.a();
                dVar3.f288313c = 1;
                if (eVarA.u(iIntValue, dVar3) == objL) {
                    return objL;
                }
            }
            return Unit.f312394a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        this.f288303e = null;
        return Unit.f312394a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.customer.tracking.migration.b
    @Nullable
    public Object a(@NotNull final qh.a aVar, @NotNull kotlin.coroutines.d<? super Result<Unit>> dVar) {
        c cVar;
        final c cVar2;
        BaseEvent trackEvent;
        try {
            Result.a aVar2 = Result.Companion;
            int i10 = 2;
            Function1 function1 = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            Object[] objArr7 = 0;
            if (aVar instanceof qh.a.b) {
                cVar2 = new c(new IdentifyEvent(((qh.a.b) aVar).a(), io.customer.datapipelines.extensions.c.h(((qh.a.b) aVar).g())), function1, i10, objArr7 == true ? 1 : 0);
            } else if (aVar instanceof qh.a.e) {
                if (Intrinsics.areEqual(((qh.a.e) aVar).k(), com.segment.analytics.kotlin.android.plugins.a.f266538j3)) {
                    trackEvent = new ScreenEvent(((qh.a.e) aVar).i(), "", io.customer.datapipelines.extensions.c.h(((qh.a.e) aVar).j()));
                } else {
                    trackEvent = new TrackEvent(io.customer.datapipelines.extensions.c.h(((qh.a.e) aVar).j()), ((qh.a.e) aVar).i());
                }
                cVar2 = new c(trackEvent, objArr6 == true ? 1 : 0, i10, objArr5 == true ? 1 : 0);
            } else if (aVar instanceof qh.a.f) {
                JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
                JsonElementBuildersKt.put(jsonObjectBuilder, "recipient", ((qh.a.f) aVar).j());
                JsonElementBuildersKt.put(jsonObjectBuilder, "deliveryId", ((qh.a.f) aVar).i());
                JsonElementBuildersKt.put(jsonObjectBuilder, "metric", ((qh.a.f) aVar).k());
                cVar2 = new c(new TrackEvent(jsonObjectBuilder.build(), mh.a.f332665d), objArr4 == true ? 1 : 0, i10, objArr3 == true ? 1 : 0);
            } else if (aVar instanceof qh.a.d) {
                JsonObjectBuilder jsonObjectBuilder2 = new JsonObjectBuilder();
                com.segment.analytics.kotlin.core.utilities.o.s(jsonObjectBuilder2, io.customer.datapipelines.extensions.c.h(((qh.a.d) aVar).m()));
                JsonElementBuildersKt.put(jsonObjectBuilder2, "deliveryId", ((qh.a.d) aVar).j());
                JsonElementBuildersKt.put(jsonObjectBuilder2, "metric", ((qh.a.d) aVar).l());
                cVar2 = new c(new TrackEvent(jsonObjectBuilder2.build(), mh.a.f332665d), objArr2 == true ? 1 : 0, i10, objArr == true ? 1 : 0);
            } else {
                if (aVar instanceof qh.a.c) {
                    JsonObjectBuilder jsonObjectBuilder3 = new JsonObjectBuilder();
                    com.segment.analytics.kotlin.core.utilities.o.s(jsonObjectBuilder3, io.customer.datapipelines.extensions.c.h(((qh.a.c) aVar).j()));
                    JsonObjectBuilder jsonObjectBuilder4 = new JsonObjectBuilder();
                    JsonElementBuildersKt.put(jsonObjectBuilder4, "token", ((qh.a.c) aVar).m());
                    JsonElementBuildersKt.put(jsonObjectBuilder4, "type", "android");
                    Unit unit = Unit.f312394a;
                    jsonObjectBuilder3.put("device", jsonObjectBuilder4.build());
                    cVar = new c(new TrackEvent(jsonObjectBuilder3.build(), mh.a.f332663b), new Function1() { // from class: io.customer.datapipelines.migration.a
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return f.l(aVar, (BaseEvent) obj);
                        }
                    });
                } else {
                    if (!(aVar instanceof qh.a.C2468a)) {
                        throw new k0();
                    }
                    JsonObjectBuilder jsonObjectBuilder5 = new JsonObjectBuilder();
                    JsonObjectBuilder jsonObjectBuilder6 = new JsonObjectBuilder();
                    JsonElementBuildersKt.put(jsonObjectBuilder6, "token", ((qh.a.C2468a) aVar).g());
                    JsonElementBuildersKt.put(jsonObjectBuilder6, "type", "android");
                    Unit unit2 = Unit.f312394a;
                    jsonObjectBuilder5.put("device", jsonObjectBuilder6.build());
                    cVar = new c(new TrackEvent(jsonObjectBuilder5.build(), mh.a.f332664c), new Function1() { // from class: io.customer.datapipelines.migration.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return f.m(aVar, (BaseEvent) obj);
                        }
                    });
                }
                cVar2 = cVar;
            }
            ih.e.a.a(this.f288301c, "processing migrated task: " + cVar2, null, 2, null);
            final Function1 function2 = new Function1() { // from class: io.customer.datapipelines.migration.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return f.n(cVar2, aVar, this, (BaseEvent) obj);
                }
            };
            this.f288299a.Y(cVar2.f(), new Function1() { // from class: io.customer.datapipelines.migration.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return f.o(function2, (BaseEvent) obj);
                }
            });
            return Result.m785constructorimpl(Unit.f312394a);
        } catch (Throwable th2) {
            Result.a aVar3 = Result.Companion;
            return Result.m785constructorimpl(ResultKt.createFailure(th2));
        }
    }

    @Override // io.customer.tracking.migration.b
    @NotNull
    public Object b(@NotNull final String oldDeviceToken) {
        Intrinsics.checkNotNullParameter(oldDeviceToken, "oldDeviceToken");
        try {
            Result.a aVar = Result.Companion;
            String strB = this.f288302d.b();
            if (strB == null) {
                ih.e.a.a(this.f288301c, "Migrating existing device with token: " + oldDeviceToken, null, 2, null);
                io.customer.sdk.g.f288542m.d().s(oldDeviceToken);
            } else if (Intrinsics.areEqual(strB, oldDeviceToken)) {
                ih.e.a.a(this.f288301c, "Device token already migrated: " + oldDeviceToken, null, 2, null);
            } else {
                ih.e.a.a(this.f288301c, "Device token refreshed, deleting old device token from migration: " + oldDeviceToken, null, 2, null);
                JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
                JsonObjectBuilder jsonObjectBuilder2 = new JsonObjectBuilder();
                JsonElementBuildersKt.put(jsonObjectBuilder2, "token", oldDeviceToken);
                JsonElementBuildersKt.put(jsonObjectBuilder2, "type", "android");
                Unit unit = Unit.f312394a;
                jsonObjectBuilder.put("device", jsonObjectBuilder2.build());
                this.f288299a.Y(new TrackEvent(jsonObjectBuilder.build(), mh.a.f332664c), new Function1() { // from class: io.customer.datapipelines.migration.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return f.k(oldDeviceToken, (BaseEvent) obj);
                    }
                });
            }
            return Result.m785constructorimpl(Unit.f312394a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            return Result.m785constructorimpl(ResultKt.createFailure(th2));
        }
    }

    @Override // io.customer.tracking.migration.b
    @NotNull
    public Object c(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        try {
            Result.a aVar = Result.Companion;
            String strG0 = this.f288299a.G0();
            if (strG0 != null) {
                int i10 = 6 << 0;
                ih.e.a.b(this.f288301c, "User already identified with userId: " + strG0 + ", skipping migration profile for: " + identifier, null, null, 6, null);
            } else {
                l.q(io.customer.sdk.g.f288542m.d(), identifier, null, 2, null);
            }
            return Result.m785constructorimpl(Unit.f312394a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            return Result.m785constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final BaseEvent f288309a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final Function1<BaseEvent, BaseEvent> f288310b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@NotNull BaseEvent trackEvent, @Nullable Function1<? super BaseEvent, ? extends BaseEvent> function1) {
            Intrinsics.checkNotNullParameter(trackEvent, "trackEvent");
            this.f288309a = trackEvent;
            this.f288310b = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c d(c cVar, BaseEvent baseEvent, Function1 function1, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                baseEvent = cVar.f288309a;
            }
            if ((i10 & 2) != 0) {
                function1 = cVar.f288310b;
            }
            return cVar.c(baseEvent, function1);
        }

        @NotNull
        public final BaseEvent a() {
            return this.f288309a;
        }

        @Nullable
        public final Function1<BaseEvent, BaseEvent> b() {
            return this.f288310b;
        }

        @NotNull
        public final c c(@NotNull BaseEvent trackEvent, @Nullable Function1<? super BaseEvent, ? extends BaseEvent> function1) {
            Intrinsics.checkNotNullParameter(trackEvent, "trackEvent");
            return new c(trackEvent, function1);
        }

        @Nullable
        public final Function1<BaseEvent, BaseEvent> e() {
            return this.f288310b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f288309a, cVar.f288309a) && Intrinsics.areEqual(this.f288310b, cVar.f288310b);
        }

        @NotNull
        public final BaseEvent f() {
            return this.f288309a;
        }

        public int hashCode() {
            int iHashCode = this.f288309a.hashCode() * 31;
            Function1<BaseEvent, BaseEvent> function1 = this.f288310b;
            return iHashCode + (function1 == null ? 0 : function1.hashCode());
        }

        @NotNull
        public String toString() {
            return "MigrationEventData(trackEvent=" + this.f288309a + ", enrichmentClosure=" + this.f288310b + ")";
        }

        public /* synthetic */ c(BaseEvent baseEvent, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(baseEvent, (i10 & 2) != 0 ? null : function1);
        }
    }
}
