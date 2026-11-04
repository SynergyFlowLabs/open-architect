package com.planner5d.library.model.manager;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@ij.f
public final class w0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f222364d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.builtin.n> f222365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.services.bitmaploader.d> f222366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<a> f222367c;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final String f222368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f222369b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f222370c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private final com.planner5d.library.services.bitmaploader.target.a f222371d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f222372e;

        public a(@Nullable String str, int i10, int i11, @Nullable com.planner5d.library.services.bitmaploader.target.a aVar, long j10) {
            this.f222368a = str;
            this.f222369b = i10;
            this.f222370c = i11;
            this.f222371d = aVar;
            this.f222372e = j10;
        }

        public final long a() {
            return this.f222372e;
        }

        public final int b() {
            return this.f222370c;
        }

        @Nullable
        public final String c() {
            return this.f222368a;
        }

        @Nullable
        public final com.planner5d.library.services.bitmaploader.target.a d() {
            return this.f222371d;
        }

        public final int e() {
            return this.f222369b;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.ImageDataManager$getFromDataManager$2", f = "ImageDataManager.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f222373a;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return w0.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f222373a;
            if (i10 == 0) {
                ResultKt.m(obj);
                w0 w0Var = w0.this;
                this.f222373a = 1;
                if (w0Var.f(this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.ImageDataManager$loadNext$2", f = "ImageDataManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nImageDataManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageDataManager.kt\ncom/planner5d/library/model/manager/ImageDataManager$loadNext$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f222375a;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return w0.this.new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f222375a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            while (true) {
                w0 w0Var = w0.this;
                List list = w0Var.f222367c;
                w0 w0Var2 = w0.this;
                synchronized (list) {
                    try {
                        aVar = (a) CollectionsKt.removeLastOrNull(w0Var2.f222367c);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (aVar == null) {
                    return Unit.f312394a;
                }
                w0Var.e(aVar);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public w0(@NotNull fg.e<com.planner5d.library.model.manager.builtin.n> dataManager, @NotNull fg.e<com.planner5d.library.services.bitmaploader.d> bitmapLoader) {
        Intrinsics.checkNotNullParameter(dataManager, "dataManager");
        Intrinsics.checkNotNullParameter(bitmapLoader, "bitmapLoader");
        this.f222365a = dataManager;
        this.f222366b = bitmapLoader;
        this.f222367c = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(a aVar) {
        Pair<Integer, String> pairL = this.f222365a.get().l(aVar.c());
        Intrinsics.checkNotNullExpressionValue(pairL, "getImageLoadingInfo(...)");
        com.planner5d.library.services.bitmaploader.d dVar = this.f222366b.get();
        Object first = pairL.first;
        Intrinsics.checkNotNullExpressionValue(first, "first");
        dVar.q(((Number) first).intValue(), (String) pairL.second, aVar.e(), aVar.b(), aVar.d(), aVar.a(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f(kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.c(), new c(null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    public final void d(@Nullable String str, int i10, int i11, @Nullable com.planner5d.library.services.bitmaploader.target.a aVar, long j10) {
        synchronized (this.f222367c) {
            this.f222367c.add(new a(str, i10, i11, aVar, j10));
        }
        kotlinx.coroutines.k.f(kotlinx.coroutines.f2.f314023a, null, null, new b(null), 3, null);
    }
}
