package com.devtodev.analytics.internal.domain.events.people;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class PeopleParameterBoolean extends PeopleParameter {
    private boolean value;

    public PeopleParameterBoolean(boolean z10) {
        super(null);
        this.value = z10;
    }

    public static /* synthetic */ PeopleParameterBoolean copy$default(PeopleParameterBoolean peopleParameterBoolean, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = peopleParameterBoolean.value;
        }
        return peopleParameterBoolean.copy(z10);
    }

    public final boolean component1() {
        return this.value;
    }

    @NotNull
    public final PeopleParameterBoolean copy(boolean z10) {
        return new PeopleParameterBoolean(z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PeopleParameterBoolean) && this.value == ((PeopleParameterBoolean) obj).value;
    }

    public final boolean getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        boolean z10 = this.value;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return r10;
    }

    public final void setValue(boolean z10) {
        this.value = z10;
    }

    @NotNull
    public String toString() {
        return "PeopleParameterBoolean(value=" + this.value + ")";
    }
}
