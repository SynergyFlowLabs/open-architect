package io.intercom.android.sdk.helpcenter.articles;

import androidx.compose.foundation.i1;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.j0;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.n0;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.foundation.s2;
import androidx.compose.material3.q50;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.graphics.r0;
import androidx.compose.ui.graphics.t0;
import androidx.compose.ui.layout.a1;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
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
@SourceDebugExtension({"SMAP\nReactionsComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactionsComponent.kt\nio/intercom/android/sdk/helpcenter/articles/ReactionsComponentKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,189:1\n87#2:190\n84#2,9:191\n94#2:298\n80#3,6:200\n87#3,3:215\n90#3,2:224\n80#3,6:238\n87#3,3:253\n90#3,2:262\n94#3:293\n94#3:297\n391#4,9:206\n400#4:226\n391#4,9:244\n400#4:264\n401#4,2:291\n401#4,2:295\n4360#5,6:218\n4360#5,6:256\n113#6:227\n113#6:228\n113#6:265\n113#6:266\n113#6:267\n113#6:268\n113#6:269\n113#6:270\n113#6:277\n113#6:284\n99#7:229\n97#7,8:230\n106#7:294\n1282#8,6:271\n1282#8,6:278\n1282#8,6:285\n85#9:299\n85#9:300\n85#9:301\n*S KotlinDebug\n*F\n+ 1 ReactionsComponent.kt\nio/intercom/android/sdk/helpcenter/articles/ReactionsComponentKt\n*L\n41#1:190\n41#1:191,9\n41#1:298\n41#1:200,6\n41#1:215,3\n41#1:224,2\n48#1:238,6\n48#1:253,3\n48#1:262,2\n48#1:293\n41#1:297\n41#1:206,9\n41#1:226\n48#1:244,9\n48#1:264\n48#1:291,2\n41#1:295,2\n41#1:218,6\n48#1:256,6\n46#1:227\n50#1:228\n56#1:265\n58#1:266\n63#1:267\n65#1:268\n70#1:269\n72#1:270\n95#1:277\n116#1:284\n48#1:229\n48#1:230,8\n48#1:294\n77#1:271,6\n98#1:278,6\n119#1:285,6\n54#1:299\n61#1:300\n68#1:301\n*E\n"})
public final class ReactionsComponentKt {
    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ReactionComponentNeutralTappedPreview(@Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(507405585);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ReactionsComponentKt.INSTANCE.m96getLambda6$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.helpcenter.articles.a0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ReactionsComponentKt.ReactionComponentNeutralTappedPreview$lambda$17(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReactionComponentNeutralTappedPreview$lambda$17(int i10, c0 c0Var, int i11) {
        ReactionComponentNeutralTappedPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ReactionComponentSadTappedPreview(@Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(2092315616);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ReactionsComponentKt.INSTANCE.m94getLambda4$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.helpcenter.articles.v
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ReactionsComponentKt.ReactionComponentSadTappedPreview$lambda$16(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReactionComponentSadTappedPreview$lambda$16(int i10, c0 c0Var, int i11) {
        ReactionComponentSadTappedPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ReactionsComponent(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final ArticleViewState.ReactionState currentReactionState, @NotNull final Function0<Unit> sadReactionTapped, @NotNull final Function0<Unit> neutralReactionTapped, @NotNull final Function0<Unit> happyReactionTapped, @Nullable c0 c0Var, final int i10, final int i11) {
        final androidx.compose.ui.a0 a0Var2;
        int i12;
        boolean z10;
        Intrinsics.checkNotNullParameter(currentReactionState, "currentReactionState");
        Intrinsics.checkNotNullParameter(sadReactionTapped, "sadReactionTapped");
        Intrinsics.checkNotNullParameter(neutralReactionTapped, "neutralReactionTapped");
        Intrinsics.checkNotNullParameter(happyReactionTapped, "happyReactionTapped");
        c0 c0VarR = c0Var.R(-1539407934);
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
            i12 |= c0VarR.D(currentReactionState) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & 896) == 0) {
            i12 |= c0VarR.k0(sadReactionTapped) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= c0VarR.k0(neutralReactionTapped) ? 2048 : 1024;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 57344) == 0) {
            i12 |= c0VarR.k0(happyReactionTapped) ? 16384 : 8192;
        }
        if ((46811 & i12) == 9362 && c0VarR.d()) {
            c0VarR.u();
        } else {
            androidx.compose.ui.a0 a0Var3 = i13 != 0 ? androidx.compose.ui.a0.E : a0Var2;
            androidx.compose.ui.a0 a0VarD = androidx.compose.foundation.v.d(a0Var3, IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m690getBackground0d7_KjU(), null, 2, null);
            androidx.compose.ui.a0 a0Var4 = a0Var3;
            androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.e.b bVarM = aVar.m();
            androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
            a1 a1VarB = j0.b(qVar.y(), bVarM, c0VarR, 48);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarD);
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
            y7.n(c0VarD, a1VarB, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            n0 n0Var = n0.f16227a;
            IntercomDividerKt.IntercomDivider(null, c0VarR, 0, 1);
            androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
            float f10 = 16;
            l6.a(i6.i(aVar3, androidx.compose.ui.unit.h.r(f10)), c0VarR, 6);
            int i14 = i12;
            q50.t(u0.i.d(R.string.intercom_article_question, c0VarR, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, 0, 0, 262142);
            androidx.compose.ui.a0 a0VarH = i6.h(d5.r(aVar3, androidx.compose.ui.unit.h.r(f10)), 0.0f, 1, null);
            a1 a1VarE = u5.e(qVar.m(), aVar.w(), c0VarR, 6);
            int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarH);
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
            y7.n(c0VarD2, a1VarE, aVar2.e());
            y7.n(c0VarD2, b1VarK2, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar2.b();
            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            }
            y7.n(c0VarD2, a0VarN2, aVar2.f());
            y5 y5Var = y5.f16577a;
            ArticleViewState.Reaction selectedReaction = currentReactionState.getSelectedReaction();
            ArticleViewState.Reaction reaction = ArticleViewState.Reaction.Sad;
            n7<androidx.compose.ui.unit.h> n7VarD = androidx.compose.animation.core.f.d((selectedReaction == reaction || currentReactionState.getSelectedReaction() == ArticleViewState.Reaction.None) ? androidx.compose.ui.unit.h.r(38) : androidx.compose.ui.unit.h.r(24), null, null, null, c0VarR, 0, 14);
            ArticleViewState.Reaction selectedReaction2 = currentReactionState.getSelectedReaction();
            ArticleViewState.Reaction reaction2 = ArticleViewState.Reaction.Happy;
            n7<androidx.compose.ui.unit.h> n7VarD2 = androidx.compose.animation.core.f.d((selectedReaction2 == reaction2 || currentReactionState.getSelectedReaction() == ArticleViewState.Reaction.None) ? androidx.compose.ui.unit.h.r(38) : androidx.compose.ui.unit.h.r(24), null, null, null, c0VarR, 0, 14);
            ArticleViewState.Reaction selectedReaction3 = currentReactionState.getSelectedReaction();
            ArticleViewState.Reaction reaction3 = ArticleViewState.Reaction.Neutral;
            n7<androidx.compose.ui.unit.h> n7VarD3 = androidx.compose.animation.core.f.d((selectedReaction3 == reaction3 || currentReactionState.getSelectedReaction() == ArticleViewState.Reaction.None) ? androidx.compose.ui.unit.h.r(38) : androidx.compose.ui.unit.h.r(24), null, null, null, c0VarR, 0, 14);
            c0VarR.E(-1674629439);
            boolean z11 = (i14 & 896) == 256;
            Object objI0 = c0VarR.i0();
            if (z11 || objI0 == c0.f35327a.a()) {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.helpcenter.articles.w
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ReactionsComponentKt.ReactionsComponent$lambda$13$lambda$12$lambda$4$lambda$3(sadReactionTapped);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            androidx.compose.ui.a0 a0VarW = i6.w(i1.j(aVar3, false, null, null, null, (Function0) objI0, 15, null), ReactionsComponent$lambda$13$lambda$12$lambda$0(n7VarD));
            androidx.compose.ui.graphics.painter.b bVarC = u0.e.c(R.drawable.intercom_reaction_sad, c0VarR, 0);
            r0.a aVar4 = r0.f38151b;
            float[] fArrC = t0.c(null, 1, null);
            if (currentReactionState.getSelectedReaction() == reaction || currentReactionState.getSelectedReaction() == ArticleViewState.Reaction.None) {
                z10 = false;
                t0.r(fArrC, 1.0f);
            } else {
                z10 = false;
                t0.r(fArrC, 0.0f);
            }
            s2.d(bVarC, null, a0VarW, null, null, 0.0f, aVar4.a(fArrC), c0VarR, 56, 56);
            l6.a(i6.B(aVar3, androidx.compose.ui.unit.h.r(f10)), c0VarR, 6);
            c0VarR.E(-1674600123);
            boolean z12 = (i14 & 7168) == 2048;
            Object objI1 = c0VarR.i0();
            if (z12 || objI1 == c0.f35327a.a()) {
                objI1 = new Function0() { // from class: io.intercom.android.sdk.helpcenter.articles.x
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ReactionsComponentKt.ReactionsComponent$lambda$13$lambda$12$lambda$7$lambda$6(neutralReactionTapped);
                    }
                };
                c0VarR.Y(objI1);
            }
            c0VarR.A();
            androidx.compose.ui.a0 a0VarW2 = i6.w(i1.j(aVar3, false, null, null, null, (Function0) objI1, 15, null), ReactionsComponent$lambda$13$lambda$12$lambda$2(n7VarD3));
            androidx.compose.ui.graphics.painter.b bVarC2 = u0.e.c(R.drawable.intercom_reaction_neutral, c0VarR, 0);
            float[] fArrC2 = t0.c(null, 1, null);
            if (currentReactionState.getSelectedReaction() == reaction3 || currentReactionState.getSelectedReaction() == ArticleViewState.Reaction.None) {
                t0.r(fArrC2, 1.0f);
            } else {
                t0.r(fArrC2, 0.0f);
            }
            s2.d(bVarC2, null, a0VarW2, null, null, 0.0f, aVar4.a(fArrC2), c0VarR, 56, 56);
            l6.a(i6.B(aVar3, androidx.compose.ui.unit.h.r(f10)), c0VarR, 6);
            c0VarR.E(-1674570301);
            boolean z13 = (i14 & 57344) == 16384;
            Object objI2 = c0VarR.i0();
            if (z13 || objI2 == c0.f35327a.a()) {
                objI2 = new Function0() { // from class: io.intercom.android.sdk.helpcenter.articles.y
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ReactionsComponentKt.ReactionsComponent$lambda$13$lambda$12$lambda$10$lambda$9(happyReactionTapped);
                    }
                };
                c0VarR.Y(objI2);
            }
            c0VarR.A();
            androidx.compose.ui.a0 a0VarW3 = i6.w(i1.j(aVar3, false, null, null, null, (Function0) objI2, 15, null), ReactionsComponent$lambda$13$lambda$12$lambda$1(n7VarD2));
            androidx.compose.ui.graphics.painter.b bVarC3 = u0.e.c(R.drawable.intercom_reaction_happy, c0VarR, 0);
            float[] fArrC3 = t0.c(null, 1, null);
            if (currentReactionState.getSelectedReaction() == reaction2 || currentReactionState.getSelectedReaction() == ArticleViewState.Reaction.None) {
                t0.r(fArrC3, 1.0f);
            } else {
                t0.r(fArrC3, 0.0f);
            }
            s2.d(bVarC3, null, a0VarW3, null, null, 0.0f, aVar4.a(fArrC3), c0VarR, 56, 56);
            c0VarR = c0VarR;
            c0VarR.o();
            c0VarR.o();
            a0Var2 = a0Var4;
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.helpcenter.articles.z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ReactionsComponentKt.ReactionsComponent$lambda$14(a0Var2, currentReactionState, sadReactionTapped, neutralReactionTapped, happyReactionTapped, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final float ReactionsComponent$lambda$13$lambda$12$lambda$0(n7<androidx.compose.ui.unit.h> n7Var) {
        return n7Var.getValue().O();
    }

    private static final float ReactionsComponent$lambda$13$lambda$12$lambda$1(n7<androidx.compose.ui.unit.h> n7Var) {
        return n7Var.getValue().O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReactionsComponent$lambda$13$lambda$12$lambda$10$lambda$9(Function0 happyReactionTapped) {
        Intrinsics.checkNotNullParameter(happyReactionTapped, "$happyReactionTapped");
        happyReactionTapped.invoke();
        return Unit.f312394a;
    }

    private static final float ReactionsComponent$lambda$13$lambda$12$lambda$2(n7<androidx.compose.ui.unit.h> n7Var) {
        return n7Var.getValue().O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReactionsComponent$lambda$13$lambda$12$lambda$4$lambda$3(Function0 sadReactionTapped) {
        Intrinsics.checkNotNullParameter(sadReactionTapped, "$sadReactionTapped");
        sadReactionTapped.invoke();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReactionsComponent$lambda$13$lambda$12$lambda$7$lambda$6(Function0 neutralReactionTapped) {
        Intrinsics.checkNotNullParameter(neutralReactionTapped, "$neutralReactionTapped");
        neutralReactionTapped.invoke();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReactionsComponent$lambda$14(androidx.compose.ui.a0 a0Var, ArticleViewState.ReactionState currentReactionState, Function0 sadReactionTapped, Function0 neutralReactionTapped, Function0 happyReactionTapped, int i10, int i11, c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(currentReactionState, "$currentReactionState");
        Intrinsics.checkNotNullParameter(sadReactionTapped, "$sadReactionTapped");
        Intrinsics.checkNotNullParameter(neutralReactionTapped, "$neutralReactionTapped");
        Intrinsics.checkNotNullParameter(happyReactionTapped, "$happyReactionTapped");
        ReactionsComponent(a0Var, currentReactionState, sadReactionTapped, neutralReactionTapped, happyReactionTapped, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ReactionsComponentPreview(@Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(913251333);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ReactionsComponentKt.INSTANCE.m92getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.helpcenter.articles.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ReactionsComponentKt.ReactionsComponentPreview$lambda$15(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReactionsComponentPreview$lambda$15(int i10, c0 c0Var, int i11) {
        ReactionsComponentPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
