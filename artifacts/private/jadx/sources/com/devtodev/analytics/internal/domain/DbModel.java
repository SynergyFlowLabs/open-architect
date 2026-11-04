package com.devtodev.analytics.internal.domain;

import com.devtodev.analytics.internal.storage.EventParam;
import com.devtodev.analytics.internal.storage.sqlite.SelectParameter;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DbModel {
    public abstract long getIdKey();

    @NotNull
    public abstract List<SelectParameter> getModelColumnsTypes();

    public abstract void setIdKey(long j10);

    @NotNull
    public abstract List<EventParam> toList();

    public abstract void updateData(@NotNull List<EventParam> list);

    public final void updateKey(long j10) {
        setIdKey(j10);
    }
}
