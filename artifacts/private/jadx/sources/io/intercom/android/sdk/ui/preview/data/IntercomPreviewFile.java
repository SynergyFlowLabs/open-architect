package io.intercom.android.sdk.ui.preview.data;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.w0;
import gk.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@d
public abstract class IntercomPreviewFile implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    private final Uri uri;

    @w0(parameters = 0)
    public static final class LocalFile extends IntercomPreviewFile {
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<LocalFile> CREATOR = new Creator();

        @NotNull
        private final Uri fileUri;

        public static final class Creator implements Parcelable.Creator<LocalFile> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocalFile createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LocalFile((Uri) parcel.readParcelable(LocalFile.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocalFile[] newArray(int i10) {
                return new LocalFile[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocalFile(@NotNull Uri fileUri) {
            super(fileUri, null);
            Intrinsics.checkNotNullParameter(fileUri, "fileUri");
            int i10 = 5 & 0;
            this.fileUri = fileUri;
        }

        public static /* synthetic */ LocalFile copy$default(LocalFile localFile, Uri uri, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                uri = localFile.fileUri;
            }
            return localFile.copy(uri);
        }

        @NotNull
        public final Uri component1() {
            return this.fileUri;
        }

        @NotNull
        public final LocalFile copy(@NotNull Uri fileUri) {
            Intrinsics.checkNotNullParameter(fileUri, "fileUri");
            return new LocalFile(fileUri);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof LocalFile) && Intrinsics.areEqual(this.fileUri, ((LocalFile) obj).fileUri)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final Uri getFileUri() {
            return this.fileUri;
        }

        public int hashCode() {
            return this.fileUri.hashCode();
        }

        @NotNull
        public String toString() {
            return "LocalFile(fileUri=" + this.fileUri + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i10) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.fileUri, i10);
        }
    }

    @w0(parameters = 1)
    public static final class NetworkFile extends IntercomPreviewFile {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<NetworkFile> CREATOR = new Creator();

        @NotNull
        private final String mimeType;

        @NotNull
        private final String url;

        public static final class Creator implements Parcelable.Creator<NetworkFile> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NetworkFile createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NetworkFile(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NetworkFile[] newArray(int i10) {
                return new NetworkFile[i10];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public NetworkFile(@NotNull String url, @NotNull String mimeType) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            Uri uri = Uri.parse(url);
            Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
            super(uri, null);
            this.url = url;
            this.mimeType = mimeType;
        }

        public static /* synthetic */ NetworkFile copy$default(NetworkFile networkFile, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = networkFile.url;
            }
            if ((i10 & 2) != 0) {
                str2 = networkFile.mimeType;
            }
            return networkFile.copy(str, str2);
        }

        @NotNull
        public final String component1() {
            return this.url;
        }

        @NotNull
        public final String component2() {
            return this.mimeType;
        }

        @NotNull
        public final NetworkFile copy(@NotNull String url, @NotNull String mimeType) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            return new NetworkFile(url, mimeType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NetworkFile)) {
                return false;
            }
            NetworkFile networkFile = (NetworkFile) obj;
            return Intrinsics.areEqual(this.url, networkFile.url) && Intrinsics.areEqual(this.mimeType, networkFile.mimeType);
        }

        @NotNull
        public final String getMimeType() {
            return this.mimeType;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return (this.url.hashCode() * 31) + this.mimeType.hashCode();
        }

        @NotNull
        public String toString() {
            return "NetworkFile(url=" + this.url + ", mimeType=" + this.mimeType + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i10) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.url);
            dest.writeString(this.mimeType);
        }
    }

    public /* synthetic */ IntercomPreviewFile(Uri uri, DefaultConstructorMarker defaultConstructorMarker) {
        this(uri);
    }

    @NotNull
    public final String getMimeType(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this instanceof LocalFile) {
            String type = context.getContentResolver().getType(this.uri);
            return type == null ? "application/*" : type;
        }
        if (this instanceof NetworkFile) {
            return ((NetworkFile) this).getMimeType();
        }
        throw new k0();
    }

    @NotNull
    public final Uri getUri() {
        return this.uri;
    }

    public final boolean isImage(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return StringsKt.V2(getMimeType(context), "image", false, 2, null);
    }

    public final boolean isVideo(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return StringsKt.V2(getMimeType(context), "video", false, 2, null);
    }

    private IntercomPreviewFile(Uri uri) {
        this.uri = uri;
    }
}
