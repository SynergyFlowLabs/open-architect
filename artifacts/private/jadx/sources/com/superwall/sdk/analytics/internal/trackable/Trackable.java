package com.superwall.sdk.analytics.internal.trackable;

import java.util.Map;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface Trackable {
    @NotNull
    Map<String, Object> getAudienceFilterParams();

    boolean getCanImplicitlyTriggerPaywall();

    @NotNull
    String getRawName();

    @Nullable
    Object getSuperwallParameters(@NotNull d<? super Map<String, ? extends Object>> dVar);
}
