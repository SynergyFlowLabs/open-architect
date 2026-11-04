package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class ShareHashtag implements ShareModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f101961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final c f101960b = new c(null);

    @f
    @NotNull
    public static final Parcelable.Creator<ShareHashtag> CREATOR = new b();

    public static final class a implements com.facebook.share.model.a<ShareHashtag, a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private String f101962a;

        @Override // v5.a
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareHashtag build() {
            return new ShareHashtag(this, null);
        }

        @Nullable
        public final String c() {
            return this.f101962a;
        }

        @Override // com.facebook.share.model.a
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(@Nullable ShareHashtag shareHashtag) {
            return shareHashtag == null ? this : f(shareHashtag.a());
        }

        @NotNull
        public final a e(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return a((ShareHashtag) parcel.readParcelable(ShareHashtag.class.getClassLoader()));
        }

        @NotNull
        public final a f(@Nullable String str) {
            this.f101962a = str;
            return this;
        }
    }

    public static final class b implements Parcelable.Creator<ShareHashtag> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareHashtag createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new ShareHashtag(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareHashtag[] newArray(int i10) {
            return new ShareHashtag[i10];
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ ShareHashtag(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    @Nullable
    public final String a() {
        return this.f101961a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f101961a);
    }

    private ShareHashtag(a aVar) {
        this.f101961a = aVar.c();
    }

    public ShareHashtag(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f101961a = parcel.readString();
    }
}
