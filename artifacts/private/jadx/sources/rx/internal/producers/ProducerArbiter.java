package rx.internal.producers;

import rx.Producer;

/* JADX INFO: loaded from: classes14.dex */
public final class ProducerArbiter implements Producer {
    static final Producer NULL_PRODUCER = new Producer() { // from class: rx.internal.producers.ProducerArbiter.1
        @Override // rx.Producer
        public void request(long j10) {
        }
    };
    Producer currentProducer;
    boolean emitting;
    long missedProduced;
    Producer missedProducer;
    long missedRequested;
    long requested;

    public void emitLoop() {
        while (true) {
            synchronized (this) {
                try {
                    long j10 = this.missedRequested;
                    long j11 = this.missedProduced;
                    Producer producer = this.missedProducer;
                    if (j10 == 0 && j11 == 0 && producer == null) {
                        this.emitting = false;
                        return;
                    }
                    this.missedRequested = 0L;
                    this.missedProduced = 0L;
                    this.missedProducer = null;
                    long j12 = this.requested;
                    if (j12 != Long.MAX_VALUE) {
                        long j13 = j12 + j10;
                        if (j13 < 0 || j13 == Long.MAX_VALUE) {
                            this.requested = Long.MAX_VALUE;
                            j12 = Long.MAX_VALUE;
                        } else {
                            j12 = j13 - j11;
                            if (j12 < 0) {
                                throw new IllegalStateException("more produced than requested");
                            }
                            this.requested = j12;
                        }
                    }
                    if (producer == null) {
                        Producer producer2 = this.currentProducer;
                        if (producer2 != null && j10 != 0) {
                            producer2.request(j10);
                        }
                    } else if (producer == NULL_PRODUCER) {
                        this.currentProducer = null;
                    } else {
                        this.currentProducer = producer;
                        producer.request(j12);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void produced(long j10) {
        if (j10 <= 0) {
            throw new IllegalArgumentException("n > 0 required");
        }
        synchronized (this) {
            try {
                if (this.emitting) {
                    this.missedProduced += j10;
                    return;
                }
                this.emitting = true;
                try {
                    long j11 = this.requested;
                    if (j11 != Long.MAX_VALUE) {
                        long j12 = j11 - j10;
                        if (j12 < 0) {
                            throw new IllegalStateException("more items arrived than were requested");
                        }
                        this.requested = j12;
                    }
                    emitLoop();
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

    @Override // rx.Producer
    public void request(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (j10 == 0) {
            return;
        }
        synchronized (this) {
            try {
                if (this.emitting) {
                    this.missedRequested += j10;
                    return;
                }
                this.emitting = true;
                try {
                    long j11 = this.requested + j10;
                    if (j11 < 0) {
                        j11 = Long.MAX_VALUE;
                    }
                    this.requested = j11;
                    Producer producer = this.currentProducer;
                    if (producer != null) {
                        producer.request(j10);
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
                try {
                    this.currentProducer = producer;
                    if (producer != null) {
                        producer.request(this.requested);
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
}
