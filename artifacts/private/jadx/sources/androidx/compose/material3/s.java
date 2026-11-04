package androidx.compose.material3;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nNavigationItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationItem.kt\nandroidx/compose/material3/AnimatedMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,1129:1\n563#2,2:1130\n34#2,6:1132\n565#2:1138\n563#2,2:1139\n34#2,6:1141\n565#2:1147\n563#2,2:1153\n34#2,6:1155\n565#2:1161\n563#2,2:1162\n34#2,6:1164\n565#2:1170\n563#2,2:1171\n34#2,6:1173\n565#2:1179\n563#2,2:1180\n34#2,6:1182\n565#2:1188\n68#3:1148\n68#3:1149\n68#3:1150\n49#3:1151\n68#3:1152\n68#3:1189\n49#3:1190\n68#3:1191\n49#3:1192\n*S KotlinDebug\n*F\n+ 1 NavigationItem.kt\nandroidx/compose/material3/AnimatedMeasurePolicy\n*L\n759#1:1130,2\n759#1:1132,6\n759#1:1138\n762#1:1139,2\n762#1:1141,6\n762#1:1147\n787#1:1153,2\n787#1:1155,6\n787#1:1161\n798#1:1162,2\n798#1:1164,6\n798#1:1170\n832#1:1171,2\n832#1:1173,6\n832#1:1179\n834#1:1180,2\n834#1:1182,6\n834#1:1188\n765#1:1148\n767#1:1149\n772#1:1150\n772#1:1151\n776#1:1152\n838#1:1189\n838#1:1190\n842#1:1191\n842#1:1192\n*E\n"})
final class s implements androidx.compose.ui.layout.a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Float> f32636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function0<Float> f32637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f32638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f32639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f32640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f32641g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f32642h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f32643i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f32644j;

    public /* synthetic */ s(int i10, Function0 function0, Function0 function1, float f10, float f11, float f12, float f13, float f14, float f15, float f16, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, function0, function1, f10, f11, f12, f13, f14, f15, f16);
    }

    @Override // androidx.compose.ui.layout.a1
    @NotNull
    public androidx.compose.ui.layout.b1 a(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull List<? extends androidx.compose.ui.layout.z0> list, long j10) {
        float fFloatValue = this.f32637c.invoke().floatValue();
        float fFloatValue2 = this.f32636b.invoke().floatValue();
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
                        androidx.compose.ui.layout.i2 i2VarP1 = z0Var2.P0(jD);
                        float f10 = 2;
                        int iH1 = i2VarP0.h1() + c1Var.g6(androidx.compose.ui.unit.h.r(this.f32638d * f10));
                        int iC1 = i2VarP0.c1() + c1Var.g6(androidx.compose.ui.unit.h.r(this.f32639e * f10));
                        int iH2 = i2VarP0.h1() + i2VarP1.h1() + c1Var.g6(androidx.compose.ui.unit.h.r(this.f32643i + androidx.compose.ui.unit.h.r(this.f32641g * f10)));
                        int iMax = Math.max(i2VarP0.c1(), i2VarP1.c1()) + c1Var.g6(androidx.compose.ui.unit.h.r(this.f32642h * f10));
                        int iS = androidx.compose.ui.util.e.s(iH1, iH2, fFloatValue2);
                        int iL0 = kotlin.math.b.L0(iS * fFloatValue);
                        int iS2 = androidx.compose.ui.util.e.s(iC1, iMax, fFloatValue2);
                        int size3 = list2.size();
                        int i12 = 0;
                        while (i12 < size3) {
                            androidx.compose.ui.layout.z0 z0Var3 = list.get(i12);
                            int i13 = size3;
                            if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var3), "indicatorRipple")) {
                                androidx.compose.ui.layout.i2 i2Var = i2VarP0;
                                androidx.compose.ui.layout.i2 i2VarP2 = z0Var3.P0(androidx.compose.ui.unit.c.g(jD, androidx.compose.ui.unit.b.f42658b.c(iS, iS2)));
                                int size4 = list2.size();
                                for (int i14 = 0; i14 < size4; i14++) {
                                    androidx.compose.ui.layout.z0 z0Var4 = list.get(i14);
                                    if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var4), "indicator")) {
                                        return qp.b0(c1Var, this.f32635a, this.f32636b, i2VarP1, i2Var, i2VarP2, z0Var4.P0(androidx.compose.ui.unit.c.g(jD, androidx.compose.ui.unit.b.f42658b.c(iL0, iS2))), iH1, jD, this.f32640f, this.f32639e, this.f32638d, this.f32641g, this.f32642h, this.f32643i, this.f32644j);
                                    }
                                }
                                androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
                                throw new kotlin.a0();
                            }
                            i12++;
                            size3 = i13;
                            i2VarP0 = i2VarP0;
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
                        int iM1 = yVar2.M0(i10);
                        if (wo.f(this.f32635a, wo.f34270b.b())) {
                            float f10 = 2;
                            return Math.max(iM1, iM0 + zVar.g6(androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(this.f32638d * f10) + androidx.compose.ui.unit.h.r(this.f32644j * f10))));
                        }
                        return iM0 + iM1 + zVar.g6(androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(this.f32641g * 2) + this.f32643i) + this.f32644j));
                    }
                }
                androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
                throw new kotlin.a0();
            }
        }
        androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
        throw new kotlin.a0();
    }

    public final int f() {
        return this.f32635a;
    }

    @NotNull
    public final Function0<Float> g() {
        return this.f32636b;
    }

    @NotNull
    public final Function0<Float> h() {
        return this.f32637c;
    }

    public final float i() {
        return this.f32644j;
    }

    public final float j() {
        return this.f32641g;
    }

    public final float k() {
        return this.f32642h;
    }

    public final float l() {
        return this.f32643i;
    }

    public final float n() {
        return this.f32638d;
    }

    public final float p() {
        return this.f32640f;
    }

    public final float q() {
        return this.f32639e;
    }

    private s(int i10, Function0<Float> function0, Function0<Float> function1, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        this.f32635a = i10;
        this.f32636b = function0;
        this.f32637c = function1;
        this.f32638d = f10;
        this.f32639e = f11;
        this.f32640f = f12;
        this.f32641g = f13;
        this.f32642h = f14;
        this.f32643i = f15;
        this.f32644j = f16;
    }
}
