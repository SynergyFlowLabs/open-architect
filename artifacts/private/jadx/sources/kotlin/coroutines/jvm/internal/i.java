package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nDebugMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/ModuleNameRetriever\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i f312477a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final a f312478b = new a(null, null, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private static a f312479c;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oj.f
        @Nullable
        public final Method f312480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oj.f
        @Nullable
        public final Method f312481b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oj.f
        @Nullable
        public final Method f312482c;

        public a(@Nullable Method method, @Nullable Method method2, @Nullable Method method3) {
            this.f312480a = method;
            this.f312481b = method2;
            this.f312482c = method3;
        }
    }

    private i() {
    }

    private final a a(kotlin.coroutines.jvm.internal.a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", null), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            f312479c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f312478b;
            f312479c = aVar3;
            return aVar3;
        }
    }

    @Nullable
    public final String b(@NotNull kotlin.coroutines.jvm.internal.a continuation) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        a aVarA = f312479c;
        if (aVarA == null) {
            aVarA = a(continuation);
        }
        if (aVarA == f312478b) {
            return null;
        }
        Method method = aVarA.f312480a;
        Object objInvoke = method != null ? method.invoke(continuation.getClass(), null) : null;
        if (objInvoke == null) {
            return null;
        }
        Method method2 = aVarA.f312481b;
        Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, null) : null;
        if (objInvoke2 == null) {
            return null;
        }
        Method method3 = aVarA.f312482c;
        Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
        if (objInvoke3 instanceof String) {
            return (String) objInvoke3;
        }
        return null;
    }
}
