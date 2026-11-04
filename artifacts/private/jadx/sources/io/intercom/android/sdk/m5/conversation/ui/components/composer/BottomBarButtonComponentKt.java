package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.ei;
import androidx.compose.material3.ni;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nBottomBarButtonComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomBarButtonComponent.kt\nio/intercom/android/sdk/m5/conversation/ui/components/composer/BottomBarButtonComponentKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,124:1\n99#2:125\n96#2,9:126\n106#2:167\n80#3,6:135\n87#3,3:150\n90#3,2:159\n94#3:166\n391#4,9:141\n400#4:161\n401#4,2:164\n4360#5,6:153\n1863#6,2:162\n*S KotlinDebug\n*F\n+ 1 BottomBarButtonComponent.kt\nio/intercom/android/sdk/m5/conversation/ui/components/composer/BottomBarButtonComponentKt\n*L\n28#1:125\n28#1:126,9\n28#1:167\n28#1:135,6\n28#1:150,3\n28#1:159,2\n28#1:166\n28#1:141,9\n28#1:161\n28#1:164,2\n28#1:153,6\n31#1:162,2\n*E\n"})
public final class BottomBarButtonComponentKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void BottomBarButtonComponent(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final List<? extends BottomBarUiState.BottomBarButton> buttons, boolean z10, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, @Nullable Function0<Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(665212828);
        if ((i11 & 1) != 0) {
            a0Var = androidx.compose.ui.a0.E;
        }
        boolean z11 = (i11 & 4) != 0 ? true : z10;
        final Function0<Unit> function3 = (i11 & 8) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        } : function0;
        final Function0<Unit> function4 = (i11 & 16) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        } : function1;
        final Function0<Unit> function5 = (i11 & 32) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        } : function2;
        androidx.compose.ui.layout.a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), androidx.compose.ui.e.f37317a.w(), c0VarR, 0);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        androidx.compose.runtime.b1 b1VarK = c0VarR.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0Var);
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
        androidx.compose.runtime.c0 c0VarD = y7.d(c0VarR);
        y7.n(c0VarD, a1VarE, aVar.e());
        y7.n(c0VarD, b1VarK, aVar.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar.f());
        y5 y5Var = y5.f16577a;
        c0VarR.E(-1981853813);
        for (BottomBarUiState.BottomBarButton bottomBarButton : buttons) {
            if (Intrinsics.areEqual(bottomBarButton, BottomBarUiState.BottomBarButton.GifInsert.INSTANCE)) {
                c0VarR.E(1310963612);
                BottomBarIcon(R.drawable.intercom_ic_gif_input, z11, function3, c0VarR, (i10 >> 3) & 1008, 0);
                c0VarR.A();
            } else if (Intrinsics.areEqual(bottomBarButton, BottomBarUiState.BottomBarButton.VoiceNotesInsert.INSTANCE)) {
                c0VarR.E(1311270450);
                BottomBarIcon(io.intercom.android.sdk.ui.R.drawable.intercom_ic_microphone, z11, function5, c0VarR, ((i10 >> 9) & 896) | ((i10 >> 3) & com.planner5d.library.engine.input.f.b.B), 0);
                c0VarR.A();
            } else {
                if (!Intrinsics.areEqual(bottomBarButton, BottomBarUiState.BottomBarButton.MediaInsert.INSTANCE)) {
                    c0VarR.E(1427760810);
                    c0VarR.A();
                    throw new kotlin.k0();
                }
                c0VarR.E(1311581535);
                BottomBarIcon(R.drawable.intercom_ic_plus, z11, function4, c0VarR, ((i10 >> 6) & 896) | ((i10 >> 3) & com.planner5d.library.engine.input.f.b.B), 0);
                c0VarR.A();
            }
        }
        c0VarR.A();
        c0VarR.o();
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.a0 a0Var2 = a0Var;
            final boolean z12 = z11;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BottomBarButtonComponentKt.BottomBarButtonComponent$lambda$5(a0Var2, buttons, z12, function3, function4, function5, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBarButtonComponent$lambda$5(androidx.compose.ui.a0 a0Var, List buttons, boolean z10, Function0 function0, Function0 function1, Function0 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(buttons, "$buttons");
        BottomBarButtonComponent(a0Var, buttons, z10, function0, function1, function2, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void BottomBarButtonComponentPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-179036889);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BottomBarButtonComponentKt.INSTANCE.m235getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BottomBarButtonComponentKt.BottomBarButtonComponentPreview$lambda$8(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBarButtonComponentPreview$lambda$8(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        BottomBarButtonComponentPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void BottomBarButtonComponentPreviewGifOnly(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1619387831);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BottomBarButtonComponentKt.INSTANCE.m237getLambda4$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BottomBarButtonComponentKt.BottomBarButtonComponentPreviewGifOnly$lambda$9(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBarButtonComponentPreviewGifOnly$lambda$9(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        BottomBarButtonComponentPreviewGifOnly(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void BottomBarButtonComponentPreviewMediaOnly(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1269009367);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BottomBarButtonComponentKt.INSTANCE.m239getLambda6$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BottomBarButtonComponentKt.BottomBarButtonComponentPreviewMediaOnly$lambda$10(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBarButtonComponentPreviewMediaOnly$lambda$10(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        BottomBarButtonComponentPreviewMediaOnly(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0041  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:42:0x006c  */
    /* JADX WARN: Code duplicated, block: B:44:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:0x0074  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void BottomBarIcon(@androidx.annotation.v final int i10, boolean z10, Function0<Unit> function0, androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        int i13;
        final boolean z11;
        int i14;
        Function0<Unit> function1;
        int i15;
        boolean z12;
        final Function0<Unit> function2;
        s5 s5VarT;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1211476790);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (c0VarR.K(i10) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i16 = i12 & 2;
        if (i16 == 0) {
            if ((i11 & com.planner5d.library.engine.input.f.b.B) == 0) {
                z11 = z10;
                i13 |= c0VarR.G(z11) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & 896) == 0) {
                    function1 = function0;
                    if (c0VarR.k0(function1)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                if ((i13 & 731) == 146 || !c0VarR.d()) {
                    if (i16 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i14 != 0) {
                        function1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    }
                    ei.D(function1, null, z12, null, null, null, androidx.compose.runtime.internal.w.e(2035069272, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.BottomBarButtonComponentKt.BottomBarIcon.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var2, Integer num) {
                            invoke(c0Var2, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var2, int i17) {
                            if ((i17 & 11) == 2 && c0Var2.d()) {
                                c0Var2.u();
                                return;
                            }
                            ni.o(u0.e.c(i10, c0Var2, 0), null, i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var2, IntercomTheme.$stable).m699getDescriptionText0d7_KjU(), c0Var2, 440, 0);
                        }
                    }, c0VarR, 54), c0VarR, ((i13 >> 6) & 14) | 1572864 | ((i13 << 3) & 896), 58);
                    z11 = z12;
                } else {
                    c0VarR.u();
                }
                function2 = function1;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.g
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return BottomBarButtonComponentKt.BottomBarIcon$lambda$7(i10, z11, function2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= a5.S0;
            function1 = function0;
            if ((i13 & 731) == 146) {
                if (i16 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i14 != 0) {
                    function1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                }
                ei.D(function1, null, z12, null, null, null, androidx.compose.runtime.internal.w.e(2035069272, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.BottomBarButtonComponentKt.BottomBarIcon.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var2, Integer num) {
                        invoke(c0Var2, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var2, int i17) {
                        if ((i17 & 11) == 2 && c0Var2.d()) {
                            c0Var2.u();
                            return;
                        }
                        ni.o(u0.e.c(i10, c0Var2, 0), null, i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var2, IntercomTheme.$stable).m699getDescriptionText0d7_KjU(), c0Var2, 440, 0);
                    }
                }, c0VarR, 54), c0VarR, ((i13 >> 6) & 14) | 1572864 | ((i13 << 3) & 896), 58);
                z11 = z12;
            } else {
                if (i16 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i14 != 0) {
                    function1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                }
                ei.D(function1, null, z12, null, null, null, androidx.compose.runtime.internal.w.e(2035069272, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.BottomBarButtonComponentKt.BottomBarIcon.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var2, Integer num) {
                        invoke(c0Var2, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var2, int i17) {
                        if ((i17 & 11) == 2 && c0Var2.d()) {
                            c0Var2.u();
                            return;
                        }
                        ni.o(u0.e.c(i10, c0Var2, 0), null, i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var2, IntercomTheme.$stable).m699getDescriptionText0d7_KjU(), c0Var2, 440, 0);
                    }
                }, c0VarR, 54), c0VarR, ((i13 >> 6) & 14) | 1572864 | ((i13 << 3) & 896), 58);
                z11 = z12;
            }
            function2 = function1;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.g
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BottomBarButtonComponentKt.BottomBarIcon$lambda$7(i10, z11, function2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        z11 = z10;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & 896) == 0) {
                function1 = function0;
                if (c0VarR.k0(function1)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            if ((i13 & 731) == 146) {
                if (i16 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i14 != 0) {
                    function1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                }
                ei.D(function1, null, z12, null, null, null, androidx.compose.runtime.internal.w.e(2035069272, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.BottomBarButtonComponentKt.BottomBarIcon.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var2, Integer num) {
                        invoke(c0Var2, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var2, int i17) {
                        if ((i17 & 11) == 2 && c0Var2.d()) {
                            c0Var2.u();
                            return;
                        }
                        ni.o(u0.e.c(i10, c0Var2, 0), null, i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var2, IntercomTheme.$stable).m699getDescriptionText0d7_KjU(), c0Var2, 440, 0);
                    }
                }, c0VarR, 54), c0VarR, ((i13 >> 6) & 14) | 1572864 | ((i13 << 3) & 896), 58);
                z11 = z12;
            } else {
                if (i16 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i14 != 0) {
                    function1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                }
                ei.D(function1, null, z12, null, null, null, androidx.compose.runtime.internal.w.e(2035069272, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.BottomBarButtonComponentKt.BottomBarIcon.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var2, Integer num) {
                        invoke(c0Var2, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var2, int i17) {
                        if ((i17 & 11) == 2 && c0Var2.d()) {
                            c0Var2.u();
                            return;
                        }
                        ni.o(u0.e.c(i10, c0Var2, 0), null, i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var2, IntercomTheme.$stable).m699getDescriptionText0d7_KjU(), c0Var2, 440, 0);
                    }
                }, c0VarR, 54), c0VarR, ((i13 >> 6) & 14) | 1572864 | ((i13 << 3) & 896), 58);
                z11 = z12;
            }
            function2 = function1;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.g
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BottomBarButtonComponentKt.BottomBarIcon$lambda$7(i10, z11, function2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= a5.S0;
        function1 = function0;
        if ((i13 & 731) == 146) {
            if (i16 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (i14 != 0) {
                function1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.f312394a;
                    }
                };
            }
            ei.D(function1, null, z12, null, null, null, androidx.compose.runtime.internal.w.e(2035069272, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.BottomBarButtonComponentKt.BottomBarIcon.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var2, Integer num) {
                    invoke(c0Var2, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var2, int i17) {
                    if ((i17 & 11) == 2 && c0Var2.d()) {
                        c0Var2.u();
                        return;
                    }
                    ni.o(u0.e.c(i10, c0Var2, 0), null, i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var2, IntercomTheme.$stable).m699getDescriptionText0d7_KjU(), c0Var2, 440, 0);
                }
            }, c0VarR, 54), c0VarR, ((i13 >> 6) & 14) | 1572864 | ((i13 << 3) & 896), 58);
            z11 = z12;
        } else {
            if (i16 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (i14 != 0) {
                function1 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.f312394a;
                    }
                };
            }
            ei.D(function1, null, z12, null, null, null, androidx.compose.runtime.internal.w.e(2035069272, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.BottomBarButtonComponentKt.BottomBarIcon.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var2, Integer num) {
                    invoke(c0Var2, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var2, int i17) {
                    if ((i17 & 11) == 2 && c0Var2.d()) {
                        c0Var2.u();
                        return;
                    }
                    ni.o(u0.e.c(i10, c0Var2, 0), null, i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var2, IntercomTheme.$stable).m699getDescriptionText0d7_KjU(), c0Var2, 440, 0);
                }
            }, c0VarR, 54), c0VarR, ((i13 >> 6) & 14) | 1572864 | ((i13 << 3) & 896), 58);
            z11 = z12;
        }
        function2 = function1;
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BottomBarButtonComponentKt.BottomBarIcon$lambda$7(i10, z11, function2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBarIcon$lambda$7(int i10, boolean z10, Function0 function0, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        BottomBarIcon(i10, z10, function0, c0Var, t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }
}
