package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,847:1\n646#2:848\n635#2:849\n646#2:850\n635#2:851\n646#2:852\n635#2:853\n646#2:854\n635#2:855\n*S KotlinDebug\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardColors\n*L\n803#1:848\n803#1:849\n804#1:850\n804#1:851\n805#1:852\n805#1:853\n806#1:854\n806#1:855\n*E\n"})
public final class d4 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f27008e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f27009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f27010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f27011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f27012d;

    public /* synthetic */ d4(long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13);
    }

    public static /* synthetic */ d4 d(d4 d4Var, long j10, long j11, long j12, long j13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = d4Var.f27009a;
        }
        long j14 = j10;
        if ((i10 & 2) != 0) {
            j11 = d4Var.f27010b;
        }
        long j15 = j11;
        if ((i10 & 4) != 0) {
            j12 = d4Var.f27011c;
        }
        return d4Var.c(j14, j15, j12, (i10 & 8) != 0 ? d4Var.f27012d : j13);
    }

    @androidx.compose.runtime.k7
    public final long a(boolean z10) {
        return z10 ? this.f27009a : this.f27011c;
    }

    @androidx.compose.runtime.k7
    public final long b(boolean z10) {
        return z10 ? this.f27010b : this.f27012d;
    }

    @NotNull
    public final d4 c(long j10, long j11, long j12, long j13) {
        return new d4(j10 != 16 ? j10 : this.f27009a, j11 != 16 ? j11 : this.f27010b, j12 != 16 ? j12 : this.f27011c, j13 != 16 ? j13 : this.f27012d, null);
    }

    public final long e() {
        return this.f27009a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d4)) {
            return false;
        }
        d4 d4Var = (d4) obj;
        if (androidx.compose.ui.graphics.q0.y(this.f27009a, d4Var.f27009a) && androidx.compose.ui.graphics.q0.y(this.f27010b, d4Var.f27010b) && androidx.compose.ui.graphics.q0.y(this.f27011c, d4Var.f27011c) && androidx.compose.ui.graphics.q0.y(this.f27012d, d4Var.f27012d)) {
            return true;
        }
        return false;
    }

    public final long f() {
        return this.f27010b;
    }

    public final long g() {
        return this.f27011c;
    }

    public final long h() {
        return this.f27012d;
    }

    public int hashCode() {
        return (((((androidx.compose.ui.graphics.q0.K(this.f27009a) * 31) + androidx.compose.ui.graphics.q0.K(this.f27010b)) * 31) + androidx.compose.ui.graphics.q0.K(this.f27011c)) * 31) + androidx.compose.ui.graphics.q0.K(this.f27012d);
    }

    private d4(long j10, long j11, long j12, long j13) {
        this.f27009a = j10;
        this.f27010b = j11;
        this.f27011c = j12;
        this.f27012d = j13;
    }
}
