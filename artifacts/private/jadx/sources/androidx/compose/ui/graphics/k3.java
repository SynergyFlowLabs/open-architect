package androidx.compose.ui.graphics;

import android.graphics.RenderEffect;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(31)
@SourceDebugExtension({"SMAP\nAndroidRenderEffect.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidRenderEffect.android.kt\nandroidx/compose/ui/graphics/RenderEffectVerificationHelper\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,168:1\n65#2:169\n69#2:172\n65#2:174\n69#2:177\n60#3:170\n70#3:173\n60#3:175\n70#3:178\n22#4:171\n22#4:176\n22#4:179\n*S KotlinDebug\n*F\n+ 1 AndroidRenderEffect.android.kt\nandroidx/compose/ui/graphics/RenderEffectVerificationHelper\n*L\n159#1:169\n159#1:172\n162#1:174\n163#1:177\n159#1:170\n159#1:173\n162#1:175\n163#1:178\n159#1:171\n162#1:176\n163#1:179\n*E\n"})
final class k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final k3 f37833a = new k3();

    private k3() {
    }

    @NotNull
    public final RenderEffect a(@Nullable e3 e3Var, float f10, float f11, int i10) {
        if (f10 == 0.0f && f11 == 0.0f) {
            return RenderEffect.createOffsetEffect(0.0f, 0.0f);
        }
        return e3Var == null ? RenderEffect.createBlurEffect(f10, f11, z.b(i10)) : RenderEffect.createBlurEffect(f10, f11, e3Var.a(), z.b(i10));
    }

    @NotNull
    public final RenderEffect b(@Nullable e3 e3Var, long j10) {
        return e3Var == null ? RenderEffect.createOffsetEffect(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a))) : RenderEffect.createOffsetEffect(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)), e3Var.a());
    }
}
