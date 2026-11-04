package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface u1 extends IInterface {
    void beginAdUnitExposure(String str, long j10) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void clearMeasurementEnabled(long j10) throws RemoteException;

    void endAdUnitExposure(String str, long j10) throws RemoteException;

    void generateEventId(x1 x1Var) throws RemoteException;

    void getAppInstanceId(x1 x1Var) throws RemoteException;

    void getCachedAppInstanceId(x1 x1Var) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, x1 x1Var) throws RemoteException;

    void getCurrentScreenClass(x1 x1Var) throws RemoteException;

    void getCurrentScreenName(x1 x1Var) throws RemoteException;

    void getGmpAppId(x1 x1Var) throws RemoteException;

    void getMaxUserProperties(String str, x1 x1Var) throws RemoteException;

    void getSessionId(x1 x1Var) throws RemoteException;

    void getTestFlag(x1 x1Var, int i10) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z10, x1 x1Var) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(com.google.android.gms.dynamic.d dVar, zzdd zzddVar, long j10) throws RemoteException;

    void isDataCollectionEnabled(x1 x1Var) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, x1 x1Var, long j10) throws RemoteException;

    void logHealthData(int i10, String str, com.google.android.gms.dynamic.d dVar, com.google.android.gms.dynamic.d dVar2, com.google.android.gms.dynamic.d dVar3) throws RemoteException;

    void onActivityCreated(com.google.android.gms.dynamic.d dVar, Bundle bundle, long j10) throws RemoteException;

    void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j10) throws RemoteException;

    void onActivityDestroyed(com.google.android.gms.dynamic.d dVar, long j10) throws RemoteException;

    void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j10) throws RemoteException;

    void onActivityPaused(com.google.android.gms.dynamic.d dVar, long j10) throws RemoteException;

    void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j10) throws RemoteException;

    void onActivityResumed(com.google.android.gms.dynamic.d dVar, long j10) throws RemoteException;

    void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j10) throws RemoteException;

    void onActivitySaveInstanceState(com.google.android.gms.dynamic.d dVar, x1 x1Var, long j10) throws RemoteException;

    void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, x1 x1Var, long j10) throws RemoteException;

    void onActivityStarted(com.google.android.gms.dynamic.d dVar, long j10) throws RemoteException;

    void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j10) throws RemoteException;

    void onActivityStopped(com.google.android.gms.dynamic.d dVar, long j10) throws RemoteException;

    void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j10) throws RemoteException;

    void performAction(Bundle bundle, x1 x1Var, long j10) throws RemoteException;

    void registerOnMeasurementEventListener(e2 e2Var) throws RemoteException;

    void resetAnalyticsData(long j10) throws RemoteException;

    void retrieveAndUploadBatches(a2 a2Var) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j10) throws RemoteException;

    void setConsent(Bundle bundle, long j10) throws RemoteException;

    void setConsentThirdParty(Bundle bundle, long j10) throws RemoteException;

    void setCurrentScreen(com.google.android.gms.dynamic.d dVar, String str, String str2, long j10) throws RemoteException;

    void setCurrentScreenByScionActivityInfo(zzdf zzdfVar, String str, String str2, long j10) throws RemoteException;

    void setDataCollectionEnabled(boolean z10) throws RemoteException;

    void setDefaultEventParameters(Bundle bundle) throws RemoteException;

    void setEventInterceptor(e2 e2Var) throws RemoteException;

    void setInstanceIdProvider(g2 g2Var) throws RemoteException;

    void setMeasurementEnabled(boolean z10, long j10) throws RemoteException;

    void setMinimumSessionDuration(long j10) throws RemoteException;

    void setSessionTimeoutDuration(long j10) throws RemoteException;

    void setSgtmDebugInfo(Intent intent) throws RemoteException;

    void setUserId(String str, long j10) throws RemoteException;

    void setUserProperty(String str, String str2, com.google.android.gms.dynamic.d dVar, boolean z10, long j10) throws RemoteException;

    void unregisterOnMeasurementEventListener(e2 e2Var) throws RemoteException;
}
