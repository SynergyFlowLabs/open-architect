package io.intercom.android.sdk;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.w0;
import com.rabbitmq.client.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@gk.d
public final class GalleryImage implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<GalleryImage> CREATOR = new Creator();

    @NotNull
    private final String attribution;

    @NotNull
    private final String duration;

    @NotNull
    private final String fileName;
    private final int fileSize;
    private final int imageHeight;
    private final int imageWidth;
    private final boolean isGif;
    private final boolean isVideo;

    @NotNull
    private final String mimeType;

    @NotNull
    private final String previewPath;

    @NotNull
    private final Uri uri;

    public static final class Creator implements Parcelable.Creator<GalleryImage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GalleryImage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Uri uri = (Uri) parcel.readParcelable(GalleryImage.class.getClassLoader());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i10 = parcel.readInt();
            int i11 = parcel.readInt();
            int i12 = parcel.readInt();
            boolean z10 = false;
            if (parcel.readInt() != 0) {
                z10 = true;
            }
            return new GalleryImage(string, string2, uri, string3, string4, i10, i11, i12, z10, parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GalleryImage[] newArray(int i10) {
            return new GalleryImage[i10];
        }
    }

    @oj.j
    public GalleryImage() {
        this(null, null, null, null, null, 0, 0, 0, false, false, null, r.f265987x3, null);
    }

    public static /* synthetic */ GalleryImage copy$default(GalleryImage galleryImage, String str, String str2, Uri uri, String str3, String str4, int i10, int i11, int i12, boolean z10, boolean z11, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = galleryImage.fileName;
        }
        if ((i13 & 2) != 0) {
            str2 = galleryImage.mimeType;
        }
        if ((i13 & 4) != 0) {
            uri = galleryImage.uri;
        }
        if ((i13 & 8) != 0) {
            str3 = galleryImage.previewPath;
        }
        if ((i13 & 16) != 0) {
            str4 = galleryImage.attribution;
        }
        if ((i13 & 32) != 0) {
            i10 = galleryImage.imageWidth;
        }
        if ((i13 & 64) != 0) {
            i11 = galleryImage.imageHeight;
        }
        if ((i13 & 128) != 0) {
            i12 = galleryImage.fileSize;
        }
        if ((i13 & 256) != 0) {
            z10 = galleryImage.isGif;
        }
        if ((i13 & 512) != 0) {
            z11 = galleryImage.isVideo;
        }
        if ((i13 & 1024) != 0) {
            str5 = galleryImage.duration;
        }
        boolean z12 = z11;
        String str6 = str5;
        int i14 = i12;
        boolean z13 = z10;
        int i15 = i10;
        int i16 = i11;
        String str7 = str4;
        Uri uri2 = uri;
        return galleryImage.copy(str, str2, uri2, str3, str7, i15, i16, i14, z13, z12, str6);
    }

    @NotNull
    public final String component1() {
        return this.fileName;
    }

    public final boolean component10() {
        return this.isVideo;
    }

    @NotNull
    public final String component11() {
        return this.duration;
    }

    @NotNull
    public final String component2() {
        return this.mimeType;
    }

    @NotNull
    public final Uri component3() {
        return this.uri;
    }

    @NotNull
    public final String component4() {
        return this.previewPath;
    }

    @NotNull
    public final String component5() {
        return this.attribution;
    }

    public final int component6() {
        return this.imageWidth;
    }

    public final int component7() {
        return this.imageHeight;
    }

    public final int component8() {
        return this.fileSize;
    }

    public final boolean component9() {
        return this.isGif;
    }

    @NotNull
    public final GalleryImage copy(@NotNull String fileName, @NotNull String mimeType, @NotNull Uri uri, @NotNull String previewPath, @NotNull String attribution, int i10, int i11, int i12, boolean z10, boolean z11, @NotNull String duration) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(previewPath, "previewPath");
        Intrinsics.checkNotNullParameter(attribution, "attribution");
        Intrinsics.checkNotNullParameter(duration, "duration");
        return new GalleryImage(fileName, mimeType, uri, previewPath, attribution, i10, i11, i12, z10, z11, duration);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GalleryImage)) {
            return false;
        }
        GalleryImage galleryImage = (GalleryImage) obj;
        return Intrinsics.areEqual(this.fileName, galleryImage.fileName) && Intrinsics.areEqual(this.mimeType, galleryImage.mimeType) && Intrinsics.areEqual(this.uri, galleryImage.uri) && Intrinsics.areEqual(this.previewPath, galleryImage.previewPath) && Intrinsics.areEqual(this.attribution, galleryImage.attribution) && this.imageWidth == galleryImage.imageWidth && this.imageHeight == galleryImage.imageHeight && this.fileSize == galleryImage.fileSize && this.isGif == galleryImage.isGif && this.isVideo == galleryImage.isVideo && Intrinsics.areEqual(this.duration, galleryImage.duration);
    }

    @NotNull
    public final String getAttribution() {
        return this.attribution;
    }

    @NotNull
    public final String getDuration() {
        return this.duration;
    }

    @NotNull
    public final String getFileName() {
        return this.fileName;
    }

    public final int getFileSize() {
        return this.fileSize;
    }

    public final int getImageHeight() {
        return this.imageHeight;
    }

    public final int getImageWidth() {
        return this.imageWidth;
    }

    @NotNull
    public final String getImageWidthXHeight() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.imageWidth);
        sb2.append('x');
        sb2.append(this.imageHeight);
        return sb2.toString();
    }

    @NotNull
    public final String getMimeType() {
        return this.mimeType;
    }

    @NotNull
    public final String getPreviewPath() {
        return this.previewPath;
    }

    @NotNull
    public final Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        return (((((((((((((((((((this.fileName.hashCode() * 31) + this.mimeType.hashCode()) * 31) + this.uri.hashCode()) * 31) + this.previewPath.hashCode()) * 31) + this.attribution.hashCode()) * 31) + Integer.hashCode(this.imageWidth)) * 31) + Integer.hashCode(this.imageHeight)) * 31) + Integer.hashCode(this.fileSize)) * 31) + Boolean.hashCode(this.isGif)) * 31) + Boolean.hashCode(this.isVideo)) * 31) + this.duration.hashCode();
    }

    public final boolean isGif() {
        return this.isGif;
    }

    public final boolean isVideo() {
        return this.isVideo;
    }

    @NotNull
    public String toString() {
        return "GalleryImage(fileName=" + this.fileName + ", mimeType=" + this.mimeType + ", uri=" + this.uri + ", previewPath=" + this.previewPath + ", attribution=" + this.attribution + ", imageWidth=" + this.imageWidth + ", imageHeight=" + this.imageHeight + ", fileSize=" + this.fileSize + ", isGif=" + this.isGif + ", isVideo=" + this.isVideo + ", duration=" + this.duration + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.fileName);
        dest.writeString(this.mimeType);
        dest.writeParcelable(this.uri, i10);
        dest.writeString(this.previewPath);
        dest.writeString(this.attribution);
        dest.writeInt(this.imageWidth);
        dest.writeInt(this.imageHeight);
        dest.writeInt(this.fileSize);
        dest.writeInt(this.isGif ? 1 : 0);
        dest.writeInt(this.isVideo ? 1 : 0);
        dest.writeString(this.duration);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public GalleryImage(@NotNull String fileName) {
        this(fileName, null, null, null, null, 0, 0, 0, false, false, null, 2046, null);
        Intrinsics.checkNotNullParameter(fileName, "fileName");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public GalleryImage(@NotNull String fileName, @NotNull String mimeType) {
        this(fileName, mimeType, null, null, null, 0, 0, 0, false, false, null, 2044, null);
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public GalleryImage(@NotNull String fileName, @NotNull String mimeType, @NotNull Uri uri) {
        this(fileName, mimeType, uri, null, null, 0, 0, 0, false, false, null, 2040, null);
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(uri, "uri");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public GalleryImage(@NotNull String fileName, @NotNull String mimeType, @NotNull Uri uri, @NotNull String previewPath) {
        this(fileName, mimeType, uri, previewPath, null, 0, 0, 0, false, false, null, 2032, null);
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(previewPath, "previewPath");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public GalleryImage(@NotNull String fileName, @NotNull String mimeType, @NotNull Uri uri, @NotNull String previewPath, @NotNull String attribution) {
        this(fileName, mimeType, uri, previewPath, attribution, 0, 0, 0, false, false, null, 2016, null);
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(previewPath, "previewPath");
        Intrinsics.checkNotNullParameter(attribution, "attribution");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public GalleryImage(@NotNull String fileName, @NotNull String mimeType, @NotNull Uri uri, @NotNull String previewPath, @NotNull String attribution, int i10) {
        this(fileName, mimeType, uri, previewPath, attribution, i10, 0, 0, false, false, null, 1984, null);
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(previewPath, "previewPath");
        Intrinsics.checkNotNullParameter(attribution, "attribution");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public GalleryImage(@NotNull String fileName, @NotNull String mimeType, @NotNull Uri uri, @NotNull String previewPath, @NotNull String attribution, int i10, int i11) {
        this(fileName, mimeType, uri, previewPath, attribution, i10, i11, 0, false, false, null, 1920, null);
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(previewPath, "previewPath");
        Intrinsics.checkNotNullParameter(attribution, "attribution");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public GalleryImage(@NotNull String fileName, @NotNull String mimeType, @NotNull Uri uri, @NotNull String previewPath, @NotNull String attribution, int i10, int i11, int i12) {
        this(fileName, mimeType, uri, previewPath, attribution, i10, i11, i12, false, false, null, 1792, null);
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(previewPath, "previewPath");
        Intrinsics.checkNotNullParameter(attribution, "attribution");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public GalleryImage(@NotNull String fileName, @NotNull String mimeType, @NotNull Uri uri, @NotNull String previewPath, @NotNull String attribution, int i10, int i11, int i12, boolean z10) {
        this(fileName, mimeType, uri, previewPath, attribution, i10, i11, i12, z10, false, null, 1536, null);
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(previewPath, "previewPath");
        Intrinsics.checkNotNullParameter(attribution, "attribution");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public GalleryImage(@NotNull String fileName, @NotNull String mimeType, @NotNull Uri uri, @NotNull String previewPath, @NotNull String attribution, int i10, int i11, int i12, boolean z10, boolean z11) {
        this(fileName, mimeType, uri, previewPath, attribution, i10, i11, i12, z10, z11, null, 1024, null);
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(previewPath, "previewPath");
        Intrinsics.checkNotNullParameter(attribution, "attribution");
    }

    @oj.j
    public GalleryImage(@NotNull String fileName, @NotNull String mimeType, @NotNull Uri uri, @NotNull String previewPath, @NotNull String attribution, int i10, int i11, int i12, boolean z10, boolean z11, @NotNull String duration) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(previewPath, "previewPath");
        Intrinsics.checkNotNullParameter(attribution, "attribution");
        Intrinsics.checkNotNullParameter(duration, "duration");
        this.fileName = fileName;
        this.mimeType = mimeType;
        this.uri = uri;
        this.previewPath = previewPath;
        this.attribution = attribution;
        this.imageWidth = i10;
        this.imageHeight = i11;
        this.fileSize = i12;
        this.isGif = z10;
        this.isVideo = z11;
        this.duration = duration;
    }

    public /* synthetic */ GalleryImage(String str, String str2, Uri uri, String str3, String str4, int i10, int i11, int i12, boolean z10, boolean z11, String str5, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? Uri.EMPTY : uri, (i13 & 8) != 0 ? "" : str3, (i13 & 16) != 0 ? "" : str4, (i13 & 32) != 0 ? 0 : i10, (i13 & 64) != 0 ? 0 : i11, (i13 & 128) != 0 ? 0 : i12, (i13 & 256) != 0 ? false : z10, (i13 & 512) != 0 ? false : z11, (i13 & 1024) != 0 ? "" : str5);
    }
}
