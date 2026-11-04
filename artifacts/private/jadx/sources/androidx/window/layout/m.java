package androidx.window.layout;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface m extends h {

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final C0771a f76391b = new C0771a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oj.f
        @NotNull
        public static final a f76392c = new a("NONE");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oj.f
        @NotNull
        public static final a f76393d = new a("FULL");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f76394a;

        /* JADX INFO: renamed from: androidx.window.layout.m$a$a, reason: collision with other inner class name */
        public static final class C0771a {
            public /* synthetic */ C0771a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0771a() {
            }
        }

        private a(String str) {
            this.f76394a = str;
        }

        @NotNull
        public String toString() {
            return this.f76394a;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f76395b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oj.f
        @NotNull
        public static final b f76396c = new b("VERTICAL");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oj.f
        @NotNull
        public static final b f76397d = new b("HORIZONTAL");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f76398a;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        private b(String str) {
            this.f76398a = str;
        }

        @NotNull
        public String toString() {
            return this.f76398a;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f76399b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oj.f
        @NotNull
        public static final c f76400c = new c("FLAT");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oj.f
        @NotNull
        public static final c f76401d = new c("HALF_OPENED");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f76402a;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        private c(String str) {
            this.f76402a = str;
        }

        @NotNull
        public String toString() {
            return this.f76402a;
        }
    }

    boolean a();

    @NotNull
    a b();

    @NotNull
    b getOrientation();

    @NotNull
    c getState();
}
