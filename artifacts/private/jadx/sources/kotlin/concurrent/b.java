package kotlin.concurrent;

import kotlin.Unit;
import kotlin.internal.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oj.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nThread.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Thread.kt\nkotlin/concurrent/ThreadsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
@i(name = "ThreadsKt")
public final class b {

    public static final class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f312435a;

        a(Function0<Unit> function0) {
            this.f312435a = function0;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f312435a.invoke();
        }
    }

    @f
    private static final <T> T a(ThreadLocal<T> threadLocal, Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(threadLocal, "<this>");
        Intrinsics.checkNotNullParameter(function0, "default");
        T t10 = threadLocal.get();
        if (t10 != null) {
            return t10;
        }
        T tInvoke = function0.invoke();
        threadLocal.set(tInvoke);
        return tInvoke;
    }

    @NotNull
    public static final Thread b(boolean z10, boolean z11, @Nullable ClassLoader classLoader, @Nullable String str, int i10, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        a aVar = new a(block);
        if (z11) {
            aVar.setDaemon(true);
        }
        if (i10 > 0) {
            aVar.setPriority(i10);
        }
        if (str != null) {
            aVar.setName(str);
        }
        if (classLoader != null) {
            aVar.setContextClassLoader(classLoader);
        }
        if (z10) {
            aVar.start();
        }
        return aVar;
    }

    public static /* synthetic */ Thread c(boolean z10, boolean z11, ClassLoader classLoader, String str, int i10, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            classLoader = null;
        }
        if ((i11 & 8) != 0) {
            str = null;
        }
        if ((i11 & 16) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        String str2 = str;
        return b(z10, z11, classLoader, str2, i12, function0);
    }
}
