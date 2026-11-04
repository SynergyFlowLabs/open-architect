package com.devtodev.analytics.internal.domain.events.people;

import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class PeopleParameterKt {
    @Nullable
    public static final Object getValue(@NotNull PeopleParameter peopleParameter) {
        Intrinsics.checkNotNullParameter(peopleParameter, "<this>");
        if (peopleParameter instanceof PeopleParameterString) {
            return ((PeopleParameterString) peopleParameter).getValue();
        }
        if (peopleParameter instanceof PeopleParameterBoolean) {
            return Boolean.valueOf(((PeopleParameterBoolean) peopleParameter).getValue());
        }
        if (peopleParameter instanceof PeopleParameterLong) {
            return Long.valueOf(((PeopleParameterLong) peopleParameter).getValue());
        }
        if (peopleParameter instanceof PeopleParameterDouble) {
            return Double.valueOf(((PeopleParameterDouble) peopleParameter).getValue());
        }
        if (peopleParameter instanceof PeopleParameterEmpty) {
            return null;
        }
        throw new k0();
    }

    @NotNull
    public static final PeopleParameterDouble toDouble(@NotNull PeopleParameter peopleParameter) {
        Intrinsics.checkNotNullParameter(peopleParameter, "<this>");
        if (peopleParameter instanceof PeopleParameterDouble) {
            return new PeopleParameterDouble(((PeopleParameterDouble) peopleParameter).getValue());
        }
        return peopleParameter instanceof PeopleParameterLong ? new PeopleParameterDouble(((PeopleParameterLong) peopleParameter).getValue()) : new PeopleParameterDouble(0.0d);
    }

    @NotNull
    public static final PeopleParameterLong toLong(@NotNull PeopleParameter peopleParameter) {
        Intrinsics.checkNotNullParameter(peopleParameter, "<this>");
        if (peopleParameter instanceof PeopleParameterDouble) {
            return new PeopleParameterLong((long) ((PeopleParameterDouble) peopleParameter).getValue());
        }
        return peopleParameter instanceof PeopleParameterLong ? new PeopleParameterLong(((PeopleParameterLong) peopleParameter).getValue()) : new PeopleParameterLong(0L);
    }
}
