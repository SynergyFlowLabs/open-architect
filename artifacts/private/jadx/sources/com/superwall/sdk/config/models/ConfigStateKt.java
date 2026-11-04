package com.superwall.sdk.config.models;

import com.superwall.sdk.models.config.Config;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class ConfigStateKt {
    @Nullable
    public static final Config getConfig(@NotNull ConfigState configState) {
        Intrinsics.checkNotNullParameter(configState, "<this>");
        if (configState instanceof ConfigState.Retrieved) {
            return ((ConfigState.Retrieved) configState).getConfig();
        }
        return null;
    }
}
