package com.planner5d.library.activity.fragment.projects;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.activity.fragment.snapshots.Snapshots;
import com.planner5d.library.activity.fragment.spaces.documents.Documents;
import com.planner5d.library.model.manager.statistics.events.r3;
import java.io.Serializable;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nProjectsPagesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProjectsPagesViewModel.kt\ncom/planner5d/library/activity/fragment/projects/ProjectsPagesViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
public final class n0 extends f2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f135041h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.j f135042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.spaces.b f135043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final sd.e f135044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final c1<com.planner5d.library.widget.tab.f> f135045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<com.planner5d.library.widget.tab.f> f135046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private Boolean f135047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f135048g;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.projects.ProjectsPagesViewModel$1", f = "ProjectsPagesViewModel.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f135049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f135050b;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return n0.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            n0 n0Var;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f135050b;
            if (i10 == 0) {
                ResultKt.m(obj);
                n0 n0Var2 = n0.this;
                this.f135049a = n0Var2;
                this.f135050b = 1;
                Object objD0 = n0Var2.d0(this);
                if (objD0 == objL) {
                    return objL;
                }
                obj = objD0;
                n0Var = n0Var2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n0Var = (n0) this.f135049a;
                ResultKt.m(obj);
            }
            n0Var.f135047f = (Boolean) obj;
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    private enum b {
        Projects(0),
        Spanpshots(1),
        Documents(2);


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f135056f = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f135057a;

        b(int i10) {
            this.f135057a = i10;
        }

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f135056f;
        }

        public final int n() {
            return this.f135057a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.projects.ProjectsPagesViewModel", f = "ProjectsPagesViewModel.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160700j1, com.planner5d.library.engine.input.f.b.f160700j1}, m = "checkIfUserHasASpace", n = {"this"}, s = {"L$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f135058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f135059b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f135061d;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f135059b = obj;
            this.f135061d |= Integer.MIN_VALUE;
            return n0.this.d0(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.projects.ProjectsPagesViewModel", f = "ProjectsPagesViewModel.kt", i = {0, 0}, l = {com.planner5d.library.engine.input.f.b.V}, m = "prepareAndShowDocuments", n = {"this", "arguments"}, s = {"L$0", "L$1"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f135062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f135063b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f135064c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135066e;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f135064c = obj;
            this.f135066e |= Integer.MIN_VALUE;
            return n0.this.i0(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.projects.ProjectsPagesViewModel$setArguments$1", f = "ProjectsPagesViewModel.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f135067a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.utility.j f135069c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(com.planner5d.library.services.utility.j jVar, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f135069c = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return n0.this.new e(this.f135069c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f135067a;
            if (i10 == 0) {
                ResultKt.m(obj);
                if (!n0.this.f135048g) {
                    n0 n0Var = n0.this;
                    com.planner5d.library.services.utility.j jVar = this.f135069c;
                    this.f135067a = 1;
                    if (n0Var.i0(jVar, this) == objL) {
                        return objL;
                    }
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
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.projects.ProjectsPagesViewModel", f = "ProjectsPagesViewModel.kt", i = {0}, l = {85}, m = "showDocuments", n = {"this"}, s = {"L$0"})
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f135070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f135071b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f135072c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135074e;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f135072c = obj;
            this.f135074e |= Integer.MIN_VALUE;
            return n0.this.q0(this);
        }
    }

    @ij.a
    public n0(@NotNull com.planner5d.library.model.manager.config.j featureConfigManager, @NotNull com.planner5d.library.model.manager.spaces.b spacesManager, @NotNull sd.e firebaseInAppMessageTrigger) {
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(spacesManager, "spacesManager");
        Intrinsics.checkNotNullParameter(firebaseInAppMessageTrigger, "firebaseInAppMessageTrigger");
        this.f135042a = featureConfigManager;
        this.f135043b = spacesManager;
        this.f135044c = firebaseInAppMessageTrigger;
        c1<com.planner5d.library.widget.tab.f> c1Var = new c1<>();
        this.f135045d = c1Var;
        this.f135046e = c1Var;
        kotlinx.coroutines.k.f(g2.a(this), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r7 == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d0(kotlin.coroutines.d<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.planner5d.library.activity.fragment.projects.n0.c
            if (r0 == 0) goto L16
            r0 = r7
            com.planner5d.library.activity.fragment.projects.n0$c r0 = (com.planner5d.library.activity.fragment.projects.n0.c) r0
            r5 = 6
            int r1 = r0.f135061d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 0
            r3 = r1 & r2
            if (r3 == 0) goto L16
            r5 = 7
            int r1 = r1 - r2
            r0.f135061d = r1
            goto L1b
        L16:
            com.planner5d.library.activity.fragment.projects.n0$c r0 = new com.planner5d.library.activity.fragment.projects.n0$c
            r0.<init>(r7)
        L1b:
            java.lang.Object r7 = r0.f135059b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r5 = 2
            int r2 = r0.f135061d
            r3 = 2
            r5 = 1
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L3c
            r5 = 0
            if (r2 != r3) goto L32
            kotlin.ResultKt.m(r7)
            goto L6f
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r5 = 5
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            r5 = 5
            throw r6
        L3c:
            java.lang.Object r6 = r0.f135058a
            com.planner5d.library.activity.fragment.projects.n0 r6 = (com.planner5d.library.activity.fragment.projects.n0) r6
            kotlin.ResultKt.m(r7)
            r5 = 5
            goto L57
        L45:
            kotlin.ResultKt.m(r7)
            com.planner5d.library.model.manager.spaces.b r7 = r6.f135043b
            r0.f135058a = r6
            r5 = 1
            r0.f135061d = r4
            java.lang.Object r7 = r7.H(r0)
            if (r7 != r1) goto L57
            r5 = 3
            goto L6e
        L57:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L7c
            com.planner5d.library.model.manager.spaces.b r6 = r6.f135043b
            r5 = 5
            r7 = 0
            r5 = 6
            r0.f135058a = r7
            r0.f135061d = r3
            java.lang.Object r7 = r6.A(r0)
            if (r7 != r1) goto L6f
        L6e:
            return r1
        L6f:
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            if (r7 == 0) goto L7a
            int r6 = r7.length()
            r5 = 2
            if (r6 != 0) goto L7c
        L7a:
            r4 = 5
            r4 = 0
        L7c:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r4)
            r5 = 2
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.projects.n0.d0(kotlin.coroutines.d):java.lang.Object");
    }

    private final com.planner5d.library.widget.tab.f.a f0(final com.planner5d.library.services.utility.j jVar) {
        return new com.planner5d.library.widget.tab.f.a(r3.d.my_documents, com.planner5d.library.f.s.Z6, new Function0() { // from class: com.planner5d.library.activity.fragment.projects.j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n0.g0(this.f135026a, jVar);
            }
        }, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment g0(n0 n0Var, com.planner5d.library.services.utility.j jVar) {
        Documents documents = new Documents();
        documents.setArguments(n0Var.j0(com.planner5d.library.services.r.documentsList, jVar));
        return documents;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object i0(com.planner5d.library.services.utility.j jVar, kotlin.coroutines.d<? super Unit> dVar) {
        d dVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f135066e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f135066e = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object objQ0 = dVar2.f135064c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f135066e;
        if (i11 == 0) {
            ResultKt.m(objQ0);
            dVar2.f135062a = this;
            dVar2.f135063b = jVar;
            dVar2.f135066e = 1;
            objQ0 = q0(dVar2);
            if (objQ0 == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = (com.planner5d.library.services.utility.j) dVar2.f135063b;
            this = (n0) dVar2.f135062a;
            ResultKt.m(objQ0);
        }
        if (((Boolean) objQ0).booleanValue()) {
            this.f135045d.o(new com.planner5d.library.widget.tab.f(CollectionsKt.listOf(this.f0(jVar)), this.o0(jVar)));
        }
        return Unit.f312394a;
    }

    private final Bundle j0(com.planner5d.library.services.r rVar, com.planner5d.library.services.utility.j jVar) {
        return jVar.h(rVar, new Bundle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment l0(n0 n0Var, com.planner5d.library.services.utility.j jVar) {
        Projects projects = new Projects();
        projects.setArguments(n0Var.j0(com.planner5d.library.services.r.floorPlansList, jVar));
        return projects;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment m0(n0 n0Var, com.planner5d.library.services.utility.j jVar) {
        Snapshots snapshots = new Snapshots();
        snapshots.setArguments(n0Var.j0(com.planner5d.library.services.r.snapshotsList, jVar));
        return snapshots;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n0(n0 n0Var) {
        n0Var.f135044c.a(sd.d.SnapshotsTab);
        return Unit.f312394a;
    }

    private final int o0(com.planner5d.library.services.utility.j jVar) {
        Serializable serializableS = jVar.s(com.planner5d.library.services.r.tab, null);
        if (serializableS == com.planner5d.library.services.r.snapshotsList) {
            return b.Spanpshots.n();
        }
        return serializableS == com.planner5d.library.services.r.documentsList ? b.Documents.n() : b.Projects.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object q0(kotlin.coroutines.d<? super Boolean> dVar) {
        f fVar;
        n0 n0Var;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i10 = fVar.f135074e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f135074e = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar);
            }
        } else {
            fVar = new f(dVar);
        }
        Object objD0 = fVar.f135072c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = fVar.f135074e;
        if (i11 == 0) {
            ResultKt.m(objD0);
            if (!this.f135042a.a(com.planner5d.library.model.manager.config.f.Documents)) {
                return kotlin.coroutines.jvm.internal.b.a(false);
            }
            Boolean bool = this.f135047f;
            if (bool != null) {
                return kotlin.coroutines.jvm.internal.b.a(bool.booleanValue());
            }
            fVar.f135070a = this;
            fVar.f135071b = this;
            fVar.f135074e = 1;
            objD0 = d0(fVar);
            if (objD0 == objL) {
                return objL;
            }
            n0Var = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (n0) fVar.f135071b;
            n0Var = (n0) fVar.f135070a;
            ResultKt.m(objD0);
        }
        this.f135047f = (Boolean) objD0;
        Boolean bool2 = n0Var.f135047f;
        return kotlin.coroutines.jvm.internal.b.a(bool2 != null ? bool2.booleanValue() : false);
    }

    @NotNull
    public final androidx.lifecycle.w0<com.planner5d.library.widget.tab.f> h0() {
        return this.f135046e;
    }

    @NotNull
    public final com.planner5d.library.widget.tab.f k0(@NotNull final com.planner5d.library.services.utility.j arguments) {
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        List listMutableListOf = CollectionsKt.mutableListOf(new com.planner5d.library.widget.tab.f.a(r3.d.my_projects, com.planner5d.library.f.s.f169299nc, new Function0() { // from class: com.planner5d.library.activity.fragment.projects.k0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n0.l0(this.f135029a, arguments);
            }
        }, null, 8, null), new com.planner5d.library.widget.tab.f.a(r3.d.my_renders, com.planner5d.library.f.s.MC, new Function0() { // from class: com.planner5d.library.activity.fragment.projects.l0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n0.m0(this.f135034a, arguments);
            }
        }, new Function0() { // from class: com.planner5d.library.activity.fragment.projects.m0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n0.n0(this.f135039a);
            }
        }));
        if (Intrinsics.areEqual(this.f135047f, Boolean.TRUE) && this.f135042a.a(com.planner5d.library.model.manager.config.f.Documents)) {
            listMutableListOf.add(f0(arguments));
            this.f135048g = true;
        }
        return new com.planner5d.library.widget.tab.f(listMutableListOf, o0(arguments));
    }

    public final void p0(@NotNull com.planner5d.library.services.utility.j arguments) {
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        kotlinx.coroutines.k.f(g2.a(this), null, null, new e(arguments, null), 3, null);
    }
}
