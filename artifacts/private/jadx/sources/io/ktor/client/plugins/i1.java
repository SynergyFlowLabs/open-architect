package io.ktor.client.plugins;

import androidx.collection.g3;
import io.ktor.http.t2;
import java.net.SocketTimeoutException;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final org.slf4j.c f294831a = pi.a.a("io.ktor.client.plugins.HttpTimeout");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final io.ktor.client.plugins.api.b<f1> f294832b = io.ktor.client.plugins.api.i.b("HttpTimeout", a.f294833a, new Function1() { // from class: io.ktor.client.plugins.g1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return i1.g((io.ktor.client.plugins.api.d) obj);
        }
    });

    /* synthetic */ class a extends kotlin.jvm.internal.a implements Function0<f1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f294833a = new a();

        a() {
            super(0, f1.class, "<init>", "<init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final f1 invoke() {
            return new f1(null, null, null, 7, null);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.HttpTimeoutKt$HttpTimeout$3$1", f = "HttpTimeout.kt", i = {}, l = {168}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements pj.n<io.ktor.client.plugins.api.q.a, fi.y, kotlin.coroutines.d<? super io.ktor.client.call.b>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f294834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f294835b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f294836c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Long f294837d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Long f294838e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Long f294839f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Long l10, Long l11, Long l12, kotlin.coroutines.d<? super b> dVar) {
            super(3, dVar);
            this.f294837d = l10;
            this.f294838e = l11;
            this.f294839f = l12;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f294834a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            io.ktor.client.plugins.api.q.a aVar = (io.ktor.client.plugins.api.q.a) this.f294835b;
            fi.y yVar = (fi.y) this.f294836c;
            boolean zT = i1.t(yVar);
            e1 e1Var = e1.f294787a;
            f1 f1Var = (f1) yVar.f(e1Var);
            if (f1Var == null && i1.h(this.f294837d, this.f294838e, this.f294839f, zT)) {
                f1 f1Var2 = new f1(null, null, null, 7, null);
                yVar.m(e1Var, f1Var2);
                f1Var = f1Var2;
            }
            if (f1Var != null) {
                Long l10 = this.f294838e;
                Long l11 = this.f294839f;
                Long l12 = this.f294837d;
                Long lC = f1Var.c();
                if (lC != null) {
                    l10 = lC;
                }
                f1Var.f(l10);
                Long lE = f1Var.e();
                if (lE != null) {
                    l11 = lE;
                }
                f1Var.h(l11);
                if (zT) {
                    Long lD = f1Var.d();
                    if (lD != null) {
                        l12 = lD;
                    }
                    f1Var.g(l12);
                    i1.o(aVar, yVar, f1Var.d());
                }
            }
            this.f294835b = null;
            this.f294834a = 1;
            Object objC = aVar.c(yVar, this);
            return objC == objL ? objL : objC;
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.client.plugins.api.q.a aVar, fi.y yVar, kotlin.coroutines.d<? super io.ktor.client.call.b> dVar) {
            b bVar = new b(this.f294837d, this.f294838e, this.f294839f, dVar);
            bVar.f294835b = aVar;
            bVar.f294836c = yVar;
            return bVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.HttpTimeoutKt$applyRequestTimeout$killer$1", f = "HttpTimeout.kt", i = {}, l = {184}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nHttpTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpTimeout.kt\nio/ktor/client/plugins/HttpTimeoutKt$applyRequestTimeout$killer$1\n+ 2 Logger.kt\nio/ktor/util/logging/LoggerKt\n*L\n1#1,314:1\n37#2,2:315\n*S KotlinDebug\n*F\n+ 1 HttpTimeout.kt\nio/ktor/client/plugins/HttpTimeoutKt$applyRequestTimeout$killer$1\n*L\n186#1:315,2\n*E\n"})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f294840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Long f294841b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ fi.y f294842c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p2 f294843d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Long l10, fi.y yVar, p2 p2Var, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f294841b = l10;
            this.f294842c = yVar;
            this.f294843d = p2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f294841b, this.f294842c, this.f294843d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f294840a;
            if (i10 == 0) {
                ResultKt.m(obj);
                long jLongValue = this.f294841b.longValue();
                this.f294840a = 1;
                if (kotlinx.coroutines.d1.b(jLongValue, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            x0 x0Var = new x0(this.f294842c);
            org.slf4j.c cVar = i1.f294831a;
            fi.y yVar = this.f294842c;
            if (pi.b.a(cVar)) {
                cVar.J("Request timeout: " + yVar.i());
            }
            p2 p2Var = this.f294843d;
            String message = x0Var.getMessage();
            Intrinsics.checkNotNull(message);
            s2.g(p2Var, message, x0Var);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @NotNull
    public static final ei.a c(@NotNull fi.z request, @Nullable Throwable th2) {
        Object objC;
        Intrinsics.checkNotNullParameter(request, "request");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connect timeout has expired [url=");
        sb2.append(request.h());
        sb2.append(", connect_timeout=");
        f1 f1Var = (f1) request.c(e1.f294787a);
        if (f1Var == null || (objC = f1Var.c()) == null) {
            objC = "unknown";
        }
        sb2.append(objC);
        sb2.append(" ms]");
        return new ei.a(sb2.toString(), th2);
    }

    @NotNull
    public static final ei.a d(@NotNull String url, @Nullable Long l10, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(url, "url");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connect timeout has expired [url=");
        sb2.append(url);
        sb2.append(", connect_timeout=");
        Object obj = l10;
        if (l10 == null) {
            obj = "unknown";
        }
        sb2.append(obj);
        sb2.append(" ms]");
        return new ei.a(sb2.toString(), th2);
    }

    public static /* synthetic */ ei.a e(fi.z zVar, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        return c(zVar, th2);
    }

    public static /* synthetic */ ei.a f(String str, Long l10, Throwable th2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        return d(str, l10, th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(io.ktor.client.plugins.api.d createClientPlugin) {
        Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        createClientPlugin.g(io.ktor.client.plugins.api.q.f294412a, new b(((f1) createClientPlugin.f()).d(), ((f1) createClientPlugin.f()).c(), ((f1) createClientPlugin.f()).e(), null));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(Long l10, Long l11, Long l12, boolean z10) {
        return ((!z10 || l10 == null) && l11 == null && l12 == null) ? false : true;
    }

    @NotNull
    public static final SocketTimeoutException i(@NotNull fi.z request, @Nullable Throwable th2) {
        Object objE;
        Intrinsics.checkNotNullParameter(request, "request");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Socket timeout has expired [url=");
        sb2.append(request.h());
        sb2.append(", socket_timeout=");
        f1 f1Var = (f1) request.c(e1.f294787a);
        if (f1Var == null || (objE = f1Var.e()) == null) {
            objE = "unknown";
        }
        sb2.append(objE);
        sb2.append("] ms");
        return ei.b.a(sb2.toString(), th2);
    }

    public static /* synthetic */ SocketTimeoutException j(fi.z zVar, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        return i(zVar, th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(kotlinx.coroutines.s0 s0Var, fi.y yVar, Long l10) {
        if (l10 != null && l10.longValue() != Long.MAX_VALUE) {
            final p2 p2VarF = kotlinx.coroutines.k.f(s0Var, new kotlinx.coroutines.r0("request-timeout"), null, new c(l10, yVar, yVar.g(), null), 2, null);
            yVar.g().E(new Function1() { // from class: io.ktor.client.plugins.h1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return i1.p(p2VarF, (Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(p2 p2Var, Throwable th2) {
        p2.a.b(p2Var, null, 1, null);
        return Unit.f312394a;
    }

    @io.ktor.utils.io.o0
    public static final int q(long j10) {
        if (j10 == Long.MAX_VALUE) {
            return 0;
        }
        if (j10 < g3.f12261h) {
            return Integer.MIN_VALUE;
        }
        if (j10 > g3.f12256c) {
            return Integer.MAX_VALUE;
        }
        return (int) j10;
    }

    @io.ktor.utils.io.o0
    public static final long r(long j10) {
        if (j10 == Long.MAX_VALUE) {
            j10 = 0;
        }
        return j10;
    }

    @NotNull
    public static final io.ktor.client.plugins.api.b<f1> s() {
        return f294832b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(fi.y yVar) {
        return (t2.b(yVar.i().o()) || (yVar.d() instanceof fi.u) || (yVar.d() instanceof io.ktor.client.plugins.sse.i0)) ? false : true;
    }

    private static /* synthetic */ void u(fi.y yVar) {
    }

    public static final void v(@NotNull fi.y yVar, @NotNull Function1<? super f1, Unit> block) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        e1 e1Var = e1.f294787a;
        f1 f1Var = new f1(null, null, null, 7, null);
        block.invoke(f1Var);
        yVar.m(e1Var, f1Var);
    }

    @kotlin.a1
    public static final <T> T w(@NotNull Function0<? extends T> block) throws Throwable {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            return block.invoke();
        } catch (CancellationException e10) {
            throw io.ktor.client.utils.i.a(e10);
        }
    }
}
