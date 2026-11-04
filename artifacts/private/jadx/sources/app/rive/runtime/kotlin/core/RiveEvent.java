package app.rive.runtime.kotlin.core;

import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class RiveEvent extends NativeObject {
    private final float delay;

    public RiveEvent(long j10, float f10) {
        super(j10);
        this.delay = f10;
    }

    private final native HashMap<String, Object> cppData(long j10);

    private final native String cppName(long j10);

    private final native HashMap<String, Object> cppProperties(long j10);

    private final native short cppType(long j10);

    private final short getTypeCode() {
        return cppType(getCppPointer());
    }

    @NotNull
    public final HashMap<String, Object> getData() {
        return cppData(getCppPointer());
    }

    public final float getDelay() {
        return this.delay;
    }

    @NotNull
    public final String getName() {
        return cppName(getCppPointer());
    }

    @NotNull
    public final HashMap<String, Object> getProperties() {
        return cppProperties(getCppPointer());
    }

    @NotNull
    public final EventType getType() {
        EventType eventTypeFromInt = EventType.Companion.fromInt(getTypeCode());
        if (eventTypeFromInt == null) {
            eventTypeFromInt = EventType.GeneralEvent;
        }
        return eventTypeFromInt;
    }

    @NotNull
    public String toString() {
        return "RiveEvent " + getData();
    }
}
