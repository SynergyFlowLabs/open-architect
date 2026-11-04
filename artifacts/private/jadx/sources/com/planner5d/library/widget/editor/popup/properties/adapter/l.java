package com.planner5d.library.widget.editor.popup.properties.adapter;

import com.planner5d.library.model.y;
import com.planner5d.library.model.z;
import com.planner5d.library.services.utility.p0;

/* JADX INFO: loaded from: classes8.dex */
public class l extends m<z> {
    public l(p0 p0Var, com.planner5d.library.services.bitmaploader.target.h hVar) {
        super(p0Var, hVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.widget.editor.popup.properties.adapter.k
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public boolean p(z zVar, z zVar2) {
        String str = zVar.f222860a;
        return str != null && str.equals(zVar2.f222860a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void H(y yVar) {
        if (yVar != null) {
            for (int i10 = 0; i10 < getItemCount(); i10++) {
                String str = ((z) o(i10)).f222860a;
                if (str != null && str.equals(yVar.f222850b)) {
                    C(Integer.valueOf(i10));
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void I(y yVar) {
        if (yVar != null) {
            for (int i10 = 0; i10 < getItemCount(); i10++) {
                String str = ((z) o(i10)).f222860a;
                if (str != null && str.equals(yVar.f222850b)) {
                    D(Integer.valueOf(i10));
                    return;
                }
            }
        }
    }
}
