package io.grpc.stub;

import com.google.common.base.b0;
import com.google.common.base.j0;
import com.google.common.base.r0;
import com.google.common.util.concurrent.t1;
import io.grpc.a3;
import io.grpc.v1;
import io.grpc.w1;
import io.grpc.y2;
import io.grpc.z2;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f290899a = Logger.getLogger(g.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @com.google.common.annotations.e
    static boolean f290900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final io.grpc.e.c<EnumC1987g> f290901c;

    private static final class b<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BlockingQueue<Object> f290902a = new ArrayBlockingQueue(3);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e<T> f290903b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.grpc.k<?, T> f290904c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Object f290905d;

        private final class a extends e<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f290906a;

            a() {
                super();
                this.f290906a = false;
            }

            @Override // io.grpc.k.a
            public void a(y2 y2Var, v1 v1Var) {
                j0.h0(!this.f290906a, "ClientCall already closed");
                if (y2Var.r()) {
                    b.this.f290902a.add(b.this);
                } else {
                    b.this.f290902a.add(y2Var.f(v1Var));
                }
                this.f290906a = true;
            }

            @Override // io.grpc.k.a
            public void b(v1 v1Var) {
            }

            @Override // io.grpc.k.a
            public void c(T t10) {
                j0.h0(!this.f290906a, "ClientCall already closed");
                b.this.f290902a.add(t10);
            }

            @Override // io.grpc.stub.g.e
            void e() {
                b.this.f290904c.e(1);
            }
        }

        b(io.grpc.k<?, T> kVar) {
            this.f290904c = kVar;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x002a  */
        private Object e() throws Throwable {
            Object objTake;
            boolean z10 = false;
            while (true) {
                try {
                    objTake = this.f290902a.take();
                    break;
                } catch (InterruptedException e10) {
                    try {
                        this.f290904c.a("Thread interrupted", e10);
                        z10 = true;
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = true;
                        if (z10) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            return objTake;
        }

        e<T> d() {
            return this.f290903b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Object obj;
            while (true) {
                obj = this.f290905d;
                if (obj != null) {
                    break;
                }
                this.f290905d = e();
            }
            if (!(obj instanceof a3)) {
                return obj != this;
            }
            a3 a3Var = (a3) obj;
            throw a3Var.a().f(a3Var.b());
        }

        @Override // java.util.Iterator
        public T next() {
            Object obj = this.f290905d;
            if (!(obj instanceof a3) && obj != this) {
                this.f290904c.e(1);
            }
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t10 = (T) this.f290905d;
            this.f290905d = null;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private static final class c<ReqT> extends io.grpc.stub.f<ReqT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f290908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.grpc.k<ReqT, ?> f290909b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f290910c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Runnable f290911d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f290912e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f290913f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f290914g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f290915h = false;

        c(io.grpc.k<ReqT, ?> kVar, boolean z10) {
            this.f290909b = kVar;
            this.f290910c = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n() {
            this.f290908a = true;
        }

        @Override // io.grpc.stub.e
        public void b() {
            h(1);
        }

        @Override // io.grpc.stub.f, io.grpc.stub.e
        public boolean c() {
            return this.f290909b.d();
        }

        @Override // io.grpc.stub.f, io.grpc.stub.e
        public void d(int i10) {
            if (this.f290910c || i10 != 1) {
                this.f290909b.e(i10);
            } else {
                this.f290909b.e(2);
            }
        }

        @Override // io.grpc.stub.f, io.grpc.stub.e
        public void e(boolean z10) {
            this.f290909b.g(z10);
        }

        @Override // io.grpc.stub.f, io.grpc.stub.e
        public void f(Runnable runnable) {
            if (this.f290908a) {
                throw new IllegalStateException("Cannot alter onReadyHandler after call started. Use ClientResponseObserver");
            }
            this.f290911d = runnable;
        }

        @Override // io.grpc.stub.f
        public void g(@fj.h String str, @fj.h Throwable th2) {
            this.f290909b.a(str, th2);
        }

        @Override // io.grpc.stub.f
        public void h(int i10) {
            if (this.f290908a) {
                throw new IllegalStateException("Cannot disable auto flow control after call started. Use ClientResponseObserver");
            }
            j0.e(i10 >= 0, "Initial requests must be non-negative");
            this.f290912e = i10;
            this.f290913f = false;
        }

        @Override // io.grpc.stub.m
        public void onCompleted() {
            this.f290909b.c();
            this.f290915h = true;
        }

        @Override // io.grpc.stub.m
        public void onError(Throwable th2) {
            this.f290909b.a("Cancelled by client with StreamObserver.onError()", th2);
            this.f290914g = true;
        }

        @Override // io.grpc.stub.m
        public void onNext(ReqT reqt) {
            j0.h0(!this.f290914g, "Stream was terminated by error, no further calls are allowed");
            j0.h0(!this.f290915h, "Stream is already completed, no further calls are allowed");
            this.f290909b.f(reqt);
        }
    }

    private static final class d<RespT> extends com.google.common.util.concurrent.f<RespT> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final io.grpc.k<?, RespT> f290916i;

        d(io.grpc.k<?, RespT> kVar) {
            this.f290916i = kVar;
        }

        @Override // com.google.common.util.concurrent.f
        protected boolean B(@fj.h RespT respt) {
            return super.B(respt);
        }

        @Override // com.google.common.util.concurrent.f
        protected boolean C(Throwable th2) {
            return super.C(th2);
        }

        @Override // com.google.common.util.concurrent.f
        protected void w() {
            this.f290916i.a("GrpcFuture was cancelled", null);
        }

        @Override // com.google.common.util.concurrent.f
        protected String y() {
            return b0.c(this).f("clientCall", this.f290916i).toString();
        }
    }

    private static abstract class e<T> extends io.grpc.k.a<T> {
        private e() {
        }

        abstract void e();
    }

    private static final class f<ReqT, RespT> extends e<RespT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m<RespT> f290917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c<ReqT> f290918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f290919c;

        f(m<RespT> mVar, c<ReqT> cVar) {
            super();
            this.f290917a = mVar;
            this.f290918b = cVar;
            if (mVar instanceof io.grpc.stub.h) {
                ((io.grpc.stub.h) mVar).a(cVar);
            }
            cVar.n();
        }

        @Override // io.grpc.k.a
        public void a(y2 y2Var, v1 v1Var) {
            if (y2Var.r()) {
                this.f290917a.onCompleted();
            } else {
                this.f290917a.onError(y2Var.f(v1Var));
            }
        }

        @Override // io.grpc.k.a
        public void b(v1 v1Var) {
        }

        @Override // io.grpc.k.a
        public void c(RespT respt) {
            if (this.f290919c && !((c) this.f290918b).f290910c) {
                throw y2.f291464s.u("More than one responses received for unary or client-streaming call").e();
            }
            this.f290919c = true;
            this.f290917a.onNext(respt);
            if (((c) this.f290918b).f290910c && ((c) this.f290918b).f290913f) {
                this.f290918b.d(1);
            }
        }

        @Override // io.grpc.k.a
        public void d() {
            if (((c) this.f290918b).f290911d != null) {
                ((c) this.f290918b).f290911d.run();
            }
        }

        @Override // io.grpc.stub.g.e
        void e() {
            if (((c) this.f290918b).f290912e > 0) {
                c<ReqT> cVar = this.f290918b;
                cVar.d(((c) cVar).f290912e);
            }
        }
    }

    /* JADX INFO: renamed from: io.grpc.stub.g$g, reason: collision with other inner class name */
    enum EnumC1987g {
        BLOCKING,
        FUTURE,
        ASYNC
    }

    private static final class h extends ConcurrentLinkedQueue<Runnable> implements Executor {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Logger f290924b = Logger.getLogger(h.class.getName());

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Object f290925c = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile Object f290926a;

        h() {
        }

        private static void c(Runnable runnable) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                f290924b.log(Level.WARNING, "Runnable threw exception", th2);
            }
        }

        private static void i() throws InterruptedException {
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            add(runnable);
            Object obj = this.f290926a;
            if (obj != f290925c) {
                LockSupport.unpark((Thread) obj);
                return;
            }
            if (remove(runnable) && g.f290900b) {
                throw new RejectedExecutionException();
            }
        }

        public void k() throws InterruptedException {
            Runnable runnablePoll;
            i();
            Runnable runnablePoll2 = poll();
            if (runnablePoll2 == null) {
                this.f290926a = Thread.currentThread();
                while (true) {
                    try {
                        runnablePoll = poll();
                        if (runnablePoll != null) {
                            break;
                        }
                        LockSupport.park(this);
                        i();
                    } catch (Throwable th2) {
                        this.f290926a = null;
                        throw th2;
                    }
                }
                this.f290926a = null;
                runnablePoll2 = runnablePoll;
            }
            do {
                c(runnablePoll2);
                runnablePoll2 = poll();
            } while (runnablePoll2 != null);
        }

        public void shutdown() {
            this.f290926a = f290925c;
            while (true) {
                Runnable runnablePoll = poll();
                if (runnablePoll == null) {
                    return;
                } else {
                    c(runnablePoll);
                }
            }
        }
    }

    private static final class i<RespT> extends e<RespT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d<RespT> f290927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RespT f290928b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f290929c;

        i(d<RespT> dVar) {
            super();
            this.f290929c = false;
            this.f290927a = dVar;
        }

        @Override // io.grpc.k.a
        public void a(y2 y2Var, v1 v1Var) {
            if (!y2Var.r()) {
                this.f290927a.C(y2Var.f(v1Var));
                return;
            }
            if (!this.f290929c) {
                this.f290927a.C(y2.f291464s.u("No value received for unary call").f(v1Var));
            }
            this.f290927a.B(this.f290928b);
        }

        @Override // io.grpc.k.a
        public void b(v1 v1Var) {
        }

        @Override // io.grpc.k.a
        public void c(RespT respt) {
            if (this.f290929c) {
                throw y2.f291464s.u("More than one value received for unary call").e();
            }
            this.f290928b = respt;
            this.f290929c = true;
        }

        @Override // io.grpc.stub.g.e
        void e() {
            ((d) this.f290927a).f290916i.e(2);
        }
    }

    static {
        boolean z10;
        if (r0.d(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE")) || !Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"))) {
            z10 = false;
        } else {
            z10 = true;
            boolean z11 = !false;
        }
        f290900b = z10;
        f290901c = io.grpc.e.c.b("internal-stub-type");
    }

    private g() {
    }

    public static <ReqT, RespT> m<ReqT> a(io.grpc.k<ReqT, RespT> kVar, m<RespT> mVar) {
        j0.F(mVar, "responseObserver");
        return d(kVar, mVar, true);
    }

    public static <ReqT, RespT> m<ReqT> b(io.grpc.k<ReqT, RespT> kVar, m<RespT> mVar) {
        j0.F(mVar, "responseObserver");
        return d(kVar, mVar, false);
    }

    public static <ReqT, RespT> void c(io.grpc.k<ReqT, RespT> kVar, ReqT reqt, m<RespT> mVar) {
        j0.F(mVar, "responseObserver");
        g(kVar, reqt, mVar, true);
    }

    private static <ReqT, RespT> m<ReqT> d(io.grpc.k<ReqT, RespT> kVar, m<RespT> mVar, boolean z10) {
        c cVar = new c(kVar, z10);
        o(kVar, new f(mVar, cVar));
        return cVar;
    }

    public static <ReqT, RespT> void e(io.grpc.k<ReqT, RespT> kVar, ReqT reqt, m<RespT> mVar) {
        j0.F(mVar, "responseObserver");
        g(kVar, reqt, mVar, false);
    }

    private static <ReqT, RespT> void f(io.grpc.k<ReqT, RespT> kVar, ReqT reqt, e<RespT> eVar) {
        o(kVar, eVar);
        try {
            kVar.f(reqt);
            kVar.c();
        } catch (Error | RuntimeException e10) {
            throw l(kVar, e10);
        }
    }

    private static <ReqT, RespT> void g(io.grpc.k<ReqT, RespT> kVar, ReqT reqt, m<RespT> mVar, boolean z10) {
        f(kVar, reqt, new f(mVar, new c(kVar, z10)));
    }

    public static <ReqT, RespT> Iterator<RespT> h(io.grpc.f fVar, w1<ReqT, RespT> w1Var, io.grpc.e eVar, ReqT reqt) {
        io.grpc.k kVarG = fVar.g(w1Var, eVar.u(f290901c, EnumC1987g.BLOCKING));
        b bVar = new b(kVarG);
        f(kVarG, reqt, bVar.d());
        return bVar;
    }

    public static <ReqT, RespT> Iterator<RespT> i(io.grpc.k<ReqT, RespT> kVar, ReqT reqt) {
        b bVar = new b(kVar);
        f(kVar, reqt, bVar.d());
        return bVar;
    }

    public static <ReqT, RespT> RespT j(io.grpc.f fVar, w1<ReqT, RespT> w1Var, io.grpc.e eVar, ReqT reqt) throws Throwable {
        h hVar = new h();
        io.grpc.k kVarG = fVar.g(w1Var, eVar.u(f290901c, EnumC1987g.BLOCKING).r(hVar));
        boolean z10 = false;
        try {
            try {
                t1 t1VarM = m(kVarG, reqt);
                while (!t1VarM.isDone()) {
                    try {
                        hVar.k();
                    } catch (InterruptedException e10) {
                        try {
                            kVarG.a("Thread interrupted", e10);
                            z10 = true;
                        } catch (Error | RuntimeException e11) {
                            e = e11;
                            z10 = true;
                            throw l(kVarG, e);
                        } catch (Throwable th2) {
                            th = th2;
                            z10 = true;
                            if (z10) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    }
                }
                hVar.shutdown();
                RespT respt = (RespT) n(t1VarM);
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                return respt;
            } catch (Error | RuntimeException e12) {
                e = e12;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static <ReqT, RespT> RespT k(io.grpc.k<ReqT, RespT> kVar, ReqT reqt) {
        try {
            return (RespT) n(m(kVar, reqt));
        } catch (Error | RuntimeException e10) {
            throw l(kVar, e10);
        }
    }

    private static RuntimeException l(io.grpc.k<?, ?> kVar, Throwable th2) {
        try {
            kVar.a(null, th2);
        } catch (Error | RuntimeException e10) {
            f290899a.log(Level.SEVERE, "RuntimeException encountered while closing call", e10);
        }
        if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        }
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
        throw new AssertionError(th2);
    }

    public static <ReqT, RespT> t1<RespT> m(io.grpc.k<ReqT, RespT> kVar, ReqT reqt) {
        d dVar = new d(kVar);
        f(kVar, reqt, new i(dVar));
        return dVar;
    }

    private static <V> V n(Future<V> future) {
        try {
            return future.get();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            throw y2.f291451f.u("Thread interrupted").t(e10).e();
        } catch (ExecutionException e11) {
            throw p(e11.getCause());
        }
    }

    private static <ReqT, RespT> void o(io.grpc.k<ReqT, RespT> kVar, e<RespT> eVar) {
        kVar.h(eVar, new v1());
        eVar.e();
    }

    private static a3 p(Throwable th2) {
        for (Throwable cause = (Throwable) j0.F(th2, "t"); cause != null; cause = cause.getCause()) {
            if (cause instanceof z2) {
                z2 z2Var = (z2) cause;
                return new a3(z2Var.a(), z2Var.b());
            }
            if (cause instanceof a3) {
                a3 a3Var = (a3) cause;
                return new a3(a3Var.a(), a3Var.b());
            }
        }
        return y2.f291452g.u("unexpected exception").t(th2).e();
    }
}
