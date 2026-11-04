package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nBotAndHumansFacePile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BotAndHumansFacePile.kt\nio/intercom/android/sdk/m5/components/BotAndHumansFacePileKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 10 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 11 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 12 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,123:1\n127#2:124\n127#2:125\n127#2:126\n52#3:127\n52#3:177\n52#3:257\n99#4,6:128\n106#4:176\n80#5,6:134\n87#5,3:149\n90#5,2:158\n94#5:175\n391#6,9:140\n400#6:160\n401#6,2:173\n4360#7,6:152\n1282#8,6:161\n1282#8,6:167\n202#9,5:178\n207#9,3:186\n249#9,14:189\n202#9,4:203\n206#9:210\n207#9,3:213\n249#9,14:216\n202#9,4:230\n206#9:237\n207#9,3:240\n249#9,14:243\n202#9,5:258\n207#9,3:266\n249#9,14:269\n61#10:183\n57#10:207\n61#10:211\n57#10:234\n61#10:238\n61#10:263\n70#11:184\n60#11:208\n70#11:212\n60#11:235\n70#11:239\n70#11:264\n22#12:185\n22#12:209\n22#12:236\n22#12:265\n*S KotlinDebug\n*F\n+ 1 BotAndHumansFacePile.kt\nio/intercom/android/sdk/m5/components/BotAndHumansFacePileKt\n*L\n29#1:124\n30#1:125\n31#1:126\n35#1:127\n45#1:177\n73#1:257\n33#1:128,6\n33#1:176\n33#1:134,6\n33#1:149,3\n33#1:158,2\n33#1:175\n33#1:140,9\n33#1:160\n33#1:173,2\n33#1:152,6\n43#1:161,6\n67#1:167,6\n45#1:178,5\n45#1:186,3\n45#1:189,14\n49#1:203,4\n49#1:210\n49#1:213,3\n49#1:216,14\n69#1:230,4\n69#1:237\n69#1:240,3\n69#1:243,14\n73#1:258,5\n73#1:266,3\n73#1:269,14\n45#1:183\n49#1:207\n49#1:211\n69#1:234\n69#1:238\n73#1:263\n45#1:184\n49#1:208\n49#1:212\n69#1:235\n69#1:239\n73#1:264\n45#1:185\n49#1:209\n69#1:236\n73#1:265\n*E\n"})
public final class BotAndHumansFacePileKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    /* JADX INFO: renamed from: BotAndHumansFacePile-hGBTI10, reason: not valid java name */
    public static final void m103BotAndHumansFacePilehGBTI10(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final Avatar botAvatar, @NotNull final Pair<? extends Avatar, ? extends Avatar> teammateAvatarPair, final float f10, @Nullable String str, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        DefaultConstructorMarker defaultConstructorMarker;
        int i12;
        boolean z10;
        Intrinsics.checkNotNullParameter(botAvatar, "botAvatar");
        Intrinsics.checkNotNullParameter(teammateAvatarPair, "teammateAvatarPair");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(957129373);
        androidx.compose.ui.a0 a0Var2 = (i11 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var;
        String str2 = (i11 & 16) != 0 ? "" : str;
        final float fR = androidx.compose.ui.unit.h.r(((float) 0.75d) * f10);
        final float fR2 = androidx.compose.ui.unit.h.r(((float) 0.25d) * fR);
        androidx.compose.ui.layout.a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(((float) 0.0625d) * f10) - fR2)), androidx.compose.ui.e.f37317a.q(), c0VarR, 48);
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
        y7.n(c0VarD, a1VarE, aVar.e());
        y7.n(c0VarD, b1VarK, aVar.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar.f());
        y5 y5Var = y5.f16577a;
        Avatar first = teammateAvatarPair.getFirst();
        c0VarR.E(1213840539);
        if (first == null) {
            z10 = false;
            defaultConstructorMarker = null;
            i12 = 2;
        } else {
            AvatarWrapper avatarWrapper = new AvatarWrapper(first, false, 2, null);
            androidx.compose.ui.a0 a0VarW = i6.w(androidx.compose.ui.a0.E, fR);
            c0VarR.E(1012545465);
            boolean zI = c0VarR.I(fR) | c0VarR.I(fR2);
            Object objI0 = c0VarR.i0();
            if (zI || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.components.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BotAndHumansFacePileKt.BotAndHumansFacePile_hGBTI10$lambda$10$lambda$4$lambda$3$lambda$2(fR, fR2, (androidx.compose.ui.graphics.drawscope.c) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            defaultConstructorMarker = null;
            i12 = 2;
            z10 = false;
            AvatarIconKt.m173AvatarIconRd90Nhg(androidx.compose.ui.draw.n.d(a0VarW, (Function1) objI0), avatarWrapper, null, false, 0L, null, c0VarR, 64, 60);
        }
        c0VarR.A();
        androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
        AvatarIconKt.m173AvatarIconRd90Nhg(i6.w(aVar2, f10), new AvatarWrapper(botAvatar, true), null, false, 0L, null, c0VarR, 64, 60);
        Avatar second = teammateAvatarPair.getSecond();
        c0VarR.E(1213869401);
        if (second != null) {
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(second, z10, i12, defaultConstructorMarker);
            androidx.compose.ui.a0 a0VarW2 = i6.w(aVar2, fR);
            c0VarR.E(1012574327);
            boolean zI2 = c0VarR.I(fR2) | c0VarR.I(fR);
            Object objI1 = c0VarR.i0();
            if (zI2 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = new Function1() { // from class: io.intercom.android.sdk.m5.components.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BotAndHumansFacePileKt.BotAndHumansFacePile_hGBTI10$lambda$10$lambda$9$lambda$8$lambda$7(fR2, fR, (androidx.compose.ui.graphics.drawscope.c) obj);
                    }
                };
                c0VarR.Y(objI1);
            }
            c0VarR.A();
            AvatarIconKt.m173AvatarIconRd90Nhg(androidx.compose.ui.draw.n.d(a0VarW2, (Function1) objI1), avatarWrapper2, null, false, 0L, null, c0VarR, 64, 60);
        }
        c0VarR.A();
        c0VarR.o();
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final String str3 = str2;
            final androidx.compose.ui.a0 a0Var3 = a0Var2;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BotAndHumansFacePileKt.BotAndHumansFacePile_hGBTI10$lambda$11(a0Var3, botAvatar, teammateAvatarPair, f10, str3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotAndHumansFacePile_hGBTI10$lambda$10$lambda$4$lambda$3$lambda$2(float f10, float f11, androidx.compose.ui.graphics.drawscope.c drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        if (drawWithContent.getLayoutDirection() == androidx.compose.ui.unit.w.Ltr) {
            float fS7 = drawWithContent.S7(androidx.compose.ui.unit.h.r(f10 - f11));
            float fIntBitsToFloat = Float.intBitsToFloat((int) (drawWithContent.d() & com.rabbitmq.client.k0.f265952a));
            int iB = androidx.compose.ui.graphics.p0.f38096b.b();
            androidx.compose.ui.graphics.drawscope.d dVarZ3 = drawWithContent.Z3();
            long jD = dVarZ3.d();
            dVarZ3.f().save();
            try {
                dVarZ3.i().b(0.0f, 0.0f, fS7, fIntBitsToFloat, iB);
                drawWithContent.E4();
                dVarZ3.f().B();
                dVarZ3.g(jD);
            } catch (Throwable th2) {
                dVarZ3.f().B();
                dVarZ3.g(jD);
                throw th2;
            }
        } else {
            float fS8 = drawWithContent.S7(f11);
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawWithContent.d() >> 32));
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (drawWithContent.d() & com.rabbitmq.client.k0.f265952a));
            int iB2 = androidx.compose.ui.graphics.p0.f38096b.b();
            androidx.compose.ui.graphics.drawscope.d dVarZ4 = drawWithContent.Z3();
            long jD2 = dVarZ4.d();
            dVarZ4.f().save();
            try {
                dVarZ4.i().b(fS8, 0.0f, fIntBitsToFloat2, fIntBitsToFloat3, iB2);
                drawWithContent.E4();
                dVarZ4.f().B();
                dVarZ4.g(jD2);
            } catch (Throwable th3) {
                dVarZ4.f().B();
                dVarZ4.g(jD2);
                throw th3;
            }
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotAndHumansFacePile_hGBTI10$lambda$10$lambda$9$lambda$8$lambda$7(float f10, float f11, androidx.compose.ui.graphics.drawscope.c drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        if (drawWithContent.getLayoutDirection() == androidx.compose.ui.unit.w.Ltr) {
            float fS7 = drawWithContent.S7(f10);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (drawWithContent.d() >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawWithContent.d() & com.rabbitmq.client.k0.f265952a));
            int iB = androidx.compose.ui.graphics.p0.f38096b.b();
            androidx.compose.ui.graphics.drawscope.d dVarZ3 = drawWithContent.Z3();
            long jD = dVarZ3.d();
            dVarZ3.f().save();
            try {
                dVarZ3.i().b(fS7, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, iB);
                drawWithContent.E4();
                dVarZ3.f().B();
                dVarZ3.g(jD);
            } catch (Throwable th2) {
                dVarZ3.f().B();
                dVarZ3.g(jD);
                throw th2;
            }
        } else {
            float fS8 = drawWithContent.S7(androidx.compose.ui.unit.h.r(f11 - f10));
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (drawWithContent.d() & com.rabbitmq.client.k0.f265952a));
            int iB2 = androidx.compose.ui.graphics.p0.f38096b.b();
            androidx.compose.ui.graphics.drawscope.d dVarZ4 = drawWithContent.Z3();
            long jD2 = dVarZ4.d();
            dVarZ4.f().save();
            try {
                int i10 = 4 >> 0;
                dVarZ4.i().b(0.0f, 0.0f, fS8, fIntBitsToFloat3, iB2);
                drawWithContent.E4();
                dVarZ4.f().B();
                dVarZ4.g(jD2);
            } catch (Throwable th3) {
                dVarZ4.f().B();
                dVarZ4.g(jD2);
                throw th3;
            }
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotAndHumansFacePile_hGBTI10$lambda$11(androidx.compose.ui.a0 a0Var, Avatar botAvatar, Pair teammateAvatarPair, float f10, String str, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(botAvatar, "$botAvatar");
        Intrinsics.checkNotNullParameter(teammateAvatarPair, "$teammateAvatarPair");
        m103BotAndHumansFacePilehGBTI10(a0Var, botAvatar, teammateAvatarPair, f10, str, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void BotWithTwoTeammatesPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-366024049);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BotAndHumansFacePileKt.INSTANCE.m109getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BotAndHumansFacePileKt.BotWithTwoTeammatesPreview$lambda$12(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotWithTwoTeammatesPreview$lambda$12(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        BotWithTwoTeammatesPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void BotsWithOneTeammatePreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1130939763);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BotAndHumansFacePileKt.INSTANCE.m110getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BotAndHumansFacePileKt.BotsWithOneTeammatePreview$lambda$13(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotsWithOneTeammatePreview$lambda$13(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        BotsWithOneTeammatePreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @NotNull
    public static final Pair<Avatar, Avatar> humanAvatarPairForHome(@NotNull List<? extends Avatar> humanAvatars) {
        Intrinsics.checkNotNullParameter(humanAvatars, "humanAvatars");
        int size = humanAvatars.size();
        if (size != 0) {
            return size != 1 ? new Pair<>(humanAvatars.get(0), humanAvatars.get(1)) : new Pair<>(null, humanAvatars.get(0));
        }
        return TuplesKt.to(null, null);
    }
}
