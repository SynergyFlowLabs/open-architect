package tf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements vf.d {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f381032a;

        static {
            int[] iArr = new int[vf.b.values().length];
            try {
                iArr[vf.b.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vf.b.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vf.b.DEBUG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f381032a = iArr;
        }
    }

    @Override // vf.d
    public void a(@NotNull vf.c log) {
        Intrinsics.checkNotNullParameter(log, "log");
        int i10 = a.f381032a[log.g().ordinal()];
        if (i10 == 1) {
            log.h();
        } else if (i10 == 2) {
            log.h();
        } else {
            if (i10 != 3) {
                return;
            }
            log.h();
        }
    }
}
