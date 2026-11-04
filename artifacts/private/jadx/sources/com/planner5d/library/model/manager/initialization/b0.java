package com.planner5d.library.model.manager.initialization;

import android.webkit.WebSettings;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.c1;
import com.planner5d.library.model.manager.y0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@ij.f
public final class b0 implements x.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f191585h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f191586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.config.p> f191587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final fg.e<y0> f191588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.builtin.i> f191589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final fg.e<c1> f191590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.config.j> f191591f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.crashreporting.l> f191592g;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.initialization.InitializationWorkWithoutUser", f = "InitializationWorkWithoutUser.kt", i = {0, 1, 2, 3, 4}, l = {30, 32, 37, 41, 41}, m = "execute", n = {"this", "this", "this", "this", "this"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f191594b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f191595c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f191597e;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191595c = obj;
            this.f191597e |= Integer.MIN_VALUE;
            return b0.this.a(this);
        }
    }

    @ij.a
    public b0(@NotNull com.planner5d.library.application.b application, @NotNull fg.e<com.planner5d.library.model.manager.config.p> preferences, @NotNull fg.e<y0> imageManager, @NotNull fg.e<com.planner5d.library.model.manager.builtin.i> builtInDataManager, @NotNull fg.e<c1> installationManager, @NotNull fg.e<com.planner5d.library.model.manager.config.j> featureConfigManager, @NotNull fg.e<com.planner5d.library.model.manager.crashreporting.l> crashReporter) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
        Intrinsics.checkNotNullParameter(installationManager, "installationManager");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(crashReporter, "crashReporter");
        this.f191586a = application;
        this.f191587b = preferences;
        this.f191588c = imageManager;
        this.f191589d = builtInDataManager;
        this.f191590e = installationManager;
        this.f191591f = featureConfigManager;
        this.f191592g = crashReporter;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00e4 A[PHI: r10
      0x00e4: PHI (r10v3 'this' com.planner5d.library.model.manager.initialization.b0) = 
      (r10v2 'this' com.planner5d.library.model.manager.initialization.b0)
      (r10v18 'this' com.planner5d.library.model.manager.initialization.b0)
     binds: [B:31:0x00e1, B:21:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:39:0x0109  */
    /* JADX WARN: Code duplicated, block: B:40:0x0112  */
    /* JADX WARN: Code duplicated, block: B:45:0x0123  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // com.planner5d.library.model.manager.initialization.x.b
    @Nullable
    public Object a(@NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        a aVar;
        c1 c1Var;
        com.planner5d.library.model.manager.config.j jVar;
        Object objP;
        b0 b0Var;
        com.planner5d.library.model.manager.config.j jVar2;
        Long lG;
        b0 b0Var2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f191597e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f191597e = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f191595c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f191597e;
        if (i11 == 0) {
            ResultKt.m(obj);
            this.f191592g.get().z();
            com.planner5d.library.model.manager.config.p pVar = this.f191587b.get();
            aVar.f191593a = this;
            aVar.f191597e = 1;
            if (pVar.a(aVar) != objL) {
            }
            return objL;
        }
        if (i11 == 1) {
            this = (b0) aVar.f191593a;
            ResultKt.m(obj);
        } else {
            if (i11 == 2) {
                this = (b0) aVar.f191593a;
                ResultKt.m(obj);
                WebSettings.getDefaultUserAgent(this.f191586a);
                c1Var = this.f191590e.get();
                aVar.f191593a = this;
                aVar.f191597e = 3;
                if (c1Var.G(aVar) != objL) {
                    jVar = this.f191591f.get();
                    aVar.f191593a = this;
                    aVar.f191594b = jVar;
                    aVar.f191597e = 4;
                    objP = jVar.p(aVar);
                    if (objP != objL) {
                        b0Var = this;
                        jVar2 = jVar;
                        obj = objP;
                        if (((Boolean) obj).booleanValue()) {
                            lG = kotlin.coroutines.jvm.internal.b.g(0L);
                        } else {
                            lG = null;
                        }
                        aVar.f191593a = b0Var;
                        aVar.f191594b = null;
                        aVar.f191597e = 5;
                        if (jVar2.u(lG, aVar) != objL) {
                            b0Var2 = b0Var;
                        }
                    }
                }
                return objL;
            }
            if (i11 == 3) {
                this = (b0) aVar.f191593a;
                ResultKt.m(obj);
                jVar = this.f191591f.get();
                aVar.f191593a = this;
                aVar.f191594b = jVar;
                aVar.f191597e = 4;
                objP = jVar.p(aVar);
                if (objP != objL) {
                    b0Var = this;
                    jVar2 = jVar;
                    obj = objP;
                    if (((Boolean) obj).booleanValue()) {
                        lG = kotlin.coroutines.jvm.internal.b.g(0L);
                    } else {
                        lG = null;
                    }
                    aVar.f191593a = b0Var;
                    aVar.f191594b = null;
                    aVar.f191597e = 5;
                    if (jVar2.u(lG, aVar) != objL) {
                        b0Var2 = b0Var;
                    }
                }
                return objL;
            }
            if (i11 == 4) {
                jVar2 = (com.planner5d.library.model.manager.config.j) aVar.f191594b;
                b0Var = (b0) aVar.f191593a;
                ResultKt.m(obj);
                if (((Boolean) obj).booleanValue()) {
                    lG = kotlin.coroutines.jvm.internal.b.g(0L);
                } else {
                    lG = null;
                }
                aVar.f191593a = b0Var;
                aVar.f191594b = null;
                aVar.f191597e = 5;
                if (jVar2.u(lG, aVar) != objL) {
                    b0Var2 = b0Var;
                }
                return objL;
            }
            if (i11 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b0Var2 = (b0) aVar.f191593a;
            ResultKt.m(obj);
        }
        b0Var2.f191592g.get().z();
        return Unit.f312394a;
        this.f191588c.get();
        com.planner5d.library.services.utility.c0 c0Var = com.planner5d.library.services.utility.c0.f225068a;
        Observable<Void> observableN0 = this.f191589d.get().n0();
        Intrinsics.checkNotNullExpressionValue(observableN0, "initialize(...)");
        aVar.f191593a = this;
        aVar.f191597e = 2;
        if (c0Var.l(observableN0, aVar) != objL) {
            WebSettings.getDefaultUserAgent(this.f191586a);
            c1Var = this.f191590e.get();
            aVar.f191593a = this;
            aVar.f191597e = 3;
            if (c1Var.G(aVar) != objL) {
                jVar = this.f191591f.get();
                aVar.f191593a = this;
                aVar.f191594b = jVar;
                aVar.f191597e = 4;
                objP = jVar.p(aVar);
                if (objP != objL) {
                    b0Var = this;
                    jVar2 = jVar;
                    obj = objP;
                    if (((Boolean) obj).booleanValue()) {
                        lG = kotlin.coroutines.jvm.internal.b.g(0L);
                    } else {
                        lG = null;
                    }
                    aVar.f191593a = b0Var;
                    aVar.f191594b = null;
                    aVar.f191597e = 5;
                    if (jVar2.u(lG, aVar) != objL) {
                        b0Var2 = b0Var;
                        b0Var2.f191592g.get().z();
                        return Unit.f312394a;
                    }
                }
            }
        }
        return objL;
    }
}
