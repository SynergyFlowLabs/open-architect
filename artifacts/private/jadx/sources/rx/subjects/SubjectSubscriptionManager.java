package rx.subjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Actions;
import rx.internal.operators.NotificationLite;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes14.dex */
final class SubjectSubscriptionManager<T> extends AtomicReference<State<T>> implements Observable.OnSubscribe<T> {
    private static final long serialVersionUID = 6035251036011671568L;
    boolean active;
    volatile Object latest;

    /* JADX INFO: renamed from: nl, reason: collision with root package name */
    public final NotificationLite<T> f366793nl;
    Action1<SubjectObserver<T>> onAdded;
    Action1<SubjectObserver<T>> onStart;
    Action1<SubjectObserver<T>> onTerminated;

    protected static final class State<T> {
        static final State EMPTY;
        static final SubjectObserver[] NO_OBSERVERS;
        static final State TERMINATED;
        final SubjectObserver[] observers;
        final boolean terminated;

        static {
            SubjectObserver[] subjectObserverArr = new SubjectObserver[0];
            NO_OBSERVERS = subjectObserverArr;
            TERMINATED = new State(true, subjectObserverArr);
            EMPTY = new State(false, subjectObserverArr);
        }

        public State(boolean z10, SubjectObserver[] subjectObserverArr) {
            this.terminated = z10;
            this.observers = subjectObserverArr;
        }

        public State add(SubjectObserver subjectObserver) {
            SubjectObserver[] subjectObserverArr = this.observers;
            int length = subjectObserverArr.length;
            SubjectObserver[] subjectObserverArr2 = new SubjectObserver[length + 1];
            System.arraycopy(subjectObserverArr, 0, subjectObserverArr2, 0, length);
            subjectObserverArr2[length] = subjectObserver;
            return new State(this.terminated, subjectObserverArr2);
        }

        public State remove(SubjectObserver subjectObserver) {
            SubjectObserver[] subjectObserverArr = this.observers;
            int length = subjectObserverArr.length;
            int i10 = 6 ^ 1;
            if (length == 1 && subjectObserverArr[0] == subjectObserver) {
                return EMPTY;
            }
            if (length != 0) {
                int i11 = length - 1;
                SubjectObserver[] subjectObserverArr2 = new SubjectObserver[i11];
                int i12 = 0;
                for (SubjectObserver subjectObserver2 : subjectObserverArr) {
                    if (subjectObserver2 != subjectObserver) {
                        if (i12 != i11) {
                            subjectObserverArr2[i12] = subjectObserver2;
                            i12++;
                        }
                    }
                }
                if (i12 == 0) {
                    return EMPTY;
                }
                if (i12 < i11) {
                    SubjectObserver[] subjectObserverArr3 = new SubjectObserver[i12];
                    System.arraycopy(subjectObserverArr2, 0, subjectObserverArr3, 0, i12);
                    subjectObserverArr2 = subjectObserverArr3;
                }
                return new State(this.terminated, subjectObserverArr2);
            }
            return this;
        }
    }

    protected static final class SubjectObserver<T> implements Observer<T> {
        final Subscriber<? super T> actual;
        volatile boolean caughtUp;
        boolean emitting;
        boolean fastPath;
        boolean first = true;
        private volatile Object index;
        List<Object> queue;

        public SubjectObserver(Subscriber<? super T> subscriber) {
            this.actual = subscriber;
        }

        void accept(Object obj, NotificationLite<T> notificationLite) {
            if (obj != null) {
                notificationLite.accept(this.actual, obj);
            }
        }

        void emitFirst(Object obj, NotificationLite<T> notificationLite) throws Throwable {
            synchronized (this) {
                if (this.first && !this.emitting) {
                    this.first = false;
                    this.emitting = obj != null;
                    if (obj != null) {
                        emitLoop(null, obj, notificationLite);
                    }
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0047  */
        /* JADX WARN: Code duplicated, block: B:41:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        void emitLoop(List<Object> list, Object obj, NotificationLite<T> notificationLite) throws Throwable {
            boolean z10 = true;
            boolean z11 = true;
            while (true) {
                if (list != null) {
                    try {
                        Iterator<Object> it = list.iterator();
                        while (it.hasNext()) {
                            accept(it.next(), notificationLite);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = false;
                        if (!z10) {
                            synchronized (this) {
                                this.emitting = false;
                            }
                        }
                        throw th;
                    }
                }
                if (z11) {
                    accept(obj, notificationLite);
                    z11 = false;
                }
                try {
                    synchronized (this) {
                        try {
                            list = this.queue;
                            this.queue = null;
                            if (list == null) {
                                this.emitting = false;
                                return;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            z10 = false;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
                try {
                    throw th;
                } catch (Throwable th5) {
                    th = th5;
                    if (!z10) {
                        synchronized (this) {
                            this.emitting = false;
                        }
                    }
                    throw th;
                }
            }
        }

        void emitNext(Object obj, NotificationLite<T> notificationLite) {
            if (!this.fastPath) {
                synchronized (this) {
                    try {
                        this.first = false;
                        if (this.emitting) {
                            if (this.queue == null) {
                                this.queue = new ArrayList();
                            }
                            this.queue.add(obj);
                            return;
                        }
                        this.fastPath = true;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            notificationLite.accept(this.actual, obj);
        }

        Observer<? super T> getActual() {
            return this.actual;
        }

        public <I> I index() {
            return (I) this.index;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.actual.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            this.actual.onError(th2);
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            this.actual.onNext(t10);
        }

        public void index(Object obj) {
            this.index = obj;
        }
    }

    public SubjectSubscriptionManager() {
        super(State.EMPTY);
        this.active = true;
        this.onStart = Actions.empty();
        this.onAdded = Actions.empty();
        this.onTerminated = Actions.empty();
        this.f366793nl = NotificationLite.instance();
    }

    boolean add(SubjectObserver<T> subjectObserver) {
        State<T> state;
        do {
            state = get();
            if (state.terminated) {
                this.onTerminated.call(subjectObserver);
                return false;
            }
        } while (!compareAndSet(state, state.add(subjectObserver)));
        this.onAdded.call(subjectObserver);
        return true;
    }

    void addUnsubscriber(Subscriber<? super T> subscriber, final SubjectObserver<T> subjectObserver) {
        subscriber.add(Subscriptions.create(new Action0() { // from class: rx.subjects.SubjectSubscriptionManager.1
            @Override // rx.functions.Action0
            public void call() {
                SubjectSubscriptionManager.this.remove(subjectObserver);
            }
        }));
    }

    Object getLatest() {
        return this.latest;
    }

    SubjectObserver<T>[] next(Object obj) {
        setLatest(obj);
        return get().observers;
    }

    SubjectObserver<T>[] observers() {
        return get().observers;
    }

    void remove(SubjectObserver<T> subjectObserver) {
        State<T> state;
        State<T> stateRemove;
        do {
            state = get();
            if (state.terminated || (stateRemove = state.remove(subjectObserver)) == state) {
                return;
            }
        } while (!compareAndSet(state, stateRemove));
    }

    void setLatest(Object obj) {
        this.latest = obj;
    }

    SubjectObserver<T>[] terminate(Object obj) {
        setLatest(obj);
        this.active = false;
        return get().terminated ? State.NO_OBSERVERS : getAndSet(State.TERMINATED).observers;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        SubjectObserver<T> subjectObserver = new SubjectObserver<>(subscriber);
        addUnsubscriber(subscriber, subjectObserver);
        this.onStart.call(subjectObserver);
        if (!subscriber.isUnsubscribed() && add(subjectObserver) && subscriber.isUnsubscribed()) {
            remove(subjectObserver);
        }
    }
}
