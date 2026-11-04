package androidx.compose.runtime.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class a1 {
    public static final long a() {
        return Thread.currentThread().getId();
    }

    @NotNull
    public static final String b() {
        return Thread.currentThread().getName();
    }
}
