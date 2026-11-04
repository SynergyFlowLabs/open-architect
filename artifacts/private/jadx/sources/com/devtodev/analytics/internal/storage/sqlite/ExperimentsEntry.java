package com.devtodev.analytics.internal.storage.sqlite;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ExperimentsEntry {

    @NotNull
    public static final ExperimentsEntry INSTANCE = new ExperimentsEntry();

    @NotNull
    public static final String completionDate = "completionDate";

    @NotNull
    public static final String conditions = "conditions";

    @NotNull
    public static final String creationDate = "creationDate";

    @NotNull
    public static final String experimentId = "experimentId";

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    public static final String f98062id = "_id";

    @NotNull
    public static final String isTesting = "isTesting";

    @NotNull
    public static final String parameters = "parameters";

    @NotNull
    public static final String projectId = "projectId";

    @NotNull
    public static final String tableName = "abTestExperiments";

    @NotNull
    public static final String updateDate = "updateDate";

    private ExperimentsEntry() {
    }
}
