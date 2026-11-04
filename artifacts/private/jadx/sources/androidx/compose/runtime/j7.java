package androidx.compose.runtime;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class j7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f36176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f36177b;

    public j7(@NotNull Object obj, int i10) {
        this.f36176a = obj;
        this.f36177b = i10;
    }

    public static /* synthetic */ j7 d(j7 j7Var, Object obj, int i10, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = j7Var.f36176a;
        }
        if ((i11 & 2) != 0) {
            i10 = j7Var.f36177b;
        }
        return j7Var.c(obj, i10);
    }

    @NotNull
    public final Object a() {
        return this.f36176a;
    }

    public final int b() {
        return this.f36177b;
    }

    @NotNull
    public final j7 c(@NotNull Object obj, int i10) {
        return new j7(obj, i10);
    }

    public final int e() {
        return this.f36177b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7)) {
            return false;
        }
        j7 j7Var = (j7) obj;
        return Intrinsics.areEqual(this.f36176a, j7Var.f36176a) && this.f36177b == j7Var.f36177b;
    }

    @NotNull
    public final Object f() {
        return this.f36176a;
    }

    public int hashCode() {
        return (this.f36176a.hashCode() * 31) + Integer.hashCode(this.f36177b);
    }

    @NotNull
    public String toString() {
        return "SourceInformationSlotTableGroupIdentity(parentIdentity=" + this.f36176a + ", index=" + this.f36177b + ')';
    }
}
