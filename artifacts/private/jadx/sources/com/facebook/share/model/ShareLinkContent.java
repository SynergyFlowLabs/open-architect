package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class ShareLinkContent extends ShareContent<ShareLinkContent, a> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final String f101964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final c f101963h = new c(null);

    @f
    @NotNull
    public static final Parcelable.Creator<ShareLinkContent> CREATOR = new b();

    public static final class a extends ShareContent.a<ShareLinkContent, a> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private String f101965g;

        @Override // v5.a
        @NotNull
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public ShareLinkContent build() {
            return new ShareLinkContent(this, null);
        }

        @Nullable
        public final String v() {
            return this.f101965g;
        }

        @Override // com.facebook.share.model.ShareContent.a
        @NotNull
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public a a(@Nullable ShareLinkContent shareLinkContent) {
            return shareLinkContent == null ? this : ((a) super.a(shareLinkContent)).x(shareLinkContent.i());
        }

        @NotNull
        public final a x(@Nullable String str) {
            this.f101965g = str;
            return this;
        }

        public final void y(@Nullable String str) {
            this.f101965g = str;
        }
    }

    public static final class b implements Parcelable.Creator<ShareLinkContent> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareLinkContent createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new ShareLinkContent(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareLinkContent[] newArray(int i10) {
            return new ShareLinkContent[i10];
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ ShareLinkContent(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String i() {
        return this.f101964g;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        super.writeToParcel(out, i10);
        out.writeString(this.f101964g);
    }

    private ShareLinkContent(a aVar) {
        super(aVar);
        this.f101964g = aVar.v();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareLinkContent(@NotNull Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.f101964g = source.readString();
    }
}
