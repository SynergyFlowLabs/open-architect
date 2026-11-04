package app.rive.runtime.kotlin.core;

import kotlin.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class RiveEventReport extends NativeObject {

    @NotNull
    private final RiveEvent event;
    private final long unsafeCppPointer;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EventType.values().length];
            try {
                iArr[EventType.OpenURLEvent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventType.GeneralEvent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RiveEventReport(long j10, float f10) {
        super(j10);
        this.unsafeCppPointer = j10;
        this.event = convertEvent(new RiveEvent(j10, f10));
    }

    private final RiveEvent convertEvent(RiveEvent riveEvent) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[riveEvent.getType().ordinal()];
        if (i10 == 1) {
            return new RiveOpenURLEvent(riveEvent.getCppPointer(), riveEvent.getDelay());
        }
        if (i10 == 2) {
            return new RiveGeneralEvent(riveEvent.getCppPointer(), riveEvent.getDelay());
        }
        throw new k0();
    }

    @NotNull
    public final RiveEvent getEvent() {
        return this.event;
    }

    public final long getUnsafeCppPointer() {
        return this.unsafeCppPointer;
    }
}
