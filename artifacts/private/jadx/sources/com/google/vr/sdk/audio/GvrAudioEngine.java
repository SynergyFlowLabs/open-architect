package com.google.vr.sdk.audio;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public class GvrAudioEngine {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f127415b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static UnsatisfiedLinkError f127416c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f127417a;

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f127418a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f127419b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f127420c = 2;
    }

    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f127421a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f127422b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f127423c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f127424d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f127425e = 4;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f127426f = 5;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f127427g = 6;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f127428h = 7;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f127429i = 8;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f127430j = 9;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f127431k = 10;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f127432l = 11;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f127433m = 12;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f127434n = 13;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f127435o = 14;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f127436p = 15;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f127437q = 16;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f127438r = 17;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f127439s = 18;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f127440t = 19;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final int f127441u = 20;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f127442v = 21;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f127443w = 22;
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f127444a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f127445b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f127446c = 2;
    }

    static {
        try {
            System.loadLibrary("gvr_audio");
        } catch (UnsatisfiedLinkError e10) {
            f127416c = e10;
        }
    }

    public GvrAudioEngine(Context context, int i10) {
        UnsatisfiedLinkError unsatisfiedLinkError = f127416c;
        if (unsatisfiedLinkError != null) {
            throw unsatisfiedLinkError;
        }
        this.f127417a = nativeInitialize(getClass().getClassLoader(), context.getApplicationContext(), i10);
    }

    private native int nativeCreateSoundObject(long j10, String str);

    private native int nativeCreateSoundfield(long j10, String str);

    private native int nativeCreateStereoSound(long j10, String str);

    private native void nativeEnableRoom(long j10, boolean z10);

    private native void nativeEnableStereoSpeakerMode(long j10, boolean z10);

    private native long nativeInitialize(ClassLoader classLoader, Context context, int i10);

    private native boolean nativeIsSoundPlaying(long j10, int i10);

    private native boolean nativeIsSourceIdValid(long j10, int i10);

    private native void nativePause(long j10);

    private native void nativePauseSound(long j10, int i10);

    private native void nativePlaySound(long j10, int i10, boolean z10);

    private native boolean nativePreloadSoundFile(long j10, String str);

    private native void nativeRelease(long j10);

    private native void nativeResume(long j10);

    private native void nativeResumeSound(long j10, int i10);

    private native void nativeSetHeadPosition(long j10, float f10, float f11, float f12);

    private native void nativeSetHeadRotation(long j10, float f10, float f11, float f12, float f13);

    private native void nativeSetRoomProperties(long j10, float f10, float f11, float f12, int i10, int i11, int i12);

    private native void nativeSetRoomReverbAdjustments(long j10, float f10, float f11, float f12);

    private native void nativeSetSoundObjectDistanceRolloffModel(long j10, int i10, int i11, float f10, float f11);

    private native void nativeSetSoundObjectPosition(long j10, int i10, float f10, float f11, float f12);

    private native void nativeSetSoundVolume(long j10, int i10, float f10);

    private native void nativeSetSoundfieldRotation(long j10, int i10, float f10, float f11, float f12, float f13);

    private native void nativeStopSound(long j10, int i10);

    private native void nativeUnloadSoundFile(long j10, String str);

    private native void nativeUpdate(long j10);

    public int a(String str) {
        return nativeCreateSoundObject(this.f127417a, str);
    }

    public int b(String str) {
        return nativeCreateSoundfield(this.f127417a, str);
    }

    public int c(String str) {
        return nativeCreateStereoSound(this.f127417a, str);
    }

    public void d(boolean z10) {
        nativeEnableRoom(this.f127417a, z10);
    }

    public void e(boolean z10) {
        nativeEnableStereoSpeakerMode(this.f127417a, z10);
    }

    public boolean f(int i10) {
        return nativeIsSoundPlaying(this.f127417a, i10);
    }

    protected void finalize() throws Throwable {
        try {
            nativeRelease(this.f127417a);
            super.finalize();
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    public boolean g(int i10) {
        return nativeIsSourceIdValid(this.f127417a, i10);
    }

    public void h() {
        nativePause(this.f127417a);
    }

    public void i(int i10) {
        nativePauseSound(this.f127417a, i10);
    }

    public void j(int i10, boolean z10) {
        nativePlaySound(this.f127417a, i10, z10);
    }

    public boolean k(String str) {
        return nativePreloadSoundFile(this.f127417a, str);
    }

    public void l() {
        nativeResume(this.f127417a);
    }

    public void m(int i10) {
        nativeResumeSound(this.f127417a, i10);
    }

    public void n(float f10, float f11, float f12) {
        nativeSetHeadPosition(this.f127417a, f10, f11, f12);
    }

    public void o(float f10, float f11, float f12, float f13) {
        nativeSetHeadRotation(this.f127417a, f10, f11, f12, f13);
    }

    public void p(float f10, float f11, float f12, int i10, int i11, int i12) {
        nativeSetRoomProperties(this.f127417a, f10, f11, f12, i10, i11, i12);
    }

    public void q(float f10, float f11, float f12) {
        nativeSetRoomReverbAdjustments(this.f127417a, f10, f11, f12);
    }

    public void r(int i10, int i11, float f10, float f11) {
        nativeSetSoundObjectDistanceRolloffModel(this.f127417a, i10, i11, f10, f11);
    }

    public void s(int i10, float f10, float f11, float f12) {
        nativeSetSoundObjectPosition(this.f127417a, i10, f10, f11, f12);
    }

    public void t(int i10, float f10) {
        nativeSetSoundVolume(this.f127417a, i10, f10);
    }

    public void u(int i10, float f10, float f11, float f12, float f13) {
        nativeSetSoundfieldRotation(this.f127417a, i10, f10, f11, f12, f13);
    }

    public void v(int i10) {
        nativeStopSound(this.f127417a, i10);
    }

    public void w(String str) {
        nativeUnloadSoundFile(this.f127417a, str);
    }

    public void x() {
        nativeUpdate(this.f127417a);
    }
}
