package io.intercom.android.sdk.m5.helpcenter.ui.components;

import android.content.Context;
import androidx.compose.material3.q50;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.ui.graphics.s0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.Phrase;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nArticleCountComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArticleCountComponent.kt\nio/intercom/android/sdk/m5/helpcenter/ui/components/ArticleCountComponentKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,52:1\n75#2:53\n75#2:54\n*S KotlinDebug\n*F\n+ 1 ArticleCountComponent.kt\nio/intercom/android/sdk/m5/helpcenter/ui/components/ArticleCountComponentKt\n*L\n17#1:53\n19#1:54\n*E\n"})
public final class ArticleCountComponentKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ArticleCountComponent(@Nullable androidx.compose.ui.a0 a0Var, final int i10, @Nullable androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        final androidx.compose.ui.a0 a0Var2;
        int i13;
        CharSequence charSequence;
        androidx.compose.runtime.c0 c0Var2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-731744304);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            a0Var2 = a0Var;
        } else if ((i11 & 14) == 0) {
            a0Var2 = a0Var;
            i13 = (c0VarR.D(a0Var2) ? 4 : 2) | i11;
        } else {
            a0Var2 = a0Var;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i13 |= c0VarR.K(i10) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && c0VarR.d()) {
            c0VarR.u();
            c0Var2 = c0VarR;
        } else {
            if (i14 != 0) {
                a0Var2 = androidx.compose.ui.a0.E;
            }
            if (i10 == 1) {
                c0VarR.E(1038713318);
                charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_single_article).format();
                c0VarR.A();
            } else {
                c0VarR.E(1038811929);
                charSequence = Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_multiple_articles).put("total_articles", i10).format();
                c0VarR.A();
            }
            c0Var2 = c0VarR;
            q50.t(charSequence.toString(), a0Var2, s0.d(4285887861L), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04Point5(), c0Var2, ((i13 << 3) & com.planner5d.library.engine.input.f.b.B) | a5.S0, 0, 131064);
        }
        s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ArticleCountComponentKt.ArticleCountComponent$lambda$0(a0Var2, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ArticleCountComponent$lambda$0(androidx.compose.ui.a0 a0Var, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        ArticleCountComponent(a0Var, i10, c0Var, t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ArticleCountComponentPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1155458330);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ArticleCountComponentKt.INSTANCE.m338getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ArticleCountComponentKt.ArticleCountComponentPreview$lambda$1(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ArticleCountComponentPreview$lambda$1(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        ArticleCountComponentPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void SingleArticleCountComponentPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1795936462);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ArticleCountComponentKt.INSTANCE.m339getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ArticleCountComponentKt.SingleArticleCountComponentPreview$lambda$2(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SingleArticleCountComponentPreview$lambda$2(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        SingleArticleCountComponentPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
