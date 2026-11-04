package io.reactivex.subjects;

import androidx.compose.animation.core.z1;
import io.reactivex.i0;
import io.reactivex.internal.util.q;
import io.reactivex.j0;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class f<T> extends i<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final c[] f303784d = new c[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final c[] f303785e = new c[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object[] f303786f = new Object[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b<T> f303787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<c<T>[]> f303788b = new AtomicReference<>(f303784d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f303789c;

    static final class a<T> extends AtomicReference<a<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f303790b = 6404226426336033100L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final T f303791a;

        a(T t10) {
            this.f303791a = t10;
        }
    }

    interface b<T> {
        void a();

        void add(T t10);

        T[] b(T[] tArr);

        void c(Object obj);

        boolean compareAndSet(Object obj, Object obj2);

        void d(c<T> cVar);

        Object get();

        @cj.g
        T getValue();

        int size();
    }

    static final class c<T> extends AtomicInteger implements io.reactivex.disposables.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f303792e = 466549804534799122L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final i0<? super T> f303793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final f<T> f303794b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f303795c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile boolean f303796d;

        c(i0<? super T> i0Var, f<T> fVar) {
            this.f303793a = i0Var;
            this.f303794b = fVar;
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (this.f303796d) {
                return;
            }
            this.f303796d = true;
            this.f303794b.z8(this);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f303796d;
        }
    }

    static final class d<T> extends AtomicReference<Object> implements b<T> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final long f303797i = -8056260896137901749L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f303798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f303799b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final TimeUnit f303800c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final j0 f303801d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f303802e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile C2204f<Object> f303803f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        C2204f<Object> f303804g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f303805h;

        d(int i10, long j10, TimeUnit timeUnit, j0 j0Var) {
            this.f303798a = io.reactivex.internal.functions.b.h(i10, "maxSize");
            this.f303799b = io.reactivex.internal.functions.b.i(j10, "maxAge");
            this.f303800c = (TimeUnit) io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
            this.f303801d = (j0) io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
            C2204f<Object> c2204f = new C2204f<>(null, 0L);
            this.f303804g = c2204f;
            this.f303803f = c2204f;
        }

        @Override // io.reactivex.subjects.f.b
        public void a() {
            C2204f<Object> c2204f = this.f303803f;
            if (c2204f.f303813a != null) {
                C2204f<Object> c2204f2 = new C2204f<>(null, 0L);
                c2204f2.lazySet(c2204f.get());
                this.f303803f = c2204f2;
            }
        }

        @Override // io.reactivex.subjects.f.b
        public void add(T t10) {
            C2204f<Object> c2204f = new C2204f<>(t10, this.f303801d.d(this.f303800c));
            C2204f<Object> c2204f2 = this.f303804g;
            this.f303804g = c2204f;
            this.f303802e++;
            c2204f2.set(c2204f);
            g();
        }

        @Override // io.reactivex.subjects.f.b
        public T[] b(T[] tArr) {
            C2204f<T> c2204fE = e();
            int iF = f(c2204fE);
            if (iF == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            if (tArr.length < iF) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iF));
            }
            for (int i10 = 0; i10 != iF; i10++) {
                c2204fE = c2204fE.get();
                tArr[i10] = c2204fE.f303813a;
            }
            if (tArr.length > iF) {
                tArr[iF] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.subjects.f.b
        public void c(Object obj) {
            C2204f<Object> c2204f = new C2204f<>(obj, Long.MAX_VALUE);
            C2204f<Object> c2204f2 = this.f303804g;
            this.f303804g = c2204f;
            this.f303802e++;
            c2204f2.lazySet(c2204f);
            h();
            this.f303805h = true;
        }

        @Override // io.reactivex.subjects.f.b
        public void d(c<T> cVar) {
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            i0<? super T> i0Var = cVar.f303793a;
            C2204f<Object> c2204fE = (C2204f) cVar.f303795c;
            if (c2204fE == null) {
                c2204fE = e();
            }
            int iAddAndGet = 1;
            while (!cVar.f303796d) {
                while (true) {
                    if (cVar.f303796d) {
                        cVar.f303795c = null;
                        return;
                    }
                    C2204f<T> c2204f = c2204fE.get();
                    if (c2204f == null) {
                        break;
                    }
                    T t10 = c2204f.f303813a;
                    if (this.f303805h && c2204f.get() == null) {
                        if (q.s(t10)) {
                            i0Var.onComplete();
                        } else {
                            i0Var.onError(q.p(t10));
                        }
                        cVar.f303795c = null;
                        cVar.f303796d = true;
                        return;
                    }
                    i0Var.onNext(t10);
                    c2204fE = c2204f;
                }
                if (c2204fE.get() == null) {
                    cVar.f303795c = c2204fE;
                    iAddAndGet = cVar.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            cVar.f303795c = null;
        }

        C2204f<Object> e() {
            C2204f<Object> c2204f;
            C2204f<Object> c2204f2 = this.f303803f;
            long jD = this.f303801d.d(this.f303800c) - this.f303799b;
            C2204f<T> c2204f3 = c2204f2.get();
            while (true) {
                c2204f = c2204f2;
                c2204f2 = c2204f3;
                if (c2204f2 == null || c2204f2.f303814b > jD) {
                    break;
                }
                c2204f3 = c2204f2.get();
            }
            return c2204f;
        }

        int f(C2204f<Object> c2204f) {
            int i10 = 0;
            while (i10 != Integer.MAX_VALUE) {
                C2204f<T> c2204f2 = c2204f.get();
                if (c2204f2 == null) {
                    Object obj = c2204f.f303813a;
                    if (!q.s(obj) && !q.v(obj)) {
                        break;
                    }
                    return i10 - 1;
                }
                i10++;
                c2204f = c2204f2;
            }
            return i10;
        }

        void g() {
            int i10 = this.f303802e;
            if (i10 > this.f303798a) {
                this.f303802e = i10 - 1;
                this.f303803f = this.f303803f.get();
            }
            long jD = this.f303801d.d(this.f303800c) - this.f303799b;
            C2204f<Object> c2204f = this.f303803f;
            while (true) {
                C2204f<T> c2204f2 = c2204f.get();
                if (c2204f2 == null) {
                    this.f303803f = c2204f;
                    return;
                } else {
                    if (c2204f2.f303814b > jD) {
                        this.f303803f = c2204f;
                        return;
                    }
                    c2204f = c2204f2;
                }
            }
        }

        @Override // io.reactivex.subjects.f.b
        @cj.g
        public T getValue() {
            T t10;
            C2204f<Object> c2204f = this.f303803f;
            C2204f<Object> c2204f2 = null;
            while (true) {
                C2204f<T> c2204f3 = c2204f.get();
                if (c2204f3 == null) {
                    break;
                }
                c2204f2 = c2204f;
                c2204f = c2204f3;
            }
            if (c2204f.f303814b >= this.f303801d.d(this.f303800c) - this.f303799b && (t10 = (T) c2204f.f303813a) != null) {
                return (q.s(t10) || q.v(t10)) ? (T) c2204f2.f303813a : t10;
            }
            return null;
        }

        void h() {
            long jD = this.f303801d.d(this.f303800c) - this.f303799b;
            C2204f<Object> c2204f = this.f303803f;
            while (true) {
                C2204f<T> c2204f2 = c2204f.get();
                if (c2204f2.get() == null) {
                    if (c2204f.f303813a == null) {
                        this.f303803f = c2204f;
                        return;
                    }
                    C2204f<Object> c2204f3 = new C2204f<>(null, 0L);
                    c2204f3.lazySet(c2204f.get());
                    this.f303803f = c2204f3;
                    return;
                }
                if (c2204f2.f303814b > jD) {
                    if (c2204f.f303813a == null) {
                        this.f303803f = c2204f;
                        return;
                    }
                    C2204f<Object> c2204f4 = new C2204f<>(null, 0L);
                    c2204f4.lazySet(c2204f.get());
                    this.f303803f = c2204f4;
                    return;
                }
                c2204f = c2204f2;
            }
        }

        @Override // io.reactivex.subjects.f.b
        public int size() {
            return f(e());
        }
    }

    static final class e<T> extends AtomicReference<Object> implements b<T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f303806f = 1107649250281456395L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f303807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f303808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile a<Object> f303809c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        a<Object> f303810d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f303811e;

        e(int i10) {
            this.f303807a = io.reactivex.internal.functions.b.h(i10, "maxSize");
            a<Object> aVar = new a<>(null);
            this.f303810d = aVar;
            this.f303809c = aVar;
        }

        @Override // io.reactivex.subjects.f.b
        public void a() {
            a<Object> aVar = this.f303809c;
            if (aVar.f303791a != null) {
                a<Object> aVar2 = new a<>(null);
                aVar2.lazySet(aVar.get());
                this.f303809c = aVar2;
            }
        }

        @Override // io.reactivex.subjects.f.b
        public void add(T t10) {
            a<Object> aVar = new a<>(t10);
            a<Object> aVar2 = this.f303810d;
            this.f303810d = aVar;
            this.f303808b++;
            aVar2.set(aVar);
            e();
        }

        @Override // io.reactivex.subjects.f.b
        public T[] b(T[] tArr) {
            a<T> aVar = this.f303809c;
            int size = size();
            if (size == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i10 = 0; i10 != size; i10++) {
                aVar = aVar.get();
                tArr[i10] = aVar.f303791a;
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.subjects.f.b
        public void c(Object obj) {
            a<Object> aVar = new a<>(obj);
            a<Object> aVar2 = this.f303810d;
            this.f303810d = aVar;
            this.f303808b++;
            aVar2.lazySet(aVar);
            a();
            this.f303811e = true;
        }

        @Override // io.reactivex.subjects.f.b
        public void d(c<T> cVar) {
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            i0<? super T> i0Var = cVar.f303793a;
            a<Object> aVar = (a) cVar.f303795c;
            if (aVar == null) {
                aVar = this.f303809c;
            }
            int iAddAndGet = 1;
            while (!cVar.f303796d) {
                a<T> aVar2 = aVar.get();
                if (aVar2 != null) {
                    T t10 = aVar2.f303791a;
                    if (this.f303811e && aVar2.get() == null) {
                        if (q.s(t10)) {
                            i0Var.onComplete();
                        } else {
                            i0Var.onError(q.p(t10));
                        }
                        cVar.f303795c = null;
                        cVar.f303796d = true;
                        return;
                    }
                    i0Var.onNext(t10);
                    aVar = aVar2;
                } else if (aVar.get() == null) {
                    cVar.f303795c = aVar;
                    iAddAndGet = cVar.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            cVar.f303795c = null;
        }

        void e() {
            int i10 = this.f303808b;
            if (i10 > this.f303807a) {
                this.f303808b = i10 - 1;
                this.f303809c = this.f303809c.get();
            }
        }

        @Override // io.reactivex.subjects.f.b
        @cj.g
        public T getValue() {
            a<Object> aVar = this.f303809c;
            a<Object> aVar2 = null;
            while (true) {
                a<T> aVar3 = aVar.get();
                if (aVar3 == null) {
                    break;
                }
                aVar2 = aVar;
                aVar = aVar3;
            }
            T t10 = (T) aVar.f303791a;
            if (t10 == null) {
                return null;
            }
            if (!q.s(t10) && !q.v(t10)) {
                return t10;
            }
            return (T) aVar2.f303791a;
        }

        @Override // io.reactivex.subjects.f.b
        public int size() {
            a<Object> aVar = this.f303809c;
            int i10 = 0;
            int i11 = 2 & 0;
            while (i10 != Integer.MAX_VALUE) {
                a<T> aVar2 = aVar.get();
                if (aVar2 == null) {
                    Object obj = aVar.f303791a;
                    if (!q.s(obj) && !q.v(obj)) {
                        break;
                    }
                    return i10 - 1;
                }
                i10++;
                aVar = aVar2;
            }
            return i10;
        }
    }

    /* JADX INFO: renamed from: io.reactivex.subjects.f$f, reason: collision with other inner class name */
    static final class C2204f<T> extends AtomicReference<C2204f<T>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f303812c = 6404226426336033100L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final T f303813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f303814b;

        C2204f(T t10, long j10) {
            this.f303813a = t10;
            this.f303814b = j10;
        }
    }

    static final class g<T> extends AtomicReference<Object> implements b<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f303815d = -733876083048047795L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<Object> f303816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile boolean f303817b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile int f303818c;

        g(int i10) {
            this.f303816a = new ArrayList(io.reactivex.internal.functions.b.h(i10, "capacityHint"));
        }

        @Override // io.reactivex.subjects.f.b
        public void a() {
        }

        @Override // io.reactivex.subjects.f.b
        public void add(T t10) {
            this.f303816a.add(t10);
            this.f303818c++;
        }

        @Override // io.reactivex.subjects.f.b
        public T[] b(T[] tArr) {
            int i10 = this.f303818c;
            if (i10 == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            List<Object> list = this.f303816a;
            Object obj = list.get(i10 - 1);
            if ((q.s(obj) || q.v(obj)) && (i10 = i10 - 1) == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
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

        @Override // io.reactivex.subjects.f.b
        public void c(Object obj) {
            this.f303816a.add(obj);
            a();
            this.f303818c++;
            this.f303817b = true;
        }

        @Override // io.reactivex.subjects.f.b
        public void d(c<T> cVar) {
            int iIntValue;
            int i10;
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            List<Object> list = this.f303816a;
            i0<? super T> i0Var = cVar.f303793a;
            Integer num = (Integer) cVar.f303795c;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
                cVar.f303795c = 0;
            }
            int iAddAndGet = 1;
            while (!cVar.f303796d) {
                int i11 = this.f303818c;
                while (i11 != iIntValue) {
                    if (cVar.f303796d) {
                        cVar.f303795c = null;
                        return;
                    }
                    Object obj = list.get(iIntValue);
                    if (this.f303817b && (i10 = iIntValue + 1) == i11 && i10 == (i11 = this.f303818c)) {
                        if (q.s(obj)) {
                            i0Var.onComplete();
                        } else {
                            i0Var.onError(q.p(obj));
                        }
                        cVar.f303795c = null;
                        cVar.f303796d = true;
                        return;
                    }
                    i0Var.onNext(obj);
                    iIntValue++;
                }
                if (iIntValue == this.f303818c) {
                    cVar.f303795c = Integer.valueOf(iIntValue);
                    iAddAndGet = cVar.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            cVar.f303795c = null;
        }

        @Override // io.reactivex.subjects.f.b
        @cj.g
        public T getValue() {
            int i10 = this.f303818c;
            if (i10 == 0) {
                return null;
            }
            List<Object> list = this.f303816a;
            T t10 = (T) list.get(i10 - 1);
            if (!q.s(t10) && !q.v(t10)) {
                return t10;
            }
            if (i10 == 1) {
                return null;
            }
            return (T) list.get(i10 - 2);
        }

        @Override // io.reactivex.subjects.f.b
        public int size() {
            int i10 = this.f303818c;
            if (i10 == 0) {
                return 0;
            }
            int i11 = i10 - 1;
            Object obj = this.f303816a.get(i11);
            return (q.s(obj) || q.v(obj)) ? i11 : i10;
        }
    }

    f(b<T> bVar) {
        this.f303787a = bVar;
    }

    @cj.f
    @cj.d
    public static <T> f<T> o8() {
        return new f<>(new g(16));
    }

    @cj.f
    @cj.d
    public static <T> f<T> p8(int i10) {
        return new f<>(new g(i10));
    }

    static <T> f<T> q8() {
        return new f<>(new e(Integer.MAX_VALUE));
    }

    @cj.f
    @cj.d
    public static <T> f<T> r8(int i10) {
        return new f<>(new e(i10));
    }

    @cj.f
    @cj.d
    public static <T> f<T> s8(long j10, TimeUnit timeUnit, j0 j0Var) {
        return new f<>(new d(Integer.MAX_VALUE, j10, timeUnit, j0Var));
    }

    @cj.f
    @cj.d
    public static <T> f<T> t8(long j10, TimeUnit timeUnit, j0 j0Var, int i10) {
        return new f<>(new d(i10, j10, timeUnit, j0Var));
    }

    int A8() {
        return this.f303787a.size();
    }

    c<T>[] B8(Object obj) {
        return this.f303787a.compareAndSet(null, obj) ? this.f303788b.getAndSet(f303785e) : f303785e;
    }

    @Override // io.reactivex.b0
    protected void H5(i0<? super T> i0Var) {
        c<T> cVar = new c<>(i0Var, this);
        i0Var.d(cVar);
        if (!cVar.f303796d) {
            if (m8(cVar) && cVar.f303796d) {
                z8(cVar);
                return;
            }
            this.f303787a.d(cVar);
        }
    }

    @Override // io.reactivex.i0
    public void d(io.reactivex.disposables.c cVar) {
        if (this.f303789c) {
            cVar.dispose();
        }
    }

    @Override // io.reactivex.subjects.i
    @cj.g
    public Throwable h8() {
        Object obj = this.f303787a.get();
        if (q.v(obj)) {
            return q.p(obj);
        }
        return null;
    }

    @Override // io.reactivex.subjects.i
    public boolean i8() {
        return q.s(this.f303787a.get());
    }

    @Override // io.reactivex.subjects.i
    public boolean j8() {
        return this.f303788b.get().length != 0;
    }

    @Override // io.reactivex.subjects.i
    public boolean k8() {
        return q.v(this.f303787a.get());
    }

    boolean m8(c<T> cVar) {
        c<T>[] cVarArr;
        c[] cVarArr2;
        do {
            cVarArr = this.f303788b.get();
            if (cVarArr == f303785e) {
                return false;
            }
            int length = cVarArr.length;
            cVarArr2 = new c[length + 1];
            System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
            cVarArr2[length] = cVar;
        } while (!z1.a(this.f303788b, cVarArr, cVarArr2));
        return true;
    }

    public void n8() {
        this.f303787a.a();
    }

    @Override // io.reactivex.i0
    public void onComplete() {
        if (!this.f303789c) {
            this.f303789c = true;
            Object objK = q.k();
            b<T> bVar = this.f303787a;
            bVar.c(objK);
            for (c<T> cVar : B8(objK)) {
                bVar.d(cVar);
            }
        }
    }

    @Override // io.reactivex.i0
    public void onError(Throwable th2) {
        io.reactivex.internal.functions.b.g(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f303789c) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        this.f303789c = true;
        Object objN = q.n(th2);
        b<T> bVar = this.f303787a;
        bVar.c(objN);
        for (c<T> cVar : B8(objN)) {
            bVar.d(cVar);
        }
    }

    @Override // io.reactivex.i0
    public void onNext(T t10) {
        io.reactivex.internal.functions.b.g(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f303789c) {
            b<T> bVar = this.f303787a;
            bVar.add(t10);
            for (c<T> cVar : this.f303788b.get()) {
                bVar.d(cVar);
            }
        }
    }

    @cj.g
    public T u8() {
        return this.f303787a.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object[] v8() {
        Object[] objArr = f303786f;
        Object[] objArrW8 = w8(objArr);
        return objArrW8 == objArr ? new Object[0] : objArrW8;
    }

    public T[] w8(T[] tArr) {
        return this.f303787a.b(tArr);
    }

    public boolean x8() {
        return this.f303787a.size() != 0;
    }

    int y8() {
        return this.f303788b.get().length;
    }

    void z8(c<T> cVar) {
        c<T>[] cVarArr;
        c[] cVarArr2;
        do {
            cVarArr = this.f303788b.get();
            if (cVarArr == f303785e || cVarArr == f303784d) {
                return;
            }
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
                return;
            }
            if (length == 1) {
                cVarArr2 = f303784d;
            } else {
                c[] cVarArr3 = new c[length - 1];
                System.arraycopy(cVarArr, 0, cVarArr3, 0, i10);
                System.arraycopy(cVarArr, i10 + 1, cVarArr3, i10, (length - i10) - 1);
                cVarArr2 = cVarArr3;
            }
        } while (!z1.a(this.f303788b, cVarArr, cVarArr2));
    }
}
