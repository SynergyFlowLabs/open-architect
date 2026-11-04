package androidx.media3.extractor.metadata.id3;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class c extends i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f67532h = "CHAP";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f67533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f67534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f67535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f67536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f67537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i[] f67538g;

    public c(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super("CHAP");
        this.f67533b = str;
        this.f67534c = i10;
        this.f67535d = i11;
        this.f67536e = j10;
        this.f67537f = j11;
        this.f67538g = iVarArr;
    }

    public i b(int i10) {
        return this.f67538g[i10];
    }

    public int c() {
        return this.f67538g.length;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f67534c == cVar.f67534c && this.f67535d == cVar.f67535d && this.f67536e == cVar.f67536e && this.f67537f == cVar.f67537f && Objects.equals(this.f67533b, cVar.f67533b) && Arrays.equals(this.f67538g, cVar.f67538g)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (((((((527 + this.f67534c) * 31) + this.f67535d) * 31) + ((int) this.f67536e)) * 31) + ((int) this.f67537f)) * 31;
        String str = this.f67533b;
        return i10 + (str != null ? str.hashCode() : 0);
    }
}
