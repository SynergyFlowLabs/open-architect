package com.devtodev.analytics.internal.storage;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface IResourceRepository extends IRepository {
    int deleteByUser(@NotNull String str, @NotNull String str2, @NotNull List<Long> list);
}
