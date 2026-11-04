package io.ktor.client.call;

import fi.f0;
import fi.v;
import fi.w;
import fi.z;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.ktor.utils.io.o0;
import io.sentry.protocol.n;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.ResultKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.reflect.s;
import kotlinx.coroutines.s0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nHttpClientCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpClientCall.kt\nio/ktor/client/call/HttpClientCall\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Attributes.kt\nio/ktor/util/AttributesKt\n+ 4 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,223:1\n1#2:224\n21#3:225\n65#4,18:226\n*S KotlinDebug\n*F\n+ 1 HttpClientCall.kt\nio/ktor/client/call/HttpClientCall\n*L\n138#1:225\n138#1:226,18\n*E\n"})
public class b implements s0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f294240e = new a(0 == true ? 1 : 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f294241f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.a<Object> f294242g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.ktor.client.c f294243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected w f294244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected io.ktor.client.statement.c f294245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f294246d;

    @NotNull
    private volatile /* synthetic */ int received;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.call.b$b, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.call.HttpClientCall", f = "HttpClientCall.kt", i = {}, l = {125}, m = "body", n = {}, s = {})
    static final class C2054b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f294247a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f294249c;

        C2054b(kotlin.coroutines.d<? super C2054b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f294247a = obj;
            this.f294249c |= Integer.MIN_VALUE;
            return b.this.c(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.call.HttpClientCall", f = "HttpClientCall.kt", i = {0, 1}, l = {96, 99}, m = "bodyNullable", n = {"info", "info"}, s = {"L$0", "L$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f294250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f294251b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f294253d;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f294251b = obj;
            this.f294253d |= Integer.MIN_VALUE;
            return b.this.e(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        s sVarA = null;
        kotlin.reflect.d dVarD = j1.d(Object.class);
        try {
            sVarA = j1.A(Object.class);
        } catch (Throwable unused) {
        }
        f294242g = new io.ktor.util.a<>("CustomResponse", new ri.b(dVarD, sVarA));
        f294241f = AtomicIntegerFieldUpdater.newUpdater(b.class, MetricTracker.Action.RECEIVED);
    }

    public b(@NotNull io.ktor.client.c client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f294243a = client;
        this.received = 0;
    }

    static /* synthetic */ Object m(b bVar, kotlin.coroutines.d<? super io.ktor.utils.io.h> dVar) {
        return bVar.k().c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object c(@NotNull ri.b bVar, @NotNull kotlin.coroutines.d<Object> dVar) {
        C2054b c2054b;
        if (dVar instanceof C2054b) {
            c2054b = (C2054b) dVar;
            int i10 = c2054b.f294249c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2054b.f294249c = i10 - Integer.MIN_VALUE;
            } else {
                c2054b = new C2054b(dVar);
            }
        } else {
            c2054b = new C2054b(dVar);
        }
        Object objE = c2054b.f294247a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c2054b.f294249c;
        if (i11 == 0) {
            ResultKt.m(objE);
            c2054b.f294249c = 1;
            objE = e(bVar, c2054b);
            if (objE == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objE);
        }
        Intrinsics.checkNotNull(objE);
        return objE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
    
        if (r8 == r1) goto L43;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(@org.jetbrains.annotations.NotNull ri.b r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<java.lang.Object> r8) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.call.b.e(ri.b, kotlin.coroutines.d):java.lang.Object");
    }

    protected boolean f() {
        return this.f294246d;
    }

    @NotNull
    public final io.ktor.util.b getAttributes() {
        return j().getAttributes();
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return k().getCoroutineContext();
    }

    @NotNull
    public final io.ktor.client.c i() {
        return this.f294243a;
    }

    @NotNull
    public final w j() {
        w wVar = this.f294244b;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("request");
        return null;
    }

    @NotNull
    public final io.ktor.client.statement.c k() {
        io.ktor.client.statement.c cVar = this.f294245c;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException(n.f306405g);
        return null;
    }

    @Nullable
    protected Object l(@NotNull kotlin.coroutines.d<? super io.ktor.utils.io.h> dVar) {
        return m(this, dVar);
    }

    protected final void n(@NotNull w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<set-?>");
        this.f294244b = wVar;
    }

    public final void o(@NotNull w request) {
        Intrinsics.checkNotNullParameter(request, "request");
        n(request);
    }

    protected final void p(@NotNull io.ktor.client.statement.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f294245c = cVar;
    }

    public final void q(@NotNull io.ktor.client.statement.c response) {
        Intrinsics.checkNotNullParameter(response, "response");
        p(response);
    }

    @NotNull
    public String toString() {
        return "HttpClientCall[" + j().getUrl() + ", " + k().j() + AbstractJsonLexerKt.END_LIST;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @o0
    public b(@NotNull io.ktor.client.c client, @NotNull z requestData, @NotNull f0 responseData) {
        this(client);
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter(responseData, "responseData");
        n(new v(this, requestData));
        p(new io.ktor.client.statement.a(this, responseData));
        io.ktor.util.b attributes = getAttributes();
        io.ktor.util.a<Object> aVar = f294242g;
        attributes.c(aVar);
        if (responseData.a() instanceof io.ktor.utils.io.h) {
            return;
        }
        getAttributes().a(aVar, responseData.a());
    }
}
