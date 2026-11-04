package kotlin.time;

import kotlin.e1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.m2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@m2(markerClass = {j.class})
@e1(version = "1.9")
public interface p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f313432a = a.f313433a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f313433a = new a();

        private a() {
        }
    }

    public static final class b implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final b f313434b = new b();

        @oj.g
        @m2(markerClass = {j.class})
        @e1(version = "1.9")
        public static final class a implements kotlin.time.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f313435a;

            private /* synthetic */ a(long j10) {
                this.f313435a = j10;
            }

            public static long D(long j10, long j11) {
                return n.f313429b.b(j10, j11);
            }

            public static String E(long j10) {
                return "ValueTimeMark(reading=" + j10 + ')';
            }

            public static final /* synthetic */ a b(long j10) {
                return new a(j10);
            }

            public static final int c(long j10, long j11) {
                return kotlin.time.c.s(t(j10, j11), kotlin.time.c.f313406b.W());
            }

            public static int d(long j10, @NotNull kotlin.time.b other) {
                Intrinsics.checkNotNullParameter(other, "other");
                return b(j10).compareTo(other);
            }

            public static long e(long j10) {
                return j10;
            }

            public static long f(long j10) {
                return n.f313429b.d(j10);
            }

            public static boolean o(long j10, Object obj) {
                return (obj instanceof a) && j10 == ((a) obj).H();
            }

            public static final boolean p(long j10, long j11) {
                return j10 == j11;
            }

            public static boolean q(long j10) {
                return kotlin.time.c.x0(f(j10));
            }

            public static boolean r(long j10) {
                return !kotlin.time.c.x0(f(j10));
            }

            public static int s(long j10) {
                return Long.hashCode(j10);
            }

            public static final long t(long j10, long j11) {
                return n.f313429b.c(j10, j11);
            }

            public static long w(long j10, long j11) {
                return n.f313429b.b(j10, kotlin.time.c.R0(j11));
            }

            public static long x(long j10, @NotNull kotlin.time.b other) {
                Intrinsics.checkNotNullParameter(other, "other");
                if (other instanceof a) {
                    return t(j10, ((a) other).H());
                }
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) E(j10)) + " and " + other);
            }

            @Override // kotlin.time.b, kotlin.time.TimeMark
            public /* bridge */ /* synthetic */ kotlin.time.b C(long j10) {
                return b(z(j10));
            }

            @Override // kotlin.time.b, kotlin.time.TimeMark
            public /* bridge */ /* synthetic */ kotlin.time.b G(long j10) {
                return b(v(j10));
            }

            public final /* synthetic */ long H() {
                return this.f313435a;
            }

            @Override // java.lang.Comparable
            /* JADX INFO: renamed from: M1, reason: merged with bridge method [inline-methods] */
            public int compareTo(@NotNull kotlin.time.b bVar) {
                return kotlin.time.b.a.a(this, bVar);
            }

            @Override // kotlin.time.b
            public long Q(@NotNull kotlin.time.b other) {
                Intrinsics.checkNotNullParameter(other, "other");
                return x(this.f313435a, other);
            }

            @Override // kotlin.time.b
            public boolean equals(Object obj) {
                return o(this.f313435a, obj);
            }

            @Override // kotlin.time.b
            public int hashCode() {
                return s(this.f313435a);
            }

            @Override // kotlin.time.TimeMark
            public long k() {
                return f(this.f313435a);
            }

            @Override // kotlin.time.TimeMark
            public boolean l() {
                return q(this.f313435a);
            }

            @Override // kotlin.time.TimeMark
            public boolean n() {
                return r(this.f313435a);
            }

            public String toString() {
                return E(this.f313435a);
            }

            public long v(long j10) {
                return w(this.f313435a, j10);
            }

            public long z(long j10) {
                return D(this.f313435a, j10);
            }

            @Override // kotlin.time.TimeMark
            public /* bridge */ /* synthetic */ TimeMark C(long j10) {
                return b(z(j10));
            }

            @Override // kotlin.time.TimeMark
            public /* bridge */ /* synthetic */ TimeMark G(long j10) {
                return b(v(j10));
            }
        }

        private b() {
        }

        @Override // kotlin.time.p.c, kotlin.time.p
        public /* bridge */ /* synthetic */ kotlin.time.b a() {
            return a.b(b());
        }

        public long b() {
            return n.f313429b.e();
        }

        @NotNull
        public String toString() {
            return n.f313429b.toString();
        }

        @Override // kotlin.time.p
        public /* bridge */ /* synthetic */ TimeMark a() {
            return a.b(b());
        }
    }

    @m2(markerClass = {j.class})
    @e1(version = "1.9")
    public interface c extends p {
        @Override // kotlin.time.p
        @NotNull
        kotlin.time.b a();
    }

    @NotNull
    TimeMark a();
}
