package rx.observers;

import rx.Observer;
import rx.exceptions.OnErrorNotImplementedException;
import rx.functions.Action0;
import rx.functions.Action1;

/* JADX INFO: loaded from: classes14.dex */
public final class Observers {
    private static final Observer<Object> EMPTY = new Observer<Object>() { // from class: rx.observers.Observers.1
        @Override // rx.Observer
        public final void onCompleted() {
        }

        @Override // rx.Observer
        public final void onError(Throwable th2) {
            throw new OnErrorNotImplementedException(th2);
        }

        @Override // rx.Observer
        public final void onNext(Object obj) {
        }
    };

    private Observers() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Observer<T> create(final Action1<? super T> action1) {
        if (action1 != null) {
            return new Observer<T>() { // from class: rx.observers.Observers.2
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

    public static <T> Observer<T> empty() {
        return (Observer<T>) EMPTY;
    }

    public static <T> Observer<T> create(final Action1<? super T> action1, final Action1<Throwable> action2) {
        if (action1 == null) {
            throw new IllegalArgumentException("onNext can not be null");
        }
        if (action2 != null) {
            return new Observer<T>() { // from class: rx.observers.Observers.3
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

    public static <T> Observer<T> create(final Action1<? super T> action1, final Action1<Throwable> action2, final Action0 action0) {
        if (action1 == null) {
            throw new IllegalArgumentException("onNext can not be null");
        }
        if (action2 == null) {
            throw new IllegalArgumentException("onError can not be null");
        }
        if (action0 != null) {
            return new Observer<T>() { // from class: rx.observers.Observers.4
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
