package com.google.common.base;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.b(emulated = true)
@k
public final class t0 {

    @com.google.common.annotations.e
    static class a<T> implements s0<T>, Serializable {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f116665f = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private transient Object f116666a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final s0<T> f116667b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f116668c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @fj.a
        volatile transient T f116669d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile transient long f116670e;

        a(s0<T> delegate, long durationNanos) {
            this.f116667b = delegate;
            this.f116668c = durationNanos;
        }

        @com.google.common.annotations.c
        @com.google.common.annotations.d
        private void readObject(ObjectInputStream in) throws ClassNotFoundException, IOException {
            in.defaultReadObject();
            this.f116666a = new Object();
        }

        @Override // com.google.common.base.s0
        @g0
        public T get() {
            long j10 = this.f116670e;
            long jNanoTime = System.nanoTime();
            if (j10 == 0 || jNanoTime - j10 >= 0) {
                synchronized (this.f116666a) {
                    try {
                        if (j10 == this.f116670e) {
                            T t10 = this.f116667b.get();
                            this.f116669d = t10;
                            long j11 = jNanoTime + this.f116668c;
                            if (j11 == 0) {
                                j11 = 1;
                            }
                            this.f116670e = j11;
                            return t10;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return (T) c0.a(this.f116669d);
        }

        public String toString() {
            return "Suppliers.memoizeWithExpiration(" + this.f116667b + ", " + this.f116668c + ", NANOS)";
        }
    }

    @com.google.common.annotations.e
    static class b<T> implements s0<T>, Serializable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f116671e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private transient Object f116672a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final s0<T> f116673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile transient boolean f116674c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @fj.a
        transient T f116675d;

        b(s0<T> delegate) {
            this.f116673b = (s0) j0.E(delegate);
        }

        @com.google.common.annotations.c
        @com.google.common.annotations.d
        private void readObject(ObjectInputStream in) throws ClassNotFoundException, IOException {
            in.defaultReadObject();
            this.f116672a = new Object();
        }

        @Override // com.google.common.base.s0
        @g0
        public T get() {
            if (!this.f116674c) {
                synchronized (this.f116672a) {
                    try {
                        if (!this.f116674c) {
                            T t10 = this.f116673b.get();
                            this.f116675d = t10;
                            this.f116674c = true;
                            return t10;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return (T) c0.a(this.f116675d);
        }

        public String toString() {
            Object obj;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (this.f116674c) {
                obj = "<supplier that returned " + this.f116675d + ">";
            } else {
                obj = this.f116673b;
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }
    }

    @com.google.common.annotations.e
    static class c<T> implements s0<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final s0<Void> f116676d = new s0() { // from class: com.google.common.base.u0
            @Override // com.google.common.base.s0
            public final Object get() {
                return t0.c.a();
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f116677a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile s0<T> f116678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @fj.a
        private T f116679c;

        c(s0<T> delegate) {
            this.f116678b = (s0) j0.E(delegate);
        }

        public static /* synthetic */ Void a() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.base.s0
        @g0
        public T get() {
            s0<T> s0Var = this.f116678b;
            s0<T> s0Var2 = (s0<T>) f116676d;
            if (s0Var != s0Var2) {
                synchronized (this.f116677a) {
                    try {
                        if (this.f116678b != s0Var2) {
                            T t10 = this.f116678b.get();
                            this.f116679c = t10;
                            this.f116678b = s0Var2;
                            return t10;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return (T) c0.a(this.f116679c);
        }

        public String toString() {
            Object obj = this.f116678b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (obj == f116676d) {
                obj = "<supplier that returned " + this.f116679c + ">";
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }
    }

    private static class d<F, T> implements s0<T>, Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f116680c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final t<? super F, T> f116681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final s0<F> f116682b;

        d(t<? super F, T> function, s0<F> supplier) {
            this.f116681a = (t) j0.E(function);
            this.f116682b = (s0) j0.E(supplier);
        }

        public boolean equals(@fj.a Object obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f116681a.equals(dVar.f116681a) && this.f116682b.equals(dVar.f116682b)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.base.s0
        @g0
        public T get() {
            return this.f116681a.apply(this.f116682b.get());
        }

        public int hashCode() {
            return d0.b(this.f116681a, this.f116682b);
        }

        public String toString() {
            return "Suppliers.compose(" + this.f116681a + ", " + this.f116682b + ")";
        }
    }

    private interface e<T> extends t<s0<T>, T> {
    }

    private enum f implements e<Object> {
        INSTANCE;

        @Override // com.google.common.base.t
        @fj.a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Object apply(s0<Object> input) {
            return input.get();
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Suppliers.supplierFunction()";
        }
    }

    private static class g<T> implements s0<T>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f116685b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @g0
        final T f116686a;

        g(@g0 T instance) {
            this.f116686a = instance;
        }

        public boolean equals(@fj.a Object obj) {
            if (obj instanceof g) {
                return d0.a(this.f116686a, ((g) obj).f116686a);
            }
            return false;
        }

        @Override // com.google.common.base.s0
        @g0
        public T get() {
            return this.f116686a;
        }

        public int hashCode() {
            return d0.b(this.f116686a);
        }

        public String toString() {
            return "Suppliers.ofInstance(" + this.f116686a + ")";
        }
    }

    @com.google.common.annotations.d
    private static class h<T> implements s0<T>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f116687b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final s0<T> f116688a;

        h(s0<T> delegate) {
            this.f116688a = (s0) j0.E(delegate);
        }

        @Override // com.google.common.base.s0
        @g0
        public T get() {
            T t10;
            synchronized (this.f116688a) {
                t10 = this.f116688a.get();
            }
            return t10;
        }

        public String toString() {
            return "Suppliers.synchronizedSupplier(" + this.f116688a + ")";
        }
    }

    private t0() {
    }

    public static <F, T> s0<T> a(t<? super F, T> function, s0<F> supplier) {
        return new d(function, supplier);
    }

    public static <T> s0<T> b(s0<T> delegate) {
        if ((delegate instanceof c) || (delegate instanceof b)) {
            return delegate;
        }
        return delegate instanceof Serializable ? new b(delegate) : new c(delegate);
    }

    public static <T> s0<T> c(s0<T> delegate, long duration, TimeUnit unit) {
        j0.E(delegate);
        j0.t(duration > 0, "duration (%s %s) must be > 0", duration, unit);
        return new a(delegate, unit.toNanos(duration));
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    @w
    public static <T> s0<T> d(s0<T> delegate, Duration duration) {
        j0.E(delegate);
        j0.u((duration.isNegative() || duration.isZero()) ? false : true, "duration (%s) must be > 0", duration);
        return new a(delegate, x.a(duration));
    }

    public static <T> s0<T> e(@g0 T instance) {
        return new g(instance);
    }

    public static <T> t<s0<T>, T> f() {
        return f.INSTANCE;
    }

    @com.google.common.annotations.d
    public static <T> s0<T> g(s0<T> delegate) {
        return new h(delegate);
    }
}
