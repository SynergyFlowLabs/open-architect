package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class SharePhotoContent extends ShareContent<SharePhotoContent, a> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final List<SharePhoto> f102004g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final c f102003h = new c(null);

    @f
    @NotNull
    public static final Parcelable.Creator<SharePhotoContent> CREATOR = new b();

    public static final class a extends ShareContent.a<SharePhotoContent, a> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private final List<SharePhoto> f102005g = new ArrayList();

        @NotNull
        public final a u(@Nullable SharePhoto sharePhoto) {
            if (sharePhoto != null) {
                this.f102005g.add(new SharePhoto.a().a(sharePhoto).build());
            }
            return this;
        }

        @NotNull
        public final a v(@Nullable List<SharePhoto> list) {
            if (list != null) {
                Iterator<SharePhoto> it = list.iterator();
                while (it.hasNext()) {
                    u(it.next());
                }
            }
            return this;
        }

        @Override // v5.a
        @NotNull
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public SharePhotoContent build() {
            return new SharePhotoContent(this, null);
        }

        @NotNull
        public final List<SharePhoto> x() {
            return this.f102005g;
        }

        @Override // com.facebook.share.model.ShareContent.a
        @NotNull
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public a a(@Nullable SharePhotoContent sharePhotoContent) {
            return sharePhotoContent == null ? this : ((a) super.a(sharePhotoContent)).v(sharePhotoContent.i());
        }

        @NotNull
        public final a z(@Nullable List<SharePhoto> list) {
            this.f102005g.clear();
            v(list);
            return this;
        }
    }

    public static final class b implements Parcelable.Creator<SharePhotoContent> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SharePhotoContent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SharePhotoContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SharePhotoContent[] newArray(int i10) {
            return new SharePhotoContent[i10];
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ SharePhotoContent(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final List<SharePhoto> i() {
        return this.f102004g;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        super.writeToParcel(out, i10);
        SharePhoto.a.f101998g.b(out, i10, this.f102004g);
    }

    private SharePhotoContent(a aVar) {
        super(aVar);
        this.f102004g = CollectionsKt.toList(aVar.x());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharePhotoContent(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f102004g = CollectionsKt.toList(SharePhoto.a.f101998g.a(parcel));
    }
}
