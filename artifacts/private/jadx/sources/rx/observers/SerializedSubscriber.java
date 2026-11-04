package rx.observers;

import rx.Observer;
import rx.Subscriber;

/* JADX INFO: loaded from: classes14.dex */
public class SerializedSubscriber<T> extends Subscriber<T> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Observer<T> f366789s;

    public SerializedSubscriber(Subscriber<? super T> subscriber) {
        this(subscriber, true);
    }

    @Override // rx.Observer
    public void onCompleted() {
        this.f366789s.onCompleted();
    }

    @Override // rx.Observer
    public void onError(Throwable th2) {
        this.f366789s.onError(th2);
    }

    @Override // rx.Observer
    public void onNext(T t10) {
        this.f366789s.onNext(t10);
    }

    public SerializedSubscriber(Subscriber<? super T> subscriber, boolean z10) {
        super(subscriber, z10);
        this.f366789s = new SerializedObserver(subscriber);
    }
}
