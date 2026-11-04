package androidx.compose.ui.window;

import kotlin.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class v {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43004a;

        static {
            int[] iArr = new int[u.values().length];
            try {
                iArr[u.SecureOff.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u.SecureOn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u.Inherit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f43004a = iArr;
        }
    }

    public static final boolean a(@NotNull u uVar, boolean z10) {
        int i10 = a.f43004a[uVar.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            return true;
        }
        if (i10 == 3) {
            return z10;
        }
        throw new k0();
    }
}
