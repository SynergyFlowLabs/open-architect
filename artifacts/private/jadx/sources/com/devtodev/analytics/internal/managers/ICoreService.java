package com.devtodev.analytics.internal.managers;

import com.devtodev.analytics.internal.domain.Project;
import com.devtodev.analytics.internal.domain.User;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pj.n;

/* JADX INFO: loaded from: classes3.dex */
public interface ICoreService {
    void checkUnityUserId(@NotNull String str, @NotNull Project project);

    @NotNull
    User createOrActivateDefaultUser(@NotNull String str, @NotNull Project project);

    @NotNull
    Project createOrActivateProject();

    @NotNull
    User createOrActivateUser(@NotNull String str, @NotNull Project project, boolean z10);

    @Nullable
    n<Long, Long, Long, Unit> getOnSdkConfigUpdate();

    @NotNull
    User replaceUserId(@NotNull User user, @NotNull String str);

    void resetBackendIdentifiers();

    void setOnSdkConfigUpdate(@Nullable n<? super Long, ? super Long, ? super Long, Unit> nVar);
}
