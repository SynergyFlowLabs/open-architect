package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class ShareStoryContent extends ShareContent<ShareStoryContent, a> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final ShareMedia<?, ?> f102007g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final SharePhoto f102008h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final List<String> f102009i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private final String f102010j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final c f102006k = new c(null);

    @f
    @NotNull
    public static final Parcelable.Creator<ShareStoryContent> CREATOR = new b();

    public static final class a extends ShareContent.a<ShareStoryContent, a> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private ShareMedia<?, ?> f102011g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        private SharePhoto f102012h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        private List<String> f102013i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        private String f102014j;

        @NotNull
        public final a A(@Nullable String str) {
            this.f102014j = str;
            return this;
        }

        public final void B(@Nullable String str) {
            this.f102014j = str;
        }

        @NotNull
        public final a C(@Nullable ShareMedia<?, ?> shareMedia) {
            this.f102011g = shareMedia;
            return this;
        }

        public final void D(@Nullable ShareMedia<?, ?> shareMedia) {
            this.f102011g = shareMedia;
        }

        @NotNull
        public final a E(@Nullable List<String> list) {
            this.f102013i = list == null ? null : CollectionsKt.toList(list);
            return this;
        }

        public final void F(@Nullable List<String> list) {
            this.f102013i = list;
        }

        @NotNull
        public final a G(@Nullable SharePhoto sharePhoto) {
            this.f102012h = sharePhoto;
            return this;
        }

        public final void H(@Nullable SharePhoto sharePhoto) {
            this.f102012h = sharePhoto;
        }

        @Override // v5.a
        @NotNull
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public ShareStoryContent build() {
            return new ShareStoryContent(this, null);
        }

        @Nullable
        public final String v() {
            return this.f102014j;
        }

        @Nullable
        public final ShareMedia<?, ?> w() {
            return this.f102011g;
        }

        @Nullable
        public final List<String> x() {
            return this.f102013i;
        }

        @Nullable
        public final SharePhoto y() {
            return this.f102012h;
        }

        @Override // com.facebook.share.model.ShareContent.a
        @NotNull
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public a a(@Nullable ShareStoryContent shareStoryContent) {
            return shareStoryContent == null ? this : ((a) super.a(shareStoryContent)).C(shareStoryContent.j()).G(shareStoryContent.l()).E(shareStoryContent.k()).A(shareStoryContent.i());
        }
    }

    public static final class b implements Parcelable.Creator<ShareStoryContent> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareStoryContent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShareStoryContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareStoryContent[] newArray(int i10) {
            return new ShareStoryContent[i10];
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ ShareStoryContent(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    private final List<String> h(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return CollectionsKt.toList(arrayList);
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String i() {
        return this.f102010j;
    }

    @Nullable
    public final ShareMedia<?, ?> j() {
        return this.f102007g;
    }

    @Nullable
    public final List<String> k() {
        List<String> list = this.f102009i;
        if (list == null) {
            return null;
        }
        return CollectionsKt.toList(list);
    }

    @Nullable
    public final SharePhoto l() {
        return this.f102008h;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        super.writeToParcel(out, i10);
        out.writeParcelable(this.f102007g, 0);
        out.writeParcelable(this.f102008h, 0);
        out.writeStringList(k());
        out.writeString(this.f102010j);
    }

    private ShareStoryContent(a aVar) {
        super(aVar);
        this.f102007g = aVar.w();
        this.f102008h = aVar.y();
        this.f102009i = aVar.x();
        this.f102010j = aVar.v();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareStoryContent(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f102007g = (ShareMedia) parcel.readParcelable(ShareMedia.class.getClassLoader());
        this.f102008h = (SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader());
        this.f102009i = h(parcel);
        this.f102010j = parcel.readString();
    }
}
