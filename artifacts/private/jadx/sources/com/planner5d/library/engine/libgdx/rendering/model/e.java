package com.planner5d.library.engine.libgdx.rendering.model;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.planner5d.library.walls.WallsBuilder3DSide;

/* JADX INFO: loaded from: classes5.dex */
public class e extends d implements cc.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WallsBuilder3DSide f160931d;

    public e(@NonNull d dVar, WallsBuilder3DSide wallsBuilder3DSide) {
        super(dVar);
        this.f160931d = wallsBuilder3DSide;
    }

    @Override // cc.d
    @p0
    public WallsBuilder3DSide getInfo() {
        return this.f160931d;
    }
}
