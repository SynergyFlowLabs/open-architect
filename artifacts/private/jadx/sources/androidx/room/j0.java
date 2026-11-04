package androidx.room;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final b2 f74921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Set<androidx.lifecycle.w0<?>> f74922b;

    public j0(@NotNull b2 database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.f74921a = database;
        Set<androidx.lifecycle.w0<?>> setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        Intrinsics.checkNotNullExpressionValue(setNewSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f74922b = setNewSetFromMap;
    }

    @NotNull
    public final <T> androidx.lifecycle.w0<T> a(@NotNull String[] tableNames, boolean z10, @NotNull Callable<T> computeFunction) {
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        return new i2(this.f74921a, this, z10, computeFunction, tableNames);
    }

    @NotNull
    public final Set<androidx.lifecycle.w0<?>> b() {
        return this.f74922b;
    }

    public final void c(@NotNull androidx.lifecycle.w0<?> liveData) {
        Intrinsics.checkNotNullParameter(liveData, "liveData");
        this.f74922b.add(liveData);
    }

    public final void d(@NotNull androidx.lifecycle.w0<?> liveData) {
        Intrinsics.checkNotNullParameter(liveData, "liveData");
        this.f74922b.remove(liveData);
    }
}
