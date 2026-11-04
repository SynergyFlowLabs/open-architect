package com.devtodev.analytics.internal.storage.sqlite;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AutoPurchasesMarkEntry {

    @NotNull
    public static final AutoPurchasesMarkEntry INSTANCE = new AutoPurchasesMarkEntry();

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    public static final String f98058id = "_id";

    @NotNull
    public static final String orderId = "orderId";

    @NotNull
    public static final String projectId = "projectId";

    @NotNull
    public static final String tableName = "autoPurchasesMarks";

    private AutoPurchasesMarkEntry() {
    }
}
