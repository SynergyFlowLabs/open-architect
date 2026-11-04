package com.devtodev.analytics.internal.modues.observers;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface ILogicBroadcaster {
    void forceUpdate();

    @Nullable
    Function1<Long, Unit> getOnBackendIdentifiersUpdate();

    void setOnBackendIdentifiersUpdate(@Nullable Function1<? super Long, Unit> function1);
}
