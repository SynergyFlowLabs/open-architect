package com.devtodev.analytics.internal.services;

import com.devtodev.analytics.internal.domain.User;
import com.devtodev.analytics.internal.domain.events.people.PeopleParameter;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface IPeopleService {

    public static final class DefaultImpls {
        public static /* synthetic */ Map getParameters$default(IPeopleService iPeopleService, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getParameters");
            }
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return iPeopleService.getParameters(z10);
        }
    }

    void clearChangedKeys();

    void clearCustomParams();

    void clearUser();

    void generatePeopleEvent(boolean z10);

    int getCustomKeyParamsCount();

    @Nullable
    Function0<Unit> getOnClearedCard();

    @Nullable
    Function0<Unit> getOnFilledCustomParams();

    @Nullable
    Function1<Boolean, Unit> getOnGeneratePeopleEvent();

    @NotNull
    Map<String, PeopleParameter> getParameters(boolean z10);

    @Nullable
    Function0<Unit> getPeopleCardIsChanged();

    void getValue(@NotNull String str, @NotNull Function1<? super PeopleParameter, Unit> function1);

    void increment(@NotNull String str, @NotNull PeopleParameter peopleParameter);

    boolean isNeedToClear();

    boolean isNeedToSend();

    void removeInactiveUsers(@NotNull List<User> list);

    void removeNulls();

    void sendPeopleCard();

    void setOnClearedCard(@Nullable Function0<Unit> function0);

    void setOnFilledCustomParams(@Nullable Function0<Unit> function0);

    void setOnGeneratePeopleEvent(@Nullable Function1<? super Boolean, Unit> function1);

    void setPeopleCardIsChanged(@Nullable Function0<Unit> function0);

    void setValue(@NotNull String str, @NotNull PeopleParameter peopleParameter);

    void unmarkCleared();

    void unmarkUpdated();

    void unset(@NotNull List<String> list);
}
