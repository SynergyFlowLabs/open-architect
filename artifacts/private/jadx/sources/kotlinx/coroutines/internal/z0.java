package kotlinx.coroutines.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public final String f315150a;

    public z0(@NotNull String str) {
        this.f315150a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T a(@Nullable Object obj) {
        if (obj == this) {
            return null;
        }
        return obj;
    }

    @NotNull
    public String toString() {
        return kotlin.text.b0.f313280e + this.f315150a + kotlin.text.b0.f313281f;
    }
}
