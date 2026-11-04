package androidx.compose.animation.core;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final l0 f13311a = new e0(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final l0 f13312b = new e0(0.0f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final l0 f13313c = new e0(0.4f, 0.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final l0 f13314d = new l0() { // from class: androidx.compose.animation.core.t0
        @Override // androidx.compose.animation.core.l0
        public final float a(float f10) {
            return u0.b(f10);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f13315e = 1.1920929E-7f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(float f10) {
        return f10;
    }

    @NotNull
    public static final l0 c() {
        return f13313c;
    }

    @NotNull
    public static final l0 d() {
        return f13311a;
    }

    @NotNull
    public static final l0 e() {
        return f13314d;
    }

    @NotNull
    public static final l0 f() {
        return f13312b;
    }
}
