package com.appsflyer.internal.connector.purcahse;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.c0;
import com.android.billingclient.api.d0;
import com.android.billingclient.api.e0;
import com.android.billingclient.api.g0;
import com.android.billingclient.api.h;
import com.android.billingclient.api.j;
import com.android.billingclient.api.n;
import com.appsflyer.AFLogger;
import com.planner5d.library.engine.input.f;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.locationtech.jts.geom.l;

/* JADX INFO: loaded from: classes3.dex */
public class AFPurchaseConnectorA1u implements j, c0, d0, AFPurchaseConnectorA1r {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int PurchaseClient = 1;
    private static int hashCode;
    private static char[] startObservingTransactions = {23504, 28246, 12520, 64337, 36226, 20535, 6816, 11461, 63349, 47593, 19516, 5822, 55588, 58195, 46563, 30821, 659, 54573, 40852, 41421, 29808, 16102, 49419};
    private static long stopObservingTransactions = 18552468981824693L;
    private final h InAppPurchaseEvent;
    private boolean getOneTimePurchaseOfferDetails = true;
    final Context getPackageName;
    private final SharedPreferences getQuantity;
    private AFPurchaseConnectorA1r.AFPurchaseConnectorA1v toJsonMap;

    public class AFPurchaseConnectorA1v implements AFPurchaseConnectorA1r.AFPurchaseConnectorA1x<h> {

        @NonNull
        final d0 InAppPurchaseEvent;

        public AFPurchaseConnectorA1v(d0 d0Var) {
            this.InAppPurchaseEvent = d0Var;
        }
    }

    public AFPurchaseConnectorA1u(@NonNull Context context, @p0 AFPurchaseConnectorA1v aFPurchaseConnectorA1v, @NonNull SharedPreferences sharedPreferences) {
        aFPurchaseConnectorA1v = aFPurchaseConnectorA1v == null ? new AFPurchaseConnectorA1v(this) : aFPurchaseConnectorA1v;
        this.getPackageName = context;
        this.getQuantity = sharedPreferences;
        this.InAppPurchaseEvent = h.m(AFPurchaseConnectorA1u.this.getPackageName).g(aFPurchaseConnectorA1v.InAppPurchaseEvent).d().a();
    }

    private static void a(int i10, char c10, int i11, Object[] objArr) {
        int i12;
        AFPurchaseConnectorA1o aFPurchaseConnectorA1o = new AFPurchaseConnectorA1o();
        long[] jArr = new long[i10];
        aFPurchaseConnectorA1o.getOneTimePurchaseOfferDetails = 0;
        while (true) {
            int i13 = aFPurchaseConnectorA1o.getOneTimePurchaseOfferDetails;
            if (i13 >= i10) {
                break;
            }
            jArr[i13] = (((long) ((char) (((long) startObservingTransactions[i11 + i13]) ^ 1631790634049145120L))) ^ (((long) i13) * (1631790634049145120L ^ stopObservingTransactions))) ^ ((long) c10);
            aFPurchaseConnectorA1o.getOneTimePurchaseOfferDetails = i13 + 1;
            $10 = ($11 + 15) % 128;
        }
        char[] cArr = new char[i10];
        aFPurchaseConnectorA1o.getOneTimePurchaseOfferDetails = 0;
        $10 = ($11 + 59) % 128;
        while (true) {
            int i14 = aFPurchaseConnectorA1o.getOneTimePurchaseOfferDetails;
            if (i14 >= i10) {
                objArr[0] = new String(cArr);
                return;
            }
            int i15 = $11 + 63;
            $10 = i15 % 128;
            if (i15 % 2 != 0) {
                cArr[i14] = (char) jArr[i14];
                i12 = i14 / 0;
            } else {
                cArr[i14] = (char) jArr[i14];
                i12 = i14 + 1;
            }
            aFPurchaseConnectorA1o.getOneTimePurchaseOfferDetails = i12;
        }
    }

    private void getOneTimePurchaseOfferDetails(n nVar) throws Throwable {
        int i10 = hashCode + 101;
        PurchaseClient = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                nVar.b();
                throw null;
            }
            if (nVar.b() != 0) {
                PurchaseClient = (hashCode + 69) % 128;
                return;
            }
            SharedPreferences sharedPreferences = this.getQuantity;
            Object[] objArr = new Object[1];
            a(MotionEvent.axisFromString("") + 24, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 21137), ViewConfiguration.getScrollBarSize() >> 8, objArr);
            if (sharedPreferences.getBoolean(((String) objArr[0]).intern(), false)) {
                return;
            }
            this.InAppPurchaseEvent.q(g0.a().b("subs").a(), this);
            PurchaseClient = (hashCode + f.b.f160733u1) % 128;
        } catch (Throwable th2) {
            try {
                Object[] objArr2 = {th2};
                Map<Integer, Object> map = AFPurchaseConnectorA1z.setSubscriptionPurchaseEventDataSource;
                Object method = map.get(394734513);
                if (method == null) {
                    method = ((Class) AFPurchaseConnectorA1z.InAppPurchaseEvent((KeyEvent.getMaxKeyCode() >> 16) + 70, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 69, (char) View.resolveSizeAndState(0, 0, 0))).getMethod("getOneTimePurchaseOfferDetails", Throwable.class);
                    map.put(394734513, method);
                }
                ((Method) method).invoke(null, objArr2);
                AFLogger.afErrorLog("[PurchaseConnector]: Failed to log purchases history", th2, true);
            } catch (Throwable th3) {
                Throwable cause = th3.getCause();
                if (cause == null) {
                    throw th3;
                }
                throw cause;
            }
        }
    }

    @Override // com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1r
    public void InAppPurchaseEvent() {
        int i10 = hashCode + 29;
        PurchaseClient = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (this.getOneTimePurchaseOfferDetails) {
            this.getOneTimePurchaseOfferDetails = false;
            this.InAppPurchaseEvent.w(this);
        }
        int i11 = hashCode + 51;
        PurchaseClient = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1r
    public boolean getPackageName() {
        int i10 = PurchaseClient;
        boolean z10 = this.getOneTimePurchaseOfferDetails;
        hashCode = (i10 + 123) % 128;
        return z10;
    }

    @Override // com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1r
    public void getQuantity(AFPurchaseConnectorA1r.AFPurchaseConnectorA1v aFPurchaseConnectorA1v) {
        int i10 = (PurchaseClient + f.b.f160745y1) % 128;
        hashCode = i10;
        this.toJsonMap = aFPurchaseConnectorA1v;
        PurchaseClient = (i10 + f.b.f160733u1) % 128;
    }

    @Override // com.android.billingclient.api.j
    public void onBillingServiceDisconnected() {
        PurchaseClient = (hashCode + 53) % 128;
        AFLogger.afDebugLog("[PurchaseConnector]: onBillingServiceDisconnected");
        PurchaseClient = (hashCode + 95) % 128;
    }

    @Override // com.android.billingclient.api.j
    public void onBillingSetupFinished(@NonNull n nVar) throws Throwable {
        int i10 = PurchaseClient + 3;
        hashCode = i10 % 128;
        if (i10 % 2 != 0) {
            AFLogger.afDebugLog("[PurchaseConnector]: onBillingSetupFinished");
            getOneTimePurchaseOfferDetails(nVar);
            throw null;
        }
        AFLogger.afDebugLog("[PurchaseConnector]: onBillingSetupFinished");
        getOneTimePurchaseOfferDetails(nVar);
        int i11 = PurchaseClient + 25;
        hashCode = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.android.billingclient.api.d0
    public void onPurchasesUpdated(@NonNull n nVar, @p0 List<Purchase> list) throws Throwable {
        hashCode = (PurchaseClient + 9) % 128;
        AFLogger.afDebugLog("[PurchaseConnector]: onPurchasesUpdated");
        getQuantity(nVar, list, false);
        hashCode = (PurchaseClient + 101) % 128;
    }

    @Override // com.android.billingclient.api.c0
    public void onQueryPurchasesResponse(@NonNull n nVar, @NonNull List<Purchase> list) throws Throwable {
        hashCode = (PurchaseClient + 55) % 128;
        if (nVar.b() != 0) {
            hashCode = (PurchaseClient + 13) % 128;
            AFLogger.afWarnLog("[PurchaseConnector]: Failed to query purchases history");
            int i10 = PurchaseClient + 119;
            hashCode = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            return;
        }
        if (!list.isEmpty()) {
            getQuantity(nVar, list, true);
            return;
        }
        SharedPreferences.Editor editorEdit = this.getQuantity.edit();
        Object[] objArr = new Object[1];
        a(Color.rgb(0, 0, 0) + 16777239, (char) (AndroidCharacter.getMirror(l.f338160j) + 21089), View.MeasureSpec.getMode(0), objArr);
        editorEdit.putBoolean(((String) objArr[0]).intern(), true).apply();
        AFLogger.afDebugLog("[PurchaseConnector]: No active subscriptions and/or non-consumed one-time purchases found");
    }

    @Override // com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1r
    public void toJsonMap() {
        if (this.getOneTimePurchaseOfferDetails) {
            return;
        }
        hashCode = (PurchaseClient + 49) % 128;
        this.getOneTimePurchaseOfferDetails = true;
        this.InAppPurchaseEvent.e();
        PurchaseClient = (hashCode + 1) % 128;
    }

    private void getQuantity(n nVar, List<Purchase> list, boolean z10) throws Throwable {
        PurchaseClient = (hashCode + 63) % 128;
        boolean z11 = true | true;
        try {
            if (nVar.b() == 0) {
                hashCode = (PurchaseClient + 13) % 128;
                if (list != null) {
                    if (this.InAppPurchaseEvent == null) {
                        AFLogger.afWarnLog("[PurchaseConnector]: Got Ars billing callback but billing client is missing!");
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator<Purchase> it = list.iterator();
                    while (!(!it.hasNext())) {
                        arrayList.addAll(it.next().g());
                    }
                    InAppPurchaseEvent("subs", arrayList, list, z10);
                    InAppPurchaseEvent("inapp", arrayList, list, z10);
                    return;
                }
            }
            StringBuilder sb2 = new StringBuilder("[PurchaseConnector]: Failed to setup Ars Play billing service: ");
            sb2.append(nVar.b());
            sb2.append(" ");
            sb2.append(nVar.a());
            AFLogger.afWarnLog(sb2.toString());
        } catch (Throwable th2) {
            try {
                Object[] objArr = {th2};
                Map<Integer, Object> map = AFPurchaseConnectorA1z.setSubscriptionPurchaseEventDataSource;
                Object method = map.get(394734513);
                if (method == null) {
                    method = ((Class) AFPurchaseConnectorA1z.InAppPurchaseEvent(70 - (ViewConfiguration.getJumpTapTimeout() >> 16), 70 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) View.getDefaultSize(0, 0))).getMethod("getOneTimePurchaseOfferDetails", Throwable.class);
                    map.put(394734513, method);
                }
                ((Method) method).invoke(null, objArr);
                th2.printStackTrace();
                AFLogger.afErrorLog("[PurchaseConnector]: Failed to query new purchase details", th2, true);
            } catch (Throwable th3) {
                Throwable cause = th3.getCause();
                if (cause == null) {
                    throw th3;
                }
                throw cause;
            }
        }
    }

    private void InAppPurchaseEvent(@NonNull String str, List<String> list, List<Purchase> list2, boolean z10) throws Throwable {
        int i10 = PurchaseClient + 55;
        hashCode = i10 % 128;
        if (i10 % 2 != 0) {
            "subs".equals(str);
            throw null;
        }
        if (!"subs".equals(str) && !"inapp".equals(str)) {
            StringBuilder sb2 = new StringBuilder("[PurchaseConnector]: ");
            sb2.append(str);
            sb2.append(" SKU type is illegal");
            AFLogger.afWarnLog(sb2.toString());
            return;
        }
        StringBuilder sb3 = new StringBuilder("[PurchaseConnector]: Querying Sku details:\n\ttype: ");
        sb3.append(str);
        sb3.append("\n\tSkus: ");
        try {
            Object[] objArr = {list, ", "};
            Map<Integer, Object> map = AFPurchaseConnectorA1z.setSubscriptionPurchaseEventDataSource;
            Object method = map.get(-1676716214);
            if (method == null) {
                method = ((Class) AFPurchaseConnectorA1z.InAppPurchaseEvent(70 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 69, (char) ((-1) - MotionEvent.axisFromString("")))).getMethod("toJsonMap", List.class, CharSequence.class);
                map.put(-1676716214, method);
            }
            sb3.append((String) ((Method) method).invoke(null, objArr));
            AFLogger.afDebugLog(sb3.toString());
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                PurchaseClient = (hashCode + 37) % 128;
                arrayList.add(e0.b.a().b(it.next()).c(str).a());
            }
            this.InAppPurchaseEvent.n(e0.a().b(arrayList).a(), new AFPurchaseConnectorA1t(str, this.toJsonMap, list2, z10));
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }
}
