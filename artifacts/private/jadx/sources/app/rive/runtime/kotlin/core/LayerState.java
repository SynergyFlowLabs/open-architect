package app.rive.runtime.kotlin.core;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class LayerState extends NativeObject {
    public LayerState(long j10) {
        super(j10);
    }

    private final native boolean cppIsAnimationState(long j10);

    private final native boolean cppIsAnyState(long j10);

    private final native boolean cppIsBlendState(long j10);

    private final native boolean cppIsBlendState1D(long j10);

    private final native boolean cppIsBlendStateDirect(long j10);

    private final native boolean cppIsEntryState(long j10);

    private final native boolean cppIsExitState(long j10);

    public final boolean isAnimationState() {
        return cppIsAnimationState(getCppPointer());
    }

    public final boolean isAnyState() {
        return cppIsAnyState(getCppPointer());
    }

    public final boolean isBlendState() {
        return cppIsBlendState(getCppPointer());
    }

    public final boolean isBlendState1D() {
        return cppIsBlendState1D(getCppPointer());
    }

    public final boolean isBlendStateDirect() {
        return cppIsBlendStateDirect(getCppPointer());
    }

    public final boolean isEntryState() {
        return cppIsEntryState(getCppPointer());
    }

    public final boolean isExitState() {
        return cppIsExitState(getCppPointer());
    }

    @NotNull
    public String toString() {
        return "LayerState";
    }
}
