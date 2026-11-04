package kotlinx.coroutines.debug.internal;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class q<T> extends WeakReference<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    public final int f314002a;

    public q(T t10, @Nullable ReferenceQueue<T> referenceQueue) {
        super(t10, referenceQueue);
        this.f314002a = t10 != null ? t10.hashCode() : 0;
    }
}
