package rx.subjects;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Observer;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.exceptions.MissingBackpressureException;
import rx.internal.operators.BackpressureUtils;

/* JADX INFO: loaded from: classes14.dex */
public final class PublishSubject<T> extends Subject<T, T> {
    final PublishSubjectState<T> state;

    static final class PublishSubjectProducer<T> extends AtomicLong implements Producer, Subscription, Observer<T> {
        private static final long serialVersionUID = 6451806817170721536L;
        final Subscriber<? super T> actual;
        final PublishSubjectState<T> parent;
        long produced;

        public PublishSubjectProducer(PublishSubjectState<T> publishSubjectState, Subscriber<? super T> subscriber) {
            this.parent = publishSubjectState;
            this.actual = subscriber;
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (get() != Long.MIN_VALUE) {
                this.actual.onCompleted();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            if (get() != Long.MIN_VALUE) {
                this.actual.onError(th2);
            }
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            long j10 = get();
            if (j10 != Long.MIN_VALUE) {
                long j11 = this.produced;
                if (j10 != j11) {
                    this.produced = j11 + 1;
                    this.actual.onNext(t10);
                } else {
                    unsubscribe();
                    this.actual.onError(new MissingBackpressureException("PublishSubject: could not emit value due to lack of requests"));
                }
            }
        }

        @Override // rx.Producer
        public void request(long j10) {
            long j11;
            if (BackpressureUtils.validate(j10)) {
                do {
                    j11 = get();
                    if (j11 == Long.MIN_VALUE) {
                        break;
                    }
                } while (!compareAndSet(j11, BackpressureUtils.addCap(j11, j10)));
            }
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.remove(this);
            }
        }
    }

    static final class PublishSubjectState<T> extends AtomicReference<PublishSubjectProducer<T>[]> implements Observable.OnSubscribe<T>, Observer<T> {
        static final PublishSubjectProducer[] EMPTY = new PublishSubjectProducer[0];
        static final PublishSubjectProducer[] TERMINATED = new PublishSubjectProducer[0];
        private static final long serialVersionUID = -7568940796666027140L;
        Throwable error;

        public PublishSubjectState() {
            lazySet(EMPTY);
        }

        boolean add(PublishSubjectProducer<T> publishSubjectProducer) {
            PublishSubjectProducer<T>[] publishSubjectProducerArr;
            PublishSubjectProducer[] publishSubjectProducerArr2;
            do {
                publishSubjectProducerArr = get();
                if (publishSubjectProducerArr == TERMINATED) {
                    return false;
                }
                int length = publishSubjectProducerArr.length;
                publishSubjectProducerArr2 = new PublishSubjectProducer[length + 1];
                System.arraycopy(publishSubjectProducerArr, 0, publishSubjectProducerArr2, 0, length);
                publishSubjectProducerArr2[length] = publishSubjectProducer;
            } while (!compareAndSet(publishSubjectProducerArr, publishSubjectProducerArr2));
            return true;
        }

        @Override // rx.Observer
        public void onCompleted() {
            int i10 = 6 << 0;
            for (PublishSubjectProducer<T> publishSubjectProducer : getAndSet(TERMINATED)) {
                publishSubjectProducer.onCompleted();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            this.error = th2;
            ArrayList arrayList = null;
            for (PublishSubjectProducer<T> publishSubjectProducer : getAndSet(TERMINATED)) {
                try {
                    publishSubjectProducer.onError(th2);
                } catch (Throwable th3) {
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                    }
                    arrayList.add(th3);
                }
            }
            Exceptions.throwIfAny(arrayList);
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            for (PublishSubjectProducer<T> publishSubjectProducer : get()) {
                publishSubjectProducer.onNext(t10);
            }
        }

        void remove(PublishSubjectProducer<T> publishSubjectProducer) {
            PublishSubjectProducer<T>[] publishSubjectProducerArr;
            PublishSubjectProducer[] publishSubjectProducerArr2;
            do {
                publishSubjectProducerArr = get();
                if (publishSubjectProducerArr == TERMINATED || publishSubjectProducerArr == EMPTY) {
                    return;
                }
                int length = publishSubjectProducerArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (publishSubjectProducerArr[i10] == publishSubjectProducer) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    publishSubjectProducerArr2 = EMPTY;
                } else {
                    PublishSubjectProducer[] publishSubjectProducerArr3 = new PublishSubjectProducer[length - 1];
                    System.arraycopy(publishSubjectProducerArr, 0, publishSubjectProducerArr3, 0, i10);
                    System.arraycopy(publishSubjectProducerArr, i10 + 1, publishSubjectProducerArr3, i10, (length - i10) - 1);
                    publishSubjectProducerArr2 = publishSubjectProducerArr3;
                }
            } while (!compareAndSet(publishSubjectProducerArr, publishSubjectProducerArr2));
        }

        @Override // rx.functions.Action1
        public void call(Subscriber<? super T> subscriber) {
            PublishSubjectProducer<T> publishSubjectProducer = new PublishSubjectProducer<>(this, subscriber);
            subscriber.add(publishSubjectProducer);
            subscriber.setProducer(publishSubjectProducer);
            if (add(publishSubjectProducer)) {
                if (publishSubjectProducer.isUnsubscribed()) {
                    remove(publishSubjectProducer);
                }
            } else {
                Throwable th2 = this.error;
                if (th2 != null) {
                    subscriber.onError(th2);
                } else {
                    subscriber.onCompleted();
                }
            }
        }
    }

    protected PublishSubject(PublishSubjectState<T> publishSubjectState) {
        super(publishSubjectState);
        this.state = publishSubjectState;
    }

    public static <T> PublishSubject<T> create() {
        return new PublishSubject<>(new PublishSubjectState());
    }

    public Throwable getThrowable() {
        if (this.state.get() == PublishSubjectState.TERMINATED) {
            return this.state.error;
        }
        return null;
    }

    public boolean hasCompleted() {
        return this.state.get() == PublishSubjectState.TERMINATED && this.state.error == null;
    }

    @Override // rx.subjects.Subject
    public boolean hasObservers() {
        return this.state.get().length != 0;
    }

    public boolean hasThrowable() {
        return this.state.get() == PublishSubjectState.TERMINATED && this.state.error != null;
    }

    @Override // rx.Observer
    public void onCompleted() {
        this.state.onCompleted();
    }

    @Override // rx.Observer
    public void onError(Throwable th2) {
        this.state.onError(th2);
    }

    @Override // rx.Observer
    public void onNext(T t10) {
        this.state.onNext(t10);
    }
}
