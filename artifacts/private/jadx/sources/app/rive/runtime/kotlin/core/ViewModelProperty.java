package app.rive.runtime.kotlin.core;

import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.z0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ViewModelProperty<T> extends NativeObject {

    @NotNull
    private final k0<T> _valueFlow;

    @NotNull
    private final z0<T> valueFlow;

    public ViewModelProperty(long j10) {
        super(j10);
        k0<T> k0VarA = b1.a(nativeGetValue());
        this._valueFlow = k0VarA;
        this.valueFlow = k.n(k0VarA);
    }

    private final native boolean cppFlushChanges(long j10);

    private final native boolean cppHasChanged(long j10);

    public final T getValue() {
        return this._valueFlow.getValue();
    }

    @NotNull
    public final z0<T> getValueFlow() {
        return this.valueFlow;
    }

    public final boolean isSubscribed$kotlin_release() {
        return this._valueFlow.i().getValue().intValue() > 0;
    }

    protected abstract T nativeGetValue();

    protected abstract void nativeSetValue(T t10);

    public final void pollChanges$kotlin_release() {
        if (cppHasChanged(getCppPointer())) {
            this._valueFlow.setValue(nativeGetValue());
            cppFlushChanges(getCppPointer());
        }
    }

    public final void setValue(T t10) {
        nativeSetValue(t10);
        this._valueFlow.setValue(t10);
    }
}
