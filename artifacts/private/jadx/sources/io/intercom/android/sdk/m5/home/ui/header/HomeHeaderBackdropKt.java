package io.intercom.android.sdk.m5.home.ui.header;

import android.content.Context;
import androidx.compose.foundation.layout.d0;
import androidx.compose.foundation.layout.i6;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.a0;
import androidx.compose.ui.graphics.i0;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.exoplayer.a5;
import coil.compose.AsyncImagePainter;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ThemeUtils;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nHomeHeaderBackdrop.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeHeaderBackdrop.kt\nio/intercom/android/sdk/m5/home/ui/header/HomeHeaderBackdropKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,242:1\n70#2:243\n66#2,10:244\n77#2:298\n80#3,6:254\n87#3,3:269\n90#3,2:278\n94#3:297\n391#4,9:260\n400#4:280\n401#4,2:295\n4360#5,6:272\n113#6:281\n113#6:284\n113#6:292\n113#6:294\n49#7:282\n49#7:285\n49#7:293\n75#8:283\n1282#9,6:286\n*S KotlinDebug\n*F\n+ 1 HomeHeaderBackdrop.kt\nio/intercom/android/sdk/m5/home/ui/header/HomeHeaderBackdropKt\n*L\n40#1:243\n40#1:244,10\n40#1:298\n40#1:254,6\n40#1:269,3\n40#1:278,2\n40#1:297\n40#1:260,9\n40#1:280\n40#1:295,2\n40#1:272,6\n48#1:281\n65#1:284\n76#1:292\n89#1:294\n48#1:282\n65#1:285\n76#1:293\n53#1:283\n67#1:286,6\n*E\n"})
public final class HomeHeaderBackdropKt {
    @androidx.compose.runtime.o
    @d1.c.a({@d1.c(name = "Consistent Fade Behavior Light Mode", uiMode = 16), @d1.c(name = "Consistent Fade Behavior Dark Mode", uiMode = 32)})
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ConsistentFadeBehaviorPreview(@Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(-551060646);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeHeaderBackdropKt.INSTANCE.m384getLambda7$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.header.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeHeaderBackdropKt.ConsistentFadeBehaviorPreview$lambda$10(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConsistentFadeBehaviorPreview$lambda$10(int i10, c0 c0Var, int i11) {
        ConsistentFadeBehaviorPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c.a({@d1.c(name = "Cross-type - Gradient to Solid Light Mode", uiMode = 16), @d1.c(name = "Cross-type - Gradient to Solid Dark Mode", uiMode = 32)})
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void CrossTypeGradientToSolidPreview(@Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(60882784);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeHeaderBackdropKt.INSTANCE.m383getLambda6$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.header.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeHeaderBackdropKt.CrossTypeGradientToSolidPreview$lambda$9(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CrossTypeGradientToSolidPreview$lambda$9(int i10, c0 c0Var, int i11) {
        CrossTypeGradientToSolidPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c.a({@d1.c(name = "Cross-type - Solid to Gradient Light Mode", uiMode = 16), @d1.c(name = "Cross-type - Solid to Gradient Dark Mode", uiMode = 32)})
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void CrossTypeSolidToGradientPreview(@Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(1289954070);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeHeaderBackdropKt.INSTANCE.m382getLambda5$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.header.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeHeaderBackdropKt.CrossTypeSolidToGradientPreview$lambda$8(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CrossTypeSolidToGradientPreview$lambda$8(int i10, c0 c0Var, int i11) {
        CrossTypeSolidToGradientPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c.a({@d1.c(name = "Gradient Light Mode", uiMode = 16), @d1.c(name = "Gradient Dark Mode", uiMode = 32)})
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void GradientHeaderBackdropPreview(@Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(-1564631091);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeHeaderBackdropKt.INSTANCE.m379getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.header.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeHeaderBackdropKt.GradientHeaderBackdropPreview$lambda$5(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GradientHeaderBackdropPreview$lambda$5(int i10, c0 c0Var, int i11) {
        GradientHeaderBackdropPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c.a({@d1.c(name = "Gradient with fade Light Mode", uiMode = 16), @d1.c(name = "Gradient with fade Dark Mode", uiMode = 32)})
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void GradientHeaderBackdropWithFadePreview(@Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(-205873713);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeHeaderBackdropKt.INSTANCE.m381getLambda4$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.header.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeHeaderBackdropKt.GradientHeaderBackdropWithFadePreview$lambda$7(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GradientHeaderBackdropWithFadePreview$lambda$7(int i10, c0 c0Var, int i11) {
        GradientHeaderBackdropWithFadePreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x033b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0341  */
    /* JADX WARN: Code duplicated, block: B:108:0x0366  */
    /* JADX WARN: Code duplicated, block: B:110:0x0377  */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    /* JADX WARN: Code duplicated, block: B:52:0x009c  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:67:0x0105  */
    /* JADX WARN: Code duplicated, block: B:69:0x0113  */
    /* JADX WARN: Code duplicated, block: B:72:0x0134  */
    /* JADX WARN: Code duplicated, block: B:74:0x0174  */
    /* JADX WARN: Code duplicated, block: B:76:0x017a  */
    /* JADX WARN: Code duplicated, block: B:78:0x019f  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:82:0x0219  */
    /* JADX WARN: Code duplicated, block: B:83:0x021c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0224  */
    /* JADX WARN: Code duplicated, block: B:88:0x022c  */
    /* JADX WARN: Code duplicated, block: B:90:0x029a  */
    /* JADX WARN: Code duplicated, block: B:92:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:94:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:95:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:99:0x02f8  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    /* JADX INFO: renamed from: HomeHeaderBackdrop-AjpBEmI, reason: not valid java name */
    public static final void m389HomeHeaderBackdropAjpBEmI(final float f10, @NotNull final HomeUiState.Content.ContentHeader.HeaderBackdropStyle backdropStyle, @Nullable HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle, @NotNull final Function0<Unit> onImageLoaded, @Nullable c0 c0Var, final int i10, final int i11) {
        int i12;
        HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle2;
        int i13;
        HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle3;
        HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle4;
        a0.a aVar;
        androidx.compose.ui.e.a aVar2;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        d0 d0Var;
        c0 c0Var2;
        HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle5;
        d0 d0Var2;
        int i14;
        HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid solid;
        int i15;
        float fR;
        float f11;
        boolean z10;
        boolean z11;
        boolean z12;
        Object objI0;
        final HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle6;
        float f12;
        HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient gradient;
        float f13;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(backdropStyle, "backdropStyle");
        Intrinsics.checkNotNullParameter(onImageLoaded, "onImageLoaded");
        c0 c0VarR = c0Var.R(1754935872);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.I(f10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i12 |= c0VarR.D(backdropStyle) ? 32 : 16;
        }
        int i16 = i11 & 4;
        if (i16 == 0) {
            if ((i10 & 896) == 0) {
                headerBackdropStyle2 = headerBackdropStyle;
                i12 |= c0VarR.D(headerBackdropStyle2) ? 256 : 128;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (c0VarR.k0(onImageLoaded)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            if ((i12 & 5851) == 1170 || !c0VarR.d()) {
                if (i16 != 0) {
                    headerBackdropStyle3 = null;
                } else {
                    headerBackdropStyle3 = headerBackdropStyle2;
                }
                if (ThemeUtils.INSTANCE.isDarkModeCompose$intercom_sdk_base_release(c0VarR, 6) || headerBackdropStyle3 == null) {
                    headerBackdropStyle4 = backdropStyle;
                } else {
                    headerBackdropStyle4 = headerBackdropStyle3;
                }
                aVar = a0.E;
                aVar2 = androidx.compose.ui.e.f37317a;
                a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK = c0VarR.k();
                a0 a0VarN = androidx.compose.ui.m.n(c0VarR, aVar);
                androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
                function0A = aVar3.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarK, aVar3.e());
                y7.n(c0VarD, b1VarK, aVar3.g());
                function2B = aVar3.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN, aVar3.f());
                d0Var = d0.f15956a;
                if (headerBackdropStyle4 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient) {
                    c0VarR.E(1047420935);
                    gradient = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient) headerBackdropStyle4;
                    f11 = 0.0f;
                    a0 a0VarB = androidx.compose.foundation.v.b(aVar, i0.a.h(i0.f37796b, gradient.getColors(), 0L, 0L, 0, 14, null), null, 0.0f, 6, null);
                    if (gradient.getFade()) {
                        f13 = 160;
                    } else {
                        f13 = 80;
                    }
                    z10 = true;
                    androidx.compose.foundation.layout.x.b(i6.h(i6.i(a0VarB, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(f13) + f10)), 0.0f, 1, null), c0VarR, 0);
                    c0VarR.A();
                    HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle7 = headerBackdropStyle4;
                    c0Var2 = c0VarR;
                    headerBackdropStyle5 = headerBackdropStyle7;
                    d0Var2 = d0Var;
                    i14 = 160;
                    i15 = 80;
                    z11 = false;
                } else if (headerBackdropStyle4 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image) {
                    c0VarR.E(1047880603);
                    Context context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                    HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image image = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image) headerBackdropStyle4;
                    coil.request.i iVarF = new coil.request.i.a(context).j(image.getImageUrl()).i(true).f();
                    coil.j imageLoader = IntercomImageLoaderKt.getImageLoader(context);
                    androidx.compose.ui.layout.l lVarA = androidx.compose.ui.layout.l.f39405a.a();
                    a0 a0VarH = i6.h(i6.i(androidx.compose.foundation.v.d(aVar, image.m360getFallbackColor0d7_KjU(), null, 2, null), androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(80) + f10)), 0.0f, 1, null);
                    c0VarR.E(-1074554204);
                    if ((i12 & 7168) == 2048) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z12 || objI0 == c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.header.o
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return HomeHeaderBackdropKt.HomeHeaderBackdrop_AjpBEmI$lambda$2$lambda$1$lambda$0(onImageLoaded, (AsyncImagePainter.State.Success) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    d0Var2 = d0Var;
                    headerBackdropStyle5 = headerBackdropStyle4;
                    i14 = 160;
                    coil.compose.a0.f(iVarF, null, imageLoader, a0VarH, null, null, null, null, null, (Function1) objI0, null, null, lVarA, 0.0f, null, 0, false, null, c0VarR, 568, a5.S0, 257520);
                    c0Var2 = c0VarR;
                    c0Var2.A();
                    aVar = aVar;
                    i15 = 80;
                    f11 = 0.0f;
                    z10 = true;
                    z11 = false;
                } else {
                    HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle8 = headerBackdropStyle4;
                    c0Var2 = c0VarR;
                    headerBackdropStyle5 = headerBackdropStyle8;
                    d0Var2 = d0Var;
                    i14 = 160;
                    if (!(headerBackdropStyle5 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid)) {
                        c0Var2.E(-1074592113);
                        c0Var2.A();
                        throw new k0();
                    }
                    c0Var2.E(1048705854);
                    solid = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid) headerBackdropStyle5;
                    a0 a0VarD = androidx.compose.foundation.v.d(aVar, solid.m364getColor0d7_KjU(), null, 2, null);
                    if (solid.getFade()) {
                        aVar = aVar;
                        fR = androidx.compose.ui.unit.h.r(160);
                        i15 = 80;
                    } else {
                        aVar = aVar;
                        i15 = 80;
                        fR = androidx.compose.ui.unit.h.r(80);
                    }
                    a0 a0VarI = i6.i(a0VarD, androidx.compose.ui.unit.h.r(f10 + fR));
                    f11 = 0.0f;
                    z10 = true;
                    z11 = false;
                    androidx.compose.foundation.layout.x.b(i6.h(a0VarI, 0.0f, 1, null), c0Var2, 0);
                    c0Var2.A();
                }
                c0Var2.E(-1074538392);
                if (headerBackdropStyle5.getFade()) {
                    a0 a0VarB2 = androidx.compose.foundation.v.b(aVar, i0.a.t(i0.f37796b, CollectionsKt.listOf((Object[]) new q0[]{q0.n(q0.f38131b.s()), q0.n(IntercomTheme.INSTANCE.getColors(c0Var2, IntercomTheme.$stable).m690getBackground0d7_KjU())}), 0.0f, 0.0f, 0, 14, null), null, 0.0f, 6, null);
                    if (headerBackdropStyle5 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image) {
                        f12 = i15;
                    } else {
                        f12 = i14;
                    }
                    androidx.compose.foundation.layout.x.b(d0Var2.b(i6.h(i6.i(a0VarB2, androidx.compose.ui.unit.h.r(f12)), f11, 1, null), aVar2.c()), c0Var2, 0);
                }
                c0Var2.A();
                c0Var2.o();
                headerBackdropStyle6 = headerBackdropStyle3;
            } else {
                c0VarR.u();
                c0Var2 = c0VarR;
                headerBackdropStyle6 = headerBackdropStyle2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.header.p
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return HomeHeaderBackdropKt.HomeHeaderBackdrop_AjpBEmI$lambda$3(f10, backdropStyle, headerBackdropStyle6, onImageLoaded, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= a5.S0;
        headerBackdropStyle2 = headerBackdropStyle;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (c0VarR.k0(onImageLoaded)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & 5851) == 1170) {
            if (i16 != 0) {
                headerBackdropStyle3 = null;
            } else {
                headerBackdropStyle3 = headerBackdropStyle2;
            }
            if (ThemeUtils.INSTANCE.isDarkModeCompose$intercom_sdk_base_release(c0VarR, 6)) {
                headerBackdropStyle4 = backdropStyle;
            } else {
                headerBackdropStyle4 = backdropStyle;
            }
            aVar = a0.E;
            aVar2 = androidx.compose.ui.e.f37317a;
            a1 a1VarK2 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK2 = c0VarR.k();
            a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, aVar);
            androidx.compose.ui.node.g.a aVar4 = androidx.compose.ui.node.g.I;
            function0A = aVar4.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarK2, aVar4.e());
            y7.n(c0VarD, b1VarK2, aVar4.g());
            function2B = aVar4.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN2, aVar4.f());
            d0Var = d0.f15956a;
            if (headerBackdropStyle4 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient) {
                c0VarR.E(1047420935);
                gradient = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient) headerBackdropStyle4;
                f11 = 0.0f;
                a0 a0VarB3 = androidx.compose.foundation.v.b(aVar, i0.a.h(i0.f37796b, gradient.getColors(), 0L, 0L, 0, 14, null), null, 0.0f, 6, null);
                if (gradient.getFade()) {
                    f13 = 160;
                } else {
                    f13 = 80;
                }
                z10 = true;
                androidx.compose.foundation.layout.x.b(i6.h(i6.i(a0VarB3, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(f13) + f10)), 0.0f, 1, null), c0VarR, 0);
                c0VarR.A();
                HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle9 = headerBackdropStyle4;
                c0Var2 = c0VarR;
                headerBackdropStyle5 = headerBackdropStyle9;
                d0Var2 = d0Var;
                i14 = 160;
                i15 = 80;
                z11 = false;
            } else if (headerBackdropStyle4 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image) {
                c0VarR.E(1047880603);
                Context context2 = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image image2 = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image) headerBackdropStyle4;
                coil.request.i iVarF2 = new coil.request.i.a(context2).j(image2.getImageUrl()).i(true).f();
                coil.j imageLoader2 = IntercomImageLoaderKt.getImageLoader(context2);
                androidx.compose.ui.layout.l lVarA2 = androidx.compose.ui.layout.l.f39405a.a();
                a0 a0VarH2 = i6.h(i6.i(androidx.compose.foundation.v.d(aVar, image2.m360getFallbackColor0d7_KjU(), null, 2, null), androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(80) + f10)), 0.0f, 1, null);
                c0VarR.E(-1074554204);
                if ((i12 & 7168) == 2048) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objI0 = c0VarR.i0();
                if (z12) {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.header.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return HomeHeaderBackdropKt.HomeHeaderBackdrop_AjpBEmI$lambda$2$lambda$1$lambda$0(onImageLoaded, (AsyncImagePainter.State.Success) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.header.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return HomeHeaderBackdropKt.HomeHeaderBackdrop_AjpBEmI$lambda$2$lambda$1$lambda$0(onImageLoaded, (AsyncImagePainter.State.Success) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                d0Var2 = d0Var;
                headerBackdropStyle5 = headerBackdropStyle4;
                i14 = 160;
                coil.compose.a0.f(iVarF2, null, imageLoader2, a0VarH2, null, null, null, null, null, (Function1) objI0, null, null, lVarA2, 0.0f, null, 0, false, null, c0VarR, 568, a5.S0, 257520);
                c0Var2 = c0VarR;
                c0Var2.A();
                aVar = aVar;
                i15 = 80;
                f11 = 0.0f;
                z10 = true;
                z11 = false;
            } else {
                HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle10 = headerBackdropStyle4;
                c0Var2 = c0VarR;
                headerBackdropStyle5 = headerBackdropStyle10;
                d0Var2 = d0Var;
                i14 = 160;
                if (!(headerBackdropStyle5 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid)) {
                    c0Var2.E(-1074592113);
                    c0Var2.A();
                    throw new k0();
                }
                c0Var2.E(1048705854);
                solid = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid) headerBackdropStyle5;
                a0 a0VarD2 = androidx.compose.foundation.v.d(aVar, solid.m364getColor0d7_KjU(), null, 2, null);
                if (solid.getFade()) {
                    aVar = aVar;
                    fR = androidx.compose.ui.unit.h.r(160);
                    i15 = 80;
                } else {
                    aVar = aVar;
                    i15 = 80;
                    fR = androidx.compose.ui.unit.h.r(80);
                }
                a0 a0VarI2 = i6.i(a0VarD2, androidx.compose.ui.unit.h.r(f10 + fR));
                f11 = 0.0f;
                z10 = true;
                z11 = false;
                androidx.compose.foundation.layout.x.b(i6.h(a0VarI2, 0.0f, 1, null), c0Var2, 0);
                c0Var2.A();
            }
            c0Var2.E(-1074538392);
            if (headerBackdropStyle5.getFade()) {
                a0 a0VarB4 = androidx.compose.foundation.v.b(aVar, i0.a.t(i0.f37796b, CollectionsKt.listOf((Object[]) new q0[]{q0.n(q0.f38131b.s()), q0.n(IntercomTheme.INSTANCE.getColors(c0Var2, IntercomTheme.$stable).m690getBackground0d7_KjU())}), 0.0f, 0.0f, 0, 14, null), null, 0.0f, 6, null);
                if (headerBackdropStyle5 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image) {
                    f12 = i15;
                } else {
                    f12 = i14;
                }
                androidx.compose.foundation.layout.x.b(d0Var2.b(i6.h(i6.i(a0VarB4, androidx.compose.ui.unit.h.r(f12)), f11, 1, null), aVar2.c()), c0Var2, 0);
            }
            c0Var2.A();
            c0Var2.o();
            headerBackdropStyle6 = headerBackdropStyle3;
        } else {
            if (i16 != 0) {
                headerBackdropStyle3 = null;
            } else {
                headerBackdropStyle3 = headerBackdropStyle2;
            }
            if (ThemeUtils.INSTANCE.isDarkModeCompose$intercom_sdk_base_release(c0VarR, 6)) {
                headerBackdropStyle4 = backdropStyle;
            } else {
                headerBackdropStyle4 = backdropStyle;
            }
            aVar = a0.E;
            aVar2 = androidx.compose.ui.e.f37317a;
            a1 a1VarK3 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK3 = c0VarR.k();
            a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, aVar);
            androidx.compose.ui.node.g.a aVar5 = androidx.compose.ui.node.g.I;
            function0A = aVar5.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarK3, aVar5.e());
            y7.n(c0VarD, b1VarK3, aVar5.g());
            function2B = aVar5.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN3, aVar5.f());
            d0Var = d0.f15956a;
            if (headerBackdropStyle4 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient) {
                c0VarR.E(1047420935);
                gradient = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient) headerBackdropStyle4;
                f11 = 0.0f;
                a0 a0VarB5 = androidx.compose.foundation.v.b(aVar, i0.a.h(i0.f37796b, gradient.getColors(), 0L, 0L, 0, 14, null), null, 0.0f, 6, null);
                if (gradient.getFade()) {
                    f13 = 160;
                } else {
                    f13 = 80;
                }
                z10 = true;
                androidx.compose.foundation.layout.x.b(i6.h(i6.i(a0VarB5, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(f13) + f10)), 0.0f, 1, null), c0VarR, 0);
                c0VarR.A();
                HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle11 = headerBackdropStyle4;
                c0Var2 = c0VarR;
                headerBackdropStyle5 = headerBackdropStyle11;
                d0Var2 = d0Var;
                i14 = 160;
                i15 = 80;
                z11 = false;
            } else if (headerBackdropStyle4 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image) {
                c0VarR.E(1047880603);
                Context context3 = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image image3 = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image) headerBackdropStyle4;
                coil.request.i iVarF3 = new coil.request.i.a(context3).j(image3.getImageUrl()).i(true).f();
                coil.j imageLoader3 = IntercomImageLoaderKt.getImageLoader(context3);
                androidx.compose.ui.layout.l lVarA3 = androidx.compose.ui.layout.l.f39405a.a();
                a0 a0VarH3 = i6.h(i6.i(androidx.compose.foundation.v.d(aVar, image3.m360getFallbackColor0d7_KjU(), null, 2, null), androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(80) + f10)), 0.0f, 1, null);
                c0VarR.E(-1074554204);
                if ((i12 & 7168) == 2048) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objI0 = c0VarR.i0();
                if (z12) {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.header.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return HomeHeaderBackdropKt.HomeHeaderBackdrop_AjpBEmI$lambda$2$lambda$1$lambda$0(onImageLoaded, (AsyncImagePainter.State.Success) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.header.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return HomeHeaderBackdropKt.HomeHeaderBackdrop_AjpBEmI$lambda$2$lambda$1$lambda$0(onImageLoaded, (AsyncImagePainter.State.Success) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                d0Var2 = d0Var;
                headerBackdropStyle5 = headerBackdropStyle4;
                i14 = 160;
                coil.compose.a0.f(iVarF3, null, imageLoader3, a0VarH3, null, null, null, null, null, (Function1) objI0, null, null, lVarA3, 0.0f, null, 0, false, null, c0VarR, 568, a5.S0, 257520);
                c0Var2 = c0VarR;
                c0Var2.A();
                aVar = aVar;
                i15 = 80;
                f11 = 0.0f;
                z10 = true;
                z11 = false;
            } else {
                HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle12 = headerBackdropStyle4;
                c0Var2 = c0VarR;
                headerBackdropStyle5 = headerBackdropStyle12;
                d0Var2 = d0Var;
                i14 = 160;
                if (!(headerBackdropStyle5 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid)) {
                    c0Var2.E(-1074592113);
                    c0Var2.A();
                    throw new k0();
                }
                c0Var2.E(1048705854);
                solid = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid) headerBackdropStyle5;
                a0 a0VarD3 = androidx.compose.foundation.v.d(aVar, solid.m364getColor0d7_KjU(), null, 2, null);
                if (solid.getFade()) {
                    aVar = aVar;
                    fR = androidx.compose.ui.unit.h.r(160);
                    i15 = 80;
                } else {
                    aVar = aVar;
                    i15 = 80;
                    fR = androidx.compose.ui.unit.h.r(80);
                }
                a0 a0VarI3 = i6.i(a0VarD3, androidx.compose.ui.unit.h.r(f10 + fR));
                f11 = 0.0f;
                z10 = true;
                z11 = false;
                androidx.compose.foundation.layout.x.b(i6.h(a0VarI3, 0.0f, 1, null), c0Var2, 0);
                c0Var2.A();
            }
            c0Var2.E(-1074538392);
            if (headerBackdropStyle5.getFade()) {
                a0 a0VarB6 = androidx.compose.foundation.v.b(aVar, i0.a.t(i0.f37796b, CollectionsKt.listOf((Object[]) new q0[]{q0.n(q0.f38131b.s()), q0.n(IntercomTheme.INSTANCE.getColors(c0Var2, IntercomTheme.$stable).m690getBackground0d7_KjU())}), 0.0f, 0.0f, 0, 14, null), null, 0.0f, 6, null);
                if (headerBackdropStyle5 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image) {
                    f12 = i15;
                } else {
                    f12 = i14;
                }
                androidx.compose.foundation.layout.x.b(d0Var2.b(i6.h(i6.i(a0VarB6, androidx.compose.ui.unit.h.r(f12)), f11, 1, null), aVar2.c()), c0Var2, 0);
            }
            c0Var2.A();
            c0Var2.o();
            headerBackdropStyle6 = headerBackdropStyle3;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.header.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeHeaderBackdropKt.HomeHeaderBackdrop_AjpBEmI$lambda$3(f10, backdropStyle, headerBackdropStyle6, onImageLoaded, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeHeaderBackdrop_AjpBEmI$lambda$2$lambda$1$lambda$0(Function0 onImageLoaded, AsyncImagePainter.State.Success it) {
        Intrinsics.checkNotNullParameter(onImageLoaded, "$onImageLoaded");
        Intrinsics.checkNotNullParameter(it, "it");
        onImageLoaded.invoke();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeHeaderBackdrop_AjpBEmI$lambda$3(float f10, HomeUiState.Content.ContentHeader.HeaderBackdropStyle backdropStyle, HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle, Function0 onImageLoaded, int i10, int i11, c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(backdropStyle, "$backdropStyle");
        Intrinsics.checkNotNullParameter(onImageLoaded, "$onImageLoaded");
        m389HomeHeaderBackdropAjpBEmI(f10, backdropStyle, headerBackdropStyle, onImageLoaded, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c.a({@d1.c(name = "Solid Light Mode", uiMode = 16), @d1.c(name = "Solid Dark Mode", uiMode = 32)})
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void SolidHeaderBackdropPreview(@Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(784552236);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            int i11 = 5 | 0;
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeHeaderBackdropKt.INSTANCE.m378getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.header.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeHeaderBackdropKt.SolidHeaderBackdropPreview$lambda$4(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SolidHeaderBackdropPreview$lambda$4(int i10, c0 c0Var, int i11) {
        SolidHeaderBackdropPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c.a({@d1.c(name = "Solid with fade Light Mode", uiMode = 16), @d1.c(name = "Solid with fade Dark Mode", uiMode = 32)})
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void SolidHeaderBackdropWithFadePreview(@Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(14975022);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeHeaderBackdropKt.INSTANCE.m380getLambda3$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.header.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeHeaderBackdropKt.SolidHeaderBackdropWithFadePreview$lambda$6(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SolidHeaderBackdropWithFadePreview$lambda$6(int i10, c0 c0Var, int i11) {
        SolidHeaderBackdropWithFadePreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
