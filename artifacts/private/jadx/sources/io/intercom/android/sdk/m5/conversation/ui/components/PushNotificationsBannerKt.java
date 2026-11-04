package io.intercom.android.sdk.m5.conversation.ui.components;

import android.content.Context;
import android.text.Spanned;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.x5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.ei;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.material3.u10;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.graphics.o3;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.c3;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.block.BlockExtensionsKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nPushNotificationsBanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushNotificationsBanner.kt\nio/intercom/android/sdk/m5/conversation/ui/components/PushNotificationsBannerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,108:1\n1282#2,6:109\n1282#2,6:115\n85#3:121\n117#3,2:122\n*S KotlinDebug\n*F\n+ 1 PushNotificationsBanner.kt\nio/intercom/android/sdk/m5/conversation/ui/components/PushNotificationsBannerKt\n*L\n39#1:109,6\n42#1:115,6\n39#1:121\n39#1:122,2\n*E\n"})
public final class PushNotificationsBannerKt {
    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ContextualPushNotificationsReminderPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-119534126);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$PushNotificationsBannerKt.INSTANCE.m222getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.o2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PushNotificationsBannerKt.ContextualPushNotificationsReminderPreview$lambda$5(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContextualPushNotificationsReminderPreview$lambda$5(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        ContextualPushNotificationsReminderPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void PushNotificationsBanner(@NotNull final Function0<Unit> onEnable, @NotNull final Function0<Unit> onClose, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(onEnable, "onEnable");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-2004591797);
        if ((i10 & 14) == 0) {
            i11 = (c0VarR.k0(onEnable) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i11 |= c0VarR.k0(onClose) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && c0VarR.d()) {
            c0VarR.u();
        } else {
            c0VarR.E(-633266491);
            Object objI0 = c0VarR.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = d7.g(Boolean.FALSE, null, 2, null);
                c0VarR.Y(objI0);
            }
            n3 n3Var = (n3) objI0;
            c0VarR.A();
            Unit unit = Unit.f312394a;
            c0VarR.E(-633262429);
            Object objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                objI1 = new PushNotificationsBannerKt$PushNotificationsBanner$1$1(n3Var, null);
                c0VarR.Y(objI1);
            }
            c0VarR.A();
            androidx.compose.runtime.b2.i(unit, (Function2) objI1, c0VarR, 70);
            int i12 = 2 ^ 0;
            androidx.compose.animation.k.j(PushNotificationsBanner$lambda$1(n3Var), null, androidx.compose.animation.b0.o(androidx.compose.animation.core.p.t(300, 0, androidx.compose.animation.core.s0.J(), 2, null), 0.0f, 2, null), null, null, androidx.compose.runtime.internal.w.e(1923339635, true, new pj.n<androidx.compose.animation.l, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.PushNotificationsBannerKt.PushNotificationsBanner.2
                @Override // pj.n
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.animation.l lVar, androidx.compose.runtime.c0 c0Var2, Integer num) {
                    invoke(lVar, c0Var2, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.animation.l AnimatedVisibility, androidx.compose.runtime.c0 c0Var2, int i13) {
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    Function0<Unit> function0 = onEnable;
                    long jM715getReminderBackgroundColor0d7_KjU = IntercomTheme.INSTANCE.getColors(c0Var2, IntercomTheme.$stable).m715getReminderBackgroundColor0d7_KjU();
                    final Function0<Unit> function1 = onClose;
                    u10.f(function0, null, false, null, jM715getReminderBackgroundColor0d7_KjU, 0L, 0.0f, 0.0f, null, null, androidx.compose.runtime.internal.w.e(-1181560824, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.PushNotificationsBannerKt.PushNotificationsBanner.2.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                            invoke(c0Var3, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var3, int i14) {
                            if ((i14 & 11) == 2 && c0Var3.d()) {
                                c0Var3.u();
                                return;
                            }
                            androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
                            androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
                            float f10 = 16;
                            androidx.compose.ui.a0 a0VarV = d5.v(i6.h(aVar2, 0.0f, 1, null), androidx.compose.ui.unit.h.r(f10), 0.0f, 0.0f, 0.0f, 14, null);
                            Function0<Unit> function2 = function1;
                            androidx.compose.ui.layout.a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ, c0Var3, 48);
                            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, 0));
                            androidx.compose.runtime.b1 b1VarK = c0Var3.k();
                            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var3, a0VarV);
                            androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
                            Function0<androidx.compose.ui.node.g> function0A = aVar3.a();
                            if (c0Var3.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0Var3.q();
                            if (c0Var3.P()) {
                                c0Var3.q0(function0A);
                            } else {
                                c0Var3.l();
                            }
                            androidx.compose.runtime.c0 c0VarD = y7.d(c0Var3);
                            y7.n(c0VarD, a1VarE, aVar3.e());
                            y7.n(c0VarD, b1VarK, aVar3.g());
                            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
                            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            }
                            y7.n(c0VarD, a0VarN, aVar3.f());
                            y5 y5Var = y5.f16577a;
                            androidx.compose.ui.graphics.painter.b bVarC = u0.e.c(R.drawable.intercom_ticket_notification, c0Var3, 0);
                            androidx.compose.ui.a0 a0VarW = i6.w(aVar2, androidx.compose.ui.unit.h.r(f10));
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i15 = IntercomTheme.$stable;
                            ni.o(bVarC, null, a0VarW, intercomTheme.getColors(c0Var3, i15).m716getReminderTextColor0d7_KjU(), c0Var3, 440, 0);
                            Spanned spannedA = androidx.core.text.c.a(u0.i.d(R.string.intercom_notification_enable_prompt, c0Var3, 0), 0);
                            Intrinsics.checkNotNullExpressionValue(spannedA, "fromHtml(...)");
                            q50.u(BlockExtensionsKt.toAnnotatedString(spannedA, (Context) c0Var3.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null), d5.r(x5.q(y5Var, aVar2, 1.0f, false, 2, null), androidx.compose.ui.unit.h.r(8)), intercomTheme.getColors(c0Var3, i15).m716getReminderTextColor0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme.getTypography(c0Var3, i15).getType04Point5(), c0Var3, 0, 0, 262136);
                            ei.D(function2, null, false, null, null, null, ComposableSingletons$PushNotificationsBannerKt.INSTANCE.m221getLambda1$intercom_sdk_base_release(), c0Var3, 1572864, 62);
                            c0Var3.o();
                        }
                    }, c0Var2, 54), c0Var2, 0, 6, 1006);
                }
            }, c0VarR, 54), c0VarR, androidx.profileinstaller.n.c.f73814m, 26);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.n2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PushNotificationsBannerKt.PushNotificationsBanner$lambda$4(onEnable, onClose, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean PushNotificationsBanner$lambda$1(n3<Boolean> n3Var) {
        return n3Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PushNotificationsBanner$lambda$2(n3<Boolean> n3Var, boolean z10) {
        n3Var.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PushNotificationsBanner$lambda$4(Function0 onEnable, Function0 onClose, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(onEnable, "$onEnable");
        Intrinsics.checkNotNullParameter(onClose, "$onClose");
        PushNotificationsBanner(onEnable, onClose, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
