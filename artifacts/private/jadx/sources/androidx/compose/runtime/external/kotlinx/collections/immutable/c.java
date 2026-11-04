package androidx.compose.runtime.external.kotlinx.collections.immutable;

import java.util.List;
import kotlin.collections.AbstractList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface c<E> extends List<E>, b<E>, qj.a {

    private static final class a<E> extends AbstractList<E> implements c<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final c<E> f35607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f35608b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f35609c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f35610d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull c<? extends E> cVar, int i10, int i11) {
            this.f35607a = cVar;
            this.f35608b = i10;
            this.f35609c = i11;
            i0.e.c(i10, i11, cVar.size());
            this.f35610d = i11 - i10;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public E get(int i10) {
            i0.e.a(i10, this.f35610d);
            return this.f35607a.get(this.f35608b + i10);
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.f35610d;
        }

        @Override // kotlin.collections.AbstractList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.c
        @NotNull
        public c<E> subList(int i10, int i11) {
            i0.e.c(i10, i11, this.f35610d);
            c<E> cVar = this.f35607a;
            int i12 = this.f35608b;
            return new a(cVar, i10 + i12, i12 + i11);
        }
    }

    @Override // java.util.List
    @NotNull
    default c<E> subList(int i10, int i11) {
        return new a(this, i10, i11);
    }
}
