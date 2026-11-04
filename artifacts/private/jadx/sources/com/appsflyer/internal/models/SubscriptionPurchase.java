package com.appsflyer.internal.models;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1i;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1k;
import com.google.common.base.c;
import com.planner5d.library.engine.input.f;
import com.rabbitmq.client.impl.k;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.io.encoding.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oj.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import org.locationtech.jts.geom.l;
import org.msgpack.core.h;

/* JADX INFO: loaded from: classes3.dex */
public final class SubscriptionPurchase {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String acknowledgementState;

    @Nullable
    private final CanceledStateContext canceledStateContext;

    @Nullable
    private final ExternalAccountIdentifiers externalAccountIdentifiers;

    @NotNull
    private final String kind;

    @NotNull
    private final String latestOrderId;

    @NotNull
    private final List<SubscriptionPurchaseLineItem> lineItems;

    @Nullable
    private final String linkedPurchaseToken;

    @Nullable
    private final PausedStateContext pausedStateContext;

    @NotNull
    private final String regionCode;

    @NotNull
    private final String startTime;

    @Nullable
    private final SubscribeWithGoogleInfo subscribeWithGoogleInfo;

    @NotNull
    private final String subscriptionState;

    @Nullable
    private final TestPurchase testPurchase;

    @SourceDebugExtension({"SMAP\nSubscriptionPurchase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubscriptionPurchase.kt\ncom/appsflyer/internal/models/SubscriptionPurchase$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,381:1\n1549#2:382\n1620#2,3:383\n*S KotlinDebug\n*F\n+ 1 SubscriptionPurchase.kt\ncom/appsflyer/internal/models/SubscriptionPurchase$Companion\n*L\n28#1:382\n28#1:383,3\n*E\n"})
    public static final class Companion implements Deserialize<SubscriptionPurchase> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int equals = 0;
        private static short[] hashCode = null;
        private static int startObservingTransactions = 1;
        private static char[] toJsonMap = {61228, 61213, 61120, 61228, 61223, 61216, 61221, 61210, 61220, 60941, 61011, 61022, 61008, 60928, 61005, 61010, 61011, 61010, 61011, 61012, 61020, 61018, 61031, 61017, 61015, 61015, 61038, 61026, 61014, 61010, 61008, 61009, 61038, 61026, 61011, 61011, 61116, 61242, 61127, 61124, 61242, 61244, 61244, 61244, 61244, 61237, 61122, 61122};
        private static int getOneTimePurchaseOfferDetails = 310247648;
        private static int InAppPurchaseEvent = -865513342;
        private static int getPackageName = 1894208373;
        private static byte[] getQuantity = {33, h.a.f339272h, a.f312535i, -15, c.f116464q, h.a.A, h.a.D, 40, h.a.C, 46, h.a.f339288x, 47, 41, 37, h.a.C, h.a.f339286v, h.a.f339288x, h.a.C, h.a.f339287w, -115, 98, -128, 119, -114, 93, -81, -128, 98, -100, 80, -98, -114, -120, 118, 115, -124, 124, -113, -128, -116, 125, -126, 124, 116, -121, -120, -128, -102, 84, -121, 120, -121, -115, -127, -93, 84, -118, 114, 125, -116, 112, 125, -110, 105, -91, 127, 115, -128, 81, -87, 115, 124, -125, 97, -121, 44, h.a.J, h.a.D, 62, h.a.f339279o, h.a.B, 55, h.a.G, 32, h.a.f339289y, h.a.C, 0, h.a.f339278n, h.a.E, h.a.J, h.a.C, 32, h.a.C, 60, h.a.f339288x, 49, h.a.f339275k, 63, -20, c.H, 49, h.a.f339288x, 45, -31, 47, 63, 50, 62, h.a.f339289y, 49, 110, -102, 67, -70, h.a.f339267c, 105, 109, 109, -100, -126, 126, 111, -102, 120, 107, -105, 123, 51, h.a.f339286v, 47, -29, 39, a.f312535i, h.a.f339273i, 55, h.a.f339275k, h.a.f339274j, 53, h.a.f339282r, 50, h.a.f339288x, 47, h.a.f339269e, h.a.f339267c, h.a.f339267c, h.a.f339267c, h.a.f339267c, h.a.f339267c, h.a.f339267c, h.a.f339267c, h.a.f339267c, h.a.f339267c};

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(boolean z10, String str, int[] iArr, Object[] objArr) throws UnsupportedEncodingException {
            String str2 = str;
            Object bytes = str2;
            if (str2 != null) {
                int i10 = $11 + 105;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 64 / 0;
                    bytes = str2.getBytes("ISO-8859-1");
                } else {
                    bytes = str2.getBytes("ISO-8859-1");
                }
            }
            byte[] bArr = (byte[]) bytes;
            AFPurchaseConnectorA1k aFPurchaseConnectorA1k = new AFPurchaseConnectorA1k();
            int i12 = iArr[0];
            int i13 = iArr[1];
            int i14 = iArr[2];
            int i15 = iArr[3];
            char[] cArr = toJsonMap;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i16 = 0;
                while (i16 < length) {
                    int i17 = $10 + 35;
                    $11 = i17 % 128;
                    if (i17 % 2 == 0) {
                        cArr2[i16] = (char) (((long) cArr[i16]) ^ 738523797727735353L);
                        i16--;
                    } else {
                        cArr2[i16] = (char) (((long) cArr[i16]) ^ 738523797727735353L);
                        i16++;
                    }
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i13];
            System.arraycopy(cArr, i12, cArr3, 0, i13);
            if (bArr != null) {
                char[] cArr4 = new char[i13];
                aFPurchaseConnectorA1k.getOneTimePurchaseOfferDetails = 0;
                char c10 = 0;
                while (true) {
                    int i18 = aFPurchaseConnectorA1k.getOneTimePurchaseOfferDetails;
                    if (i18 >= i13) {
                        break;
                    }
                    if (bArr[i18] == 1) {
                        int i19 = $11 + 121;
                        $10 = i19 % 128;
                        if (i19 % 2 != 0) {
                            char c11 = cArr3[i18];
                            cArr4[i18] = (char) (0 / c10);
                        } else {
                            cArr4[i18] = (char) (((cArr3[i18] * 2) + 1) - c10);
                        }
                    } else {
                        cArr4[i18] = (char) ((cArr3[i18] * 2) - c10);
                    }
                    c10 = cArr4[i18];
                    aFPurchaseConnectorA1k.getOneTimePurchaseOfferDetails = i18 + 1;
                }
                $10 = ($11 + 123) % 128;
                cArr3 = cArr4;
            }
            if (i15 > 0) {
                char[] cArr5 = new char[i13];
                System.arraycopy(cArr3, 0, cArr5, 0, i13);
                int i20 = i13 - i15;
                System.arraycopy(cArr5, 0, cArr3, i20, i15);
                System.arraycopy(cArr5, i15, cArr3, 0, i20);
            }
            if (z10) {
                char[] cArr6 = new char[i13];
                aFPurchaseConnectorA1k.getOneTimePurchaseOfferDetails = 0;
                while (true) {
                    int i21 = aFPurchaseConnectorA1k.getOneTimePurchaseOfferDetails;
                    if (i21 >= i13) {
                        break;
                    }
                    cArr6[i21] = cArr3[(i13 - i21) - 1];
                    aFPurchaseConnectorA1k.getOneTimePurchaseOfferDetails = i21 + 1;
                }
                $11 = ($10 + 33) % 128;
                cArr3 = cArr6;
            }
            if (i14 > 0) {
                aFPurchaseConnectorA1k.getOneTimePurchaseOfferDetails = 0;
                while (true) {
                    int i22 = aFPurchaseConnectorA1k.getOneTimePurchaseOfferDetails;
                    if (i22 >= i13) {
                        break;
                    }
                    cArr3[i22] = (char) (cArr3[i22] - iArr[2]);
                    aFPurchaseConnectorA1k.getOneTimePurchaseOfferDetails = i22 + 1;
                }
            }
            objArr[0] = new String(cArr3);
        }

        private static void b(int i10, short s10, int i11, int i12, byte b10, Object[] objArr) {
            int i13;
            boolean z10;
            AFPurchaseConnectorA1i aFPurchaseConnectorA1i = new AFPurchaseConnectorA1i();
            StringBuilder sb2 = new StringBuilder();
            int i14 = i11 + ((int) (((long) InAppPurchaseEvent) ^ (-531460254799933296L)));
            if (i14 == -1) {
                $11 = ($10 + 27) % 128;
                i13 = 1;
            } else {
                i13 = 0;
            }
            if (i13 != 0) {
                byte[] bArr = getQuantity;
                if (bArr != null) {
                    $11 = ($10 + 85) % 128;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i15 = 0; i15 < length; i15++) {
                        bArr2[i15] = (byte) (((long) bArr[i15]) ^ (-531460254799933296L));
                    }
                    bArr = bArr2;
                }
                i14 = bArr != null ? (byte) (((byte) (((long) getQuantity[((int) (((long) getOneTimePurchaseOfferDetails) ^ (-531460254799933296L))) + i12]) ^ (-531460254799933296L))) + ((int) (((long) InAppPurchaseEvent) ^ (-531460254799933296L)))) : (short) (((short) (((long) hashCode[((int) (((long) getOneTimePurchaseOfferDetails) ^ (-531460254799933296L))) + i12]) ^ (-531460254799933296L))) + ((int) (((long) InAppPurchaseEvent) ^ (-531460254799933296L))));
            }
            if (i14 > 0) {
                aFPurchaseConnectorA1i.getOneTimePurchaseOfferDetails = ((i12 + i14) - 2) + ((int) (((long) getOneTimePurchaseOfferDetails) ^ (-531460254799933296L))) + i13;
                char c10 = (char) (i10 + ((int) (((long) getPackageName) ^ (-531460254799933296L))));
                aFPurchaseConnectorA1i.getPackageName = c10;
                sb2.append(c10);
                aFPurchaseConnectorA1i.getQuantity = aFPurchaseConnectorA1i.getPackageName;
                byte[] bArr3 = getQuantity;
                if (bArr3 != null) {
                    int length2 = bArr3.length;
                    byte[] bArr4 = new byte[length2];
                    for (int i16 = 0; i16 < length2; i16++) {
                        bArr4[i16] = (byte) (((long) bArr3[i16]) ^ (-531460254799933296L));
                    }
                    bArr3 = bArr4;
                }
                if (bArr3 != null) {
                    $10 = ($11 + k.b.p.f265340a) % 128;
                    z10 = true;
                } else {
                    z10 = false;
                }
                aFPurchaseConnectorA1i.InAppPurchaseEvent = 1;
                while (aFPurchaseConnectorA1i.InAppPurchaseEvent < i14) {
                    if (z10) {
                        byte[] bArr5 = getQuantity;
                        int i17 = aFPurchaseConnectorA1i.getOneTimePurchaseOfferDetails;
                        aFPurchaseConnectorA1i.getOneTimePurchaseOfferDetails = i17 - 1;
                        aFPurchaseConnectorA1i.getPackageName = (char) (aFPurchaseConnectorA1i.getQuantity + (((byte) (((byte) (((long) bArr5[i17]) ^ (-531460254799933296L))) + s10)) ^ b10));
                    } else {
                        short[] sArr = hashCode;
                        int i18 = aFPurchaseConnectorA1i.getOneTimePurchaseOfferDetails;
                        aFPurchaseConnectorA1i.getOneTimePurchaseOfferDetails = i18 - 1;
                        aFPurchaseConnectorA1i.getPackageName = (char) (aFPurchaseConnectorA1i.getQuantity + (((short) (((short) (((long) sArr[i18]) ^ (-531460254799933296L))) + s10)) ^ b10));
                    }
                    sb2.append(aFPurchaseConnectorA1i.getPackageName);
                    aFPurchaseConnectorA1i.getQuantity = aFPurchaseConnectorA1i.getPackageName;
                    aFPurchaseConnectorA1i.InAppPurchaseEvent++;
                }
            }
            String string = sb2.toString();
            int i19 = $11 + 19;
            $10 = i19 % 128;
            if (i19 % 2 != 0) {
                throw null;
            }
            objArr[0] = string;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public final SubscriptionPurchase fromJson(@NotNull JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Object[] objArr = new Object[1];
            a(true, null, new int[]{0, 9, 176, 7}, objArr);
            JSONArray jSONArray = jSONObject.getJSONArray(((String) objArr[0]).intern());
            Intrinsics.checkNotNullExpressionValue(jSONArray, "");
            List list = SubscriptionPurchaseKt.toList(jSONArray);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int i10 = startObservingTransactions + f.b.f160733u1;
                equals = i10 % 128;
                if (i10 % 2 != 0) {
                    arrayList.add(SubscriptionPurchaseLineItem.Companion.fromJson((JSONObject) it.next()));
                    throw null;
                }
                arrayList.add(SubscriptionPurchaseLineItem.Companion.fromJson((JSONObject) it.next()));
            }
            Object[] objArr2 = new Object[1];
            b(Color.red(0) + 1131543676, (short) Color.alpha(0), 2 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 568897423 - TextUtils.lastIndexOf("", l.f338160j), (byte) (63 - TextUtils.indexOf("", l.f338160j)), objArr2);
            String strOptString = jSONObject.optString(((String) objArr2[0]).intern());
            Intrinsics.checkNotNullExpressionValue(strOptString, "");
            Object[] objArr3 = new Object[1];
            b(ExpandableListView.getPackedPositionType(0L) + 1131543678, (short) (AndroidCharacter.getMirror(l.f338160j) - '0'), (ViewConfiguration.getFadingEdgeLength() >> 16) + 2, 568897443 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) (KeyEvent.keyCodeFromString("") - 31), objArr3);
            CanceledStateContext canceledStateContext = (CanceledStateContext) SubscriptionPurchaseKt.toObject(jSONObject, ((String) objArr3[0]).intern(), CanceledStateContext.Companion);
            Object[] objArr4 = new Object[1];
            b((ViewConfiguration.getJumpTapTimeout() >> 16) + 1131543680, (short) Color.alpha(0), 8 - Drawable.resolveOpacity(0, 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 568897461, (byte) (17 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), objArr4);
            ExternalAccountIdentifiers externalAccountIdentifiers = (ExternalAccountIdentifiers) SubscriptionPurchaseKt.toObject(jSONObject, ((String) objArr4[0]).intern(), ExternalAccountIdentifiers.Companion);
            Object[] objArr5 = new Object[1];
            a(true, "\u0001\u0000\u0001\u0000", new int[]{9, 4, 0, 2}, objArr5);
            String strOptString2 = jSONObject.optString(((String) objArr5[0]).intern());
            Intrinsics.checkNotNullExpressionValue(strOptString2, "");
            Object[] objArr6 = new Object[1];
            b(1131543688 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (short) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (-6) - TextUtils.lastIndexOf("", l.f338160j), 568897488 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (byte) ((-30) - View.resolveSizeAndState(0, 0, 0)), objArr6);
            String strOptString3 = jSONObject.optString(((String) objArr6[0]).intern());
            Intrinsics.checkNotNullExpressionValue(strOptString3, "");
            Object[] objArr7 = new Object[1];
            b(1131543687 - ExpandableListView.getPackedPositionType(0L), (short) Color.argb(0, 0, 0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 1, TextUtils.indexOf("", "", 0) + 568897499, (byte) ((-74) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr7);
            String str = (String) SubscriptionPurchaseKt.getNullable(jSONObject, ((String) objArr7[0]).intern());
            Object[] objArr8 = new Object[1];
            b((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1131543690, (short) (ViewConfiguration.getWindowTouchSlop() >> 8), 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 568897517, (byte) (80 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), objArr8);
            PausedStateContext pausedStateContext = (PausedStateContext) SubscriptionPurchaseKt.toObject(jSONObject, ((String) objArr8[0]).intern(), PausedStateContext.Companion);
            Object[] objArr9 = new Object[1];
            b(1131543694 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (short) (ViewConfiguration.getPressedStateDuration() >> 16), (-8) - View.resolveSize(0, 0), 568897534 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) KeyEvent.getModifierMetaStateMask(), objArr9);
            String strOptString4 = jSONObject.optString(((String) objArr9[0]).intern());
            Intrinsics.checkNotNullExpressionValue(strOptString4, "");
            Object[] objArr10 = new Object[1];
            b((ViewConfiguration.getTapTimeout() >> 16) + 1131543694, (short) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 9, Drawable.resolveOpacity(0, 0) + 568897543, (byte) (ExpandableListView.getPackedPositionChild(0L) - 21), objArr10);
            String strOptString5 = jSONObject.optString(((String) objArr10[0]).intern());
            Intrinsics.checkNotNullExpressionValue(strOptString5, "");
            Object[] objArr11 = new Object[1];
            a(false, "\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001", new int[]{13, 23, 0, 23}, objArr11);
            SubscribeWithGoogleInfo subscribeWithGoogleInfo = (SubscribeWithGoogleInfo) SubscriptionPurchaseKt.toObject(jSONObject, ((String) objArr11[0]).intern(), SubscribeWithGoogleInfo.Companion);
            Object[] objArr12 = new Object[1];
            b(1131543694 - ExpandableListView.getPackedPositionGroup(0L), (short) (Process.getGidForName("") + 1), TextUtils.indexOf("", l.f338160j, 0, 0), 568897552 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) (81 - ExpandableListView.getPackedPositionChild(0L)), objArr12);
            String strOptString6 = jSONObject.optString(((String) objArr12[0]).intern());
            Intrinsics.checkNotNullExpressionValue(strOptString6, "");
            Object[] objArr13 = new Object[1];
            a(false, "\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001", new int[]{36, 12, 153, 6}, objArr13);
            SubscriptionPurchase subscriptionPurchase = new SubscriptionPurchase(strOptString, canceledStateContext, externalAccountIdentifiers, strOptString2, strOptString3, arrayList, str, pausedStateContext, strOptString4, strOptString5, subscribeWithGoogleInfo, strOptString6, (TestPurchase) SubscriptionPurchaseKt.toObject(jSONObject, ((String) objArr13[0]).intern(), TestPurchase.Companion));
            equals = (startObservingTransactions + 41) % 128;
            return subscriptionPurchase;
        }

        private Companion() {
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ SubscriptionPurchase fromJson(JSONObject jSONObject) {
            equals = (startObservingTransactions + 93) % 128;
            SubscriptionPurchase subscriptionPurchaseFromJson = fromJson(jSONObject);
            int i10 = equals + 29;
            startObservingTransactions = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 97 / 0;
            }
            return subscriptionPurchaseFromJson;
        }
    }

    public SubscriptionPurchase(@NotNull String str, @Nullable CanceledStateContext canceledStateContext, @Nullable ExternalAccountIdentifiers externalAccountIdentifiers, @NotNull String str2, @NotNull String str3, @NotNull List<SubscriptionPurchaseLineItem> list, @Nullable String str4, @Nullable PausedStateContext pausedStateContext, @NotNull String str5, @NotNull String str6, @Nullable SubscribeWithGoogleInfo subscribeWithGoogleInfo, @NotNull String str7, @Nullable TestPurchase testPurchase) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.acknowledgementState = str;
        this.canceledStateContext = canceledStateContext;
        this.externalAccountIdentifiers = externalAccountIdentifiers;
        this.kind = str2;
        this.latestOrderId = str3;
        this.lineItems = list;
        this.linkedPurchaseToken = str4;
        this.pausedStateContext = pausedStateContext;
        this.regionCode = str5;
        this.startTime = str6;
        this.subscribeWithGoogleInfo = subscribeWithGoogleInfo;
        this.subscriptionState = str7;
        this.testPurchase = testPurchase;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubscriptionPurchase copy$default(SubscriptionPurchase subscriptionPurchase, String str, CanceledStateContext canceledStateContext, ExternalAccountIdentifiers externalAccountIdentifiers, String str2, String str3, List list, String str4, PausedStateContext pausedStateContext, String str5, String str6, SubscribeWithGoogleInfo subscribeWithGoogleInfo, String str7, TestPurchase testPurchase, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = subscriptionPurchase.acknowledgementState;
        }
        return subscriptionPurchase.copy(str, (i10 & 2) != 0 ? subscriptionPurchase.canceledStateContext : canceledStateContext, (i10 & 4) != 0 ? subscriptionPurchase.externalAccountIdentifiers : externalAccountIdentifiers, (i10 & 8) != 0 ? subscriptionPurchase.kind : str2, (i10 & 16) != 0 ? subscriptionPurchase.latestOrderId : str3, (i10 & 32) != 0 ? subscriptionPurchase.lineItems : list, (i10 & 64) != 0 ? subscriptionPurchase.linkedPurchaseToken : str4, (i10 & 128) != 0 ? subscriptionPurchase.pausedStateContext : pausedStateContext, (i10 & 256) != 0 ? subscriptionPurchase.regionCode : str5, (i10 & 512) != 0 ? subscriptionPurchase.startTime : str6, (i10 & 1024) != 0 ? subscriptionPurchase.subscribeWithGoogleInfo : subscribeWithGoogleInfo, (i10 & 2048) != 0 ? subscriptionPurchase.subscriptionState : str7, (i10 & 4096) != 0 ? subscriptionPurchase.testPurchase : testPurchase);
    }

    @NotNull
    public final String component1() {
        return this.acknowledgementState;
    }

    @NotNull
    public final String component10() {
        return this.startTime;
    }

    @Nullable
    public final SubscribeWithGoogleInfo component11() {
        return this.subscribeWithGoogleInfo;
    }

    @NotNull
    public final String component12() {
        return this.subscriptionState;
    }

    @Nullable
    public final TestPurchase component13() {
        return this.testPurchase;
    }

    @Nullable
    public final CanceledStateContext component2() {
        return this.canceledStateContext;
    }

    @Nullable
    public final ExternalAccountIdentifiers component3() {
        return this.externalAccountIdentifiers;
    }

    @NotNull
    public final String component4() {
        return this.kind;
    }

    @NotNull
    public final String component5() {
        return this.latestOrderId;
    }

    @NotNull
    public final List<SubscriptionPurchaseLineItem> component6() {
        return this.lineItems;
    }

    @Nullable
    public final String component7() {
        return this.linkedPurchaseToken;
    }

    @Nullable
    public final PausedStateContext component8() {
        return this.pausedStateContext;
    }

    @NotNull
    public final String component9() {
        return this.regionCode;
    }

    @NotNull
    public final SubscriptionPurchase copy(@NotNull String str, @Nullable CanceledStateContext canceledStateContext, @Nullable ExternalAccountIdentifiers externalAccountIdentifiers, @NotNull String str2, @NotNull String str3, @NotNull List<SubscriptionPurchaseLineItem> list, @Nullable String str4, @Nullable PausedStateContext pausedStateContext, @NotNull String str5, @NotNull String str6, @Nullable SubscribeWithGoogleInfo subscribeWithGoogleInfo, @NotNull String str7, @Nullable TestPurchase testPurchase) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new SubscriptionPurchase(str, canceledStateContext, externalAccountIdentifiers, str2, str3, list, str4, pausedStateContext, str5, str6, subscribeWithGoogleInfo, str7, testPurchase);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionPurchase)) {
            return false;
        }
        SubscriptionPurchase subscriptionPurchase = (SubscriptionPurchase) obj;
        return Intrinsics.areEqual(this.acknowledgementState, subscriptionPurchase.acknowledgementState) && Intrinsics.areEqual(this.canceledStateContext, subscriptionPurchase.canceledStateContext) && Intrinsics.areEqual(this.externalAccountIdentifiers, subscriptionPurchase.externalAccountIdentifiers) && Intrinsics.areEqual(this.kind, subscriptionPurchase.kind) && Intrinsics.areEqual(this.latestOrderId, subscriptionPurchase.latestOrderId) && Intrinsics.areEqual(this.lineItems, subscriptionPurchase.lineItems) && Intrinsics.areEqual(this.linkedPurchaseToken, subscriptionPurchase.linkedPurchaseToken) && Intrinsics.areEqual(this.pausedStateContext, subscriptionPurchase.pausedStateContext) && Intrinsics.areEqual(this.regionCode, subscriptionPurchase.regionCode) && Intrinsics.areEqual(this.startTime, subscriptionPurchase.startTime) && Intrinsics.areEqual(this.subscribeWithGoogleInfo, subscriptionPurchase.subscribeWithGoogleInfo) && Intrinsics.areEqual(this.subscriptionState, subscriptionPurchase.subscriptionState) && Intrinsics.areEqual(this.testPurchase, subscriptionPurchase.testPurchase);
    }

    @i(name = "getAcknowledgementState")
    @NotNull
    public final String getAcknowledgementState() {
        return this.acknowledgementState;
    }

    @i(name = "getCanceledStateContext")
    @Nullable
    public final CanceledStateContext getCanceledStateContext() {
        return this.canceledStateContext;
    }

    @i(name = "getExternalAccountIdentifiers")
    @Nullable
    public final ExternalAccountIdentifiers getExternalAccountIdentifiers() {
        return this.externalAccountIdentifiers;
    }

    @i(name = "getKind")
    @NotNull
    public final String getKind() {
        return this.kind;
    }

    @i(name = "getLatestOrderId")
    @NotNull
    public final String getLatestOrderId() {
        return this.latestOrderId;
    }

    @i(name = "getLineItems")
    @NotNull
    public final List<SubscriptionPurchaseLineItem> getLineItems() {
        return this.lineItems;
    }

    @i(name = "getLinkedPurchaseToken")
    @Nullable
    public final String getLinkedPurchaseToken() {
        return this.linkedPurchaseToken;
    }

    @i(name = "getPausedStateContext")
    @Nullable
    public final PausedStateContext getPausedStateContext() {
        return this.pausedStateContext;
    }

    @i(name = "getRegionCode")
    @NotNull
    public final String getRegionCode() {
        return this.regionCode;
    }

    @i(name = "getStartTime")
    @NotNull
    public final String getStartTime() {
        return this.startTime;
    }

    @i(name = "getSubscribeWithGoogleInfo")
    @Nullable
    public final SubscribeWithGoogleInfo getSubscribeWithGoogleInfo() {
        return this.subscribeWithGoogleInfo;
    }

    @i(name = "getSubscriptionState")
    @NotNull
    public final String getSubscriptionState() {
        return this.subscriptionState;
    }

    @i(name = "getTestPurchase")
    @Nullable
    public final TestPurchase getTestPurchase() {
        return this.testPurchase;
    }

    public final int hashCode() {
        int iHashCode = this.acknowledgementState.hashCode() * 31;
        CanceledStateContext canceledStateContext = this.canceledStateContext;
        int iHashCode2 = 0;
        int iHashCode3 = (iHashCode + (canceledStateContext == null ? 0 : canceledStateContext.hashCode())) * 31;
        ExternalAccountIdentifiers externalAccountIdentifiers = this.externalAccountIdentifiers;
        int iHashCode4 = (((((((iHashCode3 + (externalAccountIdentifiers == null ? 0 : externalAccountIdentifiers.hashCode())) * 31) + this.kind.hashCode()) * 31) + this.latestOrderId.hashCode()) * 31) + this.lineItems.hashCode()) * 31;
        String str = this.linkedPurchaseToken;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        PausedStateContext pausedStateContext = this.pausedStateContext;
        int iHashCode6 = (((((iHashCode5 + (pausedStateContext == null ? 0 : pausedStateContext.hashCode())) * 31) + this.regionCode.hashCode()) * 31) + this.startTime.hashCode()) * 31;
        SubscribeWithGoogleInfo subscribeWithGoogleInfo = this.subscribeWithGoogleInfo;
        int iHashCode7 = (((iHashCode6 + (subscribeWithGoogleInfo == null ? 0 : subscribeWithGoogleInfo.hashCode())) * 31) + this.subscriptionState.hashCode()) * 31;
        TestPurchase testPurchase = this.testPurchase;
        if (testPurchase != null) {
            iHashCode2 = testPurchase.hashCode();
        }
        return iHashCode7 + iHashCode2;
    }

    @NotNull
    public final String toString() {
        return "SubscriptionPurchase(acknowledgementState=" + this.acknowledgementState + ", canceledStateContext=" + this.canceledStateContext + ", externalAccountIdentifiers=" + this.externalAccountIdentifiers + ", kind=" + this.kind + ", latestOrderId=" + this.latestOrderId + ", lineItems=" + this.lineItems + ", linkedPurchaseToken=" + this.linkedPurchaseToken + ", pausedStateContext=" + this.pausedStateContext + ", regionCode=" + this.regionCode + ", startTime=" + this.startTime + ", subscribeWithGoogleInfo=" + this.subscribeWithGoogleInfo + ", subscriptionState=" + this.subscriptionState + ", testPurchase=" + this.testPurchase + ")";
    }
}
