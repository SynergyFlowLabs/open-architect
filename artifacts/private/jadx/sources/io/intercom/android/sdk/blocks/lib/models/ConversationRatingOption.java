package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes13.dex */
public class ConversationRatingOption implements Parcelable {
    public static final Parcelable.Creator<ConversationRatingOption> CREATOR = new Parcelable.Creator<ConversationRatingOption>() { // from class: io.intercom.android.sdk.blocks.lib.models.ConversationRatingOption.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConversationRatingOption createFromParcel(Parcel parcel) {
            return new ConversationRatingOption(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConversationRatingOption[] newArray(int i10) {
            return new ConversationRatingOption[i10];
        }
    };
    private final String emoji;
    private final int index;
    private final String unicode;

    public static final class Builder {
        String emoji;
        Integer index;
        String unicode;

        public ConversationRatingOption build() {
            return new ConversationRatingOption(this);
        }

        public Builder withEmoji(String str) {
            this.emoji = str;
            return this;
        }

        public Builder withIndex(Integer num) {
            this.index = num;
            return this;
        }

        public Builder withUnicode(String str) {
            this.unicode = str;
            return this;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ConversationRatingOption conversationRatingOption = (ConversationRatingOption) obj;
            if (this.index != conversationRatingOption.index) {
                return false;
            }
            String str = this.emoji;
            if (str == null ? conversationRatingOption.emoji != null : !str.equals(conversationRatingOption.emoji)) {
                return false;
            }
            String str2 = this.unicode;
            if (str2 != null) {
                return str2.equals(conversationRatingOption.unicode);
            }
            if (conversationRatingOption.unicode == null) {
                return true;
            }
        }
        return false;
    }

    public String getEmoji() {
        return this.emoji;
    }

    public Integer getIndex() {
        return Integer.valueOf(this.index);
    }

    public String getUnicode() {
        return this.unicode;
    }

    public int hashCode() {
        int i10 = this.index * 31;
        String str = this.emoji;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.unicode;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.index);
        parcel.writeString(this.emoji);
        parcel.writeString(this.unicode);
    }

    private ConversationRatingOption(Builder builder) {
        Integer num = builder.index;
        this.index = num == null ? -1 : num.intValue();
        String str = builder.emoji;
        String str2 = "";
        this.emoji = str == null ? "" : str;
        String str3 = builder.unicode;
        if (str3 != null) {
            str2 = str3;
        }
        this.unicode = str2;
    }

    protected ConversationRatingOption(Parcel parcel) {
        this.index = parcel.readInt();
        this.emoji = parcel.readString();
        this.unicode = parcel.readString();
    }
}
