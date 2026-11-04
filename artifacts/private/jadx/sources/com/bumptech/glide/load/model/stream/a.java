package com.bumptech.glide.load.model.stream;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.model.h;
import com.bumptech.glide.load.model.m;
import com.bumptech.glide.load.model.n;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a<Model> implements n<Model, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n<com.bumptech.glide.load.model.g, InputStream> f96896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final m<Model, com.bumptech.glide.load.model.g> f96897b;

    protected a(n<com.bumptech.glide.load.model.g, InputStream> nVar) {
        this(nVar, null);
    }

    private static List<com.bumptech.glide.load.g> c(Collection<String> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.bumptech.glide.load.model.g(it.next()));
        }
        return arrayList;
    }

    @Override // com.bumptech.glide.load.model.n
    @p0
    public n.a<InputStream> a(@NonNull Model model, int i10, int i11, @NonNull j jVar) {
        m<Model, com.bumptech.glide.load.model.g> mVar = this.f96897b;
        com.bumptech.glide.load.model.g gVarB = mVar != null ? mVar.b(model, i10, i11) : null;
        if (gVarB == null) {
            String strF = f(model, i10, i11, jVar);
            if (TextUtils.isEmpty(strF)) {
                return null;
            }
            com.bumptech.glide.load.model.g gVar = new com.bumptech.glide.load.model.g(strF, e(model, i10, i11, jVar));
            m<Model, com.bumptech.glide.load.model.g> mVar2 = this.f96897b;
            if (mVar2 != null) {
                mVar2.c(model, i10, i11, gVar);
            }
            gVarB = gVar;
        }
        List<String> listD = d(model, i10, i11, jVar);
        n.a<InputStream> aVarA = this.f96896a.a(gVarB, i10, i11, jVar);
        if (aVarA != null && !listD.isEmpty()) {
            return new n.a<>(aVarA.f96864a, c(listD), aVarA.f96866c);
        }
        return aVarA;
    }

    protected List<String> d(Model model, int i10, int i11, j jVar) {
        return Collections.EMPTY_LIST;
    }

    @p0
    protected h e(Model model, int i10, int i11, j jVar) {
        return h.f96842b;
    }

    protected abstract String f(Model model, int i10, int i11, j jVar);

    protected a(n<com.bumptech.glide.load.model.g, InputStream> nVar, @p0 m<Model, com.bumptech.glide.load.model.g> mVar) {
        this.f96896a = nVar;
        this.f96897b = mVar;
    }
}
