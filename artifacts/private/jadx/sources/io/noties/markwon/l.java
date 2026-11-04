package io.noties.markwon;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<? extends org.commonmark.node.v>, x> f297658a;

    static class a implements k.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<Class<? extends org.commonmark.node.v>, x> f297659a = new HashMap(3);

        a() {
        }

        @Override // io.noties.markwon.k.a
        @NonNull
        public <N extends org.commonmark.node.v> x a(@NonNull Class<N> cls) {
            x xVarB = b(cls);
            if (xVarB != null) {
                return xVarB;
            }
            throw new NullPointerException(cls.getName());
        }

        @Override // io.noties.markwon.k.a
        @p0
        public <N extends org.commonmark.node.v> x b(@NonNull Class<N> cls) {
            return this.f297659a.get(cls);
        }

        @Override // io.noties.markwon.k.a
        @NonNull
        public k build() {
            return new l(Collections.unmodifiableMap(this.f297659a));
        }

        @Override // io.noties.markwon.k.a
        @NonNull
        public <N extends org.commonmark.node.v> k.a c(@NonNull Class<N> cls, @NonNull x xVar) {
            x xVar2 = this.f297659a.get(cls);
            if (xVar2 == null) {
                this.f297659a.put(cls, xVar);
                return this;
            }
            if (xVar2 instanceof b) {
                ((b) xVar2).f297660a.add(xVar);
                return this;
            }
            this.f297659a.put(cls, new b(xVar2, xVar));
            return this;
        }

        @Override // io.noties.markwon.k.a
        @NonNull
        public <N extends org.commonmark.node.v> k.a d(@NonNull Class<N> cls, @NonNull x xVar) {
            x xVar2 = this.f297659a.get(cls);
            if (xVar2 == null) {
                this.f297659a.put(cls, xVar);
                return this;
            }
            if (xVar2 instanceof b) {
                ((b) xVar2).f297660a.add(0, xVar);
                return this;
            }
            this.f297659a.put(cls, new b(xVar, xVar2));
            return this;
        }

        @Override // io.noties.markwon.k.a
        @NonNull
        public <N extends org.commonmark.node.v> k.a e(@NonNull Class<N> cls, @p0 x xVar) {
            if (xVar == null) {
                this.f297659a.remove(cls);
                return this;
            }
            this.f297659a.put(cls, xVar);
            return this;
        }

        @Override // io.noties.markwon.k.a
        @NonNull
        @Deprecated
        public <N extends org.commonmark.node.v> k.a f(@NonNull Class<N> cls, @NonNull x xVar) {
            return c(cls, xVar);
        }
    }

    static class b implements x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<x> f297660a;

        b(@NonNull x xVar, @NonNull x xVar2) {
            ArrayList arrayList = new ArrayList(3);
            this.f297660a = arrayList;
            arrayList.add(xVar);
            arrayList.add(xVar2);
        }

        @Override // io.noties.markwon.x
        @p0
        public Object a(@NonNull g gVar, @NonNull u uVar) {
            int size = this.f297660a.size();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = this.f297660a.get(i10).a(gVar, uVar);
            }
            return objArr;
        }
    }

    l(@NonNull Map<Class<? extends org.commonmark.node.v>, x> map) {
        this.f297658a = map;
    }

    @Override // io.noties.markwon.k
    @p0
    public <N extends org.commonmark.node.v> x a(@NonNull Class<N> cls) {
        return this.f297658a.get(cls);
    }

    @Override // io.noties.markwon.k
    @NonNull
    public <N extends org.commonmark.node.v> x b(@NonNull Class<N> cls) {
        x xVarA = a(cls);
        if (xVarA != null) {
            return xVarA;
        }
        throw new NullPointerException(cls.getName());
    }
}
