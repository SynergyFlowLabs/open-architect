package androidx.compose.runtime;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class w3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f36759b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f36760a;

    public w3(@NotNull String str) {
        this.f36760a = str;
    }

    public static /* synthetic */ w3 c(w3 w3Var, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = w3Var.f36760a;
        }
        return w3Var.b(str);
    }

    @NotNull
    public final String a() {
        return this.f36760a;
    }

    @NotNull
    public final w3 b(@NotNull String str) {
        return new w3(str);
    }

    @NotNull
    public final String d() {
        return this.f36760a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w3) && Intrinsics.areEqual(this.f36760a, ((w3) obj).f36760a);
    }

    public int hashCode() {
        return this.f36760a.hashCode();
    }

    @NotNull
    public String toString() {
        return "OpaqueKey(key=" + this.f36760a + ')';
    }
}
