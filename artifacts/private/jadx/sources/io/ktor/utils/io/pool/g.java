package io.ktor.utils.io.pool;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public abstract class g<T> implements h<T> {
    @Override // io.ktor.utils.io.pool.h
    public int He() {
        return 0;
    }

    @Override // io.ktor.utils.io.pool.h, java.lang.AutoCloseable
    public void close() {
        h.a.a(this);
    }

    @Override // io.ktor.utils.io.pool.h
    public void dispose() {
    }

    @Override // io.ktor.utils.io.pool.h
    public void h8(@NotNull T instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }
}
