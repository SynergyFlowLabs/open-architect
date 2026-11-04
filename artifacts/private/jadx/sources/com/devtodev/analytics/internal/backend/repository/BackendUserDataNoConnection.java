package com.devtodev.analytics.internal.backend.repository;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class BackendUserDataNoConnection extends BackendUserData {

    @NotNull
    public static final BackendUserDataNoConnection INSTANCE = new BackendUserDataNoConnection();

    private BackendUserDataNoConnection() {
        super(null);
    }
}
