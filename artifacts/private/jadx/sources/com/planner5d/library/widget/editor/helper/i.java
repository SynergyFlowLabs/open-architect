package com.planner5d.library.widget.editor.helper;

import com.planner5d.library.database.model.project.Project;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f256427c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.c0 f256428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f256429b;

    public i(@NotNull com.planner5d.library.activity.fragment.c0 projectReloadingHelper) {
        Intrinsics.checkNotNullParameter(projectReloadingHelper, "projectReloadingHelper");
        this.f256428a = projectReloadingHelper;
        this.f256429b = new AtomicBoolean(false);
    }

    public final boolean a(@Nullable Project project) {
        if (project == null || !this.f256429b.getAndSet(false)) {
            return false;
        }
        this.f256428a.d(project);
        return true;
    }

    public final void b(@Nullable Project project) {
        if (project != null) {
            this.f256428a.d(project);
        } else {
            this.f256429b.set(true);
        }
    }

    public final void c(@NotNull j2.a projectLoaderListener) {
        Intrinsics.checkNotNullParameter(projectLoaderListener, "projectLoaderListener");
        projectLoaderListener.I(new OutOfMemoryError(), false);
    }
}
