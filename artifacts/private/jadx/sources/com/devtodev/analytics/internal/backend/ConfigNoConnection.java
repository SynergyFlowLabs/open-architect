package com.devtodev.analytics.internal.backend;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ConfigNoConnection extends BackendConfig {

    @NotNull
    public static final ConfigNoConnection INSTANCE = new ConfigNoConnection();

    private ConfigNoConnection() {
        super(null);
    }
}
