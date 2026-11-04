package io.reactivex.internal.util;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes11.dex */
public enum m implements Callable<Map<Object, Object>> {
    INSTANCE;

    public static <K, V> Callable<Map<K, V>> k() {
        return INSTANCE;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Map<Object, Object> call() throws Exception {
        return new HashMap();
    }
}
