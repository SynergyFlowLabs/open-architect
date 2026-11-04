package androidx.lifecycle.compose;

import androidx.compose.runtime.a1;
import androidx.compose.runtime.m4;
import androidx.lifecycle.o0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nLocalLifecycleOwner.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalLifecycleOwner.android.kt\nandroidx/lifecycle/compose/LocalLifecycleOwnerKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,66:1\n12574#2,2:67\n*S KotlinDebug\n*F\n+ 1 LocalLifecycleOwner.android.kt\nandroidx/lifecycle/compose/LocalLifecycleOwnerKt\n*L\n49#1:67,2\n*E\n"})
@oj.i(name = "LocalLifecycleOwnerKt")
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final m4<o0> f52210a;

    static {
        Object objM785constructorimpl;
        m4 m4Var;
        Object obj = null;
        try {
            Result.a aVar = Result.Companion;
            ClassLoader classLoader = o0.class.getClassLoader();
            Intrinsics.checkNotNull(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof m4) {
                        m4Var = (m4) objInvoke;
                        break;
                    }
                } else if (!(annotations[i10] instanceof kotlin.l)) {
                    i10++;
                }
                m4Var = null;
                break;
            }
            objM785constructorimpl = Result.m785constructorimpl(m4Var);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
        }
        if (!Result.m786isFailureimpl(objM785constructorimpl)) {
            obj = objM785constructorimpl;
        }
        m4<o0> m4VarM = (m4) obj;
        if (m4VarM == null) {
            m4VarM = a1.m(new Function0() { // from class: androidx.lifecycle.compose.c0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d0.b();
                }
            });
        }
        f52210a = m4VarM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o0 b() {
        throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
    }

    @NotNull
    public static final m4<o0> c() {
        return f52210a;
    }

    public static /* synthetic */ void d() {
    }
}
