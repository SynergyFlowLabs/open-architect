package n0;

import androidx.compose.runtime.k7;
import com.rabbitmq.client.k0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rect.kt\nandroidx/compose/ui/geometry/RectKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n1#1,288:1\n65#2:289\n69#2:292\n65#2:299\n69#2:302\n65#2:304\n69#2:307\n60#3:290\n70#3:293\n60#3:300\n70#3:303\n60#3:305\n70#3:308\n22#4:291\n22#4:301\n22#4:306\n57#5,5:294\n*S KotlinDebug\n*F\n+ 1 Rect.kt\nandroidx/compose/ui/geometry/RectKt\n*L\n244#1:289\n244#1:292\n255#1:299\n255#1:302\n265#1:304\n265#1:307\n244#1:290\n244#1:293\n255#1:300\n255#1:303\n265#1:305\n265#1:308\n244#1:291\n255#1:301\n265#1:306\n244#1:294,5\n*E\n"})
public final class k {
    @k7
    @NotNull
    public static final j a(long j10, long j11) {
        return new j(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & k0.f265952a)), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & k0.f265952a)));
    }

    @k7
    @NotNull
    public static final j b(long j10, float f10) {
        int i10 = (int) (j10 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i10) - f10;
        int i11 = (int) (j10 & k0.f265952a);
        return new j(fIntBitsToFloat, Float.intBitsToFloat(i11) - f10, Float.intBitsToFloat(i10) + f10, Float.intBitsToFloat(i11) + f10);
    }

    @k7
    @NotNull
    public static final j c(long j10, long j11) {
        int i10 = (int) (j10 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i10);
        int i11 = (int) (j10 & k0.f265952a);
        return new j(fIntBitsToFloat, Float.intBitsToFloat(i11), Float.intBitsToFloat(i10) + Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j11 & k0.f265952a)));
    }

    @k7
    @NotNull
    public static final j d(@NotNull j jVar, @NotNull j jVar2, float f10) {
        return new j(androidx.compose.ui.util.e.r(jVar.t(), jVar2.t(), f10), androidx.compose.ui.util.e.r(jVar.B(), jVar2.B(), f10), androidx.compose.ui.util.e.r(jVar.x(), jVar2.x(), f10), androidx.compose.ui.util.e.r(jVar.j(), jVar2.j(), f10));
    }
}
