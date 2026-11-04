package ef;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.w0;
import androidx.core.view.b1;
import androidx.core.view.g3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nMarginWindowInsetsListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginWindowInsetsListener.kt\ncom/planner5d/library/widget/inset/MarginWindowInsetsListener\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,42:1\n327#2,4:43\n*S KotlinDebug\n*F\n+ 1 MarginWindowInsetsListener.kt\ncom/planner5d/library/widget/inset/MarginWindowInsetsListener\n*L\n17#1:43,4\n*E\n"})
public abstract class c implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f274870a = 0;

    @Nullable
    public Integer a(@NotNull g3 insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        return null;
    }

    @Override // androidx.core.view.b1
    @NotNull
    public g3 b(@NotNull View view, @NotNull g3 insets) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Integer numE = e(insets);
        if (numE != null) {
            marginLayoutParams.topMargin = numE.intValue();
        }
        Integer numA = a(insets);
        if (numA != null) {
            marginLayoutParams.bottomMargin = numA.intValue();
        }
        Integer numC = c(insets);
        if (numC != null) {
            marginLayoutParams.leftMargin = numC.intValue();
        }
        Integer numD = d(insets);
        if (numD != null) {
            marginLayoutParams.rightMargin = numD.intValue();
        }
        view.setLayoutParams(marginLayoutParams);
        return insets;
    }

    @Nullable
    public Integer c(@NotNull g3 insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        return null;
    }

    @Nullable
    public Integer d(@NotNull g3 insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        return null;
    }

    @Nullable
    public Integer e(@NotNull g3 insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        return null;
    }
}
