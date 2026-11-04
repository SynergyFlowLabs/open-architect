package rx.internal.operators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.observers.SerializedSubscriber;
import rx.subjects.UnicastSubject;

/* JADX INFO: loaded from: classes14.dex */
public final class OperatorWindowWithObservable<T, U> implements Observable.Operator<Observable<T>, T> {
    static final Object NEXT_SUBJECT = new Object();
    static final NotificationLite<Object> NL = NotificationLite.instance();
    final Observable<U> other;

    static final class BoundarySubscriber<T, U> extends Subscriber<U> {
        final SourceSubscriber<T> sub;

        public BoundarySubscriber(SourceSubscriber<T> sourceSubscriber) {
            this.sub = sourceSubscriber;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.sub.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            this.sub.onError(th2);
        }

        @Override // rx.Observer
        public void onNext(U u10) throws Throwable {
            this.sub.replaceWindow();
        }

        @Override // rx.Subscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    static final class SourceSubscriber<T> extends Subscriber<T> {
        final Subscriber<? super Observable<T>> child;
        Observer<T> consumer;
        boolean emitting;
        final Object guard = new Object();
        Observable<T> producer;
        List<Object> queue;

        public SourceSubscriber(Subscriber<? super Observable<T>> subscriber) {
            this.child = new SerializedSubscriber(subscriber);
        }

        void complete() {
            Observer<T> observer = this.consumer;
            this.consumer = null;
            this.producer = null;
            if (observer != null) {
                observer.onCompleted();
            }
            this.child.onCompleted();
            unsubscribe();
        }

        void createNewWindow() {
            UnicastSubject unicastSubjectCreate = UnicastSubject.create();
            this.consumer = unicastSubjectCreate;
            this.producer = unicastSubjectCreate;
        }

        /* JADX WARN: Multi-variable type inference failed */
        void drain(List<Object> list) {
            if (list == null) {
                return;
            }
            for (Object obj : list) {
                if (obj == OperatorWindowWithObservable.NEXT_SUBJECT) {
                    replaceSubject();
                } else {
                    NotificationLite<Object> notificationLite = OperatorWindowWithObservable.NL;
                    if (notificationLite.isError(obj)) {
                        error(notificationLite.getError(obj));
                        return;
                    } else {
                        if (notificationLite.isCompleted(obj)) {
                            complete();
                            return;
                        }
                        emitValue(obj);
                    }
                }
            }
        }

        void emitValue(T t10) {
            Observer<T> observer = this.consumer;
            if (observer != null) {
                observer.onNext(t10);
            }
        }

        void error(Throwable th2) {
            Observer<T> observer = this.consumer;
            this.consumer = null;
            this.producer = null;
            if (observer != null) {
                observer.onError(th2);
            }
            this.child.onError(th2);
            unsubscribe();
        }

        @Override // rx.Observer
        public void onCompleted() {
            synchronized (this.guard) {
                try {
                    if (this.emitting) {
                        if (this.queue == null) {
                            this.queue = new ArrayList();
                        }
                        this.queue.add(OperatorWindowWithObservable.NL.completed());
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
                        this.queue = Collections.singletonList(OperatorWindowWithObservable.NL.error(th2));
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
            synchronized (this.guard) {
                try {
                    if (this.emitting) {
                        if (this.queue == null) {
                            this.queue = new ArrayList();
                        }
                        this.queue.add(t10);
                        return;
                    }
                    List<Object> list = this.queue;
                    this.queue = null;
                    boolean z10 = true;
                    this.emitting = true;
                    boolean z11 = true;
                    while (true) {
                        try {
                            drain(list);
                            if (z11) {
                                emitValue(t10);
                                z11 = false;
                            }
                            try {
                                synchronized (this.guard) {
                                    try {
                                        List<Object> list2 = this.queue;
                                        this.queue = null;
                                        if (list2 == null) {
                                            this.emitting = false;
                                            return;
                                        } else {
                                            if (this.child.isUnsubscribed()) {
                                                synchronized (this.guard) {
                                                    this.emitting = false;
                                                }
                                                return;
                                            }
                                            list = list2;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z10 = false;
                                        try {
                                            throw th;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            if (!z10) {
                                                synchronized (this.guard) {
                                                    try {
                                                        this.emitting = false;
                                                    } catch (Throwable th4) {
                                                        throw th4;
                                                    }
                                                }
                                            }
                                            throw th;
                                        }
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            z10 = false;
                        }
                    }
                } catch (Throwable th7) {
                    throw th7;
                }
            }
        }

        @Override // rx.Subscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }

        void replaceSubject() {
            Observer<T> observer = this.consumer;
            if (observer != null) {
                observer.onCompleted();
            }
            createNewWindow();
            this.child.onNext(this.producer);
        }

        void replaceWindow() throws Throwable {
            synchronized (this.guard) {
                try {
                    if (this.emitting) {
                        if (this.queue == null) {
                            this.queue = new ArrayList();
                        }
                        this.queue.add(OperatorWindowWithObservable.NEXT_SUBJECT);
                        return;
                    }
                    List<Object> list = this.queue;
                    this.queue = null;
                    boolean z10 = true;
                    this.emitting = true;
                    boolean z11 = true;
                    while (true) {
                        try {
                            drain(list);
                            if (z11) {
                                replaceSubject();
                                z11 = false;
                            }
                            try {
                                synchronized (this.guard) {
                                    try {
                                        List<Object> list2 = this.queue;
                                        this.queue = null;
                                        if (list2 == null) {
                                            this.emitting = false;
                                            return;
                                        }
                                        if (this.child.isUnsubscribed()) {
                                            synchronized (this.guard) {
                                                try {
                                                    this.emitting = false;
                                                } catch (Throwable th2) {
                                                    throw th2;
                                                }
                                            }
                                            return;
                                        }
                                        list = list2;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        z10 = false;
                                        try {
                                            throw th;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            if (!z10) {
                                                synchronized (this.guard) {
                                                    try {
                                                        this.emitting = false;
                                                    } catch (Throwable th5) {
                                                        throw th5;
                                                    }
                                                }
                                            }
                                            throw th;
                                        }
                                    }
                                }
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            z10 = false;
                        }
                    }
                } catch (Throwable th8) {
                    throw th8;
                }
            }
        }
    }

    public OperatorWindowWithObservable(Observable<U> observable) {
        this.other = observable;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super Observable<T>> subscriber) throws Throwable {
        SourceSubscriber sourceSubscriber = new SourceSubscriber(subscriber);
        BoundarySubscriber boundarySubscriber = new BoundarySubscriber(sourceSubscriber);
        subscriber.add(sourceSubscriber);
        subscriber.add(boundarySubscriber);
        sourceSubscriber.replaceWindow();
        this.other.unsafeSubscribe(boundarySubscriber);
        return sourceSubscriber;
    }
}
