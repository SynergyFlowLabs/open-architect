package androidx.compose.foundation.gestures;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nMouseWheelScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MouseWheelScrollable.kt\nandroidx/compose/foundation/gestures/MouseWheelVelocityTracker\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,359:1\n65#2:360\n69#2:363\n60#3:361\n70#3:364\n22#4:362\n22#4:365\n*S KotlinDebug\n*F\n+ 1 MouseWheelScrollable.kt\nandroidx/compose/foundation/gestures/MouseWheelVelocityTracker\n*L\n338#1:360\n339#1:363\n338#1:361\n339#1:364\n338#1:362\n339#1:365\n*E\n"})
final class n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final r0.d f14844a = new r0.d(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final r0.d f14845b = new r0.d(true);

    public final void a(long j10, long j11) {
        this.f14844a.a(j10, Float.intBitsToFloat((int) (j11 >> 32)));
        this.f14845b.a(j10, Float.intBitsToFloat((int) (j11 & com.rabbitmq.client.k0.f265952a)));
    }

    public final long b() {
        return androidx.compose.ui.unit.d0.a(this.f14844a.d(Float.MAX_VALUE), this.f14845b.d(Float.MAX_VALUE));
    }
}
