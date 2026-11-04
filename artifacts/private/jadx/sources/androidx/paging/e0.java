package androidx.paging;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.l1
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f71824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final j3 f71825b;

    public e0(int i10, @NotNull j3 hint) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        this.f71824a = i10;
        this.f71825b = hint;
    }

    public static /* synthetic */ e0 d(e0 e0Var, int i10, j3 j3Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = e0Var.f71824a;
        }
        if ((i11 & 2) != 0) {
            j3Var = e0Var.f71825b;
        }
        return e0Var.c(i10, j3Var);
    }

    public final int a() {
        return this.f71824a;
    }

    @NotNull
    public final j3 b() {
        return this.f71825b;
    }

    @NotNull
    public final e0 c(int i10, @NotNull j3 hint) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        return new e0(i10, hint);
    }

    public final int e() {
        return this.f71824a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f71824a == e0Var.f71824a && Intrinsics.areEqual(this.f71825b, e0Var.f71825b);
    }

    @NotNull
    public final j3 f() {
        return this.f71825b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f71824a) * 31) + this.f71825b.hashCode();
    }

    @NotNull
    public String toString() {
        return "GenerationalViewportHint(generationId=" + this.f71824a + ", hint=" + this.f71825b + ')';
    }
}
