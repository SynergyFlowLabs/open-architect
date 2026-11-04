package io.intercom.android.sdk.ui.preview.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.w0;
import gk.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@d
public final class IntercomPreviewArgs implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<IntercomPreviewArgs> CREATOR = new Creator();

    @Nullable
    private final String ctaText;

    @NotNull
    private final DeleteType deleteType;

    @NotNull
    private final DownloadState downloadState;
    private final boolean showSendCTA;

    @NotNull
    private final List<IntercomPreviewFile> uris;

    public static final class Creator implements Parcelable.Creator<IntercomPreviewArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IntercomPreviewArgs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(parcel.readParcelable(IntercomPreviewArgs.class.getClassLoader()));
            }
            return new IntercomPreviewArgs(arrayList, (DeleteType) parcel.readParcelable(IntercomPreviewArgs.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, DownloadState.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IntercomPreviewArgs[] newArray(int i10) {
            return new IntercomPreviewArgs[i10];
        }
    }

    public IntercomPreviewArgs() {
        this(null, null, null, false, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IntercomPreviewArgs copy$default(IntercomPreviewArgs intercomPreviewArgs, List list, DeleteType deleteType, String str, boolean z10, DownloadState downloadState, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = intercomPreviewArgs.uris;
        }
        if ((i10 & 2) != 0) {
            deleteType = intercomPreviewArgs.deleteType;
        }
        if ((i10 & 4) != 0) {
            str = intercomPreviewArgs.ctaText;
        }
        if ((i10 & 8) != 0) {
            z10 = intercomPreviewArgs.showSendCTA;
        }
        if ((i10 & 16) != 0) {
            downloadState = intercomPreviewArgs.downloadState;
        }
        DownloadState downloadState2 = downloadState;
        String str2 = str;
        return intercomPreviewArgs.copy(list, deleteType, str2, z10, downloadState2);
    }

    @NotNull
    public final List<IntercomPreviewFile> component1() {
        return this.uris;
    }

    @NotNull
    public final DeleteType component2() {
        return this.deleteType;
    }

    @Nullable
    public final String component3() {
        return this.ctaText;
    }

    public final boolean component4() {
        return this.showSendCTA;
    }

    @NotNull
    public final DownloadState component5() {
        return this.downloadState;
    }

    @NotNull
    public final IntercomPreviewArgs copy(@NotNull List<? extends IntercomPreviewFile> uris, @NotNull DeleteType deleteType, @Nullable String str, boolean z10, @NotNull DownloadState downloadState) {
        Intrinsics.checkNotNullParameter(uris, "uris");
        Intrinsics.checkNotNullParameter(deleteType, "deleteType");
        Intrinsics.checkNotNullParameter(downloadState, "downloadState");
        return new IntercomPreviewArgs(uris, deleteType, str, z10, downloadState);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntercomPreviewArgs)) {
            return false;
        }
        IntercomPreviewArgs intercomPreviewArgs = (IntercomPreviewArgs) obj;
        return Intrinsics.areEqual(this.uris, intercomPreviewArgs.uris) && Intrinsics.areEqual(this.deleteType, intercomPreviewArgs.deleteType) && Intrinsics.areEqual(this.ctaText, intercomPreviewArgs.ctaText) && this.showSendCTA == intercomPreviewArgs.showSendCTA && Intrinsics.areEqual(this.downloadState, intercomPreviewArgs.downloadState);
    }

    @Nullable
    public final String getCtaText() {
        return this.ctaText;
    }

    @NotNull
    public final DeleteType getDeleteType() {
        return this.deleteType;
    }

    @NotNull
    public final DownloadState getDownloadState() {
        return this.downloadState;
    }

    public final boolean getShowSendCTA() {
        return this.showSendCTA;
    }

    @NotNull
    public final List<IntercomPreviewFile> getUris() {
        return this.uris;
    }

    public int hashCode() {
        int iHashCode = ((this.uris.hashCode() * 31) + this.deleteType.hashCode()) * 31;
        String str = this.ctaText;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.showSendCTA)) * 31) + this.downloadState.hashCode();
    }

    @NotNull
    public String toString() {
        return "IntercomPreviewArgs(uris=" + this.uris + ", deleteType=" + this.deleteType + ", ctaText=" + this.ctaText + ", showSendCTA=" + this.showSendCTA + ", downloadState=" + this.downloadState + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<IntercomPreviewFile> list = this.uris;
        dest.writeInt(list.size());
        Iterator<IntercomPreviewFile> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), i10);
        }
        dest.writeParcelable(this.deleteType, i10);
        dest.writeString(this.ctaText);
        dest.writeInt(this.showSendCTA ? 1 : 0);
        this.downloadState.writeToParcel(dest, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IntercomPreviewArgs(@NotNull List<? extends IntercomPreviewFile> uris, @NotNull DeleteType deleteType, @Nullable String str, boolean z10, @NotNull DownloadState downloadState) {
        Intrinsics.checkNotNullParameter(uris, "uris");
        Intrinsics.checkNotNullParameter(deleteType, "deleteType");
        Intrinsics.checkNotNullParameter(downloadState, "downloadState");
        this.uris = uris;
        this.deleteType = deleteType;
        this.ctaText = str;
        this.showSendCTA = z10;
        this.downloadState = downloadState;
    }

    public /* synthetic */ IntercomPreviewArgs(List list, DeleteType deleteType, String str, boolean z10, DownloadState downloadState, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt.emptyList() : list, (i10 & 2) != 0 ? DeleteType.None.INSTANCE : deleteType, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? new DownloadState(false, "Saving...", "File saved", "Something went wrong", "Permission denied") : downloadState);
    }
}
