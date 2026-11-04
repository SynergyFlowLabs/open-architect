package com.devtodev.analytics.internal.domain.events.people;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class PeopleParameterLong extends PeopleParameter {
    private long value;

    public PeopleParameterLong(long j10) {
        super(null);
        this.value = j10;
    }

    public static /* synthetic */ PeopleParameterLong copy$default(PeopleParameterLong peopleParameterLong, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = peopleParameterLong.value;
        }
        return peopleParameterLong.copy(j10);
    }

    public final long component1() {
        return this.value;
    }

    @NotNull
    public final PeopleParameterLong copy(long j10) {
        return new PeopleParameterLong(j10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PeopleParameterLong) && this.value == ((PeopleParameterLong) obj).value;
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return Long.hashCode(this.value);
    }

    public final void setValue(long j10) {
        this.value = j10;
    }

    @NotNull
    public String toString() {
        return "PeopleParameterLong(value=" + this.value + ")";
    }
}
