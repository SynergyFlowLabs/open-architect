package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import com.google.firebase.messaging.e;
import com.google.gson.annotations.c;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class Space {
    public static final int $stable = 0;

    @c(e.f.f123534d)
    @Nullable
    private final String label;

    @c("type")
    @NotNull
    private final Type type;

    public enum Type {
        HOME,
        MESSAGES,
        HELP,
        TICKETS;

        private static final /* synthetic */ a $ENTRIES = kotlin.enums.c.c(values());

        @NotNull
        public static a<Type> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Space() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Space copy$default(Space space, Type type, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            type = space.type;
        }
        if ((i10 & 2) != 0) {
            str = space.label;
        }
        return space.copy(type, str);
    }

    @NotNull
    public final Type component1() {
        return this.type;
    }

    @Nullable
    public final String component2() {
        return this.label;
    }

    @NotNull
    public final Space copy(@NotNull Type type, @Nullable String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new Space(type, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Space)) {
            return false;
        }
        Space space = (Space) obj;
        if (this.type == space.type && Intrinsics.areEqual(this.label, space.label)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.label;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "Space(type=" + this.type + ", label=" + this.label + ')';
    }

    public Space(@NotNull Type type, @Nullable String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.label = str;
    }

    public /* synthetic */ Space(Type type, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Type.HOME : type, (i10 & 2) != 0 ? null : str);
    }
}
