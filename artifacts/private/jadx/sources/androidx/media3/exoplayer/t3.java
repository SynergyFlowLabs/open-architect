package androidx.media3.exoplayer;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class t3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f65600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f65601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f65602c;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f65603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f65604b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f65605c;

        public t3 d() {
            return new t3(this);
        }

        @z7.a
        public b e(long j10) {
            androidx.media3.common.util.a.a(j10 >= 0 || j10 == -9223372036854775807L);
            this.f65605c = j10;
            return this;
        }

        @z7.a
        public b f(long j10) {
            this.f65603a = j10;
            return this;
        }

        @z7.a
        public b g(float f10) {
            androidx.media3.common.util.a.a(f10 > 0.0f || f10 == -3.4028235E38f);
            this.f65604b = f10;
            return this;
        }

        public b() {
            this.f65603a = -9223372036854775807L;
            this.f65604b = -3.4028235E38f;
            this.f65605c = -9223372036854775807L;
        }

        private b(t3 t3Var) {
            this.f65603a = t3Var.f65600a;
            this.f65604b = t3Var.f65601b;
            this.f65605c = t3Var.f65602c;
        }
    }

    public b a() {
        return new b();
    }

    public boolean b(long j10) {
        long j11 = this.f65602c;
        return (j11 == -9223372036854775807L || j10 == -9223372036854775807L || j11 < j10) ? false : true;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3)) {
            return false;
        }
        t3 t3Var = (t3) obj;
        return this.f65600a == t3Var.f65600a && this.f65601b == t3Var.f65601b && this.f65602c == t3Var.f65602c;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.f65600a), Float.valueOf(this.f65601b), Long.valueOf(this.f65602c));
    }

    private t3(b bVar) {
        this.f65600a = bVar.f65603a;
        this.f65601b = bVar.f65604b;
        this.f65602c = bVar.f65605c;
    }
}
