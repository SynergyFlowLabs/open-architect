package app.rive.runtime.kotlin.core;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ViewModelBooleanProperty extends ViewModelProperty<Boolean> {
    public ViewModelBooleanProperty(long j10) {
        super(j10);
    }

    private final native boolean cppGetValue(long j10);

    private final native void cppSetValue(long j10, boolean z10);

    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public /* bridge */ /* synthetic */ void nativeSetValue(Boolean bool) {
        nativeSetValue(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    @NotNull
    public Boolean nativeGetValue() {
        return Boolean.valueOf(cppGetValue(getCppPointer()));
    }

    protected void nativeSetValue(boolean z10) {
        cppSetValue(getCppPointer(), z10);
    }
}
