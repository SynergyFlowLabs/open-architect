package androidx.compose.runtime.internal;

import android.os.Trace;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b1 f35891a = new b1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f35892b = 0;

    private b1() {
    }

    @Nullable
    public final Object a(@NotNull String str) {
        Trace.beginSection(str);
        return null;
    }

    public final void b(@Nullable Object obj) {
        Trace.endSection();
    }
}
