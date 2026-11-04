package androidx.compose.material3;

import java.util.List;
import java.util.Locale;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 9 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 10 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 11 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 12 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 13 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 14 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1118:1\n1282#2,6:1119\n1282#2,6:1125\n1282#2,6:1131\n1282#2,6:1138\n1282#2,6:1144\n1282#2,6:1150\n1282#2,6:1197\n1282#2,6:1203\n52#3:1137\n87#4:1156\n84#4,9:1157\n94#4:1196\n79#5,6:1166\n86#5,3:1181\n89#5,2:1190\n93#5:1195\n347#6,9:1172\n356#6,3:1192\n4206#7,6:1184\n57#8:1209\n57#8:1218\n57#8:1221\n57#8:1228\n57#8:1239\n57#8:1246\n57#8:1253\n60#9:1210\n60#9:1219\n60#9:1222\n53#9,3:1225\n60#9:1229\n53#9,3:1232\n53#9,3:1236\n60#9:1240\n53#9,3:1243\n60#9:1247\n53#9,3:1250\n60#9:1254\n53#9,3:1257\n22#10:1211\n22#10:1220\n22#10:1223\n22#10:1230\n22#10:1241\n22#10:1248\n22#10:1255\n61#11,3:1212\n61#11,3:1215\n30#12:1224\n30#12:1235\n30#12:1249\n33#13:1231\n33#13:1242\n33#13:1256\n113#14:1260\n113#14:1261\n113#14:1262\n113#14:1263\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt\n*L\n103#1:1119,6\n123#1:1125,6\n126#1:1131,6\n286#1:1138,6\n717#1:1144,6\n771#1:1150,6\n816#1:1197,6\n900#1:1203,6\n152#1:1137\n779#1:1156\n779#1:1157,9\n779#1:1196\n779#1:1166,6\n779#1:1181,3\n779#1:1190,2\n779#1:1195\n779#1:1172,9\n779#1:1192,3\n779#1:1184,6\n1018#1:1209\n1039#1:1218\n1040#1:1221\n1053#1:1228\n1065#1:1239\n1069#1:1246\n1075#1:1253\n1018#1:1210\n1039#1:1219\n1040#1:1222\n1046#1:1225,3\n1053#1:1229\n1048#1:1232,3\n1064#1:1236,3\n1065#1:1240\n1065#1:1243,3\n1069#1:1247\n1072#1:1250,3\n1075#1:1254\n1074#1:1257,3\n1018#1:1211\n1039#1:1220\n1040#1:1223\n1053#1:1230\n1065#1:1241\n1069#1:1248\n1075#1:1255\n1020#1:1212,3\n1021#1:1215,3\n1046#1:1224\n1064#1:1235\n1072#1:1249\n1048#1:1231\n1065#1:1242\n1074#1:1256\n931#1:1260\n1110#1:1261\n1112#1:1262\n1117#1:1263\n*E\n"})
public final class za {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.foundation.layout.g5 f35009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.foundation.layout.g5 f35010c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.foundation.layout.g5 f35008a = androidx.compose.foundation.layout.d5.j(androidx.compose.ui.unit.h.r(24), androidx.compose.ui.unit.h.r(20), 0.0f, androidx.compose.ui.unit.h.r(8), 4, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f35011d = androidx.compose.ui.unit.h.r(60);

    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ jb f35012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r7 f35013b;

        a(jb jbVar, r7 r7Var) {
            this.f35012a = jbVar;
            this.f35013b = r7Var;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-803011924, i10, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:105)");
            }
            qa.f32204a.j(this.f35012a.e(), androidx.compose.foundation.layout.d5.p(androidx.compose.ui.a0.E, za.f35009b), this.f35013b.A(), c0Var, 3120, 0);
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

    static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ jb f35014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y7 f35015b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ r7 f35016c;

        b(jb jbVar, y7 y7Var, r7 r7Var) {
            this.f35014a = jbVar;
            this.f35015b = y7Var;
            this.f35016c = r7Var;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-331385278, i10, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:112)");
            }
            qa.f32204a.f(this.f35014a.k(), this.f35014a.h(), this.f35014a.e(), this.f35015b, androidx.compose.foundation.layout.d5.p(androidx.compose.ui.a0.E, za.f35010c), this.f35016c.t(), c0Var, 1597440, 0);
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

    @SourceDebugExtension({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$DateRangePicker$5\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1118:1\n1282#2,6:1119\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$DateRangePicker$5\n*L\n143#1:1119,6\n*E\n"})
    static final class c implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ jb f35017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r7 f35018b;

        c(jb jbVar, r7 r7Var) {
            this.f35017a = jbVar;
            this.f35018b = r7Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(jb jbVar, ed edVar) {
            jbVar.d(edVar.i());
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
                androidx.compose.runtime.m0.A0(1343236786, i10, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:139)");
            }
            androidx.compose.ui.a0 a0VarP = androidx.compose.foundation.layout.d5.p(androidx.compose.ui.a0.E, i9.T0());
            int iE = this.f35017a.e();
            boolean zD = c0Var.D(this.f35017a);
            final jb jbVar = this.f35017a;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.ab
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return za.c.f(jbVar, (ed) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            i9.c0(a0VarP, iE, (Function1) objI0, this.f35018b, c0Var, 6);
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

    @SourceDebugExtension({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$DateRangePicker$6\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1118:1\n1282#2,6:1119\n1282#2,6:1125\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$DateRangePicker$6\n*L\n160#1:1119,6\n171#1:1125,6\n*E\n"})
    static final class d implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ jb f35019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.internal.k1 f35020b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ y7 f35021c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ r7 f35022d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.g0 f35023e;

        d(jb jbVar, androidx.compose.material3.internal.k1 k1Var, y7 y7Var, r7 r7Var, androidx.compose.ui.focus.g0 g0Var) {
            this.f35019a = jbVar;
            this.f35020b = k1Var;
            this.f35021c = y7Var;
            this.f35022d = r7Var;
            this.f35023e = g0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit i(jb jbVar, Long l10, Long l11) {
            try {
                jbVar.i(l10, l11);
            } catch (IllegalArgumentException unused) {
            }
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(jb jbVar, long j10) {
            jbVar.a(j10);
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void f(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(684885105, i10, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:154)");
            }
            Long lK = this.f35019a.k();
            Long lH = this.f35019a.h();
            long jF = this.f35019a.f();
            int iE = this.f35019a.e();
            boolean zD = c0Var.D(this.f35019a);
            final jb jbVar = this.f35019a;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function2() { // from class: androidx.compose.material3.bb
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return za.d.i(jbVar, (Long) obj, (Long) obj2);
                    }
                };
                c0Var.Y(objI0);
            }
            Function2 function2 = (Function2) objI0;
            boolean zD2 = c0Var.D(this.f35019a);
            final jb jbVar2 = this.f35019a;
            Object objI1 = c0Var.i0();
            if (zD2 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = new Function1() { // from class: androidx.compose.material3.cb
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return za.d.k(jbVar2, ((Long) obj).longValue());
                    }
                };
                c0Var.Y(objI1);
            }
            za.o(lK, lH, jF, iE, function2, (Function1) objI1, this.f35020b, this.f35019a.c(), this.f35021c, this.f35019a.b(), this.f35022d, this.f35023e, c0Var, 0, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            f(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.DateRangePickerKt$DateRangePickerContent$1$1", f = "DateRangePicker.kt", i = {}, l = {775}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.j1 f35025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f35026c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(androidx.compose.foundation.lazy.j1 j1Var, int i10, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f35025b = j1Var;
            this.f35026c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new e(this.f35025b, this.f35026c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f35024a;
            if (i10 == 0) {
                ResultKt.m(obj);
                int iE = this.f35025b.E();
                int i11 = this.f35026c;
                if (iE != i11) {
                    androidx.compose.foundation.lazy.j1 j1Var = this.f35025b;
                    this.f35024a = 1;
                    if (androidx.compose.foundation.lazy.j1.f0(j1Var, i11, 0, this, 2, null) == objL) {
                        return objL;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class f implements pj.n<ed, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Long f35027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Long f35028b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f35029c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<Long, Long, Unit> f35030d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<Long, Unit> f35031e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.internal.k1 f35032f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ IntRange f35033g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ y7 f35034h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ ww f35035i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ r7 f35036j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.g0 f35037k;

        /* JADX WARN: Multi-variable type inference failed */
        f(Long l10, Long l11, long j10, Function2<? super Long, ? super Long, Unit> function2, Function1<? super Long, Unit> function1, androidx.compose.material3.internal.k1 k1Var, IntRange intRange, y7 y7Var, ww wwVar, r7 r7Var, androidx.compose.ui.focus.g0 g0Var) {
            this.f35027a = l10;
            this.f35028b = l11;
            this.f35029c = j10;
            this.f35030d = function2;
            this.f35031e = function1;
            this.f35032f = k1Var;
            this.f35033g = intRange;
            this.f35034h = y7Var;
            this.f35035i = wwVar;
            this.f35036j = r7Var;
            this.f35037k = g0Var;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = i11 | (c0Var.K(i10) ? 4 : 2);
            } else {
                i12 = i11;
            }
            if (!c0Var.h((i12 & 19) != 18, i12 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-773828161, i12, -1, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DateRangePicker.kt:721)");
            }
            ed.a aVar = ed.f27323b;
            if (ed.f(i10, aVar.b())) {
                c0Var.E(-619517270);
                za.k(this.f35027a, this.f35028b, this.f35029c, this.f35030d, this.f35031e, this.f35032f, this.f35033g, this.f35034h, this.f35035i, this.f35036j, c0Var, 0);
                c0Var.A();
            } else if (ed.f(i10, aVar.a())) {
                c0Var.E(-619495944);
                ia.d(this.f35027a, this.f35028b, this.f35030d, this.f35032f, this.f35033g, this.f35034h, this.f35035i, this.f35036j, this.f35037k, c0Var, 0);
                c0Var.A();
            } else {
                c0Var.E(-2023979101);
                c0Var.A();
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(ed edVar, androidx.compose.runtime.c0 c0Var, Integer num) {
            c(edVar.i(), c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n*L\n1#1,1118:1\n607#2:1119\n604#2,6:1120\n1282#3,3:1126\n1285#3,3:1130\n1282#3,6:1135\n1282#3,6:1141\n1282#3,6:1147\n605#4:1129\n168#5:1133\n165#5:1134\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1\n*L\n823#1:1119\n823#1:1120,6\n823#1:1126,3\n823#1:1130,3\n829#1:1135,6\n850#1:1141,6\n854#1:1147,6\n823#1:1129\n824#1:1133\n825#1:1134\n*E\n"})
    static final class g implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Long f35038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Long f35039b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<Long, Long, Unit> f35040c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.j1 f35041d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ IntRange f35042e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.internal.k1 f35043f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.internal.o1 f35044g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ y7 f35045h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ r7 f35046i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.internal.j1 f35047j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ ww f35048k;

        @SourceDebugExtension({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1118:1\n87#2:1119\n84#2,9:1120\n94#2:1165\n79#3,6:1129\n86#3,3:1144\n89#3,2:1153\n93#3:1164\n347#4,9:1135\n356#4:1155\n357#4,2:1162\n4206#5,6:1147\n1282#6,6:1156\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1$1\n*L\n857#1:1119\n857#1:1120,9\n857#1:1165\n857#1:1129,6\n857#1:1144,3\n857#1:1153,2\n857#1:1164\n857#1:1135,9\n857#1:1155\n857#1:1162,2\n857#1:1147,6\n873#1:1156,6\n*E\n"})
        static final class a implements pj.o<androidx.compose.foundation.lazy.i, Integer, androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.material3.internal.k1 f35049a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.material3.internal.o1 f35050b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Long f35051c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Long f35052d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function1<Long, Unit> f35053e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ androidx.compose.material3.internal.j1 f35054f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ y7 f35055g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ ww f35056h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ r7 f35057i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ List<androidx.compose.ui.semantics.e> f35058j;

            /* JADX INFO: renamed from: androidx.compose.material3.za$g$a$a, reason: collision with other inner class name */
            @SourceDebugExtension({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1118:1\n1282#2,6:1119\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1\n*L\n867#1:1119,6\n*E\n"})
            static final class C0266a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ y7 f35059a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ androidx.compose.material3.internal.o1 f35060b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ androidx.compose.material3.internal.k1 f35061c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ List<androidx.compose.ui.semantics.e> f35062d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ r7 f35063e;

                C0266a(y7 y7Var, androidx.compose.material3.internal.o1 o1Var, androidx.compose.material3.internal.k1 k1Var, List<androidx.compose.ui.semantics.e> list, r7 r7Var) {
                    this.f35059a = y7Var;
                    this.f35060b = o1Var;
                    this.f35061c = k1Var;
                    this.f35062d = list;
                    this.f35063e = r7Var;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit f(List list, androidx.compose.ui.semantics.e0 e0Var) {
                    androidx.compose.ui.semantics.b0.x1(e0Var, list);
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
                        androidx.compose.runtime.m0.A0(-577031469, i10, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DateRangePicker.kt:858)");
                    }
                    String strA = this.f35059a.a(Long.valueOf(this.f35060b.m()), this.f35061c.l());
                    if (strA == null) {
                        strA = "-";
                    }
                    androidx.compose.ui.a0 a0VarP = androidx.compose.foundation.layout.d5.p(androidx.compose.ui.a0.E, za.D());
                    boolean zK0 = c0Var.k0(this.f35062d);
                    final List<androidx.compose.ui.semantics.e> list = this.f35062d;
                    Object objI0 = c0Var.i0();
                    if (zK0 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.ib
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return za.g.a.C0266a.f(list, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0Var.Y(objI0);
                    }
                    q50.t(strA, androidx.compose.ui.semantics.t.f(a0VarP, false, (Function1) objI0, 1, null), this.f35063e.z(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var, 0, 0, 262136);
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

            /* JADX WARN: Multi-variable type inference failed */
            a(androidx.compose.material3.internal.k1 k1Var, androidx.compose.material3.internal.o1 o1Var, Long l10, Long l11, Function1<? super Long, Unit> function1, androidx.compose.material3.internal.j1 j1Var, y7 y7Var, ww wwVar, r7 r7Var, List<androidx.compose.ui.semantics.e> list) {
                this.f35049a = k1Var;
                this.f35050b = o1Var;
                this.f35051c = l10;
                this.f35052d = l11;
                this.f35053e = function1;
                this.f35054f = j1Var;
                this.f35055g = y7Var;
                this.f35056h = wwVar;
                this.f35057i = r7Var;
                this.f35058j = list;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.foundation.lazy.i iVar, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
                int i12;
                xw xwVar;
                if ((i11 & 6) == 0) {
                    i12 = i11 | (c0Var.D(iVar) ? 4 : 2);
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    i12 |= c0Var.K(i10) ? 32 : 16;
                }
                if (!c0Var.h((i12 & com.planner5d.library.engine.input.f.b.F1) != 146, i12 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(682334170, i12, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DateRangePicker.kt:855)");
                }
                androidx.compose.material3.internal.o1 o1VarT = this.f35049a.t(this.f35050b, i10);
                androidx.compose.ui.a0 a0VarD = androidx.compose.foundation.lazy.i.d(iVar, androidx.compose.ui.a0.E, 0.0f, 1, null);
                Long l10 = this.f35051c;
                Long l11 = this.f35052d;
                Function1<Long, Unit> function1 = this.f35053e;
                androidx.compose.material3.internal.j1 j1Var = this.f35054f;
                y7 y7Var = this.f35055g;
                ww wwVar = this.f35056h;
                r7 r7Var = this.f35057i;
                androidx.compose.material3.internal.k1 k1Var = this.f35049a;
                List<androidx.compose.ui.semantics.e> list = this.f35058j;
                androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var, 0);
                int iJ = androidx.compose.runtime.v.j(c0Var, 0);
                androidx.compose.runtime.b1 b1VarK = c0Var.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarD);
                androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
                Function0<androidx.compose.ui.node.g> function0A = aVar.a();
                if (c0Var.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var.q();
                if (c0Var.P()) {
                    c0Var.q0(function0A);
                } else {
                    c0Var.l();
                }
                androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0Var);
                androidx.compose.runtime.y7.n(c0VarD, a1VarB, aVar.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
                androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
                q50.o(la0.e(d0.x.f269223a.G(), c0Var, 6), androidx.compose.runtime.internal.w.e(-577031469, true, new C0266a(y7Var, o1VarT, k1Var, list, r7Var), c0Var, 54), c0Var, 48);
                if (l10 == null || l11 == null) {
                    c0Var.E(186488258);
                    c0Var.A();
                    xwVar = null;
                } else {
                    c0Var.E(185956701);
                    boolean zD = c0Var.D(l10) | c0Var.D(l11);
                    Object objI0 = c0Var.i0();
                    if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = xw.f34584e.a(o1VarT, k1Var.f(l10.longValue()), k1Var.f(l11.longValue()));
                        c0Var.Y(objI0);
                    }
                    xwVar = (xw) objI0;
                    c0Var.A();
                }
                i9.i0(o1VarT, function1, j1Var.v(), l10, l11, xwVar, y7Var, wwVar, r7Var, k1Var.l(), c0Var, 0);
                c0Var.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            }

            @Override // pj.o
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.lazy.i iVar, Integer num, androidx.compose.runtime.c0 c0Var, Integer num2) {
                c(iVar, num.intValue(), c0Var, num2.intValue());
                return Unit.f312394a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        g(Long l10, Long l11, Function2<? super Long, ? super Long, Unit> function2, androidx.compose.foundation.lazy.j1 j1Var, IntRange intRange, androidx.compose.material3.internal.k1 k1Var, androidx.compose.material3.internal.o1 o1Var, y7 y7Var, r7 r7Var, androidx.compose.material3.internal.j1 j1Var2, ww wwVar) {
            this.f35038a = l10;
            this.f35039b = l11;
            this.f35040c = function2;
            this.f35041d = j1Var;
            this.f35042e = intRange;
            this.f35043f = k1Var;
            this.f35044g = o1Var;
            this.f35045h = y7Var;
            this.f35046i = r7Var;
            this.f35047j = j1Var2;
            this.f35048k = wwVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit n(Long l10, Long l11, Function2 function2, long j10) {
            za.G(j10, l10, l11, function2);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s(androidx.compose.ui.semantics.e0 e0Var) {
            androidx.compose.ui.semantics.b0.d2(e0Var, new androidx.compose.ui.semantics.l(new Function0() { // from class: androidx.compose.material3.gb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Float.valueOf(za.g.v());
                }
            }, new Function0() { // from class: androidx.compose.material3.hb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Float.valueOf(za.g.x());
                }
            }, false, 4, null));
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float v() {
            return 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float x() {
            return 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit y(IntRange intRange, androidx.compose.material3.internal.k1 k1Var, androidx.compose.material3.internal.o1 o1Var, Long l10, Long l11, Function1 function1, androidx.compose.material3.internal.j1 j1Var, y7 y7Var, ww wwVar, r7 r7Var, List list, androidx.compose.foundation.lazy.w0 w0Var) {
            androidx.compose.foundation.lazy.w0.g(w0Var, i9.W0(intRange), null, null, androidx.compose.runtime.internal.w.c(682334170, true, new a(k1Var, o1Var, l10, l11, function1, j1Var, y7Var, wwVar, r7Var, list)), 6, null);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            m(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void m(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1090773432, i10, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous> (DateRangePicker.kt:822)");
            }
            Object objI0 = c0Var.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0Var);
                c0Var.Y(objI0);
            }
            kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) objI0;
            androidx.compose.material3.internal.l3.a aVar2 = androidx.compose.material3.internal.l3.f29010b;
            String strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.H), c0Var, 0);
            String strB2 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.G), c0Var, 0);
            boolean zD = c0Var.D(this.f35038a) | c0Var.D(this.f35039b) | c0Var.D(this.f35040c);
            final Long l10 = this.f35038a;
            final Long l11 = this.f35039b;
            final Function2<Long, Long, Unit> function2 = this.f35040c;
            Object objI1 = c0Var.i0();
            if (zD || objI1 == aVar.a()) {
                objI1 = new Function1() { // from class: androidx.compose.material3.db
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return za.g.n(l10, l11, function2, ((Long) obj).longValue());
                    }
                };
                c0Var.Y(objI1);
            }
            final Function1 function1 = (Function1) objI1;
            final List listZ = za.z(this.f35041d, s0Var, strB, strB2);
            androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
            Object objI2 = c0Var.i0();
            if (objI2 == aVar.a()) {
                objI2 = new Function1() { // from class: androidx.compose.material3.eb
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return za.g.s((androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0Var.Y(objI2);
            }
            androidx.compose.ui.a0 a0VarF = androidx.compose.ui.semantics.t.f(aVar3, false, (Function1) objI2, 1, null);
            androidx.compose.foundation.lazy.j1 j1Var = this.f35041d;
            boolean zK0 = c0Var.k0(this.f35042e) | c0Var.k0(this.f35043f) | c0Var.D(this.f35044g) | c0Var.k0(this.f35045h) | c0Var.k0(listZ) | c0Var.D(this.f35046i) | c0Var.D(this.f35038a) | c0Var.D(this.f35039b) | c0Var.D(function1) | c0Var.D(this.f35047j) | c0Var.D(this.f35048k);
            final IntRange intRange = this.f35042e;
            final androidx.compose.material3.internal.k1 k1Var = this.f35043f;
            final androidx.compose.material3.internal.o1 o1Var = this.f35044g;
            final Long l12 = this.f35038a;
            final Long l13 = this.f35039b;
            final androidx.compose.material3.internal.j1 j1Var2 = this.f35047j;
            final y7 y7Var = this.f35045h;
            final ww wwVar = this.f35048k;
            final r7 r7Var = this.f35046i;
            Object objI3 = c0Var.i0();
            if (zK0 || objI3 == aVar.a()) {
                Object obj = new Function1() { // from class: androidx.compose.material3.fb
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return za.g.y(intRange, k1Var, o1Var, l12, l13, function1, j1Var2, y7Var, wwVar, r7Var, listZ, (androidx.compose.foundation.lazy.w0) obj2);
                    }
                };
                c0Var.Y(obj);
                objI3 = obj;
            }
            androidx.compose.foundation.lazy.h.h(a0VarF, j1Var, null, false, null, null, null, false, null, (Function1) objI3, c0Var, 0, androidx.constraintlayout.core.motion.utils.v.g.f44096p);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$2$1", f = "DateRangePicker.kt", i = {}, l = {901}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.j1 f35065b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Long, Unit> f35066c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.internal.k1 f35067d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ IntRange f35068e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(androidx.compose.foundation.lazy.j1 j1Var, Function1<? super Long, Unit> function1, androidx.compose.material3.internal.k1 k1Var, IntRange intRange, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f35065b = j1Var;
            this.f35066c = function1;
            this.f35067d = k1Var;
            this.f35068e = intRange;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new h(this.f35065b, this.f35066c, this.f35067d, this.f35068e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f35064a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.foundation.lazy.j1 j1Var = this.f35065b;
                Function1<Long, Unit> function1 = this.f35066c;
                androidx.compose.material3.internal.k1 k1Var = this.f35067d;
                IntRange intRange = this.f35068e;
                this.f35064a = 1;
                if (i9.Z0(j1Var, function1, k1Var, intRange, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollDownAction$1$1", f = "DateRangePicker.kt", i = {}, l = {1100}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.j1 f35070b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(androidx.compose.foundation.lazy.j1 j1Var, kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
            this.f35070b = j1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new i(this.f35070b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f35069a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.foundation.lazy.j1 j1Var = this.f35070b;
                int iE = j1Var.E() + 1;
                this.f35069a = 1;
                if (androidx.compose.foundation.lazy.j1.f0(j1Var, iE, 0, this, 2, null) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((i) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollUpAction$1$1", f = "DateRangePicker.kt", i = {}, l = {1092}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.j1 f35072b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(androidx.compose.foundation.lazy.j1 j1Var, kotlin.coroutines.d<? super j> dVar) {
            super(2, dVar);
            this.f35072b = j1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new j(this.f35072b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f35071a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.foundation.lazy.j1 j1Var = this.f35072b;
                int iE = j1Var.E() - 1;
                this.f35071a = 1;
                if (androidx.compose.foundation.lazy.j1.f0(j1Var, iE, 0, this, 2, null) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((j) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static {
        float f10 = 64;
        float f11 = 12;
        int i10 = 2 & 0;
        f35009b = androidx.compose.foundation.layout.d5.j(androidx.compose.ui.unit.h.r(f10), 0.0f, androidx.compose.ui.unit.h.r(f11), 0.0f, 10, null);
        f35010c = androidx.compose.foundation.layout.d5.j(androidx.compose.ui.unit.h.r(f10), 0.0f, androidx.compose.ui.unit.h.r(f11), androidx.compose.ui.unit.h.r(f11), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A(androidx.compose.foundation.lazy.j1 j1Var, kotlinx.coroutines.s0 s0Var) {
        if (!j1Var.k()) {
            return false;
        }
        kotlinx.coroutines.k.f(s0Var, null, null, new j(j1Var, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B(androidx.compose.foundation.lazy.j1 j1Var, kotlinx.coroutines.s0 s0Var) {
        if (!j1Var.f()) {
            return false;
        }
        kotlinx.coroutines.k.f(s0Var, null, null, new i(j1Var, null), 3, null);
        return true;
    }

    public static final void C(@NotNull androidx.compose.ui.graphics.drawscope.c cVar, @NotNull xw xwVar, long j10) {
        float fS7 = cVar.S7(i9.V0());
        float fS8 = cVar.S7(i9.V0());
        float fS9 = cVar.S7(d0.x.f269223a.l());
        float f10 = 2;
        float f11 = (fS8 - fS9) / f10;
        float f12 = 7;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (cVar.d() >> 32)) - (f12 * fS7)) / f12;
        long jC = xwVar.c();
        int iN = androidx.compose.ui.unit.q.n(jC);
        int iP = androidx.compose.ui.unit.q.p(jC);
        long jB = xwVar.b();
        int iN2 = androidx.compose.ui.unit.q.n(jB);
        int iP2 = androidx.compose.ui.unit.q.p(jB);
        float f13 = fS7 + fIntBitsToFloat;
        float f14 = fIntBitsToFloat / f10;
        float fIntBitsToFloat2 = (iN * f13) + (xwVar.a() ? fS7 / f10 : 0.0f) + f14;
        float f15 = (iP * fS8) + f11;
        float f16 = iN2 * f13;
        if (xwVar.d()) {
            fS7 /= f10;
        }
        float fIntBitsToFloat3 = f16 + fS7 + f14;
        float f17 = (iP2 * fS8) + f11;
        boolean z10 = cVar.getLayoutDirection() == androidx.compose.ui.unit.w.Rtl;
        if (z10) {
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (cVar.d() >> 32)) - fIntBitsToFloat2;
            fIntBitsToFloat3 = Float.intBitsToFloat((int) (cVar.d() >> 32)) - fIntBitsToFloat3;
        }
        float fIntBitsToFloat4 = fIntBitsToFloat3;
        androidx.compose.ui.graphics.drawscope.f.V3(cVar, j10, n0.g.g((((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(f15)) & com.rabbitmq.client.k0.f265952a)), n0.n.f((((long) Float.floatToRawIntBits(iP == iP2 ? fIntBitsToFloat4 - fIntBitsToFloat2 : z10 ? -fIntBitsToFloat2 : Float.intBitsToFloat((int) (cVar.d() >> 32)) - fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fS9)) & com.rabbitmq.client.k0.f265952a)), 0.0f, null, null, 0, 120, null);
        if (iP != iP2) {
            for (int i10 = (iP2 - iP) - 1; i10 > 0; i10--) {
                androidx.compose.ui.graphics.drawscope.f.V3(cVar, j10, n0.g.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f15 + (i10 * fS8))) & com.rabbitmq.client.k0.f265952a)), n0.n.f((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (cVar.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(fS9)) & com.rabbitmq.client.k0.f265952a)), 0.0f, null, null, 0, 120, null);
            }
            long jG = n0.g.g((((long) Float.floatToRawIntBits(cVar.getLayoutDirection() != androidx.compose.ui.unit.w.Ltr ? Float.intBitsToFloat((int) (cVar.d() >> 32)) : 0.0f)) << 32) | (((long) Float.floatToRawIntBits(f17)) & com.rabbitmq.client.k0.f265952a));
            if (z10) {
                fIntBitsToFloat4 -= Float.intBitsToFloat((int) (cVar.d() >> 32));
            }
            androidx.compose.ui.graphics.drawscope.f.V3(cVar, j10, jG, n0.n.f((((long) Float.floatToRawIntBits(fIntBitsToFloat4)) << 32) | (((long) Float.floatToRawIntBits(fS9)) & com.rabbitmq.client.k0.f265952a)), 0.0f, null, null, 0, 120, null);
        }
    }

    @NotNull
    public static final androidx.compose.foundation.layout.g5 D() {
        return f35008a;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final jb E(@Nullable Long l10, @Nullable Long l11, @Nullable Long l12, @Nullable IntRange intRange, int i10, @Nullable ww wwVar, @Nullable androidx.compose.runtime.c0 c0Var, int i11, int i12) {
        final Long l13 = (i12 & 1) != 0 ? null : l10;
        final Long l14 = (i12 & 2) != 0 ? null : l11;
        final Long l15 = (i12 & 4) != 0 ? l13 : l12;
        final IntRange intRangeQ = (i12 & 8) != 0 ? v7.f33887a.q() : intRange;
        final int iB = (i12 & 16) != 0 ? ed.f27323b.b() : i10;
        final ww wwVarM = (i12 & 32) != 0 ? v7.f33887a.m() : wwVar;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-2012087461, i11, -1, "androidx.compose.material3.rememberDateRangePickerState (DateRangePicker.kt:283)");
        }
        final Locale localeA = b4.a(c0Var, 0);
        Object[] objArr = new Object[0];
        androidx.compose.runtime.saveable.c0<mb, Object> c0VarC = mb.f30596j.c(wwVarM, localeA);
        boolean z10 = true;
        boolean zK0 = ((((i11 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.D(l14)) || (i11 & 48) == 32) | ((((i11 & 14) ^ 6) > 4 && c0Var.D(l13)) || (i11 & 6) == 4) | ((((i11 & 896) ^ androidx.media3.exoplayer.a5.S0) > 256 && c0Var.D(l15)) || (i11 & androidx.media3.exoplayer.a5.S0) == 256) | c0Var.k0(intRangeQ) | ((((57344 & i11) ^ 24576) > 16384 && c0Var.K(iB)) || (i11 & 24576) == 16384);
        if ((((458752 & i11) ^ androidx.profileinstaller.n.c.f73814m) <= 131072 || !c0Var.D(wwVarM)) && (i11 & androidx.profileinstaller.n.c.f73814m) != 131072) {
            z10 = false;
        }
        boolean zK1 = zK0 | z10 | c0Var.k0(localeA);
        Object objI0 = c0Var.i0();
        if (zK1 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            Object obj = new Function0() { // from class: androidx.compose.material3.va
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return za.F(l13, l14, l15, intRangeQ, iB, wwVarM, localeA);
                }
            };
            c0Var.Y(obj);
            objI0 = obj;
        }
        mb mbVar = (mb) androidx.compose.runtime.saveable.i.j(objArr, c0VarC, (Function0) objI0, c0Var, 0);
        mbVar.m(wwVarM);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return mbVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mb F(Long l10, Long l11, Long l12, IntRange intRange, int i10, ww wwVar, Locale locale) {
        return new mb(l10, l11, l12, intRange, i10, wwVar, locale, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(long j10, Long l10, Long l11, Function2<? super Long, ? super Long, Unit> function2) {
        if ((l10 == null && l11 == null) || (l10 != null && l11 != null)) {
            function2.invoke(Long.valueOf(j10), null);
        } else if (l10 == null || j10 < l10.longValue()) {
            function2.invoke(Long.valueOf(j10), null);
        } else {
            function2.invoke(l10, Long.valueOf(j10));
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0143 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x0145  */
    /* JADX WARN: Code duplicated, block: B:112:0x014c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0158  */
    /* JADX WARN: Code duplicated, block: B:116:0x0170  */
    /* JADX WARN: Code duplicated, block: B:119:0x0176  */
    /* JADX WARN: Code duplicated, block: B:120:0x017f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0182  */
    /* JADX WARN: Code duplicated, block: B:123:0x0199  */
    /* JADX WARN: Code duplicated, block: B:125:0x019e  */
    /* JADX WARN: Code duplicated, block: B:126:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:128:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:130:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:132:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:134:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:137:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:140:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:142:0x0200  */
    /* JADX WARN: Code duplicated, block: B:144:0x0204  */
    /* JADX WARN: Code duplicated, block: B:146:0x020d  */
    /* JADX WARN: Code duplicated, block: B:150:0x021d  */
    /* JADX WARN: Code duplicated, block: B:152:0x0239  */
    /* JADX WARN: Code duplicated, block: B:155:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:158:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:161:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00da  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:92:0x010c  */
    /* JADX WARN: Code duplicated, block: B:93:0x010e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0117  */
    /* JADX WARN: Code duplicated, block: B:98:0x011f  */
    /* JADX WARN: Multi-variable type inference failed */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void i(@NotNull final jb jbVar, @Nullable androidx.compose.ui.a0 a0Var, @Nullable y7 y7Var, @Nullable r7 r7Var, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, boolean z10, @Nullable androidx.compose.ui.focus.g0 g0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        r7 r7Var2;
        int i13;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2E;
        int i14;
        int i15;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4;
        int i16;
        int i17;
        boolean z11;
        int i18;
        int i19;
        int i20;
        boolean z12;
        androidx.compose.runtime.c0 c0Var2;
        final y7 y7Var2;
        final androidx.compose.ui.focus.g0 g0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final r7 r7Var3;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5;
        final boolean z13;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function6;
        androidx.compose.runtime.s5 s5VarT;
        y7 y7Var3;
        r7 r7VarI;
        boolean z14;
        int i21;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2E2;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function7;
        boolean z15;
        r7 r7Var4;
        androidx.compose.ui.a0 a0Var4;
        int i22;
        androidx.compose.ui.focus.g0 g0Var3;
        Object objI0;
        Object objI1;
        boolean zD;
        Object objI2;
        androidx.compose.material3.internal.k1 k1VarA;
        androidx.compose.runtime.internal.c cVarE;
        int i23;
        boolean zK0;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1969726368);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(jbVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i24 = i11 & 2;
        if (i24 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i11 & 4) != 0) {
                    i23 = 128;
                } else {
                    if ((i10 & 512) == 0) {
                        zK0 = c0VarR.D(y7Var);
                    } else {
                        zK0 = c0VarR.k0(y7Var);
                    }
                    if (zK0) {
                        i23 = 256;
                    } else {
                        i23 = 128;
                    }
                }
                i12 |= i23;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    r7Var2 = r7Var;
                    int i25 = c0VarR.D(r7Var2) ? 2048 : 1024;
                    i12 |= i25;
                } else {
                    r7Var2 = r7Var;
                }
                i12 |= i25;
            } else {
                r7Var2 = r7Var;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((i10 & 24576) == 0) {
                    function2E = function2;
                    if (c0VarR.k0(function2E)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    if ((196608 & i10) == 0) {
                        function4 = function3;
                        if (c0VarR.k0(function4)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 64;
                    if (i17 != 0) {
                        if ((1572864 & i10) == 0) {
                            z11 = z10;
                            if (c0VarR.G(z11)) {
                                i18 = 1048576;
                            } else {
                                i18 = 524288;
                            }
                            i12 |= i18;
                        }
                        i19 = i11 & 128;
                        if (i19 != 0) {
                            i12 |= 12582912;
                        } else if ((i10 & 12582912) == 0) {
                            if (c0VarR.D(g0Var)) {
                                i20 = 8388608;
                            } else {
                                i20 = 4194304;
                            }
                            i12 |= i20;
                        }
                        if ((i12 & 4793491) != 4793490) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (c0VarR.h(z12, i12 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i24 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if ((i11 & 4) != 0) {
                                    objI1 = c0VarR.i0();
                                    if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                        objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                        c0VarR.Y(objI1);
                                    }
                                    y7Var3 = (y7) objI1;
                                    i12 &= -897;
                                } else {
                                    y7Var3 = y7Var;
                                }
                                if ((i11 & 8) != 0) {
                                    r7VarI = v7.f33887a.i(c0VarR, 6);
                                    i12 &= -7169;
                                } else {
                                    r7VarI = r7Var2;
                                }
                                if (i13 != 0) {
                                    z14 = true;
                                    function2E = androidx.compose.runtime.internal.w.e(-803011924, true, new a(jbVar, r7VarI), c0VarR, 54);
                                    i21 = 54;
                                } else {
                                    z14 = true;
                                    i21 = 54;
                                }
                                if (i15 != 0) {
                                    function2E2 = androidx.compose.runtime.internal.w.e(-331385278, z14, new b(jbVar, y7Var3, r7VarI), c0VarR, i21);
                                } else {
                                    function2E2 = function4;
                                }
                                if (i17 != 0) {
                                    z11 = true;
                                }
                                if (i19 != 0) {
                                    objI0 = c0VarR.i0();
                                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                        objI0 = new androidx.compose.ui.focus.g0();
                                        c0VarR.Y(objI0);
                                    }
                                    int i26 = i12;
                                    g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                                    z15 = z11;
                                    r7Var4 = r7VarI;
                                    i22 = i26;
                                    function4 = function2E2;
                                    function7 = function2E;
                                    a0Var4 = a0Var2;
                                } else {
                                    function4 = function2E2;
                                    function7 = function2E;
                                    z15 = z11;
                                    r7Var4 = r7VarI;
                                    a0Var4 = a0Var2;
                                    i22 = i12;
                                    g0Var3 = g0Var;
                                }
                            } else {
                                c0VarR.u();
                                if ((i11 & 4) != 0) {
                                    i12 &= -897;
                                }
                                if ((i11 & 8) != 0) {
                                    i12 &= -7169;
                                }
                                y7Var3 = y7Var;
                                i22 = i12;
                                function7 = function2E;
                                z15 = z11;
                                g0Var3 = g0Var;
                                a0Var4 = a0Var2;
                                r7Var4 = r7Var2;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1969726368, i22, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:123)");
                            }
                            zD = c0VarR.D(jbVar.getLocale());
                            objI2 = c0VarR.i0();
                            if (zD || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                                if (jbVar instanceof l2) {
                                    k1VarA = ((l2) jbVar).l();
                                } else {
                                    k1VarA = androidx.compose.material3.internal.n1.a(jbVar.getLocale());
                                }
                                objI2 = k1VarA;
                                c0VarR.Y(objI2);
                            }
                            androidx.compose.material3.internal.k1 k1Var = (androidx.compose.material3.internal.k1) objI2;
                            if (z15) {
                                c0VarR.E(-2018438858);
                                cVarE = androidx.compose.runtime.internal.w.e(1343236786, true, new c(jbVar, r7Var4), c0VarR, 54);
                                c0VarR.A();
                            } else {
                                c0VarR.E(-2018051234);
                                c0VarR.A();
                                cVarE = null;
                            }
                            androidx.compose.runtime.internal.c cVar = cVarE;
                            d0.x xVar = d0.x.f269223a;
                            androidx.compose.ui.text.y3 y3VarE = la0.e(xVar.E(), c0VarR, 6);
                            float fR = androidx.compose.ui.unit.h.r(xVar.D() - f35011d);
                            androidx.compose.ui.focus.g0 g0Var4 = g0Var3;
                            d dVar = new d(jbVar, k1Var, y7Var3, r7Var4, g0Var4);
                            y7 y7Var4 = y7Var3;
                            int i27 = i22 >> 9;
                            c0Var2 = c0VarR;
                            i9.I(a0Var4, function7, function4, cVar, r7Var4, y3VarE, fR, androidx.compose.runtime.internal.w.e(684885105, true, dVar, c0VarR, 54), c0Var2, ((i22 >> 3) & 14) | 14155776 | (i27 & com.planner5d.library.engine.input.f.b.B) | (i27 & 896) | ((i22 << 3) & 57344));
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            y7Var2 = y7Var4;
                            g0Var2 = g0Var4;
                            z13 = z15;
                            a0Var3 = a0Var4;
                            function5 = function7;
                            r7Var3 = r7Var4;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            y7Var2 = y7Var;
                            g0Var2 = g0Var;
                            a0Var3 = a0Var2;
                            r7Var3 = r7Var2;
                            function5 = function2E;
                            z13 = z11;
                        }
                        function6 = function4;
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.ya
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return za.j(jbVar, a0Var3, y7Var2, r7Var3, function5, function6, z13, g0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 1572864;
                    z11 = z10;
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 12582912) == 0) {
                        if (c0VarR.D(g0Var)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 4793491) != 4793490) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i11 & 4) != 0) {
                                objI1 = c0VarR.i0();
                                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                    c0VarR.Y(objI1);
                                }
                                y7Var3 = (y7) objI1;
                                i12 &= -897;
                            } else {
                                y7Var3 = y7Var;
                            }
                            if ((i11 & 8) != 0) {
                                r7VarI = v7.f33887a.i(c0VarR, 6);
                                i12 &= -7169;
                            } else {
                                r7VarI = r7Var2;
                            }
                            if (i13 != 0) {
                                z14 = true;
                                function2E = androidx.compose.runtime.internal.w.e(-803011924, true, new a(jbVar, r7VarI), c0VarR, 54);
                                i21 = 54;
                            } else {
                                z14 = true;
                                i21 = 54;
                            }
                            if (i15 != 0) {
                                function2E2 = androidx.compose.runtime.internal.w.e(-331385278, z14, new b(jbVar, y7Var3, r7VarI), c0VarR, i21);
                            } else {
                                function2E2 = function4;
                            }
                            if (i17 != 0) {
                                z11 = true;
                            }
                            if (i19 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new androidx.compose.ui.focus.g0();
                                    c0VarR.Y(objI0);
                                }
                                int i28 = i12;
                                g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                                z15 = z11;
                                r7Var4 = r7VarI;
                                i22 = i28;
                                function4 = function2E2;
                                function7 = function2E;
                                a0Var4 = a0Var2;
                            } else {
                                function4 = function2E2;
                                function7 = function2E;
                                z15 = z11;
                                r7Var4 = r7VarI;
                                a0Var4 = a0Var2;
                                i22 = i12;
                                g0Var3 = g0Var;
                            }
                        } else {
                            if (i24 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i11 & 4) != 0) {
                                objI1 = c0VarR.i0();
                                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                    c0VarR.Y(objI1);
                                }
                                y7Var3 = (y7) objI1;
                                i12 &= -897;
                            } else {
                                y7Var3 = y7Var;
                            }
                            if ((i11 & 8) != 0) {
                                r7VarI = v7.f33887a.i(c0VarR, 6);
                                i12 &= -7169;
                            } else {
                                r7VarI = r7Var2;
                            }
                            if (i13 != 0) {
                                z14 = true;
                                function2E = androidx.compose.runtime.internal.w.e(-803011924, true, new a(jbVar, r7VarI), c0VarR, 54);
                                i21 = 54;
                            } else {
                                z14 = true;
                                i21 = 54;
                            }
                            if (i15 != 0) {
                                function2E2 = androidx.compose.runtime.internal.w.e(-331385278, z14, new b(jbVar, y7Var3, r7VarI), c0VarR, i21);
                            } else {
                                function2E2 = function4;
                            }
                            if (i17 != 0) {
                                z11 = true;
                            }
                            if (i19 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new androidx.compose.ui.focus.g0();
                                    c0VarR.Y(objI0);
                                }
                                int i29 = i12;
                                g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                                z15 = z11;
                                r7Var4 = r7VarI;
                                i22 = i29;
                                function4 = function2E2;
                                function7 = function2E;
                                a0Var4 = a0Var2;
                            } else {
                                function4 = function2E2;
                                function7 = function2E;
                                z15 = z11;
                                r7Var4 = r7VarI;
                                a0Var4 = a0Var2;
                                i22 = i12;
                                g0Var3 = g0Var;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1969726368, i22, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:123)");
                        }
                        zD = c0VarR.D(jbVar.getLocale());
                        objI2 = c0VarR.i0();
                        if (zD) {
                            if (jbVar instanceof l2) {
                                k1VarA = ((l2) jbVar).l();
                            } else {
                                k1VarA = androidx.compose.material3.internal.n1.a(jbVar.getLocale());
                            }
                            objI2 = k1VarA;
                            c0VarR.Y(objI2);
                        } else {
                            if (jbVar instanceof l2) {
                                k1VarA = ((l2) jbVar).l();
                            } else {
                                k1VarA = androidx.compose.material3.internal.n1.a(jbVar.getLocale());
                            }
                            objI2 = k1VarA;
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.material3.internal.k1 k1Var2 = (androidx.compose.material3.internal.k1) objI2;
                        if (z15) {
                            c0VarR.E(-2018438858);
                            cVarE = androidx.compose.runtime.internal.w.e(1343236786, true, new c(jbVar, r7Var4), c0VarR, 54);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-2018051234);
                            c0VarR.A();
                            cVarE = null;
                        }
                        androidx.compose.runtime.internal.c cVar2 = cVarE;
                        d0.x xVar2 = d0.x.f269223a;
                        androidx.compose.ui.text.y3 y3VarE2 = la0.e(xVar2.E(), c0VarR, 6);
                        float fR2 = androidx.compose.ui.unit.h.r(xVar2.D() - f35011d);
                        androidx.compose.ui.focus.g0 g0Var5 = g0Var3;
                        d dVar2 = new d(jbVar, k1Var2, y7Var3, r7Var4, g0Var5);
                        y7 y7Var5 = y7Var3;
                        int i210 = i22 >> 9;
                        c0Var2 = c0VarR;
                        i9.I(a0Var4, function7, function4, cVar2, r7Var4, y3VarE2, fR2, androidx.compose.runtime.internal.w.e(684885105, true, dVar2, c0VarR, 54), c0Var2, ((i22 >> 3) & 14) | 14155776 | (i210 & com.planner5d.library.engine.input.f.b.B) | (i210 & 896) | ((i22 << 3) & 57344));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        y7Var2 = y7Var5;
                        g0Var2 = g0Var5;
                        z13 = z15;
                        a0Var3 = a0Var4;
                        function5 = function7;
                        r7Var3 = r7Var4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        y7Var2 = y7Var;
                        g0Var2 = g0Var;
                        a0Var3 = a0Var2;
                        r7Var3 = r7Var2;
                        function5 = function2E;
                        z13 = z11;
                    }
                    function6 = function4;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.ya
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return za.j(jbVar, a0Var3, y7Var2, r7Var3, function5, function6, z13, g0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                function4 = function3;
                i17 = i11 & 64;
                if (i17 != 0) {
                    if ((1572864 & i10) == 0) {
                        z11 = z10;
                        if (c0VarR.G(z11)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 12582912) == 0) {
                        if (c0VarR.D(g0Var)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 4793491) != 4793490) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i11 & 4) != 0) {
                                objI1 = c0VarR.i0();
                                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                    c0VarR.Y(objI1);
                                }
                                y7Var3 = (y7) objI1;
                                i12 &= -897;
                            } else {
                                y7Var3 = y7Var;
                            }
                            if ((i11 & 8) != 0) {
                                r7VarI = v7.f33887a.i(c0VarR, 6);
                                i12 &= -7169;
                            } else {
                                r7VarI = r7Var2;
                            }
                            if (i13 != 0) {
                                z14 = true;
                                function2E = androidx.compose.runtime.internal.w.e(-803011924, true, new a(jbVar, r7VarI), c0VarR, 54);
                                i21 = 54;
                            } else {
                                z14 = true;
                                i21 = 54;
                            }
                            if (i15 != 0) {
                                function2E2 = androidx.compose.runtime.internal.w.e(-331385278, z14, new b(jbVar, y7Var3, r7VarI), c0VarR, i21);
                            } else {
                                function2E2 = function4;
                            }
                            if (i17 != 0) {
                                z11 = true;
                            }
                            if (i19 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new androidx.compose.ui.focus.g0();
                                    c0VarR.Y(objI0);
                                }
                                int i211 = i12;
                                g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                                z15 = z11;
                                r7Var4 = r7VarI;
                                i22 = i211;
                                function4 = function2E2;
                                function7 = function2E;
                                a0Var4 = a0Var2;
                            } else {
                                function4 = function2E2;
                                function7 = function2E;
                                z15 = z11;
                                r7Var4 = r7VarI;
                                a0Var4 = a0Var2;
                                i22 = i12;
                                g0Var3 = g0Var;
                            }
                        } else {
                            if (i24 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i11 & 4) != 0) {
                                objI1 = c0VarR.i0();
                                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                    c0VarR.Y(objI1);
                                }
                                y7Var3 = (y7) objI1;
                                i12 &= -897;
                            } else {
                                y7Var3 = y7Var;
                            }
                            if ((i11 & 8) != 0) {
                                r7VarI = v7.f33887a.i(c0VarR, 6);
                                i12 &= -7169;
                            } else {
                                r7VarI = r7Var2;
                            }
                            if (i13 != 0) {
                                z14 = true;
                                function2E = androidx.compose.runtime.internal.w.e(-803011924, true, new a(jbVar, r7VarI), c0VarR, 54);
                                i21 = 54;
                            } else {
                                z14 = true;
                                i21 = 54;
                            }
                            if (i15 != 0) {
                                function2E2 = androidx.compose.runtime.internal.w.e(-331385278, z14, new b(jbVar, y7Var3, r7VarI), c0VarR, i21);
                            } else {
                                function2E2 = function4;
                            }
                            if (i17 != 0) {
                                z11 = true;
                            }
                            if (i19 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new androidx.compose.ui.focus.g0();
                                    c0VarR.Y(objI0);
                                }
                                int i212 = i12;
                                g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                                z15 = z11;
                                r7Var4 = r7VarI;
                                i22 = i212;
                                function4 = function2E2;
                                function7 = function2E;
                                a0Var4 = a0Var2;
                            } else {
                                function4 = function2E2;
                                function7 = function2E;
                                z15 = z11;
                                r7Var4 = r7VarI;
                                a0Var4 = a0Var2;
                                i22 = i12;
                                g0Var3 = g0Var;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1969726368, i22, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:123)");
                        }
                        zD = c0VarR.D(jbVar.getLocale());
                        objI2 = c0VarR.i0();
                        if (zD) {
                            if (jbVar instanceof l2) {
                                k1VarA = ((l2) jbVar).l();
                            } else {
                                k1VarA = androidx.compose.material3.internal.n1.a(jbVar.getLocale());
                            }
                            objI2 = k1VarA;
                            c0VarR.Y(objI2);
                        } else {
                            if (jbVar instanceof l2) {
                                k1VarA = ((l2) jbVar).l();
                            } else {
                                k1VarA = androidx.compose.material3.internal.n1.a(jbVar.getLocale());
                            }
                            objI2 = k1VarA;
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.material3.internal.k1 k1Var3 = (androidx.compose.material3.internal.k1) objI2;
                        if (z15) {
                            c0VarR.E(-2018438858);
                            cVarE = androidx.compose.runtime.internal.w.e(1343236786, true, new c(jbVar, r7Var4), c0VarR, 54);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-2018051234);
                            c0VarR.A();
                            cVarE = null;
                        }
                        androidx.compose.runtime.internal.c cVar3 = cVarE;
                        d0.x xVar3 = d0.x.f269223a;
                        androidx.compose.ui.text.y3 y3VarE3 = la0.e(xVar3.E(), c0VarR, 6);
                        float fR3 = androidx.compose.ui.unit.h.r(xVar3.D() - f35011d);
                        androidx.compose.ui.focus.g0 g0Var6 = g0Var3;
                        d dVar3 = new d(jbVar, k1Var3, y7Var3, r7Var4, g0Var6);
                        y7 y7Var6 = y7Var3;
                        int i213 = i22 >> 9;
                        c0Var2 = c0VarR;
                        i9.I(a0Var4, function7, function4, cVar3, r7Var4, y3VarE3, fR3, androidx.compose.runtime.internal.w.e(684885105, true, dVar3, c0VarR, 54), c0Var2, ((i22 >> 3) & 14) | 14155776 | (i213 & com.planner5d.library.engine.input.f.b.B) | (i213 & 896) | ((i22 << 3) & 57344));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        y7Var2 = y7Var6;
                        g0Var2 = g0Var6;
                        z13 = z15;
                        a0Var3 = a0Var4;
                        function5 = function7;
                        r7Var3 = r7Var4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        y7Var2 = y7Var;
                        g0Var2 = g0Var;
                        a0Var3 = a0Var2;
                        r7Var3 = r7Var2;
                        function5 = function2E;
                        z13 = z11;
                    }
                    function6 = function4;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.ya
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return za.j(jbVar, a0Var3, y7Var2, r7Var3, function5, function6, z13, g0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                z11 = z10;
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.D(g0Var)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                if ((i12 & 4793491) != 4793490) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                c0VarR.Y(objI1);
                            }
                            y7Var3 = (y7) objI1;
                            i12 &= -897;
                        } else {
                            y7Var3 = y7Var;
                        }
                        if ((i11 & 8) != 0) {
                            r7VarI = v7.f33887a.i(c0VarR, 6);
                            i12 &= -7169;
                        } else {
                            r7VarI = r7Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                            function2E = androidx.compose.runtime.internal.w.e(-803011924, true, new a(jbVar, r7VarI), c0VarR, 54);
                            i21 = 54;
                        } else {
                            z14 = true;
                            i21 = 54;
                        }
                        if (i15 != 0) {
                            function2E2 = androidx.compose.runtime.internal.w.e(-331385278, z14, new b(jbVar, y7Var3, r7VarI), c0VarR, i21);
                        } else {
                            function2E2 = function4;
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if (i19 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new androidx.compose.ui.focus.g0();
                                c0VarR.Y(objI0);
                            }
                            int i214 = i12;
                            g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            i22 = i214;
                            function4 = function2E2;
                            function7 = function2E;
                            a0Var4 = a0Var2;
                        } else {
                            function4 = function2E2;
                            function7 = function2E;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            a0Var4 = a0Var2;
                            i22 = i12;
                            g0Var3 = g0Var;
                        }
                    } else {
                        if (i24 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                c0VarR.Y(objI1);
                            }
                            y7Var3 = (y7) objI1;
                            i12 &= -897;
                        } else {
                            y7Var3 = y7Var;
                        }
                        if ((i11 & 8) != 0) {
                            r7VarI = v7.f33887a.i(c0VarR, 6);
                            i12 &= -7169;
                        } else {
                            r7VarI = r7Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                            function2E = androidx.compose.runtime.internal.w.e(-803011924, true, new a(jbVar, r7VarI), c0VarR, 54);
                            i21 = 54;
                        } else {
                            z14 = true;
                            i21 = 54;
                        }
                        if (i15 != 0) {
                            function2E2 = androidx.compose.runtime.internal.w.e(-331385278, z14, new b(jbVar, y7Var3, r7VarI), c0VarR, i21);
                        } else {
                            function2E2 = function4;
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if (i19 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new androidx.compose.ui.focus.g0();
                                c0VarR.Y(objI0);
                            }
                            int i215 = i12;
                            g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            i22 = i215;
                            function4 = function2E2;
                            function7 = function2E;
                            a0Var4 = a0Var2;
                        } else {
                            function4 = function2E2;
                            function7 = function2E;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            a0Var4 = a0Var2;
                            i22 = i12;
                            g0Var3 = g0Var;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1969726368, i22, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:123)");
                    }
                    zD = c0VarR.D(jbVar.getLocale());
                    objI2 = c0VarR.i0();
                    if (zD) {
                        if (jbVar instanceof l2) {
                            k1VarA = ((l2) jbVar).l();
                        } else {
                            k1VarA = androidx.compose.material3.internal.n1.a(jbVar.getLocale());
                        }
                        objI2 = k1VarA;
                        c0VarR.Y(objI2);
                    } else {
                        if (jbVar instanceof l2) {
                            k1VarA = ((l2) jbVar).l();
                        } else {
                            k1VarA = androidx.compose.material3.internal.n1.a(jbVar.getLocale());
                        }
                        objI2 = k1VarA;
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.material3.internal.k1 k1Var4 = (androidx.compose.material3.internal.k1) objI2;
                    if (z15) {
                        c0VarR.E(-2018438858);
                        cVarE = androidx.compose.runtime.internal.w.e(1343236786, true, new c(jbVar, r7Var4), c0VarR, 54);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-2018051234);
                        c0VarR.A();
                        cVarE = null;
                    }
                    androidx.compose.runtime.internal.c cVar4 = cVarE;
                    d0.x xVar4 = d0.x.f269223a;
                    androidx.compose.ui.text.y3 y3VarE4 = la0.e(xVar4.E(), c0VarR, 6);
                    float fR4 = androidx.compose.ui.unit.h.r(xVar4.D() - f35011d);
                    androidx.compose.ui.focus.g0 g0Var7 = g0Var3;
                    d dVar4 = new d(jbVar, k1Var4, y7Var3, r7Var4, g0Var7);
                    y7 y7Var7 = y7Var3;
                    int i216 = i22 >> 9;
                    c0Var2 = c0VarR;
                    i9.I(a0Var4, function7, function4, cVar4, r7Var4, y3VarE4, fR4, androidx.compose.runtime.internal.w.e(684885105, true, dVar4, c0VarR, 54), c0Var2, ((i22 >> 3) & 14) | 14155776 | (i216 & com.planner5d.library.engine.input.f.b.B) | (i216 & 896) | ((i22 << 3) & 57344));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    y7Var2 = y7Var7;
                    g0Var2 = g0Var7;
                    z13 = z15;
                    a0Var3 = a0Var4;
                    function5 = function7;
                    r7Var3 = r7Var4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    y7Var2 = y7Var;
                    g0Var2 = g0Var;
                    a0Var3 = a0Var2;
                    r7Var3 = r7Var2;
                    function5 = function2E;
                    z13 = z11;
                }
                function6 = function4;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ya
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return za.j(jbVar, a0Var3, y7Var2, r7Var3, function5, function6, z13, g0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            function2E = function2;
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    function4 = function3;
                    if (c0VarR.k0(function4)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    if ((1572864 & i10) == 0) {
                        z11 = z10;
                        if (c0VarR.G(z11)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 12582912) == 0) {
                        if (c0VarR.D(g0Var)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 4793491) != 4793490) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i11 & 4) != 0) {
                                objI1 = c0VarR.i0();
                                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                    c0VarR.Y(objI1);
                                }
                                y7Var3 = (y7) objI1;
                                i12 &= -897;
                            } else {
                                y7Var3 = y7Var;
                            }
                            if ((i11 & 8) != 0) {
                                r7VarI = v7.f33887a.i(c0VarR, 6);
                                i12 &= -7169;
                            } else {
                                r7VarI = r7Var2;
                            }
                            if (i13 != 0) {
                                z14 = true;
                                function2E = androidx.compose.runtime.internal.w.e(-803011924, true, new a(jbVar, r7VarI), c0VarR, 54);
                                i21 = 54;
                            } else {
                                z14 = true;
                                i21 = 54;
                            }
                            if (i15 != 0) {
                                function2E2 = androidx.compose.runtime.internal.w.e(-331385278, z14, new b(jbVar, y7Var3, r7VarI), c0VarR, i21);
                            } else {
                                function2E2 = function4;
                            }
                            if (i17 != 0) {
                                z11 = true;
                            }
                            if (i19 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new androidx.compose.ui.focus.g0();
                                    c0VarR.Y(objI0);
                                }
                                int i217 = i12;
                                g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                                z15 = z11;
                                r7Var4 = r7VarI;
                                i22 = i217;
                                function4 = function2E2;
                                function7 = function2E;
                                a0Var4 = a0Var2;
                            } else {
                                function4 = function2E2;
                                function7 = function2E;
                                z15 = z11;
                                r7Var4 = r7VarI;
                                a0Var4 = a0Var2;
                                i22 = i12;
                                g0Var3 = g0Var;
                            }
                        } else {
                            if (i24 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i11 & 4) != 0) {
                                objI1 = c0VarR.i0();
                                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                    c0VarR.Y(objI1);
                                }
                                y7Var3 = (y7) objI1;
                                i12 &= -897;
                            } else {
                                y7Var3 = y7Var;
                            }
                            if ((i11 & 8) != 0) {
                                r7VarI = v7.f33887a.i(c0VarR, 6);
                                i12 &= -7169;
                            } else {
                                r7VarI = r7Var2;
                            }
                            if (i13 != 0) {
                                z14 = true;
                                function2E = androidx.compose.runtime.internal.w.e(-803011924, true, new a(jbVar, r7VarI), c0VarR, 54);
                                i21 = 54;
                            } else {
                                z14 = true;
                                i21 = 54;
                            }
                            if (i15 != 0) {
                                function2E2 = androidx.compose.runtime.internal.w.e(-331385278, z14, new b(jbVar, y7Var3, r7VarI), c0VarR, i21);
                            } else {
                                function2E2 = function4;
                            }
                            if (i17 != 0) {
                                z11 = true;
                            }
                            if (i19 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new androidx.compose.ui.focus.g0();
                                    c0VarR.Y(objI0);
                                }
                                int i218 = i12;
                                g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                                z15 = z11;
                                r7Var4 = r7VarI;
                                i22 = i218;
                                function4 = function2E2;
                                function7 = function2E;
                                a0Var4 = a0Var2;
                            } else {
                                function4 = function2E2;
                                function7 = function2E;
                                z15 = z11;
                                r7Var4 = r7VarI;
                                a0Var4 = a0Var2;
                                i22 = i12;
                                g0Var3 = g0Var;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1969726368, i22, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:123)");
                        }
                        zD = c0VarR.D(jbVar.getLocale());
                        objI2 = c0VarR.i0();
                        if (zD) {
                            if (jbVar instanceof l2) {
                                k1VarA = ((l2) jbVar).l();
                            } else {
                                k1VarA = androidx.compose.material3.internal.n1.a(jbVar.getLocale());
                            }
                            objI2 = k1VarA;
                            c0VarR.Y(objI2);
                        } else {
                            if (jbVar instanceof l2) {
                                k1VarA = ((l2) jbVar).l();
                            } else {
                                k1VarA = androidx.compose.material3.internal.n1.a(jbVar.getLocale());
                            }
                            objI2 = k1VarA;
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.material3.internal.k1 k1Var5 = (androidx.compose.material3.internal.k1) objI2;
                        if (z15) {
                            c0VarR.E(-2018438858);
                            cVarE = androidx.compose.runtime.internal.w.e(1343236786, true, new c(jbVar, r7Var4), c0VarR, 54);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-2018051234);
                            c0VarR.A();
                            cVarE = null;
                        }
                        androidx.compose.runtime.internal.c cVar5 = cVarE;
                        d0.x xVar5 = d0.x.f269223a;
                        androidx.compose.ui.text.y3 y3VarE5 = la0.e(xVar5.E(), c0VarR, 6);
                        float fR5 = androidx.compose.ui.unit.h.r(xVar5.D() - f35011d);
                        androidx.compose.ui.focus.g0 g0Var8 = g0Var3;
                        d dVar5 = new d(jbVar, k1Var5, y7Var3, r7Var4, g0Var8);
                        y7 y7Var8 = y7Var3;
                        int i219 = i22 >> 9;
                        c0Var2 = c0VarR;
                        i9.I(a0Var4, function7, function4, cVar5, r7Var4, y3VarE5, fR5, androidx.compose.runtime.internal.w.e(684885105, true, dVar5, c0VarR, 54), c0Var2, ((i22 >> 3) & 14) | 14155776 | (i219 & com.planner5d.library.engine.input.f.b.B) | (i219 & 896) | ((i22 << 3) & 57344));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        y7Var2 = y7Var8;
                        g0Var2 = g0Var8;
                        z13 = z15;
                        a0Var3 = a0Var4;
                        function5 = function7;
                        r7Var3 = r7Var4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        y7Var2 = y7Var;
                        g0Var2 = g0Var;
                        a0Var3 = a0Var2;
                        r7Var3 = r7Var2;
                        function5 = function2E;
                        z13 = z11;
                    }
                    function6 = function4;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.ya
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return za.j(jbVar, a0Var3, y7Var2, r7Var3, function5, function6, z13, g0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                z11 = z10;
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.D(g0Var)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                if ((i12 & 4793491) != 4793490) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                c0VarR.Y(objI1);
                            }
                            y7Var3 = (y7) objI1;
                            i12 &= -897;
                        } else {
                            y7Var3 = y7Var;
                        }
                        if ((i11 & 8) != 0) {
                            r7VarI = v7.f33887a.i(c0VarR, 6);
                            i12 &= -7169;
                        } else {
                            r7VarI = r7Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                            function2E = androidx.compose.runtime.internal.w.e(-803011924, true, new a(jbVar, r7VarI), c0VarR, 54);
                            i21 = 54;
                        } else {
                            z14 = true;
                            i21 = 54;
                        }
                        if (i15 != 0) {
                            function2E2 = androidx.compose.runtime.internal.w.e(-331385278, z14, new b(jbVar, y7Var3, r7VarI), c0VarR, i21);
                        } else {
                            function2E2 = function4;
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if (i19 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new androidx.compose.ui.focus.g0();
                                c0VarR.Y(objI0);
                            }
                            int i2110 = i12;
                            g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            i22 = i2110;
                            function4 = function2E2;
                            function7 = function2E;
                            a0Var4 = a0Var2;
                        } else {
                            function4 = function2E2;
                            function7 = function2E;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            a0Var4 = a0Var2;
                            i22 = i12;
                            g0Var3 = g0Var;
                        }
                    } else {
                        if (i24 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                c0VarR.Y(objI1);
                            }
                            y7Var3 = (y7) objI1;
                            i12 &= -897;
                        } else {
                            y7Var3 = y7Var;
                        }
                        if ((i11 & 8) != 0) {
                            r7VarI = v7.f33887a.i(c0VarR, 6);
                            i12 &= -7169;
                        } else {
                            r7VarI = r7Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                            function2E = androidx.compose.runtime.internal.w.e(-803011924, true, new a(jbVar, r7VarI), c0VarR, 54);
                            i21 = 54;
                        } else {
                            z14 = true;
                            i21 = 54;
                        }
                        if (i15 != 0) {
                            function2E2 = androidx.compose.runtime.internal.w.e(-331385278, z14, new b(jbVar, y7Var3, r7VarI), c0VarR, i21);
                        } else {
                            function2E2 = function4;
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if (i19 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new androidx.compose.ui.focus.g0();
                                c0VarR.Y(objI0);
                            }
                            int i2111 = i12;
                            g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            i22 = i2111;
                            function4 = function2E2;
                            function7 = function2E;
                            a0Var4 = a0Var2;
                        } else {
                            function4 = function2E2;
                            function7 = function2E;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            a0Var4 = a0Var2;
                            i22 = i12;
                            g0Var3 = g0Var;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1969726368, i22, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:123)");
                    }
                    zD = c0VarR.D(jbVar.getLocale());
                    objI2 = c0VarR.i0();
                    if (zD) {
                        if (jbVar instanceof l2) {
                            k1VarA = ((l2) jbVar).l();
                        } else {
                            k1VarA = androidx.compose.material3.internal.n1.a(jbVar.getLocale());
                        }
                        objI2 = k1VarA;
                        c0VarR.Y(objI2);
                    } else {
                        if (jbVar instanceof l2) {
                            k1VarA = ((l2) jbVar).l();
                        } else {
                            k1VarA = androidx.compose.material3.internal.n1.a(jbVar.getLocale());
                        }
                        objI2 = k1VarA;
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.material3.internal.k1 k1Var6 = (androidx.compose.material3.internal.k1) objI2;
                    if (z15) {
                        c0VarR.E(-2018438858);
                        cVarE = androidx.compose.runtime.internal.w.e(1343236786, true, new c(jbVar, r7Var4), c0VarR, 54);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-2018051234);
                        c0VarR.A();
                        cVarE = null;
                    }
                    androidx.compose.runtime.internal.c cVar6 = cVarE;
                    d0.x xVar6 = d0.x.f269223a;
                    androidx.compose.ui.text.y3 y3VarE6 = la0.e(xVar6.E(), c0VarR, 6);
                    float fR6 = androidx.compose.ui.unit.h.r(xVar6.D() - f35011d);
                    androidx.compose.ui.focus.g0 g0Var9 = g0Var3;
                    d dVar6 = new d(jbVar, k1Var6, y7Var3, r7Var4, g0Var9);
                    y7 y7Var9 = y7Var3;
                    int i2112 = i22 >> 9;
                    c0Var2 = c0VarR;
                    i9.I(a0Var4, function7, function4, cVar6, r7Var4, y3VarE6, fR6, androidx.compose.runtime.internal.w.e(684885105, true, dVar6, c0VarR, 54), c0Var2, ((i22 >> 3) & 14) | 14155776 | (i2112 & com.planner5d.library.engine.input.f.b.B) | (i2112 & 896) | ((i22 << 3) & 57344));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    y7Var2 = y7Var9;
                    g0Var2 = g0Var9;
                    z13 = z15;
                    a0Var3 = a0Var4;
                    function5 = function7;
                    r7Var3 = r7Var4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    y7Var2 = y7Var;
                    g0Var2 = g0Var;
                    a0Var3 = a0Var2;
                    r7Var3 = r7Var2;
                    function5 = function2E;
                    z13 = z11;
                }
                function6 = function4;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ya
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return za.j(jbVar, a0Var3, y7Var2, r7Var3, function5, function6, z13, g0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            function4 = function3;
            i17 = i11 & 64;
            if (i17 != 0) {
                if ((1572864 & i10) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.D(g0Var)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                if ((i12 & 4793491) != 4793490) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                c0VarR.Y(objI1);
                            }
                            y7Var3 = (y7) objI1;
                            i12 &= -897;
                        } else {
                            y7Var3 = y7Var;
                        }
                        if ((i11 & 8) != 0) {
                            r7VarI = v7.f33887a.i(c0VarR, 6);
                            i12 &= -7169;
                        } else {
                            r7VarI = r7Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                            function2E = androidx.compose.runtime.internal.w.e(-803011924, true, new a(jbVar, r7VarI), c0VarR, 54);
                            i21 = 54;
                        } else {
                            z14 = true;
                            i21 = 54;
                        }
                        if (i15 != 0) {
                            function2E2 = androidx.compose.runtime.internal.w.e(-331385278, z14, new b(jbVar, y7Var3, r7VarI), c0VarR, i21);
                        } else {
                            function2E2 = function4;
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if (i19 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new androidx.compose.ui.focus.g0();
                                c0VarR.Y(objI0);
                            }
                            int i2113 = i12;
                            g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            i22 = i2113;
                            function4 = function2E2;
                            function7 = function2E;
                            a0Var4 = a0Var2;
                        } else {
                            function4 = function2E2;
                            function7 = function2E;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            a0Var4 = a0Var2;
                            i22 = i12;
                            g0Var3 = g0Var;
                        }
                    } else {
                        if (i24 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                c0VarR.Y(objI1);
                            }
                            y7Var3 = (y7) objI1;
                            i12 &= -897;
                        } else {
                            y7Var3 = y7Var;
                        }
                        if ((i11 & 8) != 0) {
                            r7VarI = v7.f33887a.i(c0VarR, 6);
                            i12 &= -7169;
                        } else {
                            r7VarI = r7Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                            function2E = androidx.compose.runtime.internal.w.e(-803011924, true, new a(jbVar, r7VarI), c0VarR, 54);
                            i21 = 54;
                        } else {
                            z14 = true;
                            i21 = 54;
                        }
                        if (i15 != 0) {
                            function2E2 = androidx.compose.runtime.internal.w.e(-331385278, z14, new b(jbVar, y7Var3, r7VarI), c0VarR, i21);
                        } else {
                            function2E2 = function4;
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if (i19 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new androidx.compose.ui.focus.g0();
                                c0VarR.Y(objI0);
                            }
                            int i2114 = i12;
                            g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            i22 = i2114;
                            function4 = function2E2;
                            function7 = function2E;
                            a0Var4 = a0Var2;
                        } else {
                            function4 = function2E2;
                            function7 = function2E;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            a0Var4 = a0Var2;
                            i22 = i12;
                            g0Var3 = g0Var;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1969726368, i22, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:123)");
                    }
                    zD = c0VarR.D(jbVar.getLocale());
                    objI2 = c0VarR.i0();
                    if (zD) {
                        if (jbVar instanceof l2) {
                            k1VarA = ((l2) jbVar).l();
                        } else {
                            k1VarA = androidx.compose.material3.internal.n1.a(jbVar.getLocale());
                        }
                        objI2 = k1VarA;
                        c0VarR.Y(objI2);
                    } else {
                        if (jbVar instanceof l2) {
                            k1VarA = ((l2) jbVar).l();
                        } else {
                            k1VarA = androidx.compose.material3.internal.n1.a(jbVar.getLocale());
                        }
                        objI2 = k1VarA;
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.material3.internal.k1 k1Var7 = (androidx.compose.material3.internal.k1) objI2;
                    if (z15) {
                        c0VarR.E(-2018438858);
                        cVarE = androidx.compose.runtime.internal.w.e(1343236786, true, new c(jbVar, r7Var4), c0VarR, 54);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-2018051234);
                        c0VarR.A();
                        cVarE = null;
                    }
                    androidx.compose.runtime.internal.c cVar7 = cVarE;
                    d0.x xVar7 = d0.x.f269223a;
                    androidx.compose.ui.text.y3 y3VarE7 = la0.e(xVar7.E(), c0VarR, 6);
                    float fR7 = androidx.compose.ui.unit.h.r(xVar7.D() - f35011d);
                    androidx.compose.ui.focus.g0 g0Var10 = g0Var3;
                    d dVar7 = new d(jbVar, k1Var7, y7Var3, r7Var4, g0Var10);
                    y7 y7Var10 = y7Var3;
                    int i2115 = i22 >> 9;
                    c0Var2 = c0VarR;
                    i9.I(a0Var4, function7, function4, cVar7, r7Var4, y3VarE7, fR7, androidx.compose.runtime.internal.w.e(684885105, true, dVar7, c0VarR, 54), c0Var2, ((i22 >> 3) & 14) | 14155776 | (i2115 & com.planner5d.library.engine.input.f.b.B) | (i2115 & 896) | ((i22 << 3) & 57344));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    y7Var2 = y7Var10;
                    g0Var2 = g0Var10;
                    z13 = z15;
                    a0Var3 = a0Var4;
                    function5 = function7;
                    r7Var3 = r7Var4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    y7Var2 = y7Var;
                    g0Var2 = g0Var;
                    a0Var3 = a0Var2;
                    r7Var3 = r7Var2;
                    function5 = function2E;
                    z13 = z11;
                }
                function6 = function4;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ya
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return za.j(jbVar, a0Var3, y7Var2, r7Var3, function5, function6, z13, g0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            z11 = z10;
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.D(g0Var)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            if ((i12 & 4793491) != 4793490) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                            c0VarR.Y(objI1);
                        }
                        y7Var3 = (y7) objI1;
                        i12 &= -897;
                    } else {
                        y7Var3 = y7Var;
                    }
                    if ((i11 & 8) != 0) {
                        r7VarI = v7.f33887a.i(c0VarR, 6);
                        i12 &= -7169;
                    } else {
                        r7VarI = r7Var2;
                    }
                    if (i13 != 0) {
                        z14 = true;
                        function2E = androidx.compose.runtime.internal.w.e(-803011924, true, new a(jbVar, r7VarI), c0VarR, 54);
                        i21 = 54;
                    } else {
                        z14 = true;
                        i21 = 54;
                    }
                    if (i15 != 0) {
                        function2E2 = androidx.compose.runtime.internal.w.e(-331385278, z14, new b(jbVar, y7Var3, r7VarI), c0VarR, i21);
                    } else {
                        function2E2 = function4;
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    if (i19 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new androidx.compose.ui.focus.g0();
                            c0VarR.Y(objI0);
                        }
                        int i2116 = i12;
                        g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                        z15 = z11;
                        r7Var4 = r7VarI;
                        i22 = i2116;
                        function4 = function2E2;
                        function7 = function2E;
                        a0Var4 = a0Var2;
                    } else {
                        function4 = function2E2;
                        function7 = function2E;
                        z15 = z11;
                        r7Var4 = r7VarI;
                        a0Var4 = a0Var2;
                        i22 = i12;
                        g0Var3 = g0Var;
                    }
                } else {
                    if (i24 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                            c0VarR.Y(objI1);
                        }
                        y7Var3 = (y7) objI1;
                        i12 &= -897;
                    } else {
                        y7Var3 = y7Var;
                    }
                    if ((i11 & 8) != 0) {
                        r7VarI = v7.f33887a.i(c0VarR, 6);
                        i12 &= -7169;
                    } else {
                        r7VarI = r7Var2;
                    }
                    if (i13 != 0) {
                        z14 = true;
                        function2E = androidx.compose.runtime.internal.w.e(-803011924, true, new a(jbVar, r7VarI), c0VarR, 54);
                        i21 = 54;
                    } else {
                        z14 = true;
                        i21 = 54;
                    }
                    if (i15 != 0) {
                        function2E2 = androidx.compose.runtime.internal.w.e(-331385278, z14, new b(jbVar, y7Var3, r7VarI), c0VarR, i21);
                    } else {
                        function2E2 = function4;
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    if (i19 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new androidx.compose.ui.focus.g0();
                            c0VarR.Y(objI0);
                        }
                        int i2117 = i12;
                        g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                        z15 = z11;
                        r7Var4 = r7VarI;
                        i22 = i2117;
                        function4 = function2E2;
                        function7 = function2E;
                        a0Var4 = a0Var2;
                    } else {
                        function4 = function2E2;
                        function7 = function2E;
                        z15 = z11;
                        r7Var4 = r7VarI;
                        a0Var4 = a0Var2;
                        i22 = i12;
                        g0Var3 = g0Var;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1969726368, i22, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:123)");
                }
                zD = c0VarR.D(jbVar.getLocale());
                objI2 = c0VarR.i0();
                if (zD) {
                    if (jbVar instanceof l2) {
                        k1VarA = ((l2) jbVar).l();
                    } else {
                        k1VarA = androidx.compose.material3.internal.n1.a(jbVar.getLocale());
                    }
                    objI2 = k1VarA;
                    c0VarR.Y(objI2);
                } else {
                    if (jbVar instanceof l2) {
                        k1VarA = ((l2) jbVar).l();
                    } else {
                        k1VarA = androidx.compose.material3.internal.n1.a(jbVar.getLocale());
                    }
                    objI2 = k1VarA;
                    c0VarR.Y(objI2);
                }
                androidx.compose.material3.internal.k1 k1Var8 = (androidx.compose.material3.internal.k1) objI2;
                if (z15) {
                    c0VarR.E(-2018438858);
                    cVarE = androidx.compose.runtime.internal.w.e(1343236786, true, new c(jbVar, r7Var4), c0VarR, 54);
                    c0VarR.A();
                } else {
                    c0VarR.E(-2018051234);
                    c0VarR.A();
                    cVarE = null;
                }
                androidx.compose.runtime.internal.c cVar8 = cVarE;
                d0.x xVar8 = d0.x.f269223a;
                androidx.compose.ui.text.y3 y3VarE8 = la0.e(xVar8.E(), c0VarR, 6);
                float fR8 = androidx.compose.ui.unit.h.r(xVar8.D() - f35011d);
                androidx.compose.ui.focus.g0 g0Var11 = g0Var3;
                d dVar8 = new d(jbVar, k1Var8, y7Var3, r7Var4, g0Var11);
                y7 y7Var11 = y7Var3;
                int i2118 = i22 >> 9;
                c0Var2 = c0VarR;
                i9.I(a0Var4, function7, function4, cVar8, r7Var4, y3VarE8, fR8, androidx.compose.runtime.internal.w.e(684885105, true, dVar8, c0VarR, 54), c0Var2, ((i22 >> 3) & 14) | 14155776 | (i2118 & com.planner5d.library.engine.input.f.b.B) | (i2118 & 896) | ((i22 << 3) & 57344));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                y7Var2 = y7Var11;
                g0Var2 = g0Var11;
                z13 = z15;
                a0Var3 = a0Var4;
                function5 = function7;
                r7Var3 = r7Var4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                y7Var2 = y7Var;
                g0Var2 = g0Var;
                a0Var3 = a0Var2;
                r7Var3 = r7Var2;
                function5 = function2E;
                z13 = z11;
            }
            function6 = function4;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ya
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return za.j(jbVar, a0Var3, y7Var2, r7Var3, function5, function6, z13, g0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) != 0) {
                i23 = 128;
            } else {
                if ((i10 & 512) == 0) {
                    zK0 = c0VarR.D(y7Var);
                } else {
                    zK0 = c0VarR.k0(y7Var);
                }
                if (zK0) {
                    i23 = 256;
                } else {
                    i23 = 128;
                }
            }
            i12 |= i23;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                r7Var2 = r7Var;
                if (c0VarR.D(r7Var2)) {
                }
                i12 |= i25;
            } else {
                r7Var2 = r7Var;
            }
            i12 |= i25;
        } else {
            r7Var2 = r7Var;
        }
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((i10 & 24576) == 0) {
                function2E = function2;
                if (c0VarR.k0(function2E)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    function4 = function3;
                    if (c0VarR.k0(function4)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    if ((1572864 & i10) == 0) {
                        z11 = z10;
                        if (c0VarR.G(z11)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 12582912) == 0) {
                        if (c0VarR.D(g0Var)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 4793491) != 4793490) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i11 & 4) != 0) {
                                objI1 = c0VarR.i0();
                                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                    c0VarR.Y(objI1);
                                }
                                y7Var3 = (y7) objI1;
                                i12 &= -897;
                            } else {
                                y7Var3 = y7Var;
                            }
                            if ((i11 & 8) != 0) {
                                r7VarI = v7.f33887a.i(c0VarR, 6);
                                i12 &= -7169;
                            } else {
                                r7VarI = r7Var2;
                            }
                            if (i13 != 0) {
                                z14 = true;
                                function2E = androidx.compose.runtime.internal.w.e(-803011924, true, new a(jbVar, r7VarI), c0VarR, 54);
                                i21 = 54;
                            } else {
                                z14 = true;
                                i21 = 54;
                            }
                            if (i15 != 0) {
                                function2E2 = androidx.compose.runtime.internal.w.e(-331385278, z14, new b(jbVar, y7Var3, r7VarI), c0VarR, i21);
                            } else {
                                function2E2 = function4;
                            }
                            if (i17 != 0) {
                                z11 = true;
                            }
                            if (i19 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new androidx.compose.ui.focus.g0();
                                    c0VarR.Y(objI0);
                                }
                                int i2119 = i12;
                                g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                                z15 = z11;
                                r7Var4 = r7VarI;
                                i22 = i2119;
                                function4 = function2E2;
                                function7 = function2E;
                                a0Var4 = a0Var2;
                            } else {
                                function4 = function2E2;
                                function7 = function2E;
                                z15 = z11;
                                r7Var4 = r7VarI;
                                a0Var4 = a0Var2;
                                i22 = i12;
                                g0Var3 = g0Var;
                            }
                        } else {
                            if (i24 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i11 & 4) != 0) {
                                objI1 = c0VarR.i0();
                                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                    c0VarR.Y(objI1);
                                }
                                y7Var3 = (y7) objI1;
                                i12 &= -897;
                            } else {
                                y7Var3 = y7Var;
                            }
                            if ((i11 & 8) != 0) {
                                r7VarI = v7.f33887a.i(c0VarR, 6);
                                i12 &= -7169;
                            } else {
                                r7VarI = r7Var2;
                            }
                            if (i13 != 0) {
                                z14 = true;
                                function2E = androidx.compose.runtime.internal.w.e(-803011924, true, new a(jbVar, r7VarI), c0VarR, 54);
                                i21 = 54;
                            } else {
                                z14 = true;
                                i21 = 54;
                            }
                            if (i15 != 0) {
                                function2E2 = androidx.compose.runtime.internal.w.e(-331385278, z14, new b(jbVar, y7Var3, r7VarI), c0VarR, i21);
                            } else {
                                function2E2 = function4;
                            }
                            if (i17 != 0) {
                                z11 = true;
                            }
                            if (i19 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new androidx.compose.ui.focus.g0();
                                    c0VarR.Y(objI0);
                                }
                                int i21110 = i12;
                                g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                                z15 = z11;
                                r7Var4 = r7VarI;
                                i22 = i21110;
                                function4 = function2E2;
                                function7 = function2E;
                                a0Var4 = a0Var2;
                            } else {
                                function4 = function2E2;
                                function7 = function2E;
                                z15 = z11;
                                r7Var4 = r7VarI;
                                a0Var4 = a0Var2;
                                i22 = i12;
                                g0Var3 = g0Var;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1969726368, i22, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:123)");
                        }
                        zD = c0VarR.D(jbVar.getLocale());
                        objI2 = c0VarR.i0();
                        if (zD) {
                            if (jbVar instanceof l2) {
                                k1VarA = ((l2) jbVar).l();
                            } else {
                                k1VarA = androidx.compose.material3.internal.n1.a(jbVar.getLocale());
                            }
                            objI2 = k1VarA;
                            c0VarR.Y(objI2);
                        } else {
                            if (jbVar instanceof l2) {
                                k1VarA = ((l2) jbVar).l();
                            } else {
                                k1VarA = androidx.compose.material3.internal.n1.a(jbVar.getLocale());
                            }
                            objI2 = k1VarA;
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.material3.internal.k1 k1Var9 = (androidx.compose.material3.internal.k1) objI2;
                        if (z15) {
                            c0VarR.E(-2018438858);
                            cVarE = androidx.compose.runtime.internal.w.e(1343236786, true, new c(jbVar, r7Var4), c0VarR, 54);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-2018051234);
                            c0VarR.A();
                            cVarE = null;
                        }
                        androidx.compose.runtime.internal.c cVar9 = cVarE;
                        d0.x xVar9 = d0.x.f269223a;
                        androidx.compose.ui.text.y3 y3VarE9 = la0.e(xVar9.E(), c0VarR, 6);
                        float fR9 = androidx.compose.ui.unit.h.r(xVar9.D() - f35011d);
                        androidx.compose.ui.focus.g0 g0Var12 = g0Var3;
                        d dVar9 = new d(jbVar, k1Var9, y7Var3, r7Var4, g0Var12);
                        y7 y7Var12 = y7Var3;
                        int i21111 = i22 >> 9;
                        c0Var2 = c0VarR;
                        i9.I(a0Var4, function7, function4, cVar9, r7Var4, y3VarE9, fR9, androidx.compose.runtime.internal.w.e(684885105, true, dVar9, c0VarR, 54), c0Var2, ((i22 >> 3) & 14) | 14155776 | (i21111 & com.planner5d.library.engine.input.f.b.B) | (i21111 & 896) | ((i22 << 3) & 57344));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        y7Var2 = y7Var12;
                        g0Var2 = g0Var12;
                        z13 = z15;
                        a0Var3 = a0Var4;
                        function5 = function7;
                        r7Var3 = r7Var4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        y7Var2 = y7Var;
                        g0Var2 = g0Var;
                        a0Var3 = a0Var2;
                        r7Var3 = r7Var2;
                        function5 = function2E;
                        z13 = z11;
                    }
                    function6 = function4;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.ya
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return za.j(jbVar, a0Var3, y7Var2, r7Var3, function5, function6, z13, g0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                z11 = z10;
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.D(g0Var)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                if ((i12 & 4793491) != 4793490) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                c0VarR.Y(objI1);
                            }
                            y7Var3 = (y7) objI1;
                            i12 &= -897;
                        } else {
                            y7Var3 = y7Var;
                        }
                        if ((i11 & 8) != 0) {
                            r7VarI = v7.f33887a.i(c0VarR, 6);
                            i12 &= -7169;
                        } else {
                            r7VarI = r7Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                            function2E = androidx.compose.runtime.internal.w.e(-803011924, true, new a(jbVar, r7VarI), c0VarR, 54);
                            i21 = 54;
                        } else {
                            z14 = true;
                            i21 = 54;
                        }
                        if (i15 != 0) {
                            function2E2 = androidx.compose.runtime.internal.w.e(-331385278, z14, new b(jbVar, y7Var3, r7VarI), c0VarR, i21);
                        } else {
                            function2E2 = function4;
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if (i19 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new androidx.compose.ui.focus.g0();
                                c0VarR.Y(objI0);
                            }
                            int i21112 = i12;
                            g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            i22 = i21112;
                            function4 = function2E2;
                            function7 = function2E;
                            a0Var4 = a0Var2;
                        } else {
                            function4 = function2E2;
                            function7 = function2E;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            a0Var4 = a0Var2;
                            i22 = i12;
                            g0Var3 = g0Var;
                        }
                    } else {
                        if (i24 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                c0VarR.Y(objI1);
                            }
                            y7Var3 = (y7) objI1;
                            i12 &= -897;
                        } else {
                            y7Var3 = y7Var;
                        }
                        if ((i11 & 8) != 0) {
                            r7VarI = v7.f33887a.i(c0VarR, 6);
                            i12 &= -7169;
                        } else {
                            r7VarI = r7Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                            function2E = androidx.compose.runtime.internal.w.e(-803011924, true, new a(jbVar, r7VarI), c0VarR, 54);
                            i21 = 54;
                        } else {
                            z14 = true;
                            i21 = 54;
                        }
                        if (i15 != 0) {
                            function2E2 = androidx.compose.runtime.internal.w.e(-331385278, z14, new b(jbVar, y7Var3, r7VarI), c0VarR, i21);
                        } else {
                            function2E2 = function4;
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if (i19 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new androidx.compose.ui.focus.g0();
                                c0VarR.Y(objI0);
                            }
                            int i21113 = i12;
                            g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            i22 = i21113;
                            function4 = function2E2;
                            function7 = function2E;
                            a0Var4 = a0Var2;
                        } else {
                            function4 = function2E2;
                            function7 = function2E;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            a0Var4 = a0Var2;
                            i22 = i12;
                            g0Var3 = g0Var;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1969726368, i22, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:123)");
                    }
                    zD = c0VarR.D(jbVar.getLocale());
                    objI2 = c0VarR.i0();
                    if (zD) {
                        if (jbVar instanceof l2) {
                            k1VarA = ((l2) jbVar).l();
                        } else {
                            k1VarA = androidx.compose.material3.internal.n1.a(jbVar.getLocale());
                        }
                        objI2 = k1VarA;
                        c0VarR.Y(objI2);
                    } else {
                        if (jbVar instanceof l2) {
                            k1VarA = ((l2) jbVar).l();
                        } else {
                            k1VarA = androidx.compose.material3.internal.n1.a(jbVar.getLocale());
                        }
                        objI2 = k1VarA;
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.material3.internal.k1 k1Var10 = (androidx.compose.material3.internal.k1) objI2;
                    if (z15) {
                        c0VarR.E(-2018438858);
                        cVarE = androidx.compose.runtime.internal.w.e(1343236786, true, new c(jbVar, r7Var4), c0VarR, 54);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-2018051234);
                        c0VarR.A();
                        cVarE = null;
                    }
                    androidx.compose.runtime.internal.c cVar10 = cVarE;
                    d0.x xVar10 = d0.x.f269223a;
                    androidx.compose.ui.text.y3 y3VarE10 = la0.e(xVar10.E(), c0VarR, 6);
                    float fR10 = androidx.compose.ui.unit.h.r(xVar10.D() - f35011d);
                    androidx.compose.ui.focus.g0 g0Var13 = g0Var3;
                    d dVar10 = new d(jbVar, k1Var10, y7Var3, r7Var4, g0Var13);
                    y7 y7Var13 = y7Var3;
                    int i21114 = i22 >> 9;
                    c0Var2 = c0VarR;
                    i9.I(a0Var4, function7, function4, cVar10, r7Var4, y3VarE10, fR10, androidx.compose.runtime.internal.w.e(684885105, true, dVar10, c0VarR, 54), c0Var2, ((i22 >> 3) & 14) | 14155776 | (i21114 & com.planner5d.library.engine.input.f.b.B) | (i21114 & 896) | ((i22 << 3) & 57344));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    y7Var2 = y7Var13;
                    g0Var2 = g0Var13;
                    z13 = z15;
                    a0Var3 = a0Var4;
                    function5 = function7;
                    r7Var3 = r7Var4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    y7Var2 = y7Var;
                    g0Var2 = g0Var;
                    a0Var3 = a0Var2;
                    r7Var3 = r7Var2;
                    function5 = function2E;
                    z13 = z11;
                }
                function6 = function4;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ya
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return za.j(jbVar, a0Var3, y7Var2, r7Var3, function5, function6, z13, g0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            function4 = function3;
            i17 = i11 & 64;
            if (i17 != 0) {
                if ((1572864 & i10) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.D(g0Var)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                if ((i12 & 4793491) != 4793490) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                c0VarR.Y(objI1);
                            }
                            y7Var3 = (y7) objI1;
                            i12 &= -897;
                        } else {
                            y7Var3 = y7Var;
                        }
                        if ((i11 & 8) != 0) {
                            r7VarI = v7.f33887a.i(c0VarR, 6);
                            i12 &= -7169;
                        } else {
                            r7VarI = r7Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                            function2E = androidx.compose.runtime.internal.w.e(-803011924, true, new a(jbVar, r7VarI), c0VarR, 54);
                            i21 = 54;
                        } else {
                            z14 = true;
                            i21 = 54;
                        }
                        if (i15 != 0) {
                            function2E2 = androidx.compose.runtime.internal.w.e(-331385278, z14, new b(jbVar, y7Var3, r7VarI), c0VarR, i21);
                        } else {
                            function2E2 = function4;
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if (i19 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new androidx.compose.ui.focus.g0();
                                c0VarR.Y(objI0);
                            }
                            int i21115 = i12;
                            g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            i22 = i21115;
                            function4 = function2E2;
                            function7 = function2E;
                            a0Var4 = a0Var2;
                        } else {
                            function4 = function2E2;
                            function7 = function2E;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            a0Var4 = a0Var2;
                            i22 = i12;
                            g0Var3 = g0Var;
                        }
                    } else {
                        if (i24 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                c0VarR.Y(objI1);
                            }
                            y7Var3 = (y7) objI1;
                            i12 &= -897;
                        } else {
                            y7Var3 = y7Var;
                        }
                        if ((i11 & 8) != 0) {
                            r7VarI = v7.f33887a.i(c0VarR, 6);
                            i12 &= -7169;
                        } else {
                            r7VarI = r7Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                            function2E = androidx.compose.runtime.internal.w.e(-803011924, true, new a(jbVar, r7VarI), c0VarR, 54);
                            i21 = 54;
                        } else {
                            z14 = true;
                            i21 = 54;
                        }
                        if (i15 != 0) {
                            function2E2 = androidx.compose.runtime.internal.w.e(-331385278, z14, new b(jbVar, y7Var3, r7VarI), c0VarR, i21);
                        } else {
                            function2E2 = function4;
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if (i19 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new androidx.compose.ui.focus.g0();
                                c0VarR.Y(objI0);
                            }
                            int i21116 = i12;
                            g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            i22 = i21116;
                            function4 = function2E2;
                            function7 = function2E;
                            a0Var4 = a0Var2;
                        } else {
                            function4 = function2E2;
                            function7 = function2E;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            a0Var4 = a0Var2;
                            i22 = i12;
                            g0Var3 = g0Var;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1969726368, i22, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:123)");
                    }
                    zD = c0VarR.D(jbVar.getLocale());
                    objI2 = c0VarR.i0();
                    if (zD) {
                        if (jbVar instanceof l2) {
                            k1VarA = ((l2) jbVar).l();
                        } else {
                            k1VarA = androidx.compose.material3.internal.n1.a(jbVar.getLocale());
                        }
                        objI2 = k1VarA;
                        c0VarR.Y(objI2);
                    } else {
                        if (jbVar instanceof l2) {
                            k1VarA = ((l2) jbVar).l();
                        } else {
                            k1VarA = androidx.compose.material3.internal.n1.a(jbVar.getLocale());
                        }
                        objI2 = k1VarA;
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.material3.internal.k1 k1Var11 = (androidx.compose.material3.internal.k1) objI2;
                    if (z15) {
                        c0VarR.E(-2018438858);
                        cVarE = androidx.compose.runtime.internal.w.e(1343236786, true, new c(jbVar, r7Var4), c0VarR, 54);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-2018051234);
                        c0VarR.A();
                        cVarE = null;
                    }
                    androidx.compose.runtime.internal.c cVar11 = cVarE;
                    d0.x xVar11 = d0.x.f269223a;
                    androidx.compose.ui.text.y3 y3VarE11 = la0.e(xVar11.E(), c0VarR, 6);
                    float fR11 = androidx.compose.ui.unit.h.r(xVar11.D() - f35011d);
                    androidx.compose.ui.focus.g0 g0Var14 = g0Var3;
                    d dVar11 = new d(jbVar, k1Var11, y7Var3, r7Var4, g0Var14);
                    y7 y7Var14 = y7Var3;
                    int i21117 = i22 >> 9;
                    c0Var2 = c0VarR;
                    i9.I(a0Var4, function7, function4, cVar11, r7Var4, y3VarE11, fR11, androidx.compose.runtime.internal.w.e(684885105, true, dVar11, c0VarR, 54), c0Var2, ((i22 >> 3) & 14) | 14155776 | (i21117 & com.planner5d.library.engine.input.f.b.B) | (i21117 & 896) | ((i22 << 3) & 57344));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    y7Var2 = y7Var14;
                    g0Var2 = g0Var14;
                    z13 = z15;
                    a0Var3 = a0Var4;
                    function5 = function7;
                    r7Var3 = r7Var4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    y7Var2 = y7Var;
                    g0Var2 = g0Var;
                    a0Var3 = a0Var2;
                    r7Var3 = r7Var2;
                    function5 = function2E;
                    z13 = z11;
                }
                function6 = function4;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ya
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return za.j(jbVar, a0Var3, y7Var2, r7Var3, function5, function6, z13, g0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            z11 = z10;
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.D(g0Var)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            if ((i12 & 4793491) != 4793490) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                            c0VarR.Y(objI1);
                        }
                        y7Var3 = (y7) objI1;
                        i12 &= -897;
                    } else {
                        y7Var3 = y7Var;
                    }
                    if ((i11 & 8) != 0) {
                        r7VarI = v7.f33887a.i(c0VarR, 6);
                        i12 &= -7169;
                    } else {
                        r7VarI = r7Var2;
                    }
                    if (i13 != 0) {
                        z14 = true;
                        function2E = androidx.compose.runtime.internal.w.e(-803011924, true, new a(jbVar, r7VarI), c0VarR, 54);
                        i21 = 54;
                    } else {
                        z14 = true;
                        i21 = 54;
                    }
                    if (i15 != 0) {
                        function2E2 = androidx.compose.runtime.internal.w.e(-331385278, z14, new b(jbVar, y7Var3, r7VarI), c0VarR, i21);
                    } else {
                        function2E2 = function4;
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    if (i19 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new androidx.compose.ui.focus.g0();
                            c0VarR.Y(objI0);
                        }
                        int i21118 = i12;
                        g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                        z15 = z11;
                        r7Var4 = r7VarI;
                        i22 = i21118;
                        function4 = function2E2;
                        function7 = function2E;
                        a0Var4 = a0Var2;
                    } else {
                        function4 = function2E2;
                        function7 = function2E;
                        z15 = z11;
                        r7Var4 = r7VarI;
                        a0Var4 = a0Var2;
                        i22 = i12;
                        g0Var3 = g0Var;
                    }
                } else {
                    if (i24 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                            c0VarR.Y(objI1);
                        }
                        y7Var3 = (y7) objI1;
                        i12 &= -897;
                    } else {
                        y7Var3 = y7Var;
                    }
                    if ((i11 & 8) != 0) {
                        r7VarI = v7.f33887a.i(c0VarR, 6);
                        i12 &= -7169;
                    } else {
                        r7VarI = r7Var2;
                    }
                    if (i13 != 0) {
                        z14 = true;
                        function2E = androidx.compose.runtime.internal.w.e(-803011924, true, new a(jbVar, r7VarI), c0VarR, 54);
                        i21 = 54;
                    } else {
                        z14 = true;
                        i21 = 54;
                    }
                    if (i15 != 0) {
                        function2E2 = androidx.compose.runtime.internal.w.e(-331385278, z14, new b(jbVar, y7Var3, r7VarI), c0VarR, i21);
                    } else {
                        function2E2 = function4;
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    if (i19 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new androidx.compose.ui.focus.g0();
                            c0VarR.Y(objI0);
                        }
                        int i21119 = i12;
                        g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                        z15 = z11;
                        r7Var4 = r7VarI;
                        i22 = i21119;
                        function4 = function2E2;
                        function7 = function2E;
                        a0Var4 = a0Var2;
                    } else {
                        function4 = function2E2;
                        function7 = function2E;
                        z15 = z11;
                        r7Var4 = r7VarI;
                        a0Var4 = a0Var2;
                        i22 = i12;
                        g0Var3 = g0Var;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1969726368, i22, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:123)");
                }
                zD = c0VarR.D(jbVar.getLocale());
                objI2 = c0VarR.i0();
                if (zD) {
                    if (jbVar instanceof l2) {
                        k1VarA = ((l2) jbVar).l();
                    } else {
                        k1VarA = androidx.compose.material3.internal.n1.a(jbVar.getLocale());
                    }
                    objI2 = k1VarA;
                    c0VarR.Y(objI2);
                } else {
                    if (jbVar instanceof l2) {
                        k1VarA = ((l2) jbVar).l();
                    } else {
                        k1VarA = androidx.compose.material3.internal.n1.a(jbVar.getLocale());
                    }
                    objI2 = k1VarA;
                    c0VarR.Y(objI2);
                }
                androidx.compose.material3.internal.k1 k1Var12 = (androidx.compose.material3.internal.k1) objI2;
                if (z15) {
                    c0VarR.E(-2018438858);
                    cVarE = androidx.compose.runtime.internal.w.e(1343236786, true, new c(jbVar, r7Var4), c0VarR, 54);
                    c0VarR.A();
                } else {
                    c0VarR.E(-2018051234);
                    c0VarR.A();
                    cVarE = null;
                }
                androidx.compose.runtime.internal.c cVar12 = cVarE;
                d0.x xVar12 = d0.x.f269223a;
                androidx.compose.ui.text.y3 y3VarE12 = la0.e(xVar12.E(), c0VarR, 6);
                float fR12 = androidx.compose.ui.unit.h.r(xVar12.D() - f35011d);
                androidx.compose.ui.focus.g0 g0Var15 = g0Var3;
                d dVar12 = new d(jbVar, k1Var12, y7Var3, r7Var4, g0Var15);
                y7 y7Var15 = y7Var3;
                int i211110 = i22 >> 9;
                c0Var2 = c0VarR;
                i9.I(a0Var4, function7, function4, cVar12, r7Var4, y3VarE12, fR12, androidx.compose.runtime.internal.w.e(684885105, true, dVar12, c0VarR, 54), c0Var2, ((i22 >> 3) & 14) | 14155776 | (i211110 & com.planner5d.library.engine.input.f.b.B) | (i211110 & 896) | ((i22 << 3) & 57344));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                y7Var2 = y7Var15;
                g0Var2 = g0Var15;
                z13 = z15;
                a0Var3 = a0Var4;
                function5 = function7;
                r7Var3 = r7Var4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                y7Var2 = y7Var;
                g0Var2 = g0Var;
                a0Var3 = a0Var2;
                r7Var3 = r7Var2;
                function5 = function2E;
                z13 = z11;
            }
            function6 = function4;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ya
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return za.j(jbVar, a0Var3, y7Var2, r7Var3, function5, function6, z13, g0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        function2E = function2;
        i15 = i11 & 32;
        if (i15 != 0) {
            if ((196608 & i10) == 0) {
                function4 = function3;
                if (c0VarR.k0(function4)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                if ((1572864 & i10) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.D(g0Var)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                if ((i12 & 4793491) != 4793490) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                c0VarR.Y(objI1);
                            }
                            y7Var3 = (y7) objI1;
                            i12 &= -897;
                        } else {
                            y7Var3 = y7Var;
                        }
                        if ((i11 & 8) != 0) {
                            r7VarI = v7.f33887a.i(c0VarR, 6);
                            i12 &= -7169;
                        } else {
                            r7VarI = r7Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                            function2E = androidx.compose.runtime.internal.w.e(-803011924, true, new a(jbVar, r7VarI), c0VarR, 54);
                            i21 = 54;
                        } else {
                            z14 = true;
                            i21 = 54;
                        }
                        if (i15 != 0) {
                            function2E2 = androidx.compose.runtime.internal.w.e(-331385278, z14, new b(jbVar, y7Var3, r7VarI), c0VarR, i21);
                        } else {
                            function2E2 = function4;
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if (i19 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new androidx.compose.ui.focus.g0();
                                c0VarR.Y(objI0);
                            }
                            int i211111 = i12;
                            g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            i22 = i211111;
                            function4 = function2E2;
                            function7 = function2E;
                            a0Var4 = a0Var2;
                        } else {
                            function4 = function2E2;
                            function7 = function2E;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            a0Var4 = a0Var2;
                            i22 = i12;
                            g0Var3 = g0Var;
                        }
                    } else {
                        if (i24 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                                c0VarR.Y(objI1);
                            }
                            y7Var3 = (y7) objI1;
                            i12 &= -897;
                        } else {
                            y7Var3 = y7Var;
                        }
                        if ((i11 & 8) != 0) {
                            r7VarI = v7.f33887a.i(c0VarR, 6);
                            i12 &= -7169;
                        } else {
                            r7VarI = r7Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                            function2E = androidx.compose.runtime.internal.w.e(-803011924, true, new a(jbVar, r7VarI), c0VarR, 54);
                            i21 = 54;
                        } else {
                            z14 = true;
                            i21 = 54;
                        }
                        if (i15 != 0) {
                            function2E2 = androidx.compose.runtime.internal.w.e(-331385278, z14, new b(jbVar, y7Var3, r7VarI), c0VarR, i21);
                        } else {
                            function2E2 = function4;
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if (i19 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new androidx.compose.ui.focus.g0();
                                c0VarR.Y(objI0);
                            }
                            int i211112 = i12;
                            g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            i22 = i211112;
                            function4 = function2E2;
                            function7 = function2E;
                            a0Var4 = a0Var2;
                        } else {
                            function4 = function2E2;
                            function7 = function2E;
                            z15 = z11;
                            r7Var4 = r7VarI;
                            a0Var4 = a0Var2;
                            i22 = i12;
                            g0Var3 = g0Var;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1969726368, i22, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:123)");
                    }
                    zD = c0VarR.D(jbVar.getLocale());
                    objI2 = c0VarR.i0();
                    if (zD) {
                        if (jbVar instanceof l2) {
                            k1VarA = ((l2) jbVar).l();
                        } else {
                            k1VarA = androidx.compose.material3.internal.n1.a(jbVar.getLocale());
                        }
                        objI2 = k1VarA;
                        c0VarR.Y(objI2);
                    } else {
                        if (jbVar instanceof l2) {
                            k1VarA = ((l2) jbVar).l();
                        } else {
                            k1VarA = androidx.compose.material3.internal.n1.a(jbVar.getLocale());
                        }
                        objI2 = k1VarA;
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.material3.internal.k1 k1Var13 = (androidx.compose.material3.internal.k1) objI2;
                    if (z15) {
                        c0VarR.E(-2018438858);
                        cVarE = androidx.compose.runtime.internal.w.e(1343236786, true, new c(jbVar, r7Var4), c0VarR, 54);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-2018051234);
                        c0VarR.A();
                        cVarE = null;
                    }
                    androidx.compose.runtime.internal.c cVar13 = cVarE;
                    d0.x xVar13 = d0.x.f269223a;
                    androidx.compose.ui.text.y3 y3VarE13 = la0.e(xVar13.E(), c0VarR, 6);
                    float fR13 = androidx.compose.ui.unit.h.r(xVar13.D() - f35011d);
                    androidx.compose.ui.focus.g0 g0Var16 = g0Var3;
                    d dVar13 = new d(jbVar, k1Var13, y7Var3, r7Var4, g0Var16);
                    y7 y7Var16 = y7Var3;
                    int i211113 = i22 >> 9;
                    c0Var2 = c0VarR;
                    i9.I(a0Var4, function7, function4, cVar13, r7Var4, y3VarE13, fR13, androidx.compose.runtime.internal.w.e(684885105, true, dVar13, c0VarR, 54), c0Var2, ((i22 >> 3) & 14) | 14155776 | (i211113 & com.planner5d.library.engine.input.f.b.B) | (i211113 & 896) | ((i22 << 3) & 57344));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    y7Var2 = y7Var16;
                    g0Var2 = g0Var16;
                    z13 = z15;
                    a0Var3 = a0Var4;
                    function5 = function7;
                    r7Var3 = r7Var4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    y7Var2 = y7Var;
                    g0Var2 = g0Var;
                    a0Var3 = a0Var2;
                    r7Var3 = r7Var2;
                    function5 = function2E;
                    z13 = z11;
                }
                function6 = function4;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ya
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return za.j(jbVar, a0Var3, y7Var2, r7Var3, function5, function6, z13, g0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            z11 = z10;
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.D(g0Var)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            if ((i12 & 4793491) != 4793490) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                            c0VarR.Y(objI1);
                        }
                        y7Var3 = (y7) objI1;
                        i12 &= -897;
                    } else {
                        y7Var3 = y7Var;
                    }
                    if ((i11 & 8) != 0) {
                        r7VarI = v7.f33887a.i(c0VarR, 6);
                        i12 &= -7169;
                    } else {
                        r7VarI = r7Var2;
                    }
                    if (i13 != 0) {
                        z14 = true;
                        function2E = androidx.compose.runtime.internal.w.e(-803011924, true, new a(jbVar, r7VarI), c0VarR, 54);
                        i21 = 54;
                    } else {
                        z14 = true;
                        i21 = 54;
                    }
                    if (i15 != 0) {
                        function2E2 = androidx.compose.runtime.internal.w.e(-331385278, z14, new b(jbVar, y7Var3, r7VarI), c0VarR, i21);
                    } else {
                        function2E2 = function4;
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    if (i19 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new androidx.compose.ui.focus.g0();
                            c0VarR.Y(objI0);
                        }
                        int i211114 = i12;
                        g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                        z15 = z11;
                        r7Var4 = r7VarI;
                        i22 = i211114;
                        function4 = function2E2;
                        function7 = function2E;
                        a0Var4 = a0Var2;
                    } else {
                        function4 = function2E2;
                        function7 = function2E;
                        z15 = z11;
                        r7Var4 = r7VarI;
                        a0Var4 = a0Var2;
                        i22 = i12;
                        g0Var3 = g0Var;
                    }
                } else {
                    if (i24 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                            c0VarR.Y(objI1);
                        }
                        y7Var3 = (y7) objI1;
                        i12 &= -897;
                    } else {
                        y7Var3 = y7Var;
                    }
                    if ((i11 & 8) != 0) {
                        r7VarI = v7.f33887a.i(c0VarR, 6);
                        i12 &= -7169;
                    } else {
                        r7VarI = r7Var2;
                    }
                    if (i13 != 0) {
                        z14 = true;
                        function2E = androidx.compose.runtime.internal.w.e(-803011924, true, new a(jbVar, r7VarI), c0VarR, 54);
                        i21 = 54;
                    } else {
                        z14 = true;
                        i21 = 54;
                    }
                    if (i15 != 0) {
                        function2E2 = androidx.compose.runtime.internal.w.e(-331385278, z14, new b(jbVar, y7Var3, r7VarI), c0VarR, i21);
                    } else {
                        function2E2 = function4;
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    if (i19 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new androidx.compose.ui.focus.g0();
                            c0VarR.Y(objI0);
                        }
                        int i211115 = i12;
                        g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                        z15 = z11;
                        r7Var4 = r7VarI;
                        i22 = i211115;
                        function4 = function2E2;
                        function7 = function2E;
                        a0Var4 = a0Var2;
                    } else {
                        function4 = function2E2;
                        function7 = function2E;
                        z15 = z11;
                        r7Var4 = r7VarI;
                        a0Var4 = a0Var2;
                        i22 = i12;
                        g0Var3 = g0Var;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1969726368, i22, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:123)");
                }
                zD = c0VarR.D(jbVar.getLocale());
                objI2 = c0VarR.i0();
                if (zD) {
                    if (jbVar instanceof l2) {
                        k1VarA = ((l2) jbVar).l();
                    } else {
                        k1VarA = androidx.compose.material3.internal.n1.a(jbVar.getLocale());
                    }
                    objI2 = k1VarA;
                    c0VarR.Y(objI2);
                } else {
                    if (jbVar instanceof l2) {
                        k1VarA = ((l2) jbVar).l();
                    } else {
                        k1VarA = androidx.compose.material3.internal.n1.a(jbVar.getLocale());
                    }
                    objI2 = k1VarA;
                    c0VarR.Y(objI2);
                }
                androidx.compose.material3.internal.k1 k1Var14 = (androidx.compose.material3.internal.k1) objI2;
                if (z15) {
                    c0VarR.E(-2018438858);
                    cVarE = androidx.compose.runtime.internal.w.e(1343236786, true, new c(jbVar, r7Var4), c0VarR, 54);
                    c0VarR.A();
                } else {
                    c0VarR.E(-2018051234);
                    c0VarR.A();
                    cVarE = null;
                }
                androidx.compose.runtime.internal.c cVar14 = cVarE;
                d0.x xVar14 = d0.x.f269223a;
                androidx.compose.ui.text.y3 y3VarE14 = la0.e(xVar14.E(), c0VarR, 6);
                float fR14 = androidx.compose.ui.unit.h.r(xVar14.D() - f35011d);
                androidx.compose.ui.focus.g0 g0Var17 = g0Var3;
                d dVar14 = new d(jbVar, k1Var14, y7Var3, r7Var4, g0Var17);
                y7 y7Var17 = y7Var3;
                int i211116 = i22 >> 9;
                c0Var2 = c0VarR;
                i9.I(a0Var4, function7, function4, cVar14, r7Var4, y3VarE14, fR14, androidx.compose.runtime.internal.w.e(684885105, true, dVar14, c0VarR, 54), c0Var2, ((i22 >> 3) & 14) | 14155776 | (i211116 & com.planner5d.library.engine.input.f.b.B) | (i211116 & 896) | ((i22 << 3) & 57344));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                y7Var2 = y7Var17;
                g0Var2 = g0Var17;
                z13 = z15;
                a0Var3 = a0Var4;
                function5 = function7;
                r7Var3 = r7Var4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                y7Var2 = y7Var;
                g0Var2 = g0Var;
                a0Var3 = a0Var2;
                r7Var3 = r7Var2;
                function5 = function2E;
                z13 = z11;
            }
            function6 = function4;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ya
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return za.j(jbVar, a0Var3, y7Var2, r7Var3, function5, function6, z13, g0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        function4 = function3;
        i17 = i11 & 64;
        if (i17 != 0) {
            if ((1572864 & i10) == 0) {
                z11 = z10;
                if (c0VarR.G(z11)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.D(g0Var)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            if ((i12 & 4793491) != 4793490) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                            c0VarR.Y(objI1);
                        }
                        y7Var3 = (y7) objI1;
                        i12 &= -897;
                    } else {
                        y7Var3 = y7Var;
                    }
                    if ((i11 & 8) != 0) {
                        r7VarI = v7.f33887a.i(c0VarR, 6);
                        i12 &= -7169;
                    } else {
                        r7VarI = r7Var2;
                    }
                    if (i13 != 0) {
                        z14 = true;
                        function2E = androidx.compose.runtime.internal.w.e(-803011924, true, new a(jbVar, r7VarI), c0VarR, 54);
                        i21 = 54;
                    } else {
                        z14 = true;
                        i21 = 54;
                    }
                    if (i15 != 0) {
                        function2E2 = androidx.compose.runtime.internal.w.e(-331385278, z14, new b(jbVar, y7Var3, r7VarI), c0VarR, i21);
                    } else {
                        function2E2 = function4;
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    if (i19 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new androidx.compose.ui.focus.g0();
                            c0VarR.Y(objI0);
                        }
                        int i211117 = i12;
                        g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                        z15 = z11;
                        r7Var4 = r7VarI;
                        i22 = i211117;
                        function4 = function2E2;
                        function7 = function2E;
                        a0Var4 = a0Var2;
                    } else {
                        function4 = function2E2;
                        function7 = function2E;
                        z15 = z11;
                        r7Var4 = r7VarI;
                        a0Var4 = a0Var2;
                        i22 = i12;
                        g0Var3 = g0Var;
                    }
                } else {
                    if (i24 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                            c0VarR.Y(objI1);
                        }
                        y7Var3 = (y7) objI1;
                        i12 &= -897;
                    } else {
                        y7Var3 = y7Var;
                    }
                    if ((i11 & 8) != 0) {
                        r7VarI = v7.f33887a.i(c0VarR, 6);
                        i12 &= -7169;
                    } else {
                        r7VarI = r7Var2;
                    }
                    if (i13 != 0) {
                        z14 = true;
                        function2E = androidx.compose.runtime.internal.w.e(-803011924, true, new a(jbVar, r7VarI), c0VarR, 54);
                        i21 = 54;
                    } else {
                        z14 = true;
                        i21 = 54;
                    }
                    if (i15 != 0) {
                        function2E2 = androidx.compose.runtime.internal.w.e(-331385278, z14, new b(jbVar, y7Var3, r7VarI), c0VarR, i21);
                    } else {
                        function2E2 = function4;
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    if (i19 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new androidx.compose.ui.focus.g0();
                            c0VarR.Y(objI0);
                        }
                        int i211118 = i12;
                        g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                        z15 = z11;
                        r7Var4 = r7VarI;
                        i22 = i211118;
                        function4 = function2E2;
                        function7 = function2E;
                        a0Var4 = a0Var2;
                    } else {
                        function4 = function2E2;
                        function7 = function2E;
                        z15 = z11;
                        r7Var4 = r7VarI;
                        a0Var4 = a0Var2;
                        i22 = i12;
                        g0Var3 = g0Var;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1969726368, i22, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:123)");
                }
                zD = c0VarR.D(jbVar.getLocale());
                objI2 = c0VarR.i0();
                if (zD) {
                    if (jbVar instanceof l2) {
                        k1VarA = ((l2) jbVar).l();
                    } else {
                        k1VarA = androidx.compose.material3.internal.n1.a(jbVar.getLocale());
                    }
                    objI2 = k1VarA;
                    c0VarR.Y(objI2);
                } else {
                    if (jbVar instanceof l2) {
                        k1VarA = ((l2) jbVar).l();
                    } else {
                        k1VarA = androidx.compose.material3.internal.n1.a(jbVar.getLocale());
                    }
                    objI2 = k1VarA;
                    c0VarR.Y(objI2);
                }
                androidx.compose.material3.internal.k1 k1Var15 = (androidx.compose.material3.internal.k1) objI2;
                if (z15) {
                    c0VarR.E(-2018438858);
                    cVarE = androidx.compose.runtime.internal.w.e(1343236786, true, new c(jbVar, r7Var4), c0VarR, 54);
                    c0VarR.A();
                } else {
                    c0VarR.E(-2018051234);
                    c0VarR.A();
                    cVarE = null;
                }
                androidx.compose.runtime.internal.c cVar15 = cVarE;
                d0.x xVar15 = d0.x.f269223a;
                androidx.compose.ui.text.y3 y3VarE15 = la0.e(xVar15.E(), c0VarR, 6);
                float fR15 = androidx.compose.ui.unit.h.r(xVar15.D() - f35011d);
                androidx.compose.ui.focus.g0 g0Var18 = g0Var3;
                d dVar15 = new d(jbVar, k1Var15, y7Var3, r7Var4, g0Var18);
                y7 y7Var18 = y7Var3;
                int i211119 = i22 >> 9;
                c0Var2 = c0VarR;
                i9.I(a0Var4, function7, function4, cVar15, r7Var4, y3VarE15, fR15, androidx.compose.runtime.internal.w.e(684885105, true, dVar15, c0VarR, 54), c0Var2, ((i22 >> 3) & 14) | 14155776 | (i211119 & com.planner5d.library.engine.input.f.b.B) | (i211119 & 896) | ((i22 << 3) & 57344));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                y7Var2 = y7Var18;
                g0Var2 = g0Var18;
                z13 = z15;
                a0Var3 = a0Var4;
                function5 = function7;
                r7Var3 = r7Var4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                y7Var2 = y7Var;
                g0Var2 = g0Var;
                a0Var3 = a0Var2;
                r7Var3 = r7Var2;
                function5 = function2E;
                z13 = z11;
            }
            function6 = function4;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ya
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return za.j(jbVar, a0Var3, y7Var2, r7Var3, function5, function6, z13, g0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 1572864;
        z11 = z10;
        i19 = i11 & 128;
        if (i19 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c0VarR.D(g0Var)) {
                i20 = 8388608;
            } else {
                i20 = 4194304;
            }
            i12 |= i20;
        }
        if ((i12 & 4793491) != 4793490) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i24 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if ((i11 & 4) != 0) {
                    objI1 = c0VarR.i0();
                    if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                        c0VarR.Y(objI1);
                    }
                    y7Var3 = (y7) objI1;
                    i12 &= -897;
                } else {
                    y7Var3 = y7Var;
                }
                if ((i11 & 8) != 0) {
                    r7VarI = v7.f33887a.i(c0VarR, 6);
                    i12 &= -7169;
                } else {
                    r7VarI = r7Var2;
                }
                if (i13 != 0) {
                    z14 = true;
                    function2E = androidx.compose.runtime.internal.w.e(-803011924, true, new a(jbVar, r7VarI), c0VarR, 54);
                    i21 = 54;
                } else {
                    z14 = true;
                    i21 = 54;
                }
                if (i15 != 0) {
                    function2E2 = androidx.compose.runtime.internal.w.e(-331385278, z14, new b(jbVar, y7Var3, r7VarI), c0VarR, i21);
                } else {
                    function2E2 = function4;
                }
                if (i17 != 0) {
                    z11 = true;
                }
                if (i19 != 0) {
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new androidx.compose.ui.focus.g0();
                        c0VarR.Y(objI0);
                    }
                    int i2111110 = i12;
                    g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                    z15 = z11;
                    r7Var4 = r7VarI;
                    i22 = i2111110;
                    function4 = function2E2;
                    function7 = function2E;
                    a0Var4 = a0Var2;
                } else {
                    function4 = function2E2;
                    function7 = function2E;
                    z15 = z11;
                    r7Var4 = r7VarI;
                    a0Var4 = a0Var2;
                    i22 = i12;
                    g0Var3 = g0Var;
                }
            } else {
                if (i24 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if ((i11 & 4) != 0) {
                    objI1 = c0VarR.i0();
                    if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = v7.l(v7.f33887a, null, null, null, 7, null);
                        c0VarR.Y(objI1);
                    }
                    y7Var3 = (y7) objI1;
                    i12 &= -897;
                } else {
                    y7Var3 = y7Var;
                }
                if ((i11 & 8) != 0) {
                    r7VarI = v7.f33887a.i(c0VarR, 6);
                    i12 &= -7169;
                } else {
                    r7VarI = r7Var2;
                }
                if (i13 != 0) {
                    z14 = true;
                    function2E = androidx.compose.runtime.internal.w.e(-803011924, true, new a(jbVar, r7VarI), c0VarR, 54);
                    i21 = 54;
                } else {
                    z14 = true;
                    i21 = 54;
                }
                if (i15 != 0) {
                    function2E2 = androidx.compose.runtime.internal.w.e(-331385278, z14, new b(jbVar, y7Var3, r7VarI), c0VarR, i21);
                } else {
                    function2E2 = function4;
                }
                if (i17 != 0) {
                    z11 = true;
                }
                if (i19 != 0) {
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new androidx.compose.ui.focus.g0();
                        c0VarR.Y(objI0);
                    }
                    int i2111111 = i12;
                    g0Var3 = (androidx.compose.ui.focus.g0) objI0;
                    z15 = z11;
                    r7Var4 = r7VarI;
                    i22 = i2111111;
                    function4 = function2E2;
                    function7 = function2E;
                    a0Var4 = a0Var2;
                } else {
                    function4 = function2E2;
                    function7 = function2E;
                    z15 = z11;
                    r7Var4 = r7VarI;
                    a0Var4 = a0Var2;
                    i22 = i12;
                    g0Var3 = g0Var;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1969726368, i22, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:123)");
            }
            zD = c0VarR.D(jbVar.getLocale());
            objI2 = c0VarR.i0();
            if (zD) {
                if (jbVar instanceof l2) {
                    k1VarA = ((l2) jbVar).l();
                } else {
                    k1VarA = androidx.compose.material3.internal.n1.a(jbVar.getLocale());
                }
                objI2 = k1VarA;
                c0VarR.Y(objI2);
            } else {
                if (jbVar instanceof l2) {
                    k1VarA = ((l2) jbVar).l();
                } else {
                    k1VarA = androidx.compose.material3.internal.n1.a(jbVar.getLocale());
                }
                objI2 = k1VarA;
                c0VarR.Y(objI2);
            }
            androidx.compose.material3.internal.k1 k1Var16 = (androidx.compose.material3.internal.k1) objI2;
            if (z15) {
                c0VarR.E(-2018438858);
                cVarE = androidx.compose.runtime.internal.w.e(1343236786, true, new c(jbVar, r7Var4), c0VarR, 54);
                c0VarR.A();
            } else {
                c0VarR.E(-2018051234);
                c0VarR.A();
                cVarE = null;
            }
            androidx.compose.runtime.internal.c cVar16 = cVarE;
            d0.x xVar16 = d0.x.f269223a;
            androidx.compose.ui.text.y3 y3VarE16 = la0.e(xVar16.E(), c0VarR, 6);
            float fR16 = androidx.compose.ui.unit.h.r(xVar16.D() - f35011d);
            androidx.compose.ui.focus.g0 g0Var19 = g0Var3;
            d dVar16 = new d(jbVar, k1Var16, y7Var3, r7Var4, g0Var19);
            y7 y7Var19 = y7Var3;
            int i2111112 = i22 >> 9;
            c0Var2 = c0VarR;
            i9.I(a0Var4, function7, function4, cVar16, r7Var4, y3VarE16, fR16, androidx.compose.runtime.internal.w.e(684885105, true, dVar16, c0VarR, 54), c0Var2, ((i22 >> 3) & 14) | 14155776 | (i2111112 & com.planner5d.library.engine.input.f.b.B) | (i2111112 & 896) | ((i22 << 3) & 57344));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            y7Var2 = y7Var19;
            g0Var2 = g0Var19;
            z13 = z15;
            a0Var3 = a0Var4;
            function5 = function7;
            r7Var3 = r7Var4;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            y7Var2 = y7Var;
            g0Var2 = g0Var;
            a0Var3 = a0Var2;
            r7Var3 = r7Var2;
            function5 = function2E;
            z13 = z11;
        }
        function6 = function4;
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.ya
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return za.j(jbVar, a0Var3, y7Var2, r7Var3, function5, function6, z13, g0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(jb jbVar, androidx.compose.ui.a0 a0Var, y7 y7Var, r7 r7Var, Function2 function2, Function2 function3, boolean z10, androidx.compose.ui.focus.g0 g0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        i(jbVar, a0Var, y7Var, r7Var, function2, function3, z10, g0Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void k(final Long l10, final Long l11, final long j10, final Function2<? super Long, ? super Long, Unit> function2, final Function1<? super Long, Unit> function1, final androidx.compose.material3.internal.k1 k1Var, final IntRange intRange, final y7 y7Var, final ww wwVar, final r7 r7Var, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        Long l12;
        Function2<? super Long, ? super Long, Unit> function3;
        Function1<? super Long, Unit> function4;
        ww wwVar2;
        Object obj;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-787063721);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(l10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            l12 = l11;
            i11 |= c0VarR.D(l12) ? 32 : 16;
        } else {
            l12 = l11;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.L(j10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            function3 = function2;
            i11 |= c0VarR.k0(function3) ? 2048 : 1024;
        } else {
            function3 = function2;
        }
        if ((i10 & 24576) == 0) {
            function4 = function1;
            i11 |= c0VarR.k0(function4) ? 16384 : 8192;
        } else {
            function4 = function1;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0VarR.k0(k1Var) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c0VarR.k0(intRange) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= (16777216 & i10) == 0 ? c0VarR.D(y7Var) : c0VarR.k0(y7Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            wwVar2 = wwVar;
            i11 |= c0VarR.D(wwVar2) ? 67108864 : com.google.api.client.googleapis.media.a.f115410j;
        } else {
            wwVar2 = wwVar;
        }
        if ((i10 & 805306368) == 0) {
            i11 |= c0VarR.D(r7Var) ? 536870912 : 268435456;
        }
        if (c0VarR.h((i11 & 306783379) != 306783378, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-787063721, i11, -1, "androidx.compose.material3.DateRangePickerContent (DateRangePicker.kt:764)");
            }
            int iU = kotlin.ranges.r.u(k1Var.n(j10).o(intRange), 0);
            androidx.compose.foundation.lazy.j1 j1VarF = androidx.compose.foundation.lazy.o1.f(iU, 0, c0VarR, 0, 2);
            Integer numValueOf = Integer.valueOf(iU);
            boolean zD = c0VarR.D(j1VarF) | c0VarR.K(iU);
            Object objI0 = c0VarR.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                obj = null;
                objI0 = new e(j1VarF, iU, null);
                c0VarR.Y(objI0);
            } else {
                obj = null;
            }
            androidx.compose.runtime.b2.i(numValueOf, (Function2) objI0, c0VarR, 0);
            androidx.compose.ui.a0 a0VarT = androidx.compose.foundation.layout.d5.t(androidx.compose.ui.a0.E, i9.S0(), 0.0f, 2, obj);
            androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarT);
            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar.a();
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarB, aVar.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
            androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
            i9.x0(r7Var, k1Var, c0VarR, ((i11 >> 27) & 14) | ((i11 >> 12) & com.planner5d.library.engine.input.f.b.B));
            r(j1VarF, l10, l12, function3, function4, k1Var, intRange, y7Var, wwVar2, r7Var, c0VarR, ((i11 << 3) & 1008) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (29360128 & i11) | (234881024 & i11) | (1879048192 & i11));
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.wa
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return za.l(l10, l11, j10, function2, function1, k1Var, intRange, y7Var, wwVar, r7Var, i10, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(Long l10, Long l11, long j10, Function2 function2, Function1 function1, androidx.compose.material3.internal.k1 k1Var, IntRange intRange, y7 y7Var, ww wwVar, r7 r7Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        k(l10, l11, j10, function2, function1, k1Var, intRange, y7Var, wwVar, r7Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @NotNull
    public static final jb m(@NotNull Locale locale, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12, @NotNull IntRange intRange, int i10, @NotNull ww wwVar) {
        return new mb(l10, l11, l12, intRange, i10, wwVar, locale, null);
    }

    public static /* synthetic */ jb n(Locale locale, Long l10, Long l11, Long l12, IntRange intRange, int i10, ww wwVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            l10 = null;
        }
        if ((i11 & 4) != 0) {
            l11 = null;
        }
        if ((i11 & 8) != 0) {
            l12 = l10;
        }
        if ((i11 & 16) != 0) {
            intRange = v7.f33887a.q();
        }
        if ((i11 & 32) != 0) {
            i10 = ed.f27323b.b();
        }
        if ((i11 & 64) != 0) {
            wwVar = v7.f33887a.m();
        }
        return m(locale, l10, l11, l12, intRange, i10, wwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void o(final Long l10, final Long l11, final long j10, final int i10, final Function2<? super Long, ? super Long, Unit> function2, final Function1<? super Long, Unit> function1, final androidx.compose.material3.internal.k1 k1Var, final IntRange intRange, final y7 y7Var, final ww wwVar, final r7 r7Var, final androidx.compose.ui.focus.g0 g0Var, androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        int i13;
        Long l12;
        Function2<? super Long, ? super Long, Unit> function3;
        Function1<? super Long, Unit> function4;
        int i14;
        androidx.compose.runtime.c0 c0Var2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(621028059);
        if ((i11 & 6) == 0) {
            i13 = (c0VarR.D(l10) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            l12 = l11;
            i13 |= c0VarR.D(l12) ? 32 : 16;
        } else {
            l12 = l11;
        }
        if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
            i13 |= c0VarR.L(j10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= c0VarR.K(i10) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            function3 = function2;
            i13 |= c0VarR.k0(function3) ? 16384 : 8192;
        } else {
            function3 = function2;
        }
        if ((196608 & i11) == 0) {
            function4 = function1;
            i13 |= c0VarR.k0(function4) ? 131072 : 65536;
        } else {
            function4 = function1;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= c0VarR.k0(k1Var) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= c0VarR.k0(intRange) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= (i11 & androidx.media3.common.j.W0) == 0 ? c0VarR.D(y7Var) : c0VarR.k0(y7Var) ? 67108864 : com.google.api.client.googleapis.media.a.f115410j;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= c0VarR.D(wwVar) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = i12 | (c0VarR.D(r7Var) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= c0VarR.D(g0Var) ? 32 : 16;
        }
        int i15 = i14;
        if (c0VarR.h(((i13 & 306783379) == 306783378 && (i15 & 19) == 18) ? false : true, i13 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(621028059, i13, i15, "androidx.compose.material3.SwitchableDateEntryContent (DateRangePicker.kt:708)");
            }
            androidx.compose.animation.core.y0 y0VarB = hm.b(d0.h1.FastEffects, c0VarR, 6);
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            Object objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.ra
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return za.p((androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0Var2 = c0VarR;
            androidx.compose.animation.y.b(ed.c(i10), androidx.compose.ui.semantics.t.f(aVar, false, (Function1) objI0, 1, null), y0VarB, null, androidx.compose.runtime.internal.w.e(-773828161, true, new f(l10, l12, j10, function3, function4, k1Var, intRange, y7Var, wwVar, r7Var, g0Var), c0VarR, 54), c0Var2, ((i13 >> 9) & 14) | 24576, 8);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.sa
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return za.q(l10, l11, j10, i10, function2, function1, k1Var, intRange, y7Var, wwVar, r7Var, g0Var, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.t1(e0Var, true);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(Long l10, Long l11, long j10, int i10, Function2 function2, Function1 function1, androidx.compose.material3.internal.k1 k1Var, IntRange intRange, y7 y7Var, ww wwVar, r7 r7Var, androidx.compose.ui.focus.g0 g0Var, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        o(l10, l11, j10, i10, function2, function1, k1Var, intRange, y7Var, wwVar, r7Var, g0Var, c0Var, androidx.compose.runtime.t4.a(i11 | 1), androidx.compose.runtime.t4.a(i12));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void r(androidx.compose.foundation.lazy.j1 j1Var, final Long l10, final Long l11, final Function2<? super Long, ? super Long, Unit> function2, final Function1<? super Long, Unit> function1, final androidx.compose.material3.internal.k1 k1Var, final IntRange intRange, final y7 y7Var, final ww wwVar, final r7 r7Var, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        Long l12;
        Long l13;
        Object objM;
        Object hVar;
        final androidx.compose.foundation.lazy.j1 j1Var2 = j1Var;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1257365001);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(j1Var2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            l12 = l10;
            i11 |= c0VarR.D(l12) ? 32 : 16;
        } else {
            l12 = l10;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            l13 = l11;
            i11 |= c0VarR.D(l13) ? 256 : 128;
        } else {
            l13 = l11;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.k0(function2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0VarR.k0(function1) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0VarR.k0(k1Var) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c0VarR.k0(intRange) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= (16777216 & i10) == 0 ? c0VarR.D(y7Var) : c0VarR.k0(y7Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= c0VarR.D(wwVar) ? 67108864 : com.google.api.client.googleapis.media.a.f115410j;
        }
        if ((805306368 & i10) == 0) {
            i11 |= c0VarR.D(r7Var) ? 536870912 : 268435456;
        }
        if (c0VarR.h((i11 & 306783379) != 306783378, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1257365001, i11, -1, "androidx.compose.material3.VerticalMonthsList (DateRangePicker.kt:812)");
            }
            androidx.compose.material3.internal.j1 j1VarP = k1Var.p();
            boolean zD = c0VarR.D(intRange);
            Object objI0 = c0VarR.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objM = k1Var.m(intRange.l(), 1);
                c0VarR.Y(objM);
            } else {
                objM = objI0;
            }
            int i12 = i11;
            q50.o(la0.e(d0.x.f269223a.i(), c0VarR, 6), androidx.compose.runtime.internal.w.e(1090773432, true, new g(l12, l13, function2, j1Var2, intRange, k1Var, (androidx.compose.material3.internal.o1) objM, y7Var, r7Var, j1VarP, wwVar), c0VarR, 54), c0VarR, 48);
            int i13 = i12 & 14;
            boolean zK0 = (i13 == 4) | ((i12 & 57344) == 16384) | c0VarR.k0(k1Var) | c0VarR.k0(intRange);
            Object objI1 = c0VarR.i0();
            if (zK0 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                j1Var2 = j1Var;
                hVar = new h(j1Var2, function1, k1Var, intRange, null);
                c0VarR.Y(hVar);
            } else {
                hVar = objI1;
                j1Var2 = j1Var;
            }
            androidx.compose.runtime.b2.i(j1Var2, (Function2) hVar, c0VarR, i13);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.xa
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return za.s(j1Var2, l10, l11, function2, function1, k1Var, intRange, y7Var, wwVar, r7Var, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(androidx.compose.foundation.lazy.j1 j1Var, Long l10, Long l11, Function2 function2, Function1 function1, androidx.compose.material3.internal.k1 k1Var, IntRange intRange, y7 y7Var, ww wwVar, r7 r7Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        r(j1Var, l10, l11, function2, function1, k1Var, intRange, y7Var, wwVar, r7Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<androidx.compose.ui.semantics.e> z(final androidx.compose.foundation.lazy.j1 j1Var, final kotlinx.coroutines.s0 s0Var, String str, String str2) {
        return CollectionsKt.listOf((Object[]) new androidx.compose.ui.semantics.e[]{new androidx.compose.ui.semantics.e(str, new Function0() { // from class: androidx.compose.material3.ta
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(za.A(j1Var, s0Var));
            }
        }), new androidx.compose.ui.semantics.e(str2, new Function0() { // from class: androidx.compose.material3.ua
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(za.B(j1Var, s0Var));
            }
        })});
    }
}
