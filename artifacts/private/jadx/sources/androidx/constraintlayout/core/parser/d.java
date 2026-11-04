package androidx.constraintlayout.core.parser;

import androidx.constraintlayout.core.motion.utils.v;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class d extends b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static ArrayList<String> f44165i;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        f44165i = arrayList;
        arrayList.add("ConstraintSets");
        f44165i.add("Variables");
        f44165i.add("Generate");
        f44165i.add(v.h.f44100a);
        f44165i.add("KeyFrames");
        f44165i.add(v.a.f43958a);
        f44165i.add("KeyPositions");
        f44165i.add("KeyCycles");
    }

    public d(char[] cArr) {
        super(cArr);
    }

    public static c A0(String str, c cVar) {
        d dVar = new d(str.toCharArray());
        dVar.J(0L);
        dVar.F(str.length() - 1);
        dVar.E0(cVar);
        return dVar;
    }

    public static c N(char[] cArr) {
        return new d(cArr);
    }

    public String C0() {
        return k();
    }

    public c D0() {
        if (this.f44157h.size() > 0) {
            return this.f44157h.get(0);
        }
        return null;
    }

    public void E0(c cVar) {
        if (this.f44157h.size() > 0) {
            this.f44157h.set(0, cVar);
        } else {
            this.f44157h.add(cVar);
        }
    }

    @Override // androidx.constraintlayout.core.parser.c
    protected String K(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder(n());
        c(sb2, i10);
        String strK = k();
        if (this.f44157h.size() <= 0) {
            return strK + ": <> ";
        }
        sb2.append(strK);
        sb2.append(": ");
        if (f44165i.contains(strK)) {
            i11 = 3;
        }
        if (i11 > 0) {
            sb2.append(this.f44157h.get(0).K(i10, i11 - 1));
        } else {
            String strL = this.f44157h.get(0).L();
            if (strL.length() + i10 < c.f44158f) {
                sb2.append(strL);
            } else {
                sb2.append(this.f44157h.get(0).K(i10, i11 - 1));
            }
        }
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.parser.c
    protected String L() {
        if (this.f44157h.size() <= 0) {
            return n() + k() + ": <> ";
        }
        return n() + k() + ": " + this.f44157h.get(0).L();
    }

    @Override // androidx.constraintlayout.core.parser.b, androidx.constraintlayout.core.parser.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d) || Objects.equals(C0(), ((d) obj).C0())) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.parser.b, androidx.constraintlayout.core.parser.c
    public int hashCode() {
        return super.hashCode();
    }
}
