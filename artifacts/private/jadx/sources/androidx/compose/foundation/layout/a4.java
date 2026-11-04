package androidx.compose.foundation.layout;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
public final class a4 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f15867e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f15869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f15870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f15871d;

    public a4(int i10, int i11, int i12, int i13) {
        this.f15868a = i10;
        this.f15869b = i11;
        this.f15870c = i12;
        this.f15871d = i13;
    }

    public final int a() {
        return this.f15871d;
    }

    public final int b() {
        return this.f15868a;
    }

    public final int c() {
        return this.f15870c;
    }

    public final int d() {
        return this.f15869b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4)) {
            return false;
        }
        a4 a4Var = (a4) obj;
        return this.f15868a == a4Var.f15868a && this.f15869b == a4Var.f15869b && this.f15870c == a4Var.f15870c && this.f15871d == a4Var.f15871d;
    }

    public int hashCode() {
        return (((((this.f15868a * 31) + this.f15869b) * 31) + this.f15870c) * 31) + this.f15871d;
    }

    @NotNull
    public String toString() {
        return "InsetsValues(left=" + this.f15868a + ", top=" + this.f15869b + ", right=" + this.f15870c + ", bottom=" + this.f15871d + ')';
    }
}
