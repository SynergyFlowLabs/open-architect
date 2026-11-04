package io.reactivex.internal.operators.observable;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class o1 {

    static final class a<T> implements Callable<io.reactivex.observables.a<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.reactivex.b0<T> f302059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f302060b;

        a(io.reactivex.b0<T> b0Var, int i10) {
            this.f302059a = b0Var;
            this.f302060b = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.observables.a<T> call() {
            return this.f302059a.E4(this.f302060b);
        }
    }

    static final class b<T> implements Callable<io.reactivex.observables.a<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.reactivex.b0<T> f302061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f302062b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f302063c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final TimeUnit f302064d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final io.reactivex.j0 f302065e;

        b(io.reactivex.b0<T> b0Var, int i10, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
            this.f302061a = b0Var;
            this.f302062b = i10;
            this.f302063c = j10;
            this.f302064d = timeUnit;
            this.f302065e = j0Var;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.observables.a<T> call() {
            return this.f302061a.G4(this.f302062b, this.f302063c, this.f302064d, this.f302065e);
        }
    }

    static final class c<T, U> implements dj.o<T, io.reactivex.g0<U>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final dj.o<? super T, ? extends Iterable<? extends U>> f302066a;

        c(dj.o<? super T, ? extends Iterable<? extends U>> oVar) {
            this.f302066a = oVar;
        }

        @Override // dj.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.g0<U> apply(T t10) throws Exception {
            return new f1((Iterable) io.reactivex.internal.functions.b.g(this.f302066a.apply(t10), "The mapper returned a null Iterable"));
        }
    }

    static final class d<U, R, T> implements dj.o<U, R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final dj.c<? super T, ? super U, ? extends R> f302067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T f302068b;

        d(dj.c<? super T, ? super U, ? extends R> cVar, T t10) {
            this.f302067a = cVar;
            this.f302068b = t10;
        }

        @Override // dj.o
        public R apply(U u10) throws Exception {
            return this.f302067a.apply(this.f302068b, u10);
        }
    }

    static final class e<T, R, U> implements dj.o<T, io.reactivex.g0<R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final dj.c<? super T, ? super U, ? extends R> f302069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final dj.o<? super T, ? extends io.reactivex.g0<? extends U>> f302070b;

        e(dj.c<? super T, ? super U, ? extends R> cVar, dj.o<? super T, ? extends io.reactivex.g0<? extends U>> oVar) {
            this.f302069a = cVar;
            this.f302070b = oVar;
        }

        @Override // dj.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.g0<R> apply(T t10) throws Exception {
            return new w1((io.reactivex.g0) io.reactivex.internal.functions.b.g(this.f302070b.apply(t10), "The mapper returned a null ObservableSource"), new d(this.f302069a, t10));
        }
    }

    static final class f<T, U> implements dj.o<T, io.reactivex.g0<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final dj.o<? super T, ? extends io.reactivex.g0<U>> f302071a;

        f(dj.o<? super T, ? extends io.reactivex.g0<U>> oVar) {
            this.f302071a = oVar;
        }

        @Override // dj.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.g0<T> apply(T t10) throws Exception {
            return new n3((io.reactivex.g0) io.reactivex.internal.functions.b.g(this.f302071a.apply(t10), "The itemDelay returned a null ObservableSource"), 1L).z3(io.reactivex.internal.functions.a.n(t10)).u1(t10);
        }
    }

    enum g implements dj.o<Object, Object> {
        INSTANCE;

        @Override // dj.o
        public Object apply(Object obj) throws Exception {
            return 0;
        }
    }

    static final class h<T> implements dj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<T> f302074a;

        h(io.reactivex.i0<T> i0Var) {
            this.f302074a = i0Var;
        }

        @Override // dj.a
        public void run() throws Exception {
            this.f302074a.onComplete();
        }
    }

    static final class i<T> implements dj.g<Throwable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<T> f302075a;

        i(io.reactivex.i0<T> i0Var) {
            this.f302075a = i0Var;
        }

        @Override // dj.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) throws Exception {
            this.f302075a.onError(th2);
        }
    }

    static final class j<T> implements dj.g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<T> f302076a;

        j(io.reactivex.i0<T> i0Var) {
            this.f302076a = i0Var;
        }

        @Override // dj.g
        public void accept(T t10) throws Exception {
            this.f302076a.onNext(t10);
        }
    }

    static final class k<T> implements Callable<io.reactivex.observables.a<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.reactivex.b0<T> f302077a;

        k(io.reactivex.b0<T> b0Var) {
            this.f302077a = b0Var;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.observables.a<T> call() {
            return this.f302077a.D4();
        }
    }

    static final class l<T, R> implements dj.o<io.reactivex.b0<T>, io.reactivex.g0<R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final dj.o<? super io.reactivex.b0<T>, ? extends io.reactivex.g0<R>> f302078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.reactivex.j0 f302079b;

        l(dj.o<? super io.reactivex.b0<T>, ? extends io.reactivex.g0<R>> oVar, io.reactivex.j0 j0Var) {
            this.f302078a = oVar;
            this.f302079b = j0Var;
        }

        @Override // dj.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.g0<R> apply(io.reactivex.b0<T> b0Var) throws Exception {
            return io.reactivex.b0.O7((io.reactivex.g0) io.reactivex.internal.functions.b.g(this.f302078a.apply(b0Var), "The selector returned a null ObservableSource")).a4(this.f302079b);
        }
    }

    static final class m<T, S> implements dj.c<S, io.reactivex.k<T>, S> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final dj.b<S, io.reactivex.k<T>> f302080a;

        m(dj.b<S, io.reactivex.k<T>> bVar) {
            this.f302080a = bVar;
        }

        @Override // dj.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public S apply(S s10, io.reactivex.k<T> kVar) throws Exception {
            this.f302080a.accept(s10, kVar);
            return s10;
        }
    }

    static final class n<T, S> implements dj.c<S, io.reactivex.k<T>, S> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final dj.g<io.reactivex.k<T>> f302081a;

        n(dj.g<io.reactivex.k<T>> gVar) {
            this.f302081a = gVar;
        }

        @Override // dj.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public S apply(S s10, io.reactivex.k<T> kVar) throws Exception {
            this.f302081a.accept(kVar);
            return s10;
        }
    }

    static final class o<T> implements Callable<io.reactivex.observables.a<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.reactivex.b0<T> f302082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f302083b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final TimeUnit f302084c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final io.reactivex.j0 f302085d;

        o(io.reactivex.b0<T> b0Var, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
            this.f302082a = b0Var;
            this.f302083b = j10;
            this.f302084c = timeUnit;
            this.f302085d = j0Var;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.observables.a<T> call() {
            return this.f302082a.J4(this.f302083b, this.f302084c, this.f302085d);
        }
    }

    static final class p<T, R> implements dj.o<List<io.reactivex.g0<? extends T>>, io.reactivex.g0<? extends R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final dj.o<? super Object[], ? extends R> f302086a;

        p(dj.o<? super Object[], ? extends R> oVar) {
            this.f302086a = oVar;
        }

        @Override // dj.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.g0<? extends R> apply(List<io.reactivex.g0<? extends T>> list) {
            return io.reactivex.b0.c8(list, this.f302086a, false, io.reactivex.b0.T());
        }
    }

    private o1() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> dj.o<T, io.reactivex.g0<U>> a(dj.o<? super T, ? extends Iterable<? extends U>> oVar) {
        return new c(oVar);
    }

    public static <T, U, R> dj.o<T, io.reactivex.g0<R>> b(dj.o<? super T, ? extends io.reactivex.g0<? extends U>> oVar, dj.c<? super T, ? super U, ? extends R> cVar) {
        return new e(cVar, oVar);
    }

    public static <T, U> dj.o<T, io.reactivex.g0<T>> c(dj.o<? super T, ? extends io.reactivex.g0<U>> oVar) {
        return new f(oVar);
    }

    public static <T> dj.a d(io.reactivex.i0<T> i0Var) {
        return new h(i0Var);
    }

    public static <T> dj.g<Throwable> e(io.reactivex.i0<T> i0Var) {
        return new i(i0Var);
    }

    public static <T> dj.g<T> f(io.reactivex.i0<T> i0Var) {
        return new j(i0Var);
    }

    public static <T> Callable<io.reactivex.observables.a<T>> g(io.reactivex.b0<T> b0Var) {
        return new k(b0Var);
    }

    public static <T> Callable<io.reactivex.observables.a<T>> h(io.reactivex.b0<T> b0Var, int i10) {
        return new a(b0Var, i10);
    }

    public static <T> Callable<io.reactivex.observables.a<T>> i(io.reactivex.b0<T> b0Var, int i10, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
        return new b(b0Var, i10, j10, timeUnit, j0Var);
    }

    public static <T> Callable<io.reactivex.observables.a<T>> j(io.reactivex.b0<T> b0Var, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
        return new o(b0Var, j10, timeUnit, j0Var);
    }

    public static <T, R> dj.o<io.reactivex.b0<T>, io.reactivex.g0<R>> k(dj.o<? super io.reactivex.b0<T>, ? extends io.reactivex.g0<R>> oVar, io.reactivex.j0 j0Var) {
        return new l(oVar, j0Var);
    }

    public static <T, S> dj.c<S, io.reactivex.k<T>, S> l(dj.b<S, io.reactivex.k<T>> bVar) {
        return new m(bVar);
    }

    public static <T, S> dj.c<S, io.reactivex.k<T>, S> m(dj.g<io.reactivex.k<T>> gVar) {
        return new n(gVar);
    }

    public static <T, R> dj.o<List<io.reactivex.g0<? extends T>>, io.reactivex.g0<? extends R>> n(dj.o<? super Object[], ? extends R> oVar) {
        return new p(oVar);
    }
}
