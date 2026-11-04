package com.devtodev.analytics.internal.storage.sqlite;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ColumnTypeDoubleOrNull extends ColumnType {

    @NotNull
    public static final ColumnTypeDoubleOrNull INSTANCE = new ColumnTypeDoubleOrNull();

    private ColumnTypeDoubleOrNull() {
        super(null);
    }
}
