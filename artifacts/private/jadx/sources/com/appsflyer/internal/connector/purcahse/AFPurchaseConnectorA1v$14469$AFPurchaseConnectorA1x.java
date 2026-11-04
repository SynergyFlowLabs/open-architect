package com.appsflyer.internal.connector.purcahse;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.api.PurchaseClient;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.locationtech.jts.geom.l;

/* JADX INFO: loaded from: classes3.dex */
public final class AFPurchaseConnectorA1v$14469$AFPurchaseConnectorA1x implements PurchaseHandler.PurchaseValidationCallback {
    private /* synthetic */ PurchaseClient toJsonMap$51c3c665;

    public AFPurchaseConnectorA1v$14469$AFPurchaseConnectorA1x(PurchaseClient purchaseClient) {
        this.toJsonMap$51c3c665 = purchaseClient;
    }

    @Override // com.appsflyer.PurchaseHandler.PurchaseValidationCallback
    public final void onFailure(@NotNull Throwable th2) throws Throwable {
        Intrinsics.checkNotNullParameter(th2, "");
        try {
            Object[] objArr = {this.toJsonMap$51c3c665};
            Map<Integer, Object> map = AFPurchaseConnectorA1z.setSubscriptionPurchaseEventDataSource;
            Object method = map.get(-1118379773);
            if (method == null) {
                method = ((Class) AFPurchaseConnectorA1z.InAppPurchaseEvent(70 - Color.alpha(0), ViewConfiguration.getEdgeSlop() >> 16, (char) (4390 - (Process.myPid() >> 22)))).getMethod("getPackageName", (Class) AFPurchaseConnectorA1z.InAppPurchaseEvent(TextUtils.indexOf("", "", 0) + 70, ExpandableListView.getPackedPositionGroup(0L), (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4390)));
                map.put(-1118379773, method);
            }
            PurchaseClient.SubscriptionPurchaseValidationResultListener subscriptionPurchaseValidationResultListener = (PurchaseClient.SubscriptionPurchaseValidationResultListener) ((Method) method).invoke(null, objArr);
            if (subscriptionPurchaseValidationResultListener != null) {
                subscriptionPurchaseValidationResultListener.onFailure("[PurchaseConnector]: Communication exception", th2);
            }
        } catch (Throwable th3) {
            Throwable cause = th3.getCause();
            if (cause == null) {
                throw th3;
            }
            throw cause;
        }
    }

    @Override // com.appsflyer.PurchaseHandler.PurchaseValidationCallback
    public final void onResponse(@NotNull ResponseNetwork<String> responseNetwork) throws Throwable {
        Intrinsics.checkNotNullParameter(responseNetwork, "");
        try {
            Object[] objArr = {this.toJsonMap$51c3c665};
            Map<Integer, Object> map = AFPurchaseConnectorA1z.setSubscriptionPurchaseEventDataSource;
            Object method = map.get(-975579693);
            if (method == null) {
                method = ((Class) AFPurchaseConnectorA1z.InAppPurchaseEvent(69 - ExpandableListView.getPackedPositionChild(0L), Drawable.resolveOpacity(0, 0), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 4389))).getMethod("getQuantity", (Class) AFPurchaseConnectorA1z.InAppPurchaseEvent(70 - Gravity.getAbsoluteGravity(0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, (char) (View.getDefaultSize(0, 0) + 4390)));
                map.put(-975579693, method);
            }
            PurchaseClient.InAppPurchaseValidationResultListener inAppPurchaseValidationResultListener = (PurchaseClient.InAppPurchaseValidationResultListener) ((Method) method).invoke(null, objArr);
            if (inAppPurchaseValidationResultListener != null) {
                if (!responseNetwork.isSuccessful()) {
                    String body = responseNetwork.getBody();
                    Intrinsics.checkNotNullExpressionValue(body, "");
                    inAppPurchaseValidationResultListener.onFailure(body, null);
                    return;
                }
                try {
                    Object[] objArr2 = {responseNetwork};
                    Object method2 = map.get(2082220885);
                    if (method2 == null) {
                        method2 = ((Class) AFPurchaseConnectorA1z.InAppPurchaseEvent(70 - View.getDefaultSize(0, 0), 70 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (TextUtils.lastIndexOf("", l.f338160j, 0, 0) + 1))).getMethod("InAppPurchaseEvent", ResponseNetwork.class);
                        map.put(2082220885, method2);
                    }
                    inAppPurchaseValidationResultListener.onResponse(((Method) method2).invoke(null, objArr2));
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
        } catch (Throwable th3) {
            Throwable cause2 = th3.getCause();
            if (cause2 == null) {
                throw th3;
            }
            throw cause2;
        }
    }
}
