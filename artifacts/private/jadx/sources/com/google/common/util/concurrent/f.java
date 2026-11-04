package com.google.common.util.concurrent;

import com.google.android.gms.internal.play_billing.q3;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes5.dex */
@o0
@r9.h(r9.h.a.FULL)
@com.google.common.annotations.b(emulated = true)
public abstract class f<V> extends com.google.common.util.concurrent.internal.a implements t1<V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final boolean f119962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final s1 f119963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f119964f = 1000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final b f119965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f119966h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @fj.a
    private volatile Object f119967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @fj.a
    private volatile e f119968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @fj.a
    private volatile l f119969c;

    private static abstract class b {
        private b() {
        }

        abstract boolean a(f<?> future, @fj.a e expect, e update);

        abstract boolean b(f<?> future, @fj.a Object expect, Object update);

        abstract boolean c(f<?> future, @fj.a l expect, @fj.a l update);

        abstract e d(f<?> future, e update);

        abstract l e(f<?> future, l update);

        abstract void f(l waiter, @fj.a l newValue);

        abstract void g(l waiter, Thread newValue);
    }

    private static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @fj.a
        static final c f119970c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @fj.a
        static final c f119971d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f119972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.a
        final Throwable f119973b;

        static {
            if (f.f119962d) {
                f119971d = null;
                f119970c = null;
            } else {
                f119971d = new c(false, null);
                f119970c = new c(true, null);
            }
        }

        c(boolean wasInterrupted, @fj.a Throwable cause) {
            this.f119972a = wasInterrupted;
            this.f119973b = cause;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d f119974b = new d(new a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Throwable f119975a;

        class a extends Throwable {
            a(String message) {
                super(message);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable exception) {
            this.f119975a = (Throwable) com.google.common.base.j0.E(exception);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.f$f, reason: collision with other inner class name */
    private static final class C1117f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<l, Thread> f119980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<l, l> f119981b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<? super f<?>, l> f119982c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<? super f<?>, e> f119983d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<? super f<?>, Object> f119984e;

        C1117f(AtomicReferenceFieldUpdater<l, Thread> waiterThreadUpdater, AtomicReferenceFieldUpdater<l, l> waiterNextUpdater, AtomicReferenceFieldUpdater<? super f<?>, l> waitersUpdater, AtomicReferenceFieldUpdater<? super f<?>, e> listenersUpdater, AtomicReferenceFieldUpdater<? super f<?>, Object> valueUpdater) {
            super();
            this.f119980a = waiterThreadUpdater;
            this.f119981b = waiterNextUpdater;
            this.f119982c = waitersUpdater;
            this.f119983d = listenersUpdater;
            this.f119984e = valueUpdater;
        }

        @Override // com.google.common.util.concurrent.f.b
        boolean a(f<?> future, @fj.a e expect, e update) {
            return androidx.concurrent.futures.b.a(this.f119983d, future, expect, update);
        }

        @Override // com.google.common.util.concurrent.f.b
        boolean b(f<?> future, @fj.a Object expect, Object update) {
            return androidx.concurrent.futures.b.a(this.f119984e, future, expect, update);
        }

        @Override // com.google.common.util.concurrent.f.b
        boolean c(f<?> future, @fj.a l expect, @fj.a l update) {
            return androidx.concurrent.futures.b.a(this.f119982c, future, expect, update);
        }

        @Override // com.google.common.util.concurrent.f.b
        e d(f<?> future, e update) {
            return this.f119983d.getAndSet(future, update);
        }

        @Override // com.google.common.util.concurrent.f.b
        l e(f<?> future, l update) {
            return this.f119982c.getAndSet(future, update);
        }

        @Override // com.google.common.util.concurrent.f.b
        void f(l waiter, @fj.a l newValue) {
            this.f119981b.lazySet(waiter, newValue);
        }

        @Override // com.google.common.util.concurrent.f.b
        void g(l waiter, Thread newValue) {
            this.f119980a.lazySet(waiter, newValue);
        }
    }

    private static final class g<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final f<V> f119985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final t1<? extends V> f119986b;

        g(f<V> owner, t1<? extends V> future) {
            this.f119985a = owner;
            this.f119986b = future;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((f) this.f119985a).f119967a == this) {
                if (f.f119965g.b(this.f119985a, this, f.u(this.f119986b))) {
                    f.r(this.f119985a, false);
                }
            }
        }
    }

    private static final class h extends b {
        private h() {
            super();
        }

        @Override // com.google.common.util.concurrent.f.b
        boolean a(f<?> future, @fj.a e expect, e update) {
            synchronized (future) {
                try {
                    if (((f) future).f119968b != expect) {
                        return false;
                    }
                    ((f) future).f119968b = update;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.f.b
        boolean b(f<?> future, @fj.a Object expect, Object update) {
            synchronized (future) {
                try {
                    if (((f) future).f119967a != expect) {
                        return false;
                    }
                    ((f) future).f119967a = update;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.f.b
        boolean c(f<?> future, @fj.a l expect, @fj.a l update) {
            synchronized (future) {
                try {
                    if (((f) future).f119969c != expect) {
                        return false;
                    }
                    ((f) future).f119969c = update;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.f.b
        e d(f<?> future, e update) {
            e eVar;
            synchronized (future) {
                try {
                    eVar = ((f) future).f119968b;
                    if (eVar != update) {
                        ((f) future).f119968b = update;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return eVar;
        }

        @Override // com.google.common.util.concurrent.f.b
        l e(f<?> future, l update) {
            l lVar;
            synchronized (future) {
                try {
                    lVar = ((f) future).f119969c;
                    if (lVar != update) {
                        ((f) future).f119969c = update;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return lVar;
        }

        @Override // com.google.common.util.concurrent.f.b
        void f(l waiter, @fj.a l newValue) {
            waiter.f119995b = newValue;
        }

        @Override // com.google.common.util.concurrent.f.b
        void g(l waiter, Thread newValue) {
            waiter.f119994a = newValue;
        }
    }

    interface i<V> extends t1<V> {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static abstract class j<V> extends f<V> implements i<V> {
        j() {
        }

        @Override // com.google.common.util.concurrent.f, java.util.concurrent.Future
        @z7.a
        public boolean cancel(boolean mayInterruptIfRunning) {
            return super.cancel(mayInterruptIfRunning);
        }

        @Override // com.google.common.util.concurrent.f, java.util.concurrent.Future
        @d2
        @z7.a
        public V get() throws ExecutionException, InterruptedException {
            return (V) super.get();
        }

        @Override // com.google.common.util.concurrent.f, java.util.concurrent.Future
        public boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.f, java.util.concurrent.Future
        public boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.f, com.google.common.util.concurrent.t1
        public void m0(Runnable listener, Executor executor) {
            super.m0(listener, executor);
        }

        @Override // com.google.common.util.concurrent.f, java.util.concurrent.Future
        @d2
        @z7.a
        public V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (V) super.get(j10, timeUnit);
        }
    }

    private static final class k extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Unsafe f119987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final long f119988b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final long f119989c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final long f119990d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final long f119991e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final long f119992f;

        class a implements PrivilegedExceptionAction<Unsafe> {
            a() {
            }

            @Override // java.security.PrivilegedExceptionAction
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Unsafe run() throws Exception {
                int i10 = 4 ^ 0;
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new a());
                }
                try {
                    f119989c = unsafe.objectFieldOffset(f.class.getDeclaredField("c"));
                    f119988b = unsafe.objectFieldOffset(f.class.getDeclaredField("b"));
                    f119990d = unsafe.objectFieldOffset(f.class.getDeclaredField(androidx.media3.exoplayer.upstream.h.f65998l));
                    f119991e = unsafe.objectFieldOffset(l.class.getDeclaredField(androidx.media3.exoplayer.upstream.h.f65998l));
                    f119992f = unsafe.objectFieldOffset(l.class.getDeclaredField("b"));
                    f119987a = unsafe;
                } catch (NoSuchFieldException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (PrivilegedActionException e11) {
                throw new RuntimeException("Could not initialize intrinsics", e11.getCause());
            }
        }

        private k() {
            super();
        }

        @Override // com.google.common.util.concurrent.f.b
        boolean a(f<?> future, @fj.a e expect, e update) {
            return q3.a(f119987a, future, f119988b, expect, update);
        }

        @Override // com.google.common.util.concurrent.f.b
        boolean b(f<?> future, @fj.a Object expect, Object update) {
            return q3.a(f119987a, future, f119990d, expect, update);
        }

        @Override // com.google.common.util.concurrent.f.b
        boolean c(f<?> future, @fj.a l expect, @fj.a l update) {
            return q3.a(f119987a, future, f119989c, expect, update);
        }

        @Override // com.google.common.util.concurrent.f.b
        e d(f<?> future, e update) {
            e eVar;
            do {
                eVar = ((f) future).f119968b;
                if (update == eVar) {
                    break;
                }
            } while (!a(future, eVar, update));
            return eVar;
        }

        @Override // com.google.common.util.concurrent.f.b
        l e(f<?> future, l update) {
            l lVar;
            do {
                lVar = ((f) future).f119969c;
                if (update == lVar) {
                    break;
                }
            } while (!c(future, lVar, update));
            return lVar;
        }

        @Override // com.google.common.util.concurrent.f.b
        void f(l waiter, @fj.a l newValue) {
            f119987a.putObject(waiter, f119992f, newValue);
        }

        @Override // com.google.common.util.concurrent.f.b
        void g(l waiter, Thread newValue) {
            f119987a.putObject(waiter, f119991e, newValue);
        }
    }

    private static final class l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final l f119993c = new l(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @fj.a
        volatile Thread f119994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.a
        volatile l f119995b;

        l(boolean unused) {
        }

        void a(@fj.a l next) {
            f.f119965g.f(this, next);
        }

        void b() {
            Thread thread = this.f119994a;
            if (thread != null) {
                this.f119994a = null;
                LockSupport.unpark(thread);
            }
        }

        l() {
            f.f119965g.g(this, Thread.currentThread());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.logging.Logger] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.common.util.concurrent.f$a] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v4 */
    static {
        boolean z10;
        Throwable th2;
        b c1117f;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f119962d = z10;
        f119963e = new s1(f.class);
        ?? r10 = 0;
        r10 = 0;
        try {
            c1117f = new k();
            th2 = null;
        } catch (Error | Exception e10) {
            th2 = e10;
            try {
                c1117f = new C1117f(AtomicReferenceFieldUpdater.newUpdater(l.class, Thread.class, androidx.media3.exoplayer.upstream.h.f65998l), AtomicReferenceFieldUpdater.newUpdater(l.class, l.class, "b"), AtomicReferenceFieldUpdater.newUpdater(f.class, l.class, "c"), AtomicReferenceFieldUpdater.newUpdater(f.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, androidx.media3.exoplayer.upstream.h.f65998l));
            } catch (Error | Exception e11) {
                h hVar = new h();
                r10 = e11;
                c1117f = hVar;
            }
        }
        f119965g = c1117f;
        if (r10 != 0) {
            s1 s1Var = f119963e;
            Logger loggerA = s1Var.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", th2);
            s1Var.a().log(level, "SafeAtomicHelper is broken!", r10);
        }
        f119966h = new Object();
    }

    protected f() {
    }

    private void A(l node) {
        node.f119994a = null;
        while (true) {
            l lVar = this.f119969c;
            if (lVar == l.f119993c) {
                return;
            }
            l lVar2 = null;
            while (lVar != null) {
                l lVar3 = lVar.f119995b;
                if (lVar.f119994a != null) {
                    lVar2 = lVar;
                } else if (lVar2 != null) {
                    lVar2.f119995b = lVar3;
                    if (lVar2.f119994a == null) {
                    }
                } else if (!f119965g.c(this, lVar, lVar3)) {
                }
                lVar = lVar3;
            }
            return;
        }
    }

    private void k(StringBuilder builder) {
        try {
            Object objV = v(this);
            builder.append("SUCCESS, result=[");
            n(builder, objV);
            builder.append("]");
        } catch (CancellationException unused) {
            builder.append("CANCELLED");
        } catch (ExecutionException e10) {
            builder.append("FAILURE, cause=[");
            builder.append(e10.getCause());
            builder.append("]");
        } catch (Exception e11) {
            builder.append("UNKNOWN, cause=[");
            builder.append(e11.getClass());
            builder.append(" thrown from get()]");
        }
    }

    private void l(StringBuilder builder) {
        String strC;
        int length = builder.length();
        builder.append("PENDING");
        Object obj = this.f119967a;
        if (obj instanceof g) {
            builder.append(", setFuture=[");
            o(builder, ((g) obj).f119986b);
            builder.append("]");
        } else {
            try {
                strC = com.google.common.base.r0.c(y());
            } catch (Exception | StackOverflowError e10) {
                strC = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strC != null) {
                builder.append(", info=[");
                builder.append(strC);
                builder.append("]");
            }
        }
        if (isDone()) {
            builder.delete(length, builder.length());
            k(builder);
        }
    }

    private void n(StringBuilder builder, @fj.a Object o10) {
        if (o10 == null) {
            builder.append(AbstractJsonLexerKt.NULL);
        } else {
            if (o10 == this) {
                builder.append("this future");
                return;
            }
            builder.append(o10.getClass().getName());
            builder.append("@");
            builder.append(Integer.toHexString(System.identityHashCode(o10)));
        }
    }

    private void o(StringBuilder builder, @fj.a Object o10) {
        try {
            if (o10 == this) {
                builder.append("this future");
            } else {
                builder.append(o10);
            }
        } catch (Exception | StackOverflowError e10) {
            builder.append("Exception thrown from implementation: ");
            builder.append(e10.getClass());
        }
    }

    private static CancellationException p(String message, @fj.a Throwable cause) {
        CancellationException cancellationException = new CancellationException(message);
        cancellationException.initCause(cause);
        return cancellationException;
    }

    @fj.a
    private e q(@fj.a e onto) {
        e eVarD = f119965g.d(this, e.f119976d);
        e eVar = onto;
        while (eVarD != null) {
            e eVar2 = eVarD.f119979c;
            eVarD.f119979c = eVar;
            eVar = eVarD;
            eVarD = eVar2;
        }
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
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
    public static void r(f<?> fVar, boolean z10) {
        e eVar = null;
        while (true) {
            fVar.z();
            if (z10) {
                fVar.w();
                z10 = false;
            }
            fVar.m();
            e eVarQ = fVar.q(eVar);
            while (eVarQ != null) {
                eVar = eVarQ.f119979c;
                Runnable runnable = eVarQ.f119977a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof g) {
                    g gVar = (g) runnable2;
                    fVar = gVar.f119985a;
                    if (((f) fVar).f119967a == gVar) {
                        if (f119965g.b(fVar, gVar, u(gVar.f119986b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = eVarQ.f119978b;
                    Objects.requireNonNull(executor);
                    s(runnable2, executor);
                }
                eVarQ = eVar;
            }
            return;
        }
    }

    private static void s(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f119963e.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d2
    private V t(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw p("Task was cancelled.", ((c) obj).f119973b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f119975a);
        }
        return obj == f119966h ? (V) b2.b() : obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object u(t1<?> future) {
        Throwable thA;
        if (future instanceof i) {
            Object cVar = ((f) future).f119967a;
            if (cVar instanceof c) {
                c cVar2 = (c) cVar;
                if (cVar2.f119972a) {
                    cVar = cVar2.f119973b != null ? new c(false, cVar2.f119973b) : c.f119971d;
                }
            }
            Objects.requireNonNull(cVar);
            return cVar;
        }
        if ((future instanceof com.google.common.util.concurrent.internal.a) && (thA = com.google.common.util.concurrent.internal.b.a((com.google.common.util.concurrent.internal.a) future)) != null) {
            return new d(thA);
        }
        boolean zIsCancelled = future.isCancelled();
        if ((!f119962d) && zIsCancelled) {
            c cVar3 = c.f119971d;
            Objects.requireNonNull(cVar3);
            return cVar3;
        }
        try {
            Object objV = v(future);
            if (!zIsCancelled) {
                return objV == null ? f119966h : objV;
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + future));
        } catch (Error | Exception e10) {
            return new d(e10);
        } catch (CancellationException e11) {
            if (zIsCancelled) {
                return new c(false, e11);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + future, e11));
        } catch (ExecutionException e12) {
            if (!zIsCancelled) {
                return new d(e12.getCause());
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + future, e12));
        }
    }

    @d2
    private static <V> V v(Future<V> future) throws ExecutionException {
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
        for (l lVarE = f119965g.e(this, l.f119993c); lVarE != null; lVarE = lVarE.f119995b) {
            lVarE.b();
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
    @z7.a
    protected boolean B(@d2 V v10) {
        if (v10 == null) {
            v10 = (V) f119966h;
        }
        if (!f119965g.b(this, null, v10)) {
            return false;
        }
        r(this, false);
        return true;
    }

    @z7.a
    protected boolean C(Throwable throwable) {
        if (!f119965g.b(this, null, new d((Throwable) com.google.common.base.j0.E(throwable)))) {
            return false;
        }
        r(this, false);
        return true;
    }

    @z7.a
    protected boolean D(t1<? extends V> future) {
        d dVar;
        com.google.common.base.j0.E(future);
        Object obj = this.f119967a;
        if (obj == null) {
            if (future.isDone()) {
                if (!f119965g.b(this, null, u(future))) {
                    return false;
                }
                r(this, false);
                return true;
            }
            g gVar = new g(this, future);
            if (f119965g.b(this, null, gVar)) {
                try {
                    future.m0(gVar, m0.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        dVar = new d(th2);
                    } catch (Error | Exception unused) {
                        dVar = d.f119974b;
                    }
                    f119965g.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f119967a;
        }
        if (obj instanceof c) {
            future.cancel(((c) obj).f119972a);
        }
        return false;
    }

    protected final boolean E() {
        Object obj = this.f119967a;
        return (obj instanceof c) && ((c) obj).f119972a;
    }

    @Override // com.google.common.util.concurrent.internal.a
    @fj.a
    protected final Throwable a() {
        if (!(this instanceof i)) {
            return null;
        }
        Object obj = this.f119967a;
        if (obj instanceof d) {
            return ((d) obj).f119975a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    @z7.a
    public boolean cancel(boolean mayInterruptIfRunning) {
        c cVar;
        Object obj = this.f119967a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f119962d) {
            cVar = new c(mayInterruptIfRunning, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = mayInterruptIfRunning ? c.f119970c : c.f119971d;
            Objects.requireNonNull(cVar);
        }
        boolean z10 = false;
        while (true) {
            if (f119965g.b(this, obj, cVar)) {
                r(this, mayInterruptIfRunning);
                if (obj instanceof g) {
                    t1<? extends V> t1Var = ((g) obj).f119986b;
                    if (t1Var instanceof i) {
                        this = (f) t1Var;
                        obj = this.f119967a;
                        if ((obj == null) | (obj instanceof g)) {
                            z10 = true;
                        }
                    } else {
                        t1Var.cancel(mayInterruptIfRunning);
                    }
                }
                return true;
            }
            obj = this.f119967a;
            if (!(obj instanceof g)) {
                return z10;
            }
        }
    }

    @Override // java.util.concurrent.Future
    @d2
    @z7.a
    public V get(long timeout, TimeUnit unit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = unit.toNanos(timeout);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f119967a;
        if ((obj != null) && (!(obj instanceof g))) {
            return t(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            l lVar = this.f119969c;
            if (lVar != l.f119993c) {
                l lVar2 = new l();
                while (true) {
                    lVar2.a(lVar);
                    if (f119965g.c(this, lVar, lVar2)) {
                        do {
                            c2.a(this, nanos);
                            if (Thread.interrupted()) {
                                A(lVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f119967a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return t(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        A(lVar2);
                        break;
                    }
                    lVar = this.f119969c;
                    if (lVar == l.f119993c) {
                    }
                }
            }
            Object obj3 = this.f119967a;
            Objects.requireNonNull(obj3);
            return t(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f119967a;
            if ((obj4 != null) && (!(obj4 instanceof g))) {
                return t(obj4);
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
    public boolean isCancelled() {
        return this.f119967a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f119967a;
        return (!(obj instanceof g)) & (obj != null);
    }

    @z7.g
    protected void m() {
    }

    @Override // com.google.common.util.concurrent.t1
    public void m0(Runnable listener, Executor executor) {
        e eVar;
        com.google.common.base.j0.F(listener, "Runnable was null.");
        com.google.common.base.j0.F(executor, "Executor was null.");
        if (!isDone() && (eVar = this.f119968b) != e.f119976d) {
            e eVar2 = new e(listener, executor);
            do {
                eVar2.f119979c = eVar;
                if (f119965g.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f119968b;
                }
            } while (eVar != e.f119976d);
        }
        s(listener, executor);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            k(sb2);
        } else {
            l(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    protected void w() {
    }

    final void x(@fj.a Future<?> related) {
        if ((related != null) & isCancelled()) {
            related.cancel(E());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fj.a
    protected String y() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    private static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final e f119976d = new e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @fj.a
        final Runnable f119977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.a
        final Executor f119978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @fj.a
        e f119979c;

        e(Runnable task, Executor executor) {
            this.f119977a = task;
            this.f119978b = executor;
        }

        e() {
            this.f119977a = null;
            this.f119978b = null;
        }
    }

    @Override // java.util.concurrent.Future
    @d2
    @z7.a
    public V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f119967a;
        int i10 = 4 >> 0;
        if ((obj2 != null) && (!(obj2 instanceof g))) {
            return t(obj2);
        }
        l lVar = this.f119969c;
        if (lVar != l.f119993c) {
            l lVar2 = new l();
            do {
                lVar2.a(lVar);
                if (f119965g.c(this, lVar, lVar2)) {
                    do {
                        LockSupport.park(this);
                        if (!Thread.interrupted()) {
                            obj = this.f119967a;
                        } else {
                            A(lVar2);
                            throw new InterruptedException();
                        }
                    } while (!((obj != null) & (!(obj instanceof g))));
                    return t(obj);
                }
                lVar = this.f119969c;
            } while (lVar != l.f119993c);
        }
        Object obj3 = this.f119967a;
        Objects.requireNonNull(obj3);
        return t(obj3);
    }
}
