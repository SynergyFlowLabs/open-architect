package tb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f376241a = new b();

    private b() {
    }

    @NotNull
    public final a a(@NotNull qb.a item) {
        Intrinsics.checkNotNullParameter(item, "item");
        com.planner5d.library.math.m position = item.getPosition();
        com.planner5d.library.math.m size = item.getSize();
        return new a(new com.planner5d.library.math.k(position.f180482a, position.f180483b), new com.planner5d.library.math.k(size.f180482a, size.f180483b));
    }
}
