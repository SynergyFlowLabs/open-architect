package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView_androidKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,3317:1\n52#2,2:3318\n52#2,2:3320\n52#2,2:3322\n52#2,2:3324\n52#2,2:3326\n52#2,2:3328\n52#2,2:3330\n52#2,2:3332\n52#2,2:3334\n52#2,2:3336\n52#2,2:3338\n52#2,2:3340\n52#2,2:3342\n52#2,2:3344\n52#2,2:3346\n52#2,2:3348\n49#2:3350\n49#2:3351\n49#2:3352\n49#2:3353\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView_androidKt\n*L\n3126#1:3318,2\n3127#1:3320,2\n3128#1:3322,2\n3129#1:3324,2\n3130#1:3326,2\n3131#1:3328,2\n3132#1:3330,2\n3133#1:3332,2\n3134#1:3334,2\n3135#1:3336,2\n3136#1:3338,2\n3137#1:3340,2\n3138#1:3342,2\n3139#1:3344,2\n3140#1:3346,2\n3141#1:3348,2\n3153#1:3350\n3154#1:3351\n3155#1:3352\n3156#1:3353\n*E\n"})
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static Function1<? super androidx.compose.ui.text.input.q0, ? extends androidx.compose.ui.text.input.q0> f40471a = a.f40473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f40472b = 8;

    static final class a extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.text.input.q0, androidx.compose.ui.text.input.q0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40473a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.text.input.q0 invoke(androidx.compose.ui.text.input.q0 q0Var) {
            return q0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(View view, View view2) {
        if (Intrinsics.areEqual(view2, view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    private static final float f(float[] fArr, int i10, float[] fArr2, int i11) {
        int i12 = i10 * 4;
        return (fArr[i12] * fArr2[i11]) + (fArr[i12 + 1] * fArr2[4 + i11]) + (fArr[i12 + 2] * fArr2[8 + i11]) + (fArr[i12 + 3] * fArr2[12 + i11]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.platform.coreshims.b g(View view) {
        androidx.compose.ui.platform.coreshims.c.c(view, 1);
        return androidx.compose.ui.platform.coreshims.c.b(view);
    }

    @NotNull
    public static final Function1<androidx.compose.ui.text.input.q0, androidx.compose.ui.text.input.q0> h() {
        return f40471a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(float[] fArr, float[] fArr2) {
        float f10 = f(fArr2, 0, fArr, 0);
        float f11 = f(fArr2, 0, fArr, 1);
        float f12 = f(fArr2, 0, fArr, 2);
        float f13 = f(fArr2, 0, fArr, 3);
        float f14 = f(fArr2, 1, fArr, 0);
        float f15 = f(fArr2, 1, fArr, 1);
        float f16 = f(fArr2, 1, fArr, 2);
        float f17 = f(fArr2, 1, fArr, 3);
        float f18 = f(fArr2, 2, fArr, 0);
        float f19 = f(fArr2, 2, fArr, 1);
        float f20 = f(fArr2, 2, fArr, 2);
        float f21 = f(fArr2, 2, fArr, 3);
        float f22 = f(fArr2, 3, fArr, 0);
        float f23 = f(fArr2, 3, fArr, 1);
        float f24 = f(fArr2, 3, fArr, 2);
        float f25 = f(fArr2, 3, fArr, 3);
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        fArr[3] = f13;
        fArr[4] = f14;
        fArr[5] = f15;
        fArr[6] = f16;
        fArr[7] = f17;
        fArr[8] = f18;
        fArr[9] = f19;
        fArr[10] = f20;
        fArr[11] = f21;
        fArr[12] = f22;
        fArr[13] = f23;
        fArr[14] = f24;
        fArr[15] = f25;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(float[] fArr, float f10, float f11, float[] fArr2) {
        androidx.compose.ui.graphics.c2.m(fArr2);
        androidx.compose.ui.graphics.c2.z(fArr2, f10, f11, 0.0f, 4, null);
        i(fArr, fArr2);
    }

    public static final void k(@NotNull Function1<? super androidx.compose.ui.text.input.q0, ? extends androidx.compose.ui.text.input.q0> function1) {
        f40471a = function1;
    }
}
