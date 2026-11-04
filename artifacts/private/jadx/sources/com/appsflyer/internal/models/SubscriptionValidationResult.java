package com.appsflyer.internal.models;

import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.i;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class SubscriptionValidationResult {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private final ValidationFailureData failureData;

    @Nullable
    private final SubscriptionPurchase subscriptionPurchase;
    private final boolean success;

    public static final class Companion implements Deserialize<SubscriptionValidationResult> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int getOneTimePurchaseOfferDetails = 0;
        private static int getPackageName = 1;
        private static int[] getQuantity = {1942629217, 1302831623, -2038182110, 1596443469, 640125374, -151850811, -1273554589, -147080269, 1010461083, -1041011747, -813060633, -1491802768, 266302795, 253664229, 1053930637, 1736679105, -1851061362, 573407697};

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(int[] iArr, int i10, Object[] objArr) {
            int length;
            int[] iArr2;
            AFPurchaseConnectorA1l aFPurchaseConnectorA1l = new AFPurchaseConnectorA1l();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = getQuantity;
            if (iArr3 != null) {
                int i11 = $11 + 119;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    length = iArr3.length;
                    iArr2 = new int[length];
                } else {
                    length = iArr3.length;
                    iArr2 = new int[length];
                }
                for (int i12 = 0; i12 < length; i12++) {
                    iArr2[i12] = (int) (((long) iArr3[i12]) ^ 5408325179024382648L);
                }
                $10 = ($11 + 99) % 128;
                iArr3 = iArr2;
            }
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = getQuantity;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                for (int i13 = 0; i13 < length3; i13++) {
                    iArr6[i13] = (int) (((long) iArr5[i13]) ^ 5408325179024382648L);
                }
                $11 = ($10 + 57) % 128;
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            aFPurchaseConnectorA1l.toJsonMap = 0;
            while (true) {
                int i14 = aFPurchaseConnectorA1l.toJsonMap;
                if (i14 >= iArr.length) {
                    objArr[0] = new String(cArr2, 0, i10);
                    return;
                }
                int i15 = iArr[i14];
                char c10 = (char) (i15 >> 16);
                cArr[0] = c10;
                char c11 = (char) i15;
                cArr[1] = c11;
                char c12 = (char) (iArr[i14 + 1] >> 16);
                cArr[2] = c12;
                char c13 = (char) iArr[i14 + 1];
                cArr[3] = c13;
                aFPurchaseConnectorA1l.InAppPurchaseEvent = (c10 << 16) + c11;
                aFPurchaseConnectorA1l.getPackageName = (c12 << 16) + c13;
                AFPurchaseConnectorA1l.getOneTimePurchaseOfferDetails(iArr4);
                int i16 = 0;
                while (i16 < 16) {
                    int i17 = aFPurchaseConnectorA1l.InAppPurchaseEvent ^ iArr4[i16];
                    aFPurchaseConnectorA1l.InAppPurchaseEvent = i17;
                    int jsonMap = AFPurchaseConnectorA1l.toJsonMap(i17) ^ aFPurchaseConnectorA1l.getPackageName;
                    int i18 = aFPurchaseConnectorA1l.InAppPurchaseEvent;
                    aFPurchaseConnectorA1l.InAppPurchaseEvent = jsonMap;
                    aFPurchaseConnectorA1l.getPackageName = i18;
                    i16++;
                    $10 = ($11 + 55) % 128;
                }
                int i19 = aFPurchaseConnectorA1l.InAppPurchaseEvent;
                int i20 = aFPurchaseConnectorA1l.getPackageName;
                aFPurchaseConnectorA1l.InAppPurchaseEvent = i20;
                aFPurchaseConnectorA1l.getPackageName = i19;
                int i21 = i19 ^ iArr4[16];
                aFPurchaseConnectorA1l.getPackageName = i21;
                int i22 = i20 ^ iArr4[17];
                aFPurchaseConnectorA1l.InAppPurchaseEvent = i22;
                cArr[0] = (char) (i22 >>> 16);
                cArr[1] = (char) i22;
                cArr[2] = (char) (i21 >>> 16);
                cArr[3] = (char) i21;
                AFPurchaseConnectorA1l.getOneTimePurchaseOfferDetails(iArr4);
                int i23 = aFPurchaseConnectorA1l.toJsonMap;
                cArr2[i23 * 2] = cArr[0];
                cArr2[(i23 * 2) + 1] = cArr[1];
                cArr2[(i23 * 2) + 2] = cArr[2];
                cArr2[(i23 * 2) + 3] = cArr[3];
                aFPurchaseConnectorA1l.toJsonMap = i23 + 2;
            }
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ SubscriptionValidationResult fromJson(JSONObject jSONObject) throws JSONException {
            getOneTimePurchaseOfferDetails = (getPackageName + 17) % 128;
            SubscriptionValidationResult subscriptionValidationResultFromJson = fromJson(jSONObject);
            getOneTimePurchaseOfferDetails = (getPackageName + 27) % 128;
            return subscriptionValidationResultFromJson;
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @n
        @NotNull
        public final SubscriptionValidationResult fromJson(@NotNull JSONObject jSONObject) throws JSONException {
            SubscriptionPurchase subscriptionPurchaseFromJson;
            SubscriptionPurchase.Companion companion;
            Object obj;
            getPackageName = (getOneTimePurchaseOfferDetails + 51) % 128;
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Object[] objArr = new Object[1];
            a(new int[]{948685012, -143537292, -597892199, -1064785352}, 6 - TextUtils.indexOf("", "", 0, 0), objArr);
            boolean zOptBoolean = jSONObject.optBoolean(((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            a(new int[]{-1152811799, -378277507, -632085997, 939230886, -1788243725, 2029375717, -1320800287, -1784513457, 524259958, -1172794230, -930710677, 632485794}, 21 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
            ValidationFailureData validationFailureDataFromJson = null;
            if (!(!jSONObject.has(((String) objArr2[0]).intern()))) {
                int i10 = getOneTimePurchaseOfferDetails + 33;
                getPackageName = i10 % 128;
                if (i10 % 2 == 0) {
                    companion = SubscriptionPurchase.Companion;
                    Object[] objArr3 = new Object[1];
                    a(new int[]{-1152811799, -378277507, -632085997, 939230886, -1788243725, 2029375717, -1320800287, -1784513457, 524259958, -1172794230, -930710677, 632485794}, 127 >> KeyEvent.getDeadChar(0, 0), objArr3);
                    obj = objArr3[0];
                } else {
                    companion = SubscriptionPurchase.Companion;
                    Object[] objArr4 = new Object[1];
                    a(new int[]{-1152811799, -378277507, -632085997, 939230886, -1788243725, 2029375717, -1320800287, -1784513457, 524259958, -1172794230, -930710677, 632485794}, 21 - KeyEvent.getDeadChar(0, 0), objArr4);
                    obj = objArr4[0];
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject(((String) obj).intern());
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
                subscriptionPurchaseFromJson = companion.fromJson(jSONObject2);
            } else {
                getOneTimePurchaseOfferDetails = (getPackageName + 57) % 128;
                subscriptionPurchaseFromJson = null;
            }
            Object[] objArr5 = new Object[1];
            a(new int[]{-604052183, 1870368261, -1371403859, -60882178, 1910970731, -1292275217}, ((Process.getThreadPriority(0) + 20) >> 6) + 12, objArr5);
            if (jSONObject.has(((String) objArr5[0]).intern())) {
                int i11 = getOneTimePurchaseOfferDetails + 115;
                getPackageName = i11 % 128;
                if (i11 % 2 == 0) {
                    ValidationFailureData.Companion companion2 = ValidationFailureData.Companion;
                    Object[] objArr6 = new Object[1];
                    a(new int[]{-604052183, 1870368261, -1371403859, -60882178, 1910970731, -1292275217}, 3 >>> (ViewConfiguration.getFadingEdgeLength() - 89), objArr6);
                    JSONObject jSONObject3 = jSONObject.getJSONObject(((String) objArr6[0]).intern());
                    Intrinsics.checkNotNullExpressionValue(jSONObject3, "");
                    validationFailureDataFromJson = companion2.fromJson(jSONObject3);
                } else {
                    ValidationFailureData.Companion companion3 = ValidationFailureData.Companion;
                    Object[] objArr7 = new Object[1];
                    a(new int[]{-604052183, 1870368261, -1371403859, -60882178, 1910970731, -1292275217}, 12 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr7);
                    JSONObject jSONObject4 = jSONObject.getJSONObject(((String) objArr7[0]).intern());
                    Intrinsics.checkNotNullExpressionValue(jSONObject4, "");
                    validationFailureDataFromJson = companion3.fromJson(jSONObject4);
                }
            }
            SubscriptionValidationResult subscriptionValidationResult = new SubscriptionValidationResult(zOptBoolean, subscriptionPurchaseFromJson, validationFailureDataFromJson);
            int i12 = getOneTimePurchaseOfferDetails + 27;
            getPackageName = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 41 / 0;
            }
            return subscriptionValidationResult;
        }
    }

    public SubscriptionValidationResult(boolean z10, @Nullable SubscriptionPurchase subscriptionPurchase, @Nullable ValidationFailureData validationFailureData) {
        this.success = z10;
        this.subscriptionPurchase = subscriptionPurchase;
        this.failureData = validationFailureData;
    }

    public static /* synthetic */ SubscriptionValidationResult copy$default(SubscriptionValidationResult subscriptionValidationResult, boolean z10, SubscriptionPurchase subscriptionPurchase, ValidationFailureData validationFailureData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = subscriptionValidationResult.success;
        }
        if ((i10 & 2) != 0) {
            subscriptionPurchase = subscriptionValidationResult.subscriptionPurchase;
        }
        if ((i10 & 4) != 0) {
            validationFailureData = subscriptionValidationResult.failureData;
        }
        return subscriptionValidationResult.copy(z10, subscriptionPurchase, validationFailureData);
    }

    @n
    @NotNull
    public static SubscriptionValidationResult fromJson(@NotNull JSONObject jSONObject) {
        return Companion.fromJson(jSONObject);
    }

    public final boolean component1() {
        return this.success;
    }

    @Nullable
    public final SubscriptionPurchase component2() {
        return this.subscriptionPurchase;
    }

    @Nullable
    public final ValidationFailureData component3() {
        return this.failureData;
    }

    @NotNull
    public final SubscriptionValidationResult copy(boolean z10, @Nullable SubscriptionPurchase subscriptionPurchase, @Nullable ValidationFailureData validationFailureData) {
        return new SubscriptionValidationResult(z10, subscriptionPurchase, validationFailureData);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionValidationResult)) {
            return false;
        }
        SubscriptionValidationResult subscriptionValidationResult = (SubscriptionValidationResult) obj;
        return this.success == subscriptionValidationResult.success && Intrinsics.areEqual(this.subscriptionPurchase, subscriptionValidationResult.subscriptionPurchase) && Intrinsics.areEqual(this.failureData, subscriptionValidationResult.failureData);
    }

    @i(name = "getFailureData")
    @Nullable
    public final ValidationFailureData getFailureData() {
        return this.failureData;
    }

    @i(name = "getSubscriptionPurchase")
    @Nullable
    public final SubscriptionPurchase getSubscriptionPurchase() {
        return this.subscriptionPurchase;
    }

    @i(name = "getSuccess")
    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z10 = this.success;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = r10 * 31;
        SubscriptionPurchase subscriptionPurchase = this.subscriptionPurchase;
        int iHashCode = (i10 + (subscriptionPurchase == null ? 0 : subscriptionPurchase.hashCode())) * 31;
        ValidationFailureData validationFailureData = this.failureData;
        return iHashCode + (validationFailureData != null ? validationFailureData.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "SubscriptionValidationResult(success=" + this.success + ", subscriptionPurchase=" + this.subscriptionPurchase + ", failureData=" + this.failureData + ")";
    }
}
