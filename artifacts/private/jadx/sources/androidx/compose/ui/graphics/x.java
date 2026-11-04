package androidx.compose.ui.graphics;

import android.graphics.BitmapShader;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nAndroidShader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/AndroidShader_androidKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,235:1\n65#2:236\n69#2:239\n65#2:242\n69#2:245\n65#2:248\n69#2:251\n65#2:254\n69#2:257\n60#3:237\n70#3:240\n60#3:243\n70#3:246\n60#3:249\n70#3:252\n60#3:255\n70#3:258\n22#4:238\n22#4:241\n22#4:244\n22#4:247\n22#4:250\n22#4:253\n22#4:256\n22#4:259\n71#5,5:260\n*S KotlinDebug\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/AndroidShader_androidKt\n*L\n41#1:236\n42#1:239\n43#1:242\n44#1:245\n61#1:248\n62#1:251\n78#1:254\n79#1:257\n41#1:237\n42#1:240\n43#1:243\n44#1:246\n61#1:249\n62#1:252\n78#1:255\n79#1:258\n41#1:238\n42#1:241\n43#1:244\n44#1:247\n61#1:250\n62#1:253\n78#1:256\n79#1:259\n137#1:260,5\n*E\n"})
public final class x {
    @NotNull
    public static final Shader a(@NotNull Shader shader, @NotNull Shader shader2, int i10) {
        return new ComposeShader(shader, shader2, a.b(i10));
    }

    @NotNull
    public static final Shader b(@NotNull t1 t1Var, int i10, int i11) {
        return new BitmapShader(j.b(t1Var), z.b(i10), z.b(i11));
    }

    @NotNull
    public static final Shader c(long j10, long j11, @NotNull List<q0> list, @Nullable List<Float> list2, int i10) {
        i(list, list2);
        int iF = f(list);
        return new LinearGradient(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & com.rabbitmq.client.k0.f265952a)), g(list, iF), h(list2, list, iF), z.b(i10));
    }

    @NotNull
    public static final Shader d(long j10, float f10, @NotNull List<q0> list, @Nullable List<Float> list2, int i10) {
        i(list, list2);
        int iF = f(list);
        return new RadialGradient(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)), f10, g(list, iF), h(list2, list, iF), z.b(i10));
    }

    @NotNull
    public static final Shader e(long j10, @NotNull List<q0> list, @Nullable List<Float> list2) {
        i(list, list2);
        int iF = f(list);
        return new SweepGradient(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)), g(list, iF), h(list2, list, iF));
    }

    @androidx.annotation.l1
    public static final int f(@NotNull List<q0> list) {
        return 0;
    }

    @androidx.annotation.l1
    @NotNull
    public static final int[] g(@NotNull List<q0> list, int i10) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = s0.t(list.get(i11).M());
        }
        return iArr;
    }

    @androidx.annotation.l1
    @Nullable
    public static final float[] h(@Nullable List<Float> list, @NotNull List<q0> list2, int i10) {
        if (i10 == 0) {
            if (list != null) {
                return CollectionsKt.toFloatArray(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i10];
        fArr[0] = list != null ? list.get(0).floatValue() : 0.0f;
        int lastIndex = CollectionsKt.getLastIndex(list2);
        int i11 = 1;
        for (int i12 = 1; i12 < lastIndex; i12++) {
            long jM = list2.get(i12).M();
            float fFloatValue = list != null ? list.get(i12).floatValue() : i12 / CollectionsKt.getLastIndex(list2);
            int i13 = i11 + 1;
            fArr[i11] = fFloatValue;
            if (q0.A(jM) == 0.0f) {
                i11 += 2;
                fArr[i13] = fFloatValue;
            } else {
                i11 = i13;
            }
        }
        fArr[i11] = list != null ? list.get(CollectionsKt.getLastIndex(list2)).floatValue() : 1.0f;
        return fArr;
    }

    private static final void i(List<q0> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
