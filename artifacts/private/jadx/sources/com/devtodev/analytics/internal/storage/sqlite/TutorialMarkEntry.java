package com.devtodev.analytics.internal.storage.sqlite;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class TutorialMarkEntry {

    @NotNull
    public static final TutorialMarkEntry INSTANCE = new TutorialMarkEntry();

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    public static final String f98072id = "_id";

    @NotNull
    public static final String step = "step";

    @NotNull
    public static final String tableName = "tutorialMarkEntry";

    @NotNull
    public static final String userId = "userId";

    private TutorialMarkEntry() {
    }
}
