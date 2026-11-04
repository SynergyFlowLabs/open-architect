package com.google.android.gms.tasks;

import android.app.Activity;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Task<TResult> {
    @NonNull
    public Task<TResult> a(@NonNull Activity activity, @NonNull e eVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    @NonNull
    public Task<TResult> addOnCompleteListener(@NonNull OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    public Task<TResult> b(@NonNull e eVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    @NonNull
    public Task<TResult> c(@NonNull Executor executor, @NonNull e eVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    @NonNull
    public Task<TResult> d(@NonNull Activity activity, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    public Task<TResult> e(@NonNull Executor executor, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    public abstract Task<TResult> f(@NonNull Activity activity, @NonNull f fVar);

    @NonNull
    public abstract Task<TResult> g(@NonNull f fVar);

    @NonNull
    public abstract Task<TResult> h(@NonNull Executor executor, @NonNull f fVar);

    @NonNull
    public abstract Task<TResult> i(@NonNull Activity activity, @NonNull g<? super TResult> gVar);

    @NonNull
    public abstract Task<TResult> j(@NonNull g<? super TResult> gVar);

    @NonNull
    public abstract Task<TResult> k(@NonNull Executor executor, @NonNull g<? super TResult> gVar);

    @NonNull
    public <TContinuationResult> Task<TContinuationResult> l(@NonNull c<TResult, TContinuationResult> cVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @NonNull
    public <TContinuationResult> Task<TContinuationResult> m(@NonNull Executor executor, @NonNull c<TResult, TContinuationResult> cVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @NonNull
    public <TContinuationResult> Task<TContinuationResult> n(@NonNull c<TResult, Task<TContinuationResult>> cVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @NonNull
    public <TContinuationResult> Task<TContinuationResult> o(@NonNull Executor executor, @NonNull c<TResult, Task<TContinuationResult>> cVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @androidx.annotation.p0
    public abstract Exception p();

    public abstract TResult q();

    public abstract <X extends Throwable> TResult r(@NonNull Class<X> cls) throws Throwable;

    public abstract boolean s();

    public abstract boolean t();

    public abstract boolean u();

    @NonNull
    public <TContinuationResult> Task<TContinuationResult> v(@NonNull k<TResult, TContinuationResult> kVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    @NonNull
    public <TContinuationResult> Task<TContinuationResult> w(@NonNull Executor executor, @NonNull k<TResult, TContinuationResult> kVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
