package com.devtodev.analytics.internal.domain.events.people;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class PeopleParameterEmpty extends PeopleParameter {

    @Nullable
    private Object value;

    /* JADX WARN: Illegal instructions before constructor call */
    public PeopleParameterEmpty() {
        DefaultConstructorMarker defaultConstructorMarker = null;
        this(defaultConstructorMarker, 1, defaultConstructorMarker);
    }

    public static /* synthetic */ PeopleParameterEmpty copy$default(PeopleParameterEmpty peopleParameterEmpty, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = peopleParameterEmpty.value;
        }
        return peopleParameterEmpty.copy(obj);
    }

    @Nullable
    public final Object component1() {
        return this.value;
    }

    @NotNull
    public final PeopleParameterEmpty copy(@Nullable Object obj) {
        return new PeopleParameterEmpty(obj);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PeopleParameterEmpty) && Intrinsics.areEqual(this.value, ((PeopleParameterEmpty) obj).value);
    }

    @Nullable
    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        Object obj = this.value;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final void setValue(@Nullable Object obj) {
        this.value = obj;
    }

    @NotNull
    public String toString() {
        return "PeopleParameterEmpty(value=" + this.value + ")";
    }

    public /* synthetic */ PeopleParameterEmpty(Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : obj);
    }

    public PeopleParameterEmpty(@Nullable Object obj) {
        super(null);
        this.value = obj;
    }
}
