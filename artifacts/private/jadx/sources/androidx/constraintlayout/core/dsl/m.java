package androidx.constraintlayout.core.dsl;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList<p> f43249a = new ArrayList<>();

    public void a(p pVar) {
        this.f43249a.add(pVar);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.f43249a.isEmpty()) {
            sb2.append("keyFrames:{\n");
            Iterator<p> it = this.f43249a.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().toString());
            }
            sb2.append("},\n");
        }
        return sb2.toString();
    }
}
