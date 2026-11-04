package io.intercom.android.sdk.m5.conversation.ui.components.row;

import android.content.Context;
import android.text.Spanned;
import androidx.compose.material3.q50;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.ui.graphics.o3;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.c3;
import androidx.compose.ui.text.y3;
import io.intercom.android.sdk.survey.block.BlockExtensionsKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nTeamIntro.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TeamIntro.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/TeamIntroKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,39:1\n75#2:40\n*S KotlinDebug\n*F\n+ 1 TeamIntro.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/TeamIntroKt\n*L\n22#1:40\n*E\n"})
public final class TeamIntroKt {
    /* JADX WARN: Code duplicated, block: B:30:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TeamIntro(@NotNull final String text, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        androidx.compose.ui.a0 a0Var3;
        final androidx.compose.ui.a0 a0Var4;
        androidx.compose.runtime.c0 c0Var2;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(text, "text");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(673666815);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.D(text) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 == 0) {
            if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i12 & 91) == 18 || !c0VarR.d()) {
                if (i13 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                Spanned spannedA = androidx.core.text.c.a(text, 0);
                Intrinsics.checkNotNullExpressionValue(spannedA, "fromHtml(...)");
                androidx.compose.ui.text.f annotatedString = BlockExtensionsKt.toAnnotatedString(spannedA, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i14 = IntercomTheme.$stable;
                a0Var4 = a0Var3;
                c0Var2 = c0VarR;
                q50.u(annotatedString, a0Var4, 0L, null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(androidx.compose.ui.text.style.j.f42206b.a()), 0L, 0, false, 0, 0, null, null, y3.m(intercomTheme.getTypography(c0VarR, i14).getType04Point5(), intercomTheme.getColors(c0VarR, i14).m699getDescriptionText0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0Var2, i12 & com.planner5d.library.engine.input.f.b.B, 0, 261116);
            } else {
                c0VarR.u();
                c0Var2 = c0VarR;
                a0Var4 = a0Var2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.y1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TeamIntroKt.TeamIntro$lambda$0(text, a0Var4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        if ((i12 & 91) == 18) {
            if (i13 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            Spanned spannedA2 = androidx.core.text.c.a(text, 0);
            Intrinsics.checkNotNullExpressionValue(spannedA2, "fromHtml(...)");
            androidx.compose.ui.text.f annotatedString2 = BlockExtensionsKt.toAnnotatedString(spannedA2, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
            int i15 = IntercomTheme.$stable;
            a0Var4 = a0Var3;
            c0Var2 = c0VarR;
            q50.u(annotatedString2, a0Var4, 0L, null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(androidx.compose.ui.text.style.j.f42206b.a()), 0L, 0, false, 0, 0, null, null, y3.m(intercomTheme2.getTypography(c0VarR, i15).getType04Point5(), intercomTheme2.getColors(c0VarR, i15).m699getDescriptionText0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0Var2, i12 & com.planner5d.library.engine.input.f.b.B, 0, 261116);
        } else {
            if (i13 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            Spanned spannedA3 = androidx.core.text.c.a(text, 0);
            Intrinsics.checkNotNullExpressionValue(spannedA3, "fromHtml(...)");
            androidx.compose.ui.text.f annotatedString3 = BlockExtensionsKt.toAnnotatedString(spannedA3, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
            IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
            int i16 = IntercomTheme.$stable;
            a0Var4 = a0Var3;
            c0Var2 = c0VarR;
            q50.u(annotatedString3, a0Var4, 0L, null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(androidx.compose.ui.text.style.j.f42206b.a()), 0L, 0, false, 0, 0, null, null, y3.m(intercomTheme3.getTypography(c0VarR, i16).getType04Point5(), intercomTheme3.getColors(c0VarR, i16).m699getDescriptionText0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0Var2, i12 & com.planner5d.library.engine.input.f.b.B, 0, 261116);
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.y1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TeamIntroKt.TeamIntro$lambda$0(text, a0Var4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TeamIntro$lambda$0(String text, androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(text, "$text");
        TeamIntro(text, a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TeamIntroPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(825513769);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TeamIntroKt.INSTANCE.m305getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.x1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TeamIntroKt.TeamIntroPreview$lambda$1(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TeamIntroPreview$lambda$1(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TeamIntroPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
