package androidx.media2.exoplayer.external.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.metadata.Metadata;
import androidx.media2.exoplayer.external.util.q0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class EventMessage implements Metadata.Entry {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @l1
    public static final String f55425g = "https://aomedia.org/emsg/ID3";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f55426h = "https://developer.apple.com/streaming/emsg-id3";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @l1
    public static final String f55427i = "urn:scte:scte35:2014:bin";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f55432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f55433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f55434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f55435f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Format f55428j = Format.w(null, "application/id3", Long.MAX_VALUE);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Format f55429k = Format.w(null, "application/x-scte35", Long.MAX_VALUE);
    public static final Parcelable.Creator<EventMessage> CREATOR = new a();

    class a implements Parcelable.Creator<EventMessage> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public EventMessage createFromParcel(Parcel in) {
            return new EventMessage(in);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EventMessage[] newArray(int size) {
            return new EventMessage[size];
        }
    }

    public EventMessage(String schemeIdUri, String value, long durationMs, long id2, byte[] messageData) {
        this.f55430a = schemeIdUri;
        this.f55431b = value;
        this.f55432c = durationMs;
        this.f55433d = id2;
        this.f55434e = messageData;
    }

    @Override // androidx.media2.exoplayer.external.metadata.Metadata.Entry
    @p0
    public Format O0() {
        String str = this.f55430a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f55429k;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f55428j;
            default:
                return null;
        }
    }

    @Override // androidx.media2.exoplayer.external.metadata.Metadata.Entry
    @p0
    public byte[] Y() {
        if (O0() != null) {
            return this.f55434e;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && EventMessage.class == obj.getClass()) {
            EventMessage eventMessage = (EventMessage) obj;
            if (this.f55432c == eventMessage.f55432c && this.f55433d == eventMessage.f55433d && q0.b(this.f55430a, eventMessage.f55430a) && q0.b(this.f55431b, eventMessage.f55431b) && Arrays.equals(this.f55434e, eventMessage.f55434e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f55435f == 0) {
            String str = this.f55430a;
            boolean z10 = false & false;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f55431b;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j10 = this.f55432c;
            int i10 = (((iHashCode + iHashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f55433d;
            this.f55435f = ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.f55434e);
        }
        return this.f55435f;
    }

    public String toString() {
        String str = this.f55430a;
        long j10 = this.f55433d;
        long j11 = this.f55432c;
        String str2 = this.f55431b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 79 + String.valueOf(str2).length());
        sb2.append("EMSG: scheme=");
        sb2.append(str);
        sb2.append(", id=");
        sb2.append(j10);
        sb2.append(", durationMs=");
        sb2.append(j11);
        sb2.append(", value=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.f55430a);
        dest.writeString(this.f55431b);
        dest.writeLong(this.f55432c);
        dest.writeLong(this.f55433d);
        dest.writeByteArray(this.f55434e);
    }

    EventMessage(Parcel in) {
        this.f55430a = (String) q0.i(in.readString());
        this.f55431b = (String) q0.i(in.readString());
        this.f55432c = in.readLong();
        this.f55433d = in.readLong();
        this.f55434e = (byte[]) q0.i(in.createByteArray());
    }
}
