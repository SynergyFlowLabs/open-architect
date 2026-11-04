package com.google.vr.sdk.controller;

import android.content.Context;
import android.os.RemoteException;
import com.google.vr.vrcore.controller.api.ControllerEventPacket;
import com.google.vr.vrcore.controller.api.ControllerEventPacket2;
import com.google.vr.vrcore.controller.api.ControllerOrientationEvent;
import com.google.vr.vrcore.controller.api.f;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f127668d = "ControllerManager";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f127669e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f127670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f127671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f127672c = 3;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f127673a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f127674b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f127675c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f127676d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f127677e = 4;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f127678f = 5;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f127679g = 6;

        private a() {
        }

        public static final String a(int i10) {
            switch (i10) {
                case 0:
                    return "OK";
                case 1:
                    return "ERROR_UNSUPPORTED";
                case 2:
                    return "ERROR_NOT_AUTHORIZED";
                case 3:
                    return "ERROR_UNAVAILABLE";
                case 4:
                    return "ERROR_SERVICE_OBSOLETE";
                case 5:
                    return "ERROR_CLIENT_OBSOLETE";
                case 6:
                    return "ERROR_MALFUNCTION";
                default:
                    StringBuilder sb2 = new StringBuilder(58);
                    sb2.append("[UNKNOWN CONTROLLER MANAGER CONNECTION STATE: ");
                    sb2.append(i10);
                    sb2.append("]");
                    return sb2.toString();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.vr.sdk.controller.b$b, reason: collision with other inner class name */
    class C1237b implements f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.vr.sdk.controller.a f127680a;

        public C1237b(com.google.vr.sdk.controller.a aVar) {
            this.f127680a = aVar;
        }

        private void a(ControllerEventPacket controllerEventPacket) {
            for (int i10 = 0; i10 < controllerEventPacket.h(); i10++) {
                this.f127680a.d(controllerEventPacket.g(i10));
            }
            for (int i11 = 0; i11 < controllerEventPacket.l(); i11++) {
                this.f127680a.e(controllerEventPacket.k(i11));
            }
            for (int i12 = 0; i12 < controllerEventPacket.n(); i12++) {
                this.f127680a.g(controllerEventPacket.m(i12));
            }
        }

        @Override // com.google.vr.vrcore.controller.api.f.a
        public void H0(int i10, int i11) {
            this.f127680a.j(i11);
        }

        @Override // com.google.vr.vrcore.controller.api.f.a
        public void R0(ControllerEventPacket2 controllerEventPacket2) {
            a(controllerEventPacket2);
            int i10 = 6 | 0;
            for (int i11 = 0; i11 < controllerEventPacket2.v(); i11++) {
                this.f127680a.f(controllerEventPacket2.u(i11));
            }
            for (int i12 = 0; i12 < controllerEventPacket2.z(); i12++) {
                this.f127680a.h(controllerEventPacket2.y(i12));
            }
            if (controllerEventPacket2.A()) {
                this.f127680a.c(controllerEventPacket2.t());
            }
            this.f127680a.i();
        }

        @Override // com.google.vr.vrcore.controller.api.f.a
        public void S0() {
            if (b.this.f127672c != 6) {
                b.this.f127672c = 6;
                b.this.f127671b.b(b.this.f127672c);
                b.this.j();
            }
        }

        @Override // com.google.vr.vrcore.controller.api.f.a
        public void T0() {
            if (b.this.f127672c != 6) {
                b.this.f127672c = 6;
                b.this.f127671b.b(b.this.f127672c);
                b.this.j();
            }
        }

        @Override // com.google.vr.vrcore.controller.api.f.a
        public void U0(int i10) {
            int i11 = 1;
            if (i10 != 1) {
                i11 = 2;
                if (i10 != 2) {
                    i11 = 5;
                }
            }
            if (i11 != b.this.f127672c) {
                b.this.f127672c = i11;
                b.this.f127671b.b(i11);
                b.this.j();
            }
        }

        @Override // com.google.vr.vrcore.controller.api.f.a
        public void V0() {
            if (b.this.f127672c != 3) {
                b.this.f127672c = 3;
                b.this.f127671b.b(b.this.f127672c);
                b.this.j();
            }
        }

        @Override // com.google.vr.vrcore.controller.api.f.a
        public void W0(int i10) {
            if (b.this.f127672c != 0) {
                b.this.f127672c = 0;
                b.this.f127671b.b(b.this.f127672c);
            }
        }

        @Override // com.google.vr.vrcore.controller.api.f.a
        public void o0(ControllerEventPacket controllerEventPacket) {
            a(controllerEventPacket);
            this.f127680a.i();
        }

        @Override // com.google.vr.vrcore.controller.api.f.a
        public void w0(ControllerOrientationEvent controllerOrientationEvent) {
            this.f127680a.e(controllerOrientationEvent);
            this.f127680a.i();
            b.this.f127671b.a();
        }
    }

    public interface c {
        void a();

        void b(int i10);
    }

    public b(Context context, c cVar) {
        this.f127671b = cVar;
        this.f127670a = new f(context, new C1237b(new com.google.vr.sdk.controller.a(0)));
    }

    private C1237b d(int i10) throws RemoteException {
        if (this.f127672c != 0) {
            return null;
        }
        C1237b c1237b = new C1237b(new com.google.vr.sdk.controller.a(i10));
        if (this.f127670a.e(i10, c1237b)) {
            return c1237b;
        }
        return null;
    }

    private C1237b g(int i10) {
        return (C1237b) this.f127670a.l(i10);
    }

    public com.google.vr.sdk.controller.a e() {
        return f(0);
    }

    public com.google.vr.sdk.controller.a f(int i10) {
        C1237b c1237bG = g(i10);
        if (c1237bG == null) {
            try {
                c1237bG = d(i10);
            } catch (RemoteException unused) {
                return null;
            }
        }
        if (c1237bG == null) {
            return null;
        }
        return c1237bG.f127680a;
    }

    public void h() {
        this.f127670a.x();
        this.f127670a.d();
    }

    public void i() {
        this.f127670a.i();
    }

    public void j() {
        this.f127670a.j();
    }
}
