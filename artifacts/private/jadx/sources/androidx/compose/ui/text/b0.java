package androidx.compose.ui.text;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public abstract class b0 implements f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f41458a = 0;

    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static final class a extends b0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f41459e = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f41460b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final q3 f41461c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private final c0 f41462d;

        public /* synthetic */ a(String str, q3 q3Var, c0 c0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : q3Var, c0Var);
        }

        public static /* synthetic */ a d(a aVar, String str, q3 q3Var, c0 c0Var, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = aVar.f41460b;
            }
            if ((i10 & 2) != 0) {
                q3Var = aVar.b();
            }
            if ((i10 & 4) != 0) {
                c0Var = aVar.a();
            }
            return aVar.c(str, q3Var, c0Var);
        }

        @Override // androidx.compose.ui.text.b0
        @Nullable
        public c0 a() {
            return this.f41462d;
        }

        @Override // androidx.compose.ui.text.b0
        @Nullable
        public q3 b() {
            return this.f41461c;
        }

        @NotNull
        public final a c(@NotNull String str, @Nullable q3 q3Var, @Nullable c0 c0Var) {
            return new a(str, q3Var, c0Var);
        }

        @NotNull
        public final String e() {
            return this.f41460b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f41460b, aVar.f41460b) && Intrinsics.areEqual(b(), aVar.b()) && Intrinsics.areEqual(a(), aVar.a());
        }

        public int hashCode() {
            int iHashCode = this.f41460b.hashCode() * 31;
            q3 q3VarB = b();
            int iHashCode2 = (iHashCode + (q3VarB != null ? q3VarB.hashCode() : 0)) * 31;
            c0 c0VarA = a();
            return iHashCode2 + (c0VarA != null ? c0VarA.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "LinkAnnotation.Clickable(tag=" + this.f41460b + ')';
        }

        public a(@NotNull String str, @Nullable q3 q3Var, @Nullable c0 c0Var) {
            super(null);
            this.f41460b = str;
            this.f41461c = q3Var;
            this.f41462d = c0Var;
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static final class b extends b0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f41463e = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f41464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final q3 f41465c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private final c0 f41466d;

        public /* synthetic */ b(String str, q3 q3Var, c0 c0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : q3Var, (i10 & 4) != 0 ? null : c0Var);
        }

        public static /* synthetic */ b d(b bVar, String str, q3 q3Var, c0 c0Var, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.f41464b;
            }
            if ((i10 & 2) != 0) {
                q3Var = bVar.b();
            }
            if ((i10 & 4) != 0) {
                c0Var = bVar.a();
            }
            return bVar.c(str, q3Var, c0Var);
        }

        @Override // androidx.compose.ui.text.b0
        @Nullable
        public c0 a() {
            return this.f41466d;
        }

        @Override // androidx.compose.ui.text.b0
        @Nullable
        public q3 b() {
            return this.f41465c;
        }

        @NotNull
        public final b c(@NotNull String str, @Nullable q3 q3Var, @Nullable c0 c0Var) {
            return new b(str, q3Var, c0Var);
        }

        @NotNull
        public final String e() {
            return this.f41464b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (Intrinsics.areEqual(this.f41464b, bVar.f41464b) && Intrinsics.areEqual(b(), bVar.b()) && Intrinsics.areEqual(a(), bVar.a())) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int iHashCode = this.f41464b.hashCode() * 31;
            q3 q3VarB = b();
            int iHashCode2 = (iHashCode + (q3VarB != null ? q3VarB.hashCode() : 0)) * 31;
            c0 c0VarA = a();
            return iHashCode2 + (c0VarA != null ? c0VarA.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "LinkAnnotation.Url(url=" + this.f41464b + ')';
        }

        public b(@NotNull String str, @Nullable q3 q3Var, @Nullable c0 c0Var) {
            super(null);
            this.f41464b = str;
            this.f41465c = q3Var;
            this.f41466d = c0Var;
        }
    }

    public /* synthetic */ b0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public abstract c0 a();

    @Nullable
    public abstract q3 b();

    private b0() {
    }
}
