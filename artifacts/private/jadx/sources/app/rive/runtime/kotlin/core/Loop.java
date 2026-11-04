package app.rive.runtime.kotlin.core;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public enum Loop {
    ONESHOT,
    LOOP,
    PINGPONG,
    AUTO;

    private static final /* synthetic */ kotlin.enums.a $ENTRIES = kotlin.enums.c.c(values());

    @NotNull
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Loop fromIndex(int i10) {
            int size = Loop.getEntries().size();
            if (i10 >= 0 && i10 <= size) {
                return Loop.getEntries().get(i10);
            }
            throw new IndexOutOfBoundsException("Invalid Loop index value " + i10 + ". It must be between 0 and " + size);
        }

        private Companion() {
        }
    }

    static {
        int i10 = 5 & 0;
    }

    @NotNull
    public static kotlin.enums.a<Loop> getEntries() {
        return $ENTRIES;
    }
}
