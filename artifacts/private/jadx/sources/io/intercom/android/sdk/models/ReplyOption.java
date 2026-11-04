package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.w0;
import gk.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
@d
public final class ReplyOption implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<ReplyOption> CREATOR = new Creator();

    @NotNull
    private final String text;

    @NotNull
    private final String uuid;

    public static final class Creator implements Parcelable.Creator<ReplyOption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReplyOption createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ReplyOption(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReplyOption[] newArray(int i10) {
            return new ReplyOption[i10];
        }
    }

    public ReplyOption(@NotNull String text, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.text = text;
        this.uuid = uuid;
    }

    public static /* synthetic */ ReplyOption copy$default(ReplyOption replyOption, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = replyOption.text;
        }
        if ((i10 & 2) != 0) {
            str2 = replyOption.uuid;
        }
        return replyOption.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.text;
    }

    @NotNull
    public final String component2() {
        return this.uuid;
    }

    @NotNull
    public final ReplyOption copy(@NotNull String text, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return new ReplyOption(text, uuid);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReplyOption)) {
            return false;
        }
        ReplyOption replyOption = (ReplyOption) obj;
        return Intrinsics.areEqual(this.text, replyOption.text) && Intrinsics.areEqual(this.uuid, replyOption.uuid);
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + this.uuid.hashCode();
    }

    @NotNull
    public String toString() {
        return "ReplyOption(text=" + this.text + ", uuid=" + this.uuid + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.text);
        dest.writeString(this.uuid);
    }
}
