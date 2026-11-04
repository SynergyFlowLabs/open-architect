package com.devtodev.analytics.internal.modues.messaging;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface IMessaging {
    void pushOpened(long j10, int i10, @Nullable String str);

    void pushReceive(long j10, int i10);

    void pushToken(@NotNull String str, boolean z10);
}
