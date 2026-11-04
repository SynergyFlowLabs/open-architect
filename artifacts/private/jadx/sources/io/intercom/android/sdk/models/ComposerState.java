package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class ComposerState {
    public static final int $stable = 0;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final ComposerState NULL = new ComposerState("visible_and_enabled", false, "");

    @c("workflow_active")
    private final boolean isWorkflowActive;

    @c("placeholder")
    @NotNull
    private final String placeholder;

    @c("visibility")
    @NotNull
    private final String visibility;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ComposerState getNULL() {
            return ComposerState.NULL;
        }

        private Companion() {
        }
    }

    public interface ComposerVisibility {

        @w0(parameters = 1)
        public static final class Hidden implements ComposerVisibility {
            public static final int $stable = 0;

            @NotNull
            public static final Hidden INSTANCE = new Hidden();

            private Hidden() {
            }

            public boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof Hidden);
            }

            public int hashCode() {
                return 421902457;
            }

            @NotNull
            public String toString() {
                return "Hidden";
            }
        }

        @w0(parameters = 1)
        public static final class VisibleAndDisabled implements ComposerVisibility {
            public static final int $stable = 0;

            @NotNull
            public static final VisibleAndDisabled INSTANCE = new VisibleAndDisabled();

            private VisibleAndDisabled() {
            }

            public boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof VisibleAndDisabled);
            }

            public int hashCode() {
                return 1977747952;
            }

            @NotNull
            public String toString() {
                return "VisibleAndDisabled";
            }
        }

        @w0(parameters = 1)
        public static final class VisibleAndEnabled implements ComposerVisibility {
            public static final int $stable = 0;

            @NotNull
            public static final VisibleAndEnabled INSTANCE = new VisibleAndEnabled();

            private VisibleAndEnabled() {
            }

            public boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof VisibleAndEnabled);
            }

            public int hashCode() {
                return -861799091;
            }

            @NotNull
            public String toString() {
                return "VisibleAndEnabled";
            }
        }
    }

    public ComposerState(@NotNull String visibility, boolean z10, @NotNull String placeholder) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        this.visibility = visibility;
        this.isWorkflowActive = z10;
        this.placeholder = placeholder;
    }

    private final String component1() {
        return this.visibility;
    }

    public static /* synthetic */ ComposerState copy$default(ComposerState composerState, String str, boolean z10, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = composerState.visibility;
        }
        if ((i10 & 2) != 0) {
            z10 = composerState.isWorkflowActive;
        }
        if ((i10 & 4) != 0) {
            str2 = composerState.placeholder;
        }
        return composerState.copy(str, z10, str2);
    }

    private final ComposerVisibility getComposerVisibility() {
        String str = this.visibility;
        int iHashCode = str.hashCode();
        if (iHashCode != -1217487446) {
            if (iHashCode != -888711535) {
                if (iHashCode == 1262491788 && str.equals("visible_and_enabled")) {
                    return ComposerVisibility.VisibleAndEnabled.INSTANCE;
                }
            } else if (str.equals("visible_and_disabled")) {
                return ComposerVisibility.VisibleAndDisabled.INSTANCE;
            }
        } else if (str.equals("hidden")) {
            return ComposerVisibility.Hidden.INSTANCE;
        }
        return ComposerVisibility.VisibleAndEnabled.INSTANCE;
    }

    public final boolean component2() {
        return this.isWorkflowActive;
    }

    @NotNull
    public final String component3() {
        return this.placeholder;
    }

    @NotNull
    public final ComposerState copy(@NotNull String visibility, boolean z10, @NotNull String placeholder) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        return new ComposerState(visibility, z10, placeholder);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposerState)) {
            return false;
        }
        ComposerState composerState = (ComposerState) obj;
        return Intrinsics.areEqual(this.visibility, composerState.visibility) && this.isWorkflowActive == composerState.isWorkflowActive && Intrinsics.areEqual(this.placeholder, composerState.placeholder);
    }

    @NotNull
    public final String getPlaceholder() {
        return this.placeholder;
    }

    public int hashCode() {
        return (((this.visibility.hashCode() * 31) + Boolean.hashCode(this.isWorkflowActive)) * 31) + this.placeholder.hashCode();
    }

    public final boolean isDisabled() {
        return Intrinsics.areEqual(getComposerVisibility(), ComposerVisibility.VisibleAndDisabled.INSTANCE);
    }

    public final boolean isVisible() {
        return !Intrinsics.areEqual(getComposerVisibility(), ComposerVisibility.Hidden.INSTANCE);
    }

    public final boolean isWorkflowActive() {
        return this.isWorkflowActive;
    }

    @NotNull
    public String toString() {
        return "ComposerState(visibility=" + this.visibility + ", isWorkflowActive=" + this.isWorkflowActive + ", placeholder=" + this.placeholder + ')';
    }
}
