package com.planner5d.library.widget.editor.editor3d.model;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.widget.editor.editor3d.w;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f255750c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final w f255751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f0 f255752b;

    public i(@NotNull w editor) {
        Intrinsics.checkNotNullParameter(editor, "editor");
        this.f255751a = editor;
        this.f255752b = g0.c(new Function0() { // from class: com.planner5d.library.widget.editor.editor3d.model.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.c(this.f255749a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g c(i iVar) {
        return new g(iVar.f255751a.P0());
    }

    @NotNull
    public final g b() {
        return (g) this.f255752b.getValue();
    }
}
