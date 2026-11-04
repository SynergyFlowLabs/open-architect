package androidx.compose.runtime.tooling;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class z extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f36710a;

    public z(@NotNull String str) {
        super(str);
        this.f36710a = str;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.f36710a;
    }
}
