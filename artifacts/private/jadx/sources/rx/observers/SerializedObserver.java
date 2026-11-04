package rx.observers;

import rx.Observer;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;
import rx.internal.operators.NotificationLite;

/* JADX INFO: loaded from: classes14.dex */
public class SerializedObserver<T> implements Observer<T> {
    private final Observer<? super T> actual;
    private boolean emitting;

    /* JADX INFO: renamed from: nl, reason: collision with root package name */
    private final NotificationLite<T> f366788nl = NotificationLite.instance();
    private FastList queue;
    private volatile boolean terminated;

    static final class FastList {
        Object[] array;
        int size;

        FastList() {
        }

        public void add(Object obj) {
            int i10 = this.size;
            Object[] objArr = this.array;
            if (objArr == null) {
                objArr = new Object[16];
                this.array = objArr;
            } else if (i10 == objArr.length) {
                Object[] objArr2 = new Object[(i10 >> 2) + i10];
                System.arraycopy(objArr, 0, objArr2, 0, i10);
                this.array = objArr2;
                objArr = objArr2;
            }
            objArr[i10] = obj;
            this.size = i10 + 1;
        }
    }

    public SerializedObserver(Observer<? super T> observer) {
        this.actual = observer;
    }

    @Override // rx.Observer
    public void onCompleted() {
        if (this.terminated) {
            return;
        }
        synchronized (this) {
            try {
                if (this.terminated) {
                    return;
                }
                this.terminated = true;
                if (!this.emitting) {
                    this.emitting = true;
                    this.actual.onCompleted();
                    return;
                }
                FastList fastList = this.queue;
                if (fastList == null) {
                    fastList = new FastList();
                    this.queue = fastList;
                }
                fastList.add(this.f366788nl.completed());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // rx.Observer
    public void onError(Throwable th2) {
        Exceptions.throwIfFatal(th2);
        if (this.terminated) {
            return;
        }
        synchronized (this) {
            try {
                if (this.terminated) {
                    return;
                }
                this.terminated = true;
                if (!this.emitting) {
                    this.emitting = true;
                    this.actual.onError(th2);
                    return;
                }
                FastList fastList = this.queue;
                if (fastList == null) {
                    fastList = new FastList();
                    this.queue = fastList;
                }
                fastList.add(this.f366788nl.error(th2));
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // rx.Observer
    public void onNext(T t10) {
        if (this.terminated) {
            return;
        }
        synchronized (this) {
            try {
                if (this.terminated) {
                    return;
                }
                if (this.emitting) {
                    FastList fastList = this.queue;
                    if (fastList == null) {
                        fastList = new FastList();
                        this.queue = fastList;
                    }
                    fastList.add(this.f366788nl.next(t10));
                    return;
                }
                this.emitting = true;
                try {
                    this.actual.onNext(t10);
                    while (true) {
                        synchronized (this) {
                            try {
                                FastList fastList2 = this.queue;
                                if (fastList2 == null) {
                                    this.emitting = false;
                                    return;
                                }
                                this.queue = null;
                                for (Object obj : fastList2.array) {
                                    if (obj == null) {
                                        break;
                                    }
                                    try {
                                        if (this.f366788nl.accept(this.actual, obj)) {
                                            this.terminated = true;
                                            return;
                                        }
                                    } catch (Throwable th2) {
                                        this.terminated = true;
                                        Exceptions.throwIfFatal(th2);
                                        this.actual.onError(OnErrorThrowable.addValueAsLastCause(th2, t10));
                                        return;
                                    }
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    this.terminated = true;
                    Exceptions.throwOrReport(th4, this.actual, t10);
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }
}
