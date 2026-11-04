package androidx.compose.material3;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nNavigationItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationItem.kt\nandroidx/compose/material3/TopIconOrIconOnlyMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,1129:1\n563#2,2:1130\n34#2,6:1132\n565#2:1138\n563#2,2:1143\n34#2,6:1145\n565#2:1151\n563#2,2:1152\n34#2,6:1154\n565#2:1160\n563#2,2:1161\n34#2,6:1163\n565#2:1169\n563#2,2:1170\n34#2,6:1172\n565#2:1178\n117#2,2:1179\n34#2,6:1181\n119#2:1187\n68#3:1139\n68#3:1140\n68#3:1141\n68#3:1142\n68#3:1188\n68#3:1189\n49#3:1190\n*S KotlinDebug\n*F\n+ 1 NavigationItem.kt\nandroidx/compose/material3/TopIconOrIconOnlyMeasurePolicy\n*L\n570#1:1130,2\n570#1:1132,6\n570#1:1138\n583#1:1143,2\n583#1:1145,6\n583#1:1151\n591#1:1152,2\n591#1:1154,6\n591#1:1160\n603#1:1161,2\n603#1:1163,6\n603#1:1169\n632#1:1170,2\n632#1:1172,6\n632#1:1178\n635#1:1179,2\n635#1:1181,6\n635#1:1187\n573#1:1139\n574#1:1140\n578#1:1141\n579#1:1142\n638#1:1188\n639#1:1189\n638#1:1190\n*E\n"})
final class ga0 implements androidx.compose.ui.layout.a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f27937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Float> f27938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f27939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f27940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f27941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f27942f;

    public /* synthetic */ ga0(boolean z10, Function0 function0, float f10, float f11, float f12, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, function0, f10, f11, f12, f13);
    }

    @Override // androidx.compose.ui.layout.a1
    @NotNull
    public androidx.compose.ui.layout.b1 a(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull List<? extends androidx.compose.ui.layout.z0> list, long j10) {
        float fFloatValue = this.f27938b.invoke().floatValue();
        long jD = androidx.compose.ui.unit.b.d(j10, 0, 0, 0, 0, 10, null);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.compose.ui.layout.z0 z0Var = list.get(i10);
            if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var), "icon")) {
                float f10 = 2;
                androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(androidx.compose.ui.unit.c.q(jD, -c1Var.g6(androidx.compose.ui.unit.h.r(this.f27939c * f10)), -c1Var.g6(androidx.compose.ui.unit.h.r(this.f27940d * f10))));
                int iH1 = i2VarP0.h1() + c1Var.g6(androidx.compose.ui.unit.h.r(this.f27939c * f10));
                int iC1 = i2VarP0.c1() + c1Var.g6(androidx.compose.ui.unit.h.r(this.f27940d * f10));
                int iL0 = kotlin.math.b.L0(iH1 * fFloatValue);
                List<? extends androidx.compose.ui.layout.z0> list2 = list;
                int size2 = list2.size();
                int i11 = 0;
                while (i11 < size2) {
                    androidx.compose.ui.layout.z0 z0Var2 = list.get(i11);
                    if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var2), "indicatorRipple")) {
                        androidx.compose.ui.layout.i2 i2VarP1 = z0Var2.P0(androidx.compose.ui.unit.c.g(jD, androidx.compose.ui.unit.b.f42658b.c(iH1, iC1)));
                        int size3 = list2.size();
                        int i12 = 0;
                        while (i12 < size3) {
                            androidx.compose.ui.layout.z0 z0Var3 = list.get(i12);
                            if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var3), "indicator")) {
                                androidx.compose.ui.layout.i2 i2VarP2 = z0Var3.P0(androidx.compose.ui.unit.c.g(jD, androidx.compose.ui.unit.b.f42658b.c(iL0, iC1)));
                                if (!this.f27937a) {
                                    return qp.e0(c1Var, i2VarP0, i2VarP1, i2VarP2, j10);
                                }
                                int size4 = list2.size();
                                int i13 = 0;
                                while (i13 < size4) {
                                    androidx.compose.ui.layout.z0 z0Var4 = list.get(i13);
                                    if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var4), com.google.firebase.messaging.e.f.f123534d)) {
                                        return qp.i0(c1Var, z0Var4.P0(androidx.compose.ui.unit.c.r(jD, 0, -(i2VarP2.c1() + c1Var.g6(this.f27941e)), 1, null)), i2VarP0, i2VarP1, i2VarP2, j10, this.f27941e, this.f27940d, this.f27942f);
                                    }
                                    i13++;
                                    i2VarP2 = i2VarP2;
                                    i2VarP0 = i2VarP0;
                                    c1Var = c1Var;
                                }
                                androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
                                throw new kotlin.a0();
                            }
                            i12++;
                            i2VarP0 = i2VarP0;
                            c1Var = c1Var;
                        }
                        androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
                        throw new kotlin.a0();
                    }
                    i11++;
                    c1Var = c1Var;
                }
                androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
                throw new kotlin.a0();
            }
        }
        androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
        throw new kotlin.a0();
    }

    @Override // androidx.compose.ui.layout.a1
    public int d(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        androidx.compose.ui.layout.y yVar;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            androidx.compose.ui.layout.y yVar2 = list.get(i11);
            if (Intrinsics.areEqual(androidx.compose.material3.internal.u2.b(yVar2), "icon")) {
                int iP0 = yVar2.p0(i10);
                int size2 = list.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size2) {
                        yVar = null;
                        break;
                    }
                    yVar = list.get(i12);
                    if (Intrinsics.areEqual(androidx.compose.material3.internal.u2.b(yVar), com.google.firebase.messaging.e.f.f123534d)) {
                        break;
                    }
                    i12++;
                }
                androidx.compose.ui.layout.y yVar3 = yVar;
                int iP1 = yVar3 != null ? yVar3.p0(i10) : 0;
                float f10 = 2;
                return iP0 + iP1 + zVar.g6(androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(this.f27942f * f10) + androidx.compose.ui.unit.h.r(this.f27940d * f10)) + this.f27941e));
            }
        }
        androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
        throw new kotlin.a0();
    }

    public final boolean f() {
        return this.f27937a;
    }

    @NotNull
    public final Function0<Float> g() {
        return this.f27938b;
    }

    public final float h() {
        return this.f27939c;
    }

    public final float i() {
        return this.f27941e;
    }

    public final float j() {
        return this.f27940d;
    }

    public final float k() {
        return this.f27942f;
    }

    private ga0(boolean z10, Function0<Float> function0, float f10, float f11, float f12, float f13) {
        this.f27937a = z10;
        this.f27938b = function0;
        this.f27939c = f10;
        this.f27940d = f11;
        this.f27941e = f12;
        this.f27942f = f13;
    }
}
