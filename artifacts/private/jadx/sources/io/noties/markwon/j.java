package io.noties.markwon;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public abstract class j {

    static class a extends j {
        a() {
        }

        @Override // io.noties.markwon.j
        @NonNull
        public List<org.commonmark.node.v> b(@NonNull org.commonmark.node.v vVar) {
            org.commonmark.node.v vVarE = vVar.e();
            if (vVarE == null) {
                return Collections.singletonList(vVar);
            }
            ArrayList arrayList = new ArrayList();
            while (vVarE != null) {
                if (!(vVarE instanceof org.commonmark.node.s)) {
                    arrayList.add(vVarE);
                }
                org.commonmark.node.v vVarG = vVarE.g();
                vVarE.o();
                vVarE = vVarG;
            }
            return arrayList;
        }
    }

    @NonNull
    public static j a() {
        return new a();
    }

    @NonNull
    public abstract List<org.commonmark.node.v> b(@NonNull org.commonmark.node.v vVar);
}
