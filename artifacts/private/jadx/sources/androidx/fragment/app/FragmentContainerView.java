package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.g3;
import androidx.core.view.u1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nFragmentContainerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentContainerView.kt\nandroidx/fragment/app/FragmentContainerView\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,345:1\n55#2,6:346\n55#2,6:352\n1855#3,2:358\n*S KotlinDebug\n*F\n+ 1 FragmentContainerView.kt\nandroidx/fragment/app/FragmentContainerView\n*L\n112#1:346,6\n134#1:352,6\n218#1:358,2\n*E\n"})
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<View> f51657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<View> f51658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private View.OnApplyWindowInsetsListener f51659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f51660d;

    @androidx.annotation.w0(20)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f51661a = new a();

        private a() {
        }

        @NotNull
        public final WindowInsets a(@NotNull View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, @NotNull View v10, @NotNull WindowInsets insets) {
            Intrinsics.checkNotNullParameter(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            Intrinsics.checkNotNullParameter(v10, "v");
            Intrinsics.checkNotNullParameter(insets, "insets");
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(v10, insets);
            Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return windowInsetsOnApplyWindowInsets;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public FragmentContainerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void a(View view) {
        if (this.f51658b.contains(view)) {
            this.f51657a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(@NotNull View child, int i10, @Nullable ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(child, "child");
        if (FragmentManager.V0(child) != null) {
            super.addView(child, i10, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    @androidx.annotation.w0(20)
    @NotNull
    public WindowInsets dispatchApplyWindowInsets(@NotNull WindowInsets insets) {
        g3 g3VarJ1;
        Intrinsics.checkNotNullParameter(insets, "insets");
        g3 g3VarK = g3.K(insets);
        Intrinsics.checkNotNullExpressionValue(g3VarK, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f51659c;
        if (onApplyWindowInsetsListener != null) {
            a aVar = a.f51661a;
            Intrinsics.checkNotNull(onApplyWindowInsetsListener);
            g3VarJ1 = g3.K(aVar.a(onApplyWindowInsetsListener, this, insets));
        } else {
            g3VarJ1 = u1.j1(this, g3VarK);
        }
        Intrinsics.checkNotNullExpressionValue(g3VarJ1, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!g3VarJ1.A()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                u1.p(getChildAt(i10), g3VarJ1);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f51660d) {
            Iterator<T> it = this.f51657a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(@NotNull Canvas canvas, @NotNull View child, long j10) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(child, "child");
        if (this.f51660d && !this.f51657a.isEmpty() && this.f51657a.contains(child)) {
            return false;
        }
        return super.drawChild(canvas, child, j10);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f51658b.remove(view);
        if (this.f51657a.remove(view)) {
            this.f51660d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        return (F) FragmentManager.y0(this).v0(getId());
    }

    @Override // android.view.View
    @androidx.annotation.w0(20)
    @NotNull
    public WindowInsets onApplyWindowInsets(@NotNull WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View view = getChildAt(childCount);
                Intrinsics.checkNotNullExpressionValue(view, "view");
                a(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i10) {
        View view = getChildAt(i10);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        a(view);
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View view = getChildAt(i13);
            Intrinsics.checkNotNullExpressionValue(view, "view");
            a(view);
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View view = getChildAt(i13);
            Intrinsics.checkNotNullExpressionValue(view, "view");
            a(view);
        }
        super.removeViewsInLayout(i10, i11);
    }

    @oj.i(name = "setDrawDisappearingViewsLast")
    public final void setDrawDisappearingViewsLast(boolean z10) {
        this.f51660d = z10;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(@Nullable LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(@Nullable View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f51659c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getParent() == this) {
            this.f51658b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f51657a = new ArrayList();
        this.f51658b = new ArrayList();
        this.f51660d = true;
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public FragmentContainerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        String str;
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f51657a = new ArrayList();
        this.f51658b = new ArrayList();
        this.f51660d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] FragmentContainerView = c2.a.d.f82392e;
            Intrinsics.checkNotNullExpressionValue(FragmentContainerView, "FragmentContainerView");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FragmentContainerView, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(c2.a.d.f82393f);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@NotNull Context context, @NotNull AttributeSet attrs, @NotNull FragmentManager fm2) {
        String str;
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(fm2, "fm");
        this.f51657a = new ArrayList();
        this.f51658b = new ArrayList();
        this.f51660d = true;
        String classAttribute = attrs.getClassAttribute();
        int[] FragmentContainerView = c2.a.d.f82392e;
        Intrinsics.checkNotNullExpressionValue(FragmentContainerView, "FragmentContainerView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, FragmentContainerView, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(c2.a.d.f82393f) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(c2.a.d.f82394g);
        typedArrayObtainStyledAttributes.recycle();
        int id2 = getId();
        Fragment fragmentV0 = fm2.v0(id2);
        if (classAttribute != null && fragmentV0 == null) {
            if (id2 == -1) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment fragmentA = fm2.L0().a(context.getClassLoader(), classAttribute);
            Intrinsics.checkNotNullExpressionValue(fragmentA, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            fragmentA.mFragmentId = id2;
            fragmentA.mContainerId = id2;
            fragmentA.mTag = string;
            fragmentA.mFragmentManager = fm2;
            fragmentA.mHost = fm2.O0();
            fragmentA.onInflate(context, attrs, (Bundle) null);
            fm2.w().N(true).f(this, fragmentA, string).p();
        }
        fm2.o1(this);
    }
}
