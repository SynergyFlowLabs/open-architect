package androidx.compose.foundation.text;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/VerticalScrollLayoutModifier\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,393:1\n26#2:394\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/VerticalScrollLayoutModifier\n*L\n183#1:394\n*E\n"})
final class d8 implements androidx.compose.ui.layout.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final s6 f19173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f19174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.input.h1 f19175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function0<y6> f19176d;

    public d8(@NotNull s6 s6Var, int i10, @NotNull androidx.compose.ui.text.input.h1 h1Var, @NotNull Function0<y6> function0) {
        this.f19173a = s6Var;
        this.f19174b = i10;
        this.f19175c = h1Var;
        this.f19176d = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ d8 h(d8 d8Var, s6 s6Var, int i10, androidx.compose.ui.text.input.h1 h1Var, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            s6Var = d8Var.f19173a;
        }
        if ((i11 & 2) != 0) {
            i10 = d8Var.f19174b;
        }
        if ((i11 & 4) != 0) {
            h1Var = d8Var.f19175c;
        }
        if ((i11 & 8) != 0) {
            function0 = d8Var.f19176d;
        }
        return d8Var.g(s6Var, i10, h1Var, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(d8 d8Var, androidx.compose.ui.layout.i2 i2Var, int i10, androidx.compose.ui.layout.i2.a aVar) {
        int i11 = d8Var.f19174b;
        androidx.compose.ui.text.input.h1 h1Var = d8Var.f19175c;
        y6 y6VarInvoke = d8Var.f19176d.invoke();
        d8Var.f19173a.r(androidx.compose.foundation.gestures.q3.Vertical, l6.c(aVar, i11, h1Var, y6VarInvoke != null ? y6VarInvoke.i() : null, false, i2Var.h1()), i10, i2Var.c1());
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, 0, Math.round(-d8Var.f19173a.h()), 0.0f, 4, null);
        return Unit.f312394a;
    }

    @NotNull
    public final s6 b() {
        return this.f19173a;
    }

    @Override // androidx.compose.ui.layout.o0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        int i10 = 7 & 0;
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(androidx.compose.ui.unit.b.d(j10, 0, 0, 0, Integer.MAX_VALUE, 7, null));
        final int iMin = Math.min(i2VarP0.c1(), androidx.compose.ui.unit.b.o(j10));
        return androidx.compose.ui.layout.c1.h6(c1Var, i2VarP0.h1(), iMin, null, new Function1() { // from class: androidx.compose.foundation.text.c8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d8.m(this.f18823a, i2VarP0, iMin, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    public final int d() {
        return this.f19174b;
    }

    @NotNull
    public final androidx.compose.ui.text.input.h1 e() {
        return this.f19175c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8)) {
            return false;
        }
        d8 d8Var = (d8) obj;
        return Intrinsics.areEqual(this.f19173a, d8Var.f19173a) && this.f19174b == d8Var.f19174b && Intrinsics.areEqual(this.f19175c, d8Var.f19175c) && Intrinsics.areEqual(this.f19176d, d8Var.f19176d);
    }

    @NotNull
    public final Function0<y6> f() {
        return this.f19176d;
    }

    @NotNull
    public final d8 g(@NotNull s6 s6Var, int i10, @NotNull androidx.compose.ui.text.input.h1 h1Var, @NotNull Function0<y6> function0) {
        return new d8(s6Var, i10, h1Var, function0);
    }

    public int hashCode() {
        return (((((this.f19173a.hashCode() * 31) + Integer.hashCode(this.f19174b)) * 31) + this.f19175c.hashCode()) * 31) + this.f19176d.hashCode();
    }

    public final int i() {
        return this.f19174b;
    }

    @NotNull
    public final s6 j() {
        return this.f19173a;
    }

    @NotNull
    public final Function0<y6> k() {
        return this.f19176d;
    }

    @NotNull
    public final androidx.compose.ui.text.input.h1 l() {
        return this.f19175c;
    }

    @NotNull
    public String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f19173a + ", cursorOffset=" + this.f19174b + ", transformedText=" + this.f19175c + ", textLayoutResultProvider=" + this.f19176d + ')';
    }
}
