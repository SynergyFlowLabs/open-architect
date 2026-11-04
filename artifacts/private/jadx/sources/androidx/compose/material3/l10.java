package androidx.compose.material3;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,445:1\n113#2:446\n113#2:525\n113#2:613\n113#2:773\n113#2:774\n113#2:775\n113#2:776\n113#2:777\n113#2:778\n113#2:779\n113#2:780\n87#3:447\n84#3,9:448\n94#3:612\n79#4,6:457\n86#4,3:472\n89#4,2:481\n79#4,6:494\n86#4,3:509\n89#4,2:518\n93#4:523\n79#4,6:536\n86#4,3:551\n89#4,2:560\n79#4,6:574\n86#4,3:589\n89#4,2:598\n93#4:603\n93#4:607\n93#4:611\n79#4,6:620\n86#4,3:635\n89#4,2:644\n79#4,6:657\n86#4,3:672\n89#4,2:681\n93#4:686\n79#4,6:698\n86#4,3:713\n89#4,2:722\n93#4:727\n79#4,6:739\n86#4,3:754\n89#4,2:763\n93#4:768\n93#4:772\n347#5,9:463\n356#5:483\n347#5,9:500\n356#5,3:520\n347#5,9:542\n356#5:562\n347#5,9:580\n356#5,3:600\n357#5,2:605\n357#5,2:609\n347#5,9:626\n356#5:646\n347#5,9:663\n356#5,3:683\n347#5,9:704\n356#5,3:724\n347#5,9:745\n356#5,3:765\n357#5,2:770\n4206#6,6:475\n4206#6,6:512\n4206#6,6:554\n4206#6,6:592\n4206#6,6:638\n4206#6,6:675\n4206#6,6:716\n4206#6,6:757\n70#7:484\n67#7,9:485\n77#7:524\n70#7:526\n67#7,9:527\n77#7:608\n70#7:647\n67#7,9:648\n77#7:687\n70#7:688\n67#7,9:689\n77#7:728\n70#7:729\n67#7,9:730\n77#7:769\n99#8:563\n95#8,10:564\n106#8:604\n1282#9,6:614\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt\n*L\n238#1:446\n277#1:525\n332#1:613\n437#1:773\n438#1:774\n439#1:775\n440#1:776\n441#1:777\n442#1:778\n443#1:779\n444#1:780\n260#1:447\n260#1:448,9\n260#1:612\n260#1:457,6\n260#1:472,3\n260#1:481,2\n268#1:494,6\n268#1:509,3\n268#1:518,2\n268#1:523\n275#1:536,6\n275#1:551,3\n275#1:560,2\n279#1:574,6\n279#1:589,3\n279#1:598,2\n279#1:603\n275#1:607\n260#1:611\n308#1:620,6\n308#1:635,3\n308#1:644,2\n310#1:657,6\n310#1:672,3\n310#1:681,2\n310#1:686\n312#1:698,6\n312#1:713,3\n312#1:722,2\n312#1:727\n321#1:739,6\n321#1:754,3\n321#1:763,2\n321#1:768\n308#1:772\n260#1:463,9\n260#1:483\n268#1:500,9\n268#1:520,3\n275#1:542,9\n275#1:562\n279#1:580,9\n279#1:600,3\n275#1:605,2\n260#1:609,2\n308#1:626,9\n308#1:646\n310#1:663,9\n310#1:683,3\n312#1:704,9\n312#1:724,3\n321#1:745,9\n321#1:765,3\n308#1:770,2\n260#1:475,6\n268#1:512,6\n275#1:554,6\n279#1:592,6\n308#1:638,6\n310#1:675,6\n312#1:716,6\n321#1:757,6\n268#1:484\n268#1:485,9\n268#1:524\n275#1:526\n275#1:527,9\n275#1:608\n310#1:647\n310#1:648,9\n310#1:687\n312#1:688\n312#1:689,9\n312#1:728\n321#1:729\n321#1:730,9\n321#1:769\n279#1:563\n279#1:564,10\n279#1:604\n334#1:614,6\n*E\n"})
public final class l10 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f30181d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f30184g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f30178a = androidx.compose.ui.unit.h.r(600);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f30179b = androidx.compose.ui.unit.h.r(30);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f30180c = androidx.compose.ui.unit.h.r(16);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f30182e = androidx.compose.ui.unit.h.r(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f30183f = androidx.compose.ui.unit.h.r(6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f30185h = androidx.compose.ui.unit.h.r(12);

    @SourceDebugExtension({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt$OneRowSnackbar$2$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,445:1\n117#2,2:446\n34#2,6:448\n119#2:454\n117#2,2:455\n34#2,6:457\n119#2:463\n563#2,2:464\n34#2,6:466\n565#2:472\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt$OneRowSnackbar$2$1\n*L\n337#1:446,2\n337#1:448,6\n337#1:454\n339#1:455,2\n339#1:457,6\n339#1:463\n350#1:464,2\n350#1:466,6\n350#1:472\n*E\n"})
    static final class a implements androidx.compose.ui.layout.a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f30186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f30187b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30188c;

        a(String str, String str2, String str3) {
            this.f30186a = str;
            this.f30187b = str2;
            this.f30188c = str3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(androidx.compose.ui.layout.i2 i2Var, int i10, androidx.compose.ui.layout.i2 i2Var2, int i11, int i12, androidx.compose.ui.layout.i2 i2Var3, int i13, int i14, androidx.compose.ui.layout.i2.a aVar) {
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, 0, i10, 0.0f, 4, null);
            if (i2Var2 != null) {
                androidx.compose.ui.layout.i2.a.e0(aVar, i2Var2, i11, i12, 0.0f, 4, null);
            }
            if (i2Var3 != null) {
                androidx.compose.ui.layout.i2.a.e0(aVar, i2Var3, i13, i14, 0.0f, 4, null);
            }
            return Unit.f312394a;
        }

        /* JADX WARN: Code duplicated, block: B:60:0x012d A[PHI: r3 r5
          0x012d: PHI (r3v8 int) = (r3v7 int), (r3v16 int), (r3v16 int) binds: [B:63:0x0150, B:56:0x011e, B:58:0x0128] A[DONT_GENERATE, DONT_INLINE]
          0x012d: PHI (r5v10 int) = (r5v9 int), (r5v16 int), (r5v16 int) binds: [B:63:0x0150, B:56:0x011e, B:58:0x0128] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // androidx.compose.ui.layout.a1
        public final androidx.compose.ui.layout.b1 a(androidx.compose.ui.layout.c1 c1Var, List<? extends androidx.compose.ui.layout.z0> list, long j10) {
            androidx.compose.ui.layout.z0 z0Var;
            androidx.compose.ui.layout.z0 z0Var2;
            int iG6;
            int iMax;
            int iC1;
            int iM;
            androidx.compose.ui.layout.c1 c1Var2 = c1Var;
            int iMin = Math.min(androidx.compose.ui.unit.b.p(j10), c1Var2.g6(l10.f30178a));
            String str = this.f30186a;
            List<? extends androidx.compose.ui.layout.z0> list2 = list;
            int size = list2.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z0Var = null;
                    break;
                }
                z0Var = list.get(i10);
                if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var), str)) {
                    break;
                }
                i10++;
            }
            androidx.compose.ui.layout.z0 z0Var3 = z0Var;
            androidx.compose.ui.layout.i2 i2VarP0 = z0Var3 != null ? z0Var3.P0(j10) : null;
            String str2 = this.f30187b;
            int size2 = list2.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    z0Var2 = null;
                    break;
                }
                z0Var2 = list.get(i11);
                if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var2), str2)) {
                    break;
                }
                i11++;
            }
            androidx.compose.ui.layout.z0 z0Var4 = z0Var2;
            final androidx.compose.ui.layout.i2 i2VarP1 = z0Var4 != null ? z0Var4.P0(j10) : null;
            int iH1 = i2VarP0 != null ? i2VarP0.h1() : 0;
            int iC2 = i2VarP0 != null ? i2VarP0.c1() : 0;
            int iH2 = i2VarP1 != null ? i2VarP1.h1() : 0;
            int iC3 = i2VarP1 != null ? i2VarP1.c1() : 0;
            int iU = kotlin.ranges.r.u(((iMin - iH1) - iH2) - (iH2 == 0 ? c1Var2.g6(l10.f30184g) : 0), androidx.compose.ui.unit.b.r(j10));
            String str3 = this.f30188c;
            int size3 = list2.size();
            int i12 = 0;
            while (i12 < size3) {
                androidx.compose.ui.layout.z0 z0Var5 = list.get(i12);
                if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var5), str3)) {
                    int i13 = iC3;
                    final androidx.compose.ui.layout.i2 i2VarP2 = z0Var5.P0(androidx.compose.ui.unit.b.d(j10, 0, iU, 0, 0, 9, null));
                    int iM2 = i2VarP2.M(androidx.compose.ui.layout.b.a());
                    int iM3 = i2VarP2.M(androidx.compose.ui.layout.b.b());
                    boolean z10 = true;
                    boolean z11 = (iM2 == Integer.MIN_VALUE || iM3 == Integer.MIN_VALUE) ? false : true;
                    if (iM2 != iM3 && z11) {
                        z10 = false;
                    }
                    final int i14 = iMin - iH2;
                    final int i15 = i14 - iH1;
                    if (z10) {
                        iMax = Math.max(c1Var2.g6(d0.o2.f268595a.n()), Math.max(iC2, i13));
                        iG6 = (iMax - i2VarP2.c1()) / 2;
                        if (i2VarP0 == null || (iM = i2VarP0.M(androidx.compose.ui.layout.b.a())) == Integer.MIN_VALUE) {
                            iC1 = 0;
                        } else {
                            iC1 = (iM2 + iG6) - iM;
                        }
                    } else {
                        iG6 = c1Var2.g6(l10.f30179b) - iM2;
                        iMax = Math.max(c1Var2.g6(d0.o2.f268595a.q()), i2VarP2.c1() + iG6);
                        if (i2VarP0 != null) {
                            iC1 = (iMax - i2VarP0.c1()) / 2;
                        } else {
                            iC1 = 0;
                        }
                    }
                    final int i16 = iC1;
                    int i17 = iMax;
                    final int i18 = iG6;
                    final int iC4 = i2VarP1 != null ? (i17 - i2VarP1.c1()) / 2 : 0;
                    final androidx.compose.ui.layout.i2 i2Var = i2VarP0;
                    return androidx.compose.ui.layout.c1.h6(c1Var2, iMin, i17, null, new Function1() { // from class: androidx.compose.material3.k10
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return l10.a.g(i2VarP2, i18, i2VarP1, i14, iC4, i2Var, i15, i16, (androidx.compose.ui.layout.i2.a) obj);
                        }
                    }, 4, null);
                }
                i12++;
                iC3 = iC3;
                c1Var2 = c1Var;
            }
            androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
            throw new kotlin.a0();
        }
    }

    static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f30189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f30190b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f30191c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f30192d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f30193e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f30194f;

        static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f30195a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f30196b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f30197c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f30198d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.text.y3 f30199e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ long f30200f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ long f30201g;

            /* JADX WARN: Multi-variable type inference failed */
            a(boolean z10, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, androidx.compose.ui.text.y3 y3Var, long j10, long j11) {
                this.f30195a = z10;
                this.f30196b = function2;
                this.f30197c = function3;
                this.f30198d = function4;
                this.f30199e = y3Var;
                this.f30200f = j10;
                this.f30201g = j11;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(969655473, i10, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:121)");
                }
                if (!this.f30195a || this.f30196b == null) {
                    c0Var.E(-168976609);
                    l10.g(this.f30197c, this.f30196b, this.f30198d, this.f30199e, this.f30200f, this.f30201g, c0Var, 0);
                    c0Var.A();
                } else {
                    c0Var.E(-168990288);
                    l10.e(this.f30197c, this.f30196b, this.f30198d, this.f30199e, this.f30200f, this.f30201g, c0Var, 0);
                    c0Var.A();
                }
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
        b(boolean z10, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, long j10, long j11) {
            this.f30189a = z10;
            this.f30190b = function2;
            this.f30191c = function3;
            this.f30192d = function4;
            this.f30193e = j10;
            this.f30194f = j11;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1343524879, i10, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:118)");
            }
            d0.o2 o2Var = d0.o2.f268595a;
            androidx.compose.runtime.a1.e(q50.I().f(la0.e(o2Var.p(), c0Var, 6)), androidx.compose.runtime.internal.w.e(969655473, true, new a(this.f30189a, this.f30190b, this.f30191c, this.f30192d, la0.e(o2Var.d(), c0Var, 6), this.f30193e, this.f30194f), c0Var, 54), c0Var, androidx.compose.runtime.n4.f36267i | 48);
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

    static final class c implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u00 f30202a;

        c(u00 u00Var) {
            this.f30202a = u00Var;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1266389126, i10, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:246)");
            }
            q50.t(this.f30202a.a().Q(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var, 0, 0, 262142);
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

    @SourceDebugExtension({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt$Snackbar$actionComposable$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,445:1\n1282#2,6:446\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt$Snackbar$actionComposable$1\n*L\n214#1:446,6\n*E\n"})
    static final class d implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f30203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u00 f30204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30205c;

        static final class a implements pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f30206a;

            a(String str) {
                this.f30206a = str;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.foundation.layout.x5 x5Var, androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 17) != 16, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(521110564, i10, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:214)");
                }
                q50.t(this.f30206a, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var, 0, 0, 262142);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            }

            @Override // pj.n
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.x5 x5Var, androidx.compose.runtime.c0 c0Var, Integer num) {
                c(x5Var, c0Var, num.intValue());
                return Unit.f312394a;
            }
        }

        d(long j10, u00 u00Var, String str) {
            this.f30203a = j10;
            this.f30204b = u00Var;
            this.f30205c = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(u00 u00Var) {
            u00Var.R();
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void d(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1378313599, i10, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:211)");
            }
            r3 r3VarG = s3.f32666a.G(0L, this.f30203a, 0L, 0L, c0Var, 24576, 13);
            boolean zD = c0Var.D(this.f30204b);
            final u00 u00Var = this.f30204b;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function0() { // from class: androidx.compose.material3.m10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return l10.d.f(u00Var);
                    }
                };
                c0Var.Y(objI0);
            }
            a4.p((Function0) objI0, null, false, null, r3VarG, null, null, null, null, androidx.compose.runtime.internal.w.e(521110564, true, new a(this.f30205c), c0Var, 54), c0Var, 805306368, 494);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            d(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt$Snackbar$dismissActionComposable$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,445:1\n1282#2,6:446\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt$Snackbar$dismissActionComposable$1\n*L\n225#1:446,6\n*E\n"})
    static final class e implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u00 f30207a;

        e(u00 u00Var) {
            this.f30207a = u00Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(u00 u00Var) {
            u00Var.dismiss();
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void d(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1812633777, i10, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:223)");
            }
            boolean zD = c0Var.D(this.f30207a);
            final u00 u00Var = this.f30207a;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function0() { // from class: androidx.compose.material3.n10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return l10.e.f(u00Var);
                    }
                };
                c0Var.Y(objI0);
            }
            ei.D((Function0) objI0, null, false, null, null, null, y6.f34711a.a(), c0Var, 1572864, 62);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            d(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static {
        float f10 = 8;
        f30181d = androidx.compose.ui.unit.h.r(f10);
        f30184g = androidx.compose.ui.unit.h.r(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v31 */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void e(final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, final androidx.compose.ui.text.y3 y3Var, final long j10, final long j11, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        ?? r10;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-264666338);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(function2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(function3) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.k0(function4) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.D(y3Var) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0VarR.L(j10) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0VarR.L(j11) ? 131072 : 65536;
        }
        if (c0VarR.h((74899 & i11) != 74898, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-264666338, i11, -1, "androidx.compose.material3.NewLineButtonSnackbar (Snackbar.kt:258)");
            }
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarV = androidx.compose.foundation.layout.d5.v(androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.i6.D(aVar, 0.0f, f30178a, 1, null), 0.0f, 1, null), f30180c, 0.0f, 0.0f, f30182e, 6, null);
            androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
            androidx.compose.foundation.layout.q.m mVarY = qVar.y();
            androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
            int i12 = i11;
            androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(mVarY, aVar2.u(), c0VarR, 0);
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarV);
            androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar3.a();
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarB, aVar3.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar3.f());
            androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
            androidx.compose.ui.a0 a0VarJ = androidx.compose.foundation.layout.c.j(aVar, f30179b, f30185h);
            float fR = f30181d;
            androidx.compose.ui.a0 a0VarV2 = androidx.compose.foundation.layout.d5.v(a0VarJ, 0.0f, 0.0f, fR, 0.0f, 11, null);
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
            int iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarV2);
            Function0<androidx.compose.ui.node.g> function0A2 = aVar3.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A2);
            } else {
                c0VarR.l();
            }
            androidx.compose.runtime.c0 c0VarD2 = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD2, a1VarK, aVar3.e());
            androidx.compose.runtime.y7.n(c0VarD2, b1VarK2, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar3.b();
            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iJ2))) {
                c0VarD2.Y(Integer.valueOf(iJ2));
                c0VarD2.f(Integer.valueOf(iJ2), function2B2);
            }
            androidx.compose.runtime.y7.n(c0VarD2, a0VarN2, aVar3.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            function2.invoke(c0VarR, Integer.valueOf(i12 & 14));
            c0VarR.o();
            androidx.compose.ui.a0 a0VarP = n0Var.p(aVar, aVar2.s());
            if (function4 == null) {
                r10 = 0;
            } else {
                r10 = 0;
                fR = androidx.compose.ui.unit.h.r(0);
            }
            androidx.compose.ui.a0 a0VarV3 = androidx.compose.foundation.layout.d5.v(a0VarP, 0.0f, 0.0f, fR, 0.0f, 11, null);
            androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(aVar2.C(), r10);
            int iJ3 = androidx.compose.runtime.v.j(c0VarR, r10);
            androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarV3);
            Function0<androidx.compose.ui.node.g> function0A3 = aVar3.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A3);
            } else {
                c0VarR.l();
            }
            androidx.compose.runtime.c0 c0VarD3 = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD3, a1VarK2, aVar3.e());
            androidx.compose.runtime.y7.n(c0VarD3, b1VarK3, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3 = aVar3.b();
            if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iJ3))) {
                c0VarD3.Y(Integer.valueOf(iJ3));
                c0VarD3.f(Integer.valueOf(iJ3), function2B3);
            }
            androidx.compose.runtime.y7.n(c0VarD3, a0VarN3, aVar3.f());
            androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(qVar.w(), aVar2.w(), c0VarR, 0);
            int iJ4 = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK4 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, aVar);
            Function0<androidx.compose.ui.node.g> function0A4 = aVar3.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A4);
            } else {
                c0VarR.l();
            }
            androidx.compose.runtime.c0 c0VarD4 = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD4, a1VarE, aVar3.e());
            androidx.compose.runtime.y7.n(c0VarD4, b1VarK4, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B4 = aVar3.b();
            if (c0VarD4.P() || !Intrinsics.areEqual(c0VarD4.i0(), Integer.valueOf(iJ4))) {
                c0VarD4.Y(Integer.valueOf(iJ4));
                c0VarD4.f(Integer.valueOf(iJ4), function2B4);
            }
            androidx.compose.runtime.y7.n(c0VarD4, a0VarN4, aVar3.f());
            androidx.compose.foundation.layout.y5 y5Var = androidx.compose.foundation.layout.y5.f16577a;
            androidx.compose.runtime.n4[] n4VarArr = {c7.a().f(androidx.compose.ui.graphics.q0.n(j10)), q50.I().f(y3Var)};
            int i13 = androidx.compose.runtime.n4.f36267i;
            androidx.compose.runtime.a1.f(n4VarArr, function3, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | i13);
            if (function4 != null) {
                c0VarR.E(916269829);
                androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(j11)), function4, c0VarR, i13 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B));
                c0VarR.A();
            } else {
                c0VarR.E(916475483);
                c0VarR.A();
            }
            c0VarR.o();
            c0VarR.o();
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.i10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return l10.f(function2, function3, function4, y3Var, j10, j11, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(Function2 function2, Function2 function3, Function2 function4, androidx.compose.ui.text.y3 y3Var, long j10, long j11, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        e(function2, function3, function4, y3Var, j10, j11, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void g(final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, final androidx.compose.ui.text.y3 y3Var, final long j10, final long j11, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-931325388);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(function2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(function3) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.k0(function4) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.D(y3Var) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0VarR.L(j10) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0VarR.L(j11) ? 131072 : 65536;
        }
        if (c0VarR.h((74899 & i11) != 74898, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-931325388, i11, -1, "androidx.compose.material3.OneRowSnackbar (Snackbar.kt:303)");
            }
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarV = androidx.compose.foundation.layout.d5.v(aVar, f30180c, 0.0f, function4 == null ? f30181d : androidx.compose.ui.unit.h.r(0), 0.0f, 10, null);
            Object objI0 = c0VarR.i0();
            int i12 = i11;
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new a(com.facebook.internal.w0.f100156c1, "dismissAction", "text");
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.layout.a1 a1Var = (androidx.compose.ui.layout.a1) objI0;
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarV);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
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
            androidx.compose.runtime.y7.n(c0VarD, a1Var, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
            androidx.compose.ui.a0 a0VarT = androidx.compose.foundation.layout.d5.t(androidx.compose.ui.layout.i0.b(aVar, "text"), 0.0f, f30183f, 1, null);
            androidx.compose.ui.e.a aVar3 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar3.C(), false);
            int iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarT);
            Function0<androidx.compose.ui.node.g> function0A2 = aVar2.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A2);
            } else {
                c0VarR.l();
            }
            androidx.compose.runtime.c0 c0VarD2 = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD2, a1VarK, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD2, b1VarK2, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar2.b();
            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iJ2))) {
                c0VarD2.Y(Integer.valueOf(iJ2));
                c0VarD2.f(Integer.valueOf(iJ2), function2B2);
            }
            androidx.compose.runtime.y7.n(c0VarD2, a0VarN2, aVar2.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            function2.invoke(c0VarR, Integer.valueOf(i12 & 14));
            c0VarR.o();
            if (function3 != null) {
                c0VarR.E(-1014168049);
                androidx.compose.ui.a0 a0VarB = androidx.compose.ui.layout.i0.b(aVar, com.facebook.internal.w0.f100156c1);
                androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(aVar3.C(), false);
                int iJ3 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarB);
                Function0<androidx.compose.ui.node.g> function0A3 = aVar2.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A3);
                } else {
                    c0VarR.l();
                }
                androidx.compose.runtime.c0 c0VarD3 = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD3, a1VarK2, aVar2.e());
                androidx.compose.runtime.y7.n(c0VarD3, b1VarK3, aVar2.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3 = aVar2.b();
                if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iJ3))) {
                    c0VarD3.Y(Integer.valueOf(iJ3));
                    c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                }
                androidx.compose.runtime.y7.n(c0VarD3, a0VarN3, aVar2.f());
                androidx.compose.runtime.a1.f(new androidx.compose.runtime.n4[]{c7.a().f(androidx.compose.ui.graphics.q0.n(j10)), q50.I().f(y3Var)}, function3, c0VarR, androidx.compose.runtime.n4.f36267i | (i12 & com.planner5d.library.engine.input.f.b.B));
                c0VarR.o();
                c0VarR.A();
            } else {
                c0VarR.E(-1013852841);
                c0VarR.A();
            }
            if (function4 != null) {
                c0VarR.E(-1013804481);
                androidx.compose.ui.a0 a0VarB2 = androidx.compose.ui.layout.i0.b(aVar, "dismissAction");
                androidx.compose.ui.layout.a1 a1VarK3 = androidx.compose.foundation.layout.x.k(aVar3.C(), false);
                int iJ4 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK4 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarB2);
                Function0<androidx.compose.ui.node.g> function0A4 = aVar2.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A4);
                } else {
                    c0VarR.l();
                }
                androidx.compose.runtime.c0 c0VarD4 = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD4, a1VarK3, aVar2.e());
                androidx.compose.runtime.y7.n(c0VarD4, b1VarK4, aVar2.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B4 = aVar2.b();
                if (c0VarD4.P() || !Intrinsics.areEqual(c0VarD4.i0(), Integer.valueOf(iJ4))) {
                    c0VarD4.Y(Integer.valueOf(iJ4));
                    c0VarD4.f(Integer.valueOf(iJ4), function2B4);
                }
                androidx.compose.runtime.y7.n(c0VarD4, a0VarN4, aVar2.f());
                androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(j11)), function4, c0VarR, androidx.compose.runtime.n4.f36267i | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B));
                c0VarR.o();
                c0VarR.A();
            } else {
                c0VarR.E(-1013535401);
                c0VarR.A();
            }
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.g10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return l10.h(function2, function3, function4, y3Var, j10, j11, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(Function2 function2, Function2 function3, Function2 function4, androidx.compose.ui.text.y3 y3Var, long j10, long j11, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        g(function2, function3, function4, y3Var, j10, j11, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0117  */
    /* JADX WARN: Code duplicated, block: B:102:0x011c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0120  */
    /* JADX WARN: Code duplicated, block: B:106:0x0128  */
    /* JADX WARN: Code duplicated, block: B:107:0x012b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0139  */
    /* JADX WARN: Code duplicated, block: B:112:0x013b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0144  */
    /* JADX WARN: Code duplicated, block: B:117:0x015a  */
    /* JADX WARN: Code duplicated, block: B:136:0x0193 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:137:0x0195  */
    /* JADX WARN: Code duplicated, block: B:138:0x0198  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:144:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:150:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:151:0x01be  */
    /* JADX WARN: Code duplicated, block: B:154:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:155:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:158:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:159:0x01da  */
    /* JADX WARN: Code duplicated, block: B:162:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:163:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:166:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:167:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:170:0x0207  */
    /* JADX WARN: Code duplicated, block: B:173:0x0274  */
    /* JADX WARN: Code duplicated, block: B:175:0x0285  */
    /* JADX WARN: Code duplicated, block: B:178:0x029c  */
    /* JADX WARN: Code duplicated, block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:92:0x0102  */
    /* JADX WARN: Code duplicated, block: B:95:0x010b  */
    /* JADX WARN: Code duplicated, block: B:97:0x010f  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void i(@Nullable androidx.compose.ui.a0 a0Var, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, boolean z10, @Nullable androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, long j12, long j13, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5;
        int i13;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function6;
        int i14;
        int i15;
        boolean z11;
        int i16;
        androidx.compose.ui.graphics.q3 q3Var2;
        long j14;
        int i17;
        boolean z12;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var2;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function7;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function8;
        final boolean z13;
        final androidx.compose.ui.graphics.q3 q3Var3;
        final long j15;
        final long j16;
        final long j17;
        final long j18;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var3;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function9;
        boolean z14;
        androidx.compose.ui.graphics.q3 q3VarF;
        long jC;
        long jD;
        long jB;
        long jE;
        int i18;
        int i19;
        int i20;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1218779924);
        int i21 = i11 & 1;
        if (i21 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i22 = i11 & 2;
        if (i22 == 0) {
            if ((i10 & 48) == 0) {
                function5 = function2;
                i12 |= c0VarR.k0(function5) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    function6 = function3;
                    if (c0VarR.k0(function6)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        z11 = z10;
                        if (c0VarR.G(z11)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((i10 & 24576) == 0) {
                        if ((i11 & 16) == 0) {
                            q3Var2 = q3Var;
                            int i23 = c0VarR.D(q3Var2) ? 16384 : 8192;
                            i12 |= i23;
                        } else {
                            q3Var2 = q3Var;
                        }
                        i12 |= i23;
                    } else {
                        q3Var2 = q3Var;
                    }
                    if ((196608 & i10) == 0) {
                        if ((i11 & 32) == 0) {
                            j14 = j10;
                            int i24 = c0VarR.L(j14) ? 131072 : 65536;
                            i12 |= i24;
                        } else {
                            j14 = j10;
                        }
                        i12 |= i24;
                    } else {
                        j14 = j10;
                    }
                    if ((i10 & 1572864) != 0) {
                        if ((i11 & 64) == 0 || !c0VarR.L(j11)) {
                            i20 = 524288;
                        } else {
                            i20 = 1048576;
                        }
                        i12 |= i20;
                    }
                    if ((i10 & 12582912) != 0) {
                        if ((i11 & 128) == 0 || !c0VarR.L(j12)) {
                            i19 = 4194304;
                        } else {
                            i19 = 8388608;
                        }
                        i12 |= i19;
                    }
                    if ((100663296 & i10) != 0) {
                        if ((i11 & 256) == 0 || !c0VarR.L(j13)) {
                            i18 = com.google.api.client.googleapis.media.a.f115410j;
                        } else {
                            i18 = 67108864;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 512) != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c0VarR.k0(function4)) {
                                i17 = 536870912;
                            } else {
                                i17 = 268435456;
                            }
                            i12 |= i17;
                        }
                        if ((i12 & 306783379) != 306783378) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (c0VarR.h(z12, i12 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i21 != 0) {
                                    a0Var3 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var3 = a0Var;
                                }
                                if (i22 != 0) {
                                    function5 = null;
                                }
                                function9 = i13 == 0 ? function6 : null;
                                if (i15 != 0) {
                                    z14 = false;
                                } else {
                                    z14 = z11;
                                }
                                if ((i11 & 16) != 0) {
                                    q3VarF = v00.f33828a.f(c0VarR, 6);
                                    i12 &= -57345;
                                } else {
                                    q3VarF = q3Var2;
                                }
                                if ((i11 & 32) != 0) {
                                    jC = v00.f33828a.c(c0VarR, 6);
                                    i12 &= -458753;
                                } else {
                                    jC = j14;
                                }
                                if ((i11 & 64) != 0) {
                                    jD = v00.f33828a.d(c0VarR, 6);
                                    i12 &= -3670017;
                                } else {
                                    jD = j11;
                                }
                                if ((i11 & 128) != 0) {
                                    jB = v00.f33828a.b(c0VarR, 6);
                                    i12 &= -29360129;
                                } else {
                                    jB = j12;
                                }
                                if ((i11 & 256) != 0) {
                                    jE = v00.f33828a.e(c0VarR, 6);
                                    i12 &= -234881025;
                                } else {
                                    jE = j13;
                                }
                            } else {
                                c0VarR.u();
                                if ((i11 & 16) != 0) {
                                    i12 &= -57345;
                                }
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                }
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                }
                                if ((i11 & 128) != 0) {
                                    i12 &= -29360129;
                                }
                                if ((i11 & 256) != 0) {
                                    i12 &= -234881025;
                                }
                                a0Var3 = a0Var;
                                jE = j13;
                                function9 = function6;
                                z14 = z11;
                                q3VarF = q3Var2;
                                jC = j14;
                                jD = j11;
                                jB = j12;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1218779924, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:110)");
                            }
                            androidx.compose.ui.a0 a0Var4 = a0Var3;
                            int i25 = i12 >> 9;
                            u10.c(a0Var4, q3VarF, jC, jD, 0.0f, d0.o2.f268595a.g(), null, androidx.compose.runtime.internal.w.e(-1343524879, true, new b(z14, function5, function4, function9, jB, jE), c0VarR, 54), c0VarR, (i12 & 14) | 12779520 | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 896) | (i25 & 7168), 80);
                            a0Var2 = a0Var4;
                            c0Var2 = c0VarR;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            q3Var3 = q3VarF;
                            function7 = function5;
                            j15 = jC;
                            j16 = jD;
                            j17 = jB;
                            z13 = z14;
                            j18 = jE;
                            function8 = function9;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var2 = a0Var;
                            function7 = function5;
                            function8 = function6;
                            z13 = z11;
                            q3Var3 = q3Var2;
                            j15 = j14;
                            j16 = j11;
                            j17 = j12;
                            j18 = j13;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.j10
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return l10.k(a0Var2, function7, function8, z13, q3Var3, j15, j16, j17, j18, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 805306368;
                    if ((i12 & 306783379) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i22 != 0) {
                                function5 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z14 = false;
                            } else {
                                z14 = z11;
                            }
                            if ((i11 & 16) != 0) {
                                q3VarF = v00.f33828a.f(c0VarR, 6);
                                i12 &= -57345;
                            } else {
                                q3VarF = q3Var2;
                            }
                            if ((i11 & 32) != 0) {
                                jC = v00.f33828a.c(c0VarR, 6);
                                i12 &= -458753;
                            } else {
                                jC = j14;
                            }
                            if ((i11 & 64) != 0) {
                                jD = v00.f33828a.d(c0VarR, 6);
                                i12 &= -3670017;
                            } else {
                                jD = j11;
                            }
                            if ((i11 & 128) != 0) {
                                jB = v00.f33828a.b(c0VarR, 6);
                                i12 &= -29360129;
                            } else {
                                jB = j12;
                            }
                            if ((i11 & 256) != 0) {
                                jE = v00.f33828a.e(c0VarR, 6);
                                i12 &= -234881025;
                            } else {
                                jE = j13;
                            }
                        } else {
                            if (i21 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i22 != 0) {
                                function5 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z14 = false;
                            } else {
                                z14 = z11;
                            }
                            if ((i11 & 16) != 0) {
                                q3VarF = v00.f33828a.f(c0VarR, 6);
                                i12 &= -57345;
                            } else {
                                q3VarF = q3Var2;
                            }
                            if ((i11 & 32) != 0) {
                                jC = v00.f33828a.c(c0VarR, 6);
                                i12 &= -458753;
                            } else {
                                jC = j14;
                            }
                            if ((i11 & 64) != 0) {
                                jD = v00.f33828a.d(c0VarR, 6);
                                i12 &= -3670017;
                            } else {
                                jD = j11;
                            }
                            if ((i11 & 128) != 0) {
                                jB = v00.f33828a.b(c0VarR, 6);
                                i12 &= -29360129;
                            } else {
                                jB = j12;
                            }
                            if ((i11 & 256) != 0) {
                                jE = v00.f33828a.e(c0VarR, 6);
                                i12 &= -234881025;
                            } else {
                                jE = j13;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1218779924, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:110)");
                        }
                        androidx.compose.ui.a0 a0Var5 = a0Var3;
                        int i26 = i12 >> 9;
                        u10.c(a0Var5, q3VarF, jC, jD, 0.0f, d0.o2.f268595a.g(), null, androidx.compose.runtime.internal.w.e(-1343524879, true, new b(z14, function5, function4, function9, jB, jE), c0VarR, 54), c0VarR, (i12 & 14) | 12779520 | (i26 & com.planner5d.library.engine.input.f.b.B) | (i26 & 896) | (i26 & 7168), 80);
                        a0Var2 = a0Var5;
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        q3Var3 = q3VarF;
                        function7 = function5;
                        j15 = jC;
                        j16 = jD;
                        j17 = jB;
                        z13 = z14;
                        j18 = jE;
                        function8 = function9;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        function7 = function5;
                        function8 = function6;
                        z13 = z11;
                        q3Var3 = q3Var2;
                        j15 = j14;
                        j16 = j11;
                        j17 = j12;
                        j18 = j13;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.j10
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return l10.k(a0Var2, function7, function8, z13, q3Var3, j15, j16, j17, j18, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 3072;
                z11 = z10;
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        q3Var2 = q3Var;
                        if (c0VarR.D(q3Var2)) {
                        }
                        i12 |= i23;
                    } else {
                        q3Var2 = q3Var;
                    }
                    i12 |= i23;
                } else {
                    q3Var2 = q3Var;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        j14 = j10;
                        if (c0VarR.L(j14)) {
                        }
                        i12 |= i24;
                    } else {
                        j14 = j10;
                    }
                    i12 |= i24;
                } else {
                    j14 = j10;
                }
                if ((i10 & 1572864) != 0) {
                    if ((i11 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                if ((i10 & 12582912) != 0) {
                    if ((i11 & 128) == 0) {
                        i19 = 4194304;
                    } else {
                        i19 = 4194304;
                    }
                    i12 |= i19;
                }
                if ((100663296 & i10) != 0) {
                    if ((i11 & 256) == 0) {
                        i18 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i18 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i18;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(function4)) {
                            i17 = 536870912;
                        } else {
                            i17 = 268435456;
                        }
                        i12 |= i17;
                    }
                    if ((i12 & 306783379) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i22 != 0) {
                                function5 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z14 = false;
                            } else {
                                z14 = z11;
                            }
                            if ((i11 & 16) != 0) {
                                q3VarF = v00.f33828a.f(c0VarR, 6);
                                i12 &= -57345;
                            } else {
                                q3VarF = q3Var2;
                            }
                            if ((i11 & 32) != 0) {
                                jC = v00.f33828a.c(c0VarR, 6);
                                i12 &= -458753;
                            } else {
                                jC = j14;
                            }
                            if ((i11 & 64) != 0) {
                                jD = v00.f33828a.d(c0VarR, 6);
                                i12 &= -3670017;
                            } else {
                                jD = j11;
                            }
                            if ((i11 & 128) != 0) {
                                jB = v00.f33828a.b(c0VarR, 6);
                                i12 &= -29360129;
                            } else {
                                jB = j12;
                            }
                            if ((i11 & 256) != 0) {
                                jE = v00.f33828a.e(c0VarR, 6);
                                i12 &= -234881025;
                            } else {
                                jE = j13;
                            }
                        } else {
                            if (i21 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i22 != 0) {
                                function5 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z14 = false;
                            } else {
                                z14 = z11;
                            }
                            if ((i11 & 16) != 0) {
                                q3VarF = v00.f33828a.f(c0VarR, 6);
                                i12 &= -57345;
                            } else {
                                q3VarF = q3Var2;
                            }
                            if ((i11 & 32) != 0) {
                                jC = v00.f33828a.c(c0VarR, 6);
                                i12 &= -458753;
                            } else {
                                jC = j14;
                            }
                            if ((i11 & 64) != 0) {
                                jD = v00.f33828a.d(c0VarR, 6);
                                i12 &= -3670017;
                            } else {
                                jD = j11;
                            }
                            if ((i11 & 128) != 0) {
                                jB = v00.f33828a.b(c0VarR, 6);
                                i12 &= -29360129;
                            } else {
                                jB = j12;
                            }
                            if ((i11 & 256) != 0) {
                                jE = v00.f33828a.e(c0VarR, 6);
                                i12 &= -234881025;
                            } else {
                                jE = j13;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1218779924, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:110)");
                        }
                        androidx.compose.ui.a0 a0Var6 = a0Var3;
                        int i27 = i12 >> 9;
                        u10.c(a0Var6, q3VarF, jC, jD, 0.0f, d0.o2.f268595a.g(), null, androidx.compose.runtime.internal.w.e(-1343524879, true, new b(z14, function5, function4, function9, jB, jE), c0VarR, 54), c0VarR, (i12 & 14) | 12779520 | (i27 & com.planner5d.library.engine.input.f.b.B) | (i27 & 896) | (i27 & 7168), 80);
                        a0Var2 = a0Var6;
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        q3Var3 = q3VarF;
                        function7 = function5;
                        j15 = jC;
                        j16 = jD;
                        j17 = jB;
                        z13 = z14;
                        j18 = jE;
                        function8 = function9;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        function7 = function5;
                        function8 = function6;
                        z13 = z11;
                        q3Var3 = q3Var2;
                        j15 = j14;
                        j16 = j11;
                        j17 = j12;
                        j18 = j13;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.j10
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return l10.k(a0Var2, function7, function8, z13, q3Var3, j15, j16, j17, j18, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 805306368;
                if ((i12 & 306783379) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i22 != 0) {
                            function5 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarF = v00.f33828a.f(c0VarR, 6);
                            i12 &= -57345;
                        } else {
                            q3VarF = q3Var2;
                        }
                        if ((i11 & 32) != 0) {
                            jC = v00.f33828a.c(c0VarR, 6);
                            i12 &= -458753;
                        } else {
                            jC = j14;
                        }
                        if ((i11 & 64) != 0) {
                            jD = v00.f33828a.d(c0VarR, 6);
                            i12 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 128) != 0) {
                            jB = v00.f33828a.b(c0VarR, 6);
                            i12 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i11 & 256) != 0) {
                            jE = v00.f33828a.e(c0VarR, 6);
                            i12 &= -234881025;
                        } else {
                            jE = j13;
                        }
                    } else {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i22 != 0) {
                            function5 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarF = v00.f33828a.f(c0VarR, 6);
                            i12 &= -57345;
                        } else {
                            q3VarF = q3Var2;
                        }
                        if ((i11 & 32) != 0) {
                            jC = v00.f33828a.c(c0VarR, 6);
                            i12 &= -458753;
                        } else {
                            jC = j14;
                        }
                        if ((i11 & 64) != 0) {
                            jD = v00.f33828a.d(c0VarR, 6);
                            i12 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 128) != 0) {
                            jB = v00.f33828a.b(c0VarR, 6);
                            i12 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i11 & 256) != 0) {
                            jE = v00.f33828a.e(c0VarR, 6);
                            i12 &= -234881025;
                        } else {
                            jE = j13;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1218779924, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:110)");
                    }
                    androidx.compose.ui.a0 a0Var7 = a0Var3;
                    int i28 = i12 >> 9;
                    u10.c(a0Var7, q3VarF, jC, jD, 0.0f, d0.o2.f268595a.g(), null, androidx.compose.runtime.internal.w.e(-1343524879, true, new b(z14, function5, function4, function9, jB, jE), c0VarR, 54), c0VarR, (i12 & 14) | 12779520 | (i28 & com.planner5d.library.engine.input.f.b.B) | (i28 & 896) | (i28 & 7168), 80);
                    a0Var2 = a0Var7;
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3Var3 = q3VarF;
                    function7 = function5;
                    j15 = jC;
                    j16 = jD;
                    j17 = jB;
                    z13 = z14;
                    j18 = jE;
                    function8 = function9;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    function7 = function5;
                    function8 = function6;
                    z13 = z11;
                    q3Var3 = q3Var2;
                    j15 = j14;
                    j16 = j11;
                    j17 = j12;
                    j18 = j13;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.j10
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return l10.k(a0Var2, function7, function8, z13, q3Var3, j15, j16, j17, j18, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            function6 = function3;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        q3Var2 = q3Var;
                        if (c0VarR.D(q3Var2)) {
                        }
                        i12 |= i23;
                    } else {
                        q3Var2 = q3Var;
                    }
                    i12 |= i23;
                } else {
                    q3Var2 = q3Var;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        j14 = j10;
                        if (c0VarR.L(j14)) {
                        }
                        i12 |= i24;
                    } else {
                        j14 = j10;
                    }
                    i12 |= i24;
                } else {
                    j14 = j10;
                }
                if ((i10 & 1572864) != 0) {
                    if ((i11 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                if ((i10 & 12582912) != 0) {
                    if ((i11 & 128) == 0) {
                        i19 = 4194304;
                    } else {
                        i19 = 4194304;
                    }
                    i12 |= i19;
                }
                if ((100663296 & i10) != 0) {
                    if ((i11 & 256) == 0) {
                        i18 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i18 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i18;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(function4)) {
                            i17 = 536870912;
                        } else {
                            i17 = 268435456;
                        }
                        i12 |= i17;
                    }
                    if ((i12 & 306783379) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i22 != 0) {
                                function5 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z14 = false;
                            } else {
                                z14 = z11;
                            }
                            if ((i11 & 16) != 0) {
                                q3VarF = v00.f33828a.f(c0VarR, 6);
                                i12 &= -57345;
                            } else {
                                q3VarF = q3Var2;
                            }
                            if ((i11 & 32) != 0) {
                                jC = v00.f33828a.c(c0VarR, 6);
                                i12 &= -458753;
                            } else {
                                jC = j14;
                            }
                            if ((i11 & 64) != 0) {
                                jD = v00.f33828a.d(c0VarR, 6);
                                i12 &= -3670017;
                            } else {
                                jD = j11;
                            }
                            if ((i11 & 128) != 0) {
                                jB = v00.f33828a.b(c0VarR, 6);
                                i12 &= -29360129;
                            } else {
                                jB = j12;
                            }
                            if ((i11 & 256) != 0) {
                                jE = v00.f33828a.e(c0VarR, 6);
                                i12 &= -234881025;
                            } else {
                                jE = j13;
                            }
                        } else {
                            if (i21 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i22 != 0) {
                                function5 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z14 = false;
                            } else {
                                z14 = z11;
                            }
                            if ((i11 & 16) != 0) {
                                q3VarF = v00.f33828a.f(c0VarR, 6);
                                i12 &= -57345;
                            } else {
                                q3VarF = q3Var2;
                            }
                            if ((i11 & 32) != 0) {
                                jC = v00.f33828a.c(c0VarR, 6);
                                i12 &= -458753;
                            } else {
                                jC = j14;
                            }
                            if ((i11 & 64) != 0) {
                                jD = v00.f33828a.d(c0VarR, 6);
                                i12 &= -3670017;
                            } else {
                                jD = j11;
                            }
                            if ((i11 & 128) != 0) {
                                jB = v00.f33828a.b(c0VarR, 6);
                                i12 &= -29360129;
                            } else {
                                jB = j12;
                            }
                            if ((i11 & 256) != 0) {
                                jE = v00.f33828a.e(c0VarR, 6);
                                i12 &= -234881025;
                            } else {
                                jE = j13;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1218779924, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:110)");
                        }
                        androidx.compose.ui.a0 a0Var8 = a0Var3;
                        int i29 = i12 >> 9;
                        u10.c(a0Var8, q3VarF, jC, jD, 0.0f, d0.o2.f268595a.g(), null, androidx.compose.runtime.internal.w.e(-1343524879, true, new b(z14, function5, function4, function9, jB, jE), c0VarR, 54), c0VarR, (i12 & 14) | 12779520 | (i29 & com.planner5d.library.engine.input.f.b.B) | (i29 & 896) | (i29 & 7168), 80);
                        a0Var2 = a0Var8;
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        q3Var3 = q3VarF;
                        function7 = function5;
                        j15 = jC;
                        j16 = jD;
                        j17 = jB;
                        z13 = z14;
                        j18 = jE;
                        function8 = function9;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        function7 = function5;
                        function8 = function6;
                        z13 = z11;
                        q3Var3 = q3Var2;
                        j15 = j14;
                        j16 = j11;
                        j17 = j12;
                        j18 = j13;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.j10
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return l10.k(a0Var2, function7, function8, z13, q3Var3, j15, j16, j17, j18, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 805306368;
                if ((i12 & 306783379) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i22 != 0) {
                            function5 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarF = v00.f33828a.f(c0VarR, 6);
                            i12 &= -57345;
                        } else {
                            q3VarF = q3Var2;
                        }
                        if ((i11 & 32) != 0) {
                            jC = v00.f33828a.c(c0VarR, 6);
                            i12 &= -458753;
                        } else {
                            jC = j14;
                        }
                        if ((i11 & 64) != 0) {
                            jD = v00.f33828a.d(c0VarR, 6);
                            i12 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 128) != 0) {
                            jB = v00.f33828a.b(c0VarR, 6);
                            i12 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i11 & 256) != 0) {
                            jE = v00.f33828a.e(c0VarR, 6);
                            i12 &= -234881025;
                        } else {
                            jE = j13;
                        }
                    } else {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i22 != 0) {
                            function5 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarF = v00.f33828a.f(c0VarR, 6);
                            i12 &= -57345;
                        } else {
                            q3VarF = q3Var2;
                        }
                        if ((i11 & 32) != 0) {
                            jC = v00.f33828a.c(c0VarR, 6);
                            i12 &= -458753;
                        } else {
                            jC = j14;
                        }
                        if ((i11 & 64) != 0) {
                            jD = v00.f33828a.d(c0VarR, 6);
                            i12 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 128) != 0) {
                            jB = v00.f33828a.b(c0VarR, 6);
                            i12 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i11 & 256) != 0) {
                            jE = v00.f33828a.e(c0VarR, 6);
                            i12 &= -234881025;
                        } else {
                            jE = j13;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1218779924, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:110)");
                    }
                    androidx.compose.ui.a0 a0Var9 = a0Var3;
                    int i210 = i12 >> 9;
                    u10.c(a0Var9, q3VarF, jC, jD, 0.0f, d0.o2.f268595a.g(), null, androidx.compose.runtime.internal.w.e(-1343524879, true, new b(z14, function5, function4, function9, jB, jE), c0VarR, 54), c0VarR, (i12 & 14) | 12779520 | (i210 & com.planner5d.library.engine.input.f.b.B) | (i210 & 896) | (i210 & 7168), 80);
                    a0Var2 = a0Var9;
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3Var3 = q3VarF;
                    function7 = function5;
                    j15 = jC;
                    j16 = jD;
                    j17 = jB;
                    z13 = z14;
                    j18 = jE;
                    function8 = function9;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    function7 = function5;
                    function8 = function6;
                    z13 = z11;
                    q3Var3 = q3Var2;
                    j15 = j14;
                    j16 = j11;
                    j17 = j12;
                    j18 = j13;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.j10
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return l10.k(a0Var2, function7, function8, z13, q3Var3, j15, j16, j17, j18, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z11 = z10;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    q3Var2 = q3Var;
                    if (c0VarR.D(q3Var2)) {
                    }
                    i12 |= i23;
                } else {
                    q3Var2 = q3Var;
                }
                i12 |= i23;
            } else {
                q3Var2 = q3Var;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    j14 = j10;
                    if (c0VarR.L(j14)) {
                    }
                    i12 |= i24;
                } else {
                    j14 = j10;
                }
                i12 |= i24;
            } else {
                j14 = j10;
            }
            if ((i10 & 1572864) != 0) {
                if ((i11 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
            if ((i10 & 12582912) != 0) {
                if ((i11 & 128) == 0) {
                    i19 = 4194304;
                } else {
                    i19 = 4194304;
                }
                i12 |= i19;
            }
            if ((100663296 & i10) != 0) {
                if ((i11 & 256) == 0) {
                    i18 = com.google.api.client.googleapis.media.a.f115410j;
                } else {
                    i18 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i12 |= i18;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.k0(function4)) {
                        i17 = 536870912;
                    } else {
                        i17 = 268435456;
                    }
                    i12 |= i17;
                }
                if ((i12 & 306783379) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i22 != 0) {
                            function5 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarF = v00.f33828a.f(c0VarR, 6);
                            i12 &= -57345;
                        } else {
                            q3VarF = q3Var2;
                        }
                        if ((i11 & 32) != 0) {
                            jC = v00.f33828a.c(c0VarR, 6);
                            i12 &= -458753;
                        } else {
                            jC = j14;
                        }
                        if ((i11 & 64) != 0) {
                            jD = v00.f33828a.d(c0VarR, 6);
                            i12 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 128) != 0) {
                            jB = v00.f33828a.b(c0VarR, 6);
                            i12 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i11 & 256) != 0) {
                            jE = v00.f33828a.e(c0VarR, 6);
                            i12 &= -234881025;
                        } else {
                            jE = j13;
                        }
                    } else {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i22 != 0) {
                            function5 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarF = v00.f33828a.f(c0VarR, 6);
                            i12 &= -57345;
                        } else {
                            q3VarF = q3Var2;
                        }
                        if ((i11 & 32) != 0) {
                            jC = v00.f33828a.c(c0VarR, 6);
                            i12 &= -458753;
                        } else {
                            jC = j14;
                        }
                        if ((i11 & 64) != 0) {
                            jD = v00.f33828a.d(c0VarR, 6);
                            i12 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 128) != 0) {
                            jB = v00.f33828a.b(c0VarR, 6);
                            i12 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i11 & 256) != 0) {
                            jE = v00.f33828a.e(c0VarR, 6);
                            i12 &= -234881025;
                        } else {
                            jE = j13;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1218779924, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:110)");
                    }
                    androidx.compose.ui.a0 a0Var10 = a0Var3;
                    int i211 = i12 >> 9;
                    u10.c(a0Var10, q3VarF, jC, jD, 0.0f, d0.o2.f268595a.g(), null, androidx.compose.runtime.internal.w.e(-1343524879, true, new b(z14, function5, function4, function9, jB, jE), c0VarR, 54), c0VarR, (i12 & 14) | 12779520 | (i211 & com.planner5d.library.engine.input.f.b.B) | (i211 & 896) | (i211 & 7168), 80);
                    a0Var2 = a0Var10;
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3Var3 = q3VarF;
                    function7 = function5;
                    j15 = jC;
                    j16 = jD;
                    j17 = jB;
                    z13 = z14;
                    j18 = jE;
                    function8 = function9;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    function7 = function5;
                    function8 = function6;
                    z13 = z11;
                    q3Var3 = q3Var2;
                    j15 = j14;
                    j16 = j11;
                    j17 = j12;
                    j18 = j13;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.j10
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return l10.k(a0Var2, function7, function8, z13, q3Var3, j15, j16, j17, j18, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 805306368;
            if ((i12 & 306783379) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i22 != 0) {
                        function5 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if ((i11 & 16) != 0) {
                        q3VarF = v00.f33828a.f(c0VarR, 6);
                        i12 &= -57345;
                    } else {
                        q3VarF = q3Var2;
                    }
                    if ((i11 & 32) != 0) {
                        jC = v00.f33828a.c(c0VarR, 6);
                        i12 &= -458753;
                    } else {
                        jC = j14;
                    }
                    if ((i11 & 64) != 0) {
                        jD = v00.f33828a.d(c0VarR, 6);
                        i12 &= -3670017;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 128) != 0) {
                        jB = v00.f33828a.b(c0VarR, 6);
                        i12 &= -29360129;
                    } else {
                        jB = j12;
                    }
                    if ((i11 & 256) != 0) {
                        jE = v00.f33828a.e(c0VarR, 6);
                        i12 &= -234881025;
                    } else {
                        jE = j13;
                    }
                } else {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i22 != 0) {
                        function5 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if ((i11 & 16) != 0) {
                        q3VarF = v00.f33828a.f(c0VarR, 6);
                        i12 &= -57345;
                    } else {
                        q3VarF = q3Var2;
                    }
                    if ((i11 & 32) != 0) {
                        jC = v00.f33828a.c(c0VarR, 6);
                        i12 &= -458753;
                    } else {
                        jC = j14;
                    }
                    if ((i11 & 64) != 0) {
                        jD = v00.f33828a.d(c0VarR, 6);
                        i12 &= -3670017;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 128) != 0) {
                        jB = v00.f33828a.b(c0VarR, 6);
                        i12 &= -29360129;
                    } else {
                        jB = j12;
                    }
                    if ((i11 & 256) != 0) {
                        jE = v00.f33828a.e(c0VarR, 6);
                        i12 &= -234881025;
                    } else {
                        jE = j13;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1218779924, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:110)");
                }
                androidx.compose.ui.a0 a0Var11 = a0Var3;
                int i212 = i12 >> 9;
                u10.c(a0Var11, q3VarF, jC, jD, 0.0f, d0.o2.f268595a.g(), null, androidx.compose.runtime.internal.w.e(-1343524879, true, new b(z14, function5, function4, function9, jB, jE), c0VarR, 54), c0VarR, (i12 & 14) | 12779520 | (i212 & com.planner5d.library.engine.input.f.b.B) | (i212 & 896) | (i212 & 7168), 80);
                a0Var2 = a0Var11;
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                q3Var3 = q3VarF;
                function7 = function5;
                j15 = jC;
                j16 = jD;
                j17 = jB;
                z13 = z14;
                j18 = jE;
                function8 = function9;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var2 = a0Var;
                function7 = function5;
                function8 = function6;
                z13 = z11;
                q3Var3 = q3Var2;
                j15 = j14;
                j16 = j11;
                j17 = j12;
                j18 = j13;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.j10
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return l10.k(a0Var2, function7, function8, z13, q3Var3, j15, j16, j17, j18, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        function5 = function2;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                function6 = function3;
                if (c0VarR.k0(function6)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        q3Var2 = q3Var;
                        if (c0VarR.D(q3Var2)) {
                        }
                        i12 |= i23;
                    } else {
                        q3Var2 = q3Var;
                    }
                    i12 |= i23;
                } else {
                    q3Var2 = q3Var;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        j14 = j10;
                        if (c0VarR.L(j14)) {
                        }
                        i12 |= i24;
                    } else {
                        j14 = j10;
                    }
                    i12 |= i24;
                } else {
                    j14 = j10;
                }
                if ((i10 & 1572864) != 0) {
                    if ((i11 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                if ((i10 & 12582912) != 0) {
                    if ((i11 & 128) == 0) {
                        i19 = 4194304;
                    } else {
                        i19 = 4194304;
                    }
                    i12 |= i19;
                }
                if ((100663296 & i10) != 0) {
                    if ((i11 & 256) == 0) {
                        i18 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i18 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i18;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(function4)) {
                            i17 = 536870912;
                        } else {
                            i17 = 268435456;
                        }
                        i12 |= i17;
                    }
                    if ((i12 & 306783379) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i22 != 0) {
                                function5 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z14 = false;
                            } else {
                                z14 = z11;
                            }
                            if ((i11 & 16) != 0) {
                                q3VarF = v00.f33828a.f(c0VarR, 6);
                                i12 &= -57345;
                            } else {
                                q3VarF = q3Var2;
                            }
                            if ((i11 & 32) != 0) {
                                jC = v00.f33828a.c(c0VarR, 6);
                                i12 &= -458753;
                            } else {
                                jC = j14;
                            }
                            if ((i11 & 64) != 0) {
                                jD = v00.f33828a.d(c0VarR, 6);
                                i12 &= -3670017;
                            } else {
                                jD = j11;
                            }
                            if ((i11 & 128) != 0) {
                                jB = v00.f33828a.b(c0VarR, 6);
                                i12 &= -29360129;
                            } else {
                                jB = j12;
                            }
                            if ((i11 & 256) != 0) {
                                jE = v00.f33828a.e(c0VarR, 6);
                                i12 &= -234881025;
                            } else {
                                jE = j13;
                            }
                        } else {
                            if (i21 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i22 != 0) {
                                function5 = null;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                z14 = false;
                            } else {
                                z14 = z11;
                            }
                            if ((i11 & 16) != 0) {
                                q3VarF = v00.f33828a.f(c0VarR, 6);
                                i12 &= -57345;
                            } else {
                                q3VarF = q3Var2;
                            }
                            if ((i11 & 32) != 0) {
                                jC = v00.f33828a.c(c0VarR, 6);
                                i12 &= -458753;
                            } else {
                                jC = j14;
                            }
                            if ((i11 & 64) != 0) {
                                jD = v00.f33828a.d(c0VarR, 6);
                                i12 &= -3670017;
                            } else {
                                jD = j11;
                            }
                            if ((i11 & 128) != 0) {
                                jB = v00.f33828a.b(c0VarR, 6);
                                i12 &= -29360129;
                            } else {
                                jB = j12;
                            }
                            if ((i11 & 256) != 0) {
                                jE = v00.f33828a.e(c0VarR, 6);
                                i12 &= -234881025;
                            } else {
                                jE = j13;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1218779924, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:110)");
                        }
                        androidx.compose.ui.a0 a0Var12 = a0Var3;
                        int i213 = i12 >> 9;
                        u10.c(a0Var12, q3VarF, jC, jD, 0.0f, d0.o2.f268595a.g(), null, androidx.compose.runtime.internal.w.e(-1343524879, true, new b(z14, function5, function4, function9, jB, jE), c0VarR, 54), c0VarR, (i12 & 14) | 12779520 | (i213 & com.planner5d.library.engine.input.f.b.B) | (i213 & 896) | (i213 & 7168), 80);
                        a0Var2 = a0Var12;
                        c0Var2 = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        q3Var3 = q3VarF;
                        function7 = function5;
                        j15 = jC;
                        j16 = jD;
                        j17 = jB;
                        z13 = z14;
                        j18 = jE;
                        function8 = function9;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var2 = a0Var;
                        function7 = function5;
                        function8 = function6;
                        z13 = z11;
                        q3Var3 = q3Var2;
                        j15 = j14;
                        j16 = j11;
                        j17 = j12;
                        j18 = j13;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.j10
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return l10.k(a0Var2, function7, function8, z13, q3Var3, j15, j16, j17, j18, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 805306368;
                if ((i12 & 306783379) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i22 != 0) {
                            function5 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarF = v00.f33828a.f(c0VarR, 6);
                            i12 &= -57345;
                        } else {
                            q3VarF = q3Var2;
                        }
                        if ((i11 & 32) != 0) {
                            jC = v00.f33828a.c(c0VarR, 6);
                            i12 &= -458753;
                        } else {
                            jC = j14;
                        }
                        if ((i11 & 64) != 0) {
                            jD = v00.f33828a.d(c0VarR, 6);
                            i12 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 128) != 0) {
                            jB = v00.f33828a.b(c0VarR, 6);
                            i12 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i11 & 256) != 0) {
                            jE = v00.f33828a.e(c0VarR, 6);
                            i12 &= -234881025;
                        } else {
                            jE = j13;
                        }
                    } else {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i22 != 0) {
                            function5 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarF = v00.f33828a.f(c0VarR, 6);
                            i12 &= -57345;
                        } else {
                            q3VarF = q3Var2;
                        }
                        if ((i11 & 32) != 0) {
                            jC = v00.f33828a.c(c0VarR, 6);
                            i12 &= -458753;
                        } else {
                            jC = j14;
                        }
                        if ((i11 & 64) != 0) {
                            jD = v00.f33828a.d(c0VarR, 6);
                            i12 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 128) != 0) {
                            jB = v00.f33828a.b(c0VarR, 6);
                            i12 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i11 & 256) != 0) {
                            jE = v00.f33828a.e(c0VarR, 6);
                            i12 &= -234881025;
                        } else {
                            jE = j13;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1218779924, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:110)");
                    }
                    androidx.compose.ui.a0 a0Var13 = a0Var3;
                    int i214 = i12 >> 9;
                    u10.c(a0Var13, q3VarF, jC, jD, 0.0f, d0.o2.f268595a.g(), null, androidx.compose.runtime.internal.w.e(-1343524879, true, new b(z14, function5, function4, function9, jB, jE), c0VarR, 54), c0VarR, (i12 & 14) | 12779520 | (i214 & com.planner5d.library.engine.input.f.b.B) | (i214 & 896) | (i214 & 7168), 80);
                    a0Var2 = a0Var13;
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3Var3 = q3VarF;
                    function7 = function5;
                    j15 = jC;
                    j16 = jD;
                    j17 = jB;
                    z13 = z14;
                    j18 = jE;
                    function8 = function9;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    function7 = function5;
                    function8 = function6;
                    z13 = z11;
                    q3Var3 = q3Var2;
                    j15 = j14;
                    j16 = j11;
                    j17 = j12;
                    j18 = j13;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.j10
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return l10.k(a0Var2, function7, function8, z13, q3Var3, j15, j16, j17, j18, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z11 = z10;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    q3Var2 = q3Var;
                    if (c0VarR.D(q3Var2)) {
                    }
                    i12 |= i23;
                } else {
                    q3Var2 = q3Var;
                }
                i12 |= i23;
            } else {
                q3Var2 = q3Var;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    j14 = j10;
                    if (c0VarR.L(j14)) {
                    }
                    i12 |= i24;
                } else {
                    j14 = j10;
                }
                i12 |= i24;
            } else {
                j14 = j10;
            }
            if ((i10 & 1572864) != 0) {
                if ((i11 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
            if ((i10 & 12582912) != 0) {
                if ((i11 & 128) == 0) {
                    i19 = 4194304;
                } else {
                    i19 = 4194304;
                }
                i12 |= i19;
            }
            if ((100663296 & i10) != 0) {
                if ((i11 & 256) == 0) {
                    i18 = com.google.api.client.googleapis.media.a.f115410j;
                } else {
                    i18 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i12 |= i18;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.k0(function4)) {
                        i17 = 536870912;
                    } else {
                        i17 = 268435456;
                    }
                    i12 |= i17;
                }
                if ((i12 & 306783379) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i22 != 0) {
                            function5 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarF = v00.f33828a.f(c0VarR, 6);
                            i12 &= -57345;
                        } else {
                            q3VarF = q3Var2;
                        }
                        if ((i11 & 32) != 0) {
                            jC = v00.f33828a.c(c0VarR, 6);
                            i12 &= -458753;
                        } else {
                            jC = j14;
                        }
                        if ((i11 & 64) != 0) {
                            jD = v00.f33828a.d(c0VarR, 6);
                            i12 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 128) != 0) {
                            jB = v00.f33828a.b(c0VarR, 6);
                            i12 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i11 & 256) != 0) {
                            jE = v00.f33828a.e(c0VarR, 6);
                            i12 &= -234881025;
                        } else {
                            jE = j13;
                        }
                    } else {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i22 != 0) {
                            function5 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarF = v00.f33828a.f(c0VarR, 6);
                            i12 &= -57345;
                        } else {
                            q3VarF = q3Var2;
                        }
                        if ((i11 & 32) != 0) {
                            jC = v00.f33828a.c(c0VarR, 6);
                            i12 &= -458753;
                        } else {
                            jC = j14;
                        }
                        if ((i11 & 64) != 0) {
                            jD = v00.f33828a.d(c0VarR, 6);
                            i12 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 128) != 0) {
                            jB = v00.f33828a.b(c0VarR, 6);
                            i12 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i11 & 256) != 0) {
                            jE = v00.f33828a.e(c0VarR, 6);
                            i12 &= -234881025;
                        } else {
                            jE = j13;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1218779924, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:110)");
                    }
                    androidx.compose.ui.a0 a0Var14 = a0Var3;
                    int i215 = i12 >> 9;
                    u10.c(a0Var14, q3VarF, jC, jD, 0.0f, d0.o2.f268595a.g(), null, androidx.compose.runtime.internal.w.e(-1343524879, true, new b(z14, function5, function4, function9, jB, jE), c0VarR, 54), c0VarR, (i12 & 14) | 12779520 | (i215 & com.planner5d.library.engine.input.f.b.B) | (i215 & 896) | (i215 & 7168), 80);
                    a0Var2 = a0Var14;
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3Var3 = q3VarF;
                    function7 = function5;
                    j15 = jC;
                    j16 = jD;
                    j17 = jB;
                    z13 = z14;
                    j18 = jE;
                    function8 = function9;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    function7 = function5;
                    function8 = function6;
                    z13 = z11;
                    q3Var3 = q3Var2;
                    j15 = j14;
                    j16 = j11;
                    j17 = j12;
                    j18 = j13;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.j10
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return l10.k(a0Var2, function7, function8, z13, q3Var3, j15, j16, j17, j18, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 805306368;
            if ((i12 & 306783379) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i22 != 0) {
                        function5 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if ((i11 & 16) != 0) {
                        q3VarF = v00.f33828a.f(c0VarR, 6);
                        i12 &= -57345;
                    } else {
                        q3VarF = q3Var2;
                    }
                    if ((i11 & 32) != 0) {
                        jC = v00.f33828a.c(c0VarR, 6);
                        i12 &= -458753;
                    } else {
                        jC = j14;
                    }
                    if ((i11 & 64) != 0) {
                        jD = v00.f33828a.d(c0VarR, 6);
                        i12 &= -3670017;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 128) != 0) {
                        jB = v00.f33828a.b(c0VarR, 6);
                        i12 &= -29360129;
                    } else {
                        jB = j12;
                    }
                    if ((i11 & 256) != 0) {
                        jE = v00.f33828a.e(c0VarR, 6);
                        i12 &= -234881025;
                    } else {
                        jE = j13;
                    }
                } else {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i22 != 0) {
                        function5 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if ((i11 & 16) != 0) {
                        q3VarF = v00.f33828a.f(c0VarR, 6);
                        i12 &= -57345;
                    } else {
                        q3VarF = q3Var2;
                    }
                    if ((i11 & 32) != 0) {
                        jC = v00.f33828a.c(c0VarR, 6);
                        i12 &= -458753;
                    } else {
                        jC = j14;
                    }
                    if ((i11 & 64) != 0) {
                        jD = v00.f33828a.d(c0VarR, 6);
                        i12 &= -3670017;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 128) != 0) {
                        jB = v00.f33828a.b(c0VarR, 6);
                        i12 &= -29360129;
                    } else {
                        jB = j12;
                    }
                    if ((i11 & 256) != 0) {
                        jE = v00.f33828a.e(c0VarR, 6);
                        i12 &= -234881025;
                    } else {
                        jE = j13;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1218779924, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:110)");
                }
                androidx.compose.ui.a0 a0Var15 = a0Var3;
                int i216 = i12 >> 9;
                u10.c(a0Var15, q3VarF, jC, jD, 0.0f, d0.o2.f268595a.g(), null, androidx.compose.runtime.internal.w.e(-1343524879, true, new b(z14, function5, function4, function9, jB, jE), c0VarR, 54), c0VarR, (i12 & 14) | 12779520 | (i216 & com.planner5d.library.engine.input.f.b.B) | (i216 & 896) | (i216 & 7168), 80);
                a0Var2 = a0Var15;
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                q3Var3 = q3VarF;
                function7 = function5;
                j15 = jC;
                j16 = jD;
                j17 = jB;
                z13 = z14;
                j18 = jE;
                function8 = function9;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var2 = a0Var;
                function7 = function5;
                function8 = function6;
                z13 = z11;
                q3Var3 = q3Var2;
                j15 = j14;
                j16 = j11;
                j17 = j12;
                j18 = j13;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.j10
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return l10.k(a0Var2, function7, function8, z13, q3Var3, j15, j16, j17, j18, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        function6 = function3;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                z11 = z10;
                if (c0VarR.G(z11)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    q3Var2 = q3Var;
                    if (c0VarR.D(q3Var2)) {
                    }
                    i12 |= i23;
                } else {
                    q3Var2 = q3Var;
                }
                i12 |= i23;
            } else {
                q3Var2 = q3Var;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    j14 = j10;
                    if (c0VarR.L(j14)) {
                    }
                    i12 |= i24;
                } else {
                    j14 = j10;
                }
                i12 |= i24;
            } else {
                j14 = j10;
            }
            if ((i10 & 1572864) != 0) {
                if ((i11 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
            if ((i10 & 12582912) != 0) {
                if ((i11 & 128) == 0) {
                    i19 = 4194304;
                } else {
                    i19 = 4194304;
                }
                i12 |= i19;
            }
            if ((100663296 & i10) != 0) {
                if ((i11 & 256) == 0) {
                    i18 = com.google.api.client.googleapis.media.a.f115410j;
                } else {
                    i18 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i12 |= i18;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.k0(function4)) {
                        i17 = 536870912;
                    } else {
                        i17 = 268435456;
                    }
                    i12 |= i17;
                }
                if ((i12 & 306783379) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i22 != 0) {
                            function5 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarF = v00.f33828a.f(c0VarR, 6);
                            i12 &= -57345;
                        } else {
                            q3VarF = q3Var2;
                        }
                        if ((i11 & 32) != 0) {
                            jC = v00.f33828a.c(c0VarR, 6);
                            i12 &= -458753;
                        } else {
                            jC = j14;
                        }
                        if ((i11 & 64) != 0) {
                            jD = v00.f33828a.d(c0VarR, 6);
                            i12 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 128) != 0) {
                            jB = v00.f33828a.b(c0VarR, 6);
                            i12 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i11 & 256) != 0) {
                            jE = v00.f33828a.e(c0VarR, 6);
                            i12 &= -234881025;
                        } else {
                            jE = j13;
                        }
                    } else {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i22 != 0) {
                            function5 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarF = v00.f33828a.f(c0VarR, 6);
                            i12 &= -57345;
                        } else {
                            q3VarF = q3Var2;
                        }
                        if ((i11 & 32) != 0) {
                            jC = v00.f33828a.c(c0VarR, 6);
                            i12 &= -458753;
                        } else {
                            jC = j14;
                        }
                        if ((i11 & 64) != 0) {
                            jD = v00.f33828a.d(c0VarR, 6);
                            i12 &= -3670017;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 128) != 0) {
                            jB = v00.f33828a.b(c0VarR, 6);
                            i12 &= -29360129;
                        } else {
                            jB = j12;
                        }
                        if ((i11 & 256) != 0) {
                            jE = v00.f33828a.e(c0VarR, 6);
                            i12 &= -234881025;
                        } else {
                            jE = j13;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1218779924, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:110)");
                    }
                    androidx.compose.ui.a0 a0Var16 = a0Var3;
                    int i217 = i12 >> 9;
                    u10.c(a0Var16, q3VarF, jC, jD, 0.0f, d0.o2.f268595a.g(), null, androidx.compose.runtime.internal.w.e(-1343524879, true, new b(z14, function5, function4, function9, jB, jE), c0VarR, 54), c0VarR, (i12 & 14) | 12779520 | (i217 & com.planner5d.library.engine.input.f.b.B) | (i217 & 896) | (i217 & 7168), 80);
                    a0Var2 = a0Var16;
                    c0Var2 = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3Var3 = q3VarF;
                    function7 = function5;
                    j15 = jC;
                    j16 = jD;
                    j17 = jB;
                    z13 = z14;
                    j18 = jE;
                    function8 = function9;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var2 = a0Var;
                    function7 = function5;
                    function8 = function6;
                    z13 = z11;
                    q3Var3 = q3Var2;
                    j15 = j14;
                    j16 = j11;
                    j17 = j12;
                    j18 = j13;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.j10
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return l10.k(a0Var2, function7, function8, z13, q3Var3, j15, j16, j17, j18, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 805306368;
            if ((i12 & 306783379) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i22 != 0) {
                        function5 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if ((i11 & 16) != 0) {
                        q3VarF = v00.f33828a.f(c0VarR, 6);
                        i12 &= -57345;
                    } else {
                        q3VarF = q3Var2;
                    }
                    if ((i11 & 32) != 0) {
                        jC = v00.f33828a.c(c0VarR, 6);
                        i12 &= -458753;
                    } else {
                        jC = j14;
                    }
                    if ((i11 & 64) != 0) {
                        jD = v00.f33828a.d(c0VarR, 6);
                        i12 &= -3670017;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 128) != 0) {
                        jB = v00.f33828a.b(c0VarR, 6);
                        i12 &= -29360129;
                    } else {
                        jB = j12;
                    }
                    if ((i11 & 256) != 0) {
                        jE = v00.f33828a.e(c0VarR, 6);
                        i12 &= -234881025;
                    } else {
                        jE = j13;
                    }
                } else {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i22 != 0) {
                        function5 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if ((i11 & 16) != 0) {
                        q3VarF = v00.f33828a.f(c0VarR, 6);
                        i12 &= -57345;
                    } else {
                        q3VarF = q3Var2;
                    }
                    if ((i11 & 32) != 0) {
                        jC = v00.f33828a.c(c0VarR, 6);
                        i12 &= -458753;
                    } else {
                        jC = j14;
                    }
                    if ((i11 & 64) != 0) {
                        jD = v00.f33828a.d(c0VarR, 6);
                        i12 &= -3670017;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 128) != 0) {
                        jB = v00.f33828a.b(c0VarR, 6);
                        i12 &= -29360129;
                    } else {
                        jB = j12;
                    }
                    if ((i11 & 256) != 0) {
                        jE = v00.f33828a.e(c0VarR, 6);
                        i12 &= -234881025;
                    } else {
                        jE = j13;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1218779924, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:110)");
                }
                androidx.compose.ui.a0 a0Var17 = a0Var3;
                int i218 = i12 >> 9;
                u10.c(a0Var17, q3VarF, jC, jD, 0.0f, d0.o2.f268595a.g(), null, androidx.compose.runtime.internal.w.e(-1343524879, true, new b(z14, function5, function4, function9, jB, jE), c0VarR, 54), c0VarR, (i12 & 14) | 12779520 | (i218 & com.planner5d.library.engine.input.f.b.B) | (i218 & 896) | (i218 & 7168), 80);
                a0Var2 = a0Var17;
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                q3Var3 = q3VarF;
                function7 = function5;
                j15 = jC;
                j16 = jD;
                j17 = jB;
                z13 = z14;
                j18 = jE;
                function8 = function9;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var2 = a0Var;
                function7 = function5;
                function8 = function6;
                z13 = z11;
                q3Var3 = q3Var2;
                j15 = j14;
                j16 = j11;
                j17 = j12;
                j18 = j13;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.j10
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return l10.k(a0Var2, function7, function8, z13, q3Var3, j15, j16, j17, j18, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        z11 = z10;
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                q3Var2 = q3Var;
                if (c0VarR.D(q3Var2)) {
                }
                i12 |= i23;
            } else {
                q3Var2 = q3Var;
            }
            i12 |= i23;
        } else {
            q3Var2 = q3Var;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                j14 = j10;
                if (c0VarR.L(j14)) {
                }
                i12 |= i24;
            } else {
                j14 = j10;
            }
            i12 |= i24;
        } else {
            j14 = j10;
        }
        if ((i10 & 1572864) != 0) {
            if ((i11 & 64) == 0) {
                i20 = 524288;
            } else {
                i20 = 524288;
            }
            i12 |= i20;
        }
        if ((i10 & 12582912) != 0) {
            if ((i11 & 128) == 0) {
                i19 = 4194304;
            } else {
                i19 = 4194304;
            }
            i12 |= i19;
        }
        if ((100663296 & i10) != 0) {
            if ((i11 & 256) == 0) {
                i18 = com.google.api.client.googleapis.media.a.f115410j;
            } else {
                i18 = com.google.api.client.googleapis.media.a.f115410j;
            }
            i12 |= i18;
        }
        if ((i11 & 512) != 0) {
            if ((i10 & 805306368) == 0) {
                if (c0VarR.k0(function4)) {
                    i17 = 536870912;
                } else {
                    i17 = 268435456;
                }
                i12 |= i17;
            }
            if ((i12 & 306783379) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i22 != 0) {
                        function5 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if ((i11 & 16) != 0) {
                        q3VarF = v00.f33828a.f(c0VarR, 6);
                        i12 &= -57345;
                    } else {
                        q3VarF = q3Var2;
                    }
                    if ((i11 & 32) != 0) {
                        jC = v00.f33828a.c(c0VarR, 6);
                        i12 &= -458753;
                    } else {
                        jC = j14;
                    }
                    if ((i11 & 64) != 0) {
                        jD = v00.f33828a.d(c0VarR, 6);
                        i12 &= -3670017;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 128) != 0) {
                        jB = v00.f33828a.b(c0VarR, 6);
                        i12 &= -29360129;
                    } else {
                        jB = j12;
                    }
                    if ((i11 & 256) != 0) {
                        jE = v00.f33828a.e(c0VarR, 6);
                        i12 &= -234881025;
                    } else {
                        jE = j13;
                    }
                } else {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i22 != 0) {
                        function5 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if ((i11 & 16) != 0) {
                        q3VarF = v00.f33828a.f(c0VarR, 6);
                        i12 &= -57345;
                    } else {
                        q3VarF = q3Var2;
                    }
                    if ((i11 & 32) != 0) {
                        jC = v00.f33828a.c(c0VarR, 6);
                        i12 &= -458753;
                    } else {
                        jC = j14;
                    }
                    if ((i11 & 64) != 0) {
                        jD = v00.f33828a.d(c0VarR, 6);
                        i12 &= -3670017;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 128) != 0) {
                        jB = v00.f33828a.b(c0VarR, 6);
                        i12 &= -29360129;
                    } else {
                        jB = j12;
                    }
                    if ((i11 & 256) != 0) {
                        jE = v00.f33828a.e(c0VarR, 6);
                        i12 &= -234881025;
                    } else {
                        jE = j13;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1218779924, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:110)");
                }
                androidx.compose.ui.a0 a0Var18 = a0Var3;
                int i219 = i12 >> 9;
                u10.c(a0Var18, q3VarF, jC, jD, 0.0f, d0.o2.f268595a.g(), null, androidx.compose.runtime.internal.w.e(-1343524879, true, new b(z14, function5, function4, function9, jB, jE), c0VarR, 54), c0VarR, (i12 & 14) | 12779520 | (i219 & com.planner5d.library.engine.input.f.b.B) | (i219 & 896) | (i219 & 7168), 80);
                a0Var2 = a0Var18;
                c0Var2 = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                q3Var3 = q3VarF;
                function7 = function5;
                j15 = jC;
                j16 = jD;
                j17 = jB;
                z13 = z14;
                j18 = jE;
                function8 = function9;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var2 = a0Var;
                function7 = function5;
                function8 = function6;
                z13 = z11;
                q3Var3 = q3Var2;
                j15 = j14;
                j16 = j11;
                j17 = j12;
                j18 = j13;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.j10
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return l10.k(a0Var2, function7, function8, z13, q3Var3, j15, j16, j17, j18, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 805306368;
        if ((i12 & 306783379) != 306783378) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var;
                }
                if (i22 != 0) {
                    function5 = null;
                }
                if (i13 == 0) {
                }
                if (i15 != 0) {
                    z14 = false;
                } else {
                    z14 = z11;
                }
                if ((i11 & 16) != 0) {
                    q3VarF = v00.f33828a.f(c0VarR, 6);
                    i12 &= -57345;
                } else {
                    q3VarF = q3Var2;
                }
                if ((i11 & 32) != 0) {
                    jC = v00.f33828a.c(c0VarR, 6);
                    i12 &= -458753;
                } else {
                    jC = j14;
                }
                if ((i11 & 64) != 0) {
                    jD = v00.f33828a.d(c0VarR, 6);
                    i12 &= -3670017;
                } else {
                    jD = j11;
                }
                if ((i11 & 128) != 0) {
                    jB = v00.f33828a.b(c0VarR, 6);
                    i12 &= -29360129;
                } else {
                    jB = j12;
                }
                if ((i11 & 256) != 0) {
                    jE = v00.f33828a.e(c0VarR, 6);
                    i12 &= -234881025;
                } else {
                    jE = j13;
                }
            } else {
                if (i21 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var;
                }
                if (i22 != 0) {
                    function5 = null;
                }
                if (i13 == 0) {
                }
                if (i15 != 0) {
                    z14 = false;
                } else {
                    z14 = z11;
                }
                if ((i11 & 16) != 0) {
                    q3VarF = v00.f33828a.f(c0VarR, 6);
                    i12 &= -57345;
                } else {
                    q3VarF = q3Var2;
                }
                if ((i11 & 32) != 0) {
                    jC = v00.f33828a.c(c0VarR, 6);
                    i12 &= -458753;
                } else {
                    jC = j14;
                }
                if ((i11 & 64) != 0) {
                    jD = v00.f33828a.d(c0VarR, 6);
                    i12 &= -3670017;
                } else {
                    jD = j11;
                }
                if ((i11 & 128) != 0) {
                    jB = v00.f33828a.b(c0VarR, 6);
                    i12 &= -29360129;
                } else {
                    jB = j12;
                }
                if ((i11 & 256) != 0) {
                    jE = v00.f33828a.e(c0VarR, 6);
                    i12 &= -234881025;
                } else {
                    jE = j13;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1218779924, i12, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:110)");
            }
            androidx.compose.ui.a0 a0Var19 = a0Var3;
            int i2110 = i12 >> 9;
            u10.c(a0Var19, q3VarF, jC, jD, 0.0f, d0.o2.f268595a.g(), null, androidx.compose.runtime.internal.w.e(-1343524879, true, new b(z14, function5, function4, function9, jB, jE), c0VarR, 54), c0VarR, (i12 & 14) | 12779520 | (i2110 & com.planner5d.library.engine.input.f.b.B) | (i2110 & 896) | (i2110 & 7168), 80);
            a0Var2 = a0Var19;
            c0Var2 = c0VarR;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            q3Var3 = q3VarF;
            function7 = function5;
            j15 = jC;
            j16 = jD;
            j17 = jB;
            z13 = z14;
            j18 = jE;
            function8 = function9;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var2 = a0Var;
            function7 = function5;
            function8 = function6;
            z13 = z11;
            q3Var3 = q3Var2;
            j15 = j14;
            j16 = j11;
            j17 = j12;
            j18 = j13;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.j10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return l10.k(a0Var2, function7, function8, z13, q3Var3, j15, j16, j17, j18, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0118  */
    /* JADX WARN: Code duplicated, block: B:102:0x011a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0123  */
    /* JADX WARN: Code duplicated, block: B:107:0x0139  */
    /* JADX WARN: Code duplicated, block: B:129:0x017a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x017c  */
    /* JADX WARN: Code duplicated, block: B:131:0x017f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0183  */
    /* JADX WARN: Code duplicated, block: B:134:0x0186  */
    /* JADX WARN: Code duplicated, block: B:137:0x018d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0196  */
    /* JADX WARN: Code duplicated, block: B:141:0x019b  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:145:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:149:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:153:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:157:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:159:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:162:0x0201  */
    /* JADX WARN: Code duplicated, block: B:165:0x0217  */
    /* JADX WARN: Code duplicated, block: B:166:0x022f  */
    /* JADX WARN: Code duplicated, block: B:169:0x0244  */
    /* JADX WARN: Code duplicated, block: B:171:0x025c  */
    /* JADX WARN: Code duplicated, block: B:174:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:176:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:179:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00df  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:93:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:96:0x0108  */
    /* JADX WARN: Code duplicated, block: B:98:0x010c  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void j(@NotNull final u00 u00Var, @Nullable androidx.compose.ui.a0 a0Var, boolean z10, @Nullable androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, long j12, long j13, long j14, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z11;
        int i14;
        androidx.compose.ui.graphics.q3 q3Var2;
        long j15;
        long j16;
        int i15;
        int i16;
        boolean z12;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z13;
        final androidx.compose.ui.graphics.q3 q3Var3;
        final long j17;
        final long j18;
        final long j19;
        final long j20;
        final long j21;
        androidx.compose.runtime.s5 s5VarT;
        boolean z14;
        androidx.compose.ui.graphics.q3 q3VarF;
        long jC;
        long jD;
        long jA;
        long jB;
        long jE;
        boolean z15;
        String strS;
        androidx.compose.runtime.internal.c cVarE;
        androidx.compose.runtime.internal.c cVar;
        int i17;
        int i18;
        int i19;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(274621471);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(u00Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        q3Var2 = q3Var;
                        int i21 = c0VarR.D(q3Var2) ? 2048 : 1024;
                        i12 |= i21;
                    } else {
                        q3Var2 = q3Var;
                    }
                    i12 |= i21;
                } else {
                    q3Var2 = q3Var;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        j15 = j10;
                        int i22 = c0VarR.L(j15) ? 16384 : 8192;
                        i12 |= i22;
                    } else {
                        j15 = j10;
                    }
                    i12 |= i22;
                } else {
                    j15 = j10;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        j16 = j11;
                        int i23 = c0VarR.L(j16) ? 131072 : 65536;
                        i12 |= i23;
                    } else {
                        j16 = j11;
                    }
                    i12 |= i23;
                } else {
                    j16 = j11;
                }
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        i19 = i12;
                        i16 = i20;
                        int i24 = c0VarR.L(j12) ? 1048576 : 524288;
                        i15 = i19 | i24;
                    } else {
                        i19 = i12;
                        i16 = i20;
                    }
                    i15 = i19 | i24;
                } else {
                    i15 = i12;
                    i16 = i20;
                }
                if ((i10 & 12582912) != 0) {
                    if ((i11 & 128) == 0 || !c0VarR.L(j13)) {
                        i18 = 4194304;
                    } else {
                        i18 = 8388608;
                    }
                    i15 |= i18;
                }
                if ((100663296 & i10) != 0) {
                    if ((i11 & 256) == 0 || !c0VarR.L(j14)) {
                        i17 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i17 = 67108864;
                    }
                    i15 |= i17;
                }
                if ((38347923 & i15) != 38347922) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i15 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0 || c0VarR.y()) {
                        if (i16 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            z14 = false;
                        } else {
                            z14 = z11;
                        }
                        if ((i11 & 8) != 0) {
                            q3VarF = v00.f33828a.f(c0VarR, 6);
                            i15 &= -7169;
                        } else {
                            q3VarF = q3Var2;
                        }
                        if ((i11 & 16) != 0) {
                            jC = v00.f33828a.c(c0VarR, 6);
                            i15 &= -57345;
                        } else {
                            jC = j15;
                        }
                        if ((i11 & 32) != 0) {
                            jD = v00.f33828a.d(c0VarR, 6);
                            i15 &= -458753;
                        } else {
                            jD = j16;
                        }
                        if ((i11 & 64) != 0) {
                            jA = v00.f33828a.a(c0VarR, 6);
                            i15 &= -3670017;
                        } else {
                            jA = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jB = v00.f33828a.b(c0VarR, 6);
                            i15 &= -29360129;
                        } else {
                            jB = j13;
                        }
                        if ((i11 & 256) != 0) {
                            i15 &= -234881025;
                            jE = v00.f33828a.e(c0VarR, 6);
                        } else {
                            jE = j14;
                        }
                        z15 = z14;
                    } else {
                        c0VarR.u();
                        if ((i11 & 8) != 0) {
                            i15 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            i15 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i15 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            i15 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            i15 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            i15 &= -234881025;
                        }
                        jB = j13;
                        jE = j14;
                        a0Var3 = a0Var2;
                        z15 = z11;
                        q3VarF = q3Var2;
                        jC = j15;
                        jD = j16;
                        jA = j12;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(274621471, i15, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:206)");
                    }
                    strS = u00Var.a().S();
                    cVarE = null;
                    if (strS != null) {
                        c0VarR.E(-663815981);
                        androidx.compose.runtime.internal.c cVarE2 = androidx.compose.runtime.internal.w.e(-1378313599, true, new d(jA, u00Var, strS), c0VarR, 54);
                        c0VarR.A();
                        cVar = cVarE2;
                    } else {
                        c0VarR.E(-663517017);
                        c0VarR.A();
                        cVar = null;
                    }
                    if (u00Var.a().a()) {
                        c0VarR.E(-663364652);
                        cVarE = androidx.compose.runtime.internal.w.e(-1812633777, true, new e(u00Var), c0VarR, 54);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-662974393);
                        c0VarR.A();
                    }
                    int i25 = i15 << 3;
                    c0Var2 = c0VarR;
                    i(androidx.compose.foundation.layout.d5.r(a0Var3, androidx.compose.ui.unit.h.r(12)), cVar, cVarE, z15, q3VarF, jC, jD, jB, jE, androidx.compose.runtime.internal.w.e(-1266389126, true, new c(u00Var), c0VarR, 54), c0Var2, (i25 & 3670016) | (i25 & 7168) | 805306368 | (57344 & i25) | (458752 & i25) | (29360128 & i15) | (234881024 & i15), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j19 = jA;
                    z13 = z15;
                    q3Var3 = q3VarF;
                    j17 = jC;
                    j18 = jD;
                    j20 = jB;
                    j21 = jE;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    q3Var3 = q3Var2;
                    j17 = j15;
                    j18 = j16;
                    j19 = j12;
                    j20 = j13;
                    j21 = j14;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.h10
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return l10.l(u00Var, a0Var3, z13, q3Var3, j17, j18, j19, j20, j21, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            z11 = z10;
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    q3Var2 = q3Var;
                    if (c0VarR.D(q3Var2)) {
                    }
                    i12 |= i21;
                } else {
                    q3Var2 = q3Var;
                }
                i12 |= i21;
            } else {
                q3Var2 = q3Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    j15 = j10;
                    if (c0VarR.L(j15)) {
                    }
                    i12 |= i22;
                } else {
                    j15 = j10;
                }
                i12 |= i22;
            } else {
                j15 = j10;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    j16 = j11;
                    if (c0VarR.L(j16)) {
                    }
                    i12 |= i23;
                } else {
                    j16 = j11;
                }
                i12 |= i23;
            } else {
                j16 = j11;
            }
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    i19 = i12;
                    i16 = i20;
                    if (c0VarR.L(j12)) {
                    }
                    i15 = i19 | i24;
                } else {
                    i19 = i12;
                    i16 = i20;
                }
                i15 = i19 | i24;
            } else {
                i15 = i12;
                i16 = i20;
            }
            if ((i10 & 12582912) != 0) {
                if ((i11 & 128) == 0) {
                    i18 = 4194304;
                } else {
                    i18 = 4194304;
                }
                i15 |= i18;
            }
            if ((100663296 & i10) != 0) {
                if ((i11 & 256) == 0) {
                    i17 = com.google.api.client.googleapis.media.a.f115410j;
                } else {
                    i17 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i15 |= i17;
            }
            if ((38347923 & i15) != 38347922) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i15 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        q3VarF = v00.f33828a.f(c0VarR, 6);
                        i15 &= -7169;
                    } else {
                        q3VarF = q3Var2;
                    }
                    if ((i11 & 16) != 0) {
                        jC = v00.f33828a.c(c0VarR, 6);
                        i15 &= -57345;
                    } else {
                        jC = j15;
                    }
                    if ((i11 & 32) != 0) {
                        jD = v00.f33828a.d(c0VarR, 6);
                        i15 &= -458753;
                    } else {
                        jD = j16;
                    }
                    if ((i11 & 64) != 0) {
                        jA = v00.f33828a.a(c0VarR, 6);
                        i15 &= -3670017;
                    } else {
                        jA = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jB = v00.f33828a.b(c0VarR, 6);
                        i15 &= -29360129;
                    } else {
                        jB = j13;
                    }
                    if ((i11 & 256) != 0) {
                        i15 &= -234881025;
                        jE = v00.f33828a.e(c0VarR, 6);
                    } else {
                        jE = j14;
                    }
                    z15 = z14;
                } else {
                    if (i16 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        q3VarF = v00.f33828a.f(c0VarR, 6);
                        i15 &= -7169;
                    } else {
                        q3VarF = q3Var2;
                    }
                    if ((i11 & 16) != 0) {
                        jC = v00.f33828a.c(c0VarR, 6);
                        i15 &= -57345;
                    } else {
                        jC = j15;
                    }
                    if ((i11 & 32) != 0) {
                        jD = v00.f33828a.d(c0VarR, 6);
                        i15 &= -458753;
                    } else {
                        jD = j16;
                    }
                    if ((i11 & 64) != 0) {
                        jA = v00.f33828a.a(c0VarR, 6);
                        i15 &= -3670017;
                    } else {
                        jA = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jB = v00.f33828a.b(c0VarR, 6);
                        i15 &= -29360129;
                    } else {
                        jB = j13;
                    }
                    if ((i11 & 256) != 0) {
                        i15 &= -234881025;
                        jE = v00.f33828a.e(c0VarR, 6);
                    } else {
                        jE = j14;
                    }
                    z15 = z14;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(274621471, i15, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:206)");
                }
                strS = u00Var.a().S();
                cVarE = null;
                if (strS != null) {
                    c0VarR.E(-663815981);
                    androidx.compose.runtime.internal.c cVarE3 = androidx.compose.runtime.internal.w.e(-1378313599, true, new d(jA, u00Var, strS), c0VarR, 54);
                    c0VarR.A();
                    cVar = cVarE3;
                } else {
                    c0VarR.E(-663517017);
                    c0VarR.A();
                    cVar = null;
                }
                if (u00Var.a().a()) {
                    c0VarR.E(-663364652);
                    cVarE = androidx.compose.runtime.internal.w.e(-1812633777, true, new e(u00Var), c0VarR, 54);
                    c0VarR.A();
                } else {
                    c0VarR.E(-662974393);
                    c0VarR.A();
                }
                int i26 = i15 << 3;
                c0Var2 = c0VarR;
                i(androidx.compose.foundation.layout.d5.r(a0Var3, androidx.compose.ui.unit.h.r(12)), cVar, cVarE, z15, q3VarF, jC, jD, jB, jE, androidx.compose.runtime.internal.w.e(-1266389126, true, new c(u00Var), c0VarR, 54), c0Var2, (i26 & 3670016) | (i26 & 7168) | 805306368 | (57344 & i26) | (458752 & i26) | (29360128 & i15) | (234881024 & i15), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j19 = jA;
                z13 = z15;
                q3Var3 = q3VarF;
                j17 = jC;
                j18 = jD;
                j20 = jB;
                j21 = jE;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z13 = z11;
                q3Var3 = q3Var2;
                j17 = j15;
                j18 = j16;
                j19 = j12;
                j20 = j13;
                j21 = j14;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.h10
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return l10.l(u00Var, a0Var3, z13, q3Var3, j17, j18, j19, j20, j21, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                z11 = z10;
                if (c0VarR.G(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    q3Var2 = q3Var;
                    if (c0VarR.D(q3Var2)) {
                    }
                    i12 |= i21;
                } else {
                    q3Var2 = q3Var;
                }
                i12 |= i21;
            } else {
                q3Var2 = q3Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    j15 = j10;
                    if (c0VarR.L(j15)) {
                    }
                    i12 |= i22;
                } else {
                    j15 = j10;
                }
                i12 |= i22;
            } else {
                j15 = j10;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    j16 = j11;
                    if (c0VarR.L(j16)) {
                    }
                    i12 |= i23;
                } else {
                    j16 = j11;
                }
                i12 |= i23;
            } else {
                j16 = j11;
            }
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    i19 = i12;
                    i16 = i20;
                    if (c0VarR.L(j12)) {
                    }
                    i15 = i19 | i24;
                } else {
                    i19 = i12;
                    i16 = i20;
                }
                i15 = i19 | i24;
            } else {
                i15 = i12;
                i16 = i20;
            }
            if ((i10 & 12582912) != 0) {
                if ((i11 & 128) == 0) {
                    i18 = 4194304;
                } else {
                    i18 = 4194304;
                }
                i15 |= i18;
            }
            if ((100663296 & i10) != 0) {
                if ((i11 & 256) == 0) {
                    i17 = com.google.api.client.googleapis.media.a.f115410j;
                } else {
                    i17 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i15 |= i17;
            }
            if ((38347923 & i15) != 38347922) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i15 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        q3VarF = v00.f33828a.f(c0VarR, 6);
                        i15 &= -7169;
                    } else {
                        q3VarF = q3Var2;
                    }
                    if ((i11 & 16) != 0) {
                        jC = v00.f33828a.c(c0VarR, 6);
                        i15 &= -57345;
                    } else {
                        jC = j15;
                    }
                    if ((i11 & 32) != 0) {
                        jD = v00.f33828a.d(c0VarR, 6);
                        i15 &= -458753;
                    } else {
                        jD = j16;
                    }
                    if ((i11 & 64) != 0) {
                        jA = v00.f33828a.a(c0VarR, 6);
                        i15 &= -3670017;
                    } else {
                        jA = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jB = v00.f33828a.b(c0VarR, 6);
                        i15 &= -29360129;
                    } else {
                        jB = j13;
                    }
                    if ((i11 & 256) != 0) {
                        i15 &= -234881025;
                        jE = v00.f33828a.e(c0VarR, 6);
                    } else {
                        jE = j14;
                    }
                    z15 = z14;
                } else {
                    if (i16 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    if ((i11 & 8) != 0) {
                        q3VarF = v00.f33828a.f(c0VarR, 6);
                        i15 &= -7169;
                    } else {
                        q3VarF = q3Var2;
                    }
                    if ((i11 & 16) != 0) {
                        jC = v00.f33828a.c(c0VarR, 6);
                        i15 &= -57345;
                    } else {
                        jC = j15;
                    }
                    if ((i11 & 32) != 0) {
                        jD = v00.f33828a.d(c0VarR, 6);
                        i15 &= -458753;
                    } else {
                        jD = j16;
                    }
                    if ((i11 & 64) != 0) {
                        jA = v00.f33828a.a(c0VarR, 6);
                        i15 &= -3670017;
                    } else {
                        jA = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jB = v00.f33828a.b(c0VarR, 6);
                        i15 &= -29360129;
                    } else {
                        jB = j13;
                    }
                    if ((i11 & 256) != 0) {
                        i15 &= -234881025;
                        jE = v00.f33828a.e(c0VarR, 6);
                    } else {
                        jE = j14;
                    }
                    z15 = z14;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(274621471, i15, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:206)");
                }
                strS = u00Var.a().S();
                cVarE = null;
                if (strS != null) {
                    c0VarR.E(-663815981);
                    androidx.compose.runtime.internal.c cVarE4 = androidx.compose.runtime.internal.w.e(-1378313599, true, new d(jA, u00Var, strS), c0VarR, 54);
                    c0VarR.A();
                    cVar = cVarE4;
                } else {
                    c0VarR.E(-663517017);
                    c0VarR.A();
                    cVar = null;
                }
                if (u00Var.a().a()) {
                    c0VarR.E(-663364652);
                    cVarE = androidx.compose.runtime.internal.w.e(-1812633777, true, new e(u00Var), c0VarR, 54);
                    c0VarR.A();
                } else {
                    c0VarR.E(-662974393);
                    c0VarR.A();
                }
                int i27 = i15 << 3;
                c0Var2 = c0VarR;
                i(androidx.compose.foundation.layout.d5.r(a0Var3, androidx.compose.ui.unit.h.r(12)), cVar, cVarE, z15, q3VarF, jC, jD, jB, jE, androidx.compose.runtime.internal.w.e(-1266389126, true, new c(u00Var), c0VarR, 54), c0Var2, (i27 & 3670016) | (i27 & 7168) | 805306368 | (57344 & i27) | (458752 & i27) | (29360128 & i15) | (234881024 & i15), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j19 = jA;
                z13 = z15;
                q3Var3 = q3VarF;
                j17 = jC;
                j18 = jD;
                j20 = jB;
                j21 = jE;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z13 = z11;
                q3Var3 = q3Var2;
                j17 = j15;
                j18 = j16;
                j19 = j12;
                j20 = j13;
                j21 = j14;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.h10
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return l10.l(u00Var, a0Var3, z13, q3Var3, j17, j18, j19, j20, j21, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        z11 = z10;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                q3Var2 = q3Var;
                if (c0VarR.D(q3Var2)) {
                }
                i12 |= i21;
            } else {
                q3Var2 = q3Var;
            }
            i12 |= i21;
        } else {
            q3Var2 = q3Var;
        }
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                j15 = j10;
                if (c0VarR.L(j15)) {
                }
                i12 |= i22;
            } else {
                j15 = j10;
            }
            i12 |= i22;
        } else {
            j15 = j10;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                j16 = j11;
                if (c0VarR.L(j16)) {
                }
                i12 |= i23;
            } else {
                j16 = j11;
            }
            i12 |= i23;
        } else {
            j16 = j11;
        }
        if ((1572864 & i10) == 0) {
            if ((i11 & 64) == 0) {
                i19 = i12;
                i16 = i20;
                if (c0VarR.L(j12)) {
                }
                i15 = i19 | i24;
            } else {
                i19 = i12;
                i16 = i20;
            }
            i15 = i19 | i24;
        } else {
            i15 = i12;
            i16 = i20;
        }
        if ((i10 & 12582912) != 0) {
            if ((i11 & 128) == 0) {
                i18 = 4194304;
            } else {
                i18 = 4194304;
            }
            i15 |= i18;
        }
        if ((100663296 & i10) != 0) {
            if ((i11 & 256) == 0) {
                i17 = com.google.api.client.googleapis.media.a.f115410j;
            } else {
                i17 = com.google.api.client.googleapis.media.a.f115410j;
            }
            i15 |= i17;
        }
        if ((38347923 & i15) != 38347922) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i15 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    z14 = false;
                } else {
                    z14 = z11;
                }
                if ((i11 & 8) != 0) {
                    q3VarF = v00.f33828a.f(c0VarR, 6);
                    i15 &= -7169;
                } else {
                    q3VarF = q3Var2;
                }
                if ((i11 & 16) != 0) {
                    jC = v00.f33828a.c(c0VarR, 6);
                    i15 &= -57345;
                } else {
                    jC = j15;
                }
                if ((i11 & 32) != 0) {
                    jD = v00.f33828a.d(c0VarR, 6);
                    i15 &= -458753;
                } else {
                    jD = j16;
                }
                if ((i11 & 64) != 0) {
                    jA = v00.f33828a.a(c0VarR, 6);
                    i15 &= -3670017;
                } else {
                    jA = j12;
                }
                if ((i11 & 128) != 0) {
                    jB = v00.f33828a.b(c0VarR, 6);
                    i15 &= -29360129;
                } else {
                    jB = j13;
                }
                if ((i11 & 256) != 0) {
                    i15 &= -234881025;
                    jE = v00.f33828a.e(c0VarR, 6);
                } else {
                    jE = j14;
                }
                z15 = z14;
            } else {
                if (i16 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    z14 = false;
                } else {
                    z14 = z11;
                }
                if ((i11 & 8) != 0) {
                    q3VarF = v00.f33828a.f(c0VarR, 6);
                    i15 &= -7169;
                } else {
                    q3VarF = q3Var2;
                }
                if ((i11 & 16) != 0) {
                    jC = v00.f33828a.c(c0VarR, 6);
                    i15 &= -57345;
                } else {
                    jC = j15;
                }
                if ((i11 & 32) != 0) {
                    jD = v00.f33828a.d(c0VarR, 6);
                    i15 &= -458753;
                } else {
                    jD = j16;
                }
                if ((i11 & 64) != 0) {
                    jA = v00.f33828a.a(c0VarR, 6);
                    i15 &= -3670017;
                } else {
                    jA = j12;
                }
                if ((i11 & 128) != 0) {
                    jB = v00.f33828a.b(c0VarR, 6);
                    i15 &= -29360129;
                } else {
                    jB = j13;
                }
                if ((i11 & 256) != 0) {
                    i15 &= -234881025;
                    jE = v00.f33828a.e(c0VarR, 6);
                } else {
                    jE = j14;
                }
                z15 = z14;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(274621471, i15, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:206)");
            }
            strS = u00Var.a().S();
            cVarE = null;
            if (strS != null) {
                c0VarR.E(-663815981);
                androidx.compose.runtime.internal.c cVarE5 = androidx.compose.runtime.internal.w.e(-1378313599, true, new d(jA, u00Var, strS), c0VarR, 54);
                c0VarR.A();
                cVar = cVarE5;
            } else {
                c0VarR.E(-663517017);
                c0VarR.A();
                cVar = null;
            }
            if (u00Var.a().a()) {
                c0VarR.E(-663364652);
                cVarE = androidx.compose.runtime.internal.w.e(-1812633777, true, new e(u00Var), c0VarR, 54);
                c0VarR.A();
            } else {
                c0VarR.E(-662974393);
                c0VarR.A();
            }
            int i28 = i15 << 3;
            c0Var2 = c0VarR;
            i(androidx.compose.foundation.layout.d5.r(a0Var3, androidx.compose.ui.unit.h.r(12)), cVar, cVarE, z15, q3VarF, jC, jD, jB, jE, androidx.compose.runtime.internal.w.e(-1266389126, true, new c(u00Var), c0VarR, 54), c0Var2, (i28 & 3670016) | (i28 & 7168) | 805306368 | (57344 & i28) | (458752 & i28) | (29360128 & i15) | (234881024 & i15), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            j19 = jA;
            z13 = z15;
            q3Var3 = q3VarF;
            j17 = jC;
            j18 = jD;
            j20 = jB;
            j21 = jE;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            z13 = z11;
            q3Var3 = q3Var2;
            j17 = j15;
            j18 = j16;
            j19 = j12;
            j20 = j13;
            j21 = j14;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.h10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return l10.l(u00Var, a0Var3, z13, q3Var3, j17, j18, j19, j20, j21, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(androidx.compose.ui.a0 a0Var, Function2 function2, Function2 function3, boolean z10, androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, long j12, long j13, Function2 function4, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        i(a0Var, function2, function3, z10, q3Var, j10, j11, j12, j13, function4, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(u00 u00Var, androidx.compose.ui.a0 a0Var, boolean z10, androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, long j12, long j13, long j14, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        j(u00Var, a0Var, z10, q3Var, j10, j11, j12, j13, j14, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
