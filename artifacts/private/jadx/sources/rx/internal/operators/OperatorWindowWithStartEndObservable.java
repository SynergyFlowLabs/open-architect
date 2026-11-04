package rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.functions.Func1;
import rx.observers.SerializedObserver;
import rx.observers.SerializedSubscriber;
import rx.subjects.UnicastSubject;
import rx.subscriptions.CompositeSubscription;

/* JADX INFO: loaded from: classes14.dex */
public final class OperatorWindowWithStartEndObservable<T, U, V> implements Observable.Operator<Observable<T>, T> {
    final Func1<? super U, ? extends Observable<? extends V>> windowClosingSelector;
    final Observable<? extends U> windowOpenings;

    static final class SerializedSubject<T> {
        final Observer<T> consumer;
        final Observable<T> producer;

        public SerializedSubject(Observer<T> observer, Observable<T> observable) {
            this.consumer = new SerializedObserver(observer);
            this.producer = observable;
        }
    }

    final class SourceSubscriber extends Subscriber<T> {
        final Subscriber<? super Observable<T>> child;
        final CompositeSubscription composite;
        boolean done;
        final Object guard = new Object();
        final List<SerializedSubject<T>> chunks = new LinkedList();

        public SourceSubscriber(Subscriber<? super Observable<T>> subscriber, CompositeSubscription compositeSubscription) {
            this.child = new SerializedSubscriber(subscriber);
            this.composite = compositeSubscription;
        }

        void beginWindow(U u10) {
            final SerializedSubject<T> serializedSubjectCreateSerializedSubject = createSerializedSubject();
            synchronized (this.guard) {
                try {
                    if (this.done) {
                        return;
                    }
                    this.chunks.add(serializedSubjectCreateSerializedSubject);
                    this.child.onNext(serializedSubjectCreateSerializedSubject.producer);
                    try {
                        Observable<? extends V> observableCall = OperatorWindowWithStartEndObservable.this.windowClosingSelector.call(u10);
                        Subscriber<V> subscriber = new Subscriber<V>() { // from class: rx.internal.operators.OperatorWindowWithStartEndObservable.SourceSubscriber.1
                            boolean once = true;

                            @Override // rx.Observer
                            public void onCompleted() {
                                if (this.once) {
                                    this.once = false;
                                    SourceSubscriber.this.endWindow(serializedSubjectCreateSerializedSubject);
                                    SourceSubscriber.this.composite.remove(this);
                                }
                            }

                            @Override // rx.Observer
                            public void onError(Throwable th2) {
                                SourceSubscriber.this.onError(th2);
                            }

                            @Override // rx.Observer
                            public void onNext(V v10) {
                                onCompleted();
                            }
                        };
                        this.composite.add(subscriber);
                        observableCall.unsafeSubscribe(subscriber);
                    } catch (Throwable th2) {
                        onError(th2);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        SerializedSubject<T> createSerializedSubject() {
            UnicastSubject unicastSubjectCreate = UnicastSubject.create();
            return new SerializedSubject<>(unicastSubjectCreate, unicastSubjectCreate);
        }

        void endWindow(SerializedSubject<T> serializedSubject) {
            boolean z10;
            synchronized (this.guard) {
                try {
                    if (this.done) {
                        return;
                    }
                    Iterator<SerializedSubject<T>> it = this.chunks.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z10 = false;
                            break;
                        } else if (it.next() == serializedSubject) {
                            it.remove();
                            z10 = true;
                            break;
                        }
                    }
                    if (z10) {
                        serializedSubject.consumer.onCompleted();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            try {
                synchronized (this.guard) {
                    try {
                        if (!this.done) {
                            this.done = true;
                            ArrayList arrayList = new ArrayList(this.chunks);
                            this.chunks.clear();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((SerializedSubject) it.next()).consumer.onCompleted();
                            }
                            this.child.onCompleted();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.composite.unsubscribe();
            } catch (Throwable th3) {
                this.composite.unsubscribe();
                throw th3;
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            try {
                synchronized (this.guard) {
                    try {
                        if (!this.done) {
                            this.done = true;
                            ArrayList arrayList = new ArrayList(this.chunks);
                            this.chunks.clear();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((SerializedSubject) it.next()).consumer.onError(th2);
                            }
                            this.child.onError(th2);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                this.composite.unsubscribe();
            } catch (Throwable th4) {
                this.composite.unsubscribe();
                throw th4;
            }
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            synchronized (this.guard) {
                try {
                    if (this.done) {
                        return;
                    }
                    Iterator it = new ArrayList(this.chunks).iterator();
                    while (it.hasNext()) {
                        ((SerializedSubject) it.next()).consumer.onNext(t10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // rx.Subscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public OperatorWindowWithStartEndObservable(Observable<? extends U> observable, Func1<? super U, ? extends Observable<? extends V>> func1) {
        this.windowOpenings = observable;
        this.windowClosingSelector = func1;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super Observable<T>> subscriber) {
        CompositeSubscription compositeSubscription = new CompositeSubscription();
        subscriber.add(compositeSubscription);
        final SourceSubscriber sourceSubscriber = new SourceSubscriber(subscriber, compositeSubscription);
        Subscriber<U> subscriber2 = new Subscriber<U>() { // from class: rx.internal.operators.OperatorWindowWithStartEndObservable.1
            @Override // rx.Observer
            public void onCompleted() {
                sourceSubscriber.onCompleted();
            }

            @Override // rx.Observer
            public void onError(Throwable th2) {
                sourceSubscriber.onError(th2);
            }

            @Override // rx.Observer
            public void onNext(U u10) {
                sourceSubscriber.beginWindow(u10);
            }

            @Override // rx.Subscriber
            public void onStart() {
                request(Long.MAX_VALUE);
            }
        };
        compositeSubscription.add(sourceSubscriber);
        compositeSubscription.add(subscriber2);
        this.windowOpenings.unsafeSubscribe(subscriber2);
        return sourceSubscriber;
    }
}
