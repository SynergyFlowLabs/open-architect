package ef;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.w0;
import androidx.core.view.b1;
import androidx.core.view.g3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nKeyboardMarginInsetsListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeyboardMarginInsetsListener.kt\ncom/planner5d/library/widget/inset/KeyboardMarginInsetsListener\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,28:1\n327#2,4:29\n*S KotlinDebug\n*F\n+ 1 KeyboardMarginInsetsListener.kt\ncom/planner5d/library/widget/inset/KeyboardMarginInsetsListener\n*L\n14#1:29,4\n*E\n"})
public final class a implements b1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f274866c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f274867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f274868b;

    public a(@NotNull Function0<Unit> actionIfKeyboardIsVisible, @NotNull Function0<Unit> endAction) {
        Intrinsics.checkNotNullParameter(actionIfKeyboardIsVisible, "actionIfKeyboardIsVisible");
        Intrinsics.checkNotNullParameter(endAction, "endAction");
        this.f274867a = actionIfKeyboardIsVisible;
        this.f274868b = endAction;
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
        int i10 = insets.f(g3.m.d()).f47826d;
        if (i10 > 0) {
            marginLayoutParams.bottomMargin = i10 - insets.f(g3.m.g()).f47826d;
            this.f274867a.invoke();
        } else {
            marginLayoutParams.bottomMargin = 0;
        }
        this.f274868b.invoke();
        view.setLayoutParams(marginLayoutParams);
        return insets;
    }
}
