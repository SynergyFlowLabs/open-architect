package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.annotation.b1;
import androidx.annotation.l0;
import androidx.lifecycle.u0;
import androidx.work.impl.utils.c0;
import androidx.work.v;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
public class SystemAlarmService extends u0 implements g.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f76656d = v.i("SystemAlarmService");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f76657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f76658c;

    @l0
    private void e() {
        g gVar = new g(this);
        this.f76657b = gVar;
        gVar.m(this);
    }

    @Override // androidx.work.impl.background.systemalarm.g.c
    @l0
    public void b() {
        this.f76658c = true;
        v.e().a(f76656d, "All commands completed in dispatcher");
        c0.a();
        stopSelf();
    }

    @Override // androidx.lifecycle.u0, android.app.Service
    public void onCreate() {
        super.onCreate();
        e();
        this.f76658c = false;
    }

    @Override // androidx.lifecycle.u0, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f76658c = true;
        this.f76657b.k();
    }

    @Override // androidx.lifecycle.u0, android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        if (this.f76658c) {
            v.e().f(f76656d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.f76657b.k();
            e();
            this.f76658c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f76657b.a(intent, startId);
        return 3;
    }
}
