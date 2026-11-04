package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class z extends IllegalStateException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f36857b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f36858a;

    public z(@NotNull String str) {
        this.f36858a = str;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.f36858a;
    }
}
