package com.devtodev.analytics.internal.modues.anticheat;

import com.devtodev.analytics.external.anticheat.DTDVerifyResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface IAntiCheatProxy {
    void initialize(@NotNull IAntiCheatLogic iAntiCheatLogic);

    void verifyPaymentWithCompletion(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Function1<? super DTDVerifyResponse, Unit> function1);
}
