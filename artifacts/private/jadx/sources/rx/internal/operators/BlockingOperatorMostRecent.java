package rx.internal.operators;

import java.util.Iterator;
import java.util.NoSuchElementException;
import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;

/* JADX INFO: loaded from: classes14.dex */
public final class BlockingOperatorMostRecent {

    static final class MostRecentObserver<T> extends Subscriber<T> {

        /* JADX INFO: renamed from: nl, reason: collision with root package name */
        final NotificationLite<T> f366742nl;
        volatile Object value;

        MostRecentObserver(T t10) {
            NotificationLite<T> notificationLiteInstance = NotificationLite.instance();
            this.f366742nl = notificationLiteInstance;
            this.value = notificationLiteInstance.next(t10);
        }

        public Iterator<T> getIterable() {
            return new Iterator<T>() { // from class: rx.internal.operators.BlockingOperatorMostRecent.MostRecentObserver.1
                private Object buf;

                @Override // java.util.Iterator
                public boolean hasNext() {
                    Object obj = MostRecentObserver.this.value;
                    this.buf = obj;
                    return !MostRecentObserver.this.f366742nl.isCompleted(obj);
                }

                @Override // java.util.Iterator
                public T next() {
                    try {
                        if (this.buf == null) {
                            this.buf = MostRecentObserver.this.value;
                        }
                        if (MostRecentObserver.this.f366742nl.isCompleted(this.buf)) {
                            throw new NoSuchElementException();
                        }
                        if (MostRecentObserver.this.f366742nl.isError(this.buf)) {
                            throw Exceptions.propagate(MostRecentObserver.this.f366742nl.getError(this.buf));
                        }
                        T value = MostRecentObserver.this.f366742nl.getValue(this.buf);
                        this.buf = null;
                        return value;
                    } catch (Throwable th2) {
                        this.buf = null;
                        throw th2;
                    }
                }

                @Override // java.util.Iterator
                public void remove() {
                    throw new UnsupportedOperationException("Read only iterator");
                }
            };
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.value = this.f366742nl.completed();
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            this.value = this.f366742nl.error(th2);
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            this.value = this.f366742nl.next(t10);
        }
    }

    private BlockingOperatorMostRecent() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Iterable<T> mostRecent(final Observable<? extends T> observable, final T t10) {
        return new Iterable<T>() { // from class: rx.internal.operators.BlockingOperatorMostRecent.1
            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                MostRecentObserver mostRecentObserver = new MostRecentObserver(t10);
                observable.subscribe((Subscriber) mostRecentObserver);
                return mostRecentObserver.getIterable();
            }
        };
    }
}
