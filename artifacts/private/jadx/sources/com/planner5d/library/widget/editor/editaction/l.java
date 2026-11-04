package com.planner5d.library.widget.editor.editaction;

import androidx.annotation.NonNull;
import com.planner5d.library.model.item.ItemRoom;

/* JADX INFO: loaded from: classes12.dex */
public class l extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f254779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f254780c;

    public l(String str, boolean z10, boolean z11) {
        super(str);
        this.f254779b = z10;
        this.f254780c = z11;
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void a(@NonNull h hVar) {
        ItemRoom itemRoom = (ItemRoom) hVar.a(this.f254756a);
        if (itemRoom != null) {
            itemRoom.setFloorHidden(!this.f254779b);
            itemRoom.setCeilingHidden(!this.f254780c);
        }
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void c(@NonNull h hVar) {
        ItemRoom itemRoom = (ItemRoom) hVar.a(this.f254756a);
        if (itemRoom != null) {
            if (hVar.f254764b != null) {
                itemRoom.resetDrawables();
            } else if (hVar.f254765c != null) {
                com.planner5d.library.widget.editor.editor3d.model.p.h(itemRoom, hVar, null);
            }
        }
    }
}
