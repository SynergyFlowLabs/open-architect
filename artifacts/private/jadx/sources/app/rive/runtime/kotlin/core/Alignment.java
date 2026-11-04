package app.rive.runtime.kotlin.core;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public enum Alignment {
    TOP_LEFT,
    TOP_CENTER,
    TOP_RIGHT,
    CENTER_LEFT,
    CENTER,
    CENTER_RIGHT,
    BOTTOM_LEFT,
    BOTTOM_CENTER,
    BOTTOM_RIGHT;

    private static final /* synthetic */ kotlin.enums.a $ENTRIES = kotlin.enums.c.c(values());

    @NotNull
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Alignment fromIndex(int i10) {
            int size = Alignment.getEntries().size();
            if (i10 >= 0 && i10 <= size) {
                return Alignment.getEntries().get(i10);
            }
            throw new IndexOutOfBoundsException("Invalid Alignment index value " + i10 + ". It must be between 0 and " + size);
        }

        private Companion() {
        }
    }

    static {
        int i10 = 4 << 1;
    }

    @NotNull
    public static kotlin.enums.a<Alignment> getEntries() {
        return $ENTRIES;
    }
}
