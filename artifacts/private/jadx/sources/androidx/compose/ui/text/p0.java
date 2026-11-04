package androidx.compose.ui.text;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class p0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f42044d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final q0 f42045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f42046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f42047c;

    public p0(@NotNull q0 q0Var, int i10, int i11) {
        this.f42045a = q0Var;
        this.f42046b = i10;
        this.f42047c = i11;
    }

    public static /* synthetic */ p0 e(p0 p0Var, q0 q0Var, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            q0Var = p0Var.f42045a;
        }
        if ((i12 & 2) != 0) {
            i10 = p0Var.f42046b;
        }
        if ((i12 & 4) != 0) {
            i11 = p0Var.f42047c;
        }
        return p0Var.d(q0Var, i10, i11);
    }

    @NotNull
    public final q0 a() {
        return this.f42045a;
    }

    public final int b() {
        return this.f42046b;
    }

    public final int c() {
        return this.f42047c;
    }

    @NotNull
    public final p0 d(@NotNull q0 q0Var, int i10, int i11) {
        return new p0(q0Var, i10, i11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return Intrinsics.areEqual(this.f42045a, p0Var.f42045a) && this.f42046b == p0Var.f42046b && this.f42047c == p0Var.f42047c;
    }

    public final int f() {
        return this.f42047c;
    }

    @NotNull
    public final q0 g() {
        return this.f42045a;
    }

    public final int h() {
        return this.f42046b;
    }

    public int hashCode() {
        return (((this.f42045a.hashCode() * 31) + Integer.hashCode(this.f42046b)) * 31) + Integer.hashCode(this.f42047c);
    }

    @NotNull
    public String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.f42045a + ", startIndex=" + this.f42046b + ", endIndex=" + this.f42047c + ')';
    }
}
