package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.annotation.NonNull;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class u extends androidx.appcompat.view.menu.g {
    public u(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.g, android.view.Menu
    @NonNull
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        androidx.appcompat.view.menu.j jVar = (androidx.appcompat.view.menu.j) a(i10, i11, i12, charSequence);
        w wVar = new w(x(), this, jVar);
        jVar.A(wVar);
        return wVar;
    }
}
