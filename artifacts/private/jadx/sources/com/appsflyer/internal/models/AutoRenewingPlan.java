package com.appsflyer.internal.models;

import android.graphics.ImageFormat;
import android.util.TypedValue;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1j;
import com.planner5d.library.engine.input.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class AutoRenewingPlan {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private final Boolean autoRenewEnabled;

    @Nullable
    private final SubscriptionItemPriceChangeDetails priceChangeDetails;

    public static final class Companion implements Deserialize<AutoRenewingPlan> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char InAppPurchaseEvent = 64908;
        private static int getOneTimePurchaseOfferDetails = 0;
        private static char getPackageName = 9264;
        private static char getQuantity = 24700;
        private static int hashCode = 1;
        private static char toJsonMap = 5278;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(String str, int i10, Object[] objArr) {
            int i11 = $10 + 81;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            char[] charArray = str != null ? str.toCharArray() : str;
            AFPurchaseConnectorA1j aFPurchaseConnectorA1j = new AFPurchaseConnectorA1j();
            char[] cArr = new char[charArray.length];
            aFPurchaseConnectorA1j.getQuantity = 0;
            char[] cArr2 = new char[2];
            while (true) {
                int i12 = aFPurchaseConnectorA1j.getQuantity;
                if (i12 >= charArray.length) {
                    objArr[0] = new String(cArr, 0, i10);
                    return;
                }
                cArr2[0] = charArray[i12];
                cArr2[1] = charArray[i12 + 1];
                int i13 = 58224;
                for (int i14 = 0; i14 < 16; i14++) {
                    $11 = ($10 + 59) % 128;
                    char c10 = cArr2[1];
                    char c11 = cArr2[0];
                    char c12 = (char) (c10 - (((c11 + i13) ^ ((c11 << 4) + ((char) (((long) getPackageName) ^ 4722258354688939700L)))) ^ ((c11 >>> 5) + ((char) (((long) toJsonMap) ^ 4722258354688939700L)))));
                    cArr2[1] = c12;
                    cArr2[0] = (char) (c11 - (((c12 >>> 5) + ((char) (((long) getQuantity) ^ 4722258354688939700L))) ^ ((c12 + i13) ^ ((c12 << 4) + ((char) (((long) InAppPurchaseEvent) ^ 4722258354688939700L))))));
                    i13 -= 40503;
                }
                int i15 = aFPurchaseConnectorA1j.getQuantity;
                cArr[i15] = cArr2[0];
                cArr[i15 + 1] = cArr2[1];
                aFPurchaseConnectorA1j.getQuantity = i15 + 2;
            }
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ AutoRenewingPlan fromJson(JSONObject jSONObject) {
            getOneTimePurchaseOfferDetails = (hashCode + 47) % 128;
            AutoRenewingPlan autoRenewingPlanFromJson = fromJson(jSONObject);
            getOneTimePurchaseOfferDetails = (hashCode + 101) % 128;
            return autoRenewingPlanFromJson;
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public final AutoRenewingPlan fromJson(@NotNull JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Object[] objArr = new Object[1];
            a("簴⟭뢚㡒벷매獅몃项盂뷁∮\u171a뽡桝䧻", ImageFormat.getBitsPerPixel(0) + 17, objArr);
            Boolean bool = (Boolean) SubscriptionPurchaseKt.getNullable(jSONObject, ((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            a("躲⋹ಝ늖닆\uef8c\ue09b熥ၯꈀ㚘੧ᝧ\ue609먑쬗\uf4bd\ueb65", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18, objArr2);
            AutoRenewingPlan autoRenewingPlan = new AutoRenewingPlan(bool, (SubscriptionItemPriceChangeDetails) SubscriptionPurchaseKt.toObject(jSONObject, ((String) objArr2[0]).intern(), SubscriptionItemPriceChangeDetails.Companion));
            int i10 = getOneTimePurchaseOfferDetails + f.b.f160745y1;
            hashCode = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 20 / 0;
            }
            return autoRenewingPlan;
        }
    }

    public AutoRenewingPlan(@Nullable Boolean bool, @Nullable SubscriptionItemPriceChangeDetails subscriptionItemPriceChangeDetails) {
        this.autoRenewEnabled = bool;
        this.priceChangeDetails = subscriptionItemPriceChangeDetails;
    }

    public static /* synthetic */ AutoRenewingPlan copy$default(AutoRenewingPlan autoRenewingPlan, Boolean bool, SubscriptionItemPriceChangeDetails subscriptionItemPriceChangeDetails, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = autoRenewingPlan.autoRenewEnabled;
        }
        if ((i10 & 2) != 0) {
            subscriptionItemPriceChangeDetails = autoRenewingPlan.priceChangeDetails;
        }
        return autoRenewingPlan.copy(bool, subscriptionItemPriceChangeDetails);
    }

    @Nullable
    public final Boolean component1() {
        return this.autoRenewEnabled;
    }

    @Nullable
    public final SubscriptionItemPriceChangeDetails component2() {
        return this.priceChangeDetails;
    }

    @NotNull
    public final AutoRenewingPlan copy(@Nullable Boolean bool, @Nullable SubscriptionItemPriceChangeDetails subscriptionItemPriceChangeDetails) {
        return new AutoRenewingPlan(bool, subscriptionItemPriceChangeDetails);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoRenewingPlan)) {
            return false;
        }
        AutoRenewingPlan autoRenewingPlan = (AutoRenewingPlan) obj;
        return Intrinsics.areEqual(this.autoRenewEnabled, autoRenewingPlan.autoRenewEnabled) && Intrinsics.areEqual(this.priceChangeDetails, autoRenewingPlan.priceChangeDetails);
    }

    @i(name = "getAutoRenewEnabled")
    @Nullable
    public final Boolean getAutoRenewEnabled() {
        return this.autoRenewEnabled;
    }

    @i(name = "getPriceChangeDetails")
    @Nullable
    public final SubscriptionItemPriceChangeDetails getPriceChangeDetails() {
        return this.priceChangeDetails;
    }

    public final int hashCode() {
        Boolean bool = this.autoRenewEnabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        SubscriptionItemPriceChangeDetails subscriptionItemPriceChangeDetails = this.priceChangeDetails;
        return iHashCode + (subscriptionItemPriceChangeDetails != null ? subscriptionItemPriceChangeDetails.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "AutoRenewingPlan(autoRenewEnabled=" + this.autoRenewEnabled + ", priceChangeDetails=" + this.priceChangeDetails + ")";
    }
}
