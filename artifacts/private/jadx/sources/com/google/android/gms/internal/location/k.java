package com.google.android.gms.internal.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.location.zzb;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends com.google.android.gms.common.api.k implements com.google.android.gms.location.c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final com.google.android.gms.common.api.a.g f108130n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final com.google.android.gms.common.api.a f108131o;

    static {
        com.google.android.gms.common.api.a.g gVar = new com.google.android.gms.common.api.a.g();
        f108130n = gVar;
        f108131o = new com.google.android.gms.common.api.a("ActivityRecognition.API", new h(), gVar);
    }

    public k(Activity activity) {
        super(activity, (com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.d.C0969d>) f108131o, com.google.android.gms.common.api.a.d.N1, com.google.android.gms.common.api.k.a.f106306c);
    }

    @Override // com.google.android.gms.location.c
    public final Task<Void> E(final PendingIntent pendingIntent) {
        return x0(com.google.android.gms.common.api.internal.b0.a().c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.internal.location.l
            @Override // com.google.android.gms.common.api.internal.w
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                com.google.android.gms.common.api.a aVar = k.f108131o;
                ((e4) obj).w0(pendingIntent);
                ((com.google.android.gms.tasks.l) obj2).c(null);
            }
        }).f(2402).a());
    }

    @Override // com.google.android.gms.location.c
    public final Task<Void> W(final PendingIntent pendingIntent) {
        return x0(com.google.android.gms.common.api.internal.b0.a().c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.internal.location.o
            @Override // com.google.android.gms.common.api.internal.w
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                com.google.android.gms.common.api.a aVar = k.f108131o;
                j jVar = new j((com.google.android.gms.tasks.l) obj2);
                PendingIntent pendingIntent2 = pendingIntent;
                com.google.android.gms.common.internal.w.s(pendingIntent2, "PendingIntent must be specified.");
                com.google.android.gms.common.internal.w.s(jVar, "ResultHolder not provided.");
                ((q4) ((e4) obj).M()).a4(pendingIntent2, new com.google.android.gms.common.api.internal.y(jVar));
            }
        }).f(2411).a());
    }

    @Override // com.google.android.gms.location.c
    public final Task<Void> a0(final PendingIntent pendingIntent) {
        return x0(com.google.android.gms.common.api.internal.b0.a().c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.internal.location.n
            @Override // com.google.android.gms.common.api.internal.w
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                com.google.android.gms.common.api.a aVar = k.f108131o;
                j jVar = new j((com.google.android.gms.tasks.l) obj2);
                com.google.android.gms.common.internal.w.s(jVar, "ResultHolder not provided.");
                ((q4) ((e4) obj).M()).w3(pendingIntent, new com.google.android.gms.common.api.internal.y(jVar));
            }
        }).f(2406).a());
    }

    @Override // com.google.android.gms.location.c
    public final Task<Void> b0(long j10, final PendingIntent pendingIntent) {
        com.google.android.gms.location.x xVar = new com.google.android.gms.location.x();
        xVar.a(j10);
        final zzb zzbVarB = xVar.b();
        zzbVarB.O1(B0());
        return x0(com.google.android.gms.common.api.internal.b0.a().c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.internal.location.q
            @Override // com.google.android.gms.common.api.internal.w
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                com.google.android.gms.common.api.a aVar = k.f108131o;
                j jVar = new j((com.google.android.gms.tasks.l) obj2);
                zzb zzbVar = zzbVarB;
                com.google.android.gms.common.internal.w.s(zzbVar, "ActivityRecognitionRequest can't be null.");
                PendingIntent pendingIntent2 = pendingIntent;
                com.google.android.gms.common.internal.w.s(pendingIntent2, "PendingIntent must be specified.");
                com.google.android.gms.common.internal.w.s(jVar, "ResultHolder not provided.");
                ((q4) ((e4) obj).M()).Ba(zzbVar, pendingIntent2, new com.google.android.gms.common.api.internal.y(jVar));
            }
        }).f(2401).a());
    }

    @Override // com.google.android.gms.location.c
    public final Task<Void> f(final ActivityTransitionRequest activityTransitionRequest, final PendingIntent pendingIntent) {
        activityTransitionRequest.T1(B0());
        return x0(com.google.android.gms.common.api.internal.b0.a().c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.internal.location.m
            @Override // com.google.android.gms.common.api.internal.w
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                com.google.android.gms.common.api.a aVar = k.f108131o;
                j jVar = new j((com.google.android.gms.tasks.l) obj2);
                ActivityTransitionRequest activityTransitionRequest2 = activityTransitionRequest;
                com.google.android.gms.common.internal.w.s(activityTransitionRequest2, "activityTransitionRequest must be specified.");
                PendingIntent pendingIntent2 = pendingIntent;
                com.google.android.gms.common.internal.w.s(pendingIntent2, "PendingIntent must be specified.");
                com.google.android.gms.common.internal.w.s(jVar, "ResultHolder not provided.");
                ((q4) ((e4) obj).M()).H6(activityTransitionRequest2, pendingIntent2, new com.google.android.gms.common.api.internal.y(jVar));
            }
        }).f(2405).a());
    }

    @Override // com.google.android.gms.location.c
    public final Task<Void> y(final PendingIntent pendingIntent, final SleepSegmentRequest sleepSegmentRequest) {
        com.google.android.gms.common.internal.w.s(pendingIntent, "PendingIntent must be specified.");
        return r0(com.google.android.gms.common.api.internal.b0.a().c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.internal.location.p
            @Override // com.google.android.gms.common.api.internal.w
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                ((q4) ((e4) obj).M()).V4(pendingIntent, sleepSegmentRequest, new i(this.f108163a, (com.google.android.gms.tasks.l) obj2));
            }
        }).e(com.google.android.gms.location.b1.f109632b).f(2410).a());
    }

    public k(Context context) {
        super(context, (com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.d.C0969d>) f108131o, com.google.android.gms.common.api.a.d.N1, com.google.android.gms.common.api.k.a.f106306c);
    }
}
