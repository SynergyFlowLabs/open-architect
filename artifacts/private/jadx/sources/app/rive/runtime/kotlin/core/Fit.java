package app.rive.runtime.kotlin.core;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public enum Fit {
    FILL,
    CONTAIN,
    COVER,
    FIT_WIDTH,
    FIT_HEIGHT,
    NONE,
    SCALE_DOWN,
    LAYOUT;

    private static final /* synthetic */ kotlin.enums.a $ENTRIES = kotlin.enums.c.c(values());

    @NotNull
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Fit fromIndex(int i10) {
            int size = Fit.getEntries().size();
            if (i10 >= 0 && i10 <= size) {
                return Fit.getEntries().get(i10);
            }
            throw new IndexOutOfBoundsException("Invalid Fit index value " + i10 + ". It must be between 0 and " + size);
        }

        private Companion() {
        }
    }

    static {
        int i10 = 2 | 4;
    }

    @NotNull
    public static kotlin.enums.a<Fit> getEntries() {
        return $ENTRIES;
    }
}
