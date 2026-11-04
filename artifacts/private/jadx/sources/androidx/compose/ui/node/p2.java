package androidx.compose.ui.node;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface p2 extends j {

    @NotNull
    public static final a K = a.f39958a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f39958a = new a();

        /* JADX INFO: renamed from: androidx.compose.ui.node.p2$a$a, reason: collision with other inner class name */
        public enum EnumC0311a {
            ContinueTraversal,
            SkipSubtreeAndContinueTraversal,
            CancelTraversal;


            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ kotlin.enums.a f39963e = kotlin.enums.c.c(k());

            static {
                int i10 = 5 >> 2;
            }

            @NotNull
            public static kotlin.enums.a<EnumC0311a> l() {
                return f39963e;
            }
        }

        private a() {
        }
    }

    @NotNull
    Object R4();
}
