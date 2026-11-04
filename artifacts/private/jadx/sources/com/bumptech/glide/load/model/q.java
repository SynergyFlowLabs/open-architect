package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
class q<Model, Data> implements n<Model, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<n<Model, Data>> f96871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.core.util.s.a<List<Throwable>> f96872b;

    static class a<Data> implements com.bumptech.glide.load.data.d<Data>, com.bumptech.glide.load.data.d.a<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<com.bumptech.glide.load.data.d<Data>> f96873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.core.util.s.a<List<Throwable>> f96874b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f96875c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.bumptech.glide.h f96876d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private com.bumptech.glide.load.data.d.a<? super Data> f96877e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        private List<Throwable> f96878f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f96879g;

        a(@NonNull List<com.bumptech.glide.load.data.d<Data>> list, @NonNull androidx.core.util.s.a<List<Throwable>> aVar) {
            this.f96874b = aVar;
            com.bumptech.glide.util.k.c(list);
            this.f96873a = list;
            this.f96875c = 0;
        }

        private void f() {
            if (this.f96879g) {
                return;
            }
            if (this.f96875c < this.f96873a.size() - 1) {
                this.f96875c++;
                c(this.f96876d, this.f96877e);
            } else {
                com.bumptech.glide.util.k.d(this.f96878f);
                this.f96877e.e(new com.bumptech.glide.load.engine.q("Fetch failed", new ArrayList(this.f96878f)));
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<Data> a() {
            return this.f96873a.get(0).a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            List<Throwable> list = this.f96878f;
            if (list != null) {
                this.f96874b.a(list);
            }
            this.f96878f = null;
            Iterator<com.bumptech.glide.load.data.d<Data>> it = this.f96873a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void c(@NonNull com.bumptech.glide.h hVar, @NonNull com.bumptech.glide.load.data.d.a<? super Data> aVar) {
            this.f96876d = hVar;
            this.f96877e = aVar;
            this.f96878f = this.f96874b.acquire();
            this.f96873a.get(this.f96875c).c(hVar, this);
            if (this.f96879g) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f96879g = true;
            Iterator<com.bumptech.glide.load.data.d<Data>> it = this.f96873a.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void d(@p0 Data data) {
            if (data != null) {
                this.f96877e.d(data);
            } else {
                f();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void e(@NonNull Exception exc) {
            ((List) com.bumptech.glide.util.k.d(this.f96878f)).add(exc);
            f();
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public com.bumptech.glide.load.a getDataSource() {
            return this.f96873a.get(0).getDataSource();
        }
    }

    q(@NonNull List<n<Model, Data>> list, @NonNull androidx.core.util.s.a<List<Throwable>> aVar) {
        this.f96871a = list;
        this.f96872b = aVar;
    }

    @Override // com.bumptech.glide.load.model.n
    public n.a<Data> a(@NonNull Model model, int i10, int i11, @NonNull com.bumptech.glide.load.j jVar) {
        n.a<Data> aVarA;
        int size = this.f96871a.size();
        ArrayList arrayList = new ArrayList(size);
        com.bumptech.glide.load.g gVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            n<Model, Data> nVar = this.f96871a.get(i12);
            if (nVar.b(model) && (aVarA = nVar.a(model, i10, i11, jVar)) != null) {
                gVar = aVarA.f96864a;
                arrayList.add(aVarA.f96866c);
            }
        }
        if (arrayList.isEmpty() || gVar == null) {
            return null;
        }
        return new n.a<>(gVar, new a(arrayList, this.f96872b));
    }

    @Override // com.bumptech.glide.load.model.n
    public boolean b(@NonNull Model model) {
        Iterator<n<Model, Data>> it = this.f96871a.iterator();
        while (it.hasNext()) {
            if (it.next().b(model)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f96871a.toArray()) + AbstractJsonLexerKt.END_OBJ;
    }
}
