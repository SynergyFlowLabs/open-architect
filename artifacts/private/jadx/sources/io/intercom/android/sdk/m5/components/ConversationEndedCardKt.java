package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.material3.e4;
import androidx.compose.material3.m4;
import androidx.compose.material3.q50;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.platform.c4;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class ConversationEndedCardKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.ConversationEndedCardKt$ConversationEndedCard$1, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nConversationEndedCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationEndedCard.kt\nio/intercom/android/sdk/m5/components/ConversationEndedCardKt$ConversationEndedCard$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,124:1\n113#2:125\n113#2:159\n87#3,6:126\n94#3:163\n80#4,6:132\n87#4,3:147\n90#4,2:156\n94#4:162\n391#5,9:138\n400#5:158\n401#5,2:160\n4360#6,6:150\n*S KotlinDebug\n*F\n+ 1 ConversationEndedCard.kt\nio/intercom/android/sdk/m5/components/ConversationEndedCardKt$ConversationEndedCard$1\n*L\n40#1:125\n49#1:159\n37#1:126,6\n37#1:163\n37#1:132,6\n37#1:147,3\n37#1:156,2\n37#1:162\n37#1:138,9\n37#1:158\n37#1:160,2\n37#1:150,6\n*E\n"})
    static final class AnonymousClass1 implements pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> {
        final /* synthetic */ ComposerState.ConversationEnded $conversationEndedUiState;
        final /* synthetic */ Function0<Unit> $onButtonClick;

        AnonymousClass1(ComposerState.ConversationEnded conversationEnded, Function0<Unit> function0) {
            this.$conversationEndedUiState = conversationEnded;
            this.$onButtonClick = function0;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.m0 m0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(m0Var, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(androidx.compose.foundation.layout.m0 Card, androidx.compose.runtime.c0 c0Var, int i10) {
            Intrinsics.checkNotNullParameter(Card, "$this$Card");
            if ((i10 & 81) == 16 && c0Var.d()) {
                c0Var.u();
                return;
            }
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarR = d5.r(i6.h(aVar, 0.0f, 1, null), androidx.compose.ui.unit.h.r(20));
            androidx.compose.foundation.layout.q.f fVarM = androidx.compose.foundation.layout.q.f16330a.m();
            androidx.compose.ui.e.b bVarM = androidx.compose.ui.e.f37317a.m();
            ComposerState.ConversationEnded conversationEnded = this.$conversationEndedUiState;
            Function0<Unit> function0 = this.$onButtonClick;
            androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(fVarM, bVarM, c0Var, 54);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarR);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
            if (c0Var.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A);
            } else {
                c0Var.l();
            }
            androidx.compose.runtime.c0 c0VarD = y7.d(c0Var);
            y7.n(c0VarD, a1VarB, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
            StringProvider message = conversationEnded.getMessage();
            int i11 = StringProvider.$stable;
            q50.t(message.getText(c0Var, i11), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var, IntercomTheme.$stable).getType04(), c0Var, 0, 0, 131070);
            c0Var.E(-1044601143);
            if (conversationEnded.getCta() != null) {
                l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(12)), c0Var, 6);
                IntercomPrimaryButtonKt.IntercomPrimaryButton(conversationEnded.getCta().getTitle().getText(c0Var, i11), c4.a(aVar, "start-new-conversation-button"), Integer.valueOf(conversationEnded.getCta().getTrailingIcon()), function0 == null ? new Function0() { // from class: io.intercom.android.sdk.m5.components.p0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.f312394a;
                    }
                } : function0, c0Var, 48, 0);
            }
            c0Var.A();
            c0Var.o();
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x00de  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ConversationEndedCard(@Nullable androidx.compose.ui.a0 a0Var, @Nullable Function0<Unit> function0, @NotNull final ComposerState.ConversationEnded conversationEndedUiState, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        final androidx.compose.ui.a0 a0Var2;
        int i12;
        Function0<Unit> function1;
        int i13;
        androidx.compose.ui.a0 a0Var3;
        final Function0<Unit> function2;
        androidx.compose.runtime.c0 c0Var2;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(conversationEndedUiState, "conversationEndedUiState");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-517544614);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
            a0Var2 = a0Var;
        } else if ((i10 & 14) == 0) {
            a0Var2 = a0Var;
            i12 = (c0VarR.D(a0Var2) ? 4 : 2) | i10;
        } else {
            a0Var2 = a0Var;
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 == 0) {
            if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
                function1 = function0;
                i12 |= c0VarR.k0(function1) ? 32 : 16;
            }
            if ((i11 & 4) != 0) {
                i12 |= a5.S0;
            } else if ((i10 & 896) == 0) {
                if (c0VarR.D(conversationEndedUiState)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i12 |= i13;
            }
            if ((i12 & 731) == 146 || !c0VarR.d()) {
                if (i14 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i15 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                c0Var2 = c0VarR;
                m4.g(i6.h(a0Var3, 0.0f, 1, null), androidx.compose.ui.graphics.d3.a(), e4.f27241a.b(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m690getBackground0d7_KjU(), 0L, 0L, 0L, c0Var2, e4.f27242b << 12, 14), null, null, androidx.compose.runtime.internal.w.e(-676087732, true, new AnonymousClass1(conversationEndedUiState, function2), c0Var2, 54), c0Var2, 196656, 24);
                a0Var2 = a0Var3;
            } else {
                c0VarR.u();
                function2 = function1;
                c0Var2 = c0VarR;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.n0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ConversationEndedCardKt.ConversationEndedCard$lambda$0(a0Var2, function2, conversationEndedUiState, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        function1 = function0;
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & 896) == 0) {
            if (c0VarR.D(conversationEndedUiState)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146) {
            if (i14 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i15 != 0) {
                function2 = null;
            } else {
                function2 = function1;
            }
            c0Var2 = c0VarR;
            m4.g(i6.h(a0Var3, 0.0f, 1, null), androidx.compose.ui.graphics.d3.a(), e4.f27241a.b(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m690getBackground0d7_KjU(), 0L, 0L, 0L, c0Var2, e4.f27242b << 12, 14), null, null, androidx.compose.runtime.internal.w.e(-676087732, true, new AnonymousClass1(conversationEndedUiState, function2), c0Var2, 54), c0Var2, 196656, 24);
            a0Var2 = a0Var3;
        } else {
            if (i14 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i15 != 0) {
                function2 = null;
            } else {
                function2 = function1;
            }
            c0Var2 = c0VarR;
            m4.g(i6.h(a0Var3, 0.0f, 1, null), androidx.compose.ui.graphics.d3.a(), e4.f27241a.b(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m690getBackground0d7_KjU(), 0L, 0L, 0L, c0Var2, e4.f27242b << 12, 14), null, null, androidx.compose.runtime.internal.w.e(-676087732, true, new AnonymousClass1(conversationEndedUiState, function2), c0Var2, 54), c0Var2, 196656, 24);
            a0Var2 = a0Var3;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.n0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConversationEndedCardKt.ConversationEndedCard$lambda$0(a0Var2, function2, conversationEndedUiState, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationEndedCard$lambda$0(androidx.compose.ui.a0 a0Var, Function0 function0, ComposerState.ConversationEnded conversationEndedUiState, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(conversationEndedUiState, "$conversationEndedUiState");
        ConversationEndedCard(a0Var, function0, conversationEndedUiState, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void ConversationEndedCardPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-172245026);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationEndedCardKt.INSTANCE.m111getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.m0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConversationEndedCardKt.ConversationEndedCardPreview$lambda$1(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationEndedCardPreview$lambda$1(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        ConversationEndedCardPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void ConversationEndedCardWithButtonBotPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-317527071);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationEndedCardKt.INSTANCE.m113getLambda3$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.k0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConversationEndedCardKt.ConversationEndedCardWithButtonBotPreview$lambda$3(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationEndedCardWithButtonBotPreview$lambda$3(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        ConversationEndedCardWithButtonBotPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void ConversationEndedCardWithButtonPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1576691098);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationEndedCardKt.INSTANCE.m112getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.o0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConversationEndedCardKt.ConversationEndedCardWithButtonPreview$lambda$2(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationEndedCardWithButtonPreview$lambda$2(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        ConversationEndedCardWithButtonPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void ConversationMergedCardPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-233275222);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationEndedCardKt.INSTANCE.m114getLambda4$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.l0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConversationEndedCardKt.ConversationMergedCardPreview$lambda$4(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationMergedCardPreview$lambda$4(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        ConversationMergedCardPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
