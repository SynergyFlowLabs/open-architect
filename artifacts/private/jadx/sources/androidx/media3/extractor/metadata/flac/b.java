package androidx.media3.extractor.metadata.flac;

import androidx.annotation.p0;
import androidx.media3.common.q0;
import androidx.media3.common.r0;
import androidx.media3.common.util.b1;
import com.google.common.primitives.l;

/* JADX INFO: loaded from: classes3.dex */
@b1
@Deprecated
public class b implements r0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f67502b;

    public b(String str, String str2) {
        this.f67501a = com.google.common.base.c.j(str);
        this.f67502b = str2;
    }

    @Override // androidx.media3.common.r0.a
    public void a(q0.b bVar) {
        String str = this.f67501a;
        str.getClass();
        switch (str) {
            case "TOTALTRACKS":
                Integer numG = l.G(this.f67502b);
                if (numG != null) {
                    bVar.t0(numG);
                    break;
                }
                break;
            case "TOTALDISCS":
                Integer numG2 = l.G(this.f67502b);
                if (numG2 != null) {
                    bVar.s0(numG2);
                    break;
                }
                break;
            case "TRACKNUMBER":
                Integer numG3 = l.G(this.f67502b);
                if (numG3 != null) {
                    bVar.u0(numG3);
                    break;
                }
                break;
            case "ALBUM":
                bVar.P(this.f67502b);
                break;
            case "GENRE":
                bVar.d0(this.f67502b);
                break;
            case "TITLE":
                bVar.r0(this.f67502b);
                break;
            case "DESCRIPTION":
                bVar.X(this.f67502b);
                break;
            case "DISCNUMBER":
                Integer numG4 = l.G(this.f67502b);
                if (numG4 != null) {
                    bVar.Y(numG4);
                    break;
                }
                break;
            case "ALBUMARTIST":
                bVar.O(this.f67502b);
                break;
            case "ARTIST":
                bVar.Q(this.f67502b);
                break;
        }
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f67501a.equals(bVar.f67501a) && this.f67502b.equals(bVar.f67502b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f67501a.hashCode()) * 31) + this.f67502b.hashCode();
    }

    public String toString() {
        return "VC: " + this.f67501a + "=" + this.f67502b;
    }
}
