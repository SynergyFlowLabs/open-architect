package com.appsflyer.internal.models;

import androidx.media3.extractor.metadata.dvbsi.b;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1k;
import java.io.UnsupportedEncodingException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class Money {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String currencyCode;
    private final long nanos;
    private final long units;

    public static final class Companion implements Deserialize<Money> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char[] getOneTimePurchaseOfferDetails = {61097, 61222, 61213, 61229, 61216, 61200, 61210, 61213, 61215, 61204, 61207, 61214, 61000, 61154, 61154, 61147, 61148, 61093, 61197, 61207, 61192, 61199};
        private static int getPackageName = 0;
        private static int toJsonMap = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(boolean z10, String str, int[] iArr, Object[] objArr) throws UnsupportedEncodingException {
            String str2 = str;
            $11 = ($10 + 21) % 128;
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
            char[] cArr = getOneTimePurchaseOfferDetails;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                for (int i14 = 0; i14 < length; i14++) {
                    cArr2[i14] = (char) (((long) cArr[i14]) ^ 738523797727735353L);
                }
                $11 = ($10 + 89) % 128;
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
                char[] cArr5 = new char[i11];
                System.arraycopy(cArr3, 0, cArr5, 0, i11);
                int i16 = i11 - i13;
                System.arraycopy(cArr5, 0, cArr3, i16, i13);
                System.arraycopy(cArr5, i13, cArr3, 0, i16);
                $11 = ($10 + 105) % 128;
            }
            if (z10) {
                char[] cArr6 = new char[i11];
                aFPurchaseConnectorA1k.getOneTimePurchaseOfferDetails = 0;
                while (true) {
                    int i17 = aFPurchaseConnectorA1k.getOneTimePurchaseOfferDetails;
                    if (i17 >= i11) {
                        break;
                    }
                    $10 = ($11 + 37) % 128;
                    cArr6[i17] = cArr3[(i11 - i17) - 1];
                    aFPurchaseConnectorA1k.getOneTimePurchaseOfferDetails = i17 + 1;
                }
                cArr3 = cArr6;
            }
            if (i12 > 0) {
                int i18 = $10 + 35;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    aFPurchaseConnectorA1k.getOneTimePurchaseOfferDetails = 1;
                } else {
                    aFPurchaseConnectorA1k.getOneTimePurchaseOfferDetails = 0;
                }
                while (true) {
                    int i19 = aFPurchaseConnectorA1k.getOneTimePurchaseOfferDetails;
                    if (i19 >= i11) {
                        break;
                    }
                    cArr3[i19] = (char) (cArr3[i19] - iArr[2]);
                    aFPurchaseConnectorA1k.getOneTimePurchaseOfferDetails = i19 + 1;
                }
            }
            objArr[0] = new String(cArr3);
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ Money fromJson(JSONObject jSONObject) throws JSONException, UnsupportedEncodingException {
            getPackageName = (toJsonMap + 59) % 128;
            Money moneyFromJson = fromJson(jSONObject);
            toJsonMap = (getPackageName + 59) % 128;
            return moneyFromJson;
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public final Money fromJson(@NotNull JSONObject jSONObject) throws JSONException, UnsupportedEncodingException {
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Object[] objArr = new Object[1];
            a(true, "\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000", new int[]{0, 12, 187, 0}, objArr);
            String strOptString = jSONObject.optString(((String) objArr[0]).intern());
            Intrinsics.checkNotNullExpressionValue(strOptString, "");
            Object[] objArr2 = new Object[1];
            a(false, "\u0000\u0001\u0001\u0001\u0000", new int[]{12, 5, b.f67479d, 0}, objArr2);
            long j10 = jSONObject.getLong(((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            a(false, "\u0000\u0001\u0001\u0001\u0001", new int[]{17, 5, 195, 0}, objArr3);
            Money money = new Money(strOptString, j10, jSONObject.getLong(((String) objArr3[0]).intern()));
            getPackageName = (toJsonMap + 39) % 128;
            return money;
        }
    }

    public Money(@NotNull String str, long j10, long j11) {
        Intrinsics.checkNotNullParameter(str, "");
        this.currencyCode = str;
        this.nanos = j10;
        this.units = j11;
    }

    public static /* synthetic */ Money copy$default(Money money, String str, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = money.currencyCode;
        }
        if ((i10 & 2) != 0) {
            j10 = money.nanos;
        }
        if ((i10 & 4) != 0) {
            j11 = money.units;
        }
        return money.copy(str, j10, j11);
    }

    @NotNull
    public final String component1() {
        return this.currencyCode;
    }

    public final long component2() {
        return this.nanos;
    }

    public final long component3() {
        return this.units;
    }

    @NotNull
    public final Money copy(@NotNull String str, long j10, long j11) {
        Intrinsics.checkNotNullParameter(str, "");
        return new Money(str, j10, j11);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Money)) {
            return false;
        }
        Money money = (Money) obj;
        if (Intrinsics.areEqual(this.currencyCode, money.currencyCode) && this.nanos == money.nanos && this.units == money.units) {
            return true;
        }
        return false;
    }

    @i(name = "getCurrencyCode")
    @NotNull
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    @i(name = "getNanos")
    public final long getNanos() {
        return this.nanos;
    }

    @i(name = "getUnits")
    public final long getUnits() {
        return this.units;
    }

    public final int hashCode() {
        return (((this.currencyCode.hashCode() * 31) + Long.hashCode(this.nanos)) * 31) + Long.hashCode(this.units);
    }

    @NotNull
    public final String toString() {
        return "Money(currencyCode=" + this.currencyCode + ", nanos=" + this.nanos + ", units=" + this.units + ")";
    }
}
