package com.superwall.supercel;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class UniffiHandleMap<T> {

    @NotNull
    private final ConcurrentHashMap<Long, T> map = new ConcurrentHashMap<>();

    @NotNull
    private final AtomicLong counter = new AtomicLong(0);

    @NotNull
    public final T get(long j10) throws InternalException {
        T t10 = this.map.get(Long.valueOf(j10));
        if (t10 != null) {
            return t10;
        }
        throw new InternalException("UniffiHandleMap.get: Invalid handle");
    }

    public final int getSize() {
        return this.map.size();
    }

    public final long insert(@NotNull T obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        long andAdd = this.counter.getAndAdd(1L);
        this.map.put(Long.valueOf(andAdd), obj);
        return andAdd;
    }

    @NotNull
    public final T remove(long j10) throws InternalException {
        T tRemove = this.map.remove(Long.valueOf(j10));
        if (tRemove != null) {
            return tRemove;
        }
        throw new InternalException("UniffiHandleMap: Invalid handle");
    }
}
