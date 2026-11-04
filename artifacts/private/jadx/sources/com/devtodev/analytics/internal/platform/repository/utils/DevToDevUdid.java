package com.devtodev.analytics.internal.platform.repository.utils;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class DevToDevUdid {
    @NotNull
    public final String getCustomUDID() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        return string;
    }
}
