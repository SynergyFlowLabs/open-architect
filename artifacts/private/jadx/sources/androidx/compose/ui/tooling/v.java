package androidx.compose.ui.tooling;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nPreviewUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewUtils.android.kt\nandroidx/compose/ui/tooling/PreviewUtils_androidKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,160:1\n3170#2,11:161\n12574#2,2:179\n1137#2,2:181\n1#3:172\n1557#4:173\n1628#4,3:174\n37#5,2:177\n*S KotlinDebug\n*F\n+ 1 PreviewUtils.android.kt\nandroidx/compose/ui/tooling/PreviewUtils_androidKt\n*L\n50#1:161,11\n86#1:179,2\n89#1:181,2\n60#1:173\n60#1:174,3\n61#1:177,2\n*E\n"})
public final class v {
    @Nullable
    public static final Class<? extends d1.h<?>> a(@NotNull String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e10) {
            t.f42641a.a("Unable to find PreviewProvider '" + str + '\'', e10);
            return null;
        }
    }

    @NotNull
    public static final List<androidx.compose.ui.tooling.data.e> b(@NotNull androidx.compose.ui.tooling.data.e eVar, @NotNull Function1<? super androidx.compose.ui.tooling.data.e, Boolean> function1) {
        return d(eVar, function1, false, 4, null);
    }

    private static final List<androidx.compose.ui.tooling.data.e> c(androidx.compose.ui.tooling.data.e eVar, Function1<? super androidx.compose.ui.tooling.data.e, Boolean> function1, boolean z10) {
        ArrayList arrayList = new ArrayList();
        List listMutableListOf = CollectionsKt.mutableListOf(eVar);
        while (!listMutableListOf.isEmpty()) {
            androidx.compose.ui.tooling.data.e eVar2 = (androidx.compose.ui.tooling.data.e) CollectionsKt.removeLast(listMutableListOf);
            if (function1.invoke(eVar2).booleanValue()) {
                if (z10) {
                    return CollectionsKt.listOf(eVar2);
                }
                arrayList.add(eVar2);
            }
            listMutableListOf.addAll(eVar2.b());
        }
        return arrayList;
    }

    static /* synthetic */ List d(androidx.compose.ui.tooling.data.e eVar, Function1 function1, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return c(eVar, function1, z10);
    }

    @Nullable
    public static final androidx.compose.ui.tooling.data.e e(@NotNull androidx.compose.ui.tooling.data.e eVar, @NotNull Function1<? super androidx.compose.ui.tooling.data.e, Boolean> function1) {
        return (androidx.compose.ui.tooling.data.e) CollectionsKt.firstOrNull((List) c(eVar, function1, true));
    }

    @NotNull
    public static final Object[] f(@Nullable Class<? extends d1.h<?>> cls, int i10) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        if (cls == null) {
            return new Object[0];
        }
        try {
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            int i11 = 0;
            boolean z10 = false;
            Constructor<?> constructor = null;
            while (true) {
                if (i11 >= length) {
                    if (z10) {
                        break;
                    }
                } else {
                    Constructor<?> constructor2 = constructors[i11];
                    if (constructor2.getParameterTypes().length == 0) {
                        if (!z10) {
                            z10 = true;
                            constructor = constructor2;
                        }
                    }
                    i11++;
                }
                constructor = null;
                break;
            }
            if (constructor == null) {
                throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
            }
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(null);
            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type androidx.compose.ui.tooling.preview.PreviewParameterProvider<*>");
            d1.h hVar = (d1.h) objNewInstance;
            if (i10 < 0) {
                return g(hVar.O1(), hVar.getCount());
            }
            List listListOf = CollectionsKt.listOf(kotlin.sequences.o.m0(hVar.O1(), i10));
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
            Iterator it = listListOf.iterator();
            while (it.hasNext()) {
                arrayList.add(h(it.next()));
            }
            return arrayList.toArray(new Object[0]);
        } catch (oj.r unused) {
            throw new IllegalStateException("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
        }
    }

    private static final Object[] g(Sequence<? extends Object> sequence, int i10) {
        Iterator<? extends Object> it = sequence.iterator();
        Object[] objArr = new Object[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = it.next();
        }
        return objArr;
    }

    private static final Object h(Object obj) throws NoSuchFieldException {
        if (obj != null) {
            for (Annotation annotation : obj.getClass().getAnnotations()) {
                if (annotation instanceof oj.g) {
                    for (Field field : obj.getClass().getDeclaredFields()) {
                        if (field.getType().isPrimitive()) {
                            Field declaredField = obj.getClass().getDeclaredField(field.getName());
                            declaredField.setAccessible(true);
                            return declaredField.get(obj);
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            }
        }
        return obj;
    }
}
