package androidx.media3.extractor.metadata.id3;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class d extends i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f67539g = "CTOC";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f67540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f67541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f67542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f67543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i[] f67544f;

    public d(String str, boolean z10, boolean z11, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f67540b = str;
        this.f67541c = z10;
        this.f67542d = z11;
        this.f67543e = strArr;
        this.f67544f = iVarArr;
    }

    public i b(int i10) {
        return this.f67544f[i10];
    }

    public int c() {
        return this.f67544f.length;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f67541c == dVar.f67541c && this.f67542d == dVar.f67542d && Objects.equals(this.f67540b, dVar.f67540b) && Arrays.equals(this.f67543e, dVar.f67543e) && Arrays.equals(this.f67544f, dVar.f67544f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (((527 + (this.f67541c ? 1 : 0)) * 31) + (this.f67542d ? 1 : 0)) * 31;
        String str = this.f67540b;
        return i10 + (str != null ? str.hashCode() : 0);
    }
}
