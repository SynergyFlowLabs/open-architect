package com.planner5d.library.widget.menu;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.d0;
import androidx.annotation.f1;
import androidx.core.view.p0;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.widget.q0;

/* JADX INFO: loaded from: classes8.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MenuItem f258369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f258370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private q0 f258371c = null;

    n(l lVar, @d0 int i10) {
        MenuItem menuItemFindItem = null;
        Menu menu = lVar.f258366b.get();
        this.f258370b = lVar;
        if (menu != null) {
            menuItemFindItem = menu.findItem(i10);
        }
        this.f258369a = menuItemFindItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(FragmentController fragmentController, View view) {
        fragmentController.onOptionsItemSelected(this.f258369a);
    }

    public l b(p pVar) {
        MenuItem menuItem = this.f258369a;
        if (menuItem != null) {
            q0 q0Var = this.f258371c;
            if (q0Var != null) {
                q0Var.setText(menuItem.getTitle());
            }
            this.f258370b.a().b(this.f258369a.getItemId(), pVar);
        }
        return this.f258370b;
    }

    public boolean c() {
        MenuItem menuItem = this.f258369a;
        return menuItem != null && menuItem.isEnabled();
    }

    public boolean d() {
        MenuItem menuItem = this.f258369a;
        return menuItem != null && menuItem.isVisible();
    }

    public n f(View view) {
        MenuItem menuItem = this.f258369a;
        if (menuItem != null) {
            menuItem.setActionView(view);
        }
        return this;
    }

    public n g(boolean z10) {
        MenuItem menuItem = this.f258369a;
        if (menuItem != null) {
            menuItem.setCheckable(z10);
        }
        return this;
    }

    public n h(boolean z10) {
        MenuItem menuItem = this.f258369a;
        if (menuItem != null) {
            menuItem.setChecked(z10);
        }
        return this;
    }

    public n i(boolean z10) {
        MenuItem menuItem = this.f258369a;
        if (menuItem != null) {
            menuItem.setEnabled(z10);
        }
        return this;
    }

    public n j(@androidx.annotation.v int i10) {
        return l(i10, null, null);
    }

    public n k(@androidx.annotation.v int i10, @androidx.annotation.l Integer num) {
        return l(i10, num, num);
    }

    public n l(@androidx.annotation.v int i10, @androidx.annotation.l Integer num, @androidx.annotation.l Integer num2) {
        MenuItem menuItem = this.f258369a;
        if (menuItem != null) {
            menuItem.setIcon(i10);
            if (num != null && num2 != null) {
                p0.q(this.f258369a, new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{num.intValue(), num2.intValue()}));
            }
        }
        return this;
    }

    public n m(final FragmentController fragmentController, @androidx.annotation.v int i10, int i11) {
        if (this.f258369a != null) {
            q0 q0Var = new q0(fragmentController.getActivity());
            q0Var.setCompoundDrawablesWithIntrinsicBounds(com.planner5d.library.widget.drawable.c.f254258a.a(fragmentController.getActivity(), i10, Integer.valueOf(i11)), (Drawable) null, (Drawable) null, (Drawable) null);
            q0Var.setTextColor(i11);
            q0Var.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.menu.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f258367a.e(fragmentController, view);
                }
            });
            MenuItem menuItem = this.f258369a;
            this.f258371c = q0Var;
            menuItem.setActionView(q0Var);
        }
        return this;
    }

    public n n(int i10) {
        MenuItem menuItem = this.f258369a;
        if (menuItem != null) {
            menuItem.setShowAsAction(i10);
        }
        return this;
    }

    public n o(Context context, @f1 int i10, Object... objArr) {
        MenuItem menuItem = this.f258369a;
        if (menuItem != null) {
            menuItem.setTitle(context.getString(i10, objArr));
        }
        return this;
    }

    public n p(SpannableString spannableString) {
        MenuItem menuItem = this.f258369a;
        if (menuItem != null) {
            menuItem.setTitle(spannableString);
        }
        return this;
    }

    public n q(boolean z10) {
        MenuItem menuItem = this.f258369a;
        if (menuItem != null) {
            menuItem.setVisible(z10);
        }
        return this;
    }
}
