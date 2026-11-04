package com.superwall.sdk.network.device;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public enum InterfaceStyle {
    LIGHT("Light"),
    DARK("Dark");

    private static final /* synthetic */ kotlin.enums.a $ENTRIES = kotlin.enums.c.c(values());

    @NotNull
    private final String rawValue;

    InterfaceStyle(String str) {
        this.rawValue = str;
    }

    @NotNull
    public static kotlin.enums.a<InterfaceStyle> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getRawValue() {
        return this.rawValue;
    }
}
