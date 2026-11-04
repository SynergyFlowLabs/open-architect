package com.devtodev.analytics.internal.services;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface IActivityService {
    @Nullable
    Long getSessionId();

    boolean isActive();

    boolean isValidSession();

    boolean startActivity();

    @Nullable
    Long stopActivity();

    void updateLastBackgroundTime();
}
