package com.devtodev.analytics.internal.storage;

import com.devtodev.analytics.internal.storage.sqlite.SqlValue;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class EventParam {

    @NotNull
    private final String name;

    @NotNull
    private SqlValue value;

    public EventParam(@NotNull String name, @NotNull SqlValue value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.name = name;
        this.value = value;
    }

    public static /* synthetic */ EventParam copy$default(EventParam eventParam, String str, SqlValue sqlValue, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = eventParam.name;
        }
        if ((i10 & 2) != 0) {
            sqlValue = eventParam.value;
        }
        return eventParam.copy(str, sqlValue);
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    @NotNull
    public final SqlValue component2() {
        return this.value;
    }

    @NotNull
    public final EventParam copy(@NotNull String name, @NotNull SqlValue value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return new EventParam(name, value);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventParam)) {
            return false;
        }
        EventParam eventParam = (EventParam) obj;
        return Intrinsics.areEqual(this.name, eventParam.name) && Intrinsics.areEqual(this.value, eventParam.value);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final SqlValue getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.name.hashCode() * 31);
    }

    public final void setValue(@NotNull SqlValue sqlValue) {
        Intrinsics.checkNotNullParameter(sqlValue, "<set-?>");
        this.value = sqlValue;
    }

    @NotNull
    public String toString() {
        return "EventParam(name=" + this.name + ", value=" + this.value + ")";
    }
}
