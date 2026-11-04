package com.planner5d.library.services.backgroundexecutor;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.planner5d.library.services.backgroundexecutor.database.BackgroundExecutorDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes10.dex */
public class BackgroundExecutorService extends Service {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f223969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f223970f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f223971a = new d(g0.c(new Function0() { // from class: com.planner5d.library.services.backgroundexecutor.i
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f224026a.j();
        }
    }));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.planner5d.library.services.backgroundexecutor.a[] f223972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<com.planner5d.library.d> f223973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.planner5d.library.c.b f223974d;

    class a extends com.planner5d.library.c.b {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(com.planner5d.library.services.backgroundexecutor.a aVar, BackgroundExecutorMessageContainer backgroundExecutorMessageContainer, Subscriber subscriber) {
            e eVarC = aVar.c(BackgroundExecutorService.this.getApplicationContext(), backgroundExecutorMessageContainer.f223967a);
            subscriber.onCompleted();
            if (eVarC != null) {
                Iterator it = BackgroundExecutorService.this.f223973c.iterator();
                while (it.hasNext()) {
                    try {
                        ((com.planner5d.library.d) it.next()).w1(new BackgroundExecutorMessageContainer(eVarC));
                    } catch (RemoteException unused) {
                    }
                }
            }
        }

        @Override // com.planner5d.library.c
        public long D2() throws RemoteException {
            long j10;
            synchronized (BackgroundExecutorService.f223970f) {
                try {
                    j10 = BackgroundExecutorService.f223969e;
                    BackgroundExecutorService.f223969e = 1 + j10;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return j10;
        }

        @Override // com.planner5d.library.c
        public void E2(final BackgroundExecutorMessageContainer message) throws RemoteException {
            final com.planner5d.library.services.backgroundexecutor.a aVarH = BackgroundExecutorService.this.h(message);
            if (aVarH != null) {
                Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.services.backgroundexecutor.j
                    @Override // rx.functions.Action1
                    public final void call(Object obj) {
                        this.f224027a.n(aVarH, message, (Subscriber) obj);
                    }
                }).subscribeOn(com.planner5d.library.services.rx.c.f224933c).subscribe((Subscriber) new com.planner5d.library.services.rx.e());
            }
        }

        @Override // com.planner5d.library.c
        public void S3(com.planner5d.library.d callback) throws RemoteException {
            BackgroundExecutorService.this.f223973c.add(callback);
        }

        @Override // com.planner5d.library.c
        public void sa(com.planner5d.library.e callback) throws RemoteException {
            BackgroundExecutorService.this.f223971a.j(callback);
        }

        @Override // com.planner5d.library.c
        public void uf(BackgroundExecutorMessageContainer message) throws RemoteException {
            com.planner5d.library.services.backgroundexecutor.a aVarH = BackgroundExecutorService.this.h(message);
            if (aVarH != null) {
                aVarH.d(message.f223967a);
            }
        }
    }

    public BackgroundExecutorService() {
        com.planner5d.library.services.backgroundexecutor.a[] aVarArr = {new com.planner5d.library.services.bitmaploader.background.a(), new com.planner5d.library.services.filedownloader.a()};
        this.f223972b = aVarArr;
        this.f223973c = new ArrayList();
        this.f223974d = new a();
        for (com.planner5d.library.services.backgroundexecutor.a aVar : aVarArr) {
            aVar.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.planner5d.library.services.backgroundexecutor.a h(BackgroundExecutorMessageContainer message) {
        for (com.planner5d.library.services.backgroundexecutor.a aVar : this.f223972b) {
            if (aVar.a(message.f223967a)) {
                return aVar;
            }
        }
        return null;
    }

    public static String i(Context context) {
        return context.getPackageName() + "_background";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ BackgroundExecutorDatabase j() {
        return new com.planner5d.library.services.backgroundexecutor.database.a().a(getApplication());
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f223974d;
    }
}
