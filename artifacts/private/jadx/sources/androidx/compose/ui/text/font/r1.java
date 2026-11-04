package androidx.compose.ui.text.font;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class r1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f41705f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final y f41706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final v0 f41707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f41708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f41709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final Object f41710e;

    public /* synthetic */ r1(y yVar, v0 v0Var, int i10, int i11, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(yVar, v0Var, i10, i11, obj);
    }

    public static /* synthetic */ r1 g(r1 r1Var, y yVar, v0 v0Var, int i10, int i11, Object obj, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            yVar = r1Var.f41706a;
        }
        if ((i12 & 2) != 0) {
            v0Var = r1Var.f41707b;
        }
        if ((i12 & 4) != 0) {
            i10 = r1Var.f41708c;
        }
        if ((i12 & 8) != 0) {
            i11 = r1Var.f41709d;
        }
        if ((i12 & 16) != 0) {
            obj = r1Var.f41710e;
        }
        Object obj3 = obj;
        int i13 = i10;
        return r1Var.f(yVar, v0Var, i13, i11, obj3);
    }

    @Nullable
    public final y a() {
        return this.f41706a;
    }

    @NotNull
    public final v0 b() {
        return this.f41707b;
    }

    public final int c() {
        return this.f41708c;
    }

    public final int d() {
        return this.f41709d;
    }

    @Nullable
    public final Object e() {
        return this.f41710e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return Intrinsics.areEqual(this.f41706a, r1Var.f41706a) && Intrinsics.areEqual(this.f41707b, r1Var.f41707b) && q0.f(this.f41708c, r1Var.f41708c) && r0.h(this.f41709d, r1Var.f41709d) && Intrinsics.areEqual(this.f41710e, r1Var.f41710e);
    }

    @NotNull
    public final r1 f(@Nullable y yVar, @NotNull v0 v0Var, int i10, int i11, @Nullable Object obj) {
        return new r1(yVar, v0Var, i10, i11, obj, null);
    }

    @Nullable
    public final y h() {
        return this.f41706a;
    }

    public int hashCode() {
        y yVar = this.f41706a;
        int iHashCode = 0;
        int iHashCode2 = (((((((yVar == null ? 0 : yVar.hashCode()) * 31) + this.f41707b.hashCode()) * 31) + q0.h(this.f41708c)) * 31) + r0.i(this.f41709d)) * 31;
        Object obj = this.f41710e;
        if (obj != null) {
            iHashCode = obj.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    public final int i() {
        return this.f41708c;
    }

    public final int j() {
        return this.f41709d;
    }

    @NotNull
    public final v0 k() {
        return this.f41707b;
    }

    @Nullable
    public final Object l() {
        return this.f41710e;
    }

    @NotNull
    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.f41706a + ", fontWeight=" + this.f41707b + ", fontStyle=" + ((Object) q0.i(this.f41708c)) + ", fontSynthesis=" + ((Object) r0.l(this.f41709d)) + ", resourceLoaderCacheKey=" + this.f41710e + ')';
    }

    private r1(y yVar, v0 v0Var, int i10, int i11, Object obj) {
        this.f41706a = yVar;
        this.f41707b = v0Var;
        this.f41708c = i10;
        this.f41709d = i11;
        this.f41710e = obj;
    }
}
