package androidx.work.impl.utils.futures;

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

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
public abstract class a<V> implements t1<V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final boolean f77191d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f77192e = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f77193f = 1000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final b f77194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f77195h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    volatile Object f77196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    volatile e f77197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    volatile i f77198c;

    private static abstract class b {
        private b() {
        }

        abstract boolean a(a<?> future, e expect, e update);

        abstract boolean b(a<?> future, Object expect, Object update);

        abstract boolean c(a<?> future, i expect, i update);

        abstract void d(i waiter, i newValue);

        abstract void e(i waiter, Thread newValue);
    }

    private static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final c f77199c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final c f77200d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f77201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        final Throwable f77202b;

        static {
            if (a.f77191d) {
                f77200d = null;
                f77199c = null;
            } else {
                f77200d = new c(false, null);
                f77199c = new c(true, null);
            }
        }

        c(boolean wasInterrupted, @p0 Throwable cause) {
            this.f77201a = wasInterrupted;
            this.f77202b = cause;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d f77203b = new d(new C0789a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Throwable f77204a;

        /* JADX INFO: renamed from: androidx.work.impl.utils.futures.a$d$a, reason: collision with other inner class name */
        class C0789a extends Throwable {
            C0789a(String message) {
                super(message);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable exception) {
            this.f77204a = (Throwable) a.d(exception);
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final e f77205d = new e(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f77206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f77207b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        e f77208c;

        e(Runnable task, Executor executor) {
            this.f77206a = task;
            this.f77207b = executor;
        }
    }

    private static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, Thread> f77209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, i> f77210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, i> f77211c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f77212d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f77213e;

        f(AtomicReferenceFieldUpdater<i, Thread> waiterThreadUpdater, AtomicReferenceFieldUpdater<i, i> waiterNextUpdater, AtomicReferenceFieldUpdater<a, i> waitersUpdater, AtomicReferenceFieldUpdater<a, e> listenersUpdater, AtomicReferenceFieldUpdater<a, Object> valueUpdater) {
            super();
            this.f77209a = waiterThreadUpdater;
            this.f77210b = waiterNextUpdater;
            this.f77211c = waitersUpdater;
            this.f77212d = listenersUpdater;
            this.f77213e = valueUpdater;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a<?> future, e expect, e update) {
            return androidx.concurrent.futures.b.a(this.f77212d, future, expect, update);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a<?> future, Object expect, Object update) {
            return androidx.concurrent.futures.b.a(this.f77213e, future, expect, update);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a<?> future, i expect, i update) {
            return androidx.concurrent.futures.b.a(this.f77211c, future, expect, update);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i waiter, i newValue) {
            this.f77210b.lazySet(waiter, newValue);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i waiter, Thread newValue) {
            this.f77209a.lazySet(waiter, newValue);
        }
    }

    private static final class g<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a<V> f77214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final t1<? extends V> f77215b;

        g(a<V> owner, t1<? extends V> future) {
            this.f77214a = owner;
            this.f77215b = future;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f77214a.f77196a != this) {
                return;
            }
            if (a.f77194g.b(this.f77214a, this, a.i(this.f77215b))) {
                a.f(this.f77214a);
            }
        }
    }

    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a<?> future, e expect, e update) {
            synchronized (future) {
                try {
                    if (future.f77197b != expect) {
                        return false;
                    }
                    future.f77197b = update;
                    int i10 = 2 & 1;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a<?> future, Object expect, Object update) {
            synchronized (future) {
                try {
                    if (future.f77196a != expect) {
                        return false;
                    }
                    future.f77196a = update;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a<?> future, i expect, i update) {
            synchronized (future) {
                try {
                    if (future.f77198c != expect) {
                        return false;
                    }
                    future.f77198c = update;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i waiter, i newValue) {
            waiter.f77218b = newValue;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i waiter, Thread newValue) {
            waiter.f77217a = newValue;
        }
    }

    private static final class i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final i f77216c = new i(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        volatile Thread f77217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        volatile i f77218b;

        i(boolean unused) {
        }

        void a(i next) {
            a.f77194g.d(this, next);
        }

        void b() {
            Thread thread = this.f77217a;
            if (thread != null) {
                this.f77217a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            a.f77194g.e(this, Thread.currentThread());
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
        f77194g = hVar;
        if (th != null) {
            f77192e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f77195h = new Object();
    }

    protected a() {
    }

    private void a(StringBuilder builder) {
        try {
            Object objJ = j(this);
            builder.append("SUCCESS, result=[");
            builder.append(s(objJ));
            builder.append("]");
        } catch (CancellationException unused) {
            builder.append("CANCELLED");
        } catch (RuntimeException e10) {
            builder.append("UNKNOWN, cause=[");
            builder.append(e10.getClass());
            builder.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            builder.append("FAILURE, cause=[");
            builder.append(e11.getCause());
            builder.append("]");
        }
    }

    private static CancellationException c(@p0 String message, @p0 Throwable cause) {
        CancellationException cancellationException = new CancellationException(message);
        cancellationException.initCause(cause);
        return cancellationException;
    }

    @NonNull
    static <T> T d(@p0 T reference) {
        reference.getClass();
        return reference;
    }

    private e e(e onto) {
        e eVar;
        do {
            eVar = this.f77197b;
        } while (!f77194g.a(this, eVar, e.f77205d));
        while (true) {
            e eVar2 = onto;
            onto = eVar;
            if (onto == null) {
                return eVar2;
            }
            eVar = onto.f77208c;
            onto.f77208c = eVar2;
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
    static void f(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.n();
            aVar.b();
            e eVarE = aVar.e(eVar);
            while (eVarE != null) {
                eVar = eVarE.f77208c;
                Runnable runnable = eVarE.f77206a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f77214a;
                    if (aVar.f77196a == gVar) {
                        if (f77194g.b(aVar, gVar, i(gVar.f77215b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    g(runnable, eVarE.f77207b);
                }
                eVarE = eVar;
            }
            return;
        }
    }

    private static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f77192e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V h(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw c("Task was cancelled.", ((c) obj).f77202b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f77204a);
        }
        if (obj == f77195h) {
            return null;
        }
        return obj;
    }

    static Object i(t1<?> future) {
        if (future instanceof a) {
            Object obj = ((a) future).f77196a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            if (cVar.f77201a) {
                return cVar.f77202b != null ? new c(false, cVar.f77202b) : c.f77200d;
            }
            return obj;
        }
        boolean zIsCancelled = future.isCancelled();
        if ((!f77191d) && zIsCancelled) {
            return c.f77200d;
        }
        try {
            Object objJ = j(future);
            return objJ == null ? f77195h : objJ;
        } catch (CancellationException e10) {
            if (zIsCancelled) {
                return new c(false, e10);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + future, e10));
        } catch (ExecutionException e11) {
            return new d(e11.getCause());
        } catch (Throwable th2) {
            return new d(th2);
        }
    }

    private static <V> V j(Future<V> future) throws ExecutionException {
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

    private void n() {
        i iVar;
        do {
            iVar = this.f77198c;
        } while (!f77194g.c(this, iVar, i.f77216c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f77218b;
        }
    }

    private void o(i node) {
        node.f77217a = null;
        while (true) {
            i iVar = this.f77198c;
            if (iVar == i.f77216c) {
                return;
            }
            i iVar2 = null;
            while (iVar != null) {
                i iVar3 = iVar.f77218b;
                if (iVar.f77217a != null) {
                    iVar2 = iVar;
                } else if (iVar2 != null) {
                    iVar2.f77218b = iVar3;
                    if (iVar2.f77217a == null) {
                    }
                } else if (!f77194g.c(this, iVar, iVar3)) {
                }
                iVar = iVar3;
            }
            return;
        }
    }

    private String s(Object o10) {
        return o10 == this ? "this future" : String.valueOf(o10);
    }

    protected void b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean mayInterruptIfRunning) {
        c cVar;
        Object obj = this.f77196a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f77191d) {
            cVar = new c(mayInterruptIfRunning, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = mayInterruptIfRunning ? c.f77199c : c.f77200d;
        }
        boolean z10 = false;
        while (true) {
            if (f77194g.b(this, obj, cVar)) {
                if (mayInterruptIfRunning) {
                    this.k();
                }
                f(this);
                if (obj instanceof g) {
                    t1<? extends V> t1Var = ((g) obj).f77215b;
                    if (t1Var instanceof a) {
                        this = (a) t1Var;
                        obj = this.f77196a;
                        if ((obj == null) | (obj instanceof g)) {
                            z10 = true;
                        }
                    } else {
                        t1Var.cancel(mayInterruptIfRunning);
                    }
                }
                return true;
            }
            obj = this.f77196a;
            if (!(obj instanceof g)) {
                return z10;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final V get(long timeout, TimeUnit unit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = unit.toNanos(timeout);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f77196a;
        if ((obj != null) && (!(obj instanceof g))) {
            return h(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f77198c;
            if (iVar != i.f77216c) {
                i iVar2 = new i();
                while (true) {
                    iVar2.a(iVar);
                    if (f77194g.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f77196a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        o(iVar2);
                        break;
                    }
                    iVar = this.f77198c;
                    if (iVar == i.f77216c) {
                    }
                }
            }
            return h(this.f77196a);
        }
        while (nanos > 0) {
            Object obj3 = this.f77196a;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return h(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = unit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + timeout + " " + unit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j10 = -nanos;
            long jConvert = unit.convert(j10, TimeUnit.NANOSECONDS);
            long nanos2 = j10 - unit.toNanos(jConvert);
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
        return this.f77196a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f77196a;
        return (!(obj instanceof g)) & (obj != null);
    }

    protected void k() {
    }

    final void l(@p0 Future<?> related) {
        if ((related != null) && isCancelled()) {
            related.cancel(t());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p0
    protected String m() {
        Object obj = this.f77196a;
        if (obj instanceof g) {
            return "setFuture=[" + s(((g) obj).f77215b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // com.google.common.util.concurrent.t1
    public final void m0(Runnable listener, Executor executor) {
        d(listener);
        d(executor);
        e eVar = this.f77197b;
        if (eVar != e.f77205d) {
            e eVar2 = new e(listener, executor);
            do {
                eVar2.f77208c = eVar;
                if (f77194g.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f77197b;
                }
            } while (eVar != e.f77205d);
        }
        g(listener, executor);
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
    protected boolean p(@p0 V v10) {
        if (v10 == null) {
            v10 = (V) f77195h;
        }
        if (!f77194g.b(this, null, v10)) {
            return false;
        }
        f(this);
        return true;
    }

    protected boolean q(Throwable throwable) {
        if (!f77194g.b(this, null, new d((Throwable) d(throwable)))) {
            return false;
        }
        f(this);
        return true;
    }

    protected boolean r(t1<? extends V> future) {
        d dVar;
        d(future);
        Object obj = this.f77196a;
        if (obj == null) {
            if (future.isDone()) {
                if (!f77194g.b(this, null, i(future))) {
                    return false;
                }
                f(this);
                return true;
            }
            g gVar = new g(this, future);
            if (f77194g.b(this, null, gVar)) {
                try {
                    future.m0(gVar, androidx.work.impl.utils.futures.b.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        dVar = new d(th2);
                    } catch (Throwable unused) {
                        dVar = d.f77203b;
                    }
                    f77194g.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f77196a;
        }
        if (obj instanceof c) {
            future.cancel(((c) obj).f77201a);
        }
        return false;
    }

    protected final boolean t() {
        Object obj = this.f77196a;
        return (obj instanceof c) && ((c) obj).f77201a;
    }

    public String toString() {
        String strM;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                strM = m();
            } catch (RuntimeException e10) {
                strM = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strM != null && !strM.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strM);
                sb2.append("]");
            } else if (isDone()) {
                a(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f77196a;
        int i10 = 5 << 0;
        if ((obj2 != null) && (!(obj2 instanceof g))) {
            return h(obj2);
        }
        i iVar = this.f77198c;
        if (iVar != i.f77216c) {
            i iVar2 = new i();
            do {
                iVar2.a(iVar);
                if (f77194g.c(this, iVar, iVar2)) {
                    do {
                        LockSupport.park(this);
                        if (!Thread.interrupted()) {
                            obj = this.f77196a;
                        } else {
                            o(iVar2);
                            throw new InterruptedException();
                        }
                    } while (!((obj != null) & (!(obj instanceof g))));
                    return h(obj);
                }
                iVar = this.f77198c;
            } while (iVar != i.f77216c);
        }
        return h(this.f77196a);
    }
}
