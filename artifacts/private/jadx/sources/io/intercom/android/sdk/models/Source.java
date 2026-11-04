package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.w0;
import gk.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
@d
public final class Source implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<Source> CREATOR = new Creator();

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f293122id;

    @NotNull
    private final String title;

    @NotNull
    private final String type;

    @NotNull
    private final String url;

    public static final class Creator implements Parcelable.Creator<Source> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Source createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Source(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Source[] newArray(int i10) {
            return new Source[i10];
        }
    }

    public Source(@NotNull String id2, @NotNull String type, @NotNull String title, @NotNull String url) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f293122id = id2;
        this.type = type;
        this.title = title;
        this.url = url;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final String getId() {
        return this.f293122id;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f293122id);
        dest.writeString(this.type);
        dest.writeString(this.title);
        dest.writeString(this.url);
    }
}
