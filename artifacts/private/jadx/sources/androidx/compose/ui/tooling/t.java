package androidx.compose.ui.tooling;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 1)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f42641a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f42642b = 0;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void b(a aVar, String str, Throwable th2, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                th2 = null;
            }
            aVar.a(str, th2);
        }

        public static /* synthetic */ void d(a aVar, String str, Throwable th2, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                th2 = null;
            }
            aVar.c(str, th2);
        }

        public final void a(@NotNull String str, @Nullable Throwable th2) {
        }

        public final void c(@NotNull String str, @Nullable Throwable th2) {
        }

        private a() {
        }
    }
}
