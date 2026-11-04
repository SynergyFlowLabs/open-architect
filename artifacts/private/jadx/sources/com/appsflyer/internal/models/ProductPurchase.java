package com.appsflyer.internal.models;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1g;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1j;
import com.rabbitmq.client.impl.k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.i;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import org.locationtech.jts.geom.l;

/* JADX INFO: loaded from: classes3.dex */
public final class ProductPurchase {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final int acknowledgementState;
    private final int consumptionState;

    @NotNull
    private final String developerPayload;

    @NotNull
    private final String kind;

    @NotNull
    private final String obfuscatedExternalAccountId;

    @NotNull
    private final String obfuscatedExternalProfileId;

    @NotNull
    private final String orderId;

    @NotNull
    private final String productId;
    private final int purchaseState;

    @NotNull
    private final String purchaseTimeMillis;

    @NotNull
    private final String purchaseToken;
    private final int purchaseType;
    private final int quantity;

    @NotNull
    private final String regionCode;

    public static final class Companion implements Deserialize<ProductPurchase> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char InAppPurchaseEvent = 51384;
        private static int PurchaseClient = 0;
        private static int equals = -1483454096;
        private static char getOneTimePurchaseOfferDetails = 40004;
        private static long getPackageName = -4219115659944024191L;
        private static char getQuantity = 43461;
        private static int hashCode = 1;
        private static char stopObservingTransactions = 18800;
        private static char toJsonMap = 981;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(String str, int i10, Object[] objArr) {
            char[] charArray;
            int i11;
            if (str != null) {
                int i12 = $11 + k.b.p.f265340a;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    str.toCharArray();
                    throw null;
                }
                charArray = str.toCharArray();
            } else {
                charArray = str;
            }
            char[] cArr = charArray;
            AFPurchaseConnectorA1j aFPurchaseConnectorA1j = new AFPurchaseConnectorA1j();
            char[] cArr2 = new char[cArr.length];
            aFPurchaseConnectorA1j.getQuantity = 0;
            char[] cArr3 = new char[2];
            while (true) {
                int i13 = aFPurchaseConnectorA1j.getQuantity;
                if (i13 >= cArr.length) {
                    break;
                }
                int i14 = $11 + 37;
                $10 = i14 % 128;
                int i15 = 58224;
                if (i14 % 2 != 0) {
                    cArr3[0] = cArr[i13];
                    cArr3[1] = cArr[i13 % 0];
                    i11 = 1;
                } else {
                    cArr3[0] = cArr[i13];
                    cArr3[1] = cArr[i13 + 1];
                    i11 = 0;
                }
                while (i11 < 16) {
                    $11 = ($10 + 11) % 128;
                    char c10 = cArr3[1];
                    char c11 = cArr3[0];
                    char c12 = (char) (c10 - (((c11 + i15) ^ ((c11 << 4) + ((char) (((long) InAppPurchaseEvent) ^ 4722258354688939700L)))) ^ ((c11 >>> 5) + ((char) (((long) getQuantity) ^ 4722258354688939700L)))));
                    cArr3[1] = c12;
                    cArr3[0] = (char) (c11 - (((c12 >>> 5) + ((char) (((long) getOneTimePurchaseOfferDetails) ^ 4722258354688939700L))) ^ ((c12 + i15) ^ ((c12 << 4) + ((char) (((long) toJsonMap) ^ 4722258354688939700L))))));
                    i15 -= 40503;
                    i11++;
                }
                int i16 = aFPurchaseConnectorA1j.getQuantity;
                cArr2[i16] = cArr3[0];
                cArr2[i16 + 1] = cArr3[1];
                aFPurchaseConnectorA1j.getQuantity = i16 + 2;
            }
            String str2 = new String(cArr2, 0, i10);
            int i17 = $11 + 35;
            $10 = i17 % 128;
            if (i17 % 2 != 0) {
                throw null;
            }
            objArr[0] = str2;
        }

        private static void b(String str, char c10, String str2, String str3, int i10, Object[] objArr) {
            char[] charArray;
            int i11 = $10 + 51;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            char[] charArray2 = str3 != null ? str3.toCharArray() : str3;
            if (str2 != null) {
                int i12 = $10 + 59;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    str2.toCharArray();
                    throw null;
                }
                charArray = str2.toCharArray();
                $11 = ($10 + 97) % 128;
            } else {
                charArray = str2;
            }
            char[] cArr = charArray;
            char[] charArray3 = str != null ? str.toCharArray() : str;
            AFPurchaseConnectorA1g aFPurchaseConnectorA1g = new AFPurchaseConnectorA1g();
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int length2 = charArray3.length;
            char[] cArr3 = new char[length2];
            System.arraycopy(cArr, 0, cArr2, 0, length);
            System.arraycopy(charArray3, 0, cArr3, 0, length2);
            cArr2[0] = (char) (cArr2[0] ^ c10);
            cArr3[2] = (char) (cArr3[2] + ((char) i10));
            int length3 = charArray2.length;
            char[] cArr4 = new char[length3];
            aFPurchaseConnectorA1g.toJsonMap = 0;
            while (true) {
                int i13 = aFPurchaseConnectorA1g.toJsonMap;
                if (i13 >= length3) {
                    String str4 = new String(cArr4);
                    $10 = ($11 + 105) % 128;
                    objArr[0] = str4;
                    return;
                }
                $10 = ($11 + 81) % 128;
                int i14 = (i13 + 3) % 4;
                int i15 = cArr2[i13 % 4] * 32718;
                char c11 = cArr3[(i13 + 2) % 4];
                char c12 = (char) ((i15 + c11) % 65535);
                aFPurchaseConnectorA1g.InAppPurchaseEvent = c12;
                cArr3[i14] = (char) (((cArr2[i14] * 32718) + c11) / 65535);
                cArr2[i14] = c12;
                cArr4[i13] = (char) (((((long) (charArray2[i13] ^ c12)) ^ (getPackageName ^ (-5937322942767281808L))) ^ ((long) ((int) (((long) equals) ^ (-5937322942767281808L))))) ^ ((long) ((char) (((long) stopObservingTransactions) ^ (-5937322942767281808L)))));
                aFPurchaseConnectorA1g.toJsonMap = i13 + 1;
            }
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* synthetic */ ProductPurchase fromJson(JSONObject jSONObject) {
            PurchaseClient = (hashCode + 87) % 128;
            ProductPurchase productPurchaseFromJson = fromJson(jSONObject);
            int i10 = PurchaseClient + 39;
            hashCode = i10 % 128;
            if (i10 % 2 != 0) {
                return productPurchaseFromJson;
            }
            throw null;
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @n
        @NotNull
        public final ProductPurchase fromJson(@NotNull JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Object[] objArr = new Object[1];
            a("祃\uf68b\ue8a6軩", (ViewConfiguration.getFadingEdgeLength() >> 16) + 4, objArr);
            String strOptString = jSONObject.optString(((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            a("\ueb54灻쑭\uf038썊\ue25f\uab27輈\ue810\ue121\uf56b鬊\uf1c2姱滽䕼\ue84a夑", ExpandableListView.getPackedPositionChild(0L) + 19, objArr2);
            String strOptString2 = jSONObject.optString(((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            b("\ueef1餫풔棨", (char) (12976 - (ViewConfiguration.getTapTimeout() >> 16)), "\ue159觌끅Ⅎ", "줾蔂㫒﯇挛梕笸\ue3d5丶붔\udc44킆顐", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1166658785, objArr3);
            int iOptInt = jSONObject.optInt(((String) objArr3[0]).intern(), -1);
            Object[] objArr4 = new Object[1];
            a("䖸걷鉝쾃喙혉帊霼㡼쩧십풃⣾鿢晷\ud914", 16 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr4);
            int iOptInt2 = jSONObject.optInt(((String) objArr4[0]).intern(), -1);
            Object[] objArr5 = new Object[1];
            a("蘙\u0bfd\uf01c稥軃⾨孴㊑伒쫸韰㶁軃⾨䧵\uf426", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 16, objArr5);
            String strOptString3 = jSONObject.optString(((String) objArr5[0]).intern());
            Object[] objArr6 = new Object[1];
            b("\ueef1餫풔棨", (char) (ViewConfiguration.getScrollBarSize() >> 8), "黆ꙕ壽⑀", "顔蘊瓒둰魘࣍依", (-39430754) - TextUtils.getOffsetBefore("", 0), objArr6);
            String strOptString4 = jSONObject.optString(((String) objArr6[0]).intern());
            Object[] objArr7 = new Object[1];
            a("\ueb54灻쑭\uf038썊\ue25f\uab27輈ﶲ糜孴㊑", (ViewConfiguration.getFadingEdgeLength() >> 16) + 12, objArr7);
            int iOptInt3 = jSONObject.optInt(((String) objArr7[0]).intern(), -1);
            Object[] objArr8 = new Object[1];
            b("\ueef1餫풔棨", (char) (Process.myTid() >> 22), "₵\uefed赅쿹", "\uef1f淁퇻䐾轿퇿ⷐ尛憨υ\uf673솅᯾ᡌ㖙盢㌃\uf2e1\ue438祄", (-16777216) - Color.rgb(0, 0, 0), objArr8);
            int iOptInt4 = jSONObject.optInt(((String) objArr8[0]).intern(), -1);
            Object[] objArr9 = new Object[1];
            b("\ueef1餫풔棨", (char) (31584 - View.combineMeasuredStates(0, 0)), "甚ꤐ悄虻", "\uf6f1糯댢琨軻鿯낆攬㖿\uecd8\udae0㾪㮨", TextUtils.indexOf("", "", 0, 0) - 2069294987, objArr9);
            String strOptString5 = jSONObject.optString(((String) objArr9[0]).intern());
            Object[] objArr10 = new Object[1];
            a("㉠鍊ꖈ拖䒚翞㪉䱇䒔\ud99c", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 8, objArr10);
            String strOptString6 = jSONObject.optString(((String) objArr10[0]).intern());
            Object[] objArr11 = new Object[1];
            b("\ueef1餫풔棨", (char) ExpandableListView.getPackedPositionGroup(0L), "遜鉽甄㱫", "Юꑦ䤥ې儬椑坫⫯", ViewConfiguration.getPressedStateDuration() >> 16, objArr11);
            int iOptInt5 = jSONObject.optInt(((String) objArr11[0]).intern(), -1);
            Object[] objArr12 = new Object[1];
            b("\ueef1餫풔棨", (char) (64241 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), "\udc2a텛\uf1f0⳺", "쎎\uf5a0ꗘ彠壥\ue838䥋踏\ue07b袂똦Ḛᰮ\u09b3샟內ꭴ泉멾紓십剠픆\ue120僧稰㱽", (-254714917) - TextUtils.indexOf("", l.f338160j, 0, 0), objArr12);
            String strOptString7 = jSONObject.optString(((String) objArr12[0]).intern());
            Object[] objArr13 = new Object[1];
            b("\ueef1餫풔棨", (char) (ExpandableListView.getPackedPositionType(0L) + 60730), "⍦๚㪃뿭", "\ua95b矴砱䠀ᴯ\uec0c\uf77f䎖㼀᭾\ue4b4栢ꟍ霋Ḙ㜜큵\uf0f2䌘⁈\ue485\ue968籐ೢ뗹䷺囗", View.MeasureSpec.getSize(0) - 2096211421, objArr13);
            String strOptString8 = jSONObject.optString(((String) objArr13[0]).intern());
            Object[] objArr14 = new Object[1];
            a("㠔핣埯\ude7eﯛ㑏僤៧蘙\u0bfd", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9, objArr14);
            String strOptString9 = jSONObject.optString(((String) objArr14[0]).intern());
            Intrinsics.checkNotNullExpressionValue(strOptString, "");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "");
            Intrinsics.checkNotNullExpressionValue(strOptString3, "");
            Intrinsics.checkNotNullExpressionValue(strOptString4, "");
            Intrinsics.checkNotNullExpressionValue(strOptString5, "");
            Intrinsics.checkNotNullExpressionValue(strOptString6, "");
            Intrinsics.checkNotNullExpressionValue(strOptString7, "");
            Intrinsics.checkNotNullExpressionValue(strOptString8, "");
            Intrinsics.checkNotNullExpressionValue(strOptString9, "");
            ProductPurchase productPurchase = new ProductPurchase(strOptString, strOptString2, iOptInt, iOptInt2, strOptString3, strOptString4, iOptInt3, iOptInt4, strOptString5, strOptString6, iOptInt5, strOptString7, strOptString8, strOptString9);
            hashCode = (PurchaseClient + 109) % 128;
            return productPurchase;
        }
    }

    public ProductPurchase(@NotNull String str, @NotNull String str2, int i10, int i11, @NotNull String str3, @NotNull String str4, int i12, int i13, @NotNull String str5, @NotNull String str6, int i14, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.kind = str;
        this.purchaseTimeMillis = str2;
        this.purchaseState = i10;
        this.consumptionState = i11;
        this.developerPayload = str3;
        this.orderId = str4;
        this.purchaseType = i12;
        this.acknowledgementState = i13;
        this.purchaseToken = str5;
        this.productId = str6;
        this.quantity = i14;
        this.obfuscatedExternalAccountId = str7;
        this.obfuscatedExternalProfileId = str8;
        this.regionCode = str9;
    }

    @n
    @NotNull
    public static ProductPurchase fromJson(@NotNull JSONObject jSONObject) {
        return Companion.fromJson(jSONObject);
    }

    @NotNull
    public final String component1() {
        return this.kind;
    }

    @NotNull
    public final String component10() {
        return this.productId;
    }

    public final int component11() {
        return this.quantity;
    }

    @NotNull
    public final String component12() {
        return this.obfuscatedExternalAccountId;
    }

    @NotNull
    public final String component13() {
        return this.obfuscatedExternalProfileId;
    }

    @NotNull
    public final String component14() {
        return this.regionCode;
    }

    @NotNull
    public final String component2() {
        return this.purchaseTimeMillis;
    }

    public final int component3() {
        return this.purchaseState;
    }

    public final int component4() {
        return this.consumptionState;
    }

    @NotNull
    public final String component5() {
        return this.developerPayload;
    }

    @NotNull
    public final String component6() {
        return this.orderId;
    }

    public final int component7() {
        return this.purchaseType;
    }

    public final int component8() {
        return this.acknowledgementState;
    }

    @NotNull
    public final String component9() {
        return this.purchaseToken;
    }

    @NotNull
    public final ProductPurchase copy(@NotNull String str, @NotNull String str2, int i10, int i11, @NotNull String str3, @NotNull String str4, int i12, int i13, @NotNull String str5, @NotNull String str6, int i14, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new ProductPurchase(str, str2, i10, i11, str3, str4, i12, i13, str5, str6, i14, str7, str8, str9);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductPurchase)) {
            return false;
        }
        ProductPurchase productPurchase = (ProductPurchase) obj;
        return Intrinsics.areEqual(this.kind, productPurchase.kind) && Intrinsics.areEqual(this.purchaseTimeMillis, productPurchase.purchaseTimeMillis) && this.purchaseState == productPurchase.purchaseState && this.consumptionState == productPurchase.consumptionState && Intrinsics.areEqual(this.developerPayload, productPurchase.developerPayload) && Intrinsics.areEqual(this.orderId, productPurchase.orderId) && this.purchaseType == productPurchase.purchaseType && this.acknowledgementState == productPurchase.acknowledgementState && Intrinsics.areEqual(this.purchaseToken, productPurchase.purchaseToken) && Intrinsics.areEqual(this.productId, productPurchase.productId) && this.quantity == productPurchase.quantity && Intrinsics.areEqual(this.obfuscatedExternalAccountId, productPurchase.obfuscatedExternalAccountId) && Intrinsics.areEqual(this.obfuscatedExternalProfileId, productPurchase.obfuscatedExternalProfileId) && Intrinsics.areEqual(this.regionCode, productPurchase.regionCode);
    }

    @i(name = "getAcknowledgementState")
    public final int getAcknowledgementState() {
        return this.acknowledgementState;
    }

    @i(name = "getConsumptionState")
    public final int getConsumptionState() {
        return this.consumptionState;
    }

    @i(name = "getDeveloperPayload")
    @NotNull
    public final String getDeveloperPayload() {
        return this.developerPayload;
    }

    @i(name = "getKind")
    @NotNull
    public final String getKind() {
        return this.kind;
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

    @i(name = "getOrderId")
    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    @i(name = "getProductId")
    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    @i(name = "getPurchaseState")
    public final int getPurchaseState() {
        return this.purchaseState;
    }

    @i(name = "getPurchaseTimeMillis")
    @NotNull
    public final String getPurchaseTimeMillis() {
        return this.purchaseTimeMillis;
    }

    @i(name = "getPurchaseToken")
    @NotNull
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    @i(name = "getPurchaseType")
    public final int getPurchaseType() {
        return this.purchaseType;
    }

    @i(name = "getQuantity")
    public final int getQuantity() {
        return this.quantity;
    }

    @i(name = "getRegionCode")
    @NotNull
    public final String getRegionCode() {
        return this.regionCode;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((this.kind.hashCode() * 31) + this.purchaseTimeMillis.hashCode()) * 31) + Integer.hashCode(this.purchaseState)) * 31) + Integer.hashCode(this.consumptionState)) * 31) + this.developerPayload.hashCode()) * 31) + this.orderId.hashCode()) * 31) + Integer.hashCode(this.purchaseType)) * 31) + Integer.hashCode(this.acknowledgementState)) * 31) + this.purchaseToken.hashCode()) * 31) + this.productId.hashCode()) * 31) + Integer.hashCode(this.quantity)) * 31) + this.obfuscatedExternalAccountId.hashCode()) * 31) + this.obfuscatedExternalProfileId.hashCode()) * 31) + this.regionCode.hashCode();
    }

    @NotNull
    public final String toString() {
        return "ProductPurchase(kind=" + this.kind + ", purchaseTimeMillis=" + this.purchaseTimeMillis + ", purchaseState=" + this.purchaseState + ", consumptionState=" + this.consumptionState + ", developerPayload=" + this.developerPayload + ", orderId=" + this.orderId + ", purchaseType=" + this.purchaseType + ", acknowledgementState=" + this.acknowledgementState + ", purchaseToken=" + this.purchaseToken + ", productId=" + this.productId + ", quantity=" + this.quantity + ", obfuscatedExternalAccountId=" + this.obfuscatedExternalAccountId + ", obfuscatedExternalProfileId=" + this.obfuscatedExternalProfileId + ", regionCode=" + this.regionCode + ")";
    }
}
