package com.devtodev.analytics.internal.modues.people;

import com.devtodev.analytics.internal.domain.events.people.PeopleParameter;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface IPeopleLogicProxy {
    void clearUser(@NotNull String str);

    void getValue(@NotNull String str, @NotNull String str2, @NotNull Function1<? super PeopleParameter, Unit> function1);

    void increment(@NotNull String str, @NotNull String str2, @NotNull PeopleParameter peopleParameter);

    void initialize(@NotNull IPeopleLogic iPeopleLogic);

    void setReservedValue(@NotNull String str, @NotNull String str2, @NotNull PeopleParameter peopleParameter);

    void setValue(@NotNull String str, @NotNull String str2, @NotNull PeopleParameter peopleParameter);

    void unset(@NotNull String str, @NotNull List<String> list);
}
