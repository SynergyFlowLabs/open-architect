package io.reactivex.internal.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final dj.o<Object, Object> f298690a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Runnable f298691b = new r();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final dj.a f298692c = new o();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final dj.g<Object> f298693d = new p();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final dj.g<Throwable> f298694e = new t();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final dj.g<Throwable> f298695f = new h0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final dj.q f298696g = new q();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final dj.r<Object> f298697h = new m0();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final dj.r<Object> f298698i = new u();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final Callable<Object> f298699j = new g0();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final Comparator<Object> f298700k = new c0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final dj.g<org.reactivestreams.w> f298701l = new a0();

    /* JADX INFO: renamed from: io.reactivex.internal.functions.a$a, reason: collision with other inner class name */
    static final class C2121a<T> implements dj.g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final dj.a f298702a;

        C2121a(dj.a aVar) {
            this.f298702a = aVar;
        }

        @Override // dj.g
        public void accept(T t10) throws Exception {
            this.f298702a.run();
        }
    }

    static final class a0 implements dj.g<org.reactivestreams.w> {
        a0() {
        }

        @Override // dj.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(org.reactivestreams.w wVar) throws Exception {
            wVar.request(Long.MAX_VALUE);
        }
    }

    static final class b<T1, T2, R> implements dj.o<Object[], R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final dj.c<? super T1, ? super T2, ? extends R> f298703a;

        b(dj.c<? super T1, ? super T2, ? extends R> cVar) {
            this.f298703a = cVar;
        }

        @Override // dj.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 2) {
                return this.f298703a.apply(objArr[0], objArr[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
        }
    }

    enum b0 implements Comparator<Object> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    static final class c<T1, T2, T3, R> implements dj.o<Object[], R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final dj.h<T1, T2, T3, R> f298706a;

        c(dj.h<T1, T2, T3, R> hVar) {
            this.f298706a = hVar;
        }

        @Override // dj.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 3) {
                return this.f298706a.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2]);
            }
            throw new IllegalArgumentException("Array of size 3 expected but got " + objArr.length);
        }
    }

    static final class c0 implements Comparator<Object> {
        c0() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    static final class d<T1, T2, T3, T4, R> implements dj.o<Object[], R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final dj.i<T1, T2, T3, T4, R> f298707a;

        d(dj.i<T1, T2, T3, T4, R> iVar) {
            this.f298707a = iVar;
        }

        @Override // dj.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 4) {
                throw new IllegalArgumentException("Array of size 4 expected but got " + objArr.length);
            }
            return this.f298707a.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3]);
        }
    }

    static final class d0<T> implements dj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final dj.g<? super io.reactivex.a0<T>> f298708a;

        d0(dj.g<? super io.reactivex.a0<T>> gVar) {
            this.f298708a = gVar;
        }

        @Override // dj.a
        public void run() throws Exception {
            this.f298708a.accept(io.reactivex.a0.a());
        }
    }

    static final class e<T1, T2, T3, T4, T5, R> implements dj.o<Object[], R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final dj.j<T1, T2, T3, T4, T5, R> f298709a;

        e(dj.j<T1, T2, T3, T4, T5, R> jVar) {
            this.f298709a = jVar;
        }

        @Override // dj.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 5) {
                throw new IllegalArgumentException("Array of size 5 expected but got " + objArr.length);
            }
            return this.f298709a.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4]);
        }
    }

    static final class e0<T> implements dj.g<Throwable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final dj.g<? super io.reactivex.a0<T>> f298710a;

        e0(dj.g<? super io.reactivex.a0<T>> gVar) {
            this.f298710a = gVar;
        }

        @Override // dj.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) throws Exception {
            this.f298710a.accept(io.reactivex.a0.b(th2));
        }
    }

    static final class f<T1, T2, T3, T4, T5, T6, R> implements dj.o<Object[], R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final dj.k<T1, T2, T3, T4, T5, T6, R> f298711a;

        f(dj.k<T1, T2, T3, T4, T5, T6, R> kVar) {
            this.f298711a = kVar;
        }

        @Override // dj.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 6) {
                throw new IllegalArgumentException("Array of size 6 expected but got " + objArr.length);
            }
            return this.f298711a.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4], (T6) objArr[5]);
        }
    }

    static final class f0<T> implements dj.g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final dj.g<? super io.reactivex.a0<T>> f298712a;

        f0(dj.g<? super io.reactivex.a0<T>> gVar) {
            this.f298712a = gVar;
        }

        @Override // dj.g
        public void accept(T t10) throws Exception {
            this.f298712a.accept(io.reactivex.a0.c(t10));
        }
    }

    static final class g<T1, T2, T3, T4, T5, T6, T7, R> implements dj.o<Object[], R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final dj.l<T1, T2, T3, T4, T5, T6, T7, R> f298713a;

        g(dj.l<T1, T2, T3, T4, T5, T6, T7, R> lVar) {
            this.f298713a = lVar;
        }

        @Override // dj.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 7) {
                throw new IllegalArgumentException("Array of size 7 expected but got " + objArr.length);
            }
            return this.f298713a.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4], (T6) objArr[5], (T7) objArr[6]);
        }
    }

    static final class g0 implements Callable<Object> {
        g0() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return null;
        }
    }

    static final class h<T1, T2, T3, T4, T5, T6, T7, T8, R> implements dj.o<Object[], R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final dj.m<T1, T2, T3, T4, T5, T6, T7, T8, R> f298714a;

        h(dj.m<T1, T2, T3, T4, T5, T6, T7, T8, R> mVar) {
            this.f298714a = mVar;
        }

        @Override // dj.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 8) {
                throw new IllegalArgumentException("Array of size 8 expected but got " + objArr.length);
            }
            return this.f298714a.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4], (T6) objArr[5], (T7) objArr[6], (T8) objArr[7]);
        }
    }

    static final class h0 implements dj.g<Throwable> {
        h0() {
        }

        @Override // dj.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) {
            io.reactivex.plugins.a.Y(new io.reactivex.exceptions.d(th2));
        }
    }

    static final class i<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> implements dj.o<Object[], R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final dj.n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f298715a;

        i(dj.n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> nVar) {
            this.f298715a = nVar;
        }

        @Override // dj.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 9) {
                throw new IllegalArgumentException("Array of size 9 expected but got " + objArr.length);
            }
            return this.f298715a.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4], (T6) objArr[5], (T7) objArr[6], (T8) objArr[7], (T9) objArr[8]);
        }
    }

    static final class i0<T> implements dj.o<T, io.reactivex.schedulers.d<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final TimeUnit f298716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.j0 f298717b;

        i0(TimeUnit timeUnit, io.reactivex.j0 j0Var) {
            this.f298716a = timeUnit;
            this.f298717b = j0Var;
        }

        @Override // dj.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.schedulers.d<T> apply(T t10) throws Exception {
            return new io.reactivex.schedulers.d<>(t10, this.f298717b.d(this.f298716a), this.f298716a);
        }
    }

    static final class j<T> implements Callable<List<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f298718a;

        j(int i10) {
            this.f298718a = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> call() throws Exception {
            return new ArrayList(this.f298718a);
        }
    }

    static final class j0<K, T> implements dj.b<Map<K, T>, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final dj.o<? super T, ? extends K> f298719a;

        j0(dj.o<? super T, ? extends K> oVar) {
            this.f298719a = oVar;
        }

        @Override // dj.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Map<K, T> map, T t10) throws Exception {
            map.put(this.f298719a.apply(t10), t10);
        }
    }

    static final class k<T> implements dj.r<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final dj.e f298720a;

        k(dj.e eVar) {
            this.f298720a = eVar;
        }

        @Override // dj.r
        public boolean test(T t10) throws Exception {
            return !this.f298720a.a();
        }
    }

    static final class k0<K, V, T> implements dj.b<Map<K, V>, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final dj.o<? super T, ? extends V> f298721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final dj.o<? super T, ? extends K> f298722b;

        k0(dj.o<? super T, ? extends V> oVar, dj.o<? super T, ? extends K> oVar2) {
            this.f298721a = oVar;
            this.f298722b = oVar2;
        }

        @Override // dj.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Map<K, V> map, T t10) throws Exception {
            map.put(this.f298722b.apply(t10), this.f298721a.apply(t10));
        }
    }

    public static class l implements dj.g<org.reactivestreams.w> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f298723a;

        l(int i10) {
            this.f298723a = i10;
        }

        @Override // dj.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(org.reactivestreams.w wVar) throws Exception {
            wVar.request(this.f298723a);
        }
    }

    static final class l0<K, V, T> implements dj.b<Map<K, Collection<V>>, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final dj.o<? super K, ? extends Collection<? super V>> f298724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final dj.o<? super T, ? extends V> f298725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final dj.o<? super T, ? extends K> f298726c;

        l0(dj.o<? super K, ? extends Collection<? super V>> oVar, dj.o<? super T, ? extends V> oVar2, dj.o<? super T, ? extends K> oVar3) {
            this.f298724a = oVar;
            this.f298725b = oVar2;
            this.f298726c = oVar3;
        }

        @Override // dj.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Map<K, Collection<V>> map, T t10) throws Exception {
            K kApply = this.f298726c.apply(t10);
            Collection<? super V> collectionApply = (Collection) map.get(kApply);
            if (collectionApply == null) {
                collectionApply = this.f298724a.apply(kApply);
                map.put(kApply, collectionApply);
            }
            collectionApply.add(this.f298725b.apply(t10));
        }
    }

    static final class m<T, U> implements dj.o<T, U> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Class<U> f298727a;

        m(Class<U> cls) {
            this.f298727a = cls;
        }

        @Override // dj.o
        public U apply(T t10) throws Exception {
            return this.f298727a.cast(t10);
        }
    }

    static final class m0 implements dj.r<Object> {
        m0() {
        }

        @Override // dj.r
        public boolean test(Object obj) {
            return true;
        }
    }

    static final class n<T, U> implements dj.r<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Class<U> f298728a;

        n(Class<U> cls) {
            this.f298728a = cls;
        }

        @Override // dj.r
        public boolean test(T t10) throws Exception {
            return this.f298728a.isInstance(t10);
        }
    }

    static final class o implements dj.a {
        o() {
        }

        @Override // dj.a
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    static final class p implements dj.g<Object> {
        p() {
        }

        @Override // dj.g
        public void accept(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    static final class q implements dj.q {
        q() {
        }

        @Override // dj.q
        public void accept(long j10) {
        }
    }

    static final class r implements Runnable {
        r() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    static final class s<T> implements dj.r<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final T f298729a;

        s(T t10) {
            this.f298729a = t10;
        }

        @Override // dj.r
        public boolean test(T t10) throws Exception {
            return io.reactivex.internal.functions.b.c(t10, this.f298729a);
        }
    }

    static final class t implements dj.g<Throwable> {
        t() {
        }

        @Override // dj.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) {
            io.reactivex.plugins.a.Y(th2);
        }
    }

    static final class u implements dj.r<Object> {
        u() {
        }

        @Override // dj.r
        public boolean test(Object obj) {
            return false;
        }
    }

    static final class v implements dj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Future<?> f298730a;

        v(Future<?> future) {
            this.f298730a = future;
        }

        @Override // dj.a
        public void run() throws Exception {
            this.f298730a.get();
        }
    }

    enum w implements Callable<Set<Object>> {
        INSTANCE;

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Set<Object> call() throws Exception {
            return new HashSet();
        }
    }

    static final class x implements dj.o<Object, Object> {
        x() {
        }

        @Override // dj.o
        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    static final class y<T, U> implements Callable<U>, dj.o<T, U> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final U f298733a;

        y(U u10) {
            this.f298733a = u10;
        }

        @Override // dj.o
        public U apply(T t10) throws Exception {
            return this.f298733a;
        }

        @Override // java.util.concurrent.Callable
        public U call() throws Exception {
            return this.f298733a;
        }
    }

    static final class z<T> implements dj.o<List<T>, List<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Comparator<? super T> f298734a;

        z(Comparator<? super T> comparator) {
            this.f298734a = comparator;
        }

        @Override // dj.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> apply(List<T> list) {
            Collections.sort(list, this.f298734a);
            return list;
        }
    }

    private a() {
        throw new IllegalStateException("No instances!");
    }

    public static <T1, T2, T3, T4, T5, R> dj.o<Object[], R> A(dj.j<T1, T2, T3, T4, T5, R> jVar) {
        io.reactivex.internal.functions.b.g(jVar, "f is null");
        return new e(jVar);
    }

    public static <T1, T2, T3, T4, T5, T6, R> dj.o<Object[], R> B(dj.k<T1, T2, T3, T4, T5, T6, R> kVar) {
        io.reactivex.internal.functions.b.g(kVar, "f is null");
        return new f(kVar);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> dj.o<Object[], R> C(dj.l<T1, T2, T3, T4, T5, T6, T7, R> lVar) {
        io.reactivex.internal.functions.b.g(lVar, "f is null");
        return new g(lVar);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> dj.o<Object[], R> D(dj.m<T1, T2, T3, T4, T5, T6, T7, T8, R> mVar) {
        io.reactivex.internal.functions.b.g(mVar, "f is null");
        return new h(mVar);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> dj.o<Object[], R> E(dj.n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> nVar) {
        io.reactivex.internal.functions.b.g(nVar, "f is null");
        return new i(nVar);
    }

    public static <T, K> dj.b<Map<K, T>, T> F(dj.o<? super T, ? extends K> oVar) {
        return new j0(oVar);
    }

    public static <T, K, V> dj.b<Map<K, V>, T> G(dj.o<? super T, ? extends K> oVar, dj.o<? super T, ? extends V> oVar2) {
        return new k0(oVar2, oVar);
    }

    public static <T, K, V> dj.b<Map<K, Collection<V>>, T> H(dj.o<? super T, ? extends K> oVar, dj.o<? super T, ? extends V> oVar2, dj.o<? super K, ? extends Collection<? super V>> oVar3) {
        return new l0(oVar3, oVar2, oVar);
    }

    public static <T> dj.g<T> a(dj.a aVar) {
        return new C2121a(aVar);
    }

    public static <T> dj.r<T> b() {
        return (dj.r<T>) f298698i;
    }

    public static <T> dj.r<T> c() {
        return (dj.r<T>) f298697h;
    }

    public static <T> dj.g<T> d(int i10) {
        return new l(i10);
    }

    public static <T, U> dj.o<T, U> e(Class<U> cls) {
        return new m(cls);
    }

    public static <T> Callable<List<T>> f(int i10) {
        return new j(i10);
    }

    public static <T> Callable<Set<T>> g() {
        return w.INSTANCE;
    }

    public static <T> dj.g<T> h() {
        return (dj.g<T>) f298693d;
    }

    public static <T> dj.r<T> i(T t10) {
        return new s(t10);
    }

    public static dj.a j(Future<?> future) {
        return new v(future);
    }

    public static <T> dj.o<T, T> k() {
        return (dj.o<T, T>) f298690a;
    }

    public static <T, U> dj.r<T> l(Class<U> cls) {
        return new n(cls);
    }

    public static <T> Callable<T> m(T t10) {
        return new y(t10);
    }

    public static <T, U> dj.o<T, U> n(U u10) {
        return new y(u10);
    }

    public static <T> dj.o<List<T>, List<T>> o(Comparator<? super T> comparator) {
        return new z(comparator);
    }

    public static <T> Comparator<T> p() {
        return b0.INSTANCE;
    }

    public static <T> Comparator<T> q() {
        return (Comparator<T>) f298700k;
    }

    public static <T> dj.a r(dj.g<? super io.reactivex.a0<T>> gVar) {
        return new d0(gVar);
    }

    public static <T> dj.g<Throwable> s(dj.g<? super io.reactivex.a0<T>> gVar) {
        return new e0(gVar);
    }

    public static <T> dj.g<T> t(dj.g<? super io.reactivex.a0<T>> gVar) {
        return new f0(gVar);
    }

    public static <T> Callable<T> u() {
        return (Callable<T>) f298699j;
    }

    public static <T> dj.r<T> v(dj.e eVar) {
        return new k(eVar);
    }

    public static <T> dj.o<T, io.reactivex.schedulers.d<T>> w(TimeUnit timeUnit, io.reactivex.j0 j0Var) {
        return new i0(timeUnit, j0Var);
    }

    public static <T1, T2, R> dj.o<Object[], R> x(dj.c<? super T1, ? super T2, ? extends R> cVar) {
        io.reactivex.internal.functions.b.g(cVar, "f is null");
        return new b(cVar);
    }

    public static <T1, T2, T3, R> dj.o<Object[], R> y(dj.h<T1, T2, T3, R> hVar) {
        io.reactivex.internal.functions.b.g(hVar, "f is null");
        return new c(hVar);
    }

    public static <T1, T2, T3, T4, R> dj.o<Object[], R> z(dj.i<T1, T2, T3, T4, R> iVar) {
        io.reactivex.internal.functions.b.g(iVar, "f is null");
        return new d(iVar);
    }
}
