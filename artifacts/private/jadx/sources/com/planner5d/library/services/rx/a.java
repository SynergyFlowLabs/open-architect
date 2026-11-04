package com.planner5d.library.services.rx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import rx.Observable;
import rx.Subscriber;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Object, C1679a> f224914a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f224915b = new Object();

    /* JADX INFO: renamed from: com.planner5d.library.services.rx.a$a, reason: collision with other inner class name */
    private static class C1679a<T> implements Observable.OnSubscribe<T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Object f224921f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f224917b = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<Subscriber<? super T>> f224918c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<Subscriber<? super T>> f224919d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Observable<T> f224920e = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Observable<T> f224916a = Observable.create(this).subscribeOn(c.f224933c);

        /* JADX INFO: renamed from: com.planner5d.library.services.rx.a$a$a, reason: collision with other inner class name */
        class C1680a extends e<T> {
            C1680a() {
            }

            @Override // com.planner5d.library.services.rx.e
            public void c(Throwable th2) {
                int size = C1679a.this.f224918c.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((Subscriber) C1679a.this.f224918c.get(i10)).onError(th2);
                }
                C1679a.this.g();
            }

            @Override // com.planner5d.library.services.rx.e, rx.Observer
            public void onCompleted() {
                int size = C1679a.this.f224918c.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((Subscriber) C1679a.this.f224918c.get(i10)).onCompleted();
                }
                C1679a.this.g();
            }

            @Override // com.planner5d.library.services.rx.e, rx.Observer
            public void onNext(T t10) {
                int size = C1679a.this.f224918c.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((Subscriber) C1679a.this.f224918c.get(i10)).onNext(t10);
                }
            }
        }

        public C1679a(Object obj) {
            this.f224921f = obj;
        }

        private void f(Observable<T> observable) {
            observable.subscribe((Subscriber) new C1680a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g() {
            boolean zIsEmpty;
            Observable<T> observableI;
            synchronized (this.f224917b) {
                try {
                    this.f224918c.clear();
                    zIsEmpty = this.f224919d.isEmpty();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!zIsEmpty) {
                synchronized (this.f224917b) {
                    observableI = i();
                }
                f(observableI);
                return;
            }
            synchronized (a.f224915b) {
                try {
                    a.f224914a.remove(this.f224921f);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C1679a<T> h(Observable<T> observable) {
            synchronized (this.f224917b) {
                try {
                    this.f224920e = observable.subscribeOn(Schedulers.newThread());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return this;
        }

        private Observable<T> i() {
            this.f224918c.clear();
            this.f224918c.addAll(this.f224919d);
            this.f224919d.clear();
            return this.f224920e;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void call(Subscriber<? super T> subscriber) {
            synchronized (this.f224917b) {
                try {
                    this.f224919d.add(subscriber);
                    if (this.f224918c.isEmpty()) {
                        f(i());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static <T> Observable<T> c(Object obj, Observable<T> observable) {
        C1679a c1679a;
        synchronized (f224915b) {
            try {
                Map<Object, C1679a> map = f224914a;
                if (!map.containsKey(obj)) {
                    map.put(obj, new C1679a(obj));
                }
                c1679a = map.get(obj);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c1679a.h(observable).f224916a;
    }
}
