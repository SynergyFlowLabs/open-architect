package app.rive.runtime.kotlin.core;

import androidx.annotation.l1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AudioAsset extends FileAsset {
    public AudioAsset(long j10, int i10) {
        super(j10, i10, null);
    }

    private final native long cppGetAudio(long j10);

    private final native void cppSetAudio(long j10, long j11);

    @l1
    @NotNull
    public final RiveAudio getAudio() {
        return new RiveAudio(cppGetAudio(getCppPointer()));
    }

    public final void setAudio(@NotNull RiveAudio value) {
        Intrinsics.checkNotNullParameter(value, "value");
        cppSetAudio(getCppPointer(), value.getCppPointer());
    }
}
