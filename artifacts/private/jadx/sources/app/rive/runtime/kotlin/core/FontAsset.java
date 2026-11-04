package app.rive.runtime.kotlin.core;

import androidx.annotation.l1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class FontAsset extends FileAsset {
    public FontAsset(long j10, int i10) {
        super(j10, i10, null);
    }

    private final native long cppGetFont(long j10);

    private final native void cppSetFont(long j10, long j11);

    @l1
    @NotNull
    public final RiveFont getFont() {
        return new RiveFont(cppGetFont(getCppPointer()));
    }

    public final void setFont(@NotNull RiveFont value) {
        Intrinsics.checkNotNullParameter(value, "value");
        cppSetFont(getCppPointer(), value.getCppPointer());
    }
}
