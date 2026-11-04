package rx.internal.operators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Observer;
import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Action0;
import rx.observers.SerializedObserver;
import rx.observers.SerializedSubscriber;
import rx.subjects.UnicastSubject;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes14.dex */
public final class OperatorWindowWithTime<T> implements Observable.Operator<Observable<T>, T> {
    static final Object NEXT_SUBJECT = new Object();
    static final NotificationLite<Object> NL = NotificationLite.instance();
    final Scheduler scheduler;
    final int size;
    final long timeshift;
    final long timespan;
    final TimeUnit unit;

    static final class CountedSerializedSubject<T> {
        final Observer<T> consumer;
        int count;
        final Observable<T> producer;

        public CountedSerializedSubject(Observer<T> observer, Observable<T> observable) {
            this.consumer = new SerializedObserver(observer);
            this.producer = observable;
        }
    }

    final class ExactSubscriber extends Subscriber<T> {
        final Subscriber<? super Observable<T>> child;
        boolean emitting;
        List<Object> queue;
        final Scheduler.Worker worker;
        final Object guard = new Object();
        volatile State<T> state = State.empty();

        public ExactSubscriber(Subscriber<? super Observable<T>> subscriber, Scheduler.Worker worker) {
            this.child = new SerializedSubscriber(subscriber);
            this.worker = worker;
            subscriber.add(Subscriptions.create(new Action0() { // from class: rx.internal.operators.OperatorWindowWithTime.ExactSubscriber.1
                @Override // rx.functions.Action0
                public void call() {
                    if (ExactSubscriber.this.state.consumer == null) {
                        ExactSubscriber.this.unsubscribe();
                    }
                }
            }));
        }

        void complete() {
            Observer<T> observer = this.state.consumer;
            this.state = this.state.clear();
            if (observer != null) {
                observer.onCompleted();
            }
            this.child.onCompleted();
            unsubscribe();
        }

        /* JADX WARN: Multi-variable type inference failed */
        boolean drain(List<Object> list) {
            if (list == null) {
                return true;
            }
            for (Object obj : list) {
                int i10 = 5 | 0;
                if (obj != OperatorWindowWithTime.NEXT_SUBJECT) {
                    NotificationLite<Object> notificationLite = OperatorWindowWithTime.NL;
                    if (notificationLite.isError(obj)) {
                        error(notificationLite.getError(obj));
                        break;
                    }
                    if (notificationLite.isCompleted(obj)) {
                        complete();
                        break;
                    }
                    if (!emitValue(obj)) {
                        return false;
                    }
                } else if (!replaceSubject()) {
                    return false;
                }
            }
            return true;
        }

        boolean emitValue(T t10) {
            State<T> next;
            State<T> state = this.state;
            if (state.consumer == null) {
                if (!replaceSubject()) {
                    return false;
                }
                state = this.state;
            }
            state.consumer.onNext(t10);
            int i10 = 2 & 1;
            if (state.count == OperatorWindowWithTime.this.size - 1) {
                state.consumer.onCompleted();
                next = state.clear();
            } else {
                next = state.next();
            }
            this.state = next;
            return true;
        }

        void error(Throwable th2) {
            Observer<T> observer = this.state.consumer;
            this.state = this.state.clear();
            if (observer != null) {
                observer.onError(th2);
            }
            this.child.onError(th2);
            unsubscribe();
        }

        void nextWindow() throws Throwable {
            boolean z10;
            List<Object> list;
            synchronized (this.guard) {
                try {
                    if (this.emitting) {
                        if (this.queue == null) {
                            this.queue = new ArrayList();
                        }
                        this.queue.add(OperatorWindowWithTime.NEXT_SUBJECT);
                        return;
                    }
                    boolean z11 = true;
                    this.emitting = true;
                    try {
                        if (!replaceSubject()) {
                            synchronized (this.guard) {
                                try {
                                    this.emitting = false;
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            return;
                        }
                        do {
                            try {
                                synchronized (this.guard) {
                                    try {
                                        list = this.queue;
                                        if (list == null) {
                                            this.emitting = false;
                                            return;
                                        }
                                        this.queue = null;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        z11 = false;
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                            try {
                                throw th;
                            } catch (Throwable th5) {
                                z10 = z11;
                                th = th5;
                            }
                        } while (drain(list));
                        synchronized (this.guard) {
                            try {
                                this.emitting = false;
                            } catch (Throwable th6) {
                                throw th6;
                            }
                        }
                        return;
                    } catch (Throwable th7) {
                        th = th7;
                        z10 = false;
                    }
                    if (z10) {
                        throw th;
                    }
                    synchronized (this.guard) {
                        try {
                            this.emitting = false;
                        } catch (Throwable th8) {
                            throw th8;
                        }
                    }
                    throw th;
                } catch (Throwable th9) {
                    throw th9;
                }
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            synchronized (this.guard) {
                try {
                    if (this.emitting) {
                        if (this.queue == null) {
                            this.queue = new ArrayList();
                        }
                        this.queue.add(OperatorWindowWithTime.NL.completed());
                        return;
                    }
                    List<Object> list = this.queue;
                    this.queue = null;
                    this.emitting = true;
                    try {
                        drain(list);
                        complete();
                    } catch (Throwable th2) {
                        error(th2);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            synchronized (this.guard) {
                try {
                    if (this.emitting) {
                        this.queue = Collections.singletonList(OperatorWindowWithTime.NL.error(th2));
                        return;
                    }
                    this.queue = null;
                    this.emitting = true;
                    error(th2);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // rx.Observer
        public void onNext(T t10) throws Throwable {
            List<Object> list;
            synchronized (this.guard) {
                try {
                    if (this.emitting) {
                        if (this.queue == null) {
                            this.queue = new ArrayList();
                        }
                        this.queue.add(t10);
                        return;
                    }
                    boolean z10 = true;
                    this.emitting = true;
                    try {
                        if (!emitValue(t10)) {
                            synchronized (this.guard) {
                                this.emitting = false;
                            }
                            return;
                        }
                        do {
                            try {
                                synchronized (this.guard) {
                                    try {
                                        list = this.queue;
                                        if (list == null) {
                                            this.emitting = false;
                                            return;
                                        }
                                        this.queue = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z10 = false;
                                        try {
                                            throw th;
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } while (drain(list));
                        synchronized (this.guard) {
                            try {
                                this.emitting = false;
                            } catch (Throwable th5) {
                                throw th5;
                            }
                        }
                        return;
                    } catch (Throwable th6) {
                        th = th6;
                        z10 = false;
                    }
                    if (!z10) {
                        synchronized (this.guard) {
                            try {
                                this.emitting = false;
                            } catch (Throwable th7) {
                                throw th7;
                            }
                        }
                    }
                    throw th;
                } catch (Throwable th8) {
                    throw th8;
                }
            }
        }

        @Override // rx.Subscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }

        boolean replaceSubject() {
            Observer<T> observer = this.state.consumer;
            if (observer != null) {
                observer.onCompleted();
            }
            if (this.child.isUnsubscribed()) {
                this.state = this.state.clear();
                unsubscribe();
                return false;
            }
            UnicastSubject unicastSubjectCreate = UnicastSubject.create();
            this.state = this.state.create(unicastSubjectCreate, unicastSubjectCreate);
            this.child.onNext(unicastSubjectCreate);
            return true;
        }

        void scheduleExact() {
            Scheduler.Worker worker = this.worker;
            Action0 action0 = new Action0() { // from class: rx.internal.operators.OperatorWindowWithTime.ExactSubscriber.2
                @Override // rx.functions.Action0
                public void call() throws Throwable {
                    ExactSubscriber.this.nextWindow();
                }
            };
            OperatorWindowWithTime operatorWindowWithTime = OperatorWindowWithTime.this;
            worker.schedulePeriodically(action0, 0L, operatorWindowWithTime.timespan, operatorWindowWithTime.unit);
        }
    }

    final class InexactSubscriber extends Subscriber<T> {
        final Subscriber<? super Observable<T>> child;
        final List<CountedSerializedSubject<T>> chunks;
        boolean done;
        final Object guard;
        final Scheduler.Worker worker;

        public InexactSubscriber(Subscriber<? super Observable<T>> subscriber, Scheduler.Worker worker) {
            super(subscriber);
            this.child = subscriber;
            this.worker = worker;
            this.guard = new Object();
            this.chunks = new LinkedList();
        }

        CountedSerializedSubject<T> createCountedSerializedSubject() {
            UnicastSubject unicastSubjectCreate = UnicastSubject.create();
            return new CountedSerializedSubject<>(unicastSubjectCreate, unicastSubjectCreate);
        }

        @Override // rx.Observer
        public void onCompleted() {
            synchronized (this.guard) {
                try {
                    if (this.done) {
                        return;
                    }
                    this.done = true;
                    ArrayList arrayList = new ArrayList(this.chunks);
                    this.chunks.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((CountedSerializedSubject) it.next()).consumer.onCompleted();
                    }
                    this.child.onCompleted();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            synchronized (this.guard) {
                try {
                    if (this.done) {
                        return;
                    }
                    this.done = true;
                    ArrayList arrayList = new ArrayList(this.chunks);
                    this.chunks.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((CountedSerializedSubject) it.next()).consumer.onError(th2);
                    }
                    this.child.onError(th2);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            synchronized (this.guard) {
                try {
                    if (this.done) {
                        return;
                    }
                    ArrayList<CountedSerializedSubject> arrayList = new ArrayList(this.chunks);
                    Iterator<CountedSerializedSubject<T>> it = this.chunks.iterator();
                    while (it.hasNext()) {
                        CountedSerializedSubject<T> next = it.next();
                        int i10 = next.count + 1;
                        next.count = i10;
                        if (i10 == OperatorWindowWithTime.this.size) {
                            it.remove();
                        }
                    }
                    for (CountedSerializedSubject countedSerializedSubject : arrayList) {
                        countedSerializedSubject.consumer.onNext(t10);
                        if (countedSerializedSubject.count == OperatorWindowWithTime.this.size) {
                            countedSerializedSubject.consumer.onCompleted();
                        }
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

        void scheduleChunk() {
            Scheduler.Worker worker = this.worker;
            Action0 action0 = new Action0() { // from class: rx.internal.operators.OperatorWindowWithTime.InexactSubscriber.1
                @Override // rx.functions.Action0
                public void call() {
                    InexactSubscriber.this.startNewChunk();
                }
            };
            OperatorWindowWithTime operatorWindowWithTime = OperatorWindowWithTime.this;
            long j10 = operatorWindowWithTime.timeshift;
            worker.schedulePeriodically(action0, j10, j10, operatorWindowWithTime.unit);
        }

        void startNewChunk() {
            final CountedSerializedSubject<T> countedSerializedSubjectCreateCountedSerializedSubject = createCountedSerializedSubject();
            synchronized (this.guard) {
                try {
                    if (this.done) {
                        return;
                    }
                    this.chunks.add(countedSerializedSubjectCreateCountedSerializedSubject);
                    try {
                        this.child.onNext(countedSerializedSubjectCreateCountedSerializedSubject.producer);
                        Scheduler.Worker worker = this.worker;
                        Action0 action0 = new Action0() { // from class: rx.internal.operators.OperatorWindowWithTime.InexactSubscriber.2
                            @Override // rx.functions.Action0
                            public void call() {
                                InexactSubscriber.this.terminateChunk(countedSerializedSubjectCreateCountedSerializedSubject);
                            }
                        };
                        OperatorWindowWithTime operatorWindowWithTime = OperatorWindowWithTime.this;
                        worker.schedule(action0, operatorWindowWithTime.timespan, operatorWindowWithTime.unit);
                    } catch (Throwable th2) {
                        onError(th2);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        void terminateChunk(CountedSerializedSubject<T> countedSerializedSubject) {
            boolean z10;
            synchronized (this.guard) {
                try {
                    if (this.done) {
                        return;
                    }
                    Iterator<CountedSerializedSubject<T>> it = this.chunks.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z10 = false;
                            break;
                        } else if (it.next() == countedSerializedSubject) {
                            it.remove();
                            z10 = true;
                            break;
                        }
                    }
                    if (z10) {
                        countedSerializedSubject.consumer.onCompleted();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    static final class State<T> {
        static final State<Object> EMPTY = new State<>(null, null, 0);
        final Observer<T> consumer;
        final int count;
        final Observable<T> producer;

        public State(Observer<T> observer, Observable<T> observable, int i10) {
            this.consumer = observer;
            this.producer = observable;
            this.count = i10;
        }

        public static <T> State<T> empty() {
            return (State<T>) EMPTY;
        }

        public State<T> clear() {
            return empty();
        }

        public State<T> create(Observer<T> observer, Observable<T> observable) {
            return new State<>(observer, observable, 0);
        }

        public State<T> next() {
            return new State<>(this.consumer, this.producer, this.count + 1);
        }
    }

    public OperatorWindowWithTime(long j10, long j11, TimeUnit timeUnit, int i10, Scheduler scheduler) {
        this.timespan = j10;
        this.timeshift = j11;
        this.unit = timeUnit;
        this.size = i10;
        this.scheduler = scheduler;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super Observable<T>> subscriber) {
        Scheduler.Worker workerCreateWorker = this.scheduler.createWorker();
        if (this.timespan == this.timeshift) {
            ExactSubscriber exactSubscriber = new ExactSubscriber(subscriber, workerCreateWorker);
            exactSubscriber.add(workerCreateWorker);
            exactSubscriber.scheduleExact();
            return exactSubscriber;
        }
        InexactSubscriber inexactSubscriber = new InexactSubscriber(subscriber, workerCreateWorker);
        inexactSubscriber.add(workerCreateWorker);
        inexactSubscriber.startNewChunk();
        inexactSubscriber.scheduleChunk();
        return inexactSubscriber;
    }
}
