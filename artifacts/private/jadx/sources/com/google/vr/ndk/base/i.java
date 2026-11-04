package com.google.vr.ndk.base;

import android.content.Context;
import com.google.vr.vrcore.controller.api.ControllerButtonEvent;
import com.google.vr.vrcore.controller.api.ControllerEventPacket;
import com.google.vr.vrcore.controller.api.ControllerEventPacket2;
import com.google.vr.vrcore.controller.api.ControllerOrientationEvent;

/* JADX INFO: loaded from: classes5.dex */
class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f127091c = "i";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f127092d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.vr.vrcore.controller.api.f f127093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f127094b;

    static class a implements com.google.vr.vrcore.controller.api.f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f127095a;

        a(Runnable runnable) {
            this.f127095a = runnable;
        }

        @Override // com.google.vr.vrcore.controller.api.f.a
        public void H0(int i10, int i11) {
        }

        @Override // com.google.vr.vrcore.controller.api.f.a
        public void R0(ControllerEventPacket2 controllerEventPacket2) {
            o0(controllerEventPacket2);
        }

        @Override // com.google.vr.vrcore.controller.api.f.a
        public void S0() {
        }

        @Override // com.google.vr.vrcore.controller.api.f.a
        public void T0() {
        }

        @Override // com.google.vr.vrcore.controller.api.f.a
        public void U0(int i10) {
        }

        @Override // com.google.vr.vrcore.controller.api.f.a
        public void V0() {
        }

        @Override // com.google.vr.vrcore.controller.api.f.a
        public void W0(int i10) {
        }

        @Override // com.google.vr.vrcore.controller.api.f.a
        public void o0(ControllerEventPacket controllerEventPacket) {
            int i10;
            for (int i11 = 0; i11 < controllerEventPacket.h(); i11++) {
                ControllerButtonEvent controllerButtonEventG = controllerEventPacket.g(i11);
                if (controllerButtonEventG.f129971d && ((i10 = controllerButtonEventG.f129970c) == 1 || i10 == 3 || i10 == 7)) {
                    com.google.vr.cardboard.v.a(this.f127095a);
                }
            }
        }

        @Override // com.google.vr.vrcore.controller.api.f.a
        public void w0(ControllerOrientationEvent controllerOrientationEvent) {
        }
    }

    public i(Context context, Runnable runnable) {
        this.f127093a = a(context, new a(runnable));
    }

    protected com.google.vr.vrcore.controller.api.f a(Context context, com.google.vr.vrcore.controller.api.f.a aVar) {
        return new com.google.vr.vrcore.controller.api.f(context, aVar, 0);
    }

    public void b() {
        if (this.f127094b) {
            this.f127094b = false;
            this.f127093a.v();
        }
    }

    public void c() {
        if (this.f127094b) {
            return;
        }
        this.f127094b = true;
        this.f127093a.u();
    }
}
