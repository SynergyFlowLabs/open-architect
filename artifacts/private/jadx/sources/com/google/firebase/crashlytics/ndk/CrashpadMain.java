package com.google.firebase.crashlytics.ndk;

/* JADX INFO: loaded from: classes5.dex */
public class CrashpadMain {
    public static native void crashpadMain(String[] strArr);

    public static void main(String[] strArr) {
        try {
            System.load(strArr[1] + "libcrashlytics-handler.so");
            crashpadMain(strArr);
        } catch (UnsatisfiedLinkError e10) {
            throw new RuntimeException(e10);
        }
    }
}
