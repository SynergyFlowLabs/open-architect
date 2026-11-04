package androidx.paging;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class w1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f72680g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f72681h = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f72682i = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    public final int f72683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    public final int f72684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    public final boolean f72685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    public final int f72686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oj.f
    public final int f72687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oj.f
    public final int f72688f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void a() {
        }

        private a() {
        }
    }

    static {
        int i10 = 3 | 0;
    }

    @oj.j
    public w1(int i10) {
        this(i10, 0, false, 0, 0, 0, 62, null);
    }

    @oj.j
    public w1(int i10, @androidx.annotation.g0(from = 0) int i11) {
        this(i10, i11, false, 0, 0, 0, 60, null);
    }

    @oj.j
    public w1(int i10, @androidx.annotation.g0(from = 0) int i11, boolean z10) {
        this(i10, i11, z10, 0, 0, 0, 56, null);
    }

    @oj.j
    public w1(int i10, @androidx.annotation.g0(from = 0) int i11, boolean z10, @androidx.annotation.g0(from = 1) int i12) {
        this(i10, i11, z10, i12, 0, 0, 48, null);
    }

    @oj.j
    public w1(int i10, @androidx.annotation.g0(from = 0) int i11, boolean z10, @androidx.annotation.g0(from = 1) int i12, @androidx.annotation.g0(from = 2) int i13) {
        this(i10, i11, z10, i12, i13, 0, 32, null);
    }

    @oj.j
    public w1(int i10, @androidx.annotation.g0(from = 0) int i11, boolean z10, @androidx.annotation.g0(from = 1) int i12, @androidx.annotation.g0(from = 2) int i13, int i14) {
        this.f72683a = i10;
        this.f72684b = i11;
        this.f72685c = z10;
        this.f72686d = i12;
        this.f72687e = i13;
        this.f72688f = i14;
        if (!z10 && i11 == 0) {
            throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in PagingData, so either placeholders must be enabled, or prefetch distance must be > 0.");
        }
        if (i13 != Integer.MAX_VALUE && i13 < (i11 * 2) + i10) {
            throw new IllegalArgumentException("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=" + i10 + ", prefetchDist=" + i11 + ", maxSize=" + i13);
        }
        if (i14 != Integer.MIN_VALUE && i14 <= 0) {
            throw new IllegalArgumentException("jumpThreshold must be positive to enable jumps or COUNT_UNDEFINED to disable jumping.");
        }
    }

    public /* synthetic */ w1(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i15 & 2) != 0 ? i10 : i11, (i15 & 4) != 0 ? true : z10, (i15 & 8) != 0 ? i10 * 3 : i12, (i15 & 16) != 0 ? Integer.MAX_VALUE : i13, (i15 & 32) != 0 ? Integer.MIN_VALUE : i14);
    }
}
