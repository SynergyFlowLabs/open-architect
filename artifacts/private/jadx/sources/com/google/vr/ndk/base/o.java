package com.google.vr.ndk.base;

/* JADX INFO: loaded from: classes5.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile boolean f127192a;

    public static void a() {
        f127192a = true;
    }

    public static void b() {
        if (f127192a) {
            return;
        }
        try {
            System.loadLibrary("gvr");
        } catch (UnsatisfiedLinkError unused) {
        }
    }
}
