package klipper;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f312322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f312323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private f f312324c;

    public j(long j10, long j11, @NotNull f direction) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.f312322a = j10;
        this.f312323b = j11;
        this.f312324c = direction;
    }

    public static /* synthetic */ j e(j jVar, long j10, long j11, f fVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = jVar.f312322a;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            j11 = jVar.f312323b;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            fVar = jVar.f312324c;
        }
        return jVar.d(j12, j13, fVar);
    }

    public final long a() {
        return this.f312322a;
    }

    public final long b() {
        return this.f312323b;
    }

    @NotNull
    public final f c() {
        return this.f312324c;
    }

    @NotNull
    public final j d(long j10, long j11, @NotNull f direction) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        return new j(j10, j11, direction);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f312322a == jVar.f312322a && this.f312323b == jVar.f312323b && this.f312324c == jVar.f312324c;
    }

    @NotNull
    public final f f() {
        return this.f312324c;
    }

    public final long g() {
        return this.f312322a;
    }

    public final long h() {
        return this.f312323b;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f312322a) * 31) + Long.hashCode(this.f312323b)) * 31) + this.f312324c.hashCode();
    }

    public final void i(@NotNull f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        this.f312324c = fVar;
    }

    public final void j(long j10) {
        this.f312322a = j10;
    }

    public final void k(long j10) {
        this.f312323b = j10;
    }

    @NotNull
    public String toString() {
        return "HorzDirection(left=" + this.f312322a + ", right=" + this.f312323b + ", direction=" + this.f312324c + ')';
    }
}
