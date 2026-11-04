package rx.internal.operators;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.FuncN;
import rx.observers.SerializedSubscriber;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes14.dex */
public final class OperatorWithLatestFromMany<T, R> implements Observable.OnSubscribe<R> {
    final FuncN<R> combiner;
    final Observable<T> main;
    final Observable<?>[] others;
    final Iterable<Observable<?>> othersIterable;

    static final class WithLatestMainSubscriber<T, R> extends Subscriber<T> {
        static final Object EMPTY = new Object();
        final Subscriber<? super R> actual;
        final FuncN<R> combiner;
        final AtomicReferenceArray<Object> current;
        boolean done;
        final AtomicInteger ready;

        public WithLatestMainSubscriber(Subscriber<? super R> subscriber, FuncN<R> funcN, int i10) {
            this.actual = subscriber;
            this.combiner = funcN;
            AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(i10 + 1);
            for (int i11 = 0; i11 <= i10; i11++) {
                atomicReferenceArray.lazySet(i11, EMPTY);
            }
            this.current = atomicReferenceArray;
            this.ready = new AtomicInteger(i10);
            request(0L);
        }

        void innerComplete(int i10) {
            if (this.current.get(i10) == EMPTY) {
                onCompleted();
            }
        }

        void innerError(int i10, Throwable th2) {
            onError(th2);
        }

        void innerNext(int i10, Object obj) {
            if (this.current.getAndSet(i10, obj) == EMPTY) {
                this.ready.decrementAndGet();
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.done) {
                return;
            }
            this.done = true;
            unsubscribe();
            this.actual.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaHooks.onError(th2);
                return;
            }
            this.done = true;
            unsubscribe();
            this.actual.onError(th2);
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            if (this.done) {
                return;
            }
            if (this.ready.get() != 0) {
                request(1L);
                return;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = this.current;
            int length = atomicReferenceArray.length();
            atomicReferenceArray.lazySet(0, t10);
            Object[] objArr = new Object[atomicReferenceArray.length()];
            for (int i10 = 0; i10 < length; i10++) {
                objArr[i10] = atomicReferenceArray.get(i10);
            }
            try {
                this.actual.onNext(this.combiner.call(objArr));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                onError(th2);
            }
        }

        @Override // rx.Subscriber
        public void setProducer(Producer producer) {
            super.setProducer(producer);
            this.actual.setProducer(producer);
        }
    }

    static final class WithLatestOtherSubscriber extends Subscriber<Object> {
        final int index;
        final WithLatestMainSubscriber<?, ?> parent;

        public WithLatestOtherSubscriber(WithLatestMainSubscriber<?, ?> withLatestMainSubscriber, int i10) {
            this.parent = withLatestMainSubscriber;
            this.index = i10;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.parent.innerComplete(this.index);
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            this.parent.innerError(this.index, th2);
        }

        @Override // rx.Observer
        public void onNext(Object obj) {
            this.parent.innerNext(this.index, obj);
        }
    }

    public OperatorWithLatestFromMany(Observable<T> observable, Observable<?>[] observableArr, Iterable<Observable<?>> iterable, FuncN<R> funcN) {
        this.main = observable;
        this.others = observableArr;
        this.othersIterable = iterable;
        this.combiner = funcN;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super R> subscriber) {
        int length;
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        Observable<?>[] observableArr = this.others;
        int i10 = 0;
        if (observableArr != null) {
            length = observableArr.length;
        } else {
            observableArr = new Observable[8];
            int i11 = 0;
            for (Observable<?> observable : this.othersIterable) {
                if (i11 == observableArr.length) {
                    observableArr = (Observable[]) Arrays.copyOf(observableArr, (i11 >> 2) + i11);
                }
                observableArr[i11] = observable;
                i11++;
            }
            length = i11;
        }
        WithLatestMainSubscriber withLatestMainSubscriber = new WithLatestMainSubscriber(subscriber, this.combiner, length);
        serializedSubscriber.add(withLatestMainSubscriber);
        while (i10 < length) {
            if (serializedSubscriber.isUnsubscribed()) {
                return;
            }
            int i12 = i10 + 1;
            WithLatestOtherSubscriber withLatestOtherSubscriber = new WithLatestOtherSubscriber(withLatestMainSubscriber, i12);
            withLatestMainSubscriber.add(withLatestOtherSubscriber);
            observableArr[i10].unsafeSubscribe(withLatestOtherSubscriber);
            i10 = i12;
        }
        this.main.unsafeSubscribe(withLatestMainSubscriber);
    }
}
