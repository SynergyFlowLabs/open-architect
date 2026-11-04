package com.devtodev.analytics.external.analytics;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class DTDAccrualTypeKt {
    @NotNull
    public static final DTDAccrualType getAccrualType(long j10) {
        return j10 == 0 ? DTDAccrualType.Earned : DTDAccrualType.Bought;
    }
}
