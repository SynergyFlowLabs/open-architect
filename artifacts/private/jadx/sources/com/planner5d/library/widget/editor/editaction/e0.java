package com.planner5d.library.widget.editor.editaction;

import androidx.annotation.NonNull;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemRoom;

/* JADX INFO: loaded from: classes12.dex */
public class e0 extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f254757b;

    public e0(String str, int i10) {
        super(str);
        this.f254757b = i10;
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void a(@NonNull h hVar) {
        Item itemA = hVar.a(this.f254756a);
        if (itemA instanceof ItemRoom) {
            int i10 = this.f254757b;
            ((ItemRoom) itemA).setType(i10, hVar.f254771i.b0(i10));
        }
    }
}
