package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class p implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Collection f111008a;

    p(Collection collection) {
        this.f111008a = collection;
    }

    @Override // com.google.android.gms.tasks.c
    public final /* bridge */ /* synthetic */ Object a(@NonNull Task task) throws Exception {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f111008a.iterator();
        while (it.hasNext()) {
            arrayList.add(((Task) it.next()).q());
        }
        return arrayList;
    }
}
