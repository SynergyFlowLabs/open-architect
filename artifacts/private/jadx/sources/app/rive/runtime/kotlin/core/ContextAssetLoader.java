package app.rive.runtime.kotlin.core;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ContextAssetLoader extends FileAssetLoader {

    @NotNull
    private final Context context;

    public ContextAssetLoader(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @NotNull
    protected final Context getContext() {
        return this.context;
    }
}
