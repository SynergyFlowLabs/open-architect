package com.google.common.eventbus;

import com.google.common.base.j0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
@e
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @r9.m
    private f f118540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @com.google.common.annotations.e
    final Object f118541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Method f118542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f118543d;

    @com.google.common.annotations.e
    static final class b extends j {
        @Override // com.google.common.eventbus.j
        void e(Object event) throws InvocationTargetException {
            synchronized (this) {
                super.e(event);
            }
        }

        private b(f bus, Object target, Method method) {
            super(bus, target, method);
        }
    }

    public static /* synthetic */ void a(j jVar, Object obj) {
        jVar.getClass();
        try {
            jVar.e(obj);
        } catch (InvocationTargetException e10) {
            jVar.f118540a.b(e10.getCause(), jVar.b(obj));
        }
    }

    private k b(Object event) {
        return new k(this.f118540a, event, this.f118541b, this.f118542c);
    }

    static j c(f bus, Object listener, Method method) {
        return f(method) ? new j(bus, listener, method) : new b(bus, listener, method);
    }

    private static boolean f(Method method) {
        return method.getAnnotation(com.google.common.eventbus.a.class) != null;
    }

    final void d(final Object event) {
        this.f118543d.execute(new Runnable() { // from class: com.google.common.eventbus.i
            @Override // java.lang.Runnable
            public final void run() {
                j.a(this.f118538a, event);
            }
        });
    }

    @com.google.common.annotations.e
    void e(Object event) throws InvocationTargetException {
        try {
            this.f118542c.invoke(this.f118541b, j0.E(event));
        } catch (IllegalAccessException e10) {
            throw new Error("Method became inaccessible: " + event, e10);
        } catch (IllegalArgumentException e11) {
            throw new Error("Method rejected target/argument: " + event, e11);
        } catch (InvocationTargetException e12) {
            if (!(e12.getCause() instanceof Error)) {
                throw e12;
            }
            throw ((Error) e12.getCause());
        }
    }

    public final boolean equals(@fj.a Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f118541b == jVar.f118541b && this.f118542c.equals(jVar.f118542c)) {
                int i10 = 4 & 1;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f118542c.hashCode() + 31) * 31) + System.identityHashCode(this.f118541b);
    }

    private j(f bus, Object target, Method method) {
        this.f118540a = bus;
        this.f118541b = j0.E(target);
        this.f118542c = method;
        method.setAccessible(true);
        this.f118543d = bus.a();
    }
}
