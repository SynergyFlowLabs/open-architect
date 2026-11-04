package androidx.compose.runtime;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class v2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f36724c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Object f36725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Object f36726b;

    public v2(@Nullable Object obj, @Nullable Object obj2) {
        this.f36725a = obj;
        this.f36726b = obj2;
    }

    public static /* synthetic */ v2 d(v2 v2Var, Object obj, Object obj2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = v2Var.f36725a;
        }
        if ((i10 & 2) != 0) {
            obj2 = v2Var.f36726b;
        }
        return v2Var.c(obj, obj2);
    }

    private final int g(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        }
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    @Nullable
    public final Object a() {
        return this.f36725a;
    }

    @Nullable
    public final Object b() {
        return this.f36726b;
    }

    @NotNull
    public final v2 c(@Nullable Object obj, @Nullable Object obj2) {
        return new v2(obj, obj2);
    }

    @Nullable
    public final Object e() {
        return this.f36725a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj;
        return Intrinsics.areEqual(this.f36725a, v2Var.f36725a) && Intrinsics.areEqual(this.f36726b, v2Var.f36726b);
    }

    @Nullable
    public final Object f() {
        return this.f36726b;
    }

    public int hashCode() {
        return (g(this.f36725a) * 31) + g(this.f36726b);
    }

    @NotNull
    public String toString() {
        return "JoinedKey(left=" + this.f36725a + ", right=" + this.f36726b + ')';
    }
}
