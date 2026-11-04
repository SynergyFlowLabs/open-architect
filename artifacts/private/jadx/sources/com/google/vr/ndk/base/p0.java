package com.google.vr.ndk.base;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import com.google.vr.vrcore.common.api.HeadTrackingState;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
class p0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f127209t = "VrCoreSdkClient";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final boolean f127210u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final int f127211v = 5;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final int f127212w = 25;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final int f127213x = 13;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final int f127214y = 22;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final int f127215z = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f127216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GvrApi f127217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ComponentName f127218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n f127219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Runnable f127220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final s f127221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f127222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f127223h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f127224i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f127225j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.google.vr.vrcore.common.api.d f127227l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.google.vr.vrcore.common.api.b f127228m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.google.vr.vrcore.logging.api.a f127229n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private AlertDialog f127230o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f127231p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private PendingIntent f127232q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Runnable f127233r;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f127226k = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ServiceConnection f127234s = new a();

    class a implements ServiceConnection {
        a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            com.google.vr.vrcore.common.api.d dVarP = com.google.vr.vrcore.common.api.d.a.p(iBinder);
            try {
                if (!dVarP.f0(25)) {
                    p0.this.u();
                    return;
                }
                p0.this.f127227l = dVarP;
                try {
                    p0 p0Var = p0.this;
                    p0Var.f127228m = p0Var.f127227l.h9();
                    if (p0.this.f127228m == null) {
                        p0.this.v();
                        return;
                    }
                    p0.this.f127228m.p5(p0.this.f127218c, p0.this.f127222g);
                    try {
                        try {
                            HeadTrackingState headTrackingStateS = p0.this.s();
                            int iB = p0.this.B(headTrackingStateS);
                            if (iB == 0 && p0.this.f127233r != null) {
                                p0.this.f127233r.run();
                            }
                            if (iB == 2) {
                                p0.this.w();
                                if (p0.this.f127225j) {
                                    p0.this.D(null);
                                    return;
                                }
                                return;
                            }
                            HeadTrackingState headTrackingState = iB == 0 ? headTrackingStateS : null;
                            if (p0.this.f127225j) {
                                p0.this.D(headTrackingState);
                            }
                        } catch (RemoteException e10) {
                            new StringBuilder(String.valueOf(e10).length() + 61);
                            if (p0.this.f127225j) {
                                p0.this.D(null);
                            }
                        }
                        try {
                            p0 p0Var2 = p0.this;
                            p0Var2.f127229n = p0Var2.f127227l.H7();
                        } catch (RemoteException e11) {
                            new StringBuilder(String.valueOf(e11).length() + 42);
                        }
                    } catch (Throwable th2) {
                        if (p0.this.f127225j) {
                            p0.this.D(null);
                        }
                        throw th2;
                    }
                } catch (RemoteException e12) {
                    new StringBuilder(String.valueOf(e12).length() + 57);
                    p0.this.v();
                }
            } catch (RemoteException e13) {
                new StringBuilder(String.valueOf(e13).length() + 41);
                p0.this.u();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            p0.this.f127227l = null;
            p0.this.f127228m = null;
            p0.this.f127229n = null;
        }
    }

    static final class b extends com.google.vr.vrcore.common.api.a.AbstractBinderC1411a {
        private static final int X = 2;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final long f127236t = 5000;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final long f127237v = 5500;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final int f127238w = 1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final WeakReference<GvrApi> f127239m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final WeakReference<s> f127240n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final WeakReference<Runnable> f127241o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final Handler f127242s = new a();

        class a extends Handler {
            a() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i10 = message.what;
                if (i10 == 1) {
                    b.this.O(null);
                } else if (i10 != 2) {
                    super.handleMessage(message);
                } else {
                    b.this.v(1, 350L, -16777216);
                }
            }
        }

        /* JADX INFO: renamed from: com.google.vr.ndk.base.p0$b$b, reason: collision with other inner class name */
        class RunnableC1234b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ s f127244a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f127245b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f127246c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f127247d;

            RunnableC1234b(b bVar, s sVar, int i10, long j10, int i11) {
                this.f127244a = sVar;
                this.f127245b = i10;
                this.f127246c = j10;
                this.f127247d = i11;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f127244a.i(this.f127245b, this.f127246c, this.f127247d);
            }
        }

        b(GvrApi gvrApi, s sVar, Runnable runnable) {
            this.f127239m = new WeakReference<>(gvrApi);
            this.f127240n = new WeakReference<>(sVar);
            this.f127241o = new WeakReference<>(runnable);
        }

        private final void L(int i10, long j10) {
            w(i10);
            this.f127242s.sendEmptyMessageDelayed(i10, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void O(HeadTrackingState headTrackingState) {
            GvrApi gvrApi = this.f127239m.get();
            if (gvrApi == null) {
                return;
            }
            w(1);
            p0.C(gvrApi, headTrackingState);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void v(int i10, long j10, int i11) {
            s sVar = this.f127240n.get();
            if (sVar != null) {
                w(2);
                sVar.post(new RunnableC1234b(this, sVar, i10, j10, i11));
                if (i10 == 2) {
                    L(2, j10 + f127237v);
                }
            }
        }

        private final void w(int i10) {
            this.f127242s.removeMessages(i10);
        }

        @Override // com.google.vr.vrcore.common.api.a
        public final void C9() throws RemoteException {
            GvrApi gvrApi = this.f127239m.get();
            if (gvrApi == null) {
                return;
            }
            gvrApi.P();
        }

        @Override // com.google.vr.vrcore.common.api.a
        public final void F3(int i10, long j10) {
            v(i10, j10, -16777216);
        }

        @Override // com.google.vr.vrcore.common.api.a
        public final int G8() throws RemoteException {
            return 25;
        }

        @Override // com.google.vr.vrcore.common.api.a
        public final HeadTrackingState Ld() throws RemoteException {
            GvrApi gvrApi = this.f127239m.get();
            if (gvrApi == null) {
                return null;
            }
            byte[] bArrN = gvrApi.N();
            L(1, 5000L);
            if (bArrN != null) {
                return new HeadTrackingState(bArrN);
            }
            return null;
        }

        final void M() {
            this.f127242s.removeCallbacksAndMessages(null);
        }

        @Override // com.google.vr.vrcore.common.api.a
        public final void M7() throws RemoteException {
            GvrApi gvrApi = this.f127239m.get();
            if (gvrApi == null) {
                return;
            }
            gvrApi.k();
        }

        @Override // com.google.vr.vrcore.common.api.a
        public final void Wa(float f10, float f11, float f12, float f13) {
            GvrApi gvrApi = this.f127239m.get();
            if (gvrApi == null) {
                return;
            }
            gvrApi.f0(f10, f11, 0.0f);
        }

        @Override // com.google.vr.vrcore.common.api.a
        public final void Xd(int i10, long j10, int i11) {
            v(i10, j10, i11);
        }

        @Override // com.google.vr.vrcore.common.api.a
        public final void e5() {
            Runnable runnable = this.f127241o.get();
            if (runnable == null) {
                return;
            }
            com.google.vr.cardboard.v.a(runnable);
        }

        @Override // com.google.vr.vrcore.common.api.a
        public final void e8(HeadTrackingState headTrackingState) {
            O(headTrackingState);
        }

        @Override // com.google.vr.vrcore.common.api.a
        public final void je(float f10, float f11, float f12) {
            GvrApi gvrApi = this.f127239m.get();
            if (gvrApi == null) {
                return;
            }
            gvrApi.f0(f10, f11, f12);
        }
    }

    public p0(Context context, GvrApi gvrApi, ComponentName componentName, n nVar, Runnable runnable, s sVar) {
        this.f127216a = context;
        this.f127217b = gvrApi;
        this.f127218c = componentName;
        this.f127219d = nVar;
        this.f127220e = runnable;
        this.f127221f = sVar;
        this.f127222g = new b(gvrApi, sVar, runnable);
        this.f127223h = x(context);
        gvrApi.e0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int B(HeadTrackingState headTrackingState) throws RemoteException {
        Activity activityB;
        if (this.f127231p < 13) {
            return this.f127228m.y5(this.f127218c, headTrackingState);
        }
        l lVarC = m.c(this.f127216a, this.f127218c);
        PendingIntent activity = this.f127232q;
        if (activity == null) {
            Intent intentQ = k.q(this.f127218c);
            intentQ.addFlags(536870912);
            Context context = this.f127216a;
            if (!(context instanceof com.google.vr.cardboard.z) && (activityB = com.google.vr.cardboard.f.b(context)) != null && activityB.getIntent() != null) {
                intentQ.putExtras(activityB.getIntent());
                intentQ.fillIn(activityB.getIntent(), 2);
            }
            activity = PendingIntent.getActivity(this.f127216a, 0, intentQ, 1073741824);
        }
        if (this.f127231p < 22) {
            return this.f127228m.ja(this.f127218c, lVarC.g(), activity, headTrackingState);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("COMPONENT_NAME_KEY", this.f127218c);
        bundle.putInt("DAYDREAM_COMPATIBILITY_KEY", lVarC.g());
        bundle.putInt("DAYDREAM_COMPATIBILITY_BITMASK_KEY", lVarC.b());
        bundle.putParcelable("OPTIONAL_REENTRY_INTENT_KEY", activity);
        bundle.putBoolean("IS_USING_VR_DISPLAY_SERVICE_KEY", this.f127217b.m0());
        return this.f127228m.Uc(bundle, headTrackingState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void C(GvrApi gvrApi, HeadTrackingState headTrackingState) {
        gvrApi.X((headTrackingState == null || headTrackingState.e()) ? null : headTrackingState.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(HeadTrackingState headTrackingState) {
        C(this.f127217b, headTrackingState);
        s sVar = this.f127221f;
        if (sVar != null) {
            sVar.c();
        }
    }

    private void H() {
        if (this.f127219d.e(this.f127216a) || !this.f127219d.g(this.f127216a) || ActivityManager.isRunningInTestHarness()) {
            return;
        }
        AlertDialog alertDialog = this.f127230o;
        if (alertDialog != null) {
            alertDialog.show();
        } else {
            this.f127230o = com.google.vr.cardboard.y.c(this.f127216a, com.google.vr.cardboard.s.f.f126893h, com.google.vr.cardboard.s.f.f126890e, this.f127220e);
        }
    }

    private boolean p() {
        if (this.f127224i) {
            return true;
        }
        if (this.f127223h) {
            Intent intent = new Intent("com.google.vr.vrcore.BIND_SDK_SERVICE");
            intent.setPackage("com.google.vr.vrcore");
            this.f127224i = this.f127216a.bindService(intent, this.f127234s, 1);
        }
        if (!this.f127224i) {
            u();
        }
        return this.f127224i;
    }

    private void q() {
        if (this.f127225j) {
            D(null);
        } else {
            this.f127217b.N();
        }
        if (this.f127224i) {
            com.google.vr.vrcore.common.api.b bVar = this.f127228m;
            if (bVar != null) {
                try {
                    bVar.mb(this.f127218c);
                } catch (RemoteException e10) {
                    new StringBuilder(String.valueOf(e10).length() + 40);
                }
                this.f127228m = null;
            }
            this.f127227l = null;
            this.f127229n = null;
            this.f127216a.unbindService(this.f127234s);
            this.f127224i = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        q();
        H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        q();
        H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        q();
        this.f127220e.run();
    }

    private boolean x(Context context) {
        try {
            int iD = com.google.vr.vrcore.base.api.d.d(context);
            this.f127231p = iD;
            if (iD >= 5) {
                return true;
            }
            String.format("VrCore service obsolete, GVR SDK requires API %d but found API %d.", 5, Integer.valueOf(this.f127231p));
            return false;
        } catch (com.google.vr.vrcore.base.api.c unused) {
            return false;
        }
    }

    public boolean A() {
        this.f127225j = true;
        if (this.f127226k) {
            return p();
        }
        return false;
    }

    public void E(boolean z10) {
        if (this.f127226k == z10) {
            return;
        }
        this.f127226k = z10;
        this.f127217b.e0(z10);
        if (this.f127225j) {
            if (this.f127226k) {
                p();
            } else {
                q();
            }
        }
    }

    public void F(Runnable runnable) {
        this.f127233r = runnable;
    }

    public void G(PendingIntent pendingIntent) {
        this.f127232q = pendingIntent;
    }

    com.google.vr.vrcore.common.api.b r() {
        return this.f127228m;
    }

    HeadTrackingState s() {
        return new HeadTrackingState();
    }

    com.google.vr.vrcore.logging.api.a t() {
        return this.f127229n;
    }

    public void y() {
        com.google.vr.vrcore.common.api.b bVar = this.f127228m;
        if (bVar != null && this.f127231p >= 16) {
            try {
                bVar.S9();
            } catch (RemoteException e10) {
                new StringBuilder(String.valueOf(e10).length() + 41);
            }
        }
    }

    public void z() {
        this.f127225j = false;
        this.f127222g.M();
        if (this.f127226k) {
            q();
        }
    }
}
