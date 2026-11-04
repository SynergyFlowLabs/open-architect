package com.devtodev.analytics.internal.modues.anticheat;

import com.devtodev.analytics.external.anticheat.DTDVerifyResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface IAntiCheatLogic {
    void verifyPaymentWithCompletion(@NotNull Receipt receipt, @NotNull Function1<? super DTDVerifyResponse, Unit> function1);
}
