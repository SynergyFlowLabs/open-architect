package com.google.vr.ndk.base;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes5.dex */
@s9.b
public class u extends FrameLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f127273e = "GvrLayout";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.vr.vrcore.library.api.a f127274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a0 f127275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private GvrApi f127276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private r f127277d;

    public interface a {
        void a();

        void b(Surface surface);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f127278a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f127279b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f127280c = 3;

        private b() {
        }
    }

    public u(Context context) {
        super(context);
        if (com.google.vr.cardboard.f.b(context) == null) {
            throw new IllegalArgumentException("An Activity Context is required for VR functionality.");
        }
        d();
    }

    private void d() {
        l0.a("GvrLayout.init");
        try {
            try {
                if (this.f127274a == null) {
                    this.f127274a = v.a(getContext());
                }
                this.f127275b = new a0(this.f127274a.pf());
                if (this.f127276c == null) {
                    this.f127276c = new GvrApi(getContext(), this.f127274a.W2());
                }
                addView((View) com.google.vr.vrcore.library.api.f.s(this.f127274a.getRootView(), View.class));
                l0.b();
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        } catch (Throwable th2) {
            l0.b();
            throw th2;
        }
    }

    @s9.b
    public boolean a() {
        try {
            return this.f127274a.i2(1);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean b(a aVar, Handler handler, boolean z10) {
        try {
            if (this.f127274a.i2(z10 ? 1 : 0) && this.f127276c.G(2)) {
                this.f127277d = this.f127276c.h(aVar, handler);
                return true;
            }
            return false;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean c(Runnable runnable) {
        try {
            return this.f127274a.ga(com.google.vr.vrcore.library.api.f.u(runnable));
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void e() {
        try {
            this.f127274a.onBackPressed();
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @s9.b
    public void f() {
        l0.a("GvrLayout.onPause");
        try {
            try {
                this.f127274a.d();
                l0.b();
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        } catch (Throwable th2) {
            l0.b();
            throw th2;
        }
    }

    @s9.b
    public void g() {
        l0.a("GvrLayout.onResume");
        try {
            try {
                this.f127274a.l();
                l0.b();
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        } catch (Throwable th2) {
            l0.b();
            throw th2;
        }
    }

    public Surface getAsyncReprojectionVideoSurface() {
        r rVar = this.f127277d;
        if (rVar == null) {
            return null;
        }
        return rVar.d();
    }

    public int getAsyncReprojectionVideoSurfaceId() {
        r rVar = this.f127277d;
        if (rVar == null) {
            return -1;
        }
        return rVar.b();
    }

    @s9.b
    public GvrApi getGvrApi() {
        return this.f127276c;
    }

    @s9.b
    public a0 getUiLayout() {
        return this.f127275b;
    }

    @s9.b
    public boolean h(boolean z10) {
        if (z10) {
            try {
                return this.f127274a.i2(0);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }
        if (this.f127276c.l()) {
            throw new UnsupportedOperationException("Async reprojection cannot be disabled once enabled.");
        }
        return true;
    }

    public void i(int i10, int i11) {
        getGvrApi().h0(i10, i11);
    }

    public int j(Runnable runnable) {
        try {
            return this.f127274a.H3(com.google.vr.vrcore.library.api.f.u(runnable)) ? 3 : 2;
        } catch (Exception unused) {
            return 1;
        }
    }

    @s9.b
    public void k() {
        l0.a("GvrLayout.shutdown");
        try {
            try {
                r rVar = this.f127277d;
                if (rVar != null) {
                    rVar.e();
                    this.f127277d = null;
                }
                this.f127274a.shutdown();
                this.f127276c.j0();
                l0.b();
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        } catch (Throwable th2) {
            l0.b();
            throw th2;
        }
    }

    @s9.b
    public void setPresentationView(View view) {
        try {
            this.f127274a.cf(com.google.vr.vrcore.library.api.f.u(view));
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void setReentryIntent(PendingIntent pendingIntent) {
        try {
            this.f127274a.O4(com.google.vr.vrcore.library.api.f.u(pendingIntent));
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void setStereoModeEnabled(boolean z10) {
        try {
            this.f127274a.N(z10);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public u(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        if (com.google.vr.cardboard.f.b(context) == null) {
            throw new IllegalArgumentException("An Activity Context is required for VR functionality.");
        }
        d();
    }

    public u(com.google.vr.cardboard.z zVar) {
        super(zVar);
        d();
    }

    u(Context context, x xVar, GvrApi gvrApi) {
        super(context);
        this.f127274a = new y(xVar);
        this.f127276c = gvrApi;
        d();
    }
}
