package androidx.privacysandbox.ads.adservices.measurement;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.a1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f73639a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f73640b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f73641c = 1;

    public static final class a {

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.measurement.j$a$a, reason: collision with other inner class name */
        static final class C0723a extends kotlin.jvm.internal.l0 implements Function1<Context, l> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f73642a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0723a(Context context) {
                super(1);
                this.f73642a = context;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final l invoke(Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new l(this.f73642a);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @e.a({"NewApi", "ClassVerificationFailure"})
        @Nullable
        public final j a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            androidx.privacysandbox.ads.adservices.internal.a aVar = androidx.privacysandbox.ads.adservices.internal.a.f73536a;
            aVar.a();
            int i10 = 6 | 5;
            if (aVar.a() >= 5) {
                return new o(context);
            }
            if (aVar.b() >= 9) {
                return (j) androidx.privacysandbox.ads.adservices.internal.b.f73539a.a(context, "MeasurementManager", new C0723a(context));
            }
            return null;
        }

        private a() {
        }
    }

    @oj.n
    @e.a({"NewApi", "ClassVerificationFailure"})
    @Nullable
    public static final j c(@NotNull Context context) {
        return f73639a.a(context);
    }

    @Nullable
    public abstract Object a(@NotNull i iVar, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @a1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @Nullable
    public abstract Object b(@NotNull kotlin.coroutines.d<? super Integer> dVar);

    @a1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @Nullable
    public abstract Object d(@NotNull Uri uri, @Nullable InputEvent inputEvent, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @a1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @androidx.privacysandbox.ads.adservices.common.q.e
    @Nullable
    public abstract Object e(@NotNull w wVar, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @a1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @Nullable
    public abstract Object f(@NotNull Uri uri, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @a1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @Nullable
    public abstract Object g(@NotNull j0 j0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @a1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @Nullable
    public abstract Object h(@NotNull s0 s0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar);
}
