package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class ConversationRating implements Parcelable {
    public static final Parcelable.Creator<ConversationRating> CREATOR = new Parcelable.Creator<ConversationRating>() { // from class: io.intercom.android.sdk.blocks.lib.models.ConversationRating.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConversationRating createFromParcel(Parcel parcel) {
            return new ConversationRating(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConversationRating[] newArray(int i10) {
            return new ConversationRating[i10];
        }
    };
    private final List<ConversationRatingOption> options;
    private int ratingIndex;
    private String remark;

    ConversationRating(int i10, String str, List<ConversationRatingOption> list) {
        this.ratingIndex = i10;
        this.remark = str;
        this.options = list;
    }

    public static ConversationRating fromBlock(Block block) {
        return block == null ? new ConversationRating(-1, "", new ArrayList()) : new ConversationRating(block.getRatingIndex(), block.getRemark(), block.getOptions());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if (r6.remark != null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            r4 = 3
            r1 = 0
            if (r6 == 0) goto L47
            java.lang.Class r2 = r5.getClass()
            r4 = 4
            java.lang.Class r3 = r6.getClass()
            if (r2 == r3) goto L14
            goto L47
        L14:
            io.intercom.android.sdk.blocks.lib.models.ConversationRating r6 = (io.intercom.android.sdk.blocks.lib.models.ConversationRating) r6
            int r2 = r5.ratingIndex
            int r3 = r6.ratingIndex
            r4 = 2
            if (r2 == r3) goto L1e
            return r1
        L1e:
            java.lang.String r2 = r5.remark
            if (r2 == 0) goto L2e
            java.lang.String r3 = r6.remark
            r4 = 5
            boolean r2 = r2.equals(r3)
            r4 = 1
            if (r2 != 0) goto L34
            r4 = 0
            goto L32
        L2e:
            java.lang.String r2 = r6.remark
            if (r2 == 0) goto L34
        L32:
            r4 = 3
            return r1
        L34:
            java.util.List<io.intercom.android.sdk.blocks.lib.models.ConversationRatingOption> r5 = r5.options
            if (r5 == 0) goto L40
            r4 = 3
            java.util.List<io.intercom.android.sdk.blocks.lib.models.ConversationRatingOption> r6 = r6.options
            boolean r5 = r5.equals(r6)
            return r5
        L40:
            r4 = 7
            java.util.List<io.intercom.android.sdk.blocks.lib.models.ConversationRatingOption> r5 = r6.options
            r4 = 0
            if (r5 != 0) goto L47
            return r0
        L47:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.blocks.lib.models.ConversationRating.equals(java.lang.Object):boolean");
    }

    public List<ConversationRatingOption> getOptions() {
        return this.options;
    }

    public Integer getRatingIndex() {
        return Integer.valueOf(this.ratingIndex);
    }

    public String getRemark() {
        return this.remark;
    }

    public int hashCode() {
        int i10 = this.ratingIndex * 31;
        String str = this.remark;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        List<ConversationRatingOption> list = this.options;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public void setRatingIndex(int i10) {
        this.ratingIndex = i10;
    }

    public void setRemark(String str) {
        this.remark = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.ratingIndex);
        parcel.writeString(this.remark);
        parcel.writeList(this.options);
    }

    protected ConversationRating(Parcel parcel) {
        this.ratingIndex = parcel.readInt();
        this.remark = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.options = arrayList;
        parcel.readList(arrayList, ConversationRatingOption.class.getClassLoader());
    }
}
