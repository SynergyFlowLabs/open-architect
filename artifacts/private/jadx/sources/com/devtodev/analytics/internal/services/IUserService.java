package com.devtodev.analytics.internal.services;

import com.devtodev.analytics.internal.domain.User;
import com.devtodev.analytics.internal.domain.events.progressionEvent.Location;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface IUserService {
    void activateLocation(@NotNull Location location);

    void activateUser(@NotNull String str);

    boolean alwaysNeedRequest();

    void changeCurBalanceSentMark(boolean z10);

    void clearLocation(boolean z10);

    @Nullable
    String getActiveUserId();

    @NotNull
    List<User> getAllUsers();

    @Nullable
    List<String> getInProgressData();

    @NotNull
    List<User> getInactiveUsers();

    @Nullable
    Function0<Unit> getLevelIsChanged();

    @Nullable
    Location getLocation();

    @Nullable
    Function1<User, Unit> getUserIsChanged();

    int getUserLevel();

    @Nullable
    Function1<List<Long>, Unit> getUsersIdsForDelete();

    boolean hasDevToDevIds();

    boolean isBalanceSentForActiveUser();

    boolean isDefaultUser();

    boolean isTutorialStepMarked(int i10);

    void markTutorialStep(int i10);

    boolean needResetDevToDevIds();

    void removeInactiveUsersData(@NotNull List<User> list);

    void replaceUserId(@NotNull User user, @NotNull String str);

    void resourceAggregation(boolean z10);

    void setLevelIsChanged(@Nullable Function0<Unit> function0);

    void setUserIsChanged(@Nullable Function1<? super User, Unit> function1);

    void setUserLevel(int i10);

    void setUsersIdsForDelete(@Nullable Function1<? super List<Long>, Unit> function1);

    void turnOnIdsRequest();
}
