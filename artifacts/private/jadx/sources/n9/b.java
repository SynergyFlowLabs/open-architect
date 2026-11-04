package n9;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.g;
import com.google.firebase.components.h;
import com.google.firebase.components.k;
import com.google.firebase.components.m;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class b implements m {
    public static /* synthetic */ Object b(String str, g gVar, h hVar) {
        try {
            c.b(str);
            return gVar.k().a(hVar);
        } finally {
            c.a();
        }
    }

    @Override // com.google.firebase.components.m
    public List<g<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final g<?> gVarZ : componentRegistrar.getComponents()) {
            final String strL = gVarZ.l();
            if (strL != null) {
                gVarZ = gVarZ.z(new k() { // from class: n9.a
                    @Override // com.google.firebase.components.k
                    public final Object a(h hVar) {
                        return b.b(strL, gVarZ, hVar);
                    }
                });
            }
            arrayList.add(gVarZ);
        }
        return arrayList;
    }
}
