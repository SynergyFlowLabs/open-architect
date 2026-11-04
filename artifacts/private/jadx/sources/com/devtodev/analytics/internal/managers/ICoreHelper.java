package com.devtodev.analytics.internal.managers;

import com.devtodev.analytics.internal.domain.Project;
import com.devtodev.analytics.internal.domain.User;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface ICoreHelper {
    @NotNull
    User activateUser(@NotNull User user, @NotNull Project project);

    @NotNull
    User defineActiveUser();

    @NotNull
    User defineDefaultUser();
}
