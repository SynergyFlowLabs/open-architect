package rx.subjects;

import java.util.ArrayList;
import rx.Observable;
import rx.exceptions.Exceptions;
import rx.functions.Action1;
import rx.internal.operators.NotificationLite;
import rx.internal.producers.SingleProducer;

/* JADX INFO: loaded from: classes14.dex */
public final class AsyncSubject<T> extends Subject<T, T> {
    volatile Object lastValue;

    /* JADX INFO: renamed from: nl, reason: collision with root package name */
    private final NotificationLite<T> f366791nl;
    final SubjectSubscriptionManager<T> state;

    protected AsyncSubject(Observable.OnSubscribe<T> onSubscribe, SubjectSubscriptionManager<T> subjectSubscriptionManager) {
        super(onSubscribe);
        this.f366791nl = NotificationLite.instance();
        this.state = subjectSubscriptionManager;
    }

    public static <T> AsyncSubject<T> create() {
        final SubjectSubscriptionManager subjectSubscriptionManager = new SubjectSubscriptionManager();
        subjectSubscriptionManager.onTerminated = new Action1<SubjectSubscriptionManager.SubjectObserver<T>>() { // from class: rx.subjects.AsyncSubject.1
            @Override // rx.functions.Action1
            public void call(SubjectSubscriptionManager.SubjectObserver<T> subjectObserver) {
                Object latest = subjectSubscriptionManager.getLatest();
                NotificationLite<T> notificationLite = subjectSubscriptionManager.f366793nl;
                if (latest != null && !notificationLite.isCompleted(latest)) {
                    if (notificationLite.isError(latest)) {
                        subjectObserver.onError(notificationLite.getError(latest));
                        return;
                    } else {
                        subjectObserver.actual.setProducer(new SingleProducer(subjectObserver.actual, notificationLite.getValue(latest)));
                        return;
                    }
                }
                subjectObserver.onCompleted();
            }
        };
        return new AsyncSubject<>(subjectSubscriptionManager, subjectSubscriptionManager);
    }

    public Throwable getThrowable() {
        Object latest = this.state.getLatest();
        if (this.f366791nl.isError(latest)) {
            return this.f366791nl.getError(latest);
        }
        return null;
    }

    public T getValue() {
        Object obj = this.lastValue;
        if (this.f366791nl.isError(this.state.getLatest()) || !this.f366791nl.isNext(obj)) {
            return null;
        }
        return this.f366791nl.getValue(obj);
    }

    public boolean hasCompleted() {
        Object latest = this.state.getLatest();
        return (latest == null || this.f366791nl.isError(latest)) ? false : true;
    }

    @Override // rx.subjects.Subject
    public boolean hasObservers() {
        return this.state.observers().length > 0;
    }

    public boolean hasThrowable() {
        return this.f366791nl.isError(this.state.getLatest());
    }

    public boolean hasValue() {
        return !this.f366791nl.isError(this.state.getLatest()) && this.f366791nl.isNext(this.lastValue);
    }

    @Override // rx.Observer
    public void onCompleted() {
        if (this.state.active) {
            Object objCompleted = this.lastValue;
            if (objCompleted == null) {
                objCompleted = this.f366791nl.completed();
            }
            for (SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : this.state.terminate(objCompleted)) {
                if (objCompleted == this.f366791nl.completed()) {
                    subjectObserver.onCompleted();
                } else {
                    subjectObserver.actual.setProducer(new SingleProducer(subjectObserver.actual, this.f366791nl.getValue(objCompleted)));
                }
            }
        }
    }

    @Override // rx.Observer
    public void onError(Throwable th2) {
        if (this.state.active) {
            ArrayList arrayList = null;
            for (SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : this.state.terminate(this.f366791nl.error(th2))) {
                try {
                    subjectObserver.onError(th2);
                } catch (Throwable th3) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th3);
                }
            }
            Exceptions.throwIfAny(arrayList);
        }
    }

    @Override // rx.Observer
    public void onNext(T t10) {
        this.lastValue = this.f366791nl.next(t10);
    }
}
