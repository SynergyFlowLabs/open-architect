package com.planner5d.library.services.utility;

import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nViewModelUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n*L\n1#1,45:1\n17#1:46\n28#1:47\n28#1:48\n28#1:49\n*S KotlinDebug\n*F\n+ 1 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n*L\n12#1:46\n12#1:47\n17#1:48\n22#1:49\n*E\n"})
public final class t3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final t3 f229751a = new t3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f229752b = 0;

    public static final class a implements Function0<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f229753a;

        public a(Fragment fragment) {
            this.f229753a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f229753a;
        }
    }

    public static final class b implements Function0<androidx.lifecycle.j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f229754a;

        public b(Fragment fragment) {
            this.f229754a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.j2.c invoke() {
            return t3.f229751a.b(this.f229754a);
        }
    }

    @SourceDebugExtension({"SMAP\nViewModelUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils$viewModelProvider$3\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n*L\n1#1,28:1\n12#2:29\n*E\n"})
    public static final class c implements Function0<androidx.lifecycle.l2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.m2 f229755a;

        public c(androidx.lifecycle.m2 m2Var) {
            this.f229755a = m2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.l2 invoke() {
            return this.f229755a.getViewModelStore();
        }
    }

    public static final class d implements Function0<androidx.lifecycle.j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f229756a = new d();

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.j2.c invoke() {
            return com.planner5d.library.application.b.f142455c.a().x0();
        }
    }

    public static final class e implements Function0<androidx.lifecycle.l2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<androidx.lifecycle.m2> f229757a;

        /* JADX WARN: Multi-variable type inference failed */
        public e(Function0<? extends androidx.lifecycle.m2> function0) {
            this.f229757a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.l2 invoke() {
            return this.f229757a.invoke().getViewModelStore();
        }
    }

    private t3() {
    }

    public static /* synthetic */ kotlin.f0 d(t3 t3Var, Fragment fragment, Function0 viewModelStoreOwnerProducer, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            viewModelStoreOwnerProducer = new a(fragment);
        }
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(viewModelStoreOwnerProducer, "viewModelStoreOwnerProducer");
        b bVar = new b(fragment);
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        return new androidx.lifecycle.i2(kotlin.jvm.internal.j1.d(androidx.lifecycle.f2.class), new e(viewModelStoreOwnerProducer), bVar, null, 8, null);
    }

    @oj.n
    @NotNull
    public static final <T extends androidx.lifecycle.f2> n3<T> e(@NotNull final androidx.lifecycle.m2 viewModelStoreOwner, @NotNull final Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return new n3<>(new Function0() { // from class: com.planner5d.library.services.utility.s3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t3.i(viewModelStoreOwner, modelClass);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.lifecycle.f2 i(androidx.lifecycle.m2 m2Var, Class cls) {
        return new androidx.lifecycle.j2(m2Var, com.planner5d.library.application.b.f142455c.a().x0()).c(cls);
    }

    @kotlin.l(message = "Replace its usages as defaultViewModelProviderFactory with some of functions above", replaceWith = @kotlin.b1(expression = "savedStateViewModelProvider", imports = {}))
    @NotNull
    public final androidx.lifecycle.j2.c b(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        return com.planner5d.library.application.b.f142455c.a().v1().c(fragment, fragment.getArguments());
    }

    public final /* synthetic */ <T extends androidx.lifecycle.f2> kotlin.f0<T> c(Fragment fragment, Function0<? extends androidx.lifecycle.m2> viewModelStoreOwnerProducer) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(viewModelStoreOwnerProducer, "viewModelStoreOwnerProducer");
        b bVar = new b(fragment);
        int i10 = 7 >> 4;
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        return new androidx.lifecycle.i2(kotlin.jvm.internal.j1.d(androidx.lifecycle.f2.class), new e(viewModelStoreOwnerProducer), bVar, null, 8, null);
    }

    public final /* synthetic */ <T extends androidx.lifecycle.f2> kotlin.f0<T> f(androidx.lifecycle.m2 m2Var) {
        Intrinsics.checkNotNullParameter(m2Var, "<this>");
        d dVar = d.f229756a;
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        return new androidx.lifecycle.i2(kotlin.jvm.internal.j1.d(androidx.lifecycle.f2.class), new c(m2Var), dVar, null, 8, null);
    }

    public final /* synthetic */ <T extends androidx.lifecycle.f2> kotlin.f0<T> g(Function0<? extends androidx.lifecycle.m2> viewModelStoreOwnerProducer) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwnerProducer, "viewModelStoreOwnerProducer");
        d dVar = d.f229756a;
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        return new androidx.lifecycle.i2(kotlin.jvm.internal.j1.d(androidx.lifecycle.f2.class), new e(viewModelStoreOwnerProducer), dVar, null, 8, null);
    }

    public final /* synthetic */ <T extends androidx.lifecycle.f2> kotlin.f0<T> h(Function0<? extends androidx.lifecycle.m2> viewModelStoreOwnerProducer, Function0<? extends androidx.lifecycle.j2.c> viewModelFactoryProducer) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwnerProducer, "viewModelStoreOwnerProducer");
        Intrinsics.checkNotNullParameter(viewModelFactoryProducer, "viewModelFactoryProducer");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        return new androidx.lifecycle.i2(kotlin.jvm.internal.j1.d(androidx.lifecycle.f2.class), new e(viewModelStoreOwnerProducer), viewModelFactoryProducer, null, 8, null);
    }
}
