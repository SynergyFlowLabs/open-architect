package androidx.navigation.internal;

import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicInteger f71024a;

    public a(int i10) {
        this.f71024a = new AtomicInteger(i10);
    }

    public final int a() {
        return this.f71024a.decrementAndGet();
    }

    public final int b() {
        return this.f71024a.get();
    }

    public final int c() {
        return this.f71024a.incrementAndGet();
    }
}
