package com.devtodev.analytics.internal.modues.people;

import com.devtodev.analytics.internal.domain.events.people.PeopleParameter;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface IPeopleLogic {
    void clearUser();

    void getValue(@NotNull String str, @NotNull Function1<? super PeopleParameter, Unit> function1);

    void increment(@NotNull String str, @NotNull PeopleParameter peopleParameter);

    void prepareCallBacks();

    void setValue(@NotNull String str, @NotNull PeopleParameter peopleParameter);

    void unset(@NotNull List<String> list);
}
