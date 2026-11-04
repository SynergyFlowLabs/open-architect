package io.grpc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class i extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<g> f288809a;

    private i(List<g> list) {
        this.f288809a = list;
    }

    public static g b(g... gVarArr) {
        if (gVarArr.length == 0) {
            throw new IllegalArgumentException("At least one credential is required");
        }
        for (g gVar : gVarArr) {
            gVar.getClass();
        }
        return new i(Collections.unmodifiableList(new ArrayList(Arrays.asList(gVarArr))));
    }

    @Override // io.grpc.g
    public g a() {
        ArrayList arrayList = new ArrayList();
        Iterator<g> it = this.f288809a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        return new i(Collections.unmodifiableList(arrayList));
    }

    public List<g> c() {
        return this.f288809a;
    }
}
