package androidx.media2.exoplayer.external.extractor.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.metadata.Metadata;
import androidx.media2.exoplayer.external.util.q0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f54296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f54298d;

    class a implements Parcelable.Creator<MdtaMetadataEntry> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MdtaMetadataEntry createFromParcel(Parcel in) {
            return new MdtaMetadataEntry(in, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MdtaMetadataEntry[] newArray(int size) {
            return new MdtaMetadataEntry[size];
        }
    }

    /* synthetic */ MdtaMetadataEntry(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // androidx.media2.exoplayer.external.metadata.Metadata.Entry
    public Format O0() {
        return androidx.media2.exoplayer.external.metadata.a.b(this);
    }

    @Override // androidx.media2.exoplayer.external.metadata.Metadata.Entry
    public byte[] Y() {
        return androidx.media2.exoplayer.external.metadata.a.a(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MdtaMetadataEntry.class == obj.getClass()) {
            MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
            if (this.f54295a.equals(mdtaMetadataEntry.f54295a) && Arrays.equals(this.f54296b, mdtaMetadataEntry.f54296b) && this.f54297c == mdtaMetadataEntry.f54297c && this.f54298d == mdtaMetadataEntry.f54298d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f54295a.hashCode()) * 31) + Arrays.hashCode(this.f54296b)) * 31) + this.f54297c) * 31) + this.f54298d;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f54295a);
        return strValueOf.length() != 0 ? "mdta: key=".concat(strValueOf) : new String("mdta: key=");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.f54295a);
        dest.writeInt(this.f54296b.length);
        dest.writeByteArray(this.f54296b);
        dest.writeInt(this.f54297c);
        dest.writeInt(this.f54298d);
    }

    public MdtaMetadataEntry(String key, byte[] value, int localeIndicator, int typeIndicator) {
        this.f54295a = key;
        this.f54296b = value;
        this.f54297c = localeIndicator;
        this.f54298d = typeIndicator;
    }

    private MdtaMetadataEntry(Parcel in) {
        this.f54295a = (String) q0.i(in.readString());
        byte[] bArr = new byte[in.readInt()];
        this.f54296b = bArr;
        in.readByteArray(bArr);
        this.f54297c = in.readInt();
        this.f54298d = in.readInt();
    }
}
