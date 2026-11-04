package com.devtodev.analytics.internal.storage.sqlite;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ProjectEntry {

    @NotNull
    public static final ProjectEntry INSTANCE = new ProjectEntry();

    @NotNull
    public static final String activeUserId = "activeUserId";

    @NotNull
    public static final String applicationBuildVersion = "applicationBuildVersion";

    @NotNull
    public static final String applicationBundle = "applicationBundle";

    @NotNull
    public static final String applicationKey = "applicationKey";

    @NotNull
    public static final String applicationVersion = "applicationVersion";

    @NotNull
    public static final String categoriesVersion = "categoriesVersion";

    @NotNull
    public static final String configuration = "configuration";

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    public static final String f98068id = "_id";

    @NotNull
    public static final String isMigrated = "isMigrated";

    @NotNull
    public static final String isReferralSent = "isReferralSent";

    @NotNull
    public static final String savedTime = "savedTime";

    @NotNull
    public static final String tableName = "projects";

    @NotNull
    public static final String trackingAvailable = "trackingAvailable";

    private ProjectEntry() {
    }
}
