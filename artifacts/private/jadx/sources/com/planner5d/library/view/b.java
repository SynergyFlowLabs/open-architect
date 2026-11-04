package com.planner5d.library.view;

import androidx.lifecycle.f2;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import androidx.lifecycle.m2;
import java.util.Map;
import kotlin.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b implements j2.c {

    public static final class a implements Function0<l2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<m2> f244848a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function0<? extends m2> function0) {
            this.f244848a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return this.f244848a.invoke().getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.view.b$b, reason: collision with other inner class name */
    public static final class C1718b implements Function0<j2.c> {
        public C1718b() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return b.this;
        }
    }

    @Override // androidx.lifecycle.j2.c
    @NotNull
    public <T extends f2> T create(@NotNull Class<T> modelClass) {
        T t10;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        ij.c<f2> cVar = d().get(modelClass);
        if (cVar == null || (t10 = (T) cVar.get()) == null) {
            throw new RuntimeException("Could not find the view model: " + modelClass.getName());
        }
        if (modelClass.isAssignableFrom(t10.getClass())) {
            return t10;
        }
        throw new RuntimeException("The view model provider has the incorrect type " + t10.getClass().getName() + " while " + modelClass.getName() + " is needed");
    }

    @NotNull
    public abstract Map<Class<? extends f2>, ij.c<f2>> d();

    public final /* synthetic */ <T extends f2> f0<T> e(Function0<? extends m2> viewModelStoreOwnerProducer) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwnerProducer, "viewModelStoreOwnerProducer");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        return new i2(j1.d(f2.class), new a(viewModelStoreOwnerProducer), new C1718b(), null, 8, null);
    }
}
