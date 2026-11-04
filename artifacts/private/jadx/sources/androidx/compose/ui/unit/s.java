package androidx.compose.ui.unit;

import androidx.compose.runtime.k7;
import androidx.compose.runtime.o2;
import com.rabbitmq.client.k0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@o2
@SourceDebugExtension({"SMAP\nIntRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntRect.kt\nandroidx/compose/ui/unit/IntRect\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,277:1\n30#2:278\n80#3:279\n80#3:281\n80#3:283\n80#3:285\n80#3:287\n80#3:289\n80#3:291\n80#3:293\n80#3:295\n80#3:297\n32#4:280\n32#4:282\n32#4:284\n32#4:286\n32#4:288\n32#4:290\n32#4:292\n32#4:294\n32#4:296\n*S KotlinDebug\n*F\n+ 1 IntRect.kt\nandroidx/compose/ui/unit/IntRect\n*L\n72#1:278\n72#1:279\n140#1:281\n144#1:283\n148#1:285\n152#1:287\n161#1:289\n165#1:291\n169#1:293\n174#1:295\n180#1:297\n140#1:280\n144#1:282\n148#1:284\n152#1:286\n161#1:288\n165#1:290\n169#1:292\n174#1:294\n180#1:296\n*E\n"})
public final class s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f42714f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f42716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f42717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f42718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f42719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f42713e = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final s f42715g = new s(0, 0, 0, 0);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @k7
        public static /* synthetic */ void b() {
        }

        @NotNull
        public final s a() {
            return s.f42715g;
        }

        private a() {
        }
    }

    public s(int i10, int i11, int i12, int i13) {
        this.f42716a = i10;
        this.f42717b = i11;
        this.f42718c = i12;
        this.f42719d = i13;
    }

    @k7
    public static /* synthetic */ void A() {
    }

    @k7
    public static /* synthetic */ void C() {
    }

    @k7
    public static /* synthetic */ void H() {
    }

    @k7
    public static /* synthetic */ void L() {
    }

    public static /* synthetic */ s h(s sVar, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = sVar.f42716a;
        }
        if ((i14 & 2) != 0) {
            i11 = sVar.f42717b;
        }
        if ((i14 & 4) != 0) {
            i12 = sVar.f42718c;
        }
        if ((i14 & 8) != 0) {
            i13 = sVar.f42719d;
        }
        return sVar.g(i10, i11, i12, i13);
    }

    @k7
    public static /* synthetic */ void k() {
    }

    @k7
    public static /* synthetic */ void s() {
    }

    @k7
    public static /* synthetic */ void u() {
    }

    @k7
    public static /* synthetic */ void y() {
    }

    public final int B() {
        return this.f42717b;
    }

    public final long D() {
        return q.f((((long) (this.f42716a + (G() / 2))) << 32) | (((long) this.f42717b) & k0.f265952a));
    }

    public final long E() {
        return q.f((((long) this.f42716a) << 32) | (((long) this.f42717b) & k0.f265952a));
    }

    public final long F() {
        return q.f((((long) this.f42718c) << 32) | (((long) this.f42717b) & k0.f265952a));
    }

    public final int G() {
        return this.f42718c - this.f42716a;
    }

    @k7
    @NotNull
    public final s I(int i10) {
        return new s(this.f42716a - i10, this.f42717b - i10, this.f42718c + i10, this.f42719d + i10);
    }

    @k7
    @NotNull
    public final s J(@NotNull s sVar) {
        return new s(Math.max(this.f42716a, sVar.f42716a), Math.max(this.f42717b, sVar.f42717b), Math.min(this.f42718c, sVar.f42718c), Math.min(this.f42719d, sVar.f42719d));
    }

    public final boolean K() {
        return this.f42716a >= this.f42718c || this.f42717b >= this.f42719d;
    }

    public final boolean M(@NotNull s sVar) {
        return this.f42718c > sVar.f42716a && sVar.f42718c > this.f42716a && this.f42719d > sVar.f42717b && sVar.f42719d > this.f42717b;
    }

    @k7
    @NotNull
    public final s N(int i10, int i11) {
        return new s(this.f42716a + i10, this.f42717b + i11, this.f42718c + i10, this.f42719d + i11);
    }

    @k7
    @NotNull
    public final s O(long j10) {
        return new s(this.f42716a + q.n(j10), this.f42717b + q.p(j10), this.f42718c + q.n(j10), this.f42719d + q.p(j10));
    }

    public final int b() {
        return this.f42716a;
    }

    public final int c() {
        return this.f42717b;
    }

    public final int d() {
        return this.f42718c;
    }

    public final int e() {
        return this.f42719d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f42716a == sVar.f42716a && this.f42717b == sVar.f42717b && this.f42718c == sVar.f42718c && this.f42719d == sVar.f42719d;
    }

    public final boolean f(long j10) {
        return q.n(j10) >= this.f42716a && q.n(j10) < this.f42718c && q.p(j10) >= this.f42717b && q.p(j10) < this.f42719d;
    }

    @NotNull
    public final s g(int i10, int i11, int i12, int i13) {
        return new s(i10, i11, i12, i13);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f42716a) * 31) + Integer.hashCode(this.f42717b)) * 31) + Integer.hashCode(this.f42718c)) * 31) + Integer.hashCode(this.f42719d);
    }

    @k7
    @NotNull
    public final s i(int i10) {
        return I(-i10);
    }

    public final int j() {
        return this.f42719d;
    }

    public final long l() {
        return q.f((((long) (this.f42716a + (G() / 2))) << 32) | (((long) this.f42719d) & k0.f265952a));
    }

    public final long m() {
        return q.f((((long) this.f42716a) << 32) | (((long) this.f42719d) & k0.f265952a));
    }

    public final long n() {
        return q.f((((long) this.f42718c) << 32) | (((long) this.f42719d) & k0.f265952a));
    }

    public final long o() {
        return q.f((((long) (this.f42717b + (r() / 2))) & k0.f265952a) | (((long) (this.f42716a + (G() / 2))) << 32));
    }

    public final long p() {
        return q.f((((long) (this.f42717b + (r() / 2))) & k0.f265952a) | (((long) this.f42716a) << 32));
    }

    public final long q() {
        return q.f((((long) (this.f42717b + (r() / 2))) & k0.f265952a) | (((long) this.f42718c) << 32));
    }

    public final int r() {
        return this.f42719d - this.f42717b;
    }

    public final int t() {
        return this.f42716a;
    }

    @NotNull
    public String toString() {
        return "IntRect.fromLTRB(" + this.f42716a + ", " + this.f42717b + ", " + this.f42718c + ", " + this.f42719d + ')';
    }

    public final int v() {
        return Math.max(Math.abs(G()), Math.abs(r()));
    }

    public final int w() {
        return Math.min(Math.abs(G()), Math.abs(r()));
    }

    public final int x() {
        return this.f42718c;
    }

    public final long z() {
        return u.e((((long) G()) << 32) | (((long) r()) & k0.f265952a));
    }
}
