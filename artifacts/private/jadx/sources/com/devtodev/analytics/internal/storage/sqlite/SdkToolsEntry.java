package com.devtodev.analytics.internal.storage.sqlite;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class SdkToolsEntry {

    @NotNull
    public static final SdkToolsEntry INSTANCE = new SdkToolsEntry();

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    public static final String f98070id = "_id";

    @NotNull
    public static final String metadata = "metadata";

    @NotNull
    public static final String tableName = "sdkTools";

    private SdkToolsEntry() {
    }
}
