package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class t1 extends j2.e implements j2.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Application f52514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final j2.c f52515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Bundle f52516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private c0 f52517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private androidx.savedstate.j f52518f;

    public t1() {
        this.f52515c = new j2.a();
    }

    @Override // androidx.lifecycle.j2.c
    @NotNull
    public <T extends f2> T a(@NotNull kotlin.reflect.d<T> modelClass, @NotNull v2.a extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return (T) b(oj.b.e(modelClass), extras);
    }

    @Override // androidx.lifecycle.j2.c
    @NotNull
    public <T extends f2> T b(@NotNull Class<T> modelClass, @NotNull v2.a extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.a(j2.f52402c);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.a(o1.f52458c) == null || extras.a(o1.f52459d) == null) {
            if (this.f52517e != null) {
                return (T) e(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(j2.a.f52406h);
        boolean zIsAssignableFrom = b.class.isAssignableFrom(modelClass);
        Constructor constructorC = (!zIsAssignableFrom || application == null) ? u1.c(modelClass, u1.f52530b) : u1.c(modelClass, u1.f52529a);
        if (constructorC == null) {
            return (T) this.f52515c.b(modelClass, extras);
        }
        return (!zIsAssignableFrom || application == null) ? (T) u1.d(modelClass, constructorC, o1.b(extras)) : (T) u1.d(modelClass, constructorC, application, o1.b(extras));
    }

    @Override // androidx.lifecycle.j2.c
    @NotNull
    public <T extends f2> T create(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) e(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.j2.e
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public void d(@NotNull f2 viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        if (this.f52517e != null) {
            androidx.savedstate.j jVar = this.f52518f;
            Intrinsics.checkNotNull(jVar);
            c0 c0Var = this.f52517e;
            Intrinsics.checkNotNull(c0Var);
            a0.a(viewModel, jVar, c0Var);
        }
    }

    @NotNull
    public final <T extends f2> T e(@NotNull String key, @NotNull Class<T> modelClass) {
        T t10;
        Application application;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        c0 c0Var = this.f52517e;
        if (c0Var == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = b.class.isAssignableFrom(modelClass);
        Constructor constructorC = (!zIsAssignableFrom || this.f52514b == null) ? u1.c(modelClass, u1.f52530b) : u1.c(modelClass, u1.f52529a);
        if (constructorC == null) {
            return this.f52514b != null ? (T) this.f52515c.create(modelClass) : (T) j2.d.f52410b.a().create(modelClass);
        }
        androidx.savedstate.j jVar = this.f52518f;
        Intrinsics.checkNotNull(jVar);
        n1 n1VarB = a0.b(jVar, c0Var, key, this.f52516d);
        if (!zIsAssignableFrom || (application = this.f52514b) == null) {
            t10 = (T) u1.d(modelClass, constructorC, n1VarB.b());
        } else {
            Intrinsics.checkNotNull(application);
            t10 = (T) u1.d(modelClass, constructorC, application, n1VarB.b());
        }
        t10.addCloseable(a0.f52156b, n1VarB);
        return t10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t1(@Nullable Application application, @NotNull androidx.savedstate.m owner) {
        this(application, owner, null);
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    @e.a({"LambdaLast"})
    public t1(@Nullable Application application, @NotNull androidx.savedstate.m owner, @Nullable Bundle bundle) {
        j2.a aVar;
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f52518f = owner.getSavedStateRegistry();
        this.f52517e = owner.getLifecycle();
        this.f52516d = bundle;
        this.f52514b = application;
        if (application != null) {
            aVar = j2.a.f52404f.a(application);
        } else {
            aVar = new j2.a();
        }
        this.f52515c = aVar;
    }
}
