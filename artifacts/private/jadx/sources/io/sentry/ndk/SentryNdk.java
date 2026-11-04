package io.sentry.ndk;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class SentryNdk {
    private static volatile boolean nativeLibrariesLoaded;

    private SentryNdk() {
    }

    public static void close() {
        loadNativeLibraries();
        shutdown();
    }

    public static void init(@NotNull NdkOptions ndkOptions) {
        loadNativeLibraries();
        initSentryNative(ndkOptions);
    }

    private static native void initSentryNative(@NotNull NdkOptions ndkOptions);

    public static synchronized void loadNativeLibraries() {
        try {
            if (!nativeLibrariesLoaded) {
                System.loadLibrary("log");
                System.loadLibrary("sentry");
                System.loadLibrary("sentry-android");
                nativeLibrariesLoaded = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static native void shutdown();
}
