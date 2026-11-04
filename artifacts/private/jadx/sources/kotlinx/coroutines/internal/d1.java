package kotlinx.coroutines.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
final /* synthetic */ class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f315042a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f315042a;
    }

    @Nullable
    public static final String b(@NotNull String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
