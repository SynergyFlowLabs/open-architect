package androidx.datastore.core;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicInteger f49490a;

    public d(int i10) {
        this.f49490a = new AtomicInteger(i10);
    }

    public final int a() {
        return this.f49490a.decrementAndGet();
    }

    public final int b() {
        return this.f49490a.get();
    }

    public final int c() {
        return this.f49490a.getAndIncrement();
    }

    public final int d() {
        return this.f49490a.incrementAndGet();
    }

    public /* synthetic */ d(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
