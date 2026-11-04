package io.ktor.client;

import androidx.core.app.w;
import fi.e0;
import fi.g0;
import fi.y;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.ktor.client.plugins.c1;
import io.ktor.client.plugins.d0;
import io.ktor.client.plugins.k0;
import io.ktor.client.plugins.q;
import java.io.Closeable;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.s2;
import kotlinx.coroutines.t0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nHttpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpClient.kt\nio/ktor/client/HttpClient\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1493:1\n1869#2,2:1494\n*S KotlinDebug\n*F\n+ 1 HttpClient.kt\nio/ktor/client/HttpClient\n*L\n1476#1:1494,2\n*E\n"})
public final class c implements s0, Closeable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f294215n = AtomicIntegerFieldUpdater.newUpdater(c.class, MetricTracker.Action.CLOSED);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.ktor.client.engine.b f294216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final j<? extends io.ktor.client.engine.j> f294217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f294218c;

    @NotNull
    private volatile /* synthetic */ int closed;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final a0 f294219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f294220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final e0 f294221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final io.ktor.client.statement.f f294222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final g0 f294223h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final io.ktor.client.statement.b f294224i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final io.ktor.util.b f294225j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final io.ktor.client.engine.j f294226k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final io.ktor.events.c f294227l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final j<io.ktor.client.engine.j> f294228m;

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.HttpClient$2", f = "HttpClient.kt", i = {0, 0}, l = {1367, 1369}, m = "invokeSuspend", n = {"$this$intercept", w.E0}, s = {"L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nHttpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpClient.kt\nio/ktor/client/HttpClient$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1493:1\n1#2:1494\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<io.ktor.util.pipeline.e<Object, y>, Object, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f294229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f294230b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f294231c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.coroutines.d<? super a> dVar) {
            super(3, dVar);
            int i10 = 4 & 3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
        
            if (r3.k(r1, r9) == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r9.f294229a
                r8 = 3
                r2 = 2
                r8 = 7
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L15
                r8 = 4
                kotlin.ResultKt.m(r10)
                goto L7a
            L15:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r8 = 7
                r9.<init>(r10)
                throw r9
            L1e:
                java.lang.Object r1 = r9.f294231c
                r8 = 1
                java.lang.Object r3 = r9.f294230b
                io.ktor.util.pipeline.e r3 = (io.ktor.util.pipeline.e) r3
                r8 = 0
                kotlin.ResultKt.m(r10)
                goto L5e
            L2a:
                r8 = 7
                kotlin.ResultKt.m(r10)
                r8 = 2
                java.lang.Object r10 = r9.f294230b
                io.ktor.util.pipeline.e r10 = (io.ktor.util.pipeline.e) r10
                r8 = 7
                java.lang.Object r1 = r9.f294231c
                boolean r4 = r1 instanceof io.ktor.client.call.b
                if (r4 == 0) goto L7d
                r8 = 3
                io.ktor.client.c r4 = io.ktor.client.c.this
                r8 = 2
                io.ktor.client.statement.b r4 = r4.t()
                r8 = 1
                kotlin.Unit r5 = kotlin.Unit.f312394a
                r6 = r1
                r8 = 0
                io.ktor.client.call.b r6 = (io.ktor.client.call.b) r6
                io.ktor.client.statement.c r6 = r6.k()
                r9.f294230b = r10
                r9.f294231c = r1
                r9.f294229a = r3
                r8 = 4
                java.lang.Object r3 = r4.e(r5, r6, r9)
                if (r3 != r0) goto L5b
                goto L79
            L5b:
                r7 = r3
                r3 = r10
                r10 = r7
            L5e:
                r8 = 7
                io.ktor.client.statement.c r10 = (io.ktor.client.statement.c) r10
                r4 = r1
                r8 = 1
                io.ktor.client.call.b r4 = (io.ktor.client.call.b) r4
                r8 = 1
                r4.q(r10)
                r10 = 0
                r9.f294230b = r10
                r9.f294231c = r10
                r8 = 3
                r9.f294229a = r2
                r8 = 2
                java.lang.Object r9 = r3.k(r1, r9)
                r8 = 5
                if (r9 != r0) goto L7a
            L79:
                return r0
            L7a:
                kotlin.Unit r9 = kotlin.Unit.f312394a
                return r9
            L7d:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r8 = 2
                r9.<init>()
                java.lang.String r10 = "Error: HttpClientCall expected, but found "
                r9.append(r10)
                r9.append(r1)
                r10 = 40
                r8 = 3
                r9.append(r10)
                r8 = 4
                java.lang.Class r10 = r1.getClass()
                kotlin.reflect.d r10 = kotlin.jvm.internal.j1.d(r10)
                r9.append(r10)
                java.lang.String r10 = ")."
                r9.append(r10)
                java.lang.String r9 = r9.toString()
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r9 = r9.toString()
                r10.<init>(r9)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.util.pipeline.e<Object, y> eVar, Object obj, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar = c.this.new a(dVar);
            aVar.f294230b = eVar;
            aVar.f294231c = obj;
            return aVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.HttpClient$4", f = "HttpClient.kt", i = {0}, l = {1401}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements pj.n<io.ktor.util.pipeline.e<io.ktor.client.statement.d, io.ktor.client.call.b>, io.ktor.client.statement.d, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f294233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f294234b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.coroutines.d<? super b> dVar) {
            super(3, dVar);
            int i10 = 7 ^ 3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            io.ktor.util.pipeline.e eVar;
            Throwable th2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f294233a;
            if (i10 == 0) {
                ResultKt.m(obj);
                io.ktor.util.pipeline.e eVar2 = (io.ktor.util.pipeline.e) this.f294234b;
                try {
                    this.f294234b = eVar2;
                    this.f294233a = 1;
                    Object objJ = eVar2.j(this);
                    if (objJ == objL) {
                        return objL;
                    }
                    eVar = eVar2;
                    obj = objJ;
                } catch (Throwable th3) {
                    eVar = eVar2;
                    th2 = th3;
                    c.this.r().b(io.ktor.client.utils.e.d(), new io.ktor.client.utils.n(((io.ktor.client.call.b) eVar.f()).k(), th2));
                    throw th2;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eVar = (io.ktor.util.pipeline.e) this.f294234b;
                try {
                    ResultKt.m(obj);
                } catch (Throwable th4) {
                    th2 = th4;
                    c.this.r().b(io.ktor.client.utils.e.d(), new io.ktor.client.utils.n(((io.ktor.client.call.b) eVar.f()).k(), th2));
                    throw th2;
                }
            }
            return Unit.f312394a;
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.util.pipeline.e<io.ktor.client.statement.d, io.ktor.client.call.b> eVar, io.ktor.client.statement.d dVar, kotlin.coroutines.d<? super Unit> dVar2) {
            b bVar = c.this.new b(dVar2);
            bVar.f294234b = eVar;
            return bVar.invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.c$c, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.HttpClient", f = "HttpClient.kt", i = {}, l = {1415}, m = "execute$ktor_client_core", n = {}, s = {})
    static final class C2053c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f294236a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f294238c;

        C2053c(kotlin.coroutines.d<? super C2053c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f294236a = obj;
            this.f294238c |= Integer.MIN_VALUE;
            return c.this.l(null, this);
        }
    }

    public c(@NotNull io.ktor.client.engine.b engine, @NotNull j<? extends io.ktor.client.engine.j> userConfig) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(userConfig, "userConfig");
        this.f294216a = engine;
        this.f294217b = userConfig;
        boolean z10 = false;
        this.closed = 0;
        a0 a0VarA = s2.a((p2) engine.getCoroutineContext().get(p2.M2));
        this.f294219d = a0VarA;
        this.f294220e = engine.getCoroutineContext().plus(a0VarA);
        int i10 = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.f294221f = new e0(z10, i10, defaultConstructorMarker);
        io.ktor.client.statement.f fVar = new io.ktor.client.statement.f(z10, i10, defaultConstructorMarker);
        this.f294222g = fVar;
        g0 g0Var = new g0(z10, i10, defaultConstructorMarker);
        this.f294223h = g0Var;
        this.f294224i = new io.ktor.client.statement.b(z10, i10, defaultConstructorMarker);
        this.f294225j = io.ktor.util.d.a(true);
        this.f294226k = engine.getConfig();
        this.f294227l = new io.ktor.events.c();
        j<io.ktor.client.engine.j> jVar = new j<>();
        this.f294228m = jVar;
        if (this.f294218c) {
            a0VarA.E(new Function1() { // from class: io.ktor.client.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return c.f(this.f294214a, (Throwable) obj);
                }
            });
        }
        engine.u8(this);
        g0Var.q(g0.f275238h.d(), new a(null));
        j.t(jVar, k0.i(), null, 2, null);
        j.t(jVar, io.ktor.client.plugins.d.e(), null, 2, null);
        j.t(jVar, q.e(), null, 2, null);
        if (userConfig.p()) {
            jVar.s("DefaultTransformers", new Function1() { // from class: io.ktor.client.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return c.e((c) obj);
                }
            });
        }
        j.t(jVar, c1.f294447c, null, 2, null);
        j.t(jVar, io.ktor.client.plugins.w.l(), null, 2, null);
        if (userConfig.o()) {
            j.t(jVar, io.ktor.client.plugins.g0.f(), null, 2, null);
        }
        jVar.y(userConfig);
        if (userConfig.p()) {
            j.t(jVar, d0.j(), null, 2, null);
        }
        io.ktor.client.plugins.l.d(jVar);
        jVar.q(this);
        fVar.q(io.ktor.client.statement.f.f295340h.c(), new b(null));
    }

    public static Unit e(c install) {
        Intrinsics.checkNotNullParameter(install, "$this$install");
        io.ktor.client.plugins.m.d(install);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(c cVar, Throwable th2) {
        if (th2 != null) {
            int i10 = 3 ^ 0;
            t0.f(cVar.f294216a, null, 1, null);
        }
        return Unit.f312394a;
    }

    @NotNull
    public final g0 E() {
        return this.f294223h;
    }

    public final boolean H(@NotNull io.ktor.client.engine.h<?> capability) {
        Intrinsics.checkNotNullParameter(capability, "capability");
        return this.f294216a.l6().contains(capability);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Exception {
        if (f294215n.compareAndSet(this, 0, 1)) {
            io.ktor.util.b bVar = (io.ktor.util.b) this.f294225j.f(io.ktor.client.plugins.a0.a());
            Iterator<T> it = bVar.b().iterator();
            while (it.hasNext()) {
                io.ktor.util.a aVar = (io.ktor.util.a) it.next();
                Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
                Object objF = bVar.f(aVar);
                if (objF instanceof AutoCloseable) {
                    androidx.documentfile.provider.b.a((AutoCloseable) objF);
                }
            }
            this.f294219d.complete();
            if (this.f294218c) {
                this.f294216a.close();
            }
        }
    }

    @NotNull
    public final io.ktor.util.b getAttributes() {
        return this.f294225j;
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f294220e;
    }

    @NotNull
    public final c j(@NotNull Function1<? super j<?>, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        io.ktor.client.engine.b bVar = this.f294216a;
        j jVar = new j();
        jVar.y(this.f294217b);
        block.invoke(jVar);
        return new c(bVar, jVar, this.f294218c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object l(@NotNull y yVar, @NotNull kotlin.coroutines.d<? super io.ktor.client.call.b> dVar) {
        C2053c c2053c;
        if (dVar instanceof C2053c) {
            c2053c = (C2053c) dVar;
            int i10 = c2053c.f294238c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2053c.f294238c = i10 - Integer.MIN_VALUE;
            } else {
                c2053c = new C2053c(dVar);
            }
        } else {
            c2053c = new C2053c(dVar);
        }
        Object objE = c2053c.f294236a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c2053c.f294238c;
        if (i11 == 0) {
            ResultKt.m(objE);
            this.f294227l.b(io.ktor.client.utils.e.a(), yVar);
            e0 e0Var = this.f294221f;
            Object objD = yVar.d();
            c2053c.f294238c = 1;
            objE = e0Var.e(yVar, objD, c2053c);
            if (objE == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objE);
        }
        Intrinsics.checkNotNull(objE, "null cannot be cast to non-null type io.ktor.client.call.HttpClientCall");
        return (io.ktor.client.call.b) objE;
    }

    @NotNull
    public final j<io.ktor.client.engine.j> m() {
        return this.f294228m;
    }

    @NotNull
    public final io.ktor.client.engine.b o() {
        return this.f294216a;
    }

    @NotNull
    public final io.ktor.client.engine.j q() {
        return this.f294226k;
    }

    @NotNull
    public final io.ktor.events.c r() {
        return this.f294227l;
    }

    @NotNull
    public final io.ktor.client.statement.b t() {
        return this.f294224i;
    }

    @NotNull
    public String toString() {
        return "HttpClient[" + this.f294216a + AbstractJsonLexerKt.END_LIST;
    }

    @NotNull
    public final e0 x() {
        return this.f294221f;
    }

    @NotNull
    public final io.ktor.client.statement.f y() {
        return this.f294222g;
    }

    public /* synthetic */ c(io.ktor.client.engine.b bVar, j jVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (i10 & 2) != 0 ? new j() : jVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@NotNull io.ktor.client.engine.b engine, @NotNull j<? extends io.ktor.client.engine.j> userConfig, boolean z10) {
        this(engine, userConfig);
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(userConfig, "userConfig");
        this.f294218c = z10;
    }
}
