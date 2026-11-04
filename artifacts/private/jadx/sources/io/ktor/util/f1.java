package io.ktor.util;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public abstract class f1 {

    public static final class a extends f1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final b f296588a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull b jsPlatform) {
            super(null);
            Intrinsics.checkNotNullParameter(jsPlatform, "jsPlatform");
            this.f296588a = jsPlatform;
        }

        public static /* synthetic */ a c(a aVar, b bVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bVar = aVar.f296588a;
            }
            return aVar.b(bVar);
        }

        @NotNull
        public final b a() {
            return this.f296588a;
        }

        @NotNull
        public final a b(@NotNull b jsPlatform) {
            Intrinsics.checkNotNullParameter(jsPlatform, "jsPlatform");
            return new a(jsPlatform);
        }

        @NotNull
        public final b d() {
            return this.f296588a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f296588a == ((a) obj).f296588a;
        }

        public int hashCode() {
            return this.f296588a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Js(jsPlatform=" + this.f296588a + ')';
        }
    }

    public enum b {
        Browser,
        Node;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f296592d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f296592d;
        }
    }

    public static final class c extends f1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f296593a = new c();

        private c() {
            super(null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 1051825272;
        }

        @NotNull
        public String toString() {
            return "Jvm";
        }
    }

    public static final class d extends f1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f296594a = new d();

        private d() {
            super(null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return -1059277600;
        }

        @NotNull
        public String toString() {
            return "Native";
        }
    }

    public static final class e extends f1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final b f296595a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull b jsPlatform) {
            super(null);
            Intrinsics.checkNotNullParameter(jsPlatform, "jsPlatform");
            this.f296595a = jsPlatform;
        }

        public static /* synthetic */ e c(e eVar, b bVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bVar = eVar.f296595a;
            }
            return eVar.b(bVar);
        }

        @NotNull
        public final b a() {
            return this.f296595a;
        }

        @NotNull
        public final e b(@NotNull b jsPlatform) {
            Intrinsics.checkNotNullParameter(jsPlatform, "jsPlatform");
            return new e(jsPlatform);
        }

        @NotNull
        public final b d() {
            return this.f296595a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f296595a == ((e) obj).f296595a;
        }

        public int hashCode() {
            return this.f296595a.hashCode();
        }

        @NotNull
        public String toString() {
            return "WasmJs(jsPlatform=" + this.f296595a + ')';
        }
    }

    public /* synthetic */ f1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private f1() {
    }
}
