package rx.internal.operators;

import java.util.ArrayList;
import java.util.List;
import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func0;
import rx.observers.SerializedSubscriber;
import rx.observers.Subscribers;

/* JADX INFO: loaded from: classes14.dex */
public final class OperatorBufferWithSingleObservable<T, TClosing> implements Observable.Operator<List<T>, T> {
    final Func0<? extends Observable<? extends TClosing>> bufferClosingSelector;
    final int initialCapacity;

    final class BufferingSubscriber extends Subscriber<T> {
        final Subscriber<? super List<T>> child;
        List<T> chunk;
        boolean done;

        public BufferingSubscriber(Subscriber<? super List<T>> subscriber) {
            this.child = subscriber;
            this.chunk = new ArrayList(OperatorBufferWithSingleObservable.this.initialCapacity);
        }

        void emit() {
            synchronized (this) {
                try {
                    if (this.done) {
                        return;
                    }
                    List<T> list = this.chunk;
                    this.chunk = new ArrayList(OperatorBufferWithSingleObservable.this.initialCapacity);
                    try {
                        this.child.onNext(list);
                    } catch (Throwable th2) {
                        unsubscribe();
                        synchronized (this) {
                            try {
                                if (this.done) {
                                    return;
                                }
                                this.done = true;
                                Exceptions.throwOrReport(th2, this.child);
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            try {
                synchronized (this) {
                    try {
                        if (this.done) {
                            return;
                        }
                        this.done = true;
                        List<T> list = this.chunk;
                        this.chunk = null;
                        this.child.onNext(list);
                        this.child.onCompleted();
                        unsubscribe();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                Exceptions.throwOrReport(th3, this.child);
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            synchronized (this) {
                try {
                    if (this.done) {
                        return;
                    }
                    this.done = true;
                    this.chunk = null;
                    this.child.onError(th2);
                    unsubscribe();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            synchronized (this) {
                try {
                    if (this.done) {
                        return;
                    }
                    this.chunk.add(t10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public OperatorBufferWithSingleObservable(Func0<? extends Observable<? extends TClosing>> func0, int i10) {
        this.bufferClosingSelector = func0;
        this.initialCapacity = i10;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super List<T>> subscriber) {
        try {
            Observable<? extends TClosing> observableCall = this.bufferClosingSelector.call();
            final BufferingSubscriber bufferingSubscriber = new BufferingSubscriber(new SerializedSubscriber(subscriber));
            Subscriber<TClosing> subscriber2 = new Subscriber<TClosing>() { // from class: rx.internal.operators.OperatorBufferWithSingleObservable.2
                @Override // rx.Observer
                public void onCompleted() {
                    bufferingSubscriber.onCompleted();
                }

                @Override // rx.Observer
                public void onError(Throwable th2) {
                    bufferingSubscriber.onError(th2);
                }

                @Override // rx.Observer
                public void onNext(TClosing tclosing) {
                    bufferingSubscriber.emit();
                }
            };
            subscriber.add(subscriber2);
            subscriber.add(bufferingSubscriber);
            observableCall.unsafeSubscribe(subscriber2);
            return bufferingSubscriber;
        } catch (Throwable th2) {
            Exceptions.throwOrReport(th2, subscriber);
            return Subscribers.empty();
        }
    }

    public OperatorBufferWithSingleObservable(final Observable<? extends TClosing> observable, int i10) {
        this.bufferClosingSelector = new Func0<Observable<? extends TClosing>>() { // from class: rx.internal.operators.OperatorBufferWithSingleObservable.1
            @Override // rx.functions.Func0, java.util.concurrent.Callable
            public Observable<? extends TClosing> call() {
                return observable;
            }
        };
        this.initialCapacity = i10;
    }
}
