package io.ktor.http;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends t0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f295864d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final i f295865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final i f295866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final i f295867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final i f295868h;

    @SourceDebugExtension({"SMAP\nContentDisposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentDisposition.kt\nio/ktor/http/ContentDisposition$Companion\n+ 2 HeaderValueWithParameters.kt\nio/ktor/http/HeaderValueWithParameters$Companion\n*L\n1#1,125:1\n70#2,2:126\n*S KotlinDebug\n*F\n+ 1 ContentDisposition.kt\nio/ktor/http/ContentDisposition$Companion\n*L\n96#1:126,2\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final i a() {
            return i.f295867g;
        }

        @NotNull
        public final i b() {
            return i.f295865e;
        }

        @NotNull
        public final i c() {
            return i.f295868h;
        }

        @NotNull
        public final i d() {
            return i.f295866f;
        }

        @NotNull
        public final i e(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            t0.a aVar = t0.f296102c;
            r0 r0Var = (r0) CollectionsKt.last((List) c1.f(value));
            return new i(r0Var.g(), r0Var.e());
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f295869a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f295870b = "filename";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final String f295871c = "filename*";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final String f295872d = "name";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final String f295873e = "creation-date";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final String f295874f = "modification-date";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final String f295875g = "read-date";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public static final String f295876h = "size";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public static final String f295877i = "handling";

        private b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i10 = 2;
        f295865e = new i(com.facebook.share.internal.k.f101891c, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        f295866f = new i("mixed", 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        f295867g = new i("attachment", 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        f295868h = new i("inline", 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
    }

    public /* synthetic */ i(String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    public static /* synthetic */ i k(i iVar, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return iVar.j(str, str2, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (Intrinsics.areEqual(h(), iVar.h()) && Intrinsics.areEqual(b(), iVar.b())) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final String h() {
        return a();
    }

    public int hashCode() {
        return (h().hashCode() * 31) + b().hashCode();
    }

    @Nullable
    public final String i() {
        return c("name");
    }

    @NotNull
    public final i j(@NotNull String key, @NotNull String value, boolean z10) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (z10) {
            value = j.b(key, value);
        }
        return new i(h(), CollectionsKt.plus((Collection<? extends s0>) b(), new s0(key, value)));
    }

    @NotNull
    public final i l(@NotNull List<s0> newParameters) {
        Intrinsics.checkNotNullParameter(newParameters, "newParameters");
        return new i(h(), CollectionsKt.plus((Collection) b(), (Iterable) newParameters));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@NotNull String disposition, @NotNull List<s0> parameters) {
        super(disposition, parameters);
        Intrinsics.checkNotNullParameter(disposition, "disposition");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }
}
