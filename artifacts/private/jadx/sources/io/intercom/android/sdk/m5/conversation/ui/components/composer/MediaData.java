package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface MediaData extends Parcelable {

    @androidx.compose.runtime.internal.w0(parameters = 1)
    @gk.d
    public static final class Gif implements MediaData {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<Gif> CREATOR = new Creator();

        @NotNull
        private final String attribution;
        private final int height;

        @NotNull
        private final String url;
        private final int width;

        public static final class Creator implements Parcelable.Creator<Gif> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Gif createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Gif(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Gif[] newArray(int i10) {
                return new Gif[i10];
            }
        }

        public Gif(int i10, int i11, @NotNull String url, @NotNull String attribution) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(attribution, "attribution");
            this.width = i10;
            this.height = i11;
            this.url = url;
            this.attribution = attribution;
        }

        public static /* synthetic */ Gif copy$default(Gif gif, int i10, int i11, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = gif.width;
            }
            if ((i12 & 2) != 0) {
                i11 = gif.height;
            }
            if ((i12 & 4) != 0) {
                str = gif.url;
            }
            if ((i12 & 8) != 0) {
                str2 = gif.attribution;
            }
            return gif.copy(i10, i11, str, str2);
        }

        public final int component1() {
            return this.width;
        }

        public final int component2() {
            return this.height;
        }

        @NotNull
        public final String component3() {
            return this.url;
        }

        @NotNull
        public final String component4() {
            return this.attribution;
        }

        @NotNull
        public final Gif copy(int i10, int i11, @NotNull String url, @NotNull String attribution) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(attribution, "attribution");
            return new Gif(i10, i11, url, attribution);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Gif)) {
                return false;
            }
            Gif gif = (Gif) obj;
            return this.width == gif.width && this.height == gif.height && Intrinsics.areEqual(this.url, gif.url) && Intrinsics.areEqual(this.attribution, gif.attribution);
        }

        @NotNull
        public final String getAttribution() {
            return this.attribution;
        }

        public final int getHeight() {
            return this.height;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.width) * 31) + Integer.hashCode(this.height)) * 31) + this.url.hashCode()) * 31) + this.attribution.hashCode();
        }

        @NotNull
        public String toString() {
            return "Gif(width=" + this.width + ", height=" + this.height + ", url=" + this.url + ", attribution=" + this.attribution + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i10) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.width);
            dest.writeInt(this.height);
            dest.writeString(this.url);
            dest.writeString(this.attribution);
        }

        @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData
        @NotNull
        public String getDataSource() {
            return this.url;
        }
    }

    @NotNull
    Object getDataSource();

    public interface Media extends MediaData {

        @NotNull
        public static final Companion Companion = Companion.$$INSTANCE;

        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            @NotNull
            public final Image empty() {
                Uri EMPTY = Uri.EMPTY;
                Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
                return new Image("", 0, 0, 0L, "", EMPTY, MapsKt.emptyMap());
            }
        }

        public static final class DefaultImpls {
            @NotNull
            public static Uri getDataSource(@NotNull Media media) {
                return media.getUri();
            }
        }

        @androidx.compose.runtime.internal.w0(parameters = 0)
        @gk.d
        public static final class Other implements Media {
            public static final int $stable = 8;

            @NotNull
            public static final Parcelable.Creator<Other> CREATOR = new Creator();

            @NotNull
            private final String fileName;

            @NotNull
            private final String mimeType;
            private final long size;

            @NotNull
            private final Uri uri;

            public static final class Creator implements Parcelable.Creator<Other> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Other createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Other(parcel.readString(), parcel.readLong(), parcel.readString(), (Uri) parcel.readParcelable(Other.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Other[] newArray(int i10) {
                    return new Other[i10];
                }
            }

            public Other(@NotNull String mimeType, long j10, @NotNull String fileName, @NotNull Uri uri) {
                Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                Intrinsics.checkNotNullParameter(fileName, "fileName");
                Intrinsics.checkNotNullParameter(uri, "uri");
                this.mimeType = mimeType;
                this.size = j10;
                this.fileName = fileName;
                this.uri = uri;
            }

            public static /* synthetic */ Other copy$default(Other other, String str, long j10, String str2, Uri uri, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = other.mimeType;
                }
                if ((i10 & 2) != 0) {
                    j10 = other.size;
                }
                if ((i10 & 4) != 0) {
                    str2 = other.fileName;
                }
                if ((i10 & 8) != 0) {
                    uri = other.uri;
                }
                return other.copy(str, j10, str2, uri);
            }

            @NotNull
            public final String component1() {
                return this.mimeType;
            }

            public final long component2() {
                return this.size;
            }

            @NotNull
            public final String component3() {
                return this.fileName;
            }

            @NotNull
            public final Uri component4() {
                return this.uri;
            }

            @NotNull
            public final Other copy(@NotNull String mimeType, long j10, @NotNull String fileName, @NotNull Uri uri) {
                Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                Intrinsics.checkNotNullParameter(fileName, "fileName");
                Intrinsics.checkNotNullParameter(uri, "uri");
                return new Other(mimeType, j10, fileName, uri);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Other)) {
                    return false;
                }
                Other other = (Other) obj;
                return Intrinsics.areEqual(this.mimeType, other.mimeType) && this.size == other.size && Intrinsics.areEqual(this.fileName, other.fileName) && Intrinsics.areEqual(this.uri, other.uri);
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData
            @NotNull
            public Uri getDataSource() {
                return DefaultImpls.getDataSource(this);
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media
            @NotNull
            public String getFileName() {
                return this.fileName;
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media
            @NotNull
            public String getMimeType() {
                return this.mimeType;
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media
            public long getSize() {
                return this.size;
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media
            @NotNull
            public Uri getUri() {
                return this.uri;
            }

            public int hashCode() {
                return (((((this.mimeType.hashCode() * 31) + Long.hashCode(this.size)) * 31) + this.fileName.hashCode()) * 31) + this.uri.hashCode();
            }

            @NotNull
            public String toString() {
                return "Other(mimeType=" + this.mimeType + ", size=" + this.size + ", fileName=" + this.fileName + ", uri=" + this.uri + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int i10) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.mimeType);
                dest.writeLong(this.size);
                dest.writeString(this.fileName);
                dest.writeParcelable(this.uri, i10);
            }
        }

        @androidx.compose.runtime.internal.w0(parameters = 0)
        @gk.d
        public static final class Video implements Media {
            public static final int $stable = 8;

            @NotNull
            public static final Parcelable.Creator<Video> CREATOR = new Creator();
            private final long duration;

            @NotNull
            private final String fileName;
            private final int height;

            @NotNull
            private final String mimeType;
            private final long size;

            @Nullable
            private final Image thumbnail;

            @NotNull
            private final Uri uri;
            private final int width;

            public static final class Creator implements Parcelable.Creator<Video> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Video createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Video(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readString(), (Uri) parcel.readParcelable(Video.class.getClassLoader()), parcel.readLong(), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Video[] newArray(int i10) {
                    return new Video[i10];
                }
            }

            public Video(@NotNull String mimeType, int i10, int i11, long j10, @NotNull String fileName, @NotNull Uri uri, long j11, @Nullable Image image) {
                Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                Intrinsics.checkNotNullParameter(fileName, "fileName");
                Intrinsics.checkNotNullParameter(uri, "uri");
                this.mimeType = mimeType;
                this.width = i10;
                this.height = i11;
                this.size = j10;
                this.fileName = fileName;
                this.uri = uri;
                this.duration = j11;
                this.thumbnail = image;
            }

            public static /* synthetic */ Video copy$default(Video video, String str, int i10, int i11, long j10, String str2, Uri uri, long j11, Image image, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = video.mimeType;
                }
                if ((i12 & 2) != 0) {
                    i10 = video.width;
                }
                if ((i12 & 4) != 0) {
                    i11 = video.height;
                }
                if ((i12 & 8) != 0) {
                    j10 = video.size;
                }
                if ((i12 & 16) != 0) {
                    str2 = video.fileName;
                }
                if ((i12 & 32) != 0) {
                    uri = video.uri;
                }
                if ((i12 & 64) != 0) {
                    j11 = video.duration;
                }
                if ((i12 & 128) != 0) {
                    image = video.thumbnail;
                }
                Image image2 = image;
                long j12 = j10;
                int i13 = i11;
                return video.copy(str, i10, i13, j12, str2, uri, j11, image2);
            }

            @NotNull
            public final String component1() {
                return this.mimeType;
            }

            public final int component2() {
                return this.width;
            }

            public final int component3() {
                return this.height;
            }

            public final long component4() {
                return this.size;
            }

            @NotNull
            public final String component5() {
                return this.fileName;
            }

            @NotNull
            public final Uri component6() {
                return this.uri;
            }

            public final long component7() {
                return this.duration;
            }

            @Nullable
            public final Image component8() {
                return this.thumbnail;
            }

            @NotNull
            public final Video copy(@NotNull String mimeType, int i10, int i11, long j10, @NotNull String fileName, @NotNull Uri uri, long j11, @Nullable Image image) {
                Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                Intrinsics.checkNotNullParameter(fileName, "fileName");
                Intrinsics.checkNotNullParameter(uri, "uri");
                return new Video(mimeType, i10, i11, j10, fileName, uri, j11, image);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Video)) {
                    return false;
                }
                Video video = (Video) obj;
                return Intrinsics.areEqual(this.mimeType, video.mimeType) && this.width == video.width && this.height == video.height && this.size == video.size && Intrinsics.areEqual(this.fileName, video.fileName) && Intrinsics.areEqual(this.uri, video.uri) && this.duration == video.duration && Intrinsics.areEqual(this.thumbnail, video.thumbnail);
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData
            @NotNull
            public Uri getDataSource() {
                return DefaultImpls.getDataSource(this);
            }

            public final long getDuration() {
                return this.duration;
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media
            @NotNull
            public String getFileName() {
                return this.fileName;
            }

            public final int getHeight() {
                return this.height;
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media
            @NotNull
            public String getMimeType() {
                return this.mimeType;
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media
            public long getSize() {
                return this.size;
            }

            @Nullable
            public final Image getThumbnail() {
                return this.thumbnail;
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media
            @NotNull
            public Uri getUri() {
                return this.uri;
            }

            public final int getWidth() {
                return this.width;
            }

            public int hashCode() {
                int iHashCode = ((((((((((((this.mimeType.hashCode() * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + Long.hashCode(this.size)) * 31) + this.fileName.hashCode()) * 31) + this.uri.hashCode()) * 31) + Long.hashCode(this.duration)) * 31;
                Image image = this.thumbnail;
                return iHashCode + (image == null ? 0 : image.hashCode());
            }

            @NotNull
            public String toString() {
                return "Video(mimeType=" + this.mimeType + ", width=" + this.width + ", height=" + this.height + ", size=" + this.size + ", fileName=" + this.fileName + ", uri=" + this.uri + ", duration=" + this.duration + ", thumbnail=" + this.thumbnail + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int i10) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.mimeType);
                dest.writeInt(this.width);
                dest.writeInt(this.height);
                dest.writeLong(this.size);
                dest.writeString(this.fileName);
                dest.writeParcelable(this.uri, i10);
                dest.writeLong(this.duration);
                Image image = this.thumbnail;
                if (image == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    image.writeToParcel(dest, i10);
                }
            }
        }

        @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData
        @NotNull
        Uri getDataSource();

        @NotNull
        String getFileName();

        @NotNull
        String getMimeType();

        long getSize();

        @NotNull
        Uri getUri();

        @androidx.compose.runtime.internal.w0(parameters = 0)
        @gk.d
        public static final class Image implements Media {
            public static final int $stable = 8;

            @NotNull
            public static final Parcelable.Creator<Image> CREATOR = new Creator();

            @NotNull
            private final Map<String, String> exifData;

            @NotNull
            private final String fileName;
            private final int height;

            @NotNull
            private final String mimeType;
            private final long size;

            @NotNull
            private final Uri uri;
            private final int width;

            public static final class Creator implements Parcelable.Creator<Image> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Image createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    int i10 = parcel.readInt();
                    int i11 = parcel.readInt();
                    long j10 = parcel.readLong();
                    String string2 = parcel.readString();
                    Uri uri = (Uri) parcel.readParcelable(Image.class.getClassLoader());
                    int i12 = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
                    for (int i13 = 0; i13 != i12; i13++) {
                        linkedHashMap.put(parcel.readString(), parcel.readString());
                    }
                    return new Image(string, i10, i11, j10, string2, uri, linkedHashMap);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Image[] newArray(int i10) {
                    return new Image[i10];
                }
            }

            public Image(@NotNull String mimeType, int i10, int i11, long j10, @NotNull String fileName, @NotNull Uri uri, @NotNull Map<String, String> exifData) {
                Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                Intrinsics.checkNotNullParameter(fileName, "fileName");
                Intrinsics.checkNotNullParameter(uri, "uri");
                Intrinsics.checkNotNullParameter(exifData, "exifData");
                this.mimeType = mimeType;
                this.width = i10;
                this.height = i11;
                this.size = j10;
                this.fileName = fileName;
                this.uri = uri;
                this.exifData = exifData;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Image copy$default(Image image, String str, int i10, int i11, long j10, String str2, Uri uri, Map map, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = image.mimeType;
                }
                if ((i12 & 2) != 0) {
                    i10 = image.width;
                }
                if ((i12 & 4) != 0) {
                    i11 = image.height;
                }
                if ((i12 & 8) != 0) {
                    j10 = image.size;
                }
                if ((i12 & 16) != 0) {
                    str2 = image.fileName;
                }
                if ((i12 & 32) != 0) {
                    uri = image.uri;
                }
                if ((i12 & 64) != 0) {
                    map = image.exifData;
                }
                Map map2 = map;
                String str3 = str2;
                long j11 = j10;
                int i13 = i11;
                return image.copy(str, i10, i13, j11, str3, uri, map2);
            }

            @NotNull
            public final String component1() {
                return this.mimeType;
            }

            public final int component2() {
                return this.width;
            }

            public final int component3() {
                return this.height;
            }

            public final long component4() {
                return this.size;
            }

            @NotNull
            public final String component5() {
                return this.fileName;
            }

            @NotNull
            public final Uri component6() {
                return this.uri;
            }

            @NotNull
            public final Map<String, String> component7() {
                return this.exifData;
            }

            @NotNull
            public final Image copy(@NotNull String mimeType, int i10, int i11, long j10, @NotNull String fileName, @NotNull Uri uri, @NotNull Map<String, String> exifData) {
                Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                Intrinsics.checkNotNullParameter(fileName, "fileName");
                Intrinsics.checkNotNullParameter(uri, "uri");
                Intrinsics.checkNotNullParameter(exifData, "exifData");
                return new Image(mimeType, i10, i11, j10, fileName, uri, exifData);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Image)) {
                    return false;
                }
                Image image = (Image) obj;
                return Intrinsics.areEqual(this.mimeType, image.mimeType) && this.width == image.width && this.height == image.height && this.size == image.size && Intrinsics.areEqual(this.fileName, image.fileName) && Intrinsics.areEqual(this.uri, image.uri) && Intrinsics.areEqual(this.exifData, image.exifData);
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData
            @NotNull
            public Uri getDataSource() {
                return DefaultImpls.getDataSource(this);
            }

            @NotNull
            public final Map<String, String> getExifData() {
                return this.exifData;
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media
            @NotNull
            public String getFileName() {
                return this.fileName;
            }

            public final int getHeight() {
                return this.height;
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media
            @NotNull
            public String getMimeType() {
                return this.mimeType;
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media
            public long getSize() {
                return this.size;
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media
            @NotNull
            public Uri getUri() {
                return this.uri;
            }

            public final int getWidth() {
                return this.width;
            }

            public int hashCode() {
                return (((((((((((this.mimeType.hashCode() * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + Long.hashCode(this.size)) * 31) + this.fileName.hashCode()) * 31) + this.uri.hashCode()) * 31) + this.exifData.hashCode();
            }

            @NotNull
            public String toString() {
                return "Image(mimeType=" + this.mimeType + ", width=" + this.width + ", height=" + this.height + ", size=" + this.size + ", fileName=" + this.fileName + ", uri=" + this.uri + ", exifData=" + this.exifData + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int i10) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.mimeType);
                dest.writeInt(this.width);
                dest.writeInt(this.height);
                dest.writeLong(this.size);
                dest.writeString(this.fileName);
                dest.writeParcelable(this.uri, i10);
                Map<String, String> map = this.exifData;
                dest.writeInt(map.size());
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    dest.writeString(entry.getKey());
                    dest.writeString(entry.getValue());
                }
            }

            public /* synthetic */ Image(String str, int i10, int i11, long j10, String str2, Uri uri, Map map, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i10, i11, j10, str2, uri, (i12 & 64) != 0 ? MapsKt.emptyMap() : map);
            }
        }
    }
}
