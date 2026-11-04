package com.google.vr.vrcore.controller.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
@s9.a
public class f implements ServiceConnection {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final AtomicInteger f130021j = new AtomicInteger(-1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f130022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f130023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f130024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String f130025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f130026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SparseArray<d> f130027f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private h f130028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private d f130029h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f130030i;

    @s9.a
    public interface a {
        void H0(int i10, int i11);

        void R0(ControllerEventPacket2 controllerEventPacket2);

        void S0();

        void T0();

        void U0(int i10);

        void V0();

        void W0(int i10);

        void o0(ControllerEventPacket controllerEventPacket);

        void w0(ControllerOrientationEvent controllerOrientationEvent);
    }

    static class b extends g.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<d> f130031b;

        public b(d dVar) {
            this.f130031b = new WeakReference<>(dVar);
        }

        @Override // com.google.vr.vrcore.controller.api.g
        public void H0(int i10, int i11) throws RemoteException {
            d dVar = this.f130031b.get();
            if (dVar == null) {
                return;
            }
            dVar.f130033a.H0(i10, i11);
        }

        @Override // com.google.vr.vrcore.controller.api.g
        public void R0(ControllerEventPacket2 controllerEventPacket2) throws RemoteException {
            d dVar = this.f130031b.get();
            if (dVar == null) {
                return;
            }
            f.s(controllerEventPacket2);
            controllerEventPacket2.s(dVar.f130035c);
            dVar.f130033a.R0(controllerEventPacket2);
            controllerEventPacket2.q();
        }

        @Override // com.google.vr.vrcore.controller.api.g
        public ControllerListenerOptions b() throws RemoteException {
            d dVar = this.f130031b.get();
            if (dVar == null) {
                return null;
            }
            return dVar.f130034b;
        }

        @Override // com.google.vr.vrcore.controller.api.g
        public void o0(ControllerEventPacket controllerEventPacket) throws RemoteException {
            d dVar = this.f130031b.get();
            if (dVar == null) {
                return;
            }
            controllerEventPacket.s(dVar.f130035c);
            dVar.f130033a.o0(controllerEventPacket);
            controllerEventPacket.q();
        }

        @Override // com.google.vr.vrcore.controller.api.g
        public void w0(ControllerOrientationEvent controllerOrientationEvent) {
            d dVar = this.f130031b.get();
            if (dVar == null) {
                return;
            }
            controllerOrientationEvent.f129973b = dVar.f130035c;
            dVar.f130033a.w0(controllerOrientationEvent);
        }

        @Override // com.google.vr.vrcore.controller.api.g
        public int y() throws RemoteException {
            return 25;
        }
    }

    static class c extends i.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<f> f130032b;

        public c(f fVar) {
            this.f130032b = new WeakReference<>(fVar);
        }

        @Override // com.google.vr.vrcore.controller.api.i
        public void W4(int i10) throws RemoteException {
            f fVar = this.f130032b.get();
            if (fVar == null) {
                return;
            }
            fVar.p(i10);
        }

        @Override // com.google.vr.vrcore.controller.api.i
        public int y() throws RemoteException {
            return 25;
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f130033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ControllerListenerOptions f130034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f130035c;

        public d(a aVar, ControllerListenerOptions controllerListenerOptions, int i10) {
            this.f130033a = aVar;
            this.f130034b = controllerListenerOptions;
            this.f130035c = i10;
        }
    }

    @s9.a
    public f(Context context, a aVar, int i10) {
        this(context, aVar, new ControllerListenerOptions(i10));
    }

    private boolean g(int i10, a aVar, ControllerListenerOptions controllerListenerOptions) throws RemoteException {
        k();
        if (this.f130028g == null) {
            return false;
        }
        d dVar = new d(aVar, controllerListenerOptions, i10);
        if (!t(dVar.f130035c, dVar)) {
            this.f130027f.remove(i10);
            return false;
        }
        if (dVar.f130035c == 0) {
            this.f130029h = dVar;
        }
        this.f130027f.put(i10, dVar);
        return true;
    }

    private static String h() {
        int iIncrementAndGet = f130021j.incrementAndGet();
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append("VrCtl.ServiceBridge");
        sb2.append(iIncrementAndGet);
        return sb2.toString();
    }

    private void k() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("This should be running on the main thread.");
        }
    }

    private static int n(Context context) {
        try {
            return com.google.vr.vrcore.base.api.d.d(context);
        } catch (com.google.vr.vrcore.base.api.c unused) {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void c() {
        k();
        if (m() > 0) {
            if (this.f130030i) {
                w();
                return;
            }
            return;
        }
        int size = this.f130027f.size();
        for (int i10 = 0; i10 < size; i10++) {
            d dVarValueAt = this.f130027f.valueAt(i10);
            if (dVarValueAt != null) {
                dVarValueAt.f130033a.H0(i10, 0);
            }
        }
        d();
        this.f130029h.f130033a.V0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(int i10) {
        if (i10 == 1) {
            this.f130023b.post(new Runnable(this) { // from class: com.google.vr.vrcore.controller.api.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final f f130020a;

                {
                    this.f130020a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f130020a.c();
                }
            });
        }
    }

    private void q(a aVar, ControllerListenerOptions controllerListenerOptions) {
        d dVar = new d(aVar, controllerListenerOptions, 0);
        this.f130029h = dVar;
        this.f130027f.put(dVar.f130035c, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void s(ControllerEventPacket2 controllerEventPacket2) {
        if (controllerEventPacket2.x() == 0) {
            return;
        }
        ControllerEventPacket2.w();
        controllerEventPacket2.x();
    }

    private boolean t(int i10, d dVar) {
        try {
            if (this.f130028g.c9(i10, this.f130025d, new b(dVar))) {
                return true;
            }
        } catch (RemoteException unused) {
        }
        return false;
    }

    private void w() {
        this.f130029h.f130033a.W0(1);
        d dVar = this.f130029h;
        if (!t(dVar.f130035c, dVar)) {
            this.f130029h.f130033a.T0();
            j();
        } else {
            SparseArray<d> sparseArray = this.f130027f;
            d dVar2 = this.f130029h;
            sparseArray.put(dVar2.f130035c, dVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void r(int i10, ControllerRequest controllerRequest) {
        k();
        h hVar = this.f130028g;
        if (hVar == null) {
            return;
        }
        try {
            hVar.F8(i10, controllerRequest);
        } catch (RemoteException unused) {
        }
    }

    public void d() {
        k();
        this.f130027f.clear();
    }

    public boolean e(int i10, a aVar) throws RemoteException {
        return g(i10, aVar, new ControllerListenerOptions());
    }

    @s9.a
    public boolean f(int i10, a aVar, int i11) throws RemoteException {
        return g(i10, aVar, new ControllerListenerOptions(i11));
    }

    public void i() {
        k();
        if (this.f130030i) {
            return;
        }
        Intent intent = new Intent("com.google.vr.vrcore.controller.BIND");
        intent.setPackage("com.google.vr.vrcore");
        if (!this.f130022a.bindService(intent, this, 1)) {
            this.f130029h.f130033a.S0();
        }
        this.f130030i = true;
    }

    public void j() {
        k();
        if (this.f130030i) {
            x();
            if (this.f130024c >= 21) {
                try {
                    h hVar = this.f130028g;
                    if (hVar != null) {
                        hVar.v3(this.f130026e);
                    }
                } catch (RemoteException e10) {
                    new StringBuilder(String.valueOf(e10).length() + 55);
                }
            }
            this.f130022a.unbindService(this);
            this.f130028g = null;
            this.f130030i = false;
        }
    }

    public a l(int i10) {
        k();
        d dVar = this.f130027f.get(i10);
        if (dVar == null) {
            return null;
        }
        return dVar.f130033a;
    }

    public int m() {
        h hVar = this.f130028g;
        if (hVar == null) {
            return 0;
        }
        try {
            return hVar.db();
        } catch (RemoteException e10) {
            new StringBuilder(String.valueOf(e10).length() + 54);
            return 0;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        k();
        if (this.f130030i) {
            h hVarP = h.a.p(iBinder);
            this.f130028g = hVarP;
            try {
                int iF0 = hVarP.f0(25);
                if (iF0 != 0) {
                    String strValueOf = String.valueOf(com.google.vr.vrcore.controller.api.a.a(iF0));
                    if (strValueOf.length() != 0) {
                        "initialize() returned error: ".concat(strValueOf);
                    }
                    this.f130029h.f130033a.U0(iF0);
                    j();
                    return;
                }
                if (this.f130024c >= 21) {
                    try {
                        if (!this.f130028g.Wc(this.f130026e)) {
                            this.f130029h.f130033a.U0(iF0);
                            j();
                            return;
                        }
                    } catch (RemoteException e10) {
                        new StringBuilder(String.valueOf(e10).length() + 53);
                    }
                }
                w();
            } catch (RemoteException unused) {
                this.f130029h.f130033a.T0();
                j();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        k();
        this.f130028g = null;
        this.f130029h.f130033a.V0();
    }

    @s9.a
    public void u() {
        this.f130023b.post(new Runnable(this) { // from class: com.google.vr.vrcore.controller.api.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final f f130015a;

            {
                this.f130015a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f130015a.i();
            }
        });
    }

    @s9.a
    public void v() {
        this.f130023b.post(new Runnable(this) { // from class: com.google.vr.vrcore.controller.api.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final f f130016a;

            {
                this.f130016a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f130016a.j();
            }
        });
    }

    public void x() {
        k();
        h hVar = this.f130028g;
        if (hVar == null) {
            return;
        }
        try {
            hVar.W5(this.f130025d);
        } catch (RemoteException unused) {
        }
    }

    @s9.a
    public void y(final int i10, int i11, int i12, int i13) {
        com.google.vr.vrcore.controller.api.nano.a.C1417a c1417a = new com.google.vr.vrcore.controller.api.nano.a.C1417a();
        c1417a.f130036c = new com.google.vr.vrcore.controller.api.nano.a.C1417a.C1418a().t(i11).u(i12).s(i13);
        final ControllerRequest controllerRequest = new ControllerRequest();
        controllerRequest.h(c1417a);
        this.f130023b.post(new Runnable(this, i10, controllerRequest) { // from class: com.google.vr.vrcore.controller.api.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final f f130017a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f130018b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final ControllerRequest f130019c;

            {
                this.f130017a = this;
                this.f130018b = i10;
                this.f130019c = controllerRequest;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f130017a.r(this.f130018b, this.f130019c);
            }
        });
    }

    public f(Context context, a aVar) {
        this(context, aVar, (ControllerListenerOptions) null);
    }

    private f(Context context, a aVar, ControllerListenerOptions controllerListenerOptions) {
        this.f130027f = new SparseArray<>();
        this.f130022a = context.getApplicationContext();
        q(aVar, controllerListenerOptions);
        this.f130023b = new Handler(Looper.getMainLooper());
        this.f130026e = new c(this);
        this.f130024c = n(context);
        this.f130025d = h();
    }
}
