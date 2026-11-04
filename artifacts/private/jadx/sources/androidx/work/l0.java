package androidx.work;

import androidx.annotation.w0;
import androidx.media3.exoplayer.a5;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 {
    public static final int A = 12;
    public static final int B = 13;
    public static final int C = 14;
    public static final int D = 15;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final a f77346m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f77347n = -256;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f77348o = -512;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f77349p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f77350q = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f77351r = 3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f77352s = 4;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f77353t = 5;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f77354u = 6;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f77355v = 7;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f77356w = 8;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f77357x = 9;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f77358y = 10;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f77359z = 11;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final UUID f77360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c f77361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Set<String> f77362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final h f77363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final h f77364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f77365f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f77366g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final e f77367h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f77368i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private final b f77369j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f77370k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f77371l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f77372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f77373b;

        public b(long j10, long j11) {
            this.f77372a = j10;
            this.f77373b = j11;
        }

        public final long a() {
            return this.f77373b;
        }

        public final long b() {
            return this.f77372a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Intrinsics.areEqual(b.class, obj.getClass())) {
                b bVar = (b) obj;
                if (bVar.f77372a == this.f77372a && bVar.f77373b == this.f77373b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (Long.hashCode(this.f77372a) * 31) + Long.hashCode(this.f77373b);
        }

        @NotNull
        public String toString() {
            return "PeriodicityInfo{repeatIntervalMillis=" + this.f77372a + ", flexIntervalMillis=" + this.f77373b + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public enum c {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public final boolean l() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    static {
        int i10 = 2 & 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public l0(@NotNull UUID id2, @NotNull c state, @NotNull Set<String> tags) {
        this(id2, state, tags, null, null, 0, 0, null, 0L, null, 0L, 0, 4088, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tags, "tags");
    }

    @NotNull
    public final e a() {
        return this.f77367h;
    }

    public final int b() {
        return this.f77366g;
    }

    @NotNull
    public final UUID c() {
        return this.f77360a;
    }

    public final long d() {
        return this.f77368i;
    }

    public final long e() {
        return this.f77370k;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(l0.class, obj.getClass())) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (this.f77365f == l0Var.f77365f && this.f77366g == l0Var.f77366g && Intrinsics.areEqual(this.f77360a, l0Var.f77360a) && this.f77361b == l0Var.f77361b && Intrinsics.areEqual(this.f77363d, l0Var.f77363d) && Intrinsics.areEqual(this.f77367h, l0Var.f77367h) && this.f77368i == l0Var.f77368i && Intrinsics.areEqual(this.f77369j, l0Var.f77369j) && this.f77370k == l0Var.f77370k && this.f77371l == l0Var.f77371l && Intrinsics.areEqual(this.f77362c, l0Var.f77362c)) {
            return Intrinsics.areEqual(this.f77364e, l0Var.f77364e);
        }
        return false;
    }

    @NotNull
    public final h f() {
        return this.f77363d;
    }

    @Nullable
    public final b g() {
        return this.f77369j;
    }

    @NotNull
    public final h h() {
        return this.f77364e;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.f77360a.hashCode() * 31) + this.f77361b.hashCode()) * 31) + this.f77363d.hashCode()) * 31) + this.f77362c.hashCode()) * 31) + this.f77364e.hashCode()) * 31) + this.f77365f) * 31) + this.f77366g) * 31) + this.f77367h.hashCode()) * 31) + Long.hashCode(this.f77368i)) * 31;
        b bVar = this.f77369j;
        return ((((iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31) + Long.hashCode(this.f77370k)) * 31) + Integer.hashCode(this.f77371l);
    }

    @androidx.annotation.g0(from = 0)
    public final int i() {
        return this.f77365f;
    }

    @NotNull
    public final c j() {
        return this.f77361b;
    }

    @w0(31)
    public final int k() {
        return this.f77371l;
    }

    @NotNull
    public final Set<String> l() {
        return this.f77362c;
    }

    @NotNull
    public String toString() {
        return "WorkInfo{id='" + this.f77360a + "', state=" + this.f77361b + ", outputData=" + this.f77363d + ", tags=" + this.f77362c + ", progress=" + this.f77364e + ", runAttemptCount=" + this.f77365f + ", generation=" + this.f77366g + ", constraints=" + this.f77367h + ", initialDelayMillis=" + this.f77368i + ", periodicityInfo=" + this.f77369j + ", nextScheduleTimeMillis=" + this.f77370k + "}, stopReason=" + this.f77371l;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public l0(@NotNull UUID id2, @NotNull c state, @NotNull Set<String> tags, @NotNull h outputData) {
        this(id2, state, tags, outputData, null, 0, 0, null, 0L, null, 0L, 0, 4080, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(outputData, "outputData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public l0(@NotNull UUID id2, @NotNull c state, @NotNull Set<String> tags, @NotNull h outputData, @NotNull h progress) {
        this(id2, state, tags, outputData, progress, 0, 0, null, 0L, null, 0L, 0, 4064, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        Intrinsics.checkNotNullParameter(progress, "progress");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public l0(@NotNull UUID id2, @NotNull c state, @NotNull Set<String> tags, @NotNull h outputData, @NotNull h progress, int i10) {
        this(id2, state, tags, outputData, progress, i10, 0, null, 0L, null, 0L, 0, 4032, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        Intrinsics.checkNotNullParameter(progress, "progress");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public l0(@NotNull UUID id2, @NotNull c state, @NotNull Set<String> tags, @NotNull h outputData, @NotNull h progress, int i10, int i11) {
        this(id2, state, tags, outputData, progress, i10, i11, null, 0L, null, 0L, 0, 3968, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        Intrinsics.checkNotNullParameter(progress, "progress");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public l0(@NotNull UUID id2, @NotNull c state, @NotNull Set<String> tags, @NotNull h outputData, @NotNull h progress, int i10, int i11, @NotNull e constraints) {
        this(id2, state, tags, outputData, progress, i10, i11, constraints, 0L, null, 0L, 0, 3840, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public l0(@NotNull UUID id2, @NotNull c state, @NotNull Set<String> tags, @NotNull h outputData, @NotNull h progress, int i10, int i11, @NotNull e constraints, long j10) {
        this(id2, state, tags, outputData, progress, i10, i11, constraints, j10, null, 0L, 0, a5.W0, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public l0(@NotNull UUID id2, @NotNull c state, @NotNull Set<String> tags, @NotNull h outputData, @NotNull h progress, int i10, int i11, @NotNull e constraints, long j10, @Nullable b bVar) {
        this(id2, state, tags, outputData, progress, i10, i11, constraints, j10, bVar, 0L, 0, 3072, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public l0(@NotNull UUID id2, @NotNull c state, @NotNull Set<String> tags, @NotNull h outputData, @NotNull h progress, int i10, int i11, @NotNull e constraints, long j10, @Nullable b bVar, long j11) {
        this(id2, state, tags, outputData, progress, i10, i11, constraints, j10, bVar, j11, 0, 2048, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
    }

    @oj.j
    public l0(@NotNull UUID id2, @NotNull c state, @NotNull Set<String> tags, @NotNull h outputData, @NotNull h progress, int i10, int i11, @NotNull e constraints, long j10, @Nullable b bVar, long j11, int i12) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        this.f77360a = id2;
        this.f77361b = state;
        this.f77362c = tags;
        this.f77363d = outputData;
        this.f77364e = progress;
        this.f77365f = i10;
        this.f77366g = i11;
        this.f77367h = constraints;
        this.f77368i = j10;
        this.f77369j = bVar;
        this.f77370k = j11;
        this.f77371l = i12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ l0(UUID uuid, c cVar, Set set, h hVar, h hVar2, int i10, int i11, e eVar, long j10, b bVar, long j11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        h hVar3;
        h hVar4;
        if ((i13 & 8) != 0) {
            h EMPTY = h.f76562c;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            hVar3 = EMPTY;
        } else {
            hVar3 = hVar;
        }
        if ((i13 & 16) != 0) {
            h EMPTY2 = h.f76562c;
            Intrinsics.checkNotNullExpressionValue(EMPTY2, "EMPTY");
            hVar4 = EMPTY2;
        } else {
            hVar4 = hVar2;
        }
        this(uuid, cVar, set, hVar3, hVar4, (i13 & 32) != 0 ? 0 : i10, (i13 & 64) != 0 ? 0 : i11, (i13 & 128) != 0 ? e.f76536j : eVar, (i13 & 256) != 0 ? 0L : j10, (i13 & 512) != 0 ? null : bVar, (i13 & 1024) != 0 ? Long.MAX_VALUE : j11, (i13 & 2048) != 0 ? -256 : i12);
    }
}
