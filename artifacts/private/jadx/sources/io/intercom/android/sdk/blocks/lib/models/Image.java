package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes13.dex */
public class Image implements Parcelable {
    public static final Parcelable.Creator<Image> CREATOR = new Parcelable.Creator<Image>() { // from class: io.intercom.android.sdk.blocks.lib.models.Image.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Image createFromParcel(Parcel parcel) {
            return new Image(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Image[] newArray(int i10) {
            return new Image[i10];
        }
    };
    private final String alt;
    private final String attribution;
    private final int height;
    private final String previewUrl;
    private final String url;
    private final int width;

    public static final class Builder {
        String alt;
        String attribution;
        int height;
        String previewUrl;
        String url;
        int width;

        public Image build() {
            return new Image(this);
        }

        public Builder withAlt(String str) {
            this.alt = str;
            return this;
        }

        public Builder withAttribution(String str) {
            this.attribution = str;
            return this;
        }

        public Builder withHeight(int i10) {
            this.height = i10;
            return this;
        }

        public Builder withPreviewUrl(String str) {
            this.previewUrl = str;
            return this;
        }

        public Builder withUrl(String str) {
            this.url = str;
            return this;
        }

        public Builder withWidth(int i10) {
            this.width = i10;
            return this;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if (r6.alt != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r4 = 0
            r0 = 1
            if (r5 != r6) goto L5
            return r0
        L5:
            r4 = 7
            r1 = 0
            if (r6 == 0) goto L7e
            java.lang.Class r2 = r5.getClass()
            java.lang.Class r3 = r6.getClass()
            if (r2 == r3) goto L14
            goto L7e
        L14:
            io.intercom.android.sdk.blocks.lib.models.Image r6 = (io.intercom.android.sdk.blocks.lib.models.Image) r6
            java.lang.String r2 = r5.alt
            if (r2 == 0) goto L25
            java.lang.String r3 = r6.alt
            r4 = 7
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2c
            r4 = 5
            goto L2b
        L25:
            r4 = 6
            java.lang.String r2 = r6.alt
            r4 = 5
            if (r2 == 0) goto L2c
        L2b:
            return r1
        L2c:
            r4 = 1
            java.lang.String r2 = r5.previewUrl
            r4 = 7
            if (r2 == 0) goto L3d
            java.lang.String r3 = r6.previewUrl
            r4 = 3
            boolean r2 = r2.equals(r3)
            r4 = 3
            if (r2 != 0) goto L43
            goto L41
        L3d:
            java.lang.String r2 = r6.previewUrl
            if (r2 == 0) goto L43
        L41:
            r4 = 6
            return r1
        L43:
            r4 = 2
            java.lang.String r2 = r5.attribution
            r4 = 5
            if (r2 == 0) goto L55
            r4 = 1
            java.lang.String r3 = r6.attribution
            r4 = 3
            boolean r2 = r2.equals(r3)
            r4 = 3
            if (r2 != 0) goto L5a
            goto L59
        L55:
            java.lang.String r2 = r6.attribution
            if (r2 == 0) goto L5a
        L59:
            return r1
        L5a:
            int r2 = r5.width
            int r3 = r6.width
            if (r2 == r3) goto L61
            return r1
        L61:
            int r2 = r5.height
            r4 = 5
            int r3 = r6.height
            if (r2 == r3) goto L69
            return r1
        L69:
            java.lang.String r5 = r5.url
            if (r5 == 0) goto L78
            r4 = 3
            java.lang.String r6 = r6.url
            boolean r5 = r5.equals(r6)
            r4 = 1
            if (r5 != 0) goto L7d
            goto L7e
        L78:
            r4 = 0
            java.lang.String r5 = r6.url
            if (r5 != 0) goto L7e
        L7d:
            return r0
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.blocks.lib.models.Image.equals(java.lang.Object):boolean");
    }

    public String getAlt() {
        return this.alt;
    }

    public String getAttribution() {
        return this.attribution;
    }

    public int getHeight() {
        return this.height;
    }

    public String getPreviewUrl() {
        return this.previewUrl;
    }

    public String getUrl() {
        return this.url;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.alt;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.url;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.previewUrl;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.attribution;
        return ((((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.width) * 31) + this.height;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.attribution);
        parcel.writeString(this.previewUrl);
        parcel.writeString(this.alt);
        parcel.writeString(this.url);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }

    Image() {
        this(new Builder());
    }

    private Image(Builder builder) {
        String str = builder.alt;
        this.alt = str == null ? "" : str;
        String str2 = builder.url;
        this.url = str2 == null ? "" : str2;
        String str3 = builder.previewUrl;
        this.previewUrl = str3 == null ? "" : str3;
        String str4 = builder.attribution;
        this.attribution = str4 != null ? str4 : "";
        this.width = builder.width;
        this.height = builder.height;
    }

    protected Image(Parcel parcel) {
        this.attribution = parcel.readString();
        this.previewUrl = parcel.readString();
        this.alt = parcel.readString();
        this.url = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
    }
}
