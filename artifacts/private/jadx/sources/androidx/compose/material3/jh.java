package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nIconButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,935:1\n646#2:936\n635#2:937\n646#2:938\n635#2:939\n646#2:940\n635#2:941\n646#2:942\n635#2:943\n*S KotlinDebug\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonColors\n*L\n783#1:936\n783#1:937\n784#1:938\n784#1:939\n785#1:940\n785#1:941\n786#1:942\n786#1:943\n*E\n"})
public final class jh {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f29781e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f29782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f29783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f29784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f29785d;

    public /* synthetic */ jh(long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13);
    }

    public static /* synthetic */ jh d(jh jhVar, long j10, long j11, long j12, long j13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = jhVar.f29782a;
        }
        long j14 = j10;
        if ((i10 & 2) != 0) {
            j11 = jhVar.f29783b;
        }
        long j15 = j11;
        if ((i10 & 4) != 0) {
            j12 = jhVar.f29784c;
        }
        return jhVar.c(j14, j15, j12, (i10 & 8) != 0 ? jhVar.f29785d : j13);
    }

    @androidx.compose.runtime.k7
    public final long a(boolean z10) {
        return z10 ? this.f29782a : this.f29784c;
    }

    @androidx.compose.runtime.k7
    public final long b(boolean z10) {
        return z10 ? this.f29783b : this.f29785d;
    }

    @NotNull
    public final jh c(long j10, long j11, long j12, long j13) {
        return new jh(j10 != 16 ? j10 : this.f29782a, j11 != 16 ? j11 : this.f29783b, j12 != 16 ? j12 : this.f29784c, j13 != 16 ? j13 : this.f29785d, null);
    }

    public final long e() {
        return this.f29782a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof jh)) {
            return false;
        }
        jh jhVar = (jh) obj;
        return androidx.compose.ui.graphics.q0.y(this.f29782a, jhVar.f29782a) && androidx.compose.ui.graphics.q0.y(this.f29783b, jhVar.f29783b) && androidx.compose.ui.graphics.q0.y(this.f29784c, jhVar.f29784c) && androidx.compose.ui.graphics.q0.y(this.f29785d, jhVar.f29785d);
    }

    public final long f() {
        return this.f29783b;
    }

    public final long g() {
        return this.f29784c;
    }

    public final long h() {
        return this.f29785d;
    }

    public int hashCode() {
        return (((((androidx.compose.ui.graphics.q0.K(this.f29782a) * 31) + androidx.compose.ui.graphics.q0.K(this.f29783b)) * 31) + androidx.compose.ui.graphics.q0.K(this.f29784c)) * 31) + androidx.compose.ui.graphics.q0.K(this.f29785d);
    }

    private jh(long j10, long j11, long j12, long j13) {
        this.f29782a = j10;
        this.f29783b = j11;
        this.f29784c = j12;
        this.f29785d = j13;
    }
}
