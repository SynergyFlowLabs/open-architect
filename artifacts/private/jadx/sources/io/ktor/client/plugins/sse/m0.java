package io.ktor.client.plugins.sse;

import io.ktor.http.i1;
import io.ktor.http.l1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nSSE.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SSE.kt\nio/ktor/client/plugins/sse/SSEKt\n+ 2 Logger.kt\nio/ktor/util/logging/LoggerKt\n+ 3 Attributes.kt\nio/ktor/util/AttributesKt\n+ 4 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,207:1\n37#2,2:208\n21#3:210\n21#3:229\n65#4,18:211\n65#4,18:230\n*S KotlinDebug\n*F\n+ 1 SSE.kt\nio/ktor/client/plugins/sse/SSEKt\n*L\n190#1:208,2\n182#1:210\n183#1:229\n182#1:211,18\n183#1:230,18\n*E\n"})
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final org.slf4j.c f295087a = pi.a.a("io.ktor.client.plugins.sse.SSE");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final io.ktor.client.plugins.api.b<k0> f295088b = io.ktor.client.plugins.api.i.b("SSE", a.f295091a, new Function1() { // from class: io.ktor.client.plugins.sse.l0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return m0.b((io.ktor.client.plugins.api.d) obj);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.a<io.ktor.client.c> f295089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.a<Boolean> f295090d;

    /* synthetic */ class a extends kotlin.jvm.internal.g0 implements Function0<k0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f295091a = new a();

        a() {
            super(0, k0.class, "<init>", "<init>()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final k0 invoke() {
            return new k0();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.sse.SSEKt$SSE$2$1", f = "SSE.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSSE.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SSE.kt\nio/ktor/client/plugins/sse/SSEKt$SSE$2$1\n+ 2 Logger.kt\nio/ktor/util/logging/LoggerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,207:1\n37#2,2:208\n1#3:210\n374#4:211\n*S KotlinDebug\n*F\n+ 1 SSE.kt\nio/ktor/client/plugins/sse/SSEKt$SSE$2$1\n*L\n94#1:208,2\n109#1:211\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements pj.n<fi.y, io.ktor.http.content.w, kotlin.coroutines.d<? super io.ktor.http.content.w>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f295092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f295093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f295094c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ io.ktor.client.plugins.api.d<k0> f295095d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f295096e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f295097f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f295098g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f295099h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(io.ktor.client.plugins.api.d<k0> dVar, long j10, boolean z10, boolean z11, int i10, kotlin.coroutines.d<? super b> dVar2) {
            super(3, dVar2);
            this.f295095d = dVar;
            this.f295096e = j10;
            this.f295097f = z10;
            this.f295098g = z11;
            this.f295099h = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f295092a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            fi.y yVar = (fi.y) this.f295093b;
            io.ktor.http.content.w wVar = (io.ktor.http.content.w) this.f295094c;
            if (!Intrinsics.areEqual(m0.e(yVar, a0.H()), kotlin.coroutines.jvm.internal.b.a(true))) {
                return wVar;
            }
            org.slf4j.c cVarF = m0.f();
            if (pi.b.a(cVarF)) {
                cVarF.J("Sending SSE request to " + yVar.i());
            }
            yVar.m(h0.f295070a, Unit.f312394a);
            kotlin.time.c cVar = (kotlin.time.c) m0.e(yVar, a0.E());
            Boolean bool = (Boolean) m0.e(yVar, a0.F());
            Boolean bool2 = (Boolean) m0.e(yVar, a0.G());
            yVar.c().a(fi.d0.c(), new fi.j0());
            yVar.c().a(m0.i(), this.f295095d.b());
            io.ktor.http.m mVarB = wVar.b();
            if (mVarB != null) {
                i1.h(yVar, mVarB);
            }
            return new i0(cVar != null ? cVar.S0() : this.f295096e, bool != null ? bool.booleanValue() : this.f295097f, bool2 != null ? bool2.booleanValue() : this.f295098g, this.f295099h, getContext(), yVar, wVar, null);
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(fi.y yVar, io.ktor.http.content.w wVar, kotlin.coroutines.d<? super io.ktor.http.content.w> dVar) {
            b bVar = new b(this.f295095d, this.f295096e, this.f295097f, this.f295098g, this.f295099h, dVar);
            bVar.f295093b = yVar;
            bVar.f295094c = wVar;
            return bVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.sse.SSEKt$SSE$2$2", f = "SSE.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.H1}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSSE.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SSE.kt\nio/ktor/client/plugins/sse/SSEKt$SSE$2$2\n+ 2 Logger.kt\nio/ktor/util/logging/LoggerKt\n*L\n1#1,207:1\n37#2,2:208\n37#2,2:210\n*S KotlinDebug\n*F\n+ 1 SSE.kt\nio/ktor/client/plugins/sse/SSEKt$SSE$2$2\n*L\n120#1:208,2\n131#1:210,2\n*E\n"})
    static final class c extends kotlin.coroutines.jvm.internal.o implements pj.n<io.ktor.util.pipeline.e<io.ktor.client.statement.d, io.ktor.client.call.b>, io.ktor.client.statement.d, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f295100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f295101b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f295102c;

        @SourceDebugExtension({"SMAP\nSSE.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SSE.kt\nio/ktor/client/plugins/sse/SSEKt$SSE$2$2$clientSSESession$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,207:1\n49#2:208\n51#2:212\n46#3:209\n51#3:211\n105#4:210\n*S KotlinDebug\n*F\n+ 1 SSE.kt\nio/ktor/client/plugins/sse/SSEKt$SSE$2$2$clientSSESession$1$1\n*L\n139#1:208\n139#1:212\n139#1:209\n139#1:211\n139#1:210\n*E\n"})
        public static final class a implements o0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final kotlinx.coroutines.flow.i<li.d<String>> f295103a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Function2<ri.b, String, Object> f295104b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final CoroutineContext f295105c;

            /* JADX INFO: renamed from: io.ktor.client.plugins.sse.m0$c$a$a, reason: collision with other inner class name */
            @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
            public static final class C2069a implements kotlinx.coroutines.flow.i<li.d<String>> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.flow.i f295106a;

                /* JADX INFO: renamed from: io.ktor.client.plugins.sse.m0$c$a$a$a, reason: collision with other inner class name */
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SSE.kt\nio/ktor/client/plugins/sse/SSEKt$SSE$2$2$clientSSESession$1$1\n*L\n1#1,49:1\n50#2:50\n140#3:51\n*E\n"})
                public static final class C2070a<T> implements kotlinx.coroutines.flow.j {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ kotlinx.coroutines.flow.j f295107a;

                    /* JADX INFO: renamed from: io.ktor.client.plugins.sse.m0$c$a$a$a$a, reason: collision with other inner class name */
                    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.sse.SSEKt$SSE$2$2$clientSSESession$1$1$special$$inlined$map$1$2", f = "SSE.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                    public static final class C2071a extends kotlin.coroutines.jvm.internal.d {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        /* synthetic */ Object f295108a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        int f295109b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        Object f295110c;

                        public C2071a(kotlin.coroutines.d dVar) {
                            super(dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            this.f295108a = obj;
                            this.f295109b |= Integer.MIN_VALUE;
                            return C2070a.this.emit(null, this);
                        }
                    }

                    public C2070a(kotlinx.coroutines.flow.j jVar) {
                        this.f295107a = jVar;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
                    @Override // kotlinx.coroutines.flow.j
                    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                        C2071a c2071a;
                        if (dVar instanceof C2071a) {
                            c2071a = (C2071a) dVar;
                            int i10 = c2071a.f295109b;
                            if ((i10 & Integer.MIN_VALUE) != 0) {
                                c2071a.f295109b = i10 - Integer.MIN_VALUE;
                            } else {
                                c2071a = new C2071a(dVar);
                            }
                        } else {
                            c2071a = new C2071a(dVar);
                        }
                        Object obj2 = c2071a.f295108a;
                        Object objL = kotlin.coroutines.intrinsics.b.l();
                        int i11 = c2071a.f295109b;
                        if (i11 == 0) {
                            ResultKt.m(obj2);
                            kotlinx.coroutines.flow.j jVar = this.f295107a;
                            li.a aVar = (li.a) obj;
                            li.d dVar2 = new li.d(aVar.getData(), aVar.getEvent(), aVar.getId(), aVar.a(), aVar.b());
                            c2071a.f295109b = 1;
                            if (jVar.emit(dVar2, c2071a) == objL) {
                                return objL;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.m(obj2);
                        }
                        return Unit.f312394a;
                    }
                }

                public C2069a(kotlinx.coroutines.flow.i iVar) {
                    this.f295106a = iVar;
                }

                @Override // kotlinx.coroutines.flow.i
                public Object collect(kotlinx.coroutines.flow.j<? super li.d<String>> jVar, kotlin.coroutines.d dVar) {
                    Object objCollect = this.f295106a.collect(new C2070a(jVar), dVar);
                    return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(Object obj, Function2<? super ri.b, ? super String, ? extends Object> function2) {
                n0 n0Var = (n0) obj;
                this.f295103a = new C2069a(n0Var.a());
                this.f295104b = function2;
                this.f295105c = n0Var.getCoroutineContext();
            }

            @Override // io.ktor.client.plugins.sse.o0
            public Function2<ri.b, String, Object> T0() {
                return this.f295104b;
            }

            @Override // io.ktor.client.plugins.sse.o0
            public kotlinx.coroutines.flow.i<li.d<String>> a() {
                return this.f295103a;
            }

            @Override // kotlinx.coroutines.s0
            public CoroutineContext getCoroutineContext() {
                return this.f295105c;
            }
        }

        c(kotlin.coroutines.d<? super c> dVar) {
            super(3, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f295100a;
            if (i10 == 0) {
                ResultKt.m(obj);
                io.ktor.util.pipeline.e eVar = (io.ktor.util.pipeline.e) this.f295101b;
                io.ktor.client.statement.d dVar = (io.ktor.client.statement.d) this.f295102c;
                ri.b bVarA = dVar.a();
                Object objB = dVar.b();
                io.ktor.client.statement.c cVarK = ((io.ktor.client.call.b) eVar.f()).k();
                if (!Intrinsics.areEqual(io.ktor.client.statement.e.h(cVarK).getAttributes().e(a0.H()), kotlin.coroutines.jvm.internal.b.a(true))) {
                    org.slf4j.c cVarF = m0.f();
                    if (pi.b.a(cVarF)) {
                        cVarF.J("Skipping non SSE response from " + io.ktor.client.statement.e.h(cVarK).getUrl());
                    }
                    return Unit.f312394a;
                }
                m0.d(cVarK);
                if (!(objB instanceof n0)) {
                    throw new j0(cVarK, null, "Expected " + j1.d(n0.class).Q() + " content but was " + objB, 2, null);
                }
                org.slf4j.c cVarF2 = m0.f();
                if (pi.b.a(cVarF2)) {
                    cVarF2.J("Receive SSE session from " + io.ktor.client.statement.e.h(cVarK).getUrl() + ": " + objB);
                }
                Function2 function2 = (Function2) io.ktor.client.statement.e.h(cVarK).getAttributes().e(a0.D());
                io.ktor.client.statement.d dVar2 = new io.ktor.client.statement.d(bVarA, function2 != null ? new d0((io.ktor.client.call.b) eVar.f(), new a(objB, function2)) : new b0((io.ktor.client.call.b) eVar.f(), (n0) objB));
                this.f295101b = null;
                this.f295100a = 1;
                if (eVar.k(dVar2, this) == objL) {
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

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.util.pipeline.e<io.ktor.client.statement.d, io.ktor.client.call.b> eVar, io.ktor.client.statement.d dVar, kotlin.coroutines.d<? super Unit> dVar2) {
            c cVar = new c(dVar2);
            cVar.f295101b = eVar;
            cVar.f295102c = dVar;
            return cVar.invokeSuspend(Unit.f312394a);
        }
    }

    static {
        kotlin.reflect.s sVarA;
        kotlin.reflect.d dVarD = j1.d(io.ktor.client.c.class);
        kotlin.reflect.s sVarA2 = null;
        try {
            sVarA = j1.A(io.ktor.client.c.class);
        } catch (Throwable unused) {
            sVarA = null;
        }
        f295089c = new io.ktor.util.a<>("SSEClientForReconnection", new ri.b(dVarD, sVarA));
        kotlin.reflect.d dVarD2 = j1.d(Boolean.class);
        try {
            sVarA2 = j1.A(Boolean.TYPE);
        } catch (Throwable unused2) {
        }
        f295090d = new io.ktor.util.a<>("SSEReconnectionRequestAttr", new ri.b(dVarD2, sVarA2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(io.ktor.client.plugins.api.d createClientPlugin) {
        Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        createClientPlugin.g(io.ktor.client.plugins.sse.a.f294975a, new b(createClientPlugin, ((k0) createClientPlugin.f()).b(), ((k0) createClientPlugin.f()).c(), ((k0) createClientPlugin.f()).d(), ((k0) createClientPlugin.f()).a(), null));
        createClientPlugin.b().y().q(io.ktor.client.statement.f.f295340h.e(), new c(null));
        return Unit.f312394a;
    }

    public static final void d(@NotNull io.ktor.client.statement.c response) {
        Intrinsics.checkNotNullParameter(response, "response");
        l1 l1VarJ = response.j();
        io.ktor.http.m mVarF = i1.f(response);
        l1.a aVar = l1.f295939c;
        if (Intrinsics.areEqual(l1VarJ, aVar.w())) {
            org.slf4j.c cVar = f295087a;
            if (pi.b.a(cVar)) {
                cVar.J("Receive status code NoContent for SSE request to " + io.ktor.client.statement.e.h(response).getUrl());
                return;
            }
            return;
        }
        if (!Intrinsics.areEqual(l1VarJ, aVar.C())) {
            throw new j0(response, null, "Expected status code " + aVar.C().H0() + " but was " + l1VarJ.H0(), 2, null);
        }
        io.ktor.http.m mVarK = mVarF != null ? mVarF.k() : null;
        io.ktor.http.m.h hVar = io.ktor.http.m.h.f296047a;
        if (Intrinsics.areEqual(mVarK, hVar.f())) {
            return;
        }
        throw new j0(response, null, "Expected Content-Type " + hVar.f() + " but was " + mVarF, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T e(fi.y yVar, io.ktor.util.a<T> aVar) {
        return (T) yVar.c().e(aVar);
    }

    @NotNull
    public static final org.slf4j.c f() {
        return f295087a;
    }

    @NotNull
    public static final io.ktor.client.plugins.api.b<k0> g() {
        return f295088b;
    }

    public static /* synthetic */ void h() {
    }

    @NotNull
    public static final io.ktor.util.a<io.ktor.client.c> i() {
        return f295089c;
    }

    @NotNull
    public static final io.ktor.util.a<Boolean> j() {
        return f295090d;
    }
}
