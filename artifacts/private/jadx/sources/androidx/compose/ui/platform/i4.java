package androidx.compose.ui.platform;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class i4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f40520c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f40521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Object f40522b;

    public i4(@NotNull String str, @Nullable Object obj) {
        this.f40521a = str;
        this.f40522b = obj;
    }

    public static /* synthetic */ i4 d(i4 i4Var, String str, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = i4Var.f40521a;
        }
        if ((i10 & 2) != 0) {
            obj = i4Var.f40522b;
        }
        return i4Var.c(str, obj);
    }

    @NotNull
    public final String a() {
        return this.f40521a;
    }

    @Nullable
    public final Object b() {
        return this.f40522b;
    }

    @NotNull
    public final i4 c(@NotNull String str, @Nullable Object obj) {
        return new i4(str, obj);
    }

    @NotNull
    public final String e() {
        return this.f40521a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4)) {
            return false;
        }
        i4 i4Var = (i4) obj;
        return Intrinsics.areEqual(this.f40521a, i4Var.f40521a) && Intrinsics.areEqual(this.f40522b, i4Var.f40522b);
    }

    @Nullable
    public final Object f() {
        return this.f40522b;
    }

    public int hashCode() {
        int iHashCode = this.f40521a.hashCode() * 31;
        Object obj = this.f40522b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    @NotNull
    public String toString() {
        return "ValueElement(name=" + this.f40521a + ", value=" + this.f40522b + ')';
    }
}
