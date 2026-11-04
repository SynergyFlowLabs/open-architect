package com.devtodev.analytics.internal.services;

import com.devtodev.analytics.external.anticheat.DTDVerifyResponse;
import com.devtodev.analytics.internal.modues.anticheat.Receipt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface IAntiCheatService {
    @NotNull
    DTDVerifyResponse receiveReceiptStatus(@NotNull Receipt receipt);
}
