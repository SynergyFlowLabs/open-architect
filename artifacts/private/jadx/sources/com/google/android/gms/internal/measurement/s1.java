package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class s1 extends n0 implements u1 {
    s1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void beginAdUnitExposure(String str, long j10) throws RemoteException {
        Parcel parcelK = k();
        parcelK.writeString(str);
        parcelK.writeLong(j10);
        n(23, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelK = k();
        parcelK.writeString(str);
        parcelK.writeString(str2);
        p0.c(parcelK, bundle);
        n(9, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void clearMeasurementEnabled(long j10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void endAdUnitExposure(String str, long j10) throws RemoteException {
        Parcel parcelK = k();
        parcelK.writeString(str);
        parcelK.writeLong(j10);
        n(24, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void generateEventId(x1 x1Var) throws RemoteException {
        Parcel parcelK = k();
        p0.d(parcelK, x1Var);
        n(22, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void getAppInstanceId(x1 x1Var) throws RemoteException {
        Parcel parcelK = k();
        p0.d(parcelK, x1Var);
        n(20, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void getCachedAppInstanceId(x1 x1Var) throws RemoteException {
        Parcel parcelK = k();
        p0.d(parcelK, x1Var);
        n(19, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void getConditionalUserProperties(String str, String str2, x1 x1Var) throws RemoteException {
        Parcel parcelK = k();
        parcelK.writeString(str);
        parcelK.writeString(str2);
        p0.d(parcelK, x1Var);
        n(10, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void getCurrentScreenClass(x1 x1Var) throws RemoteException {
        Parcel parcelK = k();
        p0.d(parcelK, x1Var);
        n(17, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void getCurrentScreenName(x1 x1Var) throws RemoteException {
        Parcel parcelK = k();
        p0.d(parcelK, x1Var);
        n(16, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void getGmpAppId(x1 x1Var) throws RemoteException {
        Parcel parcelK = k();
        p0.d(parcelK, x1Var);
        n(21, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void getMaxUserProperties(String str, x1 x1Var) throws RemoteException {
        Parcel parcelK = k();
        parcelK.writeString(str);
        p0.d(parcelK, x1Var);
        n(6, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void getSessionId(x1 x1Var) throws RemoteException {
        Parcel parcelK = k();
        p0.d(parcelK, x1Var);
        n(46, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void getTestFlag(x1 x1Var, int i10) throws RemoteException {
        Parcel parcelK = k();
        p0.d(parcelK, x1Var);
        parcelK.writeInt(i10);
        n(38, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void getUserProperties(String str, String str2, boolean z10, x1 x1Var) throws RemoteException {
        Parcel parcelK = k();
        parcelK.writeString(str);
        parcelK.writeString(str2);
        int i10 = p0.f108726b;
        parcelK.writeInt(z10 ? 1 : 0);
        p0.d(parcelK, x1Var);
        n(5, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void initForTests(Map map) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void initialize(com.google.android.gms.dynamic.d dVar, zzdd zzddVar, long j10) throws RemoteException {
        Parcel parcelK = k();
        p0.d(parcelK, dVar);
        p0.c(parcelK, zzddVar);
        parcelK.writeLong(j10);
        n(1, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void isDataCollectionEnabled(x1 x1Var) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) throws RemoteException {
        Parcel parcelK = k();
        parcelK.writeString(str);
        parcelK.writeString(str2);
        p0.c(parcelK, bundle);
        parcelK.writeInt(z10 ? 1 : 0);
        parcelK.writeInt(z11 ? 1 : 0);
        parcelK.writeLong(j10);
        n(2, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void logEventAndBundle(String str, String str2, Bundle bundle, x1 x1Var, long j10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void logHealthData(int i10, String str, com.google.android.gms.dynamic.d dVar, com.google.android.gms.dynamic.d dVar2, com.google.android.gms.dynamic.d dVar3) throws RemoteException {
        Parcel parcelK = k();
        parcelK.writeInt(5);
        parcelK.writeString(str);
        p0.d(parcelK, dVar);
        p0.d(parcelK, dVar2);
        p0.d(parcelK, dVar3);
        n(33, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void onActivityCreated(com.google.android.gms.dynamic.d dVar, Bundle bundle, long j10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j10) throws RemoteException {
        Parcel parcelK = k();
        p0.c(parcelK, zzdfVar);
        p0.c(parcelK, bundle);
        parcelK.writeLong(j10);
        n(53, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void onActivityDestroyed(com.google.android.gms.dynamic.d dVar, long j10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j10) throws RemoteException {
        Parcel parcelK = k();
        p0.c(parcelK, zzdfVar);
        parcelK.writeLong(j10);
        n(54, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void onActivityPaused(com.google.android.gms.dynamic.d dVar, long j10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j10) throws RemoteException {
        Parcel parcelK = k();
        p0.c(parcelK, zzdfVar);
        parcelK.writeLong(j10);
        n(55, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void onActivityResumed(com.google.android.gms.dynamic.d dVar, long j10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j10) throws RemoteException {
        Parcel parcelK = k();
        p0.c(parcelK, zzdfVar);
        parcelK.writeLong(j10);
        n(56, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void onActivitySaveInstanceState(com.google.android.gms.dynamic.d dVar, x1 x1Var, long j10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, x1 x1Var, long j10) throws RemoteException {
        Parcel parcelK = k();
        p0.c(parcelK, zzdfVar);
        p0.d(parcelK, x1Var);
        parcelK.writeLong(j10);
        n(57, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void onActivityStarted(com.google.android.gms.dynamic.d dVar, long j10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j10) throws RemoteException {
        Parcel parcelK = k();
        p0.c(parcelK, zzdfVar);
        parcelK.writeLong(j10);
        n(51, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void onActivityStopped(com.google.android.gms.dynamic.d dVar, long j10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j10) throws RemoteException {
        Parcel parcelK = k();
        p0.c(parcelK, zzdfVar);
        parcelK.writeLong(j10);
        n(52, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void performAction(Bundle bundle, x1 x1Var, long j10) throws RemoteException {
        Parcel parcelK = k();
        p0.c(parcelK, bundle);
        p0.d(parcelK, x1Var);
        parcelK.writeLong(j10);
        n(32, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void registerOnMeasurementEventListener(e2 e2Var) throws RemoteException {
        Parcel parcelK = k();
        p0.d(parcelK, e2Var);
        n(35, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void resetAnalyticsData(long j10) throws RemoteException {
        Parcel parcelK = k();
        parcelK.writeLong(j10);
        n(12, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void retrieveAndUploadBatches(a2 a2Var) throws RemoteException {
        Parcel parcelK = k();
        p0.d(parcelK, a2Var);
        n(58, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void setConditionalUserProperty(Bundle bundle, long j10) throws RemoteException {
        Parcel parcelK = k();
        p0.c(parcelK, bundle);
        parcelK.writeLong(j10);
        n(8, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void setConsent(Bundle bundle, long j10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void setConsentThirdParty(Bundle bundle, long j10) throws RemoteException {
        Parcel parcelK = k();
        p0.c(parcelK, bundle);
        parcelK.writeLong(j10);
        n(45, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void setCurrentScreen(com.google.android.gms.dynamic.d dVar, String str, String str2, long j10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void setCurrentScreenByScionActivityInfo(zzdf zzdfVar, String str, String str2, long j10) throws RemoteException {
        Parcel parcelK = k();
        p0.c(parcelK, zzdfVar);
        parcelK.writeString(str);
        parcelK.writeString(str2);
        parcelK.writeLong(j10);
        n(50, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void setDataCollectionEnabled(boolean z10) throws RemoteException {
        Parcel parcelK = k();
        int i10 = p0.f108726b;
        parcelK.writeInt(z10 ? 1 : 0);
        n(39, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void setDefaultEventParameters(Bundle bundle) throws RemoteException {
        Parcel parcelK = k();
        p0.c(parcelK, bundle);
        n(42, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void setEventInterceptor(e2 e2Var) throws RemoteException {
        Parcel parcelK = k();
        p0.d(parcelK, e2Var);
        n(34, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void setInstanceIdProvider(g2 g2Var) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void setMeasurementEnabled(boolean z10, long j10) throws RemoteException {
        Parcel parcelK = k();
        int i10 = p0.f108726b;
        parcelK.writeInt(z10 ? 1 : 0);
        parcelK.writeLong(j10);
        n(11, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void setMinimumSessionDuration(long j10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void setSessionTimeoutDuration(long j10) throws RemoteException {
        Parcel parcelK = k();
        parcelK.writeLong(j10);
        n(14, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void setSgtmDebugInfo(Intent intent) throws RemoteException {
        Parcel parcelK = k();
        p0.c(parcelK, intent);
        n(48, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void setUserId(String str, long j10) throws RemoteException {
        Parcel parcelK = k();
        parcelK.writeString(str);
        parcelK.writeLong(j10);
        n(7, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void setUserProperty(String str, String str2, com.google.android.gms.dynamic.d dVar, boolean z10, long j10) throws RemoteException {
        Parcel parcelK = k();
        parcelK.writeString(str);
        parcelK.writeString(str2);
        p0.d(parcelK, dVar);
        parcelK.writeInt(z10 ? 1 : 0);
        parcelK.writeLong(j10);
        n(4, parcelK);
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final void unregisterOnMeasurementEventListener(e2 e2Var) throws RemoteException {
        Parcel parcelK = k();
        p0.d(parcelK, e2Var);
        n(36, parcelK);
    }
}
