package androidx.compose.material3;

import java.util.Locale;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nDateInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateInputKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,446:1\n1282#2,6:447\n1282#2,6:456\n1282#2,6:463\n1282#2,6:469\n1282#2,6:477\n1282#2,6:483\n1282#2,6:489\n1282#2,6:495\n144#3:453\n147#3:454\n141#3:455\n132#3:462\n49#4:475\n52#4:476\n85#5:501\n117#5,2:502\n1069#6,2:504\n113#7:506\n113#7:507\n*S KotlinDebug\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateInputKt\n*L\n71#1:447,6\n76#1:456,6\n131#1:463,6\n133#1:469,6\n165#1:477,6\n206#1:483,6\n229#1:489,6\n238#1:495,6\n72#1:453\n73#1:454\n74#1:455\n89#1:462\n161#1:475\n160#1:476\n131#1:501\n131#1:502,2\n168#1:504,2\n441#1:506\n445#1:507\n*E\n"})
public final class n7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.foundation.layout.g5 f30962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f30963b = androidx.compose.ui.unit.h.r(16);

    @SourceDebugExtension({"SMAP\nDateInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateInputKt$DateInputContent$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,446:1\n1282#2,6:447\n*S KotlinDebug\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateInputKt$DateInputContent$2\n*L\n96#1:447,6\n*E\n"})
    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f30964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f30965b;

        a(String str, String str2) {
            this.f30964a = str;
            this.f30965b = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(String str, String str2, androidx.compose.ui.semantics.e0 e0Var) {
            androidx.compose.ui.semantics.b0.v1(e0Var, str + ", " + str2);
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
                androidx.compose.runtime.m0.A0(-752164549, i10, -1, "androidx.compose.material3.DateInputContent.<anonymous> (DateInput.kt:93)");
            }
            String str = this.f30964a;
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            boolean zD = c0Var.D(str) | c0Var.D(this.f30965b);
            final String str2 = this.f30964a;
            final String str3 = this.f30965b;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.m7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return n7.a.f(str2, str3, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            q50.t(str, androidx.compose.ui.semantics.t.f(aVar, false, (Function1) objI0, 1, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var, 0, 0, 262140);
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

    @SourceDebugExtension({"SMAP\nDateInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateInputKt$DateInputContent$3\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,446:1\n1282#2,6:447\n*S KotlinDebug\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateInputKt$DateInputContent$3\n*L\n99#1:447,6\n*E\n"})
    static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f30966a;

        b(String str) {
            this.f30966a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(androidx.compose.ui.semantics.e0 e0Var) {
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
                androidx.compose.runtime.m0.A0(-1179434278, i10, -1, "androidx.compose.material3.DateInputContent.<anonymous> (DateInput.kt:98)");
            }
            String str = this.f30966a;
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.o7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return n7.b.f((androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            q50.t(str, androidx.compose.ui.semantics.t.c(aVar, (Function1) objI0), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var, 0, 0, 262140);
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

    static final class c implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n3<String> f30967a;

        c(androidx.compose.runtime.n3<String> n3Var) {
            this.f30967a = n3Var;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            androidx.compose.runtime.c0 c0Var2 = c0Var;
            if (!c0Var2.h((i10 & 3) != 2, i10 & 1)) {
                c0Var2.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-357881838, i10, -1, "androidx.compose.material3.DateInputTextField.<anonymous> (DateInput.kt:215)");
            }
            if (StringsKt.w3(this.f30967a.getValue())) {
                c0Var2.E(-1548950640);
            } else {
                c0Var2.E(-327061465);
                q50.t(this.f30967a.getValue(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var, 0, 0, 262142);
                c0Var2 = c0Var;
            }
            c0Var2.A();
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

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.DateInputKt$DateInputTextField$4$1", f = "DateInput.kt", i = {}, l = {233}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.g0 f30969b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.focus.g0 g0Var, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f30969b = g0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new d(this.f30969b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f30968a;
            if (i10 == 0) {
                ResultKt.m(obj);
                if (this.f30969b != null) {
                    this.f30968a = 1;
                    if (kotlinx.coroutines.d1.b(300L, this) == objL) {
                        return objL;
                    }
                }
                return Unit.f312394a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            androidx.compose.ui.focus.g0.k(this.f30969b, 0, 1, null);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.DateInputKt$DateInputTextField$5$1", f = "DateInput.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Long f30971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.internal.k1 f30972c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.internal.v1 f30973d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Locale f30974e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n3<androidx.compose.ui.text.input.y0> f30975f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Long l10, androidx.compose.material3.internal.k1 k1Var, androidx.compose.material3.internal.v1 v1Var, Locale locale, androidx.compose.runtime.n3<androidx.compose.ui.text.input.y0> n3Var, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f30971b = l10;
            this.f30972c = k1Var;
            this.f30973d = v1Var;
            this.f30974e = locale;
            this.f30975f = n3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new e(this.f30971b, this.f30972c, this.f30973d, this.f30974e, this.f30975f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f30970a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            Long l10 = this.f30971b;
            if (l10 != null) {
                androidx.compose.material3.internal.k1 k1Var = this.f30972c;
                androidx.compose.material3.internal.v1 v1Var = this.f30973d;
                Locale locale = this.f30974e;
                androidx.compose.runtime.n3<androidx.compose.ui.text.input.y0> n3Var = this.f30975f;
                String strA = k1Var.a(l10.longValue(), v1Var.g(), locale);
                n7.o(n3Var, new androidx.compose.ui.text.input.y0(strA, strA.length() == 0 ? androidx.compose.ui.text.w3.f42333b.a() : androidx.compose.ui.text.x3.b(strA.length(), strA.length()), (androidx.compose.ui.text.w3) null, 4, (DefaultConstructorMarker) null));
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static {
        float f10 = 24;
        f30962a = androidx.compose.foundation.layout.d5.j(androidx.compose.ui.unit.h.r(f10), androidx.compose.ui.unit.h.r(10), androidx.compose.ui.unit.h.r(f10), 0.0f, 8, null);
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void g(@Nullable final Long l10, @NotNull final Function1<? super Long, Unit> function1, @NotNull final androidx.compose.material3.internal.k1 k1Var, @NotNull final IntRange intRange, @NotNull final y7 y7Var, @NotNull final ww wwVar, @NotNull final r7 r7Var, @Nullable final androidx.compose.ui.focus.g0 g0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        IntRange intRange2;
        ww wwVar2;
        androidx.compose.runtime.c0 c0Var2;
        int i12;
        androidx.compose.material3.internal.v1 v1Var;
        int i13;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-432341251);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(l10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(function1) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.k0(k1Var) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            intRange2 = intRange;
            i11 |= c0VarR.k0(intRange2) ? 2048 : 1024;
        } else {
            intRange2 = intRange;
        }
        if ((i10 & 24576) == 0) {
            i11 |= (i10 & 32768) == 0 ? c0VarR.D(y7Var) : c0VarR.k0(y7Var) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            wwVar2 = wwVar;
            i11 |= c0VarR.D(wwVar2) ? 131072 : 65536;
        } else {
            wwVar2 = wwVar;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c0VarR.D(r7Var) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c0VarR.D(g0Var) ? 8388608 : 4194304;
        }
        if (c0VarR.h((4793491 & i11) != 4793490, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-432341251, i11, -1, "androidx.compose.material3.DateInputContent (DateInput.kt:67)");
            }
            boolean zD = c0VarR.D(k1Var.l());
            Object objI0 = c0VarR.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = k1Var.g(k1Var.l());
                c0VarR.Y(objI0);
            }
            androidx.compose.material3.internal.v1 v1Var2 = (androidx.compose.material3.internal.v1) objI0;
            androidx.compose.material3.internal.l3.a aVar = androidx.compose.material3.internal.l3.f29010b;
            String strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31840h), c0VarR, 0);
            String strB2 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31844j), c0VarR, 0);
            String strB3 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31842i), c0VarR, 0);
            boolean zD2 = c0VarR.D(v1Var2) | ((i11 & 57344) == 16384 || ((i11 & 32768) != 0 && c0VarR.D(y7Var)));
            Object objI1 = c0VarR.i0();
            if (zD2 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                i12 = i11;
                v1Var = v1Var2;
                i13 = 0;
                p7 p7Var = new p7(intRange2, wwVar2, v1Var, y7Var, strB, strB2, strB3, "");
                c0VarR.Y(p7Var);
                objI1 = p7Var;
            } else {
                i12 = i11;
                v1Var = v1Var2;
                i13 = 0;
            }
            p7 p7Var2 = (p7) objI1;
            String upperCase = v1Var.f().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            String strB4 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31846k), c0VarR, i13);
            androidx.compose.ui.a0 a0VarP = androidx.compose.foundation.layout.d5.p(androidx.compose.foundation.layout.i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), f30962a);
            int iB = ti.f33206b.b();
            p7Var2.d(l10);
            int i14 = i12 << 3;
            c0Var2 = c0VarR;
            androidx.compose.material3.internal.v1 v1Var3 = v1Var;
            i(a0VarP, l10, function1, k1Var, androidx.compose.runtime.internal.w.e(-752164549, true, new a(strB4, upperCase), c0VarR, 54), androidx.compose.runtime.internal.w.e(-1179434278, true, new b(upperCase), c0VarR, 54), iB, p7Var2, v1Var3, k1Var.l(), r7Var, g0Var, c0Var2, (i14 & 7168) | (i14 & com.planner5d.library.engine.input.f.b.B) | 1794054 | (i14 & 896), (i12 >> 18) & okhttp3.internal.ws.g.f334652s);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.g7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return n7.h(l10, function1, k1Var, intRange, y7Var, wwVar, r7Var, g0Var, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(Long l10, Function1 function1, androidx.compose.material3.internal.k1 k1Var, IntRange intRange, y7 y7Var, ww wwVar, r7 r7Var, androidx.compose.ui.focus.g0 g0Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        g(l10, function1, k1Var, intRange, y7Var, wwVar, r7Var, g0Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void i(@NotNull final androidx.compose.ui.a0 a0Var, @Nullable Long l10, @NotNull final Function1<? super Long, Unit> function1, @NotNull final androidx.compose.material3.internal.k1 k1Var, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, final int i10, @NotNull final p7 p7Var, @NotNull final androidx.compose.material3.internal.v1 v1Var, @NotNull final Locale locale, @NotNull final r7 r7Var, @Nullable final androidx.compose.ui.focus.g0 g0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        int i13;
        int i14;
        Long l11;
        androidx.compose.runtime.c0 c0Var2;
        androidx.compose.runtime.n3 n3Var;
        float fR;
        Object obj;
        final androidx.compose.material3.internal.v1 v1Var2;
        Object eVar;
        final androidx.compose.material3.internal.k1 k1Var2 = k1Var;
        final Locale locale2 = locale;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1456309913);
        if ((i11 & 6) == 0) {
            i13 = (c0VarR.D(a0Var) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c0VarR.D(l10) ? 32 : 16;
        }
        if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
            i13 |= c0VarR.k0(function1) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= c0VarR.k0(k1Var2) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= c0VarR.k0(function2) ? 16384 : 8192;
        }
        if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
            i13 |= c0VarR.k0(function3) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= c0VarR.K(i10) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= c0VarR.D(p7Var) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= c0VarR.D(v1Var) ? 67108864 : com.google.api.client.googleapis.media.a.f115410j;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= c0VarR.k0(locale2) ? 536870912 : 268435456;
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
                androidx.compose.runtime.m0.A0(1456309913, i13, i15, "androidx.compose.material3.DateInputTextField (DateInput.kt:128)");
            }
            Object[] objArr = new Object[0];
            androidx.compose.runtime.saveable.c0<androidx.compose.ui.text.input.y0, Object> c0VarA = androidx.compose.ui.text.input.y0.f41979d.a();
            Object objI0 = c0VarR.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            int i16 = i13;
            if (objI0 == aVar.a()) {
                objI0 = new Function0() { // from class: androidx.compose.material3.h7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return n7.m();
                    }
                };
                c0VarR.Y(objI0);
            }
            final androidx.compose.runtime.n3 n3VarH = androidx.compose.runtime.saveable.i.h(objArr, c0VarA, (Function0) objI0, c0VarR, androidx.media3.exoplayer.a5.S0);
            Object[] objArr2 = {n(n3VarH)};
            int i17 = i16 & 29360128;
            int i18 = i16 & 234881024;
            int i19 = i16 & 3670016;
            boolean zD = c0VarR.D(n3VarH) | (i17 == 8388608) | c0VarR.k0(k1Var2) | (i18 == 67108864) | c0VarR.k0(locale2) | (i19 == 1048576);
            Object objI1 = c0VarR.i0();
            if (zD || objI1 == aVar.a()) {
                objI1 = new Function0() { // from class: androidx.compose.material3.i7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return n7.p(p7Var, k1Var2, v1Var, locale2, i10, n3VarH);
                    }
                };
                n3Var = n3VarH;
                c0VarR.Y(objI1);
            } else {
                n3Var = n3VarH;
            }
            final androidx.compose.runtime.n3 n3Var2 = (androidx.compose.runtime.n3) androidx.compose.runtime.saveable.i.k(objArr2, (Function0) objI1, c0VarR, 0);
            if (StringsKt.w3((CharSequence) n3Var2.getValue())) {
                fR = f30963b;
            } else {
                androidx.compose.foundation.layout.g5 g5VarL = n40.L(n40.f30917a, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                fR = androidx.compose.ui.unit.h.r(f30963b - androidx.compose.ui.unit.h.r(g5VarL.a() + g5VarL.d()));
            }
            float f10 = fR;
            androidx.compose.ui.text.input.y0 y0VarN = n(n3Var);
            boolean zD2 = (i19 == 1048576) | (i18 == 67108864) | c0VarR.D(n3Var) | c0VarR.D(n3Var2) | ((i16 & 896) == 256) | c0VarR.k0(k1Var2) | c0VarR.k0(locale2) | (i17 == 8388608);
            Object objI2 = c0VarR.i0();
            if (zD2 || objI2 == aVar.a()) {
                v1Var2 = v1Var;
                final androidx.compose.runtime.n3 n3Var3 = n3Var;
                obj = new Function1() { // from class: androidx.compose.material3.j7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return n7.j(v1Var2, n3Var2, function1, k1Var2, locale2, p7Var, i10, n3Var3, (androidx.compose.ui.text.input.y0) obj2);
                    }
                };
                k1Var2 = k1Var2;
                locale2 = locale2;
                n3Var = n3Var3;
                c0VarR.Y(obj);
            } else {
                obj = objI2;
                v1Var2 = v1Var;
            }
            Function1 function4 = (Function1) obj;
            androidx.compose.ui.a0 a0VarV = androidx.compose.foundation.layout.d5.v(a0Var, 0.0f, 0.0f, 0.0f, f10, 7, null);
            boolean zD3 = c0VarR.D(n3Var2);
            Object objI3 = c0VarR.i0();
            if (zD3 || objI3 == aVar.a()) {
                objI3 = new Function1() { // from class: androidx.compose.material3.k7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return n7.k(n3Var2, (androidx.compose.ui.semantics.e0) obj2);
                    }
                };
                c0VarR.Y(objI3);
            }
            uq.h(y0VarN, function4, androidx.compose.ui.semantics.t.f(a0VarV, false, (Function1) objI3, 1, null).B2(g0Var != null ? androidx.compose.ui.focus.j0.a(androidx.compose.ui.a0.E, g0Var) : androidx.compose.ui.a0.E), false, false, null, function2, function3, null, null, null, null, androidx.compose.runtime.internal.w.e(-357881838, true, new c(n3Var2), c0VarR, 54), !StringsKt.w3((CharSequence) n3Var2.getValue()), new nb(v1Var2), new androidx.compose.foundation.text.b4(0, Boolean.FALSE, androidx.compose.ui.text.input.b0.f41811b.g(), androidx.compose.ui.text.input.t.f41944b.c(), (androidx.compose.ui.text.input.p0) null, (Boolean) null, (y0.f) null, 113, (DefaultConstructorMarker) null), null, true, 0, 0, null, null, r7Var.i(), c0VarR, (i16 << 6) & 33030144, 12779904, 0, 4001592);
            c0Var2 = c0VarR;
            Unit unit = Unit.f312394a;
            boolean z10 = (i15 & com.planner5d.library.engine.input.f.b.B) == 32;
            Object objI4 = c0Var2.i0();
            if (z10 || objI4 == aVar.a()) {
                objI4 = new d(g0Var, null);
                c0Var2.Y(objI4);
            }
            androidx.compose.runtime.b2.i(unit, (Function2) objI4, c0Var2, 6);
            boolean zK0 = ((i16 & com.planner5d.library.engine.input.f.b.B) == 32) | c0Var2.k0(k1Var2) | (i18 == 67108864) | c0Var2.k0(locale2) | c0Var2.D(n3Var);
            Object objI5 = c0Var2.i0();
            if (zK0 || objI5 == aVar.a()) {
                l11 = l10;
                eVar = new e(l11, k1Var2, v1Var2, locale, n3Var, null);
                c0Var2.Y(eVar);
            } else {
                eVar = objI5;
                l11 = l10;
            }
            androidx.compose.runtime.b2.i(l11, (Function2) eVar, c0Var2, (i16 >> 3) & 14);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            l11 = l10;
            c0Var2 = c0VarR;
            c0Var2.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            final Long l12 = l11;
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.l7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return n7.l(a0Var, l12, function1, k1Var, function2, function3, i10, p7Var, v1Var, locale, r7Var, g0Var, i11, i12, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(androidx.compose.material3.internal.v1 v1Var, androidx.compose.runtime.n3 n3Var, Function1 function1, androidx.compose.material3.internal.k1 k1Var, Locale locale, p7 p7Var, int i10, androidx.compose.runtime.n3 n3Var2, androidx.compose.ui.text.input.y0 y0Var) {
        if (y0Var.m().length() <= v1Var.g().length()) {
            String strM = y0Var.m();
            for (int i11 = 0; i11 < strM.length(); i11++) {
                if (Character.isDigit(strM.charAt(i11))) {
                }
            }
            o(n3Var2, y0Var);
            String string = StringsKt.E5(y0Var.m()).toString();
            Long lValueOf = null;
            if (string.length() != 0 && string.length() >= v1Var.g().length()) {
                androidx.compose.material3.internal.j1 j1VarS = k1Var.s(string, v1Var.g(), locale);
                n3Var.setValue(p7Var.e(j1VarS, i10, locale));
                if (((CharSequence) n3Var.getValue()).length() == 0 && j1VarS != null) {
                    lValueOf = Long.valueOf(j1VarS.v());
                }
                function1.invoke(lValueOf);
            } else {
                n3Var.setValue("");
                function1.invoke(null);
            }
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(androidx.compose.runtime.n3 n3Var, androidx.compose.ui.semantics.e0 e0Var) {
        if (!StringsKt.w3((CharSequence) n3Var.getValue())) {
            androidx.compose.ui.semantics.b0.q(e0Var, (String) n3Var.getValue());
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(androidx.compose.ui.a0 a0Var, Long l10, Function1 function1, androidx.compose.material3.internal.k1 k1Var, Function2 function2, Function2 function3, int i10, p7 p7Var, androidx.compose.material3.internal.v1 v1Var, Locale locale, r7 r7Var, androidx.compose.ui.focus.g0 g0Var, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        i(a0Var, l10, function1, k1Var, function2, function3, i10, p7Var, v1Var, locale, r7Var, g0Var, c0Var, androidx.compose.runtime.t4.a(i11 | 1), androidx.compose.runtime.t4.a(i12));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.n3 m() {
        return androidx.compose.runtime.d7.g(new androidx.compose.ui.text.input.y0((String) null, 0L, (androidx.compose.ui.text.w3) null, 7, (DefaultConstructorMarker) null), null, 2, null);
    }

    private static final androidx.compose.ui.text.input.y0 n(androidx.compose.runtime.n3<androidx.compose.ui.text.input.y0> n3Var) {
        return n3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(androidx.compose.runtime.n3<androidx.compose.ui.text.input.y0> n3Var, androidx.compose.ui.text.input.y0 y0Var) {
        n3Var.setValue(y0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.n3 p(p7 p7Var, androidx.compose.material3.internal.k1 k1Var, androidx.compose.material3.internal.v1 v1Var, Locale locale, int i10, androidx.compose.runtime.n3 n3Var) {
        return androidx.compose.runtime.d7.g(n(n3Var).m().length() > 0 ? p7Var.e(k1Var.s(n(n3Var).m(), v1Var.g(), locale), i10, locale) : "", null, 2, null);
    }

    @NotNull
    public static final androidx.compose.foundation.layout.g5 r() {
        return f30962a;
    }
}
