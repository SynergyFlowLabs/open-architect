package androidx.privacysandbox.ads.adservices.java.customaudience;

import android.content.Context;
import androidx.annotation.a1;
import androidx.annotation.u;
import androidx.privacysandbox.ads.adservices.common.q;
import androidx.privacysandbox.ads.adservices.customaudience.o0;
import androidx.privacysandbox.ads.adservices.customaudience.p0;
import androidx.privacysandbox.ads.adservices.customaudience.q0;
import com.google.common.util.concurrent.t1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
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
    public static final b f73571a = new b(null);

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.customaudience.a$a, reason: collision with other inner class name */
    private static final class C0714a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final androidx.privacysandbox.ads.adservices.customaudience.b f73572b;

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.customaudience.a$a$a, reason: collision with other inner class name */
        @f(c = "androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures$Api33Ext4JavaImpl$fetchAndJoinCustomAudienceAsync$1", f = "CustomAudienceManagerFutures.kt", i = {}, l = {androidx.media2.widget.f.i.f59797r0}, m = "invokeSuspend", n = {}, s = {})
        static final class C0715a extends o implements Function2<s0, d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f73573a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ o0 f73575c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0715a(o0 o0Var, d<? super C0715a> dVar) {
                super(2, dVar);
                this.f73575c = o0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return C0714a.this.new C0715a(this.f73575c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f73573a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    androidx.privacysandbox.ads.adservices.customaudience.b bVar = C0714a.this.f73572b;
                    Intrinsics.checkNotNull(bVar);
                    o0 o0Var = this.f73575c;
                    this.f73573a = 1;
                    if (bVar.a(o0Var, this) == objL) {
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
                return ((C0715a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.customaudience.a$a$b */
        @f(c = "androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures$Api33Ext4JavaImpl$joinCustomAudienceAsync$1", f = "CustomAudienceManagerFutures.kt", i = {}, l = {145}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements Function2<s0, d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f73576a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p0 f73578c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(p0 p0Var, d<? super b> dVar) {
                super(2, dVar);
                this.f73578c = p0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return C0714a.this.new b(this.f73578c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f73576a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    androidx.privacysandbox.ads.adservices.customaudience.b bVar = C0714a.this.f73572b;
                    Intrinsics.checkNotNull(bVar);
                    p0 p0Var = this.f73578c;
                    this.f73576a = 1;
                    if (bVar.b(p0Var, this) == objL) {
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
                return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.customaudience.a$a$c */
        @f(c = "androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures$Api33Ext4JavaImpl$leaveCustomAudienceAsync$1", f = "CustomAudienceManagerFutures.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements Function2<s0, d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f73579a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ q0 f73581c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(q0 q0Var, d<? super c> dVar) {
                super(2, dVar);
                this.f73581c = q0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return C0714a.this.new c(this.f73581c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f73579a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    androidx.privacysandbox.ads.adservices.customaudience.b bVar = C0714a.this.f73572b;
                    Intrinsics.checkNotNull(bVar);
                    q0 q0Var = this.f73581c;
                    this.f73579a = 1;
                    if (bVar.c(q0Var, this) == objL) {
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
                return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        public C0714a(@Nullable androidx.privacysandbox.ads.adservices.customaudience.b bVar) {
            this.f73572b = bVar;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.customaudience.a
        @a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @u
        @NotNull
        public t1<Unit> a(@NotNull o0 request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return androidx.privacysandbox.ads.adservices.java.internal.b.c(k.b(t0.a(l1.a()), null, null, new C0715a(request, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.customaudience.a
        @a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @u
        @NotNull
        public t1<Unit> c(@NotNull p0 request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return androidx.privacysandbox.ads.adservices.java.internal.b.c(k.b(t0.a(l1.a()), null, null, new b(request, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.customaudience.a
        @a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @u
        @NotNull
        public t1<Unit> d(@NotNull q0 request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return androidx.privacysandbox.ads.adservices.java.internal.b.c(k.b(t0.a(l1.a()), null, null, new c(request, null), 3, null), null, 1, null);
        }
    }

    @SourceDebugExtension({"SMAP\nCustomAudienceManagerFutures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomAudienceManagerFutures.kt\nandroidx/privacysandbox/ads/adservices/java/customaudience/CustomAudienceManagerFutures$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,184:1\n1#2:185\n*E\n"})
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @n
        @Nullable
        public final a a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            androidx.privacysandbox.ads.adservices.customaudience.b bVarA = androidx.privacysandbox.ads.adservices.customaudience.b.f73522a.a(context);
            if (bVarA != null) {
                return new C0714a(bVarA);
            }
            return null;
        }

        private b() {
        }
    }

    @n
    @Nullable
    public static final a b(@NotNull Context context) {
        return f73571a.a(context);
    }

    @a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @q.a
    @NotNull
    public abstract t1<Unit> a(@NotNull o0 o0Var);

    @a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @NotNull
    public abstract t1<Unit> c(@NotNull p0 p0Var);

    @a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @NotNull
    public abstract t1<Unit> d(@NotNull q0 q0Var);
}
