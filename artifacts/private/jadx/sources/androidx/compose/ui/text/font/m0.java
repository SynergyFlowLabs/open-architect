package androidx.compose.ui.text.font;

import androidx.collection.l2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.b4;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.q3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,444:1\n251#2,2:445\n35#2,5:447\n253#2:452\n483#2,3:453\n35#2,3:456\n486#2,3:459\n39#2:462\n489#2:463\n35#2,5:464\n44#3,4:469\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter\n*L\n71#1:445,2\n71#1:447,5\n71#1:452\n74#1:453,3\n74#1:456,3\n74#1:459,3\n74#1:462\n74#1:463\n78#1:464,5\n165#1:469,4\n*E\n"})
public final class m0 implements i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f41613c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f41614d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final p0 f41615e = new p0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final kotlinx.coroutines.o0 f41616f = new d(kotlinx.coroutines.o0.L2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final o f41617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private kotlinx.coroutines.s0 f41618b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final kotlinx.coroutines.o0 a() {
            return m0.f41616f;
        }

        @NotNull
        public final p0 b() {
            return m0.f41615e;
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter$preload$3\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,444:1\n483#2,3:445\n35#2,3:448\n486#2,3:451\n39#2:454\n489#2:455\n151#2,2:456\n35#2,5:458\n153#2:463\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter$preload$3\n*L\n106#1:445,3\n106#1:448,3\n106#1:451,3\n106#1:454\n106#1:455\n107#1:456,2\n107#1:458,5\n107#1:463\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f41620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<x> f41621c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ m0 f41622d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ d1 f41623e;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Object>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f41624a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m0 f41625b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ x f41626c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ d1 f41627d;

            /* JADX INFO: renamed from: androidx.compose.ui.text.font.m0$b$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {com.rabbitmq.client.impl.k.b.p.f265340a}, m = "invokeSuspend", n = {}, s = {})
            static final class C0336a extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Object>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f41628a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ x f41629b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ d1 f41630c;

                /* JADX INFO: renamed from: androidx.compose.ui.text.font.m0$b$a$a$a, reason: collision with other inner class name */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1$1", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.B}, m = "invokeSuspend", n = {}, s = {})
                static final class C0337a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Object>, Object> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    int f41631a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ d1 f41632b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ x f41633c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0337a(d1 d1Var, x xVar, kotlin.coroutines.d<? super C0337a> dVar) {
                        super(2, dVar);
                        this.f41632b = d1Var;
                        this.f41633c = xVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                        return new C0337a(this.f41632b, this.f41633c, dVar);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Object> dVar) {
                        return invoke2(s0Var, (kotlin.coroutines.d<Object>) dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object objL = kotlin.coroutines.intrinsics.b.l();
                        int i10 = this.f41631a;
                        if (i10 != 0) {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.m(obj);
                            return obj;
                        }
                        ResultKt.m(obj);
                        d1 d1Var = this.f41632b;
                        x xVar = this.f41633c;
                        this.f41631a = 1;
                        Object objA = d1Var.a(xVar, this);
                        return objA == objL ? objL : objA;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Object invoke2(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<Object> dVar) {
                        return ((C0337a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0336a(x xVar, d1 d1Var, kotlin.coroutines.d<? super C0336a> dVar) {
                    super(1, dVar);
                    this.f41629b = xVar;
                    this.f41630c = d1Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
                    return new C0336a(this.f41629b, this.f41630c, dVar);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(kotlin.coroutines.d<? super Object> dVar) {
                    return invoke2((kotlin.coroutines.d<Object>) dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f41628a;
                    try {
                        if (i10 == 0) {
                            ResultKt.m(obj);
                            C0337a c0337a = new C0337a(this.f41630c, this.f41629b, null);
                            this.f41628a = 1;
                            obj = b4.c(15000L, c0337a, this);
                            if (obj == objL) {
                                return objL;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.m(obj);
                        }
                        if (obj != null) {
                            return obj;
                        }
                        throw new IllegalStateException("Unable to load font " + this.f41629b);
                    } catch (Exception e10) {
                        throw new IllegalStateException("Unable to load font " + this.f41629b, e10);
                    }
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(kotlin.coroutines.d<Object> dVar) {
                    return ((C0336a) create(dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m0 m0Var, x xVar, d1 d1Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f41625b = m0Var;
                this.f41626c = xVar;
                this.f41627d = d1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f41625b, this.f41626c, this.f41627d, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Object> dVar) {
                return invoke2(s0Var, (kotlin.coroutines.d<Object>) dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f41624a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                ResultKt.m(obj);
                o oVar = this.f41625b.f41617a;
                x xVar = this.f41626c;
                d1 d1Var = this.f41627d;
                C0336a c0336a = new C0336a(xVar, d1Var, null);
                this.f41624a = 1;
                Object objG = oVar.g(xVar, d1Var, true, c0336a, this);
                return objG == objL ? objL : objG;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<Object> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<x> list, m0 m0Var, d1 d1Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f41621c = list;
            this.f41622d = m0Var;
            this.f41623e = d1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f41621c, this.f41622d, this.f41623e, dVar);
            bVar.f41620b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f41619a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f41620b;
                List<x> list = this.f41621c;
                l2 l2Var = new l2(list.size());
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    x xVar = list.get(i11);
                    if (l2Var.C(xVar)) {
                        arrayList.add(xVar);
                    }
                }
                m0 m0Var = this.f41622d;
                d1 d1Var = this.f41623e;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size2 = arrayList.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    arrayList2.add(kotlinx.coroutines.k.b(s0Var, null, null, new a(m0Var, (x) arrayList.get(i12), d1Var, null), 3, null));
                }
                this.f41619a = 1;
                if (kotlinx.coroutines.f.c(arrayList2, this) == objL) {
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
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$resolve$1", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f41635b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(n nVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f41635b = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f41635b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f41634a;
            if (i10 == 0) {
                ResultKt.m(obj);
                n nVar = this.f41635b;
                this.f41634a = 1;
                if (nVar.d(this) == objL) {
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
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter\n*L\n1#1,106:1\n168#2:107\n*E\n"})
    public static final class d extends kotlin.coroutines.a implements kotlinx.coroutines.o0 {
        public d(kotlinx.coroutines.o0.b bVar) {
            super(bVar);
        }

        @Override // kotlinx.coroutines.o0
        public void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m0() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(r1 r1Var) {
        return Unit.f312394a;
    }

    @Override // androidx.compose.ui.text.font.i0
    @Nullable
    public u1 a(@NotNull r1 r1Var, @NotNull d1 d1Var, @NotNull Function1<? super u1.b, Unit> function1, @NotNull Function1<? super r1, ? extends Object> function2) {
        if (!(r1Var.h() instanceof k0)) {
            return null;
        }
        Pair pairB = n0.b(f41615e.e(((k0) r1Var.h()).B(), r1Var.k(), r1Var.i()), r1Var, this.f41617a, d1Var, function2);
        List list = (List) pairB.component1();
        Object objComponent2 = pairB.component2();
        if (list == null) {
            return new u1.b(objComponent2, false, 2, null);
        }
        n nVar = new n(list, objComponent2, r1Var, this.f41617a, function1, d1Var);
        kotlinx.coroutines.k.f(this.f41618b, null, kotlinx.coroutines.u0.UNDISPATCHED, new c(nVar, null), 1, null);
        return new u1.a(nVar);
    }

    @Nullable
    public final Object f(@NotNull y yVar, @NotNull d1 d1Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        if (!(yVar instanceof k0)) {
            return Unit.f312394a;
        }
        k0 k0Var = (k0) yVar;
        List<x> listB = k0Var.B();
        List<x> listB2 = k0Var.B();
        ArrayList arrayList = new ArrayList(listB2.size());
        int size = listB2.size();
        for (int i10 = 0; i10 < size; i10++) {
            x xVar = listB2.get(i10);
            if (o0.g(xVar.b(), o0.f41676b.a())) {
                arrayList.add(TuplesKt.to(xVar.a(), q0.c(xVar.c())));
            }
        }
        l2 l2Var = new l2(arrayList.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            Object obj = arrayList.get(i11);
            if (l2Var.C((Pair) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int size3 = arrayList2.size();
        for (int i12 = 0; i12 < size3; i12++) {
            Pair pair = (Pair) arrayList2.get(i12);
            v0 v0Var = (v0) pair.component1();
            int iJ = ((q0) pair.component2()).j();
            List list = (List) n0.b(f41615e.e(listB, v0Var, iJ), new r1(yVar, v0Var, iJ, r0.f41699b.a(), d1Var.getCacheKey(), null), this.f41617a, d1Var, new Function1() { // from class: androidx.compose.ui.text.font.l0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return m0.g((r1) obj2);
                }
            }).component1();
            if (list != null) {
                arrayList3.add(CollectionsKt.first(list));
            }
        }
        Object objG = kotlinx.coroutines.t0.g(new b(arrayList3, this, d1Var, null), dVar);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    public m0(@NotNull o oVar, @NotNull CoroutineContext coroutineContext) {
        this.f41617a = oVar;
        this.f41618b = kotlinx.coroutines.t0.a(f41616f.plus(androidx.compose.ui.text.platform.w.a()).plus(coroutineContext).plus(q3.a((p2) coroutineContext.get(p2.M2))));
    }

    public /* synthetic */ m0(o oVar, CoroutineContext coroutineContext, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new o() : oVar, (i10 & 2) != 0 ? kotlin.coroutines.h.f312451a : coroutineContext);
    }
}
