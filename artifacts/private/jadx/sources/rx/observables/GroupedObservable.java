package rx.observables;

import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes14.dex */
public class GroupedObservable<K, T> extends Observable<T> {
    private final K key;

    protected GroupedObservable(K k10, Observable.OnSubscribe<T> onSubscribe) {
        super(onSubscribe);
        this.key = k10;
    }

    public static <K, T> GroupedObservable<K, T> create(K k10, Observable.OnSubscribe<T> onSubscribe) {
        return new GroupedObservable<>(k10, onSubscribe);
    }

    public static <K, T> GroupedObservable<K, T> from(K k10, final Observable<T> observable) {
        return new GroupedObservable<>(k10, new Observable.OnSubscribe<T>() { // from class: rx.observables.GroupedObservable.1
            @Override // rx.functions.Action1
            public void call(Subscriber<? super T> subscriber) {
                observable.unsafeSubscribe(subscriber);
            }
        });
    }

    public K getKey() {
        return this.key;
    }
}
