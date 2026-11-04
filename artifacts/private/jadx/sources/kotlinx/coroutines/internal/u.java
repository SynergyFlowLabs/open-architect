package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nExceptionsConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/ExceptionsConstructorKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,112:1\n1#2:113\n11158#3:114\n11493#3,3:115\n12727#3,3:132\n1971#4,14:118\n*S KotlinDebug\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/ExceptionsConstructorKt\n*L\n41#1:114\n41#1:115,3\n78#1:132,3\n59#1:118,14\n*E\n"})
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f315125a = n(Throwable.class, -1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final k f315126b;

    static final class a implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f315127a = new a();

        a() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Throwable th2) {
            return null;
        }
    }

    static {
        k kVar;
        try {
            kVar = w.a() ? q1.f315118a : c.f315039a;
        } catch (Throwable unused) {
            kVar = q1.f315118a;
        }
        f315126b = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> Function1<Throwable, Throwable> g(Class<E> cls) {
        Object next;
        Function1<Throwable, Throwable> function1;
        Pair pair;
        a aVar = a.f315127a;
        if (f315125a == n(cls, 0)) {
            Constructor<?>[] constructors = cls.getConstructors();
            ArrayList arrayList = new ArrayList(constructors.length);
            int length = constructors.length;
            int i10 = 0;
            while (true) {
                next = null;
                if (i10 >= length) {
                    break;
                }
                final Constructor<?> constructor = constructors[i10];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                int length2 = parameterTypes.length;
                if (length2 == 0) {
                    pair = TuplesKt.to(o(new Function1() { // from class: kotlinx.coroutines.internal.t
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return u.k(constructor, (Throwable) obj);
                        }
                    }), 0);
                } else if (length2 == 1) {
                    Class<?> cls2 = parameterTypes[0];
                    if (Intrinsics.areEqual(cls2, String.class)) {
                        pair = TuplesKt.to(o(new Function1() { // from class: kotlinx.coroutines.internal.r
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return u.i(constructor, (Throwable) obj);
                            }
                        }), 2);
                    } else {
                        pair = Intrinsics.areEqual(cls2, Throwable.class) ? TuplesKt.to(o(new Function1() { // from class: kotlinx.coroutines.internal.s
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return u.j(constructor, (Throwable) obj);
                            }
                        }), 1) : TuplesKt.to(null, -1);
                    }
                } else if (length2 != 2) {
                    pair = TuplesKt.to(null, -1);
                } else {
                    pair = (Intrinsics.areEqual(parameterTypes[0], String.class) && Intrinsics.areEqual(parameterTypes[1], Throwable.class)) ? TuplesKt.to(o(new Function1() { // from class: kotlinx.coroutines.internal.q
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return u.h(constructor, (Throwable) obj);
                        }
                    }), 3) : TuplesKt.to(null, -1);
                }
                arrayList.add(pair);
                i10++;
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iIntValue = ((Number) ((Pair) next).getSecond()).intValue();
                    do {
                        Object next2 = it.next();
                        int iIntValue2 = ((Number) ((Pair) next2).getSecond()).intValue();
                        if (iIntValue < iIntValue2) {
                            next = next2;
                            iIntValue = iIntValue2;
                        }
                    } while (it.hasNext());
                }
            }
            Pair pair2 = (Pair) next;
            if (pair2 != null && (function1 = (Function1) pair2.getFirst()) != null) {
                return function1;
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable h(Constructor constructor, Throwable th2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(th2.getMessage(), th2);
        Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
        return (Throwable) objNewInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable i(Constructor constructor, Throwable th2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(th2.getMessage());
        Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
        Throwable th3 = (Throwable) objNewInstance;
        th3.initCause(th2);
        return th3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable j(Constructor constructor, Throwable th2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(th2);
        Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
        return (Throwable) objNewInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable k(Constructor constructor, Throwable th2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(null);
        Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
        Throwable th3 = (Throwable) objNewInstance;
        th3.initCause(th2);
        return th3;
    }

    private static final int l(Class<?> cls, int i10) {
        do {
            int i11 = 0;
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    i11++;
                }
            }
            i10 += i11;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i10;
    }

    static /* synthetic */ int m(Class cls, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return l(cls, i10);
    }

    private static final int n(Class<?> cls, int i10) {
        Object objM785constructorimpl;
        oj.b.i(cls);
        try {
            Result.a aVar = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(Integer.valueOf(m(cls, 0, 1, null)));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
        }
        Integer numValueOf = Integer.valueOf(i10);
        if (Result.m786isFailureimpl(objM785constructorimpl)) {
            objM785constructorimpl = numValueOf;
        }
        return ((Number) objM785constructorimpl).intValue();
    }

    private static final Function1<Throwable, Throwable> o(final Function1<? super Throwable, ? extends Throwable> function1) {
        return new Function1() { // from class: kotlinx.coroutines.internal.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u.p(function1, (Throwable) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable p(Function1 function1, Throwable th2) {
        Object objM785constructorimpl;
        Object obj = null;
        try {
            Result.a aVar = Result.Companion;
            Throwable th3 = (Throwable) function1.invoke(th2);
            if (!Intrinsics.areEqual(th2.getMessage(), th3.getMessage()) && !Intrinsics.areEqual(th3.getMessage(), th2.toString())) {
                th3 = null;
            }
            objM785constructorimpl = Result.m785constructorimpl(th3);
        } catch (Throwable th4) {
            Result.a aVar2 = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th4));
        }
        if (!Result.m786isFailureimpl(objM785constructorimpl)) {
            obj = objM785constructorimpl;
        }
        return (Throwable) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <E extends Throwable> E q(@NotNull E e10) {
        Object objM785constructorimpl;
        if (!(e10 instanceof kotlinx.coroutines.h0)) {
            return (E) f315126b.a(e10.getClass()).invoke(e10);
        }
        try {
            Result.a aVar = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(((kotlinx.coroutines.h0) e10).b());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m786isFailureimpl(objM785constructorimpl)) {
            objM785constructorimpl = null;
        }
        return (E) objM785constructorimpl;
    }
}
