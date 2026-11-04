package io.intercom.android.sdk.ui.preview.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.w0;
import gk.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
@d
public final class DownloadState implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<DownloadState> CREATOR = new Creator();

    @NotNull
    private final String fileSavedText;

    @NotNull
    private final String fileSavingText;

    @NotNull
    private final String permissionDeniedText;

    @NotNull
    private final String saveFailedText;
    private final boolean showDownloadAction;

    public static final class Creator implements Parcelable.Creator<DownloadState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DownloadState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DownloadState(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DownloadState[] newArray(int i10) {
            return new DownloadState[i10];
        }
    }

    public DownloadState(boolean z10, @NotNull String fileSavingText, @NotNull String fileSavedText, @NotNull String saveFailedText, @NotNull String permissionDeniedText) {
        Intrinsics.checkNotNullParameter(fileSavingText, "fileSavingText");
        Intrinsics.checkNotNullParameter(fileSavedText, "fileSavedText");
        Intrinsics.checkNotNullParameter(saveFailedText, "saveFailedText");
        Intrinsics.checkNotNullParameter(permissionDeniedText, "permissionDeniedText");
        this.showDownloadAction = z10;
        this.fileSavingText = fileSavingText;
        this.fileSavedText = fileSavedText;
        this.saveFailedText = saveFailedText;
        this.permissionDeniedText = permissionDeniedText;
    }

    public static /* synthetic */ DownloadState copy$default(DownloadState downloadState, boolean z10, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = downloadState.showDownloadAction;
        }
        if ((i10 & 2) != 0) {
            str = downloadState.fileSavingText;
        }
        if ((i10 & 4) != 0) {
            str2 = downloadState.fileSavedText;
        }
        if ((i10 & 8) != 0) {
            str3 = downloadState.saveFailedText;
        }
        if ((i10 & 16) != 0) {
            str4 = downloadState.permissionDeniedText;
        }
        String str5 = str4;
        String str6 = str2;
        return downloadState.copy(z10, str, str6, str3, str5);
    }

    public final boolean component1() {
        return this.showDownloadAction;
    }

    @NotNull
    public final String component2() {
        return this.fileSavingText;
    }

    @NotNull
    public final String component3() {
        return this.fileSavedText;
    }

    @NotNull
    public final String component4() {
        return this.saveFailedText;
    }

    @NotNull
    public final String component5() {
        return this.permissionDeniedText;
    }

    @NotNull
    public final DownloadState copy(boolean z10, @NotNull String fileSavingText, @NotNull String fileSavedText, @NotNull String saveFailedText, @NotNull String permissionDeniedText) {
        Intrinsics.checkNotNullParameter(fileSavingText, "fileSavingText");
        Intrinsics.checkNotNullParameter(fileSavedText, "fileSavedText");
        Intrinsics.checkNotNullParameter(saveFailedText, "saveFailedText");
        Intrinsics.checkNotNullParameter(permissionDeniedText, "permissionDeniedText");
        return new DownloadState(z10, fileSavingText, fileSavedText, saveFailedText, permissionDeniedText);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadState)) {
            return false;
        }
        DownloadState downloadState = (DownloadState) obj;
        return this.showDownloadAction == downloadState.showDownloadAction && Intrinsics.areEqual(this.fileSavingText, downloadState.fileSavingText) && Intrinsics.areEqual(this.fileSavedText, downloadState.fileSavedText) && Intrinsics.areEqual(this.saveFailedText, downloadState.saveFailedText) && Intrinsics.areEqual(this.permissionDeniedText, downloadState.permissionDeniedText);
    }

    @NotNull
    public final String getFileSavedText() {
        return this.fileSavedText;
    }

    @NotNull
    public final String getFileSavingText() {
        return this.fileSavingText;
    }

    @NotNull
    public final String getPermissionDeniedText() {
        return this.permissionDeniedText;
    }

    @NotNull
    public final String getSaveFailedText() {
        return this.saveFailedText;
    }

    public final boolean getShowDownloadAction() {
        return this.showDownloadAction;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.showDownloadAction) * 31) + this.fileSavingText.hashCode()) * 31) + this.fileSavedText.hashCode()) * 31) + this.saveFailedText.hashCode()) * 31) + this.permissionDeniedText.hashCode();
    }

    @NotNull
    public String toString() {
        return "DownloadState(showDownloadAction=" + this.showDownloadAction + ", fileSavingText=" + this.fileSavingText + ", fileSavedText=" + this.fileSavedText + ", saveFailedText=" + this.saveFailedText + ", permissionDeniedText=" + this.permissionDeniedText + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.showDownloadAction ? 1 : 0);
        dest.writeString(this.fileSavingText);
        dest.writeString(this.fileSavedText);
        dest.writeString(this.saveFailedText);
        dest.writeString(this.permissionDeniedText);
    }
}
