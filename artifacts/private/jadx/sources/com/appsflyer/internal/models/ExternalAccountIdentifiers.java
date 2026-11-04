package com.appsflyer.internal.models;

import android.util.TypedValue;
import android.view.ViewConfiguration;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1l;
import com.planner5d.library.engine.input.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ExternalAccountIdentifiers {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String externalAccountId;

    @NotNull
    private final String obfuscatedExternalAccountId;

    @NotNull
    private final String obfuscatedExternalProfileId;

    public static final class Companion implements Deserialize<ExternalAccountIdentifiers> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int[] InAppPurchaseEvent = {-485636271, -1219598997, -513763532, 343617272, 1616993562, -1081921433, -1053499342, 1774429420, 366298925, -965994394, -810835173, -370546569, 1024917710, -1330605899, 2135367355, 1739335227, -1315553218, 542003158};
        private static int getPackageName = 1;
        private static int toJsonMap;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(int[] iArr, int i10, Object[] objArr) {
            int length;
            int[] iArr2;
            int i11;
            int length2;
            int[] iArr3;
            AFPurchaseConnectorA1l aFPurchaseConnectorA1l = new AFPurchaseConnectorA1l();
            char[] cArr = new char[4];
            char c10 = 2;
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr4 = InAppPurchaseEvent;
            long j10 = 5408325179024382648L;
            if (iArr4 != null) {
                int i12 = $10 + f.b.f160733u1;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    length2 = iArr4.length;
                    iArr3 = new int[length2];
                } else {
                    length2 = iArr4.length;
                    iArr3 = new int[length2];
                }
                int i13 = 0;
                while (i13 < length2) {
                    iArr3[i13] = (int) (((long) iArr4[i13]) ^ 5408325179024382648L);
                    i13++;
                    $11 = ($10 + 113) % 128;
                }
                iArr4 = iArr3;
            }
            int length3 = iArr4.length;
            int[] iArr5 = new int[length3];
            int[] iArr6 = InAppPurchaseEvent;
            if (iArr6 != null) {
                int i14 = $10 + 17;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    length = iArr6.length;
                    iArr2 = new int[length];
                    i11 = 1;
                } else {
                    length = iArr6.length;
                    iArr2 = new int[length];
                    i11 = 0;
                }
                while (i11 < length) {
                    $10 = ($11 + 65) % 128;
                    long j11 = j10;
                    iArr2[i11] = (int) (((long) iArr6[i11]) ^ j11);
                    i11++;
                    c10 = c10;
                    j10 = j11;
                }
                iArr6 = iArr2;
            }
            char c11 = c10;
            System.arraycopy(iArr6, 0, iArr5, 0, length3);
            aFPurchaseConnectorA1l.toJsonMap = 0;
            while (true) {
                int i15 = aFPurchaseConnectorA1l.toJsonMap;
                if (i15 >= iArr.length) {
                    objArr[0] = new String(cArr2, 0, i10);
                    return;
                }
                $10 = ($11 + 93) % 128;
                int i16 = iArr[i15];
                char c12 = (char) (i16 >> 16);
                cArr[0] = c12;
                char c13 = (char) i16;
                cArr[1] = c13;
                char c14 = (char) (iArr[i15 + 1] >> 16);
                cArr[c11] = c14;
                char c15 = (char) iArr[i15 + 1];
                cArr[3] = c15;
                aFPurchaseConnectorA1l.InAppPurchaseEvent = (c12 << 16) + c13;
                aFPurchaseConnectorA1l.getPackageName = (c14 << 16) + c15;
                AFPurchaseConnectorA1l.getOneTimePurchaseOfferDetails(iArr5);
                for (int i17 = 0; i17 < 16; i17++) {
                    $11 = ($10 + 75) % 128;
                    int i18 = aFPurchaseConnectorA1l.InAppPurchaseEvent ^ iArr5[i17];
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
                int i22 = i20 ^ iArr5[16];
                aFPurchaseConnectorA1l.getPackageName = i22;
                int i23 = i21 ^ iArr5[17];
                aFPurchaseConnectorA1l.InAppPurchaseEvent = i23;
                cArr[0] = (char) (i23 >>> 16);
                cArr[1] = (char) i23;
                cArr[c11] = (char) (i22 >>> 16);
                cArr[3] = (char) i22;
                AFPurchaseConnectorA1l.getOneTimePurchaseOfferDetails(iArr5);
                int i24 = aFPurchaseConnectorA1l.toJsonMap;
                cArr2[i24 * 2] = cArr[0];
                cArr2[(i24 * 2) + 1] = cArr[1];
                cArr2[(i24 * 2) + 2] = cArr[c11];
                cArr2[(i24 * 2) + 3] = cArr[3];
                aFPurchaseConnectorA1l.toJsonMap = i24 + 2;
                $10 = ($11 + 57) % 128;
            }
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ ExternalAccountIdentifiers fromJson(JSONObject jSONObject) {
            toJsonMap = (getPackageName + 49) % 128;
            ExternalAccountIdentifiers externalAccountIdentifiersFromJson = fromJson(jSONObject);
            getPackageName = (toJsonMap + 17) % 128;
            return externalAccountIdentifiersFromJson;
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public final ExternalAccountIdentifiers fromJson(@NotNull JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Object[] objArr = new Object[1];
            a(new int[]{126664855, -1037812878, 1525759882, -816349079, -1666817295, -1056977328, -429768831, -1575062869, -1278138098, 739502202}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 17, objArr);
            String strOptString = jSONObject.optString(((String) objArr[0]).intern());
            Intrinsics.checkNotNullExpressionValue(strOptString, "");
            Object[] objArr2 = new Object[1];
            a(new int[]{1729086955, 1070345055, 338686421, 1233051826, 800133111, 303072051, -243876786, -1711538829, -999375124, 2108674113, 1869641042, 577200820, 92988955, -1331832491}, 27 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr2);
            String strOptString2 = jSONObject.optString(((String) objArr2[0]).intern());
            Intrinsics.checkNotNullExpressionValue(strOptString2, "");
            int i10 = 2 << 0;
            Object[] objArr3 = new Object[1];
            a(new int[]{1729086955, 1070345055, 338686421, 1233051826, 800133111, 303072051, -243876786, -1711538829, 1461272460, -1249544372, 1735950822, -228958192, -211328723, -1350559847}, 27 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr3);
            String strOptString3 = jSONObject.optString(((String) objArr3[0]).intern());
            Intrinsics.checkNotNullExpressionValue(strOptString3, "");
            ExternalAccountIdentifiers externalAccountIdentifiers = new ExternalAccountIdentifiers(strOptString, strOptString2, strOptString3);
            int i11 = toJsonMap + 91;
            getPackageName = i11 % 128;
            if (i11 % 2 != 0) {
                return externalAccountIdentifiers;
            }
            throw null;
        }
    }

    public ExternalAccountIdentifiers(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.externalAccountId = str;
        this.obfuscatedExternalAccountId = str2;
        this.obfuscatedExternalProfileId = str3;
    }

    public static /* synthetic */ ExternalAccountIdentifiers copy$default(ExternalAccountIdentifiers externalAccountIdentifiers, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = externalAccountIdentifiers.externalAccountId;
        }
        if ((i10 & 2) != 0) {
            str2 = externalAccountIdentifiers.obfuscatedExternalAccountId;
        }
        if ((i10 & 4) != 0) {
            str3 = externalAccountIdentifiers.obfuscatedExternalProfileId;
        }
        return externalAccountIdentifiers.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.externalAccountId;
    }

    @NotNull
    public final String component2() {
        return this.obfuscatedExternalAccountId;
    }

    @NotNull
    public final String component3() {
        return this.obfuscatedExternalProfileId;
    }

    @NotNull
    public final ExternalAccountIdentifiers copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new ExternalAccountIdentifiers(str, str2, str3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExternalAccountIdentifiers)) {
            return false;
        }
        ExternalAccountIdentifiers externalAccountIdentifiers = (ExternalAccountIdentifiers) obj;
        return Intrinsics.areEqual(this.externalAccountId, externalAccountIdentifiers.externalAccountId) && Intrinsics.areEqual(this.obfuscatedExternalAccountId, externalAccountIdentifiers.obfuscatedExternalAccountId) && Intrinsics.areEqual(this.obfuscatedExternalProfileId, externalAccountIdentifiers.obfuscatedExternalProfileId);
    }

    @i(name = "getExternalAccountId")
    @NotNull
    public final String getExternalAccountId() {
        return this.externalAccountId;
    }

    @i(name = "getObfuscatedExternalAccountId")
    @NotNull
    public final String getObfuscatedExternalAccountId() {
        return this.obfuscatedExternalAccountId;
    }

    @i(name = "getObfuscatedExternalProfileId")
    @NotNull
    public final String getObfuscatedExternalProfileId() {
        return this.obfuscatedExternalProfileId;
    }

    public final int hashCode() {
        return (((this.externalAccountId.hashCode() * 31) + this.obfuscatedExternalAccountId.hashCode()) * 31) + this.obfuscatedExternalProfileId.hashCode();
    }

    @NotNull
    public final String toString() {
        return "ExternalAccountIdentifiers(externalAccountId=" + this.externalAccountId + ", obfuscatedExternalAccountId=" + this.obfuscatedExternalAccountId + ", obfuscatedExternalProfileId=" + this.obfuscatedExternalProfileId + ")";
    }
}
