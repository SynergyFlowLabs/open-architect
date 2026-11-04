package androidx.navigation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavControllerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavControllerViewModel.kt\nandroidx/navigation/NavControllerViewModelKt\n+ 2 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n*L\n1#1,81:1\n32#2:82\n69#2,2:83\n*S KotlinDebug\n*F\n+ 1 NavControllerViewModel.kt\nandroidx/navigation/NavControllerViewModelKt\n*L\n78#1:82\n79#1:83,2\n*E\n"})
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.lifecycle.j2.c f70907a;

    static {
        v2.d dVar = new v2.d();
        dVar.a(kotlin.jvm.internal.j1.d(c1.class), new Function1() { // from class: androidx.navigation.d1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e1.b((v2.a) obj);
            }
        });
        f70907a = dVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c1 b(v2.a initializer) {
        Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
        return new c1();
    }
}
