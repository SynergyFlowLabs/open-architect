package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,1117:1\n646#2:1118\n635#2:1119\n646#2:1120\n635#2:1121\n646#2:1122\n635#2:1123\n646#2:1124\n635#2:1125\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonColors\n*L\n1073#1:1118\n1073#1:1119\n1074#1:1120\n1074#1:1121\n1075#1:1122\n1075#1:1123\n1076#1:1124\n1076#1:1125\n*E\n"})
public final class r3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f32400e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f32401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f32402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f32403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f32404d;

    public /* synthetic */ r3(long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13);
    }

    public static /* synthetic */ r3 d(r3 r3Var, long j10, long j11, long j12, long j13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = r3Var.f32401a;
        }
        long j14 = j10;
        if ((i10 & 2) != 0) {
            j11 = r3Var.f32402b;
        }
        long j15 = j11;
        if ((i10 & 4) != 0) {
            j12 = r3Var.f32403c;
        }
        return r3Var.c(j14, j15, j12, (i10 & 8) != 0 ? r3Var.f32404d : j13);
    }

    @androidx.compose.runtime.k7
    public final long a(boolean z10) {
        return z10 ? this.f32401a : this.f32403c;
    }

    @androidx.compose.runtime.k7
    public final long b(boolean z10) {
        return z10 ? this.f32402b : this.f32404d;
    }

    @NotNull
    public final r3 c(long j10, long j11, long j12, long j13) {
        return new r3(j10 != 16 ? j10 : this.f32401a, j11 != 16 ? j11 : this.f32402b, j12 != 16 ? j12 : this.f32403c, j13 != 16 ? j13 : this.f32404d, null);
    }

    public final long e() {
        return this.f32401a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof r3)) {
            r3 r3Var = (r3) obj;
            return androidx.compose.ui.graphics.q0.y(this.f32401a, r3Var.f32401a) && androidx.compose.ui.graphics.q0.y(this.f32402b, r3Var.f32402b) && androidx.compose.ui.graphics.q0.y(this.f32403c, r3Var.f32403c) && androidx.compose.ui.graphics.q0.y(this.f32404d, r3Var.f32404d);
        }
        return false;
    }

    public final long f() {
        return this.f32402b;
    }

    public final long g() {
        return this.f32403c;
    }

    public final long h() {
        return this.f32404d;
    }

    public int hashCode() {
        return (((((androidx.compose.ui.graphics.q0.K(this.f32401a) * 31) + androidx.compose.ui.graphics.q0.K(this.f32402b)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32403c)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32404d);
    }

    private r3(long j10, long j11, long j12, long j13) {
        this.f32401a = j10;
        this.f32402b = j11;
        this.f32403c = j12;
        this.f32404d = j13;
    }
}
