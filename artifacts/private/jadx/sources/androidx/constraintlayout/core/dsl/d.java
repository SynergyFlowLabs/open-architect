package androidx.constraintlayout.core.dsl;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f43152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ArrayList<c> f43153b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ArrayList<h> f43154c = new ArrayList<>();

    public d(String str) {
        this.f43152a = str;
    }

    public void a(c cVar) {
        this.f43153b.add(cVar);
    }

    public void b(h hVar) {
        this.f43154c.add(hVar);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(this.f43152a + ":{\n");
        if (!this.f43153b.isEmpty()) {
            Iterator<c> it = this.f43153b.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().toString());
            }
        }
        if (!this.f43154c.isEmpty()) {
            Iterator<h> it2 = this.f43154c.iterator();
            while (it2.hasNext()) {
                sb2.append(it2.next().toString());
            }
        }
        sb2.append("},\n");
        return sb2.toString();
    }
}
