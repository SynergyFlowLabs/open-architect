package androidx.lifecycle;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.l(message = "Use `viewModelFactory` or implement `ViewModelProvider.Factory`, combined with `CreationExtras.createSavedStateHandle()`.")
public abstract class a extends j2.e implements j2.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private androidx.savedstate.j f52152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private c0 f52153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Bundle f52154d;

    public a() {
    }

    private final <T extends f2> T e(String str, Class<T> cls) {
        androidx.savedstate.j jVar = this.f52152b;
        Intrinsics.checkNotNull(jVar);
        c0 c0Var = this.f52153c;
        Intrinsics.checkNotNull(c0Var);
        n1 n1VarB = a0.b(jVar, c0Var, str, this.f52154d);
        T t10 = (T) f(str, cls, n1VarB.b());
        t10.addCloseable(a0.f52156b, n1VarB);
        return t10;
    }

    @Override // androidx.lifecycle.j2.c
    @NotNull
    public <T extends f2> T b(@NotNull Class<T> modelClass, @NotNull v2.a extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.a(j2.d.f52412d);
        if (str != null) {
            return this.f52152b != null ? (T) e(str, modelClass) : (T) f(str, modelClass, o1.b(extras));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.j2.c
    @NotNull
    public <T extends f2> T create(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        if (this.f52153c != null) {
            return (T) e(canonicalName, modelClass);
        }
        throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.j2.e
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public void d(@NotNull f2 viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        androidx.savedstate.j jVar = this.f52152b;
        if (jVar != null) {
            Intrinsics.checkNotNull(jVar);
            c0 c0Var = this.f52153c;
            Intrinsics.checkNotNull(c0Var);
            a0.a(viewModel, jVar, c0Var);
        }
    }

    @NotNull
    protected abstract <T extends f2> T f(@NotNull String str, @NotNull Class<T> cls, @NotNull l1 l1Var);

    public a(@NotNull androidx.savedstate.m owner, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f52152b = owner.getSavedStateRegistry();
        this.f52153c = owner.getLifecycle();
        this.f52154d = bundle;
    }
}
