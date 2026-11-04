package androidx.compose.material;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ListItemKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,444:1\n1282#2,6:445\n1282#2,6:451\n1282#2,6:487\n79#3,6:457\n86#3,3:472\n89#3,2:481\n93#3:486\n79#3,6:493\n86#3,3:508\n89#3,2:517\n93#3:522\n347#4,9:463\n356#4,3:483\n347#4,9:499\n356#4,3:519\n4206#5,6:475\n4206#5,6:511\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ListItemKt\n*L\n96#1:445,6\n366#1:451,6\n405#1:487,6\n366#1:457,6\n366#1:472,3\n366#1:481,2\n366#1:486\n405#1:493,6\n405#1:508,3\n405#1:517,2\n405#1:522\n366#1:463,9\n366#1:483,3\n405#1:499,9\n405#1:519,3\n366#1:475,6\n405#1:511,6\n*E\n"})
public final class s9 {

    @SourceDebugExtension({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ListItemKt$BaselinesOffsetColumn$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,444:1\n150#2,3:445\n34#2,6:448\n153#2:454\n269#2,3:455\n34#2,6:458\n272#2:464\n70#2,6:465\n70#2,6:471\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ListItemKt$BaselinesOffsetColumn$1$1\n*L\n368#1:445,3\n368#1:448,6\n368#1:454\n371#1:455,3\n371#1:458,6\n371#1:464\n374#1:465,6\n386#1:471,6\n*E\n"})
    static final class a implements androidx.compose.ui.layout.a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<androidx.compose.ui.unit.h> f24906a;

        a(List<androidx.compose.ui.unit.h> list) {
            this.f24906a = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(List list, int[] iArr, androidx.compose.ui.layout.i2.a aVar) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                int i11 = 1 & 4;
                androidx.compose.ui.layout.i2.a.e0(aVar, (androidx.compose.ui.layout.i2) list.get(i10), 0, iArr[i10], 0.0f, 4, null);
            }
            return Unit.f312394a;
        }

        @Override // androidx.compose.ui.layout.a1
        public final androidx.compose.ui.layout.b1 a(androidx.compose.ui.layout.c1 c1Var, List<? extends androidx.compose.ui.layout.z0> list, long j10) {
            int iC1;
            long jD = androidx.compose.ui.unit.b.d(j10, 0, 0, 0, Integer.MAX_VALUE, 3, null);
            final ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(list.get(i10).P0(jD));
            }
            Integer numValueOf = 0;
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((androidx.compose.ui.layout.i2) arrayList.get(i11)).h1()));
            }
            int iIntValue = numValueOf.intValue();
            final int[] iArr = new int[arrayList.size()];
            List<androidx.compose.ui.unit.h> list2 = this.f24906a;
            int size3 = arrayList.size();
            int iC2 = 0;
            for (int i12 = 0; i12 < size3; i12++) {
                androidx.compose.ui.layout.i2 i2Var = (androidx.compose.ui.layout.i2) arrayList.get(i12);
                if (i12 > 0) {
                    int i13 = i12 - 1;
                    iC1 = ((androidx.compose.ui.layout.i2) arrayList.get(i13)).c1() - ((androidx.compose.ui.layout.i2) arrayList.get(i13)).M(androidx.compose.ui.layout.b.b());
                } else {
                    iC1 = 0;
                }
                int iMax = Math.max(0, (c1Var.g6(list2.get(i12).O()) - i2Var.M(androidx.compose.ui.layout.b.a())) - iC1);
                iArr[i12] = iMax + iC2;
                iC2 += iMax + i2Var.c1();
            }
            return androidx.compose.ui.layout.c1.h6(c1Var, iIntValue, iC2, null, new Function1() { // from class: androidx.compose.material.r9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s9.a.g(arrayList, iArr, (androidx.compose.ui.layout.i2.a) obj);
                }
            }, 4, null);
        }
    }

    @SourceDebugExtension({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ListItemKt$OffsetToBaselineOrCenter$1$1\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,444:1\n30#2:445\n80#3:446\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ListItemKt$OffsetToBaselineOrCenter$1$1\n*L\n418#1:445\n418#1:446\n*E\n"})
    static final class b implements androidx.compose.ui.layout.a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f24907a;

        b(float f10) {
            this.f24907a = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(androidx.compose.ui.layout.i2 i2Var, int i10, androidx.compose.ui.layout.i2.a aVar) {
            int i11 = 0 << 0;
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, 0, i10, 0.0f, 4, null);
            return Unit.f312394a;
        }

        @Override // androidx.compose.ui.layout.a1
        public final androidx.compose.ui.layout.b1 a(androidx.compose.ui.layout.c1 c1Var, List<? extends androidx.compose.ui.layout.z0> list, long j10) {
            int iMax;
            final int iP;
            final androidx.compose.ui.layout.i2 i2VarP0 = list.get(0).P0(androidx.compose.ui.unit.b.d(j10, 0, 0, 0, 0, 11, null));
            int iM = i2VarP0.M(androidx.compose.ui.layout.b.a());
            if (iM != Integer.MIN_VALUE) {
                iP = c1Var.g6(this.f24907a) - iM;
                iMax = Math.max(androidx.compose.ui.unit.b.q(j10), i2VarP0.c1() + iP);
            } else {
                iMax = Math.max(androidx.compose.ui.unit.b.q(j10), i2VarP0.c1());
                iP = androidx.compose.ui.unit.q.p(androidx.compose.ui.e.f37317a.i().a(androidx.compose.ui.unit.u.f42720b.a(), androidx.compose.ui.unit.u.e((((long) 0) << 32) | (((long) (iMax - i2VarP0.c1())) & com.rabbitmq.client.k0.f265952a)), c1Var.getLayoutDirection()));
            }
            return androidx.compose.ui.layout.c1.h6(c1Var, i2VarP0.h1(), iMax, null, new Function1() { // from class: androidx.compose.material.t9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s9.b.g(i2VarP0, iP, (androidx.compose.ui.layout.i2.a) obj);
                }
            }, 4, null);
        }
    }

    static final class c implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f24908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.y3 f24909b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.style.h f24910c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f24911d;

        static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.text.y3 f24912a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.text.style.h f24913b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f24914c;

            /* JADX WARN: Multi-variable type inference failed */
            a(androidx.compose.ui.text.y3 y3Var, androidx.compose.ui.text.style.h hVar, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
                this.f24912a = y3Var;
                this.f24913b = hVar;
                this.f24914c = function2;
            }

            @androidx.compose.runtime.o
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-925826178, i10, -1, "androidx.compose.material.applyTextStyle.<anonymous>.<anonymous> (ListItem.kt:439)");
                }
                wk.l(androidx.compose.ui.text.y3.m(this.f24912a, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, this.f24913b, 0, 0, null, 15728639, null), this.f24914c, c0Var, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
                c(c0Var, num.intValue());
                return Unit.f312394a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(float f10, androidx.compose.ui.text.y3 y3Var, androidx.compose.ui.text.style.h hVar, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f24908a = f10;
            this.f24909b = y3Var;
            this.f24910c = hVar;
            this.f24911d = function2;
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1000595778, i10, -1, "androidx.compose.material.applyTextStyle.<anonymous> (ListItem.kt:438)");
            }
            androidx.compose.runtime.a1.e(w4.c().f(Float.valueOf(this.f24908a)), androidx.compose.runtime.internal.w.e(-925826178, true, new a(this.f24909b, this.f24910c, this.f24911d), c0Var, 54), c0Var, androidx.compose.runtime.n4.f36267i | 48);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void e(final List<androidx.compose.ui.unit.h> list, androidx.compose.ui.a0 a0Var, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(872528548);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(list) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.D(a0Var) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= androidx.media3.exoplayer.a5.S0;
        } else if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i12 |= c0VarR.k0(function2) ? 256 : 128;
        }
        if (c0VarR.h((i12 & com.planner5d.library.engine.input.f.b.F1) != 146, i12 & 1)) {
            if (i13 != 0) {
                a0Var = androidx.compose.ui.a0.E;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(872528548, i12, -1, "androidx.compose.material.BaselinesOffsetColumn (ListItem.kt:364)");
            }
            boolean zK0 = c0VarR.k0(list);
            Object objI0 = c0VarR.i0();
            if (zK0 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new a(list);
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.layout.a1 a1Var = (androidx.compose.ui.layout.a1) objI0;
            int i14 = ((i12 >> 6) & 14) | (i12 & com.planner5d.library.engine.input.f.b.B);
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0Var);
            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar.a();
            int i15 = ((i14 << 6) & 896) | 6;
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD, a1Var, aVar.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
            function2.invoke(c0VarR, Integer.valueOf((i15 >> 6) & 14));
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        final androidx.compose.ui.a0 a0Var2 = a0Var;
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.n9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return s9.f(list, a0Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(List list, androidx.compose.ui.a0 a0Var, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        e(list, a0Var, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x010f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0119  */
    /* JADX WARN: Code duplicated, block: B:107:0x016c  */
    /* JADX WARN: Code duplicated, block: B:110:0x017d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x0197 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0199 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x019b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x01de  */
    /* JADX WARN: Code duplicated, block: B:121:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:124:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:94:0x0100  */
    /* JADX WARN: Code duplicated, block: B:95:0x0102  */
    /* JADX WARN: Code duplicated, block: B:97:0x0108  */
    /* JADX WARN: Code duplicated, block: B:98:0x010a  */
    @androidx.compose.runtime.o
    @u7
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][_][_][_][_]]")
    public static final void g(@Nullable androidx.compose.ui.a0 a0Var, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, boolean z10, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function6, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function7;
        int i13;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function8;
        int i14;
        int i15;
        int i16;
        int i17;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function9;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z11;
        final androidx.compose.ui.a0 a0Var2;
        final boolean z12;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function10;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function12;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function13;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var3;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function14;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function15;
        boolean z13;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function16;
        Function2<androidx.compose.runtime.c0, Integer, Unit> function2N;
        Function2<androidx.compose.runtime.c0, Integer, Unit> function2N2;
        Function2<androidx.compose.runtime.c0, Integer, Unit> function2N3;
        Function2<androidx.compose.runtime.c0, Integer, Unit> function2N4;
        Object objI0;
        androidx.compose.ui.a0 a0VarE;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1618131318);
        int i22 = i11 & 1;
        if (i22 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i23 = i11 & 2;
        if (i23 == 0) {
            if ((i10 & 48) == 0) {
                function7 = function2;
                i12 |= c0VarR.k0(function7) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    function8 = function3;
                    if (c0VarR.k0(function8)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        if (c0VarR.G(z10)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((i10 & 24576) == 0) {
                            function9 = function4;
                            if (c0VarR.k0(function9)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        i19 = i11 & 32;
                        if (i19 != 0) {
                            i12 |= androidx.profileinstaller.n.c.f73814m;
                        } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.k0(function5)) {
                                i20 = 131072;
                            } else {
                                i20 = 65536;
                            }
                            i12 |= i20;
                        }
                        if ((i11 & 64) != 0) {
                            i12 |= 1572864;
                        } else if ((i10 & 1572864) == 0) {
                            if (c0VarR.k0(function6)) {
                                i21 = 1048576;
                            } else {
                                i21 = 524288;
                            }
                            i12 |= i21;
                        }
                        if ((i12 & 599187) != 599186) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (c0VarR.h(z11, i12 & 1)) {
                            if (i22 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i23 != 0) {
                                function14 = null;
                            } else {
                                function14 = function7;
                            }
                            if (i13 != 0) {
                                function15 = null;
                            } else {
                                function15 = function8;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i17 != 0) {
                                function16 = null;
                            } else {
                                function16 = function9;
                            }
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function17 = i19 == 0 ? function5 : null;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1618131318, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:87)");
                            }
                            cl clVarC = x9.f25488a.c(c0VarR, 6);
                            androidx.compose.ui.text.y3 y3VarN = clVarC.n();
                            u4 u4Var = u4.f25148a;
                            function2N = n(y3VarN, u4Var.c(c0VarR, 6), function6);
                            Intrinsics.checkNotNull(function2N);
                            function2N2 = n(clVarC.d(), u4Var.d(c0VarR, 6), function15);
                            function2N3 = n(clVarC.m(), u4Var.c(c0VarR, 6), function16);
                            function2N4 = n(clVarC.f(), u4Var.c(c0VarR, 6), function17);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material.p9
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return s9.h((androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            a0VarE = androidx.compose.ui.semantics.t.e(a0Var3, true, (Function1) objI0);
                            if (function2N2 != null && function2N3 == null) {
                                c0VarR.E(-961912553);
                                vb.f25277a.b(a0VarE, function14, function2N, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 24576, 0);
                                c0VarR.A();
                            } else if ((function2N3 == null || !z13) && function2N2 != null) {
                                c0VarR.E(-961499943);
                                yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                                c0VarR = c0VarR;
                                c0VarR.A();
                            } else {
                                c0VarR.E(-961713285);
                                bl.f22238a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                                c0VarR = c0VarR;
                                c0VarR.A();
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            function12 = function15;
                            z12 = z13;
                            function13 = function16;
                            function11 = function14;
                            function10 = function17;
                            a0Var2 = a0Var3;
                        } else {
                            c0VarR.u();
                            a0Var2 = a0Var;
                            z12 = z10;
                            function10 = function5;
                            function11 = function7;
                            function12 = function8;
                            function13 = function9;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.q9
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return s9.i(a0Var2, function11, function12, z12, function13, function10, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 24576;
                    function9 = function4;
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        i12 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(function5)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 64) != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(function6)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i12 |= i21;
                    }
                    if ((i12 & 599187) != 599186) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c0VarR.h(z11, i12 & 1)) {
                        if (i22 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i23 != 0) {
                            function14 = null;
                        } else {
                            function14 = function7;
                        }
                        if (i13 != 0) {
                            function15 = null;
                        } else {
                            function15 = function8;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i17 != 0) {
                            function16 = null;
                        } else {
                            function16 = function9;
                        }
                        if (i19 == 0) {
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1618131318, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:87)");
                        }
                        cl clVarC2 = x9.f25488a.c(c0VarR, 6);
                        androidx.compose.ui.text.y3 y3VarN2 = clVarC2.n();
                        u4 u4Var2 = u4.f25148a;
                        function2N = n(y3VarN2, u4Var2.c(c0VarR, 6), function6);
                        Intrinsics.checkNotNull(function2N);
                        function2N2 = n(clVarC2.d(), u4Var2.d(c0VarR, 6), function15);
                        function2N3 = n(clVarC2.m(), u4Var2.c(c0VarR, 6), function16);
                        function2N4 = n(clVarC2.f(), u4Var2.c(c0VarR, 6), function17);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.p9
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return s9.h((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        a0VarE = androidx.compose.ui.semantics.t.e(a0Var3, true, (Function1) objI0);
                        if (function2N2 != null) {
                            if (function2N3 == null) {
                                c0VarR.E(-961499943);
                                yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                                c0VarR = c0VarR;
                                c0VarR.A();
                            } else {
                                c0VarR.E(-961499943);
                                yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                                c0VarR = c0VarR;
                                c0VarR.A();
                            }
                        } else if (function2N3 == null) {
                            c0VarR.E(-961499943);
                            yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                            c0VarR = c0VarR;
                            c0VarR.A();
                        } else {
                            c0VarR.E(-961499943);
                            yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                            c0VarR = c0VarR;
                            c0VarR.A();
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function12 = function15;
                        z12 = z13;
                        function13 = function16;
                        function11 = function14;
                        function10 = function17;
                        a0Var2 = a0Var3;
                    } else {
                        c0VarR.u();
                        a0Var2 = a0Var;
                        z12 = z10;
                        function10 = function5;
                        function11 = function7;
                        function12 = function8;
                        function13 = function9;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.q9
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return s9.i(a0Var2, function11, function12, z12, function13, function10, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 3072;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        function9 = function4;
                        if (c0VarR.k0(function9)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        i12 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(function5)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 64) != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(function6)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i12 |= i21;
                    }
                    if ((i12 & 599187) != 599186) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c0VarR.h(z11, i12 & 1)) {
                        if (i22 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i23 != 0) {
                            function14 = null;
                        } else {
                            function14 = function7;
                        }
                        if (i13 != 0) {
                            function15 = null;
                        } else {
                            function15 = function8;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i17 != 0) {
                            function16 = null;
                        } else {
                            function16 = function9;
                        }
                        if (i19 == 0) {
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1618131318, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:87)");
                        }
                        cl clVarC3 = x9.f25488a.c(c0VarR, 6);
                        androidx.compose.ui.text.y3 y3VarN3 = clVarC3.n();
                        u4 u4Var3 = u4.f25148a;
                        function2N = n(y3VarN3, u4Var3.c(c0VarR, 6), function6);
                        Intrinsics.checkNotNull(function2N);
                        function2N2 = n(clVarC3.d(), u4Var3.d(c0VarR, 6), function15);
                        function2N3 = n(clVarC3.m(), u4Var3.c(c0VarR, 6), function16);
                        function2N4 = n(clVarC3.f(), u4Var3.c(c0VarR, 6), function17);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.p9
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return s9.h((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        a0VarE = androidx.compose.ui.semantics.t.e(a0Var3, true, (Function1) objI0);
                        if (function2N2 != null) {
                            if (function2N3 == null) {
                                c0VarR.E(-961499943);
                                yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                                c0VarR = c0VarR;
                                c0VarR.A();
                            } else {
                                c0VarR.E(-961499943);
                                yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                                c0VarR = c0VarR;
                                c0VarR.A();
                            }
                        } else if (function2N3 == null) {
                            c0VarR.E(-961499943);
                            yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                            c0VarR = c0VarR;
                            c0VarR.A();
                        } else {
                            c0VarR.E(-961499943);
                            yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                            c0VarR = c0VarR;
                            c0VarR.A();
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function12 = function15;
                        z12 = z13;
                        function13 = function16;
                        function11 = function14;
                        function10 = function17;
                        a0Var2 = a0Var3;
                    } else {
                        c0VarR.u();
                        a0Var2 = a0Var;
                        z12 = z10;
                        function10 = function5;
                        function11 = function7;
                        function12 = function8;
                        function13 = function9;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.q9
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return s9.i(a0Var2, function11, function12, z12, function13, function10, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                function9 = function4;
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(function5)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function6)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                }
                if ((i12 & 599187) != 599186) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0VarR.h(z11, i12 & 1)) {
                    if (i22 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i23 != 0) {
                        function14 = null;
                    } else {
                        function14 = function7;
                    }
                    if (i13 != 0) {
                        function15 = null;
                    } else {
                        function15 = function8;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i17 != 0) {
                        function16 = null;
                    } else {
                        function16 = function9;
                    }
                    if (i19 == 0) {
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1618131318, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:87)");
                    }
                    cl clVarC4 = x9.f25488a.c(c0VarR, 6);
                    androidx.compose.ui.text.y3 y3VarN4 = clVarC4.n();
                    u4 u4Var4 = u4.f25148a;
                    function2N = n(y3VarN4, u4Var4.c(c0VarR, 6), function6);
                    Intrinsics.checkNotNull(function2N);
                    function2N2 = n(clVarC4.d(), u4Var4.d(c0VarR, 6), function15);
                    function2N3 = n(clVarC4.m(), u4Var4.c(c0VarR, 6), function16);
                    function2N4 = n(clVarC4.f(), u4Var4.c(c0VarR, 6), function17);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.p9
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return s9.h((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    a0VarE = androidx.compose.ui.semantics.t.e(a0Var3, true, (Function1) objI0);
                    if (function2N2 != null) {
                        if (function2N3 == null) {
                            c0VarR.E(-961499943);
                            yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                            c0VarR = c0VarR;
                            c0VarR.A();
                        } else {
                            c0VarR.E(-961499943);
                            yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                            c0VarR = c0VarR;
                            c0VarR.A();
                        }
                    } else if (function2N3 == null) {
                        c0VarR.E(-961499943);
                        yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                        c0VarR = c0VarR;
                        c0VarR.A();
                    } else {
                        c0VarR.E(-961499943);
                        yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                        c0VarR = c0VarR;
                        c0VarR.A();
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function12 = function15;
                    z12 = z13;
                    function13 = function16;
                    function11 = function14;
                    function10 = function17;
                    a0Var2 = a0Var3;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    z12 = z10;
                    function10 = function5;
                    function11 = function7;
                    function12 = function8;
                    function13 = function9;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.q9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return s9.i(a0Var2, function11, function12, z12, function13, function10, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            function8 = function3;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    if (c0VarR.G(z10)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        function9 = function4;
                        if (c0VarR.k0(function9)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        i12 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(function5)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 64) != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(function6)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i12 |= i21;
                    }
                    if ((i12 & 599187) != 599186) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c0VarR.h(z11, i12 & 1)) {
                        if (i22 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i23 != 0) {
                            function14 = null;
                        } else {
                            function14 = function7;
                        }
                        if (i13 != 0) {
                            function15 = null;
                        } else {
                            function15 = function8;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i17 != 0) {
                            function16 = null;
                        } else {
                            function16 = function9;
                        }
                        if (i19 == 0) {
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1618131318, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:87)");
                        }
                        cl clVarC5 = x9.f25488a.c(c0VarR, 6);
                        androidx.compose.ui.text.y3 y3VarN5 = clVarC5.n();
                        u4 u4Var5 = u4.f25148a;
                        function2N = n(y3VarN5, u4Var5.c(c0VarR, 6), function6);
                        Intrinsics.checkNotNull(function2N);
                        function2N2 = n(clVarC5.d(), u4Var5.d(c0VarR, 6), function15);
                        function2N3 = n(clVarC5.m(), u4Var5.c(c0VarR, 6), function16);
                        function2N4 = n(clVarC5.f(), u4Var5.c(c0VarR, 6), function17);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.p9
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return s9.h((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        a0VarE = androidx.compose.ui.semantics.t.e(a0Var3, true, (Function1) objI0);
                        if (function2N2 != null) {
                            if (function2N3 == null) {
                                c0VarR.E(-961499943);
                                yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                                c0VarR = c0VarR;
                                c0VarR.A();
                            } else {
                                c0VarR.E(-961499943);
                                yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                                c0VarR = c0VarR;
                                c0VarR.A();
                            }
                        } else if (function2N3 == null) {
                            c0VarR.E(-961499943);
                            yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                            c0VarR = c0VarR;
                            c0VarR.A();
                        } else {
                            c0VarR.E(-961499943);
                            yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                            c0VarR = c0VarR;
                            c0VarR.A();
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function12 = function15;
                        z12 = z13;
                        function13 = function16;
                        function11 = function14;
                        function10 = function17;
                        a0Var2 = a0Var3;
                    } else {
                        c0VarR.u();
                        a0Var2 = a0Var;
                        z12 = z10;
                        function10 = function5;
                        function11 = function7;
                        function12 = function8;
                        function13 = function9;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.q9
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return s9.i(a0Var2, function11, function12, z12, function13, function10, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                function9 = function4;
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(function5)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function6)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                }
                if ((i12 & 599187) != 599186) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0VarR.h(z11, i12 & 1)) {
                    if (i22 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i23 != 0) {
                        function14 = null;
                    } else {
                        function14 = function7;
                    }
                    if (i13 != 0) {
                        function15 = null;
                    } else {
                        function15 = function8;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i17 != 0) {
                        function16 = null;
                    } else {
                        function16 = function9;
                    }
                    if (i19 == 0) {
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1618131318, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:87)");
                    }
                    cl clVarC6 = x9.f25488a.c(c0VarR, 6);
                    androidx.compose.ui.text.y3 y3VarN6 = clVarC6.n();
                    u4 u4Var6 = u4.f25148a;
                    function2N = n(y3VarN6, u4Var6.c(c0VarR, 6), function6);
                    Intrinsics.checkNotNull(function2N);
                    function2N2 = n(clVarC6.d(), u4Var6.d(c0VarR, 6), function15);
                    function2N3 = n(clVarC6.m(), u4Var6.c(c0VarR, 6), function16);
                    function2N4 = n(clVarC6.f(), u4Var6.c(c0VarR, 6), function17);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.p9
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return s9.h((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    a0VarE = androidx.compose.ui.semantics.t.e(a0Var3, true, (Function1) objI0);
                    if (function2N2 != null) {
                        if (function2N3 == null) {
                            c0VarR.E(-961499943);
                            yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                            c0VarR = c0VarR;
                            c0VarR.A();
                        } else {
                            c0VarR.E(-961499943);
                            yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                            c0VarR = c0VarR;
                            c0VarR.A();
                        }
                    } else if (function2N3 == null) {
                        c0VarR.E(-961499943);
                        yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                        c0VarR = c0VarR;
                        c0VarR.A();
                    } else {
                        c0VarR.E(-961499943);
                        yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                        c0VarR = c0VarR;
                        c0VarR.A();
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function12 = function15;
                    z12 = z13;
                    function13 = function16;
                    function11 = function14;
                    function10 = function17;
                    a0Var2 = a0Var3;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    z12 = z10;
                    function10 = function5;
                    function11 = function7;
                    function12 = function8;
                    function13 = function9;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.q9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return s9.i(a0Var2, function11, function12, z12, function13, function10, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    function9 = function4;
                    if (c0VarR.k0(function9)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(function5)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function6)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                }
                if ((i12 & 599187) != 599186) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0VarR.h(z11, i12 & 1)) {
                    if (i22 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i23 != 0) {
                        function14 = null;
                    } else {
                        function14 = function7;
                    }
                    if (i13 != 0) {
                        function15 = null;
                    } else {
                        function15 = function8;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i17 != 0) {
                        function16 = null;
                    } else {
                        function16 = function9;
                    }
                    if (i19 == 0) {
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1618131318, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:87)");
                    }
                    cl clVarC7 = x9.f25488a.c(c0VarR, 6);
                    androidx.compose.ui.text.y3 y3VarN7 = clVarC7.n();
                    u4 u4Var7 = u4.f25148a;
                    function2N = n(y3VarN7, u4Var7.c(c0VarR, 6), function6);
                    Intrinsics.checkNotNull(function2N);
                    function2N2 = n(clVarC7.d(), u4Var7.d(c0VarR, 6), function15);
                    function2N3 = n(clVarC7.m(), u4Var7.c(c0VarR, 6), function16);
                    function2N4 = n(clVarC7.f(), u4Var7.c(c0VarR, 6), function17);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.p9
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return s9.h((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    a0VarE = androidx.compose.ui.semantics.t.e(a0Var3, true, (Function1) objI0);
                    if (function2N2 != null) {
                        if (function2N3 == null) {
                            c0VarR.E(-961499943);
                            yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                            c0VarR = c0VarR;
                            c0VarR.A();
                        } else {
                            c0VarR.E(-961499943);
                            yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                            c0VarR = c0VarR;
                            c0VarR.A();
                        }
                    } else if (function2N3 == null) {
                        c0VarR.E(-961499943);
                        yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                        c0VarR = c0VarR;
                        c0VarR.A();
                    } else {
                        c0VarR.E(-961499943);
                        yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                        c0VarR = c0VarR;
                        c0VarR.A();
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function12 = function15;
                    z12 = z13;
                    function13 = function16;
                    function11 = function14;
                    function10 = function17;
                    a0Var2 = a0Var3;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    z12 = z10;
                    function10 = function5;
                    function11 = function7;
                    function12 = function8;
                    function13 = function9;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.q9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return s9.i(a0Var2, function11, function12, z12, function13, function10, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            function9 = function4;
            i19 = i11 & 32;
            if (i19 != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(function5)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(function6)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i12 |= i21;
            }
            if ((i12 & 599187) != 599186) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i12 & 1)) {
                if (i22 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var;
                }
                if (i23 != 0) {
                    function14 = null;
                } else {
                    function14 = function7;
                }
                if (i13 != 0) {
                    function15 = null;
                } else {
                    function15 = function8;
                }
                if (i15 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if (i17 != 0) {
                    function16 = null;
                } else {
                    function16 = function9;
                }
                if (i19 == 0) {
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1618131318, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:87)");
                }
                cl clVarC8 = x9.f25488a.c(c0VarR, 6);
                androidx.compose.ui.text.y3 y3VarN8 = clVarC8.n();
                u4 u4Var8 = u4.f25148a;
                function2N = n(y3VarN8, u4Var8.c(c0VarR, 6), function6);
                Intrinsics.checkNotNull(function2N);
                function2N2 = n(clVarC8.d(), u4Var8.d(c0VarR, 6), function15);
                function2N3 = n(clVarC8.m(), u4Var8.c(c0VarR, 6), function16);
                function2N4 = n(clVarC8.f(), u4Var8.c(c0VarR, 6), function17);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material.p9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s9.h((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                a0VarE = androidx.compose.ui.semantics.t.e(a0Var3, true, (Function1) objI0);
                if (function2N2 != null) {
                    if (function2N3 == null) {
                        c0VarR.E(-961499943);
                        yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                        c0VarR = c0VarR;
                        c0VarR.A();
                    } else {
                        c0VarR.E(-961499943);
                        yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                        c0VarR = c0VarR;
                        c0VarR.A();
                    }
                } else if (function2N3 == null) {
                    c0VarR.E(-961499943);
                    yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                    c0VarR = c0VarR;
                    c0VarR.A();
                } else {
                    c0VarR.E(-961499943);
                    yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                    c0VarR = c0VarR;
                    c0VarR.A();
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function12 = function15;
                z12 = z13;
                function13 = function16;
                function11 = function14;
                function10 = function17;
                a0Var2 = a0Var3;
            } else {
                c0VarR.u();
                a0Var2 = a0Var;
                z12 = z10;
                function10 = function5;
                function11 = function7;
                function12 = function8;
                function13 = function9;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.q9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return s9.i(a0Var2, function11, function12, z12, function13, function10, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        function7 = function2;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                function8 = function3;
                if (c0VarR.k0(function8)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    if (c0VarR.G(z10)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        function9 = function4;
                        if (c0VarR.k0(function9)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        i12 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(function5)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 64) != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(function6)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i12 |= i21;
                    }
                    if ((i12 & 599187) != 599186) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c0VarR.h(z11, i12 & 1)) {
                        if (i22 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i23 != 0) {
                            function14 = null;
                        } else {
                            function14 = function7;
                        }
                        if (i13 != 0) {
                            function15 = null;
                        } else {
                            function15 = function8;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i17 != 0) {
                            function16 = null;
                        } else {
                            function16 = function9;
                        }
                        if (i19 == 0) {
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1618131318, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:87)");
                        }
                        cl clVarC9 = x9.f25488a.c(c0VarR, 6);
                        androidx.compose.ui.text.y3 y3VarN9 = clVarC9.n();
                        u4 u4Var9 = u4.f25148a;
                        function2N = n(y3VarN9, u4Var9.c(c0VarR, 6), function6);
                        Intrinsics.checkNotNull(function2N);
                        function2N2 = n(clVarC9.d(), u4Var9.d(c0VarR, 6), function15);
                        function2N3 = n(clVarC9.m(), u4Var9.c(c0VarR, 6), function16);
                        function2N4 = n(clVarC9.f(), u4Var9.c(c0VarR, 6), function17);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.p9
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return s9.h((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        a0VarE = androidx.compose.ui.semantics.t.e(a0Var3, true, (Function1) objI0);
                        if (function2N2 != null) {
                            if (function2N3 == null) {
                                c0VarR.E(-961499943);
                                yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                                c0VarR = c0VarR;
                                c0VarR.A();
                            } else {
                                c0VarR.E(-961499943);
                                yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                                c0VarR = c0VarR;
                                c0VarR.A();
                            }
                        } else if (function2N3 == null) {
                            c0VarR.E(-961499943);
                            yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                            c0VarR = c0VarR;
                            c0VarR.A();
                        } else {
                            c0VarR.E(-961499943);
                            yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                            c0VarR = c0VarR;
                            c0VarR.A();
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        function12 = function15;
                        z12 = z13;
                        function13 = function16;
                        function11 = function14;
                        function10 = function17;
                        a0Var2 = a0Var3;
                    } else {
                        c0VarR.u();
                        a0Var2 = a0Var;
                        z12 = z10;
                        function10 = function5;
                        function11 = function7;
                        function12 = function8;
                        function13 = function9;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.q9
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return s9.i(a0Var2, function11, function12, z12, function13, function10, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                function9 = function4;
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(function5)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function6)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                }
                if ((i12 & 599187) != 599186) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0VarR.h(z11, i12 & 1)) {
                    if (i22 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i23 != 0) {
                        function14 = null;
                    } else {
                        function14 = function7;
                    }
                    if (i13 != 0) {
                        function15 = null;
                    } else {
                        function15 = function8;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i17 != 0) {
                        function16 = null;
                    } else {
                        function16 = function9;
                    }
                    if (i19 == 0) {
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1618131318, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:87)");
                    }
                    cl clVarC10 = x9.f25488a.c(c0VarR, 6);
                    androidx.compose.ui.text.y3 y3VarN10 = clVarC10.n();
                    u4 u4Var10 = u4.f25148a;
                    function2N = n(y3VarN10, u4Var10.c(c0VarR, 6), function6);
                    Intrinsics.checkNotNull(function2N);
                    function2N2 = n(clVarC10.d(), u4Var10.d(c0VarR, 6), function15);
                    function2N3 = n(clVarC10.m(), u4Var10.c(c0VarR, 6), function16);
                    function2N4 = n(clVarC10.f(), u4Var10.c(c0VarR, 6), function17);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.p9
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return s9.h((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    a0VarE = androidx.compose.ui.semantics.t.e(a0Var3, true, (Function1) objI0);
                    if (function2N2 != null) {
                        if (function2N3 == null) {
                            c0VarR.E(-961499943);
                            yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                            c0VarR = c0VarR;
                            c0VarR.A();
                        } else {
                            c0VarR.E(-961499943);
                            yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                            c0VarR = c0VarR;
                            c0VarR.A();
                        }
                    } else if (function2N3 == null) {
                        c0VarR.E(-961499943);
                        yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                        c0VarR = c0VarR;
                        c0VarR.A();
                    } else {
                        c0VarR.E(-961499943);
                        yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                        c0VarR = c0VarR;
                        c0VarR.A();
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function12 = function15;
                    z12 = z13;
                    function13 = function16;
                    function11 = function14;
                    function10 = function17;
                    a0Var2 = a0Var3;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    z12 = z10;
                    function10 = function5;
                    function11 = function7;
                    function12 = function8;
                    function13 = function9;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.q9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return s9.i(a0Var2, function11, function12, z12, function13, function10, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    function9 = function4;
                    if (c0VarR.k0(function9)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(function5)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function6)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                }
                if ((i12 & 599187) != 599186) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0VarR.h(z11, i12 & 1)) {
                    if (i22 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i23 != 0) {
                        function14 = null;
                    } else {
                        function14 = function7;
                    }
                    if (i13 != 0) {
                        function15 = null;
                    } else {
                        function15 = function8;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i17 != 0) {
                        function16 = null;
                    } else {
                        function16 = function9;
                    }
                    if (i19 == 0) {
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1618131318, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:87)");
                    }
                    cl clVarC11 = x9.f25488a.c(c0VarR, 6);
                    androidx.compose.ui.text.y3 y3VarN11 = clVarC11.n();
                    u4 u4Var11 = u4.f25148a;
                    function2N = n(y3VarN11, u4Var11.c(c0VarR, 6), function6);
                    Intrinsics.checkNotNull(function2N);
                    function2N2 = n(clVarC11.d(), u4Var11.d(c0VarR, 6), function15);
                    function2N3 = n(clVarC11.m(), u4Var11.c(c0VarR, 6), function16);
                    function2N4 = n(clVarC11.f(), u4Var11.c(c0VarR, 6), function17);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.p9
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return s9.h((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    a0VarE = androidx.compose.ui.semantics.t.e(a0Var3, true, (Function1) objI0);
                    if (function2N2 != null) {
                        if (function2N3 == null) {
                            c0VarR.E(-961499943);
                            yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                            c0VarR = c0VarR;
                            c0VarR.A();
                        } else {
                            c0VarR.E(-961499943);
                            yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                            c0VarR = c0VarR;
                            c0VarR.A();
                        }
                    } else if (function2N3 == null) {
                        c0VarR.E(-961499943);
                        yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                        c0VarR = c0VarR;
                        c0VarR.A();
                    } else {
                        c0VarR.E(-961499943);
                        yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                        c0VarR = c0VarR;
                        c0VarR.A();
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function12 = function15;
                    z12 = z13;
                    function13 = function16;
                    function11 = function14;
                    function10 = function17;
                    a0Var2 = a0Var3;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    z12 = z10;
                    function10 = function5;
                    function11 = function7;
                    function12 = function8;
                    function13 = function9;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.q9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return s9.i(a0Var2, function11, function12, z12, function13, function10, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            function9 = function4;
            i19 = i11 & 32;
            if (i19 != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(function5)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(function6)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i12 |= i21;
            }
            if ((i12 & 599187) != 599186) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i12 & 1)) {
                if (i22 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var;
                }
                if (i23 != 0) {
                    function14 = null;
                } else {
                    function14 = function7;
                }
                if (i13 != 0) {
                    function15 = null;
                } else {
                    function15 = function8;
                }
                if (i15 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if (i17 != 0) {
                    function16 = null;
                } else {
                    function16 = function9;
                }
                if (i19 == 0) {
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1618131318, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:87)");
                }
                cl clVarC12 = x9.f25488a.c(c0VarR, 6);
                androidx.compose.ui.text.y3 y3VarN12 = clVarC12.n();
                u4 u4Var12 = u4.f25148a;
                function2N = n(y3VarN12, u4Var12.c(c0VarR, 6), function6);
                Intrinsics.checkNotNull(function2N);
                function2N2 = n(clVarC12.d(), u4Var12.d(c0VarR, 6), function15);
                function2N3 = n(clVarC12.m(), u4Var12.c(c0VarR, 6), function16);
                function2N4 = n(clVarC12.f(), u4Var12.c(c0VarR, 6), function17);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material.p9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s9.h((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                a0VarE = androidx.compose.ui.semantics.t.e(a0Var3, true, (Function1) objI0);
                if (function2N2 != null) {
                    if (function2N3 == null) {
                        c0VarR.E(-961499943);
                        yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                        c0VarR = c0VarR;
                        c0VarR.A();
                    } else {
                        c0VarR.E(-961499943);
                        yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                        c0VarR = c0VarR;
                        c0VarR.A();
                    }
                } else if (function2N3 == null) {
                    c0VarR.E(-961499943);
                    yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                    c0VarR = c0VarR;
                    c0VarR.A();
                } else {
                    c0VarR.E(-961499943);
                    yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                    c0VarR = c0VarR;
                    c0VarR.A();
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function12 = function15;
                z12 = z13;
                function13 = function16;
                function11 = function14;
                function10 = function17;
                a0Var2 = a0Var3;
            } else {
                c0VarR.u();
                a0Var2 = a0Var;
                z12 = z10;
                function10 = function5;
                function11 = function7;
                function12 = function8;
                function13 = function9;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.q9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return s9.i(a0Var2, function11, function12, z12, function13, function10, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        function8 = function3;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                if (c0VarR.G(z10)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    function9 = function4;
                    if (c0VarR.k0(function9)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(function5)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function6)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                }
                if ((i12 & 599187) != 599186) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0VarR.h(z11, i12 & 1)) {
                    if (i22 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i23 != 0) {
                        function14 = null;
                    } else {
                        function14 = function7;
                    }
                    if (i13 != 0) {
                        function15 = null;
                    } else {
                        function15 = function8;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i17 != 0) {
                        function16 = null;
                    } else {
                        function16 = function9;
                    }
                    if (i19 == 0) {
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1618131318, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:87)");
                    }
                    cl clVarC13 = x9.f25488a.c(c0VarR, 6);
                    androidx.compose.ui.text.y3 y3VarN13 = clVarC13.n();
                    u4 u4Var13 = u4.f25148a;
                    function2N = n(y3VarN13, u4Var13.c(c0VarR, 6), function6);
                    Intrinsics.checkNotNull(function2N);
                    function2N2 = n(clVarC13.d(), u4Var13.d(c0VarR, 6), function15);
                    function2N3 = n(clVarC13.m(), u4Var13.c(c0VarR, 6), function16);
                    function2N4 = n(clVarC13.f(), u4Var13.c(c0VarR, 6), function17);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.p9
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return s9.h((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    a0VarE = androidx.compose.ui.semantics.t.e(a0Var3, true, (Function1) objI0);
                    if (function2N2 != null) {
                        if (function2N3 == null) {
                            c0VarR.E(-961499943);
                            yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                            c0VarR = c0VarR;
                            c0VarR.A();
                        } else {
                            c0VarR.E(-961499943);
                            yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                            c0VarR = c0VarR;
                            c0VarR.A();
                        }
                    } else if (function2N3 == null) {
                        c0VarR.E(-961499943);
                        yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                        c0VarR = c0VarR;
                        c0VarR.A();
                    } else {
                        c0VarR.E(-961499943);
                        yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                        c0VarR = c0VarR;
                        c0VarR.A();
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function12 = function15;
                    z12 = z13;
                    function13 = function16;
                    function11 = function14;
                    function10 = function17;
                    a0Var2 = a0Var3;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    z12 = z10;
                    function10 = function5;
                    function11 = function7;
                    function12 = function8;
                    function13 = function9;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.q9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return s9.i(a0Var2, function11, function12, z12, function13, function10, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            function9 = function4;
            i19 = i11 & 32;
            if (i19 != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(function5)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(function6)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i12 |= i21;
            }
            if ((i12 & 599187) != 599186) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i12 & 1)) {
                if (i22 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var;
                }
                if (i23 != 0) {
                    function14 = null;
                } else {
                    function14 = function7;
                }
                if (i13 != 0) {
                    function15 = null;
                } else {
                    function15 = function8;
                }
                if (i15 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if (i17 != 0) {
                    function16 = null;
                } else {
                    function16 = function9;
                }
                if (i19 == 0) {
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1618131318, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:87)");
                }
                cl clVarC14 = x9.f25488a.c(c0VarR, 6);
                androidx.compose.ui.text.y3 y3VarN14 = clVarC14.n();
                u4 u4Var14 = u4.f25148a;
                function2N = n(y3VarN14, u4Var14.c(c0VarR, 6), function6);
                Intrinsics.checkNotNull(function2N);
                function2N2 = n(clVarC14.d(), u4Var14.d(c0VarR, 6), function15);
                function2N3 = n(clVarC14.m(), u4Var14.c(c0VarR, 6), function16);
                function2N4 = n(clVarC14.f(), u4Var14.c(c0VarR, 6), function17);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material.p9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s9.h((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                a0VarE = androidx.compose.ui.semantics.t.e(a0Var3, true, (Function1) objI0);
                if (function2N2 != null) {
                    if (function2N3 == null) {
                        c0VarR.E(-961499943);
                        yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                        c0VarR = c0VarR;
                        c0VarR.A();
                    } else {
                        c0VarR.E(-961499943);
                        yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                        c0VarR = c0VarR;
                        c0VarR.A();
                    }
                } else if (function2N3 == null) {
                    c0VarR.E(-961499943);
                    yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                    c0VarR = c0VarR;
                    c0VarR.A();
                } else {
                    c0VarR.E(-961499943);
                    yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                    c0VarR = c0VarR;
                    c0VarR.A();
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function12 = function15;
                z12 = z13;
                function13 = function16;
                function11 = function14;
                function10 = function17;
                a0Var2 = a0Var3;
            } else {
                c0VarR.u();
                a0Var2 = a0Var;
                z12 = z10;
                function10 = function5;
                function11 = function7;
                function12 = function8;
                function13 = function9;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.q9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return s9.i(a0Var2, function11, function12, z12, function13, function10, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((i10 & 24576) == 0) {
                function9 = function4;
                if (c0VarR.k0(function9)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            i19 = i11 & 32;
            if (i19 != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(function5)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(function6)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i12 |= i21;
            }
            if ((i12 & 599187) != 599186) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i12 & 1)) {
                if (i22 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var;
                }
                if (i23 != 0) {
                    function14 = null;
                } else {
                    function14 = function7;
                }
                if (i13 != 0) {
                    function15 = null;
                } else {
                    function15 = function8;
                }
                if (i15 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if (i17 != 0) {
                    function16 = null;
                } else {
                    function16 = function9;
                }
                if (i19 == 0) {
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1618131318, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:87)");
                }
                cl clVarC15 = x9.f25488a.c(c0VarR, 6);
                androidx.compose.ui.text.y3 y3VarN15 = clVarC15.n();
                u4 u4Var15 = u4.f25148a;
                function2N = n(y3VarN15, u4Var15.c(c0VarR, 6), function6);
                Intrinsics.checkNotNull(function2N);
                function2N2 = n(clVarC15.d(), u4Var15.d(c0VarR, 6), function15);
                function2N3 = n(clVarC15.m(), u4Var15.c(c0VarR, 6), function16);
                function2N4 = n(clVarC15.f(), u4Var15.c(c0VarR, 6), function17);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material.p9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s9.h((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                a0VarE = androidx.compose.ui.semantics.t.e(a0Var3, true, (Function1) objI0);
                if (function2N2 != null) {
                    if (function2N3 == null) {
                        c0VarR.E(-961499943);
                        yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                        c0VarR = c0VarR;
                        c0VarR.A();
                    } else {
                        c0VarR.E(-961499943);
                        yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                        c0VarR = c0VarR;
                        c0VarR.A();
                    }
                } else if (function2N3 == null) {
                    c0VarR.E(-961499943);
                    yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                    c0VarR = c0VarR;
                    c0VarR.A();
                } else {
                    c0VarR.E(-961499943);
                    yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                    c0VarR = c0VarR;
                    c0VarR.A();
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function12 = function15;
                z12 = z13;
                function13 = function16;
                function11 = function14;
                function10 = function17;
                a0Var2 = a0Var3;
            } else {
                c0VarR.u();
                a0Var2 = a0Var;
                z12 = z10;
                function10 = function5;
                function11 = function7;
                function12 = function8;
                function13 = function9;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.q9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return s9.i(a0Var2, function11, function12, z12, function13, function10, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        function9 = function4;
        i19 = i11 & 32;
        if (i19 != 0) {
            i12 |= androidx.profileinstaller.n.c.f73814m;
        } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
            if (c0VarR.k0(function5)) {
                i20 = 131072;
            } else {
                i20 = 65536;
            }
            i12 |= i20;
        }
        if ((i11 & 64) != 0) {
            i12 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c0VarR.k0(function6)) {
                i21 = 1048576;
            } else {
                i21 = 524288;
            }
            i12 |= i21;
        }
        if ((i12 & 599187) != 599186) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c0VarR.h(z11, i12 & 1)) {
            if (i22 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var;
            }
            if (i23 != 0) {
                function14 = null;
            } else {
                function14 = function7;
            }
            if (i13 != 0) {
                function15 = null;
            } else {
                function15 = function8;
            }
            if (i15 != 0) {
                z13 = true;
            } else {
                z13 = z10;
            }
            if (i17 != 0) {
                function16 = null;
            } else {
                function16 = function9;
            }
            if (i19 == 0) {
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1618131318, i12, -1, "androidx.compose.material.ListItem (ListItem.kt:87)");
            }
            cl clVarC16 = x9.f25488a.c(c0VarR, 6);
            androidx.compose.ui.text.y3 y3VarN16 = clVarC16.n();
            u4 u4Var16 = u4.f25148a;
            function2N = n(y3VarN16, u4Var16.c(c0VarR, 6), function6);
            Intrinsics.checkNotNull(function2N);
            function2N2 = n(clVarC16.d(), u4Var16.d(c0VarR, 6), function15);
            function2N3 = n(clVarC16.m(), u4Var16.c(c0VarR, 6), function16);
            function2N4 = n(clVarC16.f(), u4Var16.c(c0VarR, 6), function17);
            objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material.p9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return s9.h((androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            a0VarE = androidx.compose.ui.semantics.t.e(a0Var3, true, (Function1) objI0);
            if (function2N2 != null) {
                if (function2N3 == null) {
                    c0VarR.E(-961499943);
                    yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                    c0VarR = c0VarR;
                    c0VarR.A();
                } else {
                    c0VarR.E(-961499943);
                    yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                    c0VarR = c0VarR;
                    c0VarR.A();
                }
            } else if (function2N3 == null) {
                c0VarR.E(-961499943);
                yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                c0VarR = c0VarR;
                c0VarR.A();
            } else {
                c0VarR.E(-961499943);
                yk.f25754a.b(a0VarE, function14, function2N, function2N2, function2N3, function2N4, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 1572864, 0);
                c0VarR = c0VarR;
                c0VarR.A();
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            function12 = function15;
            z12 = z13;
            function13 = function16;
            function11 = function14;
            function10 = function17;
            a0Var2 = a0Var3;
        } else {
            c0VarR.u();
            a0Var2 = a0Var;
            z12 = z10;
            function10 = function5;
            function11 = function7;
            function12 = function8;
            function13 = function9;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.q9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return s9.i(a0Var2, function11, function12, z12, function13, function10, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(androidx.compose.ui.semantics.e0 e0Var) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(androidx.compose.ui.a0 a0Var, Function2 function2, Function2 function3, boolean z10, Function2 function4, Function2 function5, Function2 function6, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        g(a0Var, function2, function3, z10, function4, function5, function6, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void j(final float f10, androidx.compose.ui.a0 a0Var, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(953221030);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.I(f10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.D(a0Var) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= androidx.media3.exoplayer.a5.S0;
        } else if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i12 |= c0VarR.k0(function2) ? 256 : 128;
        }
        if (c0VarR.h((i12 & com.planner5d.library.engine.input.f.b.F1) != 146, i12 & 1)) {
            if (i13 != 0) {
                a0Var = androidx.compose.ui.a0.E;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(953221030, i12, -1, "androidx.compose.material.OffsetToBaselineOrCenter (ListItem.kt:403)");
            }
            boolean z10 = (i12 & 14) == 4;
            Object objI0 = c0VarR.i0();
            if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new b(f10);
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.layout.a1 a1Var = (androidx.compose.ui.layout.a1) objI0;
            int i14 = (i12 & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 6) & 14);
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0Var);
            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar.a();
            int i15 = ((i14 << 6) & 896) | 6;
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD, a1Var, aVar.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
            function2.invoke(c0VarR, Integer.valueOf((i15 >> 6) & 14));
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        final androidx.compose.ui.a0 a0Var2 = a0Var;
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.o9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return s9.k(f10, a0Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(float f10, androidx.compose.ui.a0 a0Var, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        j(f10, a0Var, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    private static final Function2<androidx.compose.runtime.c0, Integer, Unit> n(androidx.compose.ui.text.y3 y3Var, float f10, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
        if (function2 == null) {
            return null;
        }
        return androidx.compose.runtime.internal.w.c(-1000595778, true, new c(f10, y3Var, new androidx.compose.ui.text.style.h(androidx.compose.ui.text.style.h.a.f42184b.c(), androidx.compose.ui.text.style.h.d.f42194b.a(), (DefaultConstructorMarker) null), function2));
    }
}
