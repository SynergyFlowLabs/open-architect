package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class ShareCameraEffectContent extends ShareContent<ShareCameraEffectContent, a> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private String f101942g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private CameraEffectArguments f101943h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private CameraEffectTextures f101944i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final c f101941j = new c(null);

    @f
    @NotNull
    public static final Parcelable.Creator<ShareCameraEffectContent> CREATOR = new b();

    public static final class a extends ShareContent.a<ShareCameraEffectContent, a> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private String f101945g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        private CameraEffectArguments f101946h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        private CameraEffectTextures f101947i;

        public final void A(@Nullable CameraEffectArguments cameraEffectArguments) {
            this.f101946h = cameraEffectArguments;
        }

        @NotNull
        public final a B(@Nullable String str) {
            this.f101945g = str;
            return this;
        }

        public final void C(@Nullable String str) {
            this.f101945g = str;
        }

        @NotNull
        public final a D(@Nullable CameraEffectTextures cameraEffectTextures) {
            this.f101947i = cameraEffectTextures;
            return this;
        }

        public final void E(@Nullable CameraEffectTextures cameraEffectTextures) {
            this.f101947i = cameraEffectTextures;
        }

        @Override // v5.a
        @NotNull
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public ShareCameraEffectContent build() {
            return new ShareCameraEffectContent(this, null);
        }

        @Nullable
        public final CameraEffectArguments v() {
            return this.f101946h;
        }

        @Nullable
        public final String w() {
            return this.f101945g;
        }

        @Nullable
        public final CameraEffectTextures x() {
            return this.f101947i;
        }

        @Override // com.facebook.share.model.ShareContent.a
        @NotNull
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public a a(@Nullable ShareCameraEffectContent shareCameraEffectContent) {
            return shareCameraEffectContent == null ? this : ((a) super.a(shareCameraEffectContent)).B(shareCameraEffectContent.j()).z(shareCameraEffectContent.i()).D(shareCameraEffectContent.k());
        }

        @NotNull
        public final a z(@Nullable CameraEffectArguments cameraEffectArguments) {
            this.f101946h = cameraEffectArguments;
            return this;
        }
    }

    public static final class b implements Parcelable.Creator<ShareCameraEffectContent> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareCameraEffectContent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShareCameraEffectContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareCameraEffectContent[] newArray(int i10) {
            return new ShareCameraEffectContent[i10];
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ ShareCameraEffectContent(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    @Nullable
    public final CameraEffectArguments i() {
        return this.f101943h;
    }

    @Nullable
    public final String j() {
        return this.f101942g;
    }

    @Nullable
    public final CameraEffectTextures k() {
        return this.f101944i;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        super.writeToParcel(out, i10);
        out.writeString(this.f101942g);
        out.writeParcelable(this.f101943h, 0);
        out.writeParcelable(this.f101944i, 0);
    }

    private ShareCameraEffectContent(a aVar) {
        super(aVar);
        this.f101942g = aVar.w();
        this.f101943h = aVar.v();
        this.f101944i = aVar.x();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareCameraEffectContent(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f101942g = parcel.readString();
        this.f101943h = new CameraEffectArguments.a().f(parcel).build();
        this.f101944i = new CameraEffectTextures.a().g(parcel).build();
    }
}
