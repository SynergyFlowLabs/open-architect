package androidx.compose.foundation.text;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/HorizontalScrollLayoutModifier\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,393:1\n26#2:394\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/HorizontalScrollLayoutModifier\n*L\n229#1:394\n*E\n"})
final class o3 implements androidx.compose.ui.layout.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final s6 f20748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.input.h1 f20750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function0<y6> f20751d;

    public o3(@NotNull s6 s6Var, int i10, @NotNull androidx.compose.ui.text.input.h1 h1Var, @NotNull Function0<y6> function0) {
        this.f20748a = s6Var;
        this.f20749b = i10;
        this.f20750c = h1Var;
        this.f20751d = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ o3 h(o3 o3Var, s6 s6Var, int i10, androidx.compose.ui.text.input.h1 h1Var, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            s6Var = o3Var.f20748a;
        }
        if ((i11 & 2) != 0) {
            i10 = o3Var.f20749b;
        }
        if ((i11 & 4) != 0) {
            h1Var = o3Var.f20750c;
        }
        if ((i11 & 8) != 0) {
            function0 = o3Var.f20751d;
        }
        return o3Var.g(s6Var, i10, h1Var, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(o3 o3Var, androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.i2 i2Var, int i10, androidx.compose.ui.layout.i2.a aVar) {
        int i11 = o3Var.f20749b;
        androidx.compose.ui.text.input.h1 h1Var = o3Var.f20750c;
        y6 y6VarInvoke = o3Var.f20751d.invoke();
        o3Var.f20748a.r(androidx.compose.foundation.gestures.q3.Horizontal, l6.c(aVar, i11, h1Var, y6VarInvoke != null ? y6VarInvoke.i() : null, c1Var.getLayoutDirection() == androidx.compose.ui.unit.w.Rtl, i2Var.h1()), i10, i2Var.h1());
        int i12 = 4 | 4;
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, Math.round(-o3Var.f20748a.h()), 0, 0.0f, 4, null);
        return Unit.f312394a;
    }

    @NotNull
    public final s6 b() {
        return this.f20748a;
    }

    @Override // androidx.compose.ui.layout.o0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull final androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        long j11;
        if (z0Var.M0(androidx.compose.ui.unit.b.o(j10)) < androidx.compose.ui.unit.b.p(j10)) {
            j11 = j10;
        } else {
            j11 = j10;
            j10 = androidx.compose.ui.unit.b.d(j11, 0, Integer.MAX_VALUE, 0, 0, 13, null);
        }
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(j10);
        final int iMin = Math.min(i2VarP0.h1(), androidx.compose.ui.unit.b.p(j11));
        return androidx.compose.ui.layout.c1.h6(c1Var, iMin, i2VarP0.c1(), null, new Function1() { // from class: androidx.compose.foundation.text.n3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o3.m(this.f20709a, c1Var, i2VarP0, iMin, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    public final int d() {
        return this.f20749b;
    }

    @NotNull
    public final androidx.compose.ui.text.input.h1 e() {
        return this.f20750c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj;
        return Intrinsics.areEqual(this.f20748a, o3Var.f20748a) && this.f20749b == o3Var.f20749b && Intrinsics.areEqual(this.f20750c, o3Var.f20750c) && Intrinsics.areEqual(this.f20751d, o3Var.f20751d);
    }

    @NotNull
    public final Function0<y6> f() {
        return this.f20751d;
    }

    @NotNull
    public final o3 g(@NotNull s6 s6Var, int i10, @NotNull androidx.compose.ui.text.input.h1 h1Var, @NotNull Function0<y6> function0) {
        return new o3(s6Var, i10, h1Var, function0);
    }

    public int hashCode() {
        return (((((this.f20748a.hashCode() * 31) + Integer.hashCode(this.f20749b)) * 31) + this.f20750c.hashCode()) * 31) + this.f20751d.hashCode();
    }

    public final int i() {
        return this.f20749b;
    }

    @NotNull
    public final s6 j() {
        return this.f20748a;
    }

    @NotNull
    public final Function0<y6> k() {
        return this.f20751d;
    }

    @NotNull
    public final androidx.compose.ui.text.input.h1 l() {
        return this.f20750c;
    }

    @NotNull
    public String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f20748a + ", cursorOffset=" + this.f20749b + ", transformedText=" + this.f20750c + ", textLayoutResultProvider=" + this.f20751d + ')';
    }
}
