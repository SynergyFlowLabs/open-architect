package kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
public final class c0 implements Comparable<c0> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f312396f = 255;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f312398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f312399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f312400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f312401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f312395e = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final c0 f312397g = d0.a();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c0(int i10, int i11, int i12) {
        this.f312398a = i10;
        this.f312399b = i11;
        this.f312400c = i12;
        this.f312401d = q(i10, i11, i12);
    }

    private final int q(int i10, int i11, int i12) {
        if (i10 >= 0 && i10 < 256 && i11 >= 0 && i11 < 256 && i12 >= 0 && i12 < 256) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull c0 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f312401d - other.f312401d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        c0 c0Var = obj instanceof c0 ? (c0) obj : null;
        return c0Var != null && this.f312401d == c0Var.f312401d;
    }

    public int hashCode() {
        return this.f312401d;
    }

    public final int k() {
        return this.f312398a;
    }

    public final int l() {
        return this.f312399b;
    }

    public final int n() {
        return this.f312400c;
    }

    public final boolean o(int i10, int i11) {
        int i12 = this.f312398a;
        if (i12 <= i10) {
            return i12 == i10 && this.f312399b >= i11;
        }
        return true;
    }

    public final boolean p(int i10, int i11, int i12) {
        int i13 = this.f312398a;
        if (i13 <= i10) {
            if (i13 != i10) {
                return false;
            }
            int i14 = this.f312399b;
            if (i14 <= i11 && (i14 != i11 || this.f312400c < i12)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f312398a);
        sb2.append('.');
        sb2.append(this.f312399b);
        sb2.append('.');
        sb2.append(this.f312400c);
        return sb2.toString();
    }

    public c0(int i10, int i11) {
        this(i10, i11, 0);
    }
}
