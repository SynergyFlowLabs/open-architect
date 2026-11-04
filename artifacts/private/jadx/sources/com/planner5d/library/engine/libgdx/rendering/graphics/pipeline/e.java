package com.planner5d.library.engine.libgdx.rendering.graphics.pipeline;

import ac.i;
import android.content.Context;
import android.opengl.GLES20;
import androidx.annotation.u0;
import com.badlogic.gdx.graphics.g3d.j;
import com.badlogic.gdx.utils.t;
import com.planner5d.library.math.m;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.p;

/* JADX INFO: loaded from: classes5.dex */
public class e extends com.badlogic.gdx.graphics.g3d.utils.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f160868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    float f160869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    m f160870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<j> f160871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f160872g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final gc.g f160873h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.badlogic.gdx.graphics.g3d.shaders.b.c f160874i;

    e(Context context, com.planner5d.library.engine.a aVar, gc.g gVar) {
        super(aVar);
        this.f160868c = true;
        this.f160869d = 1.0f;
        this.f160870e = new m();
        this.f160871f = new ArrayList();
        this.f160874i = new com.badlogic.gdx.graphics.g3d.shaders.b.c();
        this.f160872g = context;
        this.f160873h = gVar;
    }

    public static String e(Context context, @u0 int i10) {
        try {
            return p.K0(context.getResources().openRawResource(i10), Charset.defaultCharset());
        } catch (IOException unused) {
            throw new t("Error reading shader from resource: " + i10);
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.c
    protected j a(com.badlogic.gdx.graphics.g3d.h hVar) {
        for (j jVar : this.f160871f) {
            if (jVar.V0(hVar)) {
                return jVar;
            }
        }
        b bVar = (b) hVar.f94428g;
        i iVarG = null;
        com.planner5d.library.engine.libgdx.rendering.graphics.shadows.a aVarE0 = bVar == null ? null : bVar.e0();
        if (aVarE0 != null) {
            iVarG = aVarE0.G();
        }
        com.badlogic.gdx.graphics.g3d.shaders.b.a aVar = new com.badlogic.gdx.graphics.g3d.shaders.b.a(e(this.f160872g, zb.b.p.f407246k), ((iVarG == null || i.None.equals(iVarG)) ? "" : "#define SHADOW_" + iVarG.f4880a + "\n#define TEXEL_SIZE 1.0 / " + aVarE0.H() + ".0\n") + e(this.f160872g, zb.b.p.f407243h));
        aVar.f94520c = 1;
        String strG0 = com.badlogic.gdx.graphics.g3d.shaders.b.g0(hVar, aVar);
        d dVar = new d(hVar, aVar, com.planner5d.library.engine.libgdx.rendering.graphics.j.a(new com.badlogic.gdx.graphics.glutils.j(this.f94616b, strG0 + aVar.f94518a, strG0 + aVar.f94519b), this.f160873h), this.f160874i, this);
        dVar.r();
        this.f160871f.add(dVar);
        return dVar;
    }

    void b() {
        if (!this.f160868c) {
            this.f160868c = true;
            GLES20.glColorMask(true, true, true, true);
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.c, gc.e
    public void dispose() {
        this.f160871f.clear();
        super.dispose();
    }
}
