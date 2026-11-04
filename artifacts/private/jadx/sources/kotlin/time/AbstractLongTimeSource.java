package kotlin.time;

import kotlin.e1;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@m2(markerClass = {j.class})
@e1(version = "1.9")
public abstract class AbstractLongTimeSource implements p.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f f313398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final f0 f313399c;

    @SourceDebugExtension({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,199:1\n80#2:200\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n*L\n67#1:200\n*E\n"})
    private static final class a implements kotlin.time.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f313400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final AbstractLongTimeSource f313401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f313402c;

        public /* synthetic */ a(long j10, AbstractLongTimeSource abstractLongTimeSource, long j11, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, abstractLongTimeSource, j11);
        }

        @Override // kotlin.time.TimeMark
        @NotNull
        public kotlin.time.b G(long j10) {
            return kotlin.time.b.a.d(this, j10);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: M1 */
        public int compareTo(@NotNull kotlin.time.b bVar) {
            return kotlin.time.b.a.a(this, bVar);
        }

        @Override // kotlin.time.b
        public long Q(@NotNull kotlin.time.b other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof a) {
                a aVar = (a) other;
                if (Intrinsics.areEqual(this.f313401b, aVar.f313401b)) {
                    return c.A0(k.h(this.f313400a, aVar.f313400a, this.f313401b.d()), c.z0(this.f313402c, aVar.f313402c));
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        @Override // kotlin.time.b
        public boolean equals(@Nullable Object obj) {
            return (obj instanceof a) && Intrinsics.areEqual(this.f313401b, ((a) obj).f313401b) && c.D(Q((kotlin.time.b) obj), c.f313406b.W());
        }

        @Override // kotlin.time.b
        public int hashCode() {
            return (c.s0(this.f313402c) * 37) + Long.hashCode(this.f313400a);
        }

        @Override // kotlin.time.TimeMark
        public long k() {
            return c.z0(k.h(this.f313401b.c(), this.f313400a, this.f313401b.d()), this.f313402c);
        }

        @Override // kotlin.time.TimeMark
        public boolean l() {
            return kotlin.time.b.a.b(this);
        }

        @Override // kotlin.time.TimeMark
        public boolean n() {
            return kotlin.time.b.a.c(this);
        }

        @NotNull
        public String toString() {
            return "LongTimeMark(" + this.f313400a + i.h(this.f313401b.d()) + " + " + ((Object) c.N0(this.f313402c)) + ", " + this.f313401b + ')';
        }

        private a(long j10, AbstractLongTimeSource timeSource, long j11) {
            Intrinsics.checkNotNullParameter(timeSource, "timeSource");
            this.f313400a = j10;
            this.f313401b = timeSource;
            this.f313402c = j11;
        }

        @Override // kotlin.time.TimeMark
        @NotNull
        public kotlin.time.b C(long j10) {
            f fVarD = this.f313401b.d();
            if (c.w0(j10)) {
                return new a(k.d(this.f313400a, fVarD, j10), this.f313401b, c.f313406b.W(), null);
            }
            long jQ0 = c.Q0(j10, fVarD);
            long jA0 = c.A0(c.z0(j10, jQ0), this.f313402c);
            long jD = k.d(this.f313400a, fVarD, jQ0);
            long jQ1 = c.Q0(jA0, fVarD);
            long jD2 = k.d(jD, fVarD, jQ1);
            long jZ0 = c.z0(jA0, jQ1);
            long jH0 = c.h0(jZ0);
            if (jD2 != 0 && jH0 != 0 && (jD2 ^ jH0) < 0) {
                long jM0 = e.m0(kotlin.math.b.V(jH0), fVarD);
                jD2 = k.d(jD2, fVarD, jM0);
                jZ0 = c.z0(jZ0, jM0);
            }
            if ((1 | (jD2 - 1)) == Long.MAX_VALUE) {
                jZ0 = c.f313406b.W();
            }
            return new a(jD2, this.f313401b, jZ0, null);
        }
    }

    static final class b extends l0 implements Function0<Long> {
        b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(AbstractLongTimeSource.this.f());
        }
    }

    public AbstractLongTimeSource(@NotNull f unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f313398b = unit;
        this.f313399c = g0.c(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long c() {
        return f() - e();
    }

    private final long e() {
        return ((Number) this.f313399c.getValue()).longValue();
    }

    @NotNull
    protected final f d() {
        return this.f313398b;
    }

    protected abstract long f();

    @Override // kotlin.time.p
    @NotNull
    public kotlin.time.b a() {
        return new a(c(), this, c.f313406b.W(), null);
    }
}
