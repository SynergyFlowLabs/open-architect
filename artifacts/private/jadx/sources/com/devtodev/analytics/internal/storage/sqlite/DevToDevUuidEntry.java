package com.devtodev.analytics.internal.storage.sqlite;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class DevToDevUuidEntry {

    @NotNull
    public static final DevToDevUuidEntry INSTANCE = new DevToDevUuidEntry();

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    public static final String f98060id = "_id";

    @NotNull
    public static final String tableName = "devToDevUuid";

    @NotNull
    public static final String uuid = "uuid";

    private DevToDevUuidEntry() {
    }
}
