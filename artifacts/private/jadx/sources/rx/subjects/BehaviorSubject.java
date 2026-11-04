package rx.subjects;

import java.lang.reflect.Array;
import java.util.ArrayList;
import rx.Observable;
import rx.exceptions.Exceptions;
import rx.functions.Action1;
import rx.internal.operators.NotificationLite;

/* JADX INFO: loaded from: classes14.dex */
public final class BehaviorSubject<T> extends Subject<T, T> {
    private static final Object[] EMPTY_ARRAY = new Object[0];

    /* JADX INFO: renamed from: nl, reason: collision with root package name */
    private final NotificationLite<T> f366792nl;
    private final SubjectSubscriptionManager<T> state;

    protected BehaviorSubject(Observable.OnSubscribe<T> onSubscribe, SubjectSubscriptionManager<T> subjectSubscriptionManager) {
        super(onSubscribe);
        this.f366792nl = NotificationLite.instance();
        this.state = subjectSubscriptionManager;
    }

    public static <T> BehaviorSubject<T> create() {
        return create(null, false);
    }

    public Throwable getThrowable() {
        Object latest = this.state.getLatest();
        if (this.f366792nl.isError(latest)) {
            return this.f366792nl.getError(latest);
        }
        return null;
    }

    public T getValue() {
        Object latest = this.state.getLatest();
        if (this.f366792nl.isNext(latest)) {
            return this.f366792nl.getValue(latest);
        }
        return null;
    }

    public T[] getValues(T[] tArr) {
        Object latest = this.state.getLatest();
        if (!this.f366792nl.isNext(latest)) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        if (tArr.length == 0) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
        }
        tArr[0] = this.f366792nl.getValue(latest);
        if (tArr.length > 1) {
            tArr[1] = null;
        }
        return tArr;
    }

    public boolean hasCompleted() {
        return this.f366792nl.isCompleted(this.state.getLatest());
    }

    @Override // rx.subjects.Subject
    public boolean hasObservers() {
        return this.state.observers().length > 0;
    }

    public boolean hasThrowable() {
        return this.f366792nl.isError(this.state.getLatest());
    }

    public boolean hasValue() {
        return this.f366792nl.isNext(this.state.getLatest());
    }

    @Override // rx.Observer
    public void onCompleted() {
        if (this.state.getLatest() == null || this.state.active) {
            Object objCompleted = this.f366792nl.completed();
            for (SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : this.state.terminate(objCompleted)) {
                subjectObserver.emitNext(objCompleted, this.state.f366793nl);
            }
        }
    }

    @Override // rx.Observer
    public void onError(Throwable th2) {
        if (this.state.getLatest() == null || this.state.active) {
            Object objError = this.f366792nl.error(th2);
            ArrayList arrayList = null;
            for (SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : this.state.terminate(objError)) {
                try {
                    subjectObserver.emitNext(objError, this.state.f366793nl);
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
        if (this.state.getLatest() == null || this.state.active) {
            Object next = this.f366792nl.next(t10);
            for (SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : this.state.next(next)) {
                subjectObserver.emitNext(next, this.state.f366793nl);
            }
        }
    }

    int subscriberCount() {
        return this.state.observers().length;
    }

    public static <T> BehaviorSubject<T> create(T t10) {
        return create(t10, true);
    }

    private static <T> BehaviorSubject<T> create(T t10, boolean z10) {
        final SubjectSubscriptionManager subjectSubscriptionManager = new SubjectSubscriptionManager();
        if (z10) {
            subjectSubscriptionManager.setLatest(NotificationLite.instance().next(t10));
        }
        Action1<SubjectSubscriptionManager.SubjectObserver<T>> action1 = new Action1<SubjectSubscriptionManager.SubjectObserver<T>>() { // from class: rx.subjects.BehaviorSubject.1
            @Override // rx.functions.Action1
            public void call(SubjectSubscriptionManager.SubjectObserver<T> subjectObserver) throws Throwable {
                subjectObserver.emitFirst(subjectSubscriptionManager.getLatest(), subjectSubscriptionManager.f366793nl);
            }
        };
        subjectSubscriptionManager.onAdded = action1;
        subjectSubscriptionManager.onTerminated = action1;
        return new BehaviorSubject<>(subjectSubscriptionManager, subjectSubscriptionManager);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object[] getValues() {
        Object[] objArr = EMPTY_ARRAY;
        Object[] values = getValues(objArr);
        if (values == objArr) {
            values = new Object[0];
        }
        return values;
    }
}
