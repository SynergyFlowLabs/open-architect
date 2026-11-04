package app.rive.runtime.kotlin.core;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ViewModelColorProperty extends ViewModelProperty<Integer> {
    public ViewModelColorProperty(long j10) {
        super(j10);
    }

    private final native int cppGetValue(long j10);

    private final native void cppSetValue(long j10, int i10);

    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public /* bridge */ /* synthetic */ void nativeSetValue(Integer num) {
        nativeSetValue(num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    @NotNull
    public Integer nativeGetValue() {
        return Integer.valueOf(cppGetValue(getCppPointer()));
    }

    protected void nativeSetValue(int i10) {
        cppSetValue(getCppPointer(), i10);
    }
}
