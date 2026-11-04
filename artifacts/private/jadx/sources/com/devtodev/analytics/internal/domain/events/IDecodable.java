package com.devtodev.analytics.internal.domain.events;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface IDecodable {
    <T> T fromJson(@NotNull String str);
}
