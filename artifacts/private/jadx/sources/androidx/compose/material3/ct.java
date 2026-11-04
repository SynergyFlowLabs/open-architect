package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@af
@androidx.compose.runtime.k7
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/RichTooltipColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,1654:1\n646#2:1655\n635#2:1656\n646#2:1657\n635#2:1658\n646#2:1659\n635#2:1660\n646#2:1661\n635#2:1662\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/RichTooltipColors\n*L\n881#1:1655\n881#1:1656\n882#1:1657\n882#1:1658\n883#1:1659\n883#1:1660\n884#1:1661\n884#1:1662\n*E\n"})
public final class ct {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f26873e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f26874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f26875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f26876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f26877d;

    public /* synthetic */ ct(long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13);
    }

    public static /* synthetic */ ct b(ct ctVar, long j10, long j11, long j12, long j13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = ctVar.f26874a;
        }
        long j14 = j10;
        if ((i10 & 2) != 0) {
            j11 = ctVar.f26875b;
        }
        long j15 = j11;
        if ((i10 & 4) != 0) {
            j12 = ctVar.f26876c;
        }
        return ctVar.a(j14, j15, j12, (i10 & 8) != 0 ? ctVar.f26877d : j13);
    }

    @NotNull
    public final ct a(long j10, long j11, long j12, long j13) {
        return new ct(j10 != 16 ? j10 : this.f26874a, j11 != 16 ? j11 : this.f26875b, j12 != 16 ? j12 : this.f26876c, j13 != 16 ? j13 : this.f26877d, null);
    }

    public final long c() {
        return this.f26877d;
    }

    public final long d() {
        return this.f26874a;
    }

    public final long e() {
        return this.f26875b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ct)) {
            return false;
        }
        ct ctVar = (ct) obj;
        return androidx.compose.ui.graphics.q0.y(this.f26874a, ctVar.f26874a) && androidx.compose.ui.graphics.q0.y(this.f26875b, ctVar.f26875b) && androidx.compose.ui.graphics.q0.y(this.f26876c, ctVar.f26876c) && androidx.compose.ui.graphics.q0.y(this.f26877d, ctVar.f26877d);
    }

    public final long f() {
        return this.f26876c;
    }

    public int hashCode() {
        return (((((androidx.compose.ui.graphics.q0.K(this.f26874a) * 31) + androidx.compose.ui.graphics.q0.K(this.f26875b)) * 31) + androidx.compose.ui.graphics.q0.K(this.f26876c)) * 31) + androidx.compose.ui.graphics.q0.K(this.f26877d);
    }

    private ct(long j10, long j11, long j12, long j13) {
        this.f26874a = j10;
        this.f26875b = j11;
        this.f26876c = j12;
        this.f26877d = j13;
    }
}
