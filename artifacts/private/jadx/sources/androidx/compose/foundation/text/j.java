package androidx.compose.foundation.text;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTextAutoSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextAutoSize.kt\nandroidx/compose/foundation/text/AutoSizeStepBased\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,256:1\n187#2,2:257\n187#2,2:259\n*S KotlinDebug\n*F\n+ 1 TextAutoSize.kt\nandroidx/compose/foundation/text/AutoSizeStepBased\n*L\n139#1:257,2\n144#1:259,2\n*E\n"})
final class j implements f5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f20337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f20338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f20339d;

    public /* synthetic */ j(long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12);
    }

    private final boolean b(androidx.compose.ui.text.p3 p3Var) {
        int iH = p3Var.l().h();
        androidx.compose.ui.text.style.v.a aVar = androidx.compose.ui.text.style.v.f42256b;
        if (androidx.compose.ui.text.style.v.i(iH, aVar.a()) || androidx.compose.ui.text.style.v.i(iH, aVar.i())) {
            return c(p3Var);
        }
        if (!androidx.compose.ui.text.style.v.i(iH, aVar.g()) && !androidx.compose.ui.text.style.v.i(iH, aVar.e()) && !androidx.compose.ui.text.style.v.i(iH, aVar.c())) {
            throw new IllegalArgumentException("TextOverflow type " + ((Object) androidx.compose.ui.text.style.v.k(p3Var.l().h())) + " is not supported.");
        }
        return d(p3Var);
    }

    private final boolean c(androidx.compose.ui.text.p3 p3Var) {
        if (!p3Var.g() && !p3Var.f()) {
            return false;
        }
        return true;
    }

    private final boolean d(androidx.compose.ui.text.p3 p3Var) {
        int iO = p3Var.o();
        if (iO == 0) {
            return false;
        }
        if (iO == 1) {
            return p3Var.E(0);
        }
        int iH = p3Var.l().h();
        androidx.compose.ui.text.style.v.a aVar = androidx.compose.ui.text.style.v.f42256b;
        if (androidx.compose.ui.text.style.v.i(iH, aVar.g()) || androidx.compose.ui.text.style.v.i(iH, aVar.e())) {
            return c(p3Var);
        }
        if (androidx.compose.ui.text.style.v.i(iH, aVar.c())) {
            return p3Var.E(p3Var.o() - 1);
        }
        return false;
    }

    @Override // androidx.compose.foundation.text.f5
    public long a(@NotNull androidx.compose.foundation.text.modifiers.y yVar, long j10, @NotNull androidx.compose.ui.text.f fVar) {
        float fP6 = yVar.p6(this.f20339d);
        float fP7 = yVar.p6(this.f20337b);
        float fP8 = yVar.p6(this.f20338c);
        float f10 = 2;
        float f11 = (fP7 + fP8) / f10;
        float f12 = fP7;
        float f13 = fP8;
        while (f13 - f12 >= fP6) {
            if (b(yVar.T5(j10, fVar, yVar.m1(f11)))) {
                f13 = f11;
            } else {
                f12 = f11;
            }
            f11 = (f12 + f13) / f10;
        }
        float fFloor = (((float) Math.floor((f12 - fP7) / fP6)) * fP6) + fP7;
        float f14 = fP6 + fFloor;
        if (f14 <= fP8 && !b(yVar.T5(j10, fVar, yVar.m1(f14)))) {
            fFloor = f14;
        }
        return yVar.m1(fFloor);
    }

    @Override // androidx.compose.foundation.text.f5
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return androidx.compose.ui.unit.z.j(jVar.f20337b, this.f20337b) && androidx.compose.ui.unit.z.j(jVar.f20338c, this.f20338c) && androidx.compose.ui.unit.z.j(jVar.f20339d, this.f20339d);
    }

    @Override // androidx.compose.foundation.text.f5
    public int hashCode() {
        return (((androidx.compose.ui.unit.z.o(this.f20337b) * 31) + androidx.compose.ui.unit.z.o(this.f20338c)) * 31) + androidx.compose.ui.unit.z.o(this.f20339d);
    }

    private j(long j10, long j11, long j12) {
        this.f20337b = j10;
        this.f20338c = j11;
        this.f20339d = j12;
        androidx.compose.ui.unit.z.a aVar = androidx.compose.ui.unit.z.f42728b;
        if (androidx.compose.ui.unit.z.j(j10, aVar.b())) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for minFontSize. Try using other values e.g. 10.sp");
        }
        if (androidx.compose.ui.unit.z.j(j11, aVar.b())) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for maxFontSize. Try using other values e.g. 100.sp");
        }
        if (androidx.compose.ui.unit.z.j(j12, aVar.b())) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for stepSize. Try using other values e.g. 0.25.sp");
        }
        if (androidx.compose.ui.unit.b0.g(androidx.compose.ui.unit.z.m(this.f20337b), androidx.compose.ui.unit.z.m(j11))) {
            long j13 = this.f20337b;
            androidx.compose.ui.unit.a0.c(j13, j11);
            if (Float.compare(androidx.compose.ui.unit.z.n(j13), androidx.compose.ui.unit.z.n(j11)) > 0) {
                this.f20337b = j11;
            }
        }
        if (androidx.compose.ui.unit.b0.g(androidx.compose.ui.unit.z.m(j12), androidx.compose.ui.unit.b0.f42661b.b())) {
            long jL = androidx.compose.ui.unit.a0.l(1.0E-4f);
            androidx.compose.ui.unit.a0.c(j12, jL);
            if (Float.compare(androidx.compose.ui.unit.z.n(j12), androidx.compose.ui.unit.z.n(jL)) < 0) {
                throw new IllegalArgumentException("AutoSize.StepBased: stepSize must be greater than or equal to 0.0001f.sp");
            }
        }
        if (androidx.compose.ui.unit.z.n(this.f20337b) < 0.0f) {
            throw new IllegalArgumentException("AutoSize.StepBased: minFontSize must not be negative");
        }
        if (androidx.compose.ui.unit.z.n(j11) < 0.0f) {
            throw new IllegalArgumentException("AutoSize.StepBased: maxFontSize must not be negative");
        }
    }
}
