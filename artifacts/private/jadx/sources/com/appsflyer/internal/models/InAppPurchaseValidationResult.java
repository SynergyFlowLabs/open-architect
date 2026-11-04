package com.appsflyer.internal.models;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1i;
import kotlin.io.encoding.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.i;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import org.locationtech.jts.geom.l;
import org.msgpack.core.h;

/* JADX INFO: loaded from: classes3.dex */
public final class InAppPurchaseValidationResult {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private final ValidationFailureData failureData;

    @Nullable
    private final ProductPurchase productPurchase;
    private final boolean success;

    public static final class Companion implements Deserialize<InAppPurchaseValidationResult> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static byte[] InAppPurchaseEvent = {96, -83, -68, -89, h.a.f339288x, -72, 106, 94, 126, 69, 113, 93, 73, 113, 125, 87, 125, 90, 125, 65, 73, 78, 102, a.f312535i, 67, 45, 85, 42, 35, 45, 89, 83, 88, 43};
        private static int PurchaseClient = 1;
        private static short[] getOneTimePurchaseOfferDetails = null;
        private static int getPackageName = -865513338;
        private static int getQuantity = 1979203924;
        private static int startObservingTransactions = 0;
        private static int toJsonMap = -1576082387;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(int i10, byte b10, int i11, short s10, int i12, Object[] objArr) {
            boolean z10;
            AFPurchaseConnectorA1i aFPurchaseConnectorA1i = new AFPurchaseConnectorA1i();
            StringBuilder sb2 = new StringBuilder();
            int i13 = i11 + ((int) (((long) getPackageName) ^ (-531460254799933296L)));
            int i14 = i13 == -1 ? 1 : 0;
            if (i14 != 0) {
                byte[] bArr = InAppPurchaseEvent;
                if (bArr != null) {
                    $10 = ($11 + 11) % 128;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i15 = 0; i15 < length; i15++) {
                        bArr2[i15] = (byte) (((long) bArr[i15]) ^ (-531460254799933296L));
                    }
                    bArr = bArr2;
                }
                i13 = bArr != null ? (byte) (((byte) (((long) InAppPurchaseEvent[i12 + ((int) (((long) getQuantity) ^ (-531460254799933296L)))]) ^ (-531460254799933296L))) + ((int) (((long) getPackageName) ^ (-531460254799933296L)))) : (short) (((short) (((long) getOneTimePurchaseOfferDetails[i12 + ((int) (((long) getQuantity) ^ (-531460254799933296L)))]) ^ (-531460254799933296L))) + ((int) (((long) getPackageName) ^ (-531460254799933296L))));
            }
            if (i13 > 0) {
                aFPurchaseConnectorA1i.getOneTimePurchaseOfferDetails = ((i12 + i13) - 2) + ((int) (((long) getQuantity) ^ (-531460254799933296L))) + i14;
                char c10 = (char) (i10 + ((int) (((long) toJsonMap) ^ (-531460254799933296L))));
                aFPurchaseConnectorA1i.getPackageName = c10;
                sb2.append(c10);
                aFPurchaseConnectorA1i.getQuantity = aFPurchaseConnectorA1i.getPackageName;
                byte[] bArr3 = InAppPurchaseEvent;
                if (bArr3 != null) {
                    int length2 = bArr3.length;
                    byte[] bArr4 = new byte[length2];
                    int i16 = 0;
                    while (i16 < length2) {
                        int i17 = $11 + 65;
                        $10 = i17 % 128;
                        if (i17 % 2 != 0) {
                            bArr4[i16] = (byte) (((long) bArr3[i16]) ^ (-531460254799933296L));
                        } else {
                            bArr4[i16] = (byte) (((long) bArr3[i16]) ^ (-531460254799933296L));
                            i16++;
                        }
                    }
                    bArr3 = bArr4;
                }
                if (bArr3 != null) {
                    $10 = ($11 + 43) % 128;
                    z10 = true;
                } else {
                    z10 = false;
                }
                aFPurchaseConnectorA1i.InAppPurchaseEvent = 1;
                while (aFPurchaseConnectorA1i.InAppPurchaseEvent < i13) {
                    $11 = ($10 + 13) % 128;
                    if (z10) {
                        byte[] bArr5 = InAppPurchaseEvent;
                        int i18 = aFPurchaseConnectorA1i.getOneTimePurchaseOfferDetails;
                        aFPurchaseConnectorA1i.getOneTimePurchaseOfferDetails = i18 - 1;
                        aFPurchaseConnectorA1i.getPackageName = (char) (aFPurchaseConnectorA1i.getQuantity + (((byte) (((byte) (((long) bArr5[i18]) ^ (-531460254799933296L))) + s10)) ^ b10));
                    } else {
                        short[] sArr = getOneTimePurchaseOfferDetails;
                        int i19 = aFPurchaseConnectorA1i.getOneTimePurchaseOfferDetails;
                        aFPurchaseConnectorA1i.getOneTimePurchaseOfferDetails = i19 - 1;
                        aFPurchaseConnectorA1i.getPackageName = (char) (aFPurchaseConnectorA1i.getQuantity + (((short) (((short) (((long) sArr[i19]) ^ (-531460254799933296L))) + s10)) ^ b10));
                    }
                    sb2.append(aFPurchaseConnectorA1i.getPackageName);
                    aFPurchaseConnectorA1i.getQuantity = aFPurchaseConnectorA1i.getPackageName;
                    aFPurchaseConnectorA1i.InAppPurchaseEvent++;
                }
            }
            objArr[0] = sb2.toString();
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ InAppPurchaseValidationResult fromJson(JSONObject jSONObject) throws JSONException {
            int i10 = PurchaseClient + 125;
            startObservingTransactions = i10 % 128;
            int i11 = i10 % 2;
            InAppPurchaseValidationResult inAppPurchaseValidationResultFromJson = fromJson(jSONObject);
            if (i11 != 0) {
                int i12 = 11 / 0;
            }
            startObservingTransactions = (PurchaseClient + 69) % 128;
            return inAppPurchaseValidationResultFromJson;
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @n
        @NotNull
        public final InAppPurchaseValidationResult fromJson(@NotNull JSONObject jSONObject) throws JSONException {
            ProductPurchase productPurchaseFromJson;
            ValidationFailureData validationFailureDataFromJson;
            PurchaseClient = (startObservingTransactions + 65) % 128;
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Object[] objArr = new Object[1];
            a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 1852290123, (byte) (Process.myTid() >> 22), (-23) - (ViewConfiguration.getKeyRepeatDelay() >> 16), (short) ((-53) - ((Process.getThreadPriority(0) + 20) >> 6)), (ViewConfiguration.getPressedStateDuration() >> 16) + 1181675068, objArr);
            boolean zOptBoolean = jSONObject.optBoolean(((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            a(MotionEvent.axisFromString("") - 1852290124, (byte) ((-1) - ImageFormat.getBitsPerPixel(0)), (-22) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (short) (36 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 1181675075 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr2);
            if (jSONObject.has(((String) objArr2[0]).intern())) {
                ProductPurchase.Companion companion = ProductPurchase.Companion;
                Object[] objArr3 = new Object[1];
                a((-1852290125) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (-22) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (short) (TextUtils.getTrimmedLength("") + 36), 1181675074 - (ViewConfiguration.getTouchSlop() >> 8), objArr3);
                JSONObject jSONObject2 = jSONObject.getJSONObject(((String) objArr3[0]).intern());
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
                productPurchaseFromJson = companion.fromJson(jSONObject2);
                startObservingTransactions = (PurchaseClient + 7) % 128;
            } else {
                productPurchaseFromJson = null;
            }
            Object[] objArr4 = new Object[1];
            a((-1852290135) - Color.green(0), (byte) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 24, (short) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 64), 1181675090 - (Process.myTid() >> 22), objArr4);
            if (jSONObject.has(((String) objArr4[0]).intern())) {
                PurchaseClient = (startObservingTransactions + 47) % 128;
                ValidationFailureData.Companion companion2 = ValidationFailureData.Companion;
                Object[] objArr5 = new Object[1];
                a((-1852290135) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) (TextUtils.indexOf("", l.f338160j, 0) + 1), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 23, (short) ((KeyEvent.getMaxKeyCode() >> 16) + 64), 1181675090 - Color.blue(0), objArr5);
                JSONObject jSONObject3 = jSONObject.getJSONObject(((String) objArr5[0]).intern());
                Intrinsics.checkNotNullExpressionValue(jSONObject3, "");
                validationFailureDataFromJson = companion2.fromJson(jSONObject3);
                PurchaseClient = (startObservingTransactions + 105) % 128;
            } else {
                validationFailureDataFromJson = null;
            }
            InAppPurchaseValidationResult inAppPurchaseValidationResult = new InAppPurchaseValidationResult(zOptBoolean, productPurchaseFromJson, validationFailureDataFromJson);
            int i10 = PurchaseClient + 11;
            startObservingTransactions = i10 % 128;
            if (i10 % 2 == 0) {
                return inAppPurchaseValidationResult;
            }
            throw null;
        }
    }

    public InAppPurchaseValidationResult(boolean z10, @Nullable ProductPurchase productPurchase, @Nullable ValidationFailureData validationFailureData) {
        this.success = z10;
        this.productPurchase = productPurchase;
        this.failureData = validationFailureData;
    }

    public static /* synthetic */ InAppPurchaseValidationResult copy$default(InAppPurchaseValidationResult inAppPurchaseValidationResult, boolean z10, ProductPurchase productPurchase, ValidationFailureData validationFailureData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = inAppPurchaseValidationResult.success;
        }
        if ((i10 & 2) != 0) {
            productPurchase = inAppPurchaseValidationResult.productPurchase;
        }
        if ((i10 & 4) != 0) {
            validationFailureData = inAppPurchaseValidationResult.failureData;
        }
        return inAppPurchaseValidationResult.copy(z10, productPurchase, validationFailureData);
    }

    @n
    @NotNull
    public static InAppPurchaseValidationResult fromJson(@NotNull JSONObject jSONObject) {
        return Companion.fromJson(jSONObject);
    }

    public final boolean component1() {
        return this.success;
    }

    @Nullable
    public final ProductPurchase component2() {
        return this.productPurchase;
    }

    @Nullable
    public final ValidationFailureData component3() {
        return this.failureData;
    }

    @NotNull
    public final InAppPurchaseValidationResult copy(boolean z10, @Nullable ProductPurchase productPurchase, @Nullable ValidationFailureData validationFailureData) {
        return new InAppPurchaseValidationResult(z10, productPurchase, validationFailureData);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppPurchaseValidationResult)) {
            return false;
        }
        InAppPurchaseValidationResult inAppPurchaseValidationResult = (InAppPurchaseValidationResult) obj;
        return this.success == inAppPurchaseValidationResult.success && Intrinsics.areEqual(this.productPurchase, inAppPurchaseValidationResult.productPurchase) && Intrinsics.areEqual(this.failureData, inAppPurchaseValidationResult.failureData);
    }

    @i(name = "getFailureData")
    @Nullable
    public final ValidationFailureData getFailureData() {
        return this.failureData;
    }

    @i(name = "getProductPurchase")
    @Nullable
    public final ProductPurchase getProductPurchase() {
        return this.productPurchase;
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
        ProductPurchase productPurchase = this.productPurchase;
        int iHashCode = (i10 + (productPurchase == null ? 0 : productPurchase.hashCode())) * 31;
        ValidationFailureData validationFailureData = this.failureData;
        return iHashCode + (validationFailureData != null ? validationFailureData.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "InAppPurchaseValidationResult(success=" + this.success + ", productPurchase=" + this.productPurchase + ", failureData=" + this.failureData + ")";
    }
}
