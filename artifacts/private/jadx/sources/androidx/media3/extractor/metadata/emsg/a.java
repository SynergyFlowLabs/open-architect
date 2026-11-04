package androidx.media3.extractor.metadata.emsg;

import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.media3.common.r0;
import androidx.media3.common.util.b1;
import androidx.media3.common.w;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class a implements r0.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @l1
    public static final String f67480g = "https://aomedia.org/emsg/ID3";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f67481h = "https://developer.apple.com/streaming/emsg-id3";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @l1
    public static final String f67482i = "urn:scte:scte35:2014:bin";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final w f67483j = new w.b().u0("application/id3").N();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final w f67484k = new w.b().u0("application/x-scte35").N();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f67486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f67487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f67488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f67489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f67490f;

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f67485a = str;
        this.f67486b = str2;
        this.f67487c = j10;
        this.f67488d = j11;
        this.f67489e = bArr;
    }

    @Override // androidx.media3.common.r0.a
    @p0
    public w O0() {
        String str = this.f67485a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f67484k;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f67483j;
            default:
                return null;
        }
    }

    @Override // androidx.media3.common.r0.a
    @p0
    public byte[] Y() {
        if (O0() != null) {
            return this.f67489e;
        }
        return null;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f67487c == aVar.f67487c && this.f67488d == aVar.f67488d && Objects.equals(this.f67485a, aVar.f67485a) && Objects.equals(this.f67486b, aVar.f67486b) && Arrays.equals(this.f67489e, aVar.f67489e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f67490f == 0) {
            String str = this.f67485a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f67486b;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j10 = this.f67487c;
            int i10 = (((iHashCode + iHashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f67488d;
            this.f67490f = ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.f67489e);
        }
        return this.f67490f;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f67485a + ", id=" + this.f67488d + ", durationMs=" + this.f67487c + ", value=" + this.f67486b;
    }
}
