package androidx.compose.foundation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class MagnifierElement extends androidx.compose.ui.node.e1<f3> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f13874m = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.unit.d, n0.g> f13875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Function1<androidx.compose.ui.unit.d, n0.g> f13876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final Function1<androidx.compose.ui.unit.l, Unit> f13877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f13878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f13879g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f13880h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f13881i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f13882j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f13883k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final d4 f13884l;

    public /* synthetic */ MagnifierElement(Function1 function1, Function1 function2, Function1 function3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, d4 d4Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, function2, function3, f10, z10, j10, f11, f12, z11, d4Var);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagnifierElement)) {
            return false;
        }
        MagnifierElement magnifierElement = (MagnifierElement) obj;
        return this.f13875c == magnifierElement.f13875c && this.f13876d == magnifierElement.f13876d && this.f13878f == magnifierElement.f13878f && this.f13879g == magnifierElement.f13879g && androidx.compose.ui.unit.l.l(this.f13880h, magnifierElement.f13880h) && androidx.compose.ui.unit.h.x(this.f13881i, magnifierElement.f13881i) && androidx.compose.ui.unit.h.x(this.f13882j, magnifierElement.f13882j) && this.f13883k == magnifierElement.f13883k && this.f13877e == magnifierElement.f13877e && Intrinsics.areEqual(this.f13884l, magnifierElement.f13884l);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        int iHashCode = this.f13875c.hashCode() * 31;
        Function1<androidx.compose.ui.unit.d, n0.g> function1 = this.f13876d;
        int iHashCode2 = (((((((((((((iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31) + Float.hashCode(this.f13878f)) * 31) + Boolean.hashCode(this.f13879g)) * 31) + androidx.compose.ui.unit.l.r(this.f13880h)) * 31) + androidx.compose.ui.unit.h.D(this.f13881i)) * 31) + androidx.compose.ui.unit.h.D(this.f13882j)) * 31) + Boolean.hashCode(this.f13883k)) * 31;
        Function1<androidx.compose.ui.unit.l, Unit> function2 = this.f13877e;
        return ((iHashCode2 + (function2 != null ? function2.hashCode() : 0)) * 31) + this.f13884l.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("magnifier");
        t2Var.b().c("sourceCenter", this.f13875c);
        t2Var.b().c("magnifierCenter", this.f13876d);
        t2Var.b().c("zoom", Float.valueOf(this.f13878f));
        t2Var.b().c("size", androidx.compose.ui.unit.l.c(this.f13880h));
        t2Var.b().c("cornerRadius", androidx.compose.ui.unit.h.o(this.f13881i));
        t2Var.b().c("elevation", androidx.compose.ui.unit.h.o(this.f13882j));
        t2Var.b().c("clippingEnabled", Boolean.valueOf(this.f13883k));
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public f3 a() {
        return new f3(this.f13875c, this.f13876d, this.f13877e, this.f13878f, this.f13879g, this.f13880h, this.f13881i, this.f13882j, this.f13883k, this.f13884l, null);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull f3 f3Var) {
        f3Var.aa(this.f13875c, this.f13876d, this.f13878f, this.f13879g, this.f13880h, this.f13881i, this.f13882j, this.f13883k, this.f13877e, this.f13884l);
    }

    public /* synthetic */ MagnifierElement(Function1 function1, Function1 function2, Function1 function3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, d4 d4Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, (i10 & 2) != 0 ? null : function2, (i10 & 4) != 0 ? null : function3, (i10 & 8) != 0 ? Float.NaN : f10, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? androidx.compose.ui.unit.l.f42704b.a() : j10, (i10 & 64) != 0 ? androidx.compose.ui.unit.h.f42689b.e() : f11, (i10 & 128) != 0 ? androidx.compose.ui.unit.h.f42689b.e() : f12, (i10 & 256) != 0 ? true : z11, d4Var, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private MagnifierElement(Function1<? super androidx.compose.ui.unit.d, n0.g> function1, Function1<? super androidx.compose.ui.unit.d, n0.g> function2, Function1<? super androidx.compose.ui.unit.l, Unit> function3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, d4 d4Var) {
        this.f13875c = function1;
        this.f13876d = function2;
        this.f13877e = function3;
        this.f13878f = f10;
        this.f13879g = z10;
        this.f13880h = j10;
        this.f13881i = f11;
        this.f13882j = f12;
        this.f13883k = z11;
        this.f13884l = d4Var;
    }
}
