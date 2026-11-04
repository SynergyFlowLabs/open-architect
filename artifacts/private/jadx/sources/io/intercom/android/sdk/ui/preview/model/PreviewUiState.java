package io.intercom.android.sdk.ui.preview.model;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class PreviewUiState {
    public static final int $stable = 8;

    @Nullable
    private final String confirmationText;
    private final int currentPage;

    @Nullable
    private final String fileSavedText;

    @Nullable
    private final String fileSavingText;

    @NotNull
    private final List<IntercomPreviewFile> files;

    @Nullable
    private final String saveFailedText;
    private final boolean showDeleteAction;
    private final boolean showDownloadAction;
    private final boolean showSendAction;

    public PreviewUiState() {
        this(null, 0, false, false, null, false, null, null, null, 511, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PreviewUiState copy$default(PreviewUiState previewUiState, List list, int i10, boolean z10, boolean z11, String str, boolean z12, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = previewUiState.files;
        }
        if ((i11 & 2) != 0) {
            i10 = previewUiState.currentPage;
        }
        if ((i11 & 4) != 0) {
            z10 = previewUiState.showDeleteAction;
        }
        if ((i11 & 8) != 0) {
            z11 = previewUiState.showSendAction;
        }
        if ((i11 & 16) != 0) {
            str = previewUiState.confirmationText;
        }
        if ((i11 & 32) != 0) {
            z12 = previewUiState.showDownloadAction;
        }
        if ((i11 & 64) != 0) {
            str2 = previewUiState.fileSavingText;
        }
        if ((i11 & 128) != 0) {
            str3 = previewUiState.fileSavedText;
        }
        if ((i11 & 256) != 0) {
            str4 = previewUiState.saveFailedText;
        }
        String str5 = str3;
        String str6 = str4;
        boolean z13 = z12;
        String str7 = str2;
        String str8 = str;
        boolean z14 = z10;
        return previewUiState.copy(list, i10, z14, z11, str8, z13, str7, str5, str6);
    }

    @NotNull
    public final List<IntercomPreviewFile> component1() {
        return this.files;
    }

    public final int component2() {
        return this.currentPage;
    }

    public final boolean component3() {
        return this.showDeleteAction;
    }

    public final boolean component4() {
        return this.showSendAction;
    }

    @Nullable
    public final String component5() {
        return this.confirmationText;
    }

    public final boolean component6() {
        return this.showDownloadAction;
    }

    @Nullable
    public final String component7() {
        return this.fileSavingText;
    }

    @Nullable
    public final String component8() {
        return this.fileSavedText;
    }

    @Nullable
    public final String component9() {
        return this.saveFailedText;
    }

    @NotNull
    public final PreviewUiState copy(@NotNull List<? extends IntercomPreviewFile> files, int i10, boolean z10, boolean z11, @Nullable String str, boolean z12, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(files, "files");
        return new PreviewUiState(files, i10, z10, z11, str, z12, str2, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewUiState)) {
            return false;
        }
        PreviewUiState previewUiState = (PreviewUiState) obj;
        if (Intrinsics.areEqual(this.files, previewUiState.files) && this.currentPage == previewUiState.currentPage && this.showDeleteAction == previewUiState.showDeleteAction && this.showSendAction == previewUiState.showSendAction && Intrinsics.areEqual(this.confirmationText, previewUiState.confirmationText) && this.showDownloadAction == previewUiState.showDownloadAction && Intrinsics.areEqual(this.fileSavingText, previewUiState.fileSavingText) && Intrinsics.areEqual(this.fileSavedText, previewUiState.fileSavedText) && Intrinsics.areEqual(this.saveFailedText, previewUiState.saveFailedText)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final String getConfirmationText() {
        return this.confirmationText;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    @Nullable
    public final String getFileSavedText() {
        return this.fileSavedText;
    }

    @Nullable
    public final String getFileSavingText() {
        return this.fileSavingText;
    }

    @NotNull
    public final List<IntercomPreviewFile> getFiles() {
        return this.files;
    }

    @Nullable
    public final String getSaveFailedText() {
        return this.saveFailedText;
    }

    public final boolean getShowDeleteAction() {
        return this.showDeleteAction;
    }

    public final boolean getShowDownloadAction() {
        return this.showDownloadAction;
    }

    public final boolean getShowSendAction() {
        return this.showSendAction;
    }

    public int hashCode() {
        int iHashCode = ((((((this.files.hashCode() * 31) + Integer.hashCode(this.currentPage)) * 31) + Boolean.hashCode(this.showDeleteAction)) * 31) + Boolean.hashCode(this.showSendAction)) * 31;
        String str = this.confirmationText;
        int iHashCode2 = 0;
        int iHashCode3 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.showDownloadAction)) * 31;
        String str2 = this.fileSavingText;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fileSavedText;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.saveFailedText;
        if (str4 != null) {
            iHashCode2 = str4.hashCode();
        }
        return iHashCode5 + iHashCode2;
    }

    @NotNull
    public String toString() {
        return "PreviewUiState(files=" + this.files + ", currentPage=" + this.currentPage + ", showDeleteAction=" + this.showDeleteAction + ", showSendAction=" + this.showSendAction + ", confirmationText=" + this.confirmationText + ", showDownloadAction=" + this.showDownloadAction + ", fileSavingText=" + this.fileSavingText + ", fileSavedText=" + this.fileSavedText + ", saveFailedText=" + this.saveFailedText + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PreviewUiState(@NotNull List<? extends IntercomPreviewFile> files, int i10, boolean z10, boolean z11, @Nullable String str, boolean z12, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(files, "files");
        this.files = files;
        this.currentPage = i10;
        this.showDeleteAction = z10;
        this.showSendAction = z11;
        this.confirmationText = str;
        this.showDownloadAction = z12;
        this.fileSavingText = str2;
        this.fileSavedText = str3;
        this.saveFailedText = str4;
    }

    public /* synthetic */ PreviewUiState(List list, int i10, boolean z10, boolean z11, String str, boolean z12, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? CollectionsKt.emptyList() : list, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? false : z10, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? null : str, (i11 & 32) != 0 ? false : z12, (i11 & 64) != 0 ? null : str2, (i11 & 128) != 0 ? null : str3, (i11 & 256) != 0 ? null : str4);
    }
}
