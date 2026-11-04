package com.appsflyer.internal.connector.purcahse;

import android.telephony.cdma.CdmaCellLocation;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.api.PurchaseClient;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AFPurchaseConnectorA1v$14469$AFPurchaseConnectorA1w implements PurchaseHandler.PurchaseValidationCallback {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long InAppPurchaseEvent = -5937322942767281808L;
    private static int equals = 1;
    private static char getPackageName = 11512;
    private static int hashCode = 0;
    private static int toJsonMap = -1483454096;
    private /* synthetic */ boolean getOneTimePurchaseOfferDetails;
    private /* synthetic */ PurchaseClient getQuantity$51c3c665;

    public AFPurchaseConnectorA1v$14469$AFPurchaseConnectorA1w(PurchaseClient purchaseClient, boolean z10) {
        this.getQuantity$51c3c665 = purchaseClient;
        this.getOneTimePurchaseOfferDetails = z10;
    }

    private static void a(String str, int i10, String str2, char c10, String str3, Object[] objArr) {
        char[] charArray;
        char[] charArray2;
        int i11 = $10;
        int i12 = i11 + 65;
        $11 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        if (str3 != null) {
            $11 = (i11 + 49) % 128;
            charArray = str3.toCharArray();
        } else {
            charArray = str3;
        }
        char[] cArr = charArray;
        char[] charArray3 = str2 != null ? str2.toCharArray() : str2;
        if (str != null) {
            int i13 = $11 + 51;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            charArray2 = str.toCharArray();
        } else {
            charArray2 = str;
        }
        char[] cArr2 = charArray2;
        AFPurchaseConnectorA1g aFPurchaseConnectorA1g = new AFPurchaseConnectorA1g();
        int length = charArray3.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        System.arraycopy(charArray3, 0, cArr3, 0, length);
        System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c10);
        cArr4[2] = (char) (cArr4[2] + ((char) i10));
        int length3 = cArr.length;
        char[] cArr5 = new char[length3];
        aFPurchaseConnectorA1g.toJsonMap = 0;
        while (true) {
            int i14 = aFPurchaseConnectorA1g.toJsonMap;
            if (i14 >= length3) {
                objArr[0] = new String(cArr5);
                return;
            }
            $10 = ($11 + 97) % 128;
            int i15 = (i14 + 3) % 4;
            int i16 = cArr3[i14 % 4] * 32718;
            char c11 = cArr4[(i14 + 2) % 4];
            char c12 = (char) ((i16 + c11) % 65535);
            aFPurchaseConnectorA1g.InAppPurchaseEvent = c12;
            cArr4[i15] = (char) (((cArr3[i15] * 32718) + c11) / 65535);
            cArr3[i15] = c12;
            cArr5[i14] = (char) (((((long) (cArr[i14] ^ c12)) ^ (InAppPurchaseEvent ^ (-5937322942767281808L))) ^ ((long) ((int) (((long) toJsonMap) ^ (-5937322942767281808L))))) ^ ((long) ((char) (((long) getPackageName) ^ (-5937322942767281808L)))));
            aFPurchaseConnectorA1g.toJsonMap = i14 + 1;
        }
    }

    @Override // com.appsflyer.PurchaseHandler.PurchaseValidationCallback
    public final void onFailure(@NotNull Throwable th2) throws Throwable {
        Intrinsics.checkNotNullParameter(th2, "");
        try {
            Object[] objArr = {this.getQuantity$51c3c665};
            Map<Integer, Object> map = AFPurchaseConnectorA1z.setSubscriptionPurchaseEventDataSource;
            Object method = map.get(-1118379773);
            if (method == null) {
                method = ((Class) AFPurchaseConnectorA1z.InAppPurchaseEvent((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 70, ViewConfiguration.getScrollDefaultDelay() >> 16, (char) (ExpandableListView.getPackedPositionChild(0L) + 4391))).getMethod("getPackageName", (Class) AFPurchaseConnectorA1z.InAppPurchaseEvent((ViewConfiguration.getJumpTapTimeout() >> 16) + 70, ViewConfiguration.getWindowTouchSlop() >> 8, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 4390)));
                map.put(-1118379773, method);
            }
            PurchaseClient.SubscriptionPurchaseValidationResultListener subscriptionPurchaseValidationResultListener = (PurchaseClient.SubscriptionPurchaseValidationResultListener) ((Method) method).invoke(null, objArr);
            if (subscriptionPurchaseValidationResultListener != null) {
                equals = (hashCode + 13) % 128;
                subscriptionPurchaseValidationResultListener.onFailure("[PurchaseConnector]: Communication exception", th2);
                equals = (hashCode + 59) % 128;
            }
        } catch (Throwable th3) {
            Throwable cause = th3.getCause();
            if (cause == null) {
                throw th3;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b1, code lost:
    
        if (r21.isSuccessful() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00bc, code lost:
    
        if (r21.isSuccessful() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00be, code lost:
    
        r0 = r21.getBody();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        r7.onFailure(r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ca, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00cb, code lost:
    
        r12 = com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1v$14469$AFPurchaseConnectorA1w.equals + 15;
        com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1v$14469$AFPurchaseConnectorA1w.hashCode = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d7, code lost:
    
        if ((r12 % 2) == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d9, code lost:
    
        r6 = new java.lang.Object[]{r21};
        r12 = r8.get(900868531);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e1, code lost:
    
        if (r12 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e3, code lost:
    
        r18 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e8, code lost:
    
        r18 = 0;
        r12 = ((java.lang.Class) com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1z.InAppPurchaseEvent(70 - android.text.TextUtils.indexOf("", "", 0), android.text.TextUtils.indexOf("", org.locationtech.jts.geom.l.f338160j) + 71, (char) android.widget.ExpandableListView.getPackedPositionGroup(0))).getMethod("getPackageName", com.appsflyer.internal.components.network.http.ResponseNetwork.class);
        r8.put(900868531, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0112, code lost:
    
        r7.onResponse(((java.lang.reflect.Method) r12).invoke(null, r6));
        r4 = 97 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0118, code lost:
    
        if (r9 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x011b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x011c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x011d, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0121, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0123, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0124, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0125, code lost:
    
        r18 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0129, code lost:
    
        r6 = new java.lang.Object[]{r21};
        r10 = r8.get(900868531);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0131, code lost:
    
        if (r10 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0134, code lost:
    
        r10 = ((java.lang.Class) com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1z.InAppPurchaseEvent(70 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), android.widget.ExpandableListView.getPackedPositionGroup(0) + 70, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) + 1))).getMethod("getPackageName", com.appsflyer.internal.components.network.http.ResponseNetwork.class);
        r8.put(900868531, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0162, code lost:
    
        r7.onResponse(((java.lang.reflect.Method) r10).invoke(null, r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0165, code lost:
    
        if (r9 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0167, code lost:
    
        r0 = new java.lang.Object[]{r0};
        r4 = r8.get(798986091);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x016f, code lost:
    
        if (r4 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0172, code lost:
    
        r4 = ((java.lang.Class) com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1z.InAppPurchaseEvent(70 - android.view.KeyEvent.keyCodeFromString(""), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (android.view.View.getDefaultSize(0, 0) + 4390))).getMethod("toJsonMap", (java.lang.Class) com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1z.InAppPurchaseEvent(71 - (android.os.SystemClock.uptimeMillis() > r18 ? 1 : (android.os.SystemClock.uptimeMillis() == r18 ? 0 : -1)), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((android.os.SystemClock.elapsedRealtime() > r18 ? 1 : (android.os.SystemClock.elapsedRealtime() == r18 ? 0 : -1)) + 4389)));
        r8.put(798986091, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01bd, code lost:
    
        r0 = new java.lang.Object[]{((java.lang.reflect.Method) r4).invoke(null, r0)};
        r2 = r8.get(2053959550);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01c5, code lost:
    
        if (r2 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01c8, code lost:
    
        r2 = ((java.lang.Class) com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1z.InAppPurchaseEvent(70 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 70, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod("getOneTimePurchaseOfferDetails", android.content.Context.class);
        r8.put(2053959550, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0201, code lost:
    
        r0 = ((android.content.SharedPreferences) ((java.lang.reflect.Method) r2).invoke(null, r0)).edit();
        r8 = new java.lang.Object[1];
        a("\u0000\u0000\u0000\u0000", (-171220896) - (android.os.SystemClock.uptimeMillis() > r18 ? 1 : (android.os.SystemClock.uptimeMillis() == r18 ? 0 : -1)), "弸쭠\ue5f5逰", (char) ((android.os.SystemClock.uptimeMillis() > r18 ? 1 : (android.os.SystemClock.uptimeMillis() == r18 ? 0 : -1)) - 1), "錑鄾嶆솳策櫱핚캇ʪ݅蜝㭳⟥㲣Ⱦ좁赛甯샨\udd85癌斳㸗", r8);
        r0.putBoolean(((java.lang.String) r8[0]).intern(), true).apply();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0239, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x023a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x023b, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x023f, code lost:
    
        if (r1 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0241, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0242, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0243, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0244, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0248, code lost:
    
        if (r1 != null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x024a, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x024b, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x024c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x024d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x024e, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0252, code lost:
    
        if (r1 != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0254, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0255, code lost:
    
        throw r0;
     */
    @Override // com.appsflyer.PurchaseHandler.PurchaseValidationCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResponse(@org.jetbrains.annotations.NotNull com.appsflyer.internal.components.network.http.ResponseNetwork<java.lang.String> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1v$14469$AFPurchaseConnectorA1w.onResponse(com.appsflyer.internal.components.network.http.ResponseNetwork):void");
    }
}
