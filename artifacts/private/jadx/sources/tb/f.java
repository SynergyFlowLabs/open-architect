package tb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.math.k f376247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.math.k f376248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final g f376249c;

    public f(@NotNull com.planner5d.library.math.k start, @NotNull com.planner5d.library.math.k end, @Nullable g gVar) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        this.f376247a = start;
        this.f376248b = end;
        this.f376249c = gVar;
    }

    @NotNull
    public final com.planner5d.library.math.k a() {
        return this.f376248b;
    }

    @NotNull
    public final com.planner5d.library.math.k b() {
        return this.f376247a;
    }

    @Override // tb.n
    @Nullable
    public g c() {
        return this.f376249c;
    }
}
