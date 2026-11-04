package okhttp3.internal.connection;

import androidx.core.app.w;
import io.sentry.k4;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.b0;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.p;
import okhttp3.r;
import okhttp3.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nRealCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,551:1\n1#2:552\n608#3,4:553\n615#3,4:557\n615#3,4:561\n608#3,4:565\n350#4,7:569\n*S KotlinDebug\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall\n*L\n269#1:553,4\n344#1:557,4\n348#1:561,4\n375#1:565,4\n378#1:569,7\n*E\n"})
public final class e implements okhttp3.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final b0 f334102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final d0 f334103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f334104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final g f334105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final r f334106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final c f334107f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f334108g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private Object f334109h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private d f334110i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private f f334111j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f334112k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private okhttp3.internal.connection.c f334113l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f334114m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f334115n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f334116o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile boolean f334117s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private volatile okhttp3.internal.connection.c f334118t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    private volatile f f334119v;

    @SourceDebugExtension({"SMAP\nRealCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall$AsyncCall\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,551:1\n615#2,4:552\n409#2,9:556\n*S KotlinDebug\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall$AsyncCall\n*L\n494#1:552,4\n513#1:556,9\n*E\n"})
    public final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final okhttp3.f f334120a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private volatile AtomicInteger f334121b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f334122c;

        public a(@NotNull e eVar, okhttp3.f responseCallback) {
            Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
            this.f334122c = eVar;
            this.f334120a = responseCallback;
            this.f334121b = new AtomicInteger(0);
        }

        public final void a(@NotNull ExecutorService executorService) {
            Intrinsics.checkNotNullParameter(executorService, "executorService");
            p pVarQ = this.f334122c.j().Q();
            if (jk.f.f307490h && Thread.holdsLock(pVarQ)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + pVarQ);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    this.f334122c.u(interruptedIOException);
                    this.f334120a.onFailure(this.f334122c, interruptedIOException);
                    this.f334122c.j().Q().h(this);
                }
            } catch (Throwable th2) {
                this.f334122c.j().Q().h(this);
                throw th2;
            }
        }

        @NotNull
        public final e b() {
            return this.f334122c;
        }

        @NotNull
        public final AtomicInteger c() {
            return this.f334121b;
        }

        @NotNull
        public final String d() {
            return this.f334122c.q().q().F();
        }

        @NotNull
        public final d0 e() {
            return this.f334122c.q();
        }

        public final void f(@NotNull a other) {
            Intrinsics.checkNotNullParameter(other, "other");
            this.f334121b = other.f334121b;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            Throwable th2;
            IOException e10;
            p pVarQ;
            String str = "OkHttp " + this.f334122c.v();
            e eVar = this.f334122c;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(str);
            try {
                eVar.f334107f.A();
                try {
                    try {
                        z10 = true;
                        try {
                            this.f334120a.onResponse(eVar, eVar.r());
                            pVarQ = eVar.j().Q();
                        } catch (IOException e11) {
                            e10 = e11;
                            if (z10) {
                                okhttp3.internal.platform.h.f334560a.g().m("Callback failure for " + eVar.D(), 4, e10);
                            } else {
                                this.f334120a.onFailure(eVar, e10);
                            }
                            pVarQ = eVar.j().Q();
                        } catch (Throwable th3) {
                            th2 = th3;
                            eVar.cancel();
                            if (z10) {
                                throw th2;
                            }
                            IOException iOException = new IOException("canceled due to " + th2);
                            kotlin.p.a(iOException, th2);
                            this.f334120a.onFailure(eVar, iOException);
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        eVar.j().Q().h(this);
                        throw th4;
                    }
                } catch (IOException e12) {
                    z10 = false;
                    e10 = e12;
                } catch (Throwable th5) {
                    z10 = false;
                    th2 = th5;
                }
                pVarQ.h(this);
                threadCurrentThread.setName(name);
            } catch (Throwable th6) {
                threadCurrentThread.setName(name);
                throw th6;
            }
        }
    }

    public static final class b extends WeakReference<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final Object f334123a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull e referent, @Nullable Object obj) {
            super(referent);
            Intrinsics.checkNotNullParameter(referent, "referent");
            this.f334123a = obj;
        }

        @Nullable
        public final Object a() {
            return this.f334123a;
        }
    }

    public static final class c extends okio.j {
        c() {
        }

        @Override // okio.j
        protected void G() {
            e.this.cancel();
        }
    }

    public e(@NotNull b0 client, @NotNull d0 originalRequest, boolean z10) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f334102a = client;
        this.f334103b = originalRequest;
        this.f334104c = z10;
        this.f334105d = client.N().c();
        this.f334106e = client.T().a(this);
        c cVar = new c();
        cVar.k(client.J(), TimeUnit.MILLISECONDS);
        this.f334107f = cVar;
        this.f334108g = new AtomicBoolean();
        this.f334116o = true;
    }

    private final <E extends IOException> E C(E e10) {
        if (this.f334112k || !this.f334107f.B()) {
            return e10;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException(k4.f305718l3);
        if (e10 != null) {
            interruptedIOException.initCause(e10);
        }
        return interruptedIOException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String D() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(isCanceled() ? "canceled " : "");
        sb2.append(this.f334104c ? "web socket" : w.E0);
        sb2.append(" to ");
        sb2.append(v());
        return sb2.toString();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final <E extends IOException> E d(E e10) {
        Socket socketW;
        boolean z10 = jk.f.f307490h;
        if (z10 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        f fVar = this.f334111j;
        if (fVar != null) {
            if (z10 && Thread.holdsLock(fVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + fVar);
            }
            synchronized (fVar) {
                try {
                    socketW = w();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f334111j == null) {
                if (socketW != null) {
                    jk.f.q(socketW);
                }
                this.f334106e.l(this, fVar);
            } else if (socketW != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        E e11 = (E) C(e10);
        if (e10 == null) {
            this.f334106e.d(this);
            return e11;
        }
        r rVar = this.f334106e;
        Intrinsics.checkNotNull(e11);
        rVar.e(this, e11);
        return e11;
    }

    private final void e() {
        this.f334109h = okhttp3.internal.platform.h.f334560a.g().k("response.body().close()");
        this.f334106e.f(this);
    }

    private final okhttp3.a g(v vVar) {
        SSLSocketFactory sSLSocketFactoryK0;
        HostnameVerifier hostnameVerifierX;
        okhttp3.g gVarL;
        if (vVar.G()) {
            sSLSocketFactoryK0 = this.f334102a.k0();
            hostnameVerifierX = this.f334102a.X();
            gVarL = this.f334102a.L();
        } else {
            sSLSocketFactoryK0 = null;
            hostnameVerifierX = null;
            gVarL = null;
        }
        return new okhttp3.a(vVar.F(), vVar.N(), this.f334102a.S(), this.f334102a.j0(), sSLSocketFactoryK0, hostnameVerifierX, gVarL, this.f334102a.f0(), this.f334102a.e0(), this.f334102a.d0(), this.f334102a.O(), this.f334102a.g0());
    }

    @Override // okhttp3.e
    @NotNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public okio.j timeout() {
        return this.f334107f;
    }

    public final void B() {
        if (this.f334112k) {
            throw new IllegalStateException("Check failed.");
        }
        this.f334112k = true;
        this.f334107f.B();
    }

    public final void c(@NotNull f connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (!jk.f.f307490h || Thread.holdsLock(connection)) {
            if (this.f334111j != null) {
                throw new IllegalStateException("Check failed.");
            }
            this.f334111j = connection;
            connection.s().add(new b(this, this.f334109h));
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    @Override // okhttp3.e
    public void cancel() {
        if (this.f334117s) {
            return;
        }
        this.f334117s = true;
        okhttp3.internal.connection.c cVar = this.f334118t;
        if (cVar != null) {
            cVar.b();
        }
        f fVar = this.f334119v;
        if (fVar != null) {
            fVar.i();
        }
        this.f334106e.g(this);
    }

    @Override // okhttp3.e
    @NotNull
    public f0 execute() {
        if (!this.f334108g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f334107f.A();
        e();
        try {
            this.f334102a.Q().d(this);
            f0 f0VarR = r();
            p pVarQ = this.f334102a.Q();
            return f0VarR;
        } finally {
            this.f334102a.Q().i(this);
        }
    }

    @Override // okhttp3.e
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public e mo1616clone() {
        return new e(this.f334102a, this.f334103b, this.f334104c);
    }

    public final void h(@NotNull d0 request, boolean z10) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f334113l != null) {
            throw new IllegalStateException("Check failed.");
        }
        synchronized (this) {
            try {
                if (this.f334115n) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                }
                if (this.f334114m) {
                    throw new IllegalStateException("Check failed.");
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            this.f334110i = new d(this.f334105d, g(request.q()), this, this.f334106e);
        }
    }

    public final void i(boolean z10) {
        okhttp3.internal.connection.c cVar;
        synchronized (this) {
            try {
                if (!this.f334116o) {
                    throw new IllegalStateException("released");
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10 && (cVar = this.f334118t) != null) {
            cVar.d();
        }
        this.f334113l = null;
    }

    @Override // okhttp3.e
    public boolean isCanceled() {
        return this.f334117s;
    }

    @Override // okhttp3.e
    public boolean isExecuted() {
        return this.f334108g.get();
    }

    @NotNull
    public final b0 j() {
        return this.f334102a;
    }

    @Nullable
    public final f k() {
        return this.f334111j;
    }

    @Nullable
    public final f l() {
        return this.f334119v;
    }

    @Override // okhttp3.e
    public void li(@NotNull okhttp3.f responseCallback) {
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        if (!this.f334108g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        e();
        this.f334102a.Q().c(new a(this, responseCallback));
    }

    @NotNull
    public final r n() {
        return this.f334106e;
    }

    public final boolean o() {
        return this.f334104c;
    }

    @Nullable
    public final okhttp3.internal.connection.c p() {
        return this.f334113l;
    }

    @NotNull
    public final d0 q() {
        return this.f334103b;
    }

    @NotNull
    public final f0 r() throws IOException {
        ArrayList arrayList = new ArrayList();
        CollectionsKt.addAll(arrayList, this.f334102a.Y());
        arrayList.add(new okhttp3.internal.http.j(this.f334102a));
        arrayList.add(new okhttp3.internal.http.a(this.f334102a.P()));
        arrayList.add(new okhttp3.internal.cache.a(this.f334102a.I()));
        arrayList.add(okhttp3.internal.connection.a.f334069b);
        if (!this.f334104c) {
            CollectionsKt.addAll(arrayList, this.f334102a.a0());
        }
        arrayList.add(new okhttp3.internal.http.b(this.f334104c));
        try {
            try {
                f0 f0VarC = new okhttp3.internal.http.g(this, arrayList, 0, null, this.f334103b, this.f334102a.M(), this.f334102a.h0(), this.f334102a.m0()).c(this.f334103b);
                if (isCanceled()) {
                    jk.f.o(f0VarC);
                    throw new IOException("Canceled");
                }
                u(null);
                return f0VarC;
            } catch (IOException e10) {
                IOException iOExceptionU = u(e10);
                Intrinsics.checkNotNull(iOExceptionU, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionU;
            }
        } catch (Throwable th2) {
            if (0 == 0) {
                u(null);
            }
            throw th2;
        }
    }

    @Override // okhttp3.e
    @NotNull
    public d0 request() {
        return this.f334103b;
    }

    @NotNull
    public final okhttp3.internal.connection.c s(@NotNull okhttp3.internal.http.g chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        synchronized (this) {
            try {
                if (!this.f334116o) {
                    throw new IllegalStateException("released");
                }
                if (this.f334115n) {
                    throw new IllegalStateException("Check failed.");
                }
                if (this.f334114m) {
                    throw new IllegalStateException("Check failed.");
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        d dVar = this.f334110i;
        Intrinsics.checkNotNull(dVar);
        okhttp3.internal.connection.c cVar = new okhttp3.internal.connection.c(this, this.f334106e, dVar, dVar.a(this.f334102a, chain));
        this.f334113l = cVar;
        this.f334118t = cVar;
        synchronized (this) {
            this.f334114m = true;
            this.f334115n = true;
        }
        if (this.f334117s) {
            throw new IOException("Canceled");
        }
        return cVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0023 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0025 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:8:0x0013, B:17:0x0025, B:19:0x0029, B:20:0x002c, B:22:0x0031, B:27:0x003b, B:29:0x003f, B:34:0x004d, B:14:0x001e), top: B:49:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0029 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:8:0x0013, B:17:0x0025, B:19:0x0029, B:20:0x002c, B:22:0x0031, B:27:0x003b, B:29:0x003f, B:34:0x004d, B:14:0x001e), top: B:49:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0038  */
    public final <E extends IOException> E t(@NotNull okhttp3.internal.connection.c exchange, boolean z10, boolean z11, E e10) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        if (Intrinsics.areEqual(exchange, this.f334118t)) {
            synchronized (this) {
                z12 = false;
                if (z10) {
                    try {
                        if (this.f334114m) {
                            if (z10) {
                                this.f334114m = false;
                            }
                            if (z11) {
                                this.f334115n = false;
                            }
                            z14 = this.f334114m;
                            if (z14) {
                                z15 = false;
                            } else {
                                z15 = false;
                            }
                            if (!z14) {
                                z12 = true;
                            }
                            z13 = z12;
                            z12 = z15;
                        } else if (z11 || !this.f334115n) {
                            z13 = false;
                        } else {
                            if (z10) {
                                this.f334114m = false;
                            }
                            if (z11) {
                                this.f334115n = false;
                            }
                            z14 = this.f334114m;
                            if (z14 || this.f334115n) {
                                z15 = false;
                            } else {
                                z15 = true;
                            }
                            if (!z14 && !this.f334115n && !this.f334116o) {
                                z12 = true;
                            }
                            z13 = z12;
                            z12 = z15;
                        }
                        Unit unit = Unit.f312394a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else {
                    if (z11) {
                    }
                    z13 = false;
                    Unit unit2 = Unit.f312394a;
                }
            }
            if (z12) {
                this.f334118t = null;
                f fVar = this.f334111j;
                if (fVar != null) {
                    fVar.x();
                }
            }
            if (z13) {
                return (E) d(e10);
            }
        }
        return e10;
    }

    @Nullable
    public final IOException u(@Nullable IOException iOException) {
        boolean z10;
        synchronized (this) {
            try {
                z10 = false;
                if (this.f334116o) {
                    this.f334116o = false;
                    if (!this.f334114m && !this.f334115n) {
                        z10 = true;
                    }
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10 ? d(iOException) : iOException;
    }

    @NotNull
    public final String v() {
        return this.f334103b.q().V();
    }

    @Nullable
    public final Socket w() {
        f fVar = this.f334111j;
        Intrinsics.checkNotNull(fVar);
        if (jk.f.f307490h && !Thread.holdsLock(fVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
        }
        List<Reference<e>> listS = fVar.s();
        Iterator<Reference<e>> it = listS.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (Intrinsics.areEqual(it.next().get(), this)) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        listS.remove(i10);
        this.f334111j = null;
        if (listS.isEmpty()) {
            fVar.G(System.nanoTime());
            if (this.f334105d.c(fVar)) {
                return fVar.d();
            }
        }
        return null;
    }

    public final boolean x() {
        d dVar = this.f334110i;
        Intrinsics.checkNotNull(dVar);
        return dVar.e();
    }

    public final void z(@Nullable f fVar) {
        this.f334119v = fVar;
    }
}
