package okhttp3.internal.http2;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f334264d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final o f334265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f334266f = ":status";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f334267g = ":method";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f334268h = ":path";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f334269i = ":scheme";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final String f334270j = ":authority";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final o f334271k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final o f334272l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final o f334273m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final o f334274n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final o f334275o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public final o f334276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public final o f334277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    public final int f334278c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        o.a aVar = o.f335046d;
        f334265e = aVar.l(":");
        f334271k = aVar.l(f334266f);
        f334272l = aVar.l(f334267g);
        f334273m = aVar.l(f334268h);
        f334274n = aVar.l(f334269i);
        f334275o = aVar.l(f334270j);
    }

    public c(@NotNull o name, @NotNull o value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f334276a = name;
        this.f334277b = value;
        this.f334278c = name.v0() + 32 + value.v0();
    }

    public static /* synthetic */ c d(c cVar, o oVar, o oVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            oVar = cVar.f334276a;
        }
        if ((i10 & 2) != 0) {
            oVar2 = cVar.f334277b;
        }
        return cVar.c(oVar, oVar2);
    }

    @NotNull
    public final o a() {
        return this.f334276a;
    }

    @NotNull
    public final o b() {
        return this.f334277b;
    }

    @NotNull
    public final c c(@NotNull o name, @NotNull o value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return new c(name, value);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f334276a, cVar.f334276a) && Intrinsics.areEqual(this.f334277b, cVar.f334277b);
    }

    public int hashCode() {
        return (this.f334276a.hashCode() * 31) + this.f334277b.hashCode();
    }

    @NotNull
    public String toString() {
        return this.f334276a.G0() + ": " + this.f334277b.G0();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        o.a aVar = o.f335046d;
        this(aVar.l(name), aVar.l(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@NotNull o name, @NotNull String value) {
        this(name, o.f335046d.l(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
    }
}
