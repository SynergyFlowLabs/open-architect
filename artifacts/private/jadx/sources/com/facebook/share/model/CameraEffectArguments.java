package com.facebook.share.model;

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
public final class CameraEffectArguments implements ShareModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Bundle f101908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final c f101907b = new c(null);

    @f
    @NotNull
    public static final Parcelable.Creator<CameraEffectArguments> CREATOR = new b();

    public static final class a implements com.facebook.share.model.a<CameraEffectArguments, a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Bundle f101909a = new Bundle();

        @Override // v5.a
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CameraEffectArguments build() {
            return new CameraEffectArguments(this, null);
        }

        @NotNull
        public final Bundle c() {
            return this.f101909a;
        }

        @NotNull
        public final a d(@NotNull String key, @NotNull String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f101909a.putString(key, value);
            return this;
        }

        @NotNull
        public final a e(@NotNull String key, @NotNull String[] arrayValue) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(arrayValue, "arrayValue");
            this.f101909a.putStringArray(key, arrayValue);
            return this;
        }

        @NotNull
        public final a f(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return a((CameraEffectArguments) parcel.readParcelable(CameraEffectArguments.class.getClassLoader()));
        }

        @Override // com.facebook.share.model.a
        @NotNull
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a(@Nullable CameraEffectArguments cameraEffectArguments) {
            if (cameraEffectArguments != null) {
                this.f101909a.putAll(cameraEffectArguments.f101908a);
            }
            return this;
        }
    }

    public static final class b implements Parcelable.Creator<CameraEffectArguments> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CameraEffectArguments createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CameraEffectArguments(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CameraEffectArguments[] newArray(int i10) {
            return new CameraEffectArguments[i10];
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ CameraEffectArguments(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    @Nullable
    public final Object b(@Nullable String str) {
        Bundle bundle = this.f101908a;
        if (bundle == null) {
            return null;
        }
        return bundle.get(str);
    }

    @Nullable
    public final String c(@Nullable String str) {
        Bundle bundle = this.f101908a;
        if (bundle == null) {
            return null;
        }
        return bundle.getString(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String[] e(@Nullable String str) {
        Bundle bundle = this.f101908a;
        if (bundle == null) {
            return null;
        }
        return bundle.getStringArray(str);
    }

    @NotNull
    public final Set<String> f() {
        Bundle bundle = this.f101908a;
        Set<String> setKeySet = bundle == null ? null : bundle.keySet();
        return setKeySet == null ? SetsKt.emptySet() : setKeySet;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeBundle(this.f101908a);
    }

    private CameraEffectArguments(a aVar) {
        this.f101908a = aVar.c();
    }

    public CameraEffectArguments(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f101908a = parcel.readBundle(CameraEffectArguments.class.getClassLoader());
    }
}
