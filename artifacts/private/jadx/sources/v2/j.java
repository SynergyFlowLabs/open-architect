package v2;

import androidx.lifecycle.f2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nViewModelProviderImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelProviderImpl.kt\nandroidx/lifecycle/viewmodel/ViewModelProviderImpl\n+ 2 SynchronizedObject.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObjectKt\n+ 3 SynchronizedObject.jvm.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObject_jvmKt\n*L\n1#1,85:1\n38#2:86\n23#3:87\n*S KotlinDebug\n*F\n+ 1 ViewModelProviderImpl.kt\nandroidx/lifecycle/viewmodel/ViewModelProviderImpl\n*L\n48#1:86\n48#1:87\n*E\n"})
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final l2 f381333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final j2.c f381334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final a f381335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final w2.f f381336d;

    public j(@NotNull l2 store, @NotNull j2.c factory, @NotNull a defaultExtras) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultExtras, "defaultExtras");
        this.f381333a = store;
        this.f381334b = factory;
        this.f381335c = defaultExtras;
        this.f381336d = new w2.f();
    }

    public static /* synthetic */ f2 e(j jVar, kotlin.reflect.d dVar, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = w2.j.f385882a.f(dVar);
        }
        return jVar.d(dVar, str);
    }

    @NotNull
    public final <T extends f2> T d(@NotNull kotlin.reflect.d<T> modelClass, @NotNull String key) {
        T t10;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.f381336d) {
            try {
                t10 = (T) this.f381333a.b(key);
                if (modelClass.K(t10)) {
                    if (this.f381334b instanceof j2.e) {
                        j2.e eVar = (j2.e) this.f381334b;
                        Intrinsics.checkNotNull(t10);
                        eVar.d(t10);
                    }
                    Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
                } else {
                    f fVar = new f(this.f381335c);
                    fVar.c(j2.f52402c, key);
                    t10 = (T) k.a(this.f381334b, modelClass, fVar);
                    this.f381333a.d(key, t10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }
}
