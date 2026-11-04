package app.rive.runtime.kotlin.fonts;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class NativeFontHelper {

    @NotNull
    public static final NativeFontHelper INSTANCE = new NativeFontHelper();

    private NativeFontHelper() {
    }

    public final native boolean cppRegisterFallbackFont(@NotNull byte[] bArr);
}
