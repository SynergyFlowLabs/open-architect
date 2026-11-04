package io.intercom.android.sdk.survey.block;

import android.content.Context;
import android.text.Spanned;
import androidx.compose.foundation.layout.d5;
import androidx.compose.material3.q50;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.ui.graphics.o3;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.c3;
import androidx.compose.ui.text.font.v0;
import androidx.compose.ui.text.p3;
import androidx.compose.ui.text.y0;
import androidx.compose.ui.text.y3;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nCodeBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CodeBlock.kt\nio/intercom/android/sdk/survey/block/CodeBlockKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,51:1\n75#2:52\n113#3:53\n*S KotlinDebug\n*F\n+ 1 CodeBlock.kt\nio/intercom/android/sdk/survey/block/CodeBlockKt\n*L\n27#1:52\n33#1:53\n*E\n"})
public final class CodeBlockKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void CodeBlock(@NotNull final Block block, @Nullable androidx.compose.ui.a0 a0Var, @Nullable Function1<? super p3, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(block, "block");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1370899294);
        androidx.compose.ui.a0 a0Var2 = (i11 & 2) != 0 ? androidx.compose.ui.a0.E : a0Var;
        Function1<? super p3, Unit> function2 = (i11 & 4) != 0 ? new Function1() { // from class: io.intercom.android.sdk.survey.block.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CodeBlockKt.CodeBlock$lambda$0((p3) obj);
            }
        } : function1;
        Spanned spannedA = androidx.core.text.c.a(block.getText(), 0);
        Intrinsics.checkNotNullExpressionValue(spannedA, "fromHtml(...)");
        final Function1<? super p3, Unit> function3 = function2;
        q50.u(BlockExtensionsKt.toAnnotatedString(spannedA, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null), androidx.compose.foundation.v.d(d5.s(a0Var2, androidx.compose.ui.unit.h.r(16), androidx.compose.ui.unit.h.r(12)), androidx.compose.ui.graphics.s0.d(4285098354L), null, 2, null), androidx.compose.ui.graphics.q0.f38131b.w(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, function3, y3.m(IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04(), 0L, 0L, null, null, null, androidx.compose.ui.text.font.y.f41770b.c(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777183, null), c0VarR, a5.S0, (i10 << 15) & 29360128, 131064);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.a0 a0Var3 = a0Var2;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.block.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CodeBlockKt.CodeBlock$lambda$1(block, a0Var3, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CodeBlock$lambda$0(p3 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CodeBlock$lambda$1(Block block, androidx.compose.ui.a0 a0Var, Function1 function1, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(block, "$block");
        CodeBlock(block, a0Var, function1, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void CodeBlockPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1610207419);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$CodeBlockKt.INSTANCE.m448getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.block.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CodeBlockKt.CodeBlockPreview$lambda$2(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CodeBlockPreview$lambda$2(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        CodeBlockPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
