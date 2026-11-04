package mg;

import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import com.google.gson.p;
import com.google.gson.s;
import com.google.gson.t;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes13.dex */
public class f implements t<Object[]>, k<Object[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f332661a = "mg.f";

    @Override // com.google.gson.k
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Object[] a(l lVar, Type type, j jVar) throws p {
        g gVarA = e.a();
        if (gVarA == null) {
            io.ably.lib.util.k.m(f332661a, "Skipping 'state' field json deserialization because ObjectsSerializer not found.");
            return null;
        }
        if (lVar.F()) {
            return gVarA.d(lVar.t());
        }
        throw new p("Expected a JSON array for 'state' field, but got: " + lVar);
    }

    @Override // com.google.gson.t
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public l b(Object[] objArr, Type type, s sVar) {
        g gVarA = e.a();
        if (gVarA != null) {
            return gVarA.b(objArr);
        }
        io.ably.lib.util.k.m(f332661a, "Skipping 'state' field json serialization because ObjectsSerializer not found.");
        return n.f125555a;
    }
}
