package androidx.media3.exoplayer.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import androidx.media3.common.StreamKey;
import androidx.media3.common.k0;
import androidx.media3.common.s0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import com.google.common.collect.l6;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f64352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    public final String f64353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<StreamKey> f64354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    public final byte[] f64355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    public final String f64356f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f64357g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    public final ByteRange f64358h;

    class a implements Parcelable.Creator<DownloadRequest> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DownloadRequest createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DownloadRequest[] newArray(int i10) {
            return new DownloadRequest[i10];
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f64361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f64362b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private String f64363c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private List<StreamKey> f64364d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        private byte[] f64365e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        private String f64366f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @p0
        private byte[] f64367g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @p0
        private ByteRange f64368h = null;

        public b(String str, Uri uri) {
            this.f64361a = str;
            this.f64362b = uri;
        }

        public DownloadRequest a() {
            String str = this.f64361a;
            Uri uri = this.f64362b;
            String str2 = this.f64363c;
            List listF = this.f64364d;
            if (listF == null) {
                listF = l6.F();
            }
            return new DownloadRequest(str, uri, str2, listF, this.f64365e, this.f64366f, this.f64367g, this.f64368h, null);
        }

        @z7.a
        public b b(long j10, long j11) {
            this.f64368h = new ByteRange(j10, j11);
            return this;
        }

        @z7.a
        public b c(@p0 String str) {
            this.f64366f = str;
            return this;
        }

        @z7.a
        public b d(@p0 byte[] bArr) {
            this.f64367g = bArr;
            return this;
        }

        @z7.a
        public b e(@p0 byte[] bArr) {
            this.f64365e = bArr;
            return this;
        }

        @z7.a
        public b f(@p0 String str) {
            this.f64363c = s0.w(str);
            return this;
        }

        @z7.a
        public b g(@p0 List<StreamKey> list) {
            this.f64364d = list;
            return this;
        }
    }

    public static class c extends IOException {
    }

    /* synthetic */ DownloadRequest(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2, ByteRange byteRange, a aVar) {
        this(str, uri, str2, list, bArr, str3, bArr2, byteRange);
    }

    public DownloadRequest a(String str) {
        return new DownloadRequest(str, this.f64352b, this.f64353c, this.f64354d, this.f64355e, this.f64356f, this.f64357g, this.f64358h);
    }

    public DownloadRequest b(@p0 byte[] bArr) {
        return new DownloadRequest(this.f64351a, this.f64352b, this.f64353c, this.f64354d, bArr, this.f64356f, this.f64357g, this.f64358h);
    }

    public DownloadRequest c(DownloadRequest downloadRequest) {
        List arrayList;
        androidx.media3.common.util.a.a(this.f64351a.equals(downloadRequest.f64351a));
        if (this.f64354d.isEmpty() || downloadRequest.f64354d.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList(this.f64354d);
            for (int i10 = 0; i10 < downloadRequest.f64354d.size(); i10++) {
                StreamKey streamKey = downloadRequest.f64354d.get(i10);
                if (!arrayList.contains(streamKey)) {
                    arrayList.add(streamKey);
                }
            }
        }
        return new DownloadRequest(this.f64351a, downloadRequest.f64352b, downloadRequest.f64353c, arrayList, downloadRequest.f64355e, downloadRequest.f64356f, downloadRequest.f64357g, downloadRequest.f64358h);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public k0 e() {
        return new k0.c().E(this.f64351a).M(this.f64352b).l(this.f64356f).G(this.f64353c).I(this.f64354d).a();
    }

    public boolean equals(@p0 Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        return this.f64351a.equals(downloadRequest.f64351a) && this.f64352b.equals(downloadRequest.f64352b) && Objects.equals(this.f64353c, downloadRequest.f64353c) && this.f64354d.equals(downloadRequest.f64354d) && Arrays.equals(this.f64355e, downloadRequest.f64355e) && Objects.equals(this.f64356f, downloadRequest.f64356f) && Arrays.equals(this.f64357g, downloadRequest.f64357g) && Objects.equals(this.f64358h, downloadRequest.f64358h);
    }

    public int hashCode() {
        int iHashCode = ((this.f64351a.hashCode() * 961) + this.f64352b.hashCode()) * 31;
        String str = this.f64353c;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f64354d.hashCode()) * 31) + Arrays.hashCode(this.f64355e)) * 31;
        String str2 = this.f64356f;
        int iHashCode3 = (((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f64357g)) * 31;
        ByteRange byteRange = this.f64358h;
        return iHashCode3 + (byteRange != null ? byteRange.hashCode() : 0);
    }

    public String toString() {
        return this.f64353c + ":" + this.f64351a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f64351a);
        parcel.writeString(this.f64352b.toString());
        parcel.writeString(this.f64353c);
        parcel.writeInt(this.f64354d.size());
        for (int i11 = 0; i11 < this.f64354d.size(); i11++) {
            parcel.writeParcelable(this.f64354d.get(i11), 0);
        }
        parcel.writeByteArray(this.f64355e);
        parcel.writeString(this.f64356f);
        parcel.writeByteArray(this.f64357g);
        parcel.writeParcelable(this.f64358h, 0);
    }

    private DownloadRequest(String str, Uri uri, @p0 String str2, List<StreamKey> list, @p0 byte[] bArr, @p0 String str3, @p0 byte[] bArr2, @p0 ByteRange byteRange) {
        int iA1 = k1.a1(uri, str2);
        boolean z10 = true;
        if (iA1 == 0 || iA1 == 2 || iA1 == 1) {
            if (str3 != null) {
                z10 = false;
            }
            androidx.media3.common.util.a.b(z10, "customCacheKey must be null for type: " + iA1);
            this.f64358h = null;
        } else {
            this.f64358h = byteRange;
        }
        this.f64351a = str;
        this.f64352b = uri;
        this.f64353c = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.f64354d = Collections.unmodifiableList(arrayList);
        this.f64355e = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.f64356f = str3;
        this.f64357g = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : k1.f61545f;
    }

    public static final class ByteRange implements Parcelable {
        public static final Parcelable.Creator<ByteRange> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f64359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f64360b;

        class a implements Parcelable.Creator<ByteRange> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ByteRange createFromParcel(Parcel parcel) {
                return new ByteRange(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public ByteRange[] newArray(int i10) {
                return new ByteRange[i10];
            }
        }

        ByteRange(long j10, long j11) {
            boolean z10 = !false;
            androidx.media3.common.util.a.a(j10 >= 0);
            androidx.media3.common.util.a.a(j11 >= 0 || j11 == -1);
            this.f64359a = j10;
            this.f64360b = j11;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@p0 Object obj) {
            if (!(obj instanceof ByteRange)) {
                return false;
            }
            ByteRange byteRange = (ByteRange) obj;
            return this.f64359a == byteRange.f64359a && this.f64360b == byteRange.f64360b;
        }

        public int hashCode() {
            return (((int) this.f64359a) * 961) + ((int) this.f64360b);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f64359a);
            parcel.writeLong(this.f64360b);
        }

        ByteRange(Parcel parcel) {
            this(parcel.readLong(), parcel.readLong());
        }
    }

    DownloadRequest(Parcel parcel) {
        this.f64351a = (String) k1.o(parcel.readString());
        this.f64352b = Uri.parse((String) k1.o(parcel.readString()));
        this.f64353c = parcel.readString();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.f64354d = Collections.unmodifiableList(arrayList);
        this.f64355e = parcel.createByteArray();
        this.f64356f = parcel.readString();
        this.f64357g = (byte[]) k1.o(parcel.createByteArray());
        this.f64358h = (ByteRange) parcel.readParcelable(ByteRange.class.getClassLoader());
    }
}
