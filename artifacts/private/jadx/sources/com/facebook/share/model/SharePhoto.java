package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class SharePhoto extends ShareMedia<SharePhoto, a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Bitmap f101993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Uri f101994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f101995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f101996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final ShareMedia.b f101997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final c f101992g = new c(null);

    @f
    @NotNull
    public static final Parcelable.Creator<SharePhoto> CREATOR = new b();

    public static final class a extends ShareMedia.a<SharePhoto, a> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final C0920a f101998g = new C0920a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private Bitmap f101999c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private Uri f102000d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f102001e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private String f102002f;

        /* JADX INFO: renamed from: com.facebook.share.model.SharePhoto$a$a, reason: collision with other inner class name */
        public static final class C0920a {
            public /* synthetic */ C0920a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final List<SharePhoto> a(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                List<ShareMedia<?, ?>> listA = ShareMedia.a.f101967b.a(parcel);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listA) {
                    if (obj instanceof SharePhoto) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }

            public final void b(@NotNull Parcel out, int i10, @NotNull List<SharePhoto> photos) {
                Intrinsics.checkNotNullParameter(out, "out");
                Intrinsics.checkNotNullParameter(photos, "photos");
                Object[] array = photos.toArray(new SharePhoto[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                out.writeParcelableArray((SharePhoto[]) array, i10);
            }

            private C0920a() {
            }
        }

        @Override // v5.a
        @NotNull
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public SharePhoto build() {
            return new SharePhoto(this, null);
        }

        @Nullable
        public final Bitmap j() {
            return this.f101999c;
        }

        @Nullable
        public final String k() {
            return this.f102002f;
        }

        @Nullable
        public final Uri l() {
            return this.f102000d;
        }

        public final boolean m() {
            return this.f102001e;
        }

        @Override // com.facebook.share.model.ShareMedia.a
        @NotNull
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public a a(@Nullable SharePhoto sharePhoto) {
            return sharePhoto == null ? this : ((a) super.a(sharePhoto)).p(sharePhoto.e()).r(sharePhoto.g()).s(sharePhoto.h()).q(sharePhoto.f());
        }

        @NotNull
        public final a o(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return a((SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader()));
        }

        @NotNull
        public final a p(@Nullable Bitmap bitmap) {
            this.f101999c = bitmap;
            return this;
        }

        @NotNull
        public final a q(@Nullable String str) {
            this.f102002f = str;
            return this;
        }

        @NotNull
        public final a r(@Nullable Uri uri) {
            this.f102000d = uri;
            return this;
        }

        @NotNull
        public final a s(boolean z10) {
            this.f102001e = z10;
            return this;
        }
    }

    public static final class b implements Parcelable.Creator<SharePhoto> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SharePhoto createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new SharePhoto(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SharePhoto[] newArray(int i10) {
            return new SharePhoto[i10];
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ SharePhoto(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    @Override // com.facebook.share.model.ShareMedia
    @NotNull
    public ShareMedia.b b() {
        return this.f101997f;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final Bitmap e() {
        return this.f101993b;
    }

    @Nullable
    public final String f() {
        return this.f101996e;
    }

    @Nullable
    public final Uri g() {
        return this.f101994c;
    }

    public final boolean h() {
        return this.f101995d;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        super.writeToParcel(out, i10);
        out.writeParcelable(this.f101993b, 0);
        out.writeParcelable(this.f101994c, 0);
        out.writeByte(this.f101995d ? (byte) 1 : (byte) 0);
        out.writeString(this.f101996e);
    }

    private SharePhoto(a aVar) {
        super(aVar);
        this.f101997f = ShareMedia.b.PHOTO;
        this.f101993b = aVar.j();
        this.f101994c = aVar.l();
        this.f101995d = aVar.m();
        this.f101996e = aVar.k();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharePhoto(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f101997f = ShareMedia.b.PHOTO;
        this.f101993b = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.f101994c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f101995d = parcel.readByte() != 0;
        this.f101996e = parcel.readString();
    }
}
