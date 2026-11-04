package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.l2;
import androidx.compose.ui.graphics.u3;
import androidx.compose.ui.graphics.v3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f37746g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f37747h = 4.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f37750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f37751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f37752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f37753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final l2 f37754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f37745f = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f37748i = u3.f38256b.a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f37749j = v3.f38275b.b();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return n.f37748i;
        }

        public final int b() {
            return n.f37749j;
        }

        private a() {
        }
    }

    static {
        int i10 = 3 | 0;
    }

    public /* synthetic */ n(float f10, float f11, int i10, int i11, l2 l2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, i10, i11, l2Var);
    }

    public final int c() {
        return this.f37752c;
    }

    public final int d() {
        return this.f37753d;
    }

    public final float e() {
        return this.f37751b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f37750a == nVar.f37750a && this.f37751b == nVar.f37751b && u3.g(this.f37752c, nVar.f37752c) && v3.g(this.f37753d, nVar.f37753d) && Intrinsics.areEqual(this.f37754e, nVar.f37754e);
    }

    @Nullable
    public final l2 f() {
        return this.f37754e;
    }

    public final float g() {
        return this.f37750a;
    }

    public int hashCode() {
        int iHashCode = ((((((Float.hashCode(this.f37750a) * 31) + Float.hashCode(this.f37751b)) * 31) + u3.h(this.f37752c)) * 31) + v3.h(this.f37753d)) * 31;
        l2 l2Var = this.f37754e;
        return iHashCode + (l2Var != null ? l2Var.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Stroke(width=" + this.f37750a + ", miter=" + this.f37751b + ", cap=" + ((Object) u3.i(this.f37752c)) + ", join=" + ((Object) v3.i(this.f37753d)) + ", pathEffect=" + this.f37754e + ')';
    }

    public /* synthetic */ n(float f10, float f11, int i10, int i11, l2 l2Var, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0.0f : f10, (i12 & 2) != 0 ? 4.0f : f11, (i12 & 4) != 0 ? f37748i : i10, (i12 & 8) != 0 ? f37749j : i11, (i12 & 16) != 0 ? null : l2Var, null);
    }

    private n(float f10, float f11, int i10, int i11, l2 l2Var) {
        super(null);
        this.f37750a = f10;
        this.f37751b = f11;
        this.f37752c = i10;
        this.f37753d = i11;
        this.f37754e = l2Var;
    }
}
