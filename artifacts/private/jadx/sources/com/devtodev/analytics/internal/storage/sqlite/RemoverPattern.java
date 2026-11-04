package com.devtodev.analytics.internal.storage.sqlite;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public enum RemoverPattern {
    JEST_ONE("=?"),
    EXCEPT_ONE("!=?");


    @NotNull
    private final String value;

    RemoverPattern(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
