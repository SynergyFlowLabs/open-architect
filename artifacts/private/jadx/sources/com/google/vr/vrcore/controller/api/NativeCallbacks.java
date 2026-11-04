package com.google.vr.vrcore.controller.api;

/* JADX INFO: loaded from: classes5.dex */
@s9.a
public final class NativeCallbacks implements f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f130013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f130014b;

    @s9.a
    public NativeCallbacks(long j10) {
        this.f130013a = j10;
    }

    private final void b(ControllerEventPacket controllerEventPacket) {
        NativeCallbacks nativeCallbacks = this;
        int i10 = 0;
        for (int i11 = 0; !nativeCallbacks.f130014b && i11 < controllerEventPacket.f(); i11++) {
            ControllerAccelEvent controllerAccelEventE = controllerEventPacket.e(i11);
            nativeCallbacks.handleAccelEvent(nativeCallbacks.f130013a, controllerAccelEventE.f129973b, controllerAccelEventE.f129972a, controllerAccelEventE.f129964c, controllerAccelEventE.f129965d, controllerAccelEventE.f129966e);
        }
        for (int i12 = 0; !nativeCallbacks.f130014b && i12 < controllerEventPacket.h(); i12++) {
            ControllerButtonEvent controllerButtonEventG = controllerEventPacket.g(i12);
            nativeCallbacks.handleButtonEvent(nativeCallbacks.f130013a, controllerButtonEventG.f129973b, controllerButtonEventG.f129972a, controllerButtonEventG.f129970c, controllerButtonEventG.f129971d);
        }
        for (int i13 = 0; !nativeCallbacks.f130014b && i13 < controllerEventPacket.j(); i13++) {
            ControllerGyroEvent controllerGyroEventI = controllerEventPacket.i(i13);
            nativeCallbacks.handleGyroEvent(nativeCallbacks.f130013a, controllerGyroEventI.f129973b, controllerGyroEventI.f129972a, controllerGyroEventI.f129993c, controllerGyroEventI.f129994d, controllerGyroEventI.f129995e);
        }
        for (int i14 = 0; !nativeCallbacks.f130014b && i14 < controllerEventPacket.l(); i14++) {
            ControllerOrientationEvent controllerOrientationEventK = controllerEventPacket.k(i14);
            nativeCallbacks.handleOrientationEvent(nativeCallbacks.f130013a, controllerOrientationEventK.f129973b, controllerOrientationEventK.f129972a, controllerOrientationEventK.f130001c, controllerOrientationEventK.f130002d, controllerOrientationEventK.f130003e, controllerOrientationEventK.f130004f);
        }
        while (!nativeCallbacks.f130014b && i10 < controllerEventPacket.n()) {
            ControllerTouchEvent controllerTouchEventM = controllerEventPacket.m(i10);
            nativeCallbacks.handleTouchEvent(nativeCallbacks.f130013a, controllerTouchEventM.f129973b, controllerTouchEventM.f129972a, controllerTouchEventM.f130009d, controllerTouchEventM.f130010e, controllerTouchEventM.f130011f);
            i10++;
            nativeCallbacks = this;
        }
    }

    private final native void handleAccelEvent(long j10, int i10, long j11, float f10, float f11, float f12);

    private final native void handleBatteryEvent(long j10, int i10, long j11, boolean z10, int i11);

    private final native void handleButtonEvent(long j10, int i10, long j11, int i11, boolean z10);

    private final native void handleControllerRecentered(long j10, int i10, long j11, float f10, float f11, float f12, float f13);

    private final native void handleGyroEvent(long j10, int i10, long j11, float f10, float f11, float f12);

    private final native void handleOrientationEvent(long j10, int i10, long j11, float f10, float f11, float f12, float f13);

    private final native void handlePositionEvent(long j10, int i10, long j11, float f10, float f11, float f12);

    private final native void handleServiceConnected(long j10, int i10);

    private final native void handleServiceDisconnected(long j10);

    private final native void handleServiceFailed(long j10);

    private final native void handleServiceInitFailed(long j10, int i10);

    private final native void handleServiceUnavailable(long j10);

    private final native void handleStateChanged(long j10, int i10, int i11);

    private final native void handleTouchEvent(long j10, int i10, long j11, int i11, float f10, float f11);

    private final native void handleTrackingStatusEvent(long j10, int i10, long j11, int i11);

    @Override // com.google.vr.vrcore.controller.api.f.a
    public final synchronized void H0(int i10, int i11) {
        if (!this.f130014b) {
            handleStateChanged(this.f130013a, i10, i11);
        }
    }

    @Override // com.google.vr.vrcore.controller.api.f.a
    public final synchronized void R0(ControllerEventPacket2 controllerEventPacket2) {
        try {
            if (this.f130014b) {
                return;
            }
            b(controllerEventPacket2);
            for (int i10 = 0; !this.f130014b && i10 < controllerEventPacket2.v(); i10++) {
                ControllerPositionEvent controllerPositionEventU = controllerEventPacket2.u(i10);
                handlePositionEvent(this.f130013a, controllerPositionEventU.f129973b, controllerPositionEventU.f129972a, controllerPositionEventU.f130005c, controllerPositionEventU.f130006d, controllerPositionEventU.f130007e);
            }
            for (int i11 = 0; !this.f130014b && i11 < controllerEventPacket2.z(); i11++) {
                ControllerTrackingStatusEvent controllerTrackingStatusEventY = controllerEventPacket2.y(i11);
                handleTrackingStatusEvent(this.f130013a, controllerTrackingStatusEventY.f129973b, controllerTrackingStatusEventY.f129972a, controllerTrackingStatusEventY.f130012c);
            }
            if (!this.f130014b && controllerEventPacket2.A()) {
                ControllerBatteryEvent controllerBatteryEventT = controllerEventPacket2.t();
                handleBatteryEvent(this.f130013a, controllerBatteryEventT.f129973b, controllerBatteryEventT.f129972a, controllerBatteryEventT.f129968d, controllerBatteryEventT.f129967c);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.vr.vrcore.controller.api.f.a
    public final synchronized void S0() {
        try {
            if (!this.f130014b) {
                handleServiceUnavailable(this.f130013a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.vr.vrcore.controller.api.f.a
    public final synchronized void T0() {
        if (!this.f130014b) {
            handleServiceFailed(this.f130013a);
        }
    }

    @Override // com.google.vr.vrcore.controller.api.f.a
    public final synchronized void U0(int i10) {
        try {
            if (!this.f130014b) {
                handleServiceInitFailed(this.f130013a, i10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.vr.vrcore.controller.api.f.a
    public final synchronized void V0() {
        try {
            if (!this.f130014b) {
                handleServiceDisconnected(this.f130013a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.vr.vrcore.controller.api.f.a
    public final synchronized void W0(int i10) {
        try {
            if (!this.f130014b) {
                handleServiceConnected(this.f130013a, i10);
            }
        } finally {
        }
    }

    @s9.a
    public final synchronized void a() {
        this.f130014b = true;
    }

    @Override // com.google.vr.vrcore.controller.api.f.a
    public final synchronized void o0(ControllerEventPacket controllerEventPacket) {
        try {
            if (this.f130014b) {
                return;
            }
            b(controllerEventPacket);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.vr.vrcore.controller.api.f.a
    public final synchronized void w0(ControllerOrientationEvent controllerOrientationEvent) throws Throwable {
        NativeCallbacks nativeCallbacks;
        try {
            try {
                if (this.f130014b) {
                    nativeCallbacks = this;
                } else {
                    nativeCallbacks = this;
                    nativeCallbacks.handleControllerRecentered(this.f130013a, controllerOrientationEvent.f129973b, controllerOrientationEvent.f129972a, controllerOrientationEvent.f130001c, controllerOrientationEvent.f130002d, controllerOrientationEvent.f130003e, controllerOrientationEvent.f130004f);
                }
                return;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
        throw th;
    }
}
