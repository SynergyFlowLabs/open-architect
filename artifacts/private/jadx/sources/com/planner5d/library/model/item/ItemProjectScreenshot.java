package com.planner5d.library.model.item;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
public final class ItemProjectScreenshot {
    public static final int $stable = 8;
    private final boolean from3d;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f180757id;

    @Nullable
    private final Integer taskId;

    @NotNull
    private final String url;

    public ItemProjectScreenshot(int i10, @NotNull String url, boolean z10, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f180757id = i10;
        this.url = url;
        this.from3d = z10;
        this.taskId = num;
    }

    public final boolean getFrom3d() {
        return this.from3d;
    }

    public final int getId() {
        return this.f180757id;
    }

    @Nullable
    public final Integer getTaskId() {
        return this.taskId;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final void setId(int i10) {
        this.f180757id = i10;
    }
}
