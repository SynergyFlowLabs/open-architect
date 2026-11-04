package com.planner5d.library.widget.editor.editaction;

import androidx.annotation.NonNull;
import com.planner5d.library.model.item.ItemNs;

/* JADX INFO: loaded from: classes12.dex */
public class v extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f254803b;

    public v(String str, boolean z10) {
        super(str);
        this.f254803b = z10;
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void a(@NonNull h hVar) {
        ItemNs itemNs = (ItemNs) hVar.a(this.f254756a);
        if (itemNs != null) {
            itemNs.setClosed(this.f254803b);
        }
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void c(@NonNull h hVar) {
        ItemNs itemNs = (ItemNs) hVar.a(this.f254756a);
        if (itemNs != null) {
            b(hVar, itemNs);
            if (hVar.f254765c != null) {
                com.planner5d.library.widget.editor.editor3d.model.p.h(itemNs, hVar, null);
            }
        }
    }
}
