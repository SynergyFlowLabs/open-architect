package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.layout.h0;
import androidx.compose.ui.node.l0;
import com.rabbitmq.client.k0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nAndroidViewHolder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidViewHolder.android.kt\nandroidx/compose/ui/viewinterop/AndroidViewHolder_androidKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,715:1\n65#2:716\n69#2:723\n60#3:717\n70#3:724\n22#4,5:718\n22#4,5:725\n*S KotlinDebug\n*F\n+ 1 AndroidViewHolder.android.kt\nandroidx/compose/ui/viewinterop/AndroidViewHolder_androidKt\n*L\n693#1:716\n694#1:723\n693#1:717\n694#1:724\n693#1:718,5\n694#1:725,5\n*E\n"})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f42795a = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final a f42796b = new a();

    public static final class a implements androidx.compose.ui.input.nestedscroll.a {
        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(View view, l0 l0Var) {
        long jF = h0.f(l0Var.n());
        int iRound = Math.round(Float.intBitsToFloat((int) (jF >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jF & k0.f265952a)));
        view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float g(int i10) {
        return i10 * (-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float h(float f10) {
        return f10 * (-1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(int i10) {
        return i10 == 0 ? androidx.compose.ui.input.nestedscroll.f.f38949b.h() : androidx.compose.ui.input.nestedscroll.f.f38949b.g();
    }
}
