package com.devtodev.analytics.internal.storage.sqlite;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class CurrencyAccrualResourcesEntry {

    @NotNull
    public static final CurrencyAccrualResourcesEntry INSTANCE = new CurrencyAccrualResourcesEntry();

    @NotNull
    public static final String amount = "amount";

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    public static final String f98059id = "_id";

    @NotNull
    public static final String name = "name";

    @NotNull
    public static final String source = "source";

    @NotNull
    public static final String tableName = "currencyAccrualResources";

    @NotNull
    public static final String timestamp = "timestamp";

    @NotNull
    public static final String type = "type";

    @NotNull
    public static final String userId = "userId";

    private CurrencyAccrualResourcesEntry() {
    }
}
