package androidx.compose.ui.node;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nTouchBoundsExpansion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchBoundsExpansion.kt\nandroidx/compose/ui/node/DpTouchBoundsExpansion\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,249:1\n103#2,4:250\n103#2,4:254\n103#2,4:258\n103#2,4:262\n*S KotlinDebug\n*F\n+ 1 TouchBoundsExpansion.kt\nandroidx/compose/ui/node/DpTouchBoundsExpansion\n*L\n165#1:250,4\n166#1:254,4\n167#1:258,4\n168#1:262,4\n*E\n"})
public final class s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f39985f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f39986g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f39987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f39988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f39989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f39990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f39991e;

    @SourceDebugExtension({"SMAP\nTouchBoundsExpansion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchBoundsExpansion.kt\nandroidx/compose/ui/node/DpTouchBoundsExpansion$Companion\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,249:1\n113#2:250\n113#2:251\n113#2:252\n113#2:253\n*S KotlinDebug\n*F\n+ 1 TouchBoundsExpansion.kt\nandroidx/compose/ui/node/DpTouchBoundsExpansion$Companion\n*L\n192#1:250\n193#1:251\n194#1:252\n195#1:253\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ s b(a aVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = androidx.compose.ui.unit.h.r(0);
            }
            if ((i10 & 2) != 0) {
                f11 = androidx.compose.ui.unit.h.r(0);
            }
            if ((i10 & 4) != 0) {
                f12 = androidx.compose.ui.unit.h.r(0);
            }
            if ((i10 & 8) != 0) {
                f13 = androidx.compose.ui.unit.h.r(0);
            }
            return aVar.a(f10, f11, f12, f13);
        }

        @NotNull
        public final s a(float f10, float f11, float f12, float f13) {
            return new s(f10, f11, f12, f13, false, null);
        }

        private a() {
        }
    }

    public /* synthetic */ s(float f10, float f11, float f12, float f13, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, z10);
    }

    public static /* synthetic */ s g(s sVar, float f10, float f11, float f12, float f13, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = sVar.f39987a;
        }
        if ((i10 & 2) != 0) {
            f11 = sVar.f39988b;
        }
        if ((i10 & 4) != 0) {
            f12 = sVar.f39989c;
        }
        if ((i10 & 8) != 0) {
            f13 = sVar.f39990d;
        }
        if ((i10 & 16) != 0) {
            z10 = sVar.f39991e;
        }
        boolean z11 = z10;
        float f14 = f12;
        return sVar.f(f10, f11, f14, f13, z11);
    }

    public final float a() {
        return this.f39987a;
    }

    public final float b() {
        return this.f39988b;
    }

    public final float c() {
        return this.f39989c;
    }

    public final float d() {
        return this.f39990d;
    }

    public final boolean e() {
        return this.f39991e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return androidx.compose.ui.unit.h.x(this.f39987a, sVar.f39987a) && androidx.compose.ui.unit.h.x(this.f39988b, sVar.f39988b) && androidx.compose.ui.unit.h.x(this.f39989c, sVar.f39989c) && androidx.compose.ui.unit.h.x(this.f39990d, sVar.f39990d) && this.f39991e == sVar.f39991e;
    }

    @NotNull
    public final s f(float f10, float f11, float f12, float f13, boolean z10) {
        return new s(f10, f11, f12, f13, z10, null);
    }

    public final float h() {
        return this.f39990d;
    }

    public int hashCode() {
        return (((((((androidx.compose.ui.unit.h.D(this.f39987a) * 31) + androidx.compose.ui.unit.h.D(this.f39988b)) * 31) + androidx.compose.ui.unit.h.D(this.f39989c)) * 31) + androidx.compose.ui.unit.h.D(this.f39990d)) * 31) + Boolean.hashCode(this.f39991e);
    }

    public final float i() {
        return this.f39989c;
    }

    public final float j() {
        return this.f39987a;
    }

    public final float k() {
        return this.f39988b;
    }

    public final boolean l() {
        return this.f39991e;
    }

    public final long m(@NotNull androidx.compose.ui.unit.d dVar) {
        return n2.e(n2.f39928b.e(dVar.g6(this.f39987a), dVar.g6(this.f39988b), dVar.g6(this.f39989c), dVar.g6(this.f39990d), this.f39991e));
    }

    @NotNull
    public String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) androidx.compose.ui.unit.h.M(this.f39987a)) + ", top=" + ((Object) androidx.compose.ui.unit.h.M(this.f39988b)) + ", end=" + ((Object) androidx.compose.ui.unit.h.M(this.f39989c)) + ", bottom=" + ((Object) androidx.compose.ui.unit.h.M(this.f39990d)) + ", isLayoutDirectionAware=" + this.f39991e + ')';
    }

    private s(float f10, float f11, float f12, float f13, boolean z10) {
        this.f39987a = f10;
        this.f39988b = f11;
        this.f39989c = f12;
        this.f39990d = f13;
        this.f39991e = z10;
        if (!(f10 >= 0.0f)) {
            s0.a.g("Left must be non-negative");
        }
        if (!(f11 >= 0.0f)) {
            s0.a.g("Top must be non-negative");
        }
        if (!(f12 >= 0.0f)) {
            s0.a.g("Right must be non-negative");
        }
        if (f13 >= 0.0f) {
            return;
        }
        s0.a.g("Bottom must be non-negative");
    }
}
