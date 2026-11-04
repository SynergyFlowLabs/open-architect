package app.rive.runtime.kotlin.core;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ViewModelNumberProperty extends ViewModelProperty<Float> {
    public ViewModelNumberProperty(long j10) {
        super(j10);
    }

    private final native float cppGetValue(long j10);

    private final native void cppSetValue(long j10, float f10);

    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public /* bridge */ /* synthetic */ void nativeSetValue(Float f10) {
        nativeSetValue(f10.floatValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    @NotNull
    public Float nativeGetValue() {
        return Float.valueOf(cppGetValue(getCppPointer()));
    }

    protected void nativeSetValue(float f10) {
        cppSetValue(getCppPointer(), f10);
    }
}
