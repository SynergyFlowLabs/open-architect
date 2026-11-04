package androidx.concurrent.futures;

import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import com.google.common.util.concurrent.t1;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public abstract class a<V> implements t1<V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final boolean f43014d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f43015e = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f43016f = 1000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final b f43017g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f43018h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    volatile Object f43019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    volatile e f43020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    volatile i f43021c;

    private static abstract class b {
        private b() {
        }

        abstract boolean a(a<?> aVar, e eVar, e eVar2);

        abstract boolean b(a<?> aVar, Object obj, Object obj2);

        abstract boolean c(a<?> aVar, i iVar, i iVar2);

        abstract void d(i iVar, i iVar2);

        abstract void e(i iVar, Thread thread);
    }

    private static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final c f43022c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final c f43023d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f43024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        final Throwable f43025b;

        static {
            if (a.f43014d) {
                f43023d = null;
                f43022c = null;
            } else {
                f43023d = new c(false, null);
                f43022c = new c(true, null);
            }
        }

        c(boolean z10, @p0 Throwable th2) {
            this.f43024a = z10;
            this.f43025b = th2;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d f43026b = new d(new C0352a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Throwable f43027a;

        /* JADX INFO: renamed from: androidx.concurrent.futures.a$d$a, reason: collision with other inner class name */
        class C0352a extends Throwable {
            C0352a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th2) {
            this.f43027a = (Throwable) a.n(th2);
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final e f43028d = new e(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f43029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f43030b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        e f43031c;

        e(Runnable runnable, Executor executor) {
            this.f43029a = runnable;
            this.f43030b = executor;
        }
    }

    private static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, Thread> f43032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, i> f43033b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, i> f43034c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f43035d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f43036e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f43032a = atomicReferenceFieldUpdater;
            this.f43033b = atomicReferenceFieldUpdater2;
            this.f43034c = atomicReferenceFieldUpdater3;
            this.f43035d = atomicReferenceFieldUpdater4;
            this.f43036e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f43035d, aVar, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f43036e, aVar, obj, obj2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.a(this.f43034c, aVar, iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void d(i iVar, i iVar2) {
            this.f43033b.lazySet(iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void e(i iVar, Thread thread) {
            this.f43032a.lazySet(iVar, thread);
        }
    }

    private static final class g<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a<V> f43037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final t1<? extends V> f43038b;

        g(a<V> aVar, t1<? extends V> t1Var) {
            this.f43037a = aVar;
            this.f43038b = t1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f43037a.f43019a == this) {
                if (a.f43017g.b(this.f43037a, this, a.s(this.f43038b))) {
                    a.p(this.f43037a);
                }
            }
        }
    }

    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f43020b != eVar) {
                        return false;
                    }
                    aVar.f43020b = eVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f43019a != obj) {
                        return false;
                    }
                    aVar.f43019a = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f43021c != iVar) {
                        return false;
                    }
                    aVar.f43021c = iVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        void d(i iVar, i iVar2) {
            iVar.f43041b = iVar2;
        }

        @Override // androidx.concurrent.futures.a.b
        void e(i iVar, Thread thread) {
            iVar.f43040a = thread;
        }
    }

    private static final class i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final i f43039c = new i(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        volatile Thread f43040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        volatile i f43041b;

        i(boolean z10) {
        }

        void a(i iVar) {
            a.f43017g.d(this, iVar);
        }

        void b() {
            Thread thread = this.f43040a;
            if (thread != null) {
                this.f43040a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            a.f43017g.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, androidx.media3.exoplayer.upstream.h.f65998l), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, androidx.media3.exoplayer.upstream.h.f65998l));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            hVar = new h();
        }
        f43017g = hVar;
        if (th != null) {
            f43015e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f43018h = new Object();
    }

    protected a() {
    }

    private void D(i iVar) {
        iVar.f43040a = null;
        loop0: while (true) {
            i iVar2 = this.f43021c;
            if (iVar2 != i.f43039c) {
                i iVar3 = null;
                while (true) {
                    if (iVar2 == null) {
                        break loop0;
                    }
                    i iVar4 = iVar2.f43041b;
                    if (iVar2.f43040a != null) {
                        iVar3 = iVar2;
                    } else if (iVar3 != null) {
                        iVar3.f43041b = iVar4;
                        if (iVar3.f43040a == null) {
                            break;
                        }
                    } else if (!f43017g.c(this, iVar2, iVar4)) {
                        break;
                    }
                    iVar2 = iVar4;
                }
            } else {
                break;
            }
        }
    }

    private String L(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    private void b(StringBuilder sb2) {
        try {
            Object objT = t(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(L(objT));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append("]");
        }
    }

    private static CancellationException l(@p0 String str, @p0 Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    @NonNull
    static <T> T n(@p0 T t10) {
        t10.getClass();
        return t10;
    }

    private e o(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f43020b;
        } while (!f43017g.a(this, eVar2, e.f43028d));
        while (true) {
            e eVar3 = eVar;
            eVar = eVar2;
            if (eVar == null) {
                return eVar3;
            }
            eVar2 = eVar.f43031c;
            eVar.f43031c = eVar3;
        }
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
    static void p(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.z();
            aVar.k();
            e eVarO = aVar.o(eVar);
            while (eVarO != null) {
                eVar = eVarO.f43031c;
                Runnable runnable = eVarO.f43029a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f43037a;
                    if (aVar.f43019a == gVar) {
                        if (f43017g.b(aVar, gVar, s(gVar.f43038b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    q(runnable, eVarO.f43030b);
                }
                eVarO = eVar;
            }
            return;
        }
    }

    private static void q(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f43015e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V r(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw l("Task was cancelled.", ((c) obj).f43025b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f43027a);
        }
        if (obj == f43018h) {
            return null;
        }
        return obj;
    }

    static Object s(t1<?> t1Var) {
        if (t1Var instanceof a) {
            Object obj = ((a) t1Var).f43019a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            if (cVar.f43024a) {
                return cVar.f43025b != null ? new c(false, cVar.f43025b) : c.f43023d;
            }
            return obj;
        }
        boolean zIsCancelled = t1Var.isCancelled();
        if ((!f43014d) && zIsCancelled) {
            return c.f43023d;
        }
        try {
            Object objT = t(t1Var);
            return objT == null ? f43018h : objT;
        } catch (CancellationException e10) {
            if (zIsCancelled) {
                return new c(false, e10);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + t1Var, e10));
        } catch (ExecutionException e11) {
            return new d(e11.getCause());
        } catch (Throwable th2) {
            return new d(th2);
        }
    }

    @b1({b1.a.LIBRARY_GROUP})
    static <V> V t(Future<V> future) throws ExecutionException {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    private void z() {
        i iVar;
        do {
            iVar = this.f43021c;
        } while (!f43017g.c(this, iVar, i.f43039c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f43041b;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
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
    public boolean E(@p0 V v10) {
        if (v10 == null) {
            v10 = (V) f43018h;
        }
        if (!f43017g.b(this, null, v10)) {
            return false;
        }
        p(this);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean H(Throwable th2) {
        if (!f43017g.b(this, null, new d((Throwable) n(th2)))) {
            return false;
        }
        p(this);
        return true;
    }

    protected boolean I(t1<? extends V> t1Var) {
        d dVar;
        n(t1Var);
        Object obj = this.f43019a;
        if (obj == null) {
            if (t1Var.isDone()) {
                if (!f43017g.b(this, null, s(t1Var))) {
                    return false;
                }
                p(this);
                return true;
            }
            g gVar = new g(this, t1Var);
            if (f43017g.b(this, null, gVar)) {
                try {
                    t1Var.m0(gVar, androidx.concurrent.futures.d.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        dVar = new d(th2);
                    } catch (Throwable unused) {
                        dVar = d.f43026b;
                    }
                    f43017g.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f43019a;
        }
        if (obj instanceof c) {
            t1Var.cancel(((c) obj).f43024a);
        }
        return false;
    }

    protected final boolean M() {
        Object obj = this.f43019a;
        return (obj instanceof c) && ((c) obj).f43024a;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        c cVar;
        Object obj = this.f43019a;
        int i10 = 6 << 0;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f43014d) {
            cVar = new c(z10, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z10 ? c.f43022c : c.f43023d;
        }
        boolean z11 = false;
        while (true) {
            if (f43017g.b(this, obj, cVar)) {
                if (z10) {
                    this.v();
                }
                p(this);
                if (obj instanceof g) {
                    t1<? extends V> t1Var = ((g) obj).f43038b;
                    if (t1Var instanceof a) {
                        this = (a) t1Var;
                        obj = this.f43019a;
                        if ((obj == null) | (obj instanceof g)) {
                            z11 = true;
                        }
                    } else {
                        t1Var.cancel(z10);
                    }
                }
                return true;
            }
            obj = this.f43019a;
            if (!(obj instanceof g)) {
                return z11;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f43019a;
        if ((obj != null) && (!(obj instanceof g))) {
            return r(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f43021c;
            if (iVar != i.f43039c) {
                i iVar2 = new i();
                while (true) {
                    iVar2.a(iVar);
                    if (f43017g.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                D(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f43019a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return r(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        D(iVar2);
                        break;
                    }
                    iVar = this.f43021c;
                    if (iVar == i.f43039c) {
                    }
                }
            }
            return r(this.f43019a);
        }
        while (nanos > 0) {
            Object obj3 = this.f43019a;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return r(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z10 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z10) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z10) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f43019a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f43019a;
        return (!(obj instanceof g)) & (obj != null);
    }

    protected void k() {
    }

    @Override // com.google.common.util.concurrent.t1
    public final void m0(Runnable runnable, Executor executor) {
        n(runnable);
        n(executor);
        e eVar = this.f43020b;
        if (eVar != e.f43028d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f43031c = eVar;
                if (f43017g.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f43020b;
                }
            } while (eVar != e.f43028d);
        }
        q(runnable, executor);
    }

    public String toString() {
        String strX;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            b(sb2);
        } else {
            try {
                strX = x();
            } catch (RuntimeException e10) {
                strX = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strX != null && !strX.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strX);
                sb2.append("]");
            } else if (isDone()) {
                b(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    protected void v() {
    }

    final void w(@p0 Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(M());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p0
    protected String x() {
        Object obj = this.f43019a;
        if (obj instanceof g) {
            return "setFuture=[" + L(((g) obj).f43038b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f43019a;
        if ((obj2 != null) & (!(obj2 instanceof g))) {
            return r(obj2);
        }
        i iVar = this.f43021c;
        if (iVar != i.f43039c) {
            i iVar2 = new i();
            do {
                iVar2.a(iVar);
                if (f43017g.c(this, iVar, iVar2)) {
                    do {
                        LockSupport.park(this);
                        if (!Thread.interrupted()) {
                            obj = this.f43019a;
                        } else {
                            D(iVar2);
                            throw new InterruptedException();
                        }
                    } while (!((obj != null) & (!(obj instanceof g))));
                    return r(obj);
                }
                iVar = this.f43021c;
            } while (iVar != i.f43039c);
        }
        return r(this.f43019a);
    }
}
