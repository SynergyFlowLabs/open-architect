package com.devtodev.analytics.internal.services;

import com.devtodev.analytics.internal.domain.DbModel;
import com.devtodev.analytics.internal.domain.DeviceIdentifiers;
import com.devtodev.analytics.internal.domain.User;
import com.devtodev.analytics.internal.domain.events.progressionEvent.Location;
import com.devtodev.analytics.internal.domain.events.tutorial.TutorialMark;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.managers.IStateManager;
import com.devtodev.analytics.internal.storage.EventParam;
import com.devtodev.analytics.internal.storage.IRepository;
import com.devtodev.analytics.internal.storage.sqlite.RemoverPattern;
import com.devtodev.analytics.internal.storage.sqlite.SqlValue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nUserService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserService.kt\ncom/devtodev/analytics/internal/services/UserService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,196:1\n1747#2,3:197\n*S KotlinDebug\n*F\n+ 1 UserService.kt\ncom/devtodev/analytics/internal/services/UserService\n*L\n157#1:197,3\n*E\n"})
public final class UserService implements IUserService {
    private boolean alwaysNeedRequestFlag;

    @Nullable
    private Function0<Unit> levelIsChanged;

    @Nullable
    private Location location;

    @NotNull
    private final IStateManager stateManager;

    @NotNull
    private final IRepository tutorialRepository;

    @Nullable
    private Function1<? super User, Unit> userIsChanged;

    @NotNull
    private final IRepository userRepository;

    @Nullable
    private Function1<? super List<Long>, Unit> usersIdsForDelete;

    public UserService(@NotNull IStateManager stateManager, @NotNull IRepository userRepository, @NotNull IRepository tutorialRepository) {
        Intrinsics.checkNotNullParameter(stateManager, "stateManager");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(tutorialRepository, "tutorialRepository");
        this.stateManager = stateManager;
        this.userRepository = userRepository;
        this.tutorialRepository = tutorialRepository;
    }

    private final TutorialMark createMark(int i10) {
        return new TutorialMark(0L, this.stateManager.getActiveUser().getIdKey(), i10, 1, null);
    }

    @Override // com.devtodev.analytics.internal.services.IUserService
    public void activateLocation(@NotNull Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        Logger.info$default(Logger.INSTANCE, "Activated ProgressionEvent: [" + location.getName() + "]", null, 2, null);
        this.location = location;
    }

    @Override // com.devtodev.analytics.internal.services.IUserService
    public void activateUser(@NotNull String userId) {
        Function1<User, Unit> userIsChanged;
        Intrinsics.checkNotNullParameter(userId, "userId");
        User activeUser = this.stateManager.getActiveUser();
        this.stateManager.activateUser(userId);
        if (activeUser.getIdKey() == this.stateManager.getActiveUser().getIdKey() || (userIsChanged = getUserIsChanged()) == null) {
            return;
        }
        userIsChanged.invoke(activeUser);
    }

    @Override // com.devtodev.analytics.internal.services.IUserService
    public boolean alwaysNeedRequest() {
        return this.alwaysNeedRequestFlag;
    }

    @Override // com.devtodev.analytics.internal.services.IUserService
    public void changeCurBalanceSentMark(boolean z10) {
        this.stateManager.getActiveUser().setBalanceIsSent(z10);
    }

    @Override // com.devtodev.analytics.internal.services.IUserService
    public void clearLocation(boolean z10) {
        Location location = this.location;
        if (location != null && z10) {
            Logger.warning$default(Logger.INSTANCE, "The location: " + location.getName() + " has been canceled", null, 2, null);
        }
        this.location = null;
    }

    @Override // com.devtodev.analytics.internal.services.IUserService
    @Nullable
    public String getActiveUserId() {
        return this.stateManager.getActiveUser().getUserId();
    }

    @Override // com.devtodev.analytics.internal.services.IUserService
    @NotNull
    public List<User> getAllUsers() {
        return this.stateManager.getAllUsers();
    }

    @Override // com.devtodev.analytics.internal.services.IUserService
    @Nullable
    public List<String> getInProgressData() {
        Location location = getLocation();
        if (location != null) {
            return CollectionsKt.listOf(location.getName());
        }
        return null;
    }

    @Override // com.devtodev.analytics.internal.services.IUserService
    @NotNull
    public List<User> getInactiveUsers() {
        return this.stateManager.getInactiveUser();
    }

    @Override // com.devtodev.analytics.internal.services.IUserService
    @Nullable
    public Function0<Unit> getLevelIsChanged() {
        return this.levelIsChanged;
    }

    @Override // com.devtodev.analytics.internal.services.IUserService
    @Nullable
    public Location getLocation() {
        return this.location;
    }

    @Override // com.devtodev.analytics.internal.services.IUserService
    @Nullable
    public Function1<User, Unit> getUserIsChanged() {
        return this.userIsChanged;
    }

    @Override // com.devtodev.analytics.internal.services.IUserService
    public int getUserLevel() {
        return this.stateManager.getActiveUser().getLevel();
    }

    @Override // com.devtodev.analytics.internal.services.IUserService
    @Nullable
    public Function1<List<Long>, Unit> getUsersIdsForDelete() {
        return this.usersIdsForDelete;
    }

    @Override // com.devtodev.analytics.internal.services.IUserService
    public boolean hasDevToDevIds() {
        DeviceIdentifiers activeDeviceIdentifiers = this.stateManager.getActiveDeviceIdentifiers();
        return (activeDeviceIdentifiers.getDevtodevId() == null || activeDeviceIdentifiers.getDevtodevIdTimestamp() == null || !activeDeviceIdentifiers.isValid()) ? false : true;
    }

    @Override // com.devtodev.analytics.internal.services.IUserService
    public boolean isBalanceSentForActiveUser() {
        return this.stateManager.getActiveUser().getBalanceIsSent();
    }

    @Override // com.devtodev.analytics.internal.services.IUserService
    public boolean isDefaultUser() {
        return this.stateManager.getActiveUser().isDefaultUser();
    }

    @Override // com.devtodev.analytics.internal.services.IUserService
    public boolean isTutorialStepMarked(int i10) {
        TutorialMark tutorialMarkCreateMark = createMark(i10);
        List<DbModel> all = this.tutorialRepository.getAll(TutorialMark.Companion.getColumnsTypes());
        Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.events.tutorial.TutorialMark>");
        if ((all instanceof Collection) && all.isEmpty()) {
            return false;
        }
        Iterator<T> it = all.iterator();
        while (it.hasNext()) {
            TutorialMark tutorialMark = (TutorialMark) it.next();
            if (tutorialMark.getUserId() == tutorialMarkCreateMark.getUserId() && tutorialMark.getStep() == tutorialMarkCreateMark.getStep()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.devtodev.analytics.internal.services.IUserService
    public void markTutorialStep(int i10) {
        if (isTutorialStepMarked(i10)) {
            return;
        }
        this.tutorialRepository.insert(createMark(i10));
        Logger.info$default(Logger.INSTANCE, "The tutorial step [" + i10 + "] is saved", null, 2, null);
    }

    @Override // com.devtodev.analytics.internal.services.IUserService
    public boolean needResetDevToDevIds() {
        Long devtodevIdTimestamp = this.stateManager.getActiveDeviceIdentifiers().getDevtodevIdTimestamp();
        if (devtodevIdTimestamp != null) {
            return Math.abs(System.currentTimeMillis() - devtodevIdTimestamp.longValue()) >= this.stateManager.getActiveProject().getConfiguration().getDevtodevIdTimeout();
        }
        return true;
    }

    @Override // com.devtodev.analytics.internal.services.IUserService
    public void removeInactiveUsersData(@NotNull List<User> users) {
        Intrinsics.checkNotNullParameter(users, "users");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (User user : users) {
            arrayList2.add(Long.valueOf(user.getIdKey()));
            arrayList.add(new EventParam("_id", new SqlValue.Long(user.getIdKey())));
        }
        if (arrayList.size() != 0) {
            this.userRepository.delete(users, arrayList, RemoverPattern.JEST_ONE);
        }
        Function1<List<Long>, Unit> usersIdsForDelete = getUsersIdsForDelete();
        if (usersIdsForDelete != null) {
            usersIdsForDelete.invoke(arrayList2);
        }
    }

    @Override // com.devtodev.analytics.internal.services.IUserService
    public void replaceUserId(@NotNull User user, @NotNull String userId) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.stateManager.replaceUserId(user, userId);
    }

    @Override // com.devtodev.analytics.internal.services.IUserService
    public void resourceAggregation(boolean z10) {
        User activeUser = this.stateManager.getActiveUser();
        activeUser.setResourceAggregationEnable(z10);
        this.userRepository.update(CollectionsKt.listOf(new EventParam("_id", new SqlValue.Long(activeUser.getIdKey()))), activeUser);
        Logger.debug$default(Logger.INSTANCE, "Resource aggregation is " + (z10 ? "Enable" : "Disable"), null, 2, null);
    }

    @Override // com.devtodev.analytics.internal.services.IUserService
    public void setLevelIsChanged(@Nullable Function0<Unit> function0) {
        this.levelIsChanged = function0;
    }

    @Override // com.devtodev.analytics.internal.services.IUserService
    public void setUserIsChanged(@Nullable Function1<? super User, Unit> function1) {
        this.userIsChanged = function1;
    }

    @Override // com.devtodev.analytics.internal.services.IUserService
    public void setUserLevel(int i10) {
        User activeUser = this.stateManager.getActiveUser();
        activeUser.setLevel(i10);
        this.userRepository.update(CollectionsKt.listOf(new EventParam("_id", new SqlValue.Long(activeUser.getIdKey()))), activeUser);
        Function0<Unit> levelIsChanged = getLevelIsChanged();
        if (levelIsChanged != null) {
            levelIsChanged.invoke();
        }
    }

    @Override // com.devtodev.analytics.internal.services.IUserService
    public void setUsersIdsForDelete(@Nullable Function1<? super List<Long>, Unit> function1) {
        this.usersIdsForDelete = function1;
    }

    @Override // com.devtodev.analytics.internal.services.IUserService
    public void turnOnIdsRequest() {
        this.alwaysNeedRequestFlag = true;
    }
}
