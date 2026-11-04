package rx.observers;

import rx.Observer;
import rx.Subscriber;
import rx.exceptions.OnErrorNotImplementedException;
import rx.functions.Action0;
import rx.functions.Action1;

/* JADX INFO: loaded from: classes14.dex */
public final class Subscribers {
    private Subscribers() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Subscriber<T> create(final Action1<? super T> action1) {
        if (action1 != null) {
            return new Subscriber<T>() { // from class: rx.observers.Subscribers.2
                @Override // rx.Observer
                public final void onCompleted() {
                }

                @Override // rx.Observer
                public final void onError(Throwable th2) {
                    throw new OnErrorNotImplementedException(th2);
                }

                @Override // rx.Observer
                public final void onNext(T t10) {
                    action1.call(t10);
                }
            };
        }
        throw new IllegalArgumentException("onNext can not be null");
    }

    public static <T> Subscriber<T> empty() {
        return from(Observers.empty());
    }

    public static <T> Subscriber<T> from(final Observer<? super T> observer) {
        return new Subscriber<T>() { // from class: rx.observers.Subscribers.1
            @Override // rx.Observer
            public void onCompleted() {
                observer.onCompleted();
            }

            @Override // rx.Observer
            public void onError(Throwable th2) {
                observer.onError(th2);
            }

            @Override // rx.Observer
            public void onNext(T t10) {
                observer.onNext(t10);
            }
        };
    }

    public static <T> Subscriber<T> wrap(final Subscriber<? super T> subscriber) {
        return new Subscriber<T>(subscriber) { // from class: rx.observers.Subscribers.5
            @Override // rx.Observer
            public void onCompleted() {
                subscriber.onCompleted();
            }

            @Override // rx.Observer
            public void onError(Throwable th2) {
                subscriber.onError(th2);
            }

            @Override // rx.Observer
            public void onNext(T t10) {
                subscriber.onNext(t10);
            }
        };
    }

    public static <T> Subscriber<T> create(final Action1<? super T> action1, final Action1<Throwable> action2) {
        if (action1 == null) {
            throw new IllegalArgumentException("onNext can not be null");
        }
        if (action2 != null) {
            return new Subscriber<T>() { // from class: rx.observers.Subscribers.3
                @Override // rx.Observer
                public final void onCompleted() {
                }

                @Override // rx.Observer
                public final void onError(Throwable th2) {
                    action2.call(th2);
                }

                @Override // rx.Observer
                public final void onNext(T t10) {
                    action1.call(t10);
                }
            };
        }
        throw new IllegalArgumentException("onError can not be null");
    }

    public static <T> Subscriber<T> create(final Action1<? super T> action1, final Action1<Throwable> action2, final Action0 action0) {
        if (action1 == null) {
            throw new IllegalArgumentException("onNext can not be null");
        }
        if (action2 == null) {
            throw new IllegalArgumentException("onError can not be null");
        }
        if (action0 != null) {
            return new Subscriber<T>() { // from class: rx.observers.Subscribers.4
                @Override // rx.Observer
                public final void onCompleted() {
                    action0.call();
                }

                @Override // rx.Observer
                public final void onError(Throwable th2) {
                    action2.call(th2);
                }

                @Override // rx.Observer
                public final void onNext(T t10) {
                    action1.call(t10);
                }
            };
        }
        throw new IllegalArgumentException("onComplete can not be null");
    }
}
