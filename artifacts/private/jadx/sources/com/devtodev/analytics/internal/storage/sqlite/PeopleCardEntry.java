package com.devtodev.analytics.internal.storage.sqlite;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class PeopleCardEntry {

    @NotNull
    public static final PeopleCardEntry INSTANCE = new PeopleCardEntry();

    @NotNull
    public static final String changedKeys = "changedKeys";

    @NotNull
    public static final String cleared = "cleared";

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    public static final String f98067id = "_id";

    @NotNull
    public static final String json = "json";

    @NotNull
    public static final String tableName = "peopleCards";

    @NotNull
    public static final String updated = "updated";

    @NotNull
    public static final String userId = "userId";

    private PeopleCardEntry() {
    }
}
