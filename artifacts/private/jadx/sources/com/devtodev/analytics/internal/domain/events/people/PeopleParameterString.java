package com.devtodev.analytics.internal.domain.events.people;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class PeopleParameterString extends PeopleParameter {

    @NotNull
    private String value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeopleParameterString(@NotNull String value) {
        super(null);
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }

    public static /* synthetic */ PeopleParameterString copy$default(PeopleParameterString peopleParameterString, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = peopleParameterString.value;
        }
        return peopleParameterString.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.value;
    }

    @NotNull
    public final PeopleParameterString copy(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new PeopleParameterString(value);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PeopleParameterString) && Intrinsics.areEqual(this.value, ((PeopleParameterString) obj).value);
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public final void setValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.value = str;
    }

    @NotNull
    public String toString() {
        return "PeopleParameterString(value=" + this.value + ")";
    }
}
