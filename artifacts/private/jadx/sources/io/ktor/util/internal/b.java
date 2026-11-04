package io.ktor.util.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b<T> extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f296647a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "consensus");

    @NotNull
    private volatile /* synthetic */ Object consensus = e.f296655h;

    private final Object c(Object obj) {
        return f(obj) ? obj : this.consensus;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.ktor.util.internal.g
    @Nullable
    public final Object a(@Nullable Object obj) {
        Object objC = this.consensus;
        if (objC == e.f296655h) {
            objC = c(e(obj));
        }
        b(obj, objC);
        return objC;
    }

    public abstract void b(T t10, @Nullable Object obj);

    public final boolean d() {
        return this.consensus != e.f296655h;
    }

    @Nullable
    public abstract Object e(T t10);

    public final boolean f(@Nullable Object obj) {
        if (obj != e.f296655h) {
            return androidx.concurrent.futures.b.a(f296647a, this, e.f296655h, obj);
        }
        throw new IllegalStateException("Check failed.");
    }
}
