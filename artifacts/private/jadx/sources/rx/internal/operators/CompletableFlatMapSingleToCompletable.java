package rx.internal.operators;

import rx.Completable;
import rx.CompletableSubscriber;
import rx.Single;
import rx.SingleSubscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes14.dex */
public final class CompletableFlatMapSingleToCompletable<T> implements Completable.OnSubscribe {
    final Func1<? super T, ? extends Completable> mapper;
    final Single<T> source;

    static final class SourceSubscriber<T> extends SingleSubscriber<T> implements CompletableSubscriber {
        final CompletableSubscriber actual;
        final Func1<? super T, ? extends Completable> mapper;

        public SourceSubscriber(CompletableSubscriber completableSubscriber, Func1<? super T, ? extends Completable> func1) {
            this.actual = completableSubscriber;
            this.mapper = func1;
        }

        @Override // rx.CompletableSubscriber
        public void onCompleted() {
            this.actual.onCompleted();
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable th2) {
            this.actual.onError(th2);
        }

        @Override // rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            add(subscription);
        }

        @Override // rx.SingleSubscriber
        public void onSuccess(T t10) {
            try {
                Completable completableCall = this.mapper.call(t10);
                if (completableCall == null) {
                    onError(new NullPointerException("The mapper returned a null Completable"));
                } else {
                    completableCall.subscribe(this);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                onError(th2);
            }
        }
    }

    public CompletableFlatMapSingleToCompletable(Single<T> single, Func1<? super T, ? extends Completable> func1) {
        this.source = single;
        this.mapper = func1;
    }

    @Override // rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        SourceSubscriber sourceSubscriber = new SourceSubscriber(completableSubscriber, this.mapper);
        completableSubscriber.onSubscribe(sourceSubscriber);
        this.source.subscribe(sourceSubscriber);
    }
}
