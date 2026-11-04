package io.intercom.android.sdk.m5.helpcenter.ui.components;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.s4;
import androidx.compose.material3.q50;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.graphics.k2;
import androidx.compose.ui.graphics.s0;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.y3;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.m5.ConversationScreenOpenerKt;
import io.intercom.android.sdk.m5.components.IntercomPrimaryButtonKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomButton;
import io.intercom.android.sdk.ui.component.IntercomButtonKt;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.extension.ModifierExtensionsKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nTeamPresenceComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TeamPresenceComponent.kt\nio/intercom/android/sdk/m5/helpcenter/ui/components/TeamPresenceComponentKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 11 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 12 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 13 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 14 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,235:1\n75#2:236\n75#2:283\n113#3:237\n113#3:275\n113#3:276\n113#3:278\n113#3:284\n113#3:324\n113#3:332\n113#3:333\n113#3:334\n87#4:238\n84#4,9:239\n94#4:282\n87#4:285\n83#4,10:286\n94#4:385\n80#5,6:248\n87#5,3:263\n90#5,2:272\n94#5:281\n80#5,6:296\n87#5,3:311\n90#5,2:320\n80#5,6:351\n87#5,3:366\n90#5,2:375\n94#5:380\n94#5:384\n391#6,9:254\n400#6:274\n401#6,2:279\n391#6,9:302\n400#6:322\n391#6,9:357\n400#6,3:377\n401#6,2:382\n4360#7,6:266\n4360#7,6:314\n4360#7,6:369\n1#8:277\n58#9:323\n52#9:325\n1282#10,6:326\n1282#10,6:335\n70#11:341\n67#11,9:342\n77#11:381\n61#12:386\n57#12:389\n61#12:392\n57#12:394\n61#12:397\n70#13:387\n60#13:390\n70#13:393\n60#13:395\n70#13:398\n22#14:388\n22#14:391\n22#14:396\n*S KotlinDebug\n*F\n+ 1 TeamPresenceComponent.kt\nio/intercom/android/sdk/m5/helpcenter/ui/components/TeamPresenceComponentKt\n*L\n58#1:236\n174#1:283\n84#1:237\n90#1:275\n91#1:276\n123#1:278\n175#1:284\n181#1:324\n192#1:332\n197#1:333\n198#1:334\n81#1:238\n81#1:239,9\n81#1:282\n177#1:285\n177#1:286,10\n177#1:385\n81#1:248,6\n81#1:263,3\n81#1:272,2\n81#1:281\n177#1:296,6\n177#1:311,3\n177#1:320,2\n195#1:351,6\n195#1:366,3\n195#1:375,2\n195#1:380\n177#1:384\n81#1:254,9\n81#1:274\n81#1:279,2\n177#1:302,9\n177#1:322\n195#1:357,9\n195#1:377,3\n177#1:382,2\n81#1:266,6\n177#1:314,6\n195#1:369,6\n181#1:323\n181#1:325\n182#1:326,6\n199#1:335,6\n195#1:341\n195#1:342,9\n195#1:381\n184#1:386\n185#1:389\n185#1:392\n186#1:394\n186#1:397\n184#1:387\n185#1:390\n185#1:393\n186#1:395\n186#1:398\n184#1:388\n185#1:391\n186#1:396\n*E\n"})
public final class TeamPresenceComponentKt {

    @NotNull
    private static final ArticleViewState.TeamPresenceState mockTeamPresenceState;

    static {
        int i10 = R.string.intercom_the_team_can_help_if_needed;
        mockTeamPresenceState = new ArticleViewState.TeamPresenceState(null, null, Integer.valueOf(i10), R.string.intercom_send_us_a_message, R.drawable.intercom_new_conversation_send_button, -16777216, "article", MetricTracker.Context.STYLE_HUMAN, false, new OpenMessengerResponse.NewConversationData.Cta("Send us a message", "The team can help if needed", OpenMessengerResponse.IconType.PAPER_PLANE));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:57:0x0106  */
    /* JADX WARN: Code duplicated, block: B:59:0x0114  */
    /* JADX WARN: Code duplicated, block: B:62:0x0134  */
    /* JADX WARN: Code duplicated, block: B:65:0x0174  */
    /* JADX WARN: Code duplicated, block: B:66:0x0176  */
    /* JADX WARN: Code duplicated, block: B:69:0x0187  */
    /* JADX WARN: Code duplicated, block: B:72:0x019e  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:83:0x0242  */
    /* JADX WARN: Code duplicated, block: B:84:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:88:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TeamPresenceComponent(@NotNull final ArticleViewState.TeamPresenceState teamPresenceState, boolean z10, @Nullable TeamPresenceButtonStyle teamPresenceButtonStyle, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        boolean z11;
        int i13;
        TeamPresenceButtonStyle teamPresenceButtonStyle2;
        int i14;
        final boolean z12;
        TeamPresenceButtonStyle teamPresenceButtonStyle3;
        final Context context;
        androidx.compose.ui.a0.a aVar;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        String strD;
        Integer numValueOf;
        Integer subtitleText;
        String strD2;
        String str;
        Integer num;
        androidx.compose.ui.a0.a aVar2;
        androidx.compose.runtime.c0 c0Var2;
        TeamPresenceButtonStyle teamPresenceButtonStyle4;
        final TeamPresenceButtonStyle teamPresenceButtonStyle5;
        Integer icon;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(teamPresenceState, "teamPresenceState");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-696298916);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.D(teamPresenceState) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 == 0) {
            if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
                z11 = z10;
                i12 |= c0VarR.G(z11) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    teamPresenceButtonStyle2 = teamPresenceButtonStyle;
                    if (c0VarR.D(teamPresenceButtonStyle2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i12 & 731) == 146 || !c0VarR.d()) {
                    if (i15 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i13 != 0) {
                        teamPresenceButtonStyle3 = TeamPresenceButtonStyle.SECONDARY;
                    } else {
                        teamPresenceButtonStyle3 = teamPresenceButtonStyle2;
                    }
                    context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                    aVar = androidx.compose.ui.a0.E;
                    androidx.compose.ui.a0 a0VarT = d5.t(i6.h(aVar, 0.0f, 1, null), 0.0f, androidx.compose.ui.unit.h.r(24), 1, null);
                    a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.m(), c0VarR, 48);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarT);
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
                    y7.n(c0VarD, a1VarB, aVar3.e());
                    y7.n(c0VarD, b1VarK, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN, aVar3.f());
                    androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
                    c0VarR.E(-937558243);
                    if (z12) {
                        IntercomDividerKt.IntercomDivider(d5.v(i6.B(aVar, androidx.compose.ui.unit.h.r(100)), 0.0f, 0.0f, 0.0f, androidx.compose.ui.unit.h.r(16), 7, null), c0VarR, 6, 0);
                    }
                    c0VarR.A();
                    strD = u0.i.d(teamPresenceState.getMessageButtonText(), c0VarR, 0);
                    numValueOf = Integer.valueOf(teamPresenceState.getMessageButtonIcon());
                    subtitleText = teamPresenceState.getSubtitleText();
                    c0VarR.E(-937545761);
                    if (subtitleText == null) {
                        strD2 = null;
                    } else {
                        strD2 = u0.i.d(subtitleText.intValue(), c0VarR, 0);
                    }
                    c0VarR.A();
                    if (teamPresenceState.getCtaData() != null) {
                        strD = teamPresenceState.getCtaData().getText();
                        icon = teamPresenceState.getCtaData().getIcon().getIcon();
                        if (icon != null) {
                            numValueOf = icon;
                        }
                        strD2 = teamPresenceState.getCtaData().getSubtitle();
                    }
                    str = strD2;
                    num = numValueOf;
                    c0VarR.E(-937533382);
                    if (teamPresenceState.getConversationState() != null) {
                        strD = u0.i.d(teamPresenceState.getConversationState().getMessageButtonText(), c0VarR, 0);
                    }
                    c0VarR.A();
                    if (teamPresenceButtonStyle3 == TeamPresenceButtonStyle.PRIMARY) {
                        c0VarR.E(1001451744);
                        IntercomPrimaryButtonKt.IntercomPrimaryButton(strD, null, num, new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.l0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TeamPresenceComponentKt.TeamPresenceComponent$lambda$3$lambda$1(teamPresenceState, context);
                            }
                        }, c0VarR, 0, 2);
                        c0Var2 = c0VarR;
                        c0Var2.A();
                        aVar2 = aVar;
                    } else {
                        c0VarR.E(1001651663);
                        aVar2 = aVar;
                        IntercomButtonKt.IntercomButton(null, IntercomButton.INSTANCE.m588outlinedStyleKlgxPg(0L, 0L, null, c0VarR, IntercomButton.$stable << 9, 7), strD, num, new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.m0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TeamPresenceComponentKt.TeamPresenceComponent$lambda$3$lambda$2(teamPresenceState, context);
                            }
                        }, c0VarR, IntercomButton.Style.$stable << 3, 1);
                        c0Var2 = c0VarR;
                        c0Var2.A();
                    }
                    l6.a(i6.i(aVar2, androidx.compose.ui.unit.h.r(16)), c0Var2, 6);
                    c0Var2.E(-937510359);
                    if (str != null) {
                        androidx.compose.runtime.c0 c0Var3 = c0Var2;
                        teamPresenceButtonStyle4 = teamPresenceButtonStyle3;
                        q50.t(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0Var2, IntercomTheme.$stable).getType04Point5(), s0.d(4285887861L), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0Var3, 0, 0, 131070);
                        c0Var2 = c0Var3;
                    } else {
                        teamPresenceButtonStyle4 = teamPresenceButtonStyle3;
                    }
                    c0Var2.A();
                    c0Var2.o();
                    teamPresenceButtonStyle5 = teamPresenceButtonStyle4;
                } else {
                    c0VarR.u();
                    z12 = z11;
                    teamPresenceButtonStyle5 = teamPresenceButtonStyle2;
                    c0Var2 = c0VarR;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.n0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TeamPresenceComponentKt.TeamPresenceComponent$lambda$4(teamPresenceState, z12, teamPresenceButtonStyle5, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= a5.S0;
            teamPresenceButtonStyle2 = teamPresenceButtonStyle;
            if ((i12 & 731) == 146) {
                if (i15 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i13 != 0) {
                    teamPresenceButtonStyle3 = TeamPresenceButtonStyle.SECONDARY;
                } else {
                    teamPresenceButtonStyle3 = teamPresenceButtonStyle2;
                }
                context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                aVar = androidx.compose.ui.a0.E;
                androidx.compose.ui.a0 a0VarT2 = d5.t(i6.h(aVar, 0.0f, 1, null), 0.0f, androidx.compose.ui.unit.h.r(24), 1, null);
                a1 a1VarB2 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.m(), c0VarR, 48);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK2 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarT2);
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
                y7.n(c0VarD, a1VarB2, aVar4.e());
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
                androidx.compose.foundation.layout.n0 n0Var2 = androidx.compose.foundation.layout.n0.f16227a;
                c0VarR.E(-937558243);
                if (z12) {
                    IntercomDividerKt.IntercomDivider(d5.v(i6.B(aVar, androidx.compose.ui.unit.h.r(100)), 0.0f, 0.0f, 0.0f, androidx.compose.ui.unit.h.r(16), 7, null), c0VarR, 6, 0);
                }
                c0VarR.A();
                strD = u0.i.d(teamPresenceState.getMessageButtonText(), c0VarR, 0);
                numValueOf = Integer.valueOf(teamPresenceState.getMessageButtonIcon());
                subtitleText = teamPresenceState.getSubtitleText();
                c0VarR.E(-937545761);
                if (subtitleText == null) {
                    strD2 = null;
                } else {
                    strD2 = u0.i.d(subtitleText.intValue(), c0VarR, 0);
                }
                c0VarR.A();
                if (teamPresenceState.getCtaData() != null) {
                    strD = teamPresenceState.getCtaData().getText();
                    icon = teamPresenceState.getCtaData().getIcon().getIcon();
                    if (icon != null) {
                        numValueOf = icon;
                    }
                    strD2 = teamPresenceState.getCtaData().getSubtitle();
                }
                str = strD2;
                num = numValueOf;
                c0VarR.E(-937533382);
                if (teamPresenceState.getConversationState() != null) {
                    strD = u0.i.d(teamPresenceState.getConversationState().getMessageButtonText(), c0VarR, 0);
                }
                c0VarR.A();
                if (teamPresenceButtonStyle3 == TeamPresenceButtonStyle.PRIMARY) {
                    c0VarR.E(1001451744);
                    IntercomPrimaryButtonKt.IntercomPrimaryButton(strD, null, num, new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.l0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TeamPresenceComponentKt.TeamPresenceComponent$lambda$3$lambda$1(teamPresenceState, context);
                        }
                    }, c0VarR, 0, 2);
                    c0Var2 = c0VarR;
                    c0Var2.A();
                    aVar2 = aVar;
                } else {
                    c0VarR.E(1001651663);
                    aVar2 = aVar;
                    IntercomButtonKt.IntercomButton(null, IntercomButton.INSTANCE.m588outlinedStyleKlgxPg(0L, 0L, null, c0VarR, IntercomButton.$stable << 9, 7), strD, num, new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.m0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TeamPresenceComponentKt.TeamPresenceComponent$lambda$3$lambda$2(teamPresenceState, context);
                        }
                    }, c0VarR, IntercomButton.Style.$stable << 3, 1);
                    c0Var2 = c0VarR;
                    c0Var2.A();
                }
                l6.a(i6.i(aVar2, androidx.compose.ui.unit.h.r(16)), c0Var2, 6);
                c0Var2.E(-937510359);
                if (str != null) {
                    androidx.compose.runtime.c0 c0Var4 = c0Var2;
                    teamPresenceButtonStyle4 = teamPresenceButtonStyle3;
                    q50.t(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0Var2, IntercomTheme.$stable).getType04Point5(), s0.d(4285887861L), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0Var4, 0, 0, 131070);
                    c0Var2 = c0Var4;
                } else {
                    teamPresenceButtonStyle4 = teamPresenceButtonStyle3;
                }
                c0Var2.A();
                c0Var2.o();
                teamPresenceButtonStyle5 = teamPresenceButtonStyle4;
            } else {
                if (i15 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i13 != 0) {
                    teamPresenceButtonStyle3 = TeamPresenceButtonStyle.SECONDARY;
                } else {
                    teamPresenceButtonStyle3 = teamPresenceButtonStyle2;
                }
                context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                aVar = androidx.compose.ui.a0.E;
                androidx.compose.ui.a0 a0VarT3 = d5.t(i6.h(aVar, 0.0f, 1, null), 0.0f, androidx.compose.ui.unit.h.r(24), 1, null);
                a1 a1VarB3 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.m(), c0VarR, 48);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK3 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarT3);
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
                y7.n(c0VarD, a1VarB3, aVar5.e());
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
                androidx.compose.foundation.layout.n0 n0Var3 = androidx.compose.foundation.layout.n0.f16227a;
                c0VarR.E(-937558243);
                if (z12) {
                    IntercomDividerKt.IntercomDivider(d5.v(i6.B(aVar, androidx.compose.ui.unit.h.r(100)), 0.0f, 0.0f, 0.0f, androidx.compose.ui.unit.h.r(16), 7, null), c0VarR, 6, 0);
                }
                c0VarR.A();
                strD = u0.i.d(teamPresenceState.getMessageButtonText(), c0VarR, 0);
                numValueOf = Integer.valueOf(teamPresenceState.getMessageButtonIcon());
                subtitleText = teamPresenceState.getSubtitleText();
                c0VarR.E(-937545761);
                if (subtitleText == null) {
                    strD2 = null;
                } else {
                    strD2 = u0.i.d(subtitleText.intValue(), c0VarR, 0);
                }
                c0VarR.A();
                if (teamPresenceState.getCtaData() != null) {
                    strD = teamPresenceState.getCtaData().getText();
                    icon = teamPresenceState.getCtaData().getIcon().getIcon();
                    if (icon != null) {
                        numValueOf = icon;
                    }
                    strD2 = teamPresenceState.getCtaData().getSubtitle();
                }
                str = strD2;
                num = numValueOf;
                c0VarR.E(-937533382);
                if (teamPresenceState.getConversationState() != null) {
                    strD = u0.i.d(teamPresenceState.getConversationState().getMessageButtonText(), c0VarR, 0);
                }
                c0VarR.A();
                if (teamPresenceButtonStyle3 == TeamPresenceButtonStyle.PRIMARY) {
                    c0VarR.E(1001451744);
                    IntercomPrimaryButtonKt.IntercomPrimaryButton(strD, null, num, new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.l0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TeamPresenceComponentKt.TeamPresenceComponent$lambda$3$lambda$1(teamPresenceState, context);
                        }
                    }, c0VarR, 0, 2);
                    c0Var2 = c0VarR;
                    c0Var2.A();
                    aVar2 = aVar;
                } else {
                    c0VarR.E(1001651663);
                    aVar2 = aVar;
                    IntercomButtonKt.IntercomButton(null, IntercomButton.INSTANCE.m588outlinedStyleKlgxPg(0L, 0L, null, c0VarR, IntercomButton.$stable << 9, 7), strD, num, new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.m0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TeamPresenceComponentKt.TeamPresenceComponent$lambda$3$lambda$2(teamPresenceState, context);
                        }
                    }, c0VarR, IntercomButton.Style.$stable << 3, 1);
                    c0Var2 = c0VarR;
                    c0Var2.A();
                }
                l6.a(i6.i(aVar2, androidx.compose.ui.unit.h.r(16)), c0Var2, 6);
                c0Var2.E(-937510359);
                if (str != null) {
                    androidx.compose.runtime.c0 c0Var5 = c0Var2;
                    teamPresenceButtonStyle4 = teamPresenceButtonStyle3;
                    q50.t(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0Var2, IntercomTheme.$stable).getType04Point5(), s0.d(4285887861L), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0Var5, 0, 0, 131070);
                    c0Var2 = c0Var5;
                } else {
                    teamPresenceButtonStyle4 = teamPresenceButtonStyle3;
                }
                c0Var2.A();
                c0Var2.o();
                teamPresenceButtonStyle5 = teamPresenceButtonStyle4;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.n0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TeamPresenceComponentKt.TeamPresenceComponent$lambda$4(teamPresenceState, z12, teamPresenceButtonStyle5, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        z11 = z10;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                teamPresenceButtonStyle2 = teamPresenceButtonStyle;
                if (c0VarR.D(teamPresenceButtonStyle2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i12 & 731) == 146) {
                if (i15 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i13 != 0) {
                    teamPresenceButtonStyle3 = TeamPresenceButtonStyle.SECONDARY;
                } else {
                    teamPresenceButtonStyle3 = teamPresenceButtonStyle2;
                }
                context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                aVar = androidx.compose.ui.a0.E;
                androidx.compose.ui.a0 a0VarT4 = d5.t(i6.h(aVar, 0.0f, 1, null), 0.0f, androidx.compose.ui.unit.h.r(24), 1, null);
                a1 a1VarB4 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.m(), c0VarR, 48);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK4 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarT4);
                androidx.compose.ui.node.g.a aVar6 = androidx.compose.ui.node.g.I;
                function0A = aVar6.a();
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
                y7.n(c0VarD, a1VarB4, aVar6.e());
                y7.n(c0VarD, b1VarK4, aVar6.g());
                function2B = aVar6.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN4, aVar6.f());
                androidx.compose.foundation.layout.n0 n0Var4 = androidx.compose.foundation.layout.n0.f16227a;
                c0VarR.E(-937558243);
                if (z12) {
                    IntercomDividerKt.IntercomDivider(d5.v(i6.B(aVar, androidx.compose.ui.unit.h.r(100)), 0.0f, 0.0f, 0.0f, androidx.compose.ui.unit.h.r(16), 7, null), c0VarR, 6, 0);
                }
                c0VarR.A();
                strD = u0.i.d(teamPresenceState.getMessageButtonText(), c0VarR, 0);
                numValueOf = Integer.valueOf(teamPresenceState.getMessageButtonIcon());
                subtitleText = teamPresenceState.getSubtitleText();
                c0VarR.E(-937545761);
                if (subtitleText == null) {
                    strD2 = null;
                } else {
                    strD2 = u0.i.d(subtitleText.intValue(), c0VarR, 0);
                }
                c0VarR.A();
                if (teamPresenceState.getCtaData() != null) {
                    strD = teamPresenceState.getCtaData().getText();
                    icon = teamPresenceState.getCtaData().getIcon().getIcon();
                    if (icon != null) {
                        numValueOf = icon;
                    }
                    strD2 = teamPresenceState.getCtaData().getSubtitle();
                }
                str = strD2;
                num = numValueOf;
                c0VarR.E(-937533382);
                if (teamPresenceState.getConversationState() != null) {
                    strD = u0.i.d(teamPresenceState.getConversationState().getMessageButtonText(), c0VarR, 0);
                }
                c0VarR.A();
                if (teamPresenceButtonStyle3 == TeamPresenceButtonStyle.PRIMARY) {
                    c0VarR.E(1001451744);
                    IntercomPrimaryButtonKt.IntercomPrimaryButton(strD, null, num, new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.l0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TeamPresenceComponentKt.TeamPresenceComponent$lambda$3$lambda$1(teamPresenceState, context);
                        }
                    }, c0VarR, 0, 2);
                    c0Var2 = c0VarR;
                    c0Var2.A();
                    aVar2 = aVar;
                } else {
                    c0VarR.E(1001651663);
                    aVar2 = aVar;
                    IntercomButtonKt.IntercomButton(null, IntercomButton.INSTANCE.m588outlinedStyleKlgxPg(0L, 0L, null, c0VarR, IntercomButton.$stable << 9, 7), strD, num, new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.m0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TeamPresenceComponentKt.TeamPresenceComponent$lambda$3$lambda$2(teamPresenceState, context);
                        }
                    }, c0VarR, IntercomButton.Style.$stable << 3, 1);
                    c0Var2 = c0VarR;
                    c0Var2.A();
                }
                l6.a(i6.i(aVar2, androidx.compose.ui.unit.h.r(16)), c0Var2, 6);
                c0Var2.E(-937510359);
                if (str != null) {
                    androidx.compose.runtime.c0 c0Var6 = c0Var2;
                    teamPresenceButtonStyle4 = teamPresenceButtonStyle3;
                    q50.t(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0Var2, IntercomTheme.$stable).getType04Point5(), s0.d(4285887861L), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0Var6, 0, 0, 131070);
                    c0Var2 = c0Var6;
                } else {
                    teamPresenceButtonStyle4 = teamPresenceButtonStyle3;
                }
                c0Var2.A();
                c0Var2.o();
                teamPresenceButtonStyle5 = teamPresenceButtonStyle4;
            } else {
                if (i15 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i13 != 0) {
                    teamPresenceButtonStyle3 = TeamPresenceButtonStyle.SECONDARY;
                } else {
                    teamPresenceButtonStyle3 = teamPresenceButtonStyle2;
                }
                context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                aVar = androidx.compose.ui.a0.E;
                androidx.compose.ui.a0 a0VarT5 = d5.t(i6.h(aVar, 0.0f, 1, null), 0.0f, androidx.compose.ui.unit.h.r(24), 1, null);
                a1 a1VarB5 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.m(), c0VarR, 48);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK5 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0VarT5);
                androidx.compose.ui.node.g.a aVar7 = androidx.compose.ui.node.g.I;
                function0A = aVar7.a();
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
                y7.n(c0VarD, a1VarB5, aVar7.e());
                y7.n(c0VarD, b1VarK5, aVar7.g());
                function2B = aVar7.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN5, aVar7.f());
                androidx.compose.foundation.layout.n0 n0Var5 = androidx.compose.foundation.layout.n0.f16227a;
                c0VarR.E(-937558243);
                if (z12) {
                    IntercomDividerKt.IntercomDivider(d5.v(i6.B(aVar, androidx.compose.ui.unit.h.r(100)), 0.0f, 0.0f, 0.0f, androidx.compose.ui.unit.h.r(16), 7, null), c0VarR, 6, 0);
                }
                c0VarR.A();
                strD = u0.i.d(teamPresenceState.getMessageButtonText(), c0VarR, 0);
                numValueOf = Integer.valueOf(teamPresenceState.getMessageButtonIcon());
                subtitleText = teamPresenceState.getSubtitleText();
                c0VarR.E(-937545761);
                if (subtitleText == null) {
                    strD2 = null;
                } else {
                    strD2 = u0.i.d(subtitleText.intValue(), c0VarR, 0);
                }
                c0VarR.A();
                if (teamPresenceState.getCtaData() != null) {
                    strD = teamPresenceState.getCtaData().getText();
                    icon = teamPresenceState.getCtaData().getIcon().getIcon();
                    if (icon != null) {
                        numValueOf = icon;
                    }
                    strD2 = teamPresenceState.getCtaData().getSubtitle();
                }
                str = strD2;
                num = numValueOf;
                c0VarR.E(-937533382);
                if (teamPresenceState.getConversationState() != null) {
                    strD = u0.i.d(teamPresenceState.getConversationState().getMessageButtonText(), c0VarR, 0);
                }
                c0VarR.A();
                if (teamPresenceButtonStyle3 == TeamPresenceButtonStyle.PRIMARY) {
                    c0VarR.E(1001451744);
                    IntercomPrimaryButtonKt.IntercomPrimaryButton(strD, null, num, new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.l0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TeamPresenceComponentKt.TeamPresenceComponent$lambda$3$lambda$1(teamPresenceState, context);
                        }
                    }, c0VarR, 0, 2);
                    c0Var2 = c0VarR;
                    c0Var2.A();
                    aVar2 = aVar;
                } else {
                    c0VarR.E(1001651663);
                    aVar2 = aVar;
                    IntercomButtonKt.IntercomButton(null, IntercomButton.INSTANCE.m588outlinedStyleKlgxPg(0L, 0L, null, c0VarR, IntercomButton.$stable << 9, 7), strD, num, new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.m0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TeamPresenceComponentKt.TeamPresenceComponent$lambda$3$lambda$2(teamPresenceState, context);
                        }
                    }, c0VarR, IntercomButton.Style.$stable << 3, 1);
                    c0Var2 = c0VarR;
                    c0Var2.A();
                }
                l6.a(i6.i(aVar2, androidx.compose.ui.unit.h.r(16)), c0Var2, 6);
                c0Var2.E(-937510359);
                if (str != null) {
                    androidx.compose.runtime.c0 c0Var7 = c0Var2;
                    teamPresenceButtonStyle4 = teamPresenceButtonStyle3;
                    q50.t(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0Var2, IntercomTheme.$stable).getType04Point5(), s0.d(4285887861L), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0Var7, 0, 0, 131070);
                    c0Var2 = c0Var7;
                } else {
                    teamPresenceButtonStyle4 = teamPresenceButtonStyle3;
                }
                c0Var2.A();
                c0Var2.o();
                teamPresenceButtonStyle5 = teamPresenceButtonStyle4;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.n0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TeamPresenceComponentKt.TeamPresenceComponent$lambda$4(teamPresenceState, z12, teamPresenceButtonStyle5, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= a5.S0;
        teamPresenceButtonStyle2 = teamPresenceButtonStyle;
        if ((i12 & 731) == 146) {
            if (i15 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (i13 != 0) {
                teamPresenceButtonStyle3 = TeamPresenceButtonStyle.SECONDARY;
            } else {
                teamPresenceButtonStyle3 = teamPresenceButtonStyle2;
            }
            context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
            aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarT6 = d5.t(i6.h(aVar, 0.0f, 1, null), 0.0f, androidx.compose.ui.unit.h.r(24), 1, null);
            a1 a1VarB6 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.m(), c0VarR, 48);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK6 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0VarT6);
            androidx.compose.ui.node.g.a aVar8 = androidx.compose.ui.node.g.I;
            function0A = aVar8.a();
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
            y7.n(c0VarD, a1VarB6, aVar8.e());
            y7.n(c0VarD, b1VarK6, aVar8.g());
            function2B = aVar8.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN6, aVar8.f());
            androidx.compose.foundation.layout.n0 n0Var6 = androidx.compose.foundation.layout.n0.f16227a;
            c0VarR.E(-937558243);
            if (z12) {
                IntercomDividerKt.IntercomDivider(d5.v(i6.B(aVar, androidx.compose.ui.unit.h.r(100)), 0.0f, 0.0f, 0.0f, androidx.compose.ui.unit.h.r(16), 7, null), c0VarR, 6, 0);
            }
            c0VarR.A();
            strD = u0.i.d(teamPresenceState.getMessageButtonText(), c0VarR, 0);
            numValueOf = Integer.valueOf(teamPresenceState.getMessageButtonIcon());
            subtitleText = teamPresenceState.getSubtitleText();
            c0VarR.E(-937545761);
            if (subtitleText == null) {
                strD2 = null;
            } else {
                strD2 = u0.i.d(subtitleText.intValue(), c0VarR, 0);
            }
            c0VarR.A();
            if (teamPresenceState.getCtaData() != null) {
                strD = teamPresenceState.getCtaData().getText();
                icon = teamPresenceState.getCtaData().getIcon().getIcon();
                if (icon != null) {
                    numValueOf = icon;
                }
                strD2 = teamPresenceState.getCtaData().getSubtitle();
            }
            str = strD2;
            num = numValueOf;
            c0VarR.E(-937533382);
            if (teamPresenceState.getConversationState() != null) {
                strD = u0.i.d(teamPresenceState.getConversationState().getMessageButtonText(), c0VarR, 0);
            }
            c0VarR.A();
            if (teamPresenceButtonStyle3 == TeamPresenceButtonStyle.PRIMARY) {
                c0VarR.E(1001451744);
                IntercomPrimaryButtonKt.IntercomPrimaryButton(strD, null, num, new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.l0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TeamPresenceComponentKt.TeamPresenceComponent$lambda$3$lambda$1(teamPresenceState, context);
                    }
                }, c0VarR, 0, 2);
                c0Var2 = c0VarR;
                c0Var2.A();
                aVar2 = aVar;
            } else {
                c0VarR.E(1001651663);
                aVar2 = aVar;
                IntercomButtonKt.IntercomButton(null, IntercomButton.INSTANCE.m588outlinedStyleKlgxPg(0L, 0L, null, c0VarR, IntercomButton.$stable << 9, 7), strD, num, new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.m0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TeamPresenceComponentKt.TeamPresenceComponent$lambda$3$lambda$2(teamPresenceState, context);
                    }
                }, c0VarR, IntercomButton.Style.$stable << 3, 1);
                c0Var2 = c0VarR;
                c0Var2.A();
            }
            l6.a(i6.i(aVar2, androidx.compose.ui.unit.h.r(16)), c0Var2, 6);
            c0Var2.E(-937510359);
            if (str != null) {
                androidx.compose.runtime.c0 c0Var8 = c0Var2;
                teamPresenceButtonStyle4 = teamPresenceButtonStyle3;
                q50.t(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0Var2, IntercomTheme.$stable).getType04Point5(), s0.d(4285887861L), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0Var8, 0, 0, 131070);
                c0Var2 = c0Var8;
            } else {
                teamPresenceButtonStyle4 = teamPresenceButtonStyle3;
            }
            c0Var2.A();
            c0Var2.o();
            teamPresenceButtonStyle5 = teamPresenceButtonStyle4;
        } else {
            if (i15 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (i13 != 0) {
                teamPresenceButtonStyle3 = TeamPresenceButtonStyle.SECONDARY;
            } else {
                teamPresenceButtonStyle3 = teamPresenceButtonStyle2;
            }
            context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
            aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarT7 = d5.t(i6.h(aVar, 0.0f, 1, null), 0.0f, androidx.compose.ui.unit.h.r(24), 1, null);
            a1 a1VarB7 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.m(), c0VarR, 48);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK7 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0VarT7);
            androidx.compose.ui.node.g.a aVar9 = androidx.compose.ui.node.g.I;
            function0A = aVar9.a();
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
            y7.n(c0VarD, a1VarB7, aVar9.e());
            y7.n(c0VarD, b1VarK7, aVar9.g());
            function2B = aVar9.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN7, aVar9.f());
            androidx.compose.foundation.layout.n0 n0Var7 = androidx.compose.foundation.layout.n0.f16227a;
            c0VarR.E(-937558243);
            if (z12) {
                IntercomDividerKt.IntercomDivider(d5.v(i6.B(aVar, androidx.compose.ui.unit.h.r(100)), 0.0f, 0.0f, 0.0f, androidx.compose.ui.unit.h.r(16), 7, null), c0VarR, 6, 0);
            }
            c0VarR.A();
            strD = u0.i.d(teamPresenceState.getMessageButtonText(), c0VarR, 0);
            numValueOf = Integer.valueOf(teamPresenceState.getMessageButtonIcon());
            subtitleText = teamPresenceState.getSubtitleText();
            c0VarR.E(-937545761);
            if (subtitleText == null) {
                strD2 = null;
            } else {
                strD2 = u0.i.d(subtitleText.intValue(), c0VarR, 0);
            }
            c0VarR.A();
            if (teamPresenceState.getCtaData() != null) {
                strD = teamPresenceState.getCtaData().getText();
                icon = teamPresenceState.getCtaData().getIcon().getIcon();
                if (icon != null) {
                    numValueOf = icon;
                }
                strD2 = teamPresenceState.getCtaData().getSubtitle();
            }
            str = strD2;
            num = numValueOf;
            c0VarR.E(-937533382);
            if (teamPresenceState.getConversationState() != null) {
                strD = u0.i.d(teamPresenceState.getConversationState().getMessageButtonText(), c0VarR, 0);
            }
            c0VarR.A();
            if (teamPresenceButtonStyle3 == TeamPresenceButtonStyle.PRIMARY) {
                c0VarR.E(1001451744);
                IntercomPrimaryButtonKt.IntercomPrimaryButton(strD, null, num, new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.l0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TeamPresenceComponentKt.TeamPresenceComponent$lambda$3$lambda$1(teamPresenceState, context);
                    }
                }, c0VarR, 0, 2);
                c0Var2 = c0VarR;
                c0Var2.A();
                aVar2 = aVar;
            } else {
                c0VarR.E(1001651663);
                aVar2 = aVar;
                IntercomButtonKt.IntercomButton(null, IntercomButton.INSTANCE.m588outlinedStyleKlgxPg(0L, 0L, null, c0VarR, IntercomButton.$stable << 9, 7), strD, num, new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.m0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TeamPresenceComponentKt.TeamPresenceComponent$lambda$3$lambda$2(teamPresenceState, context);
                    }
                }, c0VarR, IntercomButton.Style.$stable << 3, 1);
                c0Var2 = c0VarR;
                c0Var2.A();
            }
            l6.a(i6.i(aVar2, androidx.compose.ui.unit.h.r(16)), c0Var2, 6);
            c0Var2.E(-937510359);
            if (str != null) {
                androidx.compose.runtime.c0 c0Var9 = c0Var2;
                teamPresenceButtonStyle4 = teamPresenceButtonStyle3;
                q50.t(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3.m(IntercomTheme.INSTANCE.getTypography(c0Var2, IntercomTheme.$stable).getType04Point5(), s0.d(4285887861L), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0Var9, 0, 0, 131070);
                c0Var2 = c0Var9;
            } else {
                teamPresenceButtonStyle4 = teamPresenceButtonStyle3;
            }
            c0Var2.A();
            c0Var2.o();
            teamPresenceButtonStyle5 = teamPresenceButtonStyle4;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.n0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TeamPresenceComponentKt.TeamPresenceComponent$lambda$4(teamPresenceState, z12, teamPresenceButtonStyle5, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TeamPresenceComponent$lambda$3$lambda$1(ArticleViewState.TeamPresenceState teamPresenceState, Context context) {
        Intrinsics.checkNotNullParameter(teamPresenceState, "$teamPresenceState");
        Intrinsics.checkNotNullParameter(context, "$context");
        TeamPresenceComponent$onClick(context, teamPresenceState);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TeamPresenceComponent$lambda$3$lambda$2(ArticleViewState.TeamPresenceState teamPresenceState, Context context) {
        Intrinsics.checkNotNullParameter(teamPresenceState, "$teamPresenceState");
        Intrinsics.checkNotNullParameter(context, "$context");
        TeamPresenceComponent$onClick(context, teamPresenceState);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TeamPresenceComponent$lambda$4(ArticleViewState.TeamPresenceState teamPresenceState, boolean z10, TeamPresenceButtonStyle teamPresenceButtonStyle, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(teamPresenceState, "$teamPresenceState");
        TeamPresenceComponent(teamPresenceState, z10, teamPresenceButtonStyle, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    private static final void TeamPresenceComponent$onClick(Context context, ArticleViewState.TeamPresenceState teamPresenceState) {
        Injector.get().getMetricTracker().clickedNewConversation(teamPresenceState.getMetricPlace(), teamPresenceState.getMetricContext(), teamPresenceState.isFromSearchBrowse());
        if (teamPresenceState.getConversationState() != null) {
            ConversationScreenOpenerKt.openComposer$default(context, null, false, null, teamPresenceState.getConversationState().getConversationId(), 14, null);
        } else if (teamPresenceState.getArticleMetadata() != null) {
            ConversationScreenOpenerKt.openComposer$default(context, null, false, teamPresenceState.getArticleMetadata(), null, 22, null);
        } else {
            ConversationScreenOpenerKt.openComposer$default(context, null, false, null, null, 30, null);
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TeamPresenceComponentWithBubble(@NotNull final ArticleViewState.TeamPresenceState teamPresenceState, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(teamPresenceState, "teamPresenceState");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1539837505);
        if ((i10 & 14) == 0) {
            i11 = (c0VarR.D(teamPresenceState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && c0VarR.d()) {
            c0VarR.u();
        } else {
            float fR = androidx.compose.ui.unit.h.r(((Configuration) c0VarR.W(AndroidCompositionLocals_androidKt.f())).screenWidthDp);
            final long jM693getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m693getBubbleBackground0d7_KjU();
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.foundation.layout.q.m mVarY = androidx.compose.foundation.layout.q.f16330a.y();
            androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
            a1 a1VarB = androidx.compose.foundation.layout.j0.b(mVarY, aVar2.u(), c0VarR, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, aVar);
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
            androidx.compose.runtime.c0 c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarB, aVar3.e());
            y7.n(c0VarD, b1VarK, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar3.f());
            androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
            c0VarR.E(-745953431);
            if (teamPresenceState.getSubtitleText() != null) {
                androidx.compose.ui.a0 a0VarL = s4.l(aVar, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(fR / 2.0f) - androidx.compose.ui.unit.h.r(60)), androidx.compose.ui.unit.h.r(0));
                c0VarR.E(-745947382);
                boolean zL = c0VarR.L(jM693getBubbleBackground0d7_KjU);
                Object objI0 = c0VarR.i0();
                if (zL || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.h0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TeamPresenceComponentKt.TeamPresenceComponentWithBubble$lambda$11$lambda$7$lambda$6(jM693getBubbleBackground0d7_KjU, (androidx.compose.ui.draw.i) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                l6.a(i6.w(androidx.compose.ui.draw.n.c(a0VarL, (Function1) objI0), androidx.compose.ui.unit.h.r(16)), c0VarR, 0);
            }
            c0VarR.A();
            float f10 = 24;
            androidx.compose.ui.a0 a0VarA = androidx.compose.ui.draw.j.a(d5.v(aVar, androidx.compose.ui.unit.h.r(f10), 0.0f, androidx.compose.ui.unit.h.r(f10), androidx.compose.ui.unit.h.r(f10), 2, null), androidx.compose.foundation.shape.o.h(androidx.compose.ui.unit.h.r(8)));
            boolean z10 = teamPresenceState.getSubtitleText() != null;
            c0VarR.E(-745925551);
            boolean zL2 = c0VarR.L(jM693getBubbleBackground0d7_KjU);
            Object objI1 = c0VarR.i0();
            if (zL2 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.i0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TeamPresenceComponentKt.TeamPresenceComponentWithBubble$lambda$11$lambda$9$lambda$8(jM693getBubbleBackground0d7_KjU, (androidx.compose.ui.a0) obj);
                    }
                };
                c0VarR.Y(objI1);
            }
            c0VarR.A();
            androidx.compose.ui.a0 a0VarIfTrue = ModifierExtensionsKt.ifTrue(a0VarA, z10, (Function1) objI1);
            a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
            int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarIfTrue);
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
            androidx.compose.runtime.c0 c0VarD2 = y7.d(c0VarR);
            y7.n(c0VarD2, a1VarK, aVar3.e());
            y7.n(c0VarD2, b1VarK2, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar3.b();
            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            }
            y7.n(c0VarD2, a0VarN2, aVar3.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            TeamPresenceComponent(teamPresenceState, false, TeamPresenceButtonStyle.PRIMARY, c0VarR, (i11 & 14) | 432, 0);
            c0VarR.o();
            c0VarR.o();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.j0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TeamPresenceComponentKt.TeamPresenceComponentWithBubble$lambda$12(teamPresenceState, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.draw.o TeamPresenceComponentWithBubble$lambda$11$lambda$7$lambda$6(final long j10, androidx.compose.ui.draw.i drawWithCache) {
        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
        final k2 k2VarA = androidx.compose.ui.graphics.u.a();
        k2VarA.A(0.0f, Float.intBitsToFloat((int) (drawWithCache.d() & com.rabbitmq.client.k0.f265952a)));
        k2VarA.F(Float.intBitsToFloat((int) (drawWithCache.d() >> 32)) / 2.0f, Float.intBitsToFloat((int) (drawWithCache.d() & com.rabbitmq.client.k0.f265952a)) / 2.0f);
        k2VarA.F(Float.intBitsToFloat((int) (drawWithCache.d() >> 32)), Float.intBitsToFloat((int) (drawWithCache.d() & com.rabbitmq.client.k0.f265952a)));
        k2VarA.close();
        return drawWithCache.M(new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TeamPresenceComponentKt.TeamPresenceComponentWithBubble$lambda$11$lambda$7$lambda$6$lambda$5(k2VarA, j10, (androidx.compose.ui.graphics.drawscope.f) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TeamPresenceComponentWithBubble$lambda$11$lambda$7$lambda$6$lambda$5(k2 path, long j10, androidx.compose.ui.graphics.drawscope.f onDrawBehind) {
        Intrinsics.checkNotNullParameter(path, "$path");
        Intrinsics.checkNotNullParameter(onDrawBehind, "$this$onDrawBehind");
        androidx.compose.ui.graphics.drawscope.f.K1(onDrawBehind, path, j10, 0.0f, null, null, 0, 60, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.a0 TeamPresenceComponentWithBubble$lambda$11$lambda$9$lambda$8(long j10, androidx.compose.ui.a0 ifTrue) {
        Intrinsics.checkNotNullParameter(ifTrue, "$this$ifTrue");
        return androidx.compose.foundation.v.d(ifTrue, j10, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TeamPresenceComponentWithBubble$lambda$12(ArticleViewState.TeamPresenceState teamPresenceState, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(teamPresenceState, "$teamPresenceState");
        TeamPresenceComponentWithBubble(teamPresenceState, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TeamPresencePreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-161512363);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            int i11 = ((3 & 7) ^ 0) << 0;
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TeamPresenceComponentKt.INSTANCE.m355getLambda4$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.g0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TeamPresenceComponentKt.TeamPresencePreview$lambda$14(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TeamPresencePreview$lambda$14(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TeamPresencePreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TeamPresenceWithBubblePreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1128132221);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TeamPresenceComponentKt.INSTANCE.m353getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.f0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TeamPresenceComponentKt.TeamPresenceWithBubblePreview$lambda$13(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TeamPresenceWithBubblePreview$lambda$13(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TeamPresenceWithBubblePreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
