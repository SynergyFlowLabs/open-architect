package com.devtodev.analytics.internal.storage.sqlite;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class UserEntry {

    @NotNull
    public static final UserEntry INSTANCE = new UserEntry();

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    public static final String f98073id = "_id";

    @NotNull
    public static final String isDefaultUser = "isDefaultUser";

    @NotNull
    public static final String isResourceAggregationEnable = "isResourceAggregationEnable";

    @NotNull
    public static final String lastBackgroundTime = "lastBackgroundTime";

    @NotNull
    public static final String lastForegroundTime = "lastForegroundTime";

    @NotNull
    public static final String level = "level";

    @NotNull
    public static final String previousUserId = "previousUserId";

    @NotNull
    public static final String projectId = "projectId";

    @NotNull
    public static final String sessionId = "sessionId";

    @NotNull
    public static final String tableName = "users";

    @NotNull
    public static final String userId = "userId";

    private UserEntry() {
    }
}
