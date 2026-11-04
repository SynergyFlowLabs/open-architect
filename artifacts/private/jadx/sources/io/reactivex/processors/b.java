package io.reactivex.processors;

import androidx.compose.animation.core.z1;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.k;
import io.reactivex.internal.util.q;
import java.lang.reflect.Array;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.reactivestreams.v;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes11.dex */
public final class b<T> extends c<T> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final Object[] f303616i = new Object[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final a[] f303617j = new a[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final a[] f303618k = new a[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<a<T>[]> f303619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ReadWriteLock f303620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Lock f303621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Lock f303622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final AtomicReference<Object> f303623f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final AtomicReference<Throwable> f303624g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    long f303625h;

    static final class a<T> extends AtomicLong implements w, io.reactivex.internal.util.a.InterfaceC2195a<Object> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final long f303626i = 3293175281126227086L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final v<? super T> f303627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final b<T> f303628b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f303629c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f303630d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        io.reactivex.internal.util.a<Object> f303631e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f303632f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f303633g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        long f303634h;

        a(v<? super T> vVar, b<T> bVar) {
            this.f303627a = vVar;
            this.f303628b = bVar;
        }

        void a() {
            if (this.f303633g) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f303633g) {
                        return;
                    }
                    if (this.f303629c) {
                        return;
                    }
                    b<T> bVar = this.f303628b;
                    Lock lock = bVar.f303621d;
                    lock.lock();
                    this.f303634h = bVar.f303625h;
                    Object obj = bVar.f303623f.get();
                    lock.unlock();
                    this.f303630d = obj != null;
                    this.f303629c = true;
                    if (obj == null || test(obj)) {
                        return;
                    }
                    b();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void b() {
            io.reactivex.internal.util.a<Object> aVar;
            while (!this.f303633g) {
                synchronized (this) {
                    try {
                        aVar = this.f303631e;
                        if (aVar == null) {
                            this.f303630d = false;
                            return;
                        }
                        this.f303631e = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                aVar.d(this);
            }
        }

        void c(Object obj, long j10) {
            if (this.f303633g) {
                return;
            }
            if (!this.f303632f) {
                synchronized (this) {
                    try {
                        if (this.f303633g) {
                            return;
                        }
                        if (this.f303634h == j10) {
                            return;
                        }
                        if (this.f303630d) {
                            io.reactivex.internal.util.a<Object> aVar = this.f303631e;
                            if (aVar == null) {
                                aVar = new io.reactivex.internal.util.a<>(4);
                                this.f303631e = aVar;
                            }
                            aVar.c(obj);
                            return;
                        }
                        this.f303629c = true;
                        this.f303632f = true;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            test(obj);
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            if (this.f303633g) {
                return;
            }
            this.f303633g = true;
            this.f303628b.Z8(this);
        }

        public boolean d() {
            return get() == 0;
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (j.p(j10)) {
                io.reactivex.internal.util.d.a(this, j10);
            }
        }

        @Override // io.reactivex.internal.util.a.InterfaceC2195a, dj.r
        public boolean test(Object obj) {
            if (this.f303633g) {
                return true;
            }
            if (q.s(obj)) {
                this.f303627a.onComplete();
                return true;
            }
            if (q.v(obj)) {
                this.f303627a.onError(q.p(obj));
                return true;
            }
            long j10 = get();
            if (j10 == 0) {
                cancel();
                this.f303627a.onError(new io.reactivex.exceptions.c("Could not deliver value due to lack of requests"));
                return true;
            }
            this.f303627a.onNext((Object) q.r(obj));
            if (j10 != Long.MAX_VALUE) {
                decrementAndGet();
            }
            return false;
        }
    }

    b() {
        this.f303623f = new AtomicReference<>();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f303620c = reentrantReadWriteLock;
        this.f303621d = reentrantReadWriteLock.readLock();
        this.f303622e = reentrantReadWriteLock.writeLock();
        this.f303619b = new AtomicReference<>(f303617j);
        this.f303624g = new AtomicReference<>();
    }

    @cj.f
    @cj.d
    public static <T> b<T> S8() {
        return new b<>();
    }

    @cj.f
    @cj.d
    public static <T> b<T> T8(T t10) {
        io.reactivex.internal.functions.b.g(t10, "defaultValue is null");
        return new b<>(t10);
    }

    @Override // io.reactivex.processors.c
    @cj.g
    public Throwable M8() {
        Object obj = this.f303623f.get();
        if (q.v(obj)) {
            return q.p(obj);
        }
        return null;
    }

    @Override // io.reactivex.processors.c
    public boolean N8() {
        return q.s(this.f303623f.get());
    }

    @Override // io.reactivex.processors.c
    public boolean O8() {
        return this.f303619b.get().length != 0;
    }

    @Override // io.reactivex.processors.c
    public boolean P8() {
        return q.v(this.f303623f.get());
    }

    boolean R8(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f303619b.get();
            if (aVarArr == f303618k) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!z1.a(this.f303619b, aVarArr, aVarArr2));
        return true;
    }

    @cj.g
    public T U8() {
        Object obj = this.f303623f.get();
        if (q.s(obj) || q.v(obj)) {
            return null;
        }
        return (T) q.r(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public Object[] V8() {
        Object[] objArr = f303616i;
        Object[] objArrW8 = W8(objArr);
        return objArrW8 == objArr ? new Object[0] : objArrW8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public T[] W8(T[] tArr) {
        Object obj = this.f303623f.get();
        if (obj != null && !q.s(obj) && !q.v(obj)) {
            Object objR = q.r(obj);
            if (tArr.length == 0) {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
                tArr2[0] = objR;
                return tArr2;
            }
            tArr[0] = objR;
            if (tArr.length != 1) {
                tArr[1] = 0;
            }
            return tArr;
        }
        if (tArr.length != 0) {
            tArr[0] = 0;
        }
        return tArr;
    }

    public boolean X8() {
        Object obj = this.f303623f.get();
        return (obj == null || q.s(obj) || q.v(obj)) ? false : true;
    }

    public boolean Y8(T t10) {
        if (t10 == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return true;
        }
        a<T>[] aVarArr = this.f303619b.get();
        for (a<T> aVar : aVarArr) {
            if (aVar.d()) {
                return false;
            }
        }
        Object objX = q.x(t10);
        a9(objX);
        for (a<T> aVar2 : aVarArr) {
            aVar2.c(objX, this.f303625h);
        }
        return true;
    }

    void Z8(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f303619b.get();
            int length = aVarArr.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (aVarArr[i10] == aVar) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                aVarArr2 = f303617j;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!z1.a(this.f303619b, aVarArr, aVarArr2));
    }

    void a9(Object obj) {
        Lock lock = this.f303622e;
        lock.lock();
        this.f303625h++;
        this.f303623f.lazySet(obj);
        lock.unlock();
    }

    int b9() {
        return this.f303619b.get().length;
    }

    a<T>[] c9(Object obj) {
        a<T>[] andSet = this.f303619b.get();
        a<T>[] aVarArr = f303618k;
        if (andSet != aVarArr && (andSet = this.f303619b.getAndSet(aVarArr)) != aVarArr) {
            a9(obj);
        }
        return andSet;
    }

    @Override // io.reactivex.l
    protected void k6(v<? super T> vVar) {
        a<T> aVar = new a<>(vVar, this);
        vVar.l(aVar);
        if (R8(aVar)) {
            if (aVar.f303633g) {
                Z8(aVar);
                return;
            } else {
                aVar.a();
                return;
            }
        }
        Throwable th2 = this.f303624g.get();
        if (th2 == k.f303486a) {
            vVar.onComplete();
        } else {
            vVar.onError(th2);
        }
    }

    @Override // org.reactivestreams.v
    public void l(w wVar) {
        if (this.f303624g.get() != null) {
            wVar.cancel();
        } else {
            wVar.request(Long.MAX_VALUE);
        }
    }

    @Override // org.reactivestreams.v
    public void onComplete() {
        if (z1.a(this.f303624g, null, k.f303486a)) {
            Object objK = q.k();
            for (a<T> aVar : c9(objK)) {
                aVar.c(objK, this.f303625h);
            }
        }
    }

    @Override // org.reactivestreams.v
    public void onError(Throwable th2) {
        io.reactivex.internal.functions.b.g(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!z1.a(this.f303624g, null, th2)) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        Object objN = q.n(th2);
        for (a<T> aVar : c9(objN)) {
            aVar.c(objN, this.f303625h);
        }
    }

    @Override // org.reactivestreams.v
    public void onNext(T t10) {
        io.reactivex.internal.functions.b.g(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f303624g.get() == null) {
            Object objX = q.x(t10);
            a9(objX);
            for (a<T> aVar : this.f303619b.get()) {
                aVar.c(objX, this.f303625h);
            }
        }
    }

    b(T t10) {
        this();
        this.f303623f.lazySet(io.reactivex.internal.functions.b.g(t10, "defaultValue is null"));
    }
}
