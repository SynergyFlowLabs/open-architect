package io.ktor.client.plugins;

import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nHttpRedirect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpRedirect.kt\nio/ktor/client/plugins/HttpRedirectKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,121:1\n1#2:122\n*E\n"})
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Set<io.ktor.http.j1> f294796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final org.slf4j.c f294797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final io.ktor.events.a<io.ktor.client.statement.c> f294798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final io.ktor.client.plugins.api.b<e0> f294799d;

    /* synthetic */ class a extends kotlin.jvm.internal.g0 implements Function0<e0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f294800a = new a();

        a() {
            super(0, e0.class, "<init>", "<init>()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final e0 invoke() {
            return new e0();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.HttpRedirectKt$HttpRedirect$2$1", f = "HttpRedirect.kt", i = {0, 0}, l = {com.planner5d.library.engine.input.f.b.f160733u1, 108}, m = "invokeSuspend", n = {"$this$on", "request"}, s = {"L$0", "L$1"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements pj.n<io.ktor.client.plugins.api.q.a, fi.y, kotlin.coroutines.d<? super io.ktor.client.call.b>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f294801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f294802b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f294803c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f294804d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f294805e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ io.ktor.client.plugins.api.d<e0> f294806f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, boolean z11, io.ktor.client.plugins.api.d<e0> dVar, kotlin.coroutines.d<? super b> dVar2) {
            super(3, dVar2);
            this.f294804d = z10;
            this.f294805e = z11;
            this.f294806f = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            fi.y yVar;
            io.ktor.client.plugins.api.q.a aVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f294801a;
            if (i10 == 0) {
                ResultKt.m(obj);
                io.ktor.client.plugins.api.q.a aVar2 = (io.ktor.client.plugins.api.q.a) this.f294802b;
                yVar = (fi.y) this.f294803c;
                this.f294802b = aVar2;
                this.f294803c = yVar;
                this.f294801a = 1;
                Object objC = aVar2.c(yVar, this);
                if (objC != objL) {
                    aVar = aVar2;
                    obj = objC;
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            yVar = (fi.y) this.f294803c;
            aVar = (io.ktor.client.plugins.api.q.a) this.f294802b;
            ResultKt.m(obj);
            fi.y yVar2 = yVar;
            io.ktor.client.call.b bVar = (io.ktor.client.call.b) obj;
            if (this.f294804d && !g0.f294796a.contains(bVar.j().getMethod())) {
                return bVar;
            }
            boolean z10 = this.f294805e;
            io.ktor.client.c cVarB = this.f294806f.b();
            this.f294802b = null;
            this.f294803c = null;
            this.f294801a = 2;
            Object objC2 = g0.c(aVar, yVar2, bVar, z10, cVarB, this);
            return objC2 == objL ? objL : objC2;
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.client.plugins.api.q.a aVar, fi.y yVar, kotlin.coroutines.d<? super io.ktor.client.call.b> dVar) {
            b bVar = new b(this.f294804d, this.f294805e, this.f294806f, dVar);
            bVar.f294802b = aVar;
            bVar.f294803c = yVar;
            return bVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.HttpRedirectKt", f = "HttpRedirect.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {com.planner5d.library.engine.input.f.b.f160715o1}, m = "HttpRedirect$lambda$2$handleCall", n = {"$this$HttpRedirect_u24lambda_u242_u24handleCall", "context", "client", androidx.core.app.w.E0, "requestBuilder", "originProtocol", "originAuthority", "allowHttpsDowngrade"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f294807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f294808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f294809c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f294810d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f294811e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f294812f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f294813g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f294814h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f294815i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f294816j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f294817k;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f294816j = obj;
            this.f294817k |= Integer.MIN_VALUE;
            return g0.c(null, null, null, false, null, this);
        }
    }

    static {
        io.ktor.http.j1.a aVar = io.ktor.http.j1.f295897b;
        f294796a = SetsKt.setOf((Object[]) new io.ktor.http.j1[]{aVar.c(), aVar.d()});
        f294797b = pi.a.a("io.ktor.client.plugins.HttpRedirect");
        f294798c = new io.ktor.events.a<>();
        f294799d = io.ktor.client.plugins.api.i.b("HttpRedirect", a.f294800a, new Function1() { // from class: io.ktor.client.plugins.f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.b((io.ktor.client.plugins.api.d) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(io.ktor.client.plugins.api.d createClientPlugin) {
        Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        createClientPlugin.g(io.ktor.client.plugins.api.q.f294412a, new b(((e0) createClientPlugin.f()).b(), ((e0) createClientPlugin.f()).a(), createClientPlugin, null));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:20:0x0112  */
    /* JADX WARN: Code duplicated, block: B:22:0x011b  */
    /* JADX WARN: Code duplicated, block: B:30:0x015d  */
    /* JADX WARN: Code duplicated, block: B:33:0x019e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x019f  */
    /* JADX WARN: Code duplicated, block: B:37:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:39:0x01be  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [io.ktor.client.plugins.api.q$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r14v2, types: [T, fi.y] */
    /* JADX WARN: Type inference failed for: r19v0, types: [T, io.ktor.client.call.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [T] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r6v0, types: [T] */
    /* JADX WARN: Type inference failed for: r6v1, types: [fi.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x019f -> B:35:0x01a7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(io.ktor.client.plugins.api.q.a r17, fi.y r18, io.ktor.client.call.b r19, boolean r20, io.ktor.client.c r21, kotlin.coroutines.d<? super io.ktor.client.call.b> r22) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.g0.c(io.ktor.client.plugins.api.q$a, fi.y, io.ktor.client.call.b, boolean, io.ktor.client.c, kotlin.coroutines.d):java.lang.Object");
    }

    @NotNull
    public static final io.ktor.client.plugins.api.b<e0> f() {
        return f294799d;
    }

    public static /* synthetic */ void g() {
    }

    @NotNull
    public static final io.ktor.events.a<io.ktor.client.statement.c> h() {
        return f294798c;
    }

    private static final boolean i(io.ktor.http.l1 l1Var) {
        int iH0 = l1Var.H0();
        io.ktor.http.l1.a aVar = io.ktor.http.l1.f295939c;
        return iH0 == aVar.t().H0() || iH0 == aVar.l().H0() || iH0 == aVar.T().H0() || iH0 == aVar.G().H0() || iH0 == aVar.P().H0();
    }
}
