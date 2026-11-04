package com.planner5d.library.widget.editor.editaction;

import androidx.annotation.NonNull;
import androidx.annotation.m1;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemRuler;
import com.planner5d.library.model.manager.f2;

/* JADX INFO: loaded from: classes12.dex */
public class s extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.planner5d.library.model.metricunit.a f254788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f2 f254789c;

    public s(String str, com.planner5d.library.model.metricunit.a aVar, f2 f2Var) {
        super(str);
        this.f254788b = aVar;
        this.f254789c = f2Var;
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    @m1
    public void a(@NonNull h hVar) {
        this.f254789c.v(this.f254788b);
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void c(@NonNull h hVar) {
        if (hVar.f254764b == null) {
            return;
        }
        for (ItemFloor itemFloor : hVar.f254763a.getFloorArray()) {
            if (itemFloor != null) {
                for (Item item : itemFloor.getChildren()) {
                    if (item instanceof ItemRoom) {
                        ((ItemRoom) item).resetDrawables();
                    }
                }
            }
        }
        com.planner5d.library.widget.editor.projectresources.j jVarJ = hVar.f254767e.j();
        for (ItemRuler itemRuler : jVarJ == null ? new ItemRuler[0] : jVarJ.b()) {
            itemRuler.reset();
        }
    }
}
