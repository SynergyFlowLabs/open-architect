package com.planner5d.library.widget.editor.helper;

import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.item.ItemProject;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class t3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f256773c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Project f256774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final ItemProject f256775b;

    public t3(@Nullable Project project, @Nullable ItemProject itemProject) {
        this.f256774a = project;
        this.f256775b = itemProject;
    }

    @Nullable
    public final ItemProject a() {
        return this.f256775b;
    }

    @Nullable
    public final Project b() {
        return this.f256774a;
    }
}
