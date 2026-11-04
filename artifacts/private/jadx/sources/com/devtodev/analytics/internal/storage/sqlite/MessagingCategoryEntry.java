package com.devtodev.analytics.internal.storage.sqlite;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class MessagingCategoryEntry {

    @NotNull
    public static final MessagingCategoryEntry INSTANCE = new MessagingCategoryEntry();

    @NotNull
    public static final String buttons = "buttons";

    @NotNull
    public static final String identifier = "identifier";

    @NotNull
    public static final String tableName = "messagingCategory";

    private MessagingCategoryEntry() {
    }
}
