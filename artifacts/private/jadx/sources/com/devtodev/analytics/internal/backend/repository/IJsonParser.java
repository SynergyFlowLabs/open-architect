package com.devtodev.analytics.internal.backend.repository;

import com.devtodev.analytics.internal.backend.BackendConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface IJsonParser {
    @NotNull
    AbTestOffer parseAbTestOffer(@NotNull String str);

    @NotNull
    BackendUserData parseBackendUserData(@NotNull String str);

    @NotNull
    BackendConfig parseConfig(@NotNull String str);

    @NotNull
    RemoteConfigSealedClass parseRemoteConfig(@NotNull String str);
}
