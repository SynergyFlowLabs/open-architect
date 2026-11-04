package com.planner5d.library.widget.editor.editaction;

import androidx.annotation.NonNull;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.services.m0;

/* JADX INFO: loaded from: classes12.dex */
public class o extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f254782b;

    public o(@NonNull String str, String str2) {
        super(str);
        this.f254782b = str2;
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void a(@NonNull h hVar) {
        ItemFloor itemFloor = (ItemFloor) hVar.a(this.f254756a);
        if (itemFloor != null) {
            itemFloor.title = this.f254782b;
        }
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void c(@NonNull h hVar) {
        m0.f224438k.t();
    }
}
