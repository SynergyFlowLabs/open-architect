package pb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.math.c f340835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f340836b;

    public a(@NotNull com.planner5d.library.math.c line, float f10) {
        Intrinsics.checkNotNullParameter(line, "line");
        this.f340835a = line;
        this.f340836b = f10;
    }

    public final float a() {
        return this.f340836b;
    }

    @NotNull
    public final com.planner5d.library.math.c b() {
        return this.f340835a;
    }
}
