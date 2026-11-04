package com.appsflyer.internal.models;

import android.view.ViewConfiguration;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class DeferredItemReplacement {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String productId;

    public static final class Companion implements Deserialize<DeferredItemReplacement> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static long InAppPurchaseEvent = -3940317942986633817L;
        private static int getOneTimePurchaseOfferDetails = 0;
        private static int getQuantity = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(String str, int i10, Object[] objArr) {
            Object obj = str;
            if (str != null) {
                int i11 = $10 + 5;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    str.toCharArray();
                    throw null;
                }
                char[] charArray = str.toCharArray();
                $11 = ($10 + 17) % 128;
                obj = charArray;
            }
            char[] cArr = (char[]) obj;
            AFPurchaseConnectorA1d aFPurchaseConnectorA1d = new AFPurchaseConnectorA1d();
            aFPurchaseConnectorA1d.getPackageName = i10;
            int length = cArr.length;
            long[] jArr = new long[length];
            aFPurchaseConnectorA1d.getQuantity = 0;
            while (true) {
                int i12 = aFPurchaseConnectorA1d.getQuantity;
                if (i12 >= cArr.length) {
                    break;
                }
                jArr[i12] = (((long) cArr[i12]) ^ (((long) i12) * ((long) aFPurchaseConnectorA1d.getPackageName))) ^ (InAppPurchaseEvent ^ 5401673019792501968L);
                aFPurchaseConnectorA1d.getQuantity = i12 + 1;
            }
            char[] cArr2 = new char[length];
            aFPurchaseConnectorA1d.getQuantity = 0;
            while (true) {
                int i13 = aFPurchaseConnectorA1d.getQuantity;
                if (i13 >= cArr.length) {
                    objArr[0] = new String(cArr2);
                    return;
                } else {
                    cArr2[i13] = (char) jArr[i13];
                    aFPurchaseConnectorA1d.getQuantity = i13 + 1;
                }
            }
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ DeferredItemReplacement fromJson(JSONObject jSONObject) {
            int i10 = getQuantity + 11;
            getOneTimePurchaseOfferDetails = i10 % 128;
            if (i10 % 2 != 0) {
                fromJson(jSONObject);
                throw null;
            }
            DeferredItemReplacement deferredItemReplacementFromJson = fromJson(jSONObject);
            getOneTimePurchaseOfferDetails = (getQuantity + 7) % 128;
            return deferredItemReplacementFromJson;
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public final DeferredItemReplacement fromJson(@NotNull JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Object[] objArr = new Object[1];
            a("ℇ탐슲\uf46c\ue656頽诽뷭꾻", 61909 - (ViewConfiguration.getEdgeSlop() >> 16), objArr);
            String strOptString = jSONObject.optString(((String) objArr[0]).intern());
            Intrinsics.checkNotNullExpressionValue(strOptString, "");
            DeferredItemReplacement deferredItemReplacement = new DeferredItemReplacement(strOptString);
            int i10 = getOneTimePurchaseOfferDetails + 59;
            getQuantity = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 6 / 0;
            }
            return deferredItemReplacement;
        }
    }

    public DeferredItemReplacement(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.productId = str;
    }

    public static /* synthetic */ DeferredItemReplacement copy$default(DeferredItemReplacement deferredItemReplacement, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = deferredItemReplacement.productId;
        }
        return deferredItemReplacement.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.productId;
    }

    @NotNull
    public final DeferredItemReplacement copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new DeferredItemReplacement(str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof DeferredItemReplacement) && Intrinsics.areEqual(this.productId, ((DeferredItemReplacement) obj).productId)) {
            return true;
        }
        return false;
    }

    @i(name = "getProductId")
    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    public final int hashCode() {
        return this.productId.hashCode();
    }

    @NotNull
    public final String toString() {
        return "DeferredItemReplacement(productId=" + this.productId + ")";
    }
}
