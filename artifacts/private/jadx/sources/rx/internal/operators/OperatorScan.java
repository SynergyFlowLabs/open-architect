package rx.internal.operators;

import a0.b;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Observer;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func0;
import rx.functions.Func2;
import rx.internal.util.atomic.SpscLinkedAtomicQueue;
import rx.internal.util.unsafe.SpscLinkedQueue;
import rx.internal.util.unsafe.UnsafeAccess;

/* JADX INFO: loaded from: classes14.dex */
public final class OperatorScan<R, T> implements Observable.Operator<R, T> {
    private static final Object NO_INITIAL_VALUE = new Object();
    final Func2<R, ? super T, R> accumulator;
    private final Func0<R> initialValueFactory;

    static final class InitialProducer<R> implements Producer, Observer<R> {
        final Subscriber<? super R> child;
        volatile boolean done;
        boolean emitting;
        Throwable error;
        boolean missed;
        long missedRequested;
        volatile Producer producer;
        final Queue<Object> queue;
        final AtomicLong requested;

        public InitialProducer(R r10, Subscriber<? super R> subscriber) {
            this.child = subscriber;
            Queue<Object> spscLinkedQueue = UnsafeAccess.isUnsafeAvailable() ? new SpscLinkedQueue<>() : new SpscLinkedAtomicQueue<>();
            this.queue = spscLinkedQueue;
            spscLinkedQueue.offer(NotificationLite.instance().next(r10));
            this.requested = new AtomicLong();
        }

        boolean checkTerminated(boolean z10, boolean z11, Subscriber<? super R> subscriber) {
            if (subscriber.isUnsubscribed()) {
                return true;
            }
            if (z10) {
                Throwable th2 = this.error;
                if (th2 != null) {
                    subscriber.onError(th2);
                    return true;
                }
                if (z11) {
                    subscriber.onCompleted();
                    return true;
                }
            }
            return false;
        }

        void emit() {
            synchronized (this) {
                try {
                    if (this.emitting) {
                        this.missed = true;
                    } else {
                        this.emitting = true;
                        emitLoop();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void emitLoop() {
            Subscriber<? super R> subscriber = this.child;
            Queue<Object> queue = this.queue;
            NotificationLite notificationLiteInstance = NotificationLite.instance();
            AtomicLong atomicLong = this.requested;
            long jProduced = atomicLong.get();
            while (!checkTerminated(this.done, queue.isEmpty(), subscriber)) {
                long j10 = 0;
                while (j10 != jProduced) {
                    boolean z10 = this.done;
                    Object objPoll = queue.poll();
                    boolean z11 = objPoll == null;
                    if (checkTerminated(z10, z11, subscriber)) {
                        return;
                    }
                    if (z11) {
                        break;
                    }
                    b bVar = (Object) notificationLiteInstance.getValue(objPoll);
                    try {
                        subscriber.onNext(bVar);
                        j10++;
                    } catch (Throwable th2) {
                        Exceptions.throwOrReport(th2, subscriber, bVar);
                        return;
                    }
                }
                if (j10 != 0 && jProduced != Long.MAX_VALUE) {
                    jProduced = BackpressureUtils.produced(atomicLong, j10);
                }
                synchronized (this) {
                    try {
                        if (!this.missed) {
                            this.emitting = false;
                            return;
                        }
                        this.missed = false;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.done = true;
            emit();
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            emit();
        }

        @Override // rx.Observer
        public void onNext(R r10) {
            this.queue.offer(NotificationLite.instance().next(r10));
            emit();
        }

        @Override // rx.Producer
        public void request(long j10) {
            if (j10 < 0) {
                throw new IllegalArgumentException("n >= required but it was " + j10);
            }
            if (j10 != 0) {
                BackpressureUtils.getAndAddRequest(this.requested, j10);
                Producer producer = this.producer;
                if (producer == null) {
                    synchronized (this.requested) {
                        try {
                            producer = this.producer;
                            if (producer == null) {
                                this.missedRequested = BackpressureUtils.addCap(this.missedRequested, j10);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                if (producer != null) {
                    producer.request(j10);
                }
                emit();
            }
        }

        public void setProducer(Producer producer) {
            long j10;
            producer.getClass();
            synchronized (this.requested) {
                if (this.producer != null) {
                    throw new IllegalStateException("Can't set more than one Producer!");
                }
                j10 = this.missedRequested;
                if (j10 != Long.MAX_VALUE) {
                    j10--;
                }
                this.missedRequested = 0L;
                this.producer = producer;
            }
            if (j10 > 0) {
                producer.request(j10);
            }
            emit();
        }
    }

    public OperatorScan(final R r10, Func2<R, ? super T, R> func2) {
        this((Func0) new Func0<R>() { // from class: rx.internal.operators.OperatorScan.1
            @Override // rx.functions.Func0, java.util.concurrent.Callable
            public R call() {
                return (R) r10;
            }
        }, (Func2) func2);
    }

    public OperatorScan(Func0<R> func0, Func2<R, ? super T, R> func2) {
        this.initialValueFactory = func0;
        this.accumulator = func2;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(final Subscriber<? super R> subscriber) {
        R rCall = this.initialValueFactory.call();
        if (rCall == NO_INITIAL_VALUE) {
            return new Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorScan.2
                boolean once;
                R value;

                @Override // rx.Observer
                public void onCompleted() {
                    subscriber.onCompleted();
                }

                @Override // rx.Observer
                public void onError(Throwable th2) {
                    subscriber.onError(th2);
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // rx.Observer
                public void onNext(T t10) {
                    if (this.once) {
                        try {
                            t10 = OperatorScan.this.accumulator.call(this.value, t10);
                        } catch (Throwable th2) {
                            Exceptions.throwOrReport(th2, subscriber, t10);
                            return;
                        }
                    } else {
                        this.once = true;
                    }
                    this.value = (R) t10;
                    subscriber.onNext(t10);
                }
            };
        }
        InitialProducer initialProducer = new InitialProducer(rCall, subscriber);
        Subscriber<T> subscriber2 = new Subscriber<T>(rCall, initialProducer) { // from class: rx.internal.operators.OperatorScan.3
            final /* synthetic */ Object val$initialValue;
            final /* synthetic */ InitialProducer val$ip;
            private R value;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.val$initialValue = rCall;
                this.val$ip = initialProducer;
                this.value = rCall;
            }

            @Override // rx.Observer
            public void onCompleted() {
                this.val$ip.onCompleted();
            }

            @Override // rx.Observer
            public void onError(Throwable th2) {
                this.val$ip.onError(th2);
            }

            @Override // rx.Observer
            public void onNext(T t10) {
                try {
                    R rCall2 = OperatorScan.this.accumulator.call(this.value, t10);
                    this.value = rCall2;
                    this.val$ip.onNext(rCall2);
                } catch (Throwable th2) {
                    Exceptions.throwOrReport(th2, this, t10);
                }
            }

            @Override // rx.Subscriber
            public void setProducer(Producer producer) {
                this.val$ip.setProducer(producer);
            }
        };
        subscriber.add(subscriber2);
        subscriber.setProducer(initialProducer);
        return subscriber2;
    }

    public OperatorScan(Func2<R, ? super T, R> func2) {
        this(NO_INITIAL_VALUE, func2);
    }
}
