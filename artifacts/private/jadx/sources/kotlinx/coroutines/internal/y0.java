package kotlinx.coroutines.internal;

import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nStackTraceRecovery.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n1790#2,6:211\n12567#2,2:221\n1682#2,6:223\n12567#2,2:229\n1682#2,6:232\n37#3:217\n36#3,3:218\n1#4:231\n*S KotlinDebug\n*F\n+ 1 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n39#1:211,6\n127#1:221,2\n137#1:223,6\n169#1:229,2\n190#1:232,6\n102#1:217\n102#1:218,3\n*E\n"})
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f315136a = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f315137b = "kotlinx.coroutines.internal.StackTraceRecoveryKt";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final StackTraceElement f315138c = new _COROUTINE.a().a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f315139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f315140e;

    static {
        Object objM785constructorimpl;
        Object objM785constructorimpl2;
        try {
            Result.a aVar = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(kotlin.coroutines.jvm.internal.a.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.d(objM785constructorimpl) != null) {
            objM785constructorimpl = f315136a;
        }
        f315139d = (String) objM785constructorimpl;
        try {
            Result.a aVar3 = Result.Companion;
            objM785constructorimpl2 = Result.m785constructorimpl(y0.class.getCanonicalName());
        } catch (Throwable th3) {
            Result.a aVar4 = Result.Companion;
            objM785constructorimpl2 = Result.m785constructorimpl(ResultKt.createFailure(th3));
        }
        if (Result.d(objM785constructorimpl2) != null) {
            objM785constructorimpl2 = f315137b;
        }
        f315140e = (String) objM785constructorimpl2;
    }

    private static final <E extends Throwable> Pair<E, StackTraceElement[]> b(E e10) {
        Throwable cause = e10.getCause();
        if (cause == null || !Intrinsics.areEqual(cause.getClass(), e10.getClass())) {
            return TuplesKt.to(e10, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e10.getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (h(stackTraceElement)) {
                return TuplesKt.to(cause, stackTrace);
            }
        }
        return TuplesKt.to(e10, new StackTraceElement[0]);
    }

    private static final <E extends Throwable> E c(E e10, E e11, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(f315138c);
        StackTraceElement[] stackTrace = e10.getStackTrace();
        int iF = f(stackTrace, f315139d);
        int i10 = 0;
        if (iF == -1) {
            e11.setStackTrace((StackTraceElement[]) arrayDeque.toArray(new StackTraceElement[0]));
            return e11;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + iF];
        for (int i11 = 0; i11 < iF; i11++) {
            stackTraceElementArr[i11] = stackTrace[i11];
        }
        Iterator<T> it = arrayDeque.iterator();
        while (it.hasNext()) {
            stackTraceElementArr[i10 + iF] = (StackTraceElement) it.next();
            i10++;
        }
        e11.setStackTrace(stackTraceElementArr);
        return e11;
    }

    private static final ArrayDeque<StackTraceElement> d(kotlin.coroutines.jvm.internal.e eVar) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = eVar.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            eVar = eVar.getCallerFrame();
            if (eVar == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = eVar.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
    }

    private static final boolean e(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && Intrinsics.areEqual(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && Intrinsics.areEqual(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && Intrinsics.areEqual(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    private static final int f(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (Intrinsics.areEqual(str, stackTraceElementArr[i10].getClassName())) {
                return i10;
            }
        }
        return -1;
    }

    public static final void g(@NotNull Throwable th2, @NotNull Throwable th3) {
        th2.initCause(th3);
    }

    public static final boolean h(@NotNull StackTraceElement stackTraceElement) {
        return StringsKt.u2(stackTraceElement.getClassName(), _COROUTINE.b.c(), false, 2, null);
    }

    private static final void i(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            } else if (h(stackTraceElementArr[i10])) {
                break;
            } else {
                i10++;
            }
        }
        int i11 = i10 + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i11 > length2) {
            return;
        }
        while (true) {
            if (e(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i11) {
                return;
            } else {
                length2--;
            }
        }
    }

    @Nullable
    public static final Object j(@NotNull Throwable th2, @NotNull kotlin.coroutines.d<?> dVar) throws Throwable {
        throw th2;
    }

    private static final Object k(Throwable th2, kotlin.coroutines.d<?> dVar) throws Throwable {
        throw th2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> E l(E e10, kotlin.coroutines.jvm.internal.e eVar) {
        Pair pairB = b(e10);
        Throwable th2 = (Throwable) pairB.component1();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) pairB.component2();
        Throwable thQ = u.q(th2);
        if (thQ != null) {
            ArrayDeque<StackTraceElement> arrayDequeD = d(eVar);
            if (!arrayDequeD.isEmpty()) {
                if (th2 != e10) {
                    i(stackTraceElementArr, arrayDequeD);
                }
                return (E) c(th2, thQ, arrayDequeD);
            }
        }
        return e10;
    }

    @NotNull
    public static final <E extends Throwable> E m(@NotNull E e10) {
        return e10;
    }

    @NotNull
    public static final <E extends Throwable> E n(@NotNull E e10, @NotNull kotlin.coroutines.d<?> dVar) {
        return e10;
    }

    private static final <E extends Throwable> E o(E e10) {
        StackTraceElement[] stackTrace = e10.getStackTrace();
        int length = stackTrace.length;
        int length2 = stackTrace.length - 1;
        if (length2 < 0) {
            length2 = -1;
            break;
        }
        while (true) {
            int i10 = length2 - 1;
            if (Intrinsics.areEqual(f315140e, stackTrace[length2].getClassName())) {
                break;
            }
            if (i10 < 0) {
                length2 = -1;
                break;
            }
            length2 = i10;
        }
        int i11 = length2 + 1;
        int iF = f(stackTrace, f315139d);
        int i12 = 0;
        int i13 = (length - length2) - (iF == -1 ? 0 : length - iF);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i13];
        while (i12 < i13) {
            stackTraceElementArr[i12] = i12 == 0 ? f315138c : stackTrace[(i11 + i12) - 1];
            i12++;
        }
        e10.setStackTrace(stackTraceElementArr);
        return e10;
    }

    @kotlin.a1
    @NotNull
    public static final <E extends Throwable> E p(@NotNull E e10) {
        return e10;
    }

    @kotlin.a1
    @NotNull
    public static final <E extends Throwable> E q(@NotNull E e10) {
        E e11 = (E) e10.getCause();
        if (e11 != null && Intrinsics.areEqual(e11.getClass(), e10.getClass())) {
            for (StackTraceElement stackTraceElement : e10.getStackTrace()) {
                if (h(stackTraceElement)) {
                    return e11;
                }
            }
        }
        return e10;
    }
}
