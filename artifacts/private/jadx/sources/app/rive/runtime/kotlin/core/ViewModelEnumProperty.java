package app.rive.runtime.kotlin.core;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ViewModelEnumProperty extends ViewModelProperty<String> {
    public ViewModelEnumProperty(long j10) {
        super(j10);
    }

    private final native String cppGetValue(long j10);

    private final native void cppSetValue(long j10, String str);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    @NotNull
    public String nativeGetValue() {
        return cppGetValue(getCppPointer());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public void nativeSetValue(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        cppSetValue(getCppPointer(), value);
    }
}
