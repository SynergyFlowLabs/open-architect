package com.planner5d.library.activity.fragment.spaces.file;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.activity.helper.r;
import com.planner5d.library.model.manager.statistics.events.m3;
import com.planner5d.library.model.manager.statistics.events.n3;
import com.planner5d.library.services.utility.s;
import java.util.Date;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nDocumentEditViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocumentEditViewModel.kt\ncom/planner5d/library/activity/fragment/spaces/file/DocumentEditViewModel\n+ 2 BundleParser.kt\ncom/planner5d/library/services/utility/BundleParser\n*L\n1#1,160:1\n57#2,18:161\n*S KotlinDebug\n*F\n+ 1 DocumentEditViewModel.kt\ncom/planner5d/library/activity/fragment/spaces/file/DocumentEditViewModel\n*L\n61#1:161,18\n*E\n"})
public final class i extends f2 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f136267v = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.spaces.documents.c f136268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final r f136269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final n3 f136270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final m3 f136271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final c1<Boolean> f136272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<Boolean> f136273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final c1<com.planner5d.library.activity.fragment.spaces.file.a> f136274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<com.planner5d.library.activity.fragment.spaces.file.a> f136275h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.projects.l f136276i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private n3.d f136277j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private com.planner5d.library.database.model.spaces.documents.a f136278k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f136279l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Uri f136280m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private List<com.planner5d.library.database.model.spaces.documents.c> f136281n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private Bitmap f136282o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.database.model.spaces.documents.c f136283s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private String f136284t;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.spaces.file.DocumentEditViewModel$finish$1", f = "DocumentEditViewModel.kt", i = {}, l = {150, 151, androidx.media2.widget.f.i.f59793p0}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f136285a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return i.this.new a(dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
        
            if (r8.v0(r1, r7) == r0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00a8, code lost:
        
            if (r8.j1(r1, r7) == r0) goto L27;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                r6 = 3
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.f136285a
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2a
                if (r1 == r4) goto L25
                if (r1 == r3) goto L21
                r6 = 3
                if (r1 != r2) goto L18
                kotlin.ResultKt.m(r8)
                goto Lab
            L18:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                r6 = 7
                throw r7
            L21:
                kotlin.ResultKt.m(r8)
                goto L80
            L25:
                kotlin.ResultKt.m(r8)
                r6 = 2
                goto L6a
            L2a:
                kotlin.ResultKt.m(r8)
                com.planner5d.library.activity.fragment.spaces.file.i r8 = com.planner5d.library.activity.fragment.spaces.file.i.this
                boolean r8 = com.planner5d.library.activity.fragment.spaces.file.i.U(r8)
                r6 = 0
                if (r8 == 0) goto L94
                com.planner5d.library.activity.fragment.spaces.file.i r8 = com.planner5d.library.activity.fragment.spaces.file.i.this
                com.planner5d.library.model.manager.spaces.documents.c r8 = com.planner5d.library.activity.fragment.spaces.file.i.X(r8)
                r6 = 6
                com.planner5d.library.activity.fragment.spaces.file.i r1 = com.planner5d.library.activity.fragment.spaces.file.i.this
                com.planner5d.library.database.model.spaces.documents.a r1 = com.planner5d.library.activity.fragment.spaces.file.i.V(r1)
                com.planner5d.library.activity.fragment.spaces.file.i r2 = com.planner5d.library.activity.fragment.spaces.file.i.this
                android.net.Uri r2 = com.planner5d.library.activity.fragment.spaces.file.i.a0(r2)
                r6 = 7
                if (r2 != 0) goto L53
                java.lang.String r2 = "fileUri"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
                r2 = 0
                r2 = 0
            L53:
                java.lang.String r2 = r2.toString()
                r6 = 6
                java.lang.String r5 = "g)sStrtn(.oi."
                java.lang.String r5 = "toString(...)"
                r6 = 0
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
                r7.f136285a = r4
                java.lang.Object r8 = r8.b1(r1, r2, r7)
                if (r8 != r0) goto L6a
                r6 = 2
                goto Laa
            L6a:
                com.planner5d.library.activity.fragment.spaces.file.i r8 = com.planner5d.library.activity.fragment.spaces.file.i.this
                com.planner5d.library.model.manager.spaces.documents.c r8 = com.planner5d.library.activity.fragment.spaces.file.i.X(r8)
                com.planner5d.library.activity.fragment.spaces.file.i r1 = com.planner5d.library.activity.fragment.spaces.file.i.this
                com.planner5d.library.database.model.spaces.documents.a r1 = com.planner5d.library.activity.fragment.spaces.file.i.V(r1)
                r7.f136285a = r3
                java.lang.Object r8 = r8.v0(r1, r7)
                r6 = 2
                if (r8 != r0) goto L80
                goto Laa
            L80:
                com.planner5d.library.activity.fragment.spaces.file.i r8 = com.planner5d.library.activity.fragment.spaces.file.i.this
                com.planner5d.library.model.manager.statistics.events.n3 r8 = com.planner5d.library.activity.fragment.spaces.file.i.g0(r8)
                r6 = 5
                com.planner5d.library.model.manager.statistics.events.n3$c r0 = com.planner5d.library.model.manager.statistics.events.n3.c.document
                r6 = 7
                com.planner5d.library.activity.fragment.spaces.file.i r1 = com.planner5d.library.activity.fragment.spaces.file.i.this
                com.planner5d.library.model.manager.statistics.events.n3$d r1 = com.planner5d.library.activity.fragment.spaces.file.i.d0(r1)
                r8.T0(r0, r1)
                goto Lab
            L94:
                com.planner5d.library.activity.fragment.spaces.file.i r8 = com.planner5d.library.activity.fragment.spaces.file.i.this
                r6 = 1
                com.planner5d.library.model.manager.spaces.documents.c r8 = com.planner5d.library.activity.fragment.spaces.file.i.X(r8)
                com.planner5d.library.activity.fragment.spaces.file.i r1 = com.planner5d.library.activity.fragment.spaces.file.i.this
                com.planner5d.library.database.model.spaces.documents.a r1 = com.planner5d.library.activity.fragment.spaces.file.i.V(r1)
                r7.f136285a = r2
                r6 = 2
                java.lang.Object r8 = r8.j1(r1, r7)
                if (r8 != r0) goto Lab
            Laa:
                return r0
            Lab:
                com.planner5d.library.activity.fragment.spaces.file.i r7 = com.planner5d.library.activity.fragment.spaces.file.i.this
                r6 = 3
                androidx.lifecycle.c1 r7 = com.planner5d.library.activity.fragment.spaces.file.i.f0(r7)
                com.planner5d.library.activity.fragment.spaces.file.k r8 = new com.planner5d.library.activity.fragment.spaces.file.k
                r6 = 6
                r8.<init>()
                r7.r(r8)
                kotlin.Unit r7 = kotlin.Unit.f312394a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.spaces.file.i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.spaces.file.DocumentEditViewModel$loadData$1", f = "DocumentEditViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160716p}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f136287a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f136289c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Uri f136290d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f136291e;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.spaces.file.DocumentEditViewModel$loadData$1$1", f = "DocumentEditViewModel.kt", i = {}, l = {78, 80}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f136292a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f136293b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ i f136294c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Context f136295d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Uri f136296e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f136297f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i iVar, Context context, Uri uri, String str, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f136294c = iVar;
                this.f136295d = context;
                this.f136296e = uri;
                this.f136297f = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f136294c, this.f136295d, this.f136296e, this.f136297f, dVar);
            }

            /* JADX WARN: Code duplicated, block: B:22:0x005c  */
            /* JADX WARN: Code duplicated, block: B:25:0x0065  */
            /* JADX WARN: Code duplicated, block: B:26:0x0072  */
            /* JADX WARN: Code duplicated, block: B:29:0x0087  */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                i iVar;
                i iVar2;
                com.planner5d.library.database.model.spaces.documents.c cVar;
                List list;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f136293b;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    i iVar3 = this.f136294c;
                    Context context = this.f136295d;
                    Uri uri = this.f136296e;
                    this.f136293b = 1;
                    if (iVar3.r0(context, uri, this) != objL) {
                    }
                    return objL;
                }
                if (i10 == 1) {
                    ResultKt.m(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iVar2 = (i) this.f136292a;
                    ResultKt.m(obj);
                }
                cVar = (com.planner5d.library.database.model.spaces.documents.c) obj;
                if (cVar == null) {
                    iVar = iVar2;
                    list = this.f136294c.f136281n;
                    if (list != null) {
                        com.planner5d.library.database.model.spaces.documents.c cVar2 = (com.planner5d.library.database.model.spaces.documents.c) CollectionsKt.firstOrNull(list);
                        iVar2 = iVar;
                        cVar = cVar2;
                    } else {
                        iVar2 = iVar;
                        cVar = null;
                    }
                }
                iVar2.f136283s = cVar;
                com.planner5d.library.database.model.spaces.documents.a aVar = this.f136294c.f136278k;
                com.planner5d.library.database.model.spaces.documents.c cVar3 = this.f136294c.f136283s;
                aVar.x(cVar3 != null ? cVar3.p() : null);
                ContentResolver contentResolver = this.f136295d.getContentResolver();
                i iVar4 = this.f136294c;
                r rVar = iVar4.f136269b;
                Intrinsics.checkNotNull(contentResolver);
                iVar4.f136284t = rVar.x(contentResolver, this.f136296e, "");
                this.f136294c.f136278k.A(this.f136294c.f136284t);
                this.f136294c.f136274g.o(new com.planner5d.library.activity.fragment.spaces.file.b(this.f136294c.f136281n, this.f136294c.f136282o, this.f136294c.f136283s, this.f136294c.f136284t));
                this.f136294c.u0();
                return Unit.f312394a;
                iVar = this.f136294c;
                String str = this.f136297f;
                if (str != null) {
                    com.planner5d.library.model.manager.spaces.documents.c cVar4 = iVar.f136268a;
                    this.f136292a = iVar;
                    this.f136293b = 2;
                    Object objI0 = cVar4.I0(str, this);
                    if (objI0 != objL) {
                        iVar2 = iVar;
                        obj = objI0;
                        cVar = (com.planner5d.library.database.model.spaces.documents.c) obj;
                        if (cVar == null) {
                            iVar = iVar2;
                            list = this.f136294c.f136281n;
                            if (list != null) {
                                com.planner5d.library.database.model.spaces.documents.c cVar5 = (com.planner5d.library.database.model.spaces.documents.c) CollectionsKt.firstOrNull(list);
                                iVar2 = iVar;
                                cVar = cVar5;
                            } else {
                                iVar2 = iVar;
                                cVar = null;
                            }
                        }
                    }
                    return objL;
                }
                list = this.f136294c.f136281n;
                if (list != null) {
                    com.planner5d.library.database.model.spaces.documents.c cVar6 = (com.planner5d.library.database.model.spaces.documents.c) CollectionsKt.firstOrNull(list);
                    iVar2 = iVar;
                    cVar = cVar6;
                } else {
                    iVar2 = iVar;
                    cVar = null;
                }
                iVar2.f136283s = cVar;
                com.planner5d.library.database.model.spaces.documents.a aVar2 = this.f136294c.f136278k;
                com.planner5d.library.database.model.spaces.documents.c cVar7 = this.f136294c.f136283s;
                aVar2.x(cVar7 != null ? cVar7.p() : null);
                ContentResolver contentResolver2 = this.f136295d.getContentResolver();
                i iVar5 = this.f136294c;
                r rVar2 = iVar5.f136269b;
                Intrinsics.checkNotNull(contentResolver2);
                iVar5.f136284t = rVar2.x(contentResolver2, this.f136296e, "");
                this.f136294c.f136278k.A(this.f136294c.f136284t);
                this.f136294c.f136274g.o(new com.planner5d.library.activity.fragment.spaces.file.b(this.f136294c.f136281n, this.f136294c.f136282o, this.f136294c.f136283s, this.f136294c.f136284t));
                this.f136294c.u0();
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, Uri uri, String str, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f136289c = context;
            this.f136290d = uri;
            this.f136291e = str;
            int i10 = 4 | 2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return i.this.new b(this.f136289c, this.f136290d, this.f136291e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f136287a;
            if (i10 == 0) {
                ResultKt.m(obj);
                z1 z1VarH = s.f229729a.h();
                a aVar = new a(i.this, this.f136289c, this.f136290d, this.f136291e, null);
                this.f136287a = 1;
                if (kotlinx.coroutines.i.h(z1VarH, aVar, this) == objL) {
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
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.spaces.file.DocumentEditViewModel$loadDocument$1", f = "DocumentEditViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160706l1}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f136298a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f136300c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f136301d;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.spaces.file.DocumentEditViewModel$loadDocument$1$1", f = "DocumentEditViewModel.kt", i = {}, l = {96, com.planner5d.library.engine.input.f.b.f160715o1, com.planner5d.library.engine.input.f.b.f160718p1}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nDocumentEditViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocumentEditViewModel.kt\ncom/planner5d/library/activity/fragment/spaces/file/DocumentEditViewModel$loadDocument$1$1\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n29#2:161\n1#3:162\n*S KotlinDebug\n*F\n+ 1 DocumentEditViewModel.kt\ncom/planner5d/library/activity/fragment/spaces/file/DocumentEditViewModel$loadDocument$1$1\n*L\n97#1:161\n*E\n"})
        static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f136302a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f136303b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ i f136304c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f136305d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Context f136306e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i iVar, String str, Context context, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f136304c = iVar;
                this.f136305d = str;
                this.f136306e = context;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f136304c, this.f136305d, this.f136306e, dVar);
            }

            /* JADX WARN: Code duplicated, block: B:28:0x0099  */
            /* JADX WARN: Code duplicated, block: B:31:0x00aa  */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                i iVar;
                Object objY0;
                Uri uri;
                i iVar2;
                String strN;
                Object objI0;
                i iVar3;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f136303b;
                com.planner5d.library.database.model.spaces.documents.c cVar = null;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    iVar = this.f136304c;
                    com.planner5d.library.model.manager.spaces.documents.c cVar2 = iVar.f136268a;
                    String str = this.f136305d;
                    this.f136302a = iVar;
                    this.f136303b = 1;
                    objY0 = cVar2.y0(str, this);
                    if (objY0 != objL) {
                    }
                    return objL;
                }
                if (i10 == 1) {
                    iVar = (i) this.f136302a;
                    ResultKt.m(obj);
                    objY0 = obj;
                } else {
                    if (i10 == 2) {
                        ResultKt.m(obj);
                        iVar2 = this.f136304c;
                        strN = iVar2.f136278k.n();
                        if (strN != null) {
                            com.planner5d.library.model.manager.spaces.documents.c cVar3 = this.f136304c.f136268a;
                            this.f136302a = iVar2;
                            this.f136303b = 3;
                            objI0 = cVar3.I0(strN, this);
                            if (objI0 != objL) {
                                iVar3 = iVar2;
                            }
                            return objL;
                        }
                        iVar2.f136283s = cVar;
                        i iVar4 = this.f136304c;
                        iVar4.f136284t = iVar4.f136278k.q();
                        this.f136304c.f136274g.o(new com.planner5d.library.activity.fragment.spaces.file.b(this.f136304c.f136281n, this.f136304c.f136282o, this.f136304c.f136283s, this.f136304c.f136284t));
                        return Unit.f312394a;
                    }
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iVar3 = (i) this.f136302a;
                    ResultKt.m(obj);
                    objI0 = obj;
                }
                cVar = (com.planner5d.library.database.model.spaces.documents.c) objI0;
                iVar2 = iVar3;
                iVar2.f136283s = cVar;
                i iVar5 = this.f136304c;
                iVar5.f136284t = iVar5.f136278k.q();
                this.f136304c.f136274g.o(new com.planner5d.library.activity.fragment.spaces.file.b(this.f136304c.f136281n, this.f136304c.f136282o, this.f136304c.f136283s, this.f136304c.f136284t));
                return Unit.f312394a;
                com.planner5d.library.database.model.spaces.documents.a aVar = (com.planner5d.library.database.model.spaces.documents.a) objY0;
                if (aVar == null) {
                    aVar = new com.planner5d.library.database.model.spaces.documents.a(null, null, null, null, null, null, null, false, false, 511, null);
                }
                iVar.f136278k = aVar;
                i iVar6 = this.f136304c;
                Context context = this.f136306e;
                String strT = iVar6.f136278k.t();
                if (strT == null || (uri = Uri.parse(strT)) == null) {
                    uri = Uri.EMPTY;
                }
                Intrinsics.checkNotNull(uri);
                this.f136302a = null;
                this.f136303b = 2;
                if (iVar6.r0(context, uri, this) != objL) {
                    iVar2 = this.f136304c;
                    strN = iVar2.f136278k.n();
                    if (strN != null) {
                        com.planner5d.library.model.manager.spaces.documents.c cVar4 = this.f136304c.f136268a;
                        this.f136302a = iVar2;
                        this.f136303b = 3;
                        objI0 = cVar4.I0(strN, this);
                        if (objI0 != objL) {
                            iVar3 = iVar2;
                            cVar = (com.planner5d.library.database.model.spaces.documents.c) objI0;
                            iVar2 = iVar3;
                        }
                    }
                    iVar2.f136283s = cVar;
                    i iVar7 = this.f136304c;
                    iVar7.f136284t = iVar7.f136278k.q();
                    this.f136304c.f136274g.o(new com.planner5d.library.activity.fragment.spaces.file.b(this.f136304c.f136281n, this.f136304c.f136282o, this.f136304c.f136283s, this.f136304c.f136284t));
                    return Unit.f312394a;
                }
                return objL;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, Context context, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f136300c = str;
            this.f136301d = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return i.this.new c(this.f136300c, this.f136301d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f136298a;
            if (i10 == 0) {
                ResultKt.m(obj);
                z1 z1VarH = s.f229729a.h();
                a aVar = new a(i.this, this.f136300c, this.f136301d, null);
                this.f136298a = 1;
                if (kotlinx.coroutines.i.h(z1VarH, aVar, this) == objL) {
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
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.spaces.file.DocumentEditViewModel", f = "DocumentEditViewModel.kt", i = {0, 0, 0}, l = {com.planner5d.library.engine.input.f.b.f160742x1}, m = "loadFoldersAndPreview", n = {"this", "context", "fileUri"}, s = {"L$0", "L$1", "L$2"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f136307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f136308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f136309c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f136310d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f136311e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f136312f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f136314h;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f136312f = obj;
            this.f136314h |= Integer.MIN_VALUE;
            return i.this.r0(null, null, this);
        }
    }

    @ij.a
    public i(@NotNull com.planner5d.library.model.manager.spaces.documents.c documentsManager, @NotNull r fileHelper, @NotNull n3 statistics, @NotNull m3 editStatistics) {
        Intrinsics.checkNotNullParameter(documentsManager, "documentsManager");
        Intrinsics.checkNotNullParameter(fileHelper, "fileHelper");
        Intrinsics.checkNotNullParameter(statistics, "statistics");
        Intrinsics.checkNotNullParameter(editStatistics, "editStatistics");
        this.f136268a = documentsManager;
        this.f136269b = fileHelper;
        this.f136270c = statistics;
        this.f136271d = editStatistics;
        c1<Boolean> c1Var = new c1<>(Boolean.FALSE);
        this.f136272e = c1Var;
        this.f136273f = c1Var;
        c1<com.planner5d.library.activity.fragment.spaces.file.a> c1Var2 = new c1<>(new l());
        this.f136274g = c1Var2;
        this.f136275h = c1Var2;
        this.f136276i = new com.planner5d.library.activity.fragment.projects.l();
        this.f136278k = new com.planner5d.library.database.model.spaces.documents.a(null, null, null, null, null, null, null, false, false, 511, null);
        this.f136279l = true;
    }

    private final void p0(String str, Context context, Uri uri) {
        this.f136274g.r(new l());
        int i10 = 4 ^ 0;
        kotlinx.coroutines.k.f(g2.a(this), null, null, new b(context, uri, str, null), 3, null);
    }

    private final void q0(String str, Context context) {
        this.f136274g.r(new l());
        int i10 = 2 ^ 3;
        kotlinx.coroutines.k.f(g2.a(this), null, null, new c(str, context, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object r0(Context context, Uri uri, kotlin.coroutines.d<? super Unit> dVar) {
        d dVar2;
        com.planner5d.library.activity.fragment.projects.l lVar;
        Object obj;
        i iVar;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f136314h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f136314h = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object obj2 = dVar2.f136312f;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f136314h;
        if (i11 == 0) {
            ResultKt.m(obj2);
            lVar = this.f136276i;
            com.planner5d.library.model.manager.spaces.documents.c cVar = this.f136268a;
            dVar2.f136307a = this;
            dVar2.f136308b = context;
            dVar2.f136309c = uri;
            dVar2.f136310d = this;
            dVar2.f136311e = lVar;
            dVar2.f136314h = 1;
            Object objD0 = cVar.D0(dVar2);
            if (objD0 == objL) {
                return objL;
            }
            obj = objD0;
            iVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.planner5d.library.activity.fragment.projects.l lVar2 = (com.planner5d.library.activity.fragment.projects.l) dVar2.f136311e;
            i iVar2 = (i) dVar2.f136310d;
            uri = (Uri) dVar2.f136309c;
            Context context2 = (Context) dVar2.f136308b;
            iVar = (i) dVar2.f136307a;
            ResultKt.m(obj2);
            lVar = lVar2;
            this = iVar2;
            context = context2;
            obj = obj2;
        }
        this.f136281n = lVar.d((List) obj);
        iVar.f136282o = iVar.f136269b.z(context, uri);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    public final void u0() {
        String str = this.f136284t;
        boolean z10 = false;
        boolean z11 = (str == null || str.length() == 0 || this.f136283s == null) ? false : true;
        c1<Boolean> c1Var = this.f136272e;
        if (this.f136279l) {
            z10 = z11;
        } else if (z11) {
            if (Intrinsics.areEqual(this.f136284t, this.f136278k.q())) {
                com.planner5d.library.database.model.spaces.documents.c cVar = this.f136283s;
                if (!Intrinsics.areEqual(cVar != null ? cVar.p() : null, this.f136278k.n())) {
                    z10 = true;
                }
            } else {
                z10 = true;
            }
        }
        c1Var.o(Boolean.valueOf(z10));
    }

    public final void m0() {
        this.f136274g.r(new l());
        this.f136272e.r(Boolean.FALSE);
        this.f136278k.A(this.f136284t);
        com.planner5d.library.database.model.spaces.documents.a aVar = this.f136278k;
        com.planner5d.library.database.model.spaces.documents.c cVar = this.f136283s;
        aVar.x(cVar != null ? cVar.p() : null);
        if (this.f136279l) {
            this.f136278k.v(new Date());
            com.planner5d.library.database.model.spaces.documents.a aVar2 = this.f136278k;
            aVar2.w(aVar2.l());
        } else {
            this.f136278k.w(new Date());
        }
        kotlinx.coroutines.k.f(g2.a(this), null, null, new a(null), 3, null);
    }

    @NotNull
    public final androidx.lifecycle.w0<Boolean> n0() {
        return this.f136273f;
    }

    @NotNull
    public final androidx.lifecycle.w0<com.planner5d.library.activity.fragment.spaces.file.a> o0() {
        return this.f136275h;
    }

    public final void s0(@NotNull com.planner5d.library.database.model.spaces.documents.c folder) {
        Intrinsics.checkNotNullParameter(folder, "folder");
        this.f136283s = folder;
        u0();
        this.f136271d.H0(m3.a.choose_folder, m3.c.document);
    }

    public final void t0(boolean z10, @Nullable Bundle bundle, @NotNull Context context) {
        Parcelable parcelable;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f136279l = z10;
        if (bundle != null) {
            com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(bundle);
            this.f136277j = (n3.d) new com.planner5d.library.model.manager.statistics.c().c(bundle);
            Uri uri = null;
            if (z10) {
                String strT = jVar.t(com.planner5d.library.services.r.folderHash, null);
                com.planner5d.library.services.r rVar = com.planner5d.library.services.r.uri;
                try {
                    parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) jVar.g().getParcelable(rVar.f224891a, Uri.class) : jVar.g().getParcelable(rVar.f224891a);
                    if (parcelable == null || !(parcelable instanceof Uri)) {
                        parcelable = null;
                    }
                } catch (ClassCastException unused) {
                }
                if (parcelable == null) {
                    parcelable = null;
                }
                Uri EMPTY = (Uri) parcelable;
                if (EMPTY == null) {
                    EMPTY = Uri.EMPTY;
                    Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
                }
                this.f136280m = EMPTY;
                if (EMPTY == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("fileUri");
                } else {
                    uri = EMPTY;
                }
                p0(strT, context, uri);
            } else {
                String strT2 = jVar.t(com.planner5d.library.services.r.documentHash, null);
                if (strT2 != null) {
                    q0(strT2, context);
                }
            }
        }
    }

    public final void v0(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f136284t = name;
        u0();
        this.f136271d.H0(m3.a.change_name, m3.c.document);
    }
}
