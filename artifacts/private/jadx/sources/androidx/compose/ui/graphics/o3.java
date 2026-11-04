package androidx.compose.ui.graphics;

import androidx.compose.runtime.k7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.o2
public final class o3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f38091d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final o3 f38092e = new o3(0, 0, 0.0f, 7, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f38093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f38094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f38095c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @k7
        public static /* synthetic */ void b() {
        }

        @NotNull
        public final o3 a() {
            return o3.f38092e;
        }

        private a() {
        }
    }

    public /* synthetic */ o3(long j10, long j11, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, f10);
    }

    public static /* synthetic */ o3 c(o3 o3Var, long j10, long j11, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = o3Var.f38093a;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            j11 = o3Var.f38094b;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            f10 = o3Var.f38095c;
        }
        return o3Var.b(j12, j13, f10);
    }

    @k7
    public static /* synthetic */ void e() {
    }

    @k7
    public static /* synthetic */ void g() {
    }

    @k7
    public static /* synthetic */ void i() {
    }

    @NotNull
    public final o3 b(long j10, long j11, float f10) {
        return new o3(j10, j11, f10, null);
    }

    public final float d() {
        return this.f38095c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj;
        return q0.y(this.f38093a, o3Var.f38093a) && n0.g.l(this.f38094b, o3Var.f38094b) && this.f38095c == o3Var.f38095c;
    }

    public final long f() {
        return this.f38093a;
    }

    public final long h() {
        return this.f38094b;
    }

    public int hashCode() {
        return (((q0.K(this.f38093a) * 31) + n0.g.t(this.f38094b)) * 31) + Float.hashCode(this.f38095c);
    }

    @NotNull
    public String toString() {
        return "Shadow(color=" + ((Object) q0.L(this.f38093a)) + ", offset=" + ((Object) n0.g.z(this.f38094b)) + ", blurRadius=" + this.f38095c + ')';
    }

    private o3(long j10, long j11, float f10) {
        this.f38093a = j10;
        this.f38094b = j11;
        this.f38095c = f10;
    }

    public /* synthetic */ o3(long j10, long j11, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? s0.d(4278190080L) : j10, (i10 & 2) != 0 ? n0.g.f332700b.e() : j11, (i10 & 4) != 0 ? 0.0f : f10, null);
    }
}
