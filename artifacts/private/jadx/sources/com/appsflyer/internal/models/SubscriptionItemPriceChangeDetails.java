package com.appsflyer.internal.models;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1h;
import java.io.UnsupportedEncodingException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oj.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class SubscriptionItemPriceChangeDetails {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String expectedNewPriceChargeTime;

    @Nullable
    private final Money newPrice;

    @NotNull
    private final String priceChangeMode;

    @NotNull
    private final String priceChangeState;

    @SourceDebugExtension({"SMAP\nSubscriptionPurchase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubscriptionPurchase.kt\ncom/appsflyer/internal/models/SubscriptionItemPriceChangeDetails$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,381:1\n1#2:382\n*E\n"})
    public static final class Companion implements Deserialize<SubscriptionItemPriceChangeDetails> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int getPackageName = 0;
        private static int getQuantity = 1;
        private static long toJsonMap = -8429349120616387883L;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0015  */
        private static void a(String str, int i10, Object[] objArr) {
            int i11 = $10 + 69;
            $11 = i11 % 128;
            Object charArray = str;
            if (i11 % 2 == 0) {
                int i12 = 28 / 0;
                if (str != null) {
                    charArray = str;
                    charArray = str.toCharArray();
                }
            } else if (str != null) {
                charArray = str;
                charArray = str.toCharArray();
            }
            charArray = str;
            AFPurchaseConnectorA1h aFPurchaseConnectorA1h = new AFPurchaseConnectorA1h();
            char[] jsonMap = AFPurchaseConnectorA1h.toJsonMap(toJsonMap ^ 2453322609447673138L, (char[]) charArray, i10);
            aFPurchaseConnectorA1h.InAppPurchaseEvent = 4;
            while (true) {
                int i13 = aFPurchaseConnectorA1h.InAppPurchaseEvent;
                if (i13 >= jsonMap.length) {
                    String str2 = new String(jsonMap, 4, jsonMap.length - 4);
                    $10 = ($11 + 69) % 128;
                    objArr[0] = str2;
                    return;
                } else {
                    int i14 = i13 - 4;
                    aFPurchaseConnectorA1h.toJsonMap = i14;
                    jsonMap[i13] = (char) (((long) (jsonMap[i13] ^ jsonMap[i13 % 4])) ^ (((long) i14) * (toJsonMap ^ 2453322609447673138L)));
                    aFPurchaseConnectorA1h.InAppPurchaseEvent = i13 + 1;
                }
            }
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ SubscriptionItemPriceChangeDetails fromJson(JSONObject jSONObject) throws JSONException, UnsupportedEncodingException {
            int i10 = getQuantity + 81;
            getPackageName = i10 % 128;
            int i11 = i10 % 2;
            SubscriptionItemPriceChangeDetails subscriptionItemPriceChangeDetailsFromJson = fromJson(jSONObject);
            if (i11 != 0) {
                int i12 = 39 / 0;
            }
            int i13 = getQuantity + 75;
            getPackageName = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 31 / 0;
            }
            return subscriptionItemPriceChangeDetailsFromJson;
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public final SubscriptionItemPriceChangeDetails fromJson(@NotNull JSONObject jSONObject) throws JSONException, UnsupportedEncodingException {
            Money moneyFromJson;
            getPackageName = (getQuantity + 41) % 128;
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Object[] objArr = new Object[1];
            a("弩\udd08돆彌檗ᚦ\udc78ㅶ胖䫿ﳉᆓ\ue05fꩲ鲷\uf01b솏诚봇큊ℚ\ueb37嶙냱ł좞繈錎括⣢", TextUtils.getOffsetBefore("", 0) + 1, objArr);
            String strOptString = jSONObject.optString(((String) objArr[0]).intern());
            Intrinsics.checkNotNullExpressionValue(strOptString, "");
            Object[] objArr2 = new Object[1];
            a("삅ᮉ皬샫갋ᒘᤕ㍽Ὣ豣㦥Ꭼ", KeyEvent.normalizeMetaState(0) + 1, objArr2);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(((String) objArr2[0]).intern());
            if (jSONObjectOptJSONObject != null) {
                Intrinsics.checkNotNullExpressionValue(jSONObjectOptJSONObject, "");
                moneyFromJson = Money.Companion.fromJson(jSONObjectOptJSONObject);
            } else {
                moneyFromJson = null;
            }
            Object[] objArr3 = new Object[1];
            a("ﺗ\u0fee炕ﻧ롻ꍕἲ蒃Ⅾ頮㾗ꑥ䇁碖忶䗵怬失繒", -Process.getGidForName(""), objArr3);
            String strOptString2 = jSONObject.optString(((String) objArr3[0]).intern());
            Intrinsics.checkNotNullExpressionValue(strOptString2, "");
            Object[] objArr4 = new Object[1];
            a("༄융蘶ུ炠㜰\ue991ღ탽僵줴\u3000끒끍\ua955톎醤釯裠\uf1dc", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr4);
            String strOptString3 = jSONObject.optString(((String) objArr4[0]).intern());
            Intrinsics.checkNotNullExpressionValue(strOptString3, "");
            SubscriptionItemPriceChangeDetails subscriptionItemPriceChangeDetails = new SubscriptionItemPriceChangeDetails(strOptString, moneyFromJson, strOptString2, strOptString3);
            int i10 = getPackageName + 89;
            getQuantity = i10 % 128;
            if (i10 % 2 != 0) {
                return subscriptionItemPriceChangeDetails;
            }
            throw null;
        }
    }

    public SubscriptionItemPriceChangeDetails(@NotNull String str, @Nullable Money money, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.expectedNewPriceChargeTime = str;
        this.newPrice = money;
        this.priceChangeMode = str2;
        this.priceChangeState = str3;
    }

    public static /* synthetic */ SubscriptionItemPriceChangeDetails copy$default(SubscriptionItemPriceChangeDetails subscriptionItemPriceChangeDetails, String str, Money money, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = subscriptionItemPriceChangeDetails.expectedNewPriceChargeTime;
        }
        if ((i10 & 2) != 0) {
            money = subscriptionItemPriceChangeDetails.newPrice;
        }
        if ((i10 & 4) != 0) {
            str2 = subscriptionItemPriceChangeDetails.priceChangeMode;
        }
        if ((i10 & 8) != 0) {
            str3 = subscriptionItemPriceChangeDetails.priceChangeState;
        }
        return subscriptionItemPriceChangeDetails.copy(str, money, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.expectedNewPriceChargeTime;
    }

    @Nullable
    public final Money component2() {
        return this.newPrice;
    }

    @NotNull
    public final String component3() {
        return this.priceChangeMode;
    }

    @NotNull
    public final String component4() {
        return this.priceChangeState;
    }

    @NotNull
    public final SubscriptionItemPriceChangeDetails copy(@NotNull String str, @Nullable Money money, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new SubscriptionItemPriceChangeDetails(str, money, str2, str3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionItemPriceChangeDetails)) {
            return false;
        }
        SubscriptionItemPriceChangeDetails subscriptionItemPriceChangeDetails = (SubscriptionItemPriceChangeDetails) obj;
        return Intrinsics.areEqual(this.expectedNewPriceChargeTime, subscriptionItemPriceChangeDetails.expectedNewPriceChargeTime) && Intrinsics.areEqual(this.newPrice, subscriptionItemPriceChangeDetails.newPrice) && Intrinsics.areEqual(this.priceChangeMode, subscriptionItemPriceChangeDetails.priceChangeMode) && Intrinsics.areEqual(this.priceChangeState, subscriptionItemPriceChangeDetails.priceChangeState);
    }

    @i(name = "getExpectedNewPriceChargeTime")
    @NotNull
    public final String getExpectedNewPriceChargeTime() {
        return this.expectedNewPriceChargeTime;
    }

    @i(name = "getNewPrice")
    @Nullable
    public final Money getNewPrice() {
        return this.newPrice;
    }

    @i(name = "getPriceChangeMode")
    @NotNull
    public final String getPriceChangeMode() {
        return this.priceChangeMode;
    }

    @i(name = "getPriceChangeState")
    @NotNull
    public final String getPriceChangeState() {
        return this.priceChangeState;
    }

    public final int hashCode() {
        int iHashCode = this.expectedNewPriceChargeTime.hashCode() * 31;
        Money money = this.newPrice;
        return ((((iHashCode + (money == null ? 0 : money.hashCode())) * 31) + this.priceChangeMode.hashCode()) * 31) + this.priceChangeState.hashCode();
    }

    @NotNull
    public final String toString() {
        return "SubscriptionItemPriceChangeDetails(expectedNewPriceChargeTime=" + this.expectedNewPriceChargeTime + ", newPrice=" + this.newPrice + ", priceChangeMode=" + this.priceChangeMode + ", priceChangeState=" + this.priceChangeState + ")";
    }
}
