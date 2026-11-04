package com.devtodev.analytics.internal.domain;

import com.google.firebase.remoteconfig.e0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public enum ToolsKeys {
    SdkVersion(e0.b.f124461v2);


    @NotNull
    private final String value;

    ToolsKeys(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
