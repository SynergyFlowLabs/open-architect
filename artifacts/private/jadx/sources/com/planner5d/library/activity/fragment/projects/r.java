package com.planner5d.library.activity.fragment.projects;

import com.planner5d.library.model.manager.statistics.events.b4;
import com.planner5d.library.model.manager.statistics.events.x3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f135087c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final x3.e f135088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final b4.c f135089b;

    /* JADX WARN: Multi-variable type inference failed */
    public r() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @NotNull
    public final x3.e a() {
        return this.f135088a;
    }

    @NotNull
    public final b4.c b() {
        return this.f135089b;
    }

    public r(@NotNull x3.e sourceProject, @NotNull b4.c sourceSnapshot) {
        Intrinsics.checkNotNullParameter(sourceProject, "sourceProject");
        Intrinsics.checkNotNullParameter(sourceSnapshot, "sourceSnapshot");
        this.f135088a = sourceProject;
        this.f135089b = sourceSnapshot;
    }

    public /* synthetic */ r(x3.e eVar, b4.c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? x3.e.other : eVar, (i10 & 2) != 0 ? b4.c.other : cVar);
    }
}
