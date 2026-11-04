package app.rive.runtime.kotlin.core;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class SMITrigger extends SMIInput {
    public SMITrigger(long j10) {
        super(j10);
    }

    private final native void cppFire(long j10);

    public final void fire$kotlin_release() {
        cppFire(getCppPointer());
    }

    @Override // app.rive.runtime.kotlin.core.SMIInput
    @NotNull
    public String toString() {
        return "SMITrigger " + getName() + '\n';
    }
}
