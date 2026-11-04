package io.intercom.android.sdk.m5.home.ui.header;

import android.content.Context;
import androidx.compose.foundation.i1;
import androidx.compose.foundation.layout.d0;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.j0;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.n0;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.x5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.foundation.s2;
import androidx.compose.material3.ni;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.a0;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.y3;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.m5.components.AvatarGroupKt;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.m5.home.ui.components.WrapReportingTextKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.ThemeUtils;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nHomeHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeHeader.kt\nio/intercom/android/sdk/m5/home/ui/header/HomeHeaderKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,239:1\n1282#2,6:240\n1282#2,6:246\n1282#2,6:337\n1282#2,6:343\n1282#2,6:388\n113#3:252\n113#3:253\n113#3:329\n113#3:330\n113#3:331\n113#3:336\n113#3:353\n113#3:354\n87#4:254\n84#4,9:255\n94#4:352\n80#5,6:264\n87#5,3:279\n90#5,2:288\n80#5,6:301\n87#5,3:316\n90#5,2:325\n94#5:334\n94#5:351\n80#5,6:361\n87#5,3:376\n90#5,2:385\n80#5,6:404\n87#5,3:419\n90#5,2:428\n94#5:433\n94#5:437\n391#6,9:270\n400#6:290\n391#6,9:307\n400#6:327\n401#6,2:332\n401#6,2:349\n391#6,9:367\n400#6:387\n391#6,9:410\n400#6,3:430\n401#6,2:435\n4360#7,6:282\n4360#7,6:319\n4360#7,6:379\n4360#7,6:422\n99#8:291\n96#8,9:292\n106#8:335\n99#8,6:355\n106#8:438\n75#9:328\n70#10:394\n67#10,9:395\n77#10:434\n*S KotlinDebug\n*F\n+ 1 HomeHeader.kt\nio/intercom/android/sdk/m5/home/ui/header/HomeHeaderKt\n*L\n51#1:240,6\n52#1:246,6\n115#1:337,6\n139#1:343,6\n165#1:388,6\n56#1:252\n57#1:253\n83#1:329\n84#1:330\n94#1:331\n96#1:336\n158#1:353\n159#1:354\n54#1:254\n54#1:255,9\n54#1:352\n54#1:264,6\n54#1:279,3\n54#1:288,2\n59#1:301,6\n59#1:316,3\n59#1:325,2\n59#1:334\n54#1:351\n154#1:361,6\n154#1:376,3\n154#1:385,2\n164#1:404,6\n164#1:419,3\n164#1:428,2\n164#1:433\n154#1:437\n54#1:270,9\n54#1:290\n59#1:307,9\n59#1:327\n59#1:332,2\n54#1:349,2\n154#1:367,9\n154#1:387\n164#1:410,9\n164#1:430,3\n154#1:435,2\n54#1:282,6\n59#1:319,6\n154#1:379,6\n164#1:422,6\n59#1:291\n59#1:292,9\n59#1:335\n154#1:355,6\n154#1:438\n64#1:328\n164#1:394\n164#1:395,9\n164#1:434\n*E\n"})
public final class HomeHeaderKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void HomeContentHeader(@Nullable a0 a0Var, @NotNull final HomeUiState.Content.ContentHeader header, @Nullable c0 c0Var, final int i10, final int i11) {
        final n3 n3Var;
        a0.a aVar;
        c0 c0Var2;
        int i12;
        Intrinsics.checkNotNullParameter(header, "header");
        c0 c0VarR = c0Var.R(-1992208830);
        a0 a0Var2 = (i11 & 1) != 0 ? a0.E : a0Var;
        y3 type02 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType02();
        c0VarR.E(-1302174101);
        Object objI0 = c0VarR.i0();
        c0.a aVar2 = c0.f35327a;
        if (objI0 == aVar2.a()) {
            objI0 = d7.g(type02, null, 2, null);
            c0VarR.Y(objI0);
        }
        n3 n3Var2 = (n3) objI0;
        c0VarR.A();
        c0VarR.E(-1302171803);
        Object objI1 = c0VarR.i0();
        if (objI1 == aVar2.a()) {
            objI1 = d7.g(Boolean.FALSE, null, 2, null);
            c0VarR.Y(objI1);
        }
        n3 n3Var3 = (n3) objI1;
        c0VarR.A();
        float f10 = 32;
        final a0 a0Var3 = a0Var2;
        float f11 = 24;
        a0 a0VarV = d5.v(d5.v(a0Var2, 0.0f, androidx.compose.ui.unit.h.r(10), 0.0f, androidx.compose.ui.unit.h.r(f10), 5, null), androidx.compose.ui.unit.h.r(f10), 0.0f, androidx.compose.ui.unit.h.r(f11), 0.0f, 10, null);
        androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
        androidx.compose.foundation.layout.q.m mVarY = qVar.y();
        androidx.compose.ui.e.a aVar3 = androidx.compose.ui.e.f37317a;
        a1 a1VarB = j0.b(mVarY, aVar3.u(), c0VarR, 0);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        b1 b1VarK = c0VarR.k();
        a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarV);
        androidx.compose.ui.node.g.a aVar4 = androidx.compose.ui.node.g.I;
        Function0<androidx.compose.ui.node.g> function0A = aVar4.a();
        if (c0VarR.S() == null) {
            androidx.compose.runtime.v.r();
        }
        c0VarR.q();
        if (c0VarR.P()) {
            c0VarR.q0(function0A);
        } else {
            c0VarR.l();
        }
        c0 c0VarD = y7.d(c0VarR);
        y7.n(c0VarD, a1VarB, aVar4.e());
        y7.n(c0VarD, b1VarK, aVar4.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar4.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar4.f());
        n0 n0Var = n0.f16227a;
        a0.a aVar5 = a0.E;
        a0 a0VarH = i6.h(aVar5, 0.0f, 1, null);
        a1 a1VarE = u5.e(qVar.w(), aVar3.q(), c0VarR, 48);
        int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        b1 b1VarK2 = c0VarR.k();
        a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarH);
        Function0<androidx.compose.ui.node.g> function0A2 = aVar4.a();
        if (c0VarR.S() == null) {
            androidx.compose.runtime.v.r();
        }
        c0VarR.q();
        if (c0VarR.P()) {
            c0VarR.q0(function0A2);
        } else {
            c0VarR.l();
        }
        c0 c0VarD2 = y7.d(c0VarR);
        y7.n(c0VarD2, a1VarE, aVar4.e());
        y7.n(c0VarD2, b1VarK2, aVar4.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar4.b();
        if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
            c0VarD2.Y(Integer.valueOf(iHashCode2));
            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
        }
        y7.n(c0VarD2, a0VarN2, aVar4.f());
        y5 y5Var = y5.f16577a;
        c0VarR.E(-827693262);
        if (header.getShowLogo()) {
            Context context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
            aVar = aVar5;
            c0Var2 = c0VarR;
            n3Var = n3Var3;
            i12 = 0;
            s2.d(coil.compose.g.c(new coil.request.i.a(context).j(ThemeUtils.INSTANCE.selectUrlForThemeCompose$intercom_sdk_base_release(header.getLogoUrl(), header.getLogoDarkUrl(), c0VarR, a5.S0)).i(true).f(), IntercomImageLoaderKt.getImageLoader(context), null, null, null, 0, null, c0Var2, 72, 124), null, i6.i(d5.v(x5.q(y5Var, aVar, 1.0f, false, 2, null), 0.0f, 0.0f, androidx.compose.ui.unit.h.r(16), 0.0f, 11, null), androidx.compose.ui.unit.h.r(f10)), aVar3.o(), androidx.compose.ui.layout.l.f39405a.e(), 0.0f, null, c0Var2, 27696, 96);
        } else {
            n3Var = n3Var3;
            aVar = aVar5;
            c0Var2 = c0VarR;
            i12 = 0;
        }
        c0Var2.A();
        c0Var2.E(-827663462);
        if (header.getShowAvatars()) {
            c0 c0Var3 = c0Var2;
            AvatarGroupKt.m101AvatarGroupJ8mCjc(header.getAdminsAvatars(), null, 0.0f, 0L, c0Var3, 8, 14);
            c0Var2 = c0Var3;
        }
        c0Var2.A();
        c0Var2.E(-827660195);
        if (!header.getShowLogo()) {
            l6.a(x5.q(y5Var, aVar, 1.0f, false, 2, null), c0Var2, i12);
        }
        c0Var2.A();
        l6.a(i6.w(aVar, androidx.compose.ui.unit.h.r(f11)), c0Var2, 6);
        c0Var2.o();
        l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(48)), c0Var2, 6);
        c0Var2.E(-2011771929);
        HomeUiState.Content.ContentHeader.ColoredText greeting = header.getGreeting();
        c0Var2.E(-2011770823);
        if (!StringsKt.w3(greeting.getText())) {
            c0Var2.E(-827645376);
            Pair pair = new Pair((!ThemeUtils.INSTANCE.isDarkModeCompose$intercom_sdk_base_release(c0Var2, 6) || greeting.getTextColorDark() == null) ? greeting.getTextColorLight() : greeting.getTextColorDark(), Float.valueOf(greeting.getOpacity()));
            c0Var2.A();
            String str = (String) pair.component1();
            float fFloatValue = ((Number) pair.component2()).floatValue();
            String text = greeting.getText();
            y3 y3Var = (y3) n3Var2.getValue();
            long composeColor = ColorExtensionsKt.toComposeColor(str, fFloatValue);
            c0Var2.E(-827627186);
            Object objI2 = c0Var2.i0();
            if (objI2 == aVar2.a()) {
                objI2 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.header.r
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HomeHeaderKt.HomeContentHeader$lambda$11$lambda$6$lambda$5$lambda$4(n3Var, ((Boolean) obj).booleanValue());
                    }
                };
                c0Var2.Y(objI2);
            }
            c0Var2.A();
            c0 c0Var4 = c0Var2;
            WrapReportingTextKt.m377WrapReportingTextT042LqI(null, text, composeColor, y3Var, (Function1) objI2, c0Var4, 24576, 1);
            c0Var2 = c0Var4;
        }
        c0Var2.A();
        Unit unit = Unit.f312394a;
        c0Var2.A();
        c0Var2.E(-2011741756);
        HomeUiState.Content.ContentHeader.ColoredText intro = header.getIntro();
        c0Var2.E(-2011740743);
        if (!StringsKt.w3(intro.getText())) {
            c0Var2.E(-827615296);
            Pair pair2 = new Pair((!ThemeUtils.INSTANCE.isDarkModeCompose$intercom_sdk_base_release(c0Var2, 6) || intro.getTextColorDark() == null) ? intro.getTextColorLight() : intro.getTextColorDark(), Float.valueOf(intro.getOpacity()));
            c0Var2.A();
            String str2 = (String) pair2.component1();
            float fFloatValue2 = ((Number) pair2.component2()).floatValue();
            String text2 = intro.getText();
            y3 y3Var2 = (y3) n3Var2.getValue();
            long composeColor2 = ColorExtensionsKt.toComposeColor(str2, fFloatValue2);
            c0Var2.E(-827597106);
            Object objI3 = c0Var2.i0();
            if (objI3 == aVar2.a()) {
                objI3 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.header.s
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HomeHeaderKt.HomeContentHeader$lambda$11$lambda$10$lambda$9$lambda$8(n3Var, ((Boolean) obj).booleanValue());
                    }
                };
                c0Var2.Y(objI3);
            }
            c0Var2.A();
            c0 c0Var5 = c0Var2;
            WrapReportingTextKt.m377WrapReportingTextT042LqI(null, text2, composeColor2, y3Var2, (Function1) objI3, c0Var5, 24576, 1);
            c0Var2 = c0Var5;
        }
        c0Var2.A();
        c0Var2.A();
        c0Var2.o();
        s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.header.t
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeHeaderKt.HomeContentHeader$lambda$12(a0Var3, header, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeContentHeader$lambda$11$lambda$10$lambda$9$lambda$8(n3 hasEitherTextWrapped, boolean z10) {
        Intrinsics.checkNotNullParameter(hasEitherTextWrapped, "$hasEitherTextWrapped");
        hasEitherTextWrapped.setValue(Boolean.valueOf(z10 | ((Boolean) hasEitherTextWrapped.getValue()).booleanValue()));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeContentHeader$lambda$11$lambda$6$lambda$5$lambda$4(n3 hasEitherTextWrapped, boolean z10) {
        Intrinsics.checkNotNullParameter(hasEitherTextWrapped, "$hasEitherTextWrapped");
        hasEitherTextWrapped.setValue(Boolean.valueOf(z10 | ((Boolean) hasEitherTextWrapped.getValue()).booleanValue()));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeContentHeader$lambda$12(a0 a0Var, HomeUiState.Content.ContentHeader header, int i10, int i11, c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(header, "$header");
        HomeContentHeader(a0Var, header, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void HomeContentHeaderPreview(@Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(-1555491493);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeHeaderKt.INSTANCE.m386getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.header.x
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeHeaderKt.HomeContentHeaderPreview$lambda$19(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeContentHeaderPreview$lambda$19(int i10, c0 c0Var, int i11) {
        HomeContentHeaderPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void HomeErrorHeader(@Nullable a0 a0Var, @NotNull final HomeUiState.Error.ErrorHeader header, @NotNull final Function0<Unit> onCloseClick, @Nullable c0 c0Var, final int i10, final int i11) {
        a0 a0Var2;
        int i12;
        final a0 a0Var3;
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        c0 c0VarR = c0Var.R(964565742);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            a0Var2 = a0Var;
        } else if ((i10 & 14) == 0) {
            a0Var2 = a0Var;
            i12 = (c0VarR.D(a0Var2) ? 4 : 2) | i10;
        } else {
            a0Var2 = a0Var;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i12 |= c0VarR.D(header) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & 896) == 0) {
            i12 |= c0VarR.k0(onCloseClick) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && c0VarR.d()) {
            c0VarR.u();
            a0Var3 = a0Var2;
        } else {
            a0 a0Var4 = i13 != 0 ? a0.E : a0Var2;
            a0 a0VarI = i6.i(d5.t(androidx.compose.foundation.v.d(i6.h(a0Var4, 0.0f, 1, null), ColorExtensionsKt.toComposeColor$default(header.getBackgroundColor(), 0.0f, 1, null), null, 2, null), androidx.compose.ui.unit.h.r(16), 0.0f, 2, null), androidx.compose.ui.unit.h.r(56));
            androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
            a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), aVar.q(), c0VarR, 54);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK = c0VarR.k();
            a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarI);
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
            c0 c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarE, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            y5 y5Var = y5.f16577a;
            c0VarR.E(941715051);
            String foregroundColor = header.getForegroundColor();
            a0.a aVar3 = a0.E;
            c0VarR.E(1204041954);
            boolean z10 = (i12 & 896) == 256;
            Object objI0 = c0VarR.i0();
            if (z10 || objI0 == c0.f35327a.a()) {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.home.ui.header.u
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeHeaderKt.HomeErrorHeader$lambda$17$lambda$16$lambda$14$lambda$13(onCloseClick);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            a0 a0VarJ = i1.j(aVar3, false, null, null, null, (Function0) objI0, 15, null);
            a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar.C(), false);
            int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK2 = c0VarR.k();
            a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarJ);
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
            c0 c0VarD2 = y7.d(c0VarR);
            y7.n(c0VarD2, a1VarK, aVar2.e());
            y7.n(c0VarD2, b1VarK2, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar2.b();
            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            }
            y7.n(c0VarD2, a0VarN2, aVar2.f());
            ni.o(u0.e.c(R.drawable.intercom_ic_close, c0VarR, 0), u0.i.d(io.intercom.android.sdk.R.string.intercom_close, c0VarR, 0), d0.f15956a.b(aVar3, aVar.i()), ColorExtensionsKt.toComposeColor$default(foregroundColor, 0.0f, 1, null), c0VarR, 8, 0);
            c0VarR.o();
            c0VarR.A();
            c0VarR.o();
            a0Var3 = a0Var4;
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.header.v
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeHeaderKt.HomeErrorHeader$lambda$18(a0Var3, header, onCloseClick, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeErrorHeader$lambda$17$lambda$16$lambda$14$lambda$13(Function0 onCloseClick) {
        Intrinsics.checkNotNullParameter(onCloseClick, "$onCloseClick");
        onCloseClick.invoke();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeErrorHeader$lambda$18(a0 a0Var, HomeUiState.Error.ErrorHeader header, Function0 onCloseClick, int i10, int i11, c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(header, "$header");
        Intrinsics.checkNotNullParameter(onCloseClick, "$onCloseClick");
        HomeErrorHeader(a0Var, header, onCloseClick, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c(name = "Error header - Light Mode", uiMode = 16)
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void HomeErrorHeaderPreview(c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(-484536790);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeHeaderKt.INSTANCE.m388getLambda4$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.header.w
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeHeaderKt.HomeErrorHeaderPreview$lambda$20(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeErrorHeaderPreview$lambda$20(int i10, c0 c0Var, int i11) {
        HomeErrorHeaderPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
