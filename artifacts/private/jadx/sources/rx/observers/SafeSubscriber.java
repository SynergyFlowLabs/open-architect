package rx.observers;

import java.util.Arrays;
import rx.Subscriber;
import rx.exceptions.CompositeException;
import rx.exceptions.Exceptions;
import rx.exceptions.OnCompletedFailedException;
import rx.exceptions.OnErrorFailedException;
import rx.exceptions.OnErrorNotImplementedException;
import rx.exceptions.UnsubscribeFailedException;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes14.dex */
public class SafeSubscriber<T> extends Subscriber<T> {
    private final Subscriber<? super T> actual;
    boolean done;

    public SafeSubscriber(Subscriber<? super T> subscriber) {
        super(subscriber);
        this.actual = subscriber;
    }

    protected void _onError(Throwable th2) {
        RxJavaHooks.onError(th2);
        try {
            this.actual.onError(th2);
            try {
                unsubscribe();
            } catch (Throwable th3) {
                RxJavaHooks.onError(th3);
                throw new OnErrorFailedException(th3);
            }
        } catch (OnErrorNotImplementedException e10) {
            try {
                unsubscribe();
                throw e10;
            } catch (Throwable th4) {
                RxJavaHooks.onError(th4);
                throw new OnErrorNotImplementedException("Observer.onError not implemented and error while unsubscribing.", new CompositeException(Arrays.asList(th2, th4)));
            }
        } catch (Throwable th5) {
            RxJavaHooks.onError(th5);
            try {
                unsubscribe();
                throw new OnErrorFailedException("Error occurred when trying to propagate error to Observer.onError", new CompositeException(Arrays.asList(th2, th5)));
            } catch (Throwable th6) {
                RxJavaHooks.onError(th6);
                throw new OnErrorFailedException("Error occurred when trying to propagate error to Observer.onError and during unsubscription.", new CompositeException(Arrays.asList(th2, th5, th6)));
            }
        }
    }

    public Subscriber<? super T> getActual() {
        return this.actual;
    }

    @Override // rx.Observer
    public void onCompleted() {
        if (this.done) {
            return;
        }
        this.done = true;
        try {
            this.actual.onCompleted();
            try {
                unsubscribe();
            } catch (Throwable th2) {
                RxJavaHooks.onError(th2);
                throw new UnsubscribeFailedException(th2.getMessage(), th2);
            }
        } catch (Throwable th3) {
            try {
                Exceptions.throwIfFatal(th3);
                RxJavaHooks.onError(th3);
                throw new OnCompletedFailedException(th3.getMessage(), th3);
            } catch (Throwable th4) {
                try {
                    unsubscribe();
                    throw th4;
                } catch (Throwable th5) {
                    RxJavaHooks.onError(th5);
                    throw new UnsubscribeFailedException(th5.getMessage(), th5);
                }
            }
        }
    }

    @Override // rx.Observer
    public void onError(Throwable th2) {
        Exceptions.throwIfFatal(th2);
        if (this.done) {
            return;
        }
        this.done = true;
        _onError(th2);
    }

    @Override // rx.Observer
    public void onNext(T t10) {
        try {
            if (this.done) {
                return;
            }
            this.actual.onNext(t10);
        } catch (Throwable th2) {
            Exceptions.throwOrReport(th2, this);
        }
    }
}
