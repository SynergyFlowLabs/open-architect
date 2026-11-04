package com.devtodev.analytics.external.anticheat;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nDTDVerifyResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DTDVerifyResponse.kt\ncom/devtodev/analytics/external/anticheat/DTDVerifyResponse\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,13:1\n1#2:14\n*E\n"})
public final class DTDVerifyResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DTDReceiptStatus f98050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98051b;

    public DTDVerifyResponse(@NotNull DTDReceiptStatus receiptStatus, @Nullable String str) {
        Intrinsics.checkNotNullParameter(receiptStatus, "receiptStatus");
        this.f98050a = receiptStatus;
        this.f98051b = str;
    }

    @NotNull
    public final DTDReceiptStatus getReceiptStatus() {
        return this.f98050a;
    }

    @Nullable
    public final String getVerificationResult() {
        return this.f98051b;
    }

    @NotNull
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("receiptStatus: [" + this.f98050a.name() + "]");
        String str = this.f98051b;
        if (str != null) {
            stringBuffer.append(" verificationResult: [" + str + "]\n");
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        return string;
    }
}
