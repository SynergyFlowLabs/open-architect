package com.planner5d.library.widget.editor.toolbar;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.d;
import androidx.core.view.u1;
import com.planner5d.library.databinding.p3;
import com.planner5d.library.f;
import com.planner5d.library.widget.editor.toolbar.EditorToolbar;
import com.planner5d.library.widget.menu.q;
import ef.g;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oj.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nEditorToolbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditorToolbar.kt\ncom/planner5d/library/widget/editor/toolbar/EditorToolbar\n+ 2 Menu.kt\nandroidx/core/view/MenuKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,102:1\n57#2,2:103\n60#2:107\n57#2,4:108\n257#3,2:105\n*S KotlinDebug\n*F\n+ 1 EditorToolbar.kt\ncom/planner5d/library/widget/editor/toolbar/EditorToolbar\n*L\n45#1:103,2\n45#1:107\n76#1:108,4\n48#1:105,2\n*E\n"})
public final class EditorToolbar extends ConstraintLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f258152c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f258153d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final List<Integer> f258154e = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(f.j.f168149j1), Integer.valueOf(f.j.D0)});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p3 f258155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Menu f258156b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<Integer> a() {
            return EditorToolbar.f258154e;
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public EditorToolbar(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void A(ViewGroup viewGroup) {
        viewGroup.removeAllViews();
        viewGroup.setClipToOutline(true);
    }

    private final ImageView B(final Activity activity, final q qVar, final MenuItem menuItem) {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(menuItem.getIcon());
        imageView.setForeground(d.l(imageView.getContext(), f.h.Yg));
        imageView.setTag(Integer.valueOf(menuItem.getItemId()));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: bf.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditorToolbar.C(qVar, activity, menuItem, view);
            }
        });
        return imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(q qVar, Activity activity, MenuItem menuItem, View view) {
        qVar.a(activity, menuItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(q qVar, Activity activity, MenuItem menuItem, View view) {
        qVar.a(activity, menuItem);
    }

    private final void z(ImageView imageView, int i10) {
        imageView.setBackgroundColor(d.g(imageView.getContext(), i10));
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = imageView.getResources().getDimensionPixelSize(f.g.Ph);
            layoutParams.height = imageView.getResources().getDimensionPixelSize(f.g.Ph);
        }
        imageView.requestLayout();
    }

    public final float D(@NotNull MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        return ((ImageView) this.f258155a.f159499d.findViewWithTag(Integer.valueOf(menuItem.getItemId()))).getY();
    }

    public final void E(@NotNull final Activity activity, @NotNull Menu menu, @NotNull final q listeners) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(listeners, "listeners");
        LinearLayout editorToolbar = this.f258155a.f159499d;
        Intrinsics.checkNotNullExpressionValue(editorToolbar, "editorToolbar");
        A(editorToolbar);
        LinearLayout additionalButtons = this.f258155a.f159497b;
        Intrinsics.checkNotNullExpressionValue(additionalButtons, "additionalButtons");
        A(additionalButtons);
        this.f258156b = menu;
        int size = menu.size();
        for (int i10 = 0; i10 < size; i10++) {
            final MenuItem item = menu.getItem(i10);
            if (item.getItemId() == f.j.C0) {
                ImageView imageView = this.f258155a.f159498c;
                Intrinsics.checkNotNull(imageView);
                imageView.setVisibility(item.isVisible() ? 0 : 8);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: bf.d
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        EditorToolbar.F(listeners, activity, item, view);
                    }
                });
            } else if (item.isVisible()) {
                if (f258154e.contains(Integer.valueOf(item.getItemId()))) {
                    this.f258155a.f159497b.addView(B(activity, listeners, item));
                } else {
                    this.f258155a.f159499d.addView(B(activity, listeners, item));
                }
            }
        }
    }

    public final void setMenuSelected(@Nullable MenuItem menuItem) {
        Menu menu = this.f258156b;
        if (menu != null) {
            int size = menu.size();
            for (int i10 = 0; i10 < size; i10++) {
                MenuItem item = menu.getItem(i10);
                item.setChecked(menuItem != null && item.getItemId() == menuItem.getItemId());
                int i11 = (menuItem == null || item.getItemId() != menuItem.getItemId()) ? f.C1549f.Dn : f.C1549f.Qh;
                ImageView imageView = (ImageView) this.f258155a.f159499d.findViewWithTag(Integer.valueOf(item.getItemId()));
                if (imageView != null) {
                    z(imageView, i11);
                }
                ImageView imageView2 = (ImageView) this.f258155a.f159497b.findViewWithTag(Integer.valueOf(item.getItemId()));
                if (imageView2 != null) {
                    z(imageView2, i11);
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public EditorToolbar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ EditorToolbar(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @j
    public EditorToolbar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        p3 p3VarB = p3.b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(p3VarB, "inflate(...)");
        ViewGroup.LayoutParams layoutParams = p3VarB.f159499d.getLayoutParams();
        DefaultConstructorMarker defaultConstructorMarker = null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = getResources().getDimensionPixelSize(f.g.Qh);
        }
        this.f258155a = p3VarB;
        u1.j2(this, new g(0, 1, defaultConstructorMarker));
    }
}
