package com.planner5d.library.activity.fragment.spaces.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.f1;
import androidx.compose.runtime.internal.w0;
import androidx.core.view.r0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 1)
public final class o implements r0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f136421d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f136422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Boolean> f136423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f136424c;

    public o(@f1 int i10, @NotNull Function0<Boolean> isEnabled, @NotNull Function0<Unit> onButtonClick) {
        Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
        Intrinsics.checkNotNullParameter(onButtonClick, "onButtonClick");
        this.f136422a = i10;
        this.f136423b = isEnabled;
        this.f136424c = onButtonClick;
    }

    private final MenuItem f(Menu menu) {
        MenuItem menuItemFindItem = menu.findItem(com.planner5d.library.f.j.U0);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem, "findItem(...)");
        return menuItemFindItem;
    }

    private final void g(Menu menu) {
        boolean zBooleanValue = this.f136423b.invoke().booleanValue();
        MenuItem menuItemF = f(menu);
        menuItemF.setEnabled(zBooleanValue);
        View actionView = menuItemF.getActionView();
        if (actionView != null) {
            actionView.setEnabled(zBooleanValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(o oVar, View view) {
        oVar.f136424c.invoke();
    }

    @Override // androidx.core.view.r0
    public void a(@NotNull Menu menu, @NotNull MenuInflater menuInflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(menuInflater, "menuInflater");
        menuInflater.inflate(com.planner5d.library.f.n.f168911d, menu);
        MenuItem menuItemF = f(menu);
        menuItemF.setActionView(com.planner5d.library.f.m.V5);
        View actionView = menuItemF.getActionView();
        if (actionView != null) {
            actionView.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.spaces.view.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    o.h(this.f136420a, view);
                }
            });
            TextView textView = actionView instanceof TextView ? (TextView) actionView : null;
            if (textView != null) {
                textView.setText(this.f136422a);
                textView.setTypeface(androidx.core.content.res.i.j(textView.getContext(), com.planner5d.library.f.i.f167925d));
            }
        }
        g(menu);
    }

    @Override // androidx.core.view.r0
    public void c(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        super.c(menu);
        g(menu);
    }

    @Override // androidx.core.view.r0
    public boolean d(@NotNull MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        if (menuItem.getItemId() != com.planner5d.library.f.j.U0) {
            return false;
        }
        this.f136424c.invoke();
        int i10 = 1 >> 1;
        return true;
    }
}
