package mi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.a0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.g;
import kotlin.reflect.s;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nConversionService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversionService.kt\nio/ktor/util/converters/DefaultConversionService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,127:1\n1374#2:128\n1460#2,5:129\n1563#2:134\n1634#2,3:135\n*S KotlinDebug\n*F\n+ 1 ConversionService.kt\nio/ktor/util/converters/DefaultConversionService\n*L\n46#1:128\n46#1:129,5\n73#1:134\n73#1:135,3\n*E\n"})
public final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f332668a = new e();

    private e() {
    }

    private final Object c(kotlin.reflect.d<?> dVar, String str) {
        if (Intrinsics.areEqual(dVar, j1.d(Integer.TYPE))) {
            return Integer.valueOf(Integer.parseInt(str));
        }
        if (Intrinsics.areEqual(dVar, j1.d(Float.TYPE))) {
            return Float.valueOf(Float.parseFloat(str));
        }
        if (Intrinsics.areEqual(dVar, j1.d(Double.TYPE))) {
            return Double.valueOf(Double.parseDouble(str));
        }
        if (Intrinsics.areEqual(dVar, j1.d(Long.TYPE))) {
            return Long.valueOf(Long.parseLong(str));
        }
        if (Intrinsics.areEqual(dVar, j1.d(Short.TYPE))) {
            return Short.valueOf(Short.parseShort(str));
        }
        if (Intrinsics.areEqual(dVar, j1.d(Character.TYPE))) {
            return Character.valueOf(StringsKt.H8(str));
        }
        if (Intrinsics.areEqual(dVar, j1.d(Boolean.TYPE))) {
            return Boolean.valueOf(Boolean.parseBoolean(str));
        }
        if (Intrinsics.areEqual(dVar, j1.d(String.class))) {
            return str;
        }
        return null;
    }

    private final Void e(String str) throws d {
        throw new d("Type " + str + " is not supported in default data conversion service");
    }

    @Override // mi.a
    @NotNull
    public List<String> a(@Nullable Object obj) throws d {
        if (obj == null) {
            return CollectionsKt.emptyList();
        }
        List<String> listC = b.c(obj);
        if (listC != null) {
            return listC;
        }
        if (obj instanceof Iterable) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, f332668a.a(it.next()));
            }
            return arrayList;
        }
        kotlin.reflect.d dVarD = j1.d(obj.getClass());
        if (Intrinsics.areEqual(dVarD, j1.d(Integer.TYPE)) || Intrinsics.areEqual(dVarD, j1.d(Float.TYPE)) || Intrinsics.areEqual(dVarD, j1.d(Double.TYPE)) || Intrinsics.areEqual(dVarD, j1.d(Long.TYPE)) || Intrinsics.areEqual(dVarD, j1.d(Short.TYPE)) || Intrinsics.areEqual(dVarD, j1.d(Character.TYPE)) || Intrinsics.areEqual(dVarD, j1.d(Boolean.TYPE)) || Intrinsics.areEqual(dVarD, j1.d(String.class))) {
            return CollectionsKt.listOf(obj.toString());
        }
        throw new d("Class " + dVarD + " is not supported in default data conversion service");
    }

    @Override // mi.a
    @Nullable
    public Object b(@NotNull List<String> values, @NotNull ri.b type) throws d {
        List<KTypeProjection> listD;
        KTypeProjection kTypeProjection;
        s sVarG;
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(type, "type");
        if (values.isEmpty()) {
            return null;
        }
        if (Intrinsics.areEqual(type.b(), j1.d(List.class)) || Intrinsics.areEqual(type.b(), j1.d(List.class))) {
            s sVarA = type.a();
            g gVarJ = (sVarA == null || (listD = sVarA.d()) == null || (kTypeProjection = (KTypeProjection) CollectionsKt.single((List) listD)) == null || (sVarG = kTypeProjection.g()) == null) ? null : sVarG.J();
            kotlin.reflect.d<?> dVar = gVarJ instanceof kotlin.reflect.d ? (kotlin.reflect.d) gVarJ : null;
            if (dVar != null) {
                List<String> list = values;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(f332668a.d((String) it.next(), dVar));
                }
                return arrayList;
            }
        }
        if (values.isEmpty()) {
            throw new d("There are no values when trying to construct single value " + type);
        }
        if (values.size() <= 1) {
            return d((String) CollectionsKt.single((List) values), type.b());
        }
        throw new d("There are multiple values when trying to construct single value " + type);
    }

    @NotNull
    public final Object d(@NotNull String value, @NotNull kotlin.reflect.d<?> klass) throws d {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(klass, "klass");
        Object objC = c(klass, value);
        if (objC != null) {
            return objC;
        }
        Object objB = b.b(value, klass);
        if (objB != null) {
            return objB;
        }
        e(klass.toString());
        throw new a0();
    }
}
