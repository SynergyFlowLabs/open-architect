package androidx.compose.material3;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nNavigationItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationItem.kt\nandroidx/compose/material3/StartIconMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,1129:1\n563#2,2:1130\n34#2,6:1132\n565#2:1138\n563#2,2:1139\n34#2,6:1141\n565#2:1147\n563#2,2:1151\n34#2,6:1153\n565#2:1159\n563#2,2:1160\n34#2,6:1162\n565#2:1168\n563#2,2:1169\n34#2,6:1171\n565#2:1177\n563#2,2:1178\n34#2,6:1180\n565#2:1186\n563#2,2:1189\n34#2,6:1191\n565#2:1197\n563#2,2:1198\n34#2,6:1200\n565#2:1206\n68#3:1148\n49#3:1149\n68#3:1150\n68#3:1187\n49#3:1188\n68#3:1207\n*S KotlinDebug\n*F\n+ 1 NavigationItem.kt\nandroidx/compose/material3/StartIconMeasurePolicy\n*L\n661#1:1130,2\n661#1:1132,6\n661#1:1138\n666#1:1139,2\n666#1:1141,6\n666#1:1147\n685#1:1151,2\n685#1:1153,6\n685#1:1159\n693#1:1160,2\n693#1:1162,6\n693#1:1168\n715#1:1169,2\n715#1:1171,6\n715#1:1177\n717#1:1178,2\n717#1:1180,6\n717#1:1186\n729#1:1189,2\n729#1:1191,6\n729#1:1197\n731#1:1198,2\n731#1:1200,6\n731#1:1206\n677#1:1148\n677#1:1149\n680#1:1150\n719#1:1187\n719#1:1188\n732#1:1207\n*E\n"})
final class q10 implements androidx.compose.ui.layout.a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<Float> f32054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f32055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f32056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f32057d;

    public /* synthetic */ q10(Function0 function0, float f10, float f11, float f12, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, f10, f11, f12);
    }

    @Override // androidx.compose.ui.layout.a1
    @NotNull
    public androidx.compose.ui.layout.b1 a(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull List<? extends androidx.compose.ui.layout.z0> list, long j10) {
        float fFloatValue = this.f32054a.invoke().floatValue();
        long jD = androidx.compose.ui.unit.b.d(j10, 0, 0, 0, 0, 10, null);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.compose.ui.layout.z0 z0Var = list.get(i10);
            if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var), "icon")) {
                androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(jD);
                List<? extends androidx.compose.ui.layout.z0> list2 = list;
                int size2 = list2.size();
                int i11 = 0;
                while (i11 < size2) {
                    androidx.compose.ui.layout.z0 z0Var2 = list.get(i11);
                    if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var2), com.google.firebase.messaging.e.f.f123534d)) {
                        androidx.compose.ui.layout.i2 i2VarP1 = z0Var2.P0(androidx.compose.ui.unit.c.r(jD, -(i2VarP0.h1() + c1Var.g6(this.f32057d)), 0, 2, null));
                        float f10 = 2;
                        int iH1 = i2VarP0.h1() + i2VarP1.h1() + c1Var.g6(androidx.compose.ui.unit.h.r(this.f32057d + androidx.compose.ui.unit.h.r(this.f32055b * f10)));
                        int iMax = Math.max(i2VarP0.c1(), i2VarP1.c1()) + c1Var.g6(androidx.compose.ui.unit.h.r(this.f32056c * f10));
                        int iL0 = kotlin.math.b.L0(iH1 * fFloatValue);
                        int size3 = list2.size();
                        for (int i12 = 0; i12 < size3; i12++) {
                            androidx.compose.ui.layout.z0 z0Var3 = list.get(i12);
                            if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var3), "indicatorRipple")) {
                                androidx.compose.ui.layout.i2 i2VarP2 = z0Var3.P0(androidx.compose.ui.unit.c.g(jD, androidx.compose.ui.unit.b.f42658b.c(iH1, iMax)));
                                int size4 = list2.size();
                                int i13 = 0;
                                while (i13 < size4) {
                                    androidx.compose.ui.layout.z0 z0Var4 = list.get(i13);
                                    if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var4), "indicator")) {
                                        return qp.Y(c1Var, i2VarP1, i2VarP0, i2VarP2, z0Var4.P0(androidx.compose.ui.unit.c.g(jD, androidx.compose.ui.unit.b.f42658b.c(iL0, iMax))), j10, this.f32057d);
                                    }
                                    i13++;
                                    i2VarP2 = i2VarP2;
                                }
                                androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
                                throw new kotlin.a0();
                            }
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
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            androidx.compose.ui.layout.y yVar = list.get(i11);
            if (Intrinsics.areEqual(androidx.compose.material3.internal.u2.b(yVar), "icon")) {
                int iP0 = yVar.p0(i10);
                int size2 = list.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    androidx.compose.ui.layout.y yVar2 = list.get(i12);
                    if (Intrinsics.areEqual(androidx.compose.material3.internal.u2.b(yVar2), com.google.firebase.messaging.e.f.f123534d)) {
                        return Math.max(iP0, yVar2.p0(i10)) + zVar.g6(androidx.compose.ui.unit.h.r(this.f32056c * 2));
                    }
                }
                androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
                throw new kotlin.a0();
            }
        }
        androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
        throw new kotlin.a0();
    }

    @Override // androidx.compose.ui.layout.a1
    public int e(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            androidx.compose.ui.layout.y yVar = list.get(i11);
            if (Intrinsics.areEqual(androidx.compose.material3.internal.u2.b(yVar), "icon")) {
                int iM0 = yVar.M0(i10);
                int size2 = list.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    androidx.compose.ui.layout.y yVar2 = list.get(i12);
                    if (Intrinsics.areEqual(androidx.compose.material3.internal.u2.b(yVar2), com.google.firebase.messaging.e.f.f123534d)) {
                        return iM0 + yVar2.M0(i10) + zVar.g6(androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(this.f32055b * 2) + this.f32057d));
                    }
                }
                androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
                throw new kotlin.a0();
            }
        }
        androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
        throw new kotlin.a0();
    }

    @NotNull
    public final Function0<Float> f() {
        return this.f32054a;
    }

    public final float g() {
        return this.f32055b;
    }

    public final float h() {
        return this.f32056c;
    }

    public final float i() {
        return this.f32057d;
    }

    private q10(Function0<Float> function0, float f10, float f11, float f12) {
        this.f32054a = function0;
        this.f32055b = f10;
        this.f32056c = f11;
        this.f32057d = f12;
    }
}
