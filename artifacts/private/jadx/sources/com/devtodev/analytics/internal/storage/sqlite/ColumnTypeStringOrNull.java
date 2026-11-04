package com.devtodev.analytics.internal.storage.sqlite;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ColumnTypeStringOrNull extends ColumnType {

    @NotNull
    public static final ColumnTypeStringOrNull INSTANCE = new ColumnTypeStringOrNull();

    private ColumnTypeStringOrNull() {
        super(null);
    }
}
