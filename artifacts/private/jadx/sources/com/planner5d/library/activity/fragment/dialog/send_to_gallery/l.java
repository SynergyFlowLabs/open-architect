package com.planner5d.library.activity.fragment.dialog.send_to_gallery;

import androidx.compose.runtime.internal.w0;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.activity.fragment.dialog.message.Message;
import com.planner5d.library.activity.fragment.dialog.message.OkMessage;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.manager.b4;
import com.planner5d.library.model.manager.project.d0;
import com.planner5d.library.model.manager.q0;
import com.planner5d.library.model.x;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.d3;
import com.planner5d.library.services.utility.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class l extends f2 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f132872v = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final b4 f132873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final t f132874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final d0 f132875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.dialog.k f132876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final q0 f132877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f132878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final c1<k> f132879g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final c1<p> f132880h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private SendToGallery.a f132881i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f132882j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final d3<Project> f132883k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final d3<List<x>> f132884l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private Long f132885m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private String f132886n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private String f132887o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private List<? extends x> f132888s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private List<String> f132889t;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.send_to_gallery.SendToGalleryViewModel$allTags$1", f = "SendToGalleryViewModel.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super List<? extends x>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f132890a;

        /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.dialog.send_to_gallery.l$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.send_to_gallery.SendToGalleryViewModel$allTags$1$1", f = "SendToGalleryViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C1462a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super List<x>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f132892a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f132893b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1462a(l lVar, kotlin.coroutines.d<? super C1462a> dVar) {
                super(2, dVar);
                this.f132893b = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1462a(this.f132893b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f132892a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return this.f132893b.f132877e.A();
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super List<x>> dVar) {
                return ((C1462a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return l.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f132890a;
            if (i10 == 0) {
                ResultKt.m(obj);
                z1 z1VarH = s.f229729a.h();
                C1462a c1462a = new C1462a(l.this, null);
                this.f132890a = 1;
                obj = kotlinx.coroutines.i.h(z1VarH, c1462a, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
            return obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super List<? extends x>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.send_to_gallery.SendToGalleryViewModel$loadSnapshots$1", f = "SendToGalleryViewModel.kt", i = {1}, l = {70, com.planner5d.library.engine.input.f.b.f160725s, 78, 78}, m = "invokeSuspend", n = {"ids"}, s = {"L$0"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f132894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f132895b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f132896c;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.send_to_gallery.SendToGalleryViewModel$loadSnapshots$1$ids$1", f = "SendToGalleryViewModel.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super List<String>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f132898a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f132899b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ l f132900c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l lVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f132900c = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f132900c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                b4 b4Var;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f132899b;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    b4 b4Var2 = this.f132900c.f132873a;
                    d3 d3Var = this.f132900c.f132883k;
                    this.f132898a = b4Var2;
                    this.f132899b = 1;
                    Object objA = d3Var.a(this);
                    if (objA == objL) {
                        return objL;
                    }
                    b4Var = b4Var2;
                    obj = objA;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b4Var = (b4) this.f132898a;
                    ResultKt.m(obj);
                }
                return b4Var.g0((Project) obj, this.f132900c.f132874b.a());
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super List<String>> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l.this.new b(dVar);
        }

        /* JADX WARN: Code duplicated, block: B:35:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:39:0x00d1  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list;
            List list2;
            c1<k> c1VarN0;
            Object objA;
            Project project;
            String str;
            Object objA2;
            c1<k> c1Var;
            String str2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f132896c;
            if (i10 == 0) {
                ResultKt.m(obj);
                z1 z1VarH = s.f229729a.h();
                a aVar = new a(l.this, null);
                this.f132896c = 1;
                obj = kotlinx.coroutines.i.h(z1VarH, aVar, this);
                if (obj != objL) {
                }
                return objL;
            }
            if (i10 == 1) {
                ResultKt.m(obj);
            } else {
                if (i10 == 2) {
                    list = (List) this.f132894a;
                    ResultKt.m(obj);
                    list2 = list;
                    if (list2 == null && !list2.isEmpty()) {
                        l.this.f132889t = list;
                        c1VarN0 = l.this.n0();
                        d3 d3Var = l.this.f132883k;
                        this.f132894a = c1VarN0;
                        this.f132896c = 3;
                        objA = d3Var.a(this);
                        if (objA != objL) {
                            project = (Project) objA;
                            if (project != null) {
                                str = "";
                            } else {
                                str = "";
                            }
                            d3 d3Var2 = l.this.f132884l;
                            this.f132894a = c1VarN0;
                            this.f132895b = str;
                            this.f132896c = 4;
                            objA2 = d3Var2.a(this);
                            if (objA2 != objL) {
                                c1<k> c1Var2 = c1VarN0;
                                obj = objA2;
                                c1Var = c1Var2;
                                str2 = str;
                            }
                        }
                        return objL;
                    }
                    l.this.v0();
                    return Unit.f312394a;
                }
                if (i10 == 3) {
                    c1<k> c1Var3 = (c1) this.f132894a;
                    ResultKt.m(obj);
                    objA = obj;
                    c1VarN0 = c1Var3;
                    project = (Project) objA;
                    if (project != null || (str = project.title) == null) {
                        str = "";
                    }
                    d3 d3Var3 = l.this.f132884l;
                    this.f132894a = c1VarN0;
                    this.f132895b = str;
                    this.f132896c = 4;
                    objA2 = d3Var3.a(this);
                    if (objA2 != objL) {
                        c1<k> c1Var4 = c1VarN0;
                        obj = objA2;
                        c1Var = c1Var4;
                        str2 = str;
                    }
                    return objL;
                }
                if (i10 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) this.f132895b;
                c1Var = (c1) this.f132894a;
                ResultKt.m(obj);
            }
            c1Var.r(new com.planner5d.library.activity.fragment.dialog.send_to_gallery.a(str2, (List) obj));
            return Unit.f312394a;
            list = (List) obj;
            this.f132894a = list;
            this.f132896c = 2;
            if (d1.b(300L, this) != objL) {
                list2 = list;
                if (list2 == null) {
                }
                l.this.v0();
                return Unit.f312394a;
            }
            return objL;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.send_to_gallery.SendToGalleryViewModel$project$1", f = "SendToGalleryViewModel.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Project>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f132901a;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.send_to_gallery.SendToGalleryViewModel$project$1$1", f = "SendToGalleryViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Project>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f132903a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f132904b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l lVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f132904b = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f132904b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f132903a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return this.f132904b.f132875c.Y(this.f132904b.f132874b.a(), this.f132904b.f132882j);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Project> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        c(kotlin.coroutines.d<? super c> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return l.this.new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f132901a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            z1 z1VarH = s.f229729a.h();
            a aVar = new a(l.this, null);
            this.f132901a = 1;
            Object objH = kotlinx.coroutines.i.h(z1VarH, aVar, this);
            return objH == objL ? objL : objH;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Project> dVar) {
            return ((c) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.send_to_gallery.SendToGalleryViewModel$send$1", f = "SendToGalleryViewModel.kt", i = {}, l = {me.relex.circleindicator.a.f332619e}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f132905a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FragmentManager f132907c;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.send_to_gallery.SendToGalleryViewModel$send$1$result$1", f = "SendToGalleryViewModel.kt", i = {0}, l = {120}, m = "invokeSuspend", n = {"tagIds"}, s = {"L$0"})
        @SourceDebugExtension({"SMAP\nSendToGalleryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SendToGalleryViewModel.kt\ncom/planner5d/library/activity/fragment/dialog/send_to_gallery/SendToGalleryViewModel$send$1$result$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,133:1\n1557#2:134\n1628#2,3:135\n*S KotlinDebug\n*F\n+ 1 SendToGalleryViewModel.kt\ncom/planner5d/library/activity/fragment/dialog/send_to_gallery/SendToGalleryViewModel$send$1$result$1\n*L\n118#1:134\n118#1:135,3\n*E\n"})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f132908a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f132909b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f132910c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ l f132911d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l lVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f132911d = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f132911d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                List<String> arrayList;
                q0 q0Var;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f132910c;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    List list = this.f132911d.f132888s;
                    arrayList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(String.valueOf(((x) it.next()).f222847a));
                    }
                    SendToGallery.a aVar = this.f132911d.f132881i;
                    if (aVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("type");
                        aVar = null;
                    }
                    if (aVar != SendToGallery.a.Project) {
                        return this.f132911d.f132877e.K(this.f132911d.f132885m, this.f132911d.f132886n, this.f132911d.f132887o, arrayList);
                    }
                    q0 q0Var2 = this.f132911d.f132877e;
                    d3 d3Var = this.f132911d.f132883k;
                    this.f132908a = arrayList;
                    this.f132909b = q0Var2;
                    this.f132910c = 1;
                    Object objA = d3Var.a(this);
                    if (objA == objL) {
                        return objL;
                    }
                    q0Var = q0Var2;
                    obj = objA;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q0Var = (q0) this.f132909b;
                    arrayList = (List) this.f132908a;
                    ResultKt.m(obj);
                }
                return q0Var.J((Project) obj, this.f132911d.f132886n, this.f132911d.f132887o, this.f132911d.f132889t, arrayList);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(FragmentManager fragmentManager, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f132907c = fragmentManager;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l.this.new d(this.f132907c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f132905a;
            if (i10 == 0) {
                ResultKt.m(obj);
                z1 z1VarH = s.f229729a.h();
                a aVar = new a(l.this, null);
                this.f132905a = 1;
                obj = kotlinx.coroutines.i.h(z1VarH, aVar, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            l.this.n0().r(new com.planner5d.library.activity.fragment.dialog.send_to_gallery.b());
            String string = l.this.f132878f.getString(((Boolean) obj).booleanValue() ? com.planner5d.library.f.s.kB : com.planner5d.library.f.s.hB);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            OkMessage okMessage = new OkMessage();
            okMessage.setArguments(new com.planner5d.library.services.utility.i().j(r.message, string).m(r.full_width, true).a());
            okMessage.show(this.f132907c, "ok_dialog");
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.send_to_gallery.SendToGalleryViewModel$setData$1", f = "SendToGalleryViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.I0}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f132912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f132913b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f132914c;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l.this.new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            c1<k> c1Var;
            String str;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f132914c;
            if (i10 == 0) {
                ResultKt.m(obj);
                c1<k> c1VarN0 = l.this.n0();
                d3 d3Var = l.this.f132884l;
                this.f132912a = c1VarN0;
                this.f132913b = "";
                this.f132914c = 1;
                Object objA = d3Var.a(this);
                if (objA == objL) {
                    return objL;
                }
                obj = objA;
                c1Var = c1VarN0;
                str = "";
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.f132913b;
                c1Var = (c1) this.f132912a;
                ResultKt.m(obj);
            }
            c1Var.r(new com.planner5d.library.activity.fragment.dialog.send_to_gallery.a(str, (List) obj));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public l(@NotNull b4 snapshotManager, @NotNull t userAuthorization, @NotNull d0 projectManager, @NotNull com.planner5d.library.activity.fragment.dialog.k dialogLauncher, @NotNull q0 galleryRecordManager, @NotNull com.planner5d.library.application.b application) {
        Intrinsics.checkNotNullParameter(snapshotManager, "snapshotManager");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(projectManager, "projectManager");
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        Intrinsics.checkNotNullParameter(galleryRecordManager, "galleryRecordManager");
        Intrinsics.checkNotNullParameter(application, "application");
        this.f132873a = snapshotManager;
        this.f132874b = userAuthorization;
        this.f132875c = projectManager;
        this.f132876d = dialogLauncher;
        this.f132877e = galleryRecordManager;
        this.f132878f = application;
        this.f132879g = new c1<>(new k());
        this.f132880h = new c1<>(new p(false, false, false, 7, null));
        this.f132883k = new d3<>(new c(null));
        this.f132884l = new d3<>(new a(null));
        this.f132886n = "";
        this.f132887o = "";
        this.f132888s = CollectionsKt.emptyList();
        this.f132889t = CollectionsKt.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0() {
        this.f132879g.r(new com.planner5d.library.activity.fragment.dialog.send_to_gallery.b());
        Message.show(this.f132876d, this.f132878f.getString(com.planner5d.library.f.s.ls), null);
    }

    public final boolean l0() {
        return this.f132886n.length() > 0 && this.f132887o.length() > 0;
    }

    public final void m0() {
        this.f132880h.r(new p(false, false, this.f132888s.isEmpty()));
    }

    @NotNull
    public final c1<k> n0() {
        return this.f132879g;
    }

    @NotNull
    public final c1<p> o0() {
        return this.f132880h;
    }

    public final void p0() {
        this.f132879g.r(new com.planner5d.library.activity.fragment.dialog.send_to_gallery.c());
        kotlinx.coroutines.k.f(g2.a(this), null, null, new b(null), 3, null);
    }

    public final void q0(@NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f132887o = description;
    }

    public final void r0(@NotNull List<? extends x> tags) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f132888s = tags;
        w0();
    }

    public final void s0(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f132886n = title;
    }

    public final void t0(@NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f132879g.r(new com.planner5d.library.activity.fragment.dialog.send_to_gallery.c());
        kotlinx.coroutines.k.f(g2.a(this), null, null, new d(fragmentManager, null), 3, null);
    }

    public final void u0(@NotNull SendToGallery.a type, long j10) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f132881i = type;
        this.f132882j = j10;
        if (type == SendToGallery.a.Snapshot) {
            this.f132885m = Long.valueOf(j10);
            kotlinx.coroutines.k.f(g2.a(this), null, null, new e(null), 3, null);
        }
    }

    public final void w0() {
        this.f132880h.r(new p(this.f132886n.length() == 0, this.f132887o.length() == 0, this.f132888s.isEmpty()));
    }
}
