package com.devtodev.analytics.internal.storage.sqlite;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class LevelResourceEntry {

    @NotNull
    public static final LevelResourceEntry INSTANCE = new LevelResourceEntry();

    @NotNull
    public static final String amount = "amount";

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    public static final String f98065id = "_id";

    @NotNull
    public static final String name = "name";

    @NotNull
    public static final String tableName = "levelResource";

    @NotNull
    public static final String type = "type";

    @NotNull
    public static final String userId = "userId";

    private LevelResourceEntry() {
    }
}
