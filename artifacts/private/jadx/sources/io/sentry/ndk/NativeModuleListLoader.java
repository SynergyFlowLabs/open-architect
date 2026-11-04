package io.sentry.ndk;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class NativeModuleListLoader {
    public static native void nativeClearModuleList();

    public static native DebugImage[] nativeLoadModuleList();

    public void a() {
        nativeClearModuleList();
    }

    @Nullable
    public DebugImage[] b() {
        return nativeLoadModuleList();
    }
}
