package androidx.privacysandbox.ads.adservices.java.adid;

import android.content.Context;
import androidx.annotation.a1;
import androidx.annotation.u;
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
    public static final b f73540a = new b(null);

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.adid.a$a, reason: collision with other inner class name */
    private static final class C0708a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final androidx.privacysandbox.ads.adservices.adid.b f73541b;

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.adid.a$a$a, reason: collision with other inner class name */
        @f(c = "androidx.privacysandbox.ads.adservices.java.adid.AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1", f = "AdIdManagerFutures.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
        static final class C0709a extends o implements Function2<s0, d<? super androidx.privacysandbox.ads.adservices.adid.a>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f73542a;

            C0709a(d<? super C0709a> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return C0708a.this.new C0709a(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f73542a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                ResultKt.m(obj);
                androidx.privacysandbox.ads.adservices.adid.b bVar = C0708a.this.f73541b;
                this.f73542a = 1;
                Object objA = bVar.a(this);
                return objA == objL ? objL : objA;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, d<? super androidx.privacysandbox.ads.adservices.adid.a> dVar) {
                return ((C0709a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        public C0708a(@NotNull androidx.privacysandbox.ads.adservices.adid.b mAdIdManager) {
            Intrinsics.checkNotNullParameter(mAdIdManager, "mAdIdManager");
            this.f73541b = mAdIdManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adid.a
        @a1("android.permission.ACCESS_ADSERVICES_AD_ID")
        @u
        @NotNull
        public t1<androidx.privacysandbox.ads.adservices.adid.a> b() {
            return androidx.privacysandbox.ads.adservices.java.internal.b.c(k.b(t0.a(l1.a()), null, null, new C0709a(null), 3, null), null, 1, null);
        }
    }

    @SourceDebugExtension({"SMAP\nAdIdManagerFutures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdIdManagerFutures.kt\nandroidx/privacysandbox/ads/adservices/java/adid/AdIdManagerFutures$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n1#2:73\n*E\n"})
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @n
        @Nullable
        public final a a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            androidx.privacysandbox.ads.adservices.adid.b bVarA = androidx.privacysandbox.ads.adservices.adid.b.f73396a.a(context);
            if (bVarA != null) {
                return new C0708a(bVarA);
            }
            return null;
        }

        private b() {
        }
    }

    @n
    @Nullable
    public static final a a(@NotNull Context context) {
        return f73540a.a(context);
    }

    @a1("android.permission.ACCESS_ADSERVICES_AD_ID")
    @NotNull
    public abstract t1<androidx.privacysandbox.ads.adservices.adid.a> b();
}
