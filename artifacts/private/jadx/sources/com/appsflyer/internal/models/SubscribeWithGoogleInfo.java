package com.appsflyer.internal.models;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1g;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1l;
import com.rabbitmq.client.impl.k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.relex.circleindicator.a;
import oj.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class SubscribeWithGoogleInfo {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String emailAddress;

    @NotNull
    private final String familyName;

    @NotNull
    private final String givenName;

    @NotNull
    private final String profileId;

    @NotNull
    private final String profileName;

    public static final class Companion implements Deserialize<SubscribeWithGoogleInfo> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int[] InAppPurchaseEvent = {-1237562001, 1233552516, -950745246, 427936565, 1920787937, 142616753, -1757153130, 1263155230, -1498614196, 430789417, -1302169760, 928885690, -32447128, 462193631, -2109179455, -590662925, 69029299, -1113998520};
        private static int getOneTimePurchaseOfferDetails = 0;
        private static long getPackageName = -5937322942767281808L;
        private static char getQuantity = 65133;
        private static int hashCode = 1;
        private static int toJsonMap = -1483454096;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0015  */
        /* JADX WARN: Code duplicated, block: B:9:0x0020  */
        private static void a(String str, int i10, String str2, char c10, String str3, Object[] objArr) {
            Object charArray;
            char[] charArray2;
            char[] charArray3;
            int i11 = $10 + 65;
            int i12 = i11 % 128;
            $11 = i12;
            if (i11 % 2 == 0) {
                int i13 = 41 / 0;
                if (str3 != null) {
                    $10 = (i12 + 121) % 128;
                    charArray = str3.toCharArray();
                } else {
                    charArray = str3;
                }
            } else if (str3 != null) {
                $10 = (i12 + 121) % 128;
                charArray = str3.toCharArray();
            } else {
                charArray = str3;
            }
            char[] cArr = (char[]) charArray;
            if (str2 != null) {
                charArray2 = str2.toCharArray();
                $11 = ($10 + 47) % 128;
            } else {
                charArray2 = str2;
            }
            char[] cArr2 = charArray2;
            if (str != null) {
                $11 = ($10 + a.f332619e) % 128;
                charArray3 = str.toCharArray();
            } else {
                charArray3 = str;
            }
            char[] cArr3 = charArray3;
            AFPurchaseConnectorA1g aFPurchaseConnectorA1g = new AFPurchaseConnectorA1g();
            int length = cArr2.length;
            char[] cArr4 = new char[length];
            int length2 = cArr3.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr2, 0, cArr4, 0, length);
            System.arraycopy(cArr3, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c10);
            cArr5[2] = (char) (cArr5[2] + ((char) i10));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            aFPurchaseConnectorA1g.toJsonMap = 0;
            while (true) {
                int i14 = aFPurchaseConnectorA1g.toJsonMap;
                if (i14 >= length3) {
                    objArr[0] = new String(cArr6);
                    return;
                }
                int i15 = (i14 + 3) % 4;
                int i16 = cArr4[i14 % 4] * 32718;
                char c11 = cArr5[(i14 + 2) % 4];
                char c12 = (char) ((i16 + c11) % 65535);
                aFPurchaseConnectorA1g.InAppPurchaseEvent = c12;
                cArr5[i15] = (char) (((cArr4[i15] * 32718) + c11) / 65535);
                cArr4[i15] = c12;
                cArr6[i14] = (char) (((((long) (cArr[i14] ^ c12)) ^ (getPackageName ^ (-5937322942767281808L))) ^ ((long) ((int) (((long) toJsonMap) ^ (-5937322942767281808L))))) ^ ((long) ((char) (((long) getQuantity) ^ (-5937322942767281808L)))));
                aFPurchaseConnectorA1g.toJsonMap = i14 + 1;
            }
        }

        private static void b(int[] iArr, int i10, Object[] objArr) {
            int length;
            int[] iArr2;
            int length2;
            int[] iArr3;
            AFPurchaseConnectorA1l aFPurchaseConnectorA1l = new AFPurchaseConnectorA1l();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr4 = InAppPurchaseEvent;
            long j10 = 5408325179024382648L;
            if (iArr4 != null) {
                int i11 = $10 + 57;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    length2 = iArr4.length;
                    iArr3 = new int[length2];
                } else {
                    length2 = iArr4.length;
                    iArr3 = new int[length2];
                }
                int i12 = 0;
                while (i12 < length2) {
                    iArr3[i12] = (int) (((long) iArr4[i12]) ^ 5408325179024382648L);
                    i12++;
                    $11 = ($10 + 21) % 128;
                }
                iArr4 = iArr3;
            }
            int length3 = iArr4.length;
            int[] iArr5 = new int[length3];
            int[] iArr6 = InAppPurchaseEvent;
            if (iArr6 != null) {
                int i13 = $11 + 97;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    length = iArr6.length;
                    iArr2 = new int[length];
                } else {
                    length = iArr6.length;
                    iArr2 = new int[length];
                }
                int i14 = 0;
                while (i14 < length) {
                    int i15 = $10;
                    $11 = (i15 + 63) % 128;
                    long j11 = j10;
                    iArr2[i14] = (int) (((long) iArr6[i14]) ^ j11);
                    i14++;
                    $11 = (i15 + 125) % 128;
                    j10 = j11;
                }
                iArr6 = iArr2;
            }
            System.arraycopy(iArr6, 0, iArr5, 0, length3);
            aFPurchaseConnectorA1l.toJsonMap = 0;
            while (true) {
                int i16 = aFPurchaseConnectorA1l.toJsonMap;
                if (i16 >= iArr.length) {
                    objArr[0] = new String(cArr2, 0, i10);
                    return;
                }
                int i17 = iArr[i16];
                char c10 = (char) (i17 >> 16);
                cArr[0] = c10;
                char c11 = (char) i17;
                cArr[1] = c11;
                char c12 = (char) (iArr[i16 + 1] >> 16);
                cArr[2] = c12;
                char c13 = (char) iArr[i16 + 1];
                cArr[3] = c13;
                aFPurchaseConnectorA1l.InAppPurchaseEvent = (c10 << 16) + c11;
                aFPurchaseConnectorA1l.getPackageName = (c12 << 16) + c13;
                AFPurchaseConnectorA1l.getOneTimePurchaseOfferDetails(iArr5);
                for (int i18 = 0; i18 < 16; i18++) {
                    int i19 = aFPurchaseConnectorA1l.InAppPurchaseEvent ^ iArr5[i18];
                    aFPurchaseConnectorA1l.InAppPurchaseEvent = i19;
                    int jsonMap = AFPurchaseConnectorA1l.toJsonMap(i19) ^ aFPurchaseConnectorA1l.getPackageName;
                    int i20 = aFPurchaseConnectorA1l.InAppPurchaseEvent;
                    aFPurchaseConnectorA1l.InAppPurchaseEvent = jsonMap;
                    aFPurchaseConnectorA1l.getPackageName = i20;
                }
                int i21 = aFPurchaseConnectorA1l.InAppPurchaseEvent;
                int i22 = aFPurchaseConnectorA1l.getPackageName;
                aFPurchaseConnectorA1l.InAppPurchaseEvent = i22;
                aFPurchaseConnectorA1l.getPackageName = i21;
                int i23 = i21 ^ iArr5[16];
                aFPurchaseConnectorA1l.getPackageName = i23;
                int i24 = i22 ^ iArr5[17];
                aFPurchaseConnectorA1l.InAppPurchaseEvent = i24;
                cArr[0] = (char) (i24 >>> 16);
                cArr[1] = (char) i24;
                cArr[2] = (char) (i23 >>> 16);
                cArr[3] = (char) i23;
                AFPurchaseConnectorA1l.getOneTimePurchaseOfferDetails(iArr5);
                int i25 = aFPurchaseConnectorA1l.toJsonMap;
                cArr2[i25 * 2] = cArr[0];
                cArr2[(i25 * 2) + 1] = cArr[1];
                cArr2[(i25 * 2) + 2] = cArr[2];
                cArr2[(i25 * 2) + 3] = cArr[3];
                aFPurchaseConnectorA1l.toJsonMap = i25 + 2;
            }
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ SubscribeWithGoogleInfo fromJson(JSONObject jSONObject) {
            hashCode = (getOneTimePurchaseOfferDetails + 83) % 128;
            SubscribeWithGoogleInfo subscribeWithGoogleInfoFromJson = fromJson(jSONObject);
            getOneTimePurchaseOfferDetails = (hashCode + 125) % 128;
            return subscribeWithGoogleInfoFromJson;
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public final SubscribeWithGoogleInfo fromJson(@NotNull JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Object[] objArr = new Object[1];
            a("\u0000\u0000\u0000\u0000", ViewConfiguration.getFadingEdgeLength() >> 16, "䉾뱨ꈖᗍ", (char) Drawable.resolveOpacity(0, 0), "鏮⯑纭ﱳポ㭯אּ龜㸒듷櫀Ꜿ", objArr);
            String strOptString = jSONObject.optString(((String) objArr[0]).intern());
            Intrinsics.checkNotNullExpressionValue(strOptString, "");
            Object[] objArr2 = new Object[1];
            a("\u0000\u0000\u0000\u0000", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, "뷇쀰蛆䊍", (char) Color.blue(0), "窛䂷\uf82b➏温㧄䑃鞌̥\udbc3", objArr2);
            String strOptString2 = jSONObject.optString(((String) objArr2[0]).intern());
            Intrinsics.checkNotNullExpressionValue(strOptString2, "");
            Object[] objArr3 = new Object[1];
            a("\u0000\u0000\u0000\u0000", 1488859987 - KeyEvent.normalizeMetaState(0), "叢븳\u0a58䢖", (char) View.resolveSize(0, 0), "䱵橏麱\ue425॥틴碛\ue40f뚸", objArr3);
            String strOptString3 = jSONObject.optString(((String) objArr3[0]).intern());
            Intrinsics.checkNotNullExpressionValue(strOptString3, "");
            Object[] objArr4 = new Object[1];
            a("\u0000\u0000\u0000\u0000", Color.red(0) + 1736322039, "\uf74f縫⭧⻏", (char) (ViewConfiguration.getFadingEdgeLength() >> 16), "浭蚚⁶ꂨ宵踃䫧뒱䜷", objArr4);
            String strOptString4 = jSONObject.optString(((String) objArr4[0]).intern());
            Intrinsics.checkNotNullExpressionValue(strOptString4, "");
            Object[] objArr5 = new Object[1];
            b(new int[]{1782154819, 1794414578, -671953396, 1753740219, 1110810306, -2090158234}, TextUtils.indexOf("", "", 0, 0) + 11, objArr5);
            String strOptString5 = jSONObject.optString(((String) objArr5[0]).intern());
            Intrinsics.checkNotNullExpressionValue(strOptString5, "");
            SubscribeWithGoogleInfo subscribeWithGoogleInfo = new SubscribeWithGoogleInfo(strOptString, strOptString2, strOptString3, strOptString4, strOptString5);
            hashCode = (getOneTimePurchaseOfferDetails + k.b.p.f265340a) % 128;
            return subscribeWithGoogleInfo;
        }
    }

    public SubscribeWithGoogleInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.emailAddress = str;
        this.familyName = str2;
        this.givenName = str3;
        this.profileId = str4;
        this.profileName = str5;
    }

    public static /* synthetic */ SubscribeWithGoogleInfo copy$default(SubscribeWithGoogleInfo subscribeWithGoogleInfo, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = subscribeWithGoogleInfo.emailAddress;
        }
        if ((i10 & 2) != 0) {
            str2 = subscribeWithGoogleInfo.familyName;
        }
        if ((i10 & 4) != 0) {
            str3 = subscribeWithGoogleInfo.givenName;
        }
        if ((i10 & 8) != 0) {
            str4 = subscribeWithGoogleInfo.profileId;
        }
        if ((i10 & 16) != 0) {
            str5 = subscribeWithGoogleInfo.profileName;
        }
        String str6 = str5;
        String str7 = str3;
        return subscribeWithGoogleInfo.copy(str, str2, str7, str4, str6);
    }

    @NotNull
    public final String component1() {
        return this.emailAddress;
    }

    @NotNull
    public final String component2() {
        return this.familyName;
    }

    @NotNull
    public final String component3() {
        return this.givenName;
    }

    @NotNull
    public final String component4() {
        return this.profileId;
    }

    @NotNull
    public final String component5() {
        return this.profileName;
    }

    @NotNull
    public final SubscribeWithGoogleInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new SubscribeWithGoogleInfo(str, str2, str3, str4, str5);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscribeWithGoogleInfo)) {
            return false;
        }
        SubscribeWithGoogleInfo subscribeWithGoogleInfo = (SubscribeWithGoogleInfo) obj;
        return Intrinsics.areEqual(this.emailAddress, subscribeWithGoogleInfo.emailAddress) && Intrinsics.areEqual(this.familyName, subscribeWithGoogleInfo.familyName) && Intrinsics.areEqual(this.givenName, subscribeWithGoogleInfo.givenName) && Intrinsics.areEqual(this.profileId, subscribeWithGoogleInfo.profileId) && Intrinsics.areEqual(this.profileName, subscribeWithGoogleInfo.profileName);
    }

    @i(name = "getEmailAddress")
    @NotNull
    public final String getEmailAddress() {
        return this.emailAddress;
    }

    @i(name = "getFamilyName")
    @NotNull
    public final String getFamilyName() {
        return this.familyName;
    }

    @i(name = "getGivenName")
    @NotNull
    public final String getGivenName() {
        return this.givenName;
    }

    @i(name = "getProfileId")
    @NotNull
    public final String getProfileId() {
        return this.profileId;
    }

    @i(name = "getProfileName")
    @NotNull
    public final String getProfileName() {
        return this.profileName;
    }

    public final int hashCode() {
        return (((((((this.emailAddress.hashCode() * 31) + this.familyName.hashCode()) * 31) + this.givenName.hashCode()) * 31) + this.profileId.hashCode()) * 31) + this.profileName.hashCode();
    }

    @NotNull
    public final String toString() {
        return "SubscribeWithGoogleInfo(emailAddress=" + this.emailAddress + ", familyName=" + this.familyName + ", givenName=" + this.givenName + ", profileId=" + this.profileId + ", profileName=" + this.profileName + ")";
    }
}
