package com.devtodev.analytics.internal.storage.sqlite;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ReportEntry {

    @NotNull
    public static final ReportEntry INSTANCE = new ReportEntry();

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    public static final String f98069id = "_id";

    @NotNull
    public static final String packagesJson = "packagesJson";

    @NotNull
    public static final String tableName = "reports";

    @NotNull
    public static final String userId = "userId";

    @NotNull
    public static final String uuid = "uuid";

    private ReportEntry() {
    }
}
