package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import gk.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
@d
public final class EventContent implements Parcelable {
    public static final int $stable = 0;

    @c("text")
    @NotNull
    private final String text;

    @c("weight")
    @Nullable
    private final Weight weight;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<EventContent> CREATOR = new Creator();

    @f
    @NotNull
    public static final EventContent EMPTY = new EventContent(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<EventContent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EventContent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EventContent(parcel.readString(), parcel.readInt() == 0 ? null : Weight.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EventContent[] newArray(int i10) {
            return new EventContent[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EventContent() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ EventContent copy$default(EventContent eventContent, String str, Weight weight, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = eventContent.text;
        }
        if ((i10 & 2) != 0) {
            weight = eventContent.weight;
        }
        return eventContent.copy(str, weight);
    }

    @NotNull
    public final String component1() {
        return this.text;
    }

    @Nullable
    public final Weight component2() {
        return this.weight;
    }

    @NotNull
    public final EventContent copy(@NotNull String text, @Nullable Weight weight) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new EventContent(text, weight);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventContent)) {
            return false;
        }
        EventContent eventContent = (EventContent) obj;
        return Intrinsics.areEqual(this.text, eventContent.text) && this.weight == eventContent.weight;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final Weight getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        Weight weight = this.weight;
        return iHashCode + (weight == null ? 0 : weight.hashCode());
    }

    @NotNull
    public String toString() {
        return "EventContent(text=" + this.text + ", weight=" + this.weight + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.text);
        Weight weight = this.weight;
        if (weight == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(weight.name());
        }
    }

    public EventContent(@NotNull String text, @Nullable Weight weight) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.weight = weight;
    }

    public /* synthetic */ EventContent(String str, Weight weight, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? null : weight);
    }
}
