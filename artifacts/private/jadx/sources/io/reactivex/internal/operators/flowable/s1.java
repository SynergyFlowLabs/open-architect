package io.reactivex.internal.operators.flowable;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class s1 {

    static final class a<T> implements Callable<io.reactivex.flowables.a<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.reactivex.l<T> f300115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f300116b;

        a(io.reactivex.l<T> lVar, int i10) {
            this.f300115a = lVar;
            this.f300116b = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.flowables.a<T> call() {
            return this.f300115a.g5(this.f300116b);
        }
    }

    static final class b<T> implements Callable<io.reactivex.flowables.a<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.reactivex.l<T> f300117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f300118b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f300119c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final TimeUnit f300120d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final io.reactivex.j0 f300121e;

        b(io.reactivex.l<T> lVar, int i10, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
            this.f300117a = lVar;
            this.f300118b = i10;
            this.f300119c = j10;
            this.f300120d = timeUnit;
            this.f300121e = j0Var;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.flowables.a<T> call() {
            return this.f300117a.i5(this.f300118b, this.f300119c, this.f300120d, this.f300121e);
        }
    }

    static final class c<T, U> implements dj.o<T, org.reactivestreams.u<U>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final dj.o<? super T, ? extends Iterable<? extends U>> f300122a;

        c(dj.o<? super T, ? extends Iterable<? extends U>> oVar) {
            this.f300122a = oVar;
        }

        @Override // dj.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public org.reactivestreams.u<U> apply(T t10) throws Exception {
            return new j1((Iterable) io.reactivex.internal.functions.b.g(this.f300122a.apply(t10), "The mapper returned a null Iterable"));
        }
    }

    static final class d<U, R, T> implements dj.o<U, R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final dj.c<? super T, ? super U, ? extends R> f300123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T f300124b;

        d(dj.c<? super T, ? super U, ? extends R> cVar, T t10) {
            this.f300123a = cVar;
            this.f300124b = t10;
        }

        @Override // dj.o
        public R apply(U u10) throws Exception {
            return this.f300123a.apply(this.f300124b, u10);
        }
    }

    static final class e<T, R, U> implements dj.o<T, org.reactivestreams.u<R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final dj.c<? super T, ? super U, ? extends R> f300125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final dj.o<? super T, ? extends org.reactivestreams.u<? extends U>> f300126b;

        e(dj.c<? super T, ? super U, ? extends R> cVar, dj.o<? super T, ? extends org.reactivestreams.u<? extends U>> oVar) {
            this.f300125a = cVar;
            this.f300126b = oVar;
        }

        @Override // dj.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public org.reactivestreams.u<R> apply(T t10) throws Exception {
            return new d2((org.reactivestreams.u) io.reactivex.internal.functions.b.g(this.f300126b.apply(t10), "The mapper returned a null Publisher"), new d(this.f300125a, t10));
        }
    }

    static final class f<T, U> implements dj.o<T, org.reactivestreams.u<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final dj.o<? super T, ? extends org.reactivestreams.u<U>> f300127a;

        f(dj.o<? super T, ? extends org.reactivestreams.u<U>> oVar) {
            this.f300127a = oVar;
        }

        @Override // dj.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public org.reactivestreams.u<T> apply(T t10) throws Exception {
            return new e4((org.reactivestreams.u) io.reactivex.internal.functions.b.g(this.f300127a.apply(t10), "The itemDelay returned a null Publisher"), 1L).K3(io.reactivex.internal.functions.a.n(t10)).A1(t10);
        }
    }

    static final class g<T> implements Callable<io.reactivex.flowables.a<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.reactivex.l<T> f300128a;

        g(io.reactivex.l<T> lVar) {
            this.f300128a = lVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.flowables.a<T> call() {
            return this.f300128a.f5();
        }
    }

    static final class h<T, R> implements dj.o<io.reactivex.l<T>, org.reactivestreams.u<R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final dj.o<? super io.reactivex.l<T>, ? extends org.reactivestreams.u<R>> f300129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.reactivex.j0 f300130b;

        h(dj.o<? super io.reactivex.l<T>, ? extends org.reactivestreams.u<R>> oVar, io.reactivex.j0 j0Var) {
            this.f300129a = oVar;
            this.f300130b = j0Var;
        }

        @Override // dj.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public org.reactivestreams.u<R> apply(io.reactivex.l<T> lVar) throws Exception {
            return io.reactivex.l.Y2((org.reactivestreams.u) io.reactivex.internal.functions.b.g(this.f300129a.apply(lVar), "The selector returned a null Publisher")).l4(this.f300130b);
        }
    }

    public enum i implements dj.g<org.reactivestreams.w> {
        INSTANCE;

        @Override // dj.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void accept(org.reactivestreams.w wVar) throws Exception {
            wVar.request(Long.MAX_VALUE);
        }
    }

    static final class j<T, S> implements dj.c<S, io.reactivex.k<T>, S> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final dj.b<S, io.reactivex.k<T>> f300133a;

        j(dj.b<S, io.reactivex.k<T>> bVar) {
            this.f300133a = bVar;
        }

        @Override // dj.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public S apply(S s10, io.reactivex.k<T> kVar) throws Exception {
            this.f300133a.accept(s10, kVar);
            return s10;
        }
    }

    static final class k<T, S> implements dj.c<S, io.reactivex.k<T>, S> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final dj.g<io.reactivex.k<T>> f300134a;

        k(dj.g<io.reactivex.k<T>> gVar) {
            this.f300134a = gVar;
        }

        @Override // dj.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public S apply(S s10, io.reactivex.k<T> kVar) throws Exception {
            this.f300134a.accept(kVar);
            return s10;
        }
    }

    static final class l<T> implements dj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<T> f300135a;

        l(org.reactivestreams.v<T> vVar) {
            this.f300135a = vVar;
        }

        @Override // dj.a
        public void run() throws Exception {
            this.f300135a.onComplete();
        }
    }

    static final class m<T> implements dj.g<Throwable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<T> f300136a;

        m(org.reactivestreams.v<T> vVar) {
            this.f300136a = vVar;
        }

        @Override // dj.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) throws Exception {
            this.f300136a.onError(th2);
        }
    }

    static final class n<T> implements dj.g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<T> f300137a;

        n(org.reactivestreams.v<T> vVar) {
            this.f300137a = vVar;
        }

        @Override // dj.g
        public void accept(T t10) throws Exception {
            this.f300137a.onNext(t10);
        }
    }

    static final class o<T> implements Callable<io.reactivex.flowables.a<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.reactivex.l<T> f300138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f300139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final TimeUnit f300140c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final io.reactivex.j0 f300141d;

        o(io.reactivex.l<T> lVar, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
            this.f300138a = lVar;
            this.f300139b = j10;
            this.f300140c = timeUnit;
            this.f300141d = j0Var;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.flowables.a<T> call() {
            return this.f300138a.l5(this.f300139b, this.f300140c, this.f300141d);
        }
    }

    static final class p<T, R> implements dj.o<List<org.reactivestreams.u<? extends T>>, org.reactivestreams.u<? extends R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final dj.o<? super Object[], ? extends R> f300142a;

        p(dj.o<? super Object[], ? extends R> oVar) {
            this.f300142a = oVar;
        }

        @Override // dj.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public org.reactivestreams.u<? extends R> apply(List<org.reactivestreams.u<? extends T>> list) {
            return io.reactivex.l.H8(list, this.f300142a, false, io.reactivex.l.Y());
        }
    }

    private s1() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> dj.o<T, org.reactivestreams.u<U>> a(dj.o<? super T, ? extends Iterable<? extends U>> oVar) {
        return new c(oVar);
    }

    public static <T, U, R> dj.o<T, org.reactivestreams.u<R>> b(dj.o<? super T, ? extends org.reactivestreams.u<? extends U>> oVar, dj.c<? super T, ? super U, ? extends R> cVar) {
        return new e(cVar, oVar);
    }

    public static <T, U> dj.o<T, org.reactivestreams.u<T>> c(dj.o<? super T, ? extends org.reactivestreams.u<U>> oVar) {
        return new f(oVar);
    }

    public static <T> Callable<io.reactivex.flowables.a<T>> d(io.reactivex.l<T> lVar) {
        return new g(lVar);
    }

    public static <T> Callable<io.reactivex.flowables.a<T>> e(io.reactivex.l<T> lVar, int i10) {
        return new a(lVar, i10);
    }

    public static <T> Callable<io.reactivex.flowables.a<T>> f(io.reactivex.l<T> lVar, int i10, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
        return new b(lVar, i10, j10, timeUnit, j0Var);
    }

    public static <T> Callable<io.reactivex.flowables.a<T>> g(io.reactivex.l<T> lVar, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
        return new o(lVar, j10, timeUnit, j0Var);
    }

    public static <T, R> dj.o<io.reactivex.l<T>, org.reactivestreams.u<R>> h(dj.o<? super io.reactivex.l<T>, ? extends org.reactivestreams.u<R>> oVar, io.reactivex.j0 j0Var) {
        return new h(oVar, j0Var);
    }

    public static <T, S> dj.c<S, io.reactivex.k<T>, S> i(dj.b<S, io.reactivex.k<T>> bVar) {
        return new j(bVar);
    }

    public static <T, S> dj.c<S, io.reactivex.k<T>, S> j(dj.g<io.reactivex.k<T>> gVar) {
        return new k(gVar);
    }

    public static <T> dj.a k(org.reactivestreams.v<T> vVar) {
        return new l(vVar);
    }

    public static <T> dj.g<Throwable> l(org.reactivestreams.v<T> vVar) {
        return new m(vVar);
    }

    public static <T> dj.g<T> m(org.reactivestreams.v<T> vVar) {
        return new n(vVar);
    }

    public static <T, R> dj.o<List<org.reactivestreams.u<? extends T>>, org.reactivestreams.u<? extends R>> n(dj.o<? super Object[], ? extends R> oVar) {
        return new p(oVar);
    }
}
