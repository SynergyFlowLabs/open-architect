package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
final class q implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Collection f111010a;

    q(Collection collection) {
        this.f111010a = collection;
    }

    @Override // com.google.android.gms.tasks.c
    public final /* bridge */ /* synthetic */ Object a(@NonNull Task task) throws Exception {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f111010a);
        return n.g(arrayList);
    }
}
