package com.planner5d.library.widget.editor.editor3d.model.builder;

import androidx.compose.runtime.internal.w0;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
public final class d implements com.planner5d.library.mesh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f255651b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f0 f255652a;

    public d(@NotNull final Function0<? extends dc.e<cc.a>> builderProvider) {
        Intrinsics.checkNotNullParameter(builderProvider, "builderProvider");
        this.f255652a = g0.c(new Function0() { // from class: com.planner5d.library.widget.editor.editor3d.model.builder.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d.c(builderProvider);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dc.e c(Function0 function0) {
        return (dc.e) function0.invoke();
    }

    private final dc.e<cc.a> d() {
        return (dc.e) this.f255652a.getValue();
    }

    @Override // com.planner5d.library.mesh.e
    public void a(@NotNull com.planner5d.library.math.n v10, @NotNull com.planner5d.library.math.n v11, @NotNull com.planner5d.library.math.n v12) {
        Intrinsics.checkNotNullParameter(v10, "v0");
        Intrinsics.checkNotNullParameter(v11, "v1");
        Intrinsics.checkNotNullParameter(v12, "v2");
        d().a(v10, v11, v12);
    }
}
