package androidx.compose.foundation.gestures;

import android.view.ViewConfiguration;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAndroidScrollable.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidScrollable.android.kt\nandroidx/compose/foundation/gestures/AndroidConfig\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,72:1\n113#2:73\n113#2:74\n270#3,2:75\n35#3,5:77\n272#3:82\n1#4:83\n65#5:84\n69#5:87\n60#6:85\n70#6:88\n53#6,3:90\n22#7:86\n30#8:89\n*S KotlinDebug\n*F\n+ 1 AndroidScrollable.android.kt\nandroidx/compose/foundation/gestures/AndroidConfig\n*L\n42#1:73\n50#1:74\n57#1:75,2\n57#1:77,5\n57#1:82\n58#1:84\n58#1:87\n58#1:85\n58#1:88\n58#1:90,3\n58#1:86\n58#1:89\n*E\n"})
public final class e0 implements u3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f14538b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ViewConfiguration f14539a;

    public e0(@NotNull ViewConfiguration viewConfiguration) {
        this.f14539a = viewConfiguration;
    }

    @Override // androidx.compose.foundation.gestures.u3
    public long c(@NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.input.pointer.q qVar, long j10) {
        float f10 = -e(dVar);
        float f11 = -d(dVar);
        List<androidx.compose.ui.input.pointer.c0> listE = qVar.e();
        n0.g gVarD = n0.g.d(n0.g.f332700b.e());
        int size = listE.size();
        for (int i10 = 0; i10 < size; i10++) {
            gVarD = n0.g.d(n0.g.w(gVarD.B(), listE.get(i10).B()));
        }
        long jB = gVarD.B();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jB >> 32)) * f11;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jB & com.rabbitmq.client.k0.f265952a)) * f10;
        return n0.g.g((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & com.rabbitmq.client.k0.f265952a));
    }

    @androidx.annotation.l1
    public final float d(@NotNull androidx.compose.ui.unit.d dVar) {
        return z5.f15489a.a(this.f14539a);
    }

    @androidx.annotation.l1
    public final float e(@NotNull androidx.compose.ui.unit.d dVar) {
        return z5.f15489a.b(this.f14539a);
    }

    @NotNull
    public final ViewConfiguration f() {
        return this.f14539a;
    }
}
