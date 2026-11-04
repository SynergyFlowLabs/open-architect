package io.reactivex.subjects;

import androidx.compose.animation.core.z1;
import io.reactivex.i0;
import io.reactivex.internal.util.k;
import io.reactivex.internal.util.q;
import java.lang.reflect.Array;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes11.dex */
public final class b<T> extends i<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object[] f303744h = new Object[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final a[] f303745i = new a[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final a[] f303746j = new a[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicReference<Object> f303747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<a<T>[]> f303748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ReadWriteLock f303749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Lock f303750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Lock f303751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final AtomicReference<Throwable> f303752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    long f303753g;

    static final class a<T> implements io.reactivex.disposables.c, io.reactivex.internal.util.a.InterfaceC2195a<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final i0<? super T> f303754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final b<T> f303755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f303756c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f303757d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        io.reactivex.internal.util.a<Object> f303758e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f303759f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f303760g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        long f303761h;

        a(i0<? super T> i0Var, b<T> bVar) {
            this.f303754a = i0Var;
            this.f303755b = bVar;
        }

        void a() {
            if (!this.f303760g) {
                synchronized (this) {
                    try {
                        if (this.f303760g) {
                            return;
                        }
                        if (this.f303756c) {
                            return;
                        }
                        b<T> bVar = this.f303755b;
                        Lock lock = bVar.f303750d;
                        lock.lock();
                        this.f303761h = bVar.f303753g;
                        Object obj = bVar.f303747a.get();
                        lock.unlock();
                        this.f303757d = obj != null;
                        this.f303756c = true;
                        if (obj != null && !test(obj)) {
                            b();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        void b() {
            io.reactivex.internal.util.a<Object> aVar;
            while (!this.f303760g) {
                synchronized (this) {
                    try {
                        aVar = this.f303758e;
                        if (aVar == null) {
                            this.f303757d = false;
                            return;
                        }
                        this.f303758e = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                aVar.d(this);
            }
        }

        void c(Object obj, long j10) {
            if (this.f303760g) {
                return;
            }
            if (!this.f303759f) {
                synchronized (this) {
                    try {
                        if (this.f303760g) {
                            return;
                        }
                        if (this.f303761h == j10) {
                            return;
                        }
                        if (this.f303757d) {
                            io.reactivex.internal.util.a<Object> aVar = this.f303758e;
                            if (aVar == null) {
                                aVar = new io.reactivex.internal.util.a<>(4);
                                this.f303758e = aVar;
                            }
                            aVar.c(obj);
                            return;
                        }
                        this.f303756c = true;
                        this.f303759f = true;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            test(obj);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (this.f303760g) {
                return;
            }
            this.f303760g = true;
            this.f303755b.t8(this);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f303760g;
        }

        @Override // io.reactivex.internal.util.a.InterfaceC2195a, dj.r
        public boolean test(Object obj) {
            return this.f303760g || q.b(obj, this.f303754a);
        }
    }

    b() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f303749c = reentrantReadWriteLock;
        this.f303750d = reentrantReadWriteLock.readLock();
        this.f303751e = reentrantReadWriteLock.writeLock();
        this.f303748b = new AtomicReference<>(f303745i);
        this.f303747a = new AtomicReference<>();
        this.f303752f = new AtomicReference<>();
    }

    @cj.f
    @cj.d
    public static <T> b<T> n8() {
        return new b<>();
    }

    @cj.f
    @cj.d
    public static <T> b<T> o8(T t10) {
        return new b<>(t10);
    }

    @Override // io.reactivex.b0
    protected void H5(i0<? super T> i0Var) {
        a<T> aVar = new a<>(i0Var, this);
        i0Var.d(aVar);
        if (m8(aVar)) {
            if (aVar.f303760g) {
                t8(aVar);
                return;
            } else {
                aVar.a();
                return;
            }
        }
        Throwable th2 = this.f303752f.get();
        if (th2 == k.f303486a) {
            i0Var.onComplete();
        } else {
            i0Var.onError(th2);
        }
    }

    @Override // io.reactivex.i0
    public void d(io.reactivex.disposables.c cVar) {
        if (this.f303752f.get() != null) {
            cVar.dispose();
        }
    }

    @Override // io.reactivex.subjects.i
    @cj.g
    public Throwable h8() {
        Object obj = this.f303747a.get();
        if (q.v(obj)) {
            return q.p(obj);
        }
        return null;
    }

    @Override // io.reactivex.subjects.i
    public boolean i8() {
        return q.s(this.f303747a.get());
    }

    @Override // io.reactivex.subjects.i
    public boolean j8() {
        return this.f303748b.get().length != 0;
    }

    @Override // io.reactivex.subjects.i
    public boolean k8() {
        return q.v(this.f303747a.get());
    }

    boolean m8(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f303748b.get();
            if (aVarArr == f303746j) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!z1.a(this.f303748b, aVarArr, aVarArr2));
        return true;
    }

    @Override // io.reactivex.i0
    public void onComplete() {
        if (z1.a(this.f303752f, null, k.f303486a)) {
            Object objK = q.k();
            for (a<T> aVar : w8(objK)) {
                aVar.c(objK, this.f303753g);
            }
        }
    }

    @Override // io.reactivex.i0
    public void onError(Throwable th2) {
        io.reactivex.internal.functions.b.g(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!z1.a(this.f303752f, null, th2)) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        Object objN = q.n(th2);
        for (a<T> aVar : w8(objN)) {
            aVar.c(objN, this.f303753g);
        }
    }

    @Override // io.reactivex.i0
    public void onNext(T t10) {
        io.reactivex.internal.functions.b.g(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f303752f.get() == null) {
            Object objX = q.x(t10);
            u8(objX);
            for (a<T> aVar : this.f303748b.get()) {
                aVar.c(objX, this.f303753g);
            }
        }
    }

    @cj.g
    public T p8() {
        Object obj = this.f303747a.get();
        if (!q.s(obj) && !q.v(obj)) {
            return (T) q.r(obj);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public Object[] q8() {
        Object[] objArr = f303744h;
        Object[] objArrR8 = r8(objArr);
        if (objArrR8 != objArr) {
            return objArrR8;
        }
        int i10 = 2 ^ 0;
        return new Object[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public T[] r8(T[] tArr) {
        Object obj = this.f303747a.get();
        int i10 = 2 ^ 0;
        if (obj == null || q.s(obj) || q.v(obj)) {
            if (tArr.length != 0) {
                tArr[0] = 0;
            }
            return tArr;
        }
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

    public boolean s8() {
        Object obj = this.f303747a.get();
        return (obj == null || q.s(obj) || q.v(obj)) ? false : true;
    }

    void t8(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f303748b.get();
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
                aVarArr2 = f303745i;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!z1.a(this.f303748b, aVarArr, aVarArr2));
    }

    void u8(Object obj) {
        this.f303751e.lock();
        this.f303753g++;
        this.f303747a.lazySet(obj);
        this.f303751e.unlock();
    }

    int v8() {
        return this.f303748b.get().length;
    }

    a<T>[] w8(Object obj) {
        AtomicReference<a<T>[]> atomicReference = this.f303748b;
        a<T>[] aVarArr = f303746j;
        a<T>[] andSet = atomicReference.getAndSet(aVarArr);
        if (andSet != aVarArr) {
            u8(obj);
        }
        return andSet;
    }

    b(T t10) {
        this();
        this.f303747a.lazySet(io.reactivex.internal.functions.b.g(t10, "defaultValue is null"));
    }
}
