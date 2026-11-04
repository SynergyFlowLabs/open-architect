package io.customer.messagingpush;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements hh.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final b f288416d = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f288417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final yg.a f288418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final xg.a f288419c;

    public static final class a implements hh.b.a<c> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private yg.a f288421b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f288420a = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private xg.a f288422c = xg.a.ACTIVITY_PREVENT_RESTART;

        @Override // hh.b.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c build() {
            return new c(this.f288420a, this.f288421b, this.f288422c, null);
        }

        @NotNull
        public final a b(boolean z10) {
            this.f288420a = z10;
            return this;
        }

        @NotNull
        public final a c(@NotNull yg.a notificationCallback) {
            Intrinsics.checkNotNullParameter(notificationCallback, "notificationCallback");
            this.f288421b = notificationCallback;
            return this;
        }

        @NotNull
        public final a d(@NotNull xg.a pushClickBehavior) {
            Intrinsics.checkNotNullParameter(pushClickBehavior, "pushClickBehavior");
            this.f288422c = pushClickBehavior;
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final c a() {
            return new a().build();
        }

        private b() {
        }
    }

    public /* synthetic */ c(boolean z10, yg.a aVar, xg.a aVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, aVar, aVar2);
    }

    public final boolean a() {
        return this.f288417a;
    }

    @Nullable
    public final yg.a b() {
        return this.f288418b;
    }

    @NotNull
    public final xg.a c() {
        return this.f288419c;
    }

    @NotNull
    public String toString() {
        return "MessagingPushModuleConfig(autoTrackPushEvents=" + this.f288417a + ", notificationCallback=" + this.f288418b + ", pushClickBehavior=" + this.f288419c + ")";
    }

    private c(boolean z10, yg.a aVar, xg.a aVar2) {
        this.f288417a = z10;
        this.f288418b = aVar;
        this.f288419c = aVar2;
    }
}
