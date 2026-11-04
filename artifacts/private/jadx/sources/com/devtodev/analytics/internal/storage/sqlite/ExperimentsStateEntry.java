package com.devtodev.analytics.internal.storage.sqlite;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ExperimentsStateEntry {

    @NotNull
    public static final ExperimentsStateEntry INSTANCE = new ExperimentsStateEntry();

    @NotNull
    public static final String experimentId = "experimentId";

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    public static final String f98063id = "_id";

    @NotNull
    public static final String involvement = "involvement";

    @NotNull
    public static final String runAbility = "runAbility";

    @NotNull
    public static final String tableName = "abTestExperimentsState";

    @NotNull
    public static final String userId = "userId";

    private ExperimentsStateEntry() {
    }
}
