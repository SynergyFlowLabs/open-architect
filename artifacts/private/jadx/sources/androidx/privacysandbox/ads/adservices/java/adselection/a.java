package androidx.privacysandbox.ads.adservices.java.adselection;

import android.content.Context;
import androidx.annotation.a1;
import androidx.annotation.u;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.privacysandbox.ads.adservices.adselection.g1;
import androidx.privacysandbox.ads.adservices.adselection.j;
import androidx.privacysandbox.ads.adservices.adselection.j0;
import androidx.privacysandbox.ads.adservices.adselection.k1;
import androidx.privacysandbox.ads.adservices.adselection.m0;
import androidx.privacysandbox.ads.adservices.adselection.q;
import androidx.privacysandbox.ads.adservices.adselection.q0;
import androidx.privacysandbox.ads.adservices.adselection.r;
import androidx.privacysandbox.ads.adservices.adselection.x0;
import androidx.privacysandbox.ads.adservices.adselection.y0;
import com.google.common.util.concurrent.t1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f73544a = new b(null);

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.adselection.a$a, reason: collision with other inner class name */
    private static final class C0710a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final r f73545b;

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.adselection.a$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$getAdSelectionDataAsync$1", f = "AdSelectionManagerFutures.kt", i = {}, l = {361}, m = "invokeSuspend", n = {}, s = {})
        static final class C0711a extends o implements Function2<s0, kotlin.coroutines.d<? super m0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f73546a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ q0 f73548c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0711a(q0 q0Var, kotlin.coroutines.d<? super C0711a> dVar) {
                super(2, dVar);
                this.f73548c = q0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return C0710a.this.new C0711a(this.f73548c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f73546a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                ResultKt.m(obj);
                r rVar = C0710a.this.f73545b;
                Intrinsics.checkNotNull(rVar);
                q0 q0Var = this.f73548c;
                this.f73546a = 1;
                Object objA = rVar.a(q0Var, this);
                return objA == objL ? objL : objA;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super m0> dVar) {
                return ((C0711a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.adselection.a$a$b */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$persistAdSelectionResultAsync$1", f = "AdSelectionManagerFutures.kt", i = {}, l = {373}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super j0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f73549a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ x0 f73551c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(x0 x0Var, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f73551c = x0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return C0710a.this.new b(this.f73551c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f73549a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                ResultKt.m(obj);
                r rVar = C0710a.this.f73545b;
                Intrinsics.checkNotNull(rVar);
                x0 x0Var = this.f73551c;
                this.f73549a = 1;
                Object objC = rVar.c(x0Var, this);
                return objC == objL ? objL : objC;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super j0> dVar) {
                return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.adselection.a$a$c */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$reportEventAsync$1", f = "AdSelectionManagerFutures.kt", i = {}, l = {350}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f73552a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ y0 f73554c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(y0 y0Var, kotlin.coroutines.d<? super c> dVar) {
                super(2, dVar);
                this.f73554c = y0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return C0710a.this.new c(this.f73554c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f73552a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    r rVar = C0710a.this.f73545b;
                    Intrinsics.checkNotNull(rVar);
                    y0 y0Var = this.f73554c;
                    this.f73552a = 1;
                    if (rVar.d(y0Var, this) == objL) {
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

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.adselection.a$a$d */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$reportImpressionAsync$1", f = "AdSelectionManagerFutures.kt", i = {}, l = {327}, m = "invokeSuspend", n = {}, s = {})
        static final class d extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f73555a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ g1 f73557c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(g1 g1Var, kotlin.coroutines.d<? super d> dVar) {
                super(2, dVar);
                this.f73557c = g1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return C0710a.this.new d(this.f73557c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f73555a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    r rVar = C0710a.this.f73545b;
                    Intrinsics.checkNotNull(rVar);
                    g1 g1Var = this.f73557c;
                    this.f73555a = 1;
                    if (rVar.e(g1Var, this) == objL) {
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

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.adselection.a$a$e */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$1", f = "AdSelectionManagerFutures.kt", i = {}, l = {306}, m = "invokeSuspend", n = {}, s = {})
        static final class e extends o implements Function2<s0, kotlin.coroutines.d<? super j0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f73558a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ j f73560c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(j jVar, kotlin.coroutines.d<? super e> dVar) {
                super(2, dVar);
                this.f73560c = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return C0710a.this.new e(this.f73560c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f73558a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                ResultKt.m(obj);
                r rVar = C0710a.this.f73545b;
                Intrinsics.checkNotNull(rVar);
                j jVar = this.f73560c;
                this.f73558a = 1;
                Object objF = rVar.f(jVar, this);
                return objF == objL ? objL : objF;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super j0> dVar) {
                return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.adselection.a$a$f */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$2", f = "AdSelectionManagerFutures.kt", i = {}, l = {v.a.f43975r}, m = "invokeSuspend", n = {}, s = {})
        static final class f extends o implements Function2<s0, kotlin.coroutines.d<? super j0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f73561a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ q f73563c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(q qVar, kotlin.coroutines.d<? super f> dVar) {
                super(2, dVar);
                this.f73563c = qVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return C0710a.this.new f(this.f73563c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f73561a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                ResultKt.m(obj);
                r rVar = C0710a.this.f73545b;
                Intrinsics.checkNotNull(rVar);
                q qVar = this.f73563c;
                this.f73561a = 1;
                Object objG = rVar.g(qVar, this);
                return objG == objL ? objL : objG;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super j0> dVar) {
                return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.adselection.a$a$g */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$updateAdCounterHistogramAsync$1", f = "AdSelectionManagerFutures.kt", i = {}, l = {338}, m = "invokeSuspend", n = {}, s = {})
        static final class g extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f73564a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k1 f73566c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(k1 k1Var, kotlin.coroutines.d<? super g> dVar) {
                super(2, dVar);
                this.f73566c = k1Var;
                int i10 = 2 & 2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return C0710a.this.new g(this.f73566c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f73564a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    r rVar = C0710a.this.f73545b;
                    Intrinsics.checkNotNull(rVar);
                    k1 k1Var = this.f73566c;
                    this.f73564a = 1;
                    if (rVar.h(k1Var, this) == objL) {
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
                return ((g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        public C0710a(@Nullable r rVar) {
            this.f73545b = rVar;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.a
        @a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @u
        @NotNull
        public t1<m0> b(@NotNull q0 getAdSelectionDataRequest) {
            Intrinsics.checkNotNullParameter(getAdSelectionDataRequest, "getAdSelectionDataRequest");
            int i10 = 3 >> 0;
            return androidx.privacysandbox.ads.adservices.java.internal.b.c(k.b(t0.a(l1.a()), null, null, new C0711a(getAdSelectionDataRequest, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.a
        @a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @u
        @NotNull
        public t1<j0> c(@NotNull x0 persistAdSelectionResultRequest) {
            Intrinsics.checkNotNullParameter(persistAdSelectionResultRequest, "persistAdSelectionResultRequest");
            return androidx.privacysandbox.ads.adservices.java.internal.b.c(k.b(t0.a(l1.a()), null, null, new b(persistAdSelectionResultRequest, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.a
        @a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @u
        @NotNull
        public t1<Unit> d(@NotNull y0 reportEventRequest) {
            Intrinsics.checkNotNullParameter(reportEventRequest, "reportEventRequest");
            int i10 = 5 & 1;
            return androidx.privacysandbox.ads.adservices.java.internal.b.c(k.b(t0.a(l1.a()), null, null, new c(reportEventRequest, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.a
        @a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @u
        @NotNull
        public t1<Unit> e(@NotNull g1 reportImpressionRequest) {
            Intrinsics.checkNotNullParameter(reportImpressionRequest, "reportImpressionRequest");
            return androidx.privacysandbox.ads.adservices.java.internal.b.c(k.b(t0.a(l1.a()), null, null, new d(reportImpressionRequest, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.a
        @a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @u
        @NotNull
        public t1<j0> f(@NotNull j adSelectionConfig) {
            Intrinsics.checkNotNullParameter(adSelectionConfig, "adSelectionConfig");
            int i10 = 0 >> 0;
            return androidx.privacysandbox.ads.adservices.java.internal.b.c(k.b(t0.a(l1.a()), null, null, new e(adSelectionConfig, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.a
        @a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @u
        @NotNull
        public t1<j0> g(@NotNull q adSelectionFromOutcomesConfig) {
            Intrinsics.checkNotNullParameter(adSelectionFromOutcomesConfig, "adSelectionFromOutcomesConfig");
            return androidx.privacysandbox.ads.adservices.java.internal.b.c(k.b(t0.a(l1.a()), null, null, new f(adSelectionFromOutcomesConfig, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.a
        @a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @u
        @NotNull
        public t1<Unit> h(@NotNull k1 updateAdCounterHistogramRequest) {
            Intrinsics.checkNotNullParameter(updateAdCounterHistogramRequest, "updateAdCounterHistogramRequest");
            return androidx.privacysandbox.ads.adservices.java.internal.b.c(k.b(t0.a(l1.a()), null, null, new g(updateAdCounterHistogramRequest, null), 3, null), null, 1, null);
        }
    }

    @SourceDebugExtension({"SMAP\nAdSelectionManagerFutures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdSelectionManagerFutures.kt\nandroidx/privacysandbox/ads/adservices/java/adselection/AdSelectionManagerFutures$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,392:1\n1#2:393\n*E\n"})
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @n
        @Nullable
        public final a a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            r rVarA = r.f73454a.a(context);
            if (rVarA != null) {
                return new C0710a(rVarA);
            }
            return null;
        }

        private b() {
        }
    }

    @n
    @Nullable
    public static final a a(@NotNull Context context) {
        return f73544a.a(context);
    }

    @a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @androidx.privacysandbox.ads.adservices.common.q.a
    @NotNull
    public abstract t1<m0> b(@NotNull q0 q0Var);

    @a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @androidx.privacysandbox.ads.adservices.common.q.a
    @NotNull
    public abstract t1<j0> c(@NotNull x0 x0Var);

    @a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @androidx.privacysandbox.ads.adservices.common.q.d
    @NotNull
    public abstract t1<Unit> d(@NotNull y0 y0Var);

    @a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @NotNull
    public abstract t1<Unit> e(@NotNull g1 g1Var);

    @a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @NotNull
    public abstract t1<j0> f(@NotNull j jVar);

    @a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @androidx.privacysandbox.ads.adservices.common.q.a
    @NotNull
    public abstract t1<j0> g(@NotNull q qVar);

    @a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @androidx.privacysandbox.ads.adservices.common.q.d
    @NotNull
    public abstract t1<Unit> h(@NotNull k1 k1Var);
}
