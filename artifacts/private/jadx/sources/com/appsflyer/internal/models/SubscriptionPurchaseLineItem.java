package com.appsflyer.internal.models;

import android.graphics.Color;
import android.os.Process;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class SubscriptionPurchaseLineItem {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private final AutoRenewingPlan autoRenewingPlan;

    @Nullable
    private final DeferredItemReplacement deferredItemReplacement;

    @NotNull
    private final String expiryTime;

    @Nullable
    private final OfferDetails offerDetails;

    @Nullable
    private final PrepaidPlan prepaidPlan;

    @NotNull
    private final String productId;

    public static final class Companion implements Deserialize<SubscriptionPurchaseLineItem> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int getOneTimePurchaseOfferDetails = 1;
        private static int getPackageName = 0;
        private static long getQuantity = -2645352400560151300L;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(String str, int i10, Object[] objArr) {
            Object charArray = str;
            if (str != null) {
                $11 = ($10 + 77) % 128;
                charArray = str.toCharArray();
            }
            AFPurchaseConnectorA1h aFPurchaseConnectorA1h = new AFPurchaseConnectorA1h();
            char[] jsonMap = AFPurchaseConnectorA1h.toJsonMap(getQuantity ^ 2453322609447673138L, (char[]) charArray, i10);
            aFPurchaseConnectorA1h.InAppPurchaseEvent = 4;
            while (true) {
                int i11 = aFPurchaseConnectorA1h.InAppPurchaseEvent;
                if (i11 >= jsonMap.length) {
                    break;
                }
                int i12 = i11 - 4;
                aFPurchaseConnectorA1h.toJsonMap = i12;
                jsonMap[i11] = (char) (((long) (jsonMap[i11] ^ jsonMap[i11 % 4])) ^ (((long) i12) * (getQuantity ^ 2453322609447673138L)));
                aFPurchaseConnectorA1h.InAppPurchaseEvent = i11 + 1;
            }
            String str2 = new String(jsonMap, 4, jsonMap.length - 4);
            int i13 = $11 + 3;
            $10 = i13 % 128;
            if (i13 % 2 == 0) {
                objArr[0] = str2;
            } else {
                int i14 = 71 / 0;
                objArr[0] = str2;
            }
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ SubscriptionPurchaseLineItem fromJson(JSONObject jSONObject) {
            getPackageName = (getOneTimePurchaseOfferDetails + 93) % 128;
            SubscriptionPurchaseLineItem subscriptionPurchaseLineItemFromJson = fromJson(jSONObject);
            int i10 = getOneTimePurchaseOfferDetails + 43;
            getPackageName = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 30 / 0;
            }
            return subscriptionPurchaseLineItemFromJson;
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public final SubscriptionPurchaseLineItem fromJson(@NotNull JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Object[] objArr = new Object[1];
            a("ﶚﷻ\uf7bd獹丆\u0091犥\u1af0\uef65徠娫䭧㎝왑䋳ꐝ䡢ℜ⦴볜", ViewConfiguration.getLongPressTimeout() >> 16, objArr);
            AutoRenewingPlan autoRenewingPlan = (AutoRenewingPlan) SubscriptionPurchaseKt.toObject(jSONObject, ((String) objArr[0]).intern(), AutoRenewingPlan.Companion);
            Object[] objArr2 = new Object[1];
            a("圻坟닭\ue3e2\u0b46逘⃝끱ꨲි쪩ᤔ餂茌퉱\uf665\ue2c1摕뤬\ueeac쮺嶋老쟵퍆㛎柘", Color.argb(0, 0, 0, 0), objArr2);
            DeferredItemReplacement deferredItemReplacement = (DeferredItemReplacement) SubscriptionPurchaseKt.toObject(jSONObject, ((String) objArr2[0]).intern(), DeferredItemReplacement.Companion);
            Object[] objArr3 = new Object[1];
            a("ᒢᓇ讠佈㈖㲤\ue6d6\uf3e8鍩쯕昤\udf1e\udabf멍", ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr3);
            String strOptString = jSONObject.optString(((String) objArr3[0]).intern());
            Intrinsics.checkNotNullExpressionValue(strOptString, "");
            Object[] objArr4 = new Object[1];
            a("鮓鯼ㆇ൫蠯纑혁糙⥭\ufb0e␠\uefd8喂x㳱§", Process.myTid() >> 22, objArr4);
            OfferDetails offerDetails = (OfferDetails) SubscriptionPurchaseKt.toObject(jSONObject, ((String) objArr4[0]).intern(), OfferDetails.Companion);
            Object[] objArr5 = new Object[1];
            a("ۤڔ⤳讀邏\uf879䩂\ue1bd㇠杘ꋉ玪죸ᣐ먛", Color.rgb(0, 0, 0) + 16777216, objArr5);
            PrepaidPlan prepaidPlan = (PrepaidPlan) SubscriptionPurchaseKt.toObject(jSONObject, ((String) objArr5[0]).intern(), PrepaidPlan.Companion);
            Object[] objArr6 = new Object[1];
            a("\uf1a1\uf1d1봒鰭Ү\uefde햷᛬ꗋ\uf8b9땾\uec52㾵", View.resolveSize(0, 0), objArr6);
            String strOptString2 = jSONObject.optString(((String) objArr6[0]).intern());
            Intrinsics.checkNotNullExpressionValue(strOptString2, "");
            SubscriptionPurchaseLineItem subscriptionPurchaseLineItem = new SubscriptionPurchaseLineItem(autoRenewingPlan, deferredItemReplacement, strOptString, offerDetails, prepaidPlan, strOptString2);
            getPackageName = (getOneTimePurchaseOfferDetails + 67) % 128;
            return subscriptionPurchaseLineItem;
        }
    }

    public SubscriptionPurchaseLineItem(@Nullable AutoRenewingPlan autoRenewingPlan, @Nullable DeferredItemReplacement deferredItemReplacement, @NotNull String str, @Nullable OfferDetails offerDetails, @Nullable PrepaidPlan prepaidPlan, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.autoRenewingPlan = autoRenewingPlan;
        this.deferredItemReplacement = deferredItemReplacement;
        this.expiryTime = str;
        this.offerDetails = offerDetails;
        this.prepaidPlan = prepaidPlan;
        this.productId = str2;
    }

    public static /* synthetic */ SubscriptionPurchaseLineItem copy$default(SubscriptionPurchaseLineItem subscriptionPurchaseLineItem, AutoRenewingPlan autoRenewingPlan, DeferredItemReplacement deferredItemReplacement, String str, OfferDetails offerDetails, PrepaidPlan prepaidPlan, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            autoRenewingPlan = subscriptionPurchaseLineItem.autoRenewingPlan;
        }
        if ((i10 & 2) != 0) {
            deferredItemReplacement = subscriptionPurchaseLineItem.deferredItemReplacement;
        }
        if ((i10 & 4) != 0) {
            str = subscriptionPurchaseLineItem.expiryTime;
        }
        if ((i10 & 8) != 0) {
            offerDetails = subscriptionPurchaseLineItem.offerDetails;
        }
        if ((i10 & 16) != 0) {
            prepaidPlan = subscriptionPurchaseLineItem.prepaidPlan;
        }
        if ((i10 & 32) != 0) {
            str2 = subscriptionPurchaseLineItem.productId;
        }
        PrepaidPlan prepaidPlan2 = prepaidPlan;
        String str3 = str2;
        return subscriptionPurchaseLineItem.copy(autoRenewingPlan, deferredItemReplacement, str, offerDetails, prepaidPlan2, str3);
    }

    @Nullable
    public final AutoRenewingPlan component1() {
        return this.autoRenewingPlan;
    }

    @Nullable
    public final DeferredItemReplacement component2() {
        return this.deferredItemReplacement;
    }

    @NotNull
    public final String component3() {
        return this.expiryTime;
    }

    @Nullable
    public final OfferDetails component4() {
        return this.offerDetails;
    }

    @Nullable
    public final PrepaidPlan component5() {
        return this.prepaidPlan;
    }

    @NotNull
    public final String component6() {
        return this.productId;
    }

    @NotNull
    public final SubscriptionPurchaseLineItem copy(@Nullable AutoRenewingPlan autoRenewingPlan, @Nullable DeferredItemReplacement deferredItemReplacement, @NotNull String str, @Nullable OfferDetails offerDetails, @Nullable PrepaidPlan prepaidPlan, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new SubscriptionPurchaseLineItem(autoRenewingPlan, deferredItemReplacement, str, offerDetails, prepaidPlan, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionPurchaseLineItem)) {
            return false;
        }
        SubscriptionPurchaseLineItem subscriptionPurchaseLineItem = (SubscriptionPurchaseLineItem) obj;
        return Intrinsics.areEqual(this.autoRenewingPlan, subscriptionPurchaseLineItem.autoRenewingPlan) && Intrinsics.areEqual(this.deferredItemReplacement, subscriptionPurchaseLineItem.deferredItemReplacement) && Intrinsics.areEqual(this.expiryTime, subscriptionPurchaseLineItem.expiryTime) && Intrinsics.areEqual(this.offerDetails, subscriptionPurchaseLineItem.offerDetails) && Intrinsics.areEqual(this.prepaidPlan, subscriptionPurchaseLineItem.prepaidPlan) && Intrinsics.areEqual(this.productId, subscriptionPurchaseLineItem.productId);
    }

    @i(name = "getAutoRenewingPlan")
    @Nullable
    public final AutoRenewingPlan getAutoRenewingPlan() {
        return this.autoRenewingPlan;
    }

    @i(name = "getDeferredItemReplacement")
    @Nullable
    public final DeferredItemReplacement getDeferredItemReplacement() {
        return this.deferredItemReplacement;
    }

    @i(name = "getExpiryTime")
    @NotNull
    public final String getExpiryTime() {
        return this.expiryTime;
    }

    @i(name = "getOfferDetails")
    @Nullable
    public final OfferDetails getOfferDetails() {
        return this.offerDetails;
    }

    @i(name = "getPrepaidPlan")
    @Nullable
    public final PrepaidPlan getPrepaidPlan() {
        return this.prepaidPlan;
    }

    @i(name = "getProductId")
    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    public final int hashCode() {
        AutoRenewingPlan autoRenewingPlan = this.autoRenewingPlan;
        int iHashCode = (autoRenewingPlan == null ? 0 : autoRenewingPlan.hashCode()) * 31;
        DeferredItemReplacement deferredItemReplacement = this.deferredItemReplacement;
        int iHashCode2 = (((iHashCode + (deferredItemReplacement == null ? 0 : deferredItemReplacement.hashCode())) * 31) + this.expiryTime.hashCode()) * 31;
        OfferDetails offerDetails = this.offerDetails;
        int iHashCode3 = (iHashCode2 + (offerDetails == null ? 0 : offerDetails.hashCode())) * 31;
        PrepaidPlan prepaidPlan = this.prepaidPlan;
        return ((iHashCode3 + (prepaidPlan != null ? prepaidPlan.hashCode() : 0)) * 31) + this.productId.hashCode();
    }

    @NotNull
    public final String toString() {
        return "SubscriptionPurchaseLineItem(autoRenewingPlan=" + this.autoRenewingPlan + ", deferredItemReplacement=" + this.deferredItemReplacement + ", expiryTime=" + this.expiryTime + ", offerDetails=" + this.offerDetails + ", prepaidPlan=" + this.prepaidPlan + ", productId=" + this.productId + ")";
    }
}
