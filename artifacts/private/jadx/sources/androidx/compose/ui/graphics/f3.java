package androidx.compose.ui.graphics;

import androidx.compose.runtime.k7;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nRenderEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderEffect.kt\nandroidx/compose/ui/graphics/RenderEffectKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,78:1\n30#2:79\n53#3,3:80\n*S KotlinDebug\n*F\n+ 1 RenderEffect.kt\nandroidx/compose/ui/graphics/RenderEffectKt\n*L\n71#1:79\n71#1:80,3\n*E\n"})
public final class f3 {
    @k7
    @NotNull
    public static final h0 a(float f10, float f11, int i10) {
        return new h0(null, f10, f11, i10, null);
    }

    public static /* synthetic */ h0 b(float f10, float f11, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = x3.f38688b.a();
        }
        return a(f10, f11, i10);
    }

    @k7
    @NotNull
    public static final e2 c(float f10, float f11) {
        return new e2(null, n0.g.g((((long) Float.floatToRawIntBits(f11)) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(f10) << 32)), null);
    }
}
