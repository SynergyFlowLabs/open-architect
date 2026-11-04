package com.devtodev.analytics.internal.storage.sqlite;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class EventEntry {

    @NotNull
    public static final EventEntry INSTANCE = new EventEntry();

    @NotNull
    public static final String code = "code";

    @NotNull
    public static final String eventJson = "eventJson";

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    public static final String f98061id = "_id";

    @NotNull
    public static final String tableName = "events";

    @NotNull
    public static final String userId = "userId";

    private EventEntry() {
    }
}
