package rx.internal.producers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx.Observer;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.internal.operators.BackpressureUtils;

/* JADX INFO: loaded from: classes14.dex */
public final class ProducerObserverArbiter<T> implements Producer, Observer<T> {
    static final Producer NULL_PRODUCER = new Producer() { // from class: rx.internal.producers.ProducerObserverArbiter.1
        @Override // rx.Producer
        public void request(long j10) {
        }
    };
    final Subscriber<? super T> child;
    Producer currentProducer;
    boolean emitting;
    volatile boolean hasError;
    Producer missedProducer;
    long missedRequested;
    Object missedTerminal;
    List<T> queue;
    long requested;

    public ProducerObserverArbiter(Subscriber<? super T> subscriber) {
        this.child = subscriber;
    }

    void emitLoop() {
        long j10;
        Producer producer;
        Object obj;
        List<T> list;
        boolean z10;
        boolean z11;
        long size;
        Subscriber<? super T> subscriber = this.child;
        Producer producer2 = null;
        long jAddCap = 0;
        while (true) {
            synchronized (this) {
                try {
                    j10 = this.missedRequested;
                    producer = this.missedProducer;
                    obj = this.missedTerminal;
                    list = this.queue;
                    z10 = true;
                    if (j10 == 0 && producer == null && list == null && obj == null) {
                        this.emitting = false;
                        z11 = true;
                    } else {
                        this.missedRequested = 0L;
                        this.missedProducer = null;
                        this.queue = null;
                        this.missedTerminal = null;
                        z11 = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z11) {
                if (jAddCap == 0 || producer2 == null) {
                    return;
                }
                producer2.request(jAddCap);
                return;
            }
            if (list != null && !list.isEmpty()) {
                z10 = false;
            }
            if (obj != null) {
                if (obj != Boolean.TRUE) {
                    subscriber.onError((Throwable) obj);
                    return;
                } else if (z10) {
                    subscriber.onCompleted();
                    return;
                }
            }
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        T next = it.next();
                        if (subscriber.isUnsubscribed()) {
                            return;
                        }
                        if (this.hasError) {
                            continue;
                        } else {
                            try {
                                subscriber.onNext(next);
                            } catch (Throwable th3) {
                                Exceptions.throwOrReport(th3, subscriber, next);
                                return;
                            }
                        }
                    } else {
                        size = list.size();
                    }
                }
            } else {
                size = 0;
            }
            long j11 = this.requested;
            if (j11 != Long.MAX_VALUE) {
                if (j10 != 0) {
                    j11 += j10;
                    if (j11 < 0) {
                        j11 = Long.MAX_VALUE;
                    }
                }
                if (size != 0 && j11 != Long.MAX_VALUE) {
                    j11 -= size;
                    if (j11 < 0) {
                        throw new IllegalStateException("More produced than requested");
                    }
                }
                this.requested = j11;
            }
            if (producer == null) {
                producer = this.currentProducer;
                if (producer != null && j10 != 0) {
                    jAddCap = BackpressureUtils.addCap(jAddCap, j10);
                    producer2 = producer;
                }
            } else if (producer == NULL_PRODUCER) {
                this.currentProducer = null;
            } else {
                this.currentProducer = producer;
                if (j11 != 0) {
                    jAddCap = BackpressureUtils.addCap(jAddCap, j11);
                    producer2 = producer;
                }
            }
        }
    }

    @Override // rx.Observer
    public void onCompleted() {
        synchronized (this) {
            try {
                if (this.emitting) {
                    this.missedTerminal = Boolean.TRUE;
                } else {
                    this.emitting = true;
                    this.child.onCompleted();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // rx.Observer
    public void onError(Throwable th2) {
        boolean z10;
        synchronized (this) {
            try {
                if (this.emitting) {
                    this.missedTerminal = th2;
                    z10 = false;
                } else {
                    this.emitting = true;
                    z10 = true;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z10) {
            this.child.onError(th2);
        } else {
            this.hasError = true;
        }
    }

    @Override // rx.Observer
    public void onNext(T t10) {
        synchronized (this) {
            try {
                if (this.emitting) {
                    List arrayList = this.queue;
                    if (arrayList == null) {
                        arrayList = new ArrayList(4);
                        this.queue = arrayList;
                    }
                    arrayList.add(t10);
                    return;
                }
                this.emitting = true;
                try {
                    this.child.onNext(t10);
                    long j10 = this.requested;
                    if (j10 != Long.MAX_VALUE) {
                        this.requested = j10 - 1;
                    }
                    emitLoop();
                } catch (Throwable th2) {
                    synchronized (this) {
                        try {
                            this.emitting = false;
                            throw th2;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // rx.Producer
    public void request(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (j10 != 0) {
            synchronized (this) {
                try {
                    if (this.emitting) {
                        this.missedRequested += j10;
                        return;
                    }
                    this.emitting = true;
                    Producer producer = this.currentProducer;
                    try {
                        long j11 = this.requested + j10;
                        if (j11 < 0) {
                            j11 = Long.MAX_VALUE;
                        }
                        this.requested = j11;
                        emitLoop();
                        if (producer != null) {
                            producer.request(j10);
                        }
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.emitting = false;
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public void setProducer(Producer producer) {
        synchronized (this) {
            try {
                if (this.emitting) {
                    if (producer == null) {
                        producer = NULL_PRODUCER;
                    }
                    this.missedProducer = producer;
                    return;
                }
                this.emitting = true;
                this.currentProducer = producer;
                long j10 = this.requested;
                try {
                    emitLoop();
                    if (producer == null || j10 == 0) {
                        return;
                    }
                    producer.request(j10);
                } catch (Throwable th2) {
                    synchronized (this) {
                        try {
                            this.emitting = false;
                            throw th2;
                        } finally {
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
