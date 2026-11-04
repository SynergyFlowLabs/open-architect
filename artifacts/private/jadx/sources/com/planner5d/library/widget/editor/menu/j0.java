package com.planner5d.library.widget.editor.menu;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.MenuItem;
import android.view.View;
import androidx.compose.runtime.internal.w0;
import androidx.fragment.app.Fragment;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.compareplans.ComparePlansFragment;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.o3;
import com.planner5d.library.model.manager.statistics.events.y3;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.widget.c1;
import com.planner5d.library.widget.editor.helper.g1;
import com.planner5d.library.widget.editor.helper.s2;
import java.io.File;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class j0 implements com.planner5d.library.widget.menu.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f257097g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final g1 f257098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f1 f257099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final b2 f257100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final pa.b f257101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t f257102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.x f257103f;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.menu.ProjectExportToCadListener$exportToCad$1", f = "ProjectExportToCadListener.kt", i = {}, l = {89, com.planner5d.library.engine.input.f.b.f160711n0, com.planner5d.library.engine.input.f.b.f160711n0, 102}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f257104a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f257106c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f257107d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ pa.b.a f257108e;

        /* JADX INFO: renamed from: com.planner5d.library.widget.editor.menu.j0$a$a, reason: collision with other inner class name */
        static final class C1737a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ j0 f257109a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Activity f257110b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ pa.b.a f257111c;

            /* JADX INFO: renamed from: com.planner5d.library.widget.editor.menu.j0$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C1738a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f257112a;

                static {
                    int[] iArr = new int[pa.b.EnumC2457b.values().length];
                    try {
                        iArr[pa.b.EnumC2457b.LoadedData.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[pa.b.EnumC2457b.Error.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f257112a = iArr;
                }
            }

            /* JADX INFO: renamed from: com.planner5d.library.widget.editor.menu.j0$a$a$b */
            @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.menu.ProjectExportToCadListener$exportToCad$1$1", f = "ProjectExportToCadListener.kt", i = {0, 1}, l = {com.planner5d.library.engine.input.f.b.f160700j1, com.planner5d.library.engine.input.f.b.f160703k1}, m = "emit", n = {"result", "result"}, s = {"L$0", "L$0"})
            static final class b extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                Object f257113a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f257114b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ C1737a<T> f257115c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                int f257116d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(C1737a<? super T> c1737a, kotlin.coroutines.d<? super b> dVar) {
                    super(dVar);
                    this.f257115c = c1737a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f257114b = obj;
                    this.f257116d |= Integer.MIN_VALUE;
                    return this.f257115c.emit(null, this);
                }
            }

            C1737a(j0 j0Var, Activity activity, pa.b.a aVar) {
                this.f257109a = j0Var;
                this.f257110b = activity;
                this.f257111c = aVar;
            }

            /* JADX WARN: Code duplicated, block: B:8:0x001b  */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
            
                if (com.planner5d.library.widget.editor.menu.j0.u(r1, false, null, r4, 2, null) == r0) goto L26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0089, code lost:
            
                if (r10.r(r1, r2, r8, r4) == r0) goto L26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
            
                return r0;
             */
            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(kotlin.Pair<? extends pa.b.EnumC2457b, ? extends org.json.JSONObject> r9, kotlin.coroutines.d<? super kotlin.Unit> r10) {
                /*
                    r8 = this;
                    java.lang.String r7 = "Androeed.ru"
                    boolean r0 = r10 instanceof com.planner5d.library.widget.editor.menu.j0.a.C1737a.b
                    if (r0 == 0) goto L1b
                    r0 = r10
                    r7 = 5
                    com.planner5d.library.widget.editor.menu.j0$a$a$b r0 = (com.planner5d.library.widget.editor.menu.j0.a.C1737a.b) r0
                    int r1 = r0.f257116d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    r7 = 2
                    if (r3 == 0) goto L1b
                    r7 = 6
                    int r1 = r1 - r2
                    r7 = 5
                    r0.f257116d = r1
                L18:
                    r4 = r0
                    r7 = 4
                    goto L21
                L1b:
                    com.planner5d.library.widget.editor.menu.j0$a$a$b r0 = new com.planner5d.library.widget.editor.menu.j0$a$a$b
                    r0.<init>(r8, r10)
                    goto L18
                L21:
                    java.lang.Object r10 = r4.f257114b
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r4.f257116d
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L43
                    r7 = 5
                    if (r1 == r3) goto L32
                    if (r1 != r2) goto L3b
                L32:
                    java.lang.Object r8 = r4.f257113a
                    r9 = r8
                    kotlin.Pair r9 = (kotlin.Pair) r9
                    kotlin.ResultKt.m(r10)
                    goto L8c
                L3b:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L43:
                    r7 = 7
                    kotlin.ResultKt.m(r10)
                    java.lang.Object r10 = r9.getFirst()
                    pa.b$b r10 = (pa.b.EnumC2457b) r10
                    r7 = 2
                    int[] r1 = com.planner5d.library.widget.editor.menu.j0.a.C1737a.C1738a.f257112a
                    r7 = 2
                    int r10 = r10.ordinal()
                    r10 = r1[r10]
                    r7 = 6
                    if (r10 == r3) goto L72
                    if (r10 == r2) goto L5d
                    goto L8c
                L5d:
                    com.planner5d.library.widget.editor.menu.j0 r1 = r8.f257109a
                    r7 = 3
                    r4.f257113a = r9
                    r4.f257116d = r2
                    r7 = 4
                    r2 = 0
                    r3 = 0
                    r5 = 2
                    r6 = 4
                    r6 = 0
                    java.lang.Object r8 = com.planner5d.library.widget.editor.menu.j0.u(r1, r2, r3, r4, r5, r6)
                    r7 = 4
                    if (r8 != r0) goto L8c
                    goto L8b
                L72:
                    com.planner5d.library.widget.editor.menu.j0 r10 = r8.f257109a
                    android.app.Activity r1 = r8.f257110b
                    java.lang.Object r2 = r9.getSecond()
                    r7 = 6
                    org.json.JSONObject r2 = (org.json.JSONObject) r2
                    r7 = 3
                    pa.b$a r8 = r8.f257111c
                    r4.f257113a = r9
                    r7 = 6
                    r4.f257116d = r3
                    java.lang.Object r8 = com.planner5d.library.widget.editor.menu.j0.h(r10, r1, r2, r8, r4)
                    if (r8 != r0) goto L8c
                L8b:
                    return r0
                L8c:
                    timber.log.b$b r8 = timber.log.b.f381052a
                    r7 = 2
                    java.lang.StringBuilder r10 = new java.lang.StringBuilder
                    r10.<init>()
                    java.lang.String r0 = "rusts:le"
                    java.lang.String r0 = "result: "
                    r10.append(r0)
                    r10.append(r9)
                    java.lang.String r9 = r10.toString()
                    r7 = 6
                    r10 = 0
                    r7 = 7
                    java.lang.Object[] r10 = new java.lang.Object[r10]
                    r8.a(r9, r10)
                    kotlin.Unit r8 = kotlin.Unit.f312394a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.widget.editor.menu.j0.a.C1737a.emit(kotlin.Pair, kotlin.coroutines.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Activity activity, String str, pa.b.a aVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f257106c = activity;
            this.f257107d = str;
            this.f257108e = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return j0.this.new a(this.f257106c, this.f257107d, this.f257108e, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0093  */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
        
            if (com.planner5d.library.widget.editor.menu.j0.u(r3, false, null, r10, 2, null) == r1) goto L29;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                r9 = 2
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                r9 = 6
                int r0 = r10.f257104a
                r2 = 1
                r2 = 4
                r3 = 4
                r3 = 3
                r4 = 1
                r4 = 2
                r5 = 6
                r5 = 1
                if (r0 == 0) goto L3e
                if (r0 == r5) goto L39
                if (r0 == r4) goto L34
                if (r0 == r3) goto L2a
                if (r0 != r2) goto L20
                r9 = 4
                kotlin.ResultKt.m(r11)
                goto La8
            L20:
                r9 = 2
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r9 = 4
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L2a:
                kotlin.ResultKt.m(r11)     // Catch: java.lang.Exception -> L2f
                r9 = 5
                goto L93
            L2f:
                r0 = move-exception
                r11 = r0
                r11 = r0
                r9 = 0
                goto L8a
            L34:
                kotlin.ResultKt.m(r11)     // Catch: java.lang.Exception -> L2f
                r9 = 7
                goto L6d
            L39:
                kotlin.ResultKt.m(r11)
                r9 = 5
                goto L59
            L3e:
                r9 = 6
                kotlin.ResultKt.m(r11)
                r9 = 3
                com.planner5d.library.widget.editor.menu.j0 r11 = com.planner5d.library.widget.editor.menu.j0.this
                android.app.Activity r0 = r10.f257106c
                int r6 = com.planner5d.library.f.s.gF
                r9 = 2
                java.lang.String r0 = r0.getString(r6)
                r9 = 1
                r10.f257104a = r5
                java.lang.Object r11 = com.planner5d.library.widget.editor.menu.j0.i(r11, r5, r0, r10)
                r9 = 0
                if (r11 != r1) goto L59
                goto La6
            L59:
                r9 = 2
                com.planner5d.library.widget.editor.menu.j0 r11 = com.planner5d.library.widget.editor.menu.j0.this     // Catch: java.lang.Exception -> L2f
                pa.b r11 = com.planner5d.library.widget.editor.menu.j0.e(r11)     // Catch: java.lang.Exception -> L2f
                java.lang.String r0 = r10.f257107d     // Catch: java.lang.Exception -> L2f
                pa.b$a r5 = r10.f257108e     // Catch: java.lang.Exception -> L2f
                r10.f257104a = r4     // Catch: java.lang.Exception -> L2f
                java.lang.Object r11 = r11.a(r0, r5, r10)     // Catch: java.lang.Exception -> L2f
                if (r11 != r1) goto L6d
                goto La6
            L6d:
                kotlinx.coroutines.flow.i r11 = (kotlinx.coroutines.flow.i) r11     // Catch: java.lang.Exception -> L2f
                r9 = 0
                kotlinx.coroutines.flow.i r11 = kotlinx.coroutines.flow.k.u(r11)     // Catch: java.lang.Exception -> L2f
                com.planner5d.library.widget.editor.menu.j0$a$a r0 = new com.planner5d.library.widget.editor.menu.j0$a$a     // Catch: java.lang.Exception -> L2f
                com.planner5d.library.widget.editor.menu.j0 r4 = com.planner5d.library.widget.editor.menu.j0.this     // Catch: java.lang.Exception -> L2f
                r9 = 3
                android.app.Activity r5 = r10.f257106c     // Catch: java.lang.Exception -> L2f
                pa.b$a r6 = r10.f257108e     // Catch: java.lang.Exception -> L2f
                r0.<init>(r4, r5, r6)     // Catch: java.lang.Exception -> L2f
                r9 = 3
                r10.f257104a = r3     // Catch: java.lang.Exception -> L2f
                java.lang.Object r11 = r11.collect(r0, r10)     // Catch: java.lang.Exception -> L2f
                if (r11 != r1) goto L93
                goto La6
            L8a:
                com.planner5d.library.widget.editor.menu.j0 r0 = com.planner5d.library.widget.editor.menu.j0.this
                com.planner5d.library.model.manager.b2 r0 = com.planner5d.library.widget.editor.menu.j0.g(r0)
                r0.c(r11)
            L93:
                com.planner5d.library.widget.editor.menu.j0 r3 = com.planner5d.library.widget.editor.menu.j0.this
                r10.f257104a = r2
                r4 = 2
                r4 = 0
                r5 = 0
                r7 = 2
                r9 = 1
                r8 = 0
                r6 = r10
                r9 = 3
                java.lang.Object r10 = com.planner5d.library.widget.editor.menu.j0.u(r3, r4, r5, r6, r7, r8)
                r9 = 5
                if (r10 != r1) goto La8
            La6:
                r9 = 0
                return r1
            La8:
                r9 = 5
                kotlin.Unit r10 = kotlin.Unit.f312394a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.widget.editor.menu.j0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.menu.ProjectExportToCadListener$showProgress$2", f = "ProjectExportToCadListener.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nProjectExportToCadListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProjectExportToCadListener.kt\ncom/planner5d/library/widget/editor/menu/ProjectExportToCadListener$showProgress$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n1#2:153\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f257117a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f257119c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f257120d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, String str, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f257119c = z10;
            this.f257120d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return j0.this.new b(this.f257119c, this.f257120d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            com.planner5d.library.activity.helper.ui.b bVar;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f257117a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            Fragment fragmentI = j0.this.f257098a.i();
            if (this.f257119c) {
                String str = this.f257120d;
                bVar = new com.planner5d.library.activity.helper.ui.b(true, str != null ? new k3(str) : null, true);
            } else {
                bVar = new com.planner5d.library.activity.helper.ui.b(false, null, false, 6, null);
            }
            com.planner5d.library.activity.helper.ui.d.f(fragmentI, bVar);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public j0(@NotNull g1 helper, @NotNull f1 scope, @NotNull b2 messageManager, @NotNull pa.b exportToCadUseCase, @NotNull com.planner5d.library.modules.user.user.t userAuthorization, @NotNull com.planner5d.library.activity.fragment.x navigator) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(exportToCadUseCase, "exportToCadUseCase");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f257098a = helper;
        this.f257099b = scope;
        this.f257100c = messageManager;
        this.f257101d = exportToCadUseCase;
        this.f257102e = userAuthorization;
        this.f257103f = navigator;
    }

    private final void j(o3.d dVar) {
        this.f257098a.B3.a(o3.a.click_export, dVar);
    }

    private final void k(Activity activity, String str, pa.b.a aVar) {
        kotlinx.coroutines.k.f(this.f257099b, com.planner5d.library.services.utility.s.f229729a.b(), null, new a(activity, str, aVar, null), 2, null);
    }

    private final boolean l() {
        id.a aVarA = this.f257102e.a();
        return aVarA != null && aVarA.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(com.google.android.material.bottomsheet.e eVar, j0 j0Var, Activity activity, String str, View view) {
        eVar.dismiss();
        j0Var.j(o3.d.dwg);
        j0Var.k(activity, str, pa.b.a.Dwg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(com.google.android.material.bottomsheet.e eVar, j0 j0Var, Activity activity, String str, View view) {
        eVar.dismiss();
        j0Var.j(o3.d.dfx);
        j0Var.k(activity, str, pa.b.a.Dxf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(com.google.android.material.bottomsheet.e eVar, View view) {
        eVar.dismiss();
    }

    private final void p(Activity activity, byte[] bArr, pa.b.a aVar) throws IOException {
        File file = new File(activity.getCacheDir().getAbsolutePath(), "documents");
        file.mkdirs();
        File fileCreateTempFile = File.createTempFile("project-", aVar == pa.b.a.Dwg ? ".dwg" : ".dxf", file);
        Intrinsics.checkNotNull(fileCreateTempFile);
        kotlin.io.l.G(fileCreateTempFile, bArr);
        q(activity, com.planner5d.library.services.utility.o0.f225339a.c(activity, fileCreateTempFile), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r(Activity activity, JSONObject jSONObject, pa.b.a aVar, kotlin.coroutines.d<? super Unit> dVar) throws com.google.android.vending.licensing.util.b, IOException {
        String string;
        if (jSONObject != null && (string = jSONObject.getString(com.planner5d.library.services.r.rabbitMQData.f224891a)) != null) {
            byte[] bArrA = com.google.android.vending.licensing.util.a.a(string);
            Intrinsics.checkNotNullExpressionValue(bArrA, "decode(...)");
            p(activity, bArrA, aVar);
        }
        Object objU = u(this, false, null, dVar, 2, null);
        return objU == kotlin.coroutines.intrinsics.b.l() ? objU : Unit.f312394a;
    }

    private final void s() {
        this.f257103f.f(new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) ComparePlansFragment.class, new com.planner5d.library.services.utility.i().m(com.planner5d.library.services.r.commercial, true).m(com.planner5d.library.services.r.newNavigation, false).t(com.planner5d.library.services.r.source, y3.c.export_to_cad).a()).n(com.planner5d.library.f.s.ky), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(boolean z10, String str, kotlin.coroutines.d<? super Unit> dVar) {
        int i10 = 5 >> 0;
        Object objH = kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.a(), new b(z10, str, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    static /* synthetic */ Object u(j0 j0Var, boolean z10, String str, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return j0Var.t(z10, str, dVar);
    }

    @Override // com.planner5d.library.widget.menu.p
    public void a(@NotNull final Activity activity, @NotNull MenuItem item) {
        final String str;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(item, "item");
        Project projectI1 = this.f257098a.I1();
        if (projectI1 != null && (str = projectI1.uid) != null) {
            int i10 = 5 << 2;
            s2.b(this.f257098a.B3, o3.a.share, null, 2, null);
            if (!l()) {
                s();
                return;
            }
            com.planner5d.library.databinding.c cVarC = com.planner5d.library.databinding.c.c(activity.getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(cVarC, "inflate(...)");
            final com.google.android.material.bottomsheet.e eVar = new com.google.android.material.bottomsheet.e(activity, c1.r.f253034f5);
            eVar.setContentView(cVarC.getRoot());
            cVarC.f158779e.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.menu.g0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    j0.m(eVar, this, activity, str, view);
                }
            });
            cVarC.f158780f.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.menu.h0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    j0.n(eVar, this, activity, str, view);
                }
            });
            cVarC.f158778d.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.menu.i0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    j0.o(eVar, view);
                }
            });
            eVar.show();
        }
    }

    public final void q(@NotNull Activity activity, @NotNull Uri uri, @NotNull pa.b.a fileType) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("octet/stream");
        intent.putExtra("android.intent.extra.STREAM", uri);
        activity.startActivity(Intent.createChooser(intent, null));
        this.f257098a.B3.a(o3.a.success_export, fileType == pa.b.a.Dxf ? o3.d.dfx : o3.d.dwg);
    }
}
