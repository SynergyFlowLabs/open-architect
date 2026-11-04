package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nNavigationItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationItem.kt\nandroidx/compose/material3/NavigationItemColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,1129:1\n646#2:1130\n635#2:1131\n646#2:1132\n635#2:1133\n646#2:1134\n635#2:1135\n646#2:1136\n635#2:1137\n646#2:1138\n635#2:1139\n646#2:1140\n635#2:1141\n646#2:1142\n635#2:1143\n*S KotlinDebug\n*F\n+ 1 NavigationItem.kt\nandroidx/compose/material3/NavigationItemColors\n*L\n132#1:1130\n132#1:1131\n133#1:1132\n133#1:1133\n134#1:1134\n134#1:1135\n135#1:1136\n135#1:1137\n136#1:1138\n136#1:1139\n137#1:1140\n137#1:1141\n138#1:1142\n138#1:1143\n*E\n"})
public final class vo {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f33989h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f33990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f33991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f33992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f33993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f33994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f33995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f33996g;

    public /* synthetic */ vo(long j10, long j11, long j12, long j13, long j14, long j15, long j16, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15, j16);
    }

    @NotNull
    public final vo a(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        return new vo(j10 != 16 ? j10 : this.f33990a, j11 != 16 ? j11 : this.f33991b, j12 != 16 ? j12 : this.f33992c, j13 != 16 ? j13 : this.f33993d, j14 != 16 ? j14 : this.f33994e, j15 != 16 ? j15 : this.f33995f, j16 != 16 ? j16 : this.f33996g, null);
    }

    public final long c() {
        return this.f33995f;
    }

    public final long d() {
        return this.f33996g;
    }

    public final long e() {
        return this.f33990a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof vo)) {
            vo voVar = (vo) obj;
            return androidx.compose.ui.graphics.q0.y(this.f33990a, voVar.f33990a) && androidx.compose.ui.graphics.q0.y(this.f33993d, voVar.f33993d) && androidx.compose.ui.graphics.q0.y(this.f33991b, voVar.f33991b) && androidx.compose.ui.graphics.q0.y(this.f33994e, voVar.f33994e) && androidx.compose.ui.graphics.q0.y(this.f33992c, voVar.f33992c) && androidx.compose.ui.graphics.q0.y(this.f33995f, voVar.f33995f) && androidx.compose.ui.graphics.q0.y(this.f33996g, voVar.f33996g);
        }
        return false;
    }

    public final long f() {
        return this.f33992c;
    }

    public final long g() {
        return this.f33991b;
    }

    public final long h() {
        return this.f33993d;
    }

    public int hashCode() {
        return (((((((((((androidx.compose.ui.graphics.q0.K(this.f33990a) * 31) + androidx.compose.ui.graphics.q0.K(this.f33993d)) * 31) + androidx.compose.ui.graphics.q0.K(this.f33991b)) * 31) + androidx.compose.ui.graphics.q0.K(this.f33994e)) * 31) + androidx.compose.ui.graphics.q0.K(this.f33992c)) * 31) + androidx.compose.ui.graphics.q0.K(this.f33995f)) * 31) + androidx.compose.ui.graphics.q0.K(this.f33996g);
    }

    public final long i() {
        return this.f33994e;
    }

    @androidx.compose.runtime.k7
    public final long j(boolean z10, boolean z11) {
        if (z11) {
            return z10 ? this.f33990a : this.f33993d;
        }
        return this.f33995f;
    }

    @androidx.compose.runtime.k7
    public final long k(boolean z10, boolean z11) {
        if (z11) {
            return z10 ? this.f33991b : this.f33994e;
        }
        return this.f33996g;
    }

    private vo(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.f33990a = j10;
        this.f33991b = j11;
        this.f33992c = j12;
        this.f33993d = j13;
        this.f33994e = j14;
        this.f33995f = j15;
        this.f33996g = j16;
    }
}
