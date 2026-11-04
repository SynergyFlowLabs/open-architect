package androidx.compose.ui.input.indirect;

import android.view.MotionEvent;
import androidx.compose.ui.p;
import com.rabbitmq.client.k0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nAndroidIndirectTouchEvent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidIndirectTouchEvent.android.kt\nandroidx/compose/ui/input/indirect/AndroidIndirectTouchEvent_androidKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,58:1\n30#2:59\n53#3,3:60\n*S KotlinDebug\n*F\n+ 1 AndroidIndirectTouchEvent.android.kt\nandroidx/compose/ui/input/indirect/AndroidIndirectTouchEvent_androidKt\n*L\n43#1:59\n43#1:60,3\n*E\n"})
public final class b {
    @p
    @NotNull
    public static final c a(@NotNull MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        return new a(n0.g.g((((long) Float.floatToRawIntBits(motionEvent.getY())) & k0.f265952a) | (Float.floatToRawIntBits(x10) << 32)), motionEvent.getEventTime(), b(motionEvent.getActionMasked()), motionEvent, null);
    }

    public static final int b(int i10) {
        if (i10 == 0) {
            return d.f38742b.b();
        }
        if (i10 != 1) {
            return i10 != 2 ? d.f38742b.d() : d.f38742b.a();
        }
        return d.f38742b.c();
    }

    @NotNull
    public static final MotionEvent c(@NotNull c cVar) {
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.input.indirect.AndroidIndirectTouchEvent");
        return ((a) cVar).d();
    }

    @p
    public static /* synthetic */ void d(c cVar) {
    }
}
