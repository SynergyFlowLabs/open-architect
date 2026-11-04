package com.planner5d.library.activity.fragment.spaces.folder;

import android.os.Bundle;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.activity.fragment.dialog.k;
import com.planner5d.library.activity.fragment.dialog.message.ConfirmDeleteMessageRedesign;
import com.planner5d.library.activity.fragment.dialog.u;
import com.planner5d.library.activity.fragment.spaces.documents.r;
import com.planner5d.library.model.manager.statistics.events.m3;
import com.planner5d.library.model.manager.statistics.events.n3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.r1;
import kotlin.text.StringsKt;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class i extends f2 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f136336w = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.spaces.documents.c f136337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final k f136338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f136339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final n3 f136340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final m3 f136341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final c1<Boolean> f136342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<Boolean> f136343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final c1<Boolean> f136344h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<Boolean> f136345i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final c1<Pair<r, String>> f136346j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<Pair<r, String>> f136347k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private String f136348l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private String f136349m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private String f136350n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final List<String> f136351o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private String f136352s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private String f136353t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f136354v;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.spaces.folder.FolderEditViewModel$onDeleteClick$1$1", f = "FolderEditViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.C0}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f136355a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f136357c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f136357c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return i.this.new a(this.f136357c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f136355a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.manager.spaces.documents.c cVar = i.this.f136337a;
                String str = this.f136357c;
                this.f136355a = 1;
                if (cVar.p0(str, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            i.this.f136342f.o(kotlin.coroutines.jvm.internal.b.a(true));
            i.this.f136340d.i1(n3.a.delete, n3.c.folder);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.spaces.folder.FolderEditViewModel$saveChanges$1", f = "FolderEditViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160702k0, 90}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f136358a;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return i.this.new b(dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
        
            if (r8.j0(r1, r2, r7) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0093, code lost:
        
            if (r8.m1(r1, r4, r5, r7) == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 217
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.spaces.folder.i.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.spaces.folder.FolderEditViewModel$setData$1", f = "FolderEditViewModel.kt", i = {0}, l = {53}, m = "invokeSuspend", n = {"folderHash"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nFolderEditViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FolderEditViewModel.kt\ncom/planner5d/library/activity/fragment/spaces/folder/FolderEditViewModel$setData$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,127:1\n1#2:128\n295#3,2:129\n*S KotlinDebug\n*F\n+ 1 FolderEditViewModel.kt\ncom/planner5d/library/activity/fragment/spaces/folder/FolderEditViewModel$setData$1\n*L\n59#1:129,2\n*E\n"})
    static final class c extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f136360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f136361b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bundle f136362c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ i f136363d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Bundle bundle, i iVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f136362c = bundle;
            this.f136363d = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f136362c, this.f136363d, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String string;
            String str;
            String strO;
            Object obj2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f136361b;
            if (i10 == 0) {
                ResultKt.m(obj);
                Bundle bundle = this.f136362c;
                if (bundle == null || (string = bundle.getString(com.planner5d.library.services.r.folderHash.f224891a)) == null) {
                    return Unit.f312394a;
                }
                com.planner5d.library.model.manager.spaces.documents.c cVar = this.f136363d.f136337a;
                this.f136360a = string;
                this.f136361b = 1;
                Object objI0 = cVar.I0(string, this);
                if (objI0 == objL) {
                    return objL;
                }
                str = string;
                obj = objI0;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.f136360a;
                ResultKt.m(obj);
            }
            com.planner5d.library.database.model.spaces.documents.c cVar2 = (com.planner5d.library.database.model.spaces.documents.c) obj;
            if (cVar2 == null) {
                return Unit.f312394a;
            }
            this.f136363d.f136350n = str;
            i iVar = this.f136363d;
            String strQ = cVar2.q();
            if (strQ == null) {
                strQ = "";
            }
            iVar.f136352s = strQ;
            i iVar2 = this.f136363d;
            iVar2.f136348l = iVar2.f136352s;
            this.f136363d.f136351o.clear();
            List<String> listT = cVar2.t();
            if (listT != null) {
                kotlin.coroutines.jvm.internal.b.a(this.f136363d.f136351o.addAll(listT));
            }
            i iVar3 = this.f136363d;
            List<String> listT2 = cVar2.t();
            if (listT2 != null) {
                Iterator<T> it = listT2.iterator();
                while (true) {
                    obj2 = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (StringsKt.V2((String) next, "color", false, 2, null)) {
                        obj2 = next;
                        break;
                    }
                }
                strO = (String) obj2;
                if (strO == null) {
                    strO = r.COLOR_1.o();
                }
            } else {
                strO = r.COLOR_1.o();
            }
            iVar3.f136353t = strO;
            i iVar4 = this.f136363d;
            iVar4.f136349m = iVar4.f136353t;
            r1.a(this.f136363d.f136351o).remove(this.f136363d.f136349m);
            this.f136363d.f136346j.o(TuplesKt.to(r.f136236c.b(this.f136363d.f136353t), this.f136363d.f136352s));
            this.f136363d.v0();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public i(@NotNull com.planner5d.library.model.manager.spaces.documents.c documentsManager, @NotNull k dialogLauncher, @NotNull com.planner5d.library.application.b application, @NotNull n3 statistics, @NotNull m3 editStatistics) {
        Intrinsics.checkNotNullParameter(documentsManager, "documentsManager");
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(statistics, "statistics");
        Intrinsics.checkNotNullParameter(editStatistics, "editStatistics");
        this.f136337a = documentsManager;
        this.f136338b = dialogLauncher;
        this.f136339c = application;
        this.f136340d = statistics;
        this.f136341e = editStatistics;
        Boolean bool = Boolean.FALSE;
        c1<Boolean> c1Var = new c1<>(bool);
        this.f136342f = c1Var;
        this.f136343g = c1Var;
        c1<Boolean> c1Var2 = new c1<>(bool);
        this.f136344h = c1Var2;
        this.f136345i = c1Var2;
        c1<Pair<r, String>> c1Var3 = new c1<>();
        this.f136346j = c1Var3;
        this.f136347k = c1Var3;
        this.f136348l = "";
        this.f136350n = "";
        this.f136351o = new ArrayList();
        this.f136352s = "";
        this.f136353t = r.COLOR_1.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(i iVar, String str, Boolean bool) {
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            kotlinx.coroutines.k.f(g2.a(iVar), null, null, iVar.new a(str, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0() {
        boolean zAreEqual = Intrinsics.areEqual(this.f136349m, this.f136353t);
        boolean z10 = false;
        boolean z11 = this.f136352s.length() > 0 && !Intrinsics.areEqual(this.f136348l, this.f136352s);
        c1<Boolean> c1Var = this.f136344h;
        if (!this.f136354v ? z11 || (!zAreEqual && this.f136352s.length() > 0) : !zAreEqual && z11) {
            z10 = true;
        }
        c1Var.o(Boolean.valueOf(z10));
    }

    @NotNull
    public final androidx.lifecycle.w0<Boolean> o0() {
        return this.f136345i;
    }

    @NotNull
    public final androidx.lifecycle.w0<Boolean> p0() {
        return this.f136343g;
    }

    @NotNull
    public final androidx.lifecycle.w0<Pair<r, String>> q0() {
        return this.f136347k;
    }

    public final void r0() {
        final String str = this.f136350n;
        if (str.length() > 0) {
            ConfirmDeleteMessageRedesign.Companion.a(this.f136338b, this.f136339c.getString(com.planner5d.library.f.s.f169540xc), new u() { // from class: com.planner5d.library.activity.fragment.spaces.folder.h
                @Override // com.planner5d.library.activity.fragment.dialog.u
                public final void a(Object obj) {
                    i.s0(this.f136334a, str, (Boolean) obj);
                }
            });
        }
    }

    public final void t0() {
        kotlinx.coroutines.k.f(g2.a(this), null, null, new b(null), 3, null);
    }

    public final void u0(boolean z10, @Nullable Bundle bundle) {
        this.f136354v = z10;
        if (z10) {
            return;
        }
        kotlinx.coroutines.k.f(g2.a(this), null, null, new c(bundle, this, null), 3, null);
    }

    public final void w0(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f136352s = name;
        v0();
        this.f136341e.H0(m3.a.change_name, m3.c.folder);
    }

    public final void x0(@NotNull r color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.f136353t = color.o();
        v0();
    }
}
