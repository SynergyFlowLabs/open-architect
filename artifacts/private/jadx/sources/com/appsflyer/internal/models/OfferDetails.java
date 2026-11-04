package com.appsflyer.internal.models;

import android.graphics.Color;
import android.view.ViewConfiguration;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1h;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class OfferDetails {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String basePlanId;

    @Nullable
    private final String offerId;

    @Nullable
    private final List<String> offerTags;

    public static final class Companion implements Deserialize<OfferDetails> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static long InAppPurchaseEvent = -6841597428335928649L;
        private static int getPackageName = 1;
        private static int getQuantity;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(String str, int i10, Object[] objArr) {
            Object charArray = str;
            if (str != null) {
                $11 = ($10 + 29) % 128;
                charArray = str.toCharArray();
            }
            AFPurchaseConnectorA1h aFPurchaseConnectorA1h = new AFPurchaseConnectorA1h();
            char[] jsonMap = AFPurchaseConnectorA1h.toJsonMap(InAppPurchaseEvent ^ 2453322609447673138L, (char[]) charArray, i10);
            aFPurchaseConnectorA1h.InAppPurchaseEvent = 4;
            while (true) {
                int i11 = aFPurchaseConnectorA1h.InAppPurchaseEvent;
                if (i11 >= jsonMap.length) {
                    String str2 = new String(jsonMap, 4, jsonMap.length - 4);
                    $11 = ($10 + 17) % 128;
                    objArr[0] = str2;
                    return;
                } else {
                    $11 = ($10 + 71) % 128;
                    int i12 = i11 - 4;
                    aFPurchaseConnectorA1h.toJsonMap = i12;
                    jsonMap[i11] = (char) (((long) (jsonMap[i11] ^ jsonMap[i11 % 4])) ^ (((long) i12) * (InAppPurchaseEvent ^ 2453322609447673138L)));
                    aFPurchaseConnectorA1h.InAppPurchaseEvent = i11 + 1;
                }
            }
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ OfferDetails fromJson(JSONObject jSONObject) {
            getPackageName = (getQuantity + 115) % 128;
            OfferDetails offerDetailsFromJson = fromJson(jSONObject);
            getQuantity = (getPackageName + 85) % 128;
            return offerDetailsFromJson;
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public final OfferDetails fromJson(@NotNull JSONObject jSONObject) {
            List list;
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Object[] objArr = new Object[1];
            a("쓶쒙䯒찱➲\uecd6\uda90⣞稼\uee1f֡컸\uf8ad", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(((String) objArr[0]).intern());
            if (jSONArrayOptJSONArray != null) {
                Intrinsics.checkNotNullExpressionValue(jSONArrayOptJSONArray, "");
                list = SubscriptionPurchaseKt.toList(jSONArrayOptJSONArray);
            } else {
                list = null;
            }
            Object[] objArr2 = new Object[1];
            a("町畘韣ဇᘌ끕歾\u1975⚿㈖㐊鉲䥛吪", 1 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr2);
            String strOptString = jSONObject.optString(((String) objArr2[0]).intern());
            Intrinsics.checkNotNullExpressionValue(strOptString, "");
            Object[] objArr3 = new Object[1];
            a("柟枰쿽䠞亊汪禹䇦婢樭沜", 1 - Color.argb(0, 0, 0, 0), objArr3);
            return new OfferDetails(list, strOptString, (String) SubscriptionPurchaseKt.getNullable(jSONObject, ((String) objArr3[0]).intern()));
        }
    }

    public OfferDetails(@Nullable List<String> list, @NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.offerTags = list;
        this.basePlanId = str;
        this.offerId = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OfferDetails copy$default(OfferDetails offerDetails, List list, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = offerDetails.offerTags;
        }
        if ((i10 & 2) != 0) {
            str = offerDetails.basePlanId;
        }
        if ((i10 & 4) != 0) {
            str2 = offerDetails.offerId;
        }
        return offerDetails.copy(list, str, str2);
    }

    @Nullable
    public final List<String> component1() {
        return this.offerTags;
    }

    @NotNull
    public final String component2() {
        return this.basePlanId;
    }

    @Nullable
    public final String component3() {
        return this.offerId;
    }

    @NotNull
    public final OfferDetails copy(@Nullable List<String> list, @NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new OfferDetails(list, str, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferDetails)) {
            return false;
        }
        OfferDetails offerDetails = (OfferDetails) obj;
        return Intrinsics.areEqual(this.offerTags, offerDetails.offerTags) && Intrinsics.areEqual(this.basePlanId, offerDetails.basePlanId) && Intrinsics.areEqual(this.offerId, offerDetails.offerId);
    }

    @i(name = "getBasePlanId")
    @NotNull
    public final String getBasePlanId() {
        return this.basePlanId;
    }

    @i(name = "getOfferId")
    @Nullable
    public final String getOfferId() {
        return this.offerId;
    }

    @i(name = "getOfferTags")
    @Nullable
    public final List<String> getOfferTags() {
        return this.offerTags;
    }

    public final int hashCode() {
        List<String> list = this.offerTags;
        int iHashCode = (((list == null ? 0 : list.hashCode()) * 31) + this.basePlanId.hashCode()) * 31;
        String str = this.offerId;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "OfferDetails(offerTags=" + this.offerTags + ", basePlanId=" + this.basePlanId + ", offerId=" + this.offerId + ")";
    }
}
