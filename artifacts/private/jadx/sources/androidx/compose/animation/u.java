package androidx.compose.animation;

import androidx.compose.runtime.o2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@o2
public final class u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f13739e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.e f13740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u> f13741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.y0<androidx.compose.ui.unit.u> f13742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f13743d;

    @SourceDebugExtension({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/ChangeSize$1\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1274:1\n30#2:1275\n80#3:1276\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/ChangeSize$1\n*L\n805#1:1275\n805#1:1276\n*E\n"})
    static final class a extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f13744a = new a();

        a() {
            super(1);
        }

        public final long c(long j10) {
            long j11 = 0;
            return androidx.compose.ui.unit.u.e((j11 & com.rabbitmq.client.k0.f265952a) | (j11 << 32));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.u invoke(androidx.compose.ui.unit.u uVar) {
            return androidx.compose.ui.unit.u.b(c(uVar.q()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u(@NotNull androidx.compose.ui.e eVar, @NotNull Function1<? super androidx.compose.ui.unit.u, androidx.compose.ui.unit.u> function1, @NotNull androidx.compose.animation.core.y0<androidx.compose.ui.unit.u> y0Var, boolean z10) {
        this.f13740a = eVar;
        this.f13741b = function1;
        this.f13742c = y0Var;
        this.f13743d = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ u f(u uVar, androidx.compose.ui.e eVar, Function1 function1, androidx.compose.animation.core.y0 y0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eVar = uVar.f13740a;
        }
        if ((i10 & 2) != 0) {
            function1 = uVar.f13741b;
        }
        if ((i10 & 4) != 0) {
            y0Var = uVar.f13742c;
        }
        if ((i10 & 8) != 0) {
            z10 = uVar.f13743d;
        }
        return uVar.e(eVar, function1, y0Var, z10);
    }

    @NotNull
    public final androidx.compose.ui.e a() {
        return this.f13740a;
    }

    @NotNull
    public final Function1<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u> b() {
        return this.f13741b;
    }

    @NotNull
    public final androidx.compose.animation.core.y0<androidx.compose.ui.unit.u> c() {
        return this.f13742c;
    }

    public final boolean d() {
        return this.f13743d;
    }

    @NotNull
    public final u e(@NotNull androidx.compose.ui.e eVar, @NotNull Function1<? super androidx.compose.ui.unit.u, androidx.compose.ui.unit.u> function1, @NotNull androidx.compose.animation.core.y0<androidx.compose.ui.unit.u> y0Var, boolean z10) {
        return new u(eVar, function1, y0Var, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.areEqual(this.f13740a, uVar.f13740a) && Intrinsics.areEqual(this.f13741b, uVar.f13741b) && Intrinsics.areEqual(this.f13742c, uVar.f13742c) && this.f13743d == uVar.f13743d;
    }

    @NotNull
    public final androidx.compose.ui.e g() {
        return this.f13740a;
    }

    @NotNull
    public final androidx.compose.animation.core.y0<androidx.compose.ui.unit.u> h() {
        return this.f13742c;
    }

    public int hashCode() {
        return (((((this.f13740a.hashCode() * 31) + this.f13741b.hashCode()) * 31) + this.f13742c.hashCode()) * 31) + Boolean.hashCode(this.f13743d);
    }

    public final boolean i() {
        return this.f13743d;
    }

    @NotNull
    public final Function1<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u> j() {
        return this.f13741b;
    }

    @NotNull
    public String toString() {
        return "ChangeSize(alignment=" + this.f13740a + ", size=" + this.f13741b + ", animationSpec=" + this.f13742c + ", clip=" + this.f13743d + ')';
    }

    public /* synthetic */ u(androidx.compose.ui.e eVar, Function1 function1, androidx.compose.animation.core.y0 y0Var, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, (i10 & 2) != 0 ? a.f13744a : function1, y0Var, (i10 & 8) != 0 ? true : z10);
    }
}
