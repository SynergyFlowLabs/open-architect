package io.sentry.android.replay.util;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.VectorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import io.sentry.n8;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class r {
    public static final void a(@Nullable View view, @NotNull ViewTreeObserver.OnDrawListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().addOnDrawListener(listener);
        } catch (IllegalStateException unused) {
        }
    }

    public static final void b(@Nullable View view, @NotNull ViewTreeObserver.OnPreDrawListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (view != null && view.getViewTreeObserver() != null && view.getViewTreeObserver().isAlive()) {
            try {
                view.getViewTreeObserver().addOnPreDrawListener(listener);
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static final int c(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        try {
            return textView.getTotalPaddingTop();
        } catch (NullPointerException unused) {
            return textView.getExtendedPaddingTop();
        }
    }

    @NotNull
    public static final List<Rect> d(@Nullable q qVar, @NotNull Rect globalRect, int i10, int i11) {
        Intrinsics.checkNotNullParameter(globalRect, "globalRect");
        if (qVar == null) {
            return CollectionsKt.listOf(globalRect);
        }
        ArrayList arrayList = new ArrayList();
        int iG = qVar.g();
        for (int i12 = 0; i12 < iG; i12++) {
            int iC = (int) qVar.c(i12, qVar.b(i12));
            int iH = qVar.h(i12);
            int iF = qVar.f(i12);
            int iC2 = (int) qVar.c(i12, (iF - iH) + (iH > 0 ? 1 : 0));
            if (iC2 == 0 && iF > 0) {
                iC2 = ((int) qVar.c(i12, iF - 1)) + 1;
            }
            int iA = qVar.a(i12);
            int iE = qVar.e(i12);
            Rect rect = new Rect();
            int i13 = globalRect.left + i10 + iC;
            rect.left = i13;
            rect.right = i13 + (iC2 - iC);
            int i14 = globalRect.top + i11 + iA;
            rect.top = i14;
            rect.bottom = i14 + (iE - iA);
            arrayList.add(rect);
        }
        return arrayList;
    }

    public static final boolean e(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    @e.a({"ObsoleteSdkInt"})
    @e.b(21)
    public static final boolean f(@Nullable Drawable drawable) {
        if (drawable instanceof InsetDrawable ? true : drawable instanceof ColorDrawable ? true : drawable instanceof VectorDrawable ? true : drawable instanceof GradientDrawable) {
            return false;
        }
        if (!(drawable instanceof BitmapDrawable)) {
            return true;
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        return bitmap != null && !bitmap.isRecycled() && bitmap.getHeight() > 10 && bitmap.getWidth() > 10;
    }

    @NotNull
    public static final Pair<Boolean, Rect> g(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.isAttachedToWindow() && view.getWindowVisibility() == 0) {
            Object parent = view;
            while (parent instanceof View) {
                float transitionAlpha = ((View) parent).getTransitionAlpha();
                View view2 = (View) parent;
                if (view2.getAlpha() <= 0.0f || transitionAlpha <= 0.0f || view2.getVisibility() != 0) {
                    return TuplesKt.to(Boolean.FALSE, null);
                }
                parent = view2.getParent();
            }
            Rect rect = new Rect();
            return TuplesKt.to(Boolean.valueOf(view.getGlobalVisibleRect(rect, new Point())), rect);
        }
        return TuplesKt.to(Boolean.FALSE, null);
    }

    public static final void h(@Nullable View view, @NotNull ViewTreeObserver.OnDrawListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().removeOnDrawListener(listener);
        } catch (IllegalStateException unused) {
        }
    }

    public static final void i(@Nullable View view, @NotNull ViewTreeObserver.OnPreDrawListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().removeOnPreDrawListener(listener);
        } catch (IllegalStateException unused) {
        }
    }

    public static final int j(int i10) {
        return i10 | (-16777216);
    }

    public static final void k(@NotNull View view, @NotNull io.sentry.android.replay.viewhierarchy.b parentNode, @NotNull n8 options) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(parentNode, "parentNode");
        Intrinsics.checkNotNullParameter(options, "options");
        if ((view instanceof ViewGroup) && !io.sentry.android.replay.viewhierarchy.a.f305068a.b(view, parentNode, options)) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(viewGroup.getChildCount());
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt != null) {
                    io.sentry.android.replay.viewhierarchy.b bVarA = io.sentry.android.replay.viewhierarchy.b.f305074m.a(childAt, parentNode, viewGroup.indexOfChild(childAt), options);
                    arrayList.add(bVarA);
                    k(childAt, bVarA, options);
                }
            }
            parentNode.p(arrayList);
        }
    }
}
