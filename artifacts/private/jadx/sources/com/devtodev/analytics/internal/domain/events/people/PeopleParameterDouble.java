package com.devtodev.analytics.internal.domain.events.people;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class PeopleParameterDouble extends PeopleParameter {
    private double value;

    public PeopleParameterDouble(double d10) {
        super(null);
        this.value = d10;
    }

    public static /* synthetic */ PeopleParameterDouble copy$default(PeopleParameterDouble peopleParameterDouble, double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = peopleParameterDouble.value;
        }
        return peopleParameterDouble.copy(d10);
    }

    public final double component1() {
        return this.value;
    }

    @NotNull
    public final PeopleParameterDouble copy(double d10) {
        return new PeopleParameterDouble(d10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PeopleParameterDouble) && Double.compare(this.value, ((PeopleParameterDouble) obj).value) == 0;
    }

    public final double getValue() {
        return this.value;
    }

    public int hashCode() {
        return Double.hashCode(this.value);
    }

    public final void setValue(double d10) {
        this.value = d10;
    }

    @NotNull
    public String toString() {
        return "PeopleParameterDouble(value=" + this.value + ")";
    }
}
