package com.planner5d.library.widget.editor.popup.properties.adapter;

import android.content.Context;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.manager.k5;
import com.planner5d.library.model.manager.k5.c;
import com.planner5d.library.services.utility.p0;

/* JADX INFO: loaded from: classes8.dex */
abstract class m<T extends k5.c> extends k<T> {
    public m(p0 p0Var, com.planner5d.library.services.bitmaploader.target.h hVar) {
        super(p0Var, hVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.widget.editor.popup.properties.adapter.k
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void x(com.planner5d.library.widget.editor.popup.properties.view.j jVar, k5.c cVar, String str, ItemProject itemProject, ItemRoom itemRoom) {
        jVar.w(cVar, itemProject, str);
    }

    @Override // com.planner5d.library.widget.editor.popup.properties.adapter.k
    protected com.planner5d.library.widget.editor.popup.properties.view.j n(Context context, boolean z10) {
        return super.n(context, z10).r(true);
    }
}
