package androidx.compose.foundation.gestures;

import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nMouseWheelScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MouseWheelScrollable.kt\nandroidx/compose/foundation/gestures/MouseWheelScrollableKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,359:1\n113#2:360\n113#2:361\n*S KotlinDebug\n*F\n+ 1 MouseWheelScrollable.kt\nandroidx/compose/foundation/gestures/MouseWheelScrollableKt\n*L\n355#1:360\n356#1:361\n*E\n"})
public final class h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f14601a = androidx.compose.ui.unit.h.r(6);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f14602b = androidx.compose.ui.unit.h.r(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f14603c = 100;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f14604d = 50;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(float f10) {
        return Float.isNaN(f10) || Math.abs(f10) < 0.5f;
    }
}
