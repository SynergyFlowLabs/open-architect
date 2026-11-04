package androidx.privacysandbox.ads.adservices.java.measurement;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.a1;
import androidx.annotation.u;
import androidx.privacysandbox.ads.adservices.common.q;
import androidx.privacysandbox.ads.adservices.measurement.i;
import androidx.privacysandbox.ads.adservices.measurement.j;
import androidx.privacysandbox.ads.adservices.measurement.j0;
import androidx.privacysandbox.ads.adservices.measurement.w;
import com.facebook.internal.p;
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
    public static final b f73586a = new b(null);

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.measurement.a$a, reason: collision with other inner class name */
    private static final class C0716a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final j f73587b;

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.measurement.a$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$deleteRegistrationsAsync$1", f = "MeasurementManagerFutures.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
        static final class C0717a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f73588a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ i f73590c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0717a(i iVar, kotlin.coroutines.d<? super C0717a> dVar) {
                super(2, dVar);
                this.f73590c = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return C0716a.this.new C0717a(this.f73590c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f73588a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    j jVar = C0716a.this.f73587b;
                    i iVar = this.f73590c;
                    this.f73588a = 1;
                    if (jVar.a(iVar, this) == objL) {
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
                return ((C0717a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.measurement.a$a$b */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1", f = "MeasurementManagerFutures.kt", i = {}, l = {p.f100029m}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Integer>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f73591a;

            b(kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return C0716a.this.new b(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f73591a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                ResultKt.m(obj);
                j jVar = C0716a.this.f73587b;
                this.f73591a = 1;
                Object objB = jVar.b(this);
                return objB == objL ? objL : objB;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Integer> dVar) {
                return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.measurement.a$a$c */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1", f = "MeasurementManagerFutures.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f73593a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Uri f73595c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ InputEvent f73596d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Uri uri, InputEvent inputEvent, kotlin.coroutines.d<? super c> dVar) {
                super(2, dVar);
                this.f73595c = uri;
                this.f73596d = inputEvent;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return C0716a.this.new c(this.f73595c, this.f73596d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f73593a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    j jVar = C0716a.this.f73587b;
                    Uri uri = this.f73595c;
                    InputEvent inputEvent = this.f73596d;
                    this.f73593a = 1;
                    if (jVar.d(uri, inputEvent, this) == objL) {
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

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.measurement.a$a$d */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$2", f = "MeasurementManagerFutures.kt", i = {}, l = {androidx.media2.widget.f.i.f59793p0}, m = "invokeSuspend", n = {}, s = {})
        static final class d extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f73597a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ w f73599c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(w wVar, kotlin.coroutines.d<? super d> dVar) {
                super(2, dVar);
                this.f73599c = wVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return C0716a.this.new d(this.f73599c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f73597a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    j jVar = C0716a.this.f73587b;
                    w wVar = this.f73599c;
                    this.f73597a = 1;
                    if (jVar.e(wVar, this) == objL) {
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

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.measurement.a$a$e */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1", f = "MeasurementManagerFutures.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
        static final class e extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f73600a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Uri f73602c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(Uri uri, kotlin.coroutines.d<? super e> dVar) {
                super(2, dVar);
                this.f73602c = uri;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return C0716a.this.new e(this.f73602c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f73600a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    j jVar = C0716a.this.f73587b;
                    Uri uri = this.f73602c;
                    this.f73600a = 1;
                    if (jVar.f(uri, this) == objL) {
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

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.measurement.a$a$f */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1", f = "MeasurementManagerFutures.kt", i = {}, l = {172}, m = "invokeSuspend", n = {}, s = {})
        static final class f extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f73603a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ j0 f73605c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(j0 j0Var, kotlin.coroutines.d<? super f> dVar) {
                super(2, dVar);
                this.f73605c = j0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return C0716a.this.new f(this.f73605c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f73603a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    j jVar = C0716a.this.f73587b;
                    j0 j0Var = this.f73605c;
                    this.f73603a = 1;
                    if (jVar.g(j0Var, this) == objL) {
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

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.measurement.a$a$g */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebTriggerAsync$1", f = "MeasurementManagerFutures.kt", i = {}, l = {182}, m = "invokeSuspend", n = {}, s = {})
        static final class g extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f73606a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.privacysandbox.ads.adservices.measurement.s0 f73608c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(androidx.privacysandbox.ads.adservices.measurement.s0 s0Var, kotlin.coroutines.d<? super g> dVar) {
                super(2, dVar);
                this.f73608c = s0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return C0716a.this.new g(this.f73608c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f73606a;
                int i11 = 4 >> 1;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    j jVar = C0716a.this.f73587b;
                    androidx.privacysandbox.ads.adservices.measurement.s0 s0Var = this.f73608c;
                    this.f73606a = 1;
                    if (jVar.h(s0Var, this) == objL) {
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

        public C0716a(@NotNull j mMeasurementManager) {
            Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
            this.f73587b = mMeasurementManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.a
        @a1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @u
        @NotNull
        public t1<Unit> a(@NotNull i deletionRequest) {
            Intrinsics.checkNotNullParameter(deletionRequest, "deletionRequest");
            return androidx.privacysandbox.ads.adservices.java.internal.b.c(k.b(t0.a(l1.a()), null, null, new C0717a(deletionRequest, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.a
        @a1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @u
        @NotNull
        public t1<Integer> c() {
            int i10 = 5 ^ 3;
            return androidx.privacysandbox.ads.adservices.java.internal.b.c(k.b(t0.a(l1.a()), null, null, new b(null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.a
        @a1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @u
        @NotNull
        public t1<Unit> d(@NotNull Uri attributionSource, @Nullable InputEvent inputEvent) {
            Intrinsics.checkNotNullParameter(attributionSource, "attributionSource");
            return androidx.privacysandbox.ads.adservices.java.internal.b.c(k.b(t0.a(l1.a()), null, null, new c(attributionSource, inputEvent, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.a
        @q.e
        @NotNull
        @a1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @u
        public t1<Unit> e(@NotNull w request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return androidx.privacysandbox.ads.adservices.java.internal.b.c(k.b(t0.a(l1.a()), null, null, new d(request, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.a
        @a1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @u
        @NotNull
        public t1<Unit> f(@NotNull Uri trigger) {
            Intrinsics.checkNotNullParameter(trigger, "trigger");
            return androidx.privacysandbox.ads.adservices.java.internal.b.c(k.b(t0.a(l1.a()), null, null, new e(trigger, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.a
        @a1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @u
        @NotNull
        public t1<Unit> g(@NotNull j0 request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return androidx.privacysandbox.ads.adservices.java.internal.b.c(k.b(t0.a(l1.a()), null, null, new f(request, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.a
        @a1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @u
        @NotNull
        public t1<Unit> h(@NotNull androidx.privacysandbox.ads.adservices.measurement.s0 request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return androidx.privacysandbox.ads.adservices.java.internal.b.c(k.b(t0.a(l1.a()), null, null, new g(request, null), 3, null), null, 1, null);
        }
    }

    @SourceDebugExtension({"SMAP\nMeasurementManagerFutures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasurementManagerFutures.kt\nandroidx/privacysandbox/ads/adservices/java/measurement/MeasurementManagerFutures$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,208:1\n1#2:209\n*E\n"})
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @n
        @Nullable
        public final a a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            j jVarA = j.f73639a.a(context);
            if (jVarA != null) {
                return new C0716a(jVarA);
            }
            return null;
        }

        private b() {
        }
    }

    @n
    @Nullable
    public static final a b(@NotNull Context context) {
        return f73586a.a(context);
    }

    @NotNull
    public abstract t1<Unit> a(@NotNull i iVar);

    @a1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @NotNull
    public abstract t1<Integer> c();

    @a1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @NotNull
    public abstract t1<Unit> d(@NotNull Uri uri, @Nullable InputEvent inputEvent);

    @a1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @q.e
    @NotNull
    public abstract t1<Unit> e(@NotNull w wVar);

    @a1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @NotNull
    public abstract t1<Unit> f(@NotNull Uri uri);

    @a1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @NotNull
    public abstract t1<Unit> g(@NotNull j0 j0Var);

    @a1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @NotNull
    public abstract t1<Unit> h(@NotNull androidx.privacysandbox.ads.adservices.measurement.s0 s0Var);
}
