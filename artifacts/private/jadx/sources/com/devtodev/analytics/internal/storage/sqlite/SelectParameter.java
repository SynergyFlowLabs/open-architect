package com.devtodev.analytics.internal.storage.sqlite;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class SelectParameter {

    @NotNull
    private final String columnName;

    @NotNull
    private final ColumnType columnType;

    public SelectParameter(@NotNull String columnName, @NotNull ColumnType columnType) {
        Intrinsics.checkNotNullParameter(columnName, "columnName");
        Intrinsics.checkNotNullParameter(columnType, "columnType");
        this.columnName = columnName;
        this.columnType = columnType;
    }

    public static /* synthetic */ SelectParameter copy$default(SelectParameter selectParameter, String str, ColumnType columnType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = selectParameter.columnName;
        }
        if ((i10 & 2) != 0) {
            columnType = selectParameter.columnType;
        }
        return selectParameter.copy(str, columnType);
    }

    @NotNull
    public final String component1() {
        return this.columnName;
    }

    @NotNull
    public final ColumnType component2() {
        return this.columnType;
    }

    @NotNull
    public final SelectParameter copy(@NotNull String columnName, @NotNull ColumnType columnType) {
        Intrinsics.checkNotNullParameter(columnName, "columnName");
        Intrinsics.checkNotNullParameter(columnType, "columnType");
        return new SelectParameter(columnName, columnType);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectParameter)) {
            return false;
        }
        SelectParameter selectParameter = (SelectParameter) obj;
        return Intrinsics.areEqual(this.columnName, selectParameter.columnName) && Intrinsics.areEqual(this.columnType, selectParameter.columnType);
    }

    @NotNull
    public final String getColumnName() {
        return this.columnName;
    }

    @NotNull
    public final ColumnType getColumnType() {
        return this.columnType;
    }

    public int hashCode() {
        return this.columnType.hashCode() + (this.columnName.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "SelectParameter(columnName=" + this.columnName + ", columnType=" + this.columnType + ")";
    }
}
