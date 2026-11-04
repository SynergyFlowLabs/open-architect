package com.planner5d.library.activity.fragment.feed;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class a extends com.planner5d.library.activity.fragment.projects.g.a implements yc.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f133182f = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull com.planner5d.library.activity.fragment.projects.g.a task) {
        super(task.c(), task.d(), task.a(), task.b());
        Intrinsics.checkNotNullParameter(task, "task");
    }

    @Override // yc.b
    public boolean equals(@Nullable Object obj) {
        return (obj instanceof com.planner5d.library.activity.fragment.projects.g.a) && ((com.planner5d.library.activity.fragment.projects.g.a) obj).c() == c();
    }

    @Override // yc.b
    public boolean n(@Nullable Object obj) {
        return equals(obj);
    }
}
