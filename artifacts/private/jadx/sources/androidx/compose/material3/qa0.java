package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nWideNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WideNavigationRail.kt\nandroidx/compose/material3/WideNavigationRailColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,1263:1\n646#2:1264\n635#2:1265\n646#2:1266\n635#2:1267\n646#2:1268\n635#2:1269\n646#2:1270\n635#2:1271\n646#2:1272\n635#2:1273\n*S KotlinDebug\n*F\n+ 1 WideNavigationRail.kt\nandroidx/compose/material3/WideNavigationRailColors\n*L\n757#1:1264\n757#1:1265\n758#1:1266\n758#1:1267\n759#1:1268\n759#1:1269\n760#1:1270\n760#1:1271\n761#1:1272\n761#1:1273\n*E\n"})
public final class qa0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f32211f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f32212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f32213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f32214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f32215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f32216e;

    public /* synthetic */ qa0(long j10, long j11, long j12, long j13, long j14, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14);
    }

    public static /* synthetic */ qa0 b(qa0 qa0Var, long j10, long j11, long j12, long j13, long j14, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = qa0Var.f32212a;
        }
        long j15 = j10;
        if ((i10 & 2) != 0) {
            j11 = qa0Var.f32213b;
        }
        return qa0Var.a(j15, j11, (i10 & 4) != 0 ? qa0Var.f32214c : j12, (i10 & 8) != 0 ? qa0Var.f32215d : j13, (i10 & 16) != 0 ? qa0Var.f32216e : j14);
    }

    @NotNull
    public final qa0 a(long j10, long j11, long j12, long j13, long j14) {
        return new qa0(j10 != 16 ? j10 : this.f32212a, j11 != 16 ? j11 : this.f32213b, j12 != 16 ? j12 : this.f32214c, j13 != 16 ? j13 : this.f32215d, j14 != 16 ? j14 : this.f32216e, null);
    }

    public final long c() {
        return this.f32212a;
    }

    public final long d() {
        return this.f32213b;
    }

    public final long e() {
        return this.f32214c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof qa0)) {
            qa0 qa0Var = (qa0) obj;
            return androidx.compose.ui.graphics.q0.y(this.f32212a, qa0Var.f32212a) && androidx.compose.ui.graphics.q0.y(this.f32213b, qa0Var.f32213b) && androidx.compose.ui.graphics.q0.y(this.f32214c, qa0Var.f32214c) && androidx.compose.ui.graphics.q0.y(this.f32215d, qa0Var.f32215d);
        }
        return false;
    }

    public final long f() {
        return this.f32216e;
    }

    public final long g() {
        return this.f32215d;
    }

    public int hashCode() {
        return (((((((androidx.compose.ui.graphics.q0.K(this.f32212a) * 31) + androidx.compose.ui.graphics.q0.K(this.f32213b)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32214c)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32215d)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32216e);
    }

    private qa0(long j10, long j11, long j12, long j13, long j14) {
        this.f32212a = j10;
        this.f32213b = j11;
        this.f32214c = j12;
        this.f32215d = j13;
        this.f32216e = j14;
    }
}
