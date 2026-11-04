package androidx.compose.foundation.text.selection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class p1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f21314l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f21315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f21316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.layout.g0 f21317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f21318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final h0 f21319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Comparator<Long> f21320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.collection.x1 f21321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final List<f0> f21322h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f21323i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f21324j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f21325k;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21326a;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.BEFORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.AFTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f21326a = iArr;
        }
    }

    public /* synthetic */ p1(long j10, long j11, androidx.compose.ui.layout.g0 g0Var, boolean z10, h0 h0Var, Comparator comparator, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, g0Var, z10, h0Var, comparator);
    }

    private final int i(int i10, n nVar, n nVar2) {
        if (i10 == -1) {
            int i11 = a.f21326a[r1.e(nVar, nVar2).ordinal()];
            if (i11 == 1) {
                return this.f21325k - 1;
            }
            if (i11 == 2) {
                return this.f21325k;
            }
            if (i11 != 3) {
                throw new kotlin.k0();
            }
        }
        return i10;
    }

    @NotNull
    public final f0 a(long j10, int i10, @NotNull n nVar, @NotNull n nVar2, int i11, @NotNull n nVar3, @NotNull n nVar4, int i12, @NotNull androidx.compose.ui.text.p3 p3Var) {
        this.f21325k += 2;
        f0 f0Var = new f0(j10, this.f21325k, i10, i11, i12, p3Var);
        this.f21323i = i(this.f21323i, nVar, nVar2);
        this.f21324j = i(this.f21324j, nVar3, nVar4);
        this.f21321g.k0(j10, this.f21322h.size());
        this.f21322h.add(f0Var);
        return f0Var;
    }

    @Nullable
    public final o1 b() {
        int i10 = this.f21325k + 1;
        int size = this.f21322h.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            f0 f0Var = (f0) CollectionsKt.single((List) this.f21322h);
            int i11 = this.f21323i;
            int i12 = i11 == -1 ? i10 : i11;
            int i13 = this.f21324j;
            return new o3(this.f21318d, i12, i13 == -1 ? i10 : i13, this.f21319e, f0Var);
        }
        androidx.collection.x1 x1Var = this.f21321g;
        List<f0> list = this.f21322h;
        int i14 = this.f21323i;
        int i15 = i14 == -1 ? i10 : i14;
        int i16 = this.f21324j;
        return new t(x1Var, list, i15, i16 == -1 ? i10 : i16, this.f21318d, this.f21319e);
    }

    @NotNull
    public final androidx.compose.ui.layout.g0 c() {
        return this.f21317c;
    }

    public final long d() {
        return this.f21315a;
    }

    public final long e() {
        return this.f21316b;
    }

    @Nullable
    public final h0 f() {
        return this.f21319e;
    }

    @NotNull
    public final Comparator<Long> g() {
        return this.f21320f;
    }

    public final boolean h() {
        return this.f21318d;
    }

    private p1(long j10, long j11, androidx.compose.ui.layout.g0 g0Var, boolean z10, h0 h0Var, Comparator<Long> comparator) {
        this.f21315a = j10;
        this.f21316b = j11;
        this.f21317c = g0Var;
        this.f21318d = z10;
        this.f21319e = h0Var;
        this.f21320f = comparator;
        this.f21321g = androidx.collection.r0.j();
        this.f21322h = new ArrayList();
        this.f21323i = -1;
        this.f21324j = -1;
        this.f21325k = -1;
    }
}
