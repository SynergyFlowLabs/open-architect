package com.google.android.play.core.appupdate.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.annotation.p0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final s f114846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IntentFilter f114847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f114848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final Set f114849d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private q f114850e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f114851f = false;

    protected r(s sVar, IntentFilter intentFilter, Context context) {
        this.f114846a = sVar;
        this.f114847b = intentFilter;
        this.f114848c = f0.a(context);
    }

    private final void e() {
        q qVar;
        if (!this.f114849d.isEmpty() && this.f114850e == null) {
            q qVar2 = new q(this, null);
            this.f114850e = qVar2;
            if (Build.VERSION.SDK_INT >= 33) {
                int i10 = 5 ^ 2;
                this.f114848c.registerReceiver(qVar2, this.f114847b, 2);
            } else {
                this.f114848c.registerReceiver(qVar2, this.f114847b);
            }
        }
        if (!this.f114849d.isEmpty() || (qVar = this.f114850e) == null) {
            return;
        }
        this.f114848c.unregisterReceiver(qVar);
        this.f114850e = null;
    }

    protected abstract void a(Context context, Intent intent);

    public final synchronized void b(f7.a aVar) {
        this.f114846a.d("registerListener", new Object[0]);
        d.a(aVar, "Registered Play Core listener should not be null.");
        this.f114849d.add(aVar);
        e();
    }

    public final synchronized void c(f7.a aVar) {
        this.f114846a.d("unregisterListener", new Object[0]);
        d.a(aVar, "Unregistered Play Core listener should not be null.");
        this.f114849d.remove(aVar);
        e();
    }

    public final synchronized void d(Object obj) {
        try {
            Iterator it = new HashSet(this.f114849d).iterator();
            while (it.hasNext()) {
                ((f7.a) it.next()).a(obj);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
