package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import com.google.firebase.messaging.e;
import com.google.gson.annotations.c;
import io.intercom.android.sdk.m5.home.data.IconType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class EmptyState {
    public static final int $stable = 0;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final EmptyState NULL = new EmptyState(null, null, null, 7, null);

    @c(com.facebook.internal.w0.f100156c1)
    @NotNull
    private final Action action;

    @c("text")
    @NotNull
    private final String text;

    @c("title")
    @NotNull
    private final String title;

    @w0(parameters = 1)
    public static final class Action {
        public static final int $stable = 0;

        @c("icon")
        @Nullable
        private final IconType icon;

        @c(e.f.f123534d)
        @NotNull
        private final String label;

        @c("type")
        @NotNull
        private final ActionType type;

        public Action() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ Action copy$default(Action action, ActionType actionType, String str, IconType iconType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                actionType = action.type;
            }
            if ((i10 & 2) != 0) {
                str = action.label;
            }
            if ((i10 & 4) != 0) {
                iconType = action.icon;
            }
            return action.copy(actionType, str, iconType);
        }

        @NotNull
        public final ActionType component1() {
            return this.type;
        }

        @NotNull
        public final String component2() {
            return this.label;
        }

        @Nullable
        public final IconType component3() {
            return this.icon;
        }

        @NotNull
        public final Action copy(@NotNull ActionType type, @NotNull String label, @Nullable IconType iconType) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(label, "label");
            return new Action(type, label, iconType);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return this.type == action.type && Intrinsics.areEqual(this.label, action.label) && this.icon == action.icon;
        }

        @Nullable
        public final IconType getIcon() {
            return this.icon;
        }

        @NotNull
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final ActionType getType() {
            return this.type;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2 = ((this.type.hashCode() * 31) + this.label.hashCode()) * 31;
            IconType iconType = this.icon;
            if (iconType == null) {
                iHashCode = 0;
                int i10 = 1 << 0;
            } else {
                iHashCode = iconType.hashCode();
            }
            return iHashCode2 + iHashCode;
        }

        @NotNull
        public String toString() {
            return "Action(type=" + this.type + ", label=" + this.label + ", icon=" + this.icon + ')';
        }

        public Action(@NotNull ActionType type, @NotNull String label, @Nullable IconType iconType) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(label, "label");
            this.type = type;
            this.label = label;
            this.icon = iconType;
        }

        public /* synthetic */ Action(ActionType actionType, String str, IconType iconType, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? ActionType.MESSAGE : actionType, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? null : iconType);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EmptyState getNULL() {
            return EmptyState.NULL;
        }

        private Companion() {
        }
    }

    static {
        int i10 = 4 & 0;
    }

    public EmptyState() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ EmptyState copy$default(EmptyState emptyState, String str, String str2, Action action, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = emptyState.title;
        }
        if ((i10 & 2) != 0) {
            str2 = emptyState.text;
        }
        if ((i10 & 4) != 0) {
            action = emptyState.action;
        }
        return emptyState.copy(str, str2, action);
    }

    @NotNull
    public final String component1() {
        return this.title;
    }

    @NotNull
    public final String component2() {
        return this.text;
    }

    @NotNull
    public final Action component3() {
        return this.action;
    }

    @NotNull
    public final EmptyState copy(@NotNull String title, @NotNull String text, @NotNull Action action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        return new EmptyState(title, text, action);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmptyState)) {
            return false;
        }
        EmptyState emptyState = (EmptyState) obj;
        return Intrinsics.areEqual(this.title, emptyState.title) && Intrinsics.areEqual(this.text, emptyState.text) && Intrinsics.areEqual(this.action, emptyState.action);
    }

    @NotNull
    public final Action getAction() {
        return this.action;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.text.hashCode()) * 31) + this.action.hashCode();
    }

    @NotNull
    public String toString() {
        return "EmptyState(title=" + this.title + ", text=" + this.text + ", action=" + this.action + ')';
    }

    public EmptyState(@NotNull String title, @NotNull String text, @NotNull Action action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        this.title = title;
        this.text = text;
        this.action = action;
    }

    public /* synthetic */ EmptyState(String str, String str2, Action action, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? new Action(null, null, null, 7, null) : action);
    }
}
