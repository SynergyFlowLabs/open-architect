package androidx.databinding.adapters;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@androidx.databinding.h({@androidx.databinding.g(attribute = "android:backgroundTint", method = "setBackgroundTintList", type = View.class), @androidx.databinding.g(attribute = "android:fadeScrollbars", method = "setScrollbarFadingEnabled", type = View.class), @androidx.databinding.g(attribute = "android:getOutline", method = "setOutlineProvider", type = View.class), @androidx.databinding.g(attribute = "android:nextFocusForward", method = "setNextFocusForwardId", type = View.class), @androidx.databinding.g(attribute = "android:nextFocusLeft", method = "setNextFocusLeftId", type = View.class), @androidx.databinding.g(attribute = "android:nextFocusRight", method = "setNextFocusRightId", type = View.class), @androidx.databinding.g(attribute = "android:nextFocusUp", method = "setNextFocusUpId", type = View.class), @androidx.databinding.g(attribute = "android:nextFocusDown", method = "setNextFocusDownId", type = View.class), @androidx.databinding.g(attribute = "android:requiresFadingEdge", method = "setVerticalFadingEdgeEnabled", type = View.class), @androidx.databinding.g(attribute = "android:scrollbarDefaultDelayBeforeFade", method = "setScrollBarDefaultDelayBeforeFade", type = View.class), @androidx.databinding.g(attribute = "android:scrollbarFadeDuration", method = "setScrollBarFadeDuration", type = View.class), @androidx.databinding.g(attribute = "android:scrollbarSize", method = "setScrollBarSize", type = View.class), @androidx.databinding.g(attribute = "android:scrollbarStyle", method = "setScrollBarStyle", type = View.class), @androidx.databinding.g(attribute = "android:transformPivotX", method = "setPivotX", type = View.class), @androidx.databinding.g(attribute = "android:transformPivotY", method = "setPivotY", type = View.class), @androidx.databinding.g(attribute = "android:onDrag", method = "setOnDragListener", type = View.class), @androidx.databinding.g(attribute = "android:onClick", method = "setOnClickListener", type = View.class), @androidx.databinding.g(attribute = "android:onApplyWindowInsets", method = "setOnApplyWindowInsetsListener", type = View.class), @androidx.databinding.g(attribute = "android:onCreateContextMenu", method = "setOnCreateContextMenuListener", type = View.class), @androidx.databinding.g(attribute = "android:onFocusChange", method = "setOnFocusChangeListener", type = View.class), @androidx.databinding.g(attribute = "android:onGenericMotion", method = "setOnGenericMotionListener", type = View.class), @androidx.databinding.g(attribute = "android:onHover", method = "setOnHoverListener", type = View.class), @androidx.databinding.g(attribute = "android:onKey", method = "setOnKeyListener", type = View.class), @androidx.databinding.g(attribute = "android:onLongClick", method = "setOnLongClickListener", type = View.class), @androidx.databinding.g(attribute = "android:onSystemUiVisibilityChange", method = "setOnSystemUiVisibilityChangeListener", type = View.class), @androidx.databinding.g(attribute = "android:onTouch", method = "setOnTouchListener", type = View.class)})
@b1({b1.a.LIBRARY})
public class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f49287a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f49288b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f49289c = 2;

    class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f49290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f49291b;

        a(b bVar, c cVar) {
            this.f49290a = bVar;
            this.f49291b = cVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b bVar = this.f49290a;
            if (bVar != null) {
                bVar.onViewAttachedToWindow(view);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            c cVar = this.f49291b;
            if (cVar != null) {
                cVar.onViewDetachedFromWindow(view);
            }
        }
    }

    @e.b(12)
    public interface b {
        void onViewAttachedToWindow(View view);
    }

    @e.b(12)
    public interface c {
        void onViewDetachedFromWindow(View view);
    }

    private static int a(float f10) {
        int i10 = (int) (0.5f + f10);
        if (i10 != 0) {
            return i10;
        }
        if (f10 == 0.0f) {
            return 0;
        }
        return f10 > 0.0f ? 1 : -1;
    }

    @androidx.databinding.d({"android:background"})
    public static void b(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    @androidx.databinding.d({"android:onClickListener", "android:clickable"})
    public static void c(View view, View.OnClickListener onClickListener, boolean z10) {
        view.setOnClickListener(onClickListener);
        view.setClickable(z10);
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onViewDetachedFromWindow", "android:onViewAttachedToWindow"})
    public static void d(View view, c cVar, b bVar) {
        a aVar = (cVar == null && bVar == null) ? null : new a(bVar, cVar);
        View.OnAttachStateChangeListener onAttachStateChangeListener = (View.OnAttachStateChangeListener) r.b(view, aVar, androidx.databinding.library.baseAdapters.b.a.f49424a);
        if (onAttachStateChangeListener != null) {
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        if (aVar != null) {
            view.addOnAttachStateChangeListener(aVar);
        }
    }

    @androidx.databinding.d({"android:onClick", "android:clickable"})
    public static void e(View view, View.OnClickListener onClickListener, boolean z10) {
        view.setOnClickListener(onClickListener);
        view.setClickable(z10);
    }

    @androidx.databinding.d({"android:onLayoutChange"})
    public static void f(View view, View.OnLayoutChangeListener onLayoutChangeListener, View.OnLayoutChangeListener onLayoutChangeListener2) {
        if (onLayoutChangeListener != null) {
            view.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        if (onLayoutChangeListener2 != null) {
            view.addOnLayoutChangeListener(onLayoutChangeListener2);
        }
    }

    @androidx.databinding.d({"android:onLongClick", "android:longClickable"})
    public static void g(View view, View.OnLongClickListener onLongClickListener, boolean z10) {
        view.setOnLongClickListener(onLongClickListener);
        view.setLongClickable(z10);
    }

    @androidx.databinding.d({"android:onLongClickListener", "android:longClickable"})
    public static void h(View view, View.OnLongClickListener onLongClickListener, boolean z10) {
        view.setOnLongClickListener(onLongClickListener);
        view.setLongClickable(z10);
    }

    @androidx.databinding.d({"android:padding"})
    public static void i(View view, float f10) {
        int iA = a(f10);
        view.setPadding(iA, iA, iA, iA);
    }

    @androidx.databinding.d({"android:paddingBottom"})
    public static void j(View view, float f10) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), a(f10));
    }

    @androidx.databinding.d({"android:paddingEnd"})
    public static void k(View view, float f10) {
        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), a(f10), view.getPaddingBottom());
    }

    @androidx.databinding.d({"android:paddingLeft"})
    public static void l(View view, float f10) {
        view.setPadding(a(f10), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }

    @androidx.databinding.d({"android:paddingRight"})
    public static void m(View view, float f10) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), a(f10), view.getPaddingBottom());
    }

    @androidx.databinding.d({"android:paddingStart"})
    public static void n(View view, float f10) {
        view.setPaddingRelative(a(f10), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
    }

    @androidx.databinding.d({"android:paddingTop"})
    public static void o(View view, float f10) {
        view.setPadding(view.getPaddingLeft(), a(f10), view.getPaddingRight(), view.getPaddingBottom());
    }

    @androidx.databinding.d({"android:requiresFadingEdge"})
    public static void p(View view, int i10) {
        boolean z10 = (i10 & 2) != 0;
        boolean z11 = (i10 & 1) != 0;
        view.setVerticalFadingEdgeEnabled(z10);
        view.setHorizontalFadingEdgeEnabled(z11);
    }
}
