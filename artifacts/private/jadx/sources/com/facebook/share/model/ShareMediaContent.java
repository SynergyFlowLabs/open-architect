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
public final class ShareMediaContent extends ShareContent<ShareMediaContent, a> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final List<ShareMedia<?, ?>> f101973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final c f101972h = new c(null);

    @f
    @NotNull
    public static final Parcelable.Creator<ShareMediaContent> CREATOR = new b();

    public static final class a extends ShareContent.a<ShareMediaContent, a> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private final List<ShareMedia<?, ?>> f101974g = new ArrayList();

        @NotNull
        public final a u(@Nullable List<? extends ShareMedia<?, ?>> list) {
            if (list != null) {
                Iterator<? extends ShareMedia<?, ?>> it = list.iterator();
                while (it.hasNext()) {
                    v(it.next());
                }
            }
            return this;
        }

        @NotNull
        public final a v(@Nullable ShareMedia<?, ?> shareMedia) {
            ShareMedia<?, ?> shareMediaBuild;
            if (shareMedia == null) {
                return this;
            }
            if (shareMedia instanceof SharePhoto) {
                shareMediaBuild = new SharePhoto.a().a((SharePhoto) shareMedia).build();
            } else {
                if (!(shareMedia instanceof ShareVideo)) {
                    throw new IllegalArgumentException("medium must be either a SharePhoto or ShareVideo");
                }
                shareMediaBuild = new ShareVideo.a().a((ShareVideo) shareMedia).build();
            }
            this.f101974g.add(shareMediaBuild);
            return this;
        }

        @Override // v5.a
        @NotNull
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public ShareMediaContent build() {
            return new ShareMediaContent(this, null);
        }

        @NotNull
        public final List<ShareMedia<?, ?>> x() {
            return this.f101974g;
        }

        @Override // com.facebook.share.model.ShareContent.a
        @NotNull
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public a a(@Nullable ShareMediaContent shareMediaContent) {
            return shareMediaContent == null ? this : ((a) super.a(shareMediaContent)).u(shareMediaContent.i());
        }

        @NotNull
        public final a z(@Nullable List<? extends ShareMedia<?, ?>> list) {
            this.f101974g.clear();
            u(list);
            return this;
        }
    }

    public static final class b implements Parcelable.Creator<ShareMediaContent> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareMediaContent createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new ShareMediaContent(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareMediaContent[] newArray(int i10) {
            return new ShareMediaContent[i10];
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ ShareMediaContent(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final List<ShareMedia<?, ?>> i() {
        return this.f101973g;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        super.writeToParcel(out, i10);
        Object[] array = this.f101973g.toArray(new ShareMedia[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        out.writeParcelableArray((Parcelable[]) array, i10);
    }

    private ShareMediaContent(a aVar) {
        super(aVar);
        this.f101973g = CollectionsKt.toList(aVar.x());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareMediaContent(@NotNull Parcel source) {
        List<ShareMedia<?, ?>> list;
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        Parcelable[] parcelableArray = source.readParcelableArray(ShareMedia.class.getClassLoader());
        if (parcelableArray == null) {
            list = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                ShareMedia shareMedia = (ShareMedia) parcelable;
                if (shareMedia != null) {
                    arrayList.add(shareMedia);
                }
            }
            list = arrayList;
        }
        this.f101973g = list == null ? CollectionsKt.emptyList() : list;
    }
}
