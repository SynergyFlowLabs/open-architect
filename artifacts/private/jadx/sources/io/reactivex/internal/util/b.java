package io.reactivex.internal.util;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes11.dex */
public enum b implements Callable<List<Object>>, dj.o<Object, List<Object>> {
    INSTANCE;

    public static <T> Callable<List<T>> k() {
        return INSTANCE;
    }

    public static <T, O> dj.o<O, List<T>> l() {
        return INSTANCE;
    }

    @Override // dj.o
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public List<Object> apply(Object obj) throws Exception {
        return new ArrayList();
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public List<Object> call() throws Exception {
        return new ArrayList();
    }
}
