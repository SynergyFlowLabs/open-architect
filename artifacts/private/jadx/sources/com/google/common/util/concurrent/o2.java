package com.google.common.util.concurrent;

import com.google.common.collect.x8;
import com.google.common.collect.z9;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@o0
public final class o2 implements z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f120230a;

    class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f120231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f120232b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TimeUnit f120233c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Set f120234d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ o2 f120235e;

        a(final o2 this$0, final Object val$target, final long val$timeoutDuration, final TimeUnit val$timeoutUnit, final Set val$interruptibleMethods) {
            this.f120231a = val$target;
            this.f120232b = val$timeoutDuration;
            this.f120233c = val$timeoutUnit;
            this.f120234d = val$interruptibleMethods;
            this.f120235e = this$0;
        }

        public static /* synthetic */ Object a(Method method, Object obj, Object[] objArr) throws Exception {
            try {
                return method.invoke(obj, objArr);
            } catch (InvocationTargetException e10) {
                throw o2.n(e10, false);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        @fj.a
        public Object invoke(Object obj, final Method method, @fj.a final Object[] args) throws Throwable {
            final Object obj2 = this.f120231a;
            return this.f120235e.h(new Callable() { // from class: com.google.common.util.concurrent.n2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return o2.a.a(method, obj2, args);
                }
            }, this.f120232b, this.f120233c, this.f120234d.contains(method));
        }
    }

    private o2(ExecutorService executor) {
        this.f120230a = (ExecutorService) com.google.common.base.j0.E(executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @d2
    public <T> T h(Callable<T> callable, long j10, TimeUnit timeUnit, boolean z10) throws Exception {
        com.google.common.base.j0.E(callable);
        com.google.common.base.j0.E(timeUnit);
        i(j10);
        Future<T> futureSubmit = this.f120230a.submit(callable);
        try {
            return z10 ? futureSubmit.get(j10, timeUnit) : (T) f3.g(futureSubmit, j10, timeUnit);
        } catch (InterruptedException e10) {
            futureSubmit.cancel(true);
            throw e10;
        } catch (ExecutionException e11) {
            throw n(e11, true);
        } catch (TimeoutException e12) {
            futureSubmit.cancel(true);
            throw new e3(e12);
        }
    }

    private static void i(long timeoutDuration) {
        com.google.common.base.j0.p(timeoutDuration > 0, "timeout must be positive: %s", timeoutDuration);
    }

    public static o2 j(ExecutorService executor) {
        return new o2(executor);
    }

    private static boolean k(Method method) {
        for (Class<?> cls : method.getExceptionTypes()) {
            if (cls == InterruptedException.class) {
                return true;
            }
        }
        return false;
    }

    private static Set<Method> l(Class<?> interfaceType) {
        HashSet hashSetU = z9.u();
        for (Method method : interfaceType.getMethods()) {
            if (k(method)) {
                hashSetU.add(method);
            }
        }
        return hashSetU;
    }

    private static <T> T m(Class<T> interfaceType, InvocationHandler handler) {
        return interfaceType.cast(Proxy.newProxyInstance(interfaceType.getClassLoader(), new Class[]{interfaceType}, handler));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Exception n(Exception e10, boolean combineStackTraces) throws Exception {
        Throwable cause = e10.getCause();
        if (cause == null) {
            throw e10;
        }
        if (combineStackTraces) {
            cause.setStackTrace((StackTraceElement[]) x8.f(cause.getStackTrace(), e10.getStackTrace(), StackTraceElement.class));
        }
        if (cause instanceof Exception) {
            throw ((Exception) cause);
        }
        if (cause instanceof Error) {
            throw ((Error) cause);
        }
        throw e10;
    }

    private void o(Throwable cause) throws ExecutionException {
        if (cause instanceof Error) {
            throw new p0((Error) cause);
        }
        if (!(cause instanceof RuntimeException)) {
            throw new ExecutionException(cause);
        }
        throw new d3(cause);
    }

    private void p(Throwable cause) {
        if (!(cause instanceof Error)) {
            throw new d3(cause);
        }
        throw new p0((Error) cause);
    }

    @Override // com.google.common.util.concurrent.z2
    public void a(Runnable runnable, long timeoutDuration, TimeUnit timeoutUnit) throws TimeoutException {
        com.google.common.base.j0.E(runnable);
        com.google.common.base.j0.E(timeoutUnit);
        i(timeoutDuration);
        Future<?> futureSubmit = this.f120230a.submit(runnable);
        try {
            f3.g(futureSubmit, timeoutDuration, timeoutUnit);
        } catch (ExecutionException e10) {
            p(e10.getCause());
            throw new AssertionError();
        } catch (TimeoutException e11) {
            futureSubmit.cancel(true);
            throw e11;
        }
    }

    @Override // com.google.common.util.concurrent.z2
    @d2
    @z7.a
    public <T> T b(Callable<T> callable, long j10, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        com.google.common.base.j0.E(callable);
        com.google.common.base.j0.E(timeUnit);
        i(j10);
        Future<T> futureSubmit = this.f120230a.submit(callable);
        try {
            return (T) f3.g(futureSubmit, j10, timeUnit);
        } catch (ExecutionException e10) {
            o(e10.getCause());
            throw new AssertionError();
        } catch (TimeoutException e11) {
            futureSubmit.cancel(true);
            throw e11;
        }
    }

    @Override // com.google.common.util.concurrent.z2
    @d2
    @z7.a
    public <T> T c(Callable<T> callable, long timeoutDuration, TimeUnit timeoutUnit) throws ExecutionException, InterruptedException, TimeoutException {
        com.google.common.base.j0.E(callable);
        com.google.common.base.j0.E(timeoutUnit);
        i(timeoutDuration);
        Future<T> futureSubmit = this.f120230a.submit(callable);
        try {
            return futureSubmit.get(timeoutDuration, timeoutUnit);
        } catch (InterruptedException | TimeoutException e10) {
            futureSubmit.cancel(true);
            throw e10;
        } catch (ExecutionException e11) {
            o(e11.getCause());
            throw new AssertionError();
        }
    }

    @Override // com.google.common.util.concurrent.z2
    public void d(Runnable runnable, long timeoutDuration, TimeUnit timeoutUnit) throws InterruptedException, TimeoutException {
        com.google.common.base.j0.E(runnable);
        com.google.common.base.j0.E(timeoutUnit);
        i(timeoutDuration);
        Future<?> futureSubmit = this.f120230a.submit(runnable);
        try {
            futureSubmit.get(timeoutDuration, timeoutUnit);
        } catch (InterruptedException | TimeoutException e10) {
            futureSubmit.cancel(true);
            throw e10;
        } catch (ExecutionException e11) {
            p(e11.getCause());
            throw new AssertionError();
        }
    }

    @Override // com.google.common.util.concurrent.z2
    public <T> T e(T t10, Class<T> cls, long j10, TimeUnit timeUnit) {
        com.google.common.base.j0.E(t10);
        com.google.common.base.j0.E(cls);
        com.google.common.base.j0.E(timeUnit);
        i(j10);
        com.google.common.base.j0.e(cls.isInterface(), "interfaceType must be an interface type");
        return (T) m(cls, new a(this, t10, j10, timeUnit, l(cls)));
    }
}
