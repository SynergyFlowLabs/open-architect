package app.rive.runtime.kotlin.core;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public enum RendererType {
    Rive(0),
    Canvas(1);

    private final int value;
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = kotlin.enums.c.c(values());

    @NotNull
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RendererType fromIndex(int i10) {
            int size = RendererType.getEntries().size();
            if (i10 >= 0 && i10 <= size) {
                return RendererType.getEntries().get(i10);
            }
            throw new IndexOutOfBoundsException("Invalid " + Companion.class + " index value " + i10 + ". It must be between 0 and " + size);
        }

        private Companion() {
        }
    }

    RendererType(int i10) {
        this.value = i10;
    }

    @NotNull
    public static kotlin.enums.a<RendererType> getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }
}
