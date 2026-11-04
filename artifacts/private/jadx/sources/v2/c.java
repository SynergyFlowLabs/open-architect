package v2;

import androidx.lifecycle.f2;
import androidx.lifecycle.j2;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements j2.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final i<?>[] f381328b;

    public c(@NotNull i<?>... initializers) {
        Intrinsics.checkNotNullParameter(initializers, "initializers");
        this.f381328b = initializers;
    }

    @Override // androidx.lifecycle.j2.c
    @NotNull
    public <VM extends f2> VM b(@NotNull Class<VM> modelClass, @NotNull a extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        w2.j jVar = w2.j.f385882a;
        kotlin.reflect.d<VM> dVarI = oj.b.i(modelClass);
        i<?>[] iVarArr = this.f381328b;
        return (VM) jVar.c(dVarI, extras, (i[]) Arrays.copyOf(iVarArr, iVarArr.length));
    }
}
