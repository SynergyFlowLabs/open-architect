package y0;

import androidx.compose.runtime.o2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.v;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@o2
@SourceDebugExtension({"SMAP\nLocaleList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocaleList.kt\nandroidx/compose/ui/text/intl/LocaleList\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,87:1\n151#2,2:88\n35#2,5:90\n153#2:95\n35#2,5:96\n153#2:101\n*S KotlinDebug\n*F\n+ 1 LocaleList.kt\nandroidx/compose/ui/text/intl/LocaleList\n*L\n53#1:88,2\n53#1:90,5\n53#1:95\n53#1:96,5\n53#1:101\n*E\n"})
public final class f implements Collection<e>, qj.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f390675d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<e> f390677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f390678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f390674c = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final f f390676e = new f((List<e>) CollectionsKt.emptyList());

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final f a() {
            return h.a().a();
        }

        @NotNull
        public final f b() {
            return f.f390676e;
        }

        private a() {
        }
    }

    public f(@NotNull List<e> list) {
        this.f390677a = list;
        this.f390678b = list.size();
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(e eVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends e> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof e) {
            return i((e) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<?> collection) {
        return this.f390677a.containsAll(collection);
    }

    public boolean d(e eVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.areEqual(this.f390677a, ((f) obj).f390677a);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f390677a.hashCode();
    }

    public boolean i(@NotNull e eVar) {
        return this.f390677a.contains(eVar);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f390677a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<e> iterator() {
        return this.f390677a.iterator();
    }

    @NotNull
    public final e k(int i10) {
        return this.f390677a.get(i10);
    }

    @NotNull
    public final List<e> l() {
        return this.f390677a;
    }

    public int m() {
        return this.f390678b;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super e> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return m();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return v.a(this);
    }

    @NotNull
    public String toString() {
        return "LocaleList(localeList=" + this.f390677a + ')';
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) v.b(this, tArr);
    }

    public f(@NotNull String str) {
        List listSplit$default = StringsKt.split$default(str, new String[]{","}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(listSplit$default.size());
        int size = listSplit$default.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(StringsKt.E5((String) listSplit$default.get(i10)).toString());
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            arrayList2.add(new e((String) arrayList.get(i11)));
        }
        this(arrayList2);
    }

    public f(@NotNull e... eVarArr) {
        this((List<e>) ArraysKt.toList(eVarArr));
    }
}
