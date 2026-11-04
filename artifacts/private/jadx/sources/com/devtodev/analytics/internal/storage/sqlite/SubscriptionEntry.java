package com.devtodev.analytics.internal.storage.sqlite;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class SubscriptionEntry {

    @NotNull
    public static final SubscriptionEntry INSTANCE = new SubscriptionEntry();

    @NotNull
    public static final String alreadySendRestoreEvent = "alreadySendRestoreEvent";

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    public static final String f98071id = "_id";

    @NotNull
    public static final String projectId = "projectId";

    @NotNull
    public static final String tableName = "subscriptions";

    private SubscriptionEntry() {
    }
}
