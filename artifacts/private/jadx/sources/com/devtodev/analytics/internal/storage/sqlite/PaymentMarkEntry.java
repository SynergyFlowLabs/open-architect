package com.devtodev.analytics.internal.storage.sqlite;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class PaymentMarkEntry {

    @NotNull
    public static final PaymentMarkEntry INSTANCE = new PaymentMarkEntry();

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    public static final String f98066id = "_id";

    @NotNull
    public static final String orderId = "orderId";

    @NotNull
    public static final String projectId = "projectId";

    @NotNull
    public static final String tableName = "paymentMarks";

    private PaymentMarkEntry() {
    }
}
