package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import io.intercom.android.sdk.utilities.commons.CollectionUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class ReactionReply implements Parcelable {

    @p0
    private Integer reactionIndex;
    private final List<Reaction> reactionSet;
    public static final ReactionReply NULL = new ReactionReply(new Builder());
    public static final Parcelable.Creator<ReactionReply> CREATOR = new Parcelable.Creator<ReactionReply>() { // from class: io.intercom.android.sdk.models.ReactionReply.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ReactionReply createFromParcel(Parcel parcel) {
            return new ReactionReply(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ReactionReply[] newArray(int i10) {
            return new ReactionReply[i10];
        }
    };

    public static class Builder {
        Integer reaction_index;
        List<Reaction> reaction_set;

        public ReactionReply build() {
            return new ReactionReply(this);
        }
    }

    ReactionReply(Builder builder) {
        this.reactionIndex = builder.reaction_index;
        ArrayList arrayList = new ArrayList(CollectionUtils.capacityFor(builder.reaction_set));
        this.reactionSet = arrayList;
        List<Reaction> list = builder.reaction_set;
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    public static boolean isNull(ReactionReply reactionReply) {
        return NULL.equals(reactionReply) || reactionReply == null;
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
            ReactionReply reactionReply = (ReactionReply) obj;
            if (!this.reactionSet.equals(reactionReply.reactionSet)) {
                return false;
            }
            Integer num = this.reactionIndex;
            if (num != null) {
                return num.equals(reactionReply.reactionIndex);
            }
            if (reactionReply.reactionIndex == null) {
                return true;
            }
        }
        return false;
    }

    @p0
    public Integer getReactionIndex() {
        return this.reactionIndex;
    }

    public List<Reaction> getReactionSet() {
        return this.reactionSet;
    }

    public int hashCode() {
        int iHashCode = this.reactionSet.hashCode() * 31;
        Integer num = this.reactionIndex;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public void setReactionIndex(int i10) {
        this.reactionIndex = Integer.valueOf(i10);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        if (this.reactionIndex == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.reactionIndex.intValue());
        }
        parcel.writeList(this.reactionSet);
    }

    ReactionReply(Parcel parcel) {
        this.reactionIndex = parcel.readByte() == 0 ? null : Integer.valueOf(parcel.readInt());
        ArrayList arrayList = new ArrayList();
        this.reactionSet = arrayList;
        parcel.readList(arrayList, Reaction.class.getClassLoader());
    }
}
