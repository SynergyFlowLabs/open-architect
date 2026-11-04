package com.planner5d.library.contest.view.dialog;

import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.database.model.contest.Contest;
import com.planner5d.library.database.model.contest.ContestPrize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nContestSuggestDialogViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContestSuggestDialogViewModel.kt\ncom/planner5d/library/contest/view/dialog/ContestSuggestDialogViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n774#2:49\n865#2,2:50\n1#3:52\n*S KotlinDebug\n*F\n+ 1 ContestSuggestDialogViewModel.kt\ncom/planner5d/library/contest/view/dialog/ContestSuggestDialogViewModel\n*L\n46#1:49\n46#1:50,2\n*E\n"})
public final class s extends f2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f153663e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.contest.data.i f153664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c1<b> f153665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<b> f153666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final z1 f153667d;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.dialog.ContestSuggestDialogViewModel$1", f = "ContestSuggestDialogViewModel.kt", i = {0}, l = {31, 37}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f153668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f153669b;

        /* JADX INFO: renamed from: com.planner5d.library.contest.view.dialog.s$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.dialog.ContestSuggestDialogViewModel$1$1$1", f = "ContestSuggestDialogViewModel.kt", i = {}, l = {38, 38, 38}, m = "invokeSuspend", n = {}, s = {})
        static final class C1524a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f153671a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f153672b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f153673c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f153674d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f153675e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ s f153676f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ a1<Integer> f153677g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ a1<Integer> f153678h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ a1<Integer> f153679i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1524a(s sVar, a1<Integer> a1Var, a1<Integer> a1Var2, a1<Integer> a1Var3, kotlin.coroutines.d<? super C1524a> dVar) {
                super(2, dVar);
                this.f153676f = sVar;
                this.f153677g = a1Var;
                this.f153678h = a1Var2;
                this.f153679i = a1Var3;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1524a(this.f153676f, this.f153677g, this.f153678h, this.f153679i, dVar);
            }

            /* JADX WARN: Code duplicated, block: B:24:0x00a1  */
            /* JADX WARN: Code duplicated, block: B:27:0x00b1  */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                c1 c1Var;
                int i10;
                int i11;
                int i12;
                int iIntValue;
                Object objQ;
                int i13;
                int i14;
                c1 c1Var2;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i15 = this.f153675e;
                if (i15 == 0) {
                    ResultKt.m(obj);
                    c1Var = this.f153676f.f153665b;
                    a1<Integer> a1Var = this.f153677g;
                    this.f153671a = c1Var;
                    this.f153672b = 0;
                    this.f153675e = 1;
                    obj = a1Var.q(this);
                    if (obj != objL) {
                        i10 = 0;
                    }
                    return objL;
                }
                if (i15 == 1) {
                    i10 = this.f153672b;
                    c1Var = (c1) this.f153671a;
                    ResultKt.m(obj);
                } else {
                    if (i15 == 2) {
                        i11 = this.f153673c;
                        i12 = this.f153672b;
                        c1Var = (c1) this.f153671a;
                        ResultKt.m(obj);
                        iIntValue = ((Number) obj).intValue();
                        a1<Integer> a1Var2 = this.f153679i;
                        this.f153671a = c1Var;
                        this.f153672b = i12;
                        this.f153673c = i11;
                        this.f153674d = iIntValue;
                        this.f153675e = 3;
                        objQ = a1Var2.q(this);
                        if (objQ != objL) {
                            i13 = iIntValue;
                            i14 = i12;
                            obj = objQ;
                            c1Var2 = c1Var;
                        }
                        return objL;
                    }
                    if (i15 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i13 = this.f153674d;
                    i11 = this.f153673c;
                    i14 = this.f153672b;
                    c1Var2 = (c1) this.f153671a;
                    ResultKt.m(obj);
                }
                c1Var2.r(new b(i14 != 0, i11, i13, ((Number) obj).intValue()));
                return Unit.f312394a;
                int iIntValue2 = ((Number) obj).intValue();
                a1<Integer> a1Var3 = this.f153678h;
                this.f153671a = c1Var;
                this.f153672b = i10;
                this.f153673c = iIntValue2;
                this.f153675e = 2;
                Object objQ2 = a1Var3.q(this);
                if (objQ2 != objL) {
                    int i16 = i10;
                    i11 = iIntValue2;
                    obj = objQ2;
                    i12 = i16;
                    iIntValue = ((Number) obj).intValue();
                    a1<Integer> a1Var4 = this.f153679i;
                    this.f153671a = c1Var;
                    this.f153672b = i12;
                    this.f153673c = i11;
                    this.f153674d = iIntValue;
                    this.f153675e = 3;
                    objQ = a1Var4.q(this);
                    if (objQ != objL) {
                        i13 = iIntValue;
                        i14 = i12;
                        obj = objQ;
                        c1Var2 = c1Var;
                        c1Var2.r(new b(i14 != 0, i11, i13, ((Number) obj).intValue()));
                        return Unit.f312394a;
                    }
                }
                return objL;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1524a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.dialog.ContestSuggestDialogViewModel$1$1$rendersQuantity$1", f = "ContestSuggestDialogViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Integer>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f153680a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f153681b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Contest f153682c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(s sVar, Contest contest, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f153681b = sVar;
                this.f153682c = contest;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new b(this.f153681b, this.f153682c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f153680a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return kotlin.coroutines.jvm.internal.b.f(this.f153681b.X(this.f153682c, fd.k.RENDERS.q()));
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Integer> dVar) {
                return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.dialog.ContestSuggestDialogViewModel$1$1$texturesQuantity$1", f = "ContestSuggestDialogViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Integer>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f153683a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f153684b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Contest f153685c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(s sVar, Contest contest, kotlin.coroutines.d<? super c> dVar) {
                super(2, dVar);
                this.f153684b = sVar;
                this.f153685c = contest;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new c(this.f153684b, this.f153685c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f153683a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return kotlin.coroutines.jvm.internal.b.f(this.f153684b.X(this.f153685c, fd.k.TEXTURES.q()));
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Integer> dVar) {
                return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.dialog.ContestSuggestDialogViewModel$1$1$topSize$1", f = "ContestSuggestDialogViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nContestSuggestDialogViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContestSuggestDialogViewModel.kt\ncom/planner5d/library/contest/view/dialog/ContestSuggestDialogViewModel$1$1$topSize$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,48:1\n1971#2,14:49\n*S KotlinDebug\n*F\n+ 1 ContestSuggestDialogViewModel.kt\ncom/planner5d/library/contest/view/dialog/ContestSuggestDialogViewModel$1$1$topSize$1\n*L\n33#1:49,14\n*E\n"})
        static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Integer>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f153686a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Contest f153687b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(Contest contest, kotlin.coroutines.d<? super d> dVar) {
                super(2, dVar);
                this.f153687b = contest;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new d(this.f153687b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object obj2;
                Integer numV;
                kotlin.coroutines.intrinsics.b.l();
                if (this.f153686a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                Iterator<T> it = this.f153687b.Q().iterator();
                int iIntValue = 0;
                if (it.hasNext()) {
                    Object next = it.next();
                    if (it.hasNext()) {
                        Integer numV2 = ((ContestPrize) next).v();
                        int iIntValue2 = numV2 != null ? numV2.intValue() : 0;
                        do {
                            Object next2 = it.next();
                            Integer numV3 = ((ContestPrize) next2).v();
                            int iIntValue3 = numV3 != null ? numV3.intValue() : 0;
                            if (iIntValue2 < iIntValue3) {
                                next = next2;
                                iIntValue2 = iIntValue3;
                            }
                        } while (it.hasNext());
                    }
                    obj2 = next;
                } else {
                    obj2 = null;
                }
                ContestPrize contestPrize = (ContestPrize) obj2;
                if (contestPrize != null && (numV = contestPrize.v()) != null) {
                    iIntValue = numV.intValue();
                }
                return kotlin.coroutines.jvm.internal.b.f(iIntValue);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Integer> dVar) {
                return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = s.this.new a(dVar);
            aVar.f153669b = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x008a, code lost:
        
            if (kotlinx.coroutines.i.h(r14, r4, r13) == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r12 = 2
                int r1 = r13.f153668a
                r2 = 2
                r3 = 1
                r12 = 0
                if (r1 == 0) goto L2a
                r12 = 0
                if (r1 == r3) goto L20
                r12 = 3
                if (r1 != r2) goto L16
                kotlin.ResultKt.m(r14)
                goto L8d
            L16:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                r12 = 0
                r13.<init>(r14)
                r12 = 0
                throw r13
            L20:
                java.lang.Object r1 = r13.f153669b
                kotlinx.coroutines.s0 r1 = (kotlinx.coroutines.s0) r1
                kotlin.ResultKt.m(r14)
            L27:
                r3 = r1
                r3 = r1
                goto L46
            L2a:
                kotlin.ResultKt.m(r14)
                java.lang.Object r14 = r13.f153669b
                r1 = r14
                kotlinx.coroutines.s0 r1 = (kotlinx.coroutines.s0) r1
                com.planner5d.library.contest.view.dialog.s r14 = com.planner5d.library.contest.view.dialog.s.this
                com.planner5d.library.contest.data.i r14 = com.planner5d.library.contest.view.dialog.s.U(r14)
                r12 = 0
                r13.f153669b = r1
                r12 = 5
                r13.f153668a = r3
                java.lang.Object r14 = r14.r(r13)
                r12 = 4
                if (r14 != r0) goto L27
                goto L8c
            L46:
                com.planner5d.library.database.model.contest.Contest r14 = (com.planner5d.library.database.model.contest.Contest) r14
                if (r14 == 0) goto L8d
                r12 = 4
                com.planner5d.library.contest.view.dialog.s r1 = com.planner5d.library.contest.view.dialog.s.this
                com.planner5d.library.contest.view.dialog.s$a$d r6 = new com.planner5d.library.contest.view.dialog.s$a$d
                r10 = 0
                r6.<init>(r14, r10)
                r7 = 3
                r8 = 0
                r4 = 0
                int r12 = r12 >> r4
                r5 = 1
                r5 = 0
                kotlinx.coroutines.a1 r9 = kotlinx.coroutines.i.b(r3, r4, r5, r6, r7, r8)
                com.planner5d.library.contest.view.dialog.s$a$b r6 = new com.planner5d.library.contest.view.dialog.s$a$b
                r6.<init>(r1, r14, r10)
                kotlinx.coroutines.a1 r11 = kotlinx.coroutines.i.b(r3, r4, r5, r6, r7, r8)
                com.planner5d.library.contest.view.dialog.s$a$c r6 = new com.planner5d.library.contest.view.dialog.s$a$c
                r6.<init>(r1, r14, r10)
                kotlinx.coroutines.a1 r8 = kotlinx.coroutines.i.b(r3, r4, r5, r6, r7, r8)
                r12 = 5
                com.planner5d.library.services.utility.s r14 = com.planner5d.library.services.utility.s.f229729a
                kotlinx.coroutines.a3 r14 = r14.a()
                r12 = 7
                com.planner5d.library.contest.view.dialog.s$a$a r4 = new com.planner5d.library.contest.view.dialog.s$a$a
                r6 = r9
                r9 = 0
                r5 = r1
                r7 = r11
                r4.<init>(r5, r6, r7, r8, r9)
                r13.f153669b = r10
                r13.f153668a = r2
                r12 = 7
                java.lang.Object r13 = kotlinx.coroutines.i.h(r14, r4, r13)
                r12 = 4
                if (r13 != r0) goto L8d
            L8c:
                return r0
            L8d:
                r12 = 5
                kotlin.Unit r13 = kotlin.Unit.f312394a
                r12 = 7
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.contest.view.dialog.s.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @w0(parameters = 1)
    public static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f153688e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f153689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f153690b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f153691c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f153692d;

        public b(boolean z10, int i10, int i11, int i12) {
            this.f153689a = z10;
            this.f153690b = i10;
            this.f153691c = i11;
            this.f153692d = i12;
        }

        public final boolean a() {
            return this.f153689a;
        }

        public final int b() {
            return this.f153691c;
        }

        public final int c() {
            return this.f153692d;
        }

        public final int d() {
            return this.f153690b;
        }
    }

    @ij.a
    public s(@NotNull com.planner5d.library.contest.data.i contestManager) {
        Intrinsics.checkNotNullParameter(contestManager, "contestManager");
        this.f153664a = contestManager;
        c1<b> c1Var = new c1<>(new b(true, 0, 0, 0));
        this.f153665b = c1Var;
        this.f153666c = c1Var;
        z1 z1VarH = com.planner5d.library.services.utility.s.f229729a.h();
        this.f153667d = z1VarH;
        kotlinx.coroutines.k.f(g2.a(this), z1VarH, null, new a(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @m1
    public final int X(Contest contest, String str) {
        List<ContestPrize> listQ = contest.Q();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listQ) {
            if (Intrinsics.areEqual(((ContestPrize) obj).x(), str)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            Integer numW = ((ContestPrize) it.next()).w();
            iIntValue += numW != null ? numW.intValue() : 0;
        }
        return iIntValue;
    }

    @NotNull
    public final androidx.lifecycle.w0<b> Y() {
        return this.f153666c;
    }
}
