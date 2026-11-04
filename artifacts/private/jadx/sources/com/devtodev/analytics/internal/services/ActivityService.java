package com.devtodev.analytics.internal.services;

import com.devtodev.analytics.internal.domain.User;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.managers.IStateManager;
import com.devtodev.analytics.internal.storage.EventParam;
import com.devtodev.analytics.internal.storage.IRepository;
import com.devtodev.analytics.internal.storage.sqlite.SqlValue;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityService implements IActivityService {
    private boolean isActive;

    @NotNull
    private final IStateManager stateManager;

    @NotNull
    private final IRepository userRepository;

    public ActivityService(@NotNull IStateManager stateManager, @NotNull IRepository userRepository) {
        Intrinsics.checkNotNullParameter(stateManager, "stateManager");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.stateManager = stateManager;
        this.userRepository = userRepository;
    }

    private final boolean isNeedStartNewSession(long j10, Long l10, long j11) {
        return l10 == null || j10 - l10.longValue() > j11;
    }

    @Override // com.devtodev.analytics.internal.services.IActivityService
    @Nullable
    public Long getSessionId() {
        return this.stateManager.getActiveUser().getSessionId();
    }

    @Override // com.devtodev.analytics.internal.services.IActivityService
    public boolean isActive() {
        return this.isActive;
    }

    @Override // com.devtodev.analytics.internal.services.IActivityService
    public boolean isValidSession() {
        return !isNeedStartNewSession(System.currentTimeMillis(), this.stateManager.getActiveUser().getLastBackgroundTime(), this.stateManager.getActiveProject().getConfiguration().getSessionTimeout());
    }

    @Override // com.devtodev.analytics.internal.services.IActivityService
    public boolean startActivity() {
        if (isActive()) {
            Logger.debug$default(Logger.INSTANCE, "Activity has already started", null, 2, null);
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long sessionTimeout = this.stateManager.getActiveProject().getConfiguration().getSessionTimeout();
        User activeUser = this.stateManager.getActiveUser();
        activeUser.setLastForegroundTime(Long.valueOf(jCurrentTimeMillis));
        boolean zIsNeedStartNewSession = isNeedStartNewSession(jCurrentTimeMillis, activeUser.getLastBackgroundTime(), sessionTimeout);
        if (zIsNeedStartNewSession) {
            activeUser.setSessionId(Long.valueOf(jCurrentTimeMillis));
            activeUser.setLastBackgroundTime(Long.valueOf(jCurrentTimeMillis));
            this.userRepository.update(CollectionsKt.listOf(new EventParam("_id", new SqlValue.Long(activeUser.getIdKey()))), activeUser);
        }
        this.isActive = true;
        return zIsNeedStartNewSession;
    }

    @Override // com.devtodev.analytics.internal.services.IActivityService
    @Nullable
    public Long stopActivity() {
        if (!isActive()) {
            return null;
        }
        User activeUser = this.stateManager.getActiveUser();
        Long lastForegroundTime = activeUser.getLastForegroundTime();
        if (lastForegroundTime == null) {
            Logger.error$default(Logger.INSTANCE, "LastForegroundTime is lost!", null, 2, null);
            return null;
        }
        long jLongValue = lastForegroundTime.longValue();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jFloor = (long) Math.floor((jCurrentTimeMillis - jLongValue) / ((double) 1000));
        activeUser.setLastBackgroundTime(Long.valueOf(jCurrentTimeMillis));
        this.userRepository.update(CollectionsKt.listOf(new EventParam("_id", new SqlValue.Long(activeUser.getIdKey()))), activeUser);
        int i10 = 3 & 0;
        this.isActive = false;
        return Long.valueOf(jFloor);
    }

    @Override // com.devtodev.analytics.internal.services.IActivityService
    public void updateLastBackgroundTime() {
        if (isActive()) {
            User activeUser = this.stateManager.getActiveUser();
            activeUser.setLastBackgroundTime(Long.valueOf(System.currentTimeMillis()));
            this.userRepository.update(CollectionsKt.listOf(new EventParam("_id", new SqlValue.Long(activeUser.getIdKey()))), activeUser);
        }
    }
}
