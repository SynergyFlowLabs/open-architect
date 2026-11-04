package androidx.datastore.core.okio;

import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicInteger f49716a;

    public b(int i10) {
        this.f49716a = new AtomicInteger(i10);
    }

    public final int a() {
        return this.f49716a.decrementAndGet();
    }

    public final int b() {
        return this.f49716a.get();
    }

    public final int c() {
        return this.f49716a.getAndIncrement();
    }

    public final int d() {
        return this.f49716a.incrementAndGet();
    }
}
