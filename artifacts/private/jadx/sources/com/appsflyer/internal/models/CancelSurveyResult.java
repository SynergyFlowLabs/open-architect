package com.appsflyer.internal.models;

import android.text.TextUtils;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1b;
import com.planner5d.library.engine.input.f;
import java.io.UnsupportedEncodingException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.relex.circleindicator.a;
import oj.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class CancelSurveyResult {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String reason;

    @NotNull
    private final String reasonUserInput;

    public static final class Companion implements Deserialize<CancelSurveyResult> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static boolean InAppPurchaseEvent = true;
        private static int equals = 1;
        private static char[] getOneTimePurchaseOfferDetails = {28631, 28632, 28452, 28630, 28626, 28627, 28456, 28476, 28629, 28616, 28617};
        private static int getPackageName = 0;
        private static boolean getQuantity = true;
        private static int toJsonMap = -1580241083;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(int i10, int[] iArr, String str, String str2, Object[] objArr) throws UnsupportedEncodingException {
            int i11;
            int i12 = ($10 + 61) % 128;
            $11 = i12;
            Object bytes = str2;
            if (str2 != null) {
                int i13 = i12 + 125;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    str2.getBytes("ISO-8859-1");
                    throw null;
                }
                bytes = str2.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            AFPurchaseConnectorA1b aFPurchaseConnectorA1b = new AFPurchaseConnectorA1b();
            char[] cArr2 = getOneTimePurchaseOfferDetails;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i14 = 0;
                while (i14 < length) {
                    int i15 = $10 + 83;
                    $11 = i15 % 128;
                    if (i15 % 2 == 0) {
                        cArr3[i14] = (char) (((long) cArr2[i14]) & 560546097300205401L);
                        i14 >>>= 1;
                    } else {
                        cArr3[i14] = (char) (((long) cArr2[i14]) ^ 560546097300205401L);
                        i14++;
                    }
                }
                cArr2 = cArr3;
            }
            int i16 = (int) (560546097300205401L ^ ((long) toJsonMap));
            if (getQuantity) {
                int i17 = $10 + 113;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                int length2 = bArr.length;
                aFPurchaseConnectorA1b.getPackageName = length2;
                char[] cArr4 = new char[length2];
                aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails = 0;
                while (true) {
                    int i19 = aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails;
                    int i20 = aFPurchaseConnectorA1b.getPackageName;
                    if (i19 >= i20) {
                        objArr[0] = new String(cArr4);
                        return;
                    } else {
                        cArr4[i19] = (char) (cArr2[bArr[(i20 - 1) - i19] + i10] - i16);
                        aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails = i19 + 1;
                    }
                }
            } else if (InAppPurchaseEvent) {
                int length3 = cArr.length;
                aFPurchaseConnectorA1b.getPackageName = length3;
                char[] cArr5 = new char[length3];
                aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails = 0;
                while (true) {
                    int i21 = aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails;
                    int i22 = aFPurchaseConnectorA1b.getPackageName;
                    if (i21 >= i22) {
                        objArr[0] = new String(cArr5);
                        return;
                    } else {
                        cArr5[i21] = (char) (cArr2[cArr[(i22 - 1) - i21] - i10] - i16);
                        aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails = i21 + 1;
                    }
                }
            } else {
                int length4 = iArr.length;
                aFPurchaseConnectorA1b.getPackageName = length4;
                char[] cArr6 = new char[length4];
                aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails = 0;
                while (true) {
                    int i23 = aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails;
                    int i24 = aFPurchaseConnectorA1b.getPackageName;
                    if (i23 >= i24) {
                        objArr[0] = new String(cArr6);
                        return;
                    }
                    int i25 = $10 + a.f332619e;
                    $11 = i25 % 128;
                    if (i25 % 2 == 0) {
                        cArr6[i23] = (char) (cArr2[iArr[(i24 / 0) << i23] % i10] - i16);
                        i11 = i23 % 1;
                    } else {
                        cArr6[i23] = (char) (cArr2[iArr[(i24 - 1) - i23] - i10] - i16);
                        i11 = i23 + 1;
                    }
                    aFPurchaseConnectorA1b.getOneTimePurchaseOfferDetails = i11;
                }
            }
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ CancelSurveyResult fromJson(JSONObject jSONObject) throws UnsupportedEncodingException {
            equals = (getPackageName + 37) % 128;
            CancelSurveyResult cancelSurveyResultFromJson = fromJson(jSONObject);
            equals = (getPackageName + f.b.f160745y1) % 128;
            return cancelSurveyResultFromJson;
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public final CancelSurveyResult fromJson(@NotNull JSONObject jSONObject) throws UnsupportedEncodingException {
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Object[] objArr = new Object[1];
            a(127 - TextUtils.indexOf("", ""), null, null, "\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
            String strOptString = jSONObject.optString(((String) objArr[0]).intern());
            Intrinsics.checkNotNullExpressionValue(strOptString, "");
            Object[] objArr2 = new Object[1];
            a(TextUtils.indexOf("", "", 0, 0) + 127, null, null, "\u008b\u008a\u0089\u0086\u0088\u0081\u0082\u0084\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr2);
            String strOptString2 = jSONObject.optString(((String) objArr2[0]).intern());
            Intrinsics.checkNotNullExpressionValue(strOptString2, "");
            CancelSurveyResult cancelSurveyResult = new CancelSurveyResult(strOptString, strOptString2);
            int i10 = equals + 9;
            getPackageName = i10 % 128;
            if (i10 % 2 == 0) {
                return cancelSurveyResult;
            }
            throw null;
        }
    }

    public CancelSurveyResult(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.reason = str;
        this.reasonUserInput = str2;
    }

    public static /* synthetic */ CancelSurveyResult copy$default(CancelSurveyResult cancelSurveyResult, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cancelSurveyResult.reason;
        }
        if ((i10 & 2) != 0) {
            str2 = cancelSurveyResult.reasonUserInput;
        }
        return cancelSurveyResult.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.reason;
    }

    @NotNull
    public final String component2() {
        return this.reasonUserInput;
    }

    @NotNull
    public final CancelSurveyResult copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new CancelSurveyResult(str, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancelSurveyResult)) {
            return false;
        }
        CancelSurveyResult cancelSurveyResult = (CancelSurveyResult) obj;
        return Intrinsics.areEqual(this.reason, cancelSurveyResult.reason) && Intrinsics.areEqual(this.reasonUserInput, cancelSurveyResult.reasonUserInput);
    }

    @i(name = "getReason")
    @NotNull
    public final String getReason() {
        return this.reason;
    }

    @i(name = "getReasonUserInput")
    @NotNull
    public final String getReasonUserInput() {
        return this.reasonUserInput;
    }

    public final int hashCode() {
        return (this.reason.hashCode() * 31) + this.reasonUserInput.hashCode();
    }

    @NotNull
    public final String toString() {
        return "CancelSurveyResult(reason=" + this.reason + ", reasonUserInput=" + this.reasonUserInput + ")";
    }
}
