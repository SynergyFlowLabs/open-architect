package androidx.constraintlayout.core.parser;

import androidx.annotation.NonNull;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class f extends b implements Iterable<d> {

    private static class a implements Iterator<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        f f44167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f44168b = 0;

        a(f fVar) {
            this.f44167a = fVar;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d next() {
            d dVar = (d) this.f44167a.f44157h.get(this.f44168b);
            this.f44168b++;
            return dVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f44168b < this.f44167a.size();
        }
    }

    public f(char[] cArr) {
        super(cArr);
    }

    public static f A0(char[] cArr) {
        return new f(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.b, androidx.constraintlayout.core.parser.c
    @NonNull
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public f clone() {
        return (f) super.clone();
    }

    public String D0() {
        return K(0, 0);
    }

    @Override // androidx.constraintlayout.core.parser.c
    public String K(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder(n());
        sb2.append("{\n");
        boolean z10 = true;
        for (c cVar : this.f44157h) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(",\n");
            }
            sb2.append(cVar.K(c.f44159g + i10, i11 - 1));
        }
        sb2.append("\n");
        c(sb2, i10);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.parser.c
    public String L() {
        StringBuilder sb2 = new StringBuilder(n() + "{ ");
        boolean z10 = true;
        for (c cVar : this.f44157h) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(cVar.L());
        }
        sb2.append(" }");
        return sb2.toString();
    }

    @Override // java.lang.Iterable
    public Iterator<d> iterator() {
        return new a(this);
    }
}
