package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes13.dex */
public class BlockAttachment implements Parcelable {
    public static final Parcelable.Creator<BlockAttachment> CREATOR = new Parcelable.Creator<BlockAttachment>() { // from class: io.intercom.android.sdk.blocks.lib.models.BlockAttachment.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BlockAttachment createFromParcel(Parcel parcel) {
            return new BlockAttachment(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BlockAttachment[] newArray(int i10) {
            return new BlockAttachment[i10];
        }
    };
    private final String contentType;
    private final String humanFileSize;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f291538id;
    private final String name;
    private final long size;
    private final String url;

    public static final class Builder {
        String contentType;
        String humanFileSize;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        int f291539id;
        String name;
        long size;
        String url;

        public BlockAttachment build() {
            return new BlockAttachment(this);
        }

        public Builder withContentType(String str) {
            this.contentType = str;
            return this;
        }

        public Builder withHumanFileSize(String str) {
            this.humanFileSize = str;
            return this;
        }

        public Builder withId(int i10) {
            this.f291539id = i10;
            return this;
        }

        public Builder withName(String str) {
            this.name = str;
            return this;
        }

        public Builder withSize(long j10) {
            this.size = j10;
            return this;
        }

        public Builder withUrl(String str) {
            this.url = str;
            return this;
        }
    }

    public BlockAttachment() {
        this(new Builder());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0061, code lost:
    
        if (r8.humanFileSize == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L5
            r6 = 6
            return r0
        L5:
            r1 = 1
            r1 = 0
            if (r8 == 0) goto L77
            r6 = 1
            java.lang.Class r2 = r7.getClass()
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L15
            goto L77
        L15:
            io.intercom.android.sdk.blocks.lib.models.BlockAttachment r8 = (io.intercom.android.sdk.blocks.lib.models.BlockAttachment) r8
            long r2 = r7.size
            long r4 = r8.size
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L20
            return r1
        L20:
            int r2 = r7.f291538id
            int r3 = r8.f291538id
            if (r2 == r3) goto L27
            return r1
        L27:
            java.lang.String r2 = r7.name
            if (r2 == 0) goto L36
            r6 = 6
            java.lang.String r3 = r8.name
            boolean r2 = r2.equals(r3)
            r6 = 3
            if (r2 != 0) goto L3c
            goto L3b
        L36:
            r6 = 1
            java.lang.String r2 = r8.name
            if (r2 == 0) goto L3c
        L3b:
            return r1
        L3c:
            java.lang.String r2 = r7.url
            if (r2 == 0) goto L4b
            r6 = 5
            java.lang.String r3 = r8.url
            r6 = 4
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L50
            goto L4f
        L4b:
            java.lang.String r2 = r8.url
            if (r2 == 0) goto L50
        L4f:
            return r1
        L50:
            java.lang.String r2 = r7.humanFileSize
            if (r2 == 0) goto L5f
            java.lang.String r3 = r8.humanFileSize
            r6 = 0
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L64
            r6 = 2
            goto L63
        L5f:
            java.lang.String r2 = r8.humanFileSize
            if (r2 != 0) goto L64
        L63:
            return r1
        L64:
            java.lang.String r7 = r7.contentType
            if (r7 == 0) goto L71
            r6 = 6
            java.lang.String r8 = r8.contentType
            boolean r7 = r7.equals(r8)
            r6 = 2
            return r7
        L71:
            r6 = 1
            java.lang.String r7 = r8.contentType
            if (r7 != 0) goto L77
            return r0
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.blocks.lib.models.BlockAttachment.equals(java.lang.Object):boolean");
    }

    public String getContentType() {
        return this.contentType;
    }

    public String getHumanFileSize() {
        return this.humanFileSize;
    }

    public int getId() {
        return this.f291538id;
    }

    public String getName() {
        return this.name;
    }

    public long getSize() {
        return this.size;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.url;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.contentType;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.humanFileSize;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        long j10 = this.size;
        return ((iHashCode4 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f291538id;
    }

    public Builder toBuilder() {
        return new Builder().withName(this.name).withUrl(this.url).withContentType(this.contentType).withHumanFileSize(this.humanFileSize).withId(this.f291538id).withSize(this.size);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.name);
        parcel.writeString(this.url);
        parcel.writeString(this.contentType);
        parcel.writeString(this.humanFileSize);
        parcel.writeInt(this.f291538id);
        parcel.writeLong(this.size);
    }

    public BlockAttachment(Builder builder) {
        String str = builder.name;
        this.name = str == null ? "" : str;
        String str2 = builder.url;
        this.url = str2 == null ? "" : str2;
        String str3 = builder.contentType;
        this.contentType = str3 == null ? "" : str3;
        String str4 = builder.humanFileSize;
        this.humanFileSize = str4 != null ? str4 : "";
        this.f291538id = builder.f291539id;
        this.size = builder.size;
    }

    protected BlockAttachment(Parcel parcel) {
        this.name = parcel.readString();
        this.url = parcel.readString();
        this.contentType = parcel.readString();
        this.humanFileSize = parcel.readString();
        this.f291538id = parcel.readInt();
        this.size = parcel.readLong();
    }
}
