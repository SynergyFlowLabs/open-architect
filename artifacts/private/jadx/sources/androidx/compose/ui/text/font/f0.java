package androidx.compose.ui.text.font;

import androidx.compose.runtime.n7;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nFontFamilyResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/FontFamilyResolverImpl\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,259:1\n151#2,2:260\n35#2,5:262\n153#2:267\n*S KotlinDebug\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/FontFamilyResolverImpl\n*L\n46#1:260,2\n46#1:262,5\n46#1:267\n*E\n"})
public final class f0 implements y.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f41579g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final d1 f41580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final g1 f41581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final t1 f41582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final m0 f41583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final c1 f41584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Function1<r1, Object> f41585f;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.font.FontFamilyResolverImpl", f = "FontFamilyResolver.kt", i = {0}, l = {43}, m = io.ktor.http.t1.b.f296118f, n = {"fontFamily"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f41586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f41587b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f41589d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f41587b = obj;
            this.f41589d |= Integer.MIN_VALUE;
            return f0.this.a(null, this);
        }
    }

    public f0(@NotNull d1 d1Var, @NotNull g1 g1Var, @NotNull t1 t1Var, @NotNull m0 m0Var, @NotNull c1 c1Var) {
        this.f41580a = d1Var;
        this.f41581b = g1Var;
        this.f41582c = t1Var;
        this.f41583d = m0Var;
        this.f41584e = c1Var;
        this.f41585f = new Function1() { // from class: androidx.compose.ui.text.font.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f0.i(this.f41552a, (r1) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object i(f0 f0Var, r1 r1Var) {
        boolean z10 = true;
        return f0Var.n(r1.g(r1Var, null, null, 0, 0, null, 30, null)).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u1 k(f0 f0Var, r1 r1Var) {
        u1 u1VarA = f0Var.f41583d.a(r1Var, f0Var.f41580a, new Function1() { // from class: androidx.compose.ui.text.font.b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f0.l((u1.b) obj);
            }
        }, f0Var.f41585f);
        if (u1VarA != null) {
            return u1VarA;
        }
        u1 u1VarA2 = f0Var.f41584e.a(r1Var, f0Var.f41580a, new Function1() { // from class: androidx.compose.ui.text.font.c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f0.m((u1.b) obj);
            }
        }, f0Var.f41585f);
        if (u1VarA2 != null) {
            return u1VarA2;
        }
        throw new IllegalStateException("Could not load font");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(u1.b bVar) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(u1.b bVar) {
        return Unit.f312394a;
    }

    private final n7<Object> n(final r1 r1Var) {
        return this.f41582c.f(r1Var, new Function1() { // from class: androidx.compose.ui.text.font.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f0.o(this.f41569a, r1Var, (Function1) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u1 o(f0 f0Var, r1 r1Var, Function1 function1) {
        u1 u1VarA = f0Var.f41583d.a(r1Var, f0Var.f41580a, function1, f0Var.f41585f);
        if (u1VarA != null) {
            return u1VarA;
        }
        u1 u1VarA2 = f0Var.f41584e.a(r1Var, f0Var.f41580a, function1, f0Var.f41585f);
        if (u1VarA2 != null) {
            return u1VarA2;
        }
        throw new IllegalStateException("Could not load font");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // androidx.compose.ui.text.font.y.b
    @Nullable
    public Object a(@NotNull y yVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f41589d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f41589d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f41587b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f41589d;
        if (i11 == 0) {
            ResultKt.m(obj);
            if (!(yVar instanceof k0)) {
                return Unit.f312394a;
            }
            m0 m0Var = this.f41583d;
            d1 d1Var = this.f41580a;
            aVar.f41586a = yVar;
            aVar.f41589d = 1;
            if (m0Var.f(yVar, d1Var, aVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yVar = (y) aVar.f41586a;
            ResultKt.m(obj);
        }
        List<x> listB = ((k0) yVar).B();
        ArrayList arrayList = new ArrayList(listB.size());
        int size = listB.size();
        for (int i12 = 0; i12 < size; i12++) {
            x xVar = listB.get(i12);
            arrayList.add(new r1(this.f41581b.a(yVar), this.f41581b.b(xVar.a()), this.f41581b.c(xVar.c()), r0.f41699b.a(), this.f41580a.getCacheKey(), null));
        }
        this.f41582c.e(arrayList, new Function1() { // from class: androidx.compose.ui.text.font.d0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return f0.k(this.f41568a, (r1) obj2);
            }
        });
        return Unit.f312394a;
    }

    @Override // androidx.compose.ui.text.font.y.b
    @NotNull
    public n7<Object> b(@Nullable y yVar, @NotNull v0 v0Var, int i10, int i11) {
        return n(new r1(this.f41581b.a(yVar), this.f41581b.b(v0Var), this.f41581b.c(i10), this.f41581b.d(i11), this.f41580a.getCacheKey(), null));
    }

    @NotNull
    public final d1 j() {
        return this.f41580a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ f0(d1 d1Var, g1 g1Var, t1 t1Var, m0 m0Var, c1 c1Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(d1Var, (i10 & 2) != 0 ? g1.f41594a.a() : g1Var, (i10 & 4) != 0 ? g0.b() : t1Var, (i10 & 8) != 0 ? new m0(g0.a(), null, 2, 0 == true ? 1 : 0) : m0Var, (i10 & 16) != 0 ? new c1() : c1Var);
    }
}
