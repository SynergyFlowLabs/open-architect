package org.apache.commons.lang3.concurrent;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.c0;

/* JADX INFO: loaded from: classes14.dex */
public class m {

    static final class a<T> implements Future<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f337104a;

        a(T t10) {
            this.f337104a = t10;
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            return false;
        }

        @Override // java.util.concurrent.Future
        public T get() {
            return this.f337104a;
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return false;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public T get(long j10, TimeUnit timeUnit) {
            return this.f337104a;
        }
    }

    private m() {
    }

    static Throwable a(Throwable th2) {
        c0.v((th2 == null || (th2 instanceof RuntimeException) || (th2 instanceof Error)) ? false : true, "Not a checked exception: " + th2, new Object[0]);
        return th2;
    }

    public static <T> Future<T> b(T t10) {
        return new a(t10);
    }

    public static <K, V> V c(ConcurrentMap<K, V> concurrentMap, K k10, k<V> kVar) throws j {
        if (concurrentMap == null || kVar == null) {
            return null;
        }
        V v10 = concurrentMap.get(k10);
        return v10 == null ? (V) k(concurrentMap, k10, kVar.get()) : v10;
    }

    public static <K, V> V d(ConcurrentMap<K, V> concurrentMap, K k10, k<V> kVar) {
        try {
            return (V) c(concurrentMap, k10, kVar);
        } catch (j e10) {
            throw new l(e10.getCause());
        }
    }

    public static j e(ExecutionException executionException) {
        if (executionException != null && executionException.getCause() != null) {
            l(executionException);
            return new j(executionException.getMessage(), executionException.getCause());
        }
        return null;
    }

    public static l f(ExecutionException executionException) {
        if (executionException == null || executionException.getCause() == null) {
            return null;
        }
        l(executionException);
        return new l(executionException.getMessage(), executionException.getCause());
    }

    public static void g(ExecutionException executionException) throws j {
        j jVarE = e(executionException);
        if (jVarE != null) {
            throw jVarE;
        }
    }

    public static void h(ExecutionException executionException) {
        l lVarF = f(executionException);
        if (lVarF != null) {
            throw lVarF;
        }
    }

    public static <T> T i(k<T> kVar) throws j {
        if (kVar != null) {
            return kVar.get();
        }
        return null;
    }

    public static <T> T j(k<T> kVar) {
        try {
            return (T) i(kVar);
        } catch (j e10) {
            throw new l(e10.getCause());
        }
    }

    public static <K, V> V k(ConcurrentMap<K, V> concurrentMap, K k10, V v10) {
        if (concurrentMap == null) {
            return null;
        }
        V vPutIfAbsent = concurrentMap.putIfAbsent(k10, v10);
        return vPutIfAbsent != null ? vPutIfAbsent : v10;
    }

    private static void l(ExecutionException executionException) {
        if (executionException.getCause() instanceof RuntimeException) {
            throw ((RuntimeException) executionException.getCause());
        }
        if (executionException.getCause() instanceof Error) {
            throw ((Error) executionException.getCause());
        }
    }
}
