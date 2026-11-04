package com.planner5d.library.services.utility;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@fg.j
@SourceDebugExtension({"SMAP\nInjectingSavedStateViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InjectingSavedStateViewModelFactory.kt\ncom/planner5d/library/services/utility/InjectingSavedStateViewModelFactory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,61:1\n295#2,2:62\n295#2,2:64\n*S KotlinDebug\n*F\n+ 1 InjectingSavedStateViewModelFactory.kt\ncom/planner5d/library/services/utility/InjectingSavedStateViewModelFactory\n*L\n46#1:62,2\n56#1:64,2\n*E\n"})
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<Class<? extends androidx.lifecycle.f2>, f<? extends androidx.lifecycle.f2>> f225247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<Class<? extends androidx.lifecycle.f2>, ij.c<androidx.lifecycle.f2>> f225248b;

    public static final class a extends androidx.lifecycle.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ g1 f225249e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.savedstate.m mVar, Bundle bundle, g1 g1Var) {
            super(mVar, bundle);
            this.f225249e = g1Var;
        }

        @Override // androidx.lifecycle.a
        protected <T extends androidx.lifecycle.f2> T f(String key, Class<T> modelClass, androidx.lifecycle.l1 handle) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(handle, "handle");
            T t10 = (T) this.f225249e.e(modelClass, handle);
            if (t10 != null) {
                return t10;
            }
            T t11 = (T) this.f225249e.f(modelClass);
            if (t11 != null) {
                return t11;
            }
            throw new IllegalArgumentException("Unknown model class " + modelClass);
        }
    }

    @ij.a
    public g1(@NotNull Map<Class<? extends androidx.lifecycle.f2>, f<? extends androidx.lifecycle.f2>> assistedFactories, @NotNull Map<Class<? extends androidx.lifecycle.f2>, ij.c<androidx.lifecycle.f2>> viewModelProviders) {
        Intrinsics.checkNotNullParameter(assistedFactories, "assistedFactories");
        Intrinsics.checkNotNullParameter(viewModelProviders, "viewModelProviders");
        this.f225247a = assistedFactories;
        this.f225248b = viewModelProviders;
    }

    public static /* synthetic */ androidx.lifecycle.a d(g1 g1Var, androidx.savedstate.m mVar, Bundle bundle, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bundle = null;
        }
        return g1Var.c(mVar, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends androidx.lifecycle.f2> androidx.lifecycle.f2 e(Class<T> cls, androidx.lifecycle.l1 l1Var) {
        Object next;
        f<? extends androidx.lifecycle.f2> fVar = this.f225247a.get(cls);
        if (fVar == null) {
            Iterator<T> it = this.f225247a.entrySet().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!cls.isAssignableFrom((Class) ((Map.Entry) next).getKey()));
            Map.Entry entry = (Map.Entry) next;
            fVar = entry != null ? (f) entry.getValue() : null;
            if (fVar == null) {
                return null;
            }
        }
        return fVar.a(l1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends androidx.lifecycle.f2> androidx.lifecycle.f2 f(Class<T> cls) {
        Object next;
        ij.c<androidx.lifecycle.f2> cVar = this.f225248b.get(cls);
        if (cVar == null) {
            Iterator<T> it = this.f225248b.entrySet().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!cls.isAssignableFrom((Class) ((Map.Entry) next).getKey()));
            Map.Entry entry = (Map.Entry) next;
            cVar = entry != null ? (ij.c) entry.getValue() : null;
            if (cVar == null) {
                return null;
            }
        }
        return cVar.get();
    }

    @NotNull
    public final androidx.lifecycle.a c(@NotNull androidx.savedstate.m owner, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        return new a(owner, bundle, this);
    }
}
