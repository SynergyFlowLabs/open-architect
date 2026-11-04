package androidx.compose.ui.layout;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f39342a = f3.b(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f39343b = f3.b(-1);

    public static final long a(int i10, int i11, int i12, int i13) {
        return f3.b((((long) i11) << 32) | (((long) i10) << 48) | (((long) i12) << 16) | ((long) i13));
    }

    public static final long b(@NotNull androidx.core.graphics.j jVar) {
        return f3.b((((long) jVar.f47823a) << 48) | (((long) jVar.f47824b) << 32) | (((long) jVar.f47825c) << 16) | ((long) jVar.f47826d));
    }

    public static final long c() {
        return f39343b;
    }

    public static final long d() {
        return f39342a;
    }
}
