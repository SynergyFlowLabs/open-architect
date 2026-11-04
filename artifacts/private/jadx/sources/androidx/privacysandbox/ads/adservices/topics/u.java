package androidx.privacysandbox.ads.adservices.topics;

import android.content.Context;
import androidx.annotation.a1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f73699a = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.topics.u$a$a, reason: collision with other inner class name */
        static final class C0725a extends l0 implements Function1<Context, w> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f73700a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0725a(Context context) {
                super(1);
                this.f73700a = context;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final w invoke(Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new w(this.f73700a);
            }
        }

        static final class b extends l0 implements Function1<Context, x> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f73701a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context) {
                super(1);
                this.f73701a = context;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final x invoke(Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new x(this.f73701a);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @e.a({"NewApi", "ClassVerificationFailure"})
        @Nullable
        public final u a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            androidx.privacysandbox.ads.adservices.internal.a aVar = androidx.privacysandbox.ads.adservices.internal.a.f73536a;
            if (aVar.a() >= 11) {
                return new a0(context);
            }
            if (aVar.a() >= 5) {
                return new c0(context);
            }
            if (aVar.a() == 4) {
                return new b0(context);
            }
            if (aVar.b() >= 11) {
                return (u) androidx.privacysandbox.ads.adservices.internal.b.f73539a.a(context, "TopicsManager", new C0725a(context));
            }
            if (aVar.b() >= 9) {
                return (u) androidx.privacysandbox.ads.adservices.internal.b.f73539a.a(context, "TopicsManager", new b(context));
            }
            return null;
        }

        private a() {
        }
    }

    @oj.n
    @e.a({"NewApi", "ClassVerificationFailure"})
    @Nullable
    public static final u b(@NotNull Context context) {
        return f73699a.a(context);
    }

    @a1("android.permission.ACCESS_ADSERVICES_TOPICS")
    @Nullable
    public abstract Object a(@NotNull b bVar, @NotNull kotlin.coroutines.d<? super h> dVar);
}
