package com.planner5d.library.activity.fragment.spaces.preview;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.activity.helper.r;
import com.planner5d.library.services.utility.j;
import com.planner5d.library.services.utility.s;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class b extends f2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f136374e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.spaces.documents.c f136375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final r f136376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final c1<Bitmap> f136377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<Bitmap> f136378d;

    @f(c = "com.planner5d.library.activity.fragment.spaces.preview.DocumentPreviewViewModel$loadData$1", f = "DocumentPreviewViewModel.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<s0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f136379a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f136381c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f136382d;

        /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.spaces.preview.b$a$a, reason: collision with other inner class name */
        @f(c = "com.planner5d.library.activity.fragment.spaces.preview.DocumentPreviewViewModel$loadData$1$1", f = "DocumentPreviewViewModel.kt", i = {1}, l = {40, 42}, m = "invokeSuspend", n = {"document"}, s = {"L$0"})
        @SourceDebugExtension({"SMAP\nDocumentPreviewViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocumentPreviewViewModel.kt\ncom/planner5d/library/activity/fragment/spaces/preview/DocumentPreviewViewModel$loadData$1$1\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,51:1\n29#2:52\n*S KotlinDebug\n*F\n+ 1 DocumentPreviewViewModel.kt\ncom/planner5d/library/activity/fragment/spaces/preview/DocumentPreviewViewModel$loadData$1$1\n*L\n45#1:52\n*E\n"})
        static final class C1499a extends o implements Function2<s0, d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f136383a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f136384b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f136385c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f136386d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Context f136387e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1499a(b bVar, String str, Context context, d<? super C1499a> dVar) {
                super(2, dVar);
                this.f136385c = bVar;
                this.f136386d = str;
                this.f136387e = context;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new C1499a(this.f136385c, this.f136386d, this.f136387e, dVar);
            }

            /* JADX WARN: Code duplicated, block: B:28:0x0073  */
            /* JADX WARN: Code duplicated, block: B:30:0x0076  */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                com.planner5d.library.database.model.spaces.documents.a aVar;
                com.planner5d.library.database.model.spaces.documents.a aVar2;
                String strT;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f136384b;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    com.planner5d.library.model.manager.spaces.documents.c cVar = this.f136385c.f136375a;
                    String str = this.f136386d;
                    this.f136384b = 1;
                    obj = cVar.y0(str, this);
                    if (obj != objL) {
                    }
                    return objL;
                }
                if (i10 == 1) {
                    ResultKt.m(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (com.planner5d.library.database.model.spaces.documents.a) this.f136383a;
                    ResultKt.m(obj);
                }
                aVar = aVar2;
                strT = aVar.t();
                if (strT == null) {
                    return Unit.f312394a;
                }
                this.f136385c.f136377c.o(this.f136385c.f136376b.z(this.f136387e, Uri.parse(strT)));
                return Unit.f312394a;
                aVar = (com.planner5d.library.database.model.spaces.documents.a) obj;
                if (aVar == null) {
                    return Unit.f312394a;
                }
                if (!aVar.p() || !aVar.u()) {
                    com.planner5d.library.model.manager.spaces.documents.c cVar2 = this.f136385c.f136375a;
                    this.f136383a = aVar;
                    this.f136384b = 2;
                    if (cVar2.q0(aVar, this) != objL) {
                        aVar2 = aVar;
                        aVar = aVar2;
                    }
                    return objL;
                }
                strT = aVar.t();
                if (strT == null) {
                    return Unit.f312394a;
                }
                this.f136385c.f136377c.o(this.f136385c.f136376b.z(this.f136387e, Uri.parse(strT)));
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
                return ((C1499a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Context context, d<? super a> dVar) {
            super(2, dVar);
            this.f136381c = str;
            this.f136382d = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return b.this.new a(this.f136381c, this.f136382d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f136379a;
            if (i10 == 0) {
                ResultKt.m(obj);
                z1 z1VarH = s.f229729a.h();
                C1499a c1499a = new C1499a(b.this, this.f136381c, this.f136382d, null);
                this.f136379a = 1;
                if (i.h(z1VarH, c1499a, this) == objL) {
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
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public b(@NotNull com.planner5d.library.model.manager.spaces.documents.c documentsManager, @NotNull r fileHelper) {
        Intrinsics.checkNotNullParameter(documentsManager, "documentsManager");
        Intrinsics.checkNotNullParameter(fileHelper, "fileHelper");
        this.f136375a = documentsManager;
        this.f136376b = fileHelper;
        c1<Bitmap> c1Var = new c1<>();
        this.f136377c = c1Var;
        this.f136378d = c1Var;
    }

    private final void Y(String str, Context context) {
        k.f(g2.a(this), null, null, new a(str, context, null), 3, null);
    }

    @NotNull
    public final androidx.lifecycle.w0<Bitmap> X() {
        return this.f136378d;
    }

    public final void Z(@Nullable Bundle bundle, @NotNull Context context) {
        String strT;
        Intrinsics.checkNotNullParameter(context, "context");
        if (bundle == null || (strT = new j(bundle).t(com.planner5d.library.services.r.documentHash, null)) == null) {
            return;
        }
        Y(strT, context);
    }
}
