package vf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class f {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f385760a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f385760a = iArr;
        }
    }

    public static final void a(@NotNull com.segment.analytics.kotlin.core.a.b bVar, @NotNull String message, @NotNull b kind) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(kind, "kind");
        d dVarB = bVar.b();
        c cVar = new c(kind, message, null, 4, null);
        if (a.f385760a[kind.ordinal()] != 1) {
            dVarB.a(cVar);
        } else if (bVar.a()) {
            dVarB.a(cVar);
        }
    }

    public static /* synthetic */ void b(com.segment.analytics.kotlin.core.a.b bVar, String str, b bVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar2 = b.ERROR;
        }
        a(bVar, str, bVar2);
    }
}
