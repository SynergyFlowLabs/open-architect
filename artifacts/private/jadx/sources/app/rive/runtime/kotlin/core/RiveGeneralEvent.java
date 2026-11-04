package app.rive.runtime.kotlin.core;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class RiveGeneralEvent extends RiveEvent {
    public RiveGeneralEvent(long j10, float f10) {
        super(j10, f10);
    }

    @Override // app.rive.runtime.kotlin.core.RiveEvent
    @NotNull
    public String toString() {
        return "GeneralRiveEvent, name: " + getName() + ", properties: " + getProperties();
    }
}
