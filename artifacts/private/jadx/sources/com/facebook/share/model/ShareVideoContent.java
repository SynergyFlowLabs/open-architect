package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class ShareVideoContent extends ShareContent<ShareVideoContent, a> implements ShareModel {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final String f102020g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final String f102021h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final SharePhoto f102022i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private final ShareVideo f102023j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final c f102019k = new c(null);

    @f
    @NotNull
    public static final Parcelable.Creator<ShareVideoContent> CREATOR = new b();

    public static final class a extends ShareContent.a<ShareVideoContent, a> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private String f102024g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        private String f102025h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        private SharePhoto f102026i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        private ShareVideo f102027j;

        @NotNull
        public final a A(@Nullable String str) {
            this.f102024g = str;
            return this;
        }

        public final void B(@Nullable String str) {
            this.f102024g = str;
        }

        @NotNull
        public final a C(@Nullable String str) {
            this.f102025h = str;
            return this;
        }

        public final void D(@Nullable String str) {
            this.f102025h = str;
        }

        @NotNull
        public final a E(@Nullable SharePhoto sharePhoto) {
            this.f102026i = sharePhoto == null ? null : new SharePhoto.a().a(sharePhoto).build();
            return this;
        }

        public final void F(@Nullable SharePhoto sharePhoto) {
            this.f102026i = sharePhoto;
        }

        @NotNull
        public final a G(@Nullable ShareVideo shareVideo) {
            if (shareVideo == null) {
                return this;
            }
            this.f102027j = new ShareVideo.a().a(shareVideo).build();
            return this;
        }

        public final void H(@Nullable ShareVideo shareVideo) {
            this.f102027j = shareVideo;
        }

        @Override // v5.a
        @NotNull
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public ShareVideoContent build() {
            return new ShareVideoContent(this, null);
        }

        @Nullable
        public final String v() {
            return this.f102024g;
        }

        @Nullable
        public final String w() {
            return this.f102025h;
        }

        @Nullable
        public final SharePhoto x() {
            return this.f102026i;
        }

        @Nullable
        public final ShareVideo y() {
            return this.f102027j;
        }

        @Override // com.facebook.share.model.ShareContent.a
        @NotNull
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public a a(@Nullable ShareVideoContent shareVideoContent) {
            return shareVideoContent == null ? this : ((a) super.a(shareVideoContent)).A(shareVideoContent.i()).C(shareVideoContent.j()).E(shareVideoContent.k()).G(shareVideoContent.l());
        }
    }

    public static final class b implements Parcelable.Creator<ShareVideoContent> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareVideoContent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShareVideoContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareVideoContent[] newArray(int i10) {
            return new ShareVideoContent[i10];
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ ShareVideoContent(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String i() {
        return this.f102020g;
    }

    @Nullable
    public final String j() {
        return this.f102021h;
    }

    @Nullable
    public final SharePhoto k() {
        return this.f102022i;
    }

    @Nullable
    public final ShareVideo l() {
        return this.f102023j;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        super.writeToParcel(out, i10);
        out.writeString(this.f102020g);
        out.writeString(this.f102021h);
        out.writeParcelable(this.f102022i, 0);
        out.writeParcelable(this.f102023j, 0);
    }

    private ShareVideoContent(a aVar) {
        super(aVar);
        this.f102020g = aVar.v();
        this.f102021h = aVar.w();
        this.f102022i = aVar.x();
        this.f102023j = aVar.y();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareVideoContent(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f102020g = parcel.readString();
        this.f102021h = parcel.readString();
        SharePhoto.a aVarO = new SharePhoto.a().o(parcel);
        this.f102022i = (aVarO.l() == null && aVarO.j() == null) ? null : aVarO.build();
        this.f102023j = new ShareVideo.a().l(parcel).build();
    }
}
