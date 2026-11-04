package com.devtodev.analytics.external.anticheat;

/* JADX INFO: loaded from: classes3.dex */
public enum DTDReceiptStatus {
    ReceiptValid(0),
    ReceiptNotValid(1),
    ReceiptServerError(2),
    ReceiptInternalError(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f98049a;

    DTDReceiptStatus(long j10) {
        this.f98049a = j10;
    }

    public final long getValue() {
        return this.f98049a;
    }
}
