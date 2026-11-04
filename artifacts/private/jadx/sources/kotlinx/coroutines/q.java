package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f315195a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f315196b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f315197c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f315198d = 29;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f315199e = 536870911;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f315200f = 536870911;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final kotlinx.coroutines.internal.z0 f315201g = new kotlinx.coroutines.internal.z0("RESUME_TOKEN");

    private static final int a(int i10, int i11) {
        return (i10 << 29) + i11;
    }

    private static final int b(int i10) {
        return i10 >> 29;
    }

    private static final int c(int i10) {
        return i10 & 536870911;
    }
}
