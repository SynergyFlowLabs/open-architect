package app.rive.runtime.kotlin.core;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class SMIBoolean extends SMIInput {
    public SMIBoolean(long j10) {
        super(j10);
    }

    private final native void cppSetValue(long j10, boolean z10);

    private final native boolean cppValue(long j10);

    public final boolean getValue() {
        return cppValue(getCppPointer());
    }

    public final void setValue$kotlin_release(boolean z10) {
        cppSetValue(getCppPointer(), z10);
    }

    @Override // app.rive.runtime.kotlin.core.SMIInput
    @NotNull
    public String toString() {
        return "SMIBoolean " + getName() + '\n';
    }
}
