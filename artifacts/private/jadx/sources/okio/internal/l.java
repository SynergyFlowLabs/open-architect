package okio.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final r0 f334966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f334967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f334968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f334969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f334970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f334971f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f334972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f334973h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f334974i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f334975j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private final Long f334976k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private final Long f334977l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private final Long f334978m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private final Integer f334979n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private final Integer f334980o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    private final Integer f334981p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final List<r0> f334982q;

    public l(@NotNull r0 canonicalPath, boolean z10, @NotNull String comment, long j10, long j11, long j12, int i10, long j13, int i11, int i12, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        Intrinsics.checkNotNullParameter(canonicalPath, "canonicalPath");
        Intrinsics.checkNotNullParameter(comment, "comment");
        this.f334966a = canonicalPath;
        this.f334967b = z10;
        this.f334968c = comment;
        this.f334969d = j10;
        this.f334970e = j11;
        this.f334971f = j12;
        this.f334972g = i10;
        this.f334973h = j13;
        this.f334974i = i11;
        this.f334975j = i12;
        this.f334976k = l10;
        this.f334977l = l11;
        this.f334978m = l12;
        this.f334979n = num;
        this.f334980o = num2;
        this.f334981p = num3;
        this.f334982q = new ArrayList();
    }

    @NotNull
    public final l a(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        return new l(this.f334966a, this.f334967b, this.f334968c, this.f334969d, this.f334970e, this.f334971f, this.f334972g, this.f334973h, this.f334974i, this.f334975j, this.f334976k, this.f334977l, this.f334978m, num, num2, num3);
    }

    @NotNull
    public final r0 b() {
        return this.f334966a;
    }

    @NotNull
    public final List<r0> c() {
        return this.f334982q;
    }

    @NotNull
    public final String d() {
        return this.f334968c;
    }

    public final long e() {
        return this.f334970e;
    }

    public final int f() {
        return this.f334972g;
    }

    public final long g() {
        return this.f334969d;
    }

    @Nullable
    public final Long h() {
        Long l10 = this.f334978m;
        if (l10 != null) {
            return Long.valueOf(m.d(l10.longValue()));
        }
        Integer num = this.f334981p;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        return null;
    }

    public final int i() {
        return this.f334974i;
    }

    public final int j() {
        return this.f334975j;
    }

    @Nullable
    public final Integer k() {
        return this.f334981p;
    }

    @Nullable
    public final Integer l() {
        return this.f334980o;
    }

    @Nullable
    public final Integer m() {
        return this.f334979n;
    }

    @Nullable
    public final Long n() {
        Long l10 = this.f334977l;
        if (l10 != null) {
            return Long.valueOf(m.d(l10.longValue()));
        }
        Integer num = this.f334980o;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        return null;
    }

    @Nullable
    public final Long o() {
        Long l10 = this.f334976k;
        if (l10 != null) {
            return Long.valueOf(m.d(l10.longValue()));
        }
        Integer num = this.f334979n;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        int i10 = this.f334975j;
        if (i10 != -1) {
            return m.c(this.f334974i, i10);
        }
        return null;
    }

    @Nullable
    public final Long p() {
        return this.f334978m;
    }

    @Nullable
    public final Long q() {
        return this.f334977l;
    }

    @Nullable
    public final Long r() {
        return this.f334976k;
    }

    public final long s() {
        return this.f334973h;
    }

    public final long t() {
        return this.f334971f;
    }

    public final boolean u() {
        return this.f334967b;
    }

    public /* synthetic */ l(r0 r0Var, boolean z10, String str, long j10, long j11, long j12, int i10, long j13, int i11, int i12, Long l10, Long l11, Long l12, Integer num, Integer num2, Integer num3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(r0Var, (i13 & 2) != 0 ? false : z10, (i13 & 4) != 0 ? "" : str, (i13 & 8) != 0 ? -1L : j10, (i13 & 16) != 0 ? -1L : j11, (i13 & 32) != 0 ? -1L : j12, (i13 & 64) != 0 ? -1 : i10, (i13 & 128) == 0 ? j13 : -1L, (i13 & 256) != 0 ? -1 : i11, (i13 & 512) == 0 ? i12 : -1, (i13 & 1024) != 0 ? null : l10, (i13 & 2048) != 0 ? null : l11, (i13 & 4096) != 0 ? null : l12, (i13 & 8192) != 0 ? null : num, (i13 & 16384) != 0 ? null : num2, (i13 & 32768) != 0 ? null : num3);
    }
}
