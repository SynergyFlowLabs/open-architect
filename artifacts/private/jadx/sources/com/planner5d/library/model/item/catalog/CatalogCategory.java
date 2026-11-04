package com.planner5d.library.model.item.catalog;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.utility.k3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
public final class CatalogCategory {
    public static final int $stable = 8;
    private final int icon;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f180760id;
    private final long parentId;

    @NotNull
    private final String path;

    @NotNull
    private final k3 title;

    public CatalogCategory(@NotNull k3 title, @Nullable String str, int i10, long j10, long j11) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.icon = i10;
        this.f180760id = j10;
        this.parentId = j11;
        this.path = str == null ? "" : str;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final long getId() {
        return this.f180760id;
    }

    public final long getParentId() {
        return this.parentId;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    @NotNull
    public final k3 getTitle() {
        return this.title;
    }
}
