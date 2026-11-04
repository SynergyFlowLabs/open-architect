package androidx.privacysandbox.ads.adservices.java.appsetid;

import android.content.Context;
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
    public static final b f73567a = new b(null);

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.appsetid.a$a, reason: collision with other inner class name */
    private static final class C0712a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final androidx.privacysandbox.ads.adservices.appsetid.b f73568b;

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.appsetid.a$a$a, reason: collision with other inner class name */
        @f(c = "androidx.privacysandbox.ads.adservices.java.appsetid.AppSetIdManagerFutures$Api33Ext4JavaImpl$getAppSetIdAsync$1", f = "AppSetIdManagerFutures.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
        static final class C0713a extends o implements Function2<s0, d<? super androidx.privacysandbox.ads.adservices.appsetid.a>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f73569a;

            C0713a(d<? super C0713a> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return C0712a.this.new C0713a(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f73569a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                ResultKt.m(obj);
                androidx.privacysandbox.ads.adservices.appsetid.b bVar = C0712a.this.f73568b;
                this.f73569a = 1;
                Object objA = bVar.a(this);
                return objA == objL ? objL : objA;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, d<? super androidx.privacysandbox.ads.adservices.appsetid.a> dVar) {
                return ((C0713a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        public C0712a(@NotNull androidx.privacysandbox.ads.adservices.appsetid.b mAppSetIdManager) {
            Intrinsics.checkNotNullParameter(mAppSetIdManager, "mAppSetIdManager");
            this.f73568b = mAppSetIdManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.appsetid.a
        @u
        @NotNull
        public t1<androidx.privacysandbox.ads.adservices.appsetid.a> b() {
            return androidx.privacysandbox.ads.adservices.java.internal.b.c(k.b(t0.a(l1.a()), null, null, new C0713a(null), 3, null), null, 1, null);
        }
    }

    @SourceDebugExtension({"SMAP\nAppSetIdManagerFutures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppSetIdManagerFutures.kt\nandroidx/privacysandbox/ads/adservices/java/appsetid/AppSetIdManagerFutures$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @n
        @Nullable
        public final a a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            androidx.privacysandbox.ads.adservices.appsetid.b bVarA = androidx.privacysandbox.ads.adservices.appsetid.b.f73474a.a(context);
            if (bVarA != null) {
                return new C0712a(bVarA);
            }
            return null;
        }

        private b() {
        }
    }

    @n
    @Nullable
    public static final a a(@NotNull Context context) {
        return f73567a.a(context);
    }

    @NotNull
    public abstract t1<androidx.privacysandbox.ads.adservices.appsetid.a> b();
}
