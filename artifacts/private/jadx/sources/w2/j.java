package w2;

import androidx.lifecycle.f2;
import androidx.lifecycle.j2;
import androidx.lifecycle.m2;
import androidx.lifecycle.z;
import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nViewModelProviders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelProviders.kt\nandroidx/lifecycle/viewmodel/internal/ViewModelProviders\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,91:1\n37#2,2:92\n1310#3,2:94\n*S KotlinDebug\n*F\n+ 1 ViewModelProviders.kt\nandroidx/lifecycle/viewmodel/internal/ViewModelProviders\n*L\n58#1:92,2\n85#1:94,2\n*E\n"})
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j f385882a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f385883b = "androidx.lifecycle.ViewModelProvider.DefaultKey";

    private j() {
    }

    @NotNull
    public final j2.c a(@NotNull Collection<? extends v2.i<?>> initializers) {
        Intrinsics.checkNotNullParameter(initializers, "initializers");
        v2.i[] iVarArr = (v2.i[]) initializers.toArray(new v2.i[0]);
        return new v2.c((v2.i[]) Arrays.copyOf(iVarArr, iVarArr.length));
    }

    @NotNull
    public final j2.c b(@NotNull v2.i<?>... initializers) {
        Intrinsics.checkNotNullParameter(initializers, "initializers");
        return new v2.c((v2.i[]) Arrays.copyOf(initializers, initializers.length));
    }

    @NotNull
    public final <VM extends f2> VM c(@NotNull kotlin.reflect.d<VM> modelClass, @NotNull v2.a extras, @NotNull v2.i<?>... initializers) {
        VM vm2;
        v2.i<?> iVar;
        Function1<v2.a, T> function1B;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(initializers, "initializers");
        int length = initializers.length;
        int i10 = 0;
        while (true) {
            vm2 = null;
            if (i10 >= length) {
                iVar = null;
                break;
            }
            iVar = initializers[i10];
            if (Intrinsics.areEqual(iVar.a(), modelClass)) {
                break;
            }
            i10++;
        }
        if (iVar != null && (function1B = iVar.b()) != 0) {
            vm2 = (VM) function1B.invoke(extras);
        }
        if (vm2 != null) {
            return vm2;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + a.a(modelClass)).toString());
    }

    @NotNull
    public final v2.a d(@NotNull m2 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        return owner instanceof z ? ((z) owner).getDefaultViewModelCreationExtras() : v2.a.b.f381327c;
    }

    @NotNull
    public final j2.c e(@NotNull m2 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        return owner instanceof z ? ((z) owner).getDefaultViewModelProviderFactory() : d.f385876b;
    }

    @NotNull
    public final <T extends f2> String f(@NotNull kotlin.reflect.d<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String strA = a.a(modelClass);
        if (strA == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + strA;
    }

    @NotNull
    public final <VM extends f2> VM g() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
