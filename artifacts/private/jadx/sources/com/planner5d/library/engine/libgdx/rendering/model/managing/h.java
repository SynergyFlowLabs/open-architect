package com.planner5d.library.engine.libgdx.rendering.model.managing;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h f160964a = new h();

    private h() {
    }

    @n
    @NotNull
    public static final com.badlogic.gdx.graphics.k a(@NotNull com.planner5d.library.engine.a application, @NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            throw new RuntimeException("Can load only ARGB_8888");
        }
        com.badlogic.gdx.graphics.k kVar = new com.badlogic.gdx.graphics.k(application, bitmap.getWidth(), bitmap.getHeight(), com.badlogic.gdx.graphics.i.c.RGBA8888);
        GLES20.glActiveTexture(33987);
        GLES20.glBindTexture(3553, kVar.i());
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        GLES20.glGenerateMipmap(3553);
        kVar.x(com.badlogic.gdx.graphics.k.a.MipMapLinearLinear, com.badlogic.gdx.graphics.k.a.Linear);
        com.badlogic.gdx.graphics.k.b bVar = com.badlogic.gdx.graphics.k.b.Repeat;
        kVar.y(bVar, bVar);
        GLES20.glBindTexture(3553, 0);
        return kVar;
    }

    @n
    @NotNull
    public static final com.badlogic.gdx.graphics.k b(@NotNull com.planner5d.library.engine.a application, @androidx.annotation.l int i10) {
        Intrinsics.checkNotNullParameter(application, "application");
        com.badlogic.gdx.graphics.i iVar = new com.badlogic.gdx.graphics.i(4, 4, com.badlogic.gdx.graphics.i.c.RGB565);
        iVar.x(Color.red(i10) / 255.0f, Color.green(i10) / 255.0f, Color.blue(i10) / 255.0f, Color.alpha(i10) / 255.0f);
        iVar.j();
        boolean z10 = true & false;
        return new com.badlogic.gdx.graphics.k(application, new com.badlogic.gdx.graphics.glutils.i(iVar, null, false, true));
    }
}
