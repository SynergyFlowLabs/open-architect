package com.superwall.sdk.analytics.session;

import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface AppManagerDelegate {
    @Nullable
    Object didUpdateAppSession(@NotNull AppSession appSession, @NotNull d<? super Unit> dVar);
}
