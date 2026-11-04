package io.ktor.http.content;

import io.ktor.http.d1;
import io.ktor.http.v0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nMultipart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Multipart.kt\nio/ktor/http/content/PartData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,179:1\n1#2:180\n*E\n"})
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f295690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final v0 f295691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f295692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f295693d;

    public static final class a extends c0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final Function0<io.ktor.utils.io.h> f295694e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Function0<? extends io.ktor.utils.io.h> provider, @NotNull v0 partHeaders) {
            super(new Function0() { // from class: io.ktor.http.content.b0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c0.a.k();
                }
            }, partHeaders, null);
            Intrinsics.checkNotNullParameter(provider, "provider");
            Intrinsics.checkNotNullParameter(partHeaders, "partHeaders");
            this.f295694e = provider;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k() {
            return Unit.f312394a;
        }

        @NotNull
        public final Function0<io.ktor.utils.io.h> l() {
            return this.f295694e;
        }
    }

    public static final class b extends c0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final Function0<kotlinx.io.c0> f295695e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull Function0<? extends kotlinx.io.c0> provider, @NotNull Function0<Unit> dispose, @NotNull v0 partHeaders) {
            super(dispose, partHeaders, null);
            Intrinsics.checkNotNullParameter(provider, "provider");
            Intrinsics.checkNotNullParameter(dispose, "dispose");
            Intrinsics.checkNotNullParameter(partHeaders, "partHeaders");
            this.f295695e = provider;
        }

        @NotNull
        public final Function0<kotlinx.io.c0> j() {
            return this.f295695e;
        }
    }

    public static final class c extends c0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final Function0<io.ktor.utils.io.h> f295696e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private final String f295697f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(@NotNull Function0<? extends io.ktor.utils.io.h> provider, @NotNull Function0<Unit> dispose, @NotNull v0 partHeaders) {
            super(dispose, partHeaders, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(provider, "provider");
            Intrinsics.checkNotNullParameter(dispose, "dispose");
            Intrinsics.checkNotNullParameter(partHeaders, "partHeaders");
            this.f295696e = provider;
            io.ktor.http.i iVarE = e();
            this.f295697f = iVarE != null ? iVarE.c("filename") : null;
        }

        @Nullable
        public final String j() {
            return this.f295697f;
        }

        @NotNull
        public final Function0<io.ktor.utils.io.h> k() {
            return this.f295696e;
        }
    }

    public static final class d extends c0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final String f295698e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull String value, @NotNull Function0<Unit> dispose, @NotNull v0 partHeaders) {
            super(dispose, partHeaders, null);
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(dispose, "dispose");
            Intrinsics.checkNotNullParameter(partHeaders, "partHeaders");
            this.f295698e = value;
        }

        @NotNull
        public final String j() {
            return this.f295698e;
        }
    }

    public /* synthetic */ c0(Function0 function0, v0 v0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, v0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.http.i c(c0 c0Var) {
        String str = c0Var.f295691b.get(d1.f295782a.w());
        if (str != null) {
            return io.ktor.http.i.f295864d.e(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.http.m d(c0 c0Var) {
        String str = c0Var.f295691b.get(d1.f295782a.C());
        if (str != null) {
            return io.ktor.http.m.f295981f.b(str);
        }
        return null;
    }

    @Nullable
    public final io.ktor.http.i e() {
        return (io.ktor.http.i) this.f295692c.getValue();
    }

    @Nullable
    public final io.ktor.http.m f() {
        return (io.ktor.http.m) this.f295693d.getValue();
    }

    @NotNull
    public final Function0<Unit> g() {
        return this.f295690a;
    }

    @NotNull
    public final v0 h() {
        return this.f295691b;
    }

    @Nullable
    public final String i() {
        io.ktor.http.i iVarE = e();
        if (iVarE != null) {
            return iVarE.i();
        }
        return null;
    }

    private c0(Function0<Unit> function0, v0 v0Var) {
        this.f295690a = function0;
        this.f295691b = v0Var;
        kotlin.j0 j0Var = kotlin.j0.NONE;
        this.f295692c = kotlin.g0.b(j0Var, new Function0() { // from class: io.ktor.http.content.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c0.c(this.f295779a);
            }
        });
        this.f295693d = kotlin.g0.b(j0Var, new Function0() { // from class: io.ktor.http.content.a0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c0.d(this.f295683a);
            }
        });
    }
}
