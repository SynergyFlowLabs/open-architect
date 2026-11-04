package app.rive.runtime.kotlin.core;

import androidx.annotation.l1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ImageAsset extends FileAsset {
    public ImageAsset(long j10, int i10) {
        super(j10, i10, null);
    }

    private final native long cppGetRenderImage(long j10);

    private final native float cppImageAssetHeight(long j10);

    private final native float cppImageAssetWidth(long j10);

    private final native void cppSetRenderImage(long j10, long j11);

    public final float getHeight() {
        return cppImageAssetHeight(getCppPointer());
    }

    @l1
    @NotNull
    public final RiveRenderImage getImage() {
        return new RiveRenderImage(cppGetRenderImage(getCppPointer()));
    }

    public final float getWidth() {
        return cppImageAssetWidth(getCppPointer());
    }

    public final void setImage(@NotNull RiveRenderImage value) {
        Intrinsics.checkNotNullParameter(value, "value");
        cppSetRenderImage(getCppPointer(), value.getCppPointer());
    }
}
