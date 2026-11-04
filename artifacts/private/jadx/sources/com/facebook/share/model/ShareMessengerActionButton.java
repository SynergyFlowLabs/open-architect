package com.facebook.share.model;

import android.os.Parcel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ShareMessengerActionButton implements ShareModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f101975a;

    public static abstract class a<M extends ShareMessengerActionButton, B extends a<M, B>> implements com.facebook.share.model.a<M, B> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private String f101976a;

        @Nullable
        public final String b() {
            return this.f101976a;
        }

        @Override // com.facebook.share.model.a
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public B a(@Nullable M m10) {
            return m10 == null ? this : (B) d(m10.a());
        }

        @NotNull
        public final B d(@Nullable String str) {
            this.f101976a = str;
            return this;
        }

        public final void e(@Nullable String str) {
            this.f101976a = str;
        }
    }

    protected ShareMessengerActionButton(@NotNull a<?, ?> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f101975a = builder.b();
    }

    @Nullable
    public final String a() {
        return this.f101975a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f101975a);
    }

    public ShareMessengerActionButton(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f101975a = parcel.readString();
    }
}
