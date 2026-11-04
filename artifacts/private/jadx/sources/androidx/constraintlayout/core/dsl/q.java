package androidx.constraintlayout.core.dsl;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList<t> f43274a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ArrayList<d> f43275b = new ArrayList<>();

    public void a(d dVar) {
        this.f43275b.add(dVar);
    }

    public void b(t tVar) {
        this.f43274a.add(tVar);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{\n");
        if (!this.f43274a.isEmpty()) {
            sb2.append("Transitions:{\n");
            Iterator<t> it = this.f43274a.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().toString());
            }
            sb2.append("},\n");
        }
        if (!this.f43275b.isEmpty()) {
            sb2.append("ConstraintSets:{\n");
            Iterator<d> it2 = this.f43275b.iterator();
            while (it2.hasNext()) {
                sb2.append(it2.next().toString());
            }
            sb2.append("},\n");
        }
        sb2.append("}\n");
        return sb2.toString();
    }
}
