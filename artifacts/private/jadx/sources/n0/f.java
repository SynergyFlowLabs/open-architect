package n0;

import com.rabbitmq.client.k0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nMutableRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableRect.kt\nandroidx/compose/ui/geometry/MutableRectKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n1#1,232:1\n65#2:233\n69#2:236\n65#2:243\n69#2:246\n65#2:248\n69#2:251\n60#3:234\n70#3:237\n60#3:244\n70#3:247\n60#3:249\n70#3:252\n22#4:235\n22#4:245\n22#4:250\n57#5,5:238\n*S KotlinDebug\n*F\n+ 1 MutableRect.kt\nandroidx/compose/ui/geometry/MutableRectKt\n*L\n212#1:233\n212#1:236\n222#1:243\n222#1:246\n231#1:248\n231#1:251\n212#1:234\n212#1:237\n222#1:244\n222#1:247\n231#1:249\n231#1:252\n212#1:235\n222#1:245\n231#1:250\n212#1:238,5\n*E\n"})
public final class f {
    @NotNull
    public static final e a(long j10, long j11) {
        return new e(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & k0.f265952a)), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & k0.f265952a)));
    }

    @NotNull
    public static final e b(long j10, float f10) {
        int i10 = (int) (j10 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i10) - f10;
        int i11 = (int) (j10 & k0.f265952a);
        return new e(fIntBitsToFloat, Float.intBitsToFloat(i11) - f10, Float.intBitsToFloat(i10) + f10, Float.intBitsToFloat(i11) + f10);
    }

    @NotNull
    public static final e c(long j10, long j11) {
        int i10 = (int) (j10 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i10);
        int i11 = (int) (j10 & k0.f265952a);
        return new e(fIntBitsToFloat, Float.intBitsToFloat(i11), Float.intBitsToFloat(i10) + Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j11 & k0.f265952a)));
    }

    @NotNull
    public static final j d(@NotNull e eVar) {
        return new j(eVar.k(), eVar.p(), eVar.n(), eVar.c());
    }
}
