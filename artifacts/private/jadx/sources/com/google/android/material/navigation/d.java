package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.appcompat.view.menu.j;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class d extends androidx.appcompat.view.menu.g {

    @NonNull
    private final Class<?> Q;
    private final int R;

    public d(@NonNull Context context, @NonNull Class<?> cls, int i10) {
        super(context);
        this.Q = cls;
        this.R = i10;
    }

    @Override // androidx.appcompat.view.menu.g
    @NonNull
    protected MenuItem a(int i10, int i11, int i12, @NonNull CharSequence charSequence) {
        if (size() + 1 <= this.R) {
            n0();
            MenuItem menuItemA = super.a(i10, i11, i12, charSequence);
            if (menuItemA instanceof j) {
                ((j) menuItemA).w(true);
            }
            m0();
            return menuItemA;
        }
        String simpleName = this.Q.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + this.R + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }

    @Override // androidx.appcompat.view.menu.g, android.view.Menu
    @NonNull
    public SubMenu addSubMenu(int i10, int i11, int i12, @NonNull CharSequence charSequence) {
        throw new UnsupportedOperationException(this.Q.getSimpleName() + " does not support submenus");
    }

    public int o0() {
        return this.R;
    }
}
