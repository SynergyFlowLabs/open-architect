package androidx.compose.ui.platform;

import android.view.View;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.ui.t
public interface a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f40282a = a.f40283a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f40283a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private static final a5 f40284b = new a5() { // from class: androidx.compose.ui.platform.z4
            @Override // androidx.compose.ui.platform.a5
            public final androidx.compose.runtime.c5 a(View view) {
                return a5.a.b(view);
            }
        };

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.runtime.c5 b(View view) {
            return c5.c(view, null, null, 3, null);
        }

        @NotNull
        public final a5 c() {
            return f40284b;
        }
    }

    @NotNull
    androidx.compose.runtime.c5 a(@NotNull View view);
}
