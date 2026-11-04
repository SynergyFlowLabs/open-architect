package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nPointerInteropUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInteropUtils.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropUtils_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,79:1\n1#2:80\n65#3:81\n69#3:84\n65#3:86\n69#3:89\n60#4:82\n70#4:85\n60#4:87\n70#4:90\n22#5:83\n22#5:88\n*S KotlinDebug\n*F\n+ 1 PointerInteropUtils.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropUtils_androidKt\n*L\n70#1:81\n70#1:84\n74#1:86\n74#1:89\n70#1:82\n70#1:85\n74#1:87\n74#1:90\n70#1:83\n74#1:88\n*E\n"})
public final class p0 {
    public static final void a(long j10, @NotNull Function1<? super MotionEvent, Unit> function1) {
        MotionEvent motionEventObtain = MotionEvent.obtain(j10, j10, 3, 0.0f, 0.0f, 0);
        motionEventObtain.setSource(0);
        function1.invoke(motionEventObtain);
        motionEventObtain.recycle();
    }

    public static /* synthetic */ void b(long j10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = SystemClock.uptimeMillis();
        }
        a(j10, function1);
    }

    public static final void c(@NotNull q qVar, long j10, @NotNull Function1<? super MotionEvent, Unit> function1) {
        e(qVar, j10, function1, true);
    }

    public static final void d(@NotNull q qVar, long j10, @NotNull Function1<? super MotionEvent, Unit> function1) {
        e(qVar, j10, function1, false);
    }

    private static final void e(q qVar, long j10, Function1<? super MotionEvent, Unit> function1, boolean z10) {
        MotionEvent motionEventI = qVar.i();
        if (motionEventI == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEventI.getAction();
        if (z10) {
            motionEventI.setAction(3);
        }
        int i10 = (int) (j10 >> 32);
        float f10 = -Float.intBitsToFloat(i10);
        int i11 = (int) (j10 & com.rabbitmq.client.k0.f265952a);
        motionEventI.offsetLocation(f10, -Float.intBitsToFloat(i11));
        function1.invoke(motionEventI);
        motionEventI.offsetLocation(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11));
        motionEventI.setAction(action);
    }
}
