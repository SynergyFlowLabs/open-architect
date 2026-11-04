package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
import rx.observers.SerializedSubscriber;
import rx.subscriptions.SerialSubscription;

/* JADX INFO: loaded from: classes14.dex */
public final class OperatorDebounceWithSelector<T, U> implements Observable.Operator<T, T> {
    final Func1<? super T, ? extends Observable<U>> selector;

    /* JADX INFO: renamed from: rx.internal.operators.OperatorDebounceWithSelector$1, reason: invalid class name */
    class AnonymousClass1 extends Subscriber<T> {
        final Subscriber<?> self;
        final OperatorDebounceWithTime.DebounceState<T> state;
        final /* synthetic */ SerializedSubscriber val$s;
        final /* synthetic */ SerialSubscription val$serial;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Subscriber subscriber, SerializedSubscriber serializedSubscriber, SerialSubscription serialSubscription) {
            super(subscriber);
            this.val$s = serializedSubscriber;
            this.val$serial = serialSubscription;
            this.state = new OperatorDebounceWithTime.DebounceState<>();
            this.self = this;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.state.emitAndComplete(this.val$s, this);
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            this.val$s.onError(th2);
            unsubscribe();
            this.state.clear();
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            try {
                Observable<U> observableCall = OperatorDebounceWithSelector.this.selector.call(t10);
                final int next = this.state.next(t10);
                Subscriber<U> subscriber = new Subscriber<U>() { // from class: rx.internal.operators.OperatorDebounceWithSelector.1.1
                    @Override // rx.Observer
                    public void onCompleted() {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        anonymousClass1.state.emit(next, anonymousClass1.val$s, anonymousClass1.self);
                        unsubscribe();
                    }

                    @Override // rx.Observer
                    public void onError(Throwable th2) {
                        AnonymousClass1.this.self.onError(th2);
                    }

                    @Override // rx.Observer
                    public void onNext(U u10) {
                        onCompleted();
                    }
                };
                this.val$serial.set(subscriber);
                observableCall.unsafeSubscribe(subscriber);
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this);
            }
        }

        @Override // rx.Subscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public OperatorDebounceWithSelector(Func1<? super T, ? extends Observable<U>> func1) {
        this.selector = func1;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        SerialSubscription serialSubscription = new SerialSubscription();
        subscriber.add(serialSubscription);
        return new AnonymousClass1(subscriber, serializedSubscriber, serialSubscription);
    }
}
