package com.planner5d.library.engine.libgdx.rendering.graphics;

import com.badlogic.gdx.utils.t;
import com.planner5d.library.services.utility.q2;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j f160856a = new j();

    private j() {
    }

    @n
    @NotNull
    public static final com.badlogic.gdx.graphics.glutils.j a(@NotNull com.badlogic.gdx.graphics.glutils.j program, @NotNull gc.g errorHandler) throws t {
        Intrinsics.checkNotNullParameter(program, "program");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        if (program.P()) {
            return program;
        }
        Integer num = (Integer) q2.d(program, com.badlogic.gdx.graphics.glutils.j.class, "vertexShaderHandle");
        Integer num2 = (Integer) q2.d(program, com.badlogic.gdx.graphics.glutils.j.class, "fragmentShaderHandle");
        String str = program.D() + " (vertex: " + num + ", fragment: " + num2 + ")\nVertex shader:\n" + program.I() + "\nFragment shader:\n" + program.C();
        errorHandler.a(str);
        throw new t("Shader error: " + str);
    }
}
