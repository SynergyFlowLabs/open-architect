package com.planner5d.library.widget.editor.editor2d.drawable;

import com.planner5d.library.model.item.ItemRuler;
import com.planner5d.library.walls.WallsInfoWall;

/* JADX INFO: loaded from: classes12.dex */
public class t extends r {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final boolean f255089x;

    public t(t tVar) {
        super(tVar);
        this.f255089x = tVar.f255089x;
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.r, com.planner5d.library.widget.editor.editor2d.drawable.c
    public int g() {
        return -3;
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.r
    protected int k(boolean z10, boolean z11) {
        if (z11) {
            return z10 ? 857516907 : -14898325;
        }
        return -10524299;
    }

    public boolean n() {
        return this.f255089x;
    }

    public t(WallsInfoWall wallsInfoWall) {
        super(wallsInfoWall);
        this.f255089x = wallsInfoWall != null && (wallsInfoWall.getWall() instanceof ItemRuler);
    }
}
