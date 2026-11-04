package io.reactivex;

/* JADX INFO: loaded from: classes8.dex */
public final class a0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final a0<Object> f298637b = new a0<>(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f298638a;

    private a0(Object obj) {
        this.f298638a = obj;
    }

    @cj.f
    public static <T> a0<T> a() {
        return (a0<T>) f298637b;
    }

    @cj.f
    public static <T> a0<T> b(@cj.f Throwable th2) {
        io.reactivex.internal.functions.b.g(th2, "error is null");
        return new a0<>(io.reactivex.internal.util.q.n(th2));
    }

    @cj.f
    public static <T> a0<T> c(@cj.f T t10) {
        io.reactivex.internal.functions.b.g(t10, "value is null");
        return new a0<>(t10);
    }

    @cj.g
    public Throwable d() {
        Object obj = this.f298638a;
        if (io.reactivex.internal.util.q.v(obj)) {
            return io.reactivex.internal.util.q.p(obj);
        }
        return null;
    }

    @cj.g
    public T e() {
        Object obj = this.f298638a;
        if (obj == null || io.reactivex.internal.util.q.v(obj)) {
            return null;
        }
        return (T) this.f298638a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a0) {
            return io.reactivex.internal.functions.b.c(this.f298638a, ((a0) obj).f298638a);
        }
        return false;
    }

    public boolean f() {
        return this.f298638a == null;
    }

    public boolean g() {
        return io.reactivex.internal.util.q.v(this.f298638a);
    }

    public boolean h() {
        Object obj = this.f298638a;
        return (obj == null || io.reactivex.internal.util.q.v(obj)) ? false : true;
    }

    public int hashCode() {
        Object obj = this.f298638a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public String toString() {
        Object obj = this.f298638a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (io.reactivex.internal.util.q.v(obj)) {
            return "OnErrorNotification[" + io.reactivex.internal.util.q.p(obj) + "]";
        }
        return "OnNextNotification[" + this.f298638a + "]";
    }
}
