package v2;

import androidx.lifecycle.f2;
import androidx.lifecycle.j2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class k {
    @NotNull
    public static final <VM extends f2> VM a(@NotNull j2.c factory, @NotNull kotlin.reflect.d<VM> modelClass, @NotNull a extras) {
        VM vm2;
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        try {
            try {
                return (VM) factory.a(modelClass, extras);
            } catch (AbstractMethodError unused) {
                vm2 = (VM) factory.create(oj.b.e(modelClass));
                return vm2;
            }
        } catch (AbstractMethodError unused2) {
            vm2 = (VM) factory.b(oj.b.e(modelClass), extras);
            return vm2;
        }
    }
}
