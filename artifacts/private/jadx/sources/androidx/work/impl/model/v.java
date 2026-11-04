package androidx.work.impl.model;

import androidx.annotation.b1;
import androidx.annotation.g0;
import androidx.room.h0;
import androidx.room.u0;
import androidx.room.w1;
import androidx.work.OverwritingInputMerger;
import androidx.work.l0;
import androidx.work.o0;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModelKt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.room.u(indices = {@h0({"schedule_requested_at"}), @h0({"last_enqueue_time"})})
@b1({b1.a.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nWorkSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkSpec.kt\nandroidx/work/impl/model/WorkSpec\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,544:1\n1549#2:545\n1620#2,3:546\n*S KotlinDebug\n*F\n+ 1 WorkSpec.kt\nandroidx/work/impl/model/WorkSpec\n*L\n482#1:545\n482#1:546,3\n*E\n"})
public final class v {

    @oj.f
    @NotNull
    public static final n.a<List<c>, List<l0>> A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public static final a f76980x = new a(null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    private static final String f76981y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final long f76982z = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.room.i(name = "id")
    @oj.f
    @u0
    @NotNull
    public final String f76983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.room.i(name = "state")
    @oj.f
    @NotNull
    public l0.c f76984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.room.i(name = "worker_class_name")
    @oj.f
    @NotNull
    public String f76985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.room.i(name = "input_merger_class_name")
    @oj.f
    @NotNull
    public String f76986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.room.i(name = MetricTracker.Object.INPUT)
    @oj.f
    @NotNull
    public androidx.work.h f76987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.room.i(name = "output")
    @oj.f
    @NotNull
    public androidx.work.h f76988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.room.i(name = "initial_delay")
    @oj.f
    public long f76989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.room.i(name = "interval_duration")
    @oj.f
    public long f76990h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.room.i(name = "flex_duration")
    @oj.f
    public long f76991i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @oj.f
    @androidx.room.t
    @NotNull
    public androidx.work.e f76992j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.room.i(name = "run_attempt_count")
    @oj.f
    public int f76993k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.room.i(name = "backoff_policy")
    @oj.f
    @NotNull
    public androidx.work.a f76994l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.room.i(name = "backoff_delay_duration")
    @oj.f
    public long f76995m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.room.i(defaultValue = CreateTicketViewModelKt.EmailId, name = "last_enqueue_time")
    @oj.f
    public long f76996n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.room.i(name = "minimum_retention_duration")
    @oj.f
    public long f76997o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.room.i(name = "schedule_requested_at")
    @oj.f
    public long f76998p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.room.i(name = "run_in_foreground")
    @oj.f
    public boolean f76999q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.room.i(name = "out_of_quota_policy")
    @oj.f
    @NotNull
    public androidx.work.c0 f77000r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.room.i(defaultValue = com.facebook.appevents.p.f99189d0, name = "period_count")
    private int f77001s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.room.i(defaultValue = com.facebook.appevents.p.f99189d0)
    private final int f77002t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.room.i(defaultValue = "9223372036854775807", name = "next_schedule_time_override")
    private long f77003u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.room.i(defaultValue = com.facebook.appevents.p.f99189d0, name = "next_schedule_time_override_generation")
    private int f77004v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.room.i(defaultValue = "-256", name = androidx.media3.exoplayer.offline.u.Z)
    private final int f77005w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a(boolean z10, int i10, @NotNull androidx.work.a backoffPolicy, long j10, long j11, int i11, boolean z11, long j12, long j13, long j14, long j15) {
            Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
            if (j15 != Long.MAX_VALUE && z11) {
                return i11 == 0 ? j15 : kotlin.ranges.r.v(j15, 900000 + j11);
            }
            if (z10) {
                return kotlin.ranges.r.C(backoffPolicy == androidx.work.a.LINEAR ? j10 * ((long) i10) : (long) Math.scalb(j10, i10 - 1), o0.f77423f) + j11;
            }
            if (z11) {
                long j16 = i11 == 0 ? j11 + j12 : j11 + j14;
                return (j13 == j14 || i11 != 0) ? j16 : j16 + (j14 - j13);
            }
            if (j11 == -1) {
                return Long.MAX_VALUE;
            }
            return j11 + j12;
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.room.i(name = "id")
        @oj.f
        @NotNull
        public String f77006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.room.i(name = "state")
        @oj.f
        @NotNull
        public l0.c f77007b;

        public b(@NotNull String id2, @NotNull l0.c state) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            this.f77006a = id2;
            this.f77007b = state;
        }

        public static /* synthetic */ b d(b bVar, String str, l0.c cVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.f77006a;
            }
            if ((i10 & 2) != 0) {
                cVar = bVar.f77007b;
            }
            return bVar.c(str, cVar);
        }

        @NotNull
        public final String a() {
            return this.f77006a;
        }

        @NotNull
        public final l0.c b() {
            return this.f77007b;
        }

        @NotNull
        public final b c(@NotNull String id2, @NotNull l0.c state) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            return new b(id2, state);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f77006a, bVar.f77006a) && this.f77007b == bVar.f77007b;
        }

        public int hashCode() {
            return (this.f77006a.hashCode() * 31) + this.f77007b.hashCode();
        }

        @NotNull
        public String toString() {
            return "IdAndState(id=" + this.f77006a + ", state=" + this.f77007b + ')';
        }
    }

    static {
        String strI = androidx.work.v.i("WorkSpec");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(\"WorkSpec\")");
        f76981y = strI;
        A = new n.a() { // from class: androidx.work.impl.model.u
            @Override // n.a
            public final Object apply(Object obj) {
                return v.b((List) obj);
            }
        };
    }

    public v(@NotNull String id2, @NotNull l0.c state, @NotNull String workerClassName, @NotNull String inputMergerClassName, @NotNull androidx.work.h input, @NotNull androidx.work.h output, long j10, long j11, long j12, @NotNull androidx.work.e constraints, @g0(from = 0) int i10, @NotNull androidx.work.a backoffPolicy, long j13, long j14, long j15, long j16, boolean z10, @NotNull androidx.work.c0 outOfQuotaPolicy, int i11, int i12, long j17, int i13, int i14) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(inputMergerClassName, "inputMergerClassName");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.f76983a = id2;
        this.f76984b = state;
        this.f76985c = workerClassName;
        this.f76986d = inputMergerClassName;
        this.f76987e = input;
        this.f76988f = output;
        this.f76989g = j10;
        this.f76990h = j11;
        this.f76991i = j12;
        this.f76992j = constraints;
        this.f76993k = i10;
        this.f76994l = backoffPolicy;
        this.f76995m = j13;
        this.f76996n = j14;
        this.f76997o = j15;
        this.f76998p = j16;
        this.f76999q = z10;
        this.f77000r = outOfQuotaPolicy;
        this.f77001s = i11;
        this.f77002t = i12;
        this.f77003u = j17;
        this.f77004v = i13;
        this.f77005w = i14;
    }

    public static /* synthetic */ v B(v vVar, String str, l0.c cVar, String str2, String str3, androidx.work.h hVar, androidx.work.h hVar2, long j10, long j11, long j12, androidx.work.e eVar, int i10, androidx.work.a aVar, long j13, long j14, long j15, long j16, boolean z10, androidx.work.c0 c0Var, int i11, int i12, long j17, int i13, int i14, int i15, Object obj) {
        String str4 = (i15 & 1) != 0 ? vVar.f76983a : str;
        l0.c cVar2 = (i15 & 2) != 0 ? vVar.f76984b : cVar;
        String str5 = (i15 & 4) != 0 ? vVar.f76985c : str2;
        String str6 = (i15 & 8) != 0 ? vVar.f76986d : str3;
        androidx.work.h hVar3 = (i15 & 16) != 0 ? vVar.f76987e : hVar;
        androidx.work.h hVar4 = (i15 & 32) != 0 ? vVar.f76988f : hVar2;
        long j18 = (i15 & 64) != 0 ? vVar.f76989g : j10;
        long j19 = (i15 & 128) != 0 ? vVar.f76990h : j11;
        long j20 = (i15 & 256) != 0 ? vVar.f76991i : j12;
        androidx.work.e eVar2 = (i15 & 512) != 0 ? vVar.f76992j : eVar;
        int i16 = (i15 & 1024) != 0 ? vVar.f76993k : i10;
        String str7 = str4;
        androidx.work.a aVar2 = (i15 & 2048) != 0 ? vVar.f76994l : aVar;
        l0.c cVar3 = cVar2;
        long j21 = (i15 & 4096) != 0 ? vVar.f76995m : j13;
        long j22 = (i15 & 8192) != 0 ? vVar.f76996n : j14;
        long j23 = (i15 & 16384) != 0 ? vVar.f76997o : j15;
        long j24 = (i15 & 32768) != 0 ? vVar.f76998p : j16;
        return vVar.A(str7, cVar3, str5, str6, hVar3, hVar4, j18, j19, j20, eVar2, i16, aVar2, j21, j22, j23, j24, (i15 & 65536) != 0 ? vVar.f76999q : z10, (i15 & 131072) != 0 ? vVar.f77000r : c0Var, (i15 & 262144) != 0 ? vVar.f77001s : i11, (i15 & 524288) != 0 ? vVar.f77002t : i12, (i15 & 1048576) != 0 ? vVar.f77003u : j17, (i15 & 2097152) != 0 ? vVar.f77004v : i13, (i15 & 4194304) != 0 ? vVar.f77005w : i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List b(List list) {
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((c) it.next()).S());
        }
        return arrayList;
    }

    @NotNull
    public final v A(@NotNull String id2, @NotNull l0.c state, @NotNull String workerClassName, @NotNull String inputMergerClassName, @NotNull androidx.work.h input, @NotNull androidx.work.h output, long j10, long j11, long j12, @NotNull androidx.work.e constraints, @g0(from = 0) int i10, @NotNull androidx.work.a backoffPolicy, long j13, long j14, long j15, long j16, boolean z10, @NotNull androidx.work.c0 outOfQuotaPolicy, int i11, int i12, long j17, int i13, int i14) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(inputMergerClassName, "inputMergerClassName");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new v(id2, state, workerClassName, inputMergerClassName, input, output, j10, j11, j12, constraints, i10, backoffPolicy, j13, j14, j15, j16, z10, outOfQuotaPolicy, i11, i12, j17, i13, i14);
    }

    public final int C() {
        return this.f77002t;
    }

    public final long D() {
        return this.f77003u;
    }

    public final int E() {
        return this.f77004v;
    }

    public final int F() {
        return this.f77001s;
    }

    public final int G() {
        return this.f77005w;
    }

    public final boolean H() {
        return !Intrinsics.areEqual(androidx.work.e.f76536j, this.f76992j);
    }

    public final boolean I() {
        return this.f76984b == l0.c.ENQUEUED && this.f76993k > 0;
    }

    public final boolean J() {
        return this.f76990h != 0;
    }

    public final void K(long j10) {
        if (j10 > o0.f77423f) {
            androidx.work.v.e().l(f76981y, "Backoff delay duration exceeds maximum value");
        }
        if (j10 < 10000) {
            androidx.work.v.e().l(f76981y, "Backoff delay duration less than minimum value");
        }
        this.f76995m = kotlin.ranges.r.K(j10, 10000L, o0.f77423f);
    }

    public final void L(long j10) {
        this.f77003u = j10;
    }

    public final void M(int i10) {
        this.f77004v = i10;
    }

    public final void N(int i10) {
        this.f77001s = i10;
    }

    public final void O(long j10) {
        if (j10 < 900000) {
            androidx.work.v.e().l(f76981y, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        P(kotlin.ranges.r.v(j10, 900000L), kotlin.ranges.r.v(j10, 900000L));
    }

    public final void P(long j10, long j11) {
        if (j10 < 900000) {
            androidx.work.v.e().l(f76981y, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.f76990h = kotlin.ranges.r.v(j10, 900000L);
        if (j11 < 300000) {
            androidx.work.v.e().l(f76981y, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j11 > this.f76990h) {
            androidx.work.v.e().l(f76981y, "Flex duration greater than interval duration; Changed to " + j10);
        }
        this.f76991i = kotlin.ranges.r.K(j11, 300000L, this.f76990h);
    }

    public final long c() {
        return f76980x.a(I(), this.f76993k, this.f76994l, this.f76995m, this.f76996n, this.f77001s, J(), this.f76989g, this.f76991i, this.f76990h, this.f77003u);
    }

    @NotNull
    public final String d() {
        return this.f76983a;
    }

    @NotNull
    public final androidx.work.e e() {
        return this.f76992j;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.areEqual(this.f76983a, vVar.f76983a) && this.f76984b == vVar.f76984b && Intrinsics.areEqual(this.f76985c, vVar.f76985c) && Intrinsics.areEqual(this.f76986d, vVar.f76986d) && Intrinsics.areEqual(this.f76987e, vVar.f76987e) && Intrinsics.areEqual(this.f76988f, vVar.f76988f) && this.f76989g == vVar.f76989g && this.f76990h == vVar.f76990h && this.f76991i == vVar.f76991i && Intrinsics.areEqual(this.f76992j, vVar.f76992j) && this.f76993k == vVar.f76993k && this.f76994l == vVar.f76994l && this.f76995m == vVar.f76995m && this.f76996n == vVar.f76996n && this.f76997o == vVar.f76997o && this.f76998p == vVar.f76998p && this.f76999q == vVar.f76999q && this.f77000r == vVar.f77000r && this.f77001s == vVar.f77001s && this.f77002t == vVar.f77002t && this.f77003u == vVar.f77003u && this.f77004v == vVar.f77004v && this.f77005w == vVar.f77005w;
    }

    public final int f() {
        return this.f76993k;
    }

    @NotNull
    public final androidx.work.a g() {
        return this.f76994l;
    }

    public final long h() {
        return this.f76995m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [int] */
    /* JADX WARN: Type inference failed for: r1v31, types: [int] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((this.f76983a.hashCode() * 31) + this.f76984b.hashCode()) * 31) + this.f76985c.hashCode()) * 31) + this.f76986d.hashCode()) * 31) + this.f76987e.hashCode()) * 31) + this.f76988f.hashCode()) * 31) + Long.hashCode(this.f76989g)) * 31) + Long.hashCode(this.f76990h)) * 31) + Long.hashCode(this.f76991i)) * 31) + this.f76992j.hashCode()) * 31) + Integer.hashCode(this.f76993k)) * 31) + this.f76994l.hashCode()) * 31) + Long.hashCode(this.f76995m)) * 31) + Long.hashCode(this.f76996n)) * 31) + Long.hashCode(this.f76997o)) * 31) + Long.hashCode(this.f76998p)) * 31;
        boolean z10 = this.f76999q;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return ((((((((((((iHashCode + r10) * 31) + this.f77000r.hashCode()) * 31) + Integer.hashCode(this.f77001s)) * 31) + Integer.hashCode(this.f77002t)) * 31) + Long.hashCode(this.f77003u)) * 31) + Integer.hashCode(this.f77004v)) * 31) + Integer.hashCode(this.f77005w);
    }

    public final long i() {
        return this.f76996n;
    }

    public final long j() {
        return this.f76997o;
    }

    public final long k() {
        return this.f76998p;
    }

    public final boolean l() {
        return this.f76999q;
    }

    @NotNull
    public final androidx.work.c0 m() {
        return this.f77000r;
    }

    public final int n() {
        return this.f77001s;
    }

    @NotNull
    public final l0.c o() {
        return this.f76984b;
    }

    public final int p() {
        return this.f77002t;
    }

    public final long q() {
        return this.f77003u;
    }

    public final int r() {
        return this.f77004v;
    }

    public final int s() {
        return this.f77005w;
    }

    @NotNull
    public final String t() {
        return this.f76985c;
    }

    @NotNull
    public String toString() {
        return "{WorkSpec: " + this.f76983a + AbstractJsonLexerKt.END_OBJ;
    }

    @NotNull
    public final String u() {
        return this.f76986d;
    }

    @NotNull
    public final androidx.work.h v() {
        return this.f76987e;
    }

    @NotNull
    public final androidx.work.h w() {
        return this.f76988f;
    }

    public final long x() {
        return this.f76989g;
    }

    public final long y() {
        return this.f76990h;
    }

    public final long z() {
        return this.f76991i;
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.room.i(name = "id")
        @NotNull
        private final String f77008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.room.i(name = "state")
        @NotNull
        private final l0.c f77009b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.room.i(name = "output")
        @NotNull
        private final androidx.work.h f77010c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.room.i(name = "initial_delay")
        private final long f77011d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.room.i(name = "interval_duration")
        private final long f77012e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @androidx.room.i(name = "flex_duration")
        private final long f77013f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @androidx.room.t
        @NotNull
        private final androidx.work.e f77014g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @androidx.room.i(name = "run_attempt_count")
        private final int f77015h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @androidx.room.i(name = "backoff_policy")
        @NotNull
        private androidx.work.a f77016i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @androidx.room.i(name = "backoff_delay_duration")
        private long f77017j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @androidx.room.i(name = "last_enqueue_time")
        private long f77018k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @androidx.room.i(defaultValue = com.facebook.appevents.p.f99189d0, name = "period_count")
        private int f77019l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @androidx.room.i(name = "generation")
        private final int f77020m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @androidx.room.i(name = "next_schedule_time_override")
        private final long f77021n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @androidx.room.i(name = androidx.media3.exoplayer.offline.u.Z)
        private final int f77022o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @w1(entity = a0.class, entityColumn = "work_spec_id", parentColumn = "id", projection = {"tag"})
        @NotNull
        private final List<String> f77023p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @w1(entity = r.class, entityColumn = "work_spec_id", parentColumn = "id", projection = {"progress"})
        @NotNull
        private final List<androidx.work.h> f77024q;

        public c(@NotNull String id2, @NotNull l0.c state, @NotNull androidx.work.h output, long j10, long j11, long j12, @NotNull androidx.work.e constraints, int i10, @NotNull androidx.work.a backoffPolicy, long j13, long j14, int i11, int i12, long j15, int i13, @NotNull List<String> tags, @NotNull List<androidx.work.h> progress) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(constraints, "constraints");
            Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
            Intrinsics.checkNotNullParameter(tags, "tags");
            Intrinsics.checkNotNullParameter(progress, "progress");
            this.f77008a = id2;
            this.f77009b = state;
            this.f77010c = output;
            this.f77011d = j10;
            this.f77012e = j11;
            this.f77013f = j12;
            this.f77014g = constraints;
            this.f77015h = i10;
            this.f77016i = backoffPolicy;
            this.f77017j = j13;
            this.f77018k = j14;
            this.f77019l = i11;
            this.f77020m = i12;
            this.f77021n = j15;
            this.f77022o = i13;
            this.f77023p = tags;
            this.f77024q = progress;
        }

        private final l0.b G() {
            long j10 = this.f77012e;
            if (j10 != 0) {
                return new l0.b(j10, this.f77013f);
            }
            return null;
        }

        private final long a() {
            if (this.f77009b == l0.c.ENQUEUED) {
                return v.f76980x.a(M(), this.f77015h, this.f77016i, this.f77017j, this.f77018k, this.f77019l, N(), this.f77011d, this.f77013f, this.f77012e, this.f77021n);
            }
            return Long.MAX_VALUE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c t(c cVar, String str, l0.c cVar2, androidx.work.h hVar, long j10, long j11, long j12, androidx.work.e eVar, int i10, androidx.work.a aVar, long j13, long j14, int i11, int i12, long j15, int i13, List list, List list2, int i14, Object obj) {
            String str2 = (i14 & 1) != 0 ? cVar.f77008a : str;
            l0.c cVar3 = (i14 & 2) != 0 ? cVar.f77009b : cVar2;
            return cVar.s(str2, cVar3, (i14 & 4) != 0 ? cVar.f77010c : hVar, (i14 & 8) != 0 ? cVar.f77011d : j10, (i14 & 16) != 0 ? cVar.f77012e : j11, (i14 & 32) != 0 ? cVar.f77013f : j12, (i14 & 64) != 0 ? cVar.f77014g : eVar, (i14 & 128) != 0 ? cVar.f77015h : i10, (i14 & 256) != 0 ? cVar.f77016i : aVar, (i14 & 512) != 0 ? cVar.f77017j : j13, (i14 & 1024) != 0 ? cVar.f77018k : j14, (i14 & 2048) != 0 ? cVar.f77019l : i11, (i14 & 4096) != 0 ? cVar.f77020m : i12, (i14 & 8192) != 0 ? cVar.f77021n : j15, (i14 & 16384) != 0 ? cVar.f77022o : i13, (32768 & i14) != 0 ? cVar.f77023p : list, (i14 & 65536) != 0 ? cVar.f77024q : list2);
        }

        public final long A() {
            return this.f77011d;
        }

        public final long B() {
            return this.f77012e;
        }

        public final long C() {
            return this.f77018k;
        }

        public final long D() {
            return this.f77021n;
        }

        @NotNull
        public final androidx.work.h E() {
            return this.f77010c;
        }

        public final int F() {
            return this.f77019l;
        }

        @NotNull
        public final List<androidx.work.h> H() {
            return this.f77024q;
        }

        public final int I() {
            return this.f77015h;
        }

        @NotNull
        public final l0.c J() {
            return this.f77009b;
        }

        public final int K() {
            return this.f77022o;
        }

        @NotNull
        public final List<String> L() {
            return this.f77023p;
        }

        public final boolean M() {
            return this.f77009b == l0.c.ENQUEUED && this.f77015h > 0;
        }

        public final boolean N() {
            return this.f77012e != 0;
        }

        public final void O(long j10) {
            this.f77017j = j10;
        }

        public final void P(@NotNull androidx.work.a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "<set-?>");
            this.f77016i = aVar;
        }

        public final void Q(long j10) {
            this.f77018k = j10;
        }

        public final void R(int i10) {
            this.f77019l = i10;
        }

        @NotNull
        public final l0 S() {
            androidx.work.h progress = !this.f77024q.isEmpty() ? this.f77024q.get(0) : androidx.work.h.f76562c;
            UUID uuidFromString = UUID.fromString(this.f77008a);
            Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(id)");
            l0.c cVar = this.f77009b;
            HashSet hashSet = new HashSet(this.f77023p);
            androidx.work.h hVar = this.f77010c;
            Intrinsics.checkNotNullExpressionValue(progress, "progress");
            return new l0(uuidFromString, cVar, hashSet, hVar, progress, this.f77015h, this.f77020m, this.f77014g, this.f77011d, G(), a(), this.f77022o);
        }

        @NotNull
        public final String b() {
            return this.f77008a;
        }

        public final long c() {
            return this.f77017j;
        }

        public final long d() {
            return this.f77018k;
        }

        public final int e() {
            return this.f77019l;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f77008a, cVar.f77008a) && this.f77009b == cVar.f77009b && Intrinsics.areEqual(this.f77010c, cVar.f77010c) && this.f77011d == cVar.f77011d && this.f77012e == cVar.f77012e && this.f77013f == cVar.f77013f && Intrinsics.areEqual(this.f77014g, cVar.f77014g) && this.f77015h == cVar.f77015h && this.f77016i == cVar.f77016i && this.f77017j == cVar.f77017j && this.f77018k == cVar.f77018k && this.f77019l == cVar.f77019l && this.f77020m == cVar.f77020m && this.f77021n == cVar.f77021n && this.f77022o == cVar.f77022o && Intrinsics.areEqual(this.f77023p, cVar.f77023p) && Intrinsics.areEqual(this.f77024q, cVar.f77024q);
        }

        public final int f() {
            return this.f77020m;
        }

        public final long g() {
            return this.f77021n;
        }

        public final int h() {
            return this.f77022o;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((this.f77008a.hashCode() * 31) + this.f77009b.hashCode()) * 31) + this.f77010c.hashCode()) * 31) + Long.hashCode(this.f77011d)) * 31) + Long.hashCode(this.f77012e)) * 31) + Long.hashCode(this.f77013f)) * 31) + this.f77014g.hashCode()) * 31) + Integer.hashCode(this.f77015h)) * 31) + this.f77016i.hashCode()) * 31) + Long.hashCode(this.f77017j)) * 31) + Long.hashCode(this.f77018k)) * 31) + Integer.hashCode(this.f77019l)) * 31) + Integer.hashCode(this.f77020m)) * 31) + Long.hashCode(this.f77021n)) * 31) + Integer.hashCode(this.f77022o)) * 31) + this.f77023p.hashCode()) * 31) + this.f77024q.hashCode();
        }

        @NotNull
        public final List<String> i() {
            return this.f77023p;
        }

        @NotNull
        public final List<androidx.work.h> j() {
            return this.f77024q;
        }

        @NotNull
        public final l0.c k() {
            return this.f77009b;
        }

        @NotNull
        public final androidx.work.h l() {
            return this.f77010c;
        }

        public final long m() {
            return this.f77011d;
        }

        public final long n() {
            return this.f77012e;
        }

        public final long o() {
            return this.f77013f;
        }

        @NotNull
        public final androidx.work.e p() {
            return this.f77014g;
        }

        public final int q() {
            return this.f77015h;
        }

        @NotNull
        public final androidx.work.a r() {
            return this.f77016i;
        }

        @NotNull
        public final c s(@NotNull String id2, @NotNull l0.c state, @NotNull androidx.work.h output, long j10, long j11, long j12, @NotNull androidx.work.e constraints, int i10, @NotNull androidx.work.a backoffPolicy, long j13, long j14, int i11, int i12, long j15, int i13, @NotNull List<String> tags, @NotNull List<androidx.work.h> progress) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(constraints, "constraints");
            Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
            Intrinsics.checkNotNullParameter(tags, "tags");
            Intrinsics.checkNotNullParameter(progress, "progress");
            return new c(id2, state, output, j10, j11, j12, constraints, i10, backoffPolicy, j13, j14, i11, i12, j15, i13, tags, progress);
        }

        @NotNull
        public String toString() {
            return "WorkInfoPojo(id=" + this.f77008a + ", state=" + this.f77009b + ", output=" + this.f77010c + ", initialDelay=" + this.f77011d + ", intervalDuration=" + this.f77012e + ", flexDuration=" + this.f77013f + ", constraints=" + this.f77014g + ", runAttemptCount=" + this.f77015h + ", backoffPolicy=" + this.f77016i + ", backoffDelayDuration=" + this.f77017j + ", lastEnqueueTime=" + this.f77018k + ", periodCount=" + this.f77019l + ", generation=" + this.f77020m + ", nextScheduleTimeOverride=" + this.f77021n + ", stopReason=" + this.f77022o + ", tags=" + this.f77023p + ", progress=" + this.f77024q + ')';
        }

        public final long u() {
            return this.f77017j;
        }

        @NotNull
        public final androidx.work.a v() {
            return this.f77016i;
        }

        @NotNull
        public final androidx.work.e w() {
            return this.f77014g;
        }

        public final long x() {
            return this.f77013f;
        }

        public final int y() {
            return this.f77020m;
        }

        @NotNull
        public final String z() {
            return this.f77008a;
        }

        public /* synthetic */ c(String str, l0.c cVar, androidx.work.h hVar, long j10, long j11, long j12, androidx.work.e eVar, int i10, androidx.work.a aVar, long j13, long j14, int i11, int i12, long j15, int i13, List list, List list2, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, cVar, hVar, (i14 & 8) != 0 ? 0L : j10, (i14 & 16) != 0 ? 0L : j11, (i14 & 32) != 0 ? 0L : j12, eVar, i10, (i14 & 256) != 0 ? androidx.work.a.EXPONENTIAL : aVar, (i14 & 512) != 0 ? 30000L : j13, (i14 & 1024) != 0 ? 0L : j14, (i14 & 2048) != 0 ? 0 : i11, i12, j15, i13, list, list2);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ v(String str, l0.c cVar, String str2, String str3, androidx.work.h hVar, androidx.work.h hVar2, long j10, long j11, long j12, androidx.work.e eVar, int i10, androidx.work.a aVar, long j13, long j14, long j15, long j16, boolean z10, androidx.work.c0 c0Var, int i11, int i12, long j17, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        String str4;
        androidx.work.h hVar3;
        androidx.work.h hVar4;
        l0.c cVar2 = (i15 & 2) != 0 ? l0.c.ENQUEUED : cVar;
        if ((i15 & 8) != 0) {
            String name = OverwritingInputMerger.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "OverwritingInputMerger::class.java.name");
            str4 = name;
        } else {
            str4 = str3;
        }
        if ((i15 & 16) != 0) {
            androidx.work.h EMPTY = androidx.work.h.f76562c;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            hVar3 = EMPTY;
        } else {
            hVar3 = hVar;
        }
        if ((i15 & 32) != 0) {
            androidx.work.h EMPTY2 = androidx.work.h.f76562c;
            Intrinsics.checkNotNullExpressionValue(EMPTY2, "EMPTY");
            hVar4 = EMPTY2;
        } else {
            hVar4 = hVar2;
        }
        this(str, cVar2, str2, str4, hVar3, hVar4, (i15 & 64) != 0 ? 0L : j10, (i15 & 128) != 0 ? 0L : j11, (i15 & 256) != 0 ? 0L : j12, (i15 & 512) != 0 ? androidx.work.e.f76536j : eVar, (i15 & 1024) != 0 ? 0 : i10, (i15 & 2048) != 0 ? androidx.work.a.EXPONENTIAL : aVar, (i15 & 4096) != 0 ? 30000L : j13, (i15 & 8192) != 0 ? -1L : j14, (i15 & 16384) == 0 ? j15 : 0L, (32768 & i15) != 0 ? -1L : j16, (65536 & i15) != 0 ? false : z10, (131072 & i15) != 0 ? androidx.work.c0.RUN_AS_NON_EXPEDITED_WORK_REQUEST : c0Var, (262144 & i15) != 0 ? 0 : i11, (524288 & i15) != 0 ? 0 : i12, (1048576 & i15) != 0 ? Long.MAX_VALUE : j17, (2097152 & i15) != 0 ? 0 : i13, (i15 & 4194304) != 0 ? -256 : i14);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(@NotNull String id2, @NotNull String workerClassName_) {
        this(id2, null, workerClassName_, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, 8388602, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(workerClassName_, "workerClassName_");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(@NotNull String newId, @NotNull v other) {
        this(newId, other.f76984b, other.f76985c, other.f76986d, new androidx.work.h(other.f76987e), new androidx.work.h(other.f76988f), other.f76989g, other.f76990h, other.f76991i, new androidx.work.e(other.f76992j), other.f76993k, other.f76994l, other.f76995m, other.f76996n, other.f76997o, other.f76998p, other.f76999q, other.f77000r, other.f77001s, 0, other.f77003u, other.f77004v, other.f77005w, 524288, null);
        Intrinsics.checkNotNullParameter(newId, "newId");
        Intrinsics.checkNotNullParameter(other, "other");
    }
}
