package androidx.work.impl.utils;

import android.os.PowerManager;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d0 f77178a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final WeakHashMap<PowerManager.WakeLock, String> f77179b = new WeakHashMap<>();

    private d0() {
    }

    @NotNull
    public final WeakHashMap<PowerManager.WakeLock, String> a() {
        return f77179b;
    }
}
