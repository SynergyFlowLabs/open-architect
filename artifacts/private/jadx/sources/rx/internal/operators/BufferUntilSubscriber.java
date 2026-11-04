package rx.internal.operators;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.functions.Action0;
import rx.subjects.Subject;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes14.dex */
public final class BufferUntilSubscriber<T> extends Subject<T, T> {
    static final Observer EMPTY_OBSERVER = new Observer() { // from class: rx.internal.operators.BufferUntilSubscriber.1
        @Override // rx.Observer
        public void onCompleted() {
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
        }

        @Override // rx.Observer
        public void onNext(Object obj) {
        }
    };
    private boolean forward;
    final State<T> state;

    static final class OnSubscribeAction<T> implements Observable.OnSubscribe<T> {
        final State<T> state;

        public OnSubscribeAction(State<T> state) {
            this.state = state;
        }

        @Override // rx.functions.Action1
        public void call(Subscriber<? super T> subscriber) {
            boolean z10;
            if (!this.state.casObserverRef(null, subscriber)) {
                subscriber.onError(new IllegalStateException("Only one subscriber allowed!"));
                return;
            }
            subscriber.add(Subscriptions.create(new Action0() { // from class: rx.internal.operators.BufferUntilSubscriber.OnSubscribeAction.1
                @Override // rx.functions.Action0
                public void call() {
                    OnSubscribeAction.this.state.set(BufferUntilSubscriber.EMPTY_OBSERVER);
                }
            }));
            synchronized (this.state.guard) {
                try {
                    State<T> state = this.state;
                    if (state.emitting) {
                        z10 = false;
                    } else {
                        z10 = true;
                        state.emitting = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!z10) {
                return;
            }
            NotificationLite notificationLiteInstance = NotificationLite.instance();
            while (true) {
                Object objPoll = this.state.buffer.poll();
                if (objPoll != null) {
                    notificationLiteInstance.accept(this.state.get(), objPoll);
                } else {
                    synchronized (this.state.guard) {
                        try {
                            if (this.state.buffer.isEmpty()) {
                                this.state.emitting = false;
                                return;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
        }
    }

    static final class State<T> extends AtomicReference<Observer<? super T>> {
        private static final long serialVersionUID = 8026705089538090368L;
        boolean emitting;
        final Object guard = new Object();
        final ConcurrentLinkedQueue<Object> buffer = new ConcurrentLinkedQueue<>();

        /* JADX INFO: renamed from: nl, reason: collision with root package name */
        final NotificationLite<T> f366743nl = NotificationLite.instance();

        State() {
        }

        boolean casObserverRef(Observer<? super T> observer, Observer<? super T> observer2) {
            return compareAndSet(observer, observer2);
        }
    }

    private BufferUntilSubscriber(State<T> state) {
        super(new OnSubscribeAction(state));
        this.state = state;
    }

    public static <T> BufferUntilSubscriber<T> create() {
        return new BufferUntilSubscriber<>(new State());
    }

    private void emit(Object obj) {
        synchronized (this.state.guard) {
            try {
                this.state.buffer.add(obj);
                if (this.state.get() != null) {
                    State<T> state = this.state;
                    if (!state.emitting) {
                        this.forward = true;
                        state.emitting = true;
                    }
                }
            } finally {
            }
        }
        if (this.forward) {
            while (true) {
                Object objPoll = this.state.buffer.poll();
                if (objPoll == null) {
                    break;
                }
                State<T> state2 = this.state;
                state2.f366743nl.accept(state2.get(), objPoll);
            }
        }
    }

    @Override // rx.subjects.Subject
    public boolean hasObservers() {
        boolean z10;
        synchronized (this.state.guard) {
            z10 = this.state.get() != null;
        }
        return z10;
    }

    @Override // rx.Observer
    public void onCompleted() {
        if (this.forward) {
            this.state.get().onCompleted();
        } else {
            emit(this.state.f366743nl.completed());
        }
    }

    @Override // rx.Observer
    public void onError(Throwable th2) {
        if (this.forward) {
            this.state.get().onError(th2);
        } else {
            emit(this.state.f366743nl.error(th2));
        }
    }

    @Override // rx.Observer
    public void onNext(T t10) {
        if (this.forward) {
            this.state.get().onNext(t10);
        } else {
            emit(this.state.f366743nl.next(t10));
        }
    }
}
