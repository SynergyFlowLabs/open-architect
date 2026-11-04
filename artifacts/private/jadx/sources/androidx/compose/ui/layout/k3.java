package androidx.compose.ui.layout;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f39390a = a.f39391a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f39391a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private static final k3 f39392b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private static final k3 f39393c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private static final k3 f39394d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private static final k3 f39395e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private static final k3 f39396f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private static final k3 f39397g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private static final k3 f39398h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        private static final k3 f39399i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        private static final k3 f39400j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        private static final k3 f39401k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        private static final k3 f39402l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        private static final k3 f39403m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NotNull
        private static final k3 f39404n;

        static {
            l3 l3Var = new l3("caption bar");
            f39392b = l3Var;
            l3 l3Var2 = new l3("display cutout");
            f39393c = l3Var2;
            l3 l3Var3 = new l3("ime");
            f39394d = l3Var3;
            l3 l3Var4 = new l3("mandatory system gestures");
            f39395e = l3Var4;
            l3 l3Var5 = new l3("navigation bars");
            f39396f = l3Var5;
            l3 l3Var6 = new l3("status bars");
            f39397g = l3Var6;
            f39398h = new w("system bars", new k3[]{l3Var6, l3Var5, l3Var});
            l3 l3Var7 = new l3("system gestures");
            f39399i = l3Var7;
            l3 l3Var8 = new l3("tappable element");
            f39400j = l3Var8;
            l3 l3Var9 = new l3("waterfall");
            f39401k = l3Var9;
            f39402l = new w("safe drawing", new k3[]{l3Var6, l3Var5, l3Var, l3Var2, l3Var3, l3Var8});
            f39403m = new w("safe gestures", new k3[]{l3Var4, l3Var7, l3Var8, l3Var9});
            f39404n = new w("safe content", new k3[]{l3Var6, l3Var5, l3Var, l3Var3, l3Var7, l3Var4, l3Var8, l3Var2, l3Var9});
        }

        private a() {
        }

        @NotNull
        public final k3 a() {
            return f39392b;
        }

        @NotNull
        public final k3 b() {
            return f39393c;
        }

        @NotNull
        public final k3 c() {
            return f39394d;
        }

        @NotNull
        public final k3 d() {
            return f39395e;
        }

        @NotNull
        public final k3 e() {
            return f39396f;
        }

        @NotNull
        public final k3 f() {
            return f39404n;
        }

        @NotNull
        public final k3 g() {
            return f39402l;
        }

        @NotNull
        public final k3 h() {
            return f39403m;
        }

        @NotNull
        public final k3 i() {
            return f39397g;
        }

        @NotNull
        public final k3 j() {
            return f39398h;
        }

        @NotNull
        public final k3 k() {
            return f39399i;
        }

        @NotNull
        public final k3 l() {
            return f39400j;
        }

        @NotNull
        public final k3 m() {
            return f39401k;
        }

        @NotNull
        public final k3 n(@NotNull k3... k3VarArr) {
            return new w(null, k3VarArr);
        }
    }

    @NotNull
    m2 a();

    @NotNull
    m2 b();

    @NotNull
    j3 c(@NotNull i2.a aVar);
}
