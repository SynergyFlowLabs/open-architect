package okhttp3.internal.http2;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f334485c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f334486d = 65535;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f334487e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f334488f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f334489g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f334490h = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f334491i = 6;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f334492j = 7;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f334493k = 10;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f334494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final int[] f334495b = new int[10];

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final void a() {
        this.f334494a = 0;
        ArraysKt.fill$default(this.f334495b, 0, 0, 0, 6, (Object) null);
    }

    public final int b(int i10) {
        return this.f334495b[i10];
    }

    public final boolean c(boolean z10) {
        if ((this.f334494a & 4) != 0) {
            return this.f334495b[2] == 1;
        }
        return z10;
    }

    public final int d() {
        if ((this.f334494a & 2) != 0) {
            return this.f334495b[1];
        }
        return -1;
    }

    public final int e() {
        if ((this.f334494a & 128) != 0) {
            return this.f334495b[7];
        }
        return 65535;
    }

    public final int f() {
        if ((this.f334494a & 16) != 0) {
            return this.f334495b[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int g(int i10) {
        return (this.f334494a & 32) != 0 ? this.f334495b[5] : i10;
    }

    public final int h(int i10) {
        return (this.f334494a & 64) != 0 ? this.f334495b[6] : i10;
    }

    public final boolean i(int i10) {
        return (this.f334494a & (1 << i10)) != 0;
    }

    public final void j(@NotNull m other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i10 = 0; i10 < 10; i10++) {
            if (other.i(i10)) {
                k(i10, other.b(i10));
            }
        }
    }

    @NotNull
    public final m k(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f334495b;
            if (i10 < iArr.length) {
                this.f334494a = (1 << i10) | this.f334494a;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    public final int l() {
        return Integer.bitCount(this.f334494a);
    }
}
