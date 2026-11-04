package com.planner5d.library.widget.editor.editaction;

import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemProject;

/* JADX INFO: loaded from: classes12.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ItemProject f254763a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.planner5d.library.widget.editor.facade.f f254767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.planner5d.library.widget.editor.helper.selector.a f254768f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.planner5d.library.widget.editor.facade.e0 f254769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.planner5d.library.widget.editor.facade.v f254770h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.planner5d.library.model.manager.builtin.i f254771i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.planner5d.library.widget.editor.editor2d.o f254764b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.planner5d.library.widget.editor.editor3d.scene3d.j f254765c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ve.b f254766d = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Item f254772j = null;

    public h(ItemProject itemProject, com.planner5d.library.model.manager.builtin.i iVar, com.planner5d.library.widget.editor.facade.f fVar, com.planner5d.library.widget.editor.helper.selector.a aVar, com.planner5d.library.widget.editor.facade.e0 e0Var, com.planner5d.library.widget.editor.facade.v vVar) {
        this.f254763a = itemProject;
        this.f254771i = iVar;
        this.f254767e = fVar;
        this.f254768f = aVar;
        this.f254769g = e0Var;
        this.f254770h = vVar;
    }

    private Item b(String str, Item item) {
        if (item != null && str != null) {
            if (str.equals(item.getUid())) {
                return item;
            }
            Item[] children = item.getChildren();
            if (children == null) {
                return null;
            }
            for (Item item2 : children) {
                Item itemB = b(str, item2);
                if (itemB != null) {
                    return itemB;
                }
            }
        }
        return null;
    }

    protected <T extends Item> T a(String str) {
        Item item = this.f254772j;
        if (item == null || !str.equals(item.getUid())) {
            this.f254772j = b(str, this.f254763a);
        }
        return (T) this.f254772j;
    }

    public void c(com.planner5d.library.widget.editor.editor2d.o oVar) {
        this.f254764b = oVar;
        this.f254765c = null;
    }

    public void d(com.planner5d.library.widget.editor.editor3d.scene3d.j jVar, ve.b bVar) {
        this.f254765c = jVar;
        this.f254766d = bVar;
        this.f254764b = null;
    }
}
