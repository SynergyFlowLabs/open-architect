package io.intercom.android.sdk.m5.conversation.ui.components.row;

import android.content.Context;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.y3;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.AvatarGroupKt;
import io.intercom.android.sdk.m5.components.BotAndHumansFacePileKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.ExpandedTeamPresenceState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarType;
import io.intercom.android.sdk.models.Header;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.LinkOpener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nExpandedTeamPresenceLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpandedTeamPresenceLayout.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/ExpandedTeamPresenceLayoutKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,366:1\n75#2:367\n87#3:368\n84#3,9:369\n94#3:516\n80#4,6:378\n87#4,3:393\n90#4,2:402\n80#4,6:422\n87#4,3:437\n90#4,2:446\n94#4:460\n80#4,6:476\n87#4,3:491\n90#4,2:500\n94#4:510\n94#4:515\n391#5,9:384\n400#5:404\n391#5,9:428\n400#5:448\n401#5,2:458\n391#5,9:482\n400#5:502\n401#5,2:508\n401#5,2:513\n4360#6,6:396\n4360#6,6:440\n4360#6,6:494\n113#7:405\n113#7:407\n113#7:409\n113#7:410\n113#7:450\n113#7:463\n113#7:464\n113#7:507\n113#7:517\n1863#8:406\n1864#8:408\n1863#8:449\n1864#8:457\n1863#8:462\n1557#8:503\n1628#8,3:504\n1864#8:512\n99#9:411\n95#9,10:412\n106#9:461\n99#9:465\n95#9,10:466\n106#9:511\n1282#10,6:451\n*S KotlinDebug\n*F\n+ 1 ExpandedTeamPresenceLayout.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/ExpandedTeamPresenceLayoutKt\n*L\n49#1:367\n50#1:368\n50#1:369,9\n50#1:516\n50#1:378,6\n50#1:393,3\n50#1:402,2\n122#1:422,6\n122#1:437,3\n122#1:446,2\n122#1:460\n155#1:476,6\n155#1:491,3\n155#1:500,2\n155#1:510\n50#1:515\n50#1:384,9\n50#1:404\n122#1:428,9\n122#1:448\n122#1:458,2\n155#1:482,9\n155#1:502\n155#1:508,2\n50#1:513,2\n50#1:396,6\n122#1:440,6\n155#1:494,6\n107#1:405\n110#1:407\n121#1:409\n123#1:410\n137#1:450\n154#1:463\n156#1:464\n163#1:507\n42#1:517\n109#1:406\n109#1:408\n126#1:449\n126#1:457\n153#1:462\n162#1:503\n162#1:504,3\n153#1:512\n122#1:411\n122#1:412,10\n122#1:461\n155#1:465\n155#1:466,10\n155#1:511\n139#1:451,6\n*E\n"})
public final class ExpandedTeamPresenceLayoutKt {
    private static final float AvatarSize = androidx.compose.ui.unit.h.r(56);

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AvatarType.values().length];
            try {
                iArr[AvatarType.FACEPILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AvatarType.LAYERED_BUBBLES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AvatarType.LOGO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AvatarType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Header.Expanded.Style.values().length];
            try {
                iArr2[Header.Expanded.Style.H1.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Header.Expanded.Style.PARAGRAPH.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Header.Expanded.Style.INTRO.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Header.Expanded.Style.GREETING.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r33v0 */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ExpandedTeamPresenceLayout(@NotNull final ExpandedTeamPresenceState teamPresenceUiState, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        char c10;
        Object obj;
        boolean z10;
        Intrinsics.checkNotNullParameter(teamPresenceUiState, "teamPresenceUiState");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1694898660);
        final androidx.compose.ui.a0 a0Var2 = (i11 & 2) != 0 ? androidx.compose.ui.a0.E : a0Var;
        final Context context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
        androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.m(), c0VarR, 48);
        int i12 = 0;
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        androidx.compose.runtime.b1 b1VarK = c0VarR.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0Var2);
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
        y7.n(c0VarD, a1VarB, aVar.e());
        y7.n(c0VarD, b1VarK, aVar.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar.f());
        androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
        int i13 = WhenMappings.$EnumSwitchMapping$0[teamPresenceUiState.getAvatarType().ordinal()];
        if (i13 == 1) {
            c10 = 2;
            obj = null;
            c0VarR.E(-655467756);
            BotAndHumansFacePileKt.m103BotAndHumansFacePilehGBTI10(androidx.compose.ui.a0.E, ((AvatarWrapper) CollectionsKt.first((List) teamPresenceUiState.getAvatars())).getAvatar(), teamPresenceUiState.getAvatars().size() >= 3 ? TuplesKt.to(teamPresenceUiState.getAvatars().get(1).getAvatar(), teamPresenceUiState.getAvatars().get(2).getAvatar()) : teamPresenceUiState.getAvatars().size() == 2 ? TuplesKt.to(teamPresenceUiState.getAvatars().get(1).getAvatar(), null) : TuplesKt.to(null, null), AvatarSize, null, c0VarR, 3654, 16);
            c0VarR.A();
            Unit unit = Unit.f312394a;
        } else if (i13 == 2) {
            c10 = 2;
            obj = null;
            c0VarR.E(-654655587);
            if (teamPresenceUiState.getAvatars().size() == 1) {
                c0VarR.E(-654606390);
                AvatarIconKt.m173AvatarIconRd90Nhg(i6.w(androidx.compose.ui.a0.E, AvatarSize), teamPresenceUiState.getAvatars().get(0), null, teamPresenceUiState.getDisplayActiveIndicator(), androidx.compose.ui.unit.a0.m(24), null, c0VarR, 24646, 36);
                c0VarR = c0VarR;
                c0VarR.A();
            } else {
                c0VarR.E(-654265855);
                AvatarGroupKt.m101AvatarGroupJ8mCjc(teamPresenceUiState.getAvatars(), androidx.compose.ui.a0.E, AvatarSize, androidx.compose.ui.unit.a0.m(24), c0VarR, 3512, 0);
                c0VarR.A();
            }
            c0VarR.A();
            Unit unit2 = Unit.f312394a;
        } else if (i13 == 3) {
            c0VarR.E(-653933318);
            c10 = 2;
            obj = null;
            AvatarIconKt.m173AvatarIconRd90Nhg(i6.w(androidx.compose.ui.a0.E, AvatarSize), teamPresenceUiState.getAvatars().get(0), null, teamPresenceUiState.getDisplayActiveIndicator(), androidx.compose.ui.unit.a0.m(24), androidx.compose.ui.graphics.q0.n(androidx.compose.ui.graphics.q0.f38131b.s()), c0VarR, 221254, 4);
            c0VarR = c0VarR;
            c0VarR.A();
            Unit unit3 = Unit.f312394a;
        } else {
            if (i13 != 4) {
                c0VarR.E(-852429191);
                c0VarR.A();
                throw new kotlin.k0();
            }
            c0VarR.E(-653494885);
            c0VarR.A();
            Unit unit4 = Unit.f312394a;
            c10 = 2;
            obj = null;
        }
        float f10 = 12;
        int i14 = 6;
        l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(f10)), c0VarR, 6);
        c0VarR.E(-852359896);
        for (Header.Expanded.Body body : teamPresenceUiState.getBody()) {
            l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(4)), c0VarR, i14);
            androidx.compose.runtime.c0 c0Var2 = c0VarR;
            q50.t(body.getText(), null, 0L, null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(androidx.compose.ui.text.style.j.f42206b.a()), 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 2, 0, null, getTextStyleFor(body.getStyle(), body.getColor(), c0VarR, i12, i12), c0Var2, 0, 24960, 109566);
            obj = null;
            i12 = 0;
            c10 = 2;
            i14 = i14;
            c0VarR = c0Var2;
            f10 = f10;
        }
        float f11 = f10;
        int i15 = i14;
        c0VarR.A();
        c0VarR.E(-852346650);
        int i16 = 54;
        int i17 = 8;
        if (teamPresenceUiState.getSocialAccounts().isEmpty()) {
            z10 = false;
        } else {
            androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
            l6.a(i6.i(aVar2, androidx.compose.ui.unit.h.r(f11)), c0VarR, i15);
            androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
            float fR = androidx.compose.ui.unit.h.r(8);
            androidx.compose.ui.e.a aVar3 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.layout.a1 a1VarE = u5.e(qVar.H(fR, aVar3.m()), aVar3.q(), c0VarR, 54);
            z10 = false;
            int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, aVar2);
            androidx.compose.ui.node.g.a aVar4 = androidx.compose.ui.node.g.I;
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
            androidx.compose.runtime.c0 c0VarD2 = y7.d(c0VarR);
            y7.n(c0VarD2, a1VarE, aVar4.e());
            y7.n(c0VarD2, b1VarK2, aVar4.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar4.b();
            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            }
            y7.n(c0VarD2, a0VarN2, aVar4.f());
            y5 y5Var = y5.f16577a;
            c0VarR.E(-457726390);
            for (final Header.Expanded.SocialAccount socialAccount : teamPresenceUiState.getSocialAccounts()) {
                if (Intrinsics.areEqual(socialAccount.getProvider(), "twitter")) {
                    androidx.compose.ui.graphics.painter.b bVarC = u0.e.c(R.drawable.intercom_twitter, c0VarR, 0);
                    String provider = socialAccount.getProvider();
                    long jM685getActionContrastWhite0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m685getActionContrastWhite0d7_KjU();
                    androidx.compose.ui.a0 a0VarW = i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16));
                    c0VarR.E(-144020278);
                    Object objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    ni.o(bVarC, provider, androidx.compose.foundation.i1.f(a0VarW, (androidx.compose.foundation.interaction.j) objI0, null, false, null, null, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.h0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayout$lambda$8$lambda$4$lambda$3$lambda$2(socialAccount, context);
                        }
                    }, 28, null), jM685getActionContrastWhite0d7_KjU, c0VarR, 8, 0);
                }
            }
            c0VarR.A();
            c0VarR.o();
        }
        c0VarR.A();
        c0VarR.E(-852298704);
        ?? r13 = z10;
        for (Header.Expanded.Footer footer : teamPresenceUiState.getFooters()) {
            androidx.compose.ui.a0.a aVar5 = androidx.compose.ui.a0.E;
            l6.a(i6.i(aVar5, androidx.compose.ui.unit.h.r(4)), c0VarR, i15);
            androidx.compose.ui.layout.a1 a1VarE2 = u5.e(androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(i17)), androidx.compose.ui.e.f37317a.q(), c0VarR, i16);
            int iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, r13));
            androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, aVar5);
            androidx.compose.ui.node.g.a aVar6 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A3 = aVar6.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A3);
            } else {
                c0VarR.l();
            }
            androidx.compose.runtime.c0 c0VarD3 = y7.d(c0VarR);
            y7.n(c0VarD3, a1VarE2, aVar6.e());
            y7.n(c0VarD3, b1VarK3, aVar6.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3 = aVar6.b();
            if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iHashCode3))) {
                c0VarD3.Y(Integer.valueOf(iHashCode3));
                c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
            }
            y7.n(c0VarD3, a0VarN3, aVar6.f());
            y5 y5Var2 = y5.f16577a;
            c0VarR.E(-143995125);
            if (footer.getAvatarDetails() != null) {
                List<Avatar.Builder> avatars = footer.getAvatarDetails().getAvatars();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(avatars, 10));
                Iterator it = avatars.iterator();
                while (it.hasNext()) {
                    Avatar avatarBuild = ((Avatar.Builder) it.next()).build();
                    Intrinsics.checkNotNullExpressionValue(avatarBuild, "build(...)");
                    arrayList.add(new AvatarWrapper(avatarBuild, r13, 2, null));
                }
                AvatarGroupKt.m101AvatarGroupJ8mCjc(arrayList, aVar5, androidx.compose.ui.unit.h.r(20), 0L, c0VarR, 440, 8);
            }
            c0VarR.A();
            androidx.compose.runtime.c0 c0Var3 = c0VarR;
            q50.t(footer.getText(), null, 0L, null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(androidx.compose.ui.text.style.j.f42206b.a()), 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 2, 0, null, getTextStyleFor(footer.getStyle(), footer.getColor(), c0VarR, r13, r13), c0Var3, 0, 24960, 109566);
            c0VarR = c0Var3;
            c0VarR.o();
            i16 = i16;
            i17 = i17;
            r13 = r13 == true ? 1 : 0;
            i15 = 6;
        }
        c0VarR.A();
        c0VarR.o();
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.i0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayout$lambda$9(teamPresenceUiState, a0Var2, i10, i11, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedTeamPresenceLayout$lambda$8$lambda$4$lambda$3$lambda$2(Header.Expanded.SocialAccount it, Context context) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(context, "$context");
        LinkOpener.handleUrl(it.getProfileUrl(), context, Injector.get().getApi());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedTeamPresenceLayout$lambda$9(ExpandedTeamPresenceState teamPresenceUiState, androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(teamPresenceUiState, "$teamPresenceUiState");
        ExpandedTeamPresenceLayout(teamPresenceUiState, a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void ExpandedTeamPresenceLayoutPreviewWithAssignedAdmin(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1042616954);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ExpandedTeamPresenceLayoutKt.INSTANCE.m290getLambda6$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.j0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayoutPreviewWithAssignedAdmin$lambda$12(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedTeamPresenceLayoutPreviewWithAssignedAdmin$lambda$12(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        ExpandedTeamPresenceLayoutPreviewWithAssignedAdmin(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void ExpandedTeamPresenceLayoutPreviewWithFin(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(467453596);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ExpandedTeamPresenceLayoutKt.INSTANCE.m286getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.k0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayoutPreviewWithFin$lambda$10(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedTeamPresenceLayoutPreviewWithFin$lambda$10(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        ExpandedTeamPresenceLayoutPreviewWithFin(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void ExpandedTeamPresenceLayoutPreviewWithFinAndHumans(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(278476299);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ExpandedTeamPresenceLayoutKt.INSTANCE.m288getLambda4$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.l0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayoutPreviewWithFinAndHumans$lambda$11(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedTeamPresenceLayoutPreviewWithFinAndHumans$lambda$11(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        ExpandedTeamPresenceLayoutPreviewWithFinAndHumans(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    private static final y3 getTextStyleFor(Header.Expanded.Style style, String str, androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        y3 type03;
        androidx.compose.ui.graphics.q0 q0VarN;
        c0Var.E(33871301);
        String str2 = (i11 & 2) != 0 ? null : str;
        int i12 = WhenMappings.$EnumSwitchMapping$1[style.ordinal()];
        if (i12 == 1) {
            c0Var.E(1720557014);
            type03 = IntercomTheme.INSTANCE.getTypography(c0Var, IntercomTheme.$stable).getType03();
            c0Var.A();
        } else if (i12 == 2) {
            c0Var.E(1720559900);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i13 = IntercomTheme.$stable;
            y3 type04 = intercomTheme.getTypography(c0Var, i13).getType04();
            q0VarN = str2 != null ? androidx.compose.ui.graphics.q0.n(ColorExtensionsKt.toComposeColor$default(str2, 0.0f, 1, null)) : null;
            type03 = y3.m(type04, q0VarN == null ? intercomTheme.getColors(c0Var, i13).m699getDescriptionText0d7_KjU() : q0VarN.M(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
            c0Var.A();
        } else if (i12 == 3) {
            c0Var.E(1720565846);
            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
            int i14 = IntercomTheme.$stable;
            y3 type01 = intercomTheme2.getTypography(c0Var, i14).getType01();
            q0VarN = str2 != null ? androidx.compose.ui.graphics.q0.n(ColorExtensionsKt.toComposeColor$default(str2, 0.0f, 1, null)) : null;
            type03 = y3.m(type01, q0VarN == null ? intercomTheme2.getColors(c0Var, i14).m707getIntroText0d7_KjU() : q0VarN.M(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
            c0Var.A();
        } else if (i12 != 4) {
            c0Var.E(1720576342);
            type03 = IntercomTheme.INSTANCE.getTypography(c0Var, IntercomTheme.$stable).getType04();
            c0Var.A();
        } else {
            c0Var.E(1720571705);
            IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
            int i15 = IntercomTheme.$stable;
            y3 type02 = intercomTheme3.getTypography(c0Var, i15).getType01();
            q0VarN = str2 != null ? androidx.compose.ui.graphics.q0.n(ColorExtensionsKt.toComposeColor$default(str2, 0.0f, 1, null)) : null;
            type03 = y3.m(type02, q0VarN == null ? intercomTheme3.getColors(c0Var, i15).m703getGreetingText0d7_KjU() : q0VarN.M(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
            c0Var.A();
        }
        c0Var.A();
        return type03;
    }
}
