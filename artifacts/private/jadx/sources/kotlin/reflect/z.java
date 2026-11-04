package kotlin.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@kotlin.s
@SourceDebugExtension({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypeVariableImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,230:1\n1557#2:231\n1628#2,3:232\n37#3,2:235\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypeVariableImpl\n*L\n116#1:231\n116#1:232,3\n116#1:235,2\n*E\n"})
final class z implements TypeVariable<GenericDeclaration>, x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final t f313001a;

    public z(@NotNull t typeParameter) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        this.f313001a = typeParameter;
    }

    @Nullable
    public final <T extends Annotation> T a(@NotNull Class<T> annotationClass) {
        Intrinsics.checkNotNullParameter(annotationClass, "annotationClass");
        return null;
    }

    @NotNull
    public final Annotation[] b() {
        return new Annotation[0];
    }

    @NotNull
    public final Annotation[] c() {
        return new Annotation[0];
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) obj;
            if (Intrinsics.areEqual(getName(), typeVariable.getName()) && Intrinsics.areEqual(getGenericDeclaration(), typeVariable.getGenericDeclaration())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.TypeVariable
    @NotNull
    public Type[] getBounds() {
        List<s> upperBounds = this.f313001a.getUpperBounds();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(upperBounds, 10));
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(a0.c((s) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    @NotNull
    public GenericDeclaration getGenericDeclaration() {
        throw new l0("An operation is not implemented: " + ("getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f313001a));
    }

    @Override // java.lang.reflect.TypeVariable
    @NotNull
    public String getName() {
        return this.f313001a.getName();
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.x
    @NotNull
    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        return getGenericDeclaration().hashCode() ^ getName().hashCode();
    }

    @NotNull
    public String toString() {
        return getTypeName();
    }
}
