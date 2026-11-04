package com.android.billingclient.api;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzbm implements c, j, p, b0, c0, d0, i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f89354a;

    zzbm() {
        this.f89354a = 0L;
    }

    public static native void nativeOnAcknowledgePurchaseResponse(int i10, String str, long j10);

    public static native void nativeOnBillingServiceDisconnected();

    public static native void nativeOnBillingSetupFinished(int i10, String str, long j10);

    public static native void nativeOnConsumePurchaseResponse(int i10, String str, String str2, long j10);

    public static native void nativeOnPriceChangeConfirmationResult(int i10, String str, long j10);

    public static native void nativeOnPurchaseHistoryResponse(int i10, String str, PurchaseHistoryRecord[] purchaseHistoryRecordArr, long j10);

    public static native void nativeOnPurchasesUpdated(int i10, String str, Purchase[] purchaseArr);

    public static native void nativeOnQueryPurchasesResponse(int i10, String str, Purchase[] purchaseArr, long j10);

    public static native void nativeOnSkuDetailsResponse(int i10, String str, SkuDetails[] skuDetailsArr, long j10);

    @Override // com.android.billingclient.api.i0
    public final void a(n nVar, List<SkuDetails> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        nativeOnSkuDetailsResponse(nVar.b(), nVar.a(), (SkuDetails[]) list.toArray(new SkuDetails[list.size()]), this.f89354a);
    }

    @Override // com.android.billingclient.api.c
    public final void b(n nVar) {
        nativeOnAcknowledgePurchaseResponse(nVar.b(), nVar.a(), this.f89354a);
    }

    @Override // com.android.billingclient.api.b0
    public final void c(n nVar, List<PurchaseHistoryRecord> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        nativeOnPurchaseHistoryResponse(nVar.b(), nVar.a(), (PurchaseHistoryRecord[]) list.toArray(new PurchaseHistoryRecord[list.size()]), this.f89354a);
    }

    @Override // com.android.billingclient.api.p
    public final void d(n nVar, String str) {
        nativeOnConsumePurchaseResponse(nVar.b(), nVar.a(), str, this.f89354a);
    }

    @Override // com.android.billingclient.api.j
    public final void onBillingServiceDisconnected() {
        nativeOnBillingServiceDisconnected();
    }

    @Override // com.android.billingclient.api.j
    public final void onBillingSetupFinished(n nVar) {
        nativeOnBillingSetupFinished(nVar.b(), nVar.a(), this.f89354a);
    }

    @Override // com.android.billingclient.api.d0
    public final void onPurchasesUpdated(n nVar, List<Purchase> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        nativeOnPurchasesUpdated(nVar.b(), nVar.a(), (Purchase[]) list.toArray(new Purchase[list.size()]));
    }

    @Override // com.android.billingclient.api.c0
    public final void onQueryPurchasesResponse(n nVar, List<Purchase> list) {
        nativeOnQueryPurchasesResponse(nVar.b(), nVar.a(), (Purchase[]) list.toArray(new Purchase[list.size()]), this.f89354a);
    }

    zzbm(long j10) {
        this.f89354a = j10;
    }
}
