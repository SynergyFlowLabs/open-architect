package io.ktor.client.plugins;

import java.net.SocketTimeoutException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nHttpRequestRetry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpRequestRetry.kt\nio/ktor/client/plugins/HttpRequestRetryKt\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,484:1\n21#2:485\n21#2:504\n21#2:523\n21#2:542\n21#2:561\n65#3,18:486\n65#3,18:505\n65#3,18:524\n65#3,18:543\n65#3,18:562\n*S KotlinDebug\n*F\n+ 1 HttpRequestRetry.kt\nio/ktor/client/plugins/HttpRequestRetryKt\n*L\n449#1:485\n452#1:504\n457#1:523\n462#1:542\n467#1:561\n449#1:486,18\n452#1:505,18\n457#1:524,18\n462#1:543,18\n467#1:562,18\n*E\n"})
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final org.slf4j.c f295169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final io.ktor.events.a<z0> f295170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final io.ktor.client.plugins.api.b<t0> f295171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.a<Integer> f295172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.a<pj.n<b1, fi.w, io.ktor.client.statement.c, Boolean>> f295173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.a<pj.n<b1, fi.y, Throwable, Boolean>> f295174f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.a<Function2<a1, fi.y, Unit>> f295175g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.a<Function2<y0, Integer, Long>> f295176h;

    /* synthetic */ class a extends kotlin.jvm.internal.g0 implements Function0<t0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f295177a = new a();

        a() {
            super(0, t0.class, "<init>", "<init>()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final t0 invoke() {
            return new t0();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.HttpRequestRetryKt$HttpRequestRetry$2$1", f = "HttpRequestRetry.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {352, 355, 371}, m = "invokeSuspend", n = {"$this$on", "request", "shouldRetry", "shouldRetryOnException", "delayMillis", "modifyRequest", "subRequest", "retryCount", "maxRetries", "$this$on", "request", "shouldRetry", "shouldRetryOnException", "delayMillis", "modifyRequest", androidx.core.app.w.E0, "subRequest", "retryCount", "maxRetries", "$this$on", "request", "shouldRetry", "shouldRetryOnException", "delayMillis", "modifyRequest", "lastRetryData", "retryCount", "maxRetries"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements pj.n<io.ktor.client.plugins.api.q.a, fi.y, kotlin.coroutines.d<? super io.ktor.client.call.b>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f295178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f295179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f295180c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f295181d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f295182e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f295183f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f295184g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f295185h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f295186i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f295187j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f295188k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ pj.n<b1, fi.w, io.ktor.client.statement.c, Boolean> f295189l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ pj.n<b1, fi.y, Throwable, Boolean> f295190m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f295191n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function2<y0, Integer, Long> f295192o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Function2<a1, fi.y, Unit> f295193s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ io.ktor.client.plugins.api.d<t0> f295194t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ Function2<Long, kotlin.coroutines.d<? super Unit>, Object> f295195v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(pj.n<? super b1, ? super fi.w, ? super io.ktor.client.statement.c, Boolean> nVar, pj.n<? super b1, ? super fi.y, ? super Throwable, Boolean> nVar2, int i10, Function2<? super y0, ? super Integer, Long> function2, Function2<? super a1, ? super fi.y, Unit> function3, io.ktor.client.plugins.api.d<t0> dVar, Function2<? super Long, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function4, kotlin.coroutines.d<? super b> dVar2) {
            super(3, dVar2);
            this.f295189l = nVar;
            this.f295190m = nVar2;
            this.f295191n = i10;
            this.f295192o = function2;
            this.f295193s = function3;
            this.f295194t = dVar;
            this.f295195v = function4;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x01f8 -> B:8:0x003c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to io.ktor.client.plugins.w0$b for r16v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 558
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.w0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.client.plugins.api.q.a aVar, fi.y yVar, kotlin.coroutines.d<? super io.ktor.client.call.b> dVar) {
            b bVar = new b(this.f295189l, this.f295190m, this.f295191n, this.f295192o, this.f295193s, this.f295194t, this.f295195v, dVar);
            bVar.f295187j = aVar;
            bVar.f295188k = yVar;
            return bVar.invokeSuspend(Unit.f312394a);
        }
    }

    static {
        kotlin.reflect.s sVarA;
        kotlin.reflect.s sVarD;
        kotlin.reflect.s sVarD2;
        kotlin.reflect.s sVarD3;
        Class cls = Boolean.TYPE;
        Class cls2 = Integer.TYPE;
        f295169a = pi.a.a("io.ktor.client.plugins.HttpRequestRetry");
        f295170b = new io.ktor.events.a<>();
        f295171c = io.ktor.client.plugins.api.i.b("RetryFeature", a.f295177a, new Function1() { // from class: io.ktor.client.plugins.u0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w0.c((io.ktor.client.plugins.api.d) obj);
            }
        });
        kotlin.reflect.d dVarD = kotlin.jvm.internal.j1.d(Integer.class);
        kotlin.reflect.s sVarD4 = null;
        try {
            sVarA = kotlin.jvm.internal.j1.A(cls2);
        } catch (Throwable unused) {
            sVarA = null;
        }
        f295172d = new io.ktor.util.a<>("MaxRetriesPerRequestAttributeKey", new ri.b(dVarD, sVarA));
        kotlin.reflect.d dVarD2 = kotlin.jvm.internal.j1.d(pj.n.class);
        try {
            KTypeProjection.a aVar = KTypeProjection.f312969c;
            sVarD = kotlin.jvm.internal.j1.D(pj.n.class, aVar.e(kotlin.jvm.internal.j1.A(b1.class)), aVar.e(kotlin.jvm.internal.j1.A(fi.w.class)), aVar.e(kotlin.jvm.internal.j1.A(io.ktor.client.statement.c.class)), aVar.e(kotlin.jvm.internal.j1.A(cls)));
        } catch (Throwable unused2) {
            sVarD = null;
        }
        f295173e = new io.ktor.util.a<>("ShouldRetryPerRequestAttributeKey", new ri.b(dVarD2, sVarD));
        kotlin.reflect.d dVarD3 = kotlin.jvm.internal.j1.d(pj.n.class);
        try {
            KTypeProjection.a aVar2 = KTypeProjection.f312969c;
            sVarD2 = kotlin.jvm.internal.j1.D(pj.n.class, aVar2.e(kotlin.jvm.internal.j1.A(b1.class)), aVar2.e(kotlin.jvm.internal.j1.A(fi.y.class)), aVar2.e(kotlin.jvm.internal.j1.A(Throwable.class)), aVar2.e(kotlin.jvm.internal.j1.A(cls)));
        } catch (Throwable unused3) {
            sVarD2 = null;
        }
        f295174f = new io.ktor.util.a<>("ShouldRetryOnExceptionPerRequestAttributeKey", new ri.b(dVarD3, sVarD2));
        kotlin.reflect.d dVarD4 = kotlin.jvm.internal.j1.d(Function2.class);
        try {
            KTypeProjection.a aVar3 = KTypeProjection.f312969c;
            sVarD3 = kotlin.jvm.internal.j1.D(Function2.class, aVar3.e(kotlin.jvm.internal.j1.A(a1.class)), aVar3.e(kotlin.jvm.internal.j1.A(fi.y.class)), aVar3.e(kotlin.jvm.internal.j1.A(Unit.class)));
        } catch (Throwable unused4) {
            sVarD3 = null;
        }
        f295175g = new io.ktor.util.a<>("ModifyRequestPerRequestAttributeKey", new ri.b(dVarD4, sVarD3));
        kotlin.reflect.d dVarD5 = kotlin.jvm.internal.j1.d(Function2.class);
        try {
            KTypeProjection.a aVar4 = KTypeProjection.f312969c;
            sVarD4 = kotlin.jvm.internal.j1.D(Function2.class, aVar4.e(kotlin.jvm.internal.j1.A(y0.class)), aVar4.e(kotlin.jvm.internal.j1.A(cls2)), aVar4.e(kotlin.jvm.internal.j1.A(Long.TYPE)));
        } catch (Throwable unused5) {
        }
        f295176h = new io.ktor.util.a<>("RetryDelayPerRequestAttributeKey", new ri.b(dVarD5, sVarD4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(io.ktor.client.plugins.api.d createClientPlugin) {
        Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        pj.n<b1, fi.w, io.ktor.client.statement.c, Boolean> nVarY = ((t0) createClientPlugin.f()).y();
        pj.n<b1, fi.y, Throwable, Boolean> nVarZ = ((t0) createClientPlugin.f()).z();
        Function2<y0, Integer, Long> function2T = ((t0) createClientPlugin.f()).t();
        Function2<Long, kotlin.coroutines.d<? super Unit>, Object> function2S = ((t0) createClientPlugin.f()).s();
        createClientPlugin.g(io.ktor.client.plugins.api.q.f294412a, new b(nVarY, nVarZ, ((t0) createClientPlugin.f()).u(), function2T, ((t0) createClientPlugin.f()).v(), createClientPlugin, function2S, null));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fi.y d(fi.y yVar) {
        final fi.y yVarQ = new fi.y().q(yVar);
        yVar.g().E(new Function1() { // from class: io.ktor.client.plugins.v0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w0.e(yVarQ, (Throwable) obj);
            }
        });
        return yVarQ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(fi.y yVar, Throwable th2) {
        p2 p2VarG = yVar.g();
        Intrinsics.checkNotNull(p2VarG, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
        kotlinx.coroutines.a0 a0Var = (kotlinx.coroutines.a0) p2VarG;
        if (th2 == null) {
            a0Var.complete();
        } else {
            a0Var.f(th2);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(int i10, int i11, pj.n<? super b1, ? super fi.w, ? super io.ktor.client.statement.c, Boolean> nVar, io.ktor.client.call.b bVar) {
        return i10 < i11 && nVar.invoke(new b1(i10 + 1), bVar.j(), bVar.k()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(int i10, int i11, pj.n<? super b1, ? super fi.y, ? super Throwable, Boolean> nVar, fi.y yVar, Throwable th2) {
        return i10 < i11 && nVar.invoke(new b1(i10 + 1), yVar, th2).booleanValue();
    }

    @NotNull
    public static final io.ktor.client.plugins.api.b<t0> s() {
        return f295171c;
    }

    public static /* synthetic */ void t() {
    }

    @NotNull
    public static final io.ktor.events.a<z0> u() {
        return f295170b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v(Throwable th2) {
        Throwable thA = io.ktor.client.utils.i.a(th2);
        return (thA instanceof x0) || (thA instanceof ei.a) || (thA instanceof SocketTimeoutException);
    }

    public static final void w(@NotNull fi.y yVar, @NotNull Function1<? super t0, Unit> block) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        t0 t0Var = new t0();
        block.invoke(t0Var);
        yVar.c().a(f295173e, t0Var.y());
        yVar.c().a(f295174f, t0Var.z());
        yVar.c().a(f295176h, t0Var.t());
        yVar.c().a(f295172d, Integer.valueOf(t0Var.u()));
        yVar.c().a(f295175g, t0Var.v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object x(io.ktor.client.statement.c cVar, kotlin.coroutines.d<? super Boolean> dVar) {
        return q.g(cVar) ? io.ktor.utils.io.h.b.a(cVar.c(), 0, dVar, 1, null) : kotlin.coroutines.jvm.internal.b.a(false);
    }
}
