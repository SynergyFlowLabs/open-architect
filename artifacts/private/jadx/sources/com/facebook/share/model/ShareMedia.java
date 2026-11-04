package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.b1;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMedia.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public abstract class ShareMedia<M extends ShareMedia<M, B>, B extends a<M, B>> implements ShareModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Bundle f101966a;

    public static abstract class a<M extends ShareMedia<M, B>, B extends a<M, B>> implements com.facebook.share.model.a<M, B> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final C0919a f101967b = new C0919a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private Bundle f101968a = new Bundle();

        /* JADX INFO: renamed from: com.facebook.share.model.ShareMedia$a$a, reason: collision with other inner class name */
        public static final class C0919a {
            public /* synthetic */ C0919a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @n
            @NotNull
            public final List<ShareMedia<?, ?>> a(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Parcelable[] parcelableArray = parcel.readParcelableArray(ShareMedia.class.getClassLoader());
                if (parcelableArray == null) {
                    return CollectionsKt.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    if (parcelable instanceof ShareMedia) {
                        arrayList.add(parcelable);
                    }
                }
                return arrayList;
            }

            @n
            public final void b(@NotNull Parcel out, int i10, @NotNull List<? extends ShareMedia<?, ?>> media) {
                Intrinsics.checkNotNullParameter(out, "out");
                Intrinsics.checkNotNullParameter(media, "media");
                Object[] array = media.toArray(new ShareMedia[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                out.writeParcelableArray((Parcelable[]) array, i10);
            }

            private C0919a() {
            }
        }

        @n
        @NotNull
        public static final List<ShareMedia<?, ?>> d(@NotNull Parcel parcel) {
            return f101967b.a(parcel);
        }

        @n
        public static final void h(@NotNull Parcel parcel, int i10, @NotNull List<? extends ShareMedia<?, ?>> list) {
            f101967b.b(parcel, i10, list);
        }

        @NotNull
        public final Bundle b() {
            return this.f101968a;
        }

        @Override // com.facebook.share.model.a
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public B a(@Nullable M m10) {
            return m10 == null ? this : (B) f(((ShareMedia) m10).f101966a);
        }

        @l(message = "This method is deprecated. Use GraphRequest directly to set parameters.")
        @NotNull
        public final B e(@NotNull String key, @NotNull String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f101968a.putString(key, value);
            return this;
        }

        @l(message = "This method is deprecated. Use GraphRequest directly to set parameters.")
        @NotNull
        public final B f(@NotNull Bundle parameters) {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.f101968a.putAll(parameters);
            return this;
        }

        public final void g(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "<set-?>");
            this.f101968a = bundle;
        }
    }

    public enum b {
        PHOTO,
        VIDEO;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            b[] bVarArrValuesCustom = values();
            return (b[]) Arrays.copyOf(bVarArrValuesCustom, bVarArrValuesCustom.length);
        }
    }

    protected ShareMedia(@NotNull a<M, B> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f101966a = new Bundle(builder.b());
    }

    @NotNull
    public abstract b b();

    @l(message = "This method is deprecated. Use GraphRequest directly to set parameters.")
    @NotNull
    public final Bundle c() {
        return new Bundle(this.f101966a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeBundle(this.f101966a);
    }

    public ShareMedia(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Bundle bundle = parcel.readBundle(getClass().getClassLoader());
        this.f101966a = bundle == null ? new Bundle() : bundle;
    }
}
