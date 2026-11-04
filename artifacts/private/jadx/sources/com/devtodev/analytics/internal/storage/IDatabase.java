package com.devtodev.analytics.internal.storage;

import com.devtodev.analytics.internal.storage.sqlite.RemoverPattern;
import com.devtodev.analytics.internal.storage.sqlite.SelectParameter;
import com.devtodev.analytics.internal.storage.sqlite.SelectRecords;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface IDatabase {
    int delete(@NotNull String str, @NotNull List<EventParam> list, @NotNull RemoverPattern removerPattern);

    int deleteByUser(@NotNull String str, @NotNull String str2, @NotNull List<Long> list);

    long insert(@NotNull String str, @NotNull List<EventParam> list);

    @NotNull
    List<SelectRecords> select(@NotNull String str, @NotNull List<SelectParameter> list, @NotNull List<EventParam> list2);

    @Nullable
    Integer update(@NotNull String str, @NotNull List<EventParam> list, @NotNull List<EventParam> list2);
}
