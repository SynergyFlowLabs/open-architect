package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModel.kt\nandroidx/lifecycle/ViewModelKt\n+ 2 SynchronizedObject.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObjectKt\n+ 3 SynchronizedObject.jvm.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObject_jvmKt\n*L\n1#1,233:1\n38#2:234\n23#3:235\n*S KotlinDebug\n*F\n+ 1 ViewModel.kt\nandroidx/lifecycle/ViewModelKt\n*L\n225#1:234\n225#1:235\n*E\n"})
public final class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final w2.f f52356a = new w2.f();

    @NotNull
    public static final kotlinx.coroutines.s0 a(@NotNull f2 f2Var) {
        w2.b bVarB;
        Intrinsics.checkNotNullParameter(f2Var, "<this>");
        synchronized (f52356a) {
            try {
                bVarB = (w2.b) f2Var.getCloseable(w2.c.f385875a);
                if (bVarB == null) {
                    bVarB = w2.c.b();
                    f2Var.addCloseable(w2.c.f385875a, bVarB);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVarB;
    }
}
