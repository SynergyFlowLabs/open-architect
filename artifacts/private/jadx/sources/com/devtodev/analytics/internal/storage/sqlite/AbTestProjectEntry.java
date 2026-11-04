package com.devtodev.analytics.internal.storage.sqlite;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AbTestProjectEntry {

    @NotNull
    public static final AbTestProjectEntry INSTANCE = new AbTestProjectEntry();

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    public static final String f98057id = "_id";

    @NotNull
    public static final String projectId = "projectId";

    @NotNull
    public static final String tableName = "abTestProject";

    @NotNull
    public static final String userProperties = "userProperties";

    @NotNull
    public static final String version = "version";

    private AbTestProjectEntry() {
    }
}
