package androidx.paging;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPagingState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagingState.kt\nandroidx/paging/PagingState\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,152:1\n142#1,8:156\n142#1,8:175\n1726#2,3:153\n223#2,2:164\n451#2,6:166\n1726#2,3:172\n1726#2,3:183\n288#2,2:186\n533#2,6:188\n*S KotlinDebug\n*F\n+ 1 PagingState.kt\nandroidx/paging/PagingState\n*L\n76#1:156,8\n103#1:175,8\n74#1:153,3\n77#1:164,2\n78#1:166,6\n101#1:172,3\n115#1:183,3\n122#1:186,2\n130#1:188,6\n*E\n"})
public final class j2<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<h2.b.c<Key, Value>> f72290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Integer f72291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final w1 f72292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f72293d;

    public j2(@NotNull List<h2.b.c<Key, Value>> pages, @Nullable Integer num, @NotNull w1 config, @androidx.annotation.g0(from = 0) int i10) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f72290a = pages;
        this.f72291b = num;
        this.f72292c = config;
        this.f72293d = i10;
    }

    public final <T> T b(int i10, @NotNull Function2<? super Integer, ? super Integer, ? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int size = i10 - this.f72293d;
        int i11 = 0;
        while (i11 < CollectionsKt.getLastIndex(h()) && size > CollectionsKt.getLastIndex(h().get(i11).t())) {
            size -= h().get(i11).t().size();
            i11++;
        }
        return block.invoke(Integer.valueOf(i11), Integer.valueOf(size));
    }

    @Nullable
    public final Value c(int i10) {
        List<h2.b.c<Key, Value>> list = this.f72290a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((h2.b.c) it.next()).t().isEmpty()) {
                    int size = i10 - this.f72293d;
                    int i11 = 0;
                    while (i11 < CollectionsKt.getLastIndex(h()) && size > CollectionsKt.getLastIndex(h().get(i11).t())) {
                        size -= h().get(i11).t().size();
                        i11++;
                    }
                    Iterator<T> it2 = this.f72290a.iterator();
                    while (it2.hasNext()) {
                        h2.b.c cVar = (h2.b.c) it2.next();
                        if (!cVar.t().isEmpty()) {
                            List<h2.b.c<Key, Value>> list2 = this.f72290a;
                            ListIterator<h2.b.c<Key, Value>> listIterator = list2.listIterator(list2.size());
                            while (listIterator.hasPrevious()) {
                                h2.b.c<Key, Value> cVarPrevious = listIterator.previous();
                                if (!cVarPrevious.t().isEmpty()) {
                                    if (size < 0) {
                                        return (Value) CollectionsKt.first((List) cVar.t());
                                    }
                                    return (i11 != CollectionsKt.getLastIndex(this.f72290a) || size <= CollectionsKt.getLastIndex(((h2.b.c) CollectionsKt.last((List) this.f72290a)).t())) ? this.f72290a.get(i11).t().get(size) : (Value) CollectionsKt.last((List) cVarPrevious.t());
                                }
                            }
                            throw new NoSuchElementException("List contains no element matching the predicate.");
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
        }
        return null;
    }

    @Nullable
    public final h2.b.c<Key, Value> d(int i10) {
        List<h2.b.c<Key, Value>> list = this.f72290a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((h2.b.c) it.next()).t().isEmpty()) {
                int size = i10 - this.f72293d;
                int i11 = 0;
                while (i11 < CollectionsKt.getLastIndex(h()) && size > CollectionsKt.getLastIndex(h().get(i11).t())) {
                    size -= h().get(i11).t().size();
                    i11++;
                }
                return size < 0 ? (h2.b.c) CollectionsKt.first((List) this.f72290a) : this.f72290a.get(i11);
            }
        }
        return null;
    }

    @Nullable
    public final Value e() {
        Object next;
        List<Value> listT;
        Iterator<T> it = this.f72290a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((h2.b.c) next).t().isEmpty());
        h2.b.c cVar = (h2.b.c) next;
        if (cVar == null || (listT = cVar.t()) == null) {
            return null;
        }
        return (Value) CollectionsKt.firstOrNull((List) listT);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof j2) {
            j2 j2Var = (j2) obj;
            if (Intrinsics.areEqual(this.f72290a, j2Var.f72290a) && Intrinsics.areEqual(this.f72291b, j2Var.f72291b) && Intrinsics.areEqual(this.f72292c, j2Var.f72292c) && this.f72293d == j2Var.f72293d) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final Integer f() {
        return this.f72291b;
    }

    @NotNull
    public final w1 g() {
        return this.f72292c;
    }

    @NotNull
    public final List<h2.b.c<Key, Value>> h() {
        return this.f72290a;
    }

    public int hashCode() {
        int iHashCode = this.f72290a.hashCode();
        Integer num = this.f72291b;
        return iHashCode + (num != null ? num.hashCode() : 0) + this.f72292c.hashCode() + Integer.hashCode(this.f72293d);
    }

    public final boolean i() {
        List<h2.b.c<Key, Value>> list = this.f72290a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((h2.b.c) it.next()).t().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    public final Value j() {
        h2.b.c<Key, Value> cVarPrevious;
        List<Value> listT;
        List<h2.b.c<Key, Value>> list = this.f72290a;
        ListIterator<h2.b.c<Key, Value>> listIterator = list.listIterator(list.size());
        do {
            if (!listIterator.hasPrevious()) {
                cVarPrevious = null;
                break;
            }
            cVarPrevious = listIterator.previous();
        } while (cVarPrevious.t().isEmpty());
        h2.b.c<Key, Value> cVar = cVarPrevious;
        if (cVar == null || (listT = cVar.t()) == null) {
            return null;
        }
        return (Value) CollectionsKt.lastOrNull((List) listT);
    }

    @NotNull
    public String toString() {
        return "PagingState(pages=" + this.f72290a + ", anchorPosition=" + this.f72291b + ", config=" + this.f72292c + ", leadingPlaceholderCount=" + this.f72293d + ')';
    }
}
