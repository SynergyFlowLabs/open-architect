package app.rive.runtime.kotlin.core;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class SMINumber extends SMIInput {
    public SMINumber(long j10) {
        super(j10);
    }

    private final native void cppSetValue(long j10, float f10);

    private final native float cppValue(long j10);

    public final float getValue() {
        return cppValue(getCppPointer());
    }

    public final void setValue$kotlin_release(float f10) {
        cppSetValue(getCppPointer(), f10);
    }

    @Override // app.rive.runtime.kotlin.core.SMIInput
    @NotNull
    public String toString() {
        return "SMINumber " + getName() + '\n';
    }
}
