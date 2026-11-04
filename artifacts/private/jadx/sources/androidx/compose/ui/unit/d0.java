package androidx.compose.ui.unit;

import androidx.compose.runtime.k7;
import com.rabbitmq.client.k0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nVelocity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Velocity.kt\nandroidx/compose/ui/unit/VelocityKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,147:1\n53#2,3:148\n*S KotlinDebug\n*F\n+ 1 Velocity.kt\nandroidx/compose/ui/unit/VelocityKt\n*L\n33#1:148,3\n*E\n"})
public final class d0 {
    @k7
    public static final long a(float f10, float f11) {
        return c0.e((((long) Float.floatToRawIntBits(f11)) & k0.f265952a) | (Float.floatToRawIntBits(f10) << 32));
    }
}
