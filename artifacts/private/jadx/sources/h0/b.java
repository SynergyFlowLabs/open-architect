package h0;

import androidx.compose.runtime.external.kotlinx.collections.immutable.i;
import androidx.compose.runtime.internal.w0;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPersistentOrderedSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentOrderedSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,109:1\n31#2:110\n31#2:111\n31#2:112\n31#2:113\n*S KotlinDebug\n*F\n+ 1 PersistentOrderedSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet\n*L\n56#1:110\n81#1:111\n85#1:112\n89#1:113\n*E\n"})
public final class b<E> extends AbstractSet<E> implements i<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f280068d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f280069e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final b f280070f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Object f280071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Object f280072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<E, h0.a> f280073c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <E> i<E> a() {
            return b.f280070f;
        }

        private a() {
        }
    }

    static {
        i0.c cVar = i0.c.f286699a;
        f280070f = new b(cVar, cVar, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d.f35618c.a());
    }

    public b(@Nullable Object obj, @Nullable Object obj2, @NotNull androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<E, h0.a> dVar) {
        this.f280071a = obj;
        this.f280072b = obj2;
        this.f280073c = dVar;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f280073c.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractCollection
    public int getSize() {
        return this.f280073c.size();
    }

    @Nullable
    public final Object i() {
        return this.f280071a;
    }

    @Override // kotlin.collections.AbstractSet, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<E> iterator() {
        return new d(this.f280071a, this.f280073c);
    }

    @NotNull
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<E, h0.a> k() {
        return this.f280073c;
    }

    @Nullable
    public final Object l() {
        return this.f280072b;
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
        if (this.f280073c.containsKey(e10)) {
            return this;
        }
        if (isEmpty()) {
            return new b(e10, e10, this.f280073c.put(e10, new h0.a()));
        }
        Object obj = this.f280072b;
        h0.a aVar = this.f280073c.get(obj);
        Intrinsics.checkNotNull(aVar);
        return new b(this.f280071a, e10, this.f280073c.put((E) obj, aVar.e(e10)).put(e10, new h0.a(obj)));
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
        return new c(this);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @NotNull
    public i<E> clear() {
        return f280068d.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @NotNull
    public i<E> remove(E e10) {
        h0.a aVar = this.f280073c.get(e10);
        if (aVar == null) {
            return this;
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d dVarRemove = this.f280073c.remove(e10);
        if (aVar.b()) {
            V v10 = dVarRemove.get(aVar.d());
            Intrinsics.checkNotNull(v10);
            dVarRemove = dVarRemove.put(aVar.d(), ((h0.a) v10).e(aVar.c()));
        }
        if (aVar.a()) {
            V v11 = dVarRemove.get(aVar.c());
            Intrinsics.checkNotNull(v11);
            dVarRemove = dVarRemove.put(aVar.c(), ((h0.a) v11).f(aVar.d()));
        }
        return new b(!aVar.b() ? aVar.c() : this.f280071a, !aVar.a() ? aVar.d() : this.f280072b, dVarRemove);
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
