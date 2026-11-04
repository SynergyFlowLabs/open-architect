package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class ShareFeedContent extends ShareContent<ShareFeedContent, a> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final String f101799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final String f101800h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final String f101801i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private final String f101802j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private final String f101803k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private final String f101804l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private final String f101805m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final c f101798n = new c(null);

    @oj.f
    @NotNull
    public static final Parcelable.Creator<ShareFeedContent> CREATOR = new b();

    public static final class a extends ShareContent.a<ShareFeedContent, a> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private String f101806g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        private String f101807h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        private String f101808i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        private String f101809j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        private String f101810k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Nullable
        private String f101811l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @Nullable
        private String f101812m;

        @Nullable
        public final String A() {
            return this.f101811l;
        }

        @Nullable
        public final String B() {
            return this.f101806g;
        }

        @Override // com.facebook.share.model.ShareContent.a
        @NotNull
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public a a(@Nullable ShareFeedContent shareFeedContent) {
            return shareFeedContent == null ? this : ((a) super.a(shareFeedContent)).P(shareFeedContent.o()).D(shareFeedContent.i()).J(shareFeedContent.l()).F(shareFeedContent.j()).H(shareFeedContent.k()).N(shareFeedContent.n()).L(shareFeedContent.m());
        }

        @NotNull
        public final a D(@Nullable String str) {
            this.f101807h = str;
            return this;
        }

        public final void E(@Nullable String str) {
            this.f101807h = str;
        }

        @NotNull
        public final a F(@Nullable String str) {
            this.f101809j = str;
            return this;
        }

        public final void G(@Nullable String str) {
            this.f101809j = str;
        }

        @NotNull
        public final a H(@Nullable String str) {
            this.f101810k = str;
            return this;
        }

        public final void I(@Nullable String str) {
            this.f101810k = str;
        }

        @NotNull
        public final a J(@Nullable String str) {
            this.f101808i = str;
            return this;
        }

        public final void K(@Nullable String str) {
            this.f101808i = str;
        }

        @NotNull
        public final a L(@Nullable String str) {
            this.f101812m = str;
            return this;
        }

        public final void M(@Nullable String str) {
            this.f101812m = str;
        }

        @NotNull
        public final a N(@Nullable String str) {
            this.f101811l = str;
            return this;
        }

        public final void O(@Nullable String str) {
            this.f101811l = str;
        }

        @NotNull
        public final a P(@Nullable String str) {
            this.f101806g = str;
            return this;
        }

        public final void Q(@Nullable String str) {
            this.f101806g = str;
        }

        @Override // v5.a
        @NotNull
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public ShareFeedContent build() {
            return new ShareFeedContent(this, null);
        }

        @Nullable
        public final String v() {
            return this.f101807h;
        }

        @Nullable
        public final String w() {
            return this.f101809j;
        }

        @Nullable
        public final String x() {
            return this.f101810k;
        }

        @Nullable
        public final String y() {
            return this.f101808i;
        }

        @Nullable
        public final String z() {
            return this.f101812m;
        }
    }

    public static final class b implements Parcelable.Creator<ShareFeedContent> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareFeedContent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShareFeedContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareFeedContent[] newArray(int i10) {
            return new ShareFeedContent[i10];
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ ShareFeedContent(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String i() {
        return this.f101800h;
    }

    @Nullable
    public final String j() {
        return this.f101802j;
    }

    @Nullable
    public final String k() {
        return this.f101803k;
    }

    @Nullable
    public final String l() {
        return this.f101801i;
    }

    @Nullable
    public final String m() {
        return this.f101805m;
    }

    @Nullable
    public final String n() {
        return this.f101804l;
    }

    @Nullable
    public final String o() {
        return this.f101799g;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        super.writeToParcel(out, i10);
        out.writeString(this.f101799g);
        out.writeString(this.f101800h);
        out.writeString(this.f101801i);
        out.writeString(this.f101802j);
        out.writeString(this.f101803k);
        out.writeString(this.f101804l);
        out.writeString(this.f101805m);
    }

    private ShareFeedContent(a aVar) {
        super(aVar);
        this.f101799g = aVar.B();
        this.f101800h = aVar.v();
        this.f101801i = aVar.y();
        this.f101802j = aVar.w();
        this.f101803k = aVar.x();
        this.f101804l = aVar.A();
        this.f101805m = aVar.z();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareFeedContent(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f101799g = parcel.readString();
        this.f101800h = parcel.readString();
        this.f101801i = parcel.readString();
        this.f101802j = parcel.readString();
        this.f101803k = parcel.readString();
        this.f101804l = parcel.readString();
        this.f101805m = parcel.readString();
    }
}
