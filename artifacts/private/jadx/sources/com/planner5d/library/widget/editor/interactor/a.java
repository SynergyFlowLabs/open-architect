package com.planner5d.library.widget.editor.interactor;

import android.app.Activity;
import android.graphics.Bitmap;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.project.d0;
import com.planner5d.library.model.manager.synchronization.i;
import com.planner5d.library.services.utility.c0;
import com.planner5d.library.services.utility.h2;
import com.planner5d.library.services.utility.t;
import com.planner5d.library.widget.editor.facade.h;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class a implements cf.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f256889d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final i f256890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final d0 f256891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final t f256892c;

    /* JADX INFO: renamed from: com.planner5d.library.widget.editor.interactor.a$a, reason: collision with other inner class name */
    @w0(parameters = 0)
    public static final class C1733a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f256893d = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final byte[] f256894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final vd.a f256895b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f256896c;

        public C1733a(@NotNull byte[] projectData, @NotNull vd.a renderCamera, @NotNull String previewKey) {
            Intrinsics.checkNotNullParameter(projectData, "projectData");
            Intrinsics.checkNotNullParameter(renderCamera, "renderCamera");
            Intrinsics.checkNotNullParameter(previewKey, "previewKey");
            this.f256894a = projectData;
            this.f256895b = renderCamera;
            this.f256896c = previewKey;
        }

        @NotNull
        public final String a() {
            return this.f256896c;
        }

        @NotNull
        public final byte[] b() {
            return this.f256894a;
        }

        @NotNull
        public final vd.a c() {
            return this.f256895b;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.interactor.PrepareSnapshotPreliminaryDataInteractor", f = "PrepareSnapshotPreliminaryDataInteractor.kt", i = {}, l = {35}, m = "prepareSnapshotPreliminaryData-0E7RQCE", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f256897a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f256899c;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f256897a = obj;
            this.f256899c |= Integer.MIN_VALUE;
            Object objA = a.this.a(null, null, this);
            return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Result.a(objA);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.interactor.PrepareSnapshotPreliminaryDataInteractor$prepareSnapshotPreliminaryData$2", f = "PrepareSnapshotPreliminaryDataInteractor.kt", i = {1, 1, 2, 2}, l = {37, 44, 49}, m = "invokeSuspend", n = {"projectData", "renderCamera", "projectData", "renderCamera"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class c extends o implements Function2<s0, kotlin.coroutines.d<? super Result<? extends C1733a>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f256900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f256901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f256902c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ h f256904e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.widget.editor.facade.e f256905f;

        /* JADX INFO: renamed from: com.planner5d.library.widget.editor.interactor.a$c$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.interactor.PrepareSnapshotPreliminaryDataInteractor$prepareSnapshotPreliminaryData$2$previewKey$1", f = "PrepareSnapshotPreliminaryDataInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C1734a extends o implements Function2<s0, kotlin.coroutines.d<? super String>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f256906a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Activity f256907b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bitmap f256908c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1734a(Activity activity, Bitmap bitmap, kotlin.coroutines.d<? super C1734a> dVar) {
                super(2, dVar);
                this.f256907b = activity;
                this.f256908c = bitmap;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1734a(this.f256907b, this.f256908c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f256906a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return td.a.f380845a.s(this.f256907b, this.f256908c);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super String> dVar) {
                return ((C1734a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(h hVar, com.planner5d.library.widget.editor.facade.e eVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f256904e = hVar;
            this.f256905f = eVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Observable n(com.planner5d.library.widget.editor.a aVar, Void r10) {
            return aVar.o();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Observable s(Function1 function1, Object obj) {
            return (Observable) function1.invoke(obj);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new c(this.f256904e, this.f256905f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, kotlin.coroutines.d<? super Result<? extends C1733a>> dVar) {
            return invoke2(s0Var, (kotlin.coroutines.d<? super Result<C1733a>>) dVar);
        }

        /* JADX WARN: Code duplicated, block: B:35:0x00e7 A[Catch: all -> 0x0163, TryCatch #0 {all -> 0x0163, blocks: (B:9:0x001d, B:42:0x0138, B:14:0x0036, B:33:0x00e3, B:35:0x00e7, B:37:0x00fe, B:15:0x0040, B:21:0x006d, B:23:0x0071, B:25:0x0087, B:27:0x0098, B:30:0x00a1, B:43:0x0148, B:18:0x0047), top: B:53:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:37:0x00fe A[Catch: all -> 0x0163, TryCatch #0 {all -> 0x0163, blocks: (B:9:0x001d, B:42:0x0138, B:14:0x0036, B:33:0x00e3, B:35:0x00e7, B:37:0x00fe, B:15:0x0040, B:21:0x006d, B:23:0x0071, B:25:0x0087, B:27:0x0098, B:30:0x00a1, B:43:0x0148, B:18:0x0047), top: B:53:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:41:0x0131  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objM785constructorimpl;
            byte[] bArr;
            vd.a renderCamera;
            Object objL;
            Bitmap bitmap;
            Object objH;
            byte[] bArr2;
            vd.a aVar;
            Object objL2 = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f256902c;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    c0 c0Var = c0.f225068a;
                    Observable<byte[]> observableL0 = a.this.f256891b.l0(this.f256904e.getItem());
                    Intrinsics.checkNotNullExpressionValue(observableL0, "itemProjectToData(...)");
                    this.f256902c = 1;
                    obj = c0Var.l(observableL0, this);
                    if (obj == objL2) {
                    }
                    return objL2;
                }
                if (i10 == 1) {
                    ResultKt.m(obj);
                } else {
                    if (i10 == 2) {
                        vd.a aVar2 = (vd.a) this.f256901b;
                        byte[] bArr3 = (byte[]) this.f256900a;
                        ResultKt.m(obj);
                        renderCamera = aVar2;
                        objL = obj;
                        bArr = bArr3;
                        bitmap = (Bitmap) objL;
                        if (bitmap == null) {
                            Result.a aVar3 = Result.Companion;
                            return Result.a(Result.m785constructorimpl(ResultKt.createFailure(new IllegalStateException("Could not render preview"))));
                        }
                        a.this.f(this.f256904e);
                        Activity activityA = h2.a(this.f256905f.a());
                        n0 n0VarH = a.this.f256892c.h();
                        C1734a c1734a = new C1734a(activityA, bitmap, null);
                        this.f256900a = bArr;
                        this.f256901b = renderCamera;
                        this.f256902c = 3;
                        objH = kotlinx.coroutines.i.h(n0VarH, c1734a, this);
                        if (objH != objL2) {
                            byte[] bArr4 = bArr;
                            obj = objH;
                            bArr2 = bArr4;
                            aVar = renderCamera;
                        }
                        return objL2;
                    }
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (vd.a) this.f256901b;
                    bArr2 = (byte[]) this.f256900a;
                    ResultKt.m(obj);
                }
                Result.a aVar4 = Result.Companion;
                objM785constructorimpl = Result.m785constructorimpl(new C1733a(bArr2, aVar, (String) obj));
                return Result.a(objM785constructorimpl);
                bArr = (byte[]) obj;
                if (bArr == null) {
                    Result.a aVar5 = Result.Companion;
                    return Result.a(Result.m785constructorimpl(ResultKt.createFailure(new IllegalStateException("Could not prepare project data"))));
                }
                a.this.f(this.f256904e);
                final com.planner5d.library.widget.editor.a aVarB = this.f256904e.b();
                if (aVarB != null && (renderCamera = aVarB.getRenderCamera()) != null) {
                    a.this.f(this.f256904e);
                    c0 c0Var2 = c0.f225068a;
                    Observable<Void> observableR = a.this.f256890a.r(this.f256904e.getModel());
                    final Function1 function1 = new Function1() { // from class: com.planner5d.library.widget.editor.interactor.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return a.c.n(aVarB, (Void) obj2);
                        }
                    };
                    Object objFlatMap = observableR.flatMap(new Func1() { // from class: com.planner5d.library.widget.editor.interactor.c
                        @Override // rx.functions.Func1
                        public final Object call(Object obj2) {
                            return a.c.s(function1, obj2);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(objFlatMap, "flatMap(...)");
                    this.f256900a = bArr;
                    this.f256901b = renderCamera;
                    this.f256902c = 2;
                    objL = c0Var2.l(objFlatMap, this);
                    if (objL != objL2) {
                        bitmap = (Bitmap) objL;
                        if (bitmap == null) {
                            Result.a aVar6 = Result.Companion;
                            return Result.a(Result.m785constructorimpl(ResultKt.createFailure(new IllegalStateException("Could not render preview"))));
                        }
                        a.this.f(this.f256904e);
                        Activity activityA2 = h2.a(this.f256905f.a());
                        n0 n0VarH2 = a.this.f256892c.h();
                        C1734a c1734a2 = new C1734a(activityA2, bitmap, null);
                        this.f256900a = bArr;
                        this.f256901b = renderCamera;
                        this.f256902c = 3;
                        objH = kotlinx.coroutines.i.h(n0VarH2, c1734a2, this);
                        if (objH != objL2) {
                            byte[] bArr5 = bArr;
                            obj = objH;
                            bArr2 = bArr5;
                            aVar = renderCamera;
                            Result.a aVar7 = Result.Companion;
                            objM785constructorimpl = Result.m785constructorimpl(new C1733a(bArr2, aVar, (String) obj));
                            return Result.a(objM785constructorimpl);
                        }
                    }
                    return objL2;
                }
                Result.a aVar8 = Result.Companion;
                return Result.a(Result.m785constructorimpl(ResultKt.createFailure(new IllegalStateException("No render camera is available"))));
            } catch (Throwable th2) {
                if (th2 instanceof CancellationException) {
                    throw th2;
                }
                Result.a aVar9 = Result.Companion;
                objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
            }
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(s0 s0Var, kotlin.coroutines.d<? super Result<C1733a>> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public a(@NotNull i synchronizationManager, @NotNull d0 projectManager, @NotNull t coroutineDispatchers) {
        Intrinsics.checkNotNullParameter(synchronizationManager, "synchronizationManager");
        Intrinsics.checkNotNullParameter(projectManager, "projectManager");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        this.f256890a = synchronizationManager;
        this.f256891b = projectManager;
        this.f256892c = coroutineDispatchers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(h hVar) throws CancellationException {
        if (hVar.i()) {
            throw new CancellationException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // cf.a
    @Nullable
    public Object a(@NotNull h hVar, @NotNull com.planner5d.library.widget.editor.facade.e eVar, @NotNull kotlin.coroutines.d<? super Result<C1733a>> dVar) throws CancellationException {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f256899c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f256899c = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objH = bVar.f256897a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f256899c;
        if (i11 == 0) {
            ResultKt.m(objH);
            n0 n0VarA = this.f256892c.a();
            int i12 = 2 | 0;
            c cVar = new c(hVar, eVar, null);
            bVar.f256899c = 1;
            objH = kotlinx.coroutines.i.h(n0VarA, cVar, bVar);
            if (objH == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objH);
        }
        return ((Result) objH).j();
    }
}
