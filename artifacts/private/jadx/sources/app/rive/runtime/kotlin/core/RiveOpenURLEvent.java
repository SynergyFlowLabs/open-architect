package app.rive.runtime.kotlin.core;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class RiveOpenURLEvent extends RiveEvent {
    public RiveOpenURLEvent(long j10, float f10) {
        super(j10, f10);
    }

    private final native String cppTarget(long j10);

    private final native String cppURL(long j10);

    @NotNull
    public final String getTarget() {
        return cppTarget(getCppPointer());
    }

    @NotNull
    public final String getUrl() {
        return cppURL(getCppPointer());
    }

    @Override // app.rive.runtime.kotlin.core.RiveEvent
    @NotNull
    public String toString() {
        return "OpenURLRiveEvent, name: " + getName() + ", url: " + getUrl() + ", target: " + getTarget() + ", properties: " + getProperties();
    }
}
