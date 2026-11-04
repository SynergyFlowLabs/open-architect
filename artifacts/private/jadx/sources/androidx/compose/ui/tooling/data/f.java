package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@n
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f42522c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Object f42523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Object f42524b;

    public f(@Nullable Object obj, @Nullable Object obj2) {
        this.f42523a = obj;
        this.f42524b = obj2;
    }

    public static /* synthetic */ f d(f fVar, Object obj, Object obj2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = fVar.f42523a;
        }
        if ((i10 & 2) != 0) {
            obj2 = fVar.f42524b;
        }
        return fVar.c(obj, obj2);
    }

    @Nullable
    public final Object a() {
        return this.f42523a;
    }

    @Nullable
    public final Object b() {
        return this.f42524b;
    }

    @NotNull
    public final f c(@Nullable Object obj, @Nullable Object obj2) {
        return new f(obj, obj2);
    }

    @Nullable
    public final Object e() {
        return this.f42523a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f42523a, fVar.f42523a) && Intrinsics.areEqual(this.f42524b, fVar.f42524b);
    }

    @Nullable
    public final Object f() {
        return this.f42524b;
    }

    public int hashCode() {
        Object obj = this.f42523a;
        int i10 = 7 & 0;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f42524b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "JoinedKey(left=" + this.f42523a + ", right=" + this.f42524b + ')';
    }
}
