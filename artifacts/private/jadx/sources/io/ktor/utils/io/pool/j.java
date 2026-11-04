package io.ktor.utils.io.pool;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pool.kt\nio/ktor/utils/io/pool/SingleInstancePool\n+ 2 AtomicFU.common.kt\nkotlinx/atomicfu/AtomicFU_commonKt\n*L\n1#1,189:1\n359#2,4:190\n*S KotlinDebug\n*F\n+ 1 Pool.kt\nio/ktor/utils/io/pool/SingleInstancePool\n*L\n87#1:190,4\n*E\n"})
public abstract class j<T> implements h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f297139a = AtomicIntegerFieldUpdater.newUpdater(j.class, "borrowed");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f297140b = AtomicIntegerFieldUpdater.newUpdater(j.class, "disposed");

    @NotNull
    private volatile /* synthetic */ int borrowed = 0;

    @NotNull
    private volatile /* synthetic */ int disposed = 0;

    @NotNull
    private volatile /* synthetic */ Object instance = null;

    @Override // io.ktor.utils.io.pool.h
    public final int He() {
        return 1;
    }

    @Override // io.ktor.utils.io.pool.h
    @NotNull
    public final T Jc() {
        int i10;
        do {
            i10 = this.borrowed;
            if (i10 != 0) {
                throw new IllegalStateException("Instance is already consumed");
            }
        } while (!f297139a.compareAndSet(this, i10, 1));
        T tB = b();
        this.instance = tB;
        return tB;
    }

    protected abstract void a(@NotNull T t10);

    @NotNull
    protected abstract T b();

    @Override // io.ktor.utils.io.pool.h, java.lang.AutoCloseable
    public void close() {
        h.a.a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.ktor.utils.io.pool.h
    public final void dispose() {
        Object obj;
        if (!f297140b.compareAndSet(this, 0, 1) || (obj = this.instance) == null) {
            return;
        }
        this.instance = null;
        a(obj);
    }

    @Override // io.ktor.utils.io.pool.h
    public final void h8(@NotNull T instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (this.instance != instance) {
            if (this.instance == null && this.borrowed != 0) {
                throw new IllegalStateException("Already recycled or an irrelevant instance tried to be recycled");
            }
            throw new IllegalStateException("Unable to recycle irrelevant instance");
        }
        this.instance = null;
        if (!f297140b.compareAndSet(this, 0, 1)) {
            throw new IllegalStateException("An instance is already disposed");
        }
        a(instance);
    }
}
