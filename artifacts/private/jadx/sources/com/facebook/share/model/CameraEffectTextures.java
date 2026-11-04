package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class CameraEffectTextures implements ShareModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Bundle f101911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final c f101910b = new c(null);

    @f
    @NotNull
    public static final Parcelable.Creator<CameraEffectTextures> CREATOR = new b();

    public static final class a implements com.facebook.share.model.a<CameraEffectTextures, a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Bundle f101912a = new Bundle();

        private final a d(String str, Parcelable parcelable) {
            if (str.length() > 0 && parcelable != null) {
                this.f101912a.putParcelable(str, parcelable);
            }
            return this;
        }

        @Override // v5.a
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CameraEffectTextures build() {
            return new CameraEffectTextures(this, null);
        }

        @NotNull
        public final Bundle c() {
            return this.f101912a;
        }

        @NotNull
        public final a e(@NotNull String key, @Nullable Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(key, "key");
            return d(key, bitmap);
        }

        @NotNull
        public final a f(@NotNull String key, @Nullable Uri uri) {
            Intrinsics.checkNotNullParameter(key, "key");
            return d(key, uri);
        }

        @NotNull
        public final a g(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return a((CameraEffectTextures) parcel.readParcelable(CameraEffectTextures.class.getClassLoader()));
        }

        @Override // com.facebook.share.model.a
        @NotNull
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a a(@Nullable CameraEffectTextures cameraEffectTextures) {
            if (cameraEffectTextures != null) {
                this.f101912a.putAll(cameraEffectTextures.f101911a);
            }
            return this;
        }
    }

    public static final class b implements Parcelable.Creator<CameraEffectTextures> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CameraEffectTextures createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CameraEffectTextures(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CameraEffectTextures[] newArray(int i10) {
            return new CameraEffectTextures[i10];
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ CameraEffectTextures(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    @Nullable
    public final Object b(@Nullable String str) {
        Bundle bundle = this.f101911a;
        if (bundle == null) {
            return null;
        }
        return bundle.get(str);
    }

    @Nullable
    public final Bitmap c(@Nullable String str) {
        Bundle bundle = this.f101911a;
        Object obj = bundle == null ? null : bundle.get(str);
        if (obj instanceof Bitmap) {
            return (Bitmap) obj;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final Uri e(@Nullable String str) {
        Bundle bundle = this.f101911a;
        Object obj = bundle == null ? null : bundle.get(str);
        if (obj instanceof Uri) {
            return (Uri) obj;
        }
        return null;
    }

    @NotNull
    public final Set<String> f() {
        Bundle bundle = this.f101911a;
        Set<String> setKeySet = bundle == null ? null : bundle.keySet();
        if (setKeySet == null) {
            setKeySet = SetsKt.emptySet();
        }
        return setKeySet;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeBundle(this.f101911a);
    }

    private CameraEffectTextures(a aVar) {
        this.f101911a = aVar.c();
    }

    public CameraEffectTextures(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f101911a = parcel.readBundle(CameraEffectTextures.class.getClassLoader());
    }
}
