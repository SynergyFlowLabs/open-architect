package com.planner5d.library.widget.editor.editor2d.painter;

import androidx.compose.runtime.internal.w0;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 1)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f255320a = 0;

    private final void a(boolean z10, com.planner5d.library.widget.editor.editor2d.drawable.d dVar, d dVar2, boolean z11) {
        com.planner5d.library.widget.editor.editor2d.o scene = dVar2.f255186s;
        Intrinsics.checkNotNullExpressionValue(scene, "scene");
        Iterator itA = kotlin.jvm.internal.i.a(z10 ? scene.e() : scene.f());
        while (itA.hasNext()) {
            com.planner5d.library.widget.editor.editor2d.drawable.f fVar = (com.planner5d.library.widget.editor.editor2d.drawable.f) itA.next();
            fVar.a(dVar2, scene, dVar2.M, z11);
            fVar.b(dVar, false, dVar2.M);
        }
    }

    public final void b(@NotNull com.planner5d.library.widget.editor.editor2d.drawable.d drawableEditorCanvas, @NotNull d data, boolean z10) {
        Intrinsics.checkNotNullParameter(drawableEditorCanvas, "drawableEditorCanvas");
        Intrinsics.checkNotNullParameter(data, "data");
        a(true, drawableEditorCanvas, data, z10);
    }

    public final void c(@NotNull com.planner5d.library.widget.editor.editor2d.drawable.d drawableEditorCanvas, @NotNull d data, boolean z10) {
        Intrinsics.checkNotNullParameter(drawableEditorCanvas, "drawableEditorCanvas");
        Intrinsics.checkNotNullParameter(data, "data");
        a(false, drawableEditorCanvas, data, z10);
    }
}
