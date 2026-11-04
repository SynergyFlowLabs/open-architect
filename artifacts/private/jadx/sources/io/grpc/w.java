package io.grpc;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
@h
public class w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f291347e = 1000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final f f291349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final e2.d<k<?>, Object> f291350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f291351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Logger f291346d = Logger.getLogger(w.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final w f291348f = new w();

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f291352a;

        a(Runnable runnable) {
            this.f291352a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            w wVarB = w.this.b();
            try {
                this.f291352a.run();
            } finally {
                w.this.j(wVarB);
            }
        }
    }

    final class b implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Executor f291354a;

        b(Executor executor) {
            this.f291354a = executor;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f291354a.execute(w.g().j0(runnable));
        }
    }

    final class c implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Executor f291355a;

        c(Executor executor) {
            this.f291355a = executor;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f291355a.execute(w.this.j0(runnable));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [C] */
    class d<C> implements Callable<C> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callable f291357a;

        d(Callable callable) {
            this.f291357a = callable;
        }

        @Override // java.util.concurrent.Callable
        public C call() throws Exception {
            w wVarB = w.this.b();
            try {
                C c10 = (C) this.f291357a.call();
                w.this.j(wVarB);
                return c10;
            } catch (Throwable th2) {
                w.this.j(wVarB);
                throw th2;
            }
        }
    }

    @interface e {
    }

    public static final class f extends w implements Closeable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final y f291359g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final w f291360h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ArrayList<j> f291361i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private g f291362j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Throwable f291363k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private ScheduledFuture<?> f291364l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f291365m;

        class a implements g {
            a() {
            }

            @Override // io.grpc.w.g
            public void a(w wVar) {
                f.this.y0(wVar.e());
            }
        }

        final class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    f.this.y0(new TimeoutException("context timed out"));
                } catch (Throwable th2) {
                    w.f291346d.log(Level.SEVERE, "Cancel threw an exception, which should not happen", th2);
                }
            }
        }

        /* synthetic */ f(w wVar, a aVar) {
            this(wVar);
        }

        private void H0() {
            synchronized (this) {
                try {
                    ArrayList<j> arrayList = this.f291361i;
                    if (arrayList == null) {
                        return;
                    }
                    g gVar = this.f291362j;
                    this.f291362j = null;
                    this.f291361i = null;
                    for (j jVar : arrayList) {
                        if (jVar.f291372c == this) {
                            jVar.b();
                        }
                    }
                    for (j jVar2 : arrayList) {
                        if (jVar2.f291372c != this) {
                            jVar2.b();
                        }
                    }
                    f fVar = this.f291349a;
                    if (fVar != null) {
                        fVar.E(gVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void M0(g gVar, w wVar) {
            synchronized (this) {
                try {
                    ArrayList<j> arrayList = this.f291361i;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            j jVar = this.f291361i.get(size);
                            if (jVar.f291371b == gVar && jVar.f291372c == wVar) {
                                this.f291361i.remove(size);
                                break;
                            }
                        }
                        if (this.f291361i.isEmpty()) {
                            f fVar = this.f291349a;
                            if (fVar != null) {
                                fVar.E(this.f291362j);
                            }
                            this.f291362j = null;
                            this.f291361i = null;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void O0(y yVar, ScheduledExecutorService scheduledExecutorService) {
            if (yVar.n()) {
                y0(new TimeoutException("context timed out"));
                return;
            }
            synchronized (this) {
                try {
                    this.f291364l = yVar.q(new b(), scheduledExecutorService);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void x0(j jVar) {
            synchronized (this) {
                try {
                    if (q()) {
                        jVar.b();
                    } else {
                        ArrayList<j> arrayList = this.f291361i;
                        if (arrayList == null) {
                            ArrayList<j> arrayList2 = new ArrayList<>();
                            this.f291361i = arrayList2;
                            arrayList2.add(jVar);
                            if (this.f291349a != null) {
                                a aVar = new a();
                                this.f291362j = aVar;
                                this.f291349a.x0(new j(i.INSTANCE, aVar, this));
                            }
                        } else {
                            arrayList.add(jVar);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void B0(w wVar, Throwable th2) {
            try {
                j(wVar);
                y0(th2);
            } catch (Throwable th3) {
                y0(th2);
                throw th3;
            }
        }

        @Override // io.grpc.w
        public void E(g gVar) {
            M0(gVar, this);
        }

        @Override // io.grpc.w
        public void a(g gVar, Executor executor) {
            w.f(gVar, "cancellationListener");
            w.f(executor, "executor");
            x0(new j(executor, gVar, this));
        }

        @Override // io.grpc.w
        public w b() {
            return this.f291360h.b();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            y0(null);
        }

        @Override // io.grpc.w
        public Throwable e() {
            if (q()) {
                return this.f291363k;
            }
            return null;
        }

        @Override // io.grpc.w
        public void j(w wVar) {
            this.f291360h.j(wVar);
        }

        @Override // io.grpc.w
        public y o() {
            return this.f291359g;
        }

        @Override // io.grpc.w
        public boolean q() {
            synchronized (this) {
                try {
                    if (this.f291365m) {
                        return true;
                    }
                    if (!super.q()) {
                        return false;
                    }
                    y0(super.e());
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.grpc.w
        @Deprecated
        public boolean r() {
            return this.f291360h.r();
        }

        @Override // io.grpc.w
        int y() {
            int size;
            synchronized (this) {
                try {
                    ArrayList<j> arrayList = this.f291361i;
                    size = arrayList == null ? 0 : arrayList.size();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return size;
        }

        @e
        public boolean y0(Throwable th2) {
            ScheduledFuture<?> scheduledFuture;
            boolean z10;
            synchronized (this) {
                try {
                    scheduledFuture = null;
                    if (this.f291365m) {
                        z10 = false;
                    } else {
                        z10 = true;
                        this.f291365m = true;
                        ScheduledFuture<?> scheduledFuture2 = this.f291364l;
                        if (scheduledFuture2 != null) {
                            this.f291364l = null;
                            scheduledFuture = scheduledFuture2;
                        }
                        this.f291363k = th2;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            if (z10) {
                H0();
            }
            return z10;
        }

        /* synthetic */ f(w wVar, y yVar, a aVar) {
            this(wVar, yVar);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private f(w wVar) {
            a aVar = null;
            super(wVar, wVar.f291350b, aVar);
            this.f291359g = wVar.o();
            this.f291360h = new w(this, this.f291350b, aVar);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private f(w wVar, y yVar) {
            a aVar = null;
            super(wVar, wVar.f291350b, aVar);
            this.f291359g = yVar;
            this.f291360h = new w(this, this.f291350b, aVar);
        }
    }

    public interface g {
        void a(w wVar);
    }

    @interface h {
    }

    private enum i implements Executor {
        INSTANCE;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Context.DirectExecutor";
        }
    }

    private static final class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Executor f291370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final g f291371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final w f291372c;

        j(Executor executor, g gVar, w wVar) {
            this.f291370a = executor;
            this.f291371b = gVar;
            this.f291372c = wVar;
        }

        void b() {
            try {
                this.f291370a.execute(this);
            } catch (Throwable th2) {
                w.f291346d.log(Level.INFO, "Exception notifying context listener", th2);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f291371b.a(this.f291372c);
        }
    }

    public static final class k<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f291373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T f291374b;

        k(String str) {
            this(str, null);
        }

        public T a() {
            return b(w.g());
        }

        public T b(w wVar) {
            T t10 = (T) e2.a(wVar.f291350b, this);
            return t10 == null ? this.f291374b : t10;
        }

        public String toString() {
            return this.f291373a;
        }

        k(String str, T t10) {
            this.f291373a = (String) w.f(str, "name");
            this.f291374b = t10;
        }
    }

    private static final class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final m f291375a;

        static {
            AtomicReference atomicReference = new AtomicReference();
            f291375a = a(atomicReference);
            Throwable th2 = (Throwable) atomicReference.get();
            if (th2 != null) {
                w.f291346d.log(Level.FINE, "Storage override doesn't exist. Using default", th2);
            }
        }

        private l() {
        }

        private static m a(AtomicReference<? super ClassNotFoundException> atomicReference) {
            try {
                return (m) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(m.class).getConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e10) {
                atomicReference.set(e10);
                return new d3();
            } catch (Exception e11) {
                throw new RuntimeException("Storage override failed to initialize", e11);
            }
        }
    }

    public static abstract class m {
        public abstract w a();

        public abstract void b(w wVar, w wVar2);

        public abstract w c(w wVar);
    }

    /* synthetic */ w(w wVar, e2.d dVar, a aVar) {
        this(wVar, (e2.d<k<?>, Object>) dVar);
    }

    static m I() {
        return l.f291375a;
    }

    private static void N(int i10) {
        if (i10 == 1000) {
            f291346d.log(Level.SEVERE, "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (Throwable) new Exception());
        }
    }

    static f d(w wVar) {
        return wVar instanceof f ? (f) wVar : wVar.f291349a;
    }

    @e
    static <T> T f(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static w g() {
        w wVarA = I().a();
        return wVarA == null ? f291348f : wVarA;
    }

    public static Executor h(Executor executor) {
        return new b(executor);
    }

    public static <T> k<T> t(String str) {
        return new k<>(str);
    }

    public static <T> k<T> x(String str, T t10) {
        return new k<>(str, t10);
    }

    public void E(g gVar) {
        f fVar = this.f291349a;
        if (fVar == null) {
            return;
        }
        fVar.M0(gVar, this);
    }

    public void H(Runnable runnable) {
        w wVarB = b();
        try {
            runnable.run();
        } finally {
            j(wVarB);
        }
    }

    public f R() {
        return new f(this, (a) null);
    }

    public f T(y yVar, ScheduledExecutorService scheduledExecutorService) {
        boolean z10;
        f(yVar, "deadline");
        f(scheduledExecutorService, "scheduler");
        y yVarO = o();
        if (yVarO == null || yVarO.compareTo(yVar) > 0) {
            z10 = true;
        } else {
            z10 = false;
            yVar = yVarO;
        }
        f fVar = new f(this, yVar, null);
        if (z10) {
            fVar.O0(yVar, scheduledExecutorService);
        }
        return fVar;
    }

    public f X(long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return T(y.b(j10, timeUnit), scheduledExecutorService);
    }

    public <V> w Y(k<V> kVar, V v10) {
        return new w(this, (e2.d<k<?>, Object>) e2.b(this.f291350b, kVar, v10));
    }

    public void a(g gVar, Executor executor) {
        f(gVar, "cancellationListener");
        f(executor, "executor");
        f fVar = this.f291349a;
        if (fVar == null) {
            return;
        }
        fVar.x0(new j(executor, gVar, this));
    }

    public w b() {
        w wVarC = I().c(this);
        return wVarC == null ? f291348f : wVarC;
    }

    @e
    public <V> V c(Callable<V> callable) throws Exception {
        w wVarB = b();
        try {
            V vCall = callable.call();
            j(wVarB);
            return vCall;
        } catch (Throwable th2) {
            j(wVarB);
            throw th2;
        }
    }

    public <V1, V2> w d0(k<V1> kVar, V1 v10, k<V2> kVar2, V2 v11) {
        return new w(this, (e2.d<k<?>, Object>) e2.b(e2.b(this.f291350b, kVar, v10), kVar2, v11));
    }

    public Throwable e() {
        f fVar = this.f291349a;
        if (fVar == null) {
            return null;
        }
        return fVar.e();
    }

    public <V1, V2, V3> w f0(k<V1> kVar, V1 v10, k<V2> kVar2, V2 v11, k<V3> kVar3, V3 v12) {
        return new w(this, (e2.d<k<?>, Object>) e2.b(e2.b(e2.b(this.f291350b, kVar, v10), kVar2, v11), kVar3, v12));
    }

    public <V1, V2, V3, V4> w g0(k<V1> kVar, V1 v10, k<V2> kVar2, V2 v11, k<V3> kVar3, V3 v12, k<V4> kVar4, V4 v13) {
        return new w(this, (e2.d<k<?>, Object>) e2.b(e2.b(e2.b(e2.b(this.f291350b, kVar, v10), kVar2, v11), kVar3, v12), kVar4, v13));
    }

    public void j(w wVar) {
        f(wVar, "toAttach");
        I().b(this, wVar);
    }

    public Runnable j0(Runnable runnable) {
        return new a(runnable);
    }

    public <C> Callable<C> k0(Callable<C> callable) {
        return new d(callable);
    }

    public Executor l(Executor executor) {
        return new c(executor);
    }

    public w m() {
        return new w(this.f291350b, this.f291351c + 1);
    }

    public y o() {
        f fVar = this.f291349a;
        if (fVar == null) {
            return null;
        }
        return fVar.o();
    }

    public boolean q() {
        f fVar = this.f291349a;
        if (fVar == null) {
            return false;
        }
        return fVar.q();
    }

    boolean r() {
        return g() == this;
    }

    int y() {
        f fVar = this.f291349a;
        if (fVar != null) {
            return fVar.y();
        }
        int i10 = 3 << 0;
        return 0;
    }

    private w(e2.d<k<?>, Object> dVar, int i10) {
        this.f291349a = null;
        this.f291350b = dVar;
        this.f291351c = i10;
        N(i10);
    }

    private w(w wVar, e2.d<k<?>, Object> dVar) {
        this.f291349a = d(wVar);
        this.f291350b = dVar;
        int i10 = wVar.f291351c + 1;
        this.f291351c = i10;
        N(i10);
    }

    private w() {
        this.f291349a = null;
        this.f291350b = null;
        this.f291351c = 0;
        N(0);
    }
}
