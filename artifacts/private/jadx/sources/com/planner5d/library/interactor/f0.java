package com.planner5d.library.interactor;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.helper.f1;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.manager.statistics.events.b4;
import com.planner5d.library.model.manager.statistics.events.p3;
import com.planner5d.library.model.manager.statistics.events.u2;
import com.planner5d.library.model.snapshot.Snapshot;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.utility.s2;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.i1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
public final class f0 implements le.k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f180097e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.project.d0 f180098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.w f180099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.synchronization.i f180100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final f1 f180101d;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.interactor.RequestRenderInteractor", f = "RequestRenderInteractor.kt", i = {}, l = {34}, m = "requestRender", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f180102a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f180104c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f180102a = obj;
            this.f180104c |= Integer.MIN_VALUE;
            return f0.this.a(0L, null, null, this);
        }
    }

    @ij.a
    public f0(@NotNull com.planner5d.library.model.manager.project.d0 projectManager, @NotNull com.planner5d.library.modules.user.user.w userAuthorization, @NotNull com.planner5d.library.model.manager.synchronization.i synchronizationManager, @NotNull f1 helperSnapshotCreate) {
        Intrinsics.checkNotNullParameter(projectManager, "projectManager");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(synchronizationManager, "synchronizationManager");
        Intrinsics.checkNotNullParameter(helperSnapshotCreate, "helperSnapshotCreate");
        this.f180098a = projectManager;
        this.f180099b = userAuthorization;
        this.f180100c = synchronizationManager;
        this.f180101d = helperSnapshotCreate;
    }

    private final Observable<Snapshot> k(final long j10, final com.planner5d.library.widget.editor.a aVar, final gd.a aVar2) {
        final i1.h hVar = new i1.h();
        Observable observableF = com.planner5d.library.services.rx.i.f(new Callable() { // from class: com.planner5d.library.interactor.w
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f0.l(this.f180294a, j10, hVar);
            }
        });
        final Function1 function1 = new Function1() { // from class: com.planner5d.library.interactor.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f0.m(aVar2, this, (Project) obj);
            }
        };
        Observable observableFlatMap = observableF.flatMap(new Func1() { // from class: com.planner5d.library.interactor.y
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return f0.n(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.planner5d.library.interactor.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f0.o(aVar, (Void) obj);
            }
        };
        Observable observableFlatMap2 = observableFlatMap.flatMap(new Func1() { // from class: com.planner5d.library.interactor.a0
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return f0.p(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: com.planner5d.library.interactor.b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f0.q(this.f180068a, j10, aVar, aVar2, (Bitmap) obj);
            }
        };
        Observable<Snapshot> observableDoOnCompleted = observableFlatMap2.flatMap(new Func1() { // from class: com.planner5d.library.interactor.c0
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return f0.r(function3, obj);
            }
        }).doOnError(new Action1() { // from class: com.planner5d.library.interactor.d0
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                f0.s(aVar2, hVar, (Throwable) obj);
            }
        }).doOnCompleted(new Action0() { // from class: com.planner5d.library.interactor.e0
            @Override // rx.functions.Action0
            public final void call() {
                f0.t(aVar2, hVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnCompleted, "doOnCompleted(...)");
        return observableDoOnCompleted;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Long] */
    public static final Project l(f0 f0Var, long j10, i1.h hVar) {
        Project projectY = f0Var.f180098a.Y(f0Var.f180099b.a(), j10);
        if (projectY != null) {
            hVar.f312751a = projectY.projectId;
            return projectY;
        }
        throw new IllegalArgumentException("No project found by provided ID = " + j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable m(gd.a aVar, f0 f0Var, Project project) {
        b4.e statisticsType = aVar.f275442a.f385735f;
        Intrinsics.checkNotNullExpressionValue(statisticsType, "statisticsType");
        u2.H1(statisticsType, b4.d.cloud, p3.b.submit, project.projectId);
        return f0Var.f180100c.r(project);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable n(Function1 function1, Object obj) {
        return (Observable) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable o(com.planner5d.library.widget.editor.a aVar, Void r10) {
        return aVar.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable p(Function1 function1, Object obj) {
        return (Observable) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable q(f0 f0Var, long j10, com.planner5d.library.widget.editor.a aVar, gd.a aVar2, Bitmap bitmap) {
        if (bitmap == null) {
            throw new IllegalStateException("Could not create a scene screenshot");
        }
        f1 f1Var = f0Var.f180101d;
        vd.a renderCamera = aVar.getRenderCamera();
        if (renderCamera != null) {
            return f1Var.d(null, null, null, j10, bitmap, renderCamera, aVar2);
        }
        throw new IllegalStateException("Could not set a render camera");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable r(Function1 function1, Object obj) {
        return (Observable) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void s(gd.a aVar, i1.h hVar, Throwable th2) {
        b4.e statisticsType = aVar.f275442a.f385735f;
        Intrinsics.checkNotNullExpressionValue(statisticsType, "statisticsType");
        u2.H1(statisticsType, b4.d.cloud, p3.b.error, (Long) hVar.f312751a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void t(gd.a aVar, i1.h hVar) {
        b4.e statisticsType = aVar.f275442a.f385735f;
        Intrinsics.checkNotNullExpressionValue(statisticsType, "statisticsType");
        u2.H1(statisticsType, b4.d.cloud, p3.b.success, (Long) hVar.f312751a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // le.k
    @Nullable
    public Object a(long j10, @NotNull com.planner5d.library.widget.editor.a aVar, @NotNull gd.a aVar2, @NotNull kotlin.coroutines.d<? super s2<Snapshot, ErrorMessageException>> dVar) {
        a aVar3;
        s2.b bVar;
        if (dVar instanceof a) {
            aVar3 = (a) dVar;
            int i10 = aVar3.f180104c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar3.f180104c = i10 - Integer.MIN_VALUE;
            } else {
                aVar3 = new a(dVar);
            }
        } else {
            aVar3 = new a(dVar);
        }
        Object objL = aVar3.f180102a;
        Object objL2 = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar3.f180104c;
        try {
            if (i11 == 0) {
                ResultKt.m(objL);
                com.planner5d.library.services.utility.c0 c0Var = com.planner5d.library.services.utility.c0.f225068a;
                Observable<Snapshot> observableK = k(j10, aVar, aVar2);
                aVar3.f180104c = 1;
                objL = c0Var.l(observableK, aVar3);
                if (objL == objL2) {
                    return objL2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(objL);
            }
            return new s2.c(objL);
        } catch (ErrorMessageException e10) {
            bVar = new s2.b(e10);
            return bVar;
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th2) {
            bVar = new s2.b(new ErrorMessageException(th2, com.planner5d.library.f.s.Sa, new String[0]));
            return bVar;
        }
    }
}
