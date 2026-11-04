package com.planner5d.library.widget.editor.editaction;

import androidx.annotation.NonNull;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ItemPr;

/* JADX INFO: loaded from: classes12.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f254756a;

    public e(@fj.h String str) {
        this.f254756a = str;
    }

    public abstract void a(@NonNull h hVar);

    protected void b(@NonNull h hVar, @fj.h Item item) {
        if ((item instanceof ItemNs) || (item instanceof ItemPr)) {
            hVar.f254769g.u();
        }
    }

    public void c(@NonNull h hVar) {
    }
}
