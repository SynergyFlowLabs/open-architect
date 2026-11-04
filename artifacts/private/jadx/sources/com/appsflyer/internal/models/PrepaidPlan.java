package com.appsflyer.internal.models;

import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1k;
import com.rabbitmq.client.impl.k;
import java.io.UnsupportedEncodingException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class PrepaidPlan {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private final String allowExtendAfterTime;

    public static final class Companion implements Deserialize<PrepaidPlan> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int getOneTimePurchaseOfferDetails = 0;
        private static int getPackageName = 1;
        private static char[] toJsonMap = {60937, 61023, 61013, 61012, 61002, 61031, 61031, 61007, 61013, 61008, 61008, 61035, 61034, 61012, 61013, 61010, 61018, 61031, 61010, 61008};

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(boolean z10, String str, int[] iArr, Object[] objArr) throws UnsupportedEncodingException {
            String str2 = str;
            Object bytes = str2;
            if (str2 != null) {
                bytes = str2.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            AFPurchaseConnectorA1k aFPurchaseConnectorA1k = new AFPurchaseConnectorA1k();
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = iArr[2];
            int i13 = iArr[3];
            char[] cArr = toJsonMap;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                for (int i14 = 0; i14 < length; i14++) {
                    $11 = ($10 + 119) % 128;
                    cArr2[i14] = (char) (((long) cArr[i14]) ^ 738523797727735353L);
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i11];
            System.arraycopy(cArr, i10, cArr3, 0, i11);
            if (bArr != null) {
                char[] cArr4 = new char[i11];
                aFPurchaseConnectorA1k.getOneTimePurchaseOfferDetails = 0;
                char c10 = 0;
                while (true) {
                    int i15 = aFPurchaseConnectorA1k.getOneTimePurchaseOfferDetails;
                    if (i15 >= i11) {
                        break;
                    }
                    if (bArr[i15] == 1) {
                        cArr4[i15] = (char) (((cArr3[i15] * 2) + 1) - c10);
                    } else {
                        cArr4[i15] = (char) ((cArr3[i15] * 2) - c10);
                    }
                    c10 = cArr4[i15];
                    aFPurchaseConnectorA1k.getOneTimePurchaseOfferDetails = i15 + 1;
                }
                cArr3 = cArr4;
            }
            if (i13 > 0) {
                $10 = ($11 + 97) % 128;
                char[] cArr5 = new char[i11];
                System.arraycopy(cArr3, 0, cArr5, 0, i11);
                int i16 = i11 - i13;
                System.arraycopy(cArr5, 0, cArr3, i16, i13);
                System.arraycopy(cArr5, i13, cArr3, 0, i16);
            }
            if (z10) {
                char[] cArr6 = new char[i11];
                aFPurchaseConnectorA1k.getOneTimePurchaseOfferDetails = 0;
                while (true) {
                    int i17 = aFPurchaseConnectorA1k.getOneTimePurchaseOfferDetails;
                    if (i17 >= i11) {
                        break;
                    }
                    cArr6[i17] = cArr3[(i11 - i17) - 1];
                    aFPurchaseConnectorA1k.getOneTimePurchaseOfferDetails = i17 + 1;
                }
                cArr3 = cArr6;
            }
            if (i12 > 0) {
                aFPurchaseConnectorA1k.getOneTimePurchaseOfferDetails = 0;
                $10 = ($11 + k.b.p.f265340a) % 128;
                while (true) {
                    int i18 = aFPurchaseConnectorA1k.getOneTimePurchaseOfferDetails;
                    if (i18 >= i11) {
                        break;
                    }
                    cArr3[i18] = (char) (cArr3[i18] - iArr[2]);
                    aFPurchaseConnectorA1k.getOneTimePurchaseOfferDetails = i18 + 1;
                }
            }
            objArr[0] = new String(cArr3);
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* synthetic */ PrepaidPlan fromJson(JSONObject jSONObject) throws UnsupportedEncodingException {
            int i10 = getPackageName + 109;
            getOneTimePurchaseOfferDetails = i10 % 128;
            int i11 = i10 % 2;
            PrepaidPlan prepaidPlanFromJson = fromJson(jSONObject);
            if (i11 != 0) {
                int i12 = 4 / 0;
            }
            int i13 = getOneTimePurchaseOfferDetails + 85;
            getPackageName = i13 % 128;
            if (i13 % 2 != 0) {
                return prepaidPlanFromJson;
            }
            throw null;
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public final PrepaidPlan fromJson(@NotNull JSONObject jSONObject) throws UnsupportedEncodingException {
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Object[] objArr = new Object[1];
            a(false, "\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000", new int[]{0, 20, 0, 0}, objArr);
            PrepaidPlan prepaidPlan = new PrepaidPlan((String) SubscriptionPurchaseKt.getNullable(jSONObject, ((String) objArr[0]).intern()));
            int i10 = getPackageName + 87;
            getOneTimePurchaseOfferDetails = i10 % 128;
            if (i10 % 2 == 0) {
                return prepaidPlan;
            }
            throw null;
        }
    }

    public PrepaidPlan(@Nullable String str) {
        this.allowExtendAfterTime = str;
    }

    public static /* synthetic */ PrepaidPlan copy$default(PrepaidPlan prepaidPlan, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = prepaidPlan.allowExtendAfterTime;
        }
        return prepaidPlan.copy(str);
    }

    @Nullable
    public final String component1() {
        return this.allowExtendAfterTime;
    }

    @NotNull
    public final PrepaidPlan copy(@Nullable String str) {
        return new PrepaidPlan(str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof PrepaidPlan) && Intrinsics.areEqual(this.allowExtendAfterTime, ((PrepaidPlan) obj).allowExtendAfterTime)) {
            return true;
        }
        return false;
    }

    @i(name = "getAllowExtendAfterTime")
    @Nullable
    public final String getAllowExtendAfterTime() {
        return this.allowExtendAfterTime;
    }

    public final int hashCode() {
        String str = this.allowExtendAfterTime;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public final String toString() {
        return "PrepaidPlan(allowExtendAfterTime=" + this.allowExtendAfterTime + ")";
    }
}
