package app.rive.runtime.kotlin.core;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AnimationState extends LayerState {
    public AnimationState(long j10) {
        super(j10);
    }

    private final native String cppName(long j10);

    @NotNull
    public final String getName() {
        return cppName(getCppPointer());
    }

    @Override // app.rive.runtime.kotlin.core.LayerState
    @NotNull
    public String toString() {
        return getName();
    }
}
