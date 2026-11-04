package androidx.compose.ui.text.font;

import androidx.collection.b3;
import androidx.collection.k2;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n+ 2 Synchronization.android.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,444:1\n27#2,2:445\n35#2:447\n35#2:448\n35#2:449\n35#2:450\n35#2:451\n1#3:452\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n*L\n370#1:445,2\n379#1:447\n396#1:448\n406#1:449\n413#1:450\n434#1:451\n*E\n"})
public final class o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f41662e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f41663a = a.b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.collection.d1<b, a> f41664b = new androidx.collection.d1<>(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final k2<b, a> f41665c = b3.u();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.platform.c0 f41666d = new androidx.compose.ui.text.platform.c0();

    @oj.g
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final Object f41667a;

        private /* synthetic */ a(Object obj) {
            this.f41667a = obj;
        }

        public static final /* synthetic */ a a(Object obj) {
            return new a(obj);
        }

        @NotNull
        public static Object b(@Nullable Object obj) {
            return obj;
        }

        public static boolean c(Object obj, Object obj2) {
            return (obj2 instanceof a) && Intrinsics.areEqual(obj, ((a) obj2).i());
        }

        public static final boolean d(Object obj, Object obj2) {
            return Intrinsics.areEqual(obj, obj2);
        }

        public static int f(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public static final boolean g(Object obj) {
            return obj == null;
        }

        public static String h(Object obj) {
            return "AsyncTypefaceResult(result=" + obj + ')';
        }

        @Nullable
        public final Object e() {
            return this.f41667a;
        }

        public boolean equals(Object obj) {
            return c(this.f41667a, obj);
        }

        public int hashCode() {
            return f(this.f41667a);
        }

        public final /* synthetic */ Object i() {
            return this.f41667a;
        }

        public String toString() {
            return h(this.f41667a);
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f41668c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final x f41669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final Object f41670b;

        public b(@NotNull x xVar, @Nullable Object obj) {
            this.f41669a = xVar;
            this.f41670b = obj;
        }

        public static /* synthetic */ b d(b bVar, x xVar, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                xVar = bVar.f41669a;
            }
            if ((i10 & 2) != 0) {
                obj = bVar.f41670b;
            }
            return bVar.c(xVar, obj);
        }

        @NotNull
        public final x a() {
            return this.f41669a;
        }

        @Nullable
        public final Object b() {
            return this.f41670b;
        }

        @NotNull
        public final b c(@NotNull x xVar, @Nullable Object obj) {
            return new b(xVar, obj);
        }

        @NotNull
        public final x e() {
            return this.f41669a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f41669a, bVar.f41669a) && Intrinsics.areEqual(this.f41670b, bVar.f41670b);
        }

        @Nullable
        public final Object f() {
            return this.f41670b;
        }

        public int hashCode() {
            int iHashCode = this.f41669a.hashCode() * 31;
            Object obj = this.f41670b;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        @NotNull
        public String toString() {
            return "Key(font=" + this.f41669a + ", loaderKey=" + this.f41670b + ')';
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.font.AsyncTypefaceCache", f = "FontListFontFamilyTypefaceAdapter.kt", i = {0, 0}, l = {412}, m = "runCached", n = {"key", "forever"}, s = {"L$0", "Z$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f41671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f41672b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f41673c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f41675e;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f41673c = obj;
            this.f41675e |= Integer.MIN_VALUE;
            return o.this.g(null, null, false, null, this);
        }
    }

    public static /* synthetic */ void f(o oVar, x xVar, d1 d1Var, Object obj, boolean z10, int i10, Object obj2) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        oVar.e(xVar, d1Var, obj, z10);
    }

    @Nullable
    public final a d(@NotNull x xVar, @NotNull d1 d1Var) {
        a aVarF;
        b bVar = new b(xVar, d1Var.getCacheKey());
        synchronized (this.f41666d) {
            try {
                aVarF = this.f41664b.f(bVar);
                if (aVarF == null) {
                    aVarF = this.f41665c.p(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVarF;
    }

    public final void e(@NotNull x xVar, @NotNull d1 d1Var, @Nullable Object obj, boolean z10) {
        b bVar = new b(xVar, d1Var.getCacheKey());
        synchronized (this.f41666d) {
            try {
                if (obj == null) {
                    this.f41665c.q0(bVar, a.a(this.f41663a));
                    Unit unit = Unit.f312394a;
                } else if (z10) {
                    this.f41665c.q0(bVar, a.a(a.b(obj)));
                    Unit unit2 = Unit.f312394a;
                } else {
                    this.f41664b.j(bVar, a.a(a.b(obj)));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object g(@NotNull x xVar, @NotNull d1 d1Var, boolean z10, @NotNull Function1<? super kotlin.coroutines.d<Object>, ? extends Object> function1, @NotNull kotlin.coroutines.d<Object> dVar) {
        c cVar;
        b bVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f41675e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f41675e = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f41673c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f41675e;
        if (i11 == 0) {
            ResultKt.m(obj);
            b bVar2 = new b(xVar, d1Var.getCacheKey());
            synchronized (this.f41666d) {
                try {
                    a aVarF = this.f41664b.f(bVar2);
                    if (aVarF == null) {
                        aVarF = this.f41665c.p(bVar2);
                    }
                    if (aVarF != null) {
                        return aVarF.i();
                    }
                    Unit unit = Unit.f312394a;
                    cVar.f41672b = bVar2;
                    cVar.f41671a = z10;
                    cVar.f41675e = 1;
                    Object objInvoke = function1.invoke(cVar);
                    if (objInvoke == objL) {
                        return objL;
                    }
                    obj = objInvoke;
                    bVar = bVar2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = cVar.f41671a;
            bVar = (b) cVar.f41672b;
            ResultKt.m(obj);
        }
        synchronized (this.f41666d) {
            try {
                if (obj == null) {
                    this.f41665c.q0(bVar, a.a(this.f41663a));
                } else if (z10) {
                    this.f41665c.q0(bVar, a.a(a.b(obj)));
                } else {
                    this.f41664b.j(bVar, a.a(a.b(obj)));
                }
                Unit unit2 = Unit.f312394a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object h(@NotNull x xVar, @NotNull d1 d1Var, @NotNull Function0<? extends Object> function0) {
        synchronized (this.f41666d) {
            try {
                b bVar = new b(xVar, d1Var.getCacheKey());
                a aVar = (a) this.f41664b.f(bVar);
                if (aVar == null) {
                    aVar = (a) this.f41665c.p(bVar);
                }
                if (aVar != null) {
                    Object objI = aVar.i();
                    kotlin.jvm.internal.h0.d(2);
                    kotlin.jvm.internal.h0.c(2);
                    return objI;
                }
                Unit unit = Unit.f312394a;
                kotlin.jvm.internal.h0.d(1);
                kotlin.jvm.internal.h0.c(1);
                Object objInvoke = function0.invoke();
                f(this, xVar, d1Var, objInvoke, false, 8, null);
                return objInvoke;
            } catch (Throwable th2) {
                kotlin.jvm.internal.h0.d(1);
                kotlin.jvm.internal.h0.c(1);
                throw th2;
            }
        }
    }
}
