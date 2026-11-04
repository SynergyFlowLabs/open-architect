package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class ShareVideo extends ShareMedia<ShareVideo, a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Uri f102016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ShareMedia.b f102017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final c f102015d = new c(null);

    @f
    @NotNull
    public static final Parcelable.Creator<ShareVideo> CREATOR = new b();

    public static final class a extends ShareMedia.a<ShareVideo, a> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private Uri f102018c;

        @Override // v5.a
        @NotNull
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public ShareVideo build() {
            return new ShareVideo(this, null);
        }

        @Nullable
        public final Uri j() {
            return this.f102018c;
        }

        @Override // com.facebook.share.model.ShareMedia.a
        @NotNull
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public a a(@Nullable ShareVideo shareVideo) {
            return shareVideo == null ? this : m(shareVideo.e());
        }

        @NotNull
        public final a l(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return a((ShareVideo) parcel.readParcelable(ShareVideo.class.getClassLoader()));
        }

        @NotNull
        public final a m(@Nullable Uri uri) {
            this.f102018c = uri;
            return this;
        }

        public final void n(@Nullable Uri uri) {
            this.f102018c = uri;
        }
    }

    public static final class b implements Parcelable.Creator<ShareVideo> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareVideo createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new ShareVideo(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareVideo[] newArray(int i10) {
            return new ShareVideo[i10];
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ ShareVideo(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    @Override // com.facebook.share.model.ShareMedia
    @NotNull
    public ShareMedia.b b() {
        return this.f102017c;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final Uri e() {
        return this.f102016b;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        super.writeToParcel(out, i10);
        out.writeParcelable(this.f102016b, 0);
    }

    private ShareVideo(a aVar) {
        super(aVar);
        this.f102017c = ShareMedia.b.VIDEO;
        this.f102016b = aVar.j();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareVideo(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f102017c = ShareMedia.b.VIDEO;
        this.f102016b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }
}
