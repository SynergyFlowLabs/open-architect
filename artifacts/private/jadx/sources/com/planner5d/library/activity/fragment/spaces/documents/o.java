package com.planner5d.library.activity.fragment.spaces.documents;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.dialog.message.ConfirmDeleteMessageRedesign;
import com.planner5d.library.activity.fragment.dialog.u;
import com.planner5d.library.activity.fragment.list.b0;
import com.planner5d.library.activity.fragment.list.g0;
import com.planner5d.library.activity.fragment.list.h0;
import com.planner5d.library.activity.fragment.list.l1;
import com.planner5d.library.activity.fragment.list.u0;
import com.planner5d.library.activity.fragment.projects.ProjectsPagesFragment;
import com.planner5d.library.activity.fragment.spaces.file.DocumentEdit;
import com.planner5d.library.activity.fragment.spaces.folder.FolderEdit;
import com.planner5d.library.activity.fragment.spaces.preview.DocumentPreview;
import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.model.manager.statistics.events.n3;
import com.planner5d.library.model.manager.y1;
import com.planner5d.library.services.utility.c0;
import com.planner5d.library.widget.EnhancedRecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nDocumentsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocumentsViewModel.kt\ncom/planner5d/library/activity/fragment/spaces/documents/DocumentsViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n774#2:384\n865#2,2:385\n1557#2:387\n1628#2,3:388\n1557#2:391\n1628#2,3:392\n774#2:395\n865#2,2:396\n808#2,11:398\n1557#2:410\n1628#2,3:411\n1#3:409\n*S KotlinDebug\n*F\n+ 1 DocumentsViewModel.kt\ncom/planner5d/library/activity/fragment/spaces/documents/DocumentsViewModel\n*L\n71#1:384\n71#1:385,2\n82#1:387\n82#1:388,3\n84#1:391\n84#1:392,3\n94#1:395\n94#1:396,2\n181#1:398,11\n181#1:410\n181#1:411,3\n*E\n"})
public final class o extends f2 implements g0, n3 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f136161k = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ n3 f136162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.spaces.documents.c f136163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final y1 f136164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final x f136165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.helper.r f136166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.dialog.k f136167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final c1<Boolean> f136168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final c1<Integer> f136169h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.projects.l f136170i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final List<com.planner5d.library.database.model.spaces.documents.c> f136171j;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.spaces.documents.DocumentsViewModel", f = "DocumentsViewModel.kt", i = {0}, l = {331}, m = "chooseFile", n = {"strategy"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f136172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f136173b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f136175d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f136173b = obj;
            this.f136175d |= Integer.MIN_VALUE;
            return o.this.b0(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.spaces.documents.DocumentsViewModel$chooseFileToAdd$1", f = "DocumentsViewModel.kt", i = {}, l = {307}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f136176a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.j f136178c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.planner5d.library.database.model.j jVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f136178c = jVar;
            int i10 = 5 << 2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return o.this.new b(this.f136178c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f136176a;
            if (i10 == 0) {
                ResultKt.m(obj);
                o oVar = o.this;
                qa.a aVar = new qa.a();
                this.f136176a = 1;
                obj = oVar.b0(aVar, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            Uri uri = (Uri) obj;
            if (uri != null) {
                boolean z10 = false;
                o.o0(o.this, this.f136178c, uri, n3.d.file, null, 8, null);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.spaces.documents.DocumentsViewModel$chooseImageToAdd$1", f = "DocumentsViewModel.kt", i = {}, l = {315}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f136179a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.j f136181c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(com.planner5d.library.database.model.j jVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f136181c = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return o.this.new c(this.f136181c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f136179a;
            if (i10 == 0) {
                ResultKt.m(obj);
                o oVar = o.this;
                qa.c cVar = new qa.c(false, null, 2, null);
                this.f136179a = 1;
                obj = oVar.b0(cVar, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            Uri uri = (Uri) obj;
            if (uri != null) {
                o.o0(o.this, this.f136181c, uri, n3.d.gallery, null, 8, null);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.spaces.documents.DocumentsViewModel$getDocumentState$originalState$1", f = "DocumentsViewModel.kt", i = {}, l = {362}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f136182a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.spaces.documents.a f136184c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(com.planner5d.library.database.model.spaces.documents.a aVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f136184c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return o.this.new d(this.f136184c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f136182a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.manager.spaces.documents.c cVar = o.this.f136163b;
                com.planner5d.library.database.model.spaces.documents.a aVar = this.f136184c;
                this.f136182a = 1;
                if (cVar.o1(aVar, this) == objL) {
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
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.spaces.documents.DocumentsViewModel$getDocumentState$originalState$2$1", f = "DocumentsViewModel.kt", i = {}, l = {370}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f136185a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.spaces.documents.a f136187c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(com.planner5d.library.database.model.spaces.documents.a aVar, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f136187c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return o.this.new e(this.f136187c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f136185a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.manager.spaces.documents.c cVar = o.this.f136163b;
                com.planner5d.library.database.model.spaces.documents.a aVar = this.f136187c;
                this.f136185a = 1;
                if (cVar.g1(aVar, this) == objL) {
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

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.spaces.documents.DocumentsViewModel$getDocumentState$originalState$3$1", f = "DocumentsViewModel.kt", i = {}, l = {376}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f136188a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.spaces.documents.a f136190c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(com.planner5d.library.database.model.spaces.documents.a aVar, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f136190c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return o.this.new f(this.f136190c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f136188a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.manager.spaces.documents.c cVar = o.this.f136163b;
                com.planner5d.library.database.model.spaces.documents.a aVar = this.f136190c;
                this.f136188a = 1;
                if (cVar.o1(aVar, this) == objL) {
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
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.spaces.documents.DocumentsViewModel", f = "DocumentsViewModel.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2}, l = {71, com.planner5d.library.engine.input.f.b.f160716p, 99}, m = "loadItems", n = {"this", "sortOrder", "filter", "parentFolderHash", "this", "sortOrder", "filter", "parentFolderHash", "folders", "this"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0"})
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f136191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f136192b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f136193c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f136194d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f136195e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f136196f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f136197g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f136199i;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f136197g = obj;
            this.f136199i |= Integer.MIN_VALUE;
            return o.this.h(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.spaces.documents.DocumentsViewModel$navigateToEditOrCreate$1", f = "DocumentsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nDocumentsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocumentsViewModel.kt\ncom/planner5d/library/activity/fragment/spaces/documents/DocumentsViewModel$navigateToEditOrCreate$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"})
    static final class h extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f136200a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bundle f136202c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f136203d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.j f136204e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Bundle bundle, boolean z10, com.planner5d.library.database.model.j jVar, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f136202c = bundle;
            this.f136203d = z10;
            this.f136204e = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return o.this.new h(this.f136202c, this.f136203d, this.f136204e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Bundle bundle;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f136200a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            x xVar = o.this.f136165d;
            com.planner5d.library.activity.helper.event.content.c cVarN = new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) FolderEdit.class, this.f136202c).n(this.f136203d ? com.planner5d.library.f.s.Xr : com.planner5d.library.f.s.B7);
            o oVar = o.this;
            com.planner5d.library.database.model.j jVar = this.f136204e;
            if (jVar == null || (bundle = new com.planner5d.library.services.utility.i().h(com.planner5d.library.services.r.folder, jVar.b()).a()) == null) {
                bundle = new Bundle();
            }
            x.g(xVar, cVarN.k(oVar.k0(bundle)), false, 2, null);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.spaces.documents.DocumentsViewModel$onClickFolder$1", f = "DocumentsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f136205a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bundle f136207c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.j f136208d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Bundle bundle, com.planner5d.library.database.model.j jVar, kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
            this.f136207c = bundle;
            this.f136208d = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return o.this.new i(this.f136207c, this.f136208d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f136205a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            x xVar = o.this.f136165d;
            com.planner5d.library.activity.helper.event.content.c cVarP = u0.f134434a.a(new com.planner5d.library.services.utility.i(this.f136207c).b(com.planner5d.library.services.r.scrollPosition).h(com.planner5d.library.services.r.folder, this.f136208d.b()).a()).p(this.f136208d.getTitle());
            if (this.f136207c.getBoolean(com.planner5d.library.services.r.folderSelectionMode.f224891a, false)) {
                cVarP.m(com.planner5d.library.f.s.B2);
            }
            x.g(xVar, cVarP.k(o.this.k0(this.f136207c)), false, 2, null);
            o.this.i1(n3.a.open, n3.c.folder);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((i) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.spaces.documents.DocumentsViewModel$onClickItem$1", f = "DocumentsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f136209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f136210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ o f136211c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Bundle f136212d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Object obj, o oVar, Bundle bundle, kotlin.coroutines.d<? super j> dVar) {
            super(2, dVar);
            this.f136210b = obj;
            this.f136211c = oVar;
            this.f136212d = bundle;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new j(this.f136210b, this.f136211c, this.f136212d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f136209a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            Bundle bundle = new Bundle();
            String str = com.planner5d.library.services.r.documentHash.f224891a;
            Object obj2 = this.f136210b;
            com.planner5d.library.database.model.spaces.documents.a aVar = obj2 instanceof com.planner5d.library.database.model.spaces.documents.a ? (com.planner5d.library.database.model.spaces.documents.a) obj2 : null;
            bundle.putString(str, aVar != null ? aVar.o() : null);
            Object obj3 = this.f136210b;
            com.planner5d.library.database.model.spaces.documents.a aVar2 = obj3 instanceof com.planner5d.library.database.model.spaces.documents.a ? (com.planner5d.library.database.model.spaces.documents.a) obj3 : null;
            String strQ = aVar2 != null ? aVar2.q() : null;
            bundle.putString(com.planner5d.library.services.r.title.f224891a, strQ);
            x.g(this.f136211c.f136165d, new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) DocumentPreview.class, bundle).p(strQ).k(this.f136211c.k0(this.f136212d)), false, 2, null);
            this.f136211c.i1(n3.a.open, n3.c.document);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((j) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.spaces.documents.DocumentsViewModel$onClickItemMenu$1$1", f = "DocumentsViewModel.kt", i = {}, l = {223}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f136213a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f136215c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Object obj, kotlin.coroutines.d<? super k> dVar) {
            super(2, dVar);
            this.f136215c = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return o.this.new k(this.f136215c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f136213a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.manager.spaces.documents.c cVar = o.this.f136163b;
                com.planner5d.library.database.model.spaces.documents.a aVar = (com.planner5d.library.database.model.spaces.documents.a) this.f136215c;
                this.f136213a = 1;
                if (cVar.m0(aVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            o.this.i0().o(kotlin.coroutines.jvm.internal.b.a(true));
            o.this.i1(n3.a.delete, n3.c.document);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((k) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.spaces.documents.DocumentsViewModel$onRemoveSelectedClick$1", f = "DocumentsViewModel.kt", i = {}, l = {168, 171}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nDocumentsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocumentsViewModel.kt\ncom/planner5d/library/activity/fragment/spaces/documents/DocumentsViewModel$onRemoveSelectedClick$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,383:1\n1863#2,2:384\n*S KotlinDebug\n*F\n+ 1 DocumentsViewModel.kt\ncom/planner5d/library/activity/fragment/spaces/documents/DocumentsViewModel$onRemoveSelectedClick$1\n*L\n166#1:384,2\n*E\n"})
    static final class l extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f136216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f136217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f136218c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<Object> f136219d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f136220e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ o f136221f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(List<? extends Object> list, Function0<Unit> function0, o oVar, kotlin.coroutines.d<? super l> dVar) {
            super(2, dVar);
            this.f136219d = list;
            this.f136220e = function0;
            this.f136221f = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new l(this.f136219d, this.f136220e, this.f136221f, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0051  */
        /* JADX WARN: Code duplicated, block: B:20:0x0070  */
        /* JADX WARN: Code duplicated, block: B:30:0x0079 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:31:0x0095 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:32:0x009e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:33:0x0059 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:34:0x007d A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:36:0x004a A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0093 -> B:26:0x0096). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:34:0x007d
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                r6 = 3
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.f136218c
                r2 = 2
                int r6 = r6 >> r2
                r3 = 1
                if (r1 == 0) goto L37
                if (r1 == r3) goto L28
                if (r1 != r2) goto L1e
                r6 = 3
                java.lang.Object r1 = r7.f136217b
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r4 = r7.f136216a
                com.planner5d.library.activity.fragment.spaces.documents.o r4 = (com.planner5d.library.activity.fragment.spaces.documents.o) r4
                r6 = 1
                kotlin.ResultKt.m(r8)
                goto L96
            L1e:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "cosl o/feocir/rv/w ae e/o/nhs  lt/ukimb/teeeunoit /"
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L28:
                java.lang.Object r1 = r7.f136217b
                java.util.Iterator r1 = (java.util.Iterator) r1
                r6 = 3
                java.lang.Object r4 = r7.f136216a
                r6 = 6
                com.planner5d.library.activity.fragment.spaces.documents.o r4 = (com.planner5d.library.activity.fragment.spaces.documents.o) r4
                kotlin.ResultKt.m(r8)
                r6 = 5
                goto L70
            L37:
                kotlin.ResultKt.m(r8)
                r6 = 0
                java.util.List<java.lang.Object> r8 = r7.f136219d
                if (r8 == 0) goto L9e
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                com.planner5d.library.activity.fragment.spaces.documents.o r1 = r7.f136221f
                r6 = 7
                java.util.Iterator r8 = r8.iterator()
                r4 = r1
                r1 = r8
            L4a:
                r6 = 7
                boolean r8 = r1.hasNext()
                if (r8 == 0) goto L9e
                java.lang.Object r8 = r1.next()
                boolean r5 = r8 instanceof com.planner5d.library.database.model.spaces.documents.a
                if (r5 == 0) goto L79
                r6 = 1
                com.planner5d.library.model.manager.spaces.documents.c r5 = com.planner5d.library.activity.fragment.spaces.documents.o.Y(r4)
                com.planner5d.library.database.model.spaces.documents.a r8 = (com.planner5d.library.database.model.spaces.documents.a) r8
                r7.f136216a = r4
                r6 = 4
                r7.f136217b = r1
                r7.f136218c = r3
                r6 = 1
                java.lang.Object r8 = r5.m0(r8, r7)
                r6 = 0
                if (r8 != r0) goto L70
                goto L95
            L70:
                com.planner5d.library.model.manager.statistics.events.n3$a r8 = com.planner5d.library.model.manager.statistics.events.n3.a.delete
                com.planner5d.library.model.manager.statistics.events.n3$c r5 = com.planner5d.library.model.manager.statistics.events.n3.c.document
                r4.i1(r8, r5)
                r6 = 7
                goto L4a
            L79:
                boolean r5 = r8 instanceof com.planner5d.library.database.model.spaces.documents.c
                if (r5 == 0) goto L4a
                com.planner5d.library.model.manager.spaces.documents.c r5 = com.planner5d.library.activity.fragment.spaces.documents.o.Y(r4)
                com.planner5d.library.database.model.spaces.documents.c r8 = (com.planner5d.library.database.model.spaces.documents.c) r8
                java.lang.String r8 = r8.p()
                r7.f136216a = r4
                r6 = 3
                r7.f136217b = r1
                r7.f136218c = r2
                r6 = 6
                java.lang.Object r8 = r5.p0(r8, r7)
                if (r8 != r0) goto L96
            L95:
                return r0
            L96:
                com.planner5d.library.model.manager.statistics.events.n3$a r8 = com.planner5d.library.model.manager.statistics.events.n3.a.delete
                com.planner5d.library.model.manager.statistics.events.n3$c r5 = com.planner5d.library.model.manager.statistics.events.n3.c.folder
                r4.i1(r8, r5)
                goto L4a
            L9e:
                kotlin.jvm.functions.Function0<kotlin.Unit> r7 = r7.f136220e
                r7.invoke()
                kotlin.Unit r7 = kotlin.Unit.f312394a
                r6 = 6
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.spaces.documents.o.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((l) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.spaces.documents.DocumentsViewModel$synchronizeContentData$1", f = "DocumentsViewModel.kt", i = {}, l = {androidx.media3.extractor.metadata.dvbsi.b.f67479d}, m = "invokeSuspend", n = {}, s = {})
    static final class m extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f136222a;

        m(kotlin.coroutines.d<? super m> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return o.this.new m(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f136222a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.manager.spaces.documents.c cVar = o.this.f136163b;
                this.f136222a = 1;
                if (cVar.i1(this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            o.this.i0().o(kotlin.coroutines.jvm.internal.b.a(true));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((m) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.spaces.documents.DocumentsViewModel$takeAnImageToAdd$1", f = "DocumentsViewModel.kt", i = {}, l = {323}, m = "invokeSuspend", n = {}, s = {})
    static final class n extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f136224a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.j f136226c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(com.planner5d.library.database.model.j jVar, kotlin.coroutines.d<? super n> dVar) {
            super(2, dVar);
            this.f136226c = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return o.this.new n(this.f136226c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f136224a;
            if (i10 == 0) {
                ResultKt.m(obj);
                o oVar = o.this;
                qa.c cVar = new qa.c(true, new String[0]);
                this.f136224a = 1;
                obj = oVar.b0(cVar, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            Uri uri = (Uri) obj;
            if (uri != null) {
                o.o0(o.this, this.f136226c, uri, n3.d.camera, null, 8, null);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((n) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public o(@NotNull com.planner5d.library.model.manager.spaces.documents.c documentsManager, @NotNull y1 menuManager, @NotNull x navigator, @NotNull com.planner5d.library.activity.helper.r fileHelper, @NotNull com.planner5d.library.activity.fragment.dialog.k dialogLauncher, @NotNull n3 statisticsEventDocuments) {
        Intrinsics.checkNotNullParameter(documentsManager, "documentsManager");
        Intrinsics.checkNotNullParameter(menuManager, "menuManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(fileHelper, "fileHelper");
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        Intrinsics.checkNotNullParameter(statisticsEventDocuments, "statisticsEventDocuments");
        this.f136162a = statisticsEventDocuments;
        this.f136163b = documentsManager;
        this.f136164c = menuManager;
        this.f136165d = navigator;
        this.f136166e = fileHelper;
        this.f136167f = dialogLauncher;
        this.f136168g = new c1<>(Boolean.FALSE);
        this.f136169h = new c1<>(1);
        this.f136170i = new com.planner5d.library.activity.fragment.projects.l();
        this.f136171j = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object b0(qa.e eVar, kotlin.coroutines.d<? super Uri> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f136175d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f136175d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objL = aVar.f136173b;
        Object objL2 = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f136175d;
        try {
            if (i11 == 0) {
                ResultKt.m(objL);
                c0 c0Var = c0.f225068a;
                Observable<Uri> observableG = this.f136166e.G(eVar, null);
                aVar.f136172a = eVar;
                aVar.f136175d = 1;
                objL = c0Var.l(observableG, aVar);
                if (objL == objL2) {
                    return objL2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eVar = (qa.e) aVar.f136172a;
                ResultKt.m(objL);
            }
            return (Uri) objL;
        } catch (Throwable th2) {
            timber.log.b.f381052a.f(th2, "Error while choosing file with strategy:" + j1.d(eVar.getClass()).Q(), new Object[0]);
            return null;
        }
    }

    private final void c0(com.planner5d.library.database.model.j jVar) {
        kotlinx.coroutines.k.f(g2.a(this), null, null, new b(jVar, null), 3, null);
    }

    private final void d0(com.planner5d.library.database.model.j jVar) {
        kotlinx.coroutines.k.f(g2.a(this), null, null, new c(jVar, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g0(o oVar, com.planner5d.library.database.model.spaces.documents.a aVar) {
        kotlinx.coroutines.k.f(g2.a(oVar), null, null, oVar.new e(aVar, null), 3, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h0(o oVar, com.planner5d.library.database.model.spaces.documents.a aVar) {
        kotlinx.coroutines.k.f(g2.a(oVar), null, null, oVar.new f(aVar, null), 3, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.planner5d.library.activity.helper.event.content.c k0(Bundle bundle) {
        boolean zA = new com.planner5d.library.services.utility.j(bundle).a(com.planner5d.library.services.r.folder);
        Class cls = zA ? Documents.class : ProjectsPagesFragment.class;
        if (!zA) {
            com.planner5d.library.services.utility.i iVar = new com.planner5d.library.services.utility.i();
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.tab;
            com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.documentsList;
            bundle = iVar.t(rVar, rVar2).h(rVar2, bundle).a();
        }
        return new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) cls, bundle).o(this.f136164c.c()).j(this.f136164c.f());
    }

    private final Bundle l0(com.planner5d.library.database.model.j jVar) {
        Bundle bundle = new Bundle();
        if (jVar != null) {
            bundle.putBundle(com.planner5d.library.services.r.folder.f224891a, jVar.b());
        }
        return bundle;
    }

    private final Bundle m0(com.planner5d.library.database.model.spaces.documents.a aVar) {
        Bundle bundle = new Bundle();
        String strN = aVar.n();
        if (strN != null) {
            com.planner5d.library.database.model.spaces.documents.c cVar = new com.planner5d.library.database.model.spaces.documents.c(null, null, null, null, null, null, null, 127, null);
            cVar.x(strN);
            cVar.A(aVar.s());
            bundle.putBundle(com.planner5d.library.services.r.folder.f224891a, cVar.b());
        }
        return bundle;
    }

    private final void n0(com.planner5d.library.database.model.j jVar, Uri uri, n3.d dVar, Bundle bundle) {
        bundle.putBoolean(com.planner5d.library.services.r.createDocument.f224891a, true);
        bundle.putParcelable(com.planner5d.library.services.r.uri.f224891a, uri);
        String str = com.planner5d.library.services.r.folderHash.f224891a;
        com.planner5d.library.database.model.spaces.documents.c cVar = jVar instanceof com.planner5d.library.database.model.spaces.documents.c ? (com.planner5d.library.database.model.spaces.documents.c) jVar : null;
        bundle.putString(str, cVar != null ? cVar.p() : null);
        bundle.putSerializable(com.planner5d.library.services.r.source.f224891a, dVar);
        int i10 = 0 & 2;
        x.g(this.f136165d, new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) DocumentEdit.class, bundle).n(com.planner5d.library.f.s.Vr).k(k0(l0(jVar))), false, 2, null);
    }

    static /* synthetic */ void o0(o oVar, com.planner5d.library.database.model.j jVar, Uri uri, n3.d dVar, Bundle bundle, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            bundle = new Bundle();
        }
        oVar.n0(jVar, uri, dVar, bundle);
    }

    private final void p0(com.planner5d.library.database.model.spaces.documents.a aVar) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(com.planner5d.library.services.r.createDocument.f224891a, false);
        bundle.putString(com.planner5d.library.services.r.documentHash.f224891a, aVar.o());
        x.g(this.f136165d, new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) DocumentEdit.class, bundle).n(com.planner5d.library.f.s.D7).k(k0(m0(aVar))), false, 2, null);
    }

    private final void q0(boolean z10, Bundle bundle, com.planner5d.library.database.model.j jVar) {
        kotlinx.coroutines.k.f(g2.a(this), null, null, new h(bundle, z10, jVar, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(o oVar, Object obj, Boolean bool) {
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            kotlinx.coroutines.k.f(g2.a(oVar), null, null, oVar.new k(obj, null), 3, null);
        }
    }

    private final void u0(com.planner5d.library.database.model.j jVar) {
        kotlinx.coroutines.k.f(g2.a(this), null, null, new n(jVar, null), 3, null);
    }

    @Override // com.planner5d.library.activity.fragment.list.g0
    public void E(@NotNull com.planner5d.library.services.utility.i builder, @Nullable Bundle bundle) {
        long[] longArray;
        Intrinsics.checkNotNullParameter(builder, "builder");
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.selectedProjectIds;
        if (bundle == null || (longArray = bundle.getLongArray(rVar.f224891a)) == null) {
            longArray = new long[0];
        }
        builder.q(rVar, longArray);
    }

    @Override // com.planner5d.library.activity.fragment.list.g0
    public void F(@Nullable Bundle bundle, @Nullable com.planner5d.library.database.model.j jVar, @Nullable l1.e eVar, @NotNull Function0<Unit> onMoved) {
        Intrinsics.checkNotNullParameter(onMoved, "onMoved");
    }

    @Override // com.planner5d.library.activity.fragment.list.g0
    public void J(@NotNull Bundle state, @NotNull com.planner5d.library.database.model.j folder) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(folder, "folder");
        kotlinx.coroutines.k.f(g2.a(this), null, null, new i(state, folder, null), 3, null);
    }

    @Override // com.planner5d.library.activity.fragment.list.g0
    public void L() {
        kotlinx.coroutines.k.f(g2.a(this), null, null, new m(null), 3, null);
    }

    @Override // com.planner5d.library.activity.fragment.list.g0
    public int N() {
        return com.planner5d.library.database.model.g.TYPE_DOCUMENTS.n();
    }

    @Override // com.planner5d.library.activity.fragment.list.g0
    @NotNull
    public int[] Q() {
        return new int[0];
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0067  */
    @Override // com.planner5d.library.activity.fragment.list.g0
    public void T(@NotNull Bundle state, @Nullable List<? extends Object> list) {
        ArrayList<Parcelable> arrayList;
        Intrinsics.checkNotNullParameter(state, "state");
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof com.planner5d.library.database.model.spaces.documents.c) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            if (arrayList2 != null) {
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((com.planner5d.library.database.model.spaces.documents.c) it.next()).b());
                }
                arrayList = new ArrayList<>(arrayList3);
            } else {
                arrayList = null;
            }
        } else {
            arrayList = null;
        }
        x xVar = this.f136165d;
        u0 u0Var = u0.f134434a;
        com.planner5d.library.services.utility.i iVarM = new com.planner5d.library.services.utility.i(state).m(com.planner5d.library.services.r.folderSelectionMode, true);
        if (arrayList != null) {
            iVarM.k(com.planner5d.library.services.r.selectedFolders, arrayList);
        }
        Unit unit = Unit.f312394a;
        x.g(xVar, u0Var.a(iVarM.a()).n(com.planner5d.library.f.s.B2).k(k0(state)), false, 2, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.n3
    public void T0(@Nullable n3.c cVar, @Nullable n3.d dVar) {
        this.f136162a.T0(cVar, dVar);
    }

    @Override // com.planner5d.library.activity.fragment.list.g0
    public void a(@NotNull Bundle state, @NotNull Object item) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(item, "item");
        int i10 = 5 & 0;
        kotlinx.coroutines.k.f(g2.a(this), null, null, new j(item, this, state, null), 3, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.n3
    public void e0(@Nullable n3.c cVar, @Nullable n3.b bVar) {
        this.f136162a.e0(cVar, bVar);
    }

    @Nullable
    public final androidx.lifecycle.w0<com.planner5d.library.activity.fragment.spaces.view.d> f0(@NotNull final com.planner5d.library.database.model.spaces.documents.a document) {
        com.planner5d.library.activity.fragment.spaces.view.d dVarE;
        Intrinsics.checkNotNullParameter(document, "document");
        androidx.lifecycle.w0<com.planner5d.library.activity.fragment.spaces.view.d> w0VarI0 = this.f136163b.i0(document);
        if (w0VarI0 != null) {
            return w0VarI0;
        }
        if (!document.u()) {
            dVarE = document.r() ? com.planner5d.library.activity.fragment.spaces.view.d.f136400c.e(new Function0() { // from class: com.planner5d.library.activity.fragment.spaces.documents.l
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return o.g0(this.f136155a, document);
                }
            }) : com.planner5d.library.activity.fragment.spaces.view.d.f136400c.i(new Function0() { // from class: com.planner5d.library.activity.fragment.spaces.documents.m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return o.h0(this.f136157a, document);
                }
            });
        } else if (document.r()) {
            dVarE = com.planner5d.library.activity.fragment.spaces.view.d.f136400c.h();
        } else {
            kotlinx.coroutines.k.f(g2.a(this), null, null, new d(document, null), 3, null);
            dVarE = com.planner5d.library.activity.fragment.spaces.view.d.a.k(com.planner5d.library.activity.fragment.spaces.view.d.f136400c, null, 1, null);
        }
        return this.f136163b.f1(document, dVarE);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x012c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0147 A[LOOP:0: B:49:0x0141->B:51:0x0147, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x0167  */
    /* JADX WARN: Code duplicated, block: B:56:0x017e A[LOOP:2: B:54:0x0178->B:56:0x017e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:78:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:84:0x0214  */
    /* JADX WARN: Code duplicated, block: B:87:0x022c  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x01d2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.planner5d.library.activity.fragment.list.g0
    @Nullable
    public Object h(@NotNull l1.j jVar, @NotNull l1.d<com.planner5d.library.database.model.j> dVar, @NotNull kotlin.coroutines.d<? super List<h0>> dVar2) {
        g gVar;
        l1.j jVar2;
        String str;
        l1.d<com.planner5d.library.database.model.j> dVar3;
        List arrayList;
        List listEmptyList;
        l1.d<com.planner5d.library.database.model.j> dVar4;
        String str2;
        o oVar;
        List list;
        List<T> listA;
        ArrayList arrayList2;
        Iterator it;
        List<h0> listC;
        ArrayList arrayList3;
        h0.a aVar;
        Object objZ0;
        h0.a aVar2;
        List<h0> list2;
        List<h0> list3;
        o oVar2;
        int i10;
        com.planner5d.library.database.model.spaces.documents.a aVar3;
        boolean z10;
        ArrayList arrayList4;
        Iterator<T> it2;
        o oVar3 = this;
        if (dVar2 instanceof g) {
            gVar = (g) dVar2;
            int i11 = gVar.f136199i;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f136199i = i11 - Integer.MIN_VALUE;
            } else {
                gVar = oVar3.new g(dVar2);
            }
        } else {
            gVar = oVar3.new g(dVar2);
        }
        Object objZ1 = gVar.f136197g;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i12 = gVar.f136199i;
        if (i12 == 0) {
            ResultKt.m(objZ1);
            com.planner5d.library.database.model.spaces.documents.c cVar = (com.planner5d.library.database.model.spaces.documents.c) dVar.b();
            String strP = cVar != null ? cVar.p() : null;
            com.planner5d.library.model.manager.spaces.documents.c cVar2 = oVar3.f136163b;
            gVar.f136191a = oVar3;
            jVar2 = jVar;
            gVar.f136192b = jVar2;
            gVar.f136193c = dVar;
            gVar.f136194d = strP;
            gVar.f136199i = 1;
            Object objD0 = cVar2.D0(gVar);
            if (objD0 != objL) {
                str = strP;
                objZ1 = objD0;
                dVar3 = dVar;
            }
            return objL;
        }
        if (i12 == 1) {
            String str3 = (String) gVar.f136194d;
            dVar3 = (l1.d) gVar.f136193c;
            jVar2 = (l1.j) gVar.f136192b;
            o oVar4 = (o) gVar.f136191a;
            ResultKt.m(objZ1);
            str = str3;
            oVar3 = oVar4;
        } else {
            if (i12 == 2) {
                list = (List) gVar.f136195e;
                str2 = (String) gVar.f136194d;
                dVar4 = (l1.d) gVar.f136193c;
                jVar2 = (l1.j) gVar.f136192b;
                oVar = (o) gVar.f136191a;
                ResultKt.m(objZ1);
                listEmptyList = (List) objZ1;
                arrayList = list;
                oVar3 = oVar;
                str = str2;
                dVar3 = dVar4;
                oVar3.f136171j.clear();
                oVar3.f136171j.addAll(arrayList);
                if (str == null) {
                    List<com.planner5d.library.database.model.spaces.documents.c> listD = oVar3.f136170i.d(arrayList);
                    arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listD, 10));
                    it2 = listD.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(new h0((com.planner5d.library.model.g<?>) new com.planner5d.library.model.g((com.planner5d.library.database.model.spaces.documents.c) it2.next(), 0, null, 4, null)));
                    }
                    listC = CollectionsKt.toMutableList((Collection) arrayList4);
                } else {
                    com.planner5d.library.activity.fragment.projects.l lVar = oVar3.f136170i;
                    List list4 = arrayList;
                    arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                    it = list4.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new com.planner5d.library.model.g((com.planner5d.library.database.model.spaces.documents.c) it.next(), 0, null, 4, null));
                    }
                    listC = lVar.c(jVar2, listEmptyList, arrayList2);
                }
                if (!dVar3.c()) {
                    h0.a aVar4 = h0.a.AddNew;
                    com.planner5d.library.services.utility.i iVar = new com.planner5d.library.services.utility.i();
                    com.planner5d.library.services.r rVar = com.planner5d.library.services.r.hasParent;
                    if (str != null || str.length() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    listC.add(0, new h0(aVar4, iVar.m(rVar, !z10).a()));
                }
                arrayList3 = new ArrayList();
                for (Object obj : listEmptyList) {
                    aVar3 = (com.planner5d.library.database.model.spaces.documents.a) obj;
                    if (!aVar3.r() && !aVar3.u()) {
                        arrayList3.add(obj);
                    }
                }
                if (arrayList3.isEmpty()) {
                    oVar3.f136169h.o(kotlin.coroutines.jvm.internal.b.f(0));
                    return listC;
                }
                aVar = h0.a.DocumentSynchronization;
                com.planner5d.library.model.manager.spaces.documents.c cVar3 = oVar3.f136163b;
                if (str == null) {
                    str = "";
                }
                gVar.f136191a = oVar3;
                gVar.f136192b = listC;
                gVar.f136193c = aVar;
                gVar.f136194d = listC;
                gVar.f136195e = null;
                gVar.f136196f = 0;
                gVar.f136199i = 3;
                objZ0 = cVar3.Z0(arrayList3, str, gVar);
                if (objZ0 != objL) {
                    aVar2 = aVar;
                    objZ1 = objZ0;
                    list2 = listC;
                    list3 = list2;
                    oVar2 = oVar3;
                    i10 = 0;
                }
                return objL;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = gVar.f136196f;
            list2 = (List) gVar.f136194d;
            aVar2 = (h0.a) gVar.f136193c;
            list3 = (List) gVar.f136192b;
            oVar2 = (o) gVar.f136191a;
            ResultKt.m(objZ1);
        }
        list2.add(i10, new h0(aVar2, objZ1));
        oVar2.f136169h.o(kotlin.coroutines.jvm.internal.b.f(1));
        return list3;
        arrayList = new ArrayList();
        for (Object obj2 : (Iterable) objZ1) {
            com.planner5d.library.database.model.spaces.documents.c cVar4 = (com.planner5d.library.database.model.spaces.documents.c) obj2;
            if (Intrinsics.areEqual(cVar4.r(), str) && ((listA = dVar3.a()) == 0 || !listA.contains(cVar4))) {
                arrayList.add(obj2);
            }
        }
        if (str == null || str.length() == 0) {
            listEmptyList = CollectionsKt.emptyList();
            oVar3.f136171j.clear();
            oVar3.f136171j.addAll(arrayList);
            if (str == null) {
                List<com.planner5d.library.database.model.spaces.documents.c> listD2 = oVar3.f136170i.d(arrayList);
                arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listD2, 10));
                it2 = listD2.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(new h0((com.planner5d.library.model.g<?>) new com.planner5d.library.model.g((com.planner5d.library.database.model.spaces.documents.c) it2.next(), 0, null, 4, null)));
                }
                listC = CollectionsKt.toMutableList((Collection) arrayList4);
            } else {
                com.planner5d.library.activity.fragment.projects.l lVar2 = oVar3.f136170i;
                List list5 = arrayList;
                arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5, 10));
                it = list5.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new com.planner5d.library.model.g((com.planner5d.library.database.model.spaces.documents.c) it.next(), 0, null, 4, null));
                }
                listC = lVar2.c(jVar2, listEmptyList, arrayList2);
            }
            if (!dVar3.c()) {
                h0.a aVar5 = h0.a.AddNew;
                com.planner5d.library.services.utility.i iVar2 = new com.planner5d.library.services.utility.i();
                com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.hasParent;
                if (str != null) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                listC.add(0, new h0(aVar5, iVar2.m(rVar2, !z10).a()));
            }
            arrayList3 = new ArrayList();
            while (r1.hasNext()) {
                aVar3 = (com.planner5d.library.database.model.spaces.documents.a) obj;
                if (!aVar3.r()) {
                }
            }
            if (arrayList3.isEmpty()) {
                oVar3.f136169h.o(kotlin.coroutines.jvm.internal.b.f(0));
                return listC;
            }
            aVar = h0.a.DocumentSynchronization;
            com.planner5d.library.model.manager.spaces.documents.c cVar5 = oVar3.f136163b;
            if (str == null) {
                str = "";
            }
            gVar.f136191a = oVar3;
            gVar.f136192b = listC;
            gVar.f136193c = aVar;
            gVar.f136194d = listC;
            gVar.f136195e = null;
            gVar.f136196f = 0;
            gVar.f136199i = 3;
            objZ0 = cVar5.Z0(arrayList3, str, gVar);
            if (objZ0 != objL) {
                aVar2 = aVar;
                objZ1 = objZ0;
                list2 = listC;
                list3 = list2;
                oVar2 = oVar3;
                i10 = 0;
                list2.add(i10, new h0(aVar2, objZ1));
                oVar2.f136169h.o(kotlin.coroutines.jvm.internal.b.f(1));
                return list3;
            }
        } else {
            com.planner5d.library.model.manager.spaces.documents.c cVar6 = oVar3.f136163b;
            gVar.f136191a = oVar3;
            gVar.f136192b = jVar2;
            gVar.f136193c = dVar3;
            gVar.f136194d = str;
            gVar.f136195e = arrayList;
            gVar.f136199i = 2;
            objZ1 = cVar6.z0(str, gVar);
            if (objZ1 != objL) {
                dVar4 = dVar3;
                str2 = str;
                oVar = oVar3;
                list = arrayList;
                listEmptyList = (List) objZ1;
                arrayList = list;
                oVar3 = oVar;
                str = str2;
                dVar3 = dVar4;
                oVar3.f136171j.clear();
                oVar3.f136171j.addAll(arrayList);
                if (str == null) {
                    List<com.planner5d.library.database.model.spaces.documents.c> listD3 = oVar3.f136170i.d(arrayList);
                    arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listD3, 10));
                    it2 = listD3.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(new h0((com.planner5d.library.model.g<?>) new com.planner5d.library.model.g((com.planner5d.library.database.model.spaces.documents.c) it2.next(), 0, null, 4, null)));
                    }
                    listC = CollectionsKt.toMutableList((Collection) arrayList4);
                } else {
                    com.planner5d.library.activity.fragment.projects.l lVar3 = oVar3.f136170i;
                    List list6 = arrayList;
                    arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list6, 10));
                    it = list6.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new com.planner5d.library.model.g((com.planner5d.library.database.model.spaces.documents.c) it.next(), 0, null, 4, null));
                    }
                    listC = lVar3.c(jVar2, listEmptyList, arrayList2);
                }
                if (!dVar3.c()) {
                    h0.a aVar6 = h0.a.AddNew;
                    com.planner5d.library.services.utility.i iVar3 = new com.planner5d.library.services.utility.i();
                    com.planner5d.library.services.r rVar3 = com.planner5d.library.services.r.hasParent;
                    if (str != null) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    listC.add(0, new h0(aVar6, iVar3.m(rVar3, !z10).a()));
                }
                arrayList3 = new ArrayList();
                while (r1.hasNext()) {
                    aVar3 = (com.planner5d.library.database.model.spaces.documents.a) obj;
                    if (!aVar3.r()) {
                    }
                }
                if (arrayList3.isEmpty()) {
                    oVar3.f136169h.o(kotlin.coroutines.jvm.internal.b.f(0));
                    return listC;
                }
                aVar = h0.a.DocumentSynchronization;
                com.planner5d.library.model.manager.spaces.documents.c cVar7 = oVar3.f136163b;
                if (str == null) {
                    str = "";
                }
                gVar.f136191a = oVar3;
                gVar.f136192b = listC;
                gVar.f136193c = aVar;
                gVar.f136194d = listC;
                gVar.f136195e = null;
                gVar.f136196f = 0;
                gVar.f136199i = 3;
                objZ0 = cVar7.Z0(arrayList3, str, gVar);
                if (objZ0 != objL) {
                    aVar2 = aVar;
                    objZ1 = objZ0;
                    list2 = listC;
                    list3 = list2;
                    oVar2 = oVar3;
                    i10 = 0;
                    list2.add(i10, new h0(aVar2, objZ1));
                    oVar2.f136169h.o(kotlin.coroutines.jvm.internal.b.f(1));
                    return list3;
                }
            }
        }
        return objL;
    }

    @NotNull
    public final c1<Boolean> i0() {
        return this.f136168g;
    }

    @Override // com.planner5d.library.model.manager.statistics.events.n3
    public void i1(@NotNull n3.a action, @Nullable n3.c cVar) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f136162a.i1(action, cVar);
    }

    @NotNull
    public final c1<Integer> j0() {
        return this.f136169h;
    }

    @Override // com.planner5d.library.activity.fragment.list.g0
    public boolean l(@NotNull List<? extends Object> selected) {
        Intrinsics.checkNotNullParameter(selected, "selected");
        return !CollectionsKt.subtract(this.f136171j, selected).isEmpty();
    }

    @Override // com.planner5d.library.activity.fragment.list.g0
    public boolean m(@NotNull Activity activity, @NotNull final Object item, @NotNull MenuItem itemMenu) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(itemMenu, "itemMenu");
        if (item instanceof com.planner5d.library.database.model.spaces.documents.a) {
            int itemId = itemMenu.getItemId();
            if (itemId == com.planner5d.library.f.j.S0) {
                p0((com.planner5d.library.database.model.spaces.documents.a) item);
            } else if (itemId == com.planner5d.library.f.j.f168173k1) {
                ConfirmDeleteMessageRedesign.Companion.a(this.f136167f, activity.getString(com.planner5d.library.f.s.Z6), new u() { // from class: com.planner5d.library.activity.fragment.spaces.documents.n
                    @Override // com.planner5d.library.activity.fragment.dialog.u
                    public final void a(Object obj) {
                        o.s0(this.f136159a, item, (Boolean) obj);
                    }
                });
            }
        }
        return false;
    }

    @Override // com.planner5d.library.activity.fragment.list.g0
    public void p(@NotNull Activity activity, @Nullable List<? extends Object> list, @NotNull Function0<Unit> onRemoved) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onRemoved, "onRemoved");
        int i10 = 7 & 0;
        kotlinx.coroutines.k.f(g2.a(this), null, null, new l(list, onRemoved, this, null), 3, null);
    }

    public final void r0(@NotNull MenuItem menuItem, @Nullable com.planner5d.library.database.model.j jVar) {
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId == com.planner5d.library.f.j.f168533z0) {
            c0(jVar);
            return;
        }
        if (itemId == com.planner5d.library.f.j.B0) {
            d0(jVar);
        } else if (itemId == com.planner5d.library.f.j.A0) {
            u0(jVar);
        } else if (itemId == com.planner5d.library.f.j.P0) {
            q0(true, new com.planner5d.library.services.utility.i().m(com.planner5d.library.services.r.createFolder, true).a(), jVar);
        }
    }

    public final void t0(@Nullable com.planner5d.library.database.model.j jVar, boolean z10) {
        com.planner5d.library.services.utility.i iVarM = new com.planner5d.library.services.utility.i().m(com.planner5d.library.services.r.createFolder, false);
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.folderHash;
        Intrinsics.checkNotNull(jVar, "null cannot be cast to non-null type com.planner5d.library.database.model.spaces.documents.DocumentFolder");
        com.planner5d.library.database.model.spaces.documents.c cVar = (com.planner5d.library.database.model.spaces.documents.c) jVar;
        Bundle bundleA = iVarM.j(rVar, cVar.p()).a();
        if (!z10) {
            cVar = null;
        }
        q0(false, bundleA, cVar);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.n3
    public void v(@NotNull n3.a action, @Nullable n3.c cVar, @Nullable n3.d dVar, @Nullable n3.b bVar) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f136162a.v(action, cVar, dVar, bVar);
    }

    @Override // com.planner5d.library.activity.fragment.list.g0
    @NotNull
    public EnhancedRecyclerView.e x() {
        return EnhancedRecyclerView.e.GRID;
    }

    @Override // com.planner5d.library.activity.fragment.list.g0
    public void z(@NotNull Bundle state, @NotNull l1.g button, @NotNull b0 actions, @Nullable com.planner5d.library.database.model.j jVar) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(actions, "actions");
    }
}
