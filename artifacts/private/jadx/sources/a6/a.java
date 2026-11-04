package a6;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes3.dex */
public interface a<TInput, TResult, TException extends Throwable> {
    TResult apply(TInput tinput) throws Throwable;
}
