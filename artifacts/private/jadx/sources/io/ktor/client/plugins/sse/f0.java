package io.ktor.client.plugins.sse;

import io.sentry.na;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.s2;
import kotlinx.coroutines.u2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.l(message = "It should be marked with `@InternalAPI`, please use `ClientSSESession` instead")
public final class f0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private io.ktor.utils.io.h f295033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f295034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private String f295035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f295036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f295037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f295038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f295039g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f295040h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final fi.y f295041i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final io.ktor.client.c f295042j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private kotlinx.coroutines.flow.i<li.a> f295043k;

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.sse.DefaultClientSSESession$_incoming$1", f = "DefaultClientSSESession.kt", i = {0, 1, 2}, l = {48, 53, com.planner5d.library.engine.input.f.b.f160707m}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.flow.j<? super li.a>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f295044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f295045b;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = f0.this.new a(dVar);
            aVar.f295045b = obj;
            return aVar;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x005d  */
        /* JADX WARN: Code duplicated, block: B:21:0x006f  */
        /* JADX WARN: Code duplicated, block: B:24:0x0078  */
        /* JADX WARN: Code duplicated, block: B:25:0x007c  */
        /* JADX WARN: Code duplicated, block: B:27:0x0087  */
        /* JADX WARN: Code duplicated, block: B:29:0x0090  */
        /* JADX WARN: Code duplicated, block: B:38:0x00b3 A[PHI: r9
          0x00b3: PHI (r9v3 kotlinx.coroutines.flow.j) = (r9v9 kotlinx.coroutines.flow.j), (r9v10 kotlinx.coroutines.flow.j) binds: [B:24:0x0078, B:17:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:40:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:44:0x00d4  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a5 -> B:16:0x0050). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00c8 -> B:14:0x0040). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00cb -> B:14:0x0040). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 216
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.sse.f0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.flow.j<? super li.a> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.sse.DefaultClientSSESession$_incoming$2", f = "DefaultClientSSESession.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nDefaultClientSSESession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultClientSSESession.kt\nio/ktor/client/plugins/sse/DefaultClientSSESession$_incoming$2\n+ 2 Logger.kt\nio/ktor/util/logging/LoggerKt\n*L\n1#1,225:1\n37#2,2:226\n*S KotlinDebug\n*F\n+ 1 DefaultClientSSESession.kt\nio/ktor/client/plugins/sse/DefaultClientSSESession$_incoming$2\n*L\n69#1:226,2\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.flow.j<? super li.a>, Throwable, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f295047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f295048b;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(3, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f295047a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            Throwable th2 = (Throwable) this.f295048b;
            if (th2 instanceof CancellationException) {
                return Unit.f312394a;
            }
            org.slf4j.c cVarF = m0.f();
            if (pi.b.a(cVarF)) {
                cVarF.J("Error during SSE session processing: " + th2);
            }
            f0.this.y();
            throw th2;
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.flow.j<? super li.a> jVar, Throwable th2, kotlin.coroutines.d<? super Unit> dVar) {
            b bVar = f0.this.new b(dVar);
            bVar.f295048b = th2;
            return bVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.sse.DefaultClientSSESession$_incoming$3", f = "DefaultClientSSESession.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.flow.j<? super li.a>, Throwable, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f295050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f295051b;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(3, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f295050a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            if (((Throwable) this.f295051b) instanceof CancellationException) {
                f0.this.y();
            }
            return Unit.f312394a;
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.flow.j<? super li.a> jVar, Throwable th2, kotlin.coroutines.d<? super Unit> dVar) {
            c cVar = f0.this.new c(dVar);
            cVar.f295051b = th2;
            return cVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.sse.DefaultClientSSESession$doReconnection$2", f = "DefaultClientSSESession.kt", i = {0, 1, 1}, l = {com.planner5d.library.engine.input.f.b.f160706l1, 102}, m = "invokeSuspend", n = {"retries", "retries", "reconnectionRequest"}, s = {"L$0", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nDefaultClientSSESession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultClientSSESession.kt\nio/ktor/client/plugins/sse/DefaultClientSSESession$doReconnection$2\n+ 2 Logger.kt\nio/ktor/util/logging/LoggerKt\n*L\n1#1,225:1\n37#2,2:226\n37#2,2:228\n37#2,2:230\n37#2,2:232\n*S KotlinDebug\n*F\n+ 1 DefaultClientSSESession.kt\nio/ktor/client/plugins/sse/DefaultClientSSESession$doReconnection$2\n*L\n98#1:226,2\n103#1:228,2\n114#1:230,2\n119#1:232,2\n*E\n"})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f295053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f295054b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f295055c;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f0.this.new d(dVar);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0082 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:7:0x001a, B:28:0x00d2, B:30:0x00e2, B:31:0x00fe, B:33:0x0112, B:34:0x011a, B:19:0x004d, B:22:0x006d, B:24:0x0082, B:25:0x00be, B:14:0x0032), top: B:49:0x000b }] */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00cf, code lost:
        
            if (r10 == r0) goto L27;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:24:0x0082, please report this as an issue */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00cf -> B:28:0x00d2). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 410
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.sse.f0.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.sse.DefaultClientSSESession", f = "DefaultClientSSESession.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2}, l = {153, 155, 204}, m = "parseEvent", n = {"$this$parseEvent", "data", na.b.f305946d, "curRetry", "lastEventId", "wasData", "wasComments", "$this$parseEvent", "data", na.b.f305946d, "curRetry", "lastEventId", "wasData", "wasComments", "$this$parseEvent", "data", na.b.f305946d, "eventType", "curRetry", "lastEventId", "wasData", "wasComments"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f295057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f295058b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f295059c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f295060d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f295061e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f295062f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f295063g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f295064h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f295065i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f295067k;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f295065i = obj;
            this.f295067k |= Integer.MIN_VALUE;
            return f0.this.E(null, this);
        }
    }

    public f0(@NotNull i0 content, @NotNull io.ktor.utils.io.h input, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f295033a = input;
        this.f295034b = coroutineContext;
        this.f295036d = kotlin.time.c.f0(content.n());
        this.f295037e = content.o();
        this.f295038f = content.p();
        int iM = content.m();
        this.f295039g = iM;
        this.f295040h = iM > 0;
        fi.y yVarL = content.l();
        this.f295041i = yVarL;
        this.f295042j = (io.ktor.client.c) yVarL.c().f(m0.i());
        this.f295043k = kotlinx.coroutines.flow.k.g1(kotlinx.coroutines.flow.k.v(kotlinx.coroutines.flow.k.K0(new a(null)), new b(null)), new c(null));
        s2.A(getCoroutineContext()).E(new Function1() { // from class: io.ktor.client.plugins.sse.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f0.e(this.f295030a, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fi.y A() {
        fi.y yVarQ = new fi.y().q(this.f295041i);
        yVarQ.c().c(a0.H());
        yVarQ.c().a(m0.j(), Boolean.TRUE);
        String str = this.f295035c;
        if (str != null) {
            yVarQ.O().l(com.google.common.net.d.D, str);
        }
        return yVarQ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean B(li.a aVar) {
        return aVar.getData() == null && aVar.getEvent() == null && aVar.getId() == null && aVar.a() == null && aVar.b() != null;
    }

    private final boolean C(li.a aVar) {
        return aVar.getData() == null && aVar.getId() == null && aVar.getEvent() == null && aVar.a() == null && aVar.b() == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean D(li.a aVar) {
        if (aVar.getData() != null || aVar.getEvent() != null || aVar.getId() != null || aVar.b() != null || aVar.a() == null) {
            return false;
        }
        int i10 = 3 >> 1;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:37:0x0103  */
    /* JADX WARN: Code duplicated, block: B:39:0x0109  */
    /* JADX WARN: Code duplicated, block: B:40:0x010e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0116  */
    /* JADX WARN: Code duplicated, block: B:44:0x0126  */
    /* JADX WARN: Code duplicated, block: B:47:0x0141 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x0142  */
    /* JADX WARN: Code duplicated, block: B:49:0x0149  */
    /* JADX WARN: Code duplicated, block: B:51:0x0156  */
    /* JADX WARN: Code duplicated, block: B:52:0x0160  */
    /* JADX WARN: Code duplicated, block: B:54:0x017c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0181  */
    /* JADX WARN: Code duplicated, block: B:58:0x0186  */
    /* JADX WARN: Code duplicated, block: B:61:0x018f  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:70:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:75:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x020e  */
    /* JADX WARN: Code duplicated, block: B:88:0x021a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:89:0x021b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [T, java.lang.Long] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00f0 -> B:31:0x00f4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x020e -> B:14:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object E(io.ktor.utils.io.h r21, kotlin.coroutines.d<? super li.a> r22) {
        /*
            Method dump skipped, instruction units count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.sse.f0.E(io.ktor.utils.io.h, kotlin.coroutines.d):java.lang.Object");
    }

    private final String F(StringBuilder sb2) {
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return StringsKt.j4(string, "\r\n");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(f0 f0Var, Throwable th2) {
        f0Var.y();
        return Unit.f312394a;
    }

    private final void x(StringBuilder sb2, String str) {
        sb2.append(StringsKt.d4(StringsKt.d4(str, ":"), " "));
        sb2.append("\r\n");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y() {
        u2.i(getCoroutineContext(), null, 1, null);
        io.ktor.utils.io.i.a(this.f295033a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object z(kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(getCoroutineContext(), new d(null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    @Override // io.ktor.client.plugins.sse.n0
    @NotNull
    public kotlinx.coroutines.flow.i<li.a> a() {
        return this.f295043k;
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f295034b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f0(@NotNull i0 content, @NotNull io.ktor.utils.io.h input) {
        this(content, input, content.k().plus(u2.c(null, 1, null)).plus(new r0("DefaultClientSSESession")));
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(input, "input");
    }
}
