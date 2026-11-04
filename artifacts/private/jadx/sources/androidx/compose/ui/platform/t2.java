package androidx.compose.ui.platform;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class t2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f40893d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private String f40894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Object f40895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final j4 f40896c = new j4();

    @Nullable
    public final String a() {
        return this.f40894a;
    }

    @NotNull
    public final j4 b() {
        return this.f40896c;
    }

    @Nullable
    public final Object c() {
        return this.f40895b;
    }

    public final void d(@Nullable String str) {
        this.f40894a = str;
    }

    public final void e(@Nullable Object obj) {
        this.f40895b = obj;
    }
}
