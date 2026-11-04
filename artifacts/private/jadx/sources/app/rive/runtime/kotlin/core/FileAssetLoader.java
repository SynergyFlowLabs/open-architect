package app.rive.runtime.kotlin.core;

import app.rive.runtime.kotlin.core.errors.RiveException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FileAssetLoader extends NativeObject {
    public FileAssetLoader() throws RiveException {
        super(0L);
        setCppPointer(constructor());
        getRefs().incrementAndGet();
        getCppPointer();
    }

    private final native void cppSetRendererType(long j10, int i10);

    protected final native long constructor();

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long j10);

    public abstract boolean loadContents(@NotNull FileAsset fileAsset, @NotNull byte[] bArr);

    public final void setRendererType(@NotNull RendererType rendererType) {
        Intrinsics.checkNotNullParameter(rendererType, "rendererType");
        cppSetRendererType(getCppPointer(), rendererType.getValue());
    }
}
