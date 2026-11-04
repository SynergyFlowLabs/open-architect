package kotlinx.atomicfu;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class l extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final m f313512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f313513b;

    public l(@NotNull m trace, @NotNull String name) {
        Intrinsics.checkNotNullParameter(trace, "trace");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f313512a = trace;
        this.f313513b = name;
    }

    @Override // kotlinx.atomicfu.m
    public void a(@NotNull Object event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f313512a.a(this.f313513b + '.' + event);
    }

    @Override // kotlinx.atomicfu.m
    public void b(@NotNull Object event1, @NotNull Object event2) {
        Intrinsics.checkNotNullParameter(event1, "event1");
        Intrinsics.checkNotNullParameter(event2, "event2");
        this.f313512a.b(this.f313513b + '.' + event1, this.f313513b + '.' + event2);
    }

    @Override // kotlinx.atomicfu.m
    public void c(@NotNull Object event1, @NotNull Object event2, @NotNull Object event3) {
        Intrinsics.checkNotNullParameter(event1, "event1");
        Intrinsics.checkNotNullParameter(event2, "event2");
        Intrinsics.checkNotNullParameter(event3, "event3");
        this.f313512a.c(this.f313513b + '.' + event1, this.f313513b + '.' + event2, this.f313513b + '.' + event3);
    }

    @Override // kotlinx.atomicfu.m
    public void d(@NotNull Object event1, @NotNull Object event2, @NotNull Object event3, @NotNull Object event4) {
        Intrinsics.checkNotNullParameter(event1, "event1");
        Intrinsics.checkNotNullParameter(event2, "event2");
        Intrinsics.checkNotNullParameter(event3, "event3");
        Intrinsics.checkNotNullParameter(event4, "event4");
        this.f313512a.d(this.f313513b + '.' + event1, this.f313513b + '.' + event2, this.f313513b + '.' + event3, this.f313513b + '.' + event4);
    }

    @NotNull
    public String toString() {
        return this.f313512a.toString();
    }
}
