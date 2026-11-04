package androidx.compose.ui.input.pointer;

import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nPointerInputEventProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputEventProcessorKt\n*L\n1#1,288:1\n287#1:289\n287#1:290\n287#1:291\n*S KotlinDebug\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputEventProcessorKt\n*L\n281#1:289\n282#1:290\n283#1:291\n*E\n"})
public final class h0 {
    public static final int a(boolean z10, boolean z11, boolean z12) {
        return t0.b((z10 ? 1 : 0) | ((z11 ? 1 : 0) << 1) | ((z12 ? 1 : 0) << 2));
    }

    private static final int b(boolean z10) {
        return z10 ? 1 : 0;
    }
}
