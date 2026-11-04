package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class AppGroupCreationContent implements ShareModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f101898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f101899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final a f101900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final d f101897d = new d(null);

    @f
    @NotNull
    public static final Parcelable.Creator<AppGroupCreationContent> CREATOR = new c();

    public enum a {
        Open,
        Closed;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] aVarArrValuesCustom = values();
            return (a[]) Arrays.copyOf(aVarArrValuesCustom, aVarArrValuesCustom.length);
        }
    }

    public static final class b implements com.facebook.share.model.a<AppGroupCreationContent, b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private String f101904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private String f101905b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private a f101906c;

        @Override // v5.a
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppGroupCreationContent build() {
            return new AppGroupCreationContent(this, null);
        }

        @Nullable
        public final a c() {
            return this.f101906c;
        }

        @Nullable
        public final String d() {
            return this.f101905b;
        }

        @Nullable
        public final String e() {
            return this.f101904a;
        }

        @Override // com.facebook.share.model.a
        @NotNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public b a(@Nullable AppGroupCreationContent appGroupCreationContent) {
            return appGroupCreationContent == null ? this : k(appGroupCreationContent.c()).i(appGroupCreationContent.b()).g(appGroupCreationContent.a());
        }

        @NotNull
        public final b g(@Nullable a aVar) {
            this.f101906c = aVar;
            return this;
        }

        public final void h(@Nullable a aVar) {
            this.f101906c = aVar;
        }

        @NotNull
        public final b i(@Nullable String str) {
            this.f101905b = str;
            return this;
        }

        public final void j(@Nullable String str) {
            this.f101905b = str;
        }

        @NotNull
        public final b k(@Nullable String str) {
            this.f101904a = str;
            return this;
        }

        public final void l(@Nullable String str) {
            this.f101904a = str;
        }
    }

    public static final class c implements Parcelable.Creator<AppGroupCreationContent> {
        c() {
        }

        @Override // android.os.Parcelable.Creator
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AppGroupCreationContent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AppGroupCreationContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppGroupCreationContent[] newArray(int i10) {
            return new AppGroupCreationContent[i10];
        }
    }

    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    public /* synthetic */ AppGroupCreationContent(b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    @Nullable
    public final a a() {
        return this.f101900c;
    }

    @Nullable
    public final String b() {
        return this.f101899b;
    }

    @Nullable
    public final String c() {
        return this.f101898a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f101898a);
        out.writeString(this.f101899b);
        out.writeSerializable(this.f101900c);
    }

    private AppGroupCreationContent(b bVar) {
        this.f101898a = bVar.e();
        this.f101899b = bVar.d();
        this.f101900c = bVar.c();
    }

    public AppGroupCreationContent(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f101898a = parcel.readString();
        this.f101899b = parcel.readString();
        this.f101900c = (a) parcel.readSerializable();
    }
}
