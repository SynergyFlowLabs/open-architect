package com.planner5d.library.engine.libgdx.rendering.model;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.badlogic.gdx.graphics.g3d.g;

/* JADX INFO: loaded from: classes5.dex */
public class d implements gc.e, cc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.planner5d.library.engine.util.math.b f160928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.badlogic.gdx.graphics.g3d.e f160929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.planner5d.library.engine.libgdx.rendering.util.a f160930c;

    public d(@NonNull com.badlogic.gdx.graphics.g3d.e eVar, com.planner5d.library.engine.util.math.b bVar, @p0 com.planner5d.library.engine.libgdx.rendering.util.a aVar) {
        this.f160929b = eVar;
        this.f160928a = bVar;
        this.f160930c = aVar;
    }

    @Override // cc.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public g Y() {
        return new g(this.f160929b);
    }

    @Override // cc.a
    @p0
    public com.planner5d.library.engine.rendering.util.a a0() {
        return this.f160930c;
    }

    @Override // gc.e
    public void dispose() {
        this.f160929b.dispose();
    }

    @Override // cc.a
    @NonNull
    public com.planner5d.library.engine.util.math.b getBounds() {
        return this.f160928a;
    }

    public d(d dVar) {
        this(dVar.f160929b, dVar.f160928a, dVar.f160930c);
    }
}
