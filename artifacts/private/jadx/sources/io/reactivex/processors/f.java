package io.reactivex.processors;

import androidx.compose.animation.core.z1;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.j0;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.v;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes11.dex */
public final class f<T> extends io.reactivex.processors.c<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object[] f303660e = new Object[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final c[] f303661f = new c[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final c[] f303662g = new c[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b<T> f303663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f303664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicReference<c<T>[]> f303665d = new AtomicReference<>(f303661f);

    static final class a<T> extends AtomicReference<a<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f303666b = 6404226426336033100L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final T f303667a;

        a(T t10) {
            this.f303667a = t10;
        }
    }

    interface b<T> {
        Throwable T();

        void a();

        T[] b(T[] tArr);

        void c(c<T> cVar);

        void complete();

        void error(Throwable th2);

        @cj.g
        T getValue();

        boolean isDone();

        void next(T t10);

        int size();
    }

    static final class c<T> extends AtomicInteger implements w {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f303668g = 466549804534799122L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final v<? super T> f303669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final f<T> f303670b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f303671c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicLong f303672d = new AtomicLong();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f303673e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f303674f;

        c(v<? super T> vVar, f<T> fVar) {
            this.f303669a = vVar;
            this.f303670b = fVar;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            if (this.f303673e) {
                return;
            }
            this.f303673e = true;
            this.f303670b.d9(this);
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (j.p(j10)) {
                io.reactivex.internal.util.d.a(this.f303672d, j10);
                this.f303670b.f303663b.c(this);
            }
        }
    }

    static final class d<T> implements b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f303675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f303676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final TimeUnit f303677c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final j0 f303678d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f303679e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile C2200f<T> f303680f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        C2200f<T> f303681g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Throwable f303682h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f303683i;

        d(int i10, long j10, TimeUnit timeUnit, j0 j0Var) {
            this.f303675a = io.reactivex.internal.functions.b.h(i10, "maxSize");
            this.f303676b = io.reactivex.internal.functions.b.i(j10, "maxAge");
            this.f303677c = (TimeUnit) io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
            this.f303678d = (j0) io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
            C2200f<T> c2200f = new C2200f<>(null, 0L);
            this.f303681g = c2200f;
            this.f303680f = c2200f;
        }

        @Override // io.reactivex.processors.f.b
        public Throwable T() {
            return this.f303682h;
        }

        @Override // io.reactivex.processors.f.b
        public void a() {
            if (this.f303680f.f303691a != null) {
                C2200f<T> c2200f = new C2200f<>(null, 0L);
                c2200f.lazySet(this.f303680f.get());
                this.f303680f = c2200f;
            }
        }

        @Override // io.reactivex.processors.f.b
        public T[] b(T[] tArr) {
            C2200f<T> c2200fD = d();
            int iE = e(c2200fD);
            if (iE == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            if (tArr.length < iE) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iE));
            }
            for (int i10 = 0; i10 != iE; i10++) {
                c2200fD = c2200fD.get();
                tArr[i10] = c2200fD.f303691a;
            }
            if (tArr.length > iE) {
                tArr[iE] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.processors.f.b
        public void c(c<T> cVar) {
            if (cVar.getAndIncrement() == 0) {
                v<? super T> vVar = cVar.f303669a;
                C2200f<T> c2200fD = (C2200f) cVar.f303671c;
                if (c2200fD == null) {
                    c2200fD = d();
                }
                long j10 = cVar.f303674f;
                int iAddAndGet = 1;
                do {
                    long j11 = cVar.f303672d.get();
                    while (j10 != j11) {
                        if (cVar.f303673e) {
                            cVar.f303671c = null;
                            return;
                        }
                        boolean z10 = this.f303683i;
                        C2200f<T> c2200f = c2200fD.get();
                        boolean z11 = c2200f == null;
                        if (z10 && z11) {
                            cVar.f303671c = null;
                            cVar.f303673e = true;
                            Throwable th2 = this.f303682h;
                            if (th2 == null) {
                                vVar.onComplete();
                                return;
                            } else {
                                vVar.onError(th2);
                                return;
                            }
                        }
                        if (z11) {
                            break;
                        }
                        vVar.onNext(c2200f.f303691a);
                        j10++;
                        c2200fD = c2200f;
                    }
                    if (j10 == j11) {
                        if (cVar.f303673e) {
                            cVar.f303671c = null;
                            return;
                        }
                        if (this.f303683i && c2200fD.get() == null) {
                            cVar.f303671c = null;
                            cVar.f303673e = true;
                            Throwable th3 = this.f303682h;
                            if (th3 == null) {
                                vVar.onComplete();
                                return;
                            } else {
                                vVar.onError(th3);
                                return;
                            }
                        }
                    }
                    cVar.f303671c = c2200fD;
                    cVar.f303674f = j10;
                    iAddAndGet = cVar.addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        }

        @Override // io.reactivex.processors.f.b
        public void complete() {
            g();
            this.f303683i = true;
        }

        C2200f<T> d() {
            C2200f<T> c2200f;
            C2200f<T> c2200f2 = this.f303680f;
            long jD = this.f303678d.d(this.f303677c) - this.f303676b;
            C2200f<T> c2200f3 = c2200f2.get();
            while (true) {
                c2200f = c2200f2;
                c2200f2 = c2200f3;
                if (c2200f2 == null || c2200f2.f303692b > jD) {
                    break;
                }
                c2200f3 = c2200f2.get();
            }
            return c2200f;
        }

        int e(C2200f<T> c2200f) {
            int i10 = 0;
            while (i10 != Integer.MAX_VALUE && (c2200f = c2200f.get()) != null) {
                i10++;
            }
            return i10;
        }

        @Override // io.reactivex.processors.f.b
        public void error(Throwable th2) {
            g();
            this.f303682h = th2;
            this.f303683i = true;
        }

        void f() {
            int i10 = this.f303679e;
            if (i10 > this.f303675a) {
                this.f303679e = i10 - 1;
                this.f303680f = this.f303680f.get();
            }
            long jD = this.f303678d.d(this.f303677c) - this.f303676b;
            C2200f<T> c2200f = this.f303680f;
            while (true) {
                C2200f<T> c2200f2 = c2200f.get();
                if (c2200f2 == null) {
                    this.f303680f = c2200f;
                    return;
                } else {
                    if (c2200f2.f303692b > jD) {
                        this.f303680f = c2200f;
                        return;
                    }
                    c2200f = c2200f2;
                }
            }
        }

        void g() {
            long jD = this.f303678d.d(this.f303677c) - this.f303676b;
            C2200f<T> c2200f = this.f303680f;
            while (true) {
                C2200f<T> c2200f2 = c2200f.get();
                if (c2200f2 == null) {
                    if (c2200f.f303691a != null) {
                        this.f303680f = new C2200f<>(null, 0L);
                        return;
                    } else {
                        this.f303680f = c2200f;
                        return;
                    }
                }
                if (c2200f2.f303692b > jD) {
                    if (c2200f.f303691a == null) {
                        this.f303680f = c2200f;
                        return;
                    }
                    C2200f<T> c2200f3 = new C2200f<>(null, 0L);
                    c2200f3.lazySet(c2200f.get());
                    this.f303680f = c2200f3;
                    return;
                }
                c2200f = c2200f2;
            }
        }

        @Override // io.reactivex.processors.f.b
        @cj.g
        public T getValue() {
            C2200f<T> c2200f = this.f303680f;
            while (true) {
                C2200f<T> c2200f2 = c2200f.get();
                if (c2200f2 == null) {
                    break;
                }
                c2200f = c2200f2;
            }
            if (c2200f.f303692b < this.f303678d.d(this.f303677c) - this.f303676b) {
                return null;
            }
            return c2200f.f303691a;
        }

        @Override // io.reactivex.processors.f.b
        public boolean isDone() {
            return this.f303683i;
        }

        @Override // io.reactivex.processors.f.b
        public void next(T t10) {
            C2200f<T> c2200f = new C2200f<>(t10, this.f303678d.d(this.f303677c));
            C2200f<T> c2200f2 = this.f303681g;
            this.f303681g = c2200f;
            this.f303679e++;
            c2200f2.set(c2200f);
            f();
        }

        @Override // io.reactivex.processors.f.b
        public int size() {
            return e(d());
        }
    }

    static final class e<T> implements b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f303684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f303685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile a<T> f303686c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        a<T> f303687d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Throwable f303688e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f303689f;

        e(int i10) {
            this.f303684a = io.reactivex.internal.functions.b.h(i10, "maxSize");
            a<T> aVar = new a<>(null);
            this.f303687d = aVar;
            this.f303686c = aVar;
        }

        @Override // io.reactivex.processors.f.b
        public Throwable T() {
            return this.f303688e;
        }

        @Override // io.reactivex.processors.f.b
        public void a() {
            if (this.f303686c.f303667a != null) {
                a<T> aVar = new a<>(null);
                aVar.lazySet(this.f303686c.get());
                this.f303686c = aVar;
            }
        }

        @Override // io.reactivex.processors.f.b
        public T[] b(T[] tArr) {
            a<T> aVar = this.f303686c;
            a<T> aVar2 = aVar;
            int i10 = 0;
            while (true) {
                aVar2 = aVar2.get();
                if (aVar2 == null) {
                    break;
                }
                i10++;
            }
            if (tArr.length < i10) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i10));
            }
            for (int i11 = 0; i11 < i10; i11++) {
                aVar = aVar.get();
                tArr[i11] = aVar.f303667a;
            }
            if (tArr.length > i10) {
                tArr[i10] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.processors.f.b
        public void c(c<T> cVar) {
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            v<? super T> vVar = cVar.f303669a;
            a<T> aVar = (a) cVar.f303671c;
            if (aVar == null) {
                aVar = this.f303686c;
            }
            long j10 = cVar.f303674f;
            int iAddAndGet = 1;
            do {
                long j11 = cVar.f303672d.get();
                while (j10 != j11) {
                    if (cVar.f303673e) {
                        cVar.f303671c = null;
                        return;
                    }
                    boolean z10 = this.f303689f;
                    a<T> aVar2 = aVar.get();
                    boolean z11 = aVar2 == null;
                    if (z10 && z11) {
                        cVar.f303671c = null;
                        cVar.f303673e = true;
                        Throwable th2 = this.f303688e;
                        if (th2 == null) {
                            vVar.onComplete();
                            return;
                        } else {
                            vVar.onError(th2);
                            return;
                        }
                    }
                    if (z11) {
                        break;
                    }
                    vVar.onNext(aVar2.f303667a);
                    j10++;
                    aVar = aVar2;
                }
                if (j10 == j11) {
                    if (cVar.f303673e) {
                        cVar.f303671c = null;
                        return;
                    }
                    if (this.f303689f && aVar.get() == null) {
                        cVar.f303671c = null;
                        cVar.f303673e = true;
                        Throwable th3 = this.f303688e;
                        if (th3 == null) {
                            vVar.onComplete();
                            return;
                        } else {
                            vVar.onError(th3);
                            return;
                        }
                    }
                }
                cVar.f303671c = aVar;
                cVar.f303674f = j10;
                iAddAndGet = cVar.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.processors.f.b
        public void complete() {
            a();
            this.f303689f = true;
        }

        void d() {
            int i10 = this.f303685b;
            if (i10 > this.f303684a) {
                this.f303685b = i10 - 1;
                this.f303686c = this.f303686c.get();
            }
        }

        @Override // io.reactivex.processors.f.b
        public void error(Throwable th2) {
            this.f303688e = th2;
            a();
            this.f303689f = true;
        }

        @Override // io.reactivex.processors.f.b
        public T getValue() {
            a<T> aVar = this.f303686c;
            while (true) {
                a<T> aVar2 = aVar.get();
                if (aVar2 == null) {
                    return aVar.f303667a;
                }
                aVar = aVar2;
            }
        }

        @Override // io.reactivex.processors.f.b
        public boolean isDone() {
            return this.f303689f;
        }

        @Override // io.reactivex.processors.f.b
        public void next(T t10) {
            a<T> aVar = new a<>(t10);
            a<T> aVar2 = this.f303687d;
            this.f303687d = aVar;
            this.f303685b++;
            aVar2.set(aVar);
            d();
        }

        @Override // io.reactivex.processors.f.b
        public int size() {
            a<T> aVar = this.f303686c;
            int i10 = 0;
            while (i10 != Integer.MAX_VALUE && (aVar = aVar.get()) != null) {
                i10++;
            }
            return i10;
        }
    }

    /* JADX INFO: renamed from: io.reactivex.processors.f$f, reason: collision with other inner class name */
    static final class C2200f<T> extends AtomicReference<C2200f<T>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f303690c = 6404226426336033100L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final T f303691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f303692b;

        C2200f(T t10, long j10) {
            this.f303691a = t10;
            this.f303692b = j10;
        }
    }

    static final class g<T> implements b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<T> f303693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Throwable f303694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile boolean f303695c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile int f303696d;

        g(int i10) {
            this.f303693a = new ArrayList(io.reactivex.internal.functions.b.h(i10, "capacityHint"));
        }

        @Override // io.reactivex.processors.f.b
        public Throwable T() {
            return this.f303694b;
        }

        @Override // io.reactivex.processors.f.b
        public void a() {
        }

        @Override // io.reactivex.processors.f.b
        public T[] b(T[] tArr) {
            int i10 = this.f303696d;
            if (i10 == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            List<T> list = this.f303693a;
            if (tArr.length < i10) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i10));
            }
            for (int i11 = 0; i11 < i10; i11++) {
                tArr[i11] = list.get(i11);
            }
            if (tArr.length > i10) {
                tArr[i10] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.processors.f.b
        public void c(c<T> cVar) {
            int iIntValue;
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            List<T> list = this.f303693a;
            v<? super T> vVar = cVar.f303669a;
            Integer num = (Integer) cVar.f303671c;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
                cVar.f303671c = 0;
            }
            long j10 = cVar.f303674f;
            int iAddAndGet = 1;
            do {
                long j11 = cVar.f303672d.get();
                while (j10 != j11) {
                    if (cVar.f303673e) {
                        cVar.f303671c = null;
                        return;
                    }
                    boolean z10 = this.f303695c;
                    int i10 = this.f303696d;
                    if (z10 && iIntValue == i10) {
                        cVar.f303671c = null;
                        cVar.f303673e = true;
                        Throwable th2 = this.f303694b;
                        if (th2 == null) {
                            vVar.onComplete();
                            return;
                        } else {
                            vVar.onError(th2);
                            return;
                        }
                    }
                    if (iIntValue == i10) {
                        break;
                    }
                    vVar.onNext(list.get(iIntValue));
                    iIntValue++;
                    j10++;
                }
                if (j10 == j11) {
                    if (cVar.f303673e) {
                        cVar.f303671c = null;
                        return;
                    }
                    boolean z11 = this.f303695c;
                    int i11 = this.f303696d;
                    if (z11 && iIntValue == i11) {
                        cVar.f303671c = null;
                        cVar.f303673e = true;
                        Throwable th3 = this.f303694b;
                        if (th3 == null) {
                            vVar.onComplete();
                            return;
                        } else {
                            vVar.onError(th3);
                            return;
                        }
                    }
                }
                cVar.f303671c = Integer.valueOf(iIntValue);
                cVar.f303674f = j10;
                iAddAndGet = cVar.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.processors.f.b
        public void complete() {
            this.f303695c = true;
        }

        @Override // io.reactivex.processors.f.b
        public void error(Throwable th2) {
            this.f303694b = th2;
            this.f303695c = true;
        }

        @Override // io.reactivex.processors.f.b
        @cj.g
        public T getValue() {
            int i10 = this.f303696d;
            if (i10 == 0) {
                return null;
            }
            return this.f303693a.get(i10 - 1);
        }

        @Override // io.reactivex.processors.f.b
        public boolean isDone() {
            return this.f303695c;
        }

        @Override // io.reactivex.processors.f.b
        public void next(T t10) {
            this.f303693a.add(t10);
            this.f303696d++;
        }

        @Override // io.reactivex.processors.f.b
        public int size() {
            return this.f303696d;
        }
    }

    f(b<T> bVar) {
        this.f303663b = bVar;
    }

    @cj.f
    @cj.d
    public static <T> f<T> T8() {
        return new f<>(new g(16));
    }

    @cj.f
    @cj.d
    public static <T> f<T> U8(int i10) {
        return new f<>(new g(i10));
    }

    static <T> f<T> V8() {
        return new f<>(new e(Integer.MAX_VALUE));
    }

    @cj.f
    @cj.d
    public static <T> f<T> W8(int i10) {
        return new f<>(new e(i10));
    }

    @cj.f
    @cj.d
    public static <T> f<T> X8(long j10, TimeUnit timeUnit, j0 j0Var) {
        return new f<>(new d(Integer.MAX_VALUE, j10, timeUnit, j0Var));
    }

    @cj.f
    @cj.d
    public static <T> f<T> Y8(long j10, TimeUnit timeUnit, j0 j0Var, int i10) {
        return new f<>(new d(i10, j10, timeUnit, j0Var));
    }

    @Override // io.reactivex.processors.c
    @cj.g
    public Throwable M8() {
        b<T> bVar = this.f303663b;
        if (bVar.isDone()) {
            return bVar.T();
        }
        return null;
    }

    @Override // io.reactivex.processors.c
    public boolean N8() {
        b<T> bVar = this.f303663b;
        return bVar.isDone() && bVar.T() == null;
    }

    @Override // io.reactivex.processors.c
    public boolean O8() {
        return this.f303665d.get().length != 0;
    }

    @Override // io.reactivex.processors.c
    public boolean P8() {
        b<T> bVar = this.f303663b;
        return bVar.isDone() && bVar.T() != null;
    }

    boolean R8(c<T> cVar) {
        c<T>[] cVarArr;
        c[] cVarArr2;
        do {
            cVarArr = this.f303665d.get();
            if (cVarArr == f303662g) {
                return false;
            }
            int length = cVarArr.length;
            cVarArr2 = new c[length + 1];
            System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
            cVarArr2[length] = cVar;
        } while (!z1.a(this.f303665d, cVarArr, cVarArr2));
        return true;
    }

    public void S8() {
        this.f303663b.a();
    }

    public T Z8() {
        return this.f303663b.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object[] a9() {
        Object[] objArr = f303660e;
        Object[] objArrB9 = b9(objArr);
        if (objArrB9 == objArr) {
            objArrB9 = new Object[0];
        }
        return objArrB9;
    }

    public T[] b9(T[] tArr) {
        return this.f303663b.b(tArr);
    }

    public boolean c9() {
        return this.f303663b.size() != 0;
    }

    void d9(c<T> cVar) {
        c<T>[] cVarArr;
        c[] cVarArr2;
        do {
            cVarArr = this.f303665d.get();
            if (cVarArr != f303662g && cVarArr != f303661f) {
                int length = cVarArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (cVarArr[i10] == cVar) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    break;
                }
                if (length == 1) {
                    cVarArr2 = f303661f;
                } else {
                    c[] cVarArr3 = new c[length - 1];
                    System.arraycopy(cVarArr, 0, cVarArr3, 0, i10);
                    System.arraycopy(cVarArr, i10 + 1, cVarArr3, i10, (length - i10) - 1);
                    cVarArr2 = cVarArr3;
                }
            } else {
                break;
            }
        } while (!z1.a(this.f303665d, cVarArr, cVarArr2));
    }

    int e9() {
        return this.f303663b.size();
    }

    int f9() {
        return this.f303665d.get().length;
    }

    @Override // io.reactivex.l
    protected void k6(v<? super T> vVar) {
        c<T> cVar = new c<>(vVar, this);
        vVar.l(cVar);
        if (R8(cVar) && cVar.f303673e) {
            d9(cVar);
        } else {
            this.f303663b.c(cVar);
        }
    }

    @Override // org.reactivestreams.v
    public void l(w wVar) {
        if (this.f303664c) {
            wVar.cancel();
        } else {
            wVar.request(Long.MAX_VALUE);
        }
    }

    @Override // org.reactivestreams.v
    public void onComplete() {
        if (this.f303664c) {
            return;
        }
        this.f303664c = true;
        b<T> bVar = this.f303663b;
        bVar.complete();
        int i10 = 6 | 0;
        for (c<T> cVar : this.f303665d.getAndSet(f303662g)) {
            bVar.c(cVar);
        }
    }

    @Override // org.reactivestreams.v
    public void onError(Throwable th2) {
        io.reactivex.internal.functions.b.g(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f303664c) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        this.f303664c = true;
        b<T> bVar = this.f303663b;
        bVar.error(th2);
        for (c<T> cVar : this.f303665d.getAndSet(f303662g)) {
            bVar.c(cVar);
        }
    }

    @Override // org.reactivestreams.v
    public void onNext(T t10) {
        io.reactivex.internal.functions.b.g(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f303664c) {
            return;
        }
        b<T> bVar = this.f303663b;
        bVar.next(t10);
        for (c<T> cVar : this.f303665d.get()) {
            bVar.c(cVar);
        }
    }
}
