package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes13.dex */
public class Author implements Parcelable {
    public static final Parcelable.Creator<Author> CREATOR = new Parcelable.Creator<Author>() { // from class: io.intercom.android.sdk.blocks.lib.models.Author.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Author createFromParcel(Parcel parcel) {
            return new Author(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Author[] newArray(int i10) {
            return new Author[i10];
        }
    };
    private final String avatar;
    private final String firstName;
    private final String lastName;
    private final String name;

    public static final class Builder {
        String avatar;
        String firstName;
        String lastName;
        String name;

        public Author build() {
            return new Author(this);
        }

        public Builder withAvatar(String str) {
            this.avatar = str;
            return this;
        }

        public Builder withFirstName(String str) {
            this.firstName = str;
            return this;
        }

        public Builder withLastName(String str) {
            this.lastName = str;
            return this;
        }

        public Builder withName(String str) {
            this.name = str;
            return this;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0053, code lost:
    
        if (r6.lastName != null) goto L33;
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
            r1 = 0
            r4 = 3
            if (r6 == 0) goto L6b
            r4 = 5
            java.lang.Class r2 = r5.getClass()
            r4 = 7
            java.lang.Class r3 = r6.getClass()
            if (r2 == r3) goto L15
            goto L6b
        L15:
            io.intercom.android.sdk.blocks.lib.models.Author r6 = (io.intercom.android.sdk.blocks.lib.models.Author) r6
            java.lang.String r2 = r5.name
            if (r2 == 0) goto L26
            java.lang.String r3 = r6.name
            r4 = 5
            boolean r2 = r2.equals(r3)
            r4 = 4
            if (r2 != 0) goto L2c
            goto L2b
        L26:
            r4 = 1
            java.lang.String r2 = r6.name
            if (r2 == 0) goto L2c
        L2b:
            return r1
        L2c:
            r4 = 4
            java.lang.String r2 = r5.firstName
            if (r2 == 0) goto L3a
            java.lang.String r3 = r6.firstName
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L3f
            goto L3e
        L3a:
            java.lang.String r2 = r6.firstName
            if (r2 == 0) goto L3f
        L3e:
            return r1
        L3f:
            r4 = 4
            java.lang.String r2 = r5.lastName
            if (r2 == 0) goto L50
            r4 = 6
            java.lang.String r3 = r6.lastName
            r4 = 7
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L56
            r4 = 0
            goto L55
        L50:
            java.lang.String r2 = r6.lastName
            r4 = 5
            if (r2 == 0) goto L56
        L55:
            return r1
        L56:
            java.lang.String r5 = r5.avatar
            if (r5 == 0) goto L65
            java.lang.String r6 = r6.avatar
            boolean r5 = r5.equals(r6)
            r4 = 4
            if (r5 != 0) goto L6a
            r4 = 3
            goto L6b
        L65:
            r4 = 4
            java.lang.String r5 = r6.avatar
            if (r5 != 0) goto L6b
        L6a:
            return r0
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.blocks.lib.models.Author.equals(java.lang.Object):boolean");
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.firstName;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.lastName;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.avatar;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.name);
        parcel.writeString(this.avatar);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
    }

    Author() {
        this(new Builder());
    }

    private Author(Builder builder) {
        String str = builder.name;
        String str2 = "";
        this.name = str == null ? "" : str;
        String str3 = builder.avatar;
        this.avatar = str3 == null ? "" : str3;
        String str4 = builder.firstName;
        this.firstName = str4 == null ? "" : str4;
        String str5 = builder.lastName;
        if (str5 != null) {
            str2 = str5;
        }
        this.lastName = str2;
    }

    protected Author(Parcel parcel) {
        this.name = parcel.readString();
        this.avatar = parcel.readString();
        this.firstName = parcel.readString();
        this.lastName = parcel.readString();
    }
}
