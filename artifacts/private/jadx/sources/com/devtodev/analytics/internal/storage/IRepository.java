package com.devtodev.analytics.internal.storage;

import com.devtodev.analytics.internal.domain.DbModel;
import com.devtodev.analytics.internal.storage.sqlite.RemoverPattern;
import com.devtodev.analytics.internal.storage.sqlite.SelectParameter;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface IRepository {
    @Nullable
    Integer delete(@NotNull List<? extends DbModel> list, @NotNull List<EventParam> list2, @NotNull RemoverPattern removerPattern);

    void deleteAll();

    @NotNull
    List<DbModel> getAll(@NotNull List<SelectParameter> list);

    void insert(@NotNull DbModel dbModel);

    @Nullable
    Integer update(@NotNull List<EventParam> list, @NotNull DbModel dbModel);
}
