package com.appsflyer.internal.models;

import android.os.Process;
import android.view.View;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1l;
import com.rabbitmq.client.impl.k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.i;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ValidationFailureData {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String description;
    private final int status;

    public static final class Companion implements Deserialize<ValidationFailureData> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int[] InAppPurchaseEvent = {1184753440, -614547363, -557426887, -2071941262, -470330853, -1733631359, -1960579836, 1994853761, -1707033881, -1529291015, -664404608, -1953185519, -560226321, 520867442, -864384626, 1597813893, 555338520, 2143975416};
        private static int getOneTimePurchaseOfferDetails = 0;
        private static int toJsonMap = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(int[] iArr, int i10, Object[] objArr) {
            int length;
            int[] iArr2;
            int i11;
            AFPurchaseConnectorA1l aFPurchaseConnectorA1l = new AFPurchaseConnectorA1l();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = InAppPurchaseEvent;
            long j10 = 5408325179024382648L;
            if (iArr3 != null) {
                int i12 = $11 + 5;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    length = iArr3.length;
                    iArr2 = new int[length];
                    i11 = 1;
                } else {
                    length = iArr3.length;
                    iArr2 = new int[length];
                    i11 = 0;
                }
                while (i11 < length) {
                    int i13 = $10 + 1;
                    $11 = i13 % 128;
                    if (i13 % 2 == 0) {
                        iArr2[i11] = (int) (((long) iArr3[i11]) + 5408325179024382648L);
                    } else {
                        iArr2[i11] = (int) (((long) iArr3[i11]) ^ 5408325179024382648L);
                        i11++;
                    }
                }
                iArr3 = iArr2;
            }
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = InAppPurchaseEvent;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i14 = 0;
                while (i14 < length3) {
                    long j11 = j10;
                    iArr6[i14] = (int) (((long) iArr5[i14]) ^ j11);
                    i14++;
                    $10 = ($11 + 113) % 128;
                    j10 = j11;
                }
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            aFPurchaseConnectorA1l.toJsonMap = 0;
            $10 = ($11 + 37) % 128;
            while (true) {
                int i15 = aFPurchaseConnectorA1l.toJsonMap;
                if (i15 >= iArr.length) {
                    objArr[0] = new String(cArr2, 0, i10);
                    return;
                }
                int i16 = iArr[i15];
                char c10 = (char) (i16 >> 16);
                cArr[0] = c10;
                char c11 = (char) i16;
                cArr[1] = c11;
                char c12 = (char) (iArr[i15 + 1] >> 16);
                cArr[2] = c12;
                char c13 = (char) iArr[i15 + 1];
                cArr[3] = c13;
                aFPurchaseConnectorA1l.InAppPurchaseEvent = (c10 << 16) + c11;
                aFPurchaseConnectorA1l.getPackageName = (c12 << 16) + c13;
                AFPurchaseConnectorA1l.getOneTimePurchaseOfferDetails(iArr4);
                for (int i17 = 0; i17 < 16; i17++) {
                    $11 = ($10 + 85) % 128;
                    int i18 = aFPurchaseConnectorA1l.InAppPurchaseEvent ^ iArr4[i17];
                    aFPurchaseConnectorA1l.InAppPurchaseEvent = i18;
                    int jsonMap = AFPurchaseConnectorA1l.toJsonMap(i18) ^ aFPurchaseConnectorA1l.getPackageName;
                    int i19 = aFPurchaseConnectorA1l.InAppPurchaseEvent;
                    aFPurchaseConnectorA1l.InAppPurchaseEvent = jsonMap;
                    aFPurchaseConnectorA1l.getPackageName = i19;
                }
                int i20 = aFPurchaseConnectorA1l.InAppPurchaseEvent;
                int i21 = aFPurchaseConnectorA1l.getPackageName;
                aFPurchaseConnectorA1l.InAppPurchaseEvent = i21;
                aFPurchaseConnectorA1l.getPackageName = i20;
                int i22 = i20 ^ iArr4[16];
                aFPurchaseConnectorA1l.getPackageName = i22;
                int i23 = i21 ^ iArr4[17];
                aFPurchaseConnectorA1l.InAppPurchaseEvent = i23;
                cArr[0] = (char) (i23 >>> 16);
                cArr[1] = (char) i23;
                cArr[2] = (char) (i22 >>> 16);
                cArr[3] = (char) i22;
                AFPurchaseConnectorA1l.getOneTimePurchaseOfferDetails(iArr4);
                int i24 = aFPurchaseConnectorA1l.toJsonMap;
                cArr2[i24 * 2] = cArr[0];
                cArr2[(i24 * 2) + 1] = cArr[1];
                cArr2[(i24 * 2) + 2] = cArr[2];
                cArr2[(i24 * 2) + 3] = cArr[3];
                aFPurchaseConnectorA1l.toJsonMap = i24 + 2;
            }
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ ValidationFailureData fromJson(JSONObject jSONObject) {
            getOneTimePurchaseOfferDetails = (toJsonMap + k.b.p.f265340a) % 128;
            ValidationFailureData validationFailureDataFromJson = fromJson(jSONObject);
            int i10 = getOneTimePurchaseOfferDetails + 71;
            toJsonMap = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 14 / 0;
            }
            return validationFailureDataFromJson;
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @n
        @NotNull
        public final ValidationFailureData fromJson(@NotNull JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Object[] objArr = new Object[1];
            a(new int[]{951631232, 1857583723, -1044989934, -1279926831}, ((Process.getThreadPriority(0) + 20) >> 6) + 6, objArr);
            int iOptInt = jSONObject.optInt(((String) objArr[0]).intern(), -1);
            Object[] objArr2 = new Object[1];
            a(new int[]{-20025958, -1197313684, 1577181742, -1577894717, 740842722, 1418954757}, View.resolveSizeAndState(0, 0, 0) + 11, objArr2);
            String strOptString = jSONObject.optString(((String) objArr2[0]).intern());
            Intrinsics.checkNotNullExpressionValue(strOptString, "");
            ValidationFailureData validationFailureData = new ValidationFailureData(iOptInt, strOptString);
            toJsonMap = (getOneTimePurchaseOfferDetails + 13) % 128;
            return validationFailureData;
        }
    }

    public ValidationFailureData(int i10, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.status = i10;
        this.description = str;
    }

    public static /* synthetic */ ValidationFailureData copy$default(ValidationFailureData validationFailureData, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = validationFailureData.status;
        }
        if ((i11 & 2) != 0) {
            str = validationFailureData.description;
        }
        return validationFailureData.copy(i10, str);
    }

    @n
    @NotNull
    public static ValidationFailureData fromJson(@NotNull JSONObject jSONObject) {
        return Companion.fromJson(jSONObject);
    }

    public final int component1() {
        return this.status;
    }

    @NotNull
    public final String component2() {
        return this.description;
    }

    @NotNull
    public final ValidationFailureData copy(int i10, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ValidationFailureData(i10, str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidationFailureData)) {
            return false;
        }
        ValidationFailureData validationFailureData = (ValidationFailureData) obj;
        return this.status == validationFailureData.status && Intrinsics.areEqual(this.description, validationFailureData.description);
    }

    @i(name = "getDescription")
    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @i(name = "getStatus")
    public final int getStatus() {
        return this.status;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.status) * 31) + this.description.hashCode();
    }

    @NotNull
    public final String toString() {
        return "ValidationFailureData(status=" + this.status + ", description=" + this.description + ")";
    }
}
