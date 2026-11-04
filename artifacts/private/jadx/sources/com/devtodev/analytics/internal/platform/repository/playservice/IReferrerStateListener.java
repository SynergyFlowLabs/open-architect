package com.devtodev.analytics.internal.platform.repository.playservice;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface IReferrerStateListener {
    void onReferrerState(@NotNull ReferrerState referrerState);

    void onReferrerStateClose(@NotNull ReferrerState referrerState);
}
