package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY})
public class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Comparator<View> f112859a = new a();

    class a implements Comparator<View> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    }

    private h0() {
    }

    @androidx.annotation.p0
    public static ActionMenuItemView a(@NonNull Toolbar toolbar, @androidx.annotation.d0 int i10) {
        ActionMenuView actionMenuViewB = b(toolbar);
        if (actionMenuViewB == null) {
            return null;
        }
        for (int i11 = 0; i11 < actionMenuViewB.getChildCount(); i11++) {
            View childAt = actionMenuViewB.getChildAt(i11);
            if (childAt instanceof ActionMenuItemView) {
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) childAt;
                if (actionMenuItemView.getItemData().getItemId() == i10) {
                    return actionMenuItemView;
                }
            }
        }
        return null;
    }

    @androidx.annotation.p0
    public static ActionMenuView b(@NonNull Toolbar toolbar) {
        for (int i10 = 0; i10 < toolbar.getChildCount(); i10++) {
            View childAt = toolbar.getChildAt(i10);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    @androidx.annotation.p0
    private static ImageView c(@NonNull Toolbar toolbar, @androidx.annotation.p0 Drawable drawable) {
        ImageView imageView;
        Drawable drawable2;
        if (drawable == null) {
            return null;
        }
        for (int i10 = 0; i10 < toolbar.getChildCount(); i10++) {
            View childAt = toolbar.getChildAt(i10);
            if ((childAt instanceof ImageView) && (drawable2 = (imageView = (ImageView) childAt).getDrawable()) != null && drawable2.getConstantState() != null && drawable2.getConstantState().equals(drawable.getConstantState())) {
                return imageView;
            }
        }
        return null;
    }

    @androidx.annotation.p0
    public static ImageView d(@NonNull Toolbar toolbar) {
        return c(toolbar, toolbar.getLogo());
    }

    @androidx.annotation.p0
    public static ImageButton e(@NonNull Toolbar toolbar) {
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon == null) {
            return null;
        }
        for (int i10 = 0; i10 < toolbar.getChildCount(); i10++) {
            View childAt = toolbar.getChildAt(i10);
            if (childAt instanceof ImageButton) {
                ImageButton imageButton = (ImageButton) childAt;
                if (imageButton.getDrawable() == navigationIcon) {
                    return imageButton;
                }
            }
        }
        return null;
    }

    @androidx.annotation.p0
    public static View f(@NonNull Toolbar toolbar) {
        ActionMenuView actionMenuViewB = b(toolbar);
        if (actionMenuViewB == null || actionMenuViewB.getChildCount() <= 1) {
            return null;
        }
        return actionMenuViewB.getChildAt(0);
    }

    @androidx.annotation.p0
    public static TextView g(@NonNull Toolbar toolbar) {
        List<TextView> listH = h(toolbar, toolbar.getSubtitle());
        if (listH.isEmpty()) {
            return null;
        }
        return (TextView) Collections.max(listH, f112859a);
    }

    private static List<TextView> h(@NonNull Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < toolbar.getChildCount(); i10++) {
            View childAt = toolbar.getChildAt(i10);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    @androidx.annotation.p0
    public static TextView i(@NonNull Toolbar toolbar) {
        List<TextView> listH = h(toolbar, toolbar.getTitle());
        if (listH.isEmpty()) {
            return null;
        }
        return (TextView) Collections.min(listH, f112859a);
    }
}
