package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes4.dex */
final class h2 implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ j2 f106574a;

    /* synthetic */ h2(j2 j2Var, i2 i2Var) {
        this.f106574a = j2Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            synchronized (this.f106574a.f106582g) {
                try {
                    f2 f2Var = (f2) message.obj;
                    g2 g2Var = (g2) this.f106574a.f106582g.get(f2Var);
                    if (g2Var != null && g2Var.i()) {
                        if (g2Var.j()) {
                            g2Var.g("GmsClientSupervisor");
                        }
                        this.f106574a.f106582g.remove(f2Var);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        synchronized (this.f106574a.f106582g) {
            try {
                f2 f2Var2 = (f2) message.obj;
                g2 g2Var2 = (g2) this.f106574a.f106582g.get(f2Var2);
                if (g2Var2 != null && g2Var2.a() == 3) {
                    String.valueOf(f2Var2);
                    new Exception();
                    ComponentName componentNameB = g2Var2.b();
                    if (componentNameB == null) {
                        componentNameB = f2Var2.a();
                    }
                    if (componentNameB == null) {
                        String strC = f2Var2.c();
                        w.r(strC);
                        componentNameB = new ComponentName(strC, "unknown");
                    }
                    g2Var2.onServiceDisconnected(componentNameB);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return true;
    }
}
