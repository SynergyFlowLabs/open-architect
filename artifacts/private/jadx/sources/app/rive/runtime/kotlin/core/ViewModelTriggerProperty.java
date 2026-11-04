package app.rive.runtime.kotlin.core;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ViewModelTriggerProperty extends ViewModelProperty<TriggerUnit> {

    public static final class TriggerUnit {
    }

    public ViewModelTriggerProperty(long j10) {
        super(j10);
    }

    private final native void cppTrigger(long j10);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public void nativeSetValue(@NotNull TriggerUnit value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    public final void trigger() {
        cppTrigger(getCppPointer());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    @NotNull
    public TriggerUnit nativeGetValue() {
        return new TriggerUnit();
    }
}
