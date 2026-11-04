package rx.subjects;

import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Scheduler;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.internal.operators.NotificationLite;
import rx.schedulers.TestScheduler;

/* JADX INFO: loaded from: classes14.dex */
public final class TestSubject<T> extends Subject<T, T> {
    private final Scheduler.Worker innerScheduler;
    private final SubjectSubscriptionManager<T> state;

    protected TestSubject(Observable.OnSubscribe<T> onSubscribe, SubjectSubscriptionManager<T> subjectSubscriptionManager, TestScheduler testScheduler) {
        super(onSubscribe);
        this.state = subjectSubscriptionManager;
        this.innerScheduler = testScheduler.createWorker();
    }

    public static <T> TestSubject<T> create(TestScheduler testScheduler) {
        final SubjectSubscriptionManager subjectSubscriptionManager = new SubjectSubscriptionManager();
        Action1<SubjectSubscriptionManager.SubjectObserver<T>> action1 = new Action1<SubjectSubscriptionManager.SubjectObserver<T>>() { // from class: rx.subjects.TestSubject.1
            @Override // rx.functions.Action1
            public void call(SubjectSubscriptionManager.SubjectObserver<T> subjectObserver) throws Throwable {
                subjectObserver.emitFirst(subjectSubscriptionManager.getLatest(), subjectSubscriptionManager.f366793nl);
            }
        };
        subjectSubscriptionManager.onAdded = action1;
        subjectSubscriptionManager.onTerminated = action1;
        return new TestSubject<>(subjectSubscriptionManager, subjectSubscriptionManager, testScheduler);
    }

    @Override // rx.subjects.Subject
    public boolean hasObservers() {
        return this.state.observers().length > 0;
    }

    void internalOnCompleted() {
        SubjectSubscriptionManager<T> subjectSubscriptionManager = this.state;
        if (subjectSubscriptionManager.active) {
            for (SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : subjectSubscriptionManager.terminate(NotificationLite.instance().completed())) {
                subjectObserver.onCompleted();
            }
        }
    }

    void internalOnError(Throwable th2) {
        SubjectSubscriptionManager<T> subjectSubscriptionManager = this.state;
        if (subjectSubscriptionManager.active) {
            for (SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : subjectSubscriptionManager.terminate(NotificationLite.instance().error(th2))) {
                subjectObserver.onError(th2);
            }
        }
    }

    void internalOnNext(T t10) {
        for (SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : this.state.observers()) {
            subjectObserver.onNext(t10);
        }
    }

    @Override // rx.Observer
    public void onCompleted() {
        onCompleted(0L);
    }

    @Override // rx.Observer
    public void onError(Throwable th2) {
        onError(th2, 0L);
    }

    @Override // rx.Observer
    public void onNext(T t10) {
        onNext(t10, 0L);
    }

    public void onCompleted(long j10) {
        this.innerScheduler.schedule(new Action0() { // from class: rx.subjects.TestSubject.2
            @Override // rx.functions.Action0
            public void call() {
                TestSubject.this.internalOnCompleted();
            }
        }, j10, TimeUnit.MILLISECONDS);
    }

    public void onError(final Throwable th2, long j10) {
        this.innerScheduler.schedule(new Action0() { // from class: rx.subjects.TestSubject.3
            @Override // rx.functions.Action0
            public void call() {
                TestSubject.this.internalOnError(th2);
            }
        }, j10, TimeUnit.MILLISECONDS);
    }

    public void onNext(final T t10, long j10) {
        this.innerScheduler.schedule(new Action0() { // from class: rx.subjects.TestSubject.4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // rx.functions.Action0
            public void call() {
                TestSubject.this.internalOnNext(t10);
            }
        }, j10, TimeUnit.MILLISECONDS);
    }
}
