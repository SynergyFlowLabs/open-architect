package androidx.compose.foundation.text.selection;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSelectionHandles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionHandles.kt\nandroidx/compose/foundation/text/selection/SelectionHandlesKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,164:1\n65#2:165\n69#2:168\n60#3:166\n70#3:169\n53#3,3:171\n22#4:167\n30#5:170\n113#6:174\n113#6:175\n*S KotlinDebug\n*F\n+ 1 SelectionHandles.kt\nandroidx/compose/foundation/text/selection/SelectionHandlesKt\n*L\n99#1:165\n99#1:168\n99#1:166\n99#1:169\n99#1:171,3\n99#1:167\n99#1:170\n36#1:174\n37#1:175\n*E\n"})
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f21216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f21217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.semantics.d0<l1> f21218c = new androidx.compose.ui.semantics.d0<>("SelectionHandleInfo", (Function2) null, 2, (DefaultConstructorMarker) null);

    static {
        float f10 = 25;
        f21216a = androidx.compose.ui.unit.h.r(f10);
        f21217b = androidx.compose.ui.unit.h.r(f10);
    }

    public static final long a(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        return n0.g.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)) - 1.0f)) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    public static final float b() {
        return f21217b;
    }

    public static final float c() {
        return f21216a;
    }

    @NotNull
    public static final androidx.compose.ui.semantics.d0<l1> d() {
        return f21218c;
    }

    public static final boolean e(@NotNull androidx.compose.ui.text.style.i iVar, boolean z10) {
        return (iVar == androidx.compose.ui.text.style.i.Ltr && !z10) || (iVar == androidx.compose.ui.text.style.i.Rtl && z10);
    }

    public static final boolean f(boolean z10, @NotNull androidx.compose.ui.text.style.i iVar, boolean z11) {
        if (z10) {
            return e(iVar, z11);
        }
        return !e(iVar, z11);
    }
}
