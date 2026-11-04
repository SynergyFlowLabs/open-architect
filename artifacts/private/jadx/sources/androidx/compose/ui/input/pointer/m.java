package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(29)
@SourceDebugExtension({"SMAP\nMotionEventAdapter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MotionEventAdapter.android.kt\nandroidx/compose/ui/input/pointer/MotionEventHelper\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,349:1\n30#2:350\n53#3,3:351\n*S KotlinDebug\n*F\n+ 1 MotionEventAdapter.android.kt\nandroidx/compose/ui/input/pointer/MotionEventHelper\n*L\n346#1:350\n346#1:351,3\n*E\n"})
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final m f39065a = new m();

    private m() {
    }

    public final long a(@NotNull MotionEvent motionEvent, int i10) {
        float rawX = motionEvent.getRawX(i10);
        return n0.g.g((((long) Float.floatToRawIntBits(motionEvent.getRawY(i10))) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(rawX) << 32));
    }
}
