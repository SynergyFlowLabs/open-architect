package com.google.vr.ndk.base;

import android.app.Activity;
import android.os.RemoteException;
import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
@s9.b
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.vr.vrcore.library.api.b f127018a;

    a0(com.google.vr.vrcore.library.api.b bVar) {
        this.f127018a = bVar;
    }

    public static void b(Activity activity) {
        com.google.vr.cardboard.y.b(activity);
    }

    public boolean a() {
        try {
            return this.f127018a.isEnabled();
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @s9.b
    public void c(Runnable runnable) {
        try {
            this.f127018a.O2(com.google.vr.vrcore.library.api.f.u(runnable));
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void d(boolean z10) {
        try {
            this.f127018a.setEnabled(z10);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void e(View.OnTouchListener onTouchListener) {
        try {
            ((View) com.google.vr.vrcore.library.api.f.s(this.f127018a.getRootView(), View.class)).setOnTouchListener(onTouchListener);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void f(boolean z10) {
        try {
            this.f127018a.N4(z10);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void g(Runnable runnable) {
        try {
            this.f127018a.Q5(com.google.vr.vrcore.library.api.f.u(runnable));
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @s9.b
    public void h(boolean z10) {
        try {
            this.f127018a.d1(z10);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void i(Runnable runnable) {
        try {
            this.f127018a.Nc(com.google.vr.vrcore.library.api.f.u(runnable));
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void j(String str) {
        try {
            this.f127018a.p9(str);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }
}
