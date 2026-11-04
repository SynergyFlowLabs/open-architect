package androidx.compose.ui.platform;

import androidx.compose.runtime.k7;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@k7
@SourceDebugExtension({"SMAP\nWindowInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInfo.kt\nandroidx/compose/ui/platform/WindowInfo\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,89:1\n30#2:90\n80#3:91\n*S KotlinDebug\n*F\n+ 1 WindowInfo.kt\nandroidx/compose/ui/platform/WindowInfo\n*L\n54#1:90\n54#1:91\n*E\n"})
public interface w4 {
    default int a() {
        return x4.f40964c.a().getValue().g();
    }

    default long b() {
        long j10 = Integer.MIN_VALUE;
        return androidx.compose.ui.unit.u.e((j10 & com.rabbitmq.client.k0.f265952a) | (j10 << 32));
    }

    boolean c();
}
