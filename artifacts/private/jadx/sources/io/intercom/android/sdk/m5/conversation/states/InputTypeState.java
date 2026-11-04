package io.intercom.android.sdk.m5.conversation.states;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.ui.component.MediaPickerButtonKt;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@l(message = "Use BottomBarButton instead")
public final class InputTypeState {
    private final boolean cameraInputEnabled;
    private final boolean fileInputEnabled;
    private final boolean gifInputEnabled;
    private final boolean mediaInputEnabled;

    @NotNull
    private final Set<String> trustedFileExtensions;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final InputTypeState DEFAULT = new InputTypeState(true, true, true, true, MediaPickerButtonKt.getDefaultTrustedFileExtensions());

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InputTypeState getDEFAULT() {
            return InputTypeState.DEFAULT;
        }

        private Companion() {
        }
    }

    public InputTypeState(boolean z10, boolean z11, boolean z12, boolean z13, @NotNull Set<String> trustedFileExtensions) {
        Intrinsics.checkNotNullParameter(trustedFileExtensions, "trustedFileExtensions");
        this.mediaInputEnabled = z10;
        this.gifInputEnabled = z11;
        this.cameraInputEnabled = z12;
        this.fileInputEnabled = z13;
        this.trustedFileExtensions = trustedFileExtensions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InputTypeState copy$default(InputTypeState inputTypeState, boolean z10, boolean z11, boolean z12, boolean z13, Set set, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = inputTypeState.mediaInputEnabled;
        }
        if ((i10 & 2) != 0) {
            z11 = inputTypeState.gifInputEnabled;
        }
        if ((i10 & 4) != 0) {
            z12 = inputTypeState.cameraInputEnabled;
        }
        if ((i10 & 8) != 0) {
            z13 = inputTypeState.fileInputEnabled;
        }
        if ((i10 & 16) != 0) {
            set = inputTypeState.trustedFileExtensions;
        }
        Set set2 = set;
        boolean z14 = z12;
        return inputTypeState.copy(z10, z11, z14, z13, set2);
    }

    public final boolean component1() {
        return this.mediaInputEnabled;
    }

    public final boolean component2() {
        return this.gifInputEnabled;
    }

    public final boolean component3() {
        return this.cameraInputEnabled;
    }

    public final boolean component4() {
        return this.fileInputEnabled;
    }

    @NotNull
    public final Set<String> component5() {
        return this.trustedFileExtensions;
    }

    @NotNull
    public final InputTypeState copy(boolean z10, boolean z11, boolean z12, boolean z13, @NotNull Set<String> trustedFileExtensions) {
        Intrinsics.checkNotNullParameter(trustedFileExtensions, "trustedFileExtensions");
        return new InputTypeState(z10, z11, z12, z13, trustedFileExtensions);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputTypeState)) {
            return false;
        }
        InputTypeState inputTypeState = (InputTypeState) obj;
        return this.mediaInputEnabled == inputTypeState.mediaInputEnabled && this.gifInputEnabled == inputTypeState.gifInputEnabled && this.cameraInputEnabled == inputTypeState.cameraInputEnabled && this.fileInputEnabled == inputTypeState.fileInputEnabled && Intrinsics.areEqual(this.trustedFileExtensions, inputTypeState.trustedFileExtensions);
    }

    public final boolean getCameraInputEnabled() {
        return this.cameraInputEnabled;
    }

    public final boolean getFileInputEnabled() {
        return this.fileInputEnabled;
    }

    public final boolean getGifInputEnabled() {
        return this.gifInputEnabled;
    }

    public final boolean getMediaInputEnabled() {
        return this.mediaInputEnabled;
    }

    @NotNull
    public final Set<String> getTrustedFileExtensions() {
        return this.trustedFileExtensions;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.mediaInputEnabled) * 31) + Boolean.hashCode(this.gifInputEnabled)) * 31) + Boolean.hashCode(this.cameraInputEnabled)) * 31) + Boolean.hashCode(this.fileInputEnabled)) * 31) + this.trustedFileExtensions.hashCode();
    }

    @NotNull
    public String toString() {
        return "InputTypeState(mediaInputEnabled=" + this.mediaInputEnabled + ", gifInputEnabled=" + this.gifInputEnabled + ", cameraInputEnabled=" + this.cameraInputEnabled + ", fileInputEnabled=" + this.fileInputEnabled + ", trustedFileExtensions=" + this.trustedFileExtensions + ')';
    }
}
