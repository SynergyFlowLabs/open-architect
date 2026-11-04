package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import okhttp3.b0;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.j0;
import okhttp3.k0;
import okhttp3.r;
import okio.m;
import okio.n;
import okio.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nRealWebSocket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealWebSocket.kt\nokhttp3/internal/ws/RealWebSocket\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 4 Util.kt\nokhttp3/internal/Util\n*L\n1#1,654:1\n1#2:655\n84#3,4:656\n90#3,13:664\n608#4,4:660\n*S KotlinDebug\n*F\n+ 1 RealWebSocket.kt\nokhttp3/internal/ws/RealWebSocket\n*L\n269#1:656,4\n512#1:664,13\n457#1:660,4\n*E\n"})
public final class e implements j0, okhttp3.internal.ws.h.a {
    private static final long B = 16777216;
    private static final long C = 60000;
    public static final long D = 1024;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final d0 f334587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final k0 f334588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Random f334589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f334590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private okhttp3.internal.ws.f f334591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f334592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final String f334593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private okhttp3.e f334594h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private okhttp3.internal.concurrent.a f334595i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private okhttp3.internal.ws.h f334596j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private i f334597k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private okhttp3.internal.concurrent.c f334598l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private String f334599m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private d f334600n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final ArrayDeque<o> f334601o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final ArrayDeque<Object> f334602p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f334603q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f334604r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f334605s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private String f334606t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f334607u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f334608v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f334609w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f334610x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f334611y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public static final b f334586z = new b(null);

    @NotNull
    private static final List<c0> A = CollectionsKt.listOf(c0.HTTP_1_1);

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f334612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final o f334613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f334614c;

        public a(int i10, @Nullable o oVar, long j10) {
            this.f334612a = i10;
            this.f334613b = oVar;
            this.f334614c = j10;
        }

        public final long a() {
            return this.f334614c;
        }

        public final int b() {
            return this.f334612a;
        }

        @Nullable
        public final o c() {
            return this.f334613b;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f334615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final o f334616b;

        public c(int i10, @NotNull o data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f334615a = i10;
            this.f334616b = data;
        }

        @NotNull
        public final o a() {
            return this.f334616b;
        }

        public final int b() {
            return this.f334615a;
        }
    }

    public static abstract class d implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f334617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final n f334618b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final m f334619c;

        public d(boolean z10, @NotNull n source, @NotNull m sink) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            this.f334617a = z10;
            this.f334618b = source;
            this.f334619c = sink;
        }

        public final boolean a() {
            return this.f334617a;
        }

        @NotNull
        public final m b() {
            return this.f334619c;
        }

        @NotNull
        public final n c() {
            return this.f334618b;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.ws.e$e, reason: collision with other inner class name */
    private final class C2371e extends okhttp3.internal.concurrent.a {
        public C2371e() {
            super(e.this.f334599m + " writer", false, 2, null);
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            try {
                if (e.this.A()) {
                    return 0L;
                }
            } catch (IOException e10) {
                e.this.n(e10, null);
            }
            return -1L;
        }
    }

    public static final class f implements okhttp3.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0 f334622b;

        f(d0 d0Var) {
            this.f334622b = d0Var;
        }

        @Override // okhttp3.f
        public void onFailure(@NotNull okhttp3.e call, @NotNull IOException e10) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(e10, "e");
            e.this.n(e10, null);
        }

        @Override // okhttp3.f
        public void onResponse(@NotNull okhttp3.e call, @NotNull f0 response) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            okhttp3.internal.connection.c cVarH = response.H();
            try {
                e.this.k(response, cVarH);
                Intrinsics.checkNotNull(cVarH);
                d dVarN = cVarH.n();
                okhttp3.internal.ws.f fVarA = okhttp3.internal.ws.f.f334626g.a(response.Y());
                e.this.f334591e = fVarA;
                if (!e.this.q(fVarA)) {
                    e eVar = e.this;
                    synchronized (eVar) {
                        eVar.f334602p.clear();
                        eVar.close(1010, "unexpected Sec-WebSocket-Extensions in response header");
                    }
                }
                try {
                    e.this.p(jk.f.f307491i + " WebSocket " + this.f334622b.q().V(), dVarN);
                    e.this.o().onOpen(e.this, response);
                    e.this.r();
                } catch (Exception e10) {
                    e.this.n(e10, null);
                }
            } catch (IOException e11) {
                e.this.n(e11, response);
                jk.f.o(response);
                if (cVarH != null) {
                    cVarH.w();
                }
            }
        }
    }

    @SourceDebugExtension({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$schedule$2\n+ 2 RealWebSocket.kt\nokhttp3/internal/ws/RealWebSocket\n*L\n1#1,218:1\n270#2,2:219\n*E\n"})
    public static final class g extends okhttp3.internal.concurrent.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ e f334623e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f334624f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, e eVar, long j10) {
            super(str, false, 2, null);
            this.f334623e = eVar;
            this.f334624f = j10;
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            this.f334623e.B();
            return this.f334624f;
        }
    }

    @SourceDebugExtension({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 RealWebSocket.kt\nokhttp3/internal/ws/RealWebSocket\n*L\n1#1,218:1\n513#2,2:219\n*E\n"})
    public static final class h extends okhttp3.internal.concurrent.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ e f334625e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z10, e eVar) {
            super(str, z10);
            this.f334625e = eVar;
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            this.f334625e.cancel();
            return -1L;
        }
    }

    public e(@NotNull okhttp3.internal.concurrent.d taskRunner, @NotNull d0 originalRequest, @NotNull k0 listener, @NotNull Random random, long j10, @Nullable okhttp3.internal.ws.f fVar, long j11) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(random, "random");
        this.f334587a = originalRequest;
        this.f334588b = listener;
        this.f334589c = random;
        this.f334590d = j10;
        this.f334591e = fVar;
        this.f334592f = j11;
        this.f334598l = taskRunner.j();
        this.f334601o = new ArrayDeque<>();
        this.f334602p = new ArrayDeque<>();
        this.f334605s = -1;
        if (!Intrinsics.areEqual("GET", originalRequest.m())) {
            throw new IllegalArgumentException(("Request must be GET: " + originalRequest.m()).toString());
        }
        o.a aVar = o.f335046d;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        Unit unit = Unit.f312394a;
        boolean z10 = false | false;
        this.f334593g = o.a.p(aVar, bArr, 0, 0, 3, null).n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean q(okhttp3.internal.ws.f fVar) {
        if (!fVar.f334633f && fVar.f334629b == null) {
            return fVar.f334631d == null || new IntRange(8, 15).t(fVar.f334631d.intValue());
        }
        return false;
    }

    private final void w() {
        if (jk.f.f307490h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        okhttp3.internal.concurrent.a aVar = this.f334595i;
        if (aVar != null) {
            okhttp3.internal.concurrent.c.p(this.f334598l, aVar, 0L, 2, null);
        }
    }

    private final synchronized boolean x(o oVar, int i10) {
        try {
            if (!this.f334607u && !this.f334604r) {
                if (this.f334603q + ((long) oVar.v0()) > B) {
                    close(1001, null);
                    return false;
                }
                this.f334603q += (long) oVar.v0();
                this.f334602p.add(new c(i10, oVar));
                w();
                return true;
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean A() throws IOException {
        String str;
        okhttp3.internal.ws.h hVar;
        i iVar;
        int i10;
        d dVar;
        synchronized (this) {
            try {
                if (this.f334607u) {
                    return false;
                }
                i iVar2 = this.f334597k;
                o oVarPoll = this.f334601o.poll();
                Object obj = null;
                if (oVarPoll == null) {
                    Object objPoll = this.f334602p.poll();
                    if (objPoll instanceof a) {
                        i10 = this.f334605s;
                        str = this.f334606t;
                        if (i10 != -1) {
                            dVar = this.f334600n;
                            this.f334600n = null;
                            hVar = this.f334596j;
                            this.f334596j = null;
                            iVar = this.f334597k;
                            this.f334597k = null;
                            this.f334598l.u();
                        } else {
                            long jA = ((a) objPoll).a();
                            this.f334598l.n(new h(this.f334599m + " cancel", true, this), TimeUnit.MILLISECONDS.toNanos(jA));
                            dVar = null;
                            hVar = null;
                            iVar = null;
                        }
                    } else {
                        if (objPoll == null) {
                            return false;
                        }
                        str = null;
                        hVar = null;
                        iVar = null;
                        i10 = -1;
                        dVar = null;
                    }
                    obj = objPoll;
                } else {
                    str = null;
                    hVar = null;
                    iVar = null;
                    i10 = -1;
                    dVar = null;
                }
                Unit unit = Unit.f312394a;
                try {
                    if (oVarPoll != null) {
                        Intrinsics.checkNotNull(iVar2);
                        iVar2.g(oVarPoll);
                    } else if (obj instanceof c) {
                        c cVar = (c) obj;
                        Intrinsics.checkNotNull(iVar2);
                        iVar2.e(cVar.b(), cVar.a());
                        synchronized (this) {
                            try {
                                this.f334603q -= (long) cVar.a().v0();
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        if (!(obj instanceof a)) {
                            throw new AssertionError();
                        }
                        a aVar = (a) obj;
                        Intrinsics.checkNotNull(iVar2);
                        iVar2.c(aVar.b(), aVar.c());
                        if (dVar != null) {
                            k0 k0Var = this.f334588b;
                            Intrinsics.checkNotNull(str);
                            k0Var.onClosed(this, i10, str);
                        }
                    }
                    if (dVar != null) {
                        jk.f.o(dVar);
                    }
                    if (hVar != null) {
                        jk.f.o(hVar);
                    }
                    if (iVar != null) {
                        jk.f.o(iVar);
                    }
                    return true;
                } catch (Throwable th3) {
                    if (dVar != null) {
                        jk.f.o(dVar);
                    }
                    if (hVar != null) {
                        jk.f.o(hVar);
                    }
                    if (iVar != null) {
                        jk.f.o(iVar);
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void B() {
        synchronized (this) {
            try {
                if (this.f334607u) {
                    return;
                }
                i iVar = this.f334597k;
                if (iVar == null) {
                    return;
                }
                int i10 = this.f334611y ? this.f334608v : -1;
                this.f334608v++;
                this.f334611y = true;
                Unit unit = Unit.f312394a;
                if (i10 == -1) {
                    try {
                        iVar.f(o.f335048f);
                        return;
                    } catch (IOException e10) {
                        n(e10, null);
                        return;
                    }
                }
                n(new SocketTimeoutException("sent ping but didn't receive pong within " + this.f334590d + "ms (after " + (i10 - 1) + " successful ping/pongs)"), null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // okhttp3.internal.ws.h.a
    public synchronized void a(@NotNull o payload) {
        try {
            Intrinsics.checkNotNullParameter(payload, "payload");
            if (!this.f334607u && (!this.f334604r || !this.f334602p.isEmpty())) {
                this.f334601o.add(payload);
                w();
                this.f334609w++;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // okhttp3.internal.ws.h.a
    public synchronized void b(@NotNull o payload) {
        try {
            Intrinsics.checkNotNullParameter(payload, "payload");
            this.f334610x++;
            this.f334611y = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // okhttp3.internal.ws.h.a
    public void c(int i10, @NotNull String reason) {
        d dVar;
        okhttp3.internal.ws.h hVar;
        i iVar;
        Intrinsics.checkNotNullParameter(reason, "reason");
        int i11 = 5 | (-1);
        if (i10 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        synchronized (this) {
            try {
                if (this.f334605s != -1) {
                    throw new IllegalStateException("already closed");
                }
                this.f334605s = i10;
                this.f334606t = reason;
                dVar = null;
                if (this.f334604r && this.f334602p.isEmpty()) {
                    d dVar2 = this.f334600n;
                    this.f334600n = null;
                    hVar = this.f334596j;
                    this.f334596j = null;
                    iVar = this.f334597k;
                    this.f334597k = null;
                    this.f334598l.u();
                    dVar = dVar2;
                } else {
                    hVar = null;
                    iVar = null;
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        try {
            this.f334588b.onClosing(this, i10, reason);
            if (dVar != null) {
                this.f334588b.onClosed(this, i10, reason);
            }
            if (dVar != null) {
                jk.f.o(dVar);
            }
        } finally {
            if (dVar != null) {
                jk.f.o(dVar);
            }
            if (hVar != null) {
                jk.f.o(hVar);
            }
            if (iVar != null) {
                jk.f.o(iVar);
            }
        }
    }

    @Override // okhttp3.j0
    public void cancel() {
        okhttp3.e eVar = this.f334594h;
        Intrinsics.checkNotNull(eVar);
        eVar.cancel();
    }

    @Override // okhttp3.j0
    public boolean close(int i10, @Nullable String str) {
        return l(i10, str, 60000L);
    }

    @Override // okhttp3.internal.ws.h.a
    public void d(@NotNull o bytes) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f334588b.onMessage(this, bytes);
    }

    @Override // okhttp3.internal.ws.h.a
    public void e(@NotNull String text) throws IOException {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f334588b.onMessage(this, text);
    }

    public final void j(long j10, @NotNull TimeUnit timeUnit) throws InterruptedException {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f334598l.l().await(j10, timeUnit);
    }

    public final void k(@NotNull f0 response, @Nullable okhttp3.internal.connection.c cVar) throws IOException {
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.E() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.E() + ' ' + response.f0() + '\'');
        }
        String strT = f0.T(response, com.google.common.net.d.f119523o, null, 2, null);
        if (!StringsKt.N1(com.google.common.net.d.N, strT, true)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + strT + '\'');
        }
        String strT2 = f0.T(response, com.google.common.net.d.N, null, 2, null);
        if (!StringsKt.N1("websocket", strT2, true)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + strT2 + '\'');
        }
        String strT3 = f0.T(response, com.google.common.net.d.Y1, null, 2, null);
        String strN = o.f335046d.l(this.f334593g + okhttp3.internal.ws.g.f334635b).s0().n();
        if (Intrinsics.areEqual(strN, strT3)) {
            if (cVar == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strN + "' but was '" + strT3 + '\'');
    }

    public final synchronized boolean l(int i10, @Nullable String str, long j10) {
        o oVarL;
        try {
            okhttp3.internal.ws.g.f334634a.d(i10);
            if (str != null) {
                oVarL = o.f335046d.l(str);
                if (oVarL.v0() > 123) {
                    throw new IllegalArgumentException(("reason.size() > 123: " + str).toString());
                }
            } else {
                oVarL = null;
            }
            if (!this.f334607u && !this.f334604r) {
                this.f334604r = true;
                this.f334602p.add(new a(i10, oVarL, j10));
                w();
                return true;
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void m(@NotNull b0 client) {
        Intrinsics.checkNotNullParameter(client, "client");
        if (this.f334587a.i(com.google.common.net.d.Z1) != null) {
            n(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        b0 b0VarF = client.b0().r(r.f334753b).f0(A).f();
        d0 d0VarB = this.f334587a.n().n(com.google.common.net.d.N, "websocket").n(com.google.common.net.d.f119523o, com.google.common.net.d.N).n(com.google.common.net.d.f119474a2, this.f334593g).n(com.google.common.net.d.f119482c2, "13").n(com.google.common.net.d.Z1, "permessage-deflate").b();
        okhttp3.internal.connection.e eVar = new okhttp3.internal.connection.e(b0VarF, d0VarB, true);
        this.f334594h = eVar;
        Intrinsics.checkNotNull(eVar);
        eVar.li(new f(d0VarB));
    }

    public final void n(@NotNull Exception e10, @Nullable f0 f0Var) {
        Intrinsics.checkNotNullParameter(e10, "e");
        synchronized (this) {
            if (this.f334607u) {
                return;
            }
            this.f334607u = true;
            d dVar = this.f334600n;
            this.f334600n = null;
            okhttp3.internal.ws.h hVar = this.f334596j;
            this.f334596j = null;
            i iVar = this.f334597k;
            this.f334597k = null;
            this.f334598l.u();
            Unit unit = Unit.f312394a;
            try {
                this.f334588b.onFailure(this, e10, f0Var);
                if (dVar != null) {
                    jk.f.o(dVar);
                }
                if (hVar != null) {
                    jk.f.o(hVar);
                }
                if (iVar != null) {
                    jk.f.o(iVar);
                }
            } catch (Throwable th2) {
                if (dVar != null) {
                    jk.f.o(dVar);
                }
                if (hVar != null) {
                    jk.f.o(hVar);
                }
                if (iVar != null) {
                    jk.f.o(iVar);
                }
                throw th2;
            }
        }
    }

    @NotNull
    public final k0 o() {
        return this.f334588b;
    }

    public final void p(@NotNull String name, @NotNull d streams) throws Throwable {
        Throwable th2;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(streams, "streams");
        okhttp3.internal.ws.f fVar = this.f334591e;
        Intrinsics.checkNotNull(fVar);
        synchronized (this) {
            try {
                this.f334599m = name;
                this.f334600n = streams;
                this.f334597k = new i(streams.a(), streams.b(), this.f334589c, fVar.f334628a, fVar.i(streams.a()), this.f334592f);
                this.f334595i = new C2371e();
                long j10 = this.f334590d;
                if (j10 != 0) {
                    try {
                        long nanos = TimeUnit.MILLISECONDS.toNanos(j10);
                        this.f334598l.n(new g(name + " ping", this, nanos), nanos);
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                if (!this.f334602p.isEmpty()) {
                    w();
                }
                Unit unit = Unit.f312394a;
                this.f334596j = new okhttp3.internal.ws.h(streams.a(), streams.c(), this, fVar.f334628a, fVar.i(!streams.a()));
            } catch (Throwable th4) {
                th2 = th4;
            }
        }
    }

    @Override // okhttp3.j0
    public synchronized long queueSize() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f334603q;
    }

    public final void r() throws IOException {
        while (this.f334605s == -1) {
            okhttp3.internal.ws.h hVar = this.f334596j;
            Intrinsics.checkNotNull(hVar);
            hVar.b();
        }
    }

    @Override // okhttp3.j0
    @NotNull
    public d0 request() {
        return this.f334587a;
    }

    public final synchronized boolean s(@NotNull o payload) {
        try {
            Intrinsics.checkNotNullParameter(payload, "payload");
            if (!this.f334607u && (!this.f334604r || !this.f334602p.isEmpty())) {
                this.f334601o.add(payload);
                w();
                return true;
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // okhttp3.j0
    public boolean send(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int i10 = 0 << 1;
        return x(o.f335046d.l(text), 1);
    }

    public final boolean t() throws IOException {
        try {
            okhttp3.internal.ws.h hVar = this.f334596j;
            Intrinsics.checkNotNull(hVar);
            hVar.b();
            return this.f334605s == -1;
        } catch (Exception e10) {
            n(e10, null);
            return false;
        }
    }

    public final synchronized int u() {
        return this.f334609w;
    }

    public final synchronized int v() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f334610x;
    }

    public final synchronized int y() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f334608v;
    }

    public final void z() throws InterruptedException {
        this.f334598l.u();
        this.f334598l.l().await(10L, TimeUnit.SECONDS);
    }

    @Override // okhttp3.j0
    public boolean send(@NotNull o bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return x(bytes, 2);
    }
}
