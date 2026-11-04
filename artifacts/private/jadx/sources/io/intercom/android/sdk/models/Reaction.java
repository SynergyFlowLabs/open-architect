package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.w0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.c;
import gk.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
@d
public final class Reaction implements Parcelable {
    public static final int $stable = 0;

    @c("image_url")
    @Nullable
    private final String _imageUrl;

    @c(FirebaseAnalytics.d.f120644b0)
    private final int index;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<Reaction> CREATOR = new Creator();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @n
        @NotNull
        public final Reaction create(int i10, @NotNull String imageUrl) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            return new Reaction(i10, imageUrl);
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<Reaction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Reaction createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Reaction(parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Reaction[] newArray(int i10) {
            return new Reaction[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Reaction() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    private final String component2() {
        return this._imageUrl;
    }

    public static /* synthetic */ Reaction copy$default(Reaction reaction, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = reaction.index;
        }
        if ((i11 & 2) != 0) {
            str = reaction._imageUrl;
        }
        return reaction.copy(i10, str);
    }

    @n
    @NotNull
    public static final Reaction create(int i10, @NotNull String str) {
        return Companion.create(i10, str);
    }

    public final int component1() {
        return this.index;
    }

    @NotNull
    public final Reaction copy(int i10, @Nullable String str) {
        return new Reaction(i10, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Reaction)) {
            return false;
        }
        Reaction reaction = (Reaction) obj;
        return this.index == reaction.index && Intrinsics.areEqual(this._imageUrl, reaction._imageUrl);
    }

    @NotNull
    public final String getImageUrl() {
        String str = this._imageUrl;
        if (str == null) {
            str = "";
        }
        return str;
    }

    public final int getIndex() {
        return this.index;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2 = Integer.hashCode(this.index) * 31;
        String str = this._imageUrl;
        if (str == null) {
            iHashCode = 0;
            int i10 = 6 & 0;
        } else {
            iHashCode = str.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    @NotNull
    public String toString() {
        return "Reaction(index=" + this.index + ", _imageUrl=" + this._imageUrl + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.index);
        dest.writeString(this._imageUrl);
    }

    public Reaction(int i10, @Nullable String str) {
        this.index = i10;
        this._imageUrl = str;
    }

    public /* synthetic */ Reaction(int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? null : str);
    }
}
