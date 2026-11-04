package g0;

import androidx.compose.runtime.internal.w0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSmallPersistentVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmallPersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,161:1\n41#2:162\n41#2:163\n*S KotlinDebug\n*F\n+ 1 SmallPersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector\n*L\n48#1:162\n91#1:163\n*E\n"})
public final class m<E> extends d<E> implements androidx.compose.runtime.external.kotlinx.collections.immutable.c<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f275388c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f275389d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final m f275390e = new m(new Object[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object[] f275391b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final m a() {
            return m.f275390e;
        }

        private a() {
        }
    }

    public m(@NotNull Object[] objArr) {
        this.f275391b = objArr;
        i0.a.a(objArr.length <= 32);
    }

    private final Object[] m(int i10) {
        return new Object[i10];
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public E get(int i10) {
        i0.e.a(i10, size());
        return (E) this.f275391b[i10];
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.f275391b.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public int indexOf(Object obj) {
        return ArraysKt.indexOf(this.f275391b, obj);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.g
    @NotNull
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> l3(int i10) {
        i0.e.a(i10, size());
        if (size() == 1) {
            return f275390e;
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f275391b, size() - 1);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        ArraysKt.copyInto(this.f275391b, objArrCopyOf, i10, i10 + 1, size());
        return new m(objArrCopyOf);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        return ArraysKt.lastIndexOf(this.f275391b, obj);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator(int i10) {
        i0.e.b(i10, size());
        return new e(this.f275391b, i10, size());
    }

    @Override // kotlin.collections.AbstractList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.g
    @NotNull
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> set(int i10, E e10) {
        i0.e.a(i10, size());
        Object[] objArr = this.f275391b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = e10;
        return new m(objArrCopyOf);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @NotNull
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> I(@NotNull Function1<? super E, Boolean> function1) {
        Object[] objArrCopyOf = this.f275391b;
        int size = size();
        int size2 = size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size2; i10++) {
            Object obj = this.f275391b[i10];
            if (function1.invoke(obj).booleanValue()) {
                if (!z10) {
                    Object[] objArr = this.f275391b;
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                    z10 = true;
                    size = i10;
                }
            } else if (z10) {
                objArrCopyOf[size] = obj;
                size++;
            }
        }
        if (size == size()) {
            return this;
        }
        return size == 0 ? f275390e : new m(ArraysKt.copyOfRange(objArrCopyOf, 0, size));
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @NotNull
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> add(E e10) {
        if (size() >= 32) {
            return new g(this.f275391b, o.c(e10), size() + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f275391b, size() + 1);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[size()] = e10;
        return new m(objArrCopyOf);
    }

    @Override // g0.d, java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @NotNull
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> addAll(@NotNull Collection<? extends E> collection) {
        if (size() + collection.size() > 32) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.g.a<E> aVarBuilder = builder();
            aVarBuilder.addAll(collection);
            return aVarBuilder.build();
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f275391b, size() + collection.size());
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        int size = size();
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[size] = it.next();
            size++;
        }
        return new m(objArrCopyOf);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @NotNull
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g.a<E> builder() {
        return new i(this, null, this.f275391b, 0);
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.g
    @NotNull
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> add(int i10, E e10) {
        i0.e.b(i10, size());
        if (i10 == size()) {
            return add((Object) e10);
        }
        if (size() < 32) {
            Object[] objArrM = m(size() + 1);
            ArraysKt.copyInto$default(this.f275391b, objArrM, 0, 0, i10, 6, (Object) null);
            ArraysKt.copyInto(this.f275391b, objArrM, i10 + 1, i10, size());
            objArrM[i10] = e10;
            return new m(objArrM);
        }
        Object[] objArr = this.f275391b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        ArraysKt.copyInto(this.f275391b, objArrCopyOf, i10 + 1, i10, size() - 1);
        objArrCopyOf[i10] = e10;
        return new g(objArrCopyOf, o.c(this.f275391b[31]), size() + 1, 0);
    }

    @Override // g0.d, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.g
    @NotNull
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> addAll(int i10, @NotNull Collection<? extends E> collection) {
        i0.e.b(i10, size());
        if (size() + collection.size() <= 32) {
            Object[] objArrM = m(size() + collection.size());
            ArraysKt.copyInto$default(this.f275391b, objArrM, 0, 0, i10, 6, (Object) null);
            ArraysKt.copyInto(this.f275391b, objArrM, collection.size() + i10, i10, size());
            Iterator<? extends E> it = collection.iterator();
            int i11 = i10;
            while (it.hasNext()) {
                objArrM[i11] = it.next();
                i11++;
            }
            return new m(objArrM);
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.g.a<E> aVarBuilder = builder();
        aVarBuilder.addAll(i10, collection);
        return aVarBuilder.build();
    }
}
