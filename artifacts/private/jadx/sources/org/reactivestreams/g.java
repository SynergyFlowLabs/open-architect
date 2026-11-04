package org.reactivestreams;

import java.util.Objects;
import java.util.concurrent.Flow;

/* JADX INFO: loaded from: classes14.dex */
public final class g {

    static final class a<T> implements Flow.Publisher<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final u<? extends T> f339431a;

        public a(u<? extends T> uVar) {
            this.f339431a = uVar;
        }

        @Override // java.util.concurrent.Flow.Publisher
        public void subscribe(Flow.Subscriber<? super T> subscriber) {
            this.f339431a.e(subscriber == null ? null : new C2427g(subscriber));
        }
    }

    static final class b<T, U> implements Flow.Processor<T, U> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final t<? super T, ? extends U> f339432a;

        public b(t<? super T, ? extends U> tVar) {
            this.f339432a = tVar;
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onComplete() {
            this.f339432a.onComplete();
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onError(Throwable th2) {
            this.f339432a.onError(th2);
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onNext(T t10) {
            this.f339432a.onNext(t10);
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onSubscribe(Flow.Subscription subscription) {
            this.f339432a.l(subscription == null ? null : new h(subscription));
        }

        @Override // java.util.concurrent.Flow.Publisher
        public void subscribe(Flow.Subscriber<? super U> subscriber) {
            this.f339432a.e(subscriber == null ? null : new C2427g(subscriber));
        }
    }

    static final class c<T> implements Flow.Subscriber<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final v<? super T> f339433a;

        public c(v<? super T> vVar) {
            this.f339433a = vVar;
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onComplete() {
            this.f339433a.onComplete();
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onError(Throwable th2) {
            this.f339433a.onError(th2);
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onNext(T t10) {
            this.f339433a.onNext(t10);
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onSubscribe(Flow.Subscription subscription) {
            this.f339433a.l(subscription == null ? null : new h(subscription));
        }
    }

    static final class d implements Flow.Subscription {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final w f339434a;

        public d(w wVar) {
            this.f339434a = wVar;
        }

        @Override // java.util.concurrent.Flow.Subscription
        public void cancel() {
            this.f339434a.cancel();
        }

        @Override // java.util.concurrent.Flow.Subscription
        public void request(long j10) {
            this.f339434a.request(j10);
        }
    }

    static final class e<T> implements u<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Flow.Publisher<? extends T> f339435a;

        public e(Flow.Publisher<? extends T> publisher) {
            this.f339435a = publisher;
        }

        @Override // org.reactivestreams.u
        public void e(v<? super T> vVar) {
            this.f339435a.subscribe(vVar == null ? null : new c(vVar));
        }
    }

    static final class f<T, U> implements t<T, U> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Flow.Processor<? super T, ? extends U> f339436a;

        public f(Flow.Processor<? super T, ? extends U> processor) {
            this.f339436a = processor;
        }

        @Override // org.reactivestreams.u
        public void e(v<? super U> vVar) {
            this.f339436a.subscribe(vVar == null ? null : new c(vVar));
        }

        @Override // org.reactivestreams.v
        public void l(w wVar) {
            this.f339436a.onSubscribe(wVar == null ? null : new d(wVar));
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f339436a.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f339436a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            this.f339436a.onNext(t10);
        }
    }

    /* JADX INFO: renamed from: org.reactivestreams.g$g, reason: collision with other inner class name */
    static final class C2427g<T> implements v<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Flow.Subscriber<? super T> f339437a;

        public C2427g(Flow.Subscriber<? super T> subscriber) {
            this.f339437a = subscriber;
        }

        @Override // org.reactivestreams.v
        public void l(w wVar) {
            this.f339437a.onSubscribe(wVar == null ? null : new d(wVar));
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f339437a.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f339437a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            this.f339437a.onNext(t10);
        }
    }

    static final class h implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Flow.Subscription f339438a;

        public h(Flow.Subscription subscription) {
            this.f339438a = subscription;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f339438a.cancel();
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            this.f339438a.request(j10);
        }
    }

    private g() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> Flow.Processor<T, U> a(t<? super T, ? extends U> tVar) {
        Objects.requireNonNull(tVar, "reactiveStreamsProcessor");
        if (tVar instanceof f) {
            return ((f) tVar).f339436a;
        }
        return org.reactivestreams.e.a(tVar) ? org.reactivestreams.f.a(tVar) : new b(tVar);
    }

    public static <T> Flow.Publisher<T> b(u<? extends T> uVar) {
        Objects.requireNonNull(uVar, "reactiveStreamsPublisher");
        if (uVar instanceof e) {
            return ((e) uVar).f339435a;
        }
        return org.reactivestreams.a.a(uVar) ? org.reactivestreams.b.a(uVar) : new a(uVar);
    }

    public static <T> Flow.Subscriber<T> c(v<T> vVar) {
        Objects.requireNonNull(vVar, "reactiveStreamsSubscriber");
        if (vVar instanceof C2427g) {
            return ((C2427g) vVar).f339437a;
        }
        return org.reactivestreams.c.a(vVar) ? org.reactivestreams.d.a(vVar) : new c(vVar);
    }

    public static <T, U> t<T, U> d(Flow.Processor<? super T, ? extends U> processor) {
        Objects.requireNonNull(processor, "flowProcessor");
        if (processor instanceof b) {
            return ((b) processor).f339432a;
        }
        return processor instanceof t ? (t) processor : new f(processor);
    }

    public static <T> u<T> e(Flow.Publisher<? extends T> publisher) {
        Objects.requireNonNull(publisher, "flowPublisher");
        if (publisher instanceof a) {
            return ((a) publisher).f339431a;
        }
        return publisher instanceof u ? (u) publisher : new e(publisher);
    }

    public static <T> v<T> f(Flow.Subscriber<T> subscriber) {
        Objects.requireNonNull(subscriber, "flowSubscriber");
        if (subscriber instanceof c) {
            return ((c) subscriber).f339433a;
        }
        return subscriber instanceof v ? (v) subscriber : new C2427g(subscriber);
    }
}
