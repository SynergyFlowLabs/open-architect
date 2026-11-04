package com.planner5d.library.widget.editor.toolbar;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.core.content.d;
import androidx.core.view.u1;
import com.planner5d.library.databinding.r3;
import com.planner5d.library.databinding.s3;
import com.planner5d.library.f;
import com.planner5d.library.widget.editor.toolbar.EditorSubmenu;
import com.planner5d.library.widget.menu.q;
import ef.g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oj.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nEditorSubmenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditorSubmenu.kt\ncom/planner5d/library/widget/editor/toolbar/EditorSubmenu\n+ 2 Menu.kt\nandroidx/core/view/MenuKt\n*L\n1#1,95:1\n57#2,4:96\n*S KotlinDebug\n*F\n+ 1 EditorSubmenu.kt\ncom/planner5d/library/widget/editor/toolbar/EditorSubmenu\n*L\n38#1:96,4\n*E\n"})
public final class EditorSubmenu extends FrameLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f258149c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f258150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private r3 f258151b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public EditorSubmenu(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        boolean z10 = true & false;
    }

    private final TextView c(final Activity activity, final q qVar, final MenuItem menuItem, final EditorToolbar editorToolbar) {
        Drawable drawableL;
        TextView root = s3.d(LayoutInflater.from(getContext()), this.f258151b.f159589b, false).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        root.setText(menuItem.getTitle());
        root.setTag(Integer.valueOf(menuItem.getItemId()));
        Drawable icon = menuItem.getIcon();
        if (h(menuItem.getItemId())) {
            drawableL = d.l(root.getContext(), f.h.J6);
        } else {
            drawableL = menuItem.isChecked() ? d.l(root.getContext(), f.h.Z6) : null;
        }
        root.setCompoundDrawablesWithIntrinsicBounds(icon, (Drawable) null, drawableL, (Drawable) null);
        root.setOnClickListener(new View.OnClickListener() { // from class: bf.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditorSubmenu.d(qVar, activity, menuItem, editorToolbar, this, view);
            }
        });
        root.setForeground(d.l(root.getContext(), f.h.Yg));
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(q qVar, Activity activity, MenuItem menuItem, EditorToolbar editorToolbar, EditorSubmenu editorSubmenu, View view) {
        qVar.a(activity, menuItem);
        editorToolbar.setMenuSelected(null);
        editorSubmenu.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(EditorToolbar editorToolbar, EditorSubmenu editorSubmenu, View view) {
        editorToolbar.setMenuSelected(null);
        editorSubmenu.e();
    }

    private final boolean h(int i10) {
        return i10 == f.j.f168208lc && !this.f258150a;
    }

    public final void e() {
        this.f258151b.f159589b.removeAllViews();
        this.f258151b.getRoot().setLayoutParams(new FrameLayout.LayoutParams(0, 0));
    }

    public final void f(@NotNull Activity activity, @NotNull MenuItem menuItem, @NotNull q listeners, @NotNull final EditorToolbar parentMenu) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        Intrinsics.checkNotNullParameter(listeners, "listeners");
        Intrinsics.checkNotNullParameter(parentMenu, "parentMenu");
        LinearLayout linearLayout = this.f258151b.f159589b;
        linearLayout.removeAllViews();
        linearLayout.setClipToOutline(true);
        SubMenu subMenu = menuItem.getSubMenu();
        if (subMenu != null) {
            int size = subMenu.size();
            for (int i10 = 0; i10 < size; i10++) {
                MenuItem item = subMenu.getItem(i10);
                if (item.isVisible()) {
                    this.f258151b.f159589b.addView(c(activity, listeners, item, parentMenu));
                }
            }
        }
        View root = this.f258151b.getRoot();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = root.getResources().getDimensionPixelSize(f.g.Qh);
        root.setLayoutParams(layoutParams);
        root.setPadding(0, (int) parentMenu.D(menuItem), 0, 0);
        root.setOnClickListener(new View.OnClickListener() { // from class: bf.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditorSubmenu.g(parentMenu, this, view);
            }
        });
    }

    public final boolean getHasPro() {
        return this.f258150a;
    }

    public final void setHasPro(boolean z10) {
        this.f258150a = z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public EditorSubmenu(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        int i10 = 7 >> 0;
    }

    public /* synthetic */ EditorSubmenu(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @j
    public EditorSubmenu(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        r3 r3VarB = r3.b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(r3VarB, "inflate(...)");
        this.f258151b = r3VarB;
        u1.j2(r3VarB.f159589b, new g(0, 1, null));
    }
}
