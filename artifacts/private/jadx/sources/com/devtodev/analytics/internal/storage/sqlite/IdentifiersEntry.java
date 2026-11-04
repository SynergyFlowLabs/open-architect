package com.devtodev.analytics.internal.storage.sqlite;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class IdentifiersEntry {

    @NotNull
    public static final IdentifiersEntry INSTANCE = new IdentifiersEntry();

    @NotNull
    public static final String crossPlatformDevtodevId = "crossPlatformDevtodevId";

    @NotNull
    public static final String deviceIdentifier = "deviceIdentifier";

    @NotNull
    public static final String devtodevId = "devtodevId";

    @NotNull
    public static final String devtodevIdTimestamp = "devtodevIdTimestamp";

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    public static final String f98064id = "_id";

    @NotNull
    public static final String isValid = "isValid";

    @NotNull
    public static final String previousDeviceIdentifier = "previousDeviceIdentifier";

    @NotNull
    public static final String projectId = "projectId";

    @NotNull
    public static final String tableName = "deviceIdentifiers";

    @NotNull
    public static final String uuid = "uuid";

    private IdentifiersEntry() {
    }
}
