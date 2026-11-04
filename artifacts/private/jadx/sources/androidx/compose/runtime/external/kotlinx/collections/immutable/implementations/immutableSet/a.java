package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.i;
import androidx.compose.runtime.internal.w0;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPersistentHashSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,72:1\n31#2:73\n31#2:74\n31#2:75\n31#2:76\n*S KotlinDebug\n*F\n+ 1 PersistentHashSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet\n*L\n24#1:73\n34#1:74\n38#1:75\n42#1:76\n*E\n"})
public final class a<E> extends AbstractSet<E> implements i<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final C0271a f35682c = new C0271a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f35683d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final a f35684e = new a(e.f35702d.a(), 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final e<E> f35685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f35686b;

    /* JADX INFO: renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.a$a, reason: collision with other inner class name */
    public static final class C0271a {
        public /* synthetic */ C0271a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <E> i<E> a() {
            return a.f35684e;
        }

        private C0271a() {
        }
    }

    public a(@NotNull e<E> eVar, int i10) {
        this.f35685a = eVar;
        this.f35686b = i10;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f35685a.i(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(@NotNull Collection<?> collection) {
        if (collection instanceof a) {
            return this.f35685a.j(((a) collection).f35685a, 0);
        }
        return collection instanceof b ? this.f35685a.j(((b) collection).k(), 0) : super.containsAll(collection);
    }

    @Override // kotlin.collections.AbstractCollection
    public int getSize() {
        return this.f35686b;
    }

    @NotNull
    public final e<E> i() {
        return this.f35685a;
    }

    @Override // kotlin.collections.AbstractSet, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<E> iterator() {
        return new c(this.f35685a);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @NotNull
    public i<E> I(@NotNull Function1<? super E, Boolean> function1) {
        i.a<E> aVarBuilder = builder();
        CollectionsKt.removeAll(aVarBuilder, function1);
        return aVarBuilder.build();
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @NotNull
    public i<E> add(E e10) {
        e<E> eVarB = this.f35685a.b(e10 != null ? e10.hashCode() : 0, e10, 0);
        return this.f35685a == eVarB ? this : new a(eVarB, size() + 1);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @NotNull
    public i<E> addAll(@NotNull Collection<? extends E> collection) {
        i.a<E> aVarBuilder = builder();
        aVarBuilder.addAll(collection);
        return aVarBuilder.build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @NotNull
    public i.a<E> builder() {
        return new b(this);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @NotNull
    public i<E> clear() {
        return f35682c.a();
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @NotNull
    public i<E> remove(E e10) {
        e<E> eVarK = this.f35685a.K(e10 != null ? e10.hashCode() : 0, e10, 0);
        return this.f35685a == eVarK ? this : new a(eVarK, size() - 1);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @NotNull
    public i<E> removeAll(@NotNull Collection<? extends E> collection) {
        i.a<E> aVarBuilder = builder();
        aVarBuilder.removeAll(collection);
        return aVarBuilder.build();
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @NotNull
    public i<E> retainAll(@NotNull Collection<? extends E> collection) {
        i.a<E> aVarBuilder = builder();
        aVarBuilder.retainAll(collection);
        return aVarBuilder.build();
    }
}
