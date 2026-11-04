package rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
import rx.observers.SerializedSubscriber;
import rx.subscriptions.CompositeSubscription;

/* JADX INFO: loaded from: classes14.dex */
public final class OperatorBufferWithStartEndObservable<T, TOpening, TClosing> implements Observable.Operator<List<T>, T> {
    final Func1<? super TOpening, ? extends Observable<? extends TClosing>> bufferClosing;
    final Observable<? extends TOpening> bufferOpening;

    final class BufferingSubscriber extends Subscriber<T> {
        final Subscriber<? super List<T>> child;
        final List<List<T>> chunks = new LinkedList();
        final CompositeSubscription closingSubscriptions;
        boolean done;

        public BufferingSubscriber(Subscriber<? super List<T>> subscriber) {
            this.child = subscriber;
            CompositeSubscription compositeSubscription = new CompositeSubscription();
            this.closingSubscriptions = compositeSubscription;
            add(compositeSubscription);
        }

        void endBuffer(List<T> list) {
            boolean z10;
            synchronized (this) {
                try {
                    if (this.done) {
                        return;
                    }
                    Iterator<List<T>> it = this.chunks.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z10 = false;
                            break;
                        } else if (it.next() == list) {
                            it.remove();
                            z10 = true;
                            break;
                        }
                    }
                    if (z10) {
                        this.child.onNext(list);
                    }
                } catch (Throwable th2) {
                    throw th2;
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
                        LinkedList linkedList = new LinkedList(this.chunks);
                        this.chunks.clear();
                        Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            this.child.onNext((List) it.next());
                        }
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
                    this.chunks.clear();
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
                    Iterator<List<T>> it = this.chunks.iterator();
                    while (it.hasNext()) {
                        it.next().add(t10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void startBuffer(TOpening topening) {
            final ArrayList arrayList = new ArrayList();
            synchronized (this) {
                try {
                    if (this.done) {
                        return;
                    }
                    this.chunks.add(arrayList);
                    try {
                        Observable<? extends TClosing> observableCall = OperatorBufferWithStartEndObservable.this.bufferClosing.call(topening);
                        Subscriber<TClosing> subscriber = new Subscriber<TClosing>() { // from class: rx.internal.operators.OperatorBufferWithStartEndObservable.BufferingSubscriber.1
                            @Override // rx.Observer
                            public void onCompleted() {
                                BufferingSubscriber.this.closingSubscriptions.remove(this);
                                BufferingSubscriber.this.endBuffer(arrayList);
                            }

                            @Override // rx.Observer
                            public void onError(Throwable th2) {
                                BufferingSubscriber.this.onError(th2);
                            }

                            @Override // rx.Observer
                            public void onNext(TClosing tclosing) {
                                BufferingSubscriber.this.closingSubscriptions.remove(this);
                                BufferingSubscriber.this.endBuffer(arrayList);
                            }
                        };
                        this.closingSubscriptions.add(subscriber);
                        observableCall.unsafeSubscribe(subscriber);
                    } catch (Throwable th2) {
                        Exceptions.throwOrReport(th2, this);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public OperatorBufferWithStartEndObservable(Observable<? extends TOpening> observable, Func1<? super TOpening, ? extends Observable<? extends TClosing>> func1) {
        this.bufferOpening = observable;
        this.bufferClosing = func1;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super List<T>> subscriber) {
        final BufferingSubscriber bufferingSubscriber = new BufferingSubscriber(new SerializedSubscriber(subscriber));
        Subscriber<TOpening> subscriber2 = new Subscriber<TOpening>() { // from class: rx.internal.operators.OperatorBufferWithStartEndObservable.1
            @Override // rx.Observer
            public void onCompleted() {
                bufferingSubscriber.onCompleted();
            }

            @Override // rx.Observer
            public void onError(Throwable th2) {
                bufferingSubscriber.onError(th2);
            }

            @Override // rx.Observer
            public void onNext(TOpening topening) {
                bufferingSubscriber.startBuffer(topening);
            }
        };
        subscriber.add(subscriber2);
        subscriber.add(bufferingSubscriber);
        this.bufferOpening.unsafeSubscribe(subscriber2);
        return bufferingSubscriber;
    }
}
