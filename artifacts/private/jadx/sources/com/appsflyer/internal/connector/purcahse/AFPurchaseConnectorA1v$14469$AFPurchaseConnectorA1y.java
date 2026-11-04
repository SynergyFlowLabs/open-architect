package com.appsflyer.internal.connector.purcahse;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.appsflyer.api.InAppPurchaseEvent;
import com.appsflyer.api.PurchaseClient;
import com.appsflyer.api.SubscriptionPurchaseEvent;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.locationtech.jts.geom.l;

/* JADX INFO: loaded from: classes3.dex */
public final class AFPurchaseConnectorA1v$14469$AFPurchaseConnectorA1y implements AFPurchaseConnectorA1r.AFPurchaseConnectorA1v {
    private /* synthetic */ PurchaseClient toJsonMap$51c3c665;

    public AFPurchaseConnectorA1v$14469$AFPurchaseConnectorA1y(PurchaseClient purchaseClient) {
        this.toJsonMap$51c3c665 = purchaseClient;
    }

    @Override // com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1r.AFPurchaseConnectorA1v
    public final void getPackageName(@NotNull List<InAppPurchaseEvent> list) throws Throwable {
        Intrinsics.checkNotNullParameter(list, "");
        try {
            Object[] objArr = {this.toJsonMap$51c3c665};
            Map<Integer, Object> map = AFPurchaseConnectorA1z.setSubscriptionPurchaseEventDataSource;
            Object method = map.get(-689733972);
            if (method == null) {
                method = ((Class) AFPurchaseConnectorA1z.InAppPurchaseEvent(View.getDefaultSize(0, 0) + 70, TextUtils.lastIndexOf("", l.f338160j, 0, 0) + 1, (char) (ExpandableListView.getPackedPositionGroup(0L) + 4390))).getMethod("getOneTimePurchaseOfferDetails", (Class) AFPurchaseConnectorA1z.InAppPurchaseEvent(69 - TextUtils.lastIndexOf("", l.f338160j, 0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, (char) (4390 - (ViewConfiguration.getKeyRepeatDelay() >> 16))));
                map.put(-689733972, method);
            }
            if (!((Set) ((Method) method).invoke(null, objArr)).contains("inapp")) {
                AFLogger.afDebugLog("Not configured for auto In-App purchase logging.");
                return;
            }
            try {
                Object[] objArr2 = {this.toJsonMap$51c3c665, list};
                Object method2 = map.get(950538528);
                if (method2 == null) {
                    method2 = ((Class) AFPurchaseConnectorA1z.InAppPurchaseEvent(70 - Color.alpha(0), ViewConfiguration.getTouchSlop() >> 8, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4390))).getMethod("InAppPurchaseEvent", (Class) AFPurchaseConnectorA1z.InAppPurchaseEvent((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 69, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 4390)), List.class);
                    map.put(950538528, method2);
                }
                Object objInvoke = ((Method) method2).invoke(null, objArr2);
                PurchaseClient purchaseClient = this.toJsonMap$51c3c665;
                try {
                    Object[] objArr3 = {purchaseClient};
                    Object method3 = map.get(-2095376603);
                    if (method3 == null) {
                        method3 = ((Class) AFPurchaseConnectorA1z.InAppPurchaseEvent(70 - Color.green((int) r13), (-1) - TextUtils.indexOf("", l.f338160j), (char) (4390 - ((Process.getThreadPriority(r13) + 20) >> 6)))).getMethod("InAppPurchaseEvent", (Class) AFPurchaseConnectorA1z.InAppPurchaseEvent((ViewConfiguration.getWindowTouchSlop() >> 8) + 70, ViewConfiguration.getWindowTouchSlop() >> 8, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 4390)));
                        map.put(-2095376603, method3);
                    }
                    Boolean bool = (Boolean) ((Method) method3).invoke(null, objArr3);
                    bool.booleanValue();
                    try {
                        Object[] objArr4 = {purchaseClient, bool, list, objInvoke};
                        Object method4 = map.get(-782823936);
                        if (method4 == null) {
                            method4 = ((Class) AFPurchaseConnectorA1z.InAppPurchaseEvent(TextUtils.getOffsetAfter("", 0) + 70, ViewConfiguration.getFadingEdgeLength() >> 16, (char) (4389 - Process.getGidForName("")))).getMethod("getOneTimePurchaseOfferDetails", (Class) AFPurchaseConnectorA1z.InAppPurchaseEvent(TextUtils.indexOf("", l.f338160j) + 71, KeyEvent.keyCodeFromString(""), (char) (4390 - Color.argb(0, 0, 0, 0))), Boolean.TYPE, List.class, Map.class);
                            map.put(-782823936, method4);
                        }
                        ((Method) method4).invoke(null, objArr4);
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } catch (Throwable th3) {
                    Throwable cause2 = th3.getCause();
                    if (cause2 == null) {
                        throw th3;
                    }
                    throw cause2;
                }
            } catch (Throwable th4) {
                Throwable cause3 = th4.getCause();
                if (cause3 == null) {
                    throw th4;
                }
                throw cause3;
            }
        } catch (Throwable th5) {
            Throwable cause4 = th5.getCause();
            if (cause4 == null) {
                throw th5;
            }
            throw cause4;
        }
    }

    @Override // com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1r.AFPurchaseConnectorA1v
    public final void getQuantity(@NotNull List<SubscriptionPurchaseEvent> list) throws Throwable {
        float f10;
        long j10;
        Intrinsics.checkNotNullParameter(list, "");
        try {
            Object[] objArr = {this.toJsonMap$51c3c665};
            Map<Integer, Object> map = AFPurchaseConnectorA1z.setSubscriptionPurchaseEventDataSource;
            Object method = map.get(-689733972);
            if (method != null) {
                f10 = 0.0f;
            } else {
                f10 = 0.0f;
                method = ((Class) AFPurchaseConnectorA1z.InAppPurchaseEvent(70 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), ViewConfiguration.getWindowTouchSlop() >> 8, (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4390))).getMethod("getOneTimePurchaseOfferDetails", (Class) AFPurchaseConnectorA1z.InAppPurchaseEvent(Process.getGidForName("") + 71, (-1) - TextUtils.lastIndexOf("", l.f338160j, 0), (char) (4390 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))));
                map.put(-689733972, method);
            }
            if (!((Set) ((Method) method).invoke(null, objArr)).contains("subs")) {
                AFLogger.afDebugLog("Not configured for auto Subscription logging");
                return;
            }
            try {
                Object[] objArr2 = {this.toJsonMap$51c3c665, list};
                Object method2 = map.get(1721058278);
                if (method2 != null) {
                    j10 = 0;
                } else {
                    j10 = 0;
                    method2 = ((Class) AFPurchaseConnectorA1z.InAppPurchaseEvent(71 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), TextUtils.lastIndexOf("", l.f338160j) + 1, (char) (4390 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))))).getMethod("toJsonMap", (Class) AFPurchaseConnectorA1z.InAppPurchaseEvent(71 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionType(0L), (char) (4390 - (ViewConfiguration.getWindowTouchSlop() >> 8))), List.class);
                    map.put(1721058278, method2);
                }
                Object objInvoke = ((Method) method2).invoke(null, objArr2);
                PurchaseClient purchaseClient = this.toJsonMap$51c3c665;
                try {
                    Object[] objArr3 = {purchaseClient};
                    Object method3 = map.get(-2095376603);
                    if (method3 == null) {
                        method3 = ((Class) AFPurchaseConnectorA1z.InAppPurchaseEvent((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 70, ViewConfiguration.getMaximumFlingVelocity() >> 16, (char) (View.resolveSizeAndState(0, 0, 0) + 4390))).getMethod("InAppPurchaseEvent", (Class) AFPurchaseConnectorA1z.InAppPurchaseEvent(TextUtils.getTrimmedLength("") + 70, (-1) - ExpandableListView.getPackedPositionChild(j10), (char) (4389 - (ExpandableListView.getPackedPositionForChild(0, 0) > j10 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j10 ? 0 : -1)))));
                        map.put(-2095376603, method3);
                    }
                    Boolean bool = (Boolean) ((Method) method3).invoke(null, objArr3);
                    bool.booleanValue();
                    try {
                        Object[] objArr4 = {purchaseClient, bool, Boolean.FALSE, list, objInvoke};
                        Object method4 = map.get(646847747);
                        if (method4 == null) {
                            Class cls = (Class) AFPurchaseConnectorA1z.InAppPurchaseEvent(70 - Color.argb(0, 0, 0, 0), (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (4389 - TextUtils.indexOf("", l.f338160j, 0)));
                            Class cls2 = (Class) AFPurchaseConnectorA1z.InAppPurchaseEvent(View.combineMeasuredStates(0, 0) + 70, (AudioTrack.getMinVolume() > f10 ? 1 : (AudioTrack.getMinVolume() == f10 ? 0 : -1)), (char) (KeyEvent.normalizeMetaState(0) + 4390));
                            Class cls3 = Boolean.TYPE;
                            method4 = cls.getMethod("InAppPurchaseEvent", cls2, cls3, cls3, List.class, Map.class);
                            map.put(646847747, method4);
                        }
                        ((Method) method4).invoke(null, objArr4);
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } catch (Throwable th3) {
                    Throwable cause2 = th3.getCause();
                    if (cause2 == null) {
                        throw th3;
                    }
                    throw cause2;
                }
            } catch (Throwable th4) {
                Throwable cause3 = th4.getCause();
                if (cause3 == null) {
                    throw th4;
                }
                throw cause3;
            }
        } catch (Throwable th5) {
            Throwable cause4 = th5.getCause();
            if (cause4 == null) {
                throw th5;
            }
            throw cause4;
        }
    }

    @Override // com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1r.AFPurchaseConnectorA1v
    public final void toJsonMap(@NotNull List<SubscriptionPurchaseEvent> list) throws Throwable {
        long j10;
        Intrinsics.checkNotNullParameter(list, "");
        try {
            Object[] objArr = {this.toJsonMap$51c3c665};
            Map<Integer, Object> map = AFPurchaseConnectorA1z.setSubscriptionPurchaseEventDataSource;
            Object method = map.get(-689733972);
            if (method != null) {
                j10 = 0;
            } else {
                j10 = 0;
                method = ((Class) AFPurchaseConnectorA1z.InAppPurchaseEvent((KeyEvent.getMaxKeyCode() >> 16) + 70, TextUtils.lastIndexOf("", l.f338160j) + 1, (char) (4389 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))))).getMethod("getOneTimePurchaseOfferDetails", (Class) AFPurchaseConnectorA1z.InAppPurchaseEvent(70 - (ViewConfiguration.getLongPressTimeout() >> 16), ViewConfiguration.getTapTimeout() >> 16, (char) (4390 - TextUtils.indexOf("", "", 0, 0))));
                map.put(-689733972, method);
            }
            if (!((Set) ((Method) method).invoke(null, objArr)).contains("subs")) {
                AFLogger.afDebugLog("Not configured for auto Subscription logging");
                return;
            }
            try {
                Object[] objArr2 = {this.toJsonMap$51c3c665, list};
                Object method2 = map.get(1721058278);
                if (method2 == null) {
                    method2 = ((Class) AFPurchaseConnectorA1z.InAppPurchaseEvent(TextUtils.indexOf("", l.f338160j, 0) + 71, ViewConfiguration.getTouchSlop() >> 8, (char) ((Process.myTid() >> 22) + 4390))).getMethod("toJsonMap", (Class) AFPurchaseConnectorA1z.InAppPurchaseEvent((ViewConfiguration.getPressedStateDuration() >> 16) + 70, TextUtils.lastIndexOf("", l.f338160j) + 1, (char) (TextUtils.indexOf("", "", 0, 0) + 4390)), List.class);
                    map.put(1721058278, method2);
                }
                Object objInvoke = ((Method) method2).invoke(null, objArr2);
                PurchaseClient purchaseClient = this.toJsonMap$51c3c665;
                try {
                    Object[] objArr3 = {purchaseClient};
                    Object method3 = map.get(-2095376603);
                    if (method3 == null) {
                        method3 = ((Class) AFPurchaseConnectorA1z.InAppPurchaseEvent(69 - MotionEvent.axisFromString(""), (Process.getElapsedCpuTime() > j10 ? 1 : (Process.getElapsedCpuTime() == j10 ? 0 : -1)) - 1, (char) (4391 - (SystemClock.elapsedRealtime() > j10 ? 1 : (SystemClock.elapsedRealtime() == j10 ? 0 : -1))))).getMethod("InAppPurchaseEvent", (Class) AFPurchaseConnectorA1z.InAppPurchaseEvent(70 - ExpandableListView.getPackedPositionGroup(j10), ViewConfiguration.getFadingEdgeLength() >> 16, (char) (4390 - (ViewConfiguration.getFadingEdgeLength() >> 16))));
                        map.put(-2095376603, method3);
                    }
                    Boolean bool = (Boolean) ((Method) method3).invoke(null, objArr3);
                    bool.booleanValue();
                    try {
                        Object[] objArr4 = {purchaseClient, bool, Boolean.TRUE, list, objInvoke};
                        Object method4 = map.get(646847747);
                        if (method4 == null) {
                            Class cls = (Class) AFPurchaseConnectorA1z.InAppPurchaseEvent(View.resolveSizeAndState(0, 0, 0) + 70, Color.alpha(0), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4390));
                            Class cls2 = (Class) AFPurchaseConnectorA1z.InAppPurchaseEvent(70 - View.resolveSize(0, 0), (Process.getThreadPriority(0) + 20) >> 6, (char) (4390 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)));
                            Class cls3 = Boolean.TYPE;
                            method4 = cls.getMethod("InAppPurchaseEvent", cls2, cls3, cls3, List.class, Map.class);
                            map.put(646847747, method4);
                        }
                        ((Method) method4).invoke(null, objArr4);
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } catch (Throwable th3) {
                    Throwable cause2 = th3.getCause();
                    if (cause2 == null) {
                        throw th3;
                    }
                    throw cause2;
                }
            } catch (Throwable th4) {
                Throwable cause3 = th4.getCause();
                if (cause3 == null) {
                    throw th4;
                }
                throw cause3;
            }
        } catch (Throwable th5) {
            Throwable cause4 = th5.getCause();
            if (cause4 == null) {
                throw th5;
            }
            throw cause4;
        }
    }
}
