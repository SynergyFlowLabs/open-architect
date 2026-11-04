package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzdf;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@DynamiteApi
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.l1
    h7 f109725a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.b0("listenerMap")
    private final Map f109726b = new androidx.collection.a();

    public AppMeasurementDynamiteService() {
        int i10 = 5 ^ 0;
    }

    @il.d({"scion"})
    private final void k() {
        if (this.f109725a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void n(com.google.android.gms.internal.measurement.x1 x1Var, String str) {
        k();
        this.f109725a.C().a0(x1Var, str);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void beginAdUnitExposure(@NonNull String str, long j10) throws RemoteException {
        k();
        this.f109725a.M().i(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) throws RemoteException {
        k();
        this.f109725a.B().P(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void clearMeasurementEnabled(long j10) throws RemoteException {
        k();
        this.f109725a.B().o0(null);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void endAdUnitExposure(@NonNull String str, long j10) throws RemoteException {
        k();
        this.f109725a.M().j(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void generateEventId(com.google.android.gms.internal.measurement.x1 x1Var) throws RemoteException {
        k();
        long jP0 = this.f109725a.C().p0();
        k();
        this.f109725a.C().b0(x1Var, jP0);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void getAppInstanceId(com.google.android.gms.internal.measurement.x1 x1Var) throws RemoteException {
        k();
        this.f109725a.b().t(new e7(this, x1Var));
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.x1 x1Var) throws RemoteException {
        k();
        n(x1Var, this.f109725a.B().E());
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void getConditionalUserProperties(String str, String str2, com.google.android.gms.internal.measurement.x1 x1Var) throws RemoteException {
        k();
        this.f109725a.b().t(new kb(this, x1Var, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.x1 x1Var) throws RemoteException {
        k();
        n(x1Var, this.f109725a.B().S());
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.x1 x1Var) throws RemoteException {
        k();
        n(x1Var, this.f109725a.B().R());
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void getGmpAppId(com.google.android.gms.internal.measurement.x1 x1Var) throws RemoteException {
        k();
        n(x1Var, this.f109725a.B().T());
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void getMaxUserProperties(String str, com.google.android.gms.internal.measurement.x1 x1Var) throws RemoteException {
        k();
        this.f109725a.B().M(str);
        k();
        this.f109725a.C().c0(x1Var, 25);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void getSessionId(com.google.android.gms.internal.measurement.x1 x1Var) throws RemoteException {
        k();
        ta taVarB = this.f109725a.B();
        taVarB.f110184a.b().t(new t9(taVarB, x1Var));
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void getTestFlag(com.google.android.gms.internal.measurement.x1 x1Var, int i10) throws RemoteException {
        k();
        if (i10 == 0) {
            this.f109725a.C().a0(x1Var, this.f109725a.B().k0());
            return;
        }
        if (i10 == 1) {
            this.f109725a.C().b0(x1Var, this.f109725a.B().l0().longValue());
            return;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                this.f109725a.C().c0(x1Var, this.f109725a.B().m0().intValue());
                return;
            } else {
                if (i10 != 4) {
                    return;
                }
                this.f109725a.C().e0(x1Var, this.f109725a.B().j0().booleanValue());
                return;
            }
        }
        ze zeVarC = this.f109725a.C();
        double dDoubleValue = this.f109725a.B().n0().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", dDoubleValue);
        try {
            x1Var.r(bundle);
        } catch (RemoteException e10) {
            zeVarC.f110184a.a().r().b("Error returning double value to wrapper", e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void getUserProperties(String str, String str2, boolean z10, com.google.android.gms.internal.measurement.x1 x1Var) throws RemoteException {
        k();
        this.f109725a.b().t(new g9(this, x1Var, str, str2, z10));
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void initForTests(@NonNull Map map) throws RemoteException {
        k();
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void initialize(com.google.android.gms.dynamic.d dVar, zzdd zzddVar, long j10) throws RemoteException {
        h7 h7Var = this.f109725a;
        if (h7Var == null) {
            this.f109725a = h7.O((Context) com.google.android.gms.common.internal.w.r((Context) com.google.android.gms.dynamic.f.n(dVar)), zzddVar, Long.valueOf(j10));
        } else {
            h7Var.a().r().a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.x1 x1Var) throws RemoteException {
        k();
        this.f109725a.b().t(new lc(this, x1Var));
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z10, boolean z11, long j10) throws RemoteException {
        k();
        this.f109725a.B().q(str, str2, bundle, z10, z11, j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void logEventAndBundle(String str, String str2, Bundle bundle, com.google.android.gms.internal.measurement.x1 x1Var, long j10) throws RemoteException {
        k();
        com.google.android.gms.common.internal.w.l(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.f109725a.b().t(new f8(this, x1Var, new zzbg(str2, new zzbe(bundle), "app", j10), str));
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void logHealthData(int i10, @NonNull String str, @NonNull com.google.android.gms.dynamic.d dVar, @NonNull com.google.android.gms.dynamic.d dVar2, @NonNull com.google.android.gms.dynamic.d dVar3) throws RemoteException {
        k();
        this.f109725a.a().y(i10, true, false, str, dVar == null ? null : com.google.android.gms.dynamic.f.n(dVar), dVar2 == null ? null : com.google.android.gms.dynamic.f.n(dVar2), dVar3 != null ? com.google.android.gms.dynamic.f.n(dVar3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivityCreated(@NonNull com.google.android.gms.dynamic.d dVar, @NonNull Bundle bundle, long j10) throws RemoteException {
        k();
        onActivityCreatedByScionActivityInfo(zzdf.O1((Activity) com.google.android.gms.common.internal.w.r((Activity) com.google.android.gms.dynamic.f.n(dVar))), bundle, j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j10) {
        k();
        fa faVar = this.f109725a.B().f110532c;
        if (faVar != null) {
            this.f109725a.B().i0();
            faVar.b(zzdfVar, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivityDestroyed(@NonNull com.google.android.gms.dynamic.d dVar, long j10) throws RemoteException {
        k();
        onActivityDestroyedByScionActivityInfo(zzdf.O1((Activity) com.google.android.gms.common.internal.w.r((Activity) com.google.android.gms.dynamic.f.n(dVar))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j10) throws RemoteException {
        k();
        fa faVar = this.f109725a.B().f110532c;
        if (faVar != null) {
            this.f109725a.B().i0();
            faVar.d(zzdfVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivityPaused(@NonNull com.google.android.gms.dynamic.d dVar, long j10) throws RemoteException {
        k();
        onActivityPausedByScionActivityInfo(zzdf.O1((Activity) com.google.android.gms.common.internal.w.r((Activity) com.google.android.gms.dynamic.f.n(dVar))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j10) throws RemoteException {
        k();
        fa faVar = this.f109725a.B().f110532c;
        if (faVar != null) {
            this.f109725a.B().i0();
            faVar.c(zzdfVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivityResumed(@NonNull com.google.android.gms.dynamic.d dVar, long j10) throws RemoteException {
        k();
        onActivityResumedByScionActivityInfo(zzdf.O1((Activity) com.google.android.gms.common.internal.w.r((Activity) com.google.android.gms.dynamic.f.n(dVar))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j10) throws RemoteException {
        k();
        fa faVar = this.f109725a.B().f110532c;
        if (faVar != null) {
            this.f109725a.B().i0();
            faVar.e(zzdfVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivitySaveInstanceState(com.google.android.gms.dynamic.d dVar, com.google.android.gms.internal.measurement.x1 x1Var, long j10) throws RemoteException {
        k();
        onActivitySaveInstanceStateByScionActivityInfo(zzdf.O1((Activity) com.google.android.gms.common.internal.w.r((Activity) com.google.android.gms.dynamic.f.n(dVar))), x1Var, j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, com.google.android.gms.internal.measurement.x1 x1Var, long j10) throws RemoteException {
        k();
        fa faVar = this.f109725a.B().f110532c;
        Bundle bundle = new Bundle();
        if (faVar != null) {
            this.f109725a.B().i0();
            faVar.a(zzdfVar, bundle);
        }
        try {
            x1Var.r(bundle);
        } catch (RemoteException e10) {
            this.f109725a.a().r().b("Error returning bundle value to wrapper", e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivityStarted(@NonNull com.google.android.gms.dynamic.d dVar, long j10) throws RemoteException {
        k();
        onActivityStartedByScionActivityInfo(zzdf.O1((Activity) com.google.android.gms.common.internal.w.r((Activity) com.google.android.gms.dynamic.f.n(dVar))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j10) throws RemoteException {
        k();
        if (this.f109725a.B().f110532c != null) {
            this.f109725a.B().i0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivityStopped(@NonNull com.google.android.gms.dynamic.d dVar, long j10) throws RemoteException {
        k();
        onActivityStoppedByScionActivityInfo(zzdf.O1((Activity) com.google.android.gms.common.internal.w.r((Activity) com.google.android.gms.dynamic.f.n(dVar))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j10) throws RemoteException {
        k();
        if (this.f109725a.B().f110532c != null) {
            this.f109725a.B().i0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void performAction(Bundle bundle, com.google.android.gms.internal.measurement.x1 x1Var, long j10) throws RemoteException {
        k();
        x1Var.r(null);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.e2 e2Var) throws RemoteException {
        w8 afVar;
        k();
        Map map = this.f109726b;
        synchronized (map) {
            try {
                afVar = (w8) map.get(Integer.valueOf(e2Var.c()));
                if (afVar == null) {
                    afVar = new af(this, e2Var);
                    map.put(Integer.valueOf(e2Var.c()), afVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f109725a.B().K(afVar);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void resetAnalyticsData(long j10) throws RemoteException {
        k();
        this.f109725a.B().H(j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void retrieveAndUploadBatches(final com.google.android.gms.internal.measurement.a2 a2Var) {
        k();
        this.f109725a.B().s0(new Runnable() { // from class: com.google.android.gms.measurement.internal.md
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    a2Var.j();
                } catch (RemoteException e10) {
                    ((h7) com.google.android.gms.common.internal.w.r(this.f110269a.f109725a)).a().r().b("Failed to call IDynamiteUploadBatchesCallback", e10);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setConditionalUserProperty(@NonNull Bundle bundle, long j10) throws RemoteException {
        k();
        if (bundle == null) {
            this.f109725a.a().o().a("Conditional user property must not be null");
        } else {
            this.f109725a.B().O(bundle, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setConsent(@NonNull Bundle bundle, long j10) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setConsentThirdParty(@NonNull Bundle bundle, long j10) throws RemoteException {
        k();
        this.f109725a.B().p0(bundle, -20, j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setCurrentScreen(@NonNull com.google.android.gms.dynamic.d dVar, @NonNull String str, @NonNull String str2, long j10) throws RemoteException {
        k();
        setCurrentScreenByScionActivityInfo(zzdf.O1((Activity) com.google.android.gms.common.internal.w.r((Activity) com.google.android.gms.dynamic.f.n(dVar))), str, str2, j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setCurrentScreenByScionActivityInfo(zzdf zzdfVar, String str, String str2, long j10) throws RemoteException {
        k();
        this.f109725a.I().t(zzdfVar, str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setDataCollectionEnabled(boolean z10) throws RemoteException {
        k();
        ta taVarB = this.f109725a.B();
        taVarB.j();
        taVarB.f110184a.b().t(new e9(taVarB, z10));
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setDefaultEventParameters(@NonNull Bundle bundle) {
        k();
        final ta taVarB = this.f109725a.B();
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        taVarB.f110184a.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.oa
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                taVarB.V(bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setEventInterceptor(com.google.android.gms.internal.measurement.e2 e2Var) throws RemoteException {
        k();
        je jeVar = new je(this, e2Var);
        if (this.f109725a.b().p()) {
            this.f109725a.B().J(jeVar);
        } else {
            this.f109725a.b().t(new ha(this, jeVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.g2 g2Var) throws RemoteException {
        k();
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setMeasurementEnabled(boolean z10, long j10) throws RemoteException {
        k();
        this.f109725a.B().o0(Boolean.valueOf(z10));
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setMinimumSessionDuration(long j10) throws RemoteException {
        k();
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setSessionTimeoutDuration(long j10) throws RemoteException {
        k();
        ta taVarB = this.f109725a.B();
        taVarB.f110184a.b().t(new h9(taVarB, j10));
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setSgtmDebugInfo(@NonNull Intent intent) throws RemoteException {
        k();
        ta taVarB = this.f109725a.B();
        Uri data = intent.getData();
        if (data == null) {
            taVarB.f110184a.a().u().a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            h7 h7Var = taVarB.f110184a;
            h7Var.a().u().a("[sgtm] Preview Mode was not enabled.");
            h7Var.w().Q(null);
        } else {
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (TextUtils.isEmpty(queryParameter2)) {
                return;
            }
            h7 h7Var2 = taVarB.f110184a;
            h7Var2.a().u().b("[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
            h7Var2.w().Q(queryParameter2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setUserId(@NonNull final String str, long j10) throws RemoteException {
        k();
        final ta taVarB = this.f109725a.B();
        if (str != null && TextUtils.isEmpty(str)) {
            taVarB.f110184a.a().r().a("User ID must be non-empty or null");
        } else {
            taVarB.f110184a.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.pa
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    h7 h7Var = taVarB.f110184a;
                    if (h7Var.L().x(str)) {
                        h7Var.L().p();
                    }
                }
            });
            taVarB.z(null, "_id", str, true, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull com.google.android.gms.dynamic.d dVar, boolean z10, long j10) throws RemoteException {
        k();
        this.f109725a.B().z(str, str2, com.google.android.gms.dynamic.f.n(dVar), z10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.e2 e2Var) throws RemoteException {
        w8 afVar;
        k();
        Map map = this.f109726b;
        synchronized (map) {
            try {
                afVar = (w8) map.remove(Integer.valueOf(e2Var.c()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (afVar == null) {
            afVar = new af(this, e2Var);
        }
        this.f109725a.B().L(afVar);
    }
}
