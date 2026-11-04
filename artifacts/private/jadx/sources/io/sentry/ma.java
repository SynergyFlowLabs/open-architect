package io.sentry;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.b
public abstract class ma {

    public static final class a extends ma {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final la f305885a;

        public a(@NotNull la laVar) {
            this.f305885a = laVar;
        }

        @NotNull
        public la a() {
            return this.f305885a;
        }
    }

    public static final class b extends ma {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f305886a;

        public b(@NotNull String str) {
            this.f305886a = str;
        }

        @NotNull
        public String a() {
            return this.f305886a;
        }
    }

    public static final class c extends ma {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final c f305887a = new c();

        private c() {
        }

        public static c a() {
            return f305887a;
        }
    }

    public static final class d extends ma {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f305888a;

        public d(@NotNull String str) {
            this.f305888a = str;
        }

        @NotNull
        public String a() {
            return this.f305888a;
        }
    }
}
