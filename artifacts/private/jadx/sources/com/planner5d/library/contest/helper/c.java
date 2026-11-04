package com.planner5d.library.contest.helper;

import android.net.Uri;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.dialog.k;
import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.contest.view.ContestNavigationFragment;
import com.planner5d.library.contest.view.dialog.prize.ContestPrizeDialog;
import com.planner5d.library.database.model.contest.Contest;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.services.utility.t;
import java.util.regex.Pattern;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nContestUriProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContestUriProcessor.kt\ncom/planner5d/library/contest/helper/ContestUriProcessor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n1#2:109\n*E\n"})
public final class c implements com.planner5d.library.h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f153274g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f153275h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f153276i = Pattern.compile("^/contests(/?|/.*)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ij.a
    public com.planner5d.library.contest.data.i f153277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ij.a
    public x f153278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ij.a
    public k f153279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @ij.a
    public g f153280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @ij.a
    public t f153281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @ij.a
    public f1 f153282f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.helper.ContestUriProcessor", f = "ContestUriProcessor.kt", i = {0, 1, 1, 1}, l = {com.planner5d.library.engine.input.f.b.C0, com.planner5d.library.engine.input.f.b.f160716p}, m = "createDestination", n = {"this", "this", "contest", "uriHandler"}, s = {"L$0", "L$0", "L$1", "L$2"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f153283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f153284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f153285c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f153286d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f153288f;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f153286d = obj;
            this.f153288f |= Integer.MIN_VALUE;
            return c.this.e(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.contest.helper.c$c, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.helper.ContestUriProcessor$createDestination$2", f = "ContestUriProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C1520c extends o implements Function2<s0, kotlin.coroutines.d<? super Project>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f153289a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Contest f153291c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1520c(Contest contest, kotlin.coroutines.d<? super C1520c> dVar) {
            super(2, dVar);
            this.f153291c = contest;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new C1520c(this.f153291c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f153289a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return c.this.f().u(this.f153291c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Project> dVar) {
            return ((C1520c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.helper.ContestUriProcessor", f = "ContestUriProcessor.kt", i = {0, 0}, l = {96, 105}, m = "handleContestUri", n = {"this", "uri"}, s = {"L$0", "L$1"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f153292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f153293b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f153294c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f153296e;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f153294c = obj;
            this.f153296e |= Integer.MIN_VALUE;
            return c.this.l(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.helper.ContestUriProcessor$processUri$1", f = "ContestUriProcessor.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.I0}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f153297a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Uri f153299c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Uri uri, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f153299c = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new e(this.f153299c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f153297a;
            if (i10 == 0) {
                ResultKt.m(obj);
                c cVar = c.this;
                Uri uri = this.f153299c;
                this.f153297a = 1;
                if (cVar.l(uri, this) == objL) {
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
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public c() {
        com.planner5d.library.contest.application.a.f148393b.a().j(this);
    }

    private final com.planner5d.library.activity.helper.event.content.c d() {
        return new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) ContestNavigationFragment.class, new com.planner5d.library.services.utility.i().t(r.tab, r.currentList).a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        if (r10 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b6, code lost:
    
        if (r10 == r1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.planner5d.library.database.model.contest.Contest r8, com.planner5d.library.contest.helper.j r9, kotlin.coroutines.d<? super com.planner5d.library.activity.helper.event.content.c> r10) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.contest.helper.c.e(com.planner5d.library.database.model.contest.Contest, com.planner5d.library.contest.helper.j, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object l(Uri uri, kotlin.coroutines.d<? super Unit> dVar) {
        d dVar2;
        x xVar;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f153296e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f153296e = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object objR = dVar2.f153294c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f153296e;
        if (i11 == 0) {
            ResultKt.m(objR);
            com.planner5d.library.contest.data.i iVarF = f();
            dVar2.f153292a = this;
            dVar2.f153293b = uri;
            dVar2.f153296e = 1;
            objR = iVarF.r(dVar2);
            if (objR != objL) {
            }
            return objL;
        }
        if (i11 == 1) {
            uri = (Uri) dVar2.f153293b;
            this = (c) dVar2.f153292a;
            ResultKt.m(objR);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            xVar = (x) dVar2.f153292a;
            ResultKt.m(objR);
        }
        x.g(xVar, (com.planner5d.library.activity.helper.event.content.c) objR, false, 2, null);
        return Unit.f312394a;
        Contest contest = (Contest) objR;
        if (contest == null) {
            x.g(this.i(), this.d(), false, 2, null);
            return Unit.f312394a;
        }
        j jVar = new j(uri);
        Long lD = jVar.d();
        if (lD != null) {
            this.h().c(ContestPrizeDialog.class).h(new com.planner5d.library.services.utility.i().g(r.contestUid, lD.longValue()).a()).g();
            return Unit.f312394a;
        }
        x xVarI = this.i();
        dVar2.f153292a = xVarI;
        dVar2.f153293b = null;
        dVar2.f153296e = 2;
        objR = this.e(contest, jVar, dVar2);
        if (objR != objL) {
            xVar = xVarI;
            x.g(xVar, (com.planner5d.library.activity.helper.event.content.c) objR, false, 2, null);
            return Unit.f312394a;
        }
        return objL;
    }

    @Override // com.planner5d.library.h
    public boolean a(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (!m(uri)) {
            return false;
        }
        kotlinx.coroutines.k.f(j(), g().a(), null, new e(uri, null), 2, null);
        boolean z10 = true | true;
        return true;
    }

    @NotNull
    public final com.planner5d.library.contest.data.i f() {
        com.planner5d.library.contest.data.i iVar = this.f153277a;
        if (iVar != null) {
            return iVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("contestManager");
        int i10 = 1 << 0;
        return null;
    }

    @NotNull
    public final t g() {
        t tVar = this.f153281e;
        if (tVar != null) {
            return tVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coroutineDispatchersProvider");
        return null;
    }

    @NotNull
    public final k h() {
        k kVar = this.f153279c;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dialogLauncher");
        return null;
    }

    @NotNull
    public final x i() {
        x xVar = this.f153278b;
        if (xVar != null) {
            return xVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fragmentControllerNavigator");
        return null;
    }

    @NotNull
    public final f1 j() {
        f1 f1Var = this.f153282f;
        if (f1Var != null) {
            return f1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("globalCoroutineScope");
        return null;
    }

    @NotNull
    public final g k() {
        g gVar = this.f153280d;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("projectDestinationFactory");
        return null;
    }

    @lm.r
    public final boolean m(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String path = uri.getPath();
        if (path != null) {
            return f153276i.matcher(path).find();
        }
        return false;
    }

    public final void n(@NotNull com.planner5d.library.contest.data.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<set-?>");
        this.f153277a = iVar;
    }

    public final void o(@NotNull t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<set-?>");
        this.f153281e = tVar;
    }

    public final void p(@NotNull k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.f153279c = kVar;
    }

    public final void q(@NotNull x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<set-?>");
        this.f153278b = xVar;
    }

    public final void r(@NotNull f1 f1Var) {
        Intrinsics.checkNotNullParameter(f1Var, "<set-?>");
        this.f153282f = f1Var;
    }

    public final void s(@NotNull g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        this.f153280d = gVar;
    }
}
