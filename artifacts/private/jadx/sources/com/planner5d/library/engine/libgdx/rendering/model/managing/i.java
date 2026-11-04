package com.planner5d.library.engine.libgdx.rendering.model.managing;

import android.app.Application;
import com.planner5d.library.services.utility.c2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements ec.e {
    @Override // ec.e
    @NotNull
    public ec.c a(@NotNull ec.c modelAssetHandler, @NotNull ec.b fileAccessor) {
        Intrinsics.checkNotNullParameter(modelAssetHandler, "modelAssetHandler");
        Intrinsics.checkNotNullParameter(fileAccessor, "fileAccessor");
        return new d(modelAssetHandler, fileAccessor, new j());
    }

    @Override // ec.e
    @NotNull
    public ec.d b(@NotNull Application application, @NotNull ec.c modelAssetHandler, @NotNull ec.f textureAccessor, @NotNull c2 networkStateUtility, @NotNull cc.b modelFactory) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(modelAssetHandler, "modelAssetHandler");
        Intrinsics.checkNotNullParameter(textureAccessor, "textureAccessor");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        Intrinsics.checkNotNullParameter(modelFactory, "modelFactory");
        return new b(application, (d) modelAssetHandler, textureAccessor, networkStateUtility, modelFactory);
    }

    @Override // ec.e
    @NotNull
    public ec.f c(@NotNull fc.b textureReader, @NotNull ij.c<fc.a.InterfaceC1901a> editorStateProvider) {
        Intrinsics.checkNotNullParameter(textureReader, "textureReader");
        Intrinsics.checkNotNullParameter(editorStateProvider, "editorStateProvider");
        return new g(textureReader, editorStateProvider);
    }
}
